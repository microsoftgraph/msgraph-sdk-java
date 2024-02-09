package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttendanceRecord extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AttendanceRecord} and sets the default values.
     */
    public AttendanceRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AttendanceRecord}
     */
    @jakarta.annotation.Nonnull
    public static AttendanceRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttendanceRecord();
    }
    /**
     * Gets the attendanceIntervals property value. List of time periods between joining and leaving a meeting.
     * @return a {@link java.util.List<AttendanceInterval>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttendanceInterval> getAttendanceIntervals() {
        return this.backingStore.get("attendanceIntervals");
    }
    /**
     * Gets the emailAddress property value. Email address of the user associated with this attendance record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.backingStore.get("emailAddress");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getIdentity() {
        return this.backingStore.get("identity");
    }
    /**
     * Gets the role property value. Role of the attendee. Possible values are: None, Attendee, Presenter, and Organizer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Gets the totalAttendanceInSeconds property value. Total duration of the attendances in seconds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalAttendanceInSeconds() {
        return this.backingStore.get("totalAttendanceInSeconds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAttendanceIntervals(@jakarta.annotation.Nullable final java.util.List<AttendanceInterval> value) {
        this.backingStore.set("attendanceIntervals", value);
    }
    /**
     * Sets the emailAddress property value. Email address of the user associated with this attendance record.
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailAddress", value);
    }
    /**
     * Sets the identity property value. Identity of the user associated with this attendance record.
     * @param value Value to set for the identity property.
     */
    public void setIdentity(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("identity", value);
    }
    /**
     * Sets the role property value. Role of the attendee. Possible values are: None, Attendee, Presenter, and Organizer.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("role", value);
    }
    /**
     * Sets the totalAttendanceInSeconds property value. Total duration of the attendances in seconds.
     * @param value Value to set for the totalAttendanceInSeconds property.
     */
    public void setTotalAttendanceInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalAttendanceInSeconds", value);
    }
}
