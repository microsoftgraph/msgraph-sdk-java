package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class AuthorizationPolicy extends PolicyBase implements Parsable {
    /**
     * Indicates whether users can sign up for email based subscriptions.
     */
    private Boolean allowedToSignUpEmailBasedSubscriptions;
    /**
     * Indicates whether users can use the Self-Serve Password Reset feature on the tenant.
     */
    private Boolean allowedToUseSSPR;
    /**
     * Indicates whether a user can join the tenant by email validation.
     */
    private Boolean allowEmailVerifiedUsersToJoinOrganization;
    /**
     * Indicates who can invite external users to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone.  everyone is the default setting for all cloud environments except US Government. For more details, see allowInvitesFrom values.
     */
    private AllowInvitesFrom allowInvitesFrom;
    /**
     * Indicates whether user consent for risky apps is allowed. We recommend to keep this as false. Default value is false.
     */
    private Boolean allowUserConsentForRiskyApps;
    /**
     * To disable the use of MSOL PowerShell, set this property to true. This also disables user-based access to the legacy service endpoint used by MSOL PowerShell. This does not affect Azure Active Directory Connect or Microsoft Graph.
     */
    private Boolean blockMsolPowerShell;
    /**
     * The defaultUserRolePermissions property
     */
    private DefaultUserRolePermissions defaultUserRolePermissions;
    /**
     * Represents role templateId for the role that should be granted to guest user. Currently following roles are supported:  User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest User (2af84b1e-32c8-42b7-82bc-daa82404023b).
     */
    private UUID guestUserRoleId;
    /**
     * Instantiates a new authorizationPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthorizationPolicy() {
        super();
        this.setOdataType("#microsoft.graph.authorizationPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authorizationPolicy
     */
    @javax.annotation.Nonnull
    public static AuthorizationPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthorizationPolicy();
    }
    /**
     * Gets the allowedToSignUpEmailBasedSubscriptions property value. Indicates whether users can sign up for email based subscriptions.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToSignUpEmailBasedSubscriptions() {
        return this.allowedToSignUpEmailBasedSubscriptions;
    }
    /**
     * Gets the allowedToUseSSPR property value. Indicates whether users can use the Self-Serve Password Reset feature on the tenant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToUseSSPR() {
        return this.allowedToUseSSPR;
    }
    /**
     * Gets the allowEmailVerifiedUsersToJoinOrganization property value. Indicates whether a user can join the tenant by email validation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowEmailVerifiedUsersToJoinOrganization() {
        return this.allowEmailVerifiedUsersToJoinOrganization;
    }
    /**
     * Gets the allowInvitesFrom property value. Indicates who can invite external users to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone.  everyone is the default setting for all cloud environments except US Government. For more details, see allowInvitesFrom values.
     * @return a allowInvitesFrom
     */
    @javax.annotation.Nullable
    public AllowInvitesFrom getAllowInvitesFrom() {
        return this.allowInvitesFrom;
    }
    /**
     * Gets the allowUserConsentForRiskyApps property value. Indicates whether user consent for risky apps is allowed. We recommend to keep this as false. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowUserConsentForRiskyApps() {
        return this.allowUserConsentForRiskyApps;
    }
    /**
     * Gets the blockMsolPowerShell property value. To disable the use of MSOL PowerShell, set this property to true. This also disables user-based access to the legacy service endpoint used by MSOL PowerShell. This does not affect Azure Active Directory Connect or Microsoft Graph.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockMsolPowerShell() {
        return this.blockMsolPowerShell;
    }
    /**
     * Gets the defaultUserRolePermissions property value. The defaultUserRolePermissions property
     * @return a defaultUserRolePermissions
     */
    @javax.annotation.Nullable
    public DefaultUserRolePermissions getDefaultUserRolePermissions() {
        return this.defaultUserRolePermissions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public UUID getGuestUserRoleId() {
        return this.guestUserRoleId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedToSignUpEmailBasedSubscriptions(@javax.annotation.Nullable final Boolean value) {
        this.allowedToSignUpEmailBasedSubscriptions = value;
    }
    /**
     * Sets the allowedToUseSSPR property value. Indicates whether users can use the Self-Serve Password Reset feature on the tenant.
     * @param value Value to set for the allowedToUseSSPR property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedToUseSSPR(@javax.annotation.Nullable final Boolean value) {
        this.allowedToUseSSPR = value;
    }
    /**
     * Sets the allowEmailVerifiedUsersToJoinOrganization property value. Indicates whether a user can join the tenant by email validation.
     * @param value Value to set for the allowEmailVerifiedUsersToJoinOrganization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowEmailVerifiedUsersToJoinOrganization(@javax.annotation.Nullable final Boolean value) {
        this.allowEmailVerifiedUsersToJoinOrganization = value;
    }
    /**
     * Sets the allowInvitesFrom property value. Indicates who can invite external users to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone.  everyone is the default setting for all cloud environments except US Government. For more details, see allowInvitesFrom values.
     * @param value Value to set for the allowInvitesFrom property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowInvitesFrom(@javax.annotation.Nullable final AllowInvitesFrom value) {
        this.allowInvitesFrom = value;
    }
    /**
     * Sets the allowUserConsentForRiskyApps property value. Indicates whether user consent for risky apps is allowed. We recommend to keep this as false. Default value is false.
     * @param value Value to set for the allowUserConsentForRiskyApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowUserConsentForRiskyApps(@javax.annotation.Nullable final Boolean value) {
        this.allowUserConsentForRiskyApps = value;
    }
    /**
     * Sets the blockMsolPowerShell property value. To disable the use of MSOL PowerShell, set this property to true. This also disables user-based access to the legacy service endpoint used by MSOL PowerShell. This does not affect Azure Active Directory Connect or Microsoft Graph.
     * @param value Value to set for the blockMsolPowerShell property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockMsolPowerShell(@javax.annotation.Nullable final Boolean value) {
        this.blockMsolPowerShell = value;
    }
    /**
     * Sets the defaultUserRolePermissions property value. The defaultUserRolePermissions property
     * @param value Value to set for the defaultUserRolePermissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultUserRolePermissions(@javax.annotation.Nullable final DefaultUserRolePermissions value) {
        this.defaultUserRolePermissions = value;
    }
    /**
     * Sets the guestUserRoleId property value. Represents role templateId for the role that should be granted to guest user. Currently following roles are supported:  User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest User (2af84b1e-32c8-42b7-82bc-daa82404023b).
     * @param value Value to set for the guestUserRoleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGuestUserRoleId(@javax.annotation.Nullable final UUID value) {
        this.guestUserRoleId = value;
    }
}
