package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttendanceRecord extends Entity implements Parsable {
    /**
     * List of time periods between joining and leaving a meeting.
     */
    private java.util.List<AttendanceInterval> attendanceIntervals;
    /**
     * Email address of the user associated with this attendance record.
     */
    private String emailAddress;
    /**
     * Identity of the user associated with this attendance record.
     */
    private Identity identity;
    /**
     * Role of the attendee. Possible values are: None, Attendee, Presenter, and Organizer.
     */
    private String role;
    /**
     * Total duration of the attendances in seconds.
     */
    private Integer totalAttendanceInSeconds;
    /**
     * Instantiates a new attendanceRecord and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AttendanceRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attendanceRecord
     */
    @javax.annotation.Nonnull
    public static AttendanceRecord createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttendanceRecord();
    }
    /**
     * Gets the attendanceIntervals property value. List of time periods between joining and leaving a meeting.
     * @return a attendanceInterval
     */
    @javax.annotation.Nullable
    public java.util.List<AttendanceInterval> getAttendanceIntervals() {
        return this.attendanceIntervals;
    }
    /**
     * Gets the emailAddress property value. Email address of the user associated with this attendance record.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attendanceIntervals", (n) -> { this.setAttendanceIntervals(n.getCollectionOfObjectValues(AttendanceInterval::createFromDiscriminatorValue)); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("totalAttendanceInSeconds", (n) -> { this.setTotalAttendanceInSeconds(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identity property value. Identity of the user associated with this attendance record.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getIdentity() {
        return this.identity;
    }
    /**
     * Gets the role property value. Role of the attendee. Possible values are: None, Attendee, Presenter, and Organizer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRole() {
        return this.role;
    }
    /**
     * Gets the totalAttendanceInSeconds property value. Total duration of the attendances in seconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalAttendanceInSeconds() {
        return this.totalAttendanceInSeconds;
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
        writer.writeCollectionOfObjectValues("attendanceIntervals", this.getAttendanceIntervals());
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeObjectValue("identity", this.getIdentity());
        writer.writeStringValue("role", this.getRole());
        writer.writeIntegerValue("totalAttendanceInSeconds", this.getTotalAttendanceInSeconds());
    }
    /**
     * Sets the attendanceIntervals property value. List of time periods between joining and leaving a meeting.
     * @param value Value to set for the attendanceIntervals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttendanceIntervals(@javax.annotation.Nullable final java.util.List<AttendanceInterval> value) {
        this.attendanceIntervals = value;
    }
    /**
     * Sets the emailAddress property value. Email address of the user associated with this attendance record.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the identity property value. Identity of the user associated with this attendance record.
     * @param value Value to set for the identity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentity(@javax.annotation.Nullable final Identity value) {
        this.identity = value;
    }
    /**
     * Sets the role property value. Role of the attendee. Possible values are: None, Attendee, Presenter, and Organizer.
     * @param value Value to set for the role property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRole(@javax.annotation.Nullable final String value) {
        this.role = value;
    }
    /**
     * Sets the totalAttendanceInSeconds property value. Total duration of the attendances in seconds.
     * @param value Value to set for the totalAttendanceInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalAttendanceInSeconds(@javax.annotation.Nullable final Integer value) {
        this.totalAttendanceInSeconds = value;
    }
}
