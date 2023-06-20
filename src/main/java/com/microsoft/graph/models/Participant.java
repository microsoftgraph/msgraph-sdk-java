package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Participant extends Entity implements Parsable {
    /** The info property */
    private ParticipantInfo info;
    /** true if the participant is in lobby. */
    private Boolean isInLobby;
    /** true if the participant is muted (client or server muted). */
    private Boolean isMuted;
    /** The list of media streams. */
    private java.util.List<MediaStream> mediaStreams;
    /** A blob of data provided by the participant in the roster. */
    private String metadata;
    /** Information about whether the participant has recording capability. */
    private RecordingInfo recordingInfo;
    /** Indicates the reason or reasons media content from this participant is restricted. */
    private OnlineMeetingRestricted restrictedExperience;
    /**
     * Instantiates a new participant and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("info", (n) -> { this.setInfo(n.getObjectValue(ParticipantInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("isInLobby", (n) -> { this.setIsInLobby(n.getBooleanValue()); });
        deserializerMap.put("isMuted", (n) -> { this.setIsMuted(n.getBooleanValue()); });
        deserializerMap.put("mediaStreams", (n) -> { this.setMediaStreams(n.getCollectionOfObjectValues(MediaStream::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getStringValue()); });
        deserializerMap.put("recordingInfo", (n) -> { this.setRecordingInfo(n.getObjectValue(RecordingInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("restrictedExperience", (n) -> { this.setRestrictedExperience(n.getObjectValue(OnlineMeetingRestricted::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the info property value. The info property
     * @return a ParticipantInfo
     */
    @javax.annotation.Nullable
    public ParticipantInfo getInfo() {
        return this.info;
    }
    /**
     * Gets the isInLobby property value. true if the participant is in lobby.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsInLobby() {
        return this.isInLobby;
    }
    /**
     * Gets the isMuted property value. true if the participant is muted (client or server muted).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMuted() {
        return this.isMuted;
    }
    /**
     * Gets the mediaStreams property value. The list of media streams.
     * @return a mediaStream
     */
    @javax.annotation.Nullable
    public java.util.List<MediaStream> getMediaStreams() {
        return this.mediaStreams;
    }
    /**
     * Gets the metadata property value. A blob of data provided by the participant in the roster.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the recordingInfo property value. Information about whether the participant has recording capability.
     * @return a recordingInfo
     */
    @javax.annotation.Nullable
    public RecordingInfo getRecordingInfo() {
        return this.recordingInfo;
    }
    /**
     * Gets the restrictedExperience property value. Indicates the reason or reasons media content from this participant is restricted.
     * @return a onlineMeetingRestricted
     */
    @javax.annotation.Nullable
    public OnlineMeetingRestricted getRestrictedExperience() {
        return this.restrictedExperience;
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
        writer.writeObjectValue("info", this.getInfo());
        writer.writeBooleanValue("isInLobby", this.getIsInLobby());
        writer.writeBooleanValue("isMuted", this.getIsMuted());
        writer.writeCollectionOfObjectValues("mediaStreams", this.getMediaStreams());
        writer.writeStringValue("metadata", this.getMetadata());
        writer.writeObjectValue("recordingInfo", this.getRecordingInfo());
        writer.writeObjectValue("restrictedExperience", this.getRestrictedExperience());
    }
    /**
     * Sets the info property value. The info property
     * @param value Value to set for the info property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInfo(@javax.annotation.Nullable final ParticipantInfo value) {
        this.info = value;
    }
    /**
     * Sets the isInLobby property value. true if the participant is in lobby.
     * @param value Value to set for the isInLobby property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsInLobby(@javax.annotation.Nullable final Boolean value) {
        this.isInLobby = value;
    }
    /**
     * Sets the isMuted property value. true if the participant is muted (client or server muted).
     * @param value Value to set for the isMuted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMuted(@javax.annotation.Nullable final Boolean value) {
        this.isMuted = value;
    }
    /**
     * Sets the mediaStreams property value. The list of media streams.
     * @param value Value to set for the mediaStreams property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaStreams(@javax.annotation.Nullable final java.util.List<MediaStream> value) {
        this.mediaStreams = value;
    }
    /**
     * Sets the metadata property value. A blob of data provided by the participant in the roster.
     * @param value Value to set for the metadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetadata(@javax.annotation.Nullable final String value) {
        this.metadata = value;
    }
    /**
     * Sets the recordingInfo property value. Information about whether the participant has recording capability.
     * @param value Value to set for the recordingInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecordingInfo(@javax.annotation.Nullable final RecordingInfo value) {
        this.recordingInfo = value;
    }
    /**
     * Sets the restrictedExperience property value. Indicates the reason or reasons media content from this participant is restricted.
     * @param value Value to set for the restrictedExperience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestrictedExperience(@javax.annotation.Nullable final OnlineMeetingRestricted value) {
        this.restrictedExperience = value;
    }
}
