package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Participant extends Entity implements Parsable {
    /** The info property  */
    private ParticipantInfo _info;
    /** true if the participant is in lobby.  */
    private Boolean _isInLobby;
    /** true if the participant is muted (client or server muted).  */
    private Boolean _isMuted;
    /** The list of media streams.  */
    private java.util.List<MediaStream> _mediaStreams;
    /** A blob of data provided by the participant in the roster.  */
    private String _metadata;
    /** Information on whether the participant has recording capability.  */
    private RecordingInfo _recordingInfo;
    /**
     * Instantiates a new participant and sets the default values.
     * @return a void
     */
    public Participant() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a participant
     */
    @javax.annotation.Nonnull
    public static Participant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Participant();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Participant currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("info", (n) -> { currentObject.setInfo(n.getObjectValue(ParticipantInfo::createFromDiscriminatorValue)); });
            this.put("isInLobby", (n) -> { currentObject.setIsInLobby(n.getBooleanValue()); });
            this.put("isMuted", (n) -> { currentObject.setIsMuted(n.getBooleanValue()); });
            this.put("mediaStreams", (n) -> { currentObject.setMediaStreams(n.getCollectionOfObjectValues(MediaStream::createFromDiscriminatorValue)); });
            this.put("metadata", (n) -> { currentObject.setMetadata(n.getStringValue()); });
            this.put("recordingInfo", (n) -> { currentObject.setRecordingInfo(n.getObjectValue(RecordingInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the info property value. The info property
     * @return a participantInfo
     */
    @javax.annotation.Nullable
    public ParticipantInfo getInfo() {
        return this._info;
    }
    /**
     * Gets the isInLobby property value. true if the participant is in lobby.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsInLobby() {
        return this._isInLobby;
    }
    /**
     * Gets the isMuted property value. true if the participant is muted (client or server muted).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMuted() {
        return this._isMuted;
    }
    /**
     * Gets the mediaStreams property value. The list of media streams.
     * @return a mediaStream
     */
    @javax.annotation.Nullable
    public java.util.List<MediaStream> getMediaStreams() {
        return this._mediaStreams;
    }
    /**
     * Gets the metadata property value. A blob of data provided by the participant in the roster.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMetadata() {
        return this._metadata;
    }
    /**
     * Gets the recordingInfo property value. Information on whether the participant has recording capability.
     * @return a recordingInfo
     */
    @javax.annotation.Nullable
    public RecordingInfo getRecordingInfo() {
        return this._recordingInfo;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("info", this.getInfo());
        writer.writeBooleanValue("isInLobby", this.getIsInLobby());
        writer.writeBooleanValue("isMuted", this.getIsMuted());
        writer.writeCollectionOfObjectValues("mediaStreams", this.getMediaStreams());
        writer.writeStringValue("metadata", this.getMetadata());
        writer.writeObjectValue("recordingInfo", this.getRecordingInfo());
    }
    /**
     * Sets the info property value. The info property
     * @param value Value to set for the info property.
     * @return a void
     */
    public void setInfo(@javax.annotation.Nullable final ParticipantInfo value) {
        this._info = value;
    }
    /**
     * Sets the isInLobby property value. true if the participant is in lobby.
     * @param value Value to set for the isInLobby property.
     * @return a void
     */
    public void setIsInLobby(@javax.annotation.Nullable final Boolean value) {
        this._isInLobby = value;
    }
    /**
     * Sets the isMuted property value. true if the participant is muted (client or server muted).
     * @param value Value to set for the isMuted property.
     * @return a void
     */
    public void setIsMuted(@javax.annotation.Nullable final Boolean value) {
        this._isMuted = value;
    }
    /**
     * Sets the mediaStreams property value. The list of media streams.
     * @param value Value to set for the mediaStreams property.
     * @return a void
     */
    public void setMediaStreams(@javax.annotation.Nullable final java.util.List<MediaStream> value) {
        this._mediaStreams = value;
    }
    /**
     * Sets the metadata property value. A blob of data provided by the participant in the roster.
     * @param value Value to set for the metadata property.
     * @return a void
     */
    public void setMetadata(@javax.annotation.Nullable final String value) {
        this._metadata = value;
    }
    /**
     * Sets the recordingInfo property value. Information on whether the participant has recording capability.
     * @param value Value to set for the recordingInfo property.
     * @return a void
     */
    public void setRecordingInfo(@javax.annotation.Nullable final RecordingInfo value) {
        this._recordingInfo = value;
    }
}
