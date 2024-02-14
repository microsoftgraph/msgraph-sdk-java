package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Call extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Call} and sets the default values.
     */
    public Call() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Call}
     */
    @jakarta.annotation.Nonnull
    public static Call createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Call();
    }
    /**
     * Gets the audioRoutingGroups property value. The audioRoutingGroups property
     * @return a {@link java.util.List<AudioRoutingGroup>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AudioRoutingGroup> getAudioRoutingGroups() {
        return this.backingStore.get("audioRoutingGroups");
    }
    /**
     * Gets the callbackUri property value. The callback URL on which callbacks are delivered. Must be an HTTPS URL.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallbackUri() {
        return this.backingStore.get("callbackUri");
    }
    /**
     * Gets the callChainId property value. A unique identifier for all the participant calls in a conference or a unique identifier for two participant calls in a P2P call.  This identifier must be copied over from Microsoft.Graph.Call.CallChainId.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallChainId() {
        return this.backingStore.get("callChainId");
    }
    /**
     * Gets the callOptions property value. Contains the optional features for the call.
     * @return a {@link CallOptions}
     */
    @jakarta.annotation.Nullable
    public CallOptions getCallOptions() {
        return this.backingStore.get("callOptions");
    }
    /**
     * Gets the callRoutes property value. The routing information on how the call was retargeted. Read-only.
     * @return a {@link java.util.List<CallRoute>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CallRoute> getCallRoutes() {
        return this.backingStore.get("callRoutes");
    }
    /**
     * Gets the chatInfo property value. The chat information. Required information for joining a meeting.
     * @return a {@link ChatInfo}
     */
    @jakarta.annotation.Nullable
    public ChatInfo getChatInfo() {
        return this.backingStore.get("chatInfo");
    }
    /**
     * Gets the contentSharingSessions property value. The contentSharingSessions property
     * @return a {@link java.util.List<ContentSharingSession>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentSharingSession> getContentSharingSessions() {
        return this.backingStore.get("contentSharingSessions");
    }
    /**
     * Gets the direction property value. The direction of the call. The possible values are incoming or outgoing. Read-only.
     * @return a {@link CallDirection}
     */
    @jakarta.annotation.Nullable
    public CallDirection getDirection() {
        return this.backingStore.get("direction");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audioRoutingGroups", (n) -> { this.setAudioRoutingGroups(n.getCollectionOfObjectValues(AudioRoutingGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("callbackUri", (n) -> { this.setCallbackUri(n.getStringValue()); });
        deserializerMap.put("callChainId", (n) -> { this.setCallChainId(n.getStringValue()); });
        deserializerMap.put("callOptions", (n) -> { this.setCallOptions(n.getObjectValue(CallOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("callRoutes", (n) -> { this.setCallRoutes(n.getCollectionOfObjectValues(CallRoute::createFromDiscriminatorValue)); });
        deserializerMap.put("chatInfo", (n) -> { this.setChatInfo(n.getObjectValue(ChatInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("contentSharingSessions", (n) -> { this.setContentSharingSessions(n.getCollectionOfObjectValues(ContentSharingSession::createFromDiscriminatorValue)); });
        deserializerMap.put("direction", (n) -> { this.setDirection(n.getEnumValue(CallDirection::forValue)); });
        deserializerMap.put("incomingContext", (n) -> { this.setIncomingContext(n.getObjectValue(IncomingContext::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaConfig", (n) -> { this.setMediaConfig(n.getObjectValue(MediaConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaState", (n) -> { this.setMediaState(n.getObjectValue(CallMediaState::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingInfo", (n) -> { this.setMeetingInfo(n.getObjectValue(MeetingInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("myParticipantId", (n) -> { this.setMyParticipantId(n.getStringValue()); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(CommsOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("participants", (n) -> { this.setParticipants(n.getCollectionOfObjectValues(Participant::createFromDiscriminatorValue)); });
        deserializerMap.put("requestedModalities", (n) -> { this.setRequestedModalities(n.getCollectionOfEnumValues(Modality::forValue)); });
        deserializerMap.put("resultInfo", (n) -> { this.setResultInfo(n.getObjectValue(ResultInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getObjectValue(ParticipantInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(CallState::forValue)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("targets", (n) -> { this.setTargets(n.getCollectionOfObjectValues(InvitationParticipantInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("toneInfo", (n) -> { this.setToneInfo(n.getObjectValue(ToneInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("transcription", (n) -> { this.setTranscription(n.getObjectValue(CallTranscriptionInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the incomingContext property value. Call context associated with an incoming call.
     * @return a {@link IncomingContext}
     */
    @jakarta.annotation.Nullable
    public IncomingContext getIncomingContext() {
        return this.backingStore.get("incomingContext");
    }
    /**
     * Gets the mediaConfig property value. The media configuration. Required.
     * @return a {@link MediaConfig}
     */
    @jakarta.annotation.Nullable
    public MediaConfig getMediaConfig() {
        return this.backingStore.get("mediaConfig");
    }
    /**
     * Gets the mediaState property value. Read-only. The call media state.
     * @return a {@link CallMediaState}
     */
    @jakarta.annotation.Nullable
    public CallMediaState getMediaState() {
        return this.backingStore.get("mediaState");
    }
    /**
     * Gets the meetingInfo property value. The meeting information. Required information for meeting scenarios.
     * @return a {@link MeetingInfo}
     */
    @jakarta.annotation.Nullable
    public MeetingInfo getMeetingInfo() {
        return this.backingStore.get("meetingInfo");
    }
    /**
     * Gets the myParticipantId property value. The myParticipantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMyParticipantId() {
        return this.backingStore.get("myParticipantId");
    }
    /**
     * Gets the operations property value. The operations property
     * @return a {@link java.util.List<CommsOperation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CommsOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Gets the participants property value. The participants property
     * @return a {@link java.util.List<Participant>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Participant> getParticipants() {
        return this.backingStore.get("participants");
    }
    /**
     * Gets the requestedModalities property value. The list of requested modalities. Possible values are: unknown, audio, video, videoBasedScreenSharing, data.
     * @return a {@link java.util.List<Modality>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Modality> getRequestedModalities() {
        return this.backingStore.get("requestedModalities");
    }
    /**
     * Gets the resultInfo property value. The result information. For example, the result can hold termination reason. Read-only.
     * @return a {@link ResultInfo}
     */
    @jakarta.annotation.Nullable
    public ResultInfo getResultInfo() {
        return this.backingStore.get("resultInfo");
    }
    /**
     * Gets the source property value. The originator of the call.
     * @return a {@link ParticipantInfo}
     */
    @jakarta.annotation.Nullable
    public ParticipantInfo getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Gets the state property value. The call state. Possible values are: incoming, establishing, ringing, established, hold, transferring, transferAccepted, redirecting, terminating, terminated. Read-only.
     * @return a {@link CallState}
     */
    @jakarta.annotation.Nullable
    public CallState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the subject property value. The subject of the conversation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the targets property value. The targets of the call. Required information for creating peer to peer call.
     * @return a {@link java.util.List<InvitationParticipantInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InvitationParticipantInfo> getTargets() {
        return this.backingStore.get("targets");
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the toneInfo property value. The toneInfo property
     * @return a {@link ToneInfo}
     */
    @jakarta.annotation.Nullable
    public ToneInfo getToneInfo() {
        return this.backingStore.get("toneInfo");
    }
    /**
     * Gets the transcription property value. The transcription information for the call. Read-only.
     * @return a {@link CallTranscriptionInfo}
     */
    @jakarta.annotation.Nullable
    public CallTranscriptionInfo getTranscription() {
        return this.backingStore.get("transcription");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("audioRoutingGroups", this.getAudioRoutingGroups());
        writer.writeStringValue("callbackUri", this.getCallbackUri());
        writer.writeStringValue("callChainId", this.getCallChainId());
        writer.writeObjectValue("callOptions", this.getCallOptions());
        writer.writeCollectionOfObjectValues("callRoutes", this.getCallRoutes());
        writer.writeObjectValue("chatInfo", this.getChatInfo());
        writer.writeCollectionOfObjectValues("contentSharingSessions", this.getContentSharingSessions());
        writer.writeEnumValue("direction", this.getDirection());
        writer.writeObjectValue("incomingContext", this.getIncomingContext());
        writer.writeObjectValue("mediaConfig", this.getMediaConfig());
        writer.writeObjectValue("mediaState", this.getMediaState());
        writer.writeObjectValue("meetingInfo", this.getMeetingInfo());
        writer.writeStringValue("myParticipantId", this.getMyParticipantId());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("participants", this.getParticipants());
        writer.writeCollectionOfEnumValues("requestedModalities", this.getRequestedModalities());
        writer.writeObjectValue("resultInfo", this.getResultInfo());
        writer.writeObjectValue("source", this.getSource());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeCollectionOfObjectValues("targets", this.getTargets());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeObjectValue("toneInfo", this.getToneInfo());
        writer.writeObjectValue("transcription", this.getTranscription());
    }
    /**
     * Sets the audioRoutingGroups property value. The audioRoutingGroups property
     * @param value Value to set for the audioRoutingGroups property.
     */
    public void setAudioRoutingGroups(@jakarta.annotation.Nullable final java.util.List<AudioRoutingGroup> value) {
        this.backingStore.set("audioRoutingGroups", value);
    }
    /**
     * Sets the callbackUri property value. The callback URL on which callbacks are delivered. Must be an HTTPS URL.
     * @param value Value to set for the callbackUri property.
     */
    public void setCallbackUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callbackUri", value);
    }
    /**
     * Sets the callChainId property value. A unique identifier for all the participant calls in a conference or a unique identifier for two participant calls in a P2P call.  This identifier must be copied over from Microsoft.Graph.Call.CallChainId.
     * @param value Value to set for the callChainId property.
     */
    public void setCallChainId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callChainId", value);
    }
    /**
     * Sets the callOptions property value. Contains the optional features for the call.
     * @param value Value to set for the callOptions property.
     */
    public void setCallOptions(@jakarta.annotation.Nullable final CallOptions value) {
        this.backingStore.set("callOptions", value);
    }
    /**
     * Sets the callRoutes property value. The routing information on how the call was retargeted. Read-only.
     * @param value Value to set for the callRoutes property.
     */
    public void setCallRoutes(@jakarta.annotation.Nullable final java.util.List<CallRoute> value) {
        this.backingStore.set("callRoutes", value);
    }
    /**
     * Sets the chatInfo property value. The chat information. Required information for joining a meeting.
     * @param value Value to set for the chatInfo property.
     */
    public void setChatInfo(@jakarta.annotation.Nullable final ChatInfo value) {
        this.backingStore.set("chatInfo", value);
    }
    /**
     * Sets the contentSharingSessions property value. The contentSharingSessions property
     * @param value Value to set for the contentSharingSessions property.
     */
    public void setContentSharingSessions(@jakarta.annotation.Nullable final java.util.List<ContentSharingSession> value) {
        this.backingStore.set("contentSharingSessions", value);
    }
    /**
     * Sets the direction property value. The direction of the call. The possible values are incoming or outgoing. Read-only.
     * @param value Value to set for the direction property.
     */
    public void setDirection(@jakarta.annotation.Nullable final CallDirection value) {
        this.backingStore.set("direction", value);
    }
    /**
     * Sets the incomingContext property value. Call context associated with an incoming call.
     * @param value Value to set for the incomingContext property.
     */
    public void setIncomingContext(@jakarta.annotation.Nullable final IncomingContext value) {
        this.backingStore.set("incomingContext", value);
    }
    /**
     * Sets the mediaConfig property value. The media configuration. Required.
     * @param value Value to set for the mediaConfig property.
     */
    public void setMediaConfig(@jakarta.annotation.Nullable final MediaConfig value) {
        this.backingStore.set("mediaConfig", value);
    }
    /**
     * Sets the mediaState property value. Read-only. The call media state.
     * @param value Value to set for the mediaState property.
     */
    public void setMediaState(@jakarta.annotation.Nullable final CallMediaState value) {
        this.backingStore.set("mediaState", value);
    }
    /**
     * Sets the meetingInfo property value. The meeting information. Required information for meeting scenarios.
     * @param value Value to set for the meetingInfo property.
     */
    public void setMeetingInfo(@jakarta.annotation.Nullable final MeetingInfo value) {
        this.backingStore.set("meetingInfo", value);
    }
    /**
     * Sets the myParticipantId property value. The myParticipantId property
     * @param value Value to set for the myParticipantId property.
     */
    public void setMyParticipantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("myParticipantId", value);
    }
    /**
     * Sets the operations property value. The operations property
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<CommsOperation> value) {
        this.backingStore.set("operations", value);
    }
    /**
     * Sets the participants property value. The participants property
     * @param value Value to set for the participants property.
     */
    public void setParticipants(@jakarta.annotation.Nullable final java.util.List<Participant> value) {
        this.backingStore.set("participants", value);
    }
    /**
     * Sets the requestedModalities property value. The list of requested modalities. Possible values are: unknown, audio, video, videoBasedScreenSharing, data.
     * @param value Value to set for the requestedModalities property.
     */
    public void setRequestedModalities(@jakarta.annotation.Nullable final java.util.List<Modality> value) {
        this.backingStore.set("requestedModalities", value);
    }
    /**
     * Sets the resultInfo property value. The result information. For example, the result can hold termination reason. Read-only.
     * @param value Value to set for the resultInfo property.
     */
    public void setResultInfo(@jakarta.annotation.Nullable final ResultInfo value) {
        this.backingStore.set("resultInfo", value);
    }
    /**
     * Sets the source property value. The originator of the call.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final ParticipantInfo value) {
        this.backingStore.set("source", value);
    }
    /**
     * Sets the state property value. The call state. Possible values are: incoming, establishing, ringing, established, hold, transferring, transferAccepted, redirecting, terminating, terminated. Read-only.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final CallState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the subject property value. The subject of the conversation.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the targets property value. The targets of the call. Required information for creating peer to peer call.
     * @param value Value to set for the targets property.
     */
    public void setTargets(@jakarta.annotation.Nullable final java.util.List<InvitationParticipantInfo> value) {
        this.backingStore.set("targets", value);
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the toneInfo property value. The toneInfo property
     * @param value Value to set for the toneInfo property.
     */
    public void setToneInfo(@jakarta.annotation.Nullable final ToneInfo value) {
        this.backingStore.set("toneInfo", value);
    }
    /**
     * Sets the transcription property value. The transcription information for the call. Read-only.
     * @param value Value to set for the transcription property.
     */
    public void setTranscription(@jakarta.annotation.Nullable final CallTranscriptionInfo value) {
        this.backingStore.set("transcription", value);
    }
}
