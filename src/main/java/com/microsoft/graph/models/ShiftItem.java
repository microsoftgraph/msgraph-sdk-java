package com.microsoft.graph.models;

import com.microsoft.graph.models.OpenShiftItem;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ShiftItem extends ScheduleEntity implements Parsable {
    /** An incremental part of a shift which can cover details of when and where an employee is during their shift. For example, an assignment or a scheduled break or lunch. Required. */
    private java.util.List<ShiftActivity> _activities;
    /** The shift label of the shiftItem. */
    private String _displayName;
    /** The shift notes for the shiftItem. */
    private String _notes;
    /**
     * Instantiates a new ShiftItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ShiftItem() {
        super();
        this.setOdataType("#microsoft.graph.shiftItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ShiftItem
     */
    @javax.annotation.Nonnull
    public static ShiftItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nullable
    public java.util.List<ShiftActivity> getActivities() {
        return this._activities;
    }
    /**
     * Gets the displayName property value. The shift label of the shiftItem.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ShiftItem currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("activities", (n) -> { currentObject.setActivities(n.getCollectionOfObjectValues(ShiftActivity::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getStringValue()); });
        }};
    }
    /**
     * Gets the notes property value. The shift notes for the shiftItem.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this._notes;
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
        writer.writeCollectionOfObjectValues("activities", this.getActivities());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("notes", this.getNotes());
    }
    /**
     * Sets the activities property value. An incremental part of a shift which can cover details of when and where an employee is during their shift. For example, an assignment or a scheduled break or lunch. Required.
     * @param value Value to set for the activities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivities(@javax.annotation.Nullable final java.util.List<ShiftActivity> value) {
        this._activities = value;
    }
    /**
     * Sets the displayName property value. The shift label of the shiftItem.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the notes property value. The shift notes for the shiftItem.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final String value) {
        this._notes = value;
    }
}
