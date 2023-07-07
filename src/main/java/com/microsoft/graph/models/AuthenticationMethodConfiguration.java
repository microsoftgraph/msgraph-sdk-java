package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationMethodConfiguration extends Entity implements Parsable {
    /**
     * Groups of users that are excluded from a policy.
     */
    private java.util.List<ExcludeTarget> excludeTargets;
    /**
     * The state of the policy. Possible values are: enabled, disabled.
     */
    private AuthenticationMethodState state;
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
                case "#microsoft.graph.smsAuthenticationMethodConfiguration": return new SmsAuthenticationMethodConfiguration();
                case "#microsoft.graph.softwareOathAuthenticationMethodConfiguration": return new SoftwareOathAuthenticationMethodConfiguration();
                case "#microsoft.graph.temporaryAccessPassAuthenticationMethodConfiguration": return new TemporaryAccessPassAuthenticationMethodConfiguration();
                case "#microsoft.graph.voiceAuthenticationMethodConfiguration": return new VoiceAuthenticationMethodConfiguration();
                case "#microsoft.graph.x509CertificateAuthenticationMethodConfiguration": return new X509CertificateAuthenticationMethodConfiguration();
            }
        }
        return new AuthenticationMethodConfiguration();
    }
    /**
     * Gets the excludeTargets property value. Groups of users that are excluded from a policy.
     * @return a excludeTarget
     */
    @javax.annotation.Nullable
    public java.util.List<ExcludeTarget> getExcludeTargets() {
        return this.excludeTargets;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("excludeTargets", (n) -> { this.setExcludeTargets(n.getCollectionOfObjectValues(ExcludeTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AuthenticationMethodState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the state property value. The state of the policy. Possible values are: enabled, disabled.
     * @return a authenticationMethodState
     */
    @javax.annotation.Nullable
    public AuthenticationMethodState getState() {
        return this.state;
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
        writer.writeCollectionOfObjectValues("excludeTargets", this.getExcludeTargets());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the excludeTargets property value. Groups of users that are excluded from a policy.
     * @param value Value to set for the excludeTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeTargets(@javax.annotation.Nullable final java.util.List<ExcludeTarget> value) {
        this.excludeTargets = value;
    }
    /**
     * Sets the state property value. The state of the policy. Possible values are: enabled, disabled.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final AuthenticationMethodState value) {
        this.state = value;
    }
}
