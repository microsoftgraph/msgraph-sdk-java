package com.microsoft.graph.sites.item.getbypathwithpath;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Site;
import com.microsoft.graph.sites.item.getbypathwithpath.analytics.AnalyticsRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.columns.ColumnsRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.contenttypes.ContentTypesRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.createdbyuser.CreatedByUserRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.drive.DriveRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.drives.DrivesRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.externalcolumns.ExternalColumnsRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.getactivitiesbyinterval.GetActivitiesByIntervalRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.getactivitiesbyintervalwithstartdatetimewithenddatetimewithinterval.GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.getapplicablecontenttypesforlistwithlistid.GetApplicableContentTypesForListWithListIdRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.getbypathwithpath1.GetByPathWithPath1RequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.items.ItemsRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.lastmodifiedbyuser.LastModifiedByUserRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.lists.ListsRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.onenote.OnenoteRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.operations.OperationsRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.permissions.PermissionsRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.sites.SitesRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.termstore.TermStoreRequestBuilder;
import com.microsoft.graph.sites.item.getbypathwithpath.termstores.TermStoresRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the getByPath method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetByPathWithPathRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the analytics property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public AnalyticsRequestBuilder analytics() {
        return new AnalyticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the columns property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public ColumnsRequestBuilder columns() {
        return new ColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the contentTypes property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public ContentTypesRequestBuilder contentTypes() {
        return new ContentTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the createdByUser property of the microsoft.graph.baseItem entity.
     */
    @jakarta.annotation.Nonnull
    public CreatedByUserRequestBuilder createdByUser() {
        return new CreatedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drive property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drives property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the externalColumns property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public ExternalColumnsRequestBuilder externalColumns() {
        return new ExternalColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getActivitiesByInterval method.
     */
    @jakarta.annotation.Nonnull
    public GetActivitiesByIntervalRequestBuilder getActivitiesByInterval() {
        return new GetActivitiesByIntervalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the items property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public ItemsRequestBuilder items() {
        return new ItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lastModifiedByUser property of the microsoft.graph.baseItem entity.
     */
    @jakarta.annotation.Nonnull
    public LastModifiedByUserRequestBuilder lastModifiedByUser() {
        return new LastModifiedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lists property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public ListsRequestBuilder lists() {
        return new ListsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onenote property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissions property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public PermissionsRequestBuilder permissions() {
        return new PermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sites property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public SitesRequestBuilder sites() {
        return new SitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the termStore property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public TermStoreRequestBuilder termStore() {
        return new TermStoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the termStores property of the microsoft.graph.site entity.
     */
    @jakarta.annotation.Nonnull
    public TermStoresRequestBuilder termStores() {
        return new TermStoresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new GetByPathWithPathRequestBuilder and sets the default values.
     * @param path Usage: path='{path}'
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetByPathWithPathRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String path) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/getByPath(path='{path}')", pathParameters);
        this.pathParameters.put("path", path);
    }
    /**
     * Instantiates a new GetByPathWithPathRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetByPathWithPathRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/getByPath(path='{path}')", rawUrl);
    }
    /**
     * Invoke function getByPath
     * @return a Site
     */
    @jakarta.annotation.Nullable
    public Site get() {
        return get(null);
    }
    /**
     * Invoke function getByPath
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Site
     */
    @jakarta.annotation.Nullable
    public Site get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Site::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getActivitiesByInterval method.
     * @param endDateTime Usage: endDateTime='{endDateTime}'
     * @param interval Usage: interval='{interval}'
     * @param startDateTime Usage: startDateTime='{startDateTime}'
     * @return a GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder getActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithInterval(@jakarta.annotation.Nonnull final String endDateTime, @jakarta.annotation.Nonnull final String interval, @jakarta.annotation.Nonnull final String startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(interval);
        Objects.requireNonNull(startDateTime);
        return new GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder(pathParameters, requestAdapter, endDateTime, interval, startDateTime);
    }
    /**
     * Provides operations to call the getApplicableContentTypesForList method.
     * @param listId Usage: listId='{listId}'
     * @return a GetApplicableContentTypesForListWithListIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetApplicableContentTypesForListWithListIdRequestBuilder getApplicableContentTypesForListWithListId(@jakarta.annotation.Nonnull final String listId) {
        Objects.requireNonNull(listId);
        return new GetApplicableContentTypesForListWithListIdRequestBuilder(pathParameters, requestAdapter, listId);
    }
    /**
     * Provides operations to call the getByPath method.
     * @param path1 Usage: path='{path1}'
     * @return a GetByPathWithPath1RequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetByPathWithPath1RequestBuilder getByPathWithPath1(@jakarta.annotation.Nonnull final String path1) {
        Objects.requireNonNull(path1);
        return new GetByPathWithPath1RequestBuilder(pathParameters, requestAdapter, path1);
    }
    /**
     * Invoke function getByPath
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function getByPath
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a GetByPathWithPathRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetByPathWithPathRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetByPathWithPathRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
