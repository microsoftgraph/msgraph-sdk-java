package com.microsoft.graph.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.microsoft.graph.core.Multipart;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.Notebook;
import com.microsoft.graph.models.OnenoteOperation;
import com.microsoft.graph.models.OnenotePage;
import com.microsoft.graph.models.OnenotePagePreview;
import com.microsoft.graph.models.OnenotePatchContentCommand;
import com.microsoft.graph.models.OnenoteSection;
import com.microsoft.graph.models.RecentNotebook;
import com.microsoft.graph.models.SectionGroup;
import com.microsoft.graph.models.OnenotePatchActionType;
import com.microsoft.graph.models.OnenotePatchInsertPosition;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.OnenotePageCollectionRequest;
import com.microsoft.graph.requests.OnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.OnenoteRequestBuilder;
import com.microsoft.graph.requests.OnenotePageCollectionPage;
import com.microsoft.graph.requests.OnenoteSectionCollectionPage;
import com.microsoft.graph.requests.NotebookGetRecentNotebooksCollectionPage;
import com.microsoft.graph.requests.SectionGroupCollectionPage;
import com.microsoft.graph.requests.NotebookCollectionPage;
import com.microsoft.graph.models.NotebookGetRecentNotebooksParameterSet;
import com.microsoft.graph.models.OnenoteSectionCopyToSectionGroupParameterSet;
import com.microsoft.graph.models.OnenoteSectionCopyToNotebookParameterSet;
import com.microsoft.graph.models.OnenotePageCopyToSectionParameterSet;
import com.microsoft.graph.models.OnenotePageOnenotePatchContentParameterSet;

/**
 * Tests for OneNote API functionality
 */
@Disabled
public class OneNoteTests {

	private OnenoteRequestBuilder orb;
    private Notebook testNotebook;
    private Notebook testNotebook2;
    private OnenotePage testPage;
    private OnenoteSection testSection;
    private SectionGroup testSectionGroup2;
    private final String HTML_ENCODING= "US-ASCII";

    @BeforeEach
    public void setUp() {
        TestBase testBase = new TestBase();
        orb = testBase.graphClient.me().onenote();

        // Get a pre-made notebook (notebooks cannot currently be deleted)
        testNotebook = orb
        		.notebooks("1-21b1f1d4-7e43-41e8-9acf-7e0b241eeab2")
        		.buildRequest()
        		.get();

        // Get the first section in the test notebook
        testSection = orb
        		.notebooks(testNotebook.id)
        		.sections()
        		.buildRequest()
        		.get()
        		.getCurrentPage()
        		.get(0);

        // Get the first page in the test notebook
        testPage = orb
        		.pages()
        		.buildRequest()
        		.get()
        		.getCurrentPage()
        		.get(0);

        // For copy scenarios
        testNotebook2 = orb
        		.notebooks("1-b929a992-3d48-45e4-80db-793995ce452e")
        		.buildRequest()
        		.get();

        testSectionGroup2 = orb
        		.notebooks(testNotebook2.id)
        		.sectionGroups()
        		.buildRequest()
        		.get()
        		.getCurrentPage()
        		.get(0);
    }

    /**
     * Tests for basic GET requests
     */
    @Test
    public void testGetNotebookData() {
    	// Get notebooks
        NotebookCollectionPage books = orb
        		.notebooks()
        		.buildRequest()
        		.get();
        assertNotNull(books);

        // Get pages from the OneNote object
        OnenotePageCollectionPage pages = orb
        		.pages()
        		.buildRequest()
        		.get();
        assertNotNull(pages);

        // Get sections from a specific notebook
        OnenoteSectionCollectionPage notebookSections = orb
        		.notebooks(testNotebook.id)
        		.sections()
        		.buildRequest()
        		.get();
        assertNotNull(notebookSections);

        // Get sections from the OneNote object
        OnenoteSectionCollectionPage sections = orb
        		.sections()
        		.buildRequest()
        		.get();
        assertNotNull(sections);

        // Get section groups from a specific notebook
        SectionGroupCollectionPage notebookGroups = orb
        		.notebooks(testNotebook.id)
        		.sectionGroups()
        		.buildRequest()
        		.get();
        assertNotNull(notebookGroups);

        // Get section groups from the OneNote object
        SectionGroupCollectionPage groups = orb
        		.sectionGroups()
        		.buildRequest()
        		.get();
        assertNotNull(groups);

        // Get pages from a specific section
        OnenotePageCollectionPage sectionPages = orb
        		.sections(sections.getCurrentPage().get(0).id)
        		.pages()
        		.buildRequest()
        		.get();
        assertNotNull(sectionPages);
    }

    /**
     * Tests for query options
     */
    @Test
    public void testODataQueries() {
        // Test Filter
        NotebookCollectionPage filteredBooks = orb
        		.notebooks()
                .buildRequest()
                .filter("isDefault eq true")
                .get();
        assertTrue(filteredBooks.getCurrentPage().size() == 0);
    	// Test Expand
        NotebookCollectionPage books = orb
        		.notebooks()
        		.buildRequest()
        		.expand("sections")
        		.get();
        Notebook book = books.getCurrentPage().get(0);
        assertNotNull(book.sections);

        // Test Select on notebook
        NotebookCollectionPage idBooks = orb
        		.notebooks()
        		.buildRequest()
        		.select("id")
        		.get();
        Notebook idBook = idBooks.getCurrentPage().get(0);
        assertNotNull(idBook.id);

        // Test Select on page
        OnenotePageCollectionPage pages = orb
        		.pages()
        		.buildRequest()
        		.select("title")
        		.get();
        OnenotePage page = pages.getCurrentPage().get(0);
        assertNotNull(page.title);

        // Test Count on notebooks
        List<Option> options = new ArrayList<Option>();
        options.add(new QueryOption("count", "true"));
        NotebookCollectionPage countedBooks = orb
        		.notebooks()
        		.buildRequest(options)
        		.get();
        assert(countedBooks.getCount() > 0);

        // Test PageLevel on pages
        List<QueryOption> pageLevelOptions = new ArrayList<QueryOption>();
        pageLevelOptions.add(new QueryOption("pagelevel", "true"));
        OnenotePageCollectionPage pageLevelPages = orb
        		.sections(testSection.id)
        		.pages()
        		.buildRequest(pageLevelOptions)
        		.get();
        assertNotNull(pageLevelPages.getCurrentPage().get(0).level);
    }

    /**
     * Test get recent notebooks
     */
    @Test
    public void testRecentNotebooks() {
        NotebookGetRecentNotebooksCollectionPage books = orb
        		.notebooks()
        		.getRecentNotebooks(NotebookGetRecentNotebooksParameterSet.newBuilder().withIncludePersonalNotebooks(true).build())
        		.buildRequest()
        		.get();
        assertNotNull(books);

        NotebookGetRecentNotebooksCollectionPage noPersonalBooks = orb
        		.notebooks()
        		.getRecentNotebooks(NotebookGetRecentNotebooksParameterSet.newBuilder().withIncludePersonalNotebooks(false).build())
        		.buildRequest()
        		.get();
        assertNotNull(noPersonalBooks);
    }

    /**
     * Test get page content
     */
    @Test
    public void testGetPageContent() {
    	// Get the page data stream
        InputStream pageStream = orb
        		.pages(testPage.id)
        		.content()
        		.buildRequest()
        		.get();

        // Read the stream into a String
        BufferedReader r = new BufferedReader(new InputStreamReader(pageStream));
        StringBuilder content = new StringBuilder();
        String line;

        try {
            while ((line = r.readLine()) != null) {
                content.append(line).append('\n');
            }
        } catch (Exception e) {
            fail("Failed to parse content");
        }
        assertNotNull(content);

        // Hard coding for now since it requires parsing out of the page
        String resourceId = "1-ea3e97bf6a5c4dff9e8126014b205298!1-756de5a1-cfe7-4306-bf28-27282cad173b";

        // Get the page stream data
        InputStream resourceStream = orb
        		.resources(resourceId)
        		.content()
        		.buildRequest()
        		.get();

        // Read the stream into a String
        r = new BufferedReader(new InputStreamReader(resourceStream));
        content = new StringBuilder();

        try {
            while ((line = r.readLine()) != null) {
                content.append(line).append('\n');
            }
        } catch (Exception e) {
        	fail("Failed to parse content");
        }
        assertNotNull(content);
    }

    /**
     * Test get the page preview
     */
    @Test
    public void testGetPreview() {
        OnenotePagePreview preview = orb
        		.pages(testPage.id)
        		.preview()
        		.buildRequest()
        		.get();
        assertNotNull(preview);
    }

    /**
     * Test posting a page stream to a page
     * @throws InterruptedException, UnsupportedEncodingException
     */
    @Test
    public void testPostToNotebook() throws InterruptedException, UnsupportedEncodingException {
        SectionGroup sectionGroupData = new SectionGroup();

        // Currently, there is no way to delete sections or section groups, so let's create a random one
        int randInt = Integer.MIN_VALUE + (int)(Math.random() * ((Integer.MAX_VALUE- Integer.MIN_VALUE) + 1000));
        sectionGroupData.displayName = "Test Section Group" + randInt;

        SectionGroup sectionGroup = orb
        		.notebooks(testNotebook.id)
        		.sectionGroups()
        		.buildRequest()
        		.post(sectionGroupData);
        assertEquals(sectionGroupData.displayName, sectionGroup.displayName);

        // Create a new random section
        OnenoteSection sectionData = new OnenoteSection();
        sectionData.displayName = "New Test Section " + randInt;

        OnenoteSection section = orb
        		.notebooks(testNotebook.id)
        		.sections()
        		.buildRequest()
        		.post(sectionData);
        assertEquals(sectionData.displayName, section.displayName);

        // Test HTML content
        String content = "<html><head><title>Test Title</title></head><body>Test body</body></html>";

        byte[] pageStream = content.getBytes(HTML_ENCODING);
        List<Option> options = new ArrayList<Option>();
        options.add(new HeaderOption("Content-Type", "application/xhtml+xml"));
        OnenotePage page = orb
        		.sections(section.id)
        		.pages()
        		.buildRequest(options)
        		.post(pageStream);
        assertEquals("Test Title", page.title);

        //Ensure that the page exists before we delete it
        Thread.sleep(2000);

        // Clean up after the test
        orb.pages(page.id).buildRequest().delete();
    }

    /**
     * Test copy operations
     * TODO: Accessing header data from successful calls is currently not supported
     */
    @Disabled
    @Test
    public void testCopyTo(){
    	// Test copy to notebook
        OnenoteOperation notebookCopy = orb
        		.sections(testSection.id)
        		.copyToNotebook(OnenoteSectionCopyToNotebookParameterSet.newBuilder().withId(testNotebook2.id).withSiteCollectionId("TODOsiteCollectionId").withSiteId("TODOsiteId").build())
        		.buildRequest()
        		.post();
        assertNotNull(notebookCopy);

        // Test status update
        notebookCopy = orb
        		.operations(notebookCopy.id)
        		.buildRequest()
        		.get();
        assertFalse(notebookCopy.status.equals("not started"));

        // Test copy to section group
        OnenoteOperation copySectionGroup = orb
        		.sections(testSection.id)
        		.copyToSectionGroup(OnenoteSectionCopyToSectionGroupParameterSet.newBuilder().withGroupId(testSectionGroup2.id).withSiteCollectionId("TODOsiteCollectionId").withSiteId("TODOsiteId").build())
        		.buildRequest()
        		.post();
        assertNotNull(copySectionGroup);

        // Test copy to section
        OnenoteSection sectionData = new OnenoteSection();
        sectionData.displayName = "Test Copy Section";

        OnenoteSection section = orb
        		.notebooks(testNotebook2.id)
        		.sections()
        		.buildRequest()
        		.post(sectionData);

        OnenoteOperation copySection = orb
        		.pages(testPage.id)
        		.copyToSection(OnenotePageCopyToSectionParameterSet.newBuilder().withId(section.id).withSiteCollectionId("TODOsiteCollectionId").withSiteId("TODOsiteId").build())
        		.buildRequest()
        		.post();
        assertNotNull(copySection);
    }

    /**
     * Test posting multipart content to a page
     */
    @Test
    public void testMultipartPost(){
        try {
        	Multipart multipart = new Multipart();

        	String htmlContent = "<!DOCTYPE html>\r\n" +
                    "<html lang=\"en-US\">\r\n" +
                    "<head>\r\n" +
                    "<title>Test Multipart Page</title>\r\n" +
                    "<meta name=\"created\" content=\"2001-01-01T01:01+0100\">\r\n" +
                    "</head>\r\n" +
                    "<body>\r\n" +
                    "<p>\r\n" +
                    "<img src=\"name:image\" />\r\n" +
                    "</p>\r\n" +
                    "<p>\r\n" +
                    "<object data=\"name:attachment\" data-attachment=\"document.pdf\" /></p>\r\n" +
                    "\r\n" +
                    "</body>\r\n" +
                    "</html>";
        	File imgFile = new File("src/test/resources/hamilton.jpg");
        	File pdfFile = new File("src/test/resources/document.pdf");

        	multipart.addHtmlPart("Presentation", htmlContent.getBytes(HTML_ENCODING));
        	multipart.addFilePart("hamilton", "image/jpg", imgFile);
        	multipart.addFilePart("metadata", "application/pdf", pdfFile);

            // Add multipart request header
            List<Option> options = new ArrayList<Option>();
            options.add(multipart.header());

            // Post the multipart content
            OnenotePage page = orb
            		.sections(testSection.id)
            		.pages()
            		.buildRequest(options)
            		.post(multipart.content());
            assertNotNull(page);
        } catch (Exception e) {
            fail("Unable to write to output stream");
        }
    }

    /**
     * Test posting multipart content to a page
     */
    @Test
    public void testMultipartPostWithHeadersMap() throws Exception{
    	Multipart multipart = new Multipart();

    	String htmlContent = "<!DOCTYPE html>\r\n" +
    			"<html lang=\"en-US\">\r\n" +
    			"<head>\r\n" +
    			"<title>Test Multipart Page</title>\r\n" +
    			"<meta name=\"created\" content=\"2001-01-01T01:01+0100\">\r\n" +
    			"</head>\r\n" +
    			"<body>\r\n" +
    			"<p>\r\n" +
    			"<img src=\"name:image\" />\r\n" +
    			"</p>\r\n" +
    			"<p>\r\n" +
    			"<object data=\"name:attachment\" data-attachment=\"document.pdf\" /></p>\r\n" +
    			"\r\n" +
    			"</body>\r\n" +
    			"</html>";
    	File imgFile = new File("src/test/resources/hamilton.jpg");
    	File pdfFile = new File("src/test/resources/document.pdf");

    	Map<String, String> htmlHeaderMap = new HashMap<>();
    	Map<String, String> contentDispMap = new HashMap<>();
    	contentDispMap.put("name","Presentation" );
    	htmlHeaderMap.put("Content-Disposition", Multipart.createContentHeaderValue("form-data", contentDispMap));
    	htmlHeaderMap.put("Content-Type", Multipart.createContentHeaderValue("text/html", null));
    	multipart.addPart(htmlHeaderMap, htmlContent.getBytes(HTML_ENCODING));

    	InputStream fileStream = new FileInputStream(imgFile);
    	multipart.addFormData("hamilton", "image/jpg", getByteArray(fileStream));
    	multipart.addFilePart("metadata", "application/pdf", pdfFile);

    	// Add multipart request header
    	List<Option> options = new ArrayList<Option>();
    	options.add(multipart.header());

    	// Post the multipart content
    	OnenotePageCollectionRequestBuilder pageReq = orb
    			.sections(testSection.id)
    			.pages();
    	String expectedRequestUrl = "https://graph.microsoft.com/v1.0/me/onenote/sections/"+testSection.id+"/pages";
    	assertEquals(expectedRequestUrl, pageReq.getRequestUrl());
    	OnenotePageCollectionRequest request = pageReq.buildRequest(options);
    	assertNotNull(request);

    	OnenotePageCollectionRequest pageCollectionReq = (OnenotePageCollectionRequest)request;
    	List<HeaderOption> headeroption = pageCollectionReq.getHeaders();
    	assertEquals("Content-Type", headeroption.get(0).getName());

    	String expectedHeaderValue = "multipart/form-data; boundary=\""+multipart.getBoundary()+"\"";
    	assertEquals(expectedHeaderValue, headeroption.get(0).getValue().toString());
    	assertNotNull(multipart.content());

    	OnenotePage page = request.post(multipart.content());
    	assertNotNull(page);
    }

    /**
     * Test patching a page's content
     * TODO: Add an Assert here
     */
    @Test
    public void testPatchContent() {
        List<OnenotePatchContentCommand> commands = new ArrayList<>();
        OnenotePatchContentCommand command = new OnenotePatchContentCommand();
        command.target = "body";
        command.action = OnenotePatchActionType.APPEND;
        command.position = OnenotePatchInsertPosition.AFTER;
        command.content = "<img src=\"https://en.wikipedia.org/wiki/File:Alexander_Hamilton_portrait_by_John_Trumbull_1806.jpg\" alt=\"New image from a URL\" />";
        commands.add(command);
        orb
        .pages(testPage.id)
        .onenotePatchContent(OnenotePageOnenotePatchContentParameterSet.newBuilder().withCommands(commands).build())
        .buildRequest()
        .post();
    }

    /**
     * Helper method to convert an InputStream to a byte[]
     * @param in The input stream to convert
     * @return The byte[]
     */
    public byte[] getByteArray(InputStream in) {
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            int nRead;
            byte[] data = new byte[16384];
            while ((nRead = in.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, nRead);
            }
            buffer.flush();
            return buffer.toByteArray();
        } catch (Exception e) {
            fail("Unable to open document");
        }
        return null;
    }
}
