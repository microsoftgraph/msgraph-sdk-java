package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class X509CertificateAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /** Defines strong authentication configurations. This configuration includes the default authentication mode and the different rules for strong authentication bindings. */
    private X509CertificateAuthenticationModeConfiguration _authenticationModeConfiguration;
    /** Defines fields in the X.509 certificate that map to attributes of the Azure AD user object in order to bind the certificate to the user. The priority of the object determines the order in which the binding is carried out. The first binding that matches will be used and the rest ignored. */
    private java.util.List<X509CertificateUserBinding> _certificateUserBindings;
    /** A collection of users or groups who are enabled to use the authentication method. */
    private java.util.List<AuthenticationMethodTarget> _includeTargets;
    /**
     * Instantiates a new X509CertificateAuthenticationMethodConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public X509CertificateAuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.x509CertificateAuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a X509CertificateAuthenticationMethodConfiguration
     */
    @javax.annotation.Nonnull
    public static X509CertificateAuthenticationMethodConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new X509CertificateAuthenticationMethodConfiguration();
    }
    /**
     * Gets the authenticationModeConfiguration property value. Defines strong authentication configurations. This configuration includes the default authentication mode and the different rules for strong authentication bindings.
     * @return a x509CertificateAuthenticationModeConfiguration
     */
    @javax.annotation.Nullable
    public X509CertificateAuthenticationModeConfiguration getAuthenticationModeConfiguration() {
        return this._authenticationModeConfiguration;
    }
    /**
     * Gets the certificateUserBindings property value. Defines fields in the X.509 certificate that map to attributes of the Azure AD user object in order to bind the certificate to the user. The priority of the object determines the order in which the binding is carried out. The first binding that matches will be used and the rest ignored.
     * @return a x509CertificateUserBinding
     */
    @javax.annotation.Nullable
    public java.util.List<X509CertificateUserBinding> getCertificateUserBindings() {
        return this._certificateUserBindings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final X509CertificateAuthenticationMethodConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationModeConfiguration", (n) -> { currentObject.setAuthenticationModeConfiguration(n.getObjectValue(X509CertificateAuthenticationModeConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("certificateUserBindings", (n) -> { currentObject.setCertificateUserBindings(n.getCollectionOfObjectValues(X509CertificateUserBinding::createFromDiscriminatorValue)); });
        deserializerMap.put("includeTargets", (n) -> { currentObject.setIncludeTargets(n.getCollectionOfObjectValues(AuthenticationMethodTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. A collection of users or groups who are enabled to use the authentication method.
     * @return a authenticationMethodTarget
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodTarget> getIncludeTargets() {
        return this._includeTargets;
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
        writer.writeObjectValue("authenticationModeConfiguration", this.getAuthenticationModeConfiguration());
        writer.writeCollectionOfObjectValues("certificateUserBindings", this.getCertificateUserBindings());
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
    }
    /**
     * Sets the authenticationModeConfiguration property value. Defines strong authentication configurations. This configuration includes the default authentication mode and the different rules for strong authentication bindings.
     * @param value Value to set for the authenticationModeConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationModeConfiguration(@javax.annotation.Nullable final X509CertificateAuthenticationModeConfiguration value) {
        this._authenticationModeConfiguration = value;
    }
    /**
     * Sets the certificateUserBindings property value. Defines fields in the X.509 certificate that map to attributes of the Azure AD user object in order to bind the certificate to the user. The priority of the object determines the order in which the binding is carried out. The first binding that matches will be used and the rest ignored.
     * @param value Value to set for the certificateUserBindings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateUserBindings(@javax.annotation.Nullable final java.util.List<X509CertificateUserBinding> value) {
        this._certificateUserBindings = value;
    }
    /**
     * Sets the includeTargets property value. A collection of users or groups who are enabled to use the authentication method.
     * @param value Value to set for the includeTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeTargets(@javax.annotation.Nullable final java.util.List<AuthenticationMethodTarget> value) {
        this._includeTargets = value;
    }
}
