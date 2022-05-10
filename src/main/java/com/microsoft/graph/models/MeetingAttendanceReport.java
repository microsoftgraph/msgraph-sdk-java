package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingAttendanceReport extends Entity implements Parsable {
    /** List of attendance records of an attendance report. Read-only. */
    private java.util.List<AttendanceRecord> _attendanceRecords;
    /** UTC time when the meeting ended. Read-only. */
    private OffsetDateTime _meetingEndDateTime;
    /** UTC time when the meeting started. Read-only. */
    private OffsetDateTime _meetingStartDateTime;
    /** Total number of participants. Read-only. */
    private Integer _totalParticipantCount;
    /**
     * Instantiates a new meetingAttendanceReport and sets the default values.
     * @return a void
     */
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
        return this._attendanceRecords;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MeetingAttendanceReport currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("attendanceRecords", (n) -> { currentObject.setAttendanceRecords(n.getCollectionOfObjectValues(AttendanceRecord::createFromDiscriminatorValue)); });
            this.put("meetingEndDateTime", (n) -> { currentObject.setMeetingEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("meetingStartDateTime", (n) -> { currentObject.setMeetingStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("totalParticipantCount", (n) -> { currentObject.setTotalParticipantCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the meetingEndDateTime property value. UTC time when the meeting ended. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getMeetingEndDateTime() {
        return this._meetingEndDateTime;
    }
    /**
     * Gets the meetingStartDateTime property value. UTC time when the meeting started. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getMeetingStartDateTime() {
        return this._meetingStartDateTime;
    }
    /**
     * Gets the totalParticipantCount property value. Total number of participants. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalParticipantCount() {
        return this._totalParticipantCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAttendanceRecords(@javax.annotation.Nullable final java.util.List<AttendanceRecord> value) {
        this._attendanceRecords = value;
    }
    /**
     * Sets the meetingEndDateTime property value. UTC time when the meeting ended. Read-only.
     * @param value Value to set for the meetingEndDateTime property.
     * @return a void
     */
    public void setMeetingEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._meetingEndDateTime = value;
    }
    /**
     * Sets the meetingStartDateTime property value. UTC time when the meeting started. Read-only.
     * @param value Value to set for the meetingStartDateTime property.
     * @return a void
     */
    public void setMeetingStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._meetingStartDateTime = value;
    }
    /**
     * Sets the totalParticipantCount property value. Total number of participants. Read-only.
     * @param value Value to set for the totalParticipantCount property.
     * @return a void
     */
    public void setTotalParticipantCount(@javax.annotation.Nullable final Integer value) {
        this._totalParticipantCount = value;
    }
}
