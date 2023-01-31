package com.microsoft.graph.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
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

public class OneDriveTests {
	private TestBase testBase;

	public void setUp() {
        if(testBase == null) {
	        testBase = new TestBase();
        }
	}

	final IProgressCallback callback = new IProgressCallback () {
		@Override
		public void progress(final long current, final long max) {
			//Check progress
		}
	};
    /**
     * Tests that paths are properly encoded according to ODSP's expectations
     * - everything is encoded to the application/x-www-form-urlencoded MIME format
     * - spaces are encoded with %20
     */
    @Test
    public void itemWithPathEncodesSpecialCharacters() {
        final URL requestURL = new TestBase(false).graphClient.drives("foo").items("bar").itemWithPath("some folder/some name with a + and a #777.docx").buildRequest().getRequestUrl();
        assertEquals("/drives/foo/items/bar:/some%20folder%2Fsome%20name%20with%20a%20%2B%20and%20a%20%23777.docx:", requestURL.getPath().replace("/v1.0", "").replace("/beta", ""));
        // version replacement so the test is version agnostic
    }
	/**
	 * Test large file upload.
	 * https://github.com/OneDrive/onedrive-sdk-csharp/blob/master/docs/chunked-uploads.md
	 *
	 * @throws IOException if the input file is not found
	 * @throws InterruptedException if the chunked upload fails
	 */
	@Test
    @Disabled
	public void testLargeFileUpload() throws IOException, InterruptedException {
		setUp();
        //Get resource file from file system
		InputStream uploadFile = OneDriveTests.class.getClassLoader().getResourceAsStream("largefile10M.blob");
		long fileSize = (long) uploadFile.available();

		UploadSession uploadSession = testBase
				.graphClient
				.drives("foo")
				.items("bar")
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
    @Disabled
	public void testDownloadWithCustomRequest() throws IOException {
        setUp();
		final String testDownloadFileId = "01RWFXFJG3UYRHE75RZVFYWKNUEBB53H7A";
		try (final InputStream stream = testBase.graphClient.customRequest("/me/drive/items/"+testDownloadFileId+"/content", InputStream.class).buildRequest().get()) {
		   assertFalse(stream.read() == -1, "stream should not be empty");
		}
	}
	@Test
    @Disabled
	public void downloadJsonFileFromOneDrive() throws Exception {
        setUp();
		final DriveItemUploadableProperties item = new DriveItemUploadableProperties();
		item.name = "test.json";
		item.additionalDataManager().put("@microsoft.graph.conflictBehavior", new JsonPrimitive("replace"));

		final InputStream uploadFile = new ByteArrayInputStream("{\"hehe\":\"haha\"}".getBytes(StandardCharsets.UTF_8));

		final long fileSize = (long) uploadFile.available();

		final UploadSession session = testBase.graphClient
			.drives("foo")
			.items("bar")
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

		final InputStream stream = testBase.graphClient
			.drives("foo")
			.items("bar")
			.itemWithPath(item.name)
			.content()
			.buildRequest()
			.get();

		final String fileContent = CoreHttpProvider.streamToString(stream);

		assertTrue(fileContent.length() > 0);
	}
}
