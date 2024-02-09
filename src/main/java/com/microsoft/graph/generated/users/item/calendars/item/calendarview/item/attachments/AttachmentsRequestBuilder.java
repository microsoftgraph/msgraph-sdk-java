package com.microsoft.graph.users.item.calendars.item.calendarview.item.attachments;

import com.microsoft.graph.models.Attachment;
import com.microsoft.graph.models.AttachmentCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.calendars.item.calendarview.item.attachments.count.CountRequestBuilder;
import com.microsoft.graph.users.item.calendars.item.calendarview.item.attachments.createuploadsession.CreateUploadSessionRequestBuilder;
import com.microsoft.graph.users.item.calendars.item.calendarview.item.attachments.item.AttachmentItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the attachments property of the microsoft.graph.event entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttachmentsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createUploadSession method.
     * @return a {@link CreateUploadSessionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateUploadSessionRequestBuilder createUploadSession() {
        return new CreateUploadSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the attachments property of the microsoft.graph.event entity.
     * @param attachmentId The unique identifier of attachment
     * @return a {@link AttachmentItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AttachmentItemRequestBuilder byAttachmentId(@jakarta.annotation.Nonnull final String attachmentId) {
        Objects.requireNonNull(attachmentId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("attachment%2Did", attachmentId);
        return new AttachmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AttachmentsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttachmentsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/calendars/{calendar%2Did}/calendarView/{event%2Did}/attachments{?%24count,%24expand,%24filter,%24orderby,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link AttachmentsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttachmentsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/calendars/{calendar%2Did}/calendarView/{event%2Did}/attachments{?%24count,%24expand,%24filter,%24orderby,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Retrieve a list of attachment objects attached to an event.
     * @return a {@link AttachmentCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/event-list-attachments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AttachmentCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve a list of attachment objects attached to an event.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AttachmentCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/event-list-attachments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AttachmentCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AttachmentCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Use this API to create a new Attachment. An attachment can be one of the following types: All these types of attachment resources are derived from the attachmentresource.
     * @param body The request body
     * @return a {@link Attachment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/eventmessage-post-attachments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Attachment post(@jakarta.annotation.Nonnull final Attachment body) {
        return post(body, null);
    }
    /**
     * Use this API to create a new Attachment. An attachment can be one of the following types: All these types of attachment resources are derived from the attachmentresource.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Attachment}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/eventmessage-post-attachments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Attachment post(@jakarta.annotation.Nonnull final Attachment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Attachment::createFromDiscriminatorValue);
    }
    /**
     * Retrieve a list of attachment objects attached to an event.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a list of attachment objects attached to an event.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Use this API to create a new Attachment. An attachment can be one of the following types: All these types of attachment resources are derived from the attachmentresource.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Attachment body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Use this API to create a new Attachment. An attachment can be one of the following types: All these types of attachment resources are derived from the attachmentresource.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Attachment body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, "{+baseurl}/users/{user%2Did}/calendars/{calendar%2Did}/calendarView/{event%2Did}/attachments", pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AttachmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AttachmentsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AttachmentsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve a list of attachment objects attached to an event.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
