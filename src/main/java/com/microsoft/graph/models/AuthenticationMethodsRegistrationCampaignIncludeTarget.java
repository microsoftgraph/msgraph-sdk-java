package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationMethodsRegistrationCampaignIncludeTarget implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The object identifier of an Azure AD user or group. */
    private String _id;
    /** The authentication method that the user is prompted to register. The value must be microsoftAuthenticator. */
    private String _targetedAuthenticationMethod;
    /** The type of the authentication method target. Possible values are: user, group, unknownFutureValue. */
    private AuthenticationMethodTargetType _targetType;
    /**
     * Instantiates a new authenticationMethodsRegistrationCampaignIncludeTarget and sets the default values.
     * @return a void
     */
    public AuthenticationMethodsRegistrationCampaignIncludeTarget() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationMethodsRegistrationCampaignIncludeTarget
     */
    @javax.annotation.Nonnull
    public static AuthenticationMethodsRegistrationCampaignIncludeTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationMethodsRegistrationCampaignIncludeTarget();
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
        final AuthenticationMethodsRegistrationCampaignIncludeTarget currentObject = this;
        return new HashMap<>(3) {{
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("targetedAuthenticationMethod", (n) -> { currentObject.setTargetedAuthenticationMethod(n.getStringValue()); });
            this.put("targetType", (n) -> { currentObject.setTargetType(n.getEnumValue(AuthenticationMethodTargetType.class)); });
        }};
    }
    /**
     * Gets the id property value. The object identifier of an Azure AD user or group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the targetedAuthenticationMethod property value. The authentication method that the user is prompted to register. The value must be microsoftAuthenticator.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetedAuthenticationMethod() {
        return this._targetedAuthenticationMethod;
    }
    /**
     * Gets the targetType property value. The type of the authentication method target. Possible values are: user, group, unknownFutureValue.
     * @return a authenticationMethodTargetType
     */
    @javax.annotation.Nullable
    public AuthenticationMethodTargetType getTargetType() {
        return this._targetType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("targetedAuthenticationMethod", this.getTargetedAuthenticationMethod());
        writer.writeEnumValue("targetType", this.getTargetType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the id property value. The object identifier of an Azure AD user or group.
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the targetedAuthenticationMethod property value. The authentication method that the user is prompted to register. The value must be microsoftAuthenticator.
     * @param value Value to set for the targetedAuthenticationMethod property.
     * @return a void
     */
    public void setTargetedAuthenticationMethod(@javax.annotation.Nullable final String value) {
        this._targetedAuthenticationMethod = value;
    }
    /**
     * Sets the targetType property value. The type of the authentication method target. Possible values are: user, group, unknownFutureValue.
     * @param value Value to set for the targetType property.
     * @return a void
     */
    public void setTargetType(@javax.annotation.Nullable final AuthenticationMethodTargetType value) {
        this._targetType = value;
    }
}
