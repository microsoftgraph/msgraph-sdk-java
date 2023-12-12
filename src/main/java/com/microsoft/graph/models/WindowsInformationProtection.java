package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Policy for Windows information protection to configure detailed management settings
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsInformationProtection extends ManagedAppPolicy implements Parsable {
    /**
     * Instantiates a new WindowsInformationProtection and sets the default values.
     */
    public WindowsInformationProtection() {
        super();
        this.setOdataType("#microsoft.graph.windowsInformationProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsInformationProtection
     */
    @jakarta.annotation.Nonnull
    public static WindowsInformationProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.mdmWindowsInformationProtectionPolicy": return new MdmWindowsInformationProtectionPolicy();
                case "#microsoft.graph.windowsInformationProtectionPolicy": return new WindowsInformationProtectionPolicy();
            }
        }
        return new WindowsInformationProtection();
    }
    /**
     * Gets the assignments property value. Navigation property to list of security groups targeted for policy.
     * @return a java.util.List<TargetedManagedAppPolicyAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TargetedManagedAppPolicyAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the azureRightsManagementServicesAllowed property value. Specifies whether to allow Azure RMS encryption for WIP
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAzureRightsManagementServicesAllowed() {
        return this.backingStore.get("azureRightsManagementServicesAllowed");
    }
    /**
     * Gets the dataRecoveryCertificate property value. Specifies a recovery certificate that can be used for data recovery of encrypted files. This is the same as the data recovery agent(DRA) certificate for encrypting file system(EFS)
     * @return a WindowsInformationProtectionDataRecoveryCertificate
     */
    @jakarta.annotation.Nullable
    public WindowsInformationProtectionDataRecoveryCertificate getDataRecoveryCertificate() {
        return this.backingStore.get("dataRecoveryCertificate");
    }
    /**
     * Gets the enforcementLevel property value. Possible values for WIP Protection enforcement levels
     * @return a WindowsInformationProtectionEnforcementLevel
     */
    @jakarta.annotation.Nullable
    public WindowsInformationProtectionEnforcementLevel getEnforcementLevel() {
        return this.backingStore.get("enforcementLevel");
    }
    /**
     * Gets the enterpriseDomain property value. Primary enterprise domain
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEnterpriseDomain() {
        return this.backingStore.get("enterpriseDomain");
    }
    /**
     * Gets the enterpriseInternalProxyServers property value. This is the comma-separated list of internal proxy servers. For example, '157.54.14.28, 157.54.11.118, 10.202.14.167, 157.53.14.163, 157.69.210.59'. These proxies have been configured by the admin to connect to specific resources on the Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the EnterpriseProxiedDomains policy to force traffic to the matched domains through these proxies
     * @return a java.util.List<WindowsInformationProtectionResourceCollection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionResourceCollection> getEnterpriseInternalProxyServers() {
        return this.backingStore.get("enterpriseInternalProxyServers");
    }
    /**
     * Gets the enterpriseIPRanges property value. Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers will be considered part of the enterprise and protected. These locations will be considered a safe destination for enterprise data to be shared to
     * @return a java.util.List<WindowsInformationProtectionIPRangeCollection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionIPRangeCollection> getEnterpriseIPRanges() {
        return this.backingStore.get("enterpriseIPRanges");
    }
    /**
     * Gets the enterpriseIPRangesAreAuthoritative property value. Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other subnets. Default is false
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnterpriseIPRangesAreAuthoritative() {
        return this.backingStore.get("enterpriseIPRangesAreAuthoritative");
    }
    /**
     * Gets the enterpriseNetworkDomainNames property value. This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent to a device will be considered enterprise data and protected These locations will be considered a safe destination for enterprise data to be shared to
     * @return a java.util.List<WindowsInformationProtectionResourceCollection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionResourceCollection> getEnterpriseNetworkDomainNames() {
        return this.backingStore.get("enterpriseNetworkDomainNames");
    }
    /**
     * Gets the enterpriseProtectedDomainNames property value. List of enterprise domains to be protected
     * @return a java.util.List<WindowsInformationProtectionResourceCollection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionResourceCollection> getEnterpriseProtectedDomainNames() {
        return this.backingStore.get("enterpriseProtectedDomainNames");
    }
    /**
     * Gets the enterpriseProxiedDomains property value. Contains a list of Enterprise resource domains hosted in the cloud that need to be protected. Connections to these resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this purpose must also be configured using the EnterpriseInternalProxyServers policy
     * @return a java.util.List<WindowsInformationProtectionProxiedDomainCollection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionProxiedDomainCollection> getEnterpriseProxiedDomains() {
        return this.backingStore.get("enterpriseProxiedDomains");
    }
    /**
     * Gets the enterpriseProxyServers property value. This is a list of proxy servers. Any server not on this list is considered non-enterprise
     * @return a java.util.List<WindowsInformationProtectionResourceCollection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionResourceCollection> getEnterpriseProxyServers() {
        return this.backingStore.get("enterpriseProxyServers");
    }
    /**
     * Gets the enterpriseProxyServersAreAuthoritative property value. Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies. Default is false
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnterpriseProxyServersAreAuthoritative() {
        return this.backingStore.get("enterpriseProxyServersAreAuthoritative");
    }
    /**
     * Gets the exemptAppLockerFiles property value. Another way to input exempt apps through xml files
     * @return a java.util.List<WindowsInformationProtectionAppLockerFile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionAppLockerFile> getExemptAppLockerFiles() {
        return this.backingStore.get("exemptAppLockerFiles");
    }
    /**
     * Gets the exemptApps property value. Exempt applications can also access enterprise data, but the data handled by those applications are not protected. This is because some critical enterprise applications may have compatibility problems with encrypted data.
     * @return a java.util.List<WindowsInformationProtectionApp>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionApp> getExemptApps() {
        return this.backingStore.get("exemptApps");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(TargetedManagedAppPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("azureRightsManagementServicesAllowed", (n) -> { this.setAzureRightsManagementServicesAllowed(n.getBooleanValue()); });
        deserializerMap.put("dataRecoveryCertificate", (n) -> { this.setDataRecoveryCertificate(n.getObjectValue(WindowsInformationProtectionDataRecoveryCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("enforcementLevel", (n) -> { this.setEnforcementLevel(n.getEnumValue(WindowsInformationProtectionEnforcementLevel::forValue)); });
        deserializerMap.put("enterpriseDomain", (n) -> { this.setEnterpriseDomain(n.getStringValue()); });
        deserializerMap.put("enterpriseInternalProxyServers", (n) -> { this.setEnterpriseInternalProxyServers(n.getCollectionOfObjectValues(WindowsInformationProtectionResourceCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("enterpriseIPRanges", (n) -> { this.setEnterpriseIPRanges(n.getCollectionOfObjectValues(WindowsInformationProtectionIPRangeCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("enterpriseIPRangesAreAuthoritative", (n) -> { this.setEnterpriseIPRangesAreAuthoritative(n.getBooleanValue()); });
        deserializerMap.put("enterpriseNetworkDomainNames", (n) -> { this.setEnterpriseNetworkDomainNames(n.getCollectionOfObjectValues(WindowsInformationProtectionResourceCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("enterpriseProtectedDomainNames", (n) -> { this.setEnterpriseProtectedDomainNames(n.getCollectionOfObjectValues(WindowsInformationProtectionResourceCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("enterpriseProxiedDomains", (n) -> { this.setEnterpriseProxiedDomains(n.getCollectionOfObjectValues(WindowsInformationProtectionProxiedDomainCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("enterpriseProxyServers", (n) -> { this.setEnterpriseProxyServers(n.getCollectionOfObjectValues(WindowsInformationProtectionResourceCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("enterpriseProxyServersAreAuthoritative", (n) -> { this.setEnterpriseProxyServersAreAuthoritative(n.getBooleanValue()); });
        deserializerMap.put("exemptAppLockerFiles", (n) -> { this.setExemptAppLockerFiles(n.getCollectionOfObjectValues(WindowsInformationProtectionAppLockerFile::createFromDiscriminatorValue)); });
        deserializerMap.put("exemptApps", (n) -> { this.setExemptApps(n.getCollectionOfObjectValues(WindowsInformationProtectionApp::createFromDiscriminatorValue)); });
        deserializerMap.put("iconsVisible", (n) -> { this.setIconsVisible(n.getBooleanValue()); });
        deserializerMap.put("indexingEncryptedStoresOrItemsBlocked", (n) -> { this.setIndexingEncryptedStoresOrItemsBlocked(n.getBooleanValue()); });
        deserializerMap.put("isAssigned", (n) -> { this.setIsAssigned(n.getBooleanValue()); });
        deserializerMap.put("neutralDomainResources", (n) -> { this.setNeutralDomainResources(n.getCollectionOfObjectValues(WindowsInformationProtectionResourceCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("protectedAppLockerFiles", (n) -> { this.setProtectedAppLockerFiles(n.getCollectionOfObjectValues(WindowsInformationProtectionAppLockerFile::createFromDiscriminatorValue)); });
        deserializerMap.put("protectedApps", (n) -> { this.setProtectedApps(n.getCollectionOfObjectValues(WindowsInformationProtectionApp::createFromDiscriminatorValue)); });
        deserializerMap.put("protectionUnderLockConfigRequired", (n) -> { this.setProtectionUnderLockConfigRequired(n.getBooleanValue()); });
        deserializerMap.put("revokeOnUnenrollDisabled", (n) -> { this.setRevokeOnUnenrollDisabled(n.getBooleanValue()); });
        deserializerMap.put("rightsManagementServicesTemplateId", (n) -> { this.setRightsManagementServicesTemplateId(n.getUUIDValue()); });
        deserializerMap.put("smbAutoEncryptedFileExtensions", (n) -> { this.setSmbAutoEncryptedFileExtensions(n.getCollectionOfObjectValues(WindowsInformationProtectionResourceCollection::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the iconsVisible property value. Determines whether overlays are added to icons for WIP protected files in Explorer and enterprise only app tiles in the Start menu. Starting in Windows 10, version 1703 this setting also configures the visibility of the WIP icon in the title bar of a WIP-protected app
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIconsVisible() {
        return this.backingStore.get("iconsVisible");
    }
    /**
     * Gets the indexingEncryptedStoresOrItemsBlocked property value. This switch is for the Windows Search Indexer, to allow or disallow indexing of items
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIndexingEncryptedStoresOrItemsBlocked() {
        return this.backingStore.get("indexingEncryptedStoresOrItemsBlocked");
    }
    /**
     * Gets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAssigned() {
        return this.backingStore.get("isAssigned");
    }
    /**
     * Gets the neutralDomainResources property value. List of domain names that can used for work or personal resource
     * @return a java.util.List<WindowsInformationProtectionResourceCollection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionResourceCollection> getNeutralDomainResources() {
        return this.backingStore.get("neutralDomainResources");
    }
    /**
     * Gets the protectedAppLockerFiles property value. Another way to input protected apps through xml files
     * @return a java.util.List<WindowsInformationProtectionAppLockerFile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionAppLockerFile> getProtectedAppLockerFiles() {
        return this.backingStore.get("protectedAppLockerFiles");
    }
    /**
     * Gets the protectedApps property value. Protected applications can access enterprise data and the data handled by those applications are protected with encryption
     * @return a java.util.List<WindowsInformationProtectionApp>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionApp> getProtectedApps() {
        return this.backingStore.get("protectedApps");
    }
    /**
     * Gets the protectionUnderLockConfigRequired property value. Specifies whether the protection under lock feature (also known as encrypt under pin) should be configured
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProtectionUnderLockConfigRequired() {
        return this.backingStore.get("protectionUnderLockConfigRequired");
    }
    /**
     * Gets the revokeOnUnenrollDisabled property value. This policy controls whether to revoke the WIP keys when a device unenrolls from the management service. If set to 1 (Don't revoke keys), the keys will not be revoked and the user will continue to have access to protected files after unenrollment. If the keys are not revoked, there will be no revoked file cleanup subsequently.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRevokeOnUnenrollDisabled() {
        return this.backingStore.get("revokeOnUnenrollDisabled");
    }
    /**
     * Gets the rightsManagementServicesTemplateId property value. TemplateID GUID to use for RMS encryption. The RMS template allows the IT admin to configure the details about who has access to RMS-protected file and how long they have access
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getRightsManagementServicesTemplateId() {
        return this.backingStore.get("rightsManagementServicesTemplateId");
    }
    /**
     * Gets the smbAutoEncryptedFileExtensions property value. Specifies a list of file extensions, so that files with these extensions are encrypted when copying from an SMB share within the corporate boundary
     * @return a java.util.List<WindowsInformationProtectionResourceCollection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionResourceCollection> getSmbAutoEncryptedFileExtensions() {
        return this.backingStore.get("smbAutoEncryptedFileExtensions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeBooleanValue("azureRightsManagementServicesAllowed", this.getAzureRightsManagementServicesAllowed());
        writer.writeObjectValue("dataRecoveryCertificate", this.getDataRecoveryCertificate());
        writer.writeEnumValue("enforcementLevel", this.getEnforcementLevel());
        writer.writeStringValue("enterpriseDomain", this.getEnterpriseDomain());
        writer.writeCollectionOfObjectValues("enterpriseInternalProxyServers", this.getEnterpriseInternalProxyServers());
        writer.writeCollectionOfObjectValues("enterpriseIPRanges", this.getEnterpriseIPRanges());
        writer.writeBooleanValue("enterpriseIPRangesAreAuthoritative", this.getEnterpriseIPRangesAreAuthoritative());
        writer.writeCollectionOfObjectValues("enterpriseNetworkDomainNames", this.getEnterpriseNetworkDomainNames());
        writer.writeCollectionOfObjectValues("enterpriseProtectedDomainNames", this.getEnterpriseProtectedDomainNames());
        writer.writeCollectionOfObjectValues("enterpriseProxiedDomains", this.getEnterpriseProxiedDomains());
        writer.writeCollectionOfObjectValues("enterpriseProxyServers", this.getEnterpriseProxyServers());
        writer.writeBooleanValue("enterpriseProxyServersAreAuthoritative", this.getEnterpriseProxyServersAreAuthoritative());
        writer.writeCollectionOfObjectValues("exemptAppLockerFiles", this.getExemptAppLockerFiles());
        writer.writeCollectionOfObjectValues("exemptApps", this.getExemptApps());
        writer.writeBooleanValue("iconsVisible", this.getIconsVisible());
        writer.writeBooleanValue("indexingEncryptedStoresOrItemsBlocked", this.getIndexingEncryptedStoresOrItemsBlocked());
        writer.writeBooleanValue("isAssigned", this.getIsAssigned());
        writer.writeCollectionOfObjectValues("neutralDomainResources", this.getNeutralDomainResources());
        writer.writeCollectionOfObjectValues("protectedAppLockerFiles", this.getProtectedAppLockerFiles());
        writer.writeCollectionOfObjectValues("protectedApps", this.getProtectedApps());
        writer.writeBooleanValue("protectionUnderLockConfigRequired", this.getProtectionUnderLockConfigRequired());
        writer.writeBooleanValue("revokeOnUnenrollDisabled", this.getRevokeOnUnenrollDisabled());
        writer.writeUUIDValue("rightsManagementServicesTemplateId", this.getRightsManagementServicesTemplateId());
        writer.writeCollectionOfObjectValues("smbAutoEncryptedFileExtensions", this.getSmbAutoEncryptedFileExtensions());
    }
    /**
     * Sets the assignments property value. Navigation property to list of security groups targeted for policy.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<TargetedManagedAppPolicyAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the azureRightsManagementServicesAllowed property value. Specifies whether to allow Azure RMS encryption for WIP
     * @param value Value to set for the azureRightsManagementServicesAllowed property.
     */
    public void setAzureRightsManagementServicesAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("azureRightsManagementServicesAllowed", value);
    }
    /**
     * Sets the dataRecoveryCertificate property value. Specifies a recovery certificate that can be used for data recovery of encrypted files. This is the same as the data recovery agent(DRA) certificate for encrypting file system(EFS)
     * @param value Value to set for the dataRecoveryCertificate property.
     */
    public void setDataRecoveryCertificate(@jakarta.annotation.Nullable final WindowsInformationProtectionDataRecoveryCertificate value) {
        this.backingStore.set("dataRecoveryCertificate", value);
    }
    /**
     * Sets the enforcementLevel property value. Possible values for WIP Protection enforcement levels
     * @param value Value to set for the enforcementLevel property.
     */
    public void setEnforcementLevel(@jakarta.annotation.Nullable final WindowsInformationProtectionEnforcementLevel value) {
        this.backingStore.set("enforcementLevel", value);
    }
    /**
     * Sets the enterpriseDomain property value. Primary enterprise domain
     * @param value Value to set for the enterpriseDomain property.
     */
    public void setEnterpriseDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enterpriseDomain", value);
    }
    /**
     * Sets the enterpriseInternalProxyServers property value. This is the comma-separated list of internal proxy servers. For example, '157.54.14.28, 157.54.11.118, 10.202.14.167, 157.53.14.163, 157.69.210.59'. These proxies have been configured by the admin to connect to specific resources on the Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the EnterpriseProxiedDomains policy to force traffic to the matched domains through these proxies
     * @param value Value to set for the enterpriseInternalProxyServers property.
     */
    public void setEnterpriseInternalProxyServers(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionResourceCollection> value) {
        this.backingStore.set("enterpriseInternalProxyServers", value);
    }
    /**
     * Sets the enterpriseIPRanges property value. Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers will be considered part of the enterprise and protected. These locations will be considered a safe destination for enterprise data to be shared to
     * @param value Value to set for the enterpriseIPRanges property.
     */
    public void setEnterpriseIPRanges(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionIPRangeCollection> value) {
        this.backingStore.set("enterpriseIPRanges", value);
    }
    /**
     * Sets the enterpriseIPRangesAreAuthoritative property value. Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other subnets. Default is false
     * @param value Value to set for the enterpriseIPRangesAreAuthoritative property.
     */
    public void setEnterpriseIPRangesAreAuthoritative(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enterpriseIPRangesAreAuthoritative", value);
    }
    /**
     * Sets the enterpriseNetworkDomainNames property value. This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent to a device will be considered enterprise data and protected These locations will be considered a safe destination for enterprise data to be shared to
     * @param value Value to set for the enterpriseNetworkDomainNames property.
     */
    public void setEnterpriseNetworkDomainNames(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionResourceCollection> value) {
        this.backingStore.set("enterpriseNetworkDomainNames", value);
    }
    /**
     * Sets the enterpriseProtectedDomainNames property value. List of enterprise domains to be protected
     * @param value Value to set for the enterpriseProtectedDomainNames property.
     */
    public void setEnterpriseProtectedDomainNames(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionResourceCollection> value) {
        this.backingStore.set("enterpriseProtectedDomainNames", value);
    }
    /**
     * Sets the enterpriseProxiedDomains property value. Contains a list of Enterprise resource domains hosted in the cloud that need to be protected. Connections to these resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this purpose must also be configured using the EnterpriseInternalProxyServers policy
     * @param value Value to set for the enterpriseProxiedDomains property.
     */
    public void setEnterpriseProxiedDomains(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionProxiedDomainCollection> value) {
        this.backingStore.set("enterpriseProxiedDomains", value);
    }
    /**
     * Sets the enterpriseProxyServers property value. This is a list of proxy servers. Any server not on this list is considered non-enterprise
     * @param value Value to set for the enterpriseProxyServers property.
     */
    public void setEnterpriseProxyServers(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionResourceCollection> value) {
        this.backingStore.set("enterpriseProxyServers", value);
    }
    /**
     * Sets the enterpriseProxyServersAreAuthoritative property value. Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies. Default is false
     * @param value Value to set for the enterpriseProxyServersAreAuthoritative property.
     */
    public void setEnterpriseProxyServersAreAuthoritative(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enterpriseProxyServersAreAuthoritative", value);
    }
    /**
     * Sets the exemptAppLockerFiles property value. Another way to input exempt apps through xml files
     * @param value Value to set for the exemptAppLockerFiles property.
     */
    public void setExemptAppLockerFiles(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionAppLockerFile> value) {
        this.backingStore.set("exemptAppLockerFiles", value);
    }
    /**
     * Sets the exemptApps property value. Exempt applications can also access enterprise data, but the data handled by those applications are not protected. This is because some critical enterprise applications may have compatibility problems with encrypted data.
     * @param value Value to set for the exemptApps property.
     */
    public void setExemptApps(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionApp> value) {
        this.backingStore.set("exemptApps", value);
    }
    /**
     * Sets the iconsVisible property value. Determines whether overlays are added to icons for WIP protected files in Explorer and enterprise only app tiles in the Start menu. Starting in Windows 10, version 1703 this setting also configures the visibility of the WIP icon in the title bar of a WIP-protected app
     * @param value Value to set for the iconsVisible property.
     */
    public void setIconsVisible(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iconsVisible", value);
    }
    /**
     * Sets the indexingEncryptedStoresOrItemsBlocked property value. This switch is for the Windows Search Indexer, to allow or disallow indexing of items
     * @param value Value to set for the indexingEncryptedStoresOrItemsBlocked property.
     */
    public void setIndexingEncryptedStoresOrItemsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("indexingEncryptedStoresOrItemsBlocked", value);
    }
    /**
     * Sets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @param value Value to set for the isAssigned property.
     */
    public void setIsAssigned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAssigned", value);
    }
    /**
     * Sets the neutralDomainResources property value. List of domain names that can used for work or personal resource
     * @param value Value to set for the neutralDomainResources property.
     */
    public void setNeutralDomainResources(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionResourceCollection> value) {
        this.backingStore.set("neutralDomainResources", value);
    }
    /**
     * Sets the protectedAppLockerFiles property value. Another way to input protected apps through xml files
     * @param value Value to set for the protectedAppLockerFiles property.
     */
    public void setProtectedAppLockerFiles(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionAppLockerFile> value) {
        this.backingStore.set("protectedAppLockerFiles", value);
    }
    /**
     * Sets the protectedApps property value. Protected applications can access enterprise data and the data handled by those applications are protected with encryption
     * @param value Value to set for the protectedApps property.
     */
    public void setProtectedApps(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionApp> value) {
        this.backingStore.set("protectedApps", value);
    }
    /**
     * Sets the protectionUnderLockConfigRequired property value. Specifies whether the protection under lock feature (also known as encrypt under pin) should be configured
     * @param value Value to set for the protectionUnderLockConfigRequired property.
     */
    public void setProtectionUnderLockConfigRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("protectionUnderLockConfigRequired", value);
    }
    /**
     * Sets the revokeOnUnenrollDisabled property value. This policy controls whether to revoke the WIP keys when a device unenrolls from the management service. If set to 1 (Don't revoke keys), the keys will not be revoked and the user will continue to have access to protected files after unenrollment. If the keys are not revoked, there will be no revoked file cleanup subsequently.
     * @param value Value to set for the revokeOnUnenrollDisabled property.
     */
    public void setRevokeOnUnenrollDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("revokeOnUnenrollDisabled", value);
    }
    /**
     * Sets the rightsManagementServicesTemplateId property value. TemplateID GUID to use for RMS encryption. The RMS template allows the IT admin to configure the details about who has access to RMS-protected file and how long they have access
     * @param value Value to set for the rightsManagementServicesTemplateId property.
     */
    public void setRightsManagementServicesTemplateId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("rightsManagementServicesTemplateId", value);
    }
    /**
     * Sets the smbAutoEncryptedFileExtensions property value. Specifies a list of file extensions, so that files with these extensions are encrypted when copying from an SMB share within the corporate boundary
     * @param value Value to set for the smbAutoEncryptedFileExtensions property.
     */
    public void setSmbAutoEncryptedFileExtensions(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionResourceCollection> value) {
        this.backingStore.set("smbAutoEncryptedFileExtensions", value);
    }
}
