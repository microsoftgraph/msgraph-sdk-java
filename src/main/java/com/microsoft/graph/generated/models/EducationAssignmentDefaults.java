package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationAssignmentDefaults extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EducationAssignmentDefaults} and sets the default values.
     */
    public EducationAssignmentDefaults() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationAssignmentDefaults}
     */
    @jakarta.annotation.Nonnull
    public static EducationAssignmentDefaults createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentDefaults();
    }
    /**
     * Gets the addedStudentAction property value. Class-level default behavior for handling students who are added after the assignment is published. The possible values are: none, assignIfOpen.
     * @return a {@link EducationAddedStudentAction}
     */
    @jakarta.annotation.Nullable
    public EducationAddedStudentAction getAddedStudentAction() {
        return this.backingStore.get("addedStudentAction");
    }
    /**
     * Gets the addToCalendarAction property value. Optional field to control adding assignments to students&apos; and teachers&apos; calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Use the Prefer: include-unknown-enum-members request header to get the following members in this evolvable enum: studentsOnly. The default value is none.
     * @return a {@link EducationAddToCalendarOptions}
     */
    @jakarta.annotation.Nullable
    public EducationAddToCalendarOptions getAddToCalendarAction() {
        return this.backingStore.get("addToCalendarAction");
    }
    /**
     * Gets the dueTime property value. Class-level default value for due time field. Default value is 23:59:00.
     * @return a {@link LocalTime}
     */
    @jakarta.annotation.Nullable
    public LocalTime getDueTime() {
        return this.backingStore.get("dueTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addedStudentAction", (n) -> { this.setAddedStudentAction(n.getEnumValue(EducationAddedStudentAction::forValue)); });
        deserializerMap.put("addToCalendarAction", (n) -> { this.setAddToCalendarAction(n.getEnumValue(EducationAddToCalendarOptions::forValue)); });
        deserializerMap.put("dueTime", (n) -> { this.setDueTime(n.getLocalTimeValue()); });
        deserializerMap.put("notificationChannelUrl", (n) -> { this.setNotificationChannelUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notificationChannelUrl property value. Default Teams channel to which notifications are sent. Default value is null.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotificationChannelUrl() {
        return this.backingStore.get("notificationChannelUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("addedStudentAction", this.getAddedStudentAction());
        writer.writeEnumValue("addToCalendarAction", this.getAddToCalendarAction());
        writer.writeLocalTimeValue("dueTime", this.getDueTime());
        writer.writeStringValue("notificationChannelUrl", this.getNotificationChannelUrl());
    }
    /**
     * Sets the addedStudentAction property value. Class-level default behavior for handling students who are added after the assignment is published. The possible values are: none, assignIfOpen.
     * @param value Value to set for the addedStudentAction property.
     */
    public void setAddedStudentAction(@jakarta.annotation.Nullable final EducationAddedStudentAction value) {
        this.backingStore.set("addedStudentAction", value);
    }
    /**
     * Sets the addToCalendarAction property value. Optional field to control adding assignments to students&apos; and teachers&apos; calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Use the Prefer: include-unknown-enum-members request header to get the following members in this evolvable enum: studentsOnly. The default value is none.
     * @param value Value to set for the addToCalendarAction property.
     */
    public void setAddToCalendarAction(@jakarta.annotation.Nullable final EducationAddToCalendarOptions value) {
        this.backingStore.set("addToCalendarAction", value);
    }
    /**
     * Sets the dueTime property value. Class-level default value for due time field. Default value is 23:59:00.
     * @param value Value to set for the dueTime property.
     */
    public void setDueTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("dueTime", value);
    }
    /**
     * Sets the notificationChannelUrl property value. Default Teams channel to which notifications are sent. Default value is null.
     * @param value Value to set for the notificationChannelUrl property.
     */
    public void setNotificationChannelUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notificationChannelUrl", value);
    }
}
