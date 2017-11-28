package com.microsoft.graph.functional;

import com.microsoft.graph.requests.extensions.INotebookCollectionPage;
import com.microsoft.graph.requests.extensions.INotebookGetRecentNotebooksCollectionPage;
import com.microsoft.graph.requests.extensions.IOnenotePageCollectionPage;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionPage;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionPage;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.models.extensions.OnenotePage;
import com.microsoft.graph.models.extensions.OnenotePagePreview;
import com.microsoft.graph.models.generated.OnenotePatchActionType;
import com.microsoft.graph.models.extensions.OnenotePatchContentCommand;
import com.microsoft.graph.models.generated.OnenotePatchInsertPosition;
import com.microsoft.graph.models.extensions.OnenoteSection;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.options.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 * Tests for OneNote API functionality
 */
@Ignore
public class OneNoteTests {

	private IOnenoteRequestBuilder orb;
    private Notebook testNotebook;
    private Notebook testNotebook2;
    private OnenotePage testPage;
    private OnenoteSection testSection;
    private SectionGroup testSectionGroup2;

    @Before
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
        INotebookCollectionPage books = orb
        		.notebooks()
        		.buildRequest()
        		.get();
        assertNotNull(books);

        // Get pages from the OneNote object
        IOnenotePageCollectionPage pages = orb
        		.pages()
        		.buildRequest()
        		.get();
        assertNotNull(pages);

        // Get sections from a specific notebook
        IOnenoteSectionCollectionPage notebookSections = orb
        		.notebooks(testNotebook.id)
        		.sections()
        		.buildRequest()
        		.get();
        assertNotNull(notebookSections);

        // Get sections from the OneNote object
        IOnenoteSectionCollectionPage sections = orb
        		.sections()
        		.buildRequest()
        		.get();
        assertNotNull(sections);

        // Get section groups from a specific notebook
        ISectionGroupCollectionPage notebookGroups = orb
        		.notebooks(testNotebook.id)
        		.sectionGroups()
        		.buildRequest()
        		.get();
        assertNotNull(notebookGroups);

        // Get section groups from the OneNote object
        ISectionGroupCollectionPage groups = orb
        		.sectionGroups()
        		.buildRequest()
        		.get();
        assertNotNull(groups);

        // Get pages from a specific section
        IOnenotePageCollectionPage sectionPages = orb
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
    	// Test Expand
        INotebookCollectionPage books = orb
        		.notebooks()
        		.buildRequest()
        		.expand("sections")
        		.get();
        Notebook book = books.getCurrentPage().get(0);
        assertNotNull(book.sections);

        // Test Select on notebook
        INotebookCollectionPage idBooks = orb
        		.notebooks()
        		.buildRequest()
        		.select("id")
        		.get();
        Notebook idBook = idBooks.getCurrentPage().get(0);
        assertNotNull(idBook.id);

        // Test Select on page
        IOnenotePageCollectionPage pages = orb
        		.pages()
        		.buildRequest()
        		.select("title")
        		.get();
        OnenotePage page = pages.getCurrentPage().get(0);
        assertNotNull(page.title);

        // Test Count on notebooks
        List<Option> options = new ArrayList<Option>();
        options.add(new QueryOption("count", "true"));
        INotebookCollectionPage countedBooks = orb
        		.notebooks()
        		.buildRequest(options)
        		.get();
        assert(countedBooks.getRawObject().get("@odata.count").getAsInt() > 0);

        // Test PageLevel on pages
        List<Option> pageLevelOptions = new ArrayList<Option>();
        pageLevelOptions.add(new QueryOption("pagelevel", "true"));
        IOnenotePageCollectionPage pageLevelPages = orb
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
        INotebookGetRecentNotebooksCollectionPage books = orb
        		.notebooks()
        		.getRecentNotebooks(true)
        		.buildRequest()
        		.get();
        assertNotNull(books);

        INotebookGetRecentNotebooksCollectionPage noPersonalBooks = orb
        		.notebooks()
        		.getRecentNotebooks(false)
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
     * @throws InterruptedException
     */
    @Test
    public void testPostToNotebook() throws InterruptedException {
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

        byte[] pageStream = content.getBytes();
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
    @Ignore
    @Test
    public void testCopyTo(){
    	// Test copy to notebook
        OnenoteOperation notebookCopy = orb
        		.sections(testSection.id)
        		.copyToNotebook(testNotebook2.id, null, null)
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
        		.copyToSectionGroup(testSectionGroup2.id, null, null)
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
        		.copyToSection(section.id, null)
        		.buildRequest()
        		.post();
        assertNotNull(copySection);
    }

    /**
     * Test posting multipart content to a page
     */
    @Test
    public void testMultipartPost(){
        String multipartBoundary = "part_" + new BigInteger(130, new SecureRandom()).toString();
        try {
        	
        	// Write the multipart content
        	// The HTML content of the page
            String html =
                "--" + multipartBoundary + "\r\n" +
                        "Content-Disposition:form-data; name=\"Presentation\"" + "\r\n" +
                        "Content-Type: text/html" + "\r\n" +
                        "\r\n" +
                        "<!DOCTYPE html>\r\n" +
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
                        "</html>\r\n" +
                        "\r\n" +
                        "--" + multipartBoundary + "\r\n" +
                        "Content-Disposition:form-data; name=\"image\"\r\n" +
                        "Content-Type: image/jpeg\r\n\r\n";
            
            // The document metadata
            String doc = "\r\n\r\n" +
                    "--" + multipartBoundary + "\r\n" +
                    "Content-Disposition:form-data; name=\"attachment\"\r\n" +
                    "Content-Type:application/pdf\r\n\r\n";

            // The multipart boundary
            String end = "\r\n\r\n" +
                    "--" + multipartBoundary + "--";
                  
            // Image to stream
            File imageFile = new File("src/test/resources/hamilton.jpg");
            InputStream imageStream = new FileInputStream(imageFile);
            byte[] imgArray = getByteArray(imageStream);

            // Document to stream
            File docFile = new File("src/test/resources/document.pdf");
            InputStream docStream = new FileInputStream(docFile);
            byte[] docArray = getByteArray(docStream);

            // Write the image and document to the multipart content
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            out.write(html.getBytes());
            out.write(imgArray);
            out.write(doc.getBytes());
            out.write(docArray);
            out.write(end.getBytes());

            byte finalData[] = out.toByteArray();

            // Add multipart request header
            List<Option> options = new ArrayList<Option>();
            options.add(new HeaderOption(
            		"Content-Type", "multipart/form-data; boundary=\"" + multipartBoundary + "\""
            		));
            
            // Post the multipart content
            OnenotePage page = orb
            		.sections(testSection.id)
            		.pages()
            		.buildRequest(options)
            		.post(finalData);
            assertNotNull(page);
        } catch (Exception e) {
            fail("Unable to write to output stream");
        }
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
        .onenotePatchContent(commands)
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