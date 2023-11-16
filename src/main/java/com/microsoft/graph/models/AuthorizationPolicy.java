package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthorizationPolicy extends PolicyBase implements Parsable {
    /**
     * Instantiates a new AuthorizationPolicy and sets the default values.
     */
    public AuthorizationPolicy() {
        super();
        this.setOdataType("#microsoft.graph.authorizationPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthorizationPolicy
     */
    @jakarta.annotation.Nonnull
    public static AuthorizationPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthorizationPolicy();
    }
    /**
     * Gets the allowedToSignUpEmailBasedSubscriptions property value. Indicates whether users can sign up for email based subscriptions.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowedToSignUpEmailBasedSubscriptions() {
        return this.backingStore.get("allowedToSignUpEmailBasedSubscriptions");
    }
    /**
     * Gets the allowedToUseSSPR property value. Indicates whether users can use the Self-Service Password Reset feature on the tenant.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowedToUseSSPR() {
        return this.backingStore.get("allowedToUseSSPR");
    }
    /**
     * Gets the allowEmailVerifiedUsersToJoinOrganization property value. Indicates whether a user can join the tenant by email validation.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowEmailVerifiedUsersToJoinOrganization() {
        return this.backingStore.get("allowEmailVerifiedUsersToJoinOrganization");
    }
    /**
     * Gets the allowInvitesFrom property value. Indicates who can invite external users to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone.  everyone is the default setting for all cloud environments except US Government. For more information, see allowInvitesFrom values.
     * @return a AllowInvitesFrom
     */
    @jakarta.annotation.Nullable
    public AllowInvitesFrom getAllowInvitesFrom() {
        return this.backingStore.get("allowInvitesFrom");
    }
    /**
     * Gets the allowUserConsentForRiskyApps property value. Indicates whether user consent for risky apps is allowed. We recommend keeping allowUserConsentForRiskyApps as false. Default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUserConsentForRiskyApps() {
        return this.backingStore.get("allowUserConsentForRiskyApps");
    }
    /**
     * Gets the blockMsolPowerShell property value. To disable the use of MSOL PowerShell, set this property to true. This also disables user-based access to the legacy service endpoint used by MSOL PowerShell. This doesn't affect Microsoft Entra Connect or Microsoft Graph.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockMsolPowerShell() {
        return this.backingStore.get("blockMsolPowerShell");
    }
    /**
     * Gets the defaultUserRolePermissions property value. The defaultUserRolePermissions property
     * @return a DefaultUserRolePermissions
     */
    @jakarta.annotation.Nullable
    public DefaultUserRolePermissions getDefaultUserRolePermissions() {
        return this.backingStore.get("defaultUserRolePermissions");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedToSignUpEmailBasedSubscriptions", (n) -> { this.setAllowedToSignUpEmailBasedSubscriptions(n.getBooleanValue()); });
        deserializerMap.put("allowedToUseSSPR", (n) -> { this.setAllowedToUseSSPR(n.getBooleanValue()); });
        deserializerMap.put("allowEmailVerifiedUsersToJoinOrganization", (n) -> { this.setAllowEmailVerifiedUsersToJoinOrganization(n.getBooleanValue()); });
        deserializerMap.put("allowInvitesFrom", (n) -> { this.setAllowInvitesFrom(n.getEnumValue(AllowInvitesFrom.class)); });
        deserializerMap.put("allowUserConsentForRiskyApps", (n) -> { this.setAllowUserConsentForRiskyApps(n.getBooleanValue()); });
        deserializerMap.put("blockMsolPowerShell", (n) -> { this.setBlockMsolPowerShell(n.getBooleanValue()); });
        deserializerMap.put("defaultUserRolePermissions", (n) -> { this.setDefaultUserRolePermissions(n.getObjectValue(DefaultUserRolePermissions::createFromDiscriminatorValue)); });
        deserializerMap.put("guestUserRoleId", (n) -> { this.setGuestUserRoleId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the guestUserRoleId property value. Represents role templateId for the role that should be granted to guest user. Currently following roles are supported:  User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest User (2af84b1e-32c8-42b7-82bc-daa82404023b).
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getGuestUserRoleId() {
        return this.backingStore.get("guestUserRoleId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowedToSignUpEmailBasedSubscriptions", this.getAllowedToSignUpEmailBasedSubscriptions());
        writer.writeBooleanValue("allowedToUseSSPR", this.getAllowedToUseSSPR());
        writer.writeBooleanValue("allowEmailVerifiedUsersToJoinOrganization", this.getAllowEmailVerifiedUsersToJoinOrganization());
        writer.writeEnumValue("allowInvitesFrom", this.getAllowInvitesFrom());
        writer.writeBooleanValue("allowUserConsentForRiskyApps", this.getAllowUserConsentForRiskyApps());
        writer.writeBooleanValue("blockMsolPowerShell", this.getBlockMsolPowerShell());
        writer.writeObjectValue("defaultUserRolePermissions", this.getDefaultUserRolePermissions());
        writer.writeUUIDValue("guestUserRoleId", this.getGuestUserRoleId());
    }
    /**
     * Sets the allowedToSignUpEmailBasedSubscriptions property value. Indicates whether users can sign up for email based subscriptions.
     * @param value Value to set for the allowedToSignUpEmailBasedSubscriptions property.
     */
    public void setAllowedToSignUpEmailBasedSubscriptions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowedToSignUpEmailBasedSubscriptions", value);
    }
    /**
     * Sets the allowedToUseSSPR property value. Indicates whether users can use the Self-Service Password Reset feature on the tenant.
     * @param value Value to set for the allowedToUseSSPR property.
     */
    public void setAllowedToUseSSPR(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowedToUseSSPR", value);
    }
    /**
     * Sets the allowEmailVerifiedUsersToJoinOrganization property value. Indicates whether a user can join the tenant by email validation.
     * @param value Value to set for the allowEmailVerifiedUsersToJoinOrganization property.
     */
    public void setAllowEmailVerifiedUsersToJoinOrganization(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowEmailVerifiedUsersToJoinOrganization", value);
    }
    /**
     * Sets the allowInvitesFrom property value. Indicates who can invite external users to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone.  everyone is the default setting for all cloud environments except US Government. For more information, see allowInvitesFrom values.
     * @param value Value to set for the allowInvitesFrom property.
     */
    public void setAllowInvitesFrom(@jakarta.annotation.Nullable final AllowInvitesFrom value) {
        this.backingStore.set("allowInvitesFrom", value);
    }
    /**
     * Sets the allowUserConsentForRiskyApps property value. Indicates whether user consent for risky apps is allowed. We recommend keeping allowUserConsentForRiskyApps as false. Default value is false.
     * @param value Value to set for the allowUserConsentForRiskyApps property.
     */
    public void setAllowUserConsentForRiskyApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowUserConsentForRiskyApps", value);
    }
    /**
     * Sets the blockMsolPowerShell property value. To disable the use of MSOL PowerShell, set this property to true. This also disables user-based access to the legacy service endpoint used by MSOL PowerShell. This doesn't affect Microsoft Entra Connect or Microsoft Graph.
     * @param value Value to set for the blockMsolPowerShell property.
     */
    public void setBlockMsolPowerShell(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("blockMsolPowerShell", value);
    }
    /**
     * Sets the defaultUserRolePermissions property value. The defaultUserRolePermissions property
     * @param value Value to set for the defaultUserRolePermissions property.
     */
    public void setDefaultUserRolePermissions(@jakarta.annotation.Nullable final DefaultUserRolePermissions value) {
        this.backingStore.set("defaultUserRolePermissions", value);
    }
    /**
     * Sets the guestUserRoleId property value. Represents role templateId for the role that should be granted to guest user. Currently following roles are supported:  User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest User (2af84b1e-32c8-42b7-82bc-daa82404023b).
     * @param value Value to set for the guestUserRoleId property.
     */
    public void setGuestUserRoleId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("guestUserRoleId", value);
    }
}
