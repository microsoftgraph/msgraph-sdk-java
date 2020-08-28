// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceManagementSettings;
import com.microsoft.graph.models.extensions.IntuneBrand;
import com.microsoft.graph.models.generated.DeviceManagementSubscriptionState;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.SoftwareUpdateStatusSummary;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyDeviceStateSummary;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceStateSummary;
import com.microsoft.graph.models.extensions.IosUpdateDeviceStatus;
import com.microsoft.graph.models.extensions.DeviceCategory;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeConnector;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.extensions.OnPremisesConditionalAccessSettings;
import com.microsoft.graph.models.extensions.MobileThreatDefenseConnector;
import com.microsoft.graph.models.extensions.DeviceManagementPartner;
import com.microsoft.graph.models.extensions.ComplianceManagementPartner;
import com.microsoft.graph.models.extensions.ApplePushNotificationCertificate;
import com.microsoft.graph.models.extensions.ManagedDeviceOverview;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.models.extensions.RoleDefinition;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleAssignment;
import com.microsoft.graph.models.extensions.ResourceOperation;
import com.microsoft.graph.models.extensions.RemoteAssistancePartner;
import com.microsoft.graph.models.extensions.TelecomExpenseManagementPartner;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionAppLearningSummary;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionNetworkLearningSummary;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionResponse;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionResponse;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionResponse;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionResponse;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionPage;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionResponse;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.ResourceOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.ResourceOperationCollectionPage;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionResponse;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionPage;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionResponse;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management.
 */
public class DeviceManagement extends Entity implements IJsonBackedObject {


    /**
     * The Settings.
     * Account level settings.
     */
    @SerializedName("settings")
    @Expose
    public DeviceManagementSettings settings;

    /**
     * The Intune Account Id.
     * Intune Account Id for given tenant
     */
    @SerializedName("intuneAccountId")
    @Expose
    public java.util.UUID intuneAccountId;

    /**
     * The Intune Brand.
     * intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     */
    @SerializedName("intuneBrand")
    @Expose
    public IntuneBrand intuneBrand;

    /**
     * The Subscription State.
     * Tenant mobile device management subscription state. The possible values are: pending, active, warning, disabled, deleted, blocked, lockedOut.
     */
    @SerializedName("subscriptionState")
    @Expose
    public DeviceManagementSubscriptionState subscriptionState;

    /**
     * The Terms And Conditions.
     * The terms and conditions associated with device management of the company.
     */
    public TermsAndConditionsCollectionPage termsAndConditions;

    /**
     * The Device Configurations.
     * The device configurations.
     */
    public DeviceConfigurationCollectionPage deviceConfigurations;

    /**
     * The Device Compliance Policies.
     * The device compliance policies.
     */
    public DeviceCompliancePolicyCollectionPage deviceCompliancePolicies;

    /**
     * The Software Update Status Summary.
     * The software update status summary.
     */
    @SerializedName("softwareUpdateStatusSummary")
    @Expose
    public SoftwareUpdateStatusSummary softwareUpdateStatusSummary;

    /**
     * The Device Compliance Policy Device State Summary.
     * The device compliance state summary for this account.
     */
    @SerializedName("deviceCompliancePolicyDeviceStateSummary")
    @Expose
    public DeviceCompliancePolicyDeviceStateSummary deviceCompliancePolicyDeviceStateSummary;

    /**
     * The Device Compliance Policy Setting State Summaries.
     * The summary states of compliance policy settings for this account.
     */
    public DeviceCompliancePolicySettingStateSummaryCollectionPage deviceCompliancePolicySettingStateSummaries;

    /**
     * The Device Configuration Device State Summaries.
     * The device configuration device state summary for this account.
     */
    @SerializedName("deviceConfigurationDeviceStateSummaries")
    @Expose
    public DeviceConfigurationDeviceStateSummary deviceConfigurationDeviceStateSummaries;

    /**
     * The Ios Update Statuses.
     * The IOS software update installation statuses for this account.
     */
    public IosUpdateDeviceStatusCollectionPage iosUpdateStatuses;

    /**
     * The Device Categories.
     * The list of device categories with the tenant.
     */
    public DeviceCategoryCollectionPage deviceCategories;

    /**
     * The Exchange Connectors.
     * The list of Exchange Connectors configured by the tenant.
     */
    public DeviceManagementExchangeConnectorCollectionPage exchangeConnectors;

    /**
     * The Device Enrollment Configurations.
     * The list of device enrollment configurations
     */
    public DeviceEnrollmentConfigurationCollectionPage deviceEnrollmentConfigurations;

    /**
     * The Conditional Access Settings.
     * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     */
    @SerializedName("conditionalAccessSettings")
    @Expose
    public OnPremisesConditionalAccessSettings conditionalAccessSettings;

    /**
     * The Mobile Threat Defense Connectors.
     * The list of Mobile threat Defense connectors configured by the tenant.
     */
    public MobileThreatDefenseConnectorCollectionPage mobileThreatDefenseConnectors;

    /**
     * The Device Management Partners.
     * The list of Device Management Partners configured by the tenant.
     */
    public DeviceManagementPartnerCollectionPage deviceManagementPartners;

    /**
     * The Compliance Management Partners.
     * The list of Compliance Management Partners configured by the tenant.
     */
    public ComplianceManagementPartnerCollectionPage complianceManagementPartners;

    /**
     * The Apple Push Notification Certificate.
     * Apple push notification certificate.
     */
    @SerializedName("applePushNotificationCertificate")
    @Expose
    public ApplePushNotificationCertificate applePushNotificationCertificate;

    /**
     * The Managed Device Overview.
     * Device overview
     */
    @SerializedName("managedDeviceOverview")
    @Expose
    public ManagedDeviceOverview managedDeviceOverview;

    /**
     * The Detected Apps.
     * The list of detected apps associated with a device.
     */
    public DetectedAppCollectionPage detectedApps;

    /**
     * The Managed Devices.
     * The list of managed devices.
     */
    public ManagedDeviceCollectionPage managedDevices;

    /**
     * The Notification Message Templates.
     * The Notification Message Templates.
     */
    public NotificationMessageTemplateCollectionPage notificationMessageTemplates;

    /**
     * The Role Definitions.
     * The Role Definitions.
     */
    public RoleDefinitionCollectionPage roleDefinitions;

    /**
     * The Role Assignments.
     * The Role Assignments.
     */
    public DeviceAndAppManagementRoleAssignmentCollectionPage roleAssignments;

    /**
     * The Resource Operations.
     * The Resource Operations.
     */
    public ResourceOperationCollectionPage resourceOperations;

    /**
     * The Remote Assistance Partners.
     * The remote assist partners.
     */
    public RemoteAssistancePartnerCollectionPage remoteAssistancePartners;

    /**
     * The Telecom Expense Management Partners.
     * The telecom expense management partners.
     */
    public TelecomExpenseManagementPartnerCollectionPage telecomExpenseManagementPartners;

    /**
     * The Troubleshooting Events.
     * The list of troubleshooting events for the tenant.
     */
    public DeviceManagementTroubleshootingEventCollectionPage troubleshootingEvents;

    /**
     * The Windows Information Protection App Learning Summaries.
     * The windows information protection app learning summaries.
     */
    public WindowsInformationProtectionAppLearningSummaryCollectionPage windowsInformationProtectionAppLearningSummaries;

    /**
     * The Windows Information Protection Network Learning Summaries.
     * The windows information protection network learning summaries.
     */
    public WindowsInformationProtectionNetworkLearningSummaryCollectionPage windowsInformationProtectionNetworkLearningSummaries;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("termsAndConditions")) {
            final TermsAndConditionsCollectionResponse response = new TermsAndConditionsCollectionResponse();
            if (json.has("termsAndConditions@odata.nextLink")) {
                response.nextLink = json.get("termsAndConditions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("termsAndConditions").toString(), JsonObject[].class);
            final TermsAndConditions[] array = new TermsAndConditions[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TermsAndConditions.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            termsAndConditions = new TermsAndConditionsCollectionPage(response, null);
        }

        if (json.has("deviceConfigurations")) {
            final DeviceConfigurationCollectionResponse response = new DeviceConfigurationCollectionResponse();
            if (json.has("deviceConfigurations@odata.nextLink")) {
                response.nextLink = json.get("deviceConfigurations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceConfigurations").toString(), JsonObject[].class);
            final DeviceConfiguration[] array = new DeviceConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceConfigurations = new DeviceConfigurationCollectionPage(response, null);
        }

        if (json.has("deviceCompliancePolicies")) {
            final DeviceCompliancePolicyCollectionResponse response = new DeviceCompliancePolicyCollectionResponse();
            if (json.has("deviceCompliancePolicies@odata.nextLink")) {
                response.nextLink = json.get("deviceCompliancePolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceCompliancePolicies").toString(), JsonObject[].class);
            final DeviceCompliancePolicy[] array = new DeviceCompliancePolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceCompliancePolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceCompliancePolicies = new DeviceCompliancePolicyCollectionPage(response, null);
        }

        if (json.has("deviceCompliancePolicySettingStateSummaries")) {
            final DeviceCompliancePolicySettingStateSummaryCollectionResponse response = new DeviceCompliancePolicySettingStateSummaryCollectionResponse();
            if (json.has("deviceCompliancePolicySettingStateSummaries@odata.nextLink")) {
                response.nextLink = json.get("deviceCompliancePolicySettingStateSummaries@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceCompliancePolicySettingStateSummaries").toString(), JsonObject[].class);
            final DeviceCompliancePolicySettingStateSummary[] array = new DeviceCompliancePolicySettingStateSummary[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceCompliancePolicySettingStateSummary.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceCompliancePolicySettingStateSummaries = new DeviceCompliancePolicySettingStateSummaryCollectionPage(response, null);
        }

        if (json.has("iosUpdateStatuses")) {
            final IosUpdateDeviceStatusCollectionResponse response = new IosUpdateDeviceStatusCollectionResponse();
            if (json.has("iosUpdateStatuses@odata.nextLink")) {
                response.nextLink = json.get("iosUpdateStatuses@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("iosUpdateStatuses").toString(), JsonObject[].class);
            final IosUpdateDeviceStatus[] array = new IosUpdateDeviceStatus[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), IosUpdateDeviceStatus.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            iosUpdateStatuses = new IosUpdateDeviceStatusCollectionPage(response, null);
        }

        if (json.has("deviceCategories")) {
            final DeviceCategoryCollectionResponse response = new DeviceCategoryCollectionResponse();
            if (json.has("deviceCategories@odata.nextLink")) {
                response.nextLink = json.get("deviceCategories@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceCategories").toString(), JsonObject[].class);
            final DeviceCategory[] array = new DeviceCategory[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceCategory.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceCategories = new DeviceCategoryCollectionPage(response, null);
        }

        if (json.has("exchangeConnectors")) {
            final DeviceManagementExchangeConnectorCollectionResponse response = new DeviceManagementExchangeConnectorCollectionResponse();
            if (json.has("exchangeConnectors@odata.nextLink")) {
                response.nextLink = json.get("exchangeConnectors@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("exchangeConnectors").toString(), JsonObject[].class);
            final DeviceManagementExchangeConnector[] array = new DeviceManagementExchangeConnector[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementExchangeConnector.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            exchangeConnectors = new DeviceManagementExchangeConnectorCollectionPage(response, null);
        }

        if (json.has("deviceEnrollmentConfigurations")) {
            final DeviceEnrollmentConfigurationCollectionResponse response = new DeviceEnrollmentConfigurationCollectionResponse();
            if (json.has("deviceEnrollmentConfigurations@odata.nextLink")) {
                response.nextLink = json.get("deviceEnrollmentConfigurations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceEnrollmentConfigurations").toString(), JsonObject[].class);
            final DeviceEnrollmentConfiguration[] array = new DeviceEnrollmentConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceEnrollmentConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceEnrollmentConfigurations = new DeviceEnrollmentConfigurationCollectionPage(response, null);
        }

        if (json.has("mobileThreatDefenseConnectors")) {
            final MobileThreatDefenseConnectorCollectionResponse response = new MobileThreatDefenseConnectorCollectionResponse();
            if (json.has("mobileThreatDefenseConnectors@odata.nextLink")) {
                response.nextLink = json.get("mobileThreatDefenseConnectors@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("mobileThreatDefenseConnectors").toString(), JsonObject[].class);
            final MobileThreatDefenseConnector[] array = new MobileThreatDefenseConnector[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MobileThreatDefenseConnector.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            mobileThreatDefenseConnectors = new MobileThreatDefenseConnectorCollectionPage(response, null);
        }

        if (json.has("deviceManagementPartners")) {
            final DeviceManagementPartnerCollectionResponse response = new DeviceManagementPartnerCollectionResponse();
            if (json.has("deviceManagementPartners@odata.nextLink")) {
                response.nextLink = json.get("deviceManagementPartners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceManagementPartners").toString(), JsonObject[].class);
            final DeviceManagementPartner[] array = new DeviceManagementPartner[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementPartner.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceManagementPartners = new DeviceManagementPartnerCollectionPage(response, null);
        }

        if (json.has("complianceManagementPartners")) {
            final ComplianceManagementPartnerCollectionResponse response = new ComplianceManagementPartnerCollectionResponse();
            if (json.has("complianceManagementPartners@odata.nextLink")) {
                response.nextLink = json.get("complianceManagementPartners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("complianceManagementPartners").toString(), JsonObject[].class);
            final ComplianceManagementPartner[] array = new ComplianceManagementPartner[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ComplianceManagementPartner.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            complianceManagementPartners = new ComplianceManagementPartnerCollectionPage(response, null);
        }

        if (json.has("detectedApps")) {
            final DetectedAppCollectionResponse response = new DetectedAppCollectionResponse();
            if (json.has("detectedApps@odata.nextLink")) {
                response.nextLink = json.get("detectedApps@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("detectedApps").toString(), JsonObject[].class);
            final DetectedApp[] array = new DetectedApp[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DetectedApp.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            detectedApps = new DetectedAppCollectionPage(response, null);
        }

        if (json.has("managedDevices")) {
            final ManagedDeviceCollectionResponse response = new ManagedDeviceCollectionResponse();
            if (json.has("managedDevices@odata.nextLink")) {
                response.nextLink = json.get("managedDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedDevices").toString(), JsonObject[].class);
            final ManagedDevice[] array = new ManagedDevice[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDevice.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedDevices = new ManagedDeviceCollectionPage(response, null);
        }

        if (json.has("notificationMessageTemplates")) {
            final NotificationMessageTemplateCollectionResponse response = new NotificationMessageTemplateCollectionResponse();
            if (json.has("notificationMessageTemplates@odata.nextLink")) {
                response.nextLink = json.get("notificationMessageTemplates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("notificationMessageTemplates").toString(), JsonObject[].class);
            final NotificationMessageTemplate[] array = new NotificationMessageTemplate[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), NotificationMessageTemplate.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            notificationMessageTemplates = new NotificationMessageTemplateCollectionPage(response, null);
        }

        if (json.has("roleDefinitions")) {
            final RoleDefinitionCollectionResponse response = new RoleDefinitionCollectionResponse();
            if (json.has("roleDefinitions@odata.nextLink")) {
                response.nextLink = json.get("roleDefinitions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("roleDefinitions").toString(), JsonObject[].class);
            final RoleDefinition[] array = new RoleDefinition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RoleDefinition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            roleDefinitions = new RoleDefinitionCollectionPage(response, null);
        }

        if (json.has("roleAssignments")) {
            final DeviceAndAppManagementRoleAssignmentCollectionResponse response = new DeviceAndAppManagementRoleAssignmentCollectionResponse();
            if (json.has("roleAssignments@odata.nextLink")) {
                response.nextLink = json.get("roleAssignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("roleAssignments").toString(), JsonObject[].class);
            final DeviceAndAppManagementRoleAssignment[] array = new DeviceAndAppManagementRoleAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceAndAppManagementRoleAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            roleAssignments = new DeviceAndAppManagementRoleAssignmentCollectionPage(response, null);
        }

        if (json.has("resourceOperations")) {
            final ResourceOperationCollectionResponse response = new ResourceOperationCollectionResponse();
            if (json.has("resourceOperations@odata.nextLink")) {
                response.nextLink = json.get("resourceOperations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("resourceOperations").toString(), JsonObject[].class);
            final ResourceOperation[] array = new ResourceOperation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ResourceOperation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            resourceOperations = new ResourceOperationCollectionPage(response, null);
        }

        if (json.has("remoteAssistancePartners")) {
            final RemoteAssistancePartnerCollectionResponse response = new RemoteAssistancePartnerCollectionResponse();
            if (json.has("remoteAssistancePartners@odata.nextLink")) {
                response.nextLink = json.get("remoteAssistancePartners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("remoteAssistancePartners").toString(), JsonObject[].class);
            final RemoteAssistancePartner[] array = new RemoteAssistancePartner[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RemoteAssistancePartner.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            remoteAssistancePartners = new RemoteAssistancePartnerCollectionPage(response, null);
        }

        if (json.has("telecomExpenseManagementPartners")) {
            final TelecomExpenseManagementPartnerCollectionResponse response = new TelecomExpenseManagementPartnerCollectionResponse();
            if (json.has("telecomExpenseManagementPartners@odata.nextLink")) {
                response.nextLink = json.get("telecomExpenseManagementPartners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("telecomExpenseManagementPartners").toString(), JsonObject[].class);
            final TelecomExpenseManagementPartner[] array = new TelecomExpenseManagementPartner[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TelecomExpenseManagementPartner.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            telecomExpenseManagementPartners = new TelecomExpenseManagementPartnerCollectionPage(response, null);
        }

        if (json.has("troubleshootingEvents")) {
            final DeviceManagementTroubleshootingEventCollectionResponse response = new DeviceManagementTroubleshootingEventCollectionResponse();
            if (json.has("troubleshootingEvents@odata.nextLink")) {
                response.nextLink = json.get("troubleshootingEvents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("troubleshootingEvents").toString(), JsonObject[].class);
            final DeviceManagementTroubleshootingEvent[] array = new DeviceManagementTroubleshootingEvent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceManagementTroubleshootingEvent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            troubleshootingEvents = new DeviceManagementTroubleshootingEventCollectionPage(response, null);
        }

        if (json.has("windowsInformationProtectionAppLearningSummaries")) {
            final WindowsInformationProtectionAppLearningSummaryCollectionResponse response = new WindowsInformationProtectionAppLearningSummaryCollectionResponse();
            if (json.has("windowsInformationProtectionAppLearningSummaries@odata.nextLink")) {
                response.nextLink = json.get("windowsInformationProtectionAppLearningSummaries@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("windowsInformationProtectionAppLearningSummaries").toString(), JsonObject[].class);
            final WindowsInformationProtectionAppLearningSummary[] array = new WindowsInformationProtectionAppLearningSummary[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsInformationProtectionAppLearningSummary.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            windowsInformationProtectionAppLearningSummaries = new WindowsInformationProtectionAppLearningSummaryCollectionPage(response, null);
        }

        if (json.has("windowsInformationProtectionNetworkLearningSummaries")) {
            final WindowsInformationProtectionNetworkLearningSummaryCollectionResponse response = new WindowsInformationProtectionNetworkLearningSummaryCollectionResponse();
            if (json.has("windowsInformationProtectionNetworkLearningSummaries@odata.nextLink")) {
                response.nextLink = json.get("windowsInformationProtectionNetworkLearningSummaries@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("windowsInformationProtectionNetworkLearningSummaries").toString(), JsonObject[].class);
            final WindowsInformationProtectionNetworkLearningSummary[] array = new WindowsInformationProtectionNetworkLearningSummary[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WindowsInformationProtectionNetworkLearningSummary.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            windowsInformationProtectionNetworkLearningSummaries = new WindowsInformationProtectionNetworkLearningSummaryCollectionPage(response, null);
        }
    }
}
