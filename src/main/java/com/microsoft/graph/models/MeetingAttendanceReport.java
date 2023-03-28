package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingAttendanceReport extends Entity implements Parsable {
    /** List of attendance records of an attendance report. Read-only. */
    private java.util.List<AttendanceRecord> attendanceRecords;
    /** UTC time when the meeting ended. Read-only. */
    private OffsetDateTime meetingEndDateTime;
    /** UTC time when the meeting started. Read-only. */
    private OffsetDateTime meetingStartDateTime;
    /** Total number of participants. Read-only. */
    private Integer totalParticipantCount;
    /**
     * Instantiates a new meetingAttendanceReport and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MeetingAttendanceReport() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingAttendanceReport
     */
    @javax.annotation.Nonnull
    public static MeetingAttendanceReport createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingAttendanceReport();
    }
    /**
     * Gets the attendanceRecords property value. List of attendance records of an attendance report. Read-only.
     * @return a attendanceRecord
     */
    @javax.annotation.Nullable
    public java.util.List<AttendanceRecord> getAttendanceRecords() {
        return this.attendanceRecords;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attendanceRecords", (n) -> { this.setAttendanceRecords(n.getCollectionOfObjectValues(AttendanceRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingEndDateTime", (n) -> { this.setMeetingEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("meetingStartDateTime", (n) -> { this.setMeetingStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("totalParticipantCount", (n) -> { this.setTotalParticipantCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the meetingEndDateTime property value. UTC time when the meeting ended. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getMeetingEndDateTime() {
        return this.meetingEndDateTime;
    }
    /**
     * Gets the meetingStartDateTime property value. UTC time when the meeting started. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getMeetingStartDateTime() {
        return this.meetingStartDateTime;
    }
    /**
     * Gets the totalParticipantCount property value. Total number of participants. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalParticipantCount() {
        return this.totalParticipantCount;
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
        writer.writeCollectionOfObjectValues("attendanceRecords", this.getAttendanceRecords());
        writer.writeOffsetDateTimeValue("meetingEndDateTime", this.getMeetingEndDateTime());
        writer.writeOffsetDateTimeValue("meetingStartDateTime", this.getMeetingStartDateTime());
        writer.writeIntegerValue("totalParticipantCount", this.getTotalParticipantCount());
    }
    /**
     * Sets the attendanceRecords property value. List of attendance records of an attendance report. Read-only.
     * @param value Value to set for the attendanceRecords property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttendanceRecords(@javax.annotation.Nullable final java.util.List<AttendanceRecord> value) {
        this.attendanceRecords = value;
    }
    /**
     * Sets the meetingEndDateTime property value. UTC time when the meeting ended. Read-only.
     * @param value Value to set for the meetingEndDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeetingEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.meetingEndDateTime = value;
    }
    /**
     * Sets the meetingStartDateTime property value. UTC time when the meeting started. Read-only.
     * @param value Value to set for the meetingStartDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeetingStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.meetingStartDateTime = value;
    }
    /**
     * Sets the totalParticipantCount property value. Total number of participants. Read-only.
     * @param value Value to set for the totalParticipantCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalParticipantCount(@javax.annotation.Nullable final Integer value) {
        this.totalParticipantCount = value;
    }
}
