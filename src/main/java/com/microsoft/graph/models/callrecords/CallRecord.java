package com.microsoft.graph.models.callrecords;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallRecord extends Entity implements Parsable {
    /**
     * Instantiates a new CallRecord and sets the default values.
     */
    public CallRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CallRecord
     */
    @jakarta.annotation.Nonnull
    public static CallRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallRecord();
    }
    /**
     * Gets the endDateTime property value. UTC time when the last user left the call. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("joinWebUrl", (n) -> { this.setJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modalities", (n) -> { this.setModalities(n.getCollectionOfEnumValues(Modality::forValue)); });
        deserializerMap.put("organizer", (n) -> { this.setOrganizer(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("participants", (n) -> { this.setParticipants(n.getCollectionOfObjectValues(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("sessions", (n) -> { this.setSessions(n.getCollectionOfObjectValues(Session::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(CallType::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the joinWebUrl property value. Meeting URL associated to the call. May not be available for a peerToPeer call record type.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJoinWebUrl() {
        return this.backingStore.get("joinWebUrl");
    }
    /**
     * Gets the lastModifiedDateTime property value. UTC time when the call record was created. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the modalities property value. List of all the modalities used in the call. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     * @return a java.util.List<Modality>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Modality> getModalities() {
        return this.backingStore.get("modalities");
    }
    /**
     * Gets the organizer property value. The organizing party's identity.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getOrganizer() {
        return this.backingStore.get("organizer");
    }
    /**
     * Gets the participants property value. List of distinct identities involved in the call.
     * @return a java.util.List<IdentitySet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentitySet> getParticipants() {
        return this.backingStore.get("participants");
    }
    /**
     * Gets the sessions property value. List of sessions involved in the call. Peer-to-peer calls typically only have one session, whereas group calls typically have at least one session per participant. Read-only. Nullable.
     * @return a java.util.List<Session>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Session> getSessions() {
        return this.backingStore.get("sessions");
    }
    /**
     * Gets the startDateTime property value. UTC time when the first user joined the call. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the type property value. The type property
     * @return a CallType
     */
    @jakarta.annotation.Nullable
    public CallType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Gets the version property value. Monotonically increasing version of the call record. Higher version call records with the same id includes additional data compared to the lower version.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfEnumValues("modalities", this.getModalities());
        writer.writeObjectValue("organizer", this.getOrganizer());
        writer.writeCollectionOfObjectValues("participants", this.getParticipants());
        writer.writeCollectionOfObjectValues("sessions", this.getSessions());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("type", this.getType());
        writer.writeLongValue("version", this.getVersion());
    }
    /**
     * Sets the endDateTime property value. UTC time when the last user left the call. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the joinWebUrl property value. Meeting URL associated to the call. May not be available for a peerToPeer call record type.
     * @param value Value to set for the joinWebUrl property.
     */
    public void setJoinWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("joinWebUrl", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. UTC time when the call record was created. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the modalities property value. List of all the modalities used in the call. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     * @param value Value to set for the modalities property.
     */
    public void setModalities(@jakarta.annotation.Nullable final java.util.List<Modality> value) {
        this.backingStore.set("modalities", value);
    }
    /**
     * Sets the organizer property value. The organizing party's identity.
     * @param value Value to set for the organizer property.
     */
    public void setOrganizer(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("organizer", value);
    }
    /**
     * Sets the participants property value. List of distinct identities involved in the call.
     * @param value Value to set for the participants property.
     */
    public void setParticipants(@jakarta.annotation.Nullable final java.util.List<IdentitySet> value) {
        this.backingStore.set("participants", value);
    }
    /**
     * Sets the sessions property value. List of sessions involved in the call. Peer-to-peer calls typically only have one session, whereas group calls typically have at least one session per participant. Read-only. Nullable.
     * @param value Value to set for the sessions property.
     */
    public void setSessions(@jakarta.annotation.Nullable final java.util.List<Session> value) {
        this.backingStore.set("sessions", value);
    }
    /**
     * Sets the startDateTime property value. UTC time when the first user joined the call. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final CallType value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the version property value. Monotonically increasing version of the call record. Higher version call records with the same id includes additional data compared to the lower version.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("version", value);
    }
}
