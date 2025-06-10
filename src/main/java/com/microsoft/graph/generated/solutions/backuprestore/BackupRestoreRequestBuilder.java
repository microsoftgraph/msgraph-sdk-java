package com.microsoft.graph.solutions.backuprestore;

import com.microsoft.graph.models.BackupRestoreRoot;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.solutions.backuprestore.driveinclusionrules.DriveInclusionRulesRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.driveprotectionunits.DriveProtectionUnitsRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.driveprotectionunitsbulkadditionjobs.DriveProtectionUnitsBulkAdditionJobsRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.enable.EnableRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.exchangeprotectionpolicies.ExchangeProtectionPoliciesRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.exchangerestoresessions.ExchangeRestoreSessionsRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.mailboxinclusionrules.MailboxInclusionRulesRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.mailboxprotectionunits.MailboxProtectionUnitsRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.mailboxprotectionunitsbulkadditionjobs.MailboxProtectionUnitsBulkAdditionJobsRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.onedriveforbusinessprotectionpolicies.OneDriveForBusinessProtectionPoliciesRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.onedriveforbusinessrestoresessions.OneDriveForBusinessRestoreSessionsRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.protectionpolicies.ProtectionPoliciesRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.protectionunits.ProtectionUnitsRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.restorepoints.RestorePointsRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.restoresessions.RestoreSessionsRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.serviceapps.ServiceAppsRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.sharepointprotectionpolicies.SharePointProtectionPoliciesRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.sharepointrestoresessions.SharePointRestoreSessionsRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.siteinclusionrules.SiteInclusionRulesRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.siteprotectionunits.SiteProtectionUnitsRequestBuilder;
import com.microsoft.graph.solutions.backuprestore.siteprotectionunitsbulkadditionjobs.SiteProtectionUnitsBulkAdditionJobsRequestBuilder;
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
 * Provides operations to manage the backupRestore property of the microsoft.graph.solutionsRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BackupRestoreRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the driveInclusionRules property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link DriveInclusionRulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DriveInclusionRulesRequestBuilder driveInclusionRules() {
        return new DriveInclusionRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the driveProtectionUnits property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link DriveProtectionUnitsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DriveProtectionUnitsRequestBuilder driveProtectionUnits() {
        return new DriveProtectionUnitsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the driveProtectionUnitsBulkAdditionJobs property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link DriveProtectionUnitsBulkAdditionJobsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DriveProtectionUnitsBulkAdditionJobsRequestBuilder driveProtectionUnitsBulkAdditionJobs() {
        return new DriveProtectionUnitsBulkAdditionJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the enable method.
     * @return a {@link EnableRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EnableRequestBuilder enable() {
        return new EnableRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the exchangeProtectionPolicies property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link ExchangeProtectionPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExchangeProtectionPoliciesRequestBuilder exchangeProtectionPolicies() {
        return new ExchangeProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the exchangeRestoreSessions property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link ExchangeRestoreSessionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExchangeRestoreSessionsRequestBuilder exchangeRestoreSessions() {
        return new ExchangeRestoreSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mailboxInclusionRules property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link MailboxInclusionRulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MailboxInclusionRulesRequestBuilder mailboxInclusionRules() {
        return new MailboxInclusionRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mailboxProtectionUnits property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link MailboxProtectionUnitsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MailboxProtectionUnitsRequestBuilder mailboxProtectionUnits() {
        return new MailboxProtectionUnitsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mailboxProtectionUnitsBulkAdditionJobs property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link MailboxProtectionUnitsBulkAdditionJobsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MailboxProtectionUnitsBulkAdditionJobsRequestBuilder mailboxProtectionUnitsBulkAdditionJobs() {
        return new MailboxProtectionUnitsBulkAdditionJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the oneDriveForBusinessProtectionPolicies property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link OneDriveForBusinessProtectionPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OneDriveForBusinessProtectionPoliciesRequestBuilder oneDriveForBusinessProtectionPolicies() {
        return new OneDriveForBusinessProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the oneDriveForBusinessRestoreSessions property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link OneDriveForBusinessRestoreSessionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OneDriveForBusinessRestoreSessionsRequestBuilder oneDriveForBusinessRestoreSessions() {
        return new OneDriveForBusinessRestoreSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the protectionPolicies property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link ProtectionPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProtectionPoliciesRequestBuilder protectionPolicies() {
        return new ProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the protectionUnits property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link ProtectionUnitsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProtectionUnitsRequestBuilder protectionUnits() {
        return new ProtectionUnitsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the restorePoints property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link RestorePointsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestorePointsRequestBuilder restorePoints() {
        return new RestorePointsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the restoreSessions property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link RestoreSessionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestoreSessionsRequestBuilder restoreSessions() {
        return new RestoreSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the serviceApps property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link ServiceAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServiceAppsRequestBuilder serviceApps() {
        return new ServiceAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sharePointProtectionPolicies property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link SharePointProtectionPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SharePointProtectionPoliciesRequestBuilder sharePointProtectionPolicies() {
        return new SharePointProtectionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sharePointRestoreSessions property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link SharePointRestoreSessionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SharePointRestoreSessionsRequestBuilder sharePointRestoreSessions() {
        return new SharePointRestoreSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the siteInclusionRules property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link SiteInclusionRulesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SiteInclusionRulesRequestBuilder siteInclusionRules() {
        return new SiteInclusionRulesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the siteProtectionUnits property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link SiteProtectionUnitsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SiteProtectionUnitsRequestBuilder siteProtectionUnits() {
        return new SiteProtectionUnitsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the siteProtectionUnitsBulkAdditionJobs property of the microsoft.graph.backupRestoreRoot entity.
     * @return a {@link SiteProtectionUnitsBulkAdditionJobsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SiteProtectionUnitsBulkAdditionJobsRequestBuilder siteProtectionUnitsBulkAdditionJobs() {
        return new SiteProtectionUnitsBulkAdditionJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link BackupRestoreRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BackupRestoreRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/backupRestore{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link BackupRestoreRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BackupRestoreRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/backupRestore{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property backupRestore for solutions
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property backupRestore for solutions
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
     * Get the serviceStatus of the Microsoft 365 Backup Storage service in a tenant.
     * @return a {@link BackupRestoreRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/backuprestoreroot-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public BackupRestoreRoot get() {
        return get(null);
    }
    /**
     * Get the serviceStatus of the Microsoft 365 Backup Storage service in a tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BackupRestoreRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/backuprestoreroot-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public BackupRestoreRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BackupRestoreRoot::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property backupRestore in solutions
     * @param body The request body
     * @return a {@link BackupRestoreRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public BackupRestoreRoot patch(@jakarta.annotation.Nonnull final BackupRestoreRoot body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property backupRestore in solutions
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BackupRestoreRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public BackupRestoreRoot patch(@jakarta.annotation.Nonnull final BackupRestoreRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BackupRestoreRoot::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property backupRestore for solutions
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property backupRestore for solutions
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
     * Get the serviceStatus of the Microsoft 365 Backup Storage service in a tenant.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the serviceStatus of the Microsoft 365 Backup Storage service in a tenant.
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
     * Update the navigation property backupRestore in solutions
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final BackupRestoreRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property backupRestore in solutions
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final BackupRestoreRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BackupRestoreRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BackupRestoreRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BackupRestoreRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get the serviceStatus of the Microsoft 365 Backup Storage service in a tenant.
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
