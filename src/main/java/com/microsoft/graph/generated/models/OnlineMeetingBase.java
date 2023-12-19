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
     * Instantiates a new OnlineMeetingBase and sets the default values.
     */
    public OnlineMeetingBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnlineMeetingBase
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAttendeeToEnableCamera() {
        return this.backingStore.get("allowAttendeeToEnableCamera");
    }
    /**
     * Gets the allowAttendeeToEnableMic property value. Indicates whether attendees can turn on their microphone.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAttendeeToEnableMic() {
        return this.backingStore.get("allowAttendeeToEnableMic");
    }
    /**
     * Gets the allowedPresenters property value. Specifies who can be a presenter in a meeting.
     * @return a OnlineMeetingBaseAllowedPresenters
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingBaseAllowedPresenters getAllowedPresenters() {
        return this.backingStore.get("allowedPresenters");
    }
    /**
     * Gets the allowMeetingChat property value. Specifies the mode of the meeting chat.
     * @return a OnlineMeetingBaseAllowMeetingChat
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingBaseAllowMeetingChat getAllowMeetingChat() {
        return this.backingStore.get("allowMeetingChat");
    }
    /**
     * Gets the allowParticipantsToChangeName property value. Specifies if participants are allowed to rename themselves in an instance of the meeting.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowParticipantsToChangeName() {
        return this.backingStore.get("allowParticipantsToChangeName");
    }
    /**
     * Gets the allowTeamworkReactions property value. Indicates if Teams reactions are enabled for the meeting.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowTeamworkReactions() {
        return this.backingStore.get("allowTeamworkReactions");
    }
    /**
     * Gets the attendanceReports property value. The attendance reports of an online meeting. Read-only.
     * @return a java.util.List<MeetingAttendanceReport>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingAttendanceReport> getAttendanceReports() {
        return this.backingStore.get("attendanceReports");
    }
    /**
     * Gets the audioConferencing property value. The phone access (dial-in) information for an online meeting. Read-only.
     * @return a AudioConferencing
     */
    @jakarta.annotation.Nullable
    public AudioConferencing getAudioConferencing() {
        return this.backingStore.get("audioConferencing");
    }
    /**
     * Gets the chatInfo property value. The chat information associated with this online meeting.
     * @return a ChatInfo
     */
    @jakarta.annotation.Nullable
    public ChatInfo getChatInfo() {
        return this.backingStore.get("chatInfo");
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
        deserializerMap.put("allowedPresenters", (n) -> { this.setAllowedPresenters(n.getEnumValue(OnlineMeetingBaseAllowedPresenters::forValue)); });
        deserializerMap.put("allowMeetingChat", (n) -> { this.setAllowMeetingChat(n.getEnumValue(OnlineMeetingBaseAllowMeetingChat::forValue)); });
        deserializerMap.put("allowParticipantsToChangeName", (n) -> { this.setAllowParticipantsToChangeName(n.getBooleanValue()); });
        deserializerMap.put("allowTeamworkReactions", (n) -> { this.setAllowTeamworkReactions(n.getBooleanValue()); });
        deserializerMap.put("attendanceReports", (n) -> { this.setAttendanceReports(n.getCollectionOfObjectValues(MeetingAttendanceReport::createFromDiscriminatorValue)); });
        deserializerMap.put("audioConferencing", (n) -> { this.setAudioConferencing(n.getObjectValue(AudioConferencing::createFromDiscriminatorValue)); });
        deserializerMap.put("chatInfo", (n) -> { this.setChatInfo(n.getObjectValue(ChatInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("isEntryExitAnnounced", (n) -> { this.setIsEntryExitAnnounced(n.getBooleanValue()); });
        deserializerMap.put("joinInformation", (n) -> { this.setJoinInformation(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("joinMeetingIdSettings", (n) -> { this.setJoinMeetingIdSettings(n.getObjectValue(JoinMeetingIdSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("joinWebUrl", (n) -> { this.setJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("lobbyBypassSettings", (n) -> { this.setLobbyBypassSettings(n.getObjectValue(LobbyBypassSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("recordAutomatically", (n) -> { this.setRecordAutomatically(n.getBooleanValue()); });
        deserializerMap.put("shareMeetingChatHistoryDefault", (n) -> { this.setShareMeetingChatHistoryDefault(n.getEnumValue(OnlineMeetingBaseShareMeetingChatHistoryDefault::forValue)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("videoTeleconferenceId", (n) -> { this.setVideoTeleconferenceId(n.getStringValue()); });
        deserializerMap.put("watermarkProtection", (n) -> { this.setWatermarkProtection(n.getObjectValue(WatermarkProtectionValues::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEntryExitAnnounced property value. Indicates whether to announce when callers join or leave.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEntryExitAnnounced() {
        return this.backingStore.get("isEntryExitAnnounced");
    }
    /**
     * Gets the joinInformation property value. The join information in the language and locale variant specified in 'Accept-Language' request HTTP header. Read-only.
     * @return a ItemBody
     */
    @jakarta.annotation.Nullable
    public ItemBody getJoinInformation() {
        return this.backingStore.get("joinInformation");
    }
    /**
     * Gets the joinMeetingIdSettings property value. Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode. Once an onlineMeeting is created, the joinMeetingIdSettings can't be modified. To make any changes to this property, you must cancel this meeting and create a new one.
     * @return a JoinMeetingIdSettings
     */
    @jakarta.annotation.Nullable
    public JoinMeetingIdSettings getJoinMeetingIdSettings() {
        return this.backingStore.get("joinMeetingIdSettings");
    }
    /**
     * Gets the joinWebUrl property value. The join URL of the online meeting. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJoinWebUrl() {
        return this.backingStore.get("joinWebUrl");
    }
    /**
     * Gets the lobbyBypassSettings property value. Specifies which participants can bypass the meeting lobby.
     * @return a LobbyBypassSettings
     */
    @jakarta.annotation.Nullable
    public LobbyBypassSettings getLobbyBypassSettings() {
        return this.backingStore.get("lobbyBypassSettings");
    }
    /**
     * Gets the recordAutomatically property value. Indicates whether to record the meeting automatically.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRecordAutomatically() {
        return this.backingStore.get("recordAutomatically");
    }
    /**
     * Gets the shareMeetingChatHistoryDefault property value. The shareMeetingChatHistoryDefault property
     * @return a OnlineMeetingBaseShareMeetingChatHistoryDefault
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingBaseShareMeetingChatHistoryDefault getShareMeetingChatHistoryDefault() {
        return this.backingStore.get("shareMeetingChatHistoryDefault");
    }
    /**
     * Gets the subject property value. The subject of the online meeting.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the videoTeleconferenceId property value. The video teleconferencing ID. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVideoTeleconferenceId() {
        return this.backingStore.get("videoTeleconferenceId");
    }
    /**
     * Gets the watermarkProtection property value. Specifies whether the client application should apply a watermark to a content type.
     * @return a WatermarkProtectionValues
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
        writer.writeEnumValue("allowedPresenters", this.getAllowedPresenters());
        writer.writeEnumValue("allowMeetingChat", this.getAllowMeetingChat());
        writer.writeBooleanValue("allowParticipantsToChangeName", this.getAllowParticipantsToChangeName());
        writer.writeBooleanValue("allowTeamworkReactions", this.getAllowTeamworkReactions());
        writer.writeCollectionOfObjectValues("attendanceReports", this.getAttendanceReports());
        writer.writeObjectValue("audioConferencing", this.getAudioConferencing());
        writer.writeObjectValue("chatInfo", this.getChatInfo());
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
     * Sets the allowedPresenters property value. Specifies who can be a presenter in a meeting.
     * @param value Value to set for the allowedPresenters property.
     */
    public void setAllowedPresenters(@jakarta.annotation.Nullable final OnlineMeetingBaseAllowedPresenters value) {
        this.backingStore.set("allowedPresenters", value);
    }
    /**
     * Sets the allowMeetingChat property value. Specifies the mode of the meeting chat.
     * @param value Value to set for the allowMeetingChat property.
     */
    public void setAllowMeetingChat(@jakarta.annotation.Nullable final OnlineMeetingBaseAllowMeetingChat value) {
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
     * Sets the allowTeamworkReactions property value. Indicates if Teams reactions are enabled for the meeting.
     * @param value Value to set for the allowTeamworkReactions property.
     */
    public void setAllowTeamworkReactions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowTeamworkReactions", value);
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
     * Sets the isEntryExitAnnounced property value. Indicates whether to announce when callers join or leave.
     * @param value Value to set for the isEntryExitAnnounced property.
     */
    public void setIsEntryExitAnnounced(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEntryExitAnnounced", value);
    }
    /**
     * Sets the joinInformation property value. The join information in the language and locale variant specified in 'Accept-Language' request HTTP header. Read-only.
     * @param value Value to set for the joinInformation property.
     */
    public void setJoinInformation(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("joinInformation", value);
    }
    /**
     * Sets the joinMeetingIdSettings property value. Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode. Once an onlineMeeting is created, the joinMeetingIdSettings can't be modified. To make any changes to this property, you must cancel this meeting and create a new one.
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
     * Sets the shareMeetingChatHistoryDefault property value. The shareMeetingChatHistoryDefault property
     * @param value Value to set for the shareMeetingChatHistoryDefault property.
     */
    public void setShareMeetingChatHistoryDefault(@jakarta.annotation.Nullable final OnlineMeetingBaseShareMeetingChatHistoryDefault value) {
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
