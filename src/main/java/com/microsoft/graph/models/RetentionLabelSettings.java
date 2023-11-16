package com.microsoft.graph.models;

import com.microsoft.graph.models.security.BehaviorDuringRetentionPeriod;
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
public class RetentionLabelSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new RetentionLabelSettings and sets the default values.
     */
    public RetentionLabelSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RetentionLabelSettings
     */
    @jakarta.annotation.Nonnull
    public static RetentionLabelSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetentionLabelSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the behaviorDuringRetentionPeriod property value. Describes the item behavior during retention period. Possible values are: doNotRetain, retain, retainAsRecord, retainAsRegulatoryRecord, unknownFutureValue. Read-only.
     * @return a BehaviorDuringRetentionPeriod
     */
    @jakarta.annotation.Nullable
    public BehaviorDuringRetentionPeriod getBehaviorDuringRetentionPeriod() {
        return this.backingStore.get("behaviorDuringRetentionPeriod");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("behaviorDuringRetentionPeriod", (n) -> { this.setBehaviorDuringRetentionPeriod(n.getEnumValue(BehaviorDuringRetentionPeriod.class)); });
        deserializerMap.put("isContentUpdateAllowed", (n) -> { this.setIsContentUpdateAllowed(n.getBooleanValue()); });
        deserializerMap.put("isDeleteAllowed", (n) -> { this.setIsDeleteAllowed(n.getBooleanValue()); });
        deserializerMap.put("isLabelUpdateAllowed", (n) -> { this.setIsLabelUpdateAllowed(n.getBooleanValue()); });
        deserializerMap.put("isMetadataUpdateAllowed", (n) -> { this.setIsMetadataUpdateAllowed(n.getBooleanValue()); });
        deserializerMap.put("isRecordLocked", (n) -> { this.setIsRecordLocked(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isContentUpdateAllowed property value. Specifies whether updates to document content are allowed. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsContentUpdateAllowed() {
        return this.backingStore.get("isContentUpdateAllowed");
    }
    /**
     * Gets the isDeleteAllowed property value. Specifies whether the document deletion is allowed. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeleteAllowed() {
        return this.backingStore.get("isDeleteAllowed");
    }
    /**
     * Gets the isLabelUpdateAllowed property value. Specifies whether you're allowed to change the retention label on the document. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLabelUpdateAllowed() {
        return this.backingStore.get("isLabelUpdateAllowed");
    }
    /**
     * Gets the isMetadataUpdateAllowed property value. Specifies whether updates to the item metadata (for example, the Title field) are blocked. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMetadataUpdateAllowed() {
        return this.backingStore.get("isMetadataUpdateAllowed");
    }
    /**
     * Gets the isRecordLocked property value. Specifies whether the item is locked. Read-write.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRecordLocked() {
        return this.backingStore.get("isRecordLocked");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
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
        writer.writeEnumValue("behaviorDuringRetentionPeriod", this.getBehaviorDuringRetentionPeriod());
        writer.writeBooleanValue("isContentUpdateAllowed", this.getIsContentUpdateAllowed());
        writer.writeBooleanValue("isDeleteAllowed", this.getIsDeleteAllowed());
        writer.writeBooleanValue("isLabelUpdateAllowed", this.getIsLabelUpdateAllowed());
        writer.writeBooleanValue("isMetadataUpdateAllowed", this.getIsMetadataUpdateAllowed());
        writer.writeBooleanValue("isRecordLocked", this.getIsRecordLocked());
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
     * Sets the behaviorDuringRetentionPeriod property value. Describes the item behavior during retention period. Possible values are: doNotRetain, retain, retainAsRecord, retainAsRegulatoryRecord, unknownFutureValue. Read-only.
     * @param value Value to set for the behaviorDuringRetentionPeriod property.
     */
    public void setBehaviorDuringRetentionPeriod(@jakarta.annotation.Nullable final BehaviorDuringRetentionPeriod value) {
        this.backingStore.set("behaviorDuringRetentionPeriod", value);
    }
    /**
     * Sets the isContentUpdateAllowed property value. Specifies whether updates to document content are allowed. Read-only.
     * @param value Value to set for the isContentUpdateAllowed property.
     */
    public void setIsContentUpdateAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isContentUpdateAllowed", value);
    }
    /**
     * Sets the isDeleteAllowed property value. Specifies whether the document deletion is allowed. Read-only.
     * @param value Value to set for the isDeleteAllowed property.
     */
    public void setIsDeleteAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDeleteAllowed", value);
    }
    /**
     * Sets the isLabelUpdateAllowed property value. Specifies whether you're allowed to change the retention label on the document. Read-only.
     * @param value Value to set for the isLabelUpdateAllowed property.
     */
    public void setIsLabelUpdateAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isLabelUpdateAllowed", value);
    }
    /**
     * Sets the isMetadataUpdateAllowed property value. Specifies whether updates to the item metadata (for example, the Title field) are blocked. Read-only.
     * @param value Value to set for the isMetadataUpdateAllowed property.
     */
    public void setIsMetadataUpdateAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMetadataUpdateAllowed", value);
    }
    /**
     * Sets the isRecordLocked property value. Specifies whether the item is locked. Read-write.
     * @param value Value to set for the isRecordLocked property.
     */
    public void setIsRecordLocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRecordLocked", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
