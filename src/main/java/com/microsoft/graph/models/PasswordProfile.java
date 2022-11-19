package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PasswordProfile implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** true if the user must change her password on the next login; otherwise false. If not set, default is false. NOTE:  For Azure B2C tenants, set to false and instead use custom policies and user flows to force password reset at first sign in. See Force password reset at first logon. */
    private Boolean _forceChangePasswordNextSignIn;
    /** If true, at next sign-in, the user must perform a multi-factor authentication (MFA) before being forced to change their password. The behavior is identical to forceChangePasswordNextSignIn except that the user is required to first perform a multi-factor authentication before password change. After a password change, this property will be automatically reset to false. If not set, default is false. */
    private Boolean _forceChangePasswordNextSignInWithMfa;
    /** The OdataType property */
    private String _odataType;
    /** The password for the user. This property is required when a user is created. It can be updated, but the user will be required to change the password on the next login. The password must satisfy minimum requirements as specified by the users passwordPolicies property. By default, a strong password is required. */
    private String _password;
    /**
     * Instantiates a new passwordProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PasswordProfile() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.passwordProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a passwordProfile
     */
    @javax.annotation.Nonnull
    public static PasswordProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasswordProfile();
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
        final PasswordProfile currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("forceChangePasswordNextSignIn", (n) -> { currentObject.setForceChangePasswordNextSignIn(n.getBooleanValue()); });
        deserializerMap.put("forceChangePasswordNextSignInWithMfa", (n) -> { currentObject.setForceChangePasswordNextSignInWithMfa(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("password", (n) -> { currentObject.setPassword(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the forceChangePasswordNextSignIn property value. true if the user must change her password on the next login; otherwise false. If not set, default is false. NOTE:  For Azure B2C tenants, set to false and instead use custom policies and user flows to force password reset at first sign in. See Force password reset at first logon.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getForceChangePasswordNextSignIn() {
        return this._forceChangePasswordNextSignIn;
    }
    /**
     * Gets the forceChangePasswordNextSignInWithMfa property value. If true, at next sign-in, the user must perform a multi-factor authentication (MFA) before being forced to change their password. The behavior is identical to forceChangePasswordNextSignIn except that the user is required to first perform a multi-factor authentication before password change. After a password change, this property will be automatically reset to false. If not set, default is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getForceChangePasswordNextSignInWithMfa() {
        return this._forceChangePasswordNextSignInWithMfa;
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
     * Gets the password property value. The password for the user. This property is required when a user is created. It can be updated, but the user will be required to change the password on the next login. The password must satisfy minimum requirements as specified by the users passwordPolicies property. By default, a strong password is required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPassword() {
        return this._password;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("forceChangePasswordNextSignIn", this.getForceChangePasswordNextSignIn());
        writer.writeBooleanValue("forceChangePasswordNextSignInWithMfa", this.getForceChangePasswordNextSignInWithMfa());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("password", this.getPassword());
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
     * Sets the forceChangePasswordNextSignIn property value. true if the user must change her password on the next login; otherwise false. If not set, default is false. NOTE:  For Azure B2C tenants, set to false and instead use custom policies and user flows to force password reset at first sign in. See Force password reset at first logon.
     * @param value Value to set for the forceChangePasswordNextSignIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setForceChangePasswordNextSignIn(@javax.annotation.Nullable final Boolean value) {
        this._forceChangePasswordNextSignIn = value;
    }
    /**
     * Sets the forceChangePasswordNextSignInWithMfa property value. If true, at next sign-in, the user must perform a multi-factor authentication (MFA) before being forced to change their password. The behavior is identical to forceChangePasswordNextSignIn except that the user is required to first perform a multi-factor authentication before password change. After a password change, this property will be automatically reset to false. If not set, default is false.
     * @param value Value to set for the forceChangePasswordNextSignInWithMfa property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setForceChangePasswordNextSignInWithMfa(@javax.annotation.Nullable final Boolean value) {
        this._forceChangePasswordNextSignInWithMfa = value;
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
    /**
     * Sets the password property value. The password for the user. This property is required when a user is created. It can be updated, but the user will be required to change the password on the next login. The password must satisfy minimum requirements as specified by the users passwordPolicies property. By default, a strong password is required.
     * @param value Value to set for the password property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPassword(@javax.annotation.Nullable final String value) {
        this._password = value;
    }
}
