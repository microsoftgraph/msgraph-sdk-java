package com.microsoft.graph.functional;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.microsoft.graph.concurrency.ChunkedUploadProvider;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.models.extensions.UploadSession;

@Ignore
public class OneDriveTests {
    private TestBase testBase;

    @Before
    public void setUp() {
       testBase = new TestBase();
    }
    
    /**
     * Test large file upload. 
     * https://github.com/OneDrive/onedrive-sdk-csharp/blob/master/docs/chunked-uploads.md
     * 
     * @throws IOException if the input file is not found
     * @throws InterruptedException if the chunked upload fails
     */
    @Test
    public void testLargeFileUpload() throws IOException, InterruptedException {
    	String itemId = "01BQHXQL5GQVAGCFJLYRH3EAG2YHGERMQA"; //Test upload folder
    	
    	//Get resource file from file system
    	InputStream uploadFile = OneDriveTests.class.getClassLoader().getResourceAsStream("hamilton.jpg");
    	int fileSize = uploadFile.available();
    	
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
    	
    	UploadSession uploadSession = testBase
    			.graphClient
    			.me()
    			.drive()
    			.items(itemId)
    			.itemWithPath("_hamilton.jpg")
    			.createUploadSession(new DriveItemUploadableProperties())
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
    
}
