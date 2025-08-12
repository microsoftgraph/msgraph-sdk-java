package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign an iOS iOS Declarative Device Management (DDM) Line Of Business (LOB) mobile app to a group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosDdmLobAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * Instantiates a new {@link IosDdmLobAppAssignmentSettings} and sets the default values.
     */
    public IosDdmLobAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.iosDdmLobAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosDdmLobAppAssignmentSettings}
     */
    @jakarta.annotation.Nonnull
    public static IosDdmLobAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosDdmLobAppAssignmentSettings();
    }
    /**
     * Gets the associatedDomains property value. Domain names to associate with the app
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssociatedDomains() {
        return this.backingStore.get("associatedDomains");
    }
    /**
     * Gets the associatedDomainsDirectDownloadAllowed property value. When true, the system allows direct downloads for the AssociatedDomains. When false, the system will not allow direct downloads for the AssociatedDomains. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAssociatedDomainsDirectDownloadAllowed() {
        return this.backingStore.get("associatedDomainsDirectDownloadAllowed");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associatedDomains", (n) -> { this.setAssociatedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("associatedDomainsDirectDownloadAllowed", (n) -> { this.setAssociatedDomainsDirectDownloadAllowed(n.getBooleanValue()); });
        deserializerMap.put("preventManagedAppBackup", (n) -> { this.setPreventManagedAppBackup(n.getBooleanValue()); });
        deserializerMap.put("tapToPayScreenLockEnabled", (n) -> { this.setTapToPayScreenLockEnabled(n.getBooleanValue()); });
        deserializerMap.put("vpnConfigurationId", (n) -> { this.setVpnConfigurationId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the preventManagedAppBackup property value. When true, indicates that the app should not be backed up to iCloud. When false, indicates that the app may be backed up to iCloud. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPreventManagedAppBackup() {
        return this.backingStore.get("preventManagedAppBackup");
    }
    /**
     * Gets the tapToPayScreenLockEnabled property value. When true, the device locks its screen after every transaction that requires a customers card PIN. When false, the user can choose the behavior. Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTapToPayScreenLockEnabled() {
        return this.backingStore.get("tapToPayScreenLockEnabled");
    }
    /**
     * Gets the vpnConfigurationId property value. The unique identifier of the relay to associate with the app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVpnConfigurationId() {
        return this.backingStore.get("vpnConfigurationId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("associatedDomains", this.getAssociatedDomains());
        writer.writeBooleanValue("associatedDomainsDirectDownloadAllowed", this.getAssociatedDomainsDirectDownloadAllowed());
        writer.writeBooleanValue("preventManagedAppBackup", this.getPreventManagedAppBackup());
        writer.writeBooleanValue("tapToPayScreenLockEnabled", this.getTapToPayScreenLockEnabled());
        writer.writeStringValue("vpnConfigurationId", this.getVpnConfigurationId());
    }
    /**
     * Sets the associatedDomains property value. Domain names to associate with the app
     * @param value Value to set for the associatedDomains property.
     */
    public void setAssociatedDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("associatedDomains", value);
    }
    /**
     * Sets the associatedDomainsDirectDownloadAllowed property value. When true, the system allows direct downloads for the AssociatedDomains. When false, the system will not allow direct downloads for the AssociatedDomains. Default is false.
     * @param value Value to set for the associatedDomainsDirectDownloadAllowed property.
     */
    public void setAssociatedDomainsDirectDownloadAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("associatedDomainsDirectDownloadAllowed", value);
    }
    /**
     * Sets the preventManagedAppBackup property value. When true, indicates that the app should not be backed up to iCloud. When false, indicates that the app may be backed up to iCloud. Default is false.
     * @param value Value to set for the preventManagedAppBackup property.
     */
    public void setPreventManagedAppBackup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("preventManagedAppBackup", value);
    }
    /**
     * Sets the tapToPayScreenLockEnabled property value. When true, the device locks its screen after every transaction that requires a customers card PIN. When false, the user can choose the behavior. Default value is false.
     * @param value Value to set for the tapToPayScreenLockEnabled property.
     */
    public void setTapToPayScreenLockEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("tapToPayScreenLockEnabled", value);
    }
    /**
     * Sets the vpnConfigurationId property value. The unique identifier of the relay to associate with the app.
     * @param value Value to set for the vpnConfigurationId property.
     */
    public void setVpnConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("vpnConfigurationId", value);
    }
}
