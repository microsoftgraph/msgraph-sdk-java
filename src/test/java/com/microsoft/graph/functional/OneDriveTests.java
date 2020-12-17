package com.microsoft.graph.functional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.google.gson.JsonPrimitive;
import com.microsoft.graph.concurrency.ChunkedUploadProvider;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.CoreHttpProvider;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.models.extensions.UploadSession;
import com.microsoft.graph.models.extensions.DriveItemCreateUploadSessionParameterSet;

@Ignore
public class OneDriveTests {
	private TestBase testBase;

	@Before
	public void setUp() {
	   testBase = new TestBase();
	}

	IProgressCallback<DriveItem> callback = new IProgressCallback<DriveItem> () {
		@Override
		public void progress(final long current, final long max) {
			//Check progress
		}
		@Override
		public void success(final DriveItem result) {
			//Handle the successful response
			String finishedItemId = result.id;
			Assert.assertNotNull(finishedItemId);
		}

		@Override
		public void failure(final ClientException ex) {
			//Handle the failed upload
			Assert.fail("Upload session failed");
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
		ChunkedUploadProvider<DriveItem> chunkedUploadProvider = new ChunkedUploadProvider<DriveItem>(
				uploadSession,
				testBase.graphClient,
				uploadFile,
				fileSize,
				DriveItem.class);

		chunkedUploadProvider.upload(callback);
	}
	@Test
	public void testDownloadWithCustomRequest() throws IOException {
		final String testDownloadFileId = "01RWFXFJG3UYRHE75RZVFYWKNUEBB53H7A";
		try (final InputStream stream = testBase.graphClient.customRequest("/me/drive/items/"+testDownloadFileId+"/content", InputStream.class).buildRequest().get()) {
		   assertFalse("stream should not be empty", stream.read() == -1);
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

		ChunkedUploadProvider<DriveItem> chunkedUploadProvider = new ChunkedUploadProvider<DriveItem>(
				session,
				testBase.graphClient,
				uploadFile,
				fileSize,
				DriveItem.class);

		chunkedUploadProvider.upload(callback);

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
