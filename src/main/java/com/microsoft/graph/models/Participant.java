package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Participant extends Entity implements Parsable {
    /**
     * Instantiates a new Participant and sets the default values.
     */
    public Participant() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Participant
     */
    @jakarta.annotation.Nonnull
    public static Participant createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Participant();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public ParticipantInfo getInfo() {
        return this.backingStore.get("info");
    }
    /**
     * Gets the isInLobby property value. true if the participant is in lobby.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInLobby() {
        return this.backingStore.get("isInLobby");
    }
    /**
     * Gets the isMuted property value. true if the participant is muted (client or server muted).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMuted() {
        return this.backingStore.get("isMuted");
    }
    /**
     * Gets the mediaStreams property value. The list of media streams.
     * @return a java.util.List<MediaStream>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MediaStream> getMediaStreams() {
        return this.backingStore.get("mediaStreams");
    }
    /**
     * Gets the metadata property value. A blob of data provided by the participant in the roster.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMetadata() {
        return this.backingStore.get("metadata");
    }
    /**
     * Gets the recordingInfo property value. Information about whether the participant has recording capability.
     * @return a RecordingInfo
     */
    @jakarta.annotation.Nullable
    public RecordingInfo getRecordingInfo() {
        return this.backingStore.get("recordingInfo");
    }
    /**
     * Gets the restrictedExperience property value. Indicates the reason or reasons media content from this participant is restricted.
     * @return a OnlineMeetingRestricted
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingRestricted getRestrictedExperience() {
        return this.backingStore.get("restrictedExperience");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setInfo(@jakarta.annotation.Nullable final ParticipantInfo value) {
        this.backingStore.set("info", value);
    }
    /**
     * Sets the isInLobby property value. true if the participant is in lobby.
     * @param value Value to set for the isInLobby property.
     */
    public void setIsInLobby(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isInLobby", value);
    }
    /**
     * Sets the isMuted property value. true if the participant is muted (client or server muted).
     * @param value Value to set for the isMuted property.
     */
    public void setIsMuted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMuted", value);
    }
    /**
     * Sets the mediaStreams property value. The list of media streams.
     * @param value Value to set for the mediaStreams property.
     */
    public void setMediaStreams(@jakarta.annotation.Nullable final java.util.List<MediaStream> value) {
        this.backingStore.set("mediaStreams", value);
    }
    /**
     * Sets the metadata property value. A blob of data provided by the participant in the roster.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("metadata", value);
    }
    /**
     * Sets the recordingInfo property value. Information about whether the participant has recording capability.
     * @param value Value to set for the recordingInfo property.
     */
    public void setRecordingInfo(@jakarta.annotation.Nullable final RecordingInfo value) {
        this.backingStore.set("recordingInfo", value);
    }
    /**
     * Sets the restrictedExperience property value. Indicates the reason or reasons media content from this participant is restricted.
     * @param value Value to set for the restrictedExperience property.
     */
    public void setRestrictedExperience(@jakarta.annotation.Nullable final OnlineMeetingRestricted value) {
        this.backingStore.set("restrictedExperience", value);
    }
}
