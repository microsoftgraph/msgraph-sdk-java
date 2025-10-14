package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for a single installer file that is associated with a given mobileAppContent version.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppContentFile extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MobileAppContentFile} and sets the default values.
     */
    public MobileAppContentFile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileAppContentFile}
     */
    @jakarta.annotation.Nonnull
    public static MobileAppContentFile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppContentFile();
    }
    /**
     * Gets the azureStorageUri property value. Indicates the Azure Storage URI that the file is uploaded to. Created by the service upon receiving a valid mobileAppContentFile. Read-only. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureStorageUri() {
        return this.backingStore.get("azureStorageUri");
    }
    /**
     * Gets the azureStorageUriExpirationDateTime property value. Indicates the date and time when the Azure storage URI expires, in ISO 8601 format. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Read-only. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAzureStorageUriExpirationDateTime() {
        return this.backingStore.get("azureStorageUriExpirationDateTime");
    }
    /**
     * Gets the createdDateTime property value. Indicates created date and time associated with app content file, in ISO 8601 format. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Read-only. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureStorageUri", (n) -> { this.setAzureStorageUri(n.getStringValue()); });
        deserializerMap.put("azureStorageUriExpirationDateTime", (n) -> { this.setAzureStorageUriExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isCommitted", (n) -> { this.setIsCommitted(n.getBooleanValue()); });
        deserializerMap.put("isDependency", (n) -> { this.setIsDependency(n.getBooleanValue()); });
        deserializerMap.put("manifest", (n) -> { this.setManifest(n.getByteArrayValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("sizeEncrypted", (n) -> { this.setSizeEncrypted(n.getLongValue()); });
        deserializerMap.put("uploadState", (n) -> { this.setUploadState(n.getEnumValue(MobileAppContentFileUploadState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isCommitted property value. A value indicating whether the file is committed. A committed app content file has been fully uploaded and validated by the Intune service. TRUE means that app content file is committed, FALSE means that app content file is not committed. Defaults to FALSE. Read-only. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCommitted() {
        return this.backingStore.get("isCommitted");
    }
    /**
     * Gets the isDependency property value. Indicates whether this content file is a dependency for the main content file. TRUE means that the content file is a dependency, FALSE means that the content file is not a dependency and is the main content file. Defaults to FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDependency() {
        return this.backingStore.get("isDependency");
    }
    /**
     * Gets the manifest property value. Indicates the manifest information, containing file metadata.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getManifest() {
        return this.backingStore.get("manifest");
    }
    /**
     * Gets the name property value. Indicates the name of the file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the size property value. Indicates the original size of the file, in bytes.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Gets the sizeEncrypted property value. Indicates the size of the file after encryption, in bytes.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSizeEncrypted() {
        return this.backingStore.get("sizeEncrypted");
    }
    /**
     * Gets the uploadState property value. Contains properties for upload request states.
     * @return a {@link MobileAppContentFileUploadState}
     */
    @jakarta.annotation.Nullable
    public MobileAppContentFileUploadState getUploadState() {
        return this.backingStore.get("uploadState");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isDependency", this.getIsDependency());
        writer.writeByteArrayValue("manifest", this.getManifest());
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("size", this.getSize());
        writer.writeLongValue("sizeEncrypted", this.getSizeEncrypted());
        writer.writeEnumValue("uploadState", this.getUploadState());
    }
    /**
     * Sets the azureStorageUri property value. Indicates the Azure Storage URI that the file is uploaded to. Created by the service upon receiving a valid mobileAppContentFile. Read-only. This property is read-only.
     * @param value Value to set for the azureStorageUri property.
     */
    public void setAzureStorageUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureStorageUri", value);
    }
    /**
     * Sets the azureStorageUriExpirationDateTime property value. Indicates the date and time when the Azure storage URI expires, in ISO 8601 format. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Read-only. This property is read-only.
     * @param value Value to set for the azureStorageUriExpirationDateTime property.
     */
    public void setAzureStorageUriExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("azureStorageUriExpirationDateTime", value);
    }
    /**
     * Sets the createdDateTime property value. Indicates created date and time associated with app content file, in ISO 8601 format. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Read-only. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the isCommitted property value. A value indicating whether the file is committed. A committed app content file has been fully uploaded and validated by the Intune service. TRUE means that app content file is committed, FALSE means that app content file is not committed. Defaults to FALSE. Read-only. This property is read-only.
     * @param value Value to set for the isCommitted property.
     */
    public void setIsCommitted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCommitted", value);
    }
    /**
     * Sets the isDependency property value. Indicates whether this content file is a dependency for the main content file. TRUE means that the content file is a dependency, FALSE means that the content file is not a dependency and is the main content file. Defaults to FALSE.
     * @param value Value to set for the isDependency property.
     */
    public void setIsDependency(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDependency", value);
    }
    /**
     * Sets the manifest property value. Indicates the manifest information, containing file metadata.
     * @param value Value to set for the manifest property.
     */
    public void setManifest(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("manifest", value);
    }
    /**
     * Sets the name property value. Indicates the name of the file.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the size property value. Indicates the original size of the file, in bytes.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("size", value);
    }
    /**
     * Sets the sizeEncrypted property value. Indicates the size of the file after encryption, in bytes.
     * @param value Value to set for the sizeEncrypted property.
     */
    public void setSizeEncrypted(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sizeEncrypted", value);
    }
    /**
     * Sets the uploadState property value. Contains properties for upload request states.
     * @param value Value to set for the uploadState property.
     */
    public void setUploadState(@jakarta.annotation.Nullable final MobileAppContentFileUploadState value) {
        this.backingStore.set("uploadState", value);
    }
}
