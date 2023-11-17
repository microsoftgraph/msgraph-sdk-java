package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeetingAttendanceReport extends Entity implements Parsable {
    /**
     * Instantiates a new MeetingAttendanceReport and sets the default values.
     */
    public MeetingAttendanceReport() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MeetingAttendanceReport
     */
    @jakarta.annotation.Nonnull
    public static MeetingAttendanceReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingAttendanceReport();
    }
    /**
     * Gets the attendanceRecords property value. List of attendance records of an attendance report. Read-only.
     * @return a java.util.List<AttendanceRecord>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttendanceRecord> getAttendanceRecords() {
        return this.backingStore.get("attendanceRecords");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getMeetingEndDateTime() {
        return this.backingStore.get("meetingEndDateTime");
    }
    /**
     * Gets the meetingStartDateTime property value. UTC time when the meeting started. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getMeetingStartDateTime() {
        return this.backingStore.get("meetingStartDateTime");
    }
    /**
     * Gets the totalParticipantCount property value. Total number of participants. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalParticipantCount() {
        return this.backingStore.get("totalParticipantCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAttendanceRecords(@jakarta.annotation.Nullable final java.util.List<AttendanceRecord> value) {
        this.backingStore.set("attendanceRecords", value);
    }
    /**
     * Sets the meetingEndDateTime property value. UTC time when the meeting ended. Read-only.
     * @param value Value to set for the meetingEndDateTime property.
     */
    public void setMeetingEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("meetingEndDateTime", value);
    }
    /**
     * Sets the meetingStartDateTime property value. UTC time when the meeting started. Read-only.
     * @param value Value to set for the meetingStartDateTime property.
     */
    public void setMeetingStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("meetingStartDateTime", value);
    }
    /**
     * Sets the totalParticipantCount property value. Total number of participants. Read-only.
     * @param value Value to set for the totalParticipantCount property.
     */
    public void setTotalParticipantCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalParticipantCount", value);
    }
}
