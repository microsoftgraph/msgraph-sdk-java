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
     * Class-level default behavior for handling students who are added after the assignment is published. Possible values are: none, assignIfOpen.
     */
    private EducationAddedStudentAction addedStudentAction;
    /**
     * Optional field to control adding assignments to students' and teachers' calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: studentsOnly. The default value is none.
     */
    private EducationAddToCalendarOptions addToCalendarAction;
    /**
     * Class-level default value for due time field. Default value is 23:59:00.
     */
    private LocalTime dueTime;
    /**
     * Default Teams channel to which notifications will be sent. Default value is null.
     */
    private String notificationChannelUrl;
    /**
     * Instantiates a new educationAssignmentDefaults and sets the default values.
     */
    public EducationAssignmentDefaults() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationAssignmentDefaults
     */
    @jakarta.annotation.Nonnull
    public static EducationAssignmentDefaults createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentDefaults();
    }
    /**
     * Gets the addedStudentAction property value. Class-level default behavior for handling students who are added after the assignment is published. Possible values are: none, assignIfOpen.
     * @return a educationAddedStudentAction
     */
    @jakarta.annotation.Nullable
    public EducationAddedStudentAction getAddedStudentAction() {
        return this.addedStudentAction;
    }
    /**
     * Gets the addToCalendarAction property value. Optional field to control adding assignments to students' and teachers' calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: studentsOnly. The default value is none.
     * @return a educationAddToCalendarOptions
     */
    @jakarta.annotation.Nullable
    public EducationAddToCalendarOptions getAddToCalendarAction() {
        return this.addToCalendarAction;
    }
    /**
     * Gets the dueTime property value. Class-level default value for due time field. Default value is 23:59:00.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getDueTime() {
        return this.dueTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addedStudentAction", (n) -> { this.setAddedStudentAction(n.getEnumValue(EducationAddedStudentAction.class)); });
        deserializerMap.put("addToCalendarAction", (n) -> { this.setAddToCalendarAction(n.getEnumValue(EducationAddToCalendarOptions.class)); });
        deserializerMap.put("dueTime", (n) -> { this.setDueTime(n.getLocalTimeValue()); });
        deserializerMap.put("notificationChannelUrl", (n) -> { this.setNotificationChannelUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notificationChannelUrl property value. Default Teams channel to which notifications will be sent. Default value is null.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNotificationChannelUrl() {
        return this.notificationChannelUrl;
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
     * Sets the addedStudentAction property value. Class-level default behavior for handling students who are added after the assignment is published. Possible values are: none, assignIfOpen.
     * @param value Value to set for the addedStudentAction property.
     */
    public void setAddedStudentAction(@jakarta.annotation.Nullable final EducationAddedStudentAction value) {
        this.addedStudentAction = value;
    }
    /**
     * Sets the addToCalendarAction property value. Optional field to control adding assignments to students' and teachers' calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: studentsOnly. The default value is none.
     * @param value Value to set for the addToCalendarAction property.
     */
    public void setAddToCalendarAction(@jakarta.annotation.Nullable final EducationAddToCalendarOptions value) {
        this.addToCalendarAction = value;
    }
    /**
     * Sets the dueTime property value. Class-level default value for due time field. Default value is 23:59:00.
     * @param value Value to set for the dueTime property.
     */
    public void setDueTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.dueTime = value;
    }
    /**
     * Sets the notificationChannelUrl property value. Default Teams channel to which notifications will be sent. Default value is null.
     * @param value Value to set for the notificationChannelUrl property.
     */
    public void setNotificationChannelUrl(@jakarta.annotation.Nullable final String value) {
        this.notificationChannelUrl = value;
    }
}
