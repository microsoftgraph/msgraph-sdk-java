package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthorizationPolicy extends PolicyBase implements Parsable {
    /** Indicates whether users can sign up for email based subscriptions. */
    private Boolean _allowedToSignUpEmailBasedSubscriptions;
    /** Indicates whether the Self-Serve Password Reset feature can be used by users on the tenant. */
    private Boolean _allowedToUseSSPR;
    /** Indicates whether a user can join the tenant by email validation. */
    private Boolean _allowEmailVerifiedUsersToJoinOrganization;
    /** Indicates who can invite external users to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone.  everyone is the default setting for all cloud environments except US Government. See more in the table below. */
    private AllowInvitesFrom _allowInvitesFrom;
    /** To disable the use of MSOL PowerShell set this property to true. This will also disable user-based access to the legacy service endpoint used by MSOL PowerShell. This does not affect Azure AD Connect or Microsoft Graph. */
    private Boolean _blockMsolPowerShell;
    /** The defaultUserRolePermissions property */
    private DefaultUserRolePermissions _defaultUserRolePermissions;
    /** Represents role templateId for the role that should be granted to guest user. Currently following roles are supported:  User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest User (2af84b1e-32c8-42b7-82bc-daa82404023b). */
    private String _guestUserRoleId;
    /**
     * Instantiates a new AuthorizationPolicy and sets the default values.
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
     * @return a AuthorizationPolicy
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
        return this._allowedToSignUpEmailBasedSubscriptions;
    }
    /**
     * Gets the allowedToUseSSPR property value. Indicates whether the Self-Serve Password Reset feature can be used by users on the tenant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToUseSSPR() {
        return this._allowedToUseSSPR;
    }
    /**
     * Gets the allowEmailVerifiedUsersToJoinOrganization property value. Indicates whether a user can join the tenant by email validation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowEmailVerifiedUsersToJoinOrganization() {
        return this._allowEmailVerifiedUsersToJoinOrganization;
    }
    /**
     * Gets the allowInvitesFrom property value. Indicates who can invite external users to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone.  everyone is the default setting for all cloud environments except US Government. See more in the table below.
     * @return a allowInvitesFrom
     */
    @javax.annotation.Nullable
    public AllowInvitesFrom getAllowInvitesFrom() {
        return this._allowInvitesFrom;
    }
    /**
     * Gets the blockMsolPowerShell property value. To disable the use of MSOL PowerShell set this property to true. This will also disable user-based access to the legacy service endpoint used by MSOL PowerShell. This does not affect Azure AD Connect or Microsoft Graph.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockMsolPowerShell() {
        return this._blockMsolPowerShell;
    }
    /**
     * Gets the defaultUserRolePermissions property value. The defaultUserRolePermissions property
     * @return a defaultUserRolePermissions
     */
    @javax.annotation.Nullable
    public DefaultUserRolePermissions getDefaultUserRolePermissions() {
        return this._defaultUserRolePermissions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthorizationPolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allowedToSignUpEmailBasedSubscriptions", (n) -> { currentObject.setAllowedToSignUpEmailBasedSubscriptions(n.getBooleanValue()); });
            this.put("allowedToUseSSPR", (n) -> { currentObject.setAllowedToUseSSPR(n.getBooleanValue()); });
            this.put("allowEmailVerifiedUsersToJoinOrganization", (n) -> { currentObject.setAllowEmailVerifiedUsersToJoinOrganization(n.getBooleanValue()); });
            this.put("allowInvitesFrom", (n) -> { currentObject.setAllowInvitesFrom(n.getEnumValue(AllowInvitesFrom.class)); });
            this.put("blockMsolPowerShell", (n) -> { currentObject.setBlockMsolPowerShell(n.getBooleanValue()); });
            this.put("defaultUserRolePermissions", (n) -> { currentObject.setDefaultUserRolePermissions(n.getObjectValue(DefaultUserRolePermissions::createFromDiscriminatorValue)); });
            this.put("guestUserRoleId", (n) -> { currentObject.setGuestUserRoleId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the guestUserRoleId property value. Represents role templateId for the role that should be granted to guest user. Currently following roles are supported:  User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest User (2af84b1e-32c8-42b7-82bc-daa82404023b).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGuestUserRoleId() {
        return this._guestUserRoleId;
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
        writer.writeBooleanValue("blockMsolPowerShell", this.getBlockMsolPowerShell());
        writer.writeObjectValue("defaultUserRolePermissions", this.getDefaultUserRolePermissions());
        writer.writeStringValue("guestUserRoleId", this.getGuestUserRoleId());
    }
    /**
     * Sets the allowedToSignUpEmailBasedSubscriptions property value. Indicates whether users can sign up for email based subscriptions.
     * @param value Value to set for the allowedToSignUpEmailBasedSubscriptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedToSignUpEmailBasedSubscriptions(@javax.annotation.Nullable final Boolean value) {
        this._allowedToSignUpEmailBasedSubscriptions = value;
    }
    /**
     * Sets the allowedToUseSSPR property value. Indicates whether the Self-Serve Password Reset feature can be used by users on the tenant.
     * @param value Value to set for the allowedToUseSSPR property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedToUseSSPR(@javax.annotation.Nullable final Boolean value) {
        this._allowedToUseSSPR = value;
    }
    /**
     * Sets the allowEmailVerifiedUsersToJoinOrganization property value. Indicates whether a user can join the tenant by email validation.
     * @param value Value to set for the allowEmailVerifiedUsersToJoinOrganization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowEmailVerifiedUsersToJoinOrganization(@javax.annotation.Nullable final Boolean value) {
        this._allowEmailVerifiedUsersToJoinOrganization = value;
    }
    /**
     * Sets the allowInvitesFrom property value. Indicates who can invite external users to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone.  everyone is the default setting for all cloud environments except US Government. See more in the table below.
     * @param value Value to set for the allowInvitesFrom property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowInvitesFrom(@javax.annotation.Nullable final AllowInvitesFrom value) {
        this._allowInvitesFrom = value;
    }
    /**
     * Sets the blockMsolPowerShell property value. To disable the use of MSOL PowerShell set this property to true. This will also disable user-based access to the legacy service endpoint used by MSOL PowerShell. This does not affect Azure AD Connect or Microsoft Graph.
     * @param value Value to set for the blockMsolPowerShell property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockMsolPowerShell(@javax.annotation.Nullable final Boolean value) {
        this._blockMsolPowerShell = value;
    }
    /**
     * Sets the defaultUserRolePermissions property value. The defaultUserRolePermissions property
     * @param value Value to set for the defaultUserRolePermissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultUserRolePermissions(@javax.annotation.Nullable final DefaultUserRolePermissions value) {
        this._defaultUserRolePermissions = value;
    }
    /**
     * Sets the guestUserRoleId property value. Represents role templateId for the role that should be granted to guest user. Currently following roles are supported:  User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest User (2af84b1e-32c8-42b7-82bc-daa82404023b).
     * @param value Value to set for the guestUserRoleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGuestUserRoleId(@javax.annotation.Nullable final String value) {
        this._guestUserRoleId = value;
    }
}
