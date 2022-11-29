package com.microsoft.graph.models;

import com.microsoft.graph.models.EmailAuthenticationMethodConfiguration;
import com.microsoft.graph.models.Fido2AuthenticationMethodConfiguration;
import com.microsoft.graph.models.MicrosoftAuthenticatorAuthenticationMethodConfiguration;
import com.microsoft.graph.models.TemporaryAccessPassAuthenticationMethodConfiguration;
import com.microsoft.graph.models.X509CertificateAuthenticationMethodConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of authenticationMethodConfiguration entities. */
public class AuthenticationMethodConfiguration extends Entity implements Parsable {
    /** The state of the policy. Possible values are: enabled, disabled. */
    private AuthenticationMethodState _state;
    /**
     * Instantiates a new authenticationMethodConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationMethodConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationMethodConfiguration
     */
    @javax.annotation.Nonnull
    public static AuthenticationMethodConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.emailAuthenticationMethodConfiguration": return new EmailAuthenticationMethodConfiguration();
                case "#microsoft.graph.fido2AuthenticationMethodConfiguration": return new Fido2AuthenticationMethodConfiguration();
                case "#microsoft.graph.microsoftAuthenticatorAuthenticationMethodConfiguration": return new MicrosoftAuthenticatorAuthenticationMethodConfiguration();
                case "#microsoft.graph.temporaryAccessPassAuthenticationMethodConfiguration": return new TemporaryAccessPassAuthenticationMethodConfiguration();
                case "#microsoft.graph.x509CertificateAuthenticationMethodConfiguration": return new X509CertificateAuthenticationMethodConfiguration();
            }
        }
        return new AuthenticationMethodConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthenticationMethodConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(AuthenticationMethodState.class)); });
        }};
    }
    /**
     * Gets the state property value. The state of the policy. Possible values are: enabled, disabled.
     * @return a authenticationMethodState
     */
    @javax.annotation.Nullable
    public AuthenticationMethodState getState() {
        return this._state;
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
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the state property value. The state of the policy. Possible values are: enabled, disabled.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final AuthenticationMethodState value) {
        this._state = value;
    }
}
