package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the educationRoot singleton. */
public class EducationAssignmentDefaults extends Entity implements Parsable {
    /** Class-level default behavior for handling students who are added after the assignment is published. Possible values are: none, assignIfOpen. */
    private EducationAddedStudentAction _addedStudentAction;
    /** Optional field to control adding assignments to students' and teachers' calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: studentsOnly. The default value is none. */
    private EducationAddToCalendarOptions _addToCalendarAction;
    /** Class-level default value for due time field. Default value is 23:59:00. */
    private LocalTime _dueTime;
    /** Default Teams channel to which notifications will be sent. Default value is null. */
    private String _notificationChannelUrl;
    /**
     * Instantiates a new educationAssignmentDefaults and sets the default values.
     * @return a void
     */
    public EducationAssignmentDefaults() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationAssignmentDefaults
     */
    @javax.annotation.Nonnull
    public static EducationAssignmentDefaults createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentDefaults();
    }
    /**
     * Gets the addedStudentAction property value. Class-level default behavior for handling students who are added after the assignment is published. Possible values are: none, assignIfOpen.
     * @return a educationAddedStudentAction
     */
    @javax.annotation.Nullable
    public EducationAddedStudentAction getAddedStudentAction() {
        return this._addedStudentAction;
    }
    /**
     * Gets the addToCalendarAction property value. Optional field to control adding assignments to students' and teachers' calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: studentsOnly. The default value is none.
     * @return a educationAddToCalendarOptions
     */
    @javax.annotation.Nullable
    public EducationAddToCalendarOptions getAddToCalendarAction() {
        return this._addToCalendarAction;
    }
    /**
     * Gets the dueTime property value. Class-level default value for due time field. Default value is 23:59:00.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDueTime() {
        return this._dueTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationAssignmentDefaults currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("addedStudentAction", (n) -> { currentObject.setAddedStudentAction(n.getEnumValue(EducationAddedStudentAction.class)); });
            this.put("addToCalendarAction", (n) -> { currentObject.setAddToCalendarAction(n.getEnumValue(EducationAddToCalendarOptions.class)); });
            this.put("dueTime", (n) -> { currentObject.setDueTime(n.getLocalTimeValue()); });
            this.put("notificationChannelUrl", (n) -> { currentObject.setNotificationChannelUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the notificationChannelUrl property value. Default Teams channel to which notifications will be sent. Default value is null.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationChannelUrl() {
        return this._notificationChannelUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAddedStudentAction(@javax.annotation.Nullable final EducationAddedStudentAction value) {
        this._addedStudentAction = value;
    }
    /**
     * Sets the addToCalendarAction property value. Optional field to control adding assignments to students' and teachers' calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: studentsOnly. The default value is none.
     * @param value Value to set for the addToCalendarAction property.
     * @return a void
     */
    public void setAddToCalendarAction(@javax.annotation.Nullable final EducationAddToCalendarOptions value) {
        this._addToCalendarAction = value;
    }
    /**
     * Sets the dueTime property value. Class-level default value for due time field. Default value is 23:59:00.
     * @param value Value to set for the dueTime property.
     * @return a void
     */
    public void setDueTime(@javax.annotation.Nullable final LocalTime value) {
        this._dueTime = value;
    }
    /**
     * Sets the notificationChannelUrl property value. Default Teams channel to which notifications will be sent. Default value is null.
     * @param value Value to set for the notificationChannelUrl property.
     * @return a void
     */
    public void setNotificationChannelUrl(@javax.annotation.Nullable final String value) {
        this._notificationChannelUrl = value;
    }
}
