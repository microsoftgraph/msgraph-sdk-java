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
public class MobileAppContentFile extends Entity implements Parsable {
    /**
     * The Azure Storage URI.
     */
    private String azureStorageUri;
    /**
     * The time the Azure storage Uri expires.
     */
    private OffsetDateTime azureStorageUriExpirationDateTime;
    /**
     * The time the file was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * A value indicating whether the file is committed.
     */
    private Boolean isCommitted;
    /**
     * The manifest information.
     */
    private byte[] manifest;
    /**
     * the file name.
     */
    private String name;
    /**
     * The size of the file prior to encryption.
     */
    private Long size;
    /**
     * The size of the file after encryption.
     */
    private Long sizeEncrypted;
    /**
     * Contains properties for upload request states.
     */
    private MobileAppContentFileUploadState uploadState;
    /**
     * Instantiates a new mobileAppContentFile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppContentFile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppContentFile
     */
    @javax.annotation.Nonnull
    public static MobileAppContentFile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppContentFile();
    }
    /**
     * Gets the azureStorageUri property value. The Azure Storage URI.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureStorageUri() {
        return this.azureStorageUri;
    }
    /**
     * Gets the azureStorageUriExpirationDateTime property value. The time the Azure storage Uri expires.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAzureStorageUriExpirationDateTime() {
        return this.azureStorageUriExpirationDateTime;
    }
    /**
     * Gets the createdDateTime property value. The time the file was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureStorageUri", (n) -> { this.setAzureStorageUri(n.getStringValue()); });
        deserializerMap.put("azureStorageUriExpirationDateTime", (n) -> { this.setAzureStorageUriExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isCommitted", (n) -> { this.setIsCommitted(n.getBooleanValue()); });
        deserializerMap.put("manifest", (n) -> { this.setManifest(n.getByteArrayValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("sizeEncrypted", (n) -> { this.setSizeEncrypted(n.getLongValue()); });
        deserializerMap.put("uploadState", (n) -> { this.setUploadState(n.getEnumValue(MobileAppContentFileUploadState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isCommitted property value. A value indicating whether the file is committed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCommitted() {
        return this.isCommitted;
    }
    /**
     * Gets the manifest property value. The manifest information.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getManifest() {
        return this.manifest;
    }
    /**
     * Gets the name property value. the file name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the size property value. The size of the file prior to encryption.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the sizeEncrypted property value. The size of the file after encryption.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSizeEncrypted() {
        return this.sizeEncrypted;
    }
    /**
     * Gets the uploadState property value. Contains properties for upload request states.
     * @return a mobileAppContentFileUploadState
     */
    @javax.annotation.Nullable
    public MobileAppContentFileUploadState getUploadState() {
        return this.uploadState;
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
        writer.writeStringValue("azureStorageUri", this.getAzureStorageUri());
        writer.writeOffsetDateTimeValue("azureStorageUriExpirationDateTime", this.getAzureStorageUriExpirationDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeBooleanValue("isCommitted", this.getIsCommitted());
        writer.writeByteArrayValue("manifest", this.getManifest());
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("size", this.getSize());
        writer.writeLongValue("sizeEncrypted", this.getSizeEncrypted());
        writer.writeEnumValue("uploadState", this.getUploadState());
    }
    /**
     * Sets the azureStorageUri property value. The Azure Storage URI.
     * @param value Value to set for the azureStorageUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureStorageUri(@javax.annotation.Nullable final String value) {
        this.azureStorageUri = value;
    }
    /**
     * Sets the azureStorageUriExpirationDateTime property value. The time the Azure storage Uri expires.
     * @param value Value to set for the azureStorageUriExpirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureStorageUriExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.azureStorageUriExpirationDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. The time the file was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the isCommitted property value. A value indicating whether the file is committed.
     * @param value Value to set for the isCommitted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCommitted(@javax.annotation.Nullable final Boolean value) {
        this.isCommitted = value;
    }
    /**
     * Sets the manifest property value. The manifest information.
     * @param value Value to set for the manifest property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManifest(@javax.annotation.Nullable final byte[] value) {
        this.manifest = value;
    }
    /**
     * Sets the name property value. the file name.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the size property value. The size of the file prior to encryption.
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the sizeEncrypted property value. The size of the file after encryption.
     * @param value Value to set for the sizeEncrypted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSizeEncrypted(@javax.annotation.Nullable final Long value) {
        this.sizeEncrypted = value;
    }
    /**
     * Sets the uploadState property value. Contains properties for upload request states.
     * @param value Value to set for the uploadState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUploadState(@javax.annotation.Nullable final MobileAppContentFileUploadState value) {
        this.uploadState = value;
    }
}
