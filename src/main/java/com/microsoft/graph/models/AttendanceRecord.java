package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the cloudCommunications singleton. */
public class AttendanceRecord extends Entity implements Parsable {
    /** List of time periods between joining and leaving a meeting. */
    private java.util.List<AttendanceInterval> _attendanceIntervals;
    /** Email address of the user associated with this atttendance record. */
    private String _emailAddress;
    /** Identity of the user associated with this atttendance record. */
    private Identity _identity;
    /** Role of the attendee. Possible values are: None, Attendee, Presenter, and Organizer. */
    private String _role;
    /** Total duration of the attendances in seconds. */
    private Integer _totalAttendanceInSeconds;
    /**
     * Instantiates a new attendanceRecord and sets the default values.
     * @return a void
     */
    public AttendanceRecord() {
        super();
        this.setOdataType("#microsoft.graph.attendanceRecord");
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
        return this._attendanceIntervals;
    }
    /**
     * Gets the emailAddress property value. Email address of the user associated with this atttendance record.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailAddress() {
        return this._emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttendanceRecord currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("attendanceIntervals", (n) -> { currentObject.setAttendanceIntervals(n.getCollectionOfObjectValues(AttendanceInterval::createFromDiscriminatorValue)); });
            this.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getStringValue()); });
            this.put("identity", (n) -> { currentObject.setIdentity(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("role", (n) -> { currentObject.setRole(n.getStringValue()); });
            this.put("totalAttendanceInSeconds", (n) -> { currentObject.setTotalAttendanceInSeconds(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the identity property value. Identity of the user associated with this atttendance record.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getIdentity() {
        return this._identity;
    }
    /**
     * Gets the role property value. Role of the attendee. Possible values are: None, Attendee, Presenter, and Organizer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRole() {
        return this._role;
    }
    /**
     * Gets the totalAttendanceInSeconds property value. Total duration of the attendances in seconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalAttendanceInSeconds() {
        return this._totalAttendanceInSeconds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAttendanceIntervals(@javax.annotation.Nullable final java.util.List<AttendanceInterval> value) {
        this._attendanceIntervals = value;
    }
    /**
     * Sets the emailAddress property value. Email address of the user associated with this atttendance record.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this._emailAddress = value;
    }
    /**
     * Sets the identity property value. Identity of the user associated with this atttendance record.
     * @param value Value to set for the identity property.
     * @return a void
     */
    public void setIdentity(@javax.annotation.Nullable final Identity value) {
        this._identity = value;
    }
    /**
     * Sets the role property value. Role of the attendee. Possible values are: None, Attendee, Presenter, and Organizer.
     * @param value Value to set for the role property.
     * @return a void
     */
    public void setRole(@javax.annotation.Nullable final String value) {
        this._role = value;
    }
    /**
     * Sets the totalAttendanceInSeconds property value. Total duration of the attendances in seconds.
     * @param value Value to set for the totalAttendanceInSeconds property.
     * @return a void
     */
    public void setTotalAttendanceInSeconds(@javax.annotation.Nullable final Integer value) {
        this._totalAttendanceInSeconds = value;
    }
}
