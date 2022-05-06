package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the authenticationMethodsPolicy singleton.  */
public class AuthenticationMethodsPolicy extends Entity implements Parsable {
    /** Represents the settings for each authentication method. Automatically expanded on GET /policies/authenticationMethodsPolicy.  */
    private java.util.List<AuthenticationMethodConfiguration> _authenticationMethodConfigurations;
    /** A description of the policy.  */
    private String _description;
    /** The name of the policy.  */
    private String _displayName;
    /** The date and time of the last update to the policy.  */
    private OffsetDateTime _lastModifiedDateTime;
    /** The version of the policy in use.  */
    private String _policyVersion;
    /** The reconfirmationInDays property  */
    private Integer _reconfirmationInDays;
    /** Enforce registration at sign-in time. This property can be used to remind users to set up targeted authentication methods.  */
    private RegistrationEnforcement _registrationEnforcement;
    /**
     * Instantiates a new authenticationMethodsPolicy and sets the default values.
     * @return a void
     */
    public AuthenticationMethodsPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationMethodsPolicy
     */
    @javax.annotation.Nonnull
    public static AuthenticationMethodsPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationMethodsPolicy();
    }
    /**
     * Gets the authenticationMethodConfigurations property value. Represents the settings for each authentication method. Automatically expanded on GET /policies/authenticationMethodsPolicy.
     * @return a authenticationMethodConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodConfiguration> getAuthenticationMethodConfigurations() {
        return this._authenticationMethodConfigurations;
    }
    /**
     * Gets the description property value. A description of the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name of the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthenticationMethodsPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authenticationMethodConfigurations", (n) -> { currentObject.setAuthenticationMethodConfigurations(n.getCollectionOfObjectValues(AuthenticationMethodConfiguration::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("policyVersion", (n) -> { currentObject.setPolicyVersion(n.getStringValue()); });
            this.put("reconfirmationInDays", (n) -> { currentObject.setReconfirmationInDays(n.getIntegerValue()); });
            this.put("registrationEnforcement", (n) -> { currentObject.setRegistrationEnforcement(n.getObjectValue(RegistrationEnforcement::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time of the last update to the policy.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the policyVersion property value. The version of the policy in use.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyVersion() {
        return this._policyVersion;
    }
    /**
     * Gets the reconfirmationInDays property value. The reconfirmationInDays property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReconfirmationInDays() {
        return this._reconfirmationInDays;
    }
    /**
     * Gets the registrationEnforcement property value. Enforce registration at sign-in time. This property can be used to remind users to set up targeted authentication methods.
     * @return a registrationEnforcement
     */
    @javax.annotation.Nullable
    public RegistrationEnforcement getRegistrationEnforcement() {
        return this._registrationEnforcement;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("authenticationMethodConfigurations", this.getAuthenticationMethodConfigurations());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("policyVersion", this.getPolicyVersion());
        writer.writeIntegerValue("reconfirmationInDays", this.getReconfirmationInDays());
        writer.writeObjectValue("registrationEnforcement", this.getRegistrationEnforcement());
    }
    /**
     * Sets the authenticationMethodConfigurations property value. Represents the settings for each authentication method. Automatically expanded on GET /policies/authenticationMethodsPolicy.
     * @param value Value to set for the authenticationMethodConfigurations property.
     * @return a void
     */
    public void setAuthenticationMethodConfigurations(@javax.annotation.Nullable final java.util.List<AuthenticationMethodConfiguration> value) {
        this._authenticationMethodConfigurations = value;
    }
    /**
     * Sets the description property value. A description of the policy.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name of the policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time of the last update to the policy.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the policyVersion property value. The version of the policy in use.
     * @param value Value to set for the policyVersion property.
     * @return a void
     */
    public void setPolicyVersion(@javax.annotation.Nullable final String value) {
        this._policyVersion = value;
    }
    /**
     * Sets the reconfirmationInDays property value. The reconfirmationInDays property
     * @param value Value to set for the reconfirmationInDays property.
     * @return a void
     */
    public void setReconfirmationInDays(@javax.annotation.Nullable final Integer value) {
        this._reconfirmationInDays = value;
    }
    /**
     * Sets the registrationEnforcement property value. Enforce registration at sign-in time. This property can be used to remind users to set up targeted authentication methods.
     * @param value Value to set for the registrationEnforcement property.
     * @return a void
     */
    public void setRegistrationEnforcement(@javax.annotation.Nullable final RegistrationEnforcement value) {
        this._registrationEnforcement = value;
    }
}
