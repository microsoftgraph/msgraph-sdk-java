package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegistrationEnforcement implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Run campaigns to remind users to setup targeted authentication methods.  */
    private AuthenticationMethodsRegistrationCampaign _authenticationMethodsRegistrationCampaign;
    /**
     * Instantiates a new registrationEnforcement and sets the default values.
     * @return a void
     */
    public RegistrationEnforcement() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a registrationEnforcement
     */
    @javax.annotation.Nonnull
    public static RegistrationEnforcement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegistrationEnforcement();
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
     * Gets the authenticationMethodsRegistrationCampaign property value. Run campaigns to remind users to setup targeted authentication methods.
     * @return a authenticationMethodsRegistrationCampaign
     */
    @javax.annotation.Nullable
    public AuthenticationMethodsRegistrationCampaign getAuthenticationMethodsRegistrationCampaign() {
        return this._authenticationMethodsRegistrationCampaign;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RegistrationEnforcement currentObject = this;
        return new HashMap<>(1) {{
            this.put("authenticationMethodsRegistrationCampaign", (n) -> { currentObject.setAuthenticationMethodsRegistrationCampaign(n.getObjectValue(AuthenticationMethodsRegistrationCampaign::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authenticationMethodsRegistrationCampaign", this.getAuthenticationMethodsRegistrationCampaign());
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
     * Sets the authenticationMethodsRegistrationCampaign property value. Run campaigns to remind users to setup targeted authentication methods.
     * @param value Value to set for the authenticationMethodsRegistrationCampaign property.
     * @return a void
     */
    public void setAuthenticationMethodsRegistrationCampaign(@javax.annotation.Nullable final AuthenticationMethodsRegistrationCampaign value) {
        this._authenticationMethodsRegistrationCampaign = value;
    }
}
