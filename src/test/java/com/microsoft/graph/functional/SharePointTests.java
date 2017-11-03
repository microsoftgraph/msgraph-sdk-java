package com.microsoft.graph.functional;

import com.microsoft.graph.extensions.IDriveCollectionPage;
import com.microsoft.graph.extensions.IDriveItemCollectionPage;
import com.microsoft.graph.extensions.ISiteCollectionPage;
import com.microsoft.graph.extensions.Site;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.Base64;
import java.util.LinkedList;
import java.util.List;

public class SharePointTests {

    private TestBase testBase;
    private Site testSite;

    @Before
    public void setUp() {
        testBase = new TestBase();

        List<Option> requestOptions = new LinkedList<Option>();
        requestOptions.add(new QueryOption("search", "Contoso"));
        ISiteCollectionPage sites = testBase.graphClient.sites().buildRequest(requestOptions).get();
        testSite = sites.getCurrentPage().get(0);
    }

    @Test
    public void testAccessRootSite() {
//        ISiteCollectionPage sites = testBase.graphClient.getSites().buildRequest().get();
//        assertNotNull(sites);
    }

    @Test
    public void testSearch() {
        List<Option> requestOptions = new LinkedList<Option>();
        requestOptions.add(new QueryOption("search", "Contoso"));
        ISiteCollectionPage sites = testBase.graphClient.sites().buildRequest(requestOptions).get();

        assertNotNull(sites);
    }

    @Test
    public void testDrives() {
        IDriveCollectionPage drives = testBase.graphClient.sites(testSite.id).drives().buildRequest().get();
        assertNotNull(drives);
    }

    @Test
    public void testNonDefaultLibrary() {
        IDriveCollectionPage drives = testBase.graphClient.sites(testSite.id).drives().buildRequest().get();
        IDriveItemCollectionPage driveItems = testBase.graphClient.sites(testSite.id).drives(drives.getCurrentPage().get(0).id).root().children().buildRequest().get();

        assertNotNull(driveItems);
    }

    @Test
    public void accessSiteViaUrl() {
//        String url = "u!" + Base64.getUrlEncoder().encodeToString(testSite.webUrl.getBytes());
//        url = url.replace("=", "").replace("\n", "");
//        Site site = testBase.graphClient.getShares(url).getSite().buildRequest().get();
    }
}