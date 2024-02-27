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
public class DriveItemUploadableProperties implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DriveItemUploadableProperties} and sets the default values.
     */
    public DriveItemUploadableProperties() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DriveItemUploadableProperties}
     */
    @jakarta.annotation.Nonnull
    public static DriveItemUploadableProperties createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveItemUploadableProperties();
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
     * Gets the description property value. Provides a user-visible description of the item. Read-write. Only on OneDrive Personal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the driveItemSource property value. Information about the drive item source. Read-write. Only on OneDrive for Business and SharePoint.
     * @return a {@link DriveItemSource}
     */
    @jakarta.annotation.Nullable
    public DriveItemSource getDriveItemSource() {
        return this.backingStore.get("driveItemSource");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("driveItemSource", (n) -> { this.setDriveItemSource(n.getObjectValue(DriveItemSource::createFromDiscriminatorValue)); });
        deserializerMap.put("fileSize", (n) -> { this.setFileSize(n.getLongValue()); });
        deserializerMap.put("fileSystemInfo", (n) -> { this.setFileSystemInfo(n.getObjectValue(FileSystemInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaSource", (n) -> { this.setMediaSource(n.getObjectValue(MediaSource::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileSize property value. Provides an expected file size to perform a quota check before uploading. Only on OneDrive Personal.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getFileSize() {
        return this.backingStore.get("fileSize");
    }
    /**
     * Gets the fileSystemInfo property value. File system information on client. Read-write.
     * @return a {@link FileSystemInfo}
     */
    @jakarta.annotation.Nullable
    public FileSystemInfo getFileSystemInfo() {
        return this.backingStore.get("fileSystemInfo");
    }
    /**
     * Gets the mediaSource property value. Media source information. Read-write. Only on OneDrive for Business and SharePoint.
     * @return a {@link MediaSource}
     */
    @jakarta.annotation.Nullable
    public MediaSource getMediaSource() {
        return this.backingStore.get("mediaSource");
    }
    /**
     * Gets the name property value. The name of the item (filename and extension). Read-write.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("driveItemSource", this.getDriveItemSource());
        writer.writeLongValue("fileSize", this.getFileSize());
        writer.writeObjectValue("fileSystemInfo", this.getFileSystemInfo());
        writer.writeObjectValue("mediaSource", this.getMediaSource());
        writer.writeStringValue("name", this.getName());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the description property value. Provides a user-visible description of the item. Read-write. Only on OneDrive Personal.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the driveItemSource property value. Information about the drive item source. Read-write. Only on OneDrive for Business and SharePoint.
     * @param value Value to set for the driveItemSource property.
     */
    public void setDriveItemSource(@jakarta.annotation.Nullable final DriveItemSource value) {
        this.backingStore.set("driveItemSource", value);
    }
    /**
     * Sets the fileSize property value. Provides an expected file size to perform a quota check before uploading. Only on OneDrive Personal.
     * @param value Value to set for the fileSize property.
     */
    public void setFileSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("fileSize", value);
    }
    /**
     * Sets the fileSystemInfo property value. File system information on client. Read-write.
     * @param value Value to set for the fileSystemInfo property.
     */
    public void setFileSystemInfo(@jakarta.annotation.Nullable final FileSystemInfo value) {
        this.backingStore.set("fileSystemInfo", value);
    }
    /**
     * Sets the mediaSource property value. Media source information. Read-write. Only on OneDrive for Business and SharePoint.
     * @param value Value to set for the mediaSource property.
     */
    public void setMediaSource(@jakarta.annotation.Nullable final MediaSource value) {
        this.backingStore.set("mediaSource", value);
    }
    /**
     * Sets the name property value. The name of the item (filename and extension). Read-write.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
