package microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
import microsoft.graph.models.IdentitySet;
/** Provides operations to manage the cloudCommunications singleton. */
public class CallRecord extends Entity implements Parsable {
    /** UTC time when the last user left the call. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _endDateTime;
    /** Meeting URL associated to the call. May not be available for a peerToPeer call record type. */
    private String _joinWebUrl;
    /** UTC time when the call record was created. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _lastModifiedDateTime;
    /** List of all the modalities used in the call. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue. */
    private java.util.List<String> _modalities;
    /** The organizing party's identity. */
    private IdentitySet _organizer;
    /** List of distinct identities involved in the call. */
    private java.util.List<IdentitySet> _participants;
    /** List of sessions involved in the call. Peer-to-peer calls typically only have one session, whereas group calls typically have at least one session per participant. Read-only. Nullable. */
    private java.util.List<Session> _sessions;
    /** UTC time when the first user joined the call. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _startDateTime;
    /** Indicates the type of the call. Possible values are: unknown, groupCall, peerToPeer, unknownFutureValue. */
    private CallType _type;
    /** Monotonically increasing version of the call record. Higher version call records with the same ID includes additional data compared to the lower version. */
    private Long _version;
    /**
     * Instantiates a new callRecord and sets the default values.
     * @return a void
     */
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
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CallRecord currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("joinWebUrl", (n) -> { currentObject.setJoinWebUrl(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("modalities", (n) -> { currentObject.setModalities(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("organizer", (n) -> { currentObject.setOrganizer(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("participants", (n) -> { currentObject.setParticipants(n.getCollectionOfObjectValues(IdentitySet::createFromDiscriminatorValue)); });
            this.put("sessions", (n) -> { currentObject.setSessions(n.getCollectionOfObjectValues(Session::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(CallType.class)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getLongValue()); });
        }};
    }
    /**
     * Gets the joinWebUrl property value. Meeting URL associated to the call. May not be available for a peerToPeer call record type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinWebUrl() {
        return this._joinWebUrl;
    }
    /**
     * Gets the lastModifiedDateTime property value. UTC time when the call record was created. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the modalities property value. List of all the modalities used in the call. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getModalities() {
        return this._modalities;
    }
    /**
     * Gets the organizer property value. The organizing party's identity.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getOrganizer() {
        return this._organizer;
    }
    /**
     * Gets the participants property value. List of distinct identities involved in the call.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public java.util.List<IdentitySet> getParticipants() {
        return this._participants;
    }
    /**
     * Gets the sessions property value. List of sessions involved in the call. Peer-to-peer calls typically only have one session, whereas group calls typically have at least one session per participant. Read-only. Nullable.
     * @return a session
     */
    @javax.annotation.Nullable
    public java.util.List<Session> getSessions() {
        return this._sessions;
    }
    /**
     * Gets the startDateTime property value. UTC time when the first user joined the call. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the type property value. Indicates the type of the call. Possible values are: unknown, groupCall, peerToPeer, unknownFutureValue.
     * @return a callType
     */
    @javax.annotation.Nullable
    public CallType getType() {
        return this._type;
    }
    /**
     * Gets the version property value. Monotonically increasing version of the call record. Higher version call records with the same ID includes additional data compared to the lower version.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("modalities", this.getModalities());
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
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the joinWebUrl property value. Meeting URL associated to the call. May not be available for a peerToPeer call record type.
     * @param value Value to set for the joinWebUrl property.
     * @return a void
     */
    public void setJoinWebUrl(@javax.annotation.Nullable final String value) {
        this._joinWebUrl = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. UTC time when the call record was created. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the modalities property value. List of all the modalities used in the call. Possible values are: unknown, audio, video, videoBasedScreenSharing, data, screenSharing, unknownFutureValue.
     * @param value Value to set for the modalities property.
     * @return a void
     */
    public void setModalities(@javax.annotation.Nullable final java.util.List<String> value) {
        this._modalities = value;
    }
    /**
     * Sets the organizer property value. The organizing party's identity.
     * @param value Value to set for the organizer property.
     * @return a void
     */
    public void setOrganizer(@javax.annotation.Nullable final IdentitySet value) {
        this._organizer = value;
    }
    /**
     * Sets the participants property value. List of distinct identities involved in the call.
     * @param value Value to set for the participants property.
     * @return a void
     */
    public void setParticipants(@javax.annotation.Nullable final java.util.List<IdentitySet> value) {
        this._participants = value;
    }
    /**
     * Sets the sessions property value. List of sessions involved in the call. Peer-to-peer calls typically only have one session, whereas group calls typically have at least one session per participant. Read-only. Nullable.
     * @param value Value to set for the sessions property.
     * @return a void
     */
    public void setSessions(@javax.annotation.Nullable final java.util.List<Session> value) {
        this._sessions = value;
    }
    /**
     * Sets the startDateTime property value. UTC time when the first user joined the call. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the type property value. Indicates the type of the call. Possible values are: unknown, groupCall, peerToPeer, unknownFutureValue.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final CallType value) {
        this._type = value;
    }
    /**
     * Sets the version property value. Monotonically increasing version of the call record. Higher version call records with the same ID includes additional data compared to the lower version.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final Long value) {
        this._version = value;
    }
}
