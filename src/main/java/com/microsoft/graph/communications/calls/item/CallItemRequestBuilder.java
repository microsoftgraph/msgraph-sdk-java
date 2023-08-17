package com.microsoft.graph.communications.calls.item;

import com.microsoft.graph.communications.calls.item.addlargegalleryview.AddLargeGalleryViewRequestBuilder;
import com.microsoft.graph.communications.calls.item.answer.AnswerRequestBuilder;
import com.microsoft.graph.communications.calls.item.audioroutinggroups.AudioRoutingGroupsRequestBuilder;
import com.microsoft.graph.communications.calls.item.cancelmediaprocessing.CancelMediaProcessingRequestBuilder;
import com.microsoft.graph.communications.calls.item.changescreensharingrole.ChangeScreenSharingRoleRequestBuilder;
import com.microsoft.graph.communications.calls.item.contentsharingsessions.ContentSharingSessionsRequestBuilder;
import com.microsoft.graph.communications.calls.item.keepalive.KeepAliveRequestBuilder;
import com.microsoft.graph.communications.calls.item.mute.MuteRequestBuilder;
import com.microsoft.graph.communications.calls.item.operations.OperationsRequestBuilder;
import com.microsoft.graph.communications.calls.item.participants.ParticipantsRequestBuilder;
import com.microsoft.graph.communications.calls.item.playprompt.PlayPromptRequestBuilder;
import com.microsoft.graph.communications.calls.item.recordresponse.RecordResponseRequestBuilder;
import com.microsoft.graph.communications.calls.item.redirect.RedirectRequestBuilder;
import com.microsoft.graph.communications.calls.item.reject.RejectRequestBuilder;
import com.microsoft.graph.communications.calls.item.subscribetotone.SubscribeToToneRequestBuilder;
import com.microsoft.graph.communications.calls.item.transfer.TransferRequestBuilder;
import com.microsoft.graph.communications.calls.item.unmute.UnmuteRequestBuilder;
import com.microsoft.graph.communications.calls.item.updaterecordingstatus.UpdateRecordingStatusRequestBuilder;
import com.microsoft.graph.models.Call;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the calls property of the microsoft.graph.cloudCommunications entity.
 */
public class CallItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the addLargeGalleryView method.
     */
    @jakarta.annotation.Nonnull
    public AddLargeGalleryViewRequestBuilder addLargeGalleryView() {
        return new AddLargeGalleryViewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the answer method.
     */
    @jakarta.annotation.Nonnull
    public AnswerRequestBuilder answer() {
        return new AnswerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the audioRoutingGroups property of the microsoft.graph.call entity.
     */
    @jakarta.annotation.Nonnull
    public AudioRoutingGroupsRequestBuilder audioRoutingGroups() {
        return new AudioRoutingGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cancelMediaProcessing method.
     */
    @jakarta.annotation.Nonnull
    public CancelMediaProcessingRequestBuilder cancelMediaProcessing() {
        return new CancelMediaProcessingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the changeScreenSharingRole method.
     */
    @jakarta.annotation.Nonnull
    public ChangeScreenSharingRoleRequestBuilder changeScreenSharingRole() {
        return new ChangeScreenSharingRoleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the contentSharingSessions property of the microsoft.graph.call entity.
     */
    @jakarta.annotation.Nonnull
    public ContentSharingSessionsRequestBuilder contentSharingSessions() {
        return new ContentSharingSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the keepAlive method.
     */
    @jakarta.annotation.Nonnull
    public KeepAliveRequestBuilder keepAlive() {
        return new KeepAliveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the mute method.
     */
    @jakarta.annotation.Nonnull
    public MuteRequestBuilder mute() {
        return new MuteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.call entity.
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the participants property of the microsoft.graph.call entity.
     */
    @jakarta.annotation.Nonnull
    public ParticipantsRequestBuilder participants() {
        return new ParticipantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the playPrompt method.
     */
    @jakarta.annotation.Nonnull
    public PlayPromptRequestBuilder playPrompt() {
        return new PlayPromptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the recordResponse method.
     */
    @jakarta.annotation.Nonnull
    public RecordResponseRequestBuilder recordResponse() {
        return new RecordResponseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the redirect method.
     */
    @jakarta.annotation.Nonnull
    public RedirectRequestBuilder redirect() {
        return new RedirectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reject method.
     */
    @jakarta.annotation.Nonnull
    public RejectRequestBuilder reject() {
        return new RejectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the subscribeToTone method.
     */
    @jakarta.annotation.Nonnull
    public SubscribeToToneRequestBuilder subscribeToTone() {
        return new SubscribeToToneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the transfer method.
     */
    @jakarta.annotation.Nonnull
    public TransferRequestBuilder transfer() {
        return new TransferRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unmute method.
     */
    @jakarta.annotation.Nonnull
    public UnmuteRequestBuilder unmute() {
        return new UnmuteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateRecordingStatus method.
     */
    @jakarta.annotation.Nonnull
    public UpdateRecordingStatusRequestBuilder updateRecordingStatus() {
        return new UpdateRecordingStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new CallItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CallItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/calls/{call%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CallItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CallItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/calls/{call%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete or hang up an active call. For group calls, this will only delete your call leg and the underlying group call will still continue.
     * @see <a href="https://learn.microsoft.com/graph/api/call-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete or hang up an active call. For group calls, this will only delete your call leg and the underlying group call will still continue.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/call-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Retrieve the properties and relationships of a call object.
     * @return a CompletableFuture of call
     * @see <a href="https://learn.microsoft.com/graph/api/call-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Call> get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of a call object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of call
     * @see <a href="https://learn.microsoft.com/graph/api/call-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Call> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Call::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property calls in communications
     * @param body The request body
     * @return a CompletableFuture of call
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Call> patch(@jakarta.annotation.Nonnull final Call body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property calls in communications
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of call
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Call> patch(@jakarta.annotation.Nonnull final Call body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Call::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete or hang up an active call. For group calls, this will only delete your call leg and the underlying group call will still continue.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete or hang up an active call. For group calls, this will only delete your call leg and the underlying group call will still continue.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Retrieve the properties and relationships of a call object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a call object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property calls in communications
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Call body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property calls in communications
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Call body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of a call object.
     */
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
