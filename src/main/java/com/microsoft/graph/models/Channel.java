package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Channel extends Entity implements Parsable {
    /** Read only. Timestamp at which the channel was created.  */
    private OffsetDateTime _createdDateTime;
    /** Optional textual description for the channel.  */
    private String _description;
    /** Channel name as it will appear to the user in Microsoft Teams.  */
    private String _displayName;
    /** The email address for sending messages to the channel. Read-only.  */
    private String _email;
    /** Metadata for the location where the channel's files are stored.  */
    private DriveItem _filesFolder;
    /** Indicates whether the channel should automatically be marked 'favorite' for all members of the team. Can only be set programmatically with Create team. Default: false.  */
    private Boolean _isFavoriteByDefault;
    /** A collection of membership records associated with the channel.  */
    private java.util.List<ConversationMember> _members;
    /** The type of the channel. Can be set during creation and can't be changed. The possible values are: standard, private, unknownFutureValue, shared. The default value is standard. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: shared.  */
    private ChannelMembershipType _membershipType;
    /** A collection of all the messages in the channel. A navigation property. Nullable.  */
    private java.util.List<ChatMessage> _messages;
    /** A collection of all the tabs in the channel. A navigation property.  */
    private java.util.List<TeamsTab> _tabs;
    /** A hyperlink that will go to the channel in Microsoft Teams. This is the URL that you get when you right-click a channel in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed. Read-only.  */
    private String _webUrl;
    /**
     * Instantiates a new channel and sets the default values.
     * @return a void
     */
    public Channel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a channel
     */
    @javax.annotation.Nonnull
    public static Channel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Channel();
    }
    /**
     * Gets the createdDateTime property value. Read only. Timestamp at which the channel was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Optional textual description for the channel.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Channel name as it will appear to the user in Microsoft Teams.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the email property value. The email address for sending messages to the channel. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Channel currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("filesFolder", (n) -> { currentObject.setFilesFolder(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
            this.put("isFavoriteByDefault", (n) -> { currentObject.setIsFavoriteByDefault(n.getBooleanValue()); });
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfObjectValues(ConversationMember::createFromDiscriminatorValue)); });
            this.put("membershipType", (n) -> { currentObject.setMembershipType(n.getEnumValue(ChannelMembershipType.class)); });
            this.put("messages", (n) -> { currentObject.setMessages(n.getCollectionOfObjectValues(ChatMessage::createFromDiscriminatorValue)); });
            this.put("tabs", (n) -> { currentObject.setTabs(n.getCollectionOfObjectValues(TeamsTab::createFromDiscriminatorValue)); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the filesFolder property value. Metadata for the location where the channel's files are stored.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public DriveItem getFilesFolder() {
        return this._filesFolder;
    }
    /**
     * Gets the isFavoriteByDefault property value. Indicates whether the channel should automatically be marked 'favorite' for all members of the team. Can only be set programmatically with Create team. Default: false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFavoriteByDefault() {
        return this._isFavoriteByDefault;
    }
    /**
     * Gets the members property value. A collection of membership records associated with the channel.
     * @return a conversationMember
     */
    @javax.annotation.Nullable
    public java.util.List<ConversationMember> getMembers() {
        return this._members;
    }
    /**
     * Gets the membershipType property value. The type of the channel. Can be set during creation and can't be changed. The possible values are: standard, private, unknownFutureValue, shared. The default value is standard. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: shared.
     * @return a channelMembershipType
     */
    @javax.annotation.Nullable
    public ChannelMembershipType getMembershipType() {
        return this._membershipType;
    }
    /**
     * Gets the messages property value. A collection of all the messages in the channel. A navigation property. Nullable.
     * @return a chatMessage
     */
    @javax.annotation.Nullable
    public java.util.List<ChatMessage> getMessages() {
        return this._messages;
    }
    /**
     * Gets the tabs property value. A collection of all the tabs in the channel. A navigation property.
     * @return a teamsTab
     */
    @javax.annotation.Nullable
    public java.util.List<TeamsTab> getTabs() {
        return this._tabs;
    }
    /**
     * Gets the webUrl property value. A hyperlink that will go to the channel in Microsoft Teams. This is the URL that you get when you right-click a channel in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeObjectValue("filesFolder", this.getFilesFolder());
        writer.writeBooleanValue("isFavoriteByDefault", this.getIsFavoriteByDefault());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeEnumValue("membershipType", this.getMembershipType());
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
        writer.writeCollectionOfObjectValues("tabs", this.getTabs());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the createdDateTime property value. Read only. Timestamp at which the channel was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Optional textual description for the channel.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Channel name as it will appear to the user in Microsoft Teams.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the email property value. The email address for sending messages to the channel. Read-only.
     * @param value Value to set for the email property.
     * @return a void
     */
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the filesFolder property value. Metadata for the location where the channel's files are stored.
     * @param value Value to set for the filesFolder property.
     * @return a void
     */
    public void setFilesFolder(@javax.annotation.Nullable final DriveItem value) {
        this._filesFolder = value;
    }
    /**
     * Sets the isFavoriteByDefault property value. Indicates whether the channel should automatically be marked 'favorite' for all members of the team. Can only be set programmatically with Create team. Default: false.
     * @param value Value to set for the isFavoriteByDefault property.
     * @return a void
     */
    public void setIsFavoriteByDefault(@javax.annotation.Nullable final Boolean value) {
        this._isFavoriteByDefault = value;
    }
    /**
     * Sets the members property value. A collection of membership records associated with the channel.
     * @param value Value to set for the members property.
     * @return a void
     */
    public void setMembers(@javax.annotation.Nullable final java.util.List<ConversationMember> value) {
        this._members = value;
    }
    /**
     * Sets the membershipType property value. The type of the channel. Can be set during creation and can't be changed. The possible values are: standard, private, unknownFutureValue, shared. The default value is standard. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: shared.
     * @param value Value to set for the membershipType property.
     * @return a void
     */
    public void setMembershipType(@javax.annotation.Nullable final ChannelMembershipType value) {
        this._membershipType = value;
    }
    /**
     * Sets the messages property value. A collection of all the messages in the channel. A navigation property. Nullable.
     * @param value Value to set for the messages property.
     * @return a void
     */
    public void setMessages(@javax.annotation.Nullable final java.util.List<ChatMessage> value) {
        this._messages = value;
    }
    /**
     * Sets the tabs property value. A collection of all the tabs in the channel. A navigation property.
     * @param value Value to set for the tabs property.
     * @return a void
     */
    public void setTabs(@javax.annotation.Nullable final java.util.List<TeamsTab> value) {
        this._tabs = value;
    }
    /**
     * Sets the webUrl property value. A hyperlink that will go to the channel in Microsoft Teams. This is the URL that you get when you right-click a channel in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed. Read-only.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
