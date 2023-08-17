package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ShiftItem extends ScheduleEntity implements Parsable {
    /**
     * An incremental part of a shift which can cover details of when and where an employee is during their shift. For example, an assignment or a scheduled break or lunch. Required.
     */
    private java.util.List<ShiftActivity> activities;
    /**
     * The shift label of the shiftItem.
     */
    private String displayName;
    /**
     * The shift notes for the shiftItem.
     */
    private String notes;
    /**
     * Instantiates a new shiftItem and sets the default values.
     */
    public ShiftItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a shiftItem
     */
    @jakarta.annotation.Nonnull
    public static ShiftItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.openShiftItem": return new OpenShiftItem();
            }
        }
        return new ShiftItem();
    }
    /**
     * Gets the activities property value. An incremental part of a shift which can cover details of when and where an employee is during their shift. For example, an assignment or a scheduled break or lunch. Required.
     * @return a shiftActivity
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShiftActivity> getActivities() {
        return this.activities;
    }
    /**
     * Gets the displayName property value. The shift label of the shiftItem.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activities", (n) -> { this.setActivities(n.getCollectionOfObjectValues(ShiftActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notes property value. The shift notes for the shiftItem.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("activities", this.getActivities());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("notes", this.getNotes());
    }
    /**
     * Sets the activities property value. An incremental part of a shift which can cover details of when and where an employee is during their shift. For example, an assignment or a scheduled break or lunch. Required.
     * @param value Value to set for the activities property.
     */
    public void setActivities(@jakarta.annotation.Nullable final java.util.List<ShiftActivity> value) {
        this.activities = value;
    }
    /**
     * Sets the displayName property value. The shift label of the shiftItem.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the notes property value. The shift notes for the shiftItem.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
}
