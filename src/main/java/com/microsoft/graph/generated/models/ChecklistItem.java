package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChecklistItem extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ChecklistItem} and sets the default values.
     */
    public ChecklistItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ChecklistItem}
     */
    @jakarta.annotation.Nonnull
    public static ChecklistItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChecklistItem();
    }
    /**
     * Gets the checkedDateTime property value. The date and time when the checklistItem was finished.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCheckedDateTime() {
        return this.backingStore.get("checkedDateTime");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the checklistItem was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. Indicates the title of the checklistItem.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("checkedDateTime", (n) -> { this.setCheckedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isChecked", (n) -> { this.setIsChecked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isChecked property value. State that indicates whether the item is checked off or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsChecked() {
        return this.backingStore.get("isChecked");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("checkedDateTime", this.getCheckedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isChecked", this.getIsChecked());
    }
    /**
     * Sets the checkedDateTime property value. The date and time when the checklistItem was finished.
     * @param value Value to set for the checkedDateTime property.
     */
    public void setCheckedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("checkedDateTime", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the checklistItem was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. Indicates the title of the checklistItem.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isChecked property value. State that indicates whether the item is checked off or not.
     * @param value Value to set for the isChecked property.
     */
    public void setIsChecked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isChecked", value);
    }
}
