package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the Windows10EndpointProtectionConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10EndpointProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new Windows10EndpointProtectionConfiguration and sets the default values.
     */
    public Windows10EndpointProtectionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10EndpointProtectionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10EndpointProtectionConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Windows10EndpointProtectionConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EndpointProtectionConfiguration();
    }
    /**
     * Gets the applicationGuardAllowPersistence property value. Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowPersistence() {
        return this.backingStore.get("applicationGuardAllowPersistence");
    }
    /**
     * Gets the applicationGuardAllowPrintToLocalPrinters property value. Allow printing to Local Printers from Container
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToLocalPrinters() {
        return this.backingStore.get("applicationGuardAllowPrintToLocalPrinters");
    }
    /**
     * Gets the applicationGuardAllowPrintToNetworkPrinters property value. Allow printing to Network Printers from Container
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToNetworkPrinters() {
        return this.backingStore.get("applicationGuardAllowPrintToNetworkPrinters");
    }
    /**
     * Gets the applicationGuardAllowPrintToPDF property value. Allow printing to PDF from Container
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToPDF() {
        return this.backingStore.get("applicationGuardAllowPrintToPDF");
    }
    /**
     * Gets the applicationGuardAllowPrintToXPS property value. Allow printing to XPS from Container
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToXPS() {
        return this.backingStore.get("applicationGuardAllowPrintToXPS");
    }
    /**
     * Gets the applicationGuardBlockClipboardSharing property value. Possible values for applicationGuardBlockClipboardSharingType
     * @return a ApplicationGuardBlockClipboardSharingType
     */
    @jakarta.annotation.Nullable
    public ApplicationGuardBlockClipboardSharingType getApplicationGuardBlockClipboardSharing() {
        return this.backingStore.get("applicationGuardBlockClipboardSharing");
    }
    /**
     * Gets the applicationGuardBlockFileTransfer property value. Possible values for applicationGuardBlockFileTransfer
     * @return a ApplicationGuardBlockFileTransferType
     */
    @jakarta.annotation.Nullable
    public ApplicationGuardBlockFileTransferType getApplicationGuardBlockFileTransfer() {
        return this.backingStore.get("applicationGuardBlockFileTransfer");
    }
    /**
     * Gets the applicationGuardBlockNonEnterpriseContent property value. Block enterprise sites to load non-enterprise content, such as third party plug-ins
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardBlockNonEnterpriseContent() {
        return this.backingStore.get("applicationGuardBlockNonEnterpriseContent");
    }
    /**
     * Gets the applicationGuardEnabled property value. Enable Windows Defender Application Guard
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardEnabled() {
        return this.backingStore.get("applicationGuardEnabled");
    }
    /**
     * Gets the applicationGuardForceAuditing property value. Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardForceAuditing() {
        return this.backingStore.get("applicationGuardForceAuditing");
    }
    /**
     * Gets the appLockerApplicationControl property value. Possible values of AppLocker Application Control Types
     * @return a AppLockerApplicationControlType
     */
    @jakarta.annotation.Nullable
    public AppLockerApplicationControlType getAppLockerApplicationControl() {
        return this.backingStore.get("appLockerApplicationControl");
    }
    /**
     * Gets the bitLockerDisableWarningForOtherDiskEncryption property value. Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBitLockerDisableWarningForOtherDiskEncryption() {
        return this.backingStore.get("bitLockerDisableWarningForOtherDiskEncryption");
    }
    /**
     * Gets the bitLockerEnableStorageCardEncryptionOnMobile property value. Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBitLockerEnableStorageCardEncryptionOnMobile() {
        return this.backingStore.get("bitLockerEnableStorageCardEncryptionOnMobile");
    }
    /**
     * Gets the bitLockerEncryptDevice property value. Allows the admin to require encryption to be turned on using BitLocker.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBitLockerEncryptDevice() {
        return this.backingStore.get("bitLockerEncryptDevice");
    }
    /**
     * Gets the bitLockerRemovableDrivePolicy property value. BitLocker Removable Drive Policy.
     * @return a BitLockerRemovableDrivePolicy
     */
    @jakarta.annotation.Nullable
    public BitLockerRemovableDrivePolicy getBitLockerRemovableDrivePolicy() {
        return this.backingStore.get("bitLockerRemovableDrivePolicy");
    }
    /**
     * Gets the defenderAdditionalGuardedFolders property value. List of folder paths to be added to the list of protected folders
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefenderAdditionalGuardedFolders() {
        return this.backingStore.get("defenderAdditionalGuardedFolders");
    }
    /**
     * Gets the defenderAttackSurfaceReductionExcludedPaths property value. List of exe files and folders to be excluded from attack surface reduction rules
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefenderAttackSurfaceReductionExcludedPaths() {
        return this.backingStore.get("defenderAttackSurfaceReductionExcludedPaths");
    }
    /**
     * Gets the defenderExploitProtectionXml property value. Xml content containing information regarding exploit protection details.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getDefenderExploitProtectionXml() {
        return this.backingStore.get("defenderExploitProtectionXml");
    }
    /**
     * Gets the defenderExploitProtectionXmlFileName property value. Name of the file from which DefenderExploitProtectionXml was obtained.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefenderExploitProtectionXmlFileName() {
        return this.backingStore.get("defenderExploitProtectionXmlFileName");
    }
    /**
     * Gets the defenderGuardedFoldersAllowedAppPaths property value. List of paths to exe that are allowed to access protected folders
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefenderGuardedFoldersAllowedAppPaths() {
        return this.backingStore.get("defenderGuardedFoldersAllowedAppPaths");
    }
    /**
     * Gets the defenderSecurityCenterBlockExploitProtectionOverride property value. Indicates whether or not to block user from overriding Exploit Protection settings.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterBlockExploitProtectionOverride() {
        return this.backingStore.get("defenderSecurityCenterBlockExploitProtectionOverride");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationGuardAllowPersistence", (n) -> { this.setApplicationGuardAllowPersistence(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardAllowPrintToLocalPrinters", (n) -> { this.setApplicationGuardAllowPrintToLocalPrinters(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardAllowPrintToNetworkPrinters", (n) -> { this.setApplicationGuardAllowPrintToNetworkPrinters(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardAllowPrintToPDF", (n) -> { this.setApplicationGuardAllowPrintToPDF(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardAllowPrintToXPS", (n) -> { this.setApplicationGuardAllowPrintToXPS(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardBlockClipboardSharing", (n) -> { this.setApplicationGuardBlockClipboardSharing(n.getEnumValue(ApplicationGuardBlockClipboardSharingType::forValue)); });
        deserializerMap.put("applicationGuardBlockFileTransfer", (n) -> { this.setApplicationGuardBlockFileTransfer(n.getEnumValue(ApplicationGuardBlockFileTransferType::forValue)); });
        deserializerMap.put("applicationGuardBlockNonEnterpriseContent", (n) -> { this.setApplicationGuardBlockNonEnterpriseContent(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardEnabled", (n) -> { this.setApplicationGuardEnabled(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardForceAuditing", (n) -> { this.setApplicationGuardForceAuditing(n.getBooleanValue()); });
        deserializerMap.put("appLockerApplicationControl", (n) -> { this.setAppLockerApplicationControl(n.getEnumValue(AppLockerApplicationControlType::forValue)); });
        deserializerMap.put("bitLockerDisableWarningForOtherDiskEncryption", (n) -> { this.setBitLockerDisableWarningForOtherDiskEncryption(n.getBooleanValue()); });
        deserializerMap.put("bitLockerEnableStorageCardEncryptionOnMobile", (n) -> { this.setBitLockerEnableStorageCardEncryptionOnMobile(n.getBooleanValue()); });
        deserializerMap.put("bitLockerEncryptDevice", (n) -> { this.setBitLockerEncryptDevice(n.getBooleanValue()); });
        deserializerMap.put("bitLockerRemovableDrivePolicy", (n) -> { this.setBitLockerRemovableDrivePolicy(n.getObjectValue(BitLockerRemovableDrivePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("defenderAdditionalGuardedFolders", (n) -> { this.setDefenderAdditionalGuardedFolders(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderAttackSurfaceReductionExcludedPaths", (n) -> { this.setDefenderAttackSurfaceReductionExcludedPaths(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderExploitProtectionXml", (n) -> { this.setDefenderExploitProtectionXml(n.getByteArrayValue()); });
        deserializerMap.put("defenderExploitProtectionXmlFileName", (n) -> { this.setDefenderExploitProtectionXmlFileName(n.getStringValue()); });
        deserializerMap.put("defenderGuardedFoldersAllowedAppPaths", (n) -> { this.setDefenderGuardedFoldersAllowedAppPaths(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderSecurityCenterBlockExploitProtectionOverride", (n) -> { this.setDefenderSecurityCenterBlockExploitProtectionOverride(n.getBooleanValue()); });
        deserializerMap.put("firewallBlockStatefulFTP", (n) -> { this.setFirewallBlockStatefulFTP(n.getBooleanValue()); });
        deserializerMap.put("firewallCertificateRevocationListCheckMethod", (n) -> { this.setFirewallCertificateRevocationListCheckMethod(n.getEnumValue(FirewallCertificateRevocationListCheckMethodType::forValue)); });
        deserializerMap.put("firewallIdleTimeoutForSecurityAssociationInSeconds", (n) -> { this.setFirewallIdleTimeoutForSecurityAssociationInSeconds(n.getIntegerValue()); });
        deserializerMap.put("firewallIPSecExemptionsAllowDHCP", (n) -> { this.setFirewallIPSecExemptionsAllowDHCP(n.getBooleanValue()); });
        deserializerMap.put("firewallIPSecExemptionsAllowICMP", (n) -> { this.setFirewallIPSecExemptionsAllowICMP(n.getBooleanValue()); });
        deserializerMap.put("firewallIPSecExemptionsAllowNeighborDiscovery", (n) -> { this.setFirewallIPSecExemptionsAllowNeighborDiscovery(n.getBooleanValue()); });
        deserializerMap.put("firewallIPSecExemptionsAllowRouterDiscovery", (n) -> { this.setFirewallIPSecExemptionsAllowRouterDiscovery(n.getBooleanValue()); });
        deserializerMap.put("firewallMergeKeyingModuleSettings", (n) -> { this.setFirewallMergeKeyingModuleSettings(n.getBooleanValue()); });
        deserializerMap.put("firewallPacketQueueingMethod", (n) -> { this.setFirewallPacketQueueingMethod(n.getEnumValue(FirewallPacketQueueingMethodType::forValue)); });
        deserializerMap.put("firewallPreSharedKeyEncodingMethod", (n) -> { this.setFirewallPreSharedKeyEncodingMethod(n.getEnumValue(FirewallPreSharedKeyEncodingMethodType::forValue)); });
        deserializerMap.put("firewallProfileDomain", (n) -> { this.setFirewallProfileDomain(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("firewallProfilePrivate", (n) -> { this.setFirewallProfilePrivate(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("firewallProfilePublic", (n) -> { this.setFirewallProfilePublic(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("smartScreenBlockOverrideForFiles", (n) -> { this.setSmartScreenBlockOverrideForFiles(n.getBooleanValue()); });
        deserializerMap.put("smartScreenEnableInShell", (n) -> { this.setSmartScreenEnableInShell(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firewallBlockStatefulFTP property value. Blocks stateful FTP connections to the device
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallBlockStatefulFTP() {
        return this.backingStore.get("firewallBlockStatefulFTP");
    }
    /**
     * Gets the firewallCertificateRevocationListCheckMethod property value. Possible values for firewallCertificateRevocationListCheckMethod
     * @return a FirewallCertificateRevocationListCheckMethodType
     */
    @jakarta.annotation.Nullable
    public FirewallCertificateRevocationListCheckMethodType getFirewallCertificateRevocationListCheckMethod() {
        return this.backingStore.get("firewallCertificateRevocationListCheckMethod");
    }
    /**
     * Gets the firewallIdleTimeoutForSecurityAssociationInSeconds property value. Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFirewallIdleTimeoutForSecurityAssociationInSeconds() {
        return this.backingStore.get("firewallIdleTimeoutForSecurityAssociationInSeconds");
    }
    /**
     * Gets the firewallIPSecExemptionsAllowDHCP property value. Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowDHCP() {
        return this.backingStore.get("firewallIPSecExemptionsAllowDHCP");
    }
    /**
     * Gets the firewallIPSecExemptionsAllowICMP property value. Configures IPSec exemptions to allow ICMP
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowICMP() {
        return this.backingStore.get("firewallIPSecExemptionsAllowICMP");
    }
    /**
     * Gets the firewallIPSecExemptionsAllowNeighborDiscovery property value. Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowNeighborDiscovery() {
        return this.backingStore.get("firewallIPSecExemptionsAllowNeighborDiscovery");
    }
    /**
     * Gets the firewallIPSecExemptionsAllowRouterDiscovery property value. Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowRouterDiscovery() {
        return this.backingStore.get("firewallIPSecExemptionsAllowRouterDiscovery");
    }
    /**
     * Gets the firewallMergeKeyingModuleSettings property value. If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallMergeKeyingModuleSettings() {
        return this.backingStore.get("firewallMergeKeyingModuleSettings");
    }
    /**
     * Gets the firewallPacketQueueingMethod property value. Possible values for firewallPacketQueueingMethod
     * @return a FirewallPacketQueueingMethodType
     */
    @jakarta.annotation.Nullable
    public FirewallPacketQueueingMethodType getFirewallPacketQueueingMethod() {
        return this.backingStore.get("firewallPacketQueueingMethod");
    }
    /**
     * Gets the firewallPreSharedKeyEncodingMethod property value. Possible values for firewallPreSharedKeyEncodingMethod
     * @return a FirewallPreSharedKeyEncodingMethodType
     */
    @jakarta.annotation.Nullable
    public FirewallPreSharedKeyEncodingMethodType getFirewallPreSharedKeyEncodingMethod() {
        return this.backingStore.get("firewallPreSharedKeyEncodingMethod");
    }
    /**
     * Gets the firewallProfileDomain property value. Configures the firewall profile settings for domain networks
     * @return a WindowsFirewallNetworkProfile
     */
    @jakarta.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfileDomain() {
        return this.backingStore.get("firewallProfileDomain");
    }
    /**
     * Gets the firewallProfilePrivate property value. Configures the firewall profile settings for private networks
     * @return a WindowsFirewallNetworkProfile
     */
    @jakarta.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfilePrivate() {
        return this.backingStore.get("firewallProfilePrivate");
    }
    /**
     * Gets the firewallProfilePublic property value. Configures the firewall profile settings for public networks
     * @return a WindowsFirewallNetworkProfile
     */
    @jakarta.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfilePublic() {
        return this.backingStore.get("firewallProfilePublic");
    }
    /**
     * Gets the smartScreenBlockOverrideForFiles property value. Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSmartScreenBlockOverrideForFiles() {
        return this.backingStore.get("smartScreenBlockOverrideForFiles");
    }
    /**
     * Gets the smartScreenEnableInShell property value. Allows IT Admins to configure SmartScreen for Windows.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSmartScreenEnableInShell() {
        return this.backingStore.get("smartScreenEnableInShell");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setApplicationGuardAllowPersistence(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowPersistence", value);
    }
    /**
     * Sets the applicationGuardAllowPrintToLocalPrinters property value. Allow printing to Local Printers from Container
     * @param value Value to set for the applicationGuardAllowPrintToLocalPrinters property.
     */
    public void setApplicationGuardAllowPrintToLocalPrinters(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowPrintToLocalPrinters", value);
    }
    /**
     * Sets the applicationGuardAllowPrintToNetworkPrinters property value. Allow printing to Network Printers from Container
     * @param value Value to set for the applicationGuardAllowPrintToNetworkPrinters property.
     */
    public void setApplicationGuardAllowPrintToNetworkPrinters(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowPrintToNetworkPrinters", value);
    }
    /**
     * Sets the applicationGuardAllowPrintToPDF property value. Allow printing to PDF from Container
     * @param value Value to set for the applicationGuardAllowPrintToPDF property.
     */
    public void setApplicationGuardAllowPrintToPDF(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowPrintToPDF", value);
    }
    /**
     * Sets the applicationGuardAllowPrintToXPS property value. Allow printing to XPS from Container
     * @param value Value to set for the applicationGuardAllowPrintToXPS property.
     */
    public void setApplicationGuardAllowPrintToXPS(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowPrintToXPS", value);
    }
    /**
     * Sets the applicationGuardBlockClipboardSharing property value. Possible values for applicationGuardBlockClipboardSharingType
     * @param value Value to set for the applicationGuardBlockClipboardSharing property.
     */
    public void setApplicationGuardBlockClipboardSharing(@jakarta.annotation.Nullable final ApplicationGuardBlockClipboardSharingType value) {
        this.backingStore.set("applicationGuardBlockClipboardSharing", value);
    }
    /**
     * Sets the applicationGuardBlockFileTransfer property value. Possible values for applicationGuardBlockFileTransfer
     * @param value Value to set for the applicationGuardBlockFileTransfer property.
     */
    public void setApplicationGuardBlockFileTransfer(@jakarta.annotation.Nullable final ApplicationGuardBlockFileTransferType value) {
        this.backingStore.set("applicationGuardBlockFileTransfer", value);
    }
    /**
     * Sets the applicationGuardBlockNonEnterpriseContent property value. Block enterprise sites to load non-enterprise content, such as third party plug-ins
     * @param value Value to set for the applicationGuardBlockNonEnterpriseContent property.
     */
    public void setApplicationGuardBlockNonEnterpriseContent(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardBlockNonEnterpriseContent", value);
    }
    /**
     * Sets the applicationGuardEnabled property value. Enable Windows Defender Application Guard
     * @param value Value to set for the applicationGuardEnabled property.
     */
    public void setApplicationGuardEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardEnabled", value);
    }
    /**
     * Sets the applicationGuardForceAuditing property value. Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)
     * @param value Value to set for the applicationGuardForceAuditing property.
     */
    public void setApplicationGuardForceAuditing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardForceAuditing", value);
    }
    /**
     * Sets the appLockerApplicationControl property value. Possible values of AppLocker Application Control Types
     * @param value Value to set for the appLockerApplicationControl property.
     */
    public void setAppLockerApplicationControl(@jakarta.annotation.Nullable final AppLockerApplicationControlType value) {
        this.backingStore.set("appLockerApplicationControl", value);
    }
    /**
     * Sets the bitLockerDisableWarningForOtherDiskEncryption property value. Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
     * @param value Value to set for the bitLockerDisableWarningForOtherDiskEncryption property.
     */
    public void setBitLockerDisableWarningForOtherDiskEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bitLockerDisableWarningForOtherDiskEncryption", value);
    }
    /**
     * Sets the bitLockerEnableStorageCardEncryptionOnMobile property value. Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
     * @param value Value to set for the bitLockerEnableStorageCardEncryptionOnMobile property.
     */
    public void setBitLockerEnableStorageCardEncryptionOnMobile(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bitLockerEnableStorageCardEncryptionOnMobile", value);
    }
    /**
     * Sets the bitLockerEncryptDevice property value. Allows the admin to require encryption to be turned on using BitLocker.
     * @param value Value to set for the bitLockerEncryptDevice property.
     */
    public void setBitLockerEncryptDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bitLockerEncryptDevice", value);
    }
    /**
     * Sets the bitLockerRemovableDrivePolicy property value. BitLocker Removable Drive Policy.
     * @param value Value to set for the bitLockerRemovableDrivePolicy property.
     */
    public void setBitLockerRemovableDrivePolicy(@jakarta.annotation.Nullable final BitLockerRemovableDrivePolicy value) {
        this.backingStore.set("bitLockerRemovableDrivePolicy", value);
    }
    /**
     * Sets the defenderAdditionalGuardedFolders property value. List of folder paths to be added to the list of protected folders
     * @param value Value to set for the defenderAdditionalGuardedFolders property.
     */
    public void setDefenderAdditionalGuardedFolders(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defenderAdditionalGuardedFolders", value);
    }
    /**
     * Sets the defenderAttackSurfaceReductionExcludedPaths property value. List of exe files and folders to be excluded from attack surface reduction rules
     * @param value Value to set for the defenderAttackSurfaceReductionExcludedPaths property.
     */
    public void setDefenderAttackSurfaceReductionExcludedPaths(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defenderAttackSurfaceReductionExcludedPaths", value);
    }
    /**
     * Sets the defenderExploitProtectionXml property value. Xml content containing information regarding exploit protection details.
     * @param value Value to set for the defenderExploitProtectionXml property.
     */
    public void setDefenderExploitProtectionXml(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("defenderExploitProtectionXml", value);
    }
    /**
     * Sets the defenderExploitProtectionXmlFileName property value. Name of the file from which DefenderExploitProtectionXml was obtained.
     * @param value Value to set for the defenderExploitProtectionXmlFileName property.
     */
    public void setDefenderExploitProtectionXmlFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defenderExploitProtectionXmlFileName", value);
    }
    /**
     * Sets the defenderGuardedFoldersAllowedAppPaths property value. List of paths to exe that are allowed to access protected folders
     * @param value Value to set for the defenderGuardedFoldersAllowedAppPaths property.
     */
    public void setDefenderGuardedFoldersAllowedAppPaths(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defenderGuardedFoldersAllowedAppPaths", value);
    }
    /**
     * Sets the defenderSecurityCenterBlockExploitProtectionOverride property value. Indicates whether or not to block user from overriding Exploit Protection settings.
     * @param value Value to set for the defenderSecurityCenterBlockExploitProtectionOverride property.
     */
    public void setDefenderSecurityCenterBlockExploitProtectionOverride(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterBlockExploitProtectionOverride", value);
    }
    /**
     * Sets the firewallBlockStatefulFTP property value. Blocks stateful FTP connections to the device
     * @param value Value to set for the firewallBlockStatefulFTP property.
     */
    public void setFirewallBlockStatefulFTP(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallBlockStatefulFTP", value);
    }
    /**
     * Sets the firewallCertificateRevocationListCheckMethod property value. Possible values for firewallCertificateRevocationListCheckMethod
     * @param value Value to set for the firewallCertificateRevocationListCheckMethod property.
     */
    public void setFirewallCertificateRevocationListCheckMethod(@jakarta.annotation.Nullable final FirewallCertificateRevocationListCheckMethodType value) {
        this.backingStore.set("firewallCertificateRevocationListCheckMethod", value);
    }
    /**
     * Sets the firewallIdleTimeoutForSecurityAssociationInSeconds property value. Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600
     * @param value Value to set for the firewallIdleTimeoutForSecurityAssociationInSeconds property.
     */
    public void setFirewallIdleTimeoutForSecurityAssociationInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("firewallIdleTimeoutForSecurityAssociationInSeconds", value);
    }
    /**
     * Sets the firewallIPSecExemptionsAllowDHCP property value. Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
     * @param value Value to set for the firewallIPSecExemptionsAllowDHCP property.
     */
    public void setFirewallIPSecExemptionsAllowDHCP(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallIPSecExemptionsAllowDHCP", value);
    }
    /**
     * Sets the firewallIPSecExemptionsAllowICMP property value. Configures IPSec exemptions to allow ICMP
     * @param value Value to set for the firewallIPSecExemptionsAllowICMP property.
     */
    public void setFirewallIPSecExemptionsAllowICMP(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallIPSecExemptionsAllowICMP", value);
    }
    /**
     * Sets the firewallIPSecExemptionsAllowNeighborDiscovery property value. Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
     * @param value Value to set for the firewallIPSecExemptionsAllowNeighborDiscovery property.
     */
    public void setFirewallIPSecExemptionsAllowNeighborDiscovery(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallIPSecExemptionsAllowNeighborDiscovery", value);
    }
    /**
     * Sets the firewallIPSecExemptionsAllowRouterDiscovery property value. Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
     * @param value Value to set for the firewallIPSecExemptionsAllowRouterDiscovery property.
     */
    public void setFirewallIPSecExemptionsAllowRouterDiscovery(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallIPSecExemptionsAllowRouterDiscovery", value);
    }
    /**
     * Sets the firewallMergeKeyingModuleSettings property value. If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set
     * @param value Value to set for the firewallMergeKeyingModuleSettings property.
     */
    public void setFirewallMergeKeyingModuleSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallMergeKeyingModuleSettings", value);
    }
    /**
     * Sets the firewallPacketQueueingMethod property value. Possible values for firewallPacketQueueingMethod
     * @param value Value to set for the firewallPacketQueueingMethod property.
     */
    public void setFirewallPacketQueueingMethod(@jakarta.annotation.Nullable final FirewallPacketQueueingMethodType value) {
        this.backingStore.set("firewallPacketQueueingMethod", value);
    }
    /**
     * Sets the firewallPreSharedKeyEncodingMethod property value. Possible values for firewallPreSharedKeyEncodingMethod
     * @param value Value to set for the firewallPreSharedKeyEncodingMethod property.
     */
    public void setFirewallPreSharedKeyEncodingMethod(@jakarta.annotation.Nullable final FirewallPreSharedKeyEncodingMethodType value) {
        this.backingStore.set("firewallPreSharedKeyEncodingMethod", value);
    }
    /**
     * Sets the firewallProfileDomain property value. Configures the firewall profile settings for domain networks
     * @param value Value to set for the firewallProfileDomain property.
     */
    public void setFirewallProfileDomain(@jakarta.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this.backingStore.set("firewallProfileDomain", value);
    }
    /**
     * Sets the firewallProfilePrivate property value. Configures the firewall profile settings for private networks
     * @param value Value to set for the firewallProfilePrivate property.
     */
    public void setFirewallProfilePrivate(@jakarta.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this.backingStore.set("firewallProfilePrivate", value);
    }
    /**
     * Sets the firewallProfilePublic property value. Configures the firewall profile settings for public networks
     * @param value Value to set for the firewallProfilePublic property.
     */
    public void setFirewallProfilePublic(@jakarta.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this.backingStore.set("firewallProfilePublic", value);
    }
    /**
     * Sets the smartScreenBlockOverrideForFiles property value. Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
     * @param value Value to set for the smartScreenBlockOverrideForFiles property.
     */
    public void setSmartScreenBlockOverrideForFiles(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smartScreenBlockOverrideForFiles", value);
    }
    /**
     * Sets the smartScreenEnableInShell property value. Allows IT Admins to configure SmartScreen for Windows.
     * @param value Value to set for the smartScreenEnableInShell property.
     */
    public void setSmartScreenEnableInShell(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smartScreenEnableInShell", value);
    }
}
