package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Invitation extends Entity implements Parsable {
    /** The user created as part of the invitation creation. Read-Only */
    private User _invitedUser;
    /** The display name of the user being invited. */
    private String _invitedUserDisplayName;
    /** The email address of the user being invited. Required. The following special characters are not permitted in the email address:Tilde (~)Exclamation point (!)At sign (@)Number sign (#)Dollar sign ($)Percent (%)Circumflex (^)Ampersand (&)Asterisk (*)Parentheses (( ))Hyphen (-)Plus sign (+)Equal sign (=)Brackets ([ ])Braces ({ })Backslash (/)Slash mark (/)Pipe (` */
    private String _invitedUserEmailAddress;
    /** Additional configuration for the message being sent to the invited user, including customizing message text, language and cc recipient list. */
    private InvitedUserMessageInfo _invitedUserMessageInfo;
    /** The userType of the user being invited. By default, this is Guest. You can invite as Member if you're are company administrator. The default is false. */
    private String _invitedUserType;
    /** The URL the user can use to redeem their invitation. Read-only. */
    private String _inviteRedeemUrl;
    /** The URL user should be redirected to once the invitation is redeemed. Required. */
    private String _inviteRedirectUrl;
    /** Indicates whether an email should be sent to the user being invited. The default is false. */
    private Boolean _sendInvitationMessage;
    /** The status of the invitation. Possible values: PendingAcceptance, Completed, InProgress, and Error */
    private String _status;
    /**
     * Instantiates a new invitation and sets the default values.
     * @return a void
     */
    public Invitation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a invitation
     */
    @javax.annotation.Nonnull
    public static Invitation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Invitation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Invitation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("invitedUser", (n) -> { currentObject.setInvitedUser(n.getObjectValue(User::createFromDiscriminatorValue)); });
            this.put("invitedUserDisplayName", (n) -> { currentObject.setInvitedUserDisplayName(n.getStringValue()); });
            this.put("invitedUserEmailAddress", (n) -> { currentObject.setInvitedUserEmailAddress(n.getStringValue()); });
            this.put("invitedUserMessageInfo", (n) -> { currentObject.setInvitedUserMessageInfo(n.getObjectValue(InvitedUserMessageInfo::createFromDiscriminatorValue)); });
            this.put("invitedUserType", (n) -> { currentObject.setInvitedUserType(n.getStringValue()); });
            this.put("inviteRedeemUrl", (n) -> { currentObject.setInviteRedeemUrl(n.getStringValue()); });
            this.put("inviteRedirectUrl", (n) -> { currentObject.setInviteRedirectUrl(n.getStringValue()); });
            this.put("sendInvitationMessage", (n) -> { currentObject.setSendInvitationMessage(n.getBooleanValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the invitedUser property value. The user created as part of the invitation creation. Read-Only
     * @return a user
     */
    @javax.annotation.Nullable
    public User getInvitedUser() {
        return this._invitedUser;
    }
    /**
     * Gets the invitedUserDisplayName property value. The display name of the user being invited.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvitedUserDisplayName() {
        return this._invitedUserDisplayName;
    }
    /**
     * Gets the invitedUserEmailAddress property value. The email address of the user being invited. Required. The following special characters are not permitted in the email address:Tilde (~)Exclamation point (!)At sign (@)Number sign (#)Dollar sign ($)Percent (%)Circumflex (^)Ampersand (&)Asterisk (*)Parentheses (( ))Hyphen (-)Plus sign (+)Equal sign (=)Brackets ([ ])Braces ({ })Backslash (/)Slash mark (/)Pipe (`
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvitedUserEmailAddress() {
        return this._invitedUserEmailAddress;
    }
    /**
     * Gets the invitedUserMessageInfo property value. Additional configuration for the message being sent to the invited user, including customizing message text, language and cc recipient list.
     * @return a invitedUserMessageInfo
     */
    @javax.annotation.Nullable
    public InvitedUserMessageInfo getInvitedUserMessageInfo() {
        return this._invitedUserMessageInfo;
    }
    /**
     * Gets the invitedUserType property value. The userType of the user being invited. By default, this is Guest. You can invite as Member if you're are company administrator. The default is false.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInvitedUserType() {
        return this._invitedUserType;
    }
    /**
     * Gets the inviteRedeemUrl property value. The URL the user can use to redeem their invitation. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInviteRedeemUrl() {
        return this._inviteRedeemUrl;
    }
    /**
     * Gets the inviteRedirectUrl property value. The URL user should be redirected to once the invitation is redeemed. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInviteRedirectUrl() {
        return this._inviteRedirectUrl;
    }
    /**
     * Gets the sendInvitationMessage property value. Indicates whether an email should be sent to the user being invited. The default is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSendInvitationMessage() {
        return this._sendInvitationMessage;
    }
    /**
     * Gets the status property value. The status of the invitation. Possible values: PendingAcceptance, Completed, InProgress, and Error
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("invitedUser", this.getInvitedUser());
        writer.writeStringValue("invitedUserDisplayName", this.getInvitedUserDisplayName());
        writer.writeStringValue("invitedUserEmailAddress", this.getInvitedUserEmailAddress());
        writer.writeObjectValue("invitedUserMessageInfo", this.getInvitedUserMessageInfo());
        writer.writeStringValue("invitedUserType", this.getInvitedUserType());
        writer.writeStringValue("inviteRedeemUrl", this.getInviteRedeemUrl());
        writer.writeStringValue("inviteRedirectUrl", this.getInviteRedirectUrl());
        writer.writeBooleanValue("sendInvitationMessage", this.getSendInvitationMessage());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the invitedUser property value. The user created as part of the invitation creation. Read-Only
     * @param value Value to set for the invitedUser property.
     * @return a void
     */
    public void setInvitedUser(@javax.annotation.Nullable final User value) {
        this._invitedUser = value;
    }
    /**
     * Sets the invitedUserDisplayName property value. The display name of the user being invited.
     * @param value Value to set for the invitedUserDisplayName property.
     * @return a void
     */
    public void setInvitedUserDisplayName(@javax.annotation.Nullable final String value) {
        this._invitedUserDisplayName = value;
    }
    /**
     * Sets the invitedUserEmailAddress property value. The email address of the user being invited. Required. The following special characters are not permitted in the email address:Tilde (~)Exclamation point (!)At sign (@)Number sign (#)Dollar sign ($)Percent (%)Circumflex (^)Ampersand (&)Asterisk (*)Parentheses (( ))Hyphen (-)Plus sign (+)Equal sign (=)Brackets ([ ])Braces ({ })Backslash (/)Slash mark (/)Pipe (`
     * @param value Value to set for the invitedUserEmailAddress property.
     * @return a void
     */
    public void setInvitedUserEmailAddress(@javax.annotation.Nullable final String value) {
        this._invitedUserEmailAddress = value;
    }
    /**
     * Sets the invitedUserMessageInfo property value. Additional configuration for the message being sent to the invited user, including customizing message text, language and cc recipient list.
     * @param value Value to set for the invitedUserMessageInfo property.
     * @return a void
     */
    public void setInvitedUserMessageInfo(@javax.annotation.Nullable final InvitedUserMessageInfo value) {
        this._invitedUserMessageInfo = value;
    }
    /**
     * Sets the invitedUserType property value. The userType of the user being invited. By default, this is Guest. You can invite as Member if you're are company administrator. The default is false.
     * @param value Value to set for the invitedUserType property.
     * @return a void
     */
    public void setInvitedUserType(@javax.annotation.Nullable final String value) {
        this._invitedUserType = value;
    }
    /**
     * Sets the inviteRedeemUrl property value. The URL the user can use to redeem their invitation. Read-only.
     * @param value Value to set for the inviteRedeemUrl property.
     * @return a void
     */
    public void setInviteRedeemUrl(@javax.annotation.Nullable final String value) {
        this._inviteRedeemUrl = value;
    }
    /**
     * Sets the inviteRedirectUrl property value. The URL user should be redirected to once the invitation is redeemed. Required.
     * @param value Value to set for the inviteRedirectUrl property.
     * @return a void
     */
    public void setInviteRedirectUrl(@javax.annotation.Nullable final String value) {
        this._inviteRedirectUrl = value;
    }
    /**
     * Sets the sendInvitationMessage property value. Indicates whether an email should be sent to the user being invited. The default is false.
     * @param value Value to set for the sendInvitationMessage property.
     * @return a void
     */
    public void setSendInvitationMessage(@javax.annotation.Nullable final Boolean value) {
        this._sendInvitationMessage = value;
    }
    /**
     * Sets the status property value. The status of the invitation. Possible values: PendingAcceptance, Completed, InProgress, and Error
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
}
