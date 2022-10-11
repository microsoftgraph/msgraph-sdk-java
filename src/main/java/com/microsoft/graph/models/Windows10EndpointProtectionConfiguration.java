package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10EndpointProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /** Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.) */
    private Boolean _applicationGuardAllowPersistence;
    /** Allow printing to Local Printers from Container */
    private Boolean _applicationGuardAllowPrintToLocalPrinters;
    /** Allow printing to Network Printers from Container */
    private Boolean _applicationGuardAllowPrintToNetworkPrinters;
    /** Allow printing to PDF from Container */
    private Boolean _applicationGuardAllowPrintToPDF;
    /** Allow printing to XPS from Container */
    private Boolean _applicationGuardAllowPrintToXPS;
    /** Possible values for applicationGuardBlockClipboardSharingType */
    private ApplicationGuardBlockClipboardSharingType _applicationGuardBlockClipboardSharing;
    /** Possible values for applicationGuardBlockFileTransfer */
    private ApplicationGuardBlockFileTransferType _applicationGuardBlockFileTransfer;
    /** Block enterprise sites to load non-enterprise content, such as third party plug-ins */
    private Boolean _applicationGuardBlockNonEnterpriseContent;
    /** Enable Windows Defender Application Guard */
    private Boolean _applicationGuardEnabled;
    /** Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.) */
    private Boolean _applicationGuardForceAuditing;
    /** Possible values of AppLocker Application Control Types */
    private AppLockerApplicationControlType _appLockerApplicationControl;
    /** Allows the Admin to disable the warning prompt for other disk encryption on the user machines. */
    private Boolean _bitLockerDisableWarningForOtherDiskEncryption;
    /** Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU. */
    private Boolean _bitLockerEnableStorageCardEncryptionOnMobile;
    /** Allows the admin to require encryption to be turned on using BitLocker. */
    private Boolean _bitLockerEncryptDevice;
    /** BitLocker Removable Drive Policy. */
    private BitLockerRemovableDrivePolicy _bitLockerRemovableDrivePolicy;
    /** List of folder paths to be added to the list of protected folders */
    private java.util.List<String> _defenderAdditionalGuardedFolders;
    /** List of exe files and folders to be excluded from attack surface reduction rules */
    private java.util.List<String> _defenderAttackSurfaceReductionExcludedPaths;
    /** Xml content containing information regarding exploit protection details. */
    private byte[] _defenderExploitProtectionXml;
    /** Name of the file from which DefenderExploitProtectionXml was obtained. */
    private String _defenderExploitProtectionXmlFileName;
    /** List of paths to exe that are allowed to access protected folders */
    private java.util.List<String> _defenderGuardedFoldersAllowedAppPaths;
    /** Indicates whether or not to block user from overriding Exploit Protection settings. */
    private Boolean _defenderSecurityCenterBlockExploitProtectionOverride;
    /** Blocks stateful FTP connections to the device */
    private Boolean _firewallBlockStatefulFTP;
    /** Possible values for firewallCertificateRevocationListCheckMethod */
    private FirewallCertificateRevocationListCheckMethodType _firewallCertificateRevocationListCheckMethod;
    /** Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600 */
    private Integer _firewallIdleTimeoutForSecurityAssociationInSeconds;
    /** Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic */
    private Boolean _firewallIPSecExemptionsAllowDHCP;
    /** Configures IPSec exemptions to allow ICMP */
    private Boolean _firewallIPSecExemptionsAllowICMP;
    /** Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes */
    private Boolean _firewallIPSecExemptionsAllowNeighborDiscovery;
    /** Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes */
    private Boolean _firewallIPSecExemptionsAllowRouterDiscovery;
    /** If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set */
    private Boolean _firewallMergeKeyingModuleSettings;
    /** Possible values for firewallPacketQueueingMethod */
    private FirewallPacketQueueingMethodType _firewallPacketQueueingMethod;
    /** Possible values for firewallPreSharedKeyEncodingMethod */
    private FirewallPreSharedKeyEncodingMethodType _firewallPreSharedKeyEncodingMethod;
    /** Configures the firewall profile settings for domain networks */
    private WindowsFirewallNetworkProfile _firewallProfileDomain;
    /** Configures the firewall profile settings for private networks */
    private WindowsFirewallNetworkProfile _firewallProfilePrivate;
    /** Configures the firewall profile settings for public networks */
    private WindowsFirewallNetworkProfile _firewallProfilePublic;
    /** Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files. */
    private Boolean _smartScreenBlockOverrideForFiles;
    /** Allows IT Admins to configure SmartScreen for Windows. */
    private Boolean _smartScreenEnableInShell;
    /**
     * Instantiates a new Windows10EndpointProtectionConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows10EndpointProtectionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10EndpointProtectionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10EndpointProtectionConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows10EndpointProtectionConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EndpointProtectionConfiguration();
    }
    /**
     * Gets the applicationGuardAllowPersistence property value. Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPersistence() {
        return this._applicationGuardAllowPersistence;
    }
    /**
     * Gets the applicationGuardAllowPrintToLocalPrinters property value. Allow printing to Local Printers from Container
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToLocalPrinters() {
        return this._applicationGuardAllowPrintToLocalPrinters;
    }
    /**
     * Gets the applicationGuardAllowPrintToNetworkPrinters property value. Allow printing to Network Printers from Container
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToNetworkPrinters() {
        return this._applicationGuardAllowPrintToNetworkPrinters;
    }
    /**
     * Gets the applicationGuardAllowPrintToPDF property value. Allow printing to PDF from Container
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToPDF() {
        return this._applicationGuardAllowPrintToPDF;
    }
    /**
     * Gets the applicationGuardAllowPrintToXPS property value. Allow printing to XPS from Container
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToXPS() {
        return this._applicationGuardAllowPrintToXPS;
    }
    /**
     * Gets the applicationGuardBlockClipboardSharing property value. Possible values for applicationGuardBlockClipboardSharingType
     * @return a applicationGuardBlockClipboardSharingType
     */
    @javax.annotation.Nullable
    public ApplicationGuardBlockClipboardSharingType getApplicationGuardBlockClipboardSharing() {
        return this._applicationGuardBlockClipboardSharing;
    }
    /**
     * Gets the applicationGuardBlockFileTransfer property value. Possible values for applicationGuardBlockFileTransfer
     * @return a applicationGuardBlockFileTransferType
     */
    @javax.annotation.Nullable
    public ApplicationGuardBlockFileTransferType getApplicationGuardBlockFileTransfer() {
        return this._applicationGuardBlockFileTransfer;
    }
    /**
     * Gets the applicationGuardBlockNonEnterpriseContent property value. Block enterprise sites to load non-enterprise content, such as third party plug-ins
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardBlockNonEnterpriseContent() {
        return this._applicationGuardBlockNonEnterpriseContent;
    }
    /**
     * Gets the applicationGuardEnabled property value. Enable Windows Defender Application Guard
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardEnabled() {
        return this._applicationGuardEnabled;
    }
    /**
     * Gets the applicationGuardForceAuditing property value. Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardForceAuditing() {
        return this._applicationGuardForceAuditing;
    }
    /**
     * Gets the appLockerApplicationControl property value. Possible values of AppLocker Application Control Types
     * @return a appLockerApplicationControlType
     */
    @javax.annotation.Nullable
    public AppLockerApplicationControlType getAppLockerApplicationControl() {
        return this._appLockerApplicationControl;
    }
    /**
     * Gets the bitLockerDisableWarningForOtherDiskEncryption property value. Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerDisableWarningForOtherDiskEncryption() {
        return this._bitLockerDisableWarningForOtherDiskEncryption;
    }
    /**
     * Gets the bitLockerEnableStorageCardEncryptionOnMobile property value. Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerEnableStorageCardEncryptionOnMobile() {
        return this._bitLockerEnableStorageCardEncryptionOnMobile;
    }
    /**
     * Gets the bitLockerEncryptDevice property value. Allows the admin to require encryption to be turned on using BitLocker.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerEncryptDevice() {
        return this._bitLockerEncryptDevice;
    }
    /**
     * Gets the bitLockerRemovableDrivePolicy property value. BitLocker Removable Drive Policy.
     * @return a bitLockerRemovableDrivePolicy
     */
    @javax.annotation.Nullable
    public BitLockerRemovableDrivePolicy getBitLockerRemovableDrivePolicy() {
        return this._bitLockerRemovableDrivePolicy;
    }
    /**
     * Gets the defenderAdditionalGuardedFolders property value. List of folder paths to be added to the list of protected folders
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderAdditionalGuardedFolders() {
        return this._defenderAdditionalGuardedFolders;
    }
    /**
     * Gets the defenderAttackSurfaceReductionExcludedPaths property value. List of exe files and folders to be excluded from attack surface reduction rules
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderAttackSurfaceReductionExcludedPaths() {
        return this._defenderAttackSurfaceReductionExcludedPaths;
    }
    /**
     * Gets the defenderExploitProtectionXml property value. Xml content containing information regarding exploit protection details.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getDefenderExploitProtectionXml() {
        return this._defenderExploitProtectionXml;
    }
    /**
     * Gets the defenderExploitProtectionXmlFileName property value. Name of the file from which DefenderExploitProtectionXml was obtained.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefenderExploitProtectionXmlFileName() {
        return this._defenderExploitProtectionXmlFileName;
    }
    /**
     * Gets the defenderGuardedFoldersAllowedAppPaths property value. List of paths to exe that are allowed to access protected folders
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderGuardedFoldersAllowedAppPaths() {
        return this._defenderGuardedFoldersAllowedAppPaths;
    }
    /**
     * Gets the defenderSecurityCenterBlockExploitProtectionOverride property value. Indicates whether or not to block user from overriding Exploit Protection settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterBlockExploitProtectionOverride() {
        return this._defenderSecurityCenterBlockExploitProtectionOverride;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10EndpointProtectionConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("applicationGuardAllowPersistence", (n) -> { currentObject.setApplicationGuardAllowPersistence(n.getBooleanValue()); });
            this.put("applicationGuardAllowPrintToLocalPrinters", (n) -> { currentObject.setApplicationGuardAllowPrintToLocalPrinters(n.getBooleanValue()); });
            this.put("applicationGuardAllowPrintToNetworkPrinters", (n) -> { currentObject.setApplicationGuardAllowPrintToNetworkPrinters(n.getBooleanValue()); });
            this.put("applicationGuardAllowPrintToPDF", (n) -> { currentObject.setApplicationGuardAllowPrintToPDF(n.getBooleanValue()); });
            this.put("applicationGuardAllowPrintToXPS", (n) -> { currentObject.setApplicationGuardAllowPrintToXPS(n.getBooleanValue()); });
            this.put("applicationGuardBlockClipboardSharing", (n) -> { currentObject.setApplicationGuardBlockClipboardSharing(n.getEnumValue(ApplicationGuardBlockClipboardSharingType.class)); });
            this.put("applicationGuardBlockFileTransfer", (n) -> { currentObject.setApplicationGuardBlockFileTransfer(n.getEnumValue(ApplicationGuardBlockFileTransferType.class)); });
            this.put("applicationGuardBlockNonEnterpriseContent", (n) -> { currentObject.setApplicationGuardBlockNonEnterpriseContent(n.getBooleanValue()); });
            this.put("applicationGuardEnabled", (n) -> { currentObject.setApplicationGuardEnabled(n.getBooleanValue()); });
            this.put("applicationGuardForceAuditing", (n) -> { currentObject.setApplicationGuardForceAuditing(n.getBooleanValue()); });
            this.put("appLockerApplicationControl", (n) -> { currentObject.setAppLockerApplicationControl(n.getEnumValue(AppLockerApplicationControlType.class)); });
            this.put("bitLockerDisableWarningForOtherDiskEncryption", (n) -> { currentObject.setBitLockerDisableWarningForOtherDiskEncryption(n.getBooleanValue()); });
            this.put("bitLockerEnableStorageCardEncryptionOnMobile", (n) -> { currentObject.setBitLockerEnableStorageCardEncryptionOnMobile(n.getBooleanValue()); });
            this.put("bitLockerEncryptDevice", (n) -> { currentObject.setBitLockerEncryptDevice(n.getBooleanValue()); });
            this.put("bitLockerRemovableDrivePolicy", (n) -> { currentObject.setBitLockerRemovableDrivePolicy(n.getObjectValue(BitLockerRemovableDrivePolicy::createFromDiscriminatorValue)); });
            this.put("defenderAdditionalGuardedFolders", (n) -> { currentObject.setDefenderAdditionalGuardedFolders(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defenderAttackSurfaceReductionExcludedPaths", (n) -> { currentObject.setDefenderAttackSurfaceReductionExcludedPaths(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defenderExploitProtectionXml", (n) -> { currentObject.setDefenderExploitProtectionXml(n.getByteArrayValue()); });
            this.put("defenderExploitProtectionXmlFileName", (n) -> { currentObject.setDefenderExploitProtectionXmlFileName(n.getStringValue()); });
            this.put("defenderGuardedFoldersAllowedAppPaths", (n) -> { currentObject.setDefenderGuardedFoldersAllowedAppPaths(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defenderSecurityCenterBlockExploitProtectionOverride", (n) -> { currentObject.setDefenderSecurityCenterBlockExploitProtectionOverride(n.getBooleanValue()); });
            this.put("firewallBlockStatefulFTP", (n) -> { currentObject.setFirewallBlockStatefulFTP(n.getBooleanValue()); });
            this.put("firewallCertificateRevocationListCheckMethod", (n) -> { currentObject.setFirewallCertificateRevocationListCheckMethod(n.getEnumValue(FirewallCertificateRevocationListCheckMethodType.class)); });
            this.put("firewallIdleTimeoutForSecurityAssociationInSeconds", (n) -> { currentObject.setFirewallIdleTimeoutForSecurityAssociationInSeconds(n.getIntegerValue()); });
            this.put("firewallIPSecExemptionsAllowDHCP", (n) -> { currentObject.setFirewallIPSecExemptionsAllowDHCP(n.getBooleanValue()); });
            this.put("firewallIPSecExemptionsAllowICMP", (n) -> { currentObject.setFirewallIPSecExemptionsAllowICMP(n.getBooleanValue()); });
            this.put("firewallIPSecExemptionsAllowNeighborDiscovery", (n) -> { currentObject.setFirewallIPSecExemptionsAllowNeighborDiscovery(n.getBooleanValue()); });
            this.put("firewallIPSecExemptionsAllowRouterDiscovery", (n) -> { currentObject.setFirewallIPSecExemptionsAllowRouterDiscovery(n.getBooleanValue()); });
            this.put("firewallMergeKeyingModuleSettings", (n) -> { currentObject.setFirewallMergeKeyingModuleSettings(n.getBooleanValue()); });
            this.put("firewallPacketQueueingMethod", (n) -> { currentObject.setFirewallPacketQueueingMethod(n.getEnumValue(FirewallPacketQueueingMethodType.class)); });
            this.put("firewallPreSharedKeyEncodingMethod", (n) -> { currentObject.setFirewallPreSharedKeyEncodingMethod(n.getEnumValue(FirewallPreSharedKeyEncodingMethodType.class)); });
            this.put("firewallProfileDomain", (n) -> { currentObject.setFirewallProfileDomain(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
            this.put("firewallProfilePrivate", (n) -> { currentObject.setFirewallProfilePrivate(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
            this.put("firewallProfilePublic", (n) -> { currentObject.setFirewallProfilePublic(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
            this.put("smartScreenBlockOverrideForFiles", (n) -> { currentObject.setSmartScreenBlockOverrideForFiles(n.getBooleanValue()); });
            this.put("smartScreenEnableInShell", (n) -> { currentObject.setSmartScreenEnableInShell(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the firewallBlockStatefulFTP property value. Blocks stateful FTP connections to the device
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallBlockStatefulFTP() {
        return this._firewallBlockStatefulFTP;
    }
    /**
     * Gets the firewallCertificateRevocationListCheckMethod property value. Possible values for firewallCertificateRevocationListCheckMethod
     * @return a firewallCertificateRevocationListCheckMethodType
     */
    @javax.annotation.Nullable
    public FirewallCertificateRevocationListCheckMethodType getFirewallCertificateRevocationListCheckMethod() {
        return this._firewallCertificateRevocationListCheckMethod;
    }
    /**
     * Gets the firewallIdleTimeoutForSecurityAssociationInSeconds property value. Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFirewallIdleTimeoutForSecurityAssociationInSeconds() {
        return this._firewallIdleTimeoutForSecurityAssociationInSeconds;
    }
    /**
     * Gets the firewallIPSecExemptionsAllowDHCP property value. Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowDHCP() {
        return this._firewallIPSecExemptionsAllowDHCP;
    }
    /**
     * Gets the firewallIPSecExemptionsAllowICMP property value. Configures IPSec exemptions to allow ICMP
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowICMP() {
        return this._firewallIPSecExemptionsAllowICMP;
    }
    /**
     * Gets the firewallIPSecExemptionsAllowNeighborDiscovery property value. Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowNeighborDiscovery() {
        return this._firewallIPSecExemptionsAllowNeighborDiscovery;
    }
    /**
     * Gets the firewallIPSecExemptionsAllowRouterDiscovery property value. Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowRouterDiscovery() {
        return this._firewallIPSecExemptionsAllowRouterDiscovery;
    }
    /**
     * Gets the firewallMergeKeyingModuleSettings property value. If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallMergeKeyingModuleSettings() {
        return this._firewallMergeKeyingModuleSettings;
    }
    /**
     * Gets the firewallPacketQueueingMethod property value. Possible values for firewallPacketQueueingMethod
     * @return a firewallPacketQueueingMethodType
     */
    @javax.annotation.Nullable
    public FirewallPacketQueueingMethodType getFirewallPacketQueueingMethod() {
        return this._firewallPacketQueueingMethod;
    }
    /**
     * Gets the firewallPreSharedKeyEncodingMethod property value. Possible values for firewallPreSharedKeyEncodingMethod
     * @return a firewallPreSharedKeyEncodingMethodType
     */
    @javax.annotation.Nullable
    public FirewallPreSharedKeyEncodingMethodType getFirewallPreSharedKeyEncodingMethod() {
        return this._firewallPreSharedKeyEncodingMethod;
    }
    /**
     * Gets the firewallProfileDomain property value. Configures the firewall profile settings for domain networks
     * @return a windowsFirewallNetworkProfile
     */
    @javax.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfileDomain() {
        return this._firewallProfileDomain;
    }
    /**
     * Gets the firewallProfilePrivate property value. Configures the firewall profile settings for private networks
     * @return a windowsFirewallNetworkProfile
     */
    @javax.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfilePrivate() {
        return this._firewallProfilePrivate;
    }
    /**
     * Gets the firewallProfilePublic property value. Configures the firewall profile settings for public networks
     * @return a windowsFirewallNetworkProfile
     */
    @javax.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfilePublic() {
        return this._firewallProfilePublic;
    }
    /**
     * Gets the smartScreenBlockOverrideForFiles property value. Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenBlockOverrideForFiles() {
        return this._smartScreenBlockOverrideForFiles;
    }
    /**
     * Gets the smartScreenEnableInShell property value. Allows IT Admins to configure SmartScreen for Windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenEnableInShell() {
        return this._smartScreenEnableInShell;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("applicationGuardAllowPersistence", this.getApplicationGuardAllowPersistence());
        writer.writeBooleanValue("applicationGuardAllowPrintToLocalPrinters", this.getApplicationGuardAllowPrintToLocalPrinters());
        writer.writeBooleanValue("applicationGuardAllowPrintToNetworkPrinters", this.getApplicationGuardAllowPrintToNetworkPrinters());
        writer.writeBooleanValue("applicationGuardAllowPrintToPDF", this.getApplicationGuardAllowPrintToPDF());
        writer.writeBooleanValue("applicationGuardAllowPrintToXPS", this.getApplicationGuardAllowPrintToXPS());
        writer.writeEnumValue("applicationGuardBlockClipboardSharing", this.getApplicationGuardBlockClipboardSharing());
        writer.writeEnumValue("applicationGuardBlockFileTransfer", this.getApplicationGuardBlockFileTransfer());
        writer.writeBooleanValue("applicationGuardBlockNonEnterpriseContent", this.getApplicationGuardBlockNonEnterpriseContent());
        writer.writeBooleanValue("applicationGuardEnabled", this.getApplicationGuardEnabled());
        writer.writeBooleanValue("applicationGuardForceAuditing", this.getApplicationGuardForceAuditing());
        writer.writeEnumValue("appLockerApplicationControl", this.getAppLockerApplicationControl());
        writer.writeBooleanValue("bitLockerDisableWarningForOtherDiskEncryption", this.getBitLockerDisableWarningForOtherDiskEncryption());
        writer.writeBooleanValue("bitLockerEnableStorageCardEncryptionOnMobile", this.getBitLockerEnableStorageCardEncryptionOnMobile());
        writer.writeBooleanValue("bitLockerEncryptDevice", this.getBitLockerEncryptDevice());
        writer.writeObjectValue("bitLockerRemovableDrivePolicy", this.getBitLockerRemovableDrivePolicy());
        writer.writeCollectionOfPrimitiveValues("defenderAdditionalGuardedFolders", this.getDefenderAdditionalGuardedFolders());
        writer.writeCollectionOfPrimitiveValues("defenderAttackSurfaceReductionExcludedPaths", this.getDefenderAttackSurfaceReductionExcludedPaths());
        writer.writeByteArrayValue("defenderExploitProtectionXml", this.getDefenderExploitProtectionXml());
        writer.writeStringValue("defenderExploitProtectionXmlFileName", this.getDefenderExploitProtectionXmlFileName());
        writer.writeCollectionOfPrimitiveValues("defenderGuardedFoldersAllowedAppPaths", this.getDefenderGuardedFoldersAllowedAppPaths());
        writer.writeBooleanValue("defenderSecurityCenterBlockExploitProtectionOverride", this.getDefenderSecurityCenterBlockExploitProtectionOverride());
        writer.writeBooleanValue("firewallBlockStatefulFTP", this.getFirewallBlockStatefulFTP());
        writer.writeEnumValue("firewallCertificateRevocationListCheckMethod", this.getFirewallCertificateRevocationListCheckMethod());
        writer.writeIntegerValue("firewallIdleTimeoutForSecurityAssociationInSeconds", this.getFirewallIdleTimeoutForSecurityAssociationInSeconds());
        writer.writeBooleanValue("firewallIPSecExemptionsAllowDHCP", this.getFirewallIPSecExemptionsAllowDHCP());
        writer.writeBooleanValue("firewallIPSecExemptionsAllowICMP", this.getFirewallIPSecExemptionsAllowICMP());
        writer.writeBooleanValue("firewallIPSecExemptionsAllowNeighborDiscovery", this.getFirewallIPSecExemptionsAllowNeighborDiscovery());
        writer.writeBooleanValue("firewallIPSecExemptionsAllowRouterDiscovery", this.getFirewallIPSecExemptionsAllowRouterDiscovery());
        writer.writeBooleanValue("firewallMergeKeyingModuleSettings", this.getFirewallMergeKeyingModuleSettings());
        writer.writeEnumValue("firewallPacketQueueingMethod", this.getFirewallPacketQueueingMethod());
        writer.writeEnumValue("firewallPreSharedKeyEncodingMethod", this.getFirewallPreSharedKeyEncodingMethod());
        writer.writeObjectValue("firewallProfileDomain", this.getFirewallProfileDomain());
        writer.writeObjectValue("firewallProfilePrivate", this.getFirewallProfilePrivate());
        writer.writeObjectValue("firewallProfilePublic", this.getFirewallProfilePublic());
        writer.writeBooleanValue("smartScreenBlockOverrideForFiles", this.getSmartScreenBlockOverrideForFiles());
        writer.writeBooleanValue("smartScreenEnableInShell", this.getSmartScreenEnableInShell());
    }
    /**
     * Sets the applicationGuardAllowPersistence property value. Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
     * @param value Value to set for the applicationGuardAllowPersistence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowPersistence(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowPersistence = value;
    }
    /**
     * Sets the applicationGuardAllowPrintToLocalPrinters property value. Allow printing to Local Printers from Container
     * @param value Value to set for the applicationGuardAllowPrintToLocalPrinters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowPrintToLocalPrinters(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowPrintToLocalPrinters = value;
    }
    /**
     * Sets the applicationGuardAllowPrintToNetworkPrinters property value. Allow printing to Network Printers from Container
     * @param value Value to set for the applicationGuardAllowPrintToNetworkPrinters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowPrintToNetworkPrinters(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowPrintToNetworkPrinters = value;
    }
    /**
     * Sets the applicationGuardAllowPrintToPDF property value. Allow printing to PDF from Container
     * @param value Value to set for the applicationGuardAllowPrintToPDF property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowPrintToPDF(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowPrintToPDF = value;
    }
    /**
     * Sets the applicationGuardAllowPrintToXPS property value. Allow printing to XPS from Container
     * @param value Value to set for the applicationGuardAllowPrintToXPS property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowPrintToXPS(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowPrintToXPS = value;
    }
    /**
     * Sets the applicationGuardBlockClipboardSharing property value. Possible values for applicationGuardBlockClipboardSharingType
     * @param value Value to set for the applicationGuardBlockClipboardSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardBlockClipboardSharing(@javax.annotation.Nullable final ApplicationGuardBlockClipboardSharingType value) {
        this._applicationGuardBlockClipboardSharing = value;
    }
    /**
     * Sets the applicationGuardBlockFileTransfer property value. Possible values for applicationGuardBlockFileTransfer
     * @param value Value to set for the applicationGuardBlockFileTransfer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardBlockFileTransfer(@javax.annotation.Nullable final ApplicationGuardBlockFileTransferType value) {
        this._applicationGuardBlockFileTransfer = value;
    }
    /**
     * Sets the applicationGuardBlockNonEnterpriseContent property value. Block enterprise sites to load non-enterprise content, such as third party plug-ins
     * @param value Value to set for the applicationGuardBlockNonEnterpriseContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardBlockNonEnterpriseContent(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardBlockNonEnterpriseContent = value;
    }
    /**
     * Sets the applicationGuardEnabled property value. Enable Windows Defender Application Guard
     * @param value Value to set for the applicationGuardEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardEnabled(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardEnabled = value;
    }
    /**
     * Sets the applicationGuardForceAuditing property value. Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)
     * @param value Value to set for the applicationGuardForceAuditing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardForceAuditing(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardForceAuditing = value;
    }
    /**
     * Sets the appLockerApplicationControl property value. Possible values of AppLocker Application Control Types
     * @param value Value to set for the appLockerApplicationControl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppLockerApplicationControl(@javax.annotation.Nullable final AppLockerApplicationControlType value) {
        this._appLockerApplicationControl = value;
    }
    /**
     * Sets the bitLockerDisableWarningForOtherDiskEncryption property value. Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
     * @param value Value to set for the bitLockerDisableWarningForOtherDiskEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerDisableWarningForOtherDiskEncryption(@javax.annotation.Nullable final Boolean value) {
        this._bitLockerDisableWarningForOtherDiskEncryption = value;
    }
    /**
     * Sets the bitLockerEnableStorageCardEncryptionOnMobile property value. Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
     * @param value Value to set for the bitLockerEnableStorageCardEncryptionOnMobile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerEnableStorageCardEncryptionOnMobile(@javax.annotation.Nullable final Boolean value) {
        this._bitLockerEnableStorageCardEncryptionOnMobile = value;
    }
    /**
     * Sets the bitLockerEncryptDevice property value. Allows the admin to require encryption to be turned on using BitLocker.
     * @param value Value to set for the bitLockerEncryptDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerEncryptDevice(@javax.annotation.Nullable final Boolean value) {
        this._bitLockerEncryptDevice = value;
    }
    /**
     * Sets the bitLockerRemovableDrivePolicy property value. BitLocker Removable Drive Policy.
     * @param value Value to set for the bitLockerRemovableDrivePolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerRemovableDrivePolicy(@javax.annotation.Nullable final BitLockerRemovableDrivePolicy value) {
        this._bitLockerRemovableDrivePolicy = value;
    }
    /**
     * Sets the defenderAdditionalGuardedFolders property value. List of folder paths to be added to the list of protected folders
     * @param value Value to set for the defenderAdditionalGuardedFolders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAdditionalGuardedFolders(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defenderAdditionalGuardedFolders = value;
    }
    /**
     * Sets the defenderAttackSurfaceReductionExcludedPaths property value. List of exe files and folders to be excluded from attack surface reduction rules
     * @param value Value to set for the defenderAttackSurfaceReductionExcludedPaths property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAttackSurfaceReductionExcludedPaths(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defenderAttackSurfaceReductionExcludedPaths = value;
    }
    /**
     * Sets the defenderExploitProtectionXml property value. Xml content containing information regarding exploit protection details.
     * @param value Value to set for the defenderExploitProtectionXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderExploitProtectionXml(@javax.annotation.Nullable final byte[] value) {
        this._defenderExploitProtectionXml = value;
    }
    /**
     * Sets the defenderExploitProtectionXmlFileName property value. Name of the file from which DefenderExploitProtectionXml was obtained.
     * @param value Value to set for the defenderExploitProtectionXmlFileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderExploitProtectionXmlFileName(@javax.annotation.Nullable final String value) {
        this._defenderExploitProtectionXmlFileName = value;
    }
    /**
     * Sets the defenderGuardedFoldersAllowedAppPaths property value. List of paths to exe that are allowed to access protected folders
     * @param value Value to set for the defenderGuardedFoldersAllowedAppPaths property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderGuardedFoldersAllowedAppPaths(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defenderGuardedFoldersAllowedAppPaths = value;
    }
    /**
     * Sets the defenderSecurityCenterBlockExploitProtectionOverride property value. Indicates whether or not to block user from overriding Exploit Protection settings.
     * @param value Value to set for the defenderSecurityCenterBlockExploitProtectionOverride property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterBlockExploitProtectionOverride(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterBlockExploitProtectionOverride = value;
    }
    /**
     * Sets the firewallBlockStatefulFTP property value. Blocks stateful FTP connections to the device
     * @param value Value to set for the firewallBlockStatefulFTP property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallBlockStatefulFTP(@javax.annotation.Nullable final Boolean value) {
        this._firewallBlockStatefulFTP = value;
    }
    /**
     * Sets the firewallCertificateRevocationListCheckMethod property value. Possible values for firewallCertificateRevocationListCheckMethod
     * @param value Value to set for the firewallCertificateRevocationListCheckMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallCertificateRevocationListCheckMethod(@javax.annotation.Nullable final FirewallCertificateRevocationListCheckMethodType value) {
        this._firewallCertificateRevocationListCheckMethod = value;
    }
    /**
     * Sets the firewallIdleTimeoutForSecurityAssociationInSeconds property value. Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600
     * @param value Value to set for the firewallIdleTimeoutForSecurityAssociationInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallIdleTimeoutForSecurityAssociationInSeconds(@javax.annotation.Nullable final Integer value) {
        this._firewallIdleTimeoutForSecurityAssociationInSeconds = value;
    }
    /**
     * Sets the firewallIPSecExemptionsAllowDHCP property value. Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
     * @param value Value to set for the firewallIPSecExemptionsAllowDHCP property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallIPSecExemptionsAllowDHCP(@javax.annotation.Nullable final Boolean value) {
        this._firewallIPSecExemptionsAllowDHCP = value;
    }
    /**
     * Sets the firewallIPSecExemptionsAllowICMP property value. Configures IPSec exemptions to allow ICMP
     * @param value Value to set for the firewallIPSecExemptionsAllowICMP property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallIPSecExemptionsAllowICMP(@javax.annotation.Nullable final Boolean value) {
        this._firewallIPSecExemptionsAllowICMP = value;
    }
    /**
     * Sets the firewallIPSecExemptionsAllowNeighborDiscovery property value. Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
     * @param value Value to set for the firewallIPSecExemptionsAllowNeighborDiscovery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallIPSecExemptionsAllowNeighborDiscovery(@javax.annotation.Nullable final Boolean value) {
        this._firewallIPSecExemptionsAllowNeighborDiscovery = value;
    }
    /**
     * Sets the firewallIPSecExemptionsAllowRouterDiscovery property value. Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
     * @param value Value to set for the firewallIPSecExemptionsAllowRouterDiscovery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallIPSecExemptionsAllowRouterDiscovery(@javax.annotation.Nullable final Boolean value) {
        this._firewallIPSecExemptionsAllowRouterDiscovery = value;
    }
    /**
     * Sets the firewallMergeKeyingModuleSettings property value. If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set
     * @param value Value to set for the firewallMergeKeyingModuleSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallMergeKeyingModuleSettings(@javax.annotation.Nullable final Boolean value) {
        this._firewallMergeKeyingModuleSettings = value;
    }
    /**
     * Sets the firewallPacketQueueingMethod property value. Possible values for firewallPacketQueueingMethod
     * @param value Value to set for the firewallPacketQueueingMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallPacketQueueingMethod(@javax.annotation.Nullable final FirewallPacketQueueingMethodType value) {
        this._firewallPacketQueueingMethod = value;
    }
    /**
     * Sets the firewallPreSharedKeyEncodingMethod property value. Possible values for firewallPreSharedKeyEncodingMethod
     * @param value Value to set for the firewallPreSharedKeyEncodingMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallPreSharedKeyEncodingMethod(@javax.annotation.Nullable final FirewallPreSharedKeyEncodingMethodType value) {
        this._firewallPreSharedKeyEncodingMethod = value;
    }
    /**
     * Sets the firewallProfileDomain property value. Configures the firewall profile settings for domain networks
     * @param value Value to set for the firewallProfileDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallProfileDomain(@javax.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this._firewallProfileDomain = value;
    }
    /**
     * Sets the firewallProfilePrivate property value. Configures the firewall profile settings for private networks
     * @param value Value to set for the firewallProfilePrivate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallProfilePrivate(@javax.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this._firewallProfilePrivate = value;
    }
    /**
     * Sets the firewallProfilePublic property value. Configures the firewall profile settings for public networks
     * @param value Value to set for the firewallProfilePublic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallProfilePublic(@javax.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this._firewallProfilePublic = value;
    }
    /**
     * Sets the smartScreenBlockOverrideForFiles property value. Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
     * @param value Value to set for the smartScreenBlockOverrideForFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenBlockOverrideForFiles(@javax.annotation.Nullable final Boolean value) {
        this._smartScreenBlockOverrideForFiles = value;
    }
    /**
     * Sets the smartScreenEnableInShell property value. Allows IT Admins to configure SmartScreen for Windows.
     * @param value Value to set for the smartScreenEnableInShell property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenEnableInShell(@javax.annotation.Nullable final Boolean value) {
        this._smartScreenEnableInShell = value;
    }
}
