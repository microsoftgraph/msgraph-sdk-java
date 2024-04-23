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
import com.microsoft.graph.communications.calls.item.senddtmftones.SendDtmfTonesRequestBuilder;
import com.microsoft.graph.communications.calls.item.subscribetotone.SubscribeToToneRequestBuilder;
import com.microsoft.graph.communications.calls.item.transfer.TransferRequestBuilder;
import com.microsoft.graph.communications.calls.item.unmute.UnmuteRequestBuilder;
import com.microsoft.graph.communications.calls.item.updaterecordingstatus.UpdateRecordingStatusRequestBuilder;
import com.microsoft.graph.models.Call;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the calls property of the microsoft.graph.cloudCommunications entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the addLargeGalleryView method.
     * @return a {@link AddLargeGalleryViewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddLargeGalleryViewRequestBuilder addLargeGalleryView() {
        return new AddLargeGalleryViewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the answer method.
     * @return a {@link AnswerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AnswerRequestBuilder answer() {
        return new AnswerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the audioRoutingGroups property of the microsoft.graph.call entity.
     * @return a {@link AudioRoutingGroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AudioRoutingGroupsRequestBuilder audioRoutingGroups() {
        return new AudioRoutingGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the cancelMediaProcessing method.
     * @return a {@link CancelMediaProcessingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CancelMediaProcessingRequestBuilder cancelMediaProcessing() {
        return new CancelMediaProcessingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the changeScreenSharingRole method.
     * @return a {@link ChangeScreenSharingRoleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChangeScreenSharingRoleRequestBuilder changeScreenSharingRole() {
        return new ChangeScreenSharingRoleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the contentSharingSessions property of the microsoft.graph.call entity.
     * @return a {@link ContentSharingSessionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContentSharingSessionsRequestBuilder contentSharingSessions() {
        return new ContentSharingSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the keepAlive method.
     * @return a {@link KeepAliveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public KeepAliveRequestBuilder keepAlive() {
        return new KeepAliveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the mute method.
     * @return a {@link MuteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MuteRequestBuilder mute() {
        return new MuteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.call entity.
     * @return a {@link OperationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the participants property of the microsoft.graph.call entity.
     * @return a {@link ParticipantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ParticipantsRequestBuilder participants() {
        return new ParticipantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the playPrompt method.
     * @return a {@link PlayPromptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlayPromptRequestBuilder playPrompt() {
        return new PlayPromptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the recordResponse method.
     * @return a {@link RecordResponseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RecordResponseRequestBuilder recordResponse() {
        return new RecordResponseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the redirect method.
     * @return a {@link RedirectRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RedirectRequestBuilder redirect() {
        return new RedirectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reject method.
     * @return a {@link RejectRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RejectRequestBuilder reject() {
        return new RejectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendDtmfTones method.
     * @return a {@link SendDtmfTonesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendDtmfTonesRequestBuilder sendDtmfTones() {
        return new SendDtmfTonesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the subscribeToTone method.
     * @return a {@link SubscribeToToneRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscribeToToneRequestBuilder subscribeToTone() {
        return new SubscribeToToneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the transfer method.
     * @return a {@link TransferRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransferRequestBuilder transfer() {
        return new TransferRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unmute method.
     * @return a {@link UnmuteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnmuteRequestBuilder unmute() {
        return new UnmuteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateRecordingStatus method.
     * @return a {@link UpdateRecordingStatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateRecordingStatusRequestBuilder updateRecordingStatus() {
        return new UpdateRecordingStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CallItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CallItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/calls/{call%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link CallItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CallItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/calls/{call%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property calls for communications
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property calls for communications
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get calls from communications
     * @return a {@link Call}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Call get() {
        return get(null);
    }
    /**
     * Get calls from communications
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Call}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Call get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Call::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property calls in communications
     * @param body The request body
     * @return a {@link Call}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Call patch(@jakarta.annotation.Nonnull final Call body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property calls in communications
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Call}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Call patch(@jakarta.annotation.Nonnull final Call body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Call::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property calls for communications
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property calls for communications
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get calls from communications
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get calls from communications
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
     * Update the navigation property calls in communications
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Call body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property calls in communications
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Call body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CallItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CallItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CallItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get calls from communications
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
