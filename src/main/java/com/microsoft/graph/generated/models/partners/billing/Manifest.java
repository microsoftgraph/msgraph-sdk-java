package com.microsoft.graph.models.partners.billing;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Manifest extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Manifest} and sets the default values.
     */
    public Manifest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Manifest}
     */
    @jakarta.annotation.Nonnull
    public static Manifest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Manifest();
    }
    /**
     * Gets the blobCount property value. The total file count for this partner tenant ID.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBlobCount() {
        return this.backingStore.get("blobCount");
    }
    /**
     * Gets the blobs property value. A collection of blob objects that contain details of all the files for the partner tenant ID.
     * @return a {@link java.util.List<Blob>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Blob> getBlobs() {
        return this.backingStore.get("blobs");
    }
    /**
     * Gets the createdDateTime property value. The date and time when a manifest resource was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the dataFormat property value. The billing data file format. The possible value is: compressedJSONLines. Each blob is a compressed file and data in the file is in JSON lines format. Decompress the file to access the data.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataFormat() {
        return this.backingStore.get("dataFormat");
    }
    /**
     * Gets the eTag property value. Version of data represented by the manifest. Any change in eTag indicates a new data version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getETag() {
        return this.backingStore.get("eTag");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("blobCount", (n) -> { this.setBlobCount(n.getIntegerValue()); });
        deserializerMap.put("blobs", (n) -> { this.setBlobs(n.getCollectionOfObjectValues(Blob::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dataFormat", (n) -> { this.setDataFormat(n.getStringValue()); });
        deserializerMap.put("eTag", (n) -> { this.setETag(n.getStringValue()); });
        deserializerMap.put("partitionType", (n) -> { this.setPartitionType(n.getStringValue()); });
        deserializerMap.put("partnerTenantId", (n) -> { this.setPartnerTenantId(n.getStringValue()); });
        deserializerMap.put("rootDirectory", (n) -> { this.setRootDirectory(n.getStringValue()); });
        deserializerMap.put("sasToken", (n) -> { this.setSasToken(n.getStringValue()); });
        deserializerMap.put("schemaVersion", (n) -> { this.setSchemaVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the partitionType property value. Indicates the division of data. If a given partition has more than the supported number, the data is split into multiple files, each file representing a specific partitionValue. By default, the data in the file is partitioned by the number of line items.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPartitionType() {
        return this.backingStore.get("partitionType");
    }
    /**
     * Gets the partnerTenantId property value. The Microsoft Entra tenant ID of the partner.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPartnerTenantId() {
        return this.backingStore.get("partnerTenantId");
    }
    /**
     * Gets the rootDirectory property value. The root directory that contains all the files.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRootDirectory() {
        return this.backingStore.get("rootDirectory");
    }
    /**
     * Gets the sasToken property value. The SAS token for accessing the directory or an individual file in the directory.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSasToken() {
        return this.backingStore.get("sasToken");
    }
    /**
     * Gets the schemaVersion property value. The version of the manifest schema.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchemaVersion() {
        return this.backingStore.get("schemaVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("blobCount", this.getBlobCount());
        writer.writeCollectionOfObjectValues("blobs", this.getBlobs());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("dataFormat", this.getDataFormat());
        writer.writeStringValue("eTag", this.getETag());
        writer.writeStringValue("partitionType", this.getPartitionType());
        writer.writeStringValue("partnerTenantId", this.getPartnerTenantId());
        writer.writeStringValue("rootDirectory", this.getRootDirectory());
        writer.writeStringValue("sasToken", this.getSasToken());
        writer.writeStringValue("schemaVersion", this.getSchemaVersion());
    }
    /**
     * Sets the blobCount property value. The total file count for this partner tenant ID.
     * @param value Value to set for the blobCount property.
     */
    public void setBlobCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("blobCount", value);
    }
    /**
     * Sets the blobs property value. A collection of blob objects that contain details of all the files for the partner tenant ID.
     * @param value Value to set for the blobs property.
     */
    public void setBlobs(@jakarta.annotation.Nullable final java.util.List<Blob> value) {
        this.backingStore.set("blobs", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when a manifest resource was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the dataFormat property value. The billing data file format. The possible value is: compressedJSONLines. Each blob is a compressed file and data in the file is in JSON lines format. Decompress the file to access the data.
     * @param value Value to set for the dataFormat property.
     */
    public void setDataFormat(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dataFormat", value);
    }
    /**
     * Sets the eTag property value. Version of data represented by the manifest. Any change in eTag indicates a new data version.
     * @param value Value to set for the eTag property.
     */
    public void setETag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("eTag", value);
    }
    /**
     * Sets the partitionType property value. Indicates the division of data. If a given partition has more than the supported number, the data is split into multiple files, each file representing a specific partitionValue. By default, the data in the file is partitioned by the number of line items.
     * @param value Value to set for the partitionType property.
     */
    public void setPartitionType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("partitionType", value);
    }
    /**
     * Sets the partnerTenantId property value. The Microsoft Entra tenant ID of the partner.
     * @param value Value to set for the partnerTenantId property.
     */
    public void setPartnerTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("partnerTenantId", value);
    }
    /**
     * Sets the rootDirectory property value. The root directory that contains all the files.
     * @param value Value to set for the rootDirectory property.
     */
    public void setRootDirectory(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("rootDirectory", value);
    }
    /**
     * Sets the sasToken property value. The SAS token for accessing the directory or an individual file in the directory.
     * @param value Value to set for the sasToken property.
     */
    public void setSasToken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sasToken", value);
    }
    /**
     * Sets the schemaVersion property value. The version of the manifest schema.
     * @param value Value to set for the schemaVersion property.
     */
    public void setSchemaVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("schemaVersion", value);
    }
}
