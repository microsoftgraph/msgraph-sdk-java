package com.microsoft.graph.functional;

import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.requests.extensions.SiteCollectionPage;
import com.microsoft.graph.requests.extensions.DriveCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemCollectionPage;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.Site;

@Ignore
public class SharePointTests {

    private TestBase testBase;
    private Site testSite;

    @Before
    public void setUp() {
        testBase = new TestBase();

        List<Option> requestOptions = new LinkedList<Option>();
        requestOptions.add(new QueryOption("search", "Contoso"));
        SiteCollectionPage sites = testBase.graphClient.sites().buildRequest(requestOptions).get();
        testSite = sites.getCurrentPage().get(0);
    }

    @Test
    public void testAccessRootSite() {
//        BaseCollectionPage<ISite> sites = testBase.graphClient.getSites().buildRequest().get();
//        assertNotNull(sites);
    }

    @Test
    public void testSearch() {
        List<Option> requestOptions = new LinkedList<Option>();
        requestOptions.add(new QueryOption("search", "Contoso"));
        SiteCollectionPage sites = testBase.graphClient.sites().buildRequest(requestOptions).get();

        assertNotNull(sites);
    }

    @Test
    public void testDrives() {
        DriveCollectionPage drives = testBase.graphClient.sites(testSite.id).drives().buildRequest().get();
        assertNotNull(drives);
    }

    @Test
    public void testNonDefaultLibrary() {
        DriveCollectionPage drives = testBase.graphClient.sites(testSite.id).drives().buildRequest().get();
        DriveItemCollectionPage driveItems = testBase.graphClient.sites(testSite.id).drives(drives.getCurrentPage().get(0).id).root().children().buildRequest().get();

        assertNotNull(driveItems);
    }

    @Test
    public void accessSiteViaUrl() {
//        String url = "u!" + Base64.getUrlEncoder().encodeToString(testSite.webUrl.getBytes());
//        url = url.replace("=", "").replace("\n", "");
//        Site site = testBase.graphClient.getShares(url).getSite().buildRequest().get();
    }
}