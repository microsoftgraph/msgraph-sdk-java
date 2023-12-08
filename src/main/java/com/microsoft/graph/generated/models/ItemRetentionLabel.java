package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemRetentionLabel extends Entity implements Parsable {
    /**
     * Instantiates a new ItemRetentionLabel and sets the default values.
     */
    public ItemRetentionLabel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ItemRetentionLabel
     */
    @jakarta.annotation.Nonnull
    public static ItemRetentionLabel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemRetentionLabel();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isLabelAppliedExplicitly", (n) -> { this.setIsLabelAppliedExplicitly(n.getBooleanValue()); });
        deserializerMap.put("labelAppliedBy", (n) -> { this.setLabelAppliedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("labelAppliedDateTime", (n) -> { this.setLabelAppliedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("retentionSettings", (n) -> { this.setRetentionSettings(n.getObjectValue(RetentionLabelSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isLabelAppliedExplicitly property value. Specifies whether the label is applied explicitly on the item. True indicates that the label is applied explicitly; otherwise, the label is inherited from its parent. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLabelAppliedExplicitly() {
        return this.backingStore.get("isLabelAppliedExplicitly");
    }
    /**
     * Gets the labelAppliedBy property value. Identity of the user who applied the label. Read-only.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLabelAppliedBy() {
        return this.backingStore.get("labelAppliedBy");
    }
    /**
     * Gets the labelAppliedDateTime property value. The date and time when the label was applied on the item. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLabelAppliedDateTime() {
        return this.backingStore.get("labelAppliedDateTime");
    }
    /**
     * Gets the name property value. The retention label on the document. Read-write.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the retentionSettings property value. The retention settings enforced on the item. Read-write.
     * @return a RetentionLabelSettings
     */
    @jakarta.annotation.Nullable
    public RetentionLabelSettings getRetentionSettings() {
        return this.backingStore.get("retentionSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isLabelAppliedExplicitly", this.getIsLabelAppliedExplicitly());
        writer.writeObjectValue("labelAppliedBy", this.getLabelAppliedBy());
        writer.writeOffsetDateTimeValue("labelAppliedDateTime", this.getLabelAppliedDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("retentionSettings", this.getRetentionSettings());
    }
    /**
     * Sets the isLabelAppliedExplicitly property value. Specifies whether the label is applied explicitly on the item. True indicates that the label is applied explicitly; otherwise, the label is inherited from its parent. Read-only.
     * @param value Value to set for the isLabelAppliedExplicitly property.
     */
    public void setIsLabelAppliedExplicitly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isLabelAppliedExplicitly", value);
    }
    /**
     * Sets the labelAppliedBy property value. Identity of the user who applied the label. Read-only.
     * @param value Value to set for the labelAppliedBy property.
     */
    public void setLabelAppliedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("labelAppliedBy", value);
    }
    /**
     * Sets the labelAppliedDateTime property value. The date and time when the label was applied on the item. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the labelAppliedDateTime property.
     */
    public void setLabelAppliedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("labelAppliedDateTime", value);
    }
    /**
     * Sets the name property value. The retention label on the document. Read-write.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the retentionSettings property value. The retention settings enforced on the item. Read-write.
     * @param value Value to set for the retentionSettings property.
     */
    public void setRetentionSettings(@jakarta.annotation.Nullable final RetentionLabelSettings value) {
        this.backingStore.set("retentionSettings", value);
    }
}
