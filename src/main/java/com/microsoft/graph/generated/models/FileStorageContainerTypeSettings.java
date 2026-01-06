package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileStorageContainerTypeSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link FileStorageContainerTypeSettings} and sets the default values.
     */
    public FileStorageContainerTypeSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FileStorageContainerTypeSettings}
     */
    @jakarta.annotation.Nonnull
    public static FileStorageContainerTypeSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileStorageContainerTypeSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the consumingTenantOverridables property value. A comma-separated list of settings that can be overridden in the consuming tenant. The possible values are: urlTemplate, isDiscoverabilityEnabled, isSearchEnabled, isItemVersioningEnabled, itemMajorVersionLimit, maxStoragePerContainerInBytes, unknownFutureValue.
     * @return a {@link EnumSet<FileStorageContainerTypeSettingsOverride>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<FileStorageContainerTypeSettingsOverride> getConsumingTenantOverridables() {
        return this.backingStore.get("consumingTenantOverridables");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("consumingTenantOverridables", (n) -> { this.setConsumingTenantOverridables(n.getEnumSetValue(FileStorageContainerTypeSettingsOverride::forValue)); });
        deserializerMap.put("isDiscoverabilityEnabled", (n) -> { this.setIsDiscoverabilityEnabled(n.getBooleanValue()); });
        deserializerMap.put("isItemVersioningEnabled", (n) -> { this.setIsItemVersioningEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSearchEnabled", (n) -> { this.setIsSearchEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSharingRestricted", (n) -> { this.setIsSharingRestricted(n.getBooleanValue()); });
        deserializerMap.put("itemMajorVersionLimit", (n) -> { this.setItemMajorVersionLimit(n.getLongValue()); });
        deserializerMap.put("maxStoragePerContainerInBytes", (n) -> { this.setMaxStoragePerContainerInBytes(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sharingCapability", (n) -> { this.setSharingCapability(n.getEnumValue(SharingCapabilities::forValue)); });
        deserializerMap.put("urlTemplate", (n) -> { this.setUrlTemplate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDiscoverabilityEnabled property value. Indicates whether items from containers are surfaced in experiences such as My Activity or Microsoft 365.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDiscoverabilityEnabled() {
        return this.backingStore.get("isDiscoverabilityEnabled");
    }
    /**
     * Gets the isItemVersioningEnabled property value. Indicates whether item versioning is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsItemVersioningEnabled() {
        return this.backingStore.get("isItemVersioningEnabled");
    }
    /**
     * Gets the isSearchEnabled property value. Indicates whether search is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSearchEnabled() {
        return this.backingStore.get("isSearchEnabled");
    }
    /**
     * Gets the isSharingRestricted property value. Only the manager and owner can share files in the container if restricted sharing is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSharingRestricted() {
        return this.backingStore.get("isSharingRestricted");
    }
    /**
     * Gets the itemMajorVersionLimit property value. Maximum number of versions. Versioning must be enabled (&apos;isItemVersioningEnabled&apos;=true).
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getItemMajorVersionLimit() {
        return this.backingStore.get("itemMajorVersionLimit");
    }
    /**
     * Gets the maxStoragePerContainerInBytes property value. Controls maximum storage in bytes.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMaxStoragePerContainerInBytes() {
        return this.backingStore.get("maxStoragePerContainerInBytes");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the sharingCapability property value. Sharing capabilities permitted for containers. This value can always be overridden during registration if needed. The possible values are: disabled, externalUserSharingOnly, externalUserAndGuestSharing, existingExternalUserSharingOnly, unknownFutureValue.
     * @return a {@link SharingCapabilities}
     */
    @jakarta.annotation.Nullable
    public SharingCapabilities getSharingCapability() {
        return this.backingStore.get("sharingCapability");
    }
    /**
     * Gets the urlTemplate property value. Pattern used to redirect files.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrlTemplate() {
        return this.backingStore.get("urlTemplate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("consumingTenantOverridables", this.getConsumingTenantOverridables());
        writer.writeBooleanValue("isDiscoverabilityEnabled", this.getIsDiscoverabilityEnabled());
        writer.writeBooleanValue("isItemVersioningEnabled", this.getIsItemVersioningEnabled());
        writer.writeBooleanValue("isSearchEnabled", this.getIsSearchEnabled());
        writer.writeBooleanValue("isSharingRestricted", this.getIsSharingRestricted());
        writer.writeLongValue("itemMajorVersionLimit", this.getItemMajorVersionLimit());
        writer.writeLongValue("maxStoragePerContainerInBytes", this.getMaxStoragePerContainerInBytes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("sharingCapability", this.getSharingCapability());
        writer.writeStringValue("urlTemplate", this.getUrlTemplate());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the consumingTenantOverridables property value. A comma-separated list of settings that can be overridden in the consuming tenant. The possible values are: urlTemplate, isDiscoverabilityEnabled, isSearchEnabled, isItemVersioningEnabled, itemMajorVersionLimit, maxStoragePerContainerInBytes, unknownFutureValue.
     * @param value Value to set for the consumingTenantOverridables property.
     */
    public void setConsumingTenantOverridables(@jakarta.annotation.Nullable final EnumSet<FileStorageContainerTypeSettingsOverride> value) {
        this.backingStore.set("consumingTenantOverridables", value);
    }
    /**
     * Sets the isDiscoverabilityEnabled property value. Indicates whether items from containers are surfaced in experiences such as My Activity or Microsoft 365.
     * @param value Value to set for the isDiscoverabilityEnabled property.
     */
    public void setIsDiscoverabilityEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDiscoverabilityEnabled", value);
    }
    /**
     * Sets the isItemVersioningEnabled property value. Indicates whether item versioning is enabled.
     * @param value Value to set for the isItemVersioningEnabled property.
     */
    public void setIsItemVersioningEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isItemVersioningEnabled", value);
    }
    /**
     * Sets the isSearchEnabled property value. Indicates whether search is enabled.
     * @param value Value to set for the isSearchEnabled property.
     */
    public void setIsSearchEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSearchEnabled", value);
    }
    /**
     * Sets the isSharingRestricted property value. Only the manager and owner can share files in the container if restricted sharing is enabled.
     * @param value Value to set for the isSharingRestricted property.
     */
    public void setIsSharingRestricted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSharingRestricted", value);
    }
    /**
     * Sets the itemMajorVersionLimit property value. Maximum number of versions. Versioning must be enabled (&apos;isItemVersioningEnabled&apos;=true).
     * @param value Value to set for the itemMajorVersionLimit property.
     */
    public void setItemMajorVersionLimit(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("itemMajorVersionLimit", value);
    }
    /**
     * Sets the maxStoragePerContainerInBytes property value. Controls maximum storage in bytes.
     * @param value Value to set for the maxStoragePerContainerInBytes property.
     */
    public void setMaxStoragePerContainerInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("maxStoragePerContainerInBytes", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sharingCapability property value. Sharing capabilities permitted for containers. This value can always be overridden during registration if needed. The possible values are: disabled, externalUserSharingOnly, externalUserAndGuestSharing, existingExternalUserSharingOnly, unknownFutureValue.
     * @param value Value to set for the sharingCapability property.
     */
    public void setSharingCapability(@jakarta.annotation.Nullable final SharingCapabilities value) {
        this.backingStore.set("sharingCapability", value);
    }
    /**
     * Sets the urlTemplate property value. Pattern used to redirect files.
     * @param value Value to set for the urlTemplate property.
     */
    public void setUrlTemplate(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("urlTemplate", value);
    }
}
