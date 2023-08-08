package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnlineMeeting extends Entity implements Parsable {
    /**
     * Indicates whether attendees can turn on their camera.
     */
    private Boolean allowAttendeeToEnableCamera;
    /**
     * Indicates whether attendees can turn on their microphone.
     */
    private Boolean allowAttendeeToEnableMic;
    /**
     * Specifies who can be a presenter in a meeting. Possible values are listed in the following table.
     */
    private OnlineMeetingPresenters allowedPresenters;
    /**
     * Specifies the mode of meeting chat.
     */
    private MeetingChatMode allowMeetingChat;
    /**
     * Specifies if participants are allowed to rename themselves in an instance of the meeting.
     */
    private Boolean allowParticipantsToChangeName;
    /**
     * Indicates whether Teams reactions are enabled for the meeting.
     */
    private Boolean allowTeamworkReactions;
    /**
     * The attendance reports of an online meeting. Read-only.
     */
    private java.util.List<MeetingAttendanceReport> attendanceReports;
    /**
     * The content stream of the attendee report of a Microsoft Teams live event. Read-only.
     */
    private byte[] attendeeReport;
    /**
     * The phone access (dial-in) information for an online meeting. Read-only.
     */
    private AudioConferencing audioConferencing;
    /**
     * Settings related to a live event.
     */
    private BroadcastMeetingSettings broadcastSettings;
    /**
     * The chat information associated with this online meeting.
     */
    private ChatInfo chatInfo;
    /**
     * The meeting creation time in UTC. Read-only.
     */
    private OffsetDateTime creationDateTime;
    /**
     * The meeting end time in UTC.
     */
    private OffsetDateTime endDateTime;
    /**
     * The externalId property
     */
    private String externalId;
    /**
     * Indicates if this is a Teams live event.
     */
    private Boolean isBroadcast;
    /**
     * Indicates whether to announce when callers join or leave.
     */
    private Boolean isEntryExitAnnounced;
    /**
     * The join information in the language and locale variant specified in the Accept-Language request HTTP header. Read-only.
     */
    private ItemBody joinInformation;
    /**
     * Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode. Once an onlineMeeting is created, the joinMeetingIdSettings cannot be modified. To make any changes to this property, the meeting needs to be canceled and a new one needs to be created.
     */
    private JoinMeetingIdSettings joinMeetingIdSettings;
    /**
     * The join URL of the online meeting. Read-only.
     */
    private String joinWebUrl;
    /**
     * Specifies which participants can bypass the meeting   lobby.
     */
    private LobbyBypassSettings lobbyBypassSettings;
    /**
     * The participants associated with the online meeting.  This includes the organizer and the attendees.
     */
    private MeetingParticipants participants;
    /**
     * Indicates whether to record the meeting automatically.
     */
    private Boolean recordAutomatically;
    /**
     * Specifies whether meeting chat history is shared with participants. Possible values are: all, none, unknownFutureValue.
     */
    private MeetingChatHistoryDefaultMode shareMeetingChatHistoryDefault;
    /**
     * The meeting start time in UTC.
     */
    private OffsetDateTime startDateTime;
    /**
     * The subject of the online meeting.
     */
    private String subject;
    /**
     * The video teleconferencing ID. Read-only.
     */
    private String videoTeleconferenceId;
    /**
     * Specifies whether a watermark should be applied to a content type by the client application.
     */
    private WatermarkProtectionValues watermarkProtection;
    /**
     * Instantiates a new onlineMeeting and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public OnlineMeeting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onlineMeeting
     */
    @jakarta.annotation.Nonnull
    public static OnlineMeeting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnlineMeeting();
    }
    /**
     * Gets the allowAttendeeToEnableCamera property value. Indicates whether attendees can turn on their camera.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAttendeeToEnableCamera() {
        return this.allowAttendeeToEnableCamera;
    }
    /**
     * Gets the allowAttendeeToEnableMic property value. Indicates whether attendees can turn on their microphone.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAttendeeToEnableMic() {
        return this.allowAttendeeToEnableMic;
    }
    /**
     * Gets the allowedPresenters property value. Specifies who can be a presenter in a meeting. Possible values are listed in the following table.
     * @return a onlineMeetingPresenters
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingPresenters getAllowedPresenters() {
        return this.allowedPresenters;
    }
    /**
     * Gets the allowMeetingChat property value. Specifies the mode of meeting chat.
     * @return a meetingChatMode
     */
    @jakarta.annotation.Nullable
    public MeetingChatMode getAllowMeetingChat() {
        return this.allowMeetingChat;
    }
    /**
     * Gets the allowParticipantsToChangeName property value. Specifies if participants are allowed to rename themselves in an instance of the meeting.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowParticipantsToChangeName() {
        return this.allowParticipantsToChangeName;
    }
    /**
     * Gets the allowTeamworkReactions property value. Indicates whether Teams reactions are enabled for the meeting.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowTeamworkReactions() {
        return this.allowTeamworkReactions;
    }
    /**
     * Gets the attendanceReports property value. The attendance reports of an online meeting. Read-only.
     * @return a meetingAttendanceReport
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingAttendanceReport> getAttendanceReports() {
        return this.attendanceReports;
    }
    /**
     * Gets the attendeeReport property value. The content stream of the attendee report of a Microsoft Teams live event. Read-only.
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getAttendeeReport() {
        return this.attendeeReport;
    }
    /**
     * Gets the audioConferencing property value. The phone access (dial-in) information for an online meeting. Read-only.
     * @return a audioConferencing
     */
    @jakarta.annotation.Nullable
    public AudioConferencing getAudioConferencing() {
        return this.audioConferencing;
    }
    /**
     * Gets the broadcastSettings property value. Settings related to a live event.
     * @return a broadcastMeetingSettings
     */
    @jakarta.annotation.Nullable
    public BroadcastMeetingSettings getBroadcastSettings() {
        return this.broadcastSettings;
    }
    /**
     * Gets the chatInfo property value. The chat information associated with this online meeting.
     * @return a chatInfo
     */
    @jakarta.annotation.Nullable
    public ChatInfo getChatInfo() {
        return this.chatInfo;
    }
    /**
     * Gets the creationDateTime property value. The meeting creation time in UTC. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.creationDateTime;
    }
    /**
     * Gets the endDateTime property value. The meeting end time in UTC.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * Gets the externalId property value. The externalId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowAttendeeToEnableCamera", (n) -> { this.setAllowAttendeeToEnableCamera(n.getBooleanValue()); });
        deserializerMap.put("allowAttendeeToEnableMic", (n) -> { this.setAllowAttendeeToEnableMic(n.getBooleanValue()); });
        deserializerMap.put("allowedPresenters", (n) -> { this.setAllowedPresenters(n.getEnumValue(OnlineMeetingPresenters.class)); });
        deserializerMap.put("allowMeetingChat", (n) -> { this.setAllowMeetingChat(n.getEnumValue(MeetingChatMode.class)); });
        deserializerMap.put("allowParticipantsToChangeName", (n) -> { this.setAllowParticipantsToChangeName(n.getBooleanValue()); });
        deserializerMap.put("allowTeamworkReactions", (n) -> { this.setAllowTeamworkReactions(n.getBooleanValue()); });
        deserializerMap.put("attendanceReports", (n) -> { this.setAttendanceReports(n.getCollectionOfObjectValues(MeetingAttendanceReport::createFromDiscriminatorValue)); });
        deserializerMap.put("attendeeReport", (n) -> { this.setAttendeeReport(n.getByteArrayValue()); });
        deserializerMap.put("audioConferencing", (n) -> { this.setAudioConferencing(n.getObjectValue(AudioConferencing::createFromDiscriminatorValue)); });
        deserializerMap.put("broadcastSettings", (n) -> { this.setBroadcastSettings(n.getObjectValue(BroadcastMeetingSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("chatInfo", (n) -> { this.setChatInfo(n.getObjectValue(ChatInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDateTime", (n) -> { this.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("isBroadcast", (n) -> { this.setIsBroadcast(n.getBooleanValue()); });
        deserializerMap.put("isEntryExitAnnounced", (n) -> { this.setIsEntryExitAnnounced(n.getBooleanValue()); });
        deserializerMap.put("joinInformation", (n) -> { this.setJoinInformation(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("joinMeetingIdSettings", (n) -> { this.setJoinMeetingIdSettings(n.getObjectValue(JoinMeetingIdSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("joinWebUrl", (n) -> { this.setJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("lobbyBypassSettings", (n) -> { this.setLobbyBypassSettings(n.getObjectValue(LobbyBypassSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("participants", (n) -> { this.setParticipants(n.getObjectValue(MeetingParticipants::createFromDiscriminatorValue)); });
        deserializerMap.put("recordAutomatically", (n) -> { this.setRecordAutomatically(n.getBooleanValue()); });
        deserializerMap.put("shareMeetingChatHistoryDefault", (n) -> { this.setShareMeetingChatHistoryDefault(n.getEnumValue(MeetingChatHistoryDefaultMode.class)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("videoTeleconferenceId", (n) -> { this.setVideoTeleconferenceId(n.getStringValue()); });
        deserializerMap.put("watermarkProtection", (n) -> { this.setWatermarkProtection(n.getObjectValue(WatermarkProtectionValues::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isBroadcast property value. Indicates if this is a Teams live event.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBroadcast() {
        return this.isBroadcast;
    }
    /**
     * Gets the isEntryExitAnnounced property value. Indicates whether to announce when callers join or leave.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEntryExitAnnounced() {
        return this.isEntryExitAnnounced;
    }
    /**
     * Gets the joinInformation property value. The join information in the language and locale variant specified in the Accept-Language request HTTP header. Read-only.
     * @return a itemBody
     */
    @jakarta.annotation.Nullable
    public ItemBody getJoinInformation() {
        return this.joinInformation;
    }
    /**
     * Gets the joinMeetingIdSettings property value. Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode. Once an onlineMeeting is created, the joinMeetingIdSettings cannot be modified. To make any changes to this property, the meeting needs to be canceled and a new one needs to be created.
     * @return a joinMeetingIdSettings
     */
    @jakarta.annotation.Nullable
    public JoinMeetingIdSettings getJoinMeetingIdSettings() {
        return this.joinMeetingIdSettings;
    }
    /**
     * Gets the joinWebUrl property value. The join URL of the online meeting. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJoinWebUrl() {
        return this.joinWebUrl;
    }
    /**
     * Gets the lobbyBypassSettings property value. Specifies which participants can bypass the meeting   lobby.
     * @return a lobbyBypassSettings
     */
    @jakarta.annotation.Nullable
    public LobbyBypassSettings getLobbyBypassSettings() {
        return this.lobbyBypassSettings;
    }
    /**
     * Gets the participants property value. The participants associated with the online meeting.  This includes the organizer and the attendees.
     * @return a meetingParticipants
     */
    @jakarta.annotation.Nullable
    public MeetingParticipants getParticipants() {
        return this.participants;
    }
    /**
     * Gets the recordAutomatically property value. Indicates whether to record the meeting automatically.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRecordAutomatically() {
        return this.recordAutomatically;
    }
    /**
     * Gets the shareMeetingChatHistoryDefault property value. Specifies whether meeting chat history is shared with participants. Possible values are: all, none, unknownFutureValue.
     * @return a meetingChatHistoryDefaultMode
     */
    @jakarta.annotation.Nullable
    public MeetingChatHistoryDefaultMode getShareMeetingChatHistoryDefault() {
        return this.shareMeetingChatHistoryDefault;
    }
    /**
     * Gets the startDateTime property value. The meeting start time in UTC.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the subject property value. The subject of the online meeting.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the videoTeleconferenceId property value. The video teleconferencing ID. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVideoTeleconferenceId() {
        return this.videoTeleconferenceId;
    }
    /**
     * Gets the watermarkProtection property value. Specifies whether a watermark should be applied to a content type by the client application.
     * @return a watermarkProtectionValues
     */
    @jakarta.annotation.Nullable
    public WatermarkProtectionValues getWatermarkProtection() {
        return this.watermarkProtection;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowAttendeeToEnableCamera", this.getAllowAttendeeToEnableCamera());
        writer.writeBooleanValue("allowAttendeeToEnableMic", this.getAllowAttendeeToEnableMic());
        writer.writeEnumValue("allowedPresenters", this.getAllowedPresenters());
        writer.writeEnumValue("allowMeetingChat", this.getAllowMeetingChat());
        writer.writeBooleanValue("allowParticipantsToChangeName", this.getAllowParticipantsToChangeName());
        writer.writeBooleanValue("allowTeamworkReactions", this.getAllowTeamworkReactions());
        writer.writeCollectionOfObjectValues("attendanceReports", this.getAttendanceReports());
        writer.writeByteArrayValue("attendeeReport", this.getAttendeeReport());
        writer.writeObjectValue("audioConferencing", this.getAudioConferencing());
        writer.writeObjectValue("broadcastSettings", this.getBroadcastSettings());
        writer.writeObjectValue("chatInfo", this.getChatInfo());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeBooleanValue("isBroadcast", this.getIsBroadcast());
        writer.writeBooleanValue("isEntryExitAnnounced", this.getIsEntryExitAnnounced());
        writer.writeObjectValue("joinInformation", this.getJoinInformation());
        writer.writeObjectValue("joinMeetingIdSettings", this.getJoinMeetingIdSettings());
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
        writer.writeObjectValue("lobbyBypassSettings", this.getLobbyBypassSettings());
        writer.writeObjectValue("participants", this.getParticipants());
        writer.writeBooleanValue("recordAutomatically", this.getRecordAutomatically());
        writer.writeEnumValue("shareMeetingChatHistoryDefault", this.getShareMeetingChatHistoryDefault());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeStringValue("videoTeleconferenceId", this.getVideoTeleconferenceId());
        writer.writeObjectValue("watermarkProtection", this.getWatermarkProtection());
    }
    /**
     * Sets the allowAttendeeToEnableCamera property value. Indicates whether attendees can turn on their camera.
     * @param value Value to set for the allowAttendeeToEnableCamera property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowAttendeeToEnableCamera(@jakarta.annotation.Nullable final Boolean value) {
        this.allowAttendeeToEnableCamera = value;
    }
    /**
     * Sets the allowAttendeeToEnableMic property value. Indicates whether attendees can turn on their microphone.
     * @param value Value to set for the allowAttendeeToEnableMic property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowAttendeeToEnableMic(@jakarta.annotation.Nullable final Boolean value) {
        this.allowAttendeeToEnableMic = value;
    }
    /**
     * Sets the allowedPresenters property value. Specifies who can be a presenter in a meeting. Possible values are listed in the following table.
     * @param value Value to set for the allowedPresenters property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowedPresenters(@jakarta.annotation.Nullable final OnlineMeetingPresenters value) {
        this.allowedPresenters = value;
    }
    /**
     * Sets the allowMeetingChat property value. Specifies the mode of meeting chat.
     * @param value Value to set for the allowMeetingChat property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowMeetingChat(@jakarta.annotation.Nullable final MeetingChatMode value) {
        this.allowMeetingChat = value;
    }
    /**
     * Sets the allowParticipantsToChangeName property value. Specifies if participants are allowed to rename themselves in an instance of the meeting.
     * @param value Value to set for the allowParticipantsToChangeName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowParticipantsToChangeName(@jakarta.annotation.Nullable final Boolean value) {
        this.allowParticipantsToChangeName = value;
    }
    /**
     * Sets the allowTeamworkReactions property value. Indicates whether Teams reactions are enabled for the meeting.
     * @param value Value to set for the allowTeamworkReactions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowTeamworkReactions(@jakarta.annotation.Nullable final Boolean value) {
        this.allowTeamworkReactions = value;
    }
    /**
     * Sets the attendanceReports property value. The attendance reports of an online meeting. Read-only.
     * @param value Value to set for the attendanceReports property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAttendanceReports(@jakarta.annotation.Nullable final java.util.List<MeetingAttendanceReport> value) {
        this.attendanceReports = value;
    }
    /**
     * Sets the attendeeReport property value. The content stream of the attendee report of a Microsoft Teams live event. Read-only.
     * @param value Value to set for the attendeeReport property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAttendeeReport(@jakarta.annotation.Nullable final byte[] value) {
        this.attendeeReport = value;
    }
    /**
     * Sets the audioConferencing property value. The phone access (dial-in) information for an online meeting. Read-only.
     * @param value Value to set for the audioConferencing property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAudioConferencing(@jakarta.annotation.Nullable final AudioConferencing value) {
        this.audioConferencing = value;
    }
    /**
     * Sets the broadcastSettings property value. Settings related to a live event.
     * @param value Value to set for the broadcastSettings property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBroadcastSettings(@jakarta.annotation.Nullable final BroadcastMeetingSettings value) {
        this.broadcastSettings = value;
    }
    /**
     * Sets the chatInfo property value. The chat information associated with this online meeting.
     * @param value Value to set for the chatInfo property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setChatInfo(@jakarta.annotation.Nullable final ChatInfo value) {
        this.chatInfo = value;
    }
    /**
     * Sets the creationDateTime property value. The meeting creation time in UTC. Read-only.
     * @param value Value to set for the creationDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.creationDateTime = value;
    }
    /**
     * Sets the endDateTime property value. The meeting end time in UTC.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the externalId property value. The externalId property
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the isBroadcast property value. Indicates if this is a Teams live event.
     * @param value Value to set for the isBroadcast property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsBroadcast(@jakarta.annotation.Nullable final Boolean value) {
        this.isBroadcast = value;
    }
    /**
     * Sets the isEntryExitAnnounced property value. Indicates whether to announce when callers join or leave.
     * @param value Value to set for the isEntryExitAnnounced property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsEntryExitAnnounced(@jakarta.annotation.Nullable final Boolean value) {
        this.isEntryExitAnnounced = value;
    }
    /**
     * Sets the joinInformation property value. The join information in the language and locale variant specified in the Accept-Language request HTTP header. Read-only.
     * @param value Value to set for the joinInformation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setJoinInformation(@jakarta.annotation.Nullable final ItemBody value) {
        this.joinInformation = value;
    }
    /**
     * Sets the joinMeetingIdSettings property value. Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode. Once an onlineMeeting is created, the joinMeetingIdSettings cannot be modified. To make any changes to this property, the meeting needs to be canceled and a new one needs to be created.
     * @param value Value to set for the joinMeetingIdSettings property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setJoinMeetingIdSettings(@jakarta.annotation.Nullable final JoinMeetingIdSettings value) {
        this.joinMeetingIdSettings = value;
    }
    /**
     * Sets the joinWebUrl property value. The join URL of the online meeting. Read-only.
     * @param value Value to set for the joinWebUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setJoinWebUrl(@jakarta.annotation.Nullable final String value) {
        this.joinWebUrl = value;
    }
    /**
     * Sets the lobbyBypassSettings property value. Specifies which participants can bypass the meeting   lobby.
     * @param value Value to set for the lobbyBypassSettings property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLobbyBypassSettings(@jakarta.annotation.Nullable final LobbyBypassSettings value) {
        this.lobbyBypassSettings = value;
    }
    /**
     * Sets the participants property value. The participants associated with the online meeting.  This includes the organizer and the attendees.
     * @param value Value to set for the participants property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setParticipants(@jakarta.annotation.Nullable final MeetingParticipants value) {
        this.participants = value;
    }
    /**
     * Sets the recordAutomatically property value. Indicates whether to record the meeting automatically.
     * @param value Value to set for the recordAutomatically property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRecordAutomatically(@jakarta.annotation.Nullable final Boolean value) {
        this.recordAutomatically = value;
    }
    /**
     * Sets the shareMeetingChatHistoryDefault property value. Specifies whether meeting chat history is shared with participants. Possible values are: all, none, unknownFutureValue.
     * @param value Value to set for the shareMeetingChatHistoryDefault property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setShareMeetingChatHistoryDefault(@jakarta.annotation.Nullable final MeetingChatHistoryDefaultMode value) {
        this.shareMeetingChatHistoryDefault = value;
    }
    /**
     * Sets the startDateTime property value. The meeting start time in UTC.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the subject property value. The subject of the online meeting.
     * @param value Value to set for the subject property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the videoTeleconferenceId property value. The video teleconferencing ID. Read-only.
     * @param value Value to set for the videoTeleconferenceId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVideoTeleconferenceId(@jakarta.annotation.Nullable final String value) {
        this.videoTeleconferenceId = value;
    }
    /**
     * Sets the watermarkProtection property value. Specifies whether a watermark should be applied to a content type by the client application.
     * @param value Value to set for the watermarkProtection property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWatermarkProtection(@jakarta.annotation.Nullable final WatermarkProtectionValues value) {
        this.watermarkProtection = value;
    }
}
