package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnlineMeetingBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link OnlineMeetingBase} and sets the default values.
     */
    public OnlineMeetingBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnlineMeetingBase}
     */
    @jakarta.annotation.Nonnull
    public static OnlineMeetingBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.onlineMeeting": return new OnlineMeeting();
                case "#microsoft.graph.virtualEventSession": return new VirtualEventSession();
            }
        }
        return new OnlineMeetingBase();
    }
    /**
     * Gets the allowAttendeeToEnableCamera property value. Indicates whether attendees can turn on their camera.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAttendeeToEnableCamera() {
        return this.backingStore.get("allowAttendeeToEnableCamera");
    }
    /**
     * Gets the allowAttendeeToEnableMic property value. Indicates whether attendees can turn on their microphone.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAttendeeToEnableMic() {
        return this.backingStore.get("allowAttendeeToEnableMic");
    }
    /**
     * Gets the allowBreakoutRooms property value. Indicates whether breakout rooms are enabled for the meeting.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowBreakoutRooms() {
        return this.backingStore.get("allowBreakoutRooms");
    }
    /**
     * Gets the allowCopyingAndSharingMeetingContent property value. The allowCopyingAndSharingMeetingContent property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCopyingAndSharingMeetingContent() {
        return this.backingStore.get("allowCopyingAndSharingMeetingContent");
    }
    /**
     * Gets the allowedLobbyAdmitters property value. Specifies the users who can admit from the lobby. Possible values are: organizerAndCoOrganizersAndPresenters, organizerAndCoOrganizers, unknownFutureValue.
     * @return a {@link AllowedLobbyAdmitterRoles}
     */
    @jakarta.annotation.Nullable
    public AllowedLobbyAdmitterRoles getAllowedLobbyAdmitters() {
        return this.backingStore.get("allowedLobbyAdmitters");
    }
    /**
     * Gets the allowedPresenters property value. Specifies who can be a presenter in a meeting. Possible values are: everyone, organization, roleIsPresenter, organizer, unknownFutureValue. Inherited from onlineMeetingBase.
     * @return a {@link OnlineMeetingPresenters}
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingPresenters getAllowedPresenters() {
        return this.backingStore.get("allowedPresenters");
    }
    /**
     * Gets the allowLiveShare property value. Indicates whether live share is enabled for the meeting. Possible values are: enabled, disabled, unknownFutureValue.
     * @return a {@link MeetingLiveShareOptions}
     */
    @jakarta.annotation.Nullable
    public MeetingLiveShareOptions getAllowLiveShare() {
        return this.backingStore.get("allowLiveShare");
    }
    /**
     * Gets the allowMeetingChat property value. Specifies the mode of the meeting chat.
     * @return a {@link MeetingChatMode}
     */
    @jakarta.annotation.Nullable
    public MeetingChatMode getAllowMeetingChat() {
        return this.backingStore.get("allowMeetingChat");
    }
    /**
     * Gets the allowParticipantsToChangeName property value. Specifies if participants are allowed to rename themselves in an instance of the meeting.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowParticipantsToChangeName() {
        return this.backingStore.get("allowParticipantsToChangeName");
    }
    /**
     * Gets the allowPowerPointSharing property value. Indicates whether PowerPoint live is enabled for the meeting.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowPowerPointSharing() {
        return this.backingStore.get("allowPowerPointSharing");
    }
    /**
     * Gets the allowRecording property value. Indicates whether recording is enabled for the meeting.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowRecording() {
        return this.backingStore.get("allowRecording");
    }
    /**
     * Gets the allowTeamworkReactions property value. Indicates if Teams reactions are enabled for the meeting.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowTeamworkReactions() {
        return this.backingStore.get("allowTeamworkReactions");
    }
    /**
     * Gets the allowTranscription property value. Indicates whether transcription is enabled for the meeting.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowTranscription() {
        return this.backingStore.get("allowTranscription");
    }
    /**
     * Gets the allowWhiteboard property value. Indicates whether whiteboard is enabled for the meeting.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowWhiteboard() {
        return this.backingStore.get("allowWhiteboard");
    }
    /**
     * Gets the attendanceReports property value. The attendance reports of an online meeting. Read-only.
     * @return a {@link java.util.List<MeetingAttendanceReport>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingAttendanceReport> getAttendanceReports() {
        return this.backingStore.get("attendanceReports");
    }
    /**
     * Gets the audioConferencing property value. The phone access (dial-in) information for an online meeting. Read-only.
     * @return a {@link AudioConferencing}
     */
    @jakarta.annotation.Nullable
    public AudioConferencing getAudioConferencing() {
        return this.backingStore.get("audioConferencing");
    }
    /**
     * Gets the chatInfo property value. The chat information associated with this online meeting.
     * @return a {@link ChatInfo}
     */
    @jakarta.annotation.Nullable
    public ChatInfo getChatInfo() {
        return this.backingStore.get("chatInfo");
    }
    /**
     * Gets the chatRestrictions property value. Specifies the configuration settings for meeting chat restrictions.
     * @return a {@link ChatRestrictions}
     */
    @jakarta.annotation.Nullable
    public ChatRestrictions getChatRestrictions() {
        return this.backingStore.get("chatRestrictions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowAttendeeToEnableCamera", (n) -> { this.setAllowAttendeeToEnableCamera(n.getBooleanValue()); });
        deserializerMap.put("allowAttendeeToEnableMic", (n) -> { this.setAllowAttendeeToEnableMic(n.getBooleanValue()); });
        deserializerMap.put("allowBreakoutRooms", (n) -> { this.setAllowBreakoutRooms(n.getBooleanValue()); });
        deserializerMap.put("allowCopyingAndSharingMeetingContent", (n) -> { this.setAllowCopyingAndSharingMeetingContent(n.getBooleanValue()); });
        deserializerMap.put("allowedLobbyAdmitters", (n) -> { this.setAllowedLobbyAdmitters(n.getEnumValue(AllowedLobbyAdmitterRoles::forValue)); });
        deserializerMap.put("allowedPresenters", (n) -> { this.setAllowedPresenters(n.getEnumValue(OnlineMeetingPresenters::forValue)); });
        deserializerMap.put("allowLiveShare", (n) -> { this.setAllowLiveShare(n.getEnumValue(MeetingLiveShareOptions::forValue)); });
        deserializerMap.put("allowMeetingChat", (n) -> { this.setAllowMeetingChat(n.getEnumValue(MeetingChatMode::forValue)); });
        deserializerMap.put("allowParticipantsToChangeName", (n) -> { this.setAllowParticipantsToChangeName(n.getBooleanValue()); });
        deserializerMap.put("allowPowerPointSharing", (n) -> { this.setAllowPowerPointSharing(n.getBooleanValue()); });
        deserializerMap.put("allowRecording", (n) -> { this.setAllowRecording(n.getBooleanValue()); });
        deserializerMap.put("allowTeamworkReactions", (n) -> { this.setAllowTeamworkReactions(n.getBooleanValue()); });
        deserializerMap.put("allowTranscription", (n) -> { this.setAllowTranscription(n.getBooleanValue()); });
        deserializerMap.put("allowWhiteboard", (n) -> { this.setAllowWhiteboard(n.getBooleanValue()); });
        deserializerMap.put("attendanceReports", (n) -> { this.setAttendanceReports(n.getCollectionOfObjectValues(MeetingAttendanceReport::createFromDiscriminatorValue)); });
        deserializerMap.put("audioConferencing", (n) -> { this.setAudioConferencing(n.getObjectValue(AudioConferencing::createFromDiscriminatorValue)); });
        deserializerMap.put("chatInfo", (n) -> { this.setChatInfo(n.getObjectValue(ChatInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("chatRestrictions", (n) -> { this.setChatRestrictions(n.getObjectValue(ChatRestrictions::createFromDiscriminatorValue)); });
        deserializerMap.put("isEndToEndEncryptionEnabled", (n) -> { this.setIsEndToEndEncryptionEnabled(n.getBooleanValue()); });
        deserializerMap.put("isEntryExitAnnounced", (n) -> { this.setIsEntryExitAnnounced(n.getBooleanValue()); });
        deserializerMap.put("joinInformation", (n) -> { this.setJoinInformation(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("joinMeetingIdSettings", (n) -> { this.setJoinMeetingIdSettings(n.getObjectValue(JoinMeetingIdSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("joinWebUrl", (n) -> { this.setJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("lobbyBypassSettings", (n) -> { this.setLobbyBypassSettings(n.getObjectValue(LobbyBypassSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("recordAutomatically", (n) -> { this.setRecordAutomatically(n.getBooleanValue()); });
        deserializerMap.put("shareMeetingChatHistoryDefault", (n) -> { this.setShareMeetingChatHistoryDefault(n.getEnumValue(MeetingChatHistoryDefaultMode::forValue)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("videoTeleconferenceId", (n) -> { this.setVideoTeleconferenceId(n.getStringValue()); });
        deserializerMap.put("watermarkProtection", (n) -> { this.setWatermarkProtection(n.getObjectValue(WatermarkProtectionValues::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEndToEndEncryptionEnabled property value. Indicates whether end-to-end encryption (E2EE) is enabled for the online meeting.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEndToEndEncryptionEnabled() {
        return this.backingStore.get("isEndToEndEncryptionEnabled");
    }
    /**
     * Gets the isEntryExitAnnounced property value. Indicates whether to announce when callers join or leave.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEntryExitAnnounced() {
        return this.backingStore.get("isEntryExitAnnounced");
    }
    /**
     * Gets the joinInformation property value. The join information in the language and locale variant specified in &apos;Accept-Language&apos; request HTTP header. Read-only.
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getJoinInformation() {
        return this.backingStore.get("joinInformation");
    }
    /**
     * Gets the joinMeetingIdSettings property value. Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode. Once an onlineMeeting is created, the joinMeetingIdSettings can&apos;t be modified. To make any changes to this property, you must cancel this meeting and create a new one.
     * @return a {@link JoinMeetingIdSettings}
     */
    @jakarta.annotation.Nullable
    public JoinMeetingIdSettings getJoinMeetingIdSettings() {
        return this.backingStore.get("joinMeetingIdSettings");
    }
    /**
     * Gets the joinWebUrl property value. The join URL of the online meeting. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJoinWebUrl() {
        return this.backingStore.get("joinWebUrl");
    }
    /**
     * Gets the lobbyBypassSettings property value. Specifies which participants can bypass the meeting lobby.
     * @return a {@link LobbyBypassSettings}
     */
    @jakarta.annotation.Nullable
    public LobbyBypassSettings getLobbyBypassSettings() {
        return this.backingStore.get("lobbyBypassSettings");
    }
    /**
     * Gets the recordAutomatically property value. Indicates whether to record the meeting automatically.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRecordAutomatically() {
        return this.backingStore.get("recordAutomatically");
    }
    /**
     * Gets the shareMeetingChatHistoryDefault property value. Specifies whether meeting chat history is shared with participants.  Possible values are: all, none, unknownFutureValue.
     * @return a {@link MeetingChatHistoryDefaultMode}
     */
    @jakarta.annotation.Nullable
    public MeetingChatHistoryDefaultMode getShareMeetingChatHistoryDefault() {
        return this.backingStore.get("shareMeetingChatHistoryDefault");
    }
    /**
     * Gets the subject property value. The subject of the online meeting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the videoTeleconferenceId property value. The video teleconferencing ID. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVideoTeleconferenceId() {
        return this.backingStore.get("videoTeleconferenceId");
    }
    /**
     * Gets the watermarkProtection property value. Specifies whether the client application should apply a watermark to a content type.
     * @return a {@link WatermarkProtectionValues}
     */
    @jakarta.annotation.Nullable
    public WatermarkProtectionValues getWatermarkProtection() {
        return this.backingStore.get("watermarkProtection");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowAttendeeToEnableCamera", this.getAllowAttendeeToEnableCamera());
        writer.writeBooleanValue("allowAttendeeToEnableMic", this.getAllowAttendeeToEnableMic());
        writer.writeBooleanValue("allowBreakoutRooms", this.getAllowBreakoutRooms());
        writer.writeBooleanValue("allowCopyingAndSharingMeetingContent", this.getAllowCopyingAndSharingMeetingContent());
        writer.writeEnumValue("allowedLobbyAdmitters", this.getAllowedLobbyAdmitters());
        writer.writeEnumValue("allowedPresenters", this.getAllowedPresenters());
        writer.writeEnumValue("allowLiveShare", this.getAllowLiveShare());
        writer.writeEnumValue("allowMeetingChat", this.getAllowMeetingChat());
        writer.writeBooleanValue("allowParticipantsToChangeName", this.getAllowParticipantsToChangeName());
        writer.writeBooleanValue("allowPowerPointSharing", this.getAllowPowerPointSharing());
        writer.writeBooleanValue("allowRecording", this.getAllowRecording());
        writer.writeBooleanValue("allowTeamworkReactions", this.getAllowTeamworkReactions());
        writer.writeBooleanValue("allowTranscription", this.getAllowTranscription());
        writer.writeBooleanValue("allowWhiteboard", this.getAllowWhiteboard());
        writer.writeCollectionOfObjectValues("attendanceReports", this.getAttendanceReports());
        writer.writeObjectValue("audioConferencing", this.getAudioConferencing());
        writer.writeObjectValue("chatInfo", this.getChatInfo());
        writer.writeObjectValue("chatRestrictions", this.getChatRestrictions());
        writer.writeBooleanValue("isEndToEndEncryptionEnabled", this.getIsEndToEndEncryptionEnabled());
        writer.writeBooleanValue("isEntryExitAnnounced", this.getIsEntryExitAnnounced());
        writer.writeObjectValue("joinInformation", this.getJoinInformation());
        writer.writeObjectValue("joinMeetingIdSettings", this.getJoinMeetingIdSettings());
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
        writer.writeObjectValue("lobbyBypassSettings", this.getLobbyBypassSettings());
        writer.writeBooleanValue("recordAutomatically", this.getRecordAutomatically());
        writer.writeEnumValue("shareMeetingChatHistoryDefault", this.getShareMeetingChatHistoryDefault());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeStringValue("videoTeleconferenceId", this.getVideoTeleconferenceId());
        writer.writeObjectValue("watermarkProtection", this.getWatermarkProtection());
    }
    /**
     * Sets the allowAttendeeToEnableCamera property value. Indicates whether attendees can turn on their camera.
     * @param value Value to set for the allowAttendeeToEnableCamera property.
     */
    public void setAllowAttendeeToEnableCamera(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowAttendeeToEnableCamera", value);
    }
    /**
     * Sets the allowAttendeeToEnableMic property value. Indicates whether attendees can turn on their microphone.
     * @param value Value to set for the allowAttendeeToEnableMic property.
     */
    public void setAllowAttendeeToEnableMic(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowAttendeeToEnableMic", value);
    }
    /**
     * Sets the allowBreakoutRooms property value. Indicates whether breakout rooms are enabled for the meeting.
     * @param value Value to set for the allowBreakoutRooms property.
     */
    public void setAllowBreakoutRooms(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowBreakoutRooms", value);
    }
    /**
     * Sets the allowCopyingAndSharingMeetingContent property value. The allowCopyingAndSharingMeetingContent property
     * @param value Value to set for the allowCopyingAndSharingMeetingContent property.
     */
    public void setAllowCopyingAndSharingMeetingContent(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowCopyingAndSharingMeetingContent", value);
    }
    /**
     * Sets the allowedLobbyAdmitters property value. Specifies the users who can admit from the lobby. Possible values are: organizerAndCoOrganizersAndPresenters, organizerAndCoOrganizers, unknownFutureValue.
     * @param value Value to set for the allowedLobbyAdmitters property.
     */
    public void setAllowedLobbyAdmitters(@jakarta.annotation.Nullable final AllowedLobbyAdmitterRoles value) {
        this.backingStore.set("allowedLobbyAdmitters", value);
    }
    /**
     * Sets the allowedPresenters property value. Specifies who can be a presenter in a meeting. Possible values are: everyone, organization, roleIsPresenter, organizer, unknownFutureValue. Inherited from onlineMeetingBase.
     * @param value Value to set for the allowedPresenters property.
     */
    public void setAllowedPresenters(@jakarta.annotation.Nullable final OnlineMeetingPresenters value) {
        this.backingStore.set("allowedPresenters", value);
    }
    /**
     * Sets the allowLiveShare property value. Indicates whether live share is enabled for the meeting. Possible values are: enabled, disabled, unknownFutureValue.
     * @param value Value to set for the allowLiveShare property.
     */
    public void setAllowLiveShare(@jakarta.annotation.Nullable final MeetingLiveShareOptions value) {
        this.backingStore.set("allowLiveShare", value);
    }
    /**
     * Sets the allowMeetingChat property value. Specifies the mode of the meeting chat.
     * @param value Value to set for the allowMeetingChat property.
     */
    public void setAllowMeetingChat(@jakarta.annotation.Nullable final MeetingChatMode value) {
        this.backingStore.set("allowMeetingChat", value);
    }
    /**
     * Sets the allowParticipantsToChangeName property value. Specifies if participants are allowed to rename themselves in an instance of the meeting.
     * @param value Value to set for the allowParticipantsToChangeName property.
     */
    public void setAllowParticipantsToChangeName(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowParticipantsToChangeName", value);
    }
    /**
     * Sets the allowPowerPointSharing property value. Indicates whether PowerPoint live is enabled for the meeting.
     * @param value Value to set for the allowPowerPointSharing property.
     */
    public void setAllowPowerPointSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowPowerPointSharing", value);
    }
    /**
     * Sets the allowRecording property value. Indicates whether recording is enabled for the meeting.
     * @param value Value to set for the allowRecording property.
     */
    public void setAllowRecording(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowRecording", value);
    }
    /**
     * Sets the allowTeamworkReactions property value. Indicates if Teams reactions are enabled for the meeting.
     * @param value Value to set for the allowTeamworkReactions property.
     */
    public void setAllowTeamworkReactions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowTeamworkReactions", value);
    }
    /**
     * Sets the allowTranscription property value. Indicates whether transcription is enabled for the meeting.
     * @param value Value to set for the allowTranscription property.
     */
    public void setAllowTranscription(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowTranscription", value);
    }
    /**
     * Sets the allowWhiteboard property value. Indicates whether whiteboard is enabled for the meeting.
     * @param value Value to set for the allowWhiteboard property.
     */
    public void setAllowWhiteboard(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowWhiteboard", value);
    }
    /**
     * Sets the attendanceReports property value. The attendance reports of an online meeting. Read-only.
     * @param value Value to set for the attendanceReports property.
     */
    public void setAttendanceReports(@jakarta.annotation.Nullable final java.util.List<MeetingAttendanceReport> value) {
        this.backingStore.set("attendanceReports", value);
    }
    /**
     * Sets the audioConferencing property value. The phone access (dial-in) information for an online meeting. Read-only.
     * @param value Value to set for the audioConferencing property.
     */
    public void setAudioConferencing(@jakarta.annotation.Nullable final AudioConferencing value) {
        this.backingStore.set("audioConferencing", value);
    }
    /**
     * Sets the chatInfo property value. The chat information associated with this online meeting.
     * @param value Value to set for the chatInfo property.
     */
    public void setChatInfo(@jakarta.annotation.Nullable final ChatInfo value) {
        this.backingStore.set("chatInfo", value);
    }
    /**
     * Sets the chatRestrictions property value. Specifies the configuration settings for meeting chat restrictions.
     * @param value Value to set for the chatRestrictions property.
     */
    public void setChatRestrictions(@jakarta.annotation.Nullable final ChatRestrictions value) {
        this.backingStore.set("chatRestrictions", value);
    }
    /**
     * Sets the isEndToEndEncryptionEnabled property value. Indicates whether end-to-end encryption (E2EE) is enabled for the online meeting.
     * @param value Value to set for the isEndToEndEncryptionEnabled property.
     */
    public void setIsEndToEndEncryptionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEndToEndEncryptionEnabled", value);
    }
    /**
     * Sets the isEntryExitAnnounced property value. Indicates whether to announce when callers join or leave.
     * @param value Value to set for the isEntryExitAnnounced property.
     */
    public void setIsEntryExitAnnounced(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEntryExitAnnounced", value);
    }
    /**
     * Sets the joinInformation property value. The join information in the language and locale variant specified in &apos;Accept-Language&apos; request HTTP header. Read-only.
     * @param value Value to set for the joinInformation property.
     */
    public void setJoinInformation(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("joinInformation", value);
    }
    /**
     * Sets the joinMeetingIdSettings property value. Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode. Once an onlineMeeting is created, the joinMeetingIdSettings can&apos;t be modified. To make any changes to this property, you must cancel this meeting and create a new one.
     * @param value Value to set for the joinMeetingIdSettings property.
     */
    public void setJoinMeetingIdSettings(@jakarta.annotation.Nullable final JoinMeetingIdSettings value) {
        this.backingStore.set("joinMeetingIdSettings", value);
    }
    /**
     * Sets the joinWebUrl property value. The join URL of the online meeting. Read-only.
     * @param value Value to set for the joinWebUrl property.
     */
    public void setJoinWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("joinWebUrl", value);
    }
    /**
     * Sets the lobbyBypassSettings property value. Specifies which participants can bypass the meeting lobby.
     * @param value Value to set for the lobbyBypassSettings property.
     */
    public void setLobbyBypassSettings(@jakarta.annotation.Nullable final LobbyBypassSettings value) {
        this.backingStore.set("lobbyBypassSettings", value);
    }
    /**
     * Sets the recordAutomatically property value. Indicates whether to record the meeting automatically.
     * @param value Value to set for the recordAutomatically property.
     */
    public void setRecordAutomatically(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("recordAutomatically", value);
    }
    /**
     * Sets the shareMeetingChatHistoryDefault property value. Specifies whether meeting chat history is shared with participants.  Possible values are: all, none, unknownFutureValue.
     * @param value Value to set for the shareMeetingChatHistoryDefault property.
     */
    public void setShareMeetingChatHistoryDefault(@jakarta.annotation.Nullable final MeetingChatHistoryDefaultMode value) {
        this.backingStore.set("shareMeetingChatHistoryDefault", value);
    }
    /**
     * Sets the subject property value. The subject of the online meeting.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the videoTeleconferenceId property value. The video teleconferencing ID. Read-only.
     * @param value Value to set for the videoTeleconferenceId property.
     */
    public void setVideoTeleconferenceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("videoTeleconferenceId", value);
    }
    /**
     * Sets the watermarkProtection property value. Specifies whether the client application should apply a watermark to a content type.
     * @param value Value to set for the watermarkProtection property.
     */
    public void setWatermarkProtection(@jakarta.annotation.Nullable final WatermarkProtectionValues value) {
        this.backingStore.set("watermarkProtection", value);
    }
}
