package com.microsoft.graph.functional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.google.gson.JsonPrimitive;
import com.microsoft.graph.tasks.LargeFileUploadTask;
import com.microsoft.graph.tasks.LargeFileUploadResult;
import com.microsoft.graph.tasks.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.CoreHttpProvider;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.DriveItemUploadableProperties;
import com.microsoft.graph.models.UploadSession;
import com.microsoft.graph.models.DriveItemCreateUploadSessionParameterSet;

@Disabled
public class OneDriveTests {
	private TestBase testBase;

	@BeforeEach
	public void setUp() {
	   testBase = new TestBase();
	}

	final IProgressCallback callback = new IProgressCallback () {
		@Override
		public void progress(final long current, final long max) {
			//Check progress
		}
	};
	/**
	 * Test large file upload.
	 * https://github.com/OneDrive/onedrive-sdk-csharp/blob/master/docs/chunked-uploads.md
	 *
	 * @throws IOException if the input file is not found
	 * @throws InterruptedException if the chunked upload fails
	 */
	@Test
	public void testLargeFileUpload() throws IOException, InterruptedException {
		//Get resource file from file system
		InputStream uploadFile = OneDriveTests.class.getClassLoader().getResourceAsStream("largefile10M.blob");
		long fileSize = (long) uploadFile.available();

		UploadSession uploadSession = testBase
				.graphClient
				.me()
				.drive()
				.root()
				.itemWithPath("largefile10M.blob")
				.createUploadSession(DriveItemCreateUploadSessionParameterSet.newBuilder().withItem(new DriveItemUploadableProperties()).build())
				.buildRequest()
				.post();
		LargeFileUploadTask<DriveItem> chunkedUploadProvider = new LargeFileUploadTask<DriveItem>(
				uploadSession,
				testBase.graphClient,
				uploadFile,
				fileSize,
				DriveItem.class);

        final LargeFileUploadResult<DriveItem> result = chunkedUploadProvider.upload(0, null, callback);
        assertNotNull(result);
	}
	@Test
	public void testDownloadWithCustomRequest() throws IOException {
		final String testDownloadFileId = "01RWFXFJG3UYRHE75RZVFYWKNUEBB53H7A";
		try (final InputStream stream = testBase.graphClient.customRequest("/me/drive/items/"+testDownloadFileId+"/content", InputStream.class).buildRequest().get()) {
		   assertFalse(stream.read() == -1, "stream should not be empty");
		}
	}
	@Test
	public void downloadJsonFileFromOneDrive() throws Exception {
		final DriveItemUploadableProperties item = new DriveItemUploadableProperties();
		item.name = "test.json";
		item.additionalDataManager().put("@microsoft.graph.conflictBehavior", new JsonPrimitive("replace"));

		final InputStream uploadFile = new ByteArrayInputStream("{\"hehe\":\"haha\"}".getBytes(StandardCharsets.UTF_8));

		final long fileSize = (long) uploadFile.available();

		final UploadSession session = testBase.graphClient.me()
			.drive()
			.root()
			.itemWithPath(item.name)
			.createUploadSession(DriveItemCreateUploadSessionParameterSet.newBuilder().withItem(item).build())
			.buildRequest()
			.post();

		LargeFileUploadTask<DriveItem> chunkedUploadProvider = new LargeFileUploadTask<DriveItem>(
				session,
				testBase.graphClient,
				uploadFile,
				fileSize,
				DriveItem.class);

		final LargeFileUploadResult<DriveItem> result = chunkedUploadProvider.upload(0, null, callback);
        assertNotNull(result);

		final InputStream stream = testBase.graphClient.me()
			.drive()
			.root()
			.itemWithPath(item.name)
			.content()
			.buildRequest()
			.get();

		final String fileContent = CoreHttpProvider.streamToString(stream);

		assertTrue(fileContent.length() > 0);
	}
}
