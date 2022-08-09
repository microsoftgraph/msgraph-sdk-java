package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class Call extends Entity implements Parsable {
    /** The audioRoutingGroups property */
    private java.util.List<AudioRoutingGroup> _audioRoutingGroups;
    /** The callback URL on which callbacks will be delivered. Must be https. */
    private String _callbackUri;
    /** A unique identifier for all the participant calls in a conference or a unique identifier for two participant calls in a P2P call.  This needs to be copied over from Microsoft.Graph.Call.CallChainId. */
    private String _callChainId;
    /** Contains the optional features for the call. */
    private CallOptions _callOptions;
    /** The routing information on how the call was retargeted. Read-only. */
    private java.util.List<CallRoute> _callRoutes;
    /** The chat information. Required information for meeting scenarios. */
    private ChatInfo _chatInfo;
    /** The direction of the call. The possible value are incoming or outgoing. Read-only. */
    private CallDirection _direction;
    /** The context associated with an incoming call. Read-only. Server generated. */
    private IncomingContext _incomingContext;
    /** The media configuration. Required information for creating peer to peer calls or joining meetings. */
    private MediaConfig _mediaConfig;
    /** Read-only. The call media state. */
    private CallMediaState _mediaState;
    /** The meeting information. Required information for meeting scenarios. */
    private MeetingInfo _meetingInfo;
    /** The myParticipantId property */
    private String _myParticipantId;
    /** The operations property */
    private java.util.List<CommsOperation> _operations;
    /** The participants property */
    private java.util.List<Participant> _participants;
    /** The requestedModalities property */
    private java.util.List<String> _requestedModalities;
    /** The resultInfo property */
    private ResultInfo _resultInfo;
    /** The source property */
    private ParticipantInfo _source;
    /** The state property */
    private CallState _state;
    /** The subject property */
    private String _subject;
    /** The targets property */
    private java.util.List<InvitationParticipantInfo> _targets;
    /** The tenantId property */
    private String _tenantId;
    /** The toneInfo property */
    private ToneInfo _toneInfo;
    /** The transcription information for the call. Read-only. */
    private CallTranscriptionInfo _transcription;
    /**
     * Instantiates a new call and sets the default values.
     * @return a void
     */
    public Call() {
        super();
        this.setOdataType("#microsoft.graph.call");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a call
     */
    @javax.annotation.Nonnull
    public static Call createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Call();
    }
    /**
     * Gets the audioRoutingGroups property value. The audioRoutingGroups property
     * @return a audioRoutingGroup
     */
    @javax.annotation.Nullable
    public java.util.List<AudioRoutingGroup> getAudioRoutingGroups() {
        return this._audioRoutingGroups;
    }
    /**
     * Gets the callbackUri property value. The callback URL on which callbacks will be delivered. Must be https.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallbackUri() {
        return this._callbackUri;
    }
    /**
     * Gets the callChainId property value. A unique identifier for all the participant calls in a conference or a unique identifier for two participant calls in a P2P call.  This needs to be copied over from Microsoft.Graph.Call.CallChainId.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallChainId() {
        return this._callChainId;
    }
    /**
     * Gets the callOptions property value. Contains the optional features for the call.
     * @return a callOptions
     */
    @javax.annotation.Nullable
    public CallOptions getCallOptions() {
        return this._callOptions;
    }
    /**
     * Gets the callRoutes property value. The routing information on how the call was retargeted. Read-only.
     * @return a callRoute
     */
    @javax.annotation.Nullable
    public java.util.List<CallRoute> getCallRoutes() {
        return this._callRoutes;
    }
    /**
     * Gets the chatInfo property value. The chat information. Required information for meeting scenarios.
     * @return a chatInfo
     */
    @javax.annotation.Nullable
    public ChatInfo getChatInfo() {
        return this._chatInfo;
    }
    /**
     * Gets the direction property value. The direction of the call. The possible value are incoming or outgoing. Read-only.
     * @return a callDirection
     */
    @javax.annotation.Nullable
    public CallDirection getDirection() {
        return this._direction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Call currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("audioRoutingGroups", (n) -> { currentObject.setAudioRoutingGroups(n.getCollectionOfObjectValues(AudioRoutingGroup::createFromDiscriminatorValue)); });
            this.put("callbackUri", (n) -> { currentObject.setCallbackUri(n.getStringValue()); });
            this.put("callChainId", (n) -> { currentObject.setCallChainId(n.getStringValue()); });
            this.put("callOptions", (n) -> { currentObject.setCallOptions(n.getObjectValue(CallOptions::createFromDiscriminatorValue)); });
            this.put("callRoutes", (n) -> { currentObject.setCallRoutes(n.getCollectionOfObjectValues(CallRoute::createFromDiscriminatorValue)); });
            this.put("chatInfo", (n) -> { currentObject.setChatInfo(n.getObjectValue(ChatInfo::createFromDiscriminatorValue)); });
            this.put("direction", (n) -> { currentObject.setDirection(n.getEnumValue(CallDirection.class)); });
            this.put("incomingContext", (n) -> { currentObject.setIncomingContext(n.getObjectValue(IncomingContext::createFromDiscriminatorValue)); });
            this.put("mediaConfig", (n) -> { currentObject.setMediaConfig(n.getObjectValue(MediaConfig::createFromDiscriminatorValue)); });
            this.put("mediaState", (n) -> { currentObject.setMediaState(n.getObjectValue(CallMediaState::createFromDiscriminatorValue)); });
            this.put("meetingInfo", (n) -> { currentObject.setMeetingInfo(n.getObjectValue(MeetingInfo::createFromDiscriminatorValue)); });
            this.put("myParticipantId", (n) -> { currentObject.setMyParticipantId(n.getStringValue()); });
            this.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfObjectValues(CommsOperation::createFromDiscriminatorValue)); });
            this.put("participants", (n) -> { currentObject.setParticipants(n.getCollectionOfObjectValues(Participant::createFromDiscriminatorValue)); });
            this.put("requestedModalities", (n) -> { currentObject.setRequestedModalities(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("resultInfo", (n) -> { currentObject.setResultInfo(n.getObjectValue(ResultInfo::createFromDiscriminatorValue)); });
            this.put("source", (n) -> { currentObject.setSource(n.getObjectValue(ParticipantInfo::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(CallState.class)); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
            this.put("targets", (n) -> { currentObject.setTargets(n.getCollectionOfObjectValues(InvitationParticipantInfo::createFromDiscriminatorValue)); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
            this.put("toneInfo", (n) -> { currentObject.setToneInfo(n.getObjectValue(ToneInfo::createFromDiscriminatorValue)); });
            this.put("transcription", (n) -> { currentObject.setTranscription(n.getObjectValue(CallTranscriptionInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the incomingContext property value. The context associated with an incoming call. Read-only. Server generated.
     * @return a incomingContext
     */
    @javax.annotation.Nullable
    public IncomingContext getIncomingContext() {
        return this._incomingContext;
    }
    /**
     * Gets the mediaConfig property value. The media configuration. Required information for creating peer to peer calls or joining meetings.
     * @return a mediaConfig
     */
    @javax.annotation.Nullable
    public MediaConfig getMediaConfig() {
        return this._mediaConfig;
    }
    /**
     * Gets the mediaState property value. Read-only. The call media state.
     * @return a callMediaState
     */
    @javax.annotation.Nullable
    public CallMediaState getMediaState() {
        return this._mediaState;
    }
    /**
     * Gets the meetingInfo property value. The meeting information. Required information for meeting scenarios.
     * @return a meetingInfo
     */
    @javax.annotation.Nullable
    public MeetingInfo getMeetingInfo() {
        return this._meetingInfo;
    }
    /**
     * Gets the myParticipantId property value. The myParticipantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMyParticipantId() {
        return this._myParticipantId;
    }
    /**
     * Gets the operations property value. The operations property
     * @return a commsOperation
     */
    @javax.annotation.Nullable
    public java.util.List<CommsOperation> getOperations() {
        return this._operations;
    }
    /**
     * Gets the participants property value. The participants property
     * @return a participant
     */
    @javax.annotation.Nullable
    public java.util.List<Participant> getParticipants() {
        return this._participants;
    }
    /**
     * Gets the requestedModalities property value. The requestedModalities property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRequestedModalities() {
        return this._requestedModalities;
    }
    /**
     * Gets the resultInfo property value. The resultInfo property
     * @return a resultInfo
     */
    @javax.annotation.Nullable
    public ResultInfo getResultInfo() {
        return this._resultInfo;
    }
    /**
     * Gets the source property value. The source property
     * @return a participantInfo
     */
    @javax.annotation.Nullable
    public ParticipantInfo getSource() {
        return this._source;
    }
    /**
     * Gets the state property value. The state property
     * @return a callState
     */
    @javax.annotation.Nullable
    public CallState getState() {
        return this._state;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Gets the targets property value. The targets property
     * @return a invitationParticipantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<InvitationParticipantInfo> getTargets() {
        return this._targets;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the toneInfo property value. The toneInfo property
     * @return a toneInfo
     */
    @javax.annotation.Nullable
    public ToneInfo getToneInfo() {
        return this._toneInfo;
    }
    /**
     * Gets the transcription property value. The transcription information for the call. Read-only.
     * @return a callTranscriptionInfo
     */
    @javax.annotation.Nullable
    public CallTranscriptionInfo getTranscription() {
        return this._transcription;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("audioRoutingGroups", this.getAudioRoutingGroups());
        writer.writeStringValue("callbackUri", this.getCallbackUri());
        writer.writeStringValue("callChainId", this.getCallChainId());
        writer.writeObjectValue("callOptions", this.getCallOptions());
        writer.writeCollectionOfObjectValues("callRoutes", this.getCallRoutes());
        writer.writeObjectValue("chatInfo", this.getChatInfo());
        writer.writeEnumValue("direction", this.getDirection());
        writer.writeObjectValue("incomingContext", this.getIncomingContext());
        writer.writeObjectValue("mediaConfig", this.getMediaConfig());
        writer.writeObjectValue("mediaState", this.getMediaState());
        writer.writeObjectValue("meetingInfo", this.getMeetingInfo());
        writer.writeStringValue("myParticipantId", this.getMyParticipantId());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("participants", this.getParticipants());
        writer.writeCollectionOfPrimitiveValues("requestedModalities", this.getRequestedModalities());
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
     * @return a void
     */
    public void setAudioRoutingGroups(@javax.annotation.Nullable final java.util.List<AudioRoutingGroup> value) {
        this._audioRoutingGroups = value;
    }
    /**
     * Sets the callbackUri property value. The callback URL on which callbacks will be delivered. Must be https.
     * @param value Value to set for the callbackUri property.
     * @return a void
     */
    public void setCallbackUri(@javax.annotation.Nullable final String value) {
        this._callbackUri = value;
    }
    /**
     * Sets the callChainId property value. A unique identifier for all the participant calls in a conference or a unique identifier for two participant calls in a P2P call.  This needs to be copied over from Microsoft.Graph.Call.CallChainId.
     * @param value Value to set for the callChainId property.
     * @return a void
     */
    public void setCallChainId(@javax.annotation.Nullable final String value) {
        this._callChainId = value;
    }
    /**
     * Sets the callOptions property value. Contains the optional features for the call.
     * @param value Value to set for the callOptions property.
     * @return a void
     */
    public void setCallOptions(@javax.annotation.Nullable final CallOptions value) {
        this._callOptions = value;
    }
    /**
     * Sets the callRoutes property value. The routing information on how the call was retargeted. Read-only.
     * @param value Value to set for the callRoutes property.
     * @return a void
     */
    public void setCallRoutes(@javax.annotation.Nullable final java.util.List<CallRoute> value) {
        this._callRoutes = value;
    }
    /**
     * Sets the chatInfo property value. The chat information. Required information for meeting scenarios.
     * @param value Value to set for the chatInfo property.
     * @return a void
     */
    public void setChatInfo(@javax.annotation.Nullable final ChatInfo value) {
        this._chatInfo = value;
    }
    /**
     * Sets the direction property value. The direction of the call. The possible value are incoming or outgoing. Read-only.
     * @param value Value to set for the direction property.
     * @return a void
     */
    public void setDirection(@javax.annotation.Nullable final CallDirection value) {
        this._direction = value;
    }
    /**
     * Sets the incomingContext property value. The context associated with an incoming call. Read-only. Server generated.
     * @param value Value to set for the incomingContext property.
     * @return a void
     */
    public void setIncomingContext(@javax.annotation.Nullable final IncomingContext value) {
        this._incomingContext = value;
    }
    /**
     * Sets the mediaConfig property value. The media configuration. Required information for creating peer to peer calls or joining meetings.
     * @param value Value to set for the mediaConfig property.
     * @return a void
     */
    public void setMediaConfig(@javax.annotation.Nullable final MediaConfig value) {
        this._mediaConfig = value;
    }
    /**
     * Sets the mediaState property value. Read-only. The call media state.
     * @param value Value to set for the mediaState property.
     * @return a void
     */
    public void setMediaState(@javax.annotation.Nullable final CallMediaState value) {
        this._mediaState = value;
    }
    /**
     * Sets the meetingInfo property value. The meeting information. Required information for meeting scenarios.
     * @param value Value to set for the meetingInfo property.
     * @return a void
     */
    public void setMeetingInfo(@javax.annotation.Nullable final MeetingInfo value) {
        this._meetingInfo = value;
    }
    /**
     * Sets the myParticipantId property value. The myParticipantId property
     * @param value Value to set for the myParticipantId property.
     * @return a void
     */
    public void setMyParticipantId(@javax.annotation.Nullable final String value) {
        this._myParticipantId = value;
    }
    /**
     * Sets the operations property value. The operations property
     * @param value Value to set for the operations property.
     * @return a void
     */
    public void setOperations(@javax.annotation.Nullable final java.util.List<CommsOperation> value) {
        this._operations = value;
    }
    /**
     * Sets the participants property value. The participants property
     * @param value Value to set for the participants property.
     * @return a void
     */
    public void setParticipants(@javax.annotation.Nullable final java.util.List<Participant> value) {
        this._participants = value;
    }
    /**
     * Sets the requestedModalities property value. The requestedModalities property
     * @param value Value to set for the requestedModalities property.
     * @return a void
     */
    public void setRequestedModalities(@javax.annotation.Nullable final java.util.List<String> value) {
        this._requestedModalities = value;
    }
    /**
     * Sets the resultInfo property value. The resultInfo property
     * @param value Value to set for the resultInfo property.
     * @return a void
     */
    public void setResultInfo(@javax.annotation.Nullable final ResultInfo value) {
        this._resultInfo = value;
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     * @return a void
     */
    public void setSource(@javax.annotation.Nullable final ParticipantInfo value) {
        this._source = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final CallState value) {
        this._state = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
    /**
     * Sets the targets property value. The targets property
     * @param value Value to set for the targets property.
     * @return a void
     */
    public void setTargets(@javax.annotation.Nullable final java.util.List<InvitationParticipantInfo> value) {
        this._targets = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the toneInfo property value. The toneInfo property
     * @param value Value to set for the toneInfo property.
     * @return a void
     */
    public void setToneInfo(@javax.annotation.Nullable final ToneInfo value) {
        this._toneInfo = value;
    }
    /**
     * Sets the transcription property value. The transcription information for the call. Read-only.
     * @param value Value to set for the transcription property.
     * @return a void
     */
    public void setTranscription(@javax.annotation.Nullable final CallTranscriptionInfo value) {
        this._transcription = value;
    }
}
