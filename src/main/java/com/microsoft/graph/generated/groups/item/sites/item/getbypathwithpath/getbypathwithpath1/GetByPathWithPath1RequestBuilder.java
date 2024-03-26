package com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1;

import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.analytics.AnalyticsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.columns.ColumnsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.contenttypes.ContentTypesRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.createdbyuser.CreatedByUserRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.drive.DriveRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.drives.DrivesRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.externalcolumns.ExternalColumnsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.items.ItemsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.lastmodifiedbyuser.LastModifiedByUserRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.lists.ListsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.onenote.OnenoteRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.operations.OperationsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.pages.PagesRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.permissions.PermissionsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.sites.SitesRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.termstore.TermStoreRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.getbypathwithpath.getbypathwithpath1.termstores.TermStoresRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Site;
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
public class GetByPathWithPath1RequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the analytics property of the microsoft.graph.site entity.
     * @return a {@link AnalyticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AnalyticsRequestBuilder analytics() {
        return new AnalyticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the columns property of the microsoft.graph.site entity.
     * @return a {@link ColumnsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ColumnsRequestBuilder columns() {
        return new ColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the contentTypes property of the microsoft.graph.site entity.
     * @return a {@link ContentTypesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContentTypesRequestBuilder contentTypes() {
        return new ContentTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the createdByUser property of the microsoft.graph.baseItem entity.
     * @return a {@link CreatedByUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreatedByUserRequestBuilder createdByUser() {
        return new CreatedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drive property of the microsoft.graph.site entity.
     * @return a {@link DriveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drives property of the microsoft.graph.site entity.
     * @return a {@link DrivesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the externalColumns property of the microsoft.graph.site entity.
     * @return a {@link ExternalColumnsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExternalColumnsRequestBuilder externalColumns() {
        return new ExternalColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the items property of the microsoft.graph.site entity.
     * @return a {@link ItemsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ItemsRequestBuilder items() {
        return new ItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lastModifiedByUser property of the microsoft.graph.baseItem entity.
     * @return a {@link LastModifiedByUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LastModifiedByUserRequestBuilder lastModifiedByUser() {
        return new LastModifiedByUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the lists property of the microsoft.graph.site entity.
     * @return a {@link ListsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ListsRequestBuilder lists() {
        return new ListsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onenote property of the microsoft.graph.site entity.
     * @return a {@link OnenoteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.site entity.
     * @return a {@link OperationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the pages property of the microsoft.graph.site entity.
     * @return a {@link PagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PagesRequestBuilder pages() {
        return new PagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissions property of the microsoft.graph.site entity.
     * @return a {@link PermissionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionsRequestBuilder permissions() {
        return new PermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sites property of the microsoft.graph.site entity.
     * @return a {@link SitesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SitesRequestBuilder sites() {
        return new SitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the termStore property of the microsoft.graph.site entity.
     * @return a {@link TermStoreRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TermStoreRequestBuilder termStore() {
        return new TermStoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the termStores property of the microsoft.graph.site entity.
     * @return a {@link TermStoresRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TermStoresRequestBuilder termStores() {
        return new TermStoresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link GetByPathWithPath1RequestBuilder} and sets the default values.
     * @param path1 Usage: path='{path1}'
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetByPathWithPath1RequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String path1) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/getByPath(path='{path}')/getByPath(path='{path1}')", pathParameters);
        this.pathParameters.put("path1", path1);
    }
    /**
     * Instantiates a new {@link GetByPathWithPath1RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetByPathWithPath1RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/getByPath(path='{path}')/getByPath(path='{path1}')", rawUrl);
    }
    /**
     * Invoke function getByPath
     * @return a {@link Site}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Site get() {
        return get(null);
    }
    /**
     * Invoke function getByPath
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Site}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Site get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Site::createFromDiscriminatorValue);
    }
    /**
     * Invoke function getByPath
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function getByPath
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
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
     * @return a {@link GetByPathWithPath1RequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetByPathWithPath1RequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetByPathWithPath1RequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
