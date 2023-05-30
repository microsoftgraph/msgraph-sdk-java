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
public class CallRecord extends Entity implements Parsable {
    /** UTC time when the last user left the call. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime endDateTime;
    /** Meeting URL associated to the call. May not be available for a peerToPeer call record type. */
    private String joinWebUrl;
    /** UTC time when the call record was created. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime lastModifiedDateTime;
    /** List of all the modalities used in the call. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue. */
    private java.util.List<Modality> modalities;
    /** The organizing party's identity. */
    private IdentitySet organizer;
    /** List of distinct identities involved in the call. */
    private java.util.List<IdentitySet> participants;
    /** List of sessions involved in the call. Peer-to-peer calls typically only have one session, whereas group calls typically have at least one session per participant. Read-only. Nullable. */
    private java.util.List<Session> sessions;
    /** UTC time when the first user joined the call. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime startDateTime;
    /** The type property */
    private CallType type;
    /** Monotonically increasing version of the call record. Higher version call records with the same id includes additional data compared to the lower version. */
    private Long version;
    /**
     * Instantiates a new callRecord and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CallRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a callRecord
     */
    @javax.annotation.Nonnull
    public static CallRecord createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallRecord();
    }
    /**
     * Gets the endDateTime property value. UTC time when the last user left the call. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("joinWebUrl", (n) -> { this.setJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modalities", (n) -> { this.setModalities(n.getCollectionOfEnumValues(Modality.class)); });
        deserializerMap.put("organizer", (n) -> { this.setOrganizer(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("participants", (n) -> { this.setParticipants(n.getCollectionOfObjectValues(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("sessions", (n) -> { this.setSessions(n.getCollectionOfObjectValues(Session::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(CallType.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the joinWebUrl property value. Meeting URL associated to the call. May not be available for a peerToPeer call record type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinWebUrl() {
        return this.joinWebUrl;
    }
    /**
     * Gets the lastModifiedDateTime property value. UTC time when the call record was created. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the modalities property value. List of all the modalities used in the call. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     * @return a modality
     */
    @javax.annotation.Nullable
    public java.util.List<Modality> getModalities() {
        return this.modalities;
    }
    /**
     * Gets the organizer property value. The organizing party's identity.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getOrganizer() {
        return this.organizer;
    }
    /**
     * Gets the participants property value. List of distinct identities involved in the call.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public java.util.List<IdentitySet> getParticipants() {
        return this.participants;
    }
    /**
     * Gets the sessions property value. List of sessions involved in the call. Peer-to-peer calls typically only have one session, whereas group calls typically have at least one session per participant. Read-only. Nullable.
     * @return a session
     */
    @javax.annotation.Nullable
    public java.util.List<Session> getSessions() {
        return this.sessions;
    }
    /**
     * Gets the startDateTime property value. UTC time when the first user joined the call. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the type property value. The type property
     * @return a callType
     */
    @javax.annotation.Nullable
    public CallType getType() {
        return this.type;
    }
    /**
     * Gets the version property value. Monotonically increasing version of the call record. Higher version call records with the same id includes additional data compared to the lower version.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getVersion() {
        return this.version;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the joinWebUrl property value. Meeting URL associated to the call. May not be available for a peerToPeer call record type.
     * @param value Value to set for the joinWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinWebUrl(@javax.annotation.Nullable final String value) {
        this.joinWebUrl = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. UTC time when the call record was created. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the modalities property value. List of all the modalities used in the call. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     * @param value Value to set for the modalities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModalities(@javax.annotation.Nullable final java.util.List<Modality> value) {
        this.modalities = value;
    }
    /**
     * Sets the organizer property value. The organizing party's identity.
     * @param value Value to set for the organizer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizer(@javax.annotation.Nullable final IdentitySet value) {
        this.organizer = value;
    }
    /**
     * Sets the participants property value. List of distinct identities involved in the call.
     * @param value Value to set for the participants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParticipants(@javax.annotation.Nullable final java.util.List<IdentitySet> value) {
        this.participants = value;
    }
    /**
     * Sets the sessions property value. List of sessions involved in the call. Peer-to-peer calls typically only have one session, whereas group calls typically have at least one session per participant. Read-only. Nullable.
     * @param value Value to set for the sessions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSessions(@javax.annotation.Nullable final java.util.List<Session> value) {
        this.sessions = value;
    }
    /**
     * Sets the startDateTime property value. UTC time when the first user joined the call. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final CallType value) {
        this.type = value;
    }
    /**
     * Sets the version property value. Monotonically increasing version of the call record. Higher version call records with the same id includes additional data compared to the lower version.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final Long value) {
        this.version = value;
    }
}
