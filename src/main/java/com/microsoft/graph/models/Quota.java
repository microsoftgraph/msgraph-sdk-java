package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Quota implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Total space consumed by files in the recycle bin, in bytes. Read-only.
     */
    private Long deleted;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Total space remaining before reaching the quota limit, in bytes. Read-only.
     */
    private Long remaining;
    /**
     * Enumeration value that indicates the state of the storage space. Read-only.
     */
    private String state;
    /**
     * Information about the drive's storage quota plans. Only in Personal OneDrive.
     */
    private StoragePlanInformation storagePlanInformation;
    /**
     * Total allowed storage space, in bytes. Read-only.
     */
    private Long total;
    /**
     * Total space used, in bytes. Read-only.
     */
    private Long used;
    /**
     * Instantiates a new quota and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Quota() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a quota
     */
    @jakarta.annotation.Nonnull
    public static Quota createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Quota();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deleted property value. Total space consumed by files in the recycle bin, in bytes. Read-only.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getDeleted() {
        return this.deleted;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("deleted", (n) -> { this.setDeleted(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("remaining", (n) -> { this.setRemaining(n.getLongValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("storagePlanInformation", (n) -> { this.setStoragePlanInformation(n.getObjectValue(StoragePlanInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getLongValue()); });
        deserializerMap.put("used", (n) -> { this.setUsed(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the remaining property value. Total space remaining before reaching the quota limit, in bytes. Read-only.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getRemaining() {
        return this.remaining;
    }
    /**
     * Gets the state property value. Enumeration value that indicates the state of the storage space. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the storagePlanInformation property value. Information about the drive's storage quota plans. Only in Personal OneDrive.
     * @return a storagePlanInformation
     */
    @jakarta.annotation.Nullable
    public StoragePlanInformation getStoragePlanInformation() {
        return this.storagePlanInformation;
    }
    /**
     * Gets the total property value. Total allowed storage space, in bytes. Read-only.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getTotal() {
        return this.total;
    }
    /**
     * Gets the used property value. Total space used, in bytes. Read-only.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getUsed() {
        return this.used;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("deleted", this.getDeleted());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("remaining", this.getRemaining());
        writer.writeStringValue("state", this.getState());
        writer.writeObjectValue("storagePlanInformation", this.getStoragePlanInformation());
        writer.writeLongValue("total", this.getTotal());
        writer.writeLongValue("used", this.getUsed());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deleted property value. Total space consumed by files in the recycle bin, in bytes. Read-only.
     * @param value Value to set for the deleted property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeleted(@jakarta.annotation.Nullable final Long value) {
        this.deleted = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the remaining property value. Total space remaining before reaching the quota limit, in bytes. Read-only.
     * @param value Value to set for the remaining property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRemaining(@jakarta.annotation.Nullable final Long value) {
        this.remaining = value;
    }
    /**
     * Sets the state property value. Enumeration value that indicates the state of the storage space. Read-only.
     * @param value Value to set for the state property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the storagePlanInformation property value. Information about the drive's storage quota plans. Only in Personal OneDrive.
     * @param value Value to set for the storagePlanInformation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStoragePlanInformation(@jakarta.annotation.Nullable final StoragePlanInformation value) {
        this.storagePlanInformation = value;
    }
    /**
     * Sets the total property value. Total allowed storage space, in bytes. Read-only.
     * @param value Value to set for the total property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTotal(@jakarta.annotation.Nullable final Long value) {
        this.total = value;
    }
    /**
     * Sets the used property value. Total space used, in bytes. Read-only.
     * @param value Value to set for the used property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUsed(@jakarta.annotation.Nullable final Long value) {
        this.used = value;
    }
}
