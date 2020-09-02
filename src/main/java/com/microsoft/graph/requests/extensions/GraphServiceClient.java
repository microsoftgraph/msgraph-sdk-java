// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.requests.extensions.IInvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IInvitationRequestBuilder;
import com.microsoft.graph.requests.extensions.InvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InvitationRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlaceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlaceRequestBuilder;
import com.microsoft.graph.requests.extensions.PlaceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlaceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditLogRootRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditLogRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicyRootRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicyRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRootRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.extensions.CloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamworkRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamworkRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppCatalogsRequestBuilder;
import com.microsoft.graph.requests.extensions.AppCatalogsRequestBuilder;
import com.microsoft.graph.requests.extensions.IInformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InformationProtectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.authentication.*;
import com.microsoft.graph.logger.*;
import com.google.gson.JsonObject;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.models.extensions.IGraphServiceClient;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.core.IClientConfig;
import com.microsoft.graph.core.DefaultClientConfig;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Graph Service Client.
 */
public class GraphServiceClient extends BaseGraphServiceClient implements IGraphServiceClient {

    /**
     * Restricted constructor
     */
    protected GraphServiceClient() {
    }

	/**
     * Send a custom request to Graph
     * 
     * @param url
     *            the full URL to make a request with
     * @param responseType
     *            the response class to deserialize the response into
     * @return the instance of this builder
     */
    public <T> CustomRequestBuilder<T> customRequest(final String url, final Class<T> responseType) {
        return new CustomRequestBuilder<T>(getServiceRoot() + url, this, null, responseType);
    }

    /**
     * Send a custom request to Graph
     * 
     * @param url
     *            the full URL to make a request with
     * @return the instance of this builder
     */
    public CustomRequestBuilder<JsonObject> customRequest(final String url) {
        return new CustomRequestBuilder<JsonObject>(getServiceRoot() + url, this, null,
                JsonObject.class);
    }

    /**
     * Returns a Graph service client using the given configuration.
     * 
     * @param config
     *            the client configuration
     * @return a Graph service client
     */
    public static IGraphServiceClient fromConfig(final IClientConfig config) {
        GraphServiceClient client = new GraphServiceClient();
        client.setAuthenticationProvider(config.getAuthenticationProvider());
        client.setExecutors(config.getExecutors());
        client.setHttpProvider(config.getHttpProvider());
        client.setLogger(config.getLogger());
        client.setSerializer(config.getSerializer());
        client.validate();
        return client;
    }

	public static Builder builder() {
        return new Builder();
    }
    
    public static final class Builder {
        
        Builder() {
            // restrict instantiation
        }

        /**
         * Sets the authentication provider
         * 
         * @param authenticationProvider
         *            the authentication provider
         * @return a new builder that allows specification of other aspects of the GraphServiceClient
         */
        public Builder2 authenticationProvider(IAuthenticationProvider authenticationProvider) {
            checkNotNull(authenticationProvider, "authenticationProvider");
            return new Builder2(authenticationProvider);
        }
    }

	/**
     * The builder for this GraphServiceClient
     */
    public static final class Builder2 {
        
        private final IAuthenticationProvider authenticationProvider;
        private ISerializer serializer;
        private IHttpProvider httpProvider;
        private IExecutors executors;
        private ILogger logger;

        
        Builder2(IAuthenticationProvider authenticationProvider) {
            this.authenticationProvider = authenticationProvider;
        }

        /**
         * Sets the serializer.
         * 
         * @param serializer
         *            the serializer
         * @return the instance of this builder
         */
        public Builder2 serializer(final ISerializer serializer) {
            checkNotNull(serializer, "serializer");
            this.serializer = serializer;
            return this;
        }

        /**
         * Sets the httpProvider
         * 
         * @param httpProvider
         *            the httpProvider
         * @return the instance of this builder
         */
        public Builder2 httpProvider(final IHttpProvider httpProvider) {
            checkNotNull(httpProvider, "httpProvider");
            this.httpProvider = httpProvider;
            return this;
        }

        /**
         * Sets the executors
         * 
         * @param executors
         *            the executors
         * @return the instance of this builder
         */
        public Builder2 executors(final IExecutors executors) {
            checkNotNull(executors, "executors");
            this.executors = executors;
            return this;
        }

        /**
         * Sets the logger
         * 
         * @param logger
         *            the logger
         * @return the instance of this builder
         */
        public Builder2 logger(final ILogger logger) {
            checkNotNull(logger, "logger");
            this.logger = logger;
            return this;
        }

        /**
         * Builds and returns the Graph service client.
         * 
         * @return the Graph service client object
         * @throws ClientException
         *             if there was an exception creating the client
         */
        public IGraphServiceClient buildClient() throws ClientException {
            DefaultClientConfig config = new DefaultClientConfig() {

                @Override
                public IAuthenticationProvider getAuthenticationProvider() {
                    return authenticationProvider; 
                }

                @Override
                public IHttpProvider getHttpProvider() {
                    if (httpProvider != null) {
                        return httpProvider;
                    } else {
                        return super.getHttpProvider();
                    }
                }

                @Override
                public IExecutors getExecutors() {
                    if (executors != null) {
                        return executors;
                    } else {
                        return super.getExecutors();
                    }
                }

                @Override
                public ILogger getLogger() {
                    if (logger !=null) {
                        return logger;
                    } else {
                        return super.getLogger();
                    }
                }

                @Override
                public ISerializer getSerializer() {
                    if (serializer != null) {
                        return serializer;
                    } else {
                        return super.getSerializer();
                    }
                }
            };
            return GraphServiceClient.fromConfig(config);
        }
    }
    
    private static void checkNotNull(Object o, String name) {
        if (o==null) {
            throw new NullPointerException(name + " cannot be null");
        }
    }
}
