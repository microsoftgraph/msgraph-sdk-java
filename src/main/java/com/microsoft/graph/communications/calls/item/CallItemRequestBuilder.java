package com.microsoft.graph.communications.calls.item;

import com.microsoft.graph.communications.calls.item.addlargegalleryview.AddLargeGalleryViewRequestBuilder;
import com.microsoft.graph.communications.calls.item.answer.AnswerRequestBuilder;
import com.microsoft.graph.communications.calls.item.audioroutinggroups.AudioRoutingGroupsRequestBuilder;
import com.microsoft.graph.communications.calls.item.audioroutinggroups.item.AudioRoutingGroupItemRequestBuilder;
import com.microsoft.graph.communications.calls.item.cancelmediaprocessing.CancelMediaProcessingRequestBuilder;
import com.microsoft.graph.communications.calls.item.changescreensharingrole.ChangeScreenSharingRoleRequestBuilder;
import com.microsoft.graph.communications.calls.item.contentsharingsessions.ContentSharingSessionsRequestBuilder;
import com.microsoft.graph.communications.calls.item.contentsharingsessions.item.ContentSharingSessionItemRequestBuilder;
import com.microsoft.graph.communications.calls.item.keepalive.KeepAliveRequestBuilder;
import com.microsoft.graph.communications.calls.item.mute.MuteRequestBuilder;
import com.microsoft.graph.communications.calls.item.operations.item.CommsOperationItemRequestBuilder;
import com.microsoft.graph.communications.calls.item.operations.OperationsRequestBuilder;
import com.microsoft.graph.communications.calls.item.participants.item.ParticipantItemRequestBuilder;
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
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the calls property of the microsoft.graph.cloudCommunications entity. */
public class CallItemRequestBuilder {
    /** Provides operations to call the addLargeGalleryView method. */
    @javax.annotation.Nonnull
    public AddLargeGalleryViewRequestBuilder addLargeGalleryView() {
        return new AddLargeGalleryViewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the answer method. */
    @javax.annotation.Nonnull
    public AnswerRequestBuilder answer() {
        return new AnswerRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the audioRoutingGroups property of the microsoft.graph.call entity. */
    @javax.annotation.Nonnull
    public AudioRoutingGroupsRequestBuilder audioRoutingGroups() {
        return new AudioRoutingGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the cancelMediaProcessing method. */
    @javax.annotation.Nonnull
    public CancelMediaProcessingRequestBuilder cancelMediaProcessing() {
        return new CancelMediaProcessingRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the changeScreenSharingRole method. */
    @javax.annotation.Nonnull
    public ChangeScreenSharingRoleRequestBuilder changeScreenSharingRole() {
        return new ChangeScreenSharingRoleRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the contentSharingSessions property of the microsoft.graph.call entity. */
    @javax.annotation.Nonnull
    public ContentSharingSessionsRequestBuilder contentSharingSessions() {
        return new ContentSharingSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the keepAlive method. */
    @javax.annotation.Nonnull
    public KeepAliveRequestBuilder keepAlive() {
        return new KeepAliveRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the mute method. */
    @javax.annotation.Nonnull
    public MuteRequestBuilder mute() {
        return new MuteRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the operations property of the microsoft.graph.call entity. */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the participants property of the microsoft.graph.call entity. */
    @javax.annotation.Nonnull
    public ParticipantsRequestBuilder participants() {
        return new ParticipantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to call the playPrompt method. */
    @javax.annotation.Nonnull
    public PlayPromptRequestBuilder playPrompt() {
        return new PlayPromptRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the recordResponse method. */
    @javax.annotation.Nonnull
    public RecordResponseRequestBuilder recordResponse() {
        return new RecordResponseRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the redirect method. */
    @javax.annotation.Nonnull
    public RedirectRequestBuilder redirect() {
        return new RedirectRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the reject method. */
    @javax.annotation.Nonnull
    public RejectRequestBuilder reject() {
        return new RejectRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to call the subscribeToTone method. */
    @javax.annotation.Nonnull
    public SubscribeToToneRequestBuilder subscribeToTone() {
        return new SubscribeToToneRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the transfer method. */
    @javax.annotation.Nonnull
    public TransferRequestBuilder transfer() {
        return new TransferRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the unmute method. */
    @javax.annotation.Nonnull
    public UnmuteRequestBuilder unmute() {
        return new UnmuteRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the updateRecordingStatus method. */
    @javax.annotation.Nonnull
    public UpdateRecordingStatusRequestBuilder updateRecordingStatus() {
        return new UpdateRecordingStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Provides operations to manage the audioRoutingGroups property of the microsoft.graph.call entity.
     * @param id Unique identifier of the item
     * @return a AudioRoutingGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AudioRoutingGroupItemRequestBuilder audioRoutingGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("audioRoutingGroup%2Did", id);
        return new AudioRoutingGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CallItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CallItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/communications/calls/{call%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new CallItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CallItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/communications/calls/{call%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Provides operations to manage the contentSharingSessions property of the microsoft.graph.call entity.
     * @param id Unique identifier of the item
     * @return a ContentSharingSessionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ContentSharingSessionItemRequestBuilder contentSharingSessions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contentSharingSession%2Did", id);
        return new ContentSharingSessionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property calls for communications
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property calls for communications
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<CallItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final CallItemRequestBuilderDeleteRequestConfiguration requestConfig = new CallItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get calls from communications
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get calls from communications
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<CallItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final CallItemRequestBuilderGetRequestConfiguration requestConfig = new CallItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property calls in communications
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Call body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property calls in communications
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Call body, @javax.annotation.Nullable final java.util.function.Consumer<CallItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final CallItemRequestBuilderPatchRequestConfiguration requestConfig = new CallItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property calls for communications
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property calls for communications
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<CallItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get calls from communications
     * @return a CompletableFuture of call
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Call> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Call::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Call>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get calls from communications
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of call
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Call> get(@javax.annotation.Nullable final java.util.function.Consumer<CallItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Call::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Call>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.call entity.
     * @param id Unique identifier of the item
     * @return a CommsOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CommsOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("commsOperation%2Did", id);
        return new CommsOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the participants property of the microsoft.graph.call entity.
     * @param id Unique identifier of the item
     * @return a ParticipantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ParticipantItemRequestBuilder participants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("participant%2Did", id);
        return new ParticipantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property calls in communications
     * @param body 
     * @return a CompletableFuture of call
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Call> patch(@javax.annotation.Nonnull final Call body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Call::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Call>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property calls in communications
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of call
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Call> patch(@javax.annotation.Nonnull final Call body, @javax.annotation.Nullable final java.util.function.Consumer<CallItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Call::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Call>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class CallItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new CallItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public CallItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get calls from communications */
    public class CallItemRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class CallItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public CallItemRequestBuilderGetQueryParameters queryParameters = new CallItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new CallItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public CallItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class CallItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new CallItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public CallItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
