package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Invitation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Invitation} and sets the default values.
     */
    public Invitation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Invitation}
     */
    @jakarta.annotation.Nonnull
    public static Invitation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Invitation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("invitedUser", (n) -> { this.setInvitedUser(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("invitedUserDisplayName", (n) -> { this.setInvitedUserDisplayName(n.getStringValue()); });
        deserializerMap.put("invitedUserEmailAddress", (n) -> { this.setInvitedUserEmailAddress(n.getStringValue()); });
        deserializerMap.put("invitedUserMessageInfo", (n) -> { this.setInvitedUserMessageInfo(n.getObjectValue(InvitedUserMessageInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("invitedUserSponsors", (n) -> { this.setInvitedUserSponsors(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("invitedUserType", (n) -> { this.setInvitedUserType(n.getStringValue()); });
        deserializerMap.put("inviteRedeemUrl", (n) -> { this.setInviteRedeemUrl(n.getStringValue()); });
        deserializerMap.put("inviteRedirectUrl", (n) -> { this.setInviteRedirectUrl(n.getStringValue()); });
        deserializerMap.put("resetRedemption", (n) -> { this.setResetRedemption(n.getBooleanValue()); });
        deserializerMap.put("sendInvitationMessage", (n) -> { this.setSendInvitationMessage(n.getBooleanValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invitedUser property value. The user created as part of the invitation creation. Read-Only
     * @return a {@link User}
     */
    @jakarta.annotation.Nullable
    public User getInvitedUser() {
        return this.backingStore.get("invitedUser");
    }
    /**
     * Gets the invitedUserDisplayName property value. The display name of the user being invited.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInvitedUserDisplayName() {
        return this.backingStore.get("invitedUserDisplayName");
    }
    /**
     * Gets the invitedUserEmailAddress property value. The email address of the user being invited. Required. The following special characters aren't permitted in the email address:Tilde (~)Exclamation point (!)Number sign (#)Dollar sign ($)Percent (%)Circumflex (^)Ampersand (&)Asterisk (*)Parentheses (( ))Plus sign (+)Equal sign (=)Brackets ([ ])Braces ({ })Backslash (/)Slash mark (/)Pipe (/|)Semicolon (;)Colon (:)Quotation marks (')Angle brackets (< >)Question mark (?)Comma (,)However, the following exceptions apply:A period (.) or a hyphen (-) is permitted anywhere in the user name, except at the beginning or end of the name.An underscore (_) is permitted anywhere in the user name. This includes at the beginning or end of the name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInvitedUserEmailAddress() {
        return this.backingStore.get("invitedUserEmailAddress");
    }
    /**
     * Gets the invitedUserMessageInfo property value. Additional configuration for the message being sent to the invited user, including customizing message text, language and cc recipient list.
     * @return a {@link InvitedUserMessageInfo}
     */
    @jakarta.annotation.Nullable
    public InvitedUserMessageInfo getInvitedUserMessageInfo() {
        return this.backingStore.get("invitedUserMessageInfo");
    }
    /**
     * Gets the invitedUserSponsors property value. The invitedUserSponsors property
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getInvitedUserSponsors() {
        return this.backingStore.get("invitedUserSponsors");
    }
    /**
     * Gets the invitedUserType property value. The userType of the user being invited. By default, this is Guest. You can invite as Member if you're a company administrator.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInvitedUserType() {
        return this.backingStore.get("invitedUserType");
    }
    /**
     * Gets the inviteRedeemUrl property value. The URL the user can use to redeem their invitation. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInviteRedeemUrl() {
        return this.backingStore.get("inviteRedeemUrl");
    }
    /**
     * Gets the inviteRedirectUrl property value. The URL the user should be redirected to once the invitation is redeemed. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInviteRedirectUrl() {
        return this.backingStore.get("inviteRedirectUrl");
    }
    /**
     * Gets the resetRedemption property value. Reset the user's redemption status and reinvite a user while retaining their user identifier, group memberships, and app assignments. This property allows you to enable a user to sign-in using a different email address from the one in the previous invitation. For more information about using this property, see Reset redemption status for a guest user.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getResetRedemption() {
        return this.backingStore.get("resetRedemption");
    }
    /**
     * Gets the sendInvitationMessage property value. Indicates whether an email should be sent to the user being invited. The default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSendInvitationMessage() {
        return this.backingStore.get("sendInvitationMessage");
    }
    /**
     * Gets the status property value. The status of the invitation. Possible values are: PendingAcceptance, Completed, InProgress, and Error.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("invitedUser", this.getInvitedUser());
        writer.writeStringValue("invitedUserDisplayName", this.getInvitedUserDisplayName());
        writer.writeStringValue("invitedUserEmailAddress", this.getInvitedUserEmailAddress());
        writer.writeObjectValue("invitedUserMessageInfo", this.getInvitedUserMessageInfo());
        writer.writeCollectionOfObjectValues("invitedUserSponsors", this.getInvitedUserSponsors());
        writer.writeStringValue("invitedUserType", this.getInvitedUserType());
        writer.writeStringValue("inviteRedeemUrl", this.getInviteRedeemUrl());
        writer.writeStringValue("inviteRedirectUrl", this.getInviteRedirectUrl());
        writer.writeBooleanValue("resetRedemption", this.getResetRedemption());
        writer.writeBooleanValue("sendInvitationMessage", this.getSendInvitationMessage());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the invitedUser property value. The user created as part of the invitation creation. Read-Only
     * @param value Value to set for the invitedUser property.
     */
    public void setInvitedUser(@jakarta.annotation.Nullable final User value) {
        this.backingStore.set("invitedUser", value);
    }
    /**
     * Sets the invitedUserDisplayName property value. The display name of the user being invited.
     * @param value Value to set for the invitedUserDisplayName property.
     */
    public void setInvitedUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("invitedUserDisplayName", value);
    }
    /**
     * Sets the invitedUserEmailAddress property value. The email address of the user being invited. Required. The following special characters aren't permitted in the email address:Tilde (~)Exclamation point (!)Number sign (#)Dollar sign ($)Percent (%)Circumflex (^)Ampersand (&)Asterisk (*)Parentheses (( ))Plus sign (+)Equal sign (=)Brackets ([ ])Braces ({ })Backslash (/)Slash mark (/)Pipe (/|)Semicolon (;)Colon (:)Quotation marks (')Angle brackets (< >)Question mark (?)Comma (,)However, the following exceptions apply:A period (.) or a hyphen (-) is permitted anywhere in the user name, except at the beginning or end of the name.An underscore (_) is permitted anywhere in the user name. This includes at the beginning or end of the name.
     * @param value Value to set for the invitedUserEmailAddress property.
     */
    public void setInvitedUserEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("invitedUserEmailAddress", value);
    }
    /**
     * Sets the invitedUserMessageInfo property value. Additional configuration for the message being sent to the invited user, including customizing message text, language and cc recipient list.
     * @param value Value to set for the invitedUserMessageInfo property.
     */
    public void setInvitedUserMessageInfo(@jakarta.annotation.Nullable final InvitedUserMessageInfo value) {
        this.backingStore.set("invitedUserMessageInfo", value);
    }
    /**
     * Sets the invitedUserSponsors property value. The invitedUserSponsors property
     * @param value Value to set for the invitedUserSponsors property.
     */
    public void setInvitedUserSponsors(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("invitedUserSponsors", value);
    }
    /**
     * Sets the invitedUserType property value. The userType of the user being invited. By default, this is Guest. You can invite as Member if you're a company administrator.
     * @param value Value to set for the invitedUserType property.
     */
    public void setInvitedUserType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("invitedUserType", value);
    }
    /**
     * Sets the inviteRedeemUrl property value. The URL the user can use to redeem their invitation. Read-only.
     * @param value Value to set for the inviteRedeemUrl property.
     */
    public void setInviteRedeemUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("inviteRedeemUrl", value);
    }
    /**
     * Sets the inviteRedirectUrl property value. The URL the user should be redirected to once the invitation is redeemed. Required.
     * @param value Value to set for the inviteRedirectUrl property.
     */
    public void setInviteRedirectUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("inviteRedirectUrl", value);
    }
    /**
     * Sets the resetRedemption property value. Reset the user's redemption status and reinvite a user while retaining their user identifier, group memberships, and app assignments. This property allows you to enable a user to sign-in using a different email address from the one in the previous invitation. For more information about using this property, see Reset redemption status for a guest user.
     * @param value Value to set for the resetRedemption property.
     */
    public void setResetRedemption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("resetRedemption", value);
    }
    /**
     * Sets the sendInvitationMessage property value. Indicates whether an email should be sent to the user being invited. The default is false.
     * @param value Value to set for the sendInvitationMessage property.
     */
    public void setSendInvitationMessage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("sendInvitationMessage", value);
    }
    /**
     * Sets the status property value. The status of the invitation. Possible values are: PendingAcceptance, Completed, InProgress, and Error.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
}
