package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileStorageContainerTypeAppPermissionGrant implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link FileStorageContainerTypeAppPermissionGrant} and sets the default values.
     */
    public FileStorageContainerTypeAppPermissionGrant() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FileStorageContainerTypeAppPermissionGrant}
     */
    @jakarta.annotation.Nonnull
    public static FileStorageContainerTypeAppPermissionGrant createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileStorageContainerTypeAppPermissionGrant();
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
     * Gets the appId property value. Application ID to which to set permissions.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the applicationPermissions property value. Allowed permissions when you use delegated tokens. The possible values are: none, readContent, writeContent, manageContent, create, delete, read, write, enumeratePermissions, addPermissions, updatePermissions, deletePermissions, deleteOwnPermission, managePermissions, full, unknownFutureValue.
     * @return a {@link java.util.List<FileStorageContainerTypeAppPermission>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileStorageContainerTypeAppPermission> getApplicationPermissions() {
        return this.backingStore.get("applicationPermissions");
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
     * Gets the delegatedPermissions property value. Allowed permissions when you use application tokens. The possible values are: none, readContent, writeContent, manageContent, create, delete, read, write, enumeratePermissions, addPermissions, updatePermissions, deletePermissions, deleteOwnPermission, managePermissions, full, unknownFutureValue.
     * @return a {@link java.util.List<FileStorageContainerTypeAppPermission>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileStorageContainerTypeAppPermission> getDelegatedPermissions() {
        return this.backingStore.get("delegatedPermissions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("applicationPermissions", (n) -> { this.setApplicationPermissions(n.getCollectionOfEnumValues(FileStorageContainerTypeAppPermission::forValue)); });
        deserializerMap.put("delegatedPermissions", (n) -> { this.setDelegatedPermissions(n.getCollectionOfEnumValues(FileStorageContainerTypeAppPermission::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeCollectionOfEnumValues("applicationPermissions", this.getApplicationPermissions());
        writer.writeCollectionOfEnumValues("delegatedPermissions", this.getDelegatedPermissions());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the appId property value. Application ID to which to set permissions.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the applicationPermissions property value. Allowed permissions when you use delegated tokens. The possible values are: none, readContent, writeContent, manageContent, create, delete, read, write, enumeratePermissions, addPermissions, updatePermissions, deletePermissions, deleteOwnPermission, managePermissions, full, unknownFutureValue.
     * @param value Value to set for the applicationPermissions property.
     */
    public void setApplicationPermissions(@jakarta.annotation.Nullable final java.util.List<FileStorageContainerTypeAppPermission> value) {
        this.backingStore.set("applicationPermissions", value);
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
     * Sets the delegatedPermissions property value. Allowed permissions when you use application tokens. The possible values are: none, readContent, writeContent, manageContent, create, delete, read, write, enumeratePermissions, addPermissions, updatePermissions, deletePermissions, deleteOwnPermission, managePermissions, full, unknownFutureValue.
     * @param value Value to set for the delegatedPermissions property.
     */
    public void setDelegatedPermissions(@jakarta.annotation.Nullable final java.util.List<FileStorageContainerTypeAppPermission> value) {
        this.backingStore.set("delegatedPermissions", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
