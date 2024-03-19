package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcOnPremisesConnectionHealthCheckErrorType implements ValuedEnum {
    DnsCheckFqdnNotFound("dnsCheckFqdnNotFound"),
    DnsCheckNameWithInvalidCharacter("dnsCheckNameWithInvalidCharacter"),
    DnsCheckUnknownError("dnsCheckUnknownError"),
    AdJoinCheckFqdnNotFound("adJoinCheckFqdnNotFound"),
    AdJoinCheckIncorrectCredentials("adJoinCheckIncorrectCredentials"),
    AdJoinCheckOrganizationalUnitNotFound("adJoinCheckOrganizationalUnitNotFound"),
    AdJoinCheckOrganizationalUnitIncorrectFormat("adJoinCheckOrganizationalUnitIncorrectFormat"),
    AdJoinCheckComputerObjectAlreadyExists("adJoinCheckComputerObjectAlreadyExists"),
    AdJoinCheckAccessDenied("adJoinCheckAccessDenied"),
    AdJoinCheckCredentialsExpired("adJoinCheckCredentialsExpired"),
    AdJoinCheckAccountLockedOrDisabled("adJoinCheckAccountLockedOrDisabled"),
    AdJoinCheckAccountQuotaExceeded("adJoinCheckAccountQuotaExceeded"),
    AdJoinCheckServerNotOperational("adJoinCheckServerNotOperational"),
    AdJoinCheckUnknownError("adJoinCheckUnknownError"),
    EndpointConnectivityCheckCloudPcUrlNotAllowListed("endpointConnectivityCheckCloudPcUrlNotAllowListed"),
    EndpointConnectivityCheckWVDUrlNotAllowListed("endpointConnectivityCheckWVDUrlNotAllowListed"),
    EndpointConnectivityCheckIntuneUrlNotAllowListed("endpointConnectivityCheckIntuneUrlNotAllowListed"),
    EndpointConnectivityCheckAzureADUrlNotAllowListed("endpointConnectivityCheckAzureADUrlNotAllowListed"),
    EndpointConnectivityCheckLocaleUrlNotAllowListed("endpointConnectivityCheckLocaleUrlNotAllowListed"),
    EndpointConnectivityCheckUnknownError("endpointConnectivityCheckUnknownError"),
    AzureAdDeviceSyncCheckDeviceNotFound("azureAdDeviceSyncCheckDeviceNotFound"),
    AzureAdDeviceSyncCheckLongSyncCircle("azureAdDeviceSyncCheckLongSyncCircle"),
    AzureAdDeviceSyncCheckConnectDisabled("azureAdDeviceSyncCheckConnectDisabled"),
    AzureAdDeviceSyncCheckDurationExceeded("azureAdDeviceSyncCheckDurationExceeded"),
    AzureAdDeviceSyncCheckScpNotConfigured("azureAdDeviceSyncCheckScpNotConfigured"),
    AzureAdDeviceSyncCheckTransientServiceError("azureAdDeviceSyncCheckTransientServiceError"),
    AzureAdDeviceSyncCheckUnknownError("azureAdDeviceSyncCheckUnknownError"),
    ResourceAvailabilityCheckNoSubnetIP("resourceAvailabilityCheckNoSubnetIP"),
    ResourceAvailabilityCheckSubscriptionDisabled("resourceAvailabilityCheckSubscriptionDisabled"),
    ResourceAvailabilityCheckAzurePolicyViolation("resourceAvailabilityCheckAzurePolicyViolation"),
    ResourceAvailabilityCheckSubscriptionNotFound("resourceAvailabilityCheckSubscriptionNotFound"),
    ResourceAvailabilityCheckSubscriptionTransferred("resourceAvailabilityCheckSubscriptionTransferred"),
    ResourceAvailabilityCheckGeneralSubscriptionError("resourceAvailabilityCheckGeneralSubscriptionError"),
    ResourceAvailabilityCheckUnsupportedVNetRegion("resourceAvailabilityCheckUnsupportedVNetRegion"),
    ResourceAvailabilityCheckResourceGroupInvalid("resourceAvailabilityCheckResourceGroupInvalid"),
    ResourceAvailabilityCheckVNetInvalid("resourceAvailabilityCheckVNetInvalid"),
    ResourceAvailabilityCheckSubnetInvalid("resourceAvailabilityCheckSubnetInvalid"),
    ResourceAvailabilityCheckResourceGroupBeingDeleted("resourceAvailabilityCheckResourceGroupBeingDeleted"),
    ResourceAvailabilityCheckVNetBeingMoved("resourceAvailabilityCheckVNetBeingMoved"),
    ResourceAvailabilityCheckSubnetDelegationFailed("resourceAvailabilityCheckSubnetDelegationFailed"),
    ResourceAvailabilityCheckSubnetWithExternalResources("resourceAvailabilityCheckSubnetWithExternalResources"),
    ResourceAvailabilityCheckResourceGroupLockedForReadonly("resourceAvailabilityCheckResourceGroupLockedForReadonly"),
    ResourceAvailabilityCheckResourceGroupLockedForDelete("resourceAvailabilityCheckResourceGroupLockedForDelete"),
    ResourceAvailabilityCheckNoIntuneReaderRoleError("resourceAvailabilityCheckNoIntuneReaderRoleError"),
    ResourceAvailabilityCheckIntuneDefaultWindowsRestrictionViolation("resourceAvailabilityCheckIntuneDefaultWindowsRestrictionViolation"),
    ResourceAvailabilityCheckIntuneCustomWindowsRestrictionViolation("resourceAvailabilityCheckIntuneCustomWindowsRestrictionViolation"),
    ResourceAvailabilityCheckDeploymentQuotaLimitReached("resourceAvailabilityCheckDeploymentQuotaLimitReached"),
    ResourceAvailabilityCheckTransientServiceError("resourceAvailabilityCheckTransientServiceError"),
    ResourceAvailabilityCheckUnknownError("resourceAvailabilityCheckUnknownError"),
    PermissionCheckNoSubscriptionReaderRole("permissionCheckNoSubscriptionReaderRole"),
    PermissionCheckNoResourceGroupOwnerRole("permissionCheckNoResourceGroupOwnerRole"),
    PermissionCheckNoVNetContributorRole("permissionCheckNoVNetContributorRole"),
    PermissionCheckNoResourceGroupNetworkContributorRole("permissionCheckNoResourceGroupNetworkContributorRole"),
    PermissionCheckNoWindows365NetworkUserRole("permissionCheckNoWindows365NetworkUserRole"),
    PermissionCheckNoWindows365NetworkInterfaceContributorRole("permissionCheckNoWindows365NetworkInterfaceContributorRole"),
    PermissionCheckTransientServiceError("permissionCheckTransientServiceError"),
    PermissionCheckUnknownError("permissionCheckUnknownError"),
    UdpConnectivityCheckStunUrlNotAllowListed("udpConnectivityCheckStunUrlNotAllowListed"),
    UdpConnectivityCheckTurnUrlNotAllowListed("udpConnectivityCheckTurnUrlNotAllowListed"),
    UdpConnectivityCheckUrlsNotAllowListed("udpConnectivityCheckUrlsNotAllowListed"),
    UdpConnectivityCheckUnknownError("udpConnectivityCheckUnknownError"),
    InternalServerErrorDeploymentCanceled("internalServerErrorDeploymentCanceled"),
    InternalServerErrorAllocateResourceFailed("internalServerErrorAllocateResourceFailed"),
    InternalServerErrorVMDeploymentTimeout("internalServerErrorVMDeploymentTimeout"),
    InternalServerErrorUnableToRunDscScript("internalServerErrorUnableToRunDscScript"),
    SsoCheckKerberosConfigurationError("ssoCheckKerberosConfigurationError"),
    InternalServerUnknownError("internalServerUnknownError"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcOnPremisesConnectionHealthCheckErrorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcOnPremisesConnectionHealthCheckErrorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dnsCheckFqdnNotFound": return DnsCheckFqdnNotFound;
            case "dnsCheckNameWithInvalidCharacter": return DnsCheckNameWithInvalidCharacter;
            case "dnsCheckUnknownError": return DnsCheckUnknownError;
            case "adJoinCheckFqdnNotFound": return AdJoinCheckFqdnNotFound;
            case "adJoinCheckIncorrectCredentials": return AdJoinCheckIncorrectCredentials;
            case "adJoinCheckOrganizationalUnitNotFound": return AdJoinCheckOrganizationalUnitNotFound;
            case "adJoinCheckOrganizationalUnitIncorrectFormat": return AdJoinCheckOrganizationalUnitIncorrectFormat;
            case "adJoinCheckComputerObjectAlreadyExists": return AdJoinCheckComputerObjectAlreadyExists;
            case "adJoinCheckAccessDenied": return AdJoinCheckAccessDenied;
            case "adJoinCheckCredentialsExpired": return AdJoinCheckCredentialsExpired;
            case "adJoinCheckAccountLockedOrDisabled": return AdJoinCheckAccountLockedOrDisabled;
            case "adJoinCheckAccountQuotaExceeded": return AdJoinCheckAccountQuotaExceeded;
            case "adJoinCheckServerNotOperational": return AdJoinCheckServerNotOperational;
            case "adJoinCheckUnknownError": return AdJoinCheckUnknownError;
            case "endpointConnectivityCheckCloudPcUrlNotAllowListed": return EndpointConnectivityCheckCloudPcUrlNotAllowListed;
            case "endpointConnectivityCheckWVDUrlNotAllowListed": return EndpointConnectivityCheckWVDUrlNotAllowListed;
            case "endpointConnectivityCheckIntuneUrlNotAllowListed": return EndpointConnectivityCheckIntuneUrlNotAllowListed;
            case "endpointConnectivityCheckAzureADUrlNotAllowListed": return EndpointConnectivityCheckAzureADUrlNotAllowListed;
            case "endpointConnectivityCheckLocaleUrlNotAllowListed": return EndpointConnectivityCheckLocaleUrlNotAllowListed;
            case "endpointConnectivityCheckUnknownError": return EndpointConnectivityCheckUnknownError;
            case "azureAdDeviceSyncCheckDeviceNotFound": return AzureAdDeviceSyncCheckDeviceNotFound;
            case "azureAdDeviceSyncCheckLongSyncCircle": return AzureAdDeviceSyncCheckLongSyncCircle;
            case "azureAdDeviceSyncCheckConnectDisabled": return AzureAdDeviceSyncCheckConnectDisabled;
            case "azureAdDeviceSyncCheckDurationExceeded": return AzureAdDeviceSyncCheckDurationExceeded;
            case "azureAdDeviceSyncCheckScpNotConfigured": return AzureAdDeviceSyncCheckScpNotConfigured;
            case "azureAdDeviceSyncCheckTransientServiceError": return AzureAdDeviceSyncCheckTransientServiceError;
            case "azureAdDeviceSyncCheckUnknownError": return AzureAdDeviceSyncCheckUnknownError;
            case "resourceAvailabilityCheckNoSubnetIP": return ResourceAvailabilityCheckNoSubnetIP;
            case "resourceAvailabilityCheckSubscriptionDisabled": return ResourceAvailabilityCheckSubscriptionDisabled;
            case "resourceAvailabilityCheckAzurePolicyViolation": return ResourceAvailabilityCheckAzurePolicyViolation;
            case "resourceAvailabilityCheckSubscriptionNotFound": return ResourceAvailabilityCheckSubscriptionNotFound;
            case "resourceAvailabilityCheckSubscriptionTransferred": return ResourceAvailabilityCheckSubscriptionTransferred;
            case "resourceAvailabilityCheckGeneralSubscriptionError": return ResourceAvailabilityCheckGeneralSubscriptionError;
            case "resourceAvailabilityCheckUnsupportedVNetRegion": return ResourceAvailabilityCheckUnsupportedVNetRegion;
            case "resourceAvailabilityCheckResourceGroupInvalid": return ResourceAvailabilityCheckResourceGroupInvalid;
            case "resourceAvailabilityCheckVNetInvalid": return ResourceAvailabilityCheckVNetInvalid;
            case "resourceAvailabilityCheckSubnetInvalid": return ResourceAvailabilityCheckSubnetInvalid;
            case "resourceAvailabilityCheckResourceGroupBeingDeleted": return ResourceAvailabilityCheckResourceGroupBeingDeleted;
            case "resourceAvailabilityCheckVNetBeingMoved": return ResourceAvailabilityCheckVNetBeingMoved;
            case "resourceAvailabilityCheckSubnetDelegationFailed": return ResourceAvailabilityCheckSubnetDelegationFailed;
            case "resourceAvailabilityCheckSubnetWithExternalResources": return ResourceAvailabilityCheckSubnetWithExternalResources;
            case "resourceAvailabilityCheckResourceGroupLockedForReadonly": return ResourceAvailabilityCheckResourceGroupLockedForReadonly;
            case "resourceAvailabilityCheckResourceGroupLockedForDelete": return ResourceAvailabilityCheckResourceGroupLockedForDelete;
            case "resourceAvailabilityCheckNoIntuneReaderRoleError": return ResourceAvailabilityCheckNoIntuneReaderRoleError;
            case "resourceAvailabilityCheckIntuneDefaultWindowsRestrictionViolation": return ResourceAvailabilityCheckIntuneDefaultWindowsRestrictionViolation;
            case "resourceAvailabilityCheckIntuneCustomWindowsRestrictionViolation": return ResourceAvailabilityCheckIntuneCustomWindowsRestrictionViolation;
            case "resourceAvailabilityCheckDeploymentQuotaLimitReached": return ResourceAvailabilityCheckDeploymentQuotaLimitReached;
            case "resourceAvailabilityCheckTransientServiceError": return ResourceAvailabilityCheckTransientServiceError;
            case "resourceAvailabilityCheckUnknownError": return ResourceAvailabilityCheckUnknownError;
            case "permissionCheckNoSubscriptionReaderRole": return PermissionCheckNoSubscriptionReaderRole;
            case "permissionCheckNoResourceGroupOwnerRole": return PermissionCheckNoResourceGroupOwnerRole;
            case "permissionCheckNoVNetContributorRole": return PermissionCheckNoVNetContributorRole;
            case "permissionCheckNoResourceGroupNetworkContributorRole": return PermissionCheckNoResourceGroupNetworkContributorRole;
            case "permissionCheckNoWindows365NetworkUserRole": return PermissionCheckNoWindows365NetworkUserRole;
            case "permissionCheckNoWindows365NetworkInterfaceContributorRole": return PermissionCheckNoWindows365NetworkInterfaceContributorRole;
            case "permissionCheckTransientServiceError": return PermissionCheckTransientServiceError;
            case "permissionCheckUnknownError": return PermissionCheckUnknownError;
            case "udpConnectivityCheckStunUrlNotAllowListed": return UdpConnectivityCheckStunUrlNotAllowListed;
            case "udpConnectivityCheckTurnUrlNotAllowListed": return UdpConnectivityCheckTurnUrlNotAllowListed;
            case "udpConnectivityCheckUrlsNotAllowListed": return UdpConnectivityCheckUrlsNotAllowListed;
            case "udpConnectivityCheckUnknownError": return UdpConnectivityCheckUnknownError;
            case "internalServerErrorDeploymentCanceled": return InternalServerErrorDeploymentCanceled;
            case "internalServerErrorAllocateResourceFailed": return InternalServerErrorAllocateResourceFailed;
            case "internalServerErrorVMDeploymentTimeout": return InternalServerErrorVMDeploymentTimeout;
            case "internalServerErrorUnableToRunDscScript": return InternalServerErrorUnableToRunDscScript;
            case "ssoCheckKerberosConfigurationError": return SsoCheckKerberosConfigurationError;
            case "internalServerUnknownError": return InternalServerUnknownError;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
