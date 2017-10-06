package com.microsoft.graph.functional;

import com.microsoft.graph.extensions.INotebookCollectionPage;
import com.microsoft.graph.extensions.INotebookGetRecentNotebooksCollectionPage;
import com.microsoft.graph.extensions.IOnenotePageCollectionPage;
import com.microsoft.graph.extensions.IOnenoteSectionCollectionPage;
import com.microsoft.graph.extensions.ISectionGroupCollectionPage;
import com.microsoft.graph.extensions.Notebook;
import com.microsoft.graph.extensions.OnenoteOperation;
import com.microsoft.graph.extensions.OnenotePage;
import com.microsoft.graph.extensions.OnenotePagePreview;
import com.microsoft.graph.extensions.OnenotePatchActionType;
import com.microsoft.graph.extensions.OnenotePatchContentCommand;
import com.microsoft.graph.extensions.OnenotePatchInsertPosition;
import com.microsoft.graph.extensions.OnenoteSection;
import com.microsoft.graph.extensions.SectionGroup;
import com.microsoft.graph.options.HeaderOption;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class OneNoteTests {

    private TestBase testBase;
    private Notebook testNotebook;
    private OnenoteSection testSection;
    private OnenotePage testPage;
    private Notebook testNotebook2;
    private SectionGroup testSectionGroup2;

    @Before
    public void setUp() {
        testBase = new TestBase();
        testNotebook = testBase.graphClient.getMe().getOnenote().getNotebooks("1-21b1f1d4-7e43-41e8-9acf-7e0b241eeab2").buildRequest().get();
        testSection = testBase.graphClient.getMe().getOnenote().getNotebooks(testNotebook.id).getSections().buildRequest().get().getCurrentPage().get(0);
        testPage = testBase.graphClient.getMe().getOnenote().getPages().buildRequest().get().getCurrentPage().get(0);

        // For copy scenarios
        testNotebook2 = testBase.graphClient.getMe().getOnenote().getNotebooks("1-b929a992-3d48-45e4-80db-793995ce452e").buildRequest().get();
        testSectionGroup2 = testBase.graphClient.getMe().getOnenote().getNotebooks(testNotebook2.id).getSectionGroups().buildRequest().get().getCurrentPage().get(0);
    }

    @Test
    public void testGetNotebookData() {
        INotebookCollectionPage books = testBase.graphClient.getMe().getOnenote().getNotebooks().buildRequest().get();
        assertNotNull(books);

        // Get pages from the OneNote object
        IOnenotePageCollectionPage pages = testBase.graphClient.getMe().getOnenote().getPages().buildRequest().get();
        assertNotNull(pages);

        // Get sections from a specific notebook
        IOnenoteSectionCollectionPage notebookSections = testBase.graphClient.getMe().getOnenote().getNotebooks(testNotebook.id).getSections().buildRequest().get();
        assertNotNull(notebookSections);

        // Get sections from the OneNote object
        IOnenoteSectionCollectionPage sections = testBase.graphClient.getMe().getOnenote().getSections().buildRequest().get();
        assertNotNull(sections);

        // Get section groups from a specific notebook
        ISectionGroupCollectionPage notebookGroups = testBase.graphClient.getMe().getOnenote().getNotebooks(testNotebook.id).getSectionGroups().buildRequest().get();
        assertNotNull(notebookGroups);

        // Get section groups from the OneNote object
        ISectionGroupCollectionPage groups = testBase.graphClient.getMe().getOnenote().getSectionGroups().buildRequest().get();
        assertNotNull(groups);

        // Get pages from a specific section
        IOnenotePageCollectionPage sectionPages = testBase.graphClient.getMe().getOnenote().getSections(sections.getCurrentPage().get(0).id).getPages().buildRequest().get();
        assertNotNull(sectionPages);
    }

    @Test
    public void testODataQueries() {
        INotebookCollectionPage books = testBase.graphClient.getMe().getOnenote().getNotebooks().buildRequest().expand("sections").get();
        Notebook book = books.getCurrentPage().get(0);
        assertNotNull(book.sections);

        INotebookCollectionPage idBooks = testBase.graphClient.getMe().getOnenote().getNotebooks().buildRequest().select("id").get();
        Notebook idBook = books.getCurrentPage().get(0);
        assertNotNull(idBook.id);

        IOnenotePageCollectionPage pages = testBase.graphClient.getMe().getOnenote().getPages().buildRequest().select("title").get();
        OnenotePage page = pages.getCurrentPage().get(0);
        assertNotNull(page.title);

        List<Option> options = new ArrayList<Option>();
        options.add(new QueryOption("count", "true"));
        INotebookCollectionPage countedBooks = testBase.graphClient.getMe().getOnenote().getNotebooks().buildRequest(options).get();
        assert(countedBooks.getRawObject().get("@odata.count").getAsInt() > 0);

        List<Option> pageLevelOptions = new ArrayList<Option>();
        pageLevelOptions.add(new QueryOption("pagelevel", "true"));
        IOnenotePageCollectionPage pageLevelPages = testBase.graphClient.getMe().getOnenote().getSections(testSection.id).getPages().buildRequest(pageLevelOptions).get();
        assertNotNull(pageLevelPages.getCurrentPage().get(0).level);
    }

    @Test
    public void testRecentNotebooks() {
        INotebookGetRecentNotebooksCollectionPage books = testBase.graphClient.getMe().getOnenote().getNotebooks().getGetRecentNotebooks(true).buildRequest().get();
        assertNotNull(books);

        INotebookGetRecentNotebooksCollectionPage noPersonalBooks = testBase.graphClient.getMe().getOnenote().getNotebooks().getGetRecentNotebooks(false).buildRequest().get();
        assertNotNull(noPersonalBooks);
    }

    @Test
    public void testGetPageContent() {
        InputStream pageStream = testBase.graphClient.getMe().getOnenote().getPages(testPage.id).getContent().buildRequest().get();

        BufferedReader r = new BufferedReader(new InputStreamReader(pageStream));
        StringBuilder content = new StringBuilder();
        String line;

        try {
            while ((line = r.readLine()) != null) {
                content.append(line).append('\n');
            }
        } catch (Exception e) {
            assertEquals(0,1);
        }
        assertNotNull(content);

        //Hardcoding for now since it requires parsing out of the page
        String resourceId = "1-ea3e97bf6a5c4dff9e8126014b205298!1-756de5a1-cfe7-4306-bf28-27282cad173b";
        InputStream resourceStream = testBase.graphClient.getMe().getOnenote().getResources(resourceId).getContent().buildRequest().get();

        r = new BufferedReader(new InputStreamReader(resourceStream));
        content = new StringBuilder();

        try {
            while ((line = r.readLine()) != null) {
                content.append(line).append('\n');
            }
        } catch (Exception e) {
            assertEquals(0,1);
        }
        assertNotNull(content);

    }

    @Test
    public void testGetPreview() {
        OnenotePagePreview preview = testBase.graphClient.getMe().getOnenote().getPages(testPage.id).getPreview().buildRequest().get();
        assertNotNull(preview);
    }

    @Test
    // Currently there is no way to delete notebooks, sections, or section groups
    public void testPostToNotebook() throws InterruptedException {
        SectionGroup sectionGroup = new SectionGroup();
        int randInt = Integer.MIN_VALUE + (int)(Math.random() * ((Integer.MAX_VALUE- Integer.MIN_VALUE) + 1000));
        sectionGroup.displayName = "Test Section Group" + randInt;

        SectionGroup newSectionGroup = testBase.graphClient.getMe().getOnenote().getNotebooks(testNotebook.id).getSectionGroups().buildRequest().post(sectionGroup);
        assertEquals(sectionGroup.displayName, newSectionGroup.displayName);

        OnenoteSection section = new OnenoteSection();
        section.displayName = "New Test Section " + randInt;

        OnenoteSection newSection = testBase.graphClient.getMe().getOnenote().getNotebooks(testNotebook.id).getSections().buildRequest().post(section);
        assertEquals(section.displayName, newSection.displayName);

        String content = "<html><head><title>Test Title</title></head><body>Test body</body></html>";

        byte[] pageStream = content.getBytes();
        List<Option> options = new ArrayList<Option>();
        options.add(new HeaderOption("Content-Type", "application/xhtml+xml"));
        OnenotePage newPage = testBase.graphClient.getMe().getOnenote().getSections(newSection.id).getPages().buildRequest(options).post(pageStream);
        assertEquals("Test Title", newPage.title);

        //Ensure that the page exists before we delete it
        Thread.sleep(2000);
        
        testBase.graphClient.getMe().getOnenote().getPages(newPage.id).buildRequest().delete();
    }

    //Accessing header data from successful calls is currently not supported
    @Ignore
    @Test
    public void testCopyTo(){
        OnenoteOperation operation1 = testBase.graphClient
        		.getMe()
        		.getOnenote()
        		.getSections(testSection.id)
        		.getCopyToNotebook(testNotebook2.id, null, null)
        		.buildRequest()
        		.post();
        assertNotNull(operation1);

        OnenoteOperation operation = testBase.graphClient.getMe().getOnenote().getSections(testSection.id).getCopyToSectionGroup(testSectionGroup2.id, null, null).buildRequest().post();
        assertNotNull(operation);

        OnenoteSection section = new OnenoteSection();
        section.displayName = "Test Copy Section";
        OnenoteSection newSection = testBase.graphClient.getMe().getOnenote().getNotebooks(testNotebook2.id).getSections().buildRequest().post(section);
        operation = testBase.graphClient.getMe().getOnenote().getPages(testPage.id).getCopyToSection(newSection.id, null).buildRequest().post();
        assertNotNull(operation);

        operation = testBase.graphClient.getMe().getOnenote().getOperations(operation1.id).buildRequest().get();
        assertFalse(operation1.status.equals("not started"));
    }

    @Test
    public void testMultipartPost(){
        String multipartBoundary = "part_" + new BigInteger(130, new SecureRandom()).toString();
        try {
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
            String doc = "\r\n\r\n" +
                    "--" + multipartBoundary + "\r\n" +
                    "Content-Disposition:form-data; name=\"attachment\"\r\n" +
                    "Content-Type:application/pdf\r\n\r\n";

            String end = "\r\n\r\n" +
                    "--" + multipartBoundary + "--";
                  
            File imageFile = new File("src/test/resources/hamilton.jpg");
            InputStream imageStream = new FileInputStream(imageFile);
            byte[] imgArray = getByteArray(imageStream);

            File docFile = new File("src/test/resources/document.pdf");
            InputStream docStream = new FileInputStream(docFile);
            byte[] docArray = getByteArray(docStream);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            out.write(html.getBytes());
            out.write(imgArray);
            out.write(doc.getBytes());
            out.write(docArray);
            out.write(end.getBytes());

            byte finalData[] = out.toByteArray();

            List<Option> options = new ArrayList<Option>();
            options.add(new HeaderOption("Content-Type", "multipart/form-data; boundary=\"" + multipartBoundary + "\""));
            OnenotePage newPage = testBase.graphClient.getMe().getOnenote().getSections(testSection.id).getPages().buildRequest(options).post(finalData);
            assertNotNull(newPage);
        } catch (Exception e) {
            Assert.fail("Unable to write to output stream");
        }
    }

    @Test
    public void testPatchContent() {
        List<OnenotePatchContentCommand> commands = new ArrayList<>();
        OnenotePatchContentCommand command = new OnenotePatchContentCommand();
        command.target = "body";
        command.action = OnenotePatchActionType.Append;
        command.position = OnenotePatchInsertPosition.After;
        command.content = "<img src=\"https://en.wikipedia.org/wiki/File:Alexander_Hamilton_portrait_by_John_Trumbull_1806.jpg\" alt=\"New image from a URL\" />";
        commands.add(command);
        testBase.graphClient.getMe().getOnenote().getPages(testPage.id).getOnenotePatchContent(commands).buildRequest().post();
    }

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
            Assert.fail("Unable to open document");
        }
        return null;
    }
}