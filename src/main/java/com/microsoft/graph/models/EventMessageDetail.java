package com.microsoft.graph.models;

import com.microsoft.graph.models.CallEndedEventMessageDetail;
import com.microsoft.graph.models.CallRecordingEventMessageDetail;
import com.microsoft.graph.models.CallStartedEventMessageDetail;
import com.microsoft.graph.models.CallTranscriptEventMessageDetail;
import com.microsoft.graph.models.ChannelAddedEventMessageDetail;
import com.microsoft.graph.models.ChannelDeletedEventMessageDetail;
import com.microsoft.graph.models.ChannelDescriptionUpdatedEventMessageDetail;
import com.microsoft.graph.models.ChannelRenamedEventMessageDetail;
import com.microsoft.graph.models.ChannelSetAsFavoriteByDefaultEventMessageDetail;
import com.microsoft.graph.models.ChannelUnsetAsFavoriteByDefaultEventMessageDetail;
import com.microsoft.graph.models.ChatRenamedEventMessageDetail;
import com.microsoft.graph.models.ConversationMemberRoleUpdatedEventMessageDetail;
import com.microsoft.graph.models.MeetingPolicyUpdatedEventMessageDetail;
import com.microsoft.graph.models.MembersAddedEventMessageDetail;
import com.microsoft.graph.models.MembersDeletedEventMessageDetail;
import com.microsoft.graph.models.MembersJoinedEventMessageDetail;
import com.microsoft.graph.models.MembersLeftEventMessageDetail;
import com.microsoft.graph.models.MessagePinnedEventMessageDetail;
import com.microsoft.graph.models.MessageUnpinnedEventMessageDetail;
import com.microsoft.graph.models.TabUpdatedEventMessageDetail;
import com.microsoft.graph.models.TeamArchivedEventMessageDetail;
import com.microsoft.graph.models.TeamCreatedEventMessageDetail;
import com.microsoft.graph.models.TeamDescriptionUpdatedEventMessageDetail;
import com.microsoft.graph.models.TeamJoiningDisabledEventMessageDetail;
import com.microsoft.graph.models.TeamJoiningEnabledEventMessageDetail;
import com.microsoft.graph.models.TeamRenamedEventMessageDetail;
import com.microsoft.graph.models.TeamsAppInstalledEventMessageDetail;
import com.microsoft.graph.models.TeamsAppRemovedEventMessageDetail;
import com.microsoft.graph.models.TeamsAppUpgradedEventMessageDetail;
import com.microsoft.graph.models.TeamUnarchivedEventMessageDetail;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EventMessageDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new eventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EventMessageDetail() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.eventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a eventMessageDetail
     */
    @javax.annotation.Nonnull
    public static EventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.callEndedEventMessageDetail": return new CallEndedEventMessageDetail();
                case "#microsoft.graph.callRecordingEventMessageDetail": return new CallRecordingEventMessageDetail();
                case "#microsoft.graph.callStartedEventMessageDetail": return new CallStartedEventMessageDetail();
                case "#microsoft.graph.callTranscriptEventMessageDetail": return new CallTranscriptEventMessageDetail();
                case "#microsoft.graph.channelAddedEventMessageDetail": return new ChannelAddedEventMessageDetail();
                case "#microsoft.graph.channelDeletedEventMessageDetail": return new ChannelDeletedEventMessageDetail();
                case "#microsoft.graph.channelDescriptionUpdatedEventMessageDetail": return new ChannelDescriptionUpdatedEventMessageDetail();
                case "#microsoft.graph.channelRenamedEventMessageDetail": return new ChannelRenamedEventMessageDetail();
                case "#microsoft.graph.channelSetAsFavoriteByDefaultEventMessageDetail": return new ChannelSetAsFavoriteByDefaultEventMessageDetail();
                case "#microsoft.graph.channelUnsetAsFavoriteByDefaultEventMessageDetail": return new ChannelUnsetAsFavoriteByDefaultEventMessageDetail();
                case "#microsoft.graph.chatRenamedEventMessageDetail": return new ChatRenamedEventMessageDetail();
                case "#microsoft.graph.conversationMemberRoleUpdatedEventMessageDetail": return new ConversationMemberRoleUpdatedEventMessageDetail();
                case "#microsoft.graph.meetingPolicyUpdatedEventMessageDetail": return new MeetingPolicyUpdatedEventMessageDetail();
                case "#microsoft.graph.membersAddedEventMessageDetail": return new MembersAddedEventMessageDetail();
                case "#microsoft.graph.membersDeletedEventMessageDetail": return new MembersDeletedEventMessageDetail();
                case "#microsoft.graph.membersJoinedEventMessageDetail": return new MembersJoinedEventMessageDetail();
                case "#microsoft.graph.membersLeftEventMessageDetail": return new MembersLeftEventMessageDetail();
                case "#microsoft.graph.messagePinnedEventMessageDetail": return new MessagePinnedEventMessageDetail();
                case "#microsoft.graph.messageUnpinnedEventMessageDetail": return new MessageUnpinnedEventMessageDetail();
                case "#microsoft.graph.tabUpdatedEventMessageDetail": return new TabUpdatedEventMessageDetail();
                case "#microsoft.graph.teamArchivedEventMessageDetail": return new TeamArchivedEventMessageDetail();
                case "#microsoft.graph.teamCreatedEventMessageDetail": return new TeamCreatedEventMessageDetail();
                case "#microsoft.graph.teamDescriptionUpdatedEventMessageDetail": return new TeamDescriptionUpdatedEventMessageDetail();
                case "#microsoft.graph.teamJoiningDisabledEventMessageDetail": return new TeamJoiningDisabledEventMessageDetail();
                case "#microsoft.graph.teamJoiningEnabledEventMessageDetail": return new TeamJoiningEnabledEventMessageDetail();
                case "#microsoft.graph.teamRenamedEventMessageDetail": return new TeamRenamedEventMessageDetail();
                case "#microsoft.graph.teamsAppInstalledEventMessageDetail": return new TeamsAppInstalledEventMessageDetail();
                case "#microsoft.graph.teamsAppRemovedEventMessageDetail": return new TeamsAppRemovedEventMessageDetail();
                case "#microsoft.graph.teamsAppUpgradedEventMessageDetail": return new TeamsAppUpgradedEventMessageDetail();
                case "#microsoft.graph.teamUnarchivedEventMessageDetail": return new TeamUnarchivedEventMessageDetail();
            }
        }
        return new EventMessageDetail();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EventMessageDetail currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
