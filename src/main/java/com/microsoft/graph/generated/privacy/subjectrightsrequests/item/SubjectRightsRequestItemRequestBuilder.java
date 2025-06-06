package com.microsoft.graph.privacy.subjectrightsrequests.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SubjectRightsRequest;
import com.microsoft.graph.privacy.subjectrightsrequests.item.approvers.ApproversRequestBuilder;
import com.microsoft.graph.privacy.subjectrightsrequests.item.approverswithuserprincipalname.ApproversWithUserPrincipalNameRequestBuilder;
import com.microsoft.graph.privacy.subjectrightsrequests.item.collaborators.CollaboratorsRequestBuilder;
import com.microsoft.graph.privacy.subjectrightsrequests.item.collaboratorswithuserprincipalname.CollaboratorsWithUserPrincipalNameRequestBuilder;
import com.microsoft.graph.privacy.subjectrightsrequests.item.getfinalattachment.GetFinalAttachmentRequestBuilder;
import com.microsoft.graph.privacy.subjectrightsrequests.item.getfinalreport.GetFinalReportRequestBuilder;
import com.microsoft.graph.privacy.subjectrightsrequests.item.notes.NotesRequestBuilder;
import com.microsoft.graph.privacy.subjectrightsrequests.item.team.TeamRequestBuilder;
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
 * Provides operations to manage the subjectRightsRequests property of the microsoft.graph.privacy entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubjectRightsRequestItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the approvers property of the microsoft.graph.subjectRightsRequest entity.
     * @return a {@link ApproversRequestBuilder}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ApproversRequestBuilder approvers() {
        return new ApproversRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collaborators property of the microsoft.graph.subjectRightsRequest entity.
     * @return a {@link CollaboratorsRequestBuilder}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CollaboratorsRequestBuilder collaborators() {
        return new CollaboratorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getFinalAttachment method.
     * @return a {@link GetFinalAttachmentRequestBuilder}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public GetFinalAttachmentRequestBuilder getFinalAttachment() {
        return new GetFinalAttachmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getFinalReport method.
     * @return a {@link GetFinalReportRequestBuilder}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public GetFinalReportRequestBuilder getFinalReport() {
        return new GetFinalReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the notes property of the microsoft.graph.subjectRightsRequest entity.
     * @return a {@link NotesRequestBuilder}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public NotesRequestBuilder notes() {
        return new NotesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the team property of the microsoft.graph.subjectRightsRequest entity.
     * @return a {@link TeamRequestBuilder}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public TeamRequestBuilder team() {
        return new TeamRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the approvers property of the microsoft.graph.subjectRightsRequest entity.
     * @param userPrincipalName Alternate key of user
     * @return a {@link ApproversWithUserPrincipalNameRequestBuilder}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public ApproversWithUserPrincipalNameRequestBuilder approversWithUserPrincipalName(@jakarta.annotation.Nonnull final String userPrincipalName) {
        Objects.requireNonNull(userPrincipalName);
        return new ApproversWithUserPrincipalNameRequestBuilder(pathParameters, requestAdapter, userPrincipalName);
    }
    /**
     * Provides operations to manage the collaborators property of the microsoft.graph.subjectRightsRequest entity.
     * @param userPrincipalName Alternate key of user
     * @return a {@link CollaboratorsWithUserPrincipalNameRequestBuilder}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CollaboratorsWithUserPrincipalNameRequestBuilder collaboratorsWithUserPrincipalName(@jakarta.annotation.Nonnull final String userPrincipalName) {
        Objects.requireNonNull(userPrincipalName);
        return new CollaboratorsWithUserPrincipalNameRequestBuilder(pathParameters, requestAdapter, userPrincipalName);
    }
    /**
     * Instantiates a new {@link SubjectRightsRequestItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubjectRightsRequestItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privacy/subjectRightsRequests/{subjectRightsRequest%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link SubjectRightsRequestItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SubjectRightsRequestItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privacy/subjectRightsRequests/{subjectRightsRequest%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property subjectRightsRequests for privacy
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property subjectRightsRequests for privacy
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read the properties and relationships of a subjectRightsRequest object.
     * @return a {@link SubjectRightsRequest}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     * @see <a href="https://learn.microsoft.com/graph/api/subjectrightsrequest-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public SubjectRightsRequest get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a subjectRightsRequest object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SubjectRightsRequest}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     * @see <a href="https://learn.microsoft.com/graph/api/subjectrightsrequest-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public SubjectRightsRequest get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SubjectRightsRequest::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a subjectRightsRequest object.
     * @param body The request body
     * @return a {@link SubjectRightsRequest}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     * @see <a href="https://learn.microsoft.com/graph/api/subjectrightsrequest-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public SubjectRightsRequest patch(@jakarta.annotation.Nonnull final SubjectRightsRequest body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a subjectRightsRequest object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SubjectRightsRequest}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     * @see <a href="https://learn.microsoft.com/graph/api/subjectrightsrequest-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public SubjectRightsRequest patch(@jakarta.annotation.Nonnull final SubjectRightsRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SubjectRightsRequest::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property subjectRightsRequests for privacy
     * @return a {@link RequestInformation}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property subjectRightsRequests for privacy
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Read the properties and relationships of a subjectRightsRequest object.
     * @return a {@link RequestInformation}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a subjectRightsRequest object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the properties of a subjectRightsRequest object.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SubjectRightsRequest body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a subjectRightsRequest object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SubjectRightsRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SubjectRightsRequestItemRequestBuilder}
     * @deprecated
     * The subject rights request API under Privacy is deprecated and will stop working on  March 22, 2025. Please use the new API under Security. as of 2022-02/PrivacyDeprecate on 2022-03-22 and will be removed 2025-03-20
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public SubjectRightsRequestItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SubjectRightsRequestItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of a subjectRightsRequest object.
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
