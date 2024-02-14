package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LearningAssignment extends LearningCourseActivity implements Parsable {
    /**
     * Instantiates a new {@link LearningAssignment} and sets the default values.
     */
    public LearningAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LearningAssignment}
     */
    @jakarta.annotation.Nonnull
    public static LearningAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LearningAssignment();
    }
    /**
     * Gets the assignedDateTime property value. Assigned date for the course activity. Optional.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAssignedDateTime() {
        return this.backingStore.get("assignedDateTime");
    }
    /**
     * Gets the assignerUserId property value. The user ID of the assigner. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignerUserId() {
        return this.backingStore.get("assignerUserId");
    }
    /**
     * Gets the assignmentType property value. The assignmentType property
     * @return a {@link AssignmentType}
     */
    @jakarta.annotation.Nullable
    public AssignmentType getAssignmentType() {
        return this.backingStore.get("assignmentType");
    }
    /**
     * Gets the dueDateTime property value. Due date for the course activity. Optional.
     * @return a {@link DateTimeTimeZone}
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getDueDateTime() {
        return this.backingStore.get("dueDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedDateTime", (n) -> { this.setAssignedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("assignerUserId", (n) -> { this.setAssignerUserId(n.getStringValue()); });
        deserializerMap.put("assignmentType", (n) -> { this.setAssignmentType(n.getEnumValue(AssignmentType::forValue)); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the notes property value. Notes for the course activity. Optional.
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("assignedDateTime", this.getAssignedDateTime());
        writer.writeStringValue("assignerUserId", this.getAssignerUserId());
        writer.writeEnumValue("assignmentType", this.getAssignmentType());
        writer.writeObjectValue("dueDateTime", this.getDueDateTime());
        writer.writeObjectValue("notes", this.getNotes());
    }
    /**
     * Sets the assignedDateTime property value. Assigned date for the course activity. Optional.
     * @param value Value to set for the assignedDateTime property.
     */
    public void setAssignedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("assignedDateTime", value);
    }
    /**
     * Sets the assignerUserId property value. The user ID of the assigner. Optional.
     * @param value Value to set for the assignerUserId property.
     */
    public void setAssignerUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignerUserId", value);
    }
    /**
     * Sets the assignmentType property value. The assignmentType property
     * @param value Value to set for the assignmentType property.
     */
    public void setAssignmentType(@jakarta.annotation.Nullable final AssignmentType value) {
        this.backingStore.set("assignmentType", value);
    }
    /**
     * Sets the dueDateTime property value. Due date for the course activity. Optional.
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.backingStore.set("dueDateTime", value);
    }
    /**
     * Sets the notes property value. Notes for the course activity. Optional.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("notes", value);
    }
}
