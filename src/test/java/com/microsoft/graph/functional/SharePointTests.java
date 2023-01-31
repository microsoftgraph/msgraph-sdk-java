package com.microsoft.graph.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.Site;
import com.microsoft.graph.requests.SiteCollectionPage;
import com.microsoft.graph.requests.DriveCollectionPage;
import com.microsoft.graph.requests.DriveItemCollectionPage;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.models.Drive;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.Site;

@Disabled
public class SharePointTests {

    private TestBase testBase;
    private Site testSite;

    @BeforeEach
    public void setUp() {
        testBase = new TestBase();

        List<Option> requestOptions = new LinkedList<Option>();
        requestOptions.add(new QueryOption("search", "Contoso"));
        SiteCollectionPage sites = testBase.graphClient.sites().buildRequest(requestOptions).get();
        testSite = sites.getCurrentPage().get(0);
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
}
