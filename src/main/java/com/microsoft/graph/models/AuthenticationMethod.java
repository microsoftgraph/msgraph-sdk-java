package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationMethod extends Entity implements Parsable {
    /**
     * Instantiates a new authenticationMethod and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationMethod() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationMethod
     */
    @javax.annotation.Nonnull
    public static AuthenticationMethod createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.emailAuthenticationMethod": return new EmailAuthenticationMethod();
                case "#microsoft.graph.fido2AuthenticationMethod": return new Fido2AuthenticationMethod();
                case "#microsoft.graph.microsoftAuthenticatorAuthenticationMethod": return new MicrosoftAuthenticatorAuthenticationMethod();
                case "#microsoft.graph.passwordAuthenticationMethod": return new PasswordAuthenticationMethod();
                case "#microsoft.graph.phoneAuthenticationMethod": return new PhoneAuthenticationMethod();
                case "#microsoft.graph.softwareOathAuthenticationMethod": return new SoftwareOathAuthenticationMethod();
                case "#microsoft.graph.temporaryAccessPassAuthenticationMethod": return new TemporaryAccessPassAuthenticationMethod();
                case "#microsoft.graph.windowsHelloForBusinessAuthenticationMethod": return new WindowsHelloForBusinessAuthenticationMethod();
            }
        }
        return new AuthenticationMethod();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
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
    }
}
