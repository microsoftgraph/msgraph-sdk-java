package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsInformationProtection extends ManagedAppPolicy implements Parsable {
    /** Navigation property to list of security groups targeted for policy. */
    private java.util.List<TargetedManagedAppPolicyAssignment> _assignments;
    /** Specifies whether to allow Azure RMS encryption for WIP */
    private Boolean _azureRightsManagementServicesAllowed;
    /** Specifies a recovery certificate that can be used for data recovery of encrypted files. This is the same as the data recovery agent(DRA) certificate for encrypting file system(EFS) */
    private WindowsInformationProtectionDataRecoveryCertificate _dataRecoveryCertificate;
    /** Possible values for WIP Protection enforcement levels */
    private WindowsInformationProtectionEnforcementLevel _enforcementLevel;
    /** Primary enterprise domain */
    private String _enterpriseDomain;
    /** This is the comma-separated list of internal proxy servers. For example, '157.54.14.28, 157.54.11.118, 10.202.14.167, 157.53.14.163, 157.69.210.59'. These proxies have been configured by the admin to connect to specific resources on the Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the EnterpriseProxiedDomains policy to force traffic to the matched domains through these proxies */
    private java.util.List<WindowsInformationProtectionResourceCollection> _enterpriseInternalProxyServers;
    /** Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers will be considered part of the enterprise and protected. These locations will be considered a safe destination for enterprise data to be shared to */
    private java.util.List<WindowsInformationProtectionIPRangeCollection> _enterpriseIPRanges;
    /** Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other subnets. Default is false */
    private Boolean _enterpriseIPRangesAreAuthoritative;
    /** This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent to a device will be considered enterprise data and protected These locations will be considered a safe destination for enterprise data to be shared to */
    private java.util.List<WindowsInformationProtectionResourceCollection> _enterpriseNetworkDomainNames;
    /** List of enterprise domains to be protected */
    private java.util.List<WindowsInformationProtectionResourceCollection> _enterpriseProtectedDomainNames;
    /** Contains a list of Enterprise resource domains hosted in the cloud that need to be protected. Connections to these resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this purpose must also be configured using the EnterpriseInternalProxyServers policy */
    private java.util.List<WindowsInformationProtectionProxiedDomainCollection> _enterpriseProxiedDomains;
    /** This is a list of proxy servers. Any server not on this list is considered non-enterprise */
    private java.util.List<WindowsInformationProtectionResourceCollection> _enterpriseProxyServers;
    /** Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies. Default is false */
    private Boolean _enterpriseProxyServersAreAuthoritative;
    /** Another way to input exempt apps through xml files */
    private java.util.List<WindowsInformationProtectionAppLockerFile> _exemptAppLockerFiles;
    /** Exempt applications can also access enterprise data, but the data handled by those applications are not protected. This is because some critical enterprise applications may have compatibility problems with encrypted data. */
    private java.util.List<WindowsInformationProtectionApp> _exemptApps;
    /** Determines whether overlays are added to icons for WIP protected files in Explorer and enterprise only app tiles in the Start menu. Starting in Windows 10, version 1703 this setting also configures the visibility of the WIP icon in the title bar of a WIP-protected app */
    private Boolean _iconsVisible;
    /** This switch is for the Windows Search Indexer, to allow or disallow indexing of items */
    private Boolean _indexingEncryptedStoresOrItemsBlocked;
    /** Indicates if the policy is deployed to any inclusion groups or not. */
    private Boolean _isAssigned;
    /** List of domain names that can used for work or personal resource */
    private java.util.List<WindowsInformationProtectionResourceCollection> _neutralDomainResources;
    /** Another way to input protected apps through xml files */
    private java.util.List<WindowsInformationProtectionAppLockerFile> _protectedAppLockerFiles;
    /** Protected applications can access enterprise data and the data handled by those applications are protected with encryption */
    private java.util.List<WindowsInformationProtectionApp> _protectedApps;
    /** Specifies whether the protection under lock feature (also known as encrypt under pin) should be configured */
    private Boolean _protectionUnderLockConfigRequired;
    /** This policy controls whether to revoke the WIP keys when a device unenrolls from the management service. If set to 1 (Don't revoke keys), the keys will not be revoked and the user will continue to have access to protected files after unenrollment. If the keys are not revoked, there will be no revoked file cleanup subsequently. */
    private Boolean _revokeOnUnenrollDisabled;
    /** TemplateID GUID to use for RMS encryption. The RMS template allows the IT admin to configure the details about who has access to RMS-protected file and how long they have access */
    private String _rightsManagementServicesTemplateId;
    /** Specifies a list of file extensions, so that files with these extensions are encrypted when copying from an SMB share within the corporate boundary */
    private java.util.List<WindowsInformationProtectionResourceCollection> _smbAutoEncryptedFileExtensions;
    /**
     * Instantiates a new WindowsInformationProtection and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static WindowsInformationProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a targetedManagedAppPolicyAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<TargetedManagedAppPolicyAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the azureRightsManagementServicesAllowed property value. Specifies whether to allow Azure RMS encryption for WIP
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAzureRightsManagementServicesAllowed() {
        return this._azureRightsManagementServicesAllowed;
    }
    /**
     * Gets the dataRecoveryCertificate property value. Specifies a recovery certificate that can be used for data recovery of encrypted files. This is the same as the data recovery agent(DRA) certificate for encrypting file system(EFS)
     * @return a windowsInformationProtectionDataRecoveryCertificate
     */
    @javax.annotation.Nullable
    public WindowsInformationProtectionDataRecoveryCertificate getDataRecoveryCertificate() {
        return this._dataRecoveryCertificate;
    }
    /**
     * Gets the enforcementLevel property value. Possible values for WIP Protection enforcement levels
     * @return a windowsInformationProtectionEnforcementLevel
     */
    @javax.annotation.Nullable
    public WindowsInformationProtectionEnforcementLevel getEnforcementLevel() {
        return this._enforcementLevel;
    }
    /**
     * Gets the enterpriseDomain property value. Primary enterprise domain
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseDomain() {
        return this._enterpriseDomain;
    }
    /**
     * Gets the enterpriseInternalProxyServers property value. This is the comma-separated list of internal proxy servers. For example, '157.54.14.28, 157.54.11.118, 10.202.14.167, 157.53.14.163, 157.69.210.59'. These proxies have been configured by the admin to connect to specific resources on the Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the EnterpriseProxiedDomains policy to force traffic to the matched domains through these proxies
     * @return a windowsInformationProtectionResourceCollection
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionResourceCollection> getEnterpriseInternalProxyServers() {
        return this._enterpriseInternalProxyServers;
    }
    /**
     * Gets the enterpriseIPRanges property value. Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers will be considered part of the enterprise and protected. These locations will be considered a safe destination for enterprise data to be shared to
     * @return a windowsInformationProtectionIPRangeCollection
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionIPRangeCollection> getEnterpriseIPRanges() {
        return this._enterpriseIPRanges;
    }
    /**
     * Gets the enterpriseIPRangesAreAuthoritative property value. Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other subnets. Default is false
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnterpriseIPRangesAreAuthoritative() {
        return this._enterpriseIPRangesAreAuthoritative;
    }
    /**
     * Gets the enterpriseNetworkDomainNames property value. This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent to a device will be considered enterprise data and protected These locations will be considered a safe destination for enterprise data to be shared to
     * @return a windowsInformationProtectionResourceCollection
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionResourceCollection> getEnterpriseNetworkDomainNames() {
        return this._enterpriseNetworkDomainNames;
    }
    /**
     * Gets the enterpriseProtectedDomainNames property value. List of enterprise domains to be protected
     * @return a windowsInformationProtectionResourceCollection
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionResourceCollection> getEnterpriseProtectedDomainNames() {
        return this._enterpriseProtectedDomainNames;
    }
    /**
     * Gets the enterpriseProxiedDomains property value. Contains a list of Enterprise resource domains hosted in the cloud that need to be protected. Connections to these resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this purpose must also be configured using the EnterpriseInternalProxyServers policy
     * @return a windowsInformationProtectionProxiedDomainCollection
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionProxiedDomainCollection> getEnterpriseProxiedDomains() {
        return this._enterpriseProxiedDomains;
    }
    /**
     * Gets the enterpriseProxyServers property value. This is a list of proxy servers. Any server not on this list is considered non-enterprise
     * @return a windowsInformationProtectionResourceCollection
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionResourceCollection> getEnterpriseProxyServers() {
        return this._enterpriseProxyServers;
    }
    /**
     * Gets the enterpriseProxyServersAreAuthoritative property value. Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies. Default is false
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnterpriseProxyServersAreAuthoritative() {
        return this._enterpriseProxyServersAreAuthoritative;
    }
    /**
     * Gets the exemptAppLockerFiles property value. Another way to input exempt apps through xml files
     * @return a windowsInformationProtectionAppLockerFile
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionAppLockerFile> getExemptAppLockerFiles() {
        return this._exemptAppLockerFiles;
    }
    /**
     * Gets the exemptApps property value. Exempt applications can also access enterprise data, but the data handled by those applications are not protected. This is because some critical enterprise applications may have compatibility problems with encrypted data.
     * @return a windowsInformationProtectionApp
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionApp> getExemptApps() {
        return this._exemptApps;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsInformationProtection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(TargetedManagedAppPolicyAssignment::createFromDiscriminatorValue)); });
            this.put("azureRightsManagementServicesAllowed", (n) -> { currentObject.setAzureRightsManagementServicesAllowed(n.getBooleanValue()); });
            this.put("dataRecoveryCertificate", (n) -> { currentObject.setDataRecoveryCertificate(n.getObjectValue(WindowsInformationProtectionDataRecoveryCertificate::createFromDiscriminatorValue)); });
            this.put("enforcementLevel", (n) -> { currentObject.setEnforcementLevel(n.getEnumValue(WindowsInformationProtectionEnforcementLevel.class)); });
            this.put("enterpriseDomain", (n) -> { currentObject.setEnterpriseDomain(n.getStringValue()); });
            this.put("enterpriseInternalProxyServers", (n) -> { currentObject.setEnterpriseInternalProxyServers(n.getCollectionOfObjectValues(WindowsInformationProtectionResourceCollection::createFromDiscriminatorValue)); });
            this.put("enterpriseIPRanges", (n) -> { currentObject.setEnterpriseIPRanges(n.getCollectionOfObjectValues(WindowsInformationProtectionIPRangeCollection::createFromDiscriminatorValue)); });
            this.put("enterpriseIPRangesAreAuthoritative", (n) -> { currentObject.setEnterpriseIPRangesAreAuthoritative(n.getBooleanValue()); });
            this.put("enterpriseNetworkDomainNames", (n) -> { currentObject.setEnterpriseNetworkDomainNames(n.getCollectionOfObjectValues(WindowsInformationProtectionResourceCollection::createFromDiscriminatorValue)); });
            this.put("enterpriseProtectedDomainNames", (n) -> { currentObject.setEnterpriseProtectedDomainNames(n.getCollectionOfObjectValues(WindowsInformationProtectionResourceCollection::createFromDiscriminatorValue)); });
            this.put("enterpriseProxiedDomains", (n) -> { currentObject.setEnterpriseProxiedDomains(n.getCollectionOfObjectValues(WindowsInformationProtectionProxiedDomainCollection::createFromDiscriminatorValue)); });
            this.put("enterpriseProxyServers", (n) -> { currentObject.setEnterpriseProxyServers(n.getCollectionOfObjectValues(WindowsInformationProtectionResourceCollection::createFromDiscriminatorValue)); });
            this.put("enterpriseProxyServersAreAuthoritative", (n) -> { currentObject.setEnterpriseProxyServersAreAuthoritative(n.getBooleanValue()); });
            this.put("exemptAppLockerFiles", (n) -> { currentObject.setExemptAppLockerFiles(n.getCollectionOfObjectValues(WindowsInformationProtectionAppLockerFile::createFromDiscriminatorValue)); });
            this.put("exemptApps", (n) -> { currentObject.setExemptApps(n.getCollectionOfObjectValues(WindowsInformationProtectionApp::createFromDiscriminatorValue)); });
            this.put("iconsVisible", (n) -> { currentObject.setIconsVisible(n.getBooleanValue()); });
            this.put("indexingEncryptedStoresOrItemsBlocked", (n) -> { currentObject.setIndexingEncryptedStoresOrItemsBlocked(n.getBooleanValue()); });
            this.put("isAssigned", (n) -> { currentObject.setIsAssigned(n.getBooleanValue()); });
            this.put("neutralDomainResources", (n) -> { currentObject.setNeutralDomainResources(n.getCollectionOfObjectValues(WindowsInformationProtectionResourceCollection::createFromDiscriminatorValue)); });
            this.put("protectedAppLockerFiles", (n) -> { currentObject.setProtectedAppLockerFiles(n.getCollectionOfObjectValues(WindowsInformationProtectionAppLockerFile::createFromDiscriminatorValue)); });
            this.put("protectedApps", (n) -> { currentObject.setProtectedApps(n.getCollectionOfObjectValues(WindowsInformationProtectionApp::createFromDiscriminatorValue)); });
            this.put("protectionUnderLockConfigRequired", (n) -> { currentObject.setProtectionUnderLockConfigRequired(n.getBooleanValue()); });
            this.put("revokeOnUnenrollDisabled", (n) -> { currentObject.setRevokeOnUnenrollDisabled(n.getBooleanValue()); });
            this.put("rightsManagementServicesTemplateId", (n) -> { currentObject.setRightsManagementServicesTemplateId(n.getStringValue()); });
            this.put("smbAutoEncryptedFileExtensions", (n) -> { currentObject.setSmbAutoEncryptedFileExtensions(n.getCollectionOfObjectValues(WindowsInformationProtectionResourceCollection::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the iconsVisible property value. Determines whether overlays are added to icons for WIP protected files in Explorer and enterprise only app tiles in the Start menu. Starting in Windows 10, version 1703 this setting also configures the visibility of the WIP icon in the title bar of a WIP-protected app
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIconsVisible() {
        return this._iconsVisible;
    }
    /**
     * Gets the indexingEncryptedStoresOrItemsBlocked property value. This switch is for the Windows Search Indexer, to allow or disallow indexing of items
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIndexingEncryptedStoresOrItemsBlocked() {
        return this._indexingEncryptedStoresOrItemsBlocked;
    }
    /**
     * Gets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAssigned() {
        return this._isAssigned;
    }
    /**
     * Gets the neutralDomainResources property value. List of domain names that can used for work or personal resource
     * @return a windowsInformationProtectionResourceCollection
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionResourceCollection> getNeutralDomainResources() {
        return this._neutralDomainResources;
    }
    /**
     * Gets the protectedAppLockerFiles property value. Another way to input protected apps through xml files
     * @return a windowsInformationProtectionAppLockerFile
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionAppLockerFile> getProtectedAppLockerFiles() {
        return this._protectedAppLockerFiles;
    }
    /**
     * Gets the protectedApps property value. Protected applications can access enterprise data and the data handled by those applications are protected with encryption
     * @return a windowsInformationProtectionApp
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionApp> getProtectedApps() {
        return this._protectedApps;
    }
    /**
     * Gets the protectionUnderLockConfigRequired property value. Specifies whether the protection under lock feature (also known as encrypt under pin) should be configured
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getProtectionUnderLockConfigRequired() {
        return this._protectionUnderLockConfigRequired;
    }
    /**
     * Gets the revokeOnUnenrollDisabled property value. This policy controls whether to revoke the WIP keys when a device unenrolls from the management service. If set to 1 (Don't revoke keys), the keys will not be revoked and the user will continue to have access to protected files after unenrollment. If the keys are not revoked, there will be no revoked file cleanup subsequently.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRevokeOnUnenrollDisabled() {
        return this._revokeOnUnenrollDisabled;
    }
    /**
     * Gets the rightsManagementServicesTemplateId property value. TemplateID GUID to use for RMS encryption. The RMS template allows the IT admin to configure the details about who has access to RMS-protected file and how long they have access
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRightsManagementServicesTemplateId() {
        return this._rightsManagementServicesTemplateId;
    }
    /**
     * Gets the smbAutoEncryptedFileExtensions property value. Specifies a list of file extensions, so that files with these extensions are encrypted when copying from an SMB share within the corporate boundary
     * @return a windowsInformationProtectionResourceCollection
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsInformationProtectionResourceCollection> getSmbAutoEncryptedFileExtensions() {
        return this._smbAutoEncryptedFileExtensions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeStringValue("rightsManagementServicesTemplateId", this.getRightsManagementServicesTemplateId());
        writer.writeCollectionOfObjectValues("smbAutoEncryptedFileExtensions", this.getSmbAutoEncryptedFileExtensions());
    }
    /**
     * Sets the assignments property value. Navigation property to list of security groups targeted for policy.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<TargetedManagedAppPolicyAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the azureRightsManagementServicesAllowed property value. Specifies whether to allow Azure RMS encryption for WIP
     * @param value Value to set for the azureRightsManagementServicesAllowed property.
     * @return a void
     */
    public void setAzureRightsManagementServicesAllowed(@javax.annotation.Nullable final Boolean value) {
        this._azureRightsManagementServicesAllowed = value;
    }
    /**
     * Sets the dataRecoveryCertificate property value. Specifies a recovery certificate that can be used for data recovery of encrypted files. This is the same as the data recovery agent(DRA) certificate for encrypting file system(EFS)
     * @param value Value to set for the dataRecoveryCertificate property.
     * @return a void
     */
    public void setDataRecoveryCertificate(@javax.annotation.Nullable final WindowsInformationProtectionDataRecoveryCertificate value) {
        this._dataRecoveryCertificate = value;
    }
    /**
     * Sets the enforcementLevel property value. Possible values for WIP Protection enforcement levels
     * @param value Value to set for the enforcementLevel property.
     * @return a void
     */
    public void setEnforcementLevel(@javax.annotation.Nullable final WindowsInformationProtectionEnforcementLevel value) {
        this._enforcementLevel = value;
    }
    /**
     * Sets the enterpriseDomain property value. Primary enterprise domain
     * @param value Value to set for the enterpriseDomain property.
     * @return a void
     */
    public void setEnterpriseDomain(@javax.annotation.Nullable final String value) {
        this._enterpriseDomain = value;
    }
    /**
     * Sets the enterpriseInternalProxyServers property value. This is the comma-separated list of internal proxy servers. For example, '157.54.14.28, 157.54.11.118, 10.202.14.167, 157.53.14.163, 157.69.210.59'. These proxies have been configured by the admin to connect to specific resources on the Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the EnterpriseProxiedDomains policy to force traffic to the matched domains through these proxies
     * @param value Value to set for the enterpriseInternalProxyServers property.
     * @return a void
     */
    public void setEnterpriseInternalProxyServers(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionResourceCollection> value) {
        this._enterpriseInternalProxyServers = value;
    }
    /**
     * Sets the enterpriseIPRanges property value. Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers will be considered part of the enterprise and protected. These locations will be considered a safe destination for enterprise data to be shared to
     * @param value Value to set for the enterpriseIPRanges property.
     * @return a void
     */
    public void setEnterpriseIPRanges(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionIPRangeCollection> value) {
        this._enterpriseIPRanges = value;
    }
    /**
     * Sets the enterpriseIPRangesAreAuthoritative property value. Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other subnets. Default is false
     * @param value Value to set for the enterpriseIPRangesAreAuthoritative property.
     * @return a void
     */
    public void setEnterpriseIPRangesAreAuthoritative(@javax.annotation.Nullable final Boolean value) {
        this._enterpriseIPRangesAreAuthoritative = value;
    }
    /**
     * Sets the enterpriseNetworkDomainNames property value. This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent to a device will be considered enterprise data and protected These locations will be considered a safe destination for enterprise data to be shared to
     * @param value Value to set for the enterpriseNetworkDomainNames property.
     * @return a void
     */
    public void setEnterpriseNetworkDomainNames(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionResourceCollection> value) {
        this._enterpriseNetworkDomainNames = value;
    }
    /**
     * Sets the enterpriseProtectedDomainNames property value. List of enterprise domains to be protected
     * @param value Value to set for the enterpriseProtectedDomainNames property.
     * @return a void
     */
    public void setEnterpriseProtectedDomainNames(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionResourceCollection> value) {
        this._enterpriseProtectedDomainNames = value;
    }
    /**
     * Sets the enterpriseProxiedDomains property value. Contains a list of Enterprise resource domains hosted in the cloud that need to be protected. Connections to these resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this purpose must also be configured using the EnterpriseInternalProxyServers policy
     * @param value Value to set for the enterpriseProxiedDomains property.
     * @return a void
     */
    public void setEnterpriseProxiedDomains(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionProxiedDomainCollection> value) {
        this._enterpriseProxiedDomains = value;
    }
    /**
     * Sets the enterpriseProxyServers property value. This is a list of proxy servers. Any server not on this list is considered non-enterprise
     * @param value Value to set for the enterpriseProxyServers property.
     * @return a void
     */
    public void setEnterpriseProxyServers(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionResourceCollection> value) {
        this._enterpriseProxyServers = value;
    }
    /**
     * Sets the enterpriseProxyServersAreAuthoritative property value. Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies. Default is false
     * @param value Value to set for the enterpriseProxyServersAreAuthoritative property.
     * @return a void
     */
    public void setEnterpriseProxyServersAreAuthoritative(@javax.annotation.Nullable final Boolean value) {
        this._enterpriseProxyServersAreAuthoritative = value;
    }
    /**
     * Sets the exemptAppLockerFiles property value. Another way to input exempt apps through xml files
     * @param value Value to set for the exemptAppLockerFiles property.
     * @return a void
     */
    public void setExemptAppLockerFiles(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionAppLockerFile> value) {
        this._exemptAppLockerFiles = value;
    }
    /**
     * Sets the exemptApps property value. Exempt applications can also access enterprise data, but the data handled by those applications are not protected. This is because some critical enterprise applications may have compatibility problems with encrypted data.
     * @param value Value to set for the exemptApps property.
     * @return a void
     */
    public void setExemptApps(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionApp> value) {
        this._exemptApps = value;
    }
    /**
     * Sets the iconsVisible property value. Determines whether overlays are added to icons for WIP protected files in Explorer and enterprise only app tiles in the Start menu. Starting in Windows 10, version 1703 this setting also configures the visibility of the WIP icon in the title bar of a WIP-protected app
     * @param value Value to set for the iconsVisible property.
     * @return a void
     */
    public void setIconsVisible(@javax.annotation.Nullable final Boolean value) {
        this._iconsVisible = value;
    }
    /**
     * Sets the indexingEncryptedStoresOrItemsBlocked property value. This switch is for the Windows Search Indexer, to allow or disallow indexing of items
     * @param value Value to set for the indexingEncryptedStoresOrItemsBlocked property.
     * @return a void
     */
    public void setIndexingEncryptedStoresOrItemsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._indexingEncryptedStoresOrItemsBlocked = value;
    }
    /**
     * Sets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @param value Value to set for the isAssigned property.
     * @return a void
     */
    public void setIsAssigned(@javax.annotation.Nullable final Boolean value) {
        this._isAssigned = value;
    }
    /**
     * Sets the neutralDomainResources property value. List of domain names that can used for work or personal resource
     * @param value Value to set for the neutralDomainResources property.
     * @return a void
     */
    public void setNeutralDomainResources(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionResourceCollection> value) {
        this._neutralDomainResources = value;
    }
    /**
     * Sets the protectedAppLockerFiles property value. Another way to input protected apps through xml files
     * @param value Value to set for the protectedAppLockerFiles property.
     * @return a void
     */
    public void setProtectedAppLockerFiles(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionAppLockerFile> value) {
        this._protectedAppLockerFiles = value;
    }
    /**
     * Sets the protectedApps property value. Protected applications can access enterprise data and the data handled by those applications are protected with encryption
     * @param value Value to set for the protectedApps property.
     * @return a void
     */
    public void setProtectedApps(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionApp> value) {
        this._protectedApps = value;
    }
    /**
     * Sets the protectionUnderLockConfigRequired property value. Specifies whether the protection under lock feature (also known as encrypt under pin) should be configured
     * @param value Value to set for the protectionUnderLockConfigRequired property.
     * @return a void
     */
    public void setProtectionUnderLockConfigRequired(@javax.annotation.Nullable final Boolean value) {
        this._protectionUnderLockConfigRequired = value;
    }
    /**
     * Sets the revokeOnUnenrollDisabled property value. This policy controls whether to revoke the WIP keys when a device unenrolls from the management service. If set to 1 (Don't revoke keys), the keys will not be revoked and the user will continue to have access to protected files after unenrollment. If the keys are not revoked, there will be no revoked file cleanup subsequently.
     * @param value Value to set for the revokeOnUnenrollDisabled property.
     * @return a void
     */
    public void setRevokeOnUnenrollDisabled(@javax.annotation.Nullable final Boolean value) {
        this._revokeOnUnenrollDisabled = value;
    }
    /**
     * Sets the rightsManagementServicesTemplateId property value. TemplateID GUID to use for RMS encryption. The RMS template allows the IT admin to configure the details about who has access to RMS-protected file and how long they have access
     * @param value Value to set for the rightsManagementServicesTemplateId property.
     * @return a void
     */
    public void setRightsManagementServicesTemplateId(@javax.annotation.Nullable final String value) {
        this._rightsManagementServicesTemplateId = value;
    }
    /**
     * Sets the smbAutoEncryptedFileExtensions property value. Specifies a list of file extensions, so that files with these extensions are encrypted when copying from an SMB share within the corporate boundary
     * @param value Value to set for the smbAutoEncryptedFileExtensions property.
     * @return a void
     */
    public void setSmbAutoEncryptedFileExtensions(@javax.annotation.Nullable final java.util.List<WindowsInformationProtectionResourceCollection> value) {
        this._smbAutoEncryptedFileExtensions = value;
    }
}
