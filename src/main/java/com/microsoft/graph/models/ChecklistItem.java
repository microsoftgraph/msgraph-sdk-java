package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChecklistItem extends Entity implements Parsable {
    /**
     * The date and time when the checklistItem was finished.
     */
    private OffsetDateTime checkedDateTime;
    /**
     * The date and time when the checklistItem was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Field indicating the title of checklistItem.
     */
    private String displayName;
    /**
     * State indicating whether the item is checked off or not.
     */
    private Boolean isChecked;
    /**
     * Instantiates a new checklistItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChecklistItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a checklistItem
     */
    @javax.annotation.Nonnull
    public static ChecklistItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChecklistItem();
    }
    /**
     * Gets the checkedDateTime property value. The date and time when the checklistItem was finished.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCheckedDateTime() {
        return this.checkedDateTime;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the checklistItem was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the displayName property value. Field indicating the title of checklistItem.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("checkedDateTime", (n) -> { this.setCheckedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isChecked", (n) -> { this.setIsChecked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isChecked property value. State indicating whether the item is checked off or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsChecked() {
        return this.isChecked;
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
        writer.writeOffsetDateTimeValue("checkedDateTime", this.getCheckedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isChecked", this.getIsChecked());
    }
    /**
     * Sets the checkedDateTime property value. The date and time when the checklistItem was finished.
     * @param value Value to set for the checkedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCheckedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.checkedDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the checklistItem was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the displayName property value. Field indicating the title of checklistItem.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isChecked property value. State indicating whether the item is checked off or not.
     * @param value Value to set for the isChecked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsChecked(@javax.annotation.Nullable final Boolean value) {
        this.isChecked = value;
    }
}
