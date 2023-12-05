package com.microsoft.graph.users.item.todo.lists.item.tasks.item.attachments;

import com.microsoft.graph.models.AttachmentBase;
import com.microsoft.graph.models.AttachmentBaseCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.users.item.todo.lists.item.tasks.item.attachments.count.CountRequestBuilder;
import com.microsoft.graph.users.item.todo.lists.item.tasks.item.attachments.createuploadsession.CreateUploadSessionRequestBuilder;
import com.microsoft.graph.users.item.todo.lists.item.tasks.item.attachments.item.AttachmentBaseItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the attachments property of the microsoft.graph.todoTask entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttachmentsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createUploadSession method.
     */
    @jakarta.annotation.Nonnull
    public CreateUploadSessionRequestBuilder createUploadSession() {
        return new CreateUploadSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the attachments property of the microsoft.graph.todoTask entity.
     * @param attachmentBaseId The unique identifier of attachmentBase
     * @return a AttachmentBaseItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AttachmentBaseItemRequestBuilder byAttachmentBaseId(@jakarta.annotation.Nonnull final String attachmentBaseId) {
        Objects.requireNonNull(attachmentBaseId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("attachmentBase%2Did", attachmentBaseId);
        return new AttachmentBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AttachmentsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttachmentsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/todo/lists/{todoTaskList%2Did}/tasks/{todoTask%2Did}/attachments{?%24top,%24skip,%24filter,%24count,%24orderby,%24select}", pathParameters);
    }
    /**
     * Instantiates a new AttachmentsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AttachmentsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/todo/lists/{todoTaskList%2Did}/tasks/{todoTask%2Did}/attachments{?%24top,%24skip,%24filter,%24count,%24orderby,%24select}", rawUrl);
    }
    /**
     * Get a list of the taskFileAttachment objects and their properties. The contentBytes property will not be returned in the response. Use the Get attachment API to view the contentBytes.
     * @return a AttachmentBaseCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/todotask-list-attachments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AttachmentBaseCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a list of the taskFileAttachment objects and their properties. The contentBytes property will not be returned in the response. Use the Get attachment API to view the contentBytes.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AttachmentBaseCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/todotask-list-attachments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AttachmentBaseCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AttachmentBaseCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Add a new taskFileAttachment object to a todoTask. This operation limits the size of the attachment you can add to under 3 MB. If the size of the file attachments is more than 3 MB, create an upload session to upload the attachments.
     * @param body The request body
     * @return a AttachmentBase
     * @see <a href="https://learn.microsoft.com/graph/api/todotask-post-attachments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AttachmentBase post(@jakarta.annotation.Nonnull final AttachmentBase body) {
        return post(body, null);
    }
    /**
     * Add a new taskFileAttachment object to a todoTask. This operation limits the size of the attachment you can add to under 3 MB. If the size of the file attachments is more than 3 MB, create an upload session to upload the attachments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AttachmentBase
     * @see <a href="https://learn.microsoft.com/graph/api/todotask-post-attachments?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public AttachmentBase post(@jakarta.annotation.Nonnull final AttachmentBase body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AttachmentBase::createFromDiscriminatorValue);
    }
    /**
     * Get a list of the taskFileAttachment objects and their properties. The contentBytes property will not be returned in the response. Use the Get attachment API to view the contentBytes.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of the taskFileAttachment objects and their properties. The contentBytes property will not be returned in the response. Use the Get attachment API to view the contentBytes.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Add a new taskFileAttachment object to a todoTask. This operation limits the size of the attachment you can add to under 3 MB. If the size of the file attachments is more than 3 MB, create an upload session to upload the attachments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AttachmentBase body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add a new taskFileAttachment object to a todoTask. This operation limits the size of the attachment you can add to under 3 MB. If the size of the file attachments is more than 3 MB, create an upload session to upload the attachments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AttachmentBase body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a AttachmentsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AttachmentsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AttachmentsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of the taskFileAttachment objects and their properties. The contentBytes property will not be returned in the response. Use the Get attachment API to view the contentBytes.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
