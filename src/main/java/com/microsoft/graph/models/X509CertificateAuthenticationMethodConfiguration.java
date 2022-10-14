package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class X509CertificateAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /** The authenticationModeConfiguration property */
    private X509CertificateAuthenticationModeConfiguration _authenticationModeConfiguration;
    /** The certificateUserBindings property */
    private java.util.List<X509CertificateUserBinding> _certificateUserBindings;
    /** The includeTargets property */
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
     * Gets the authenticationModeConfiguration property value. The authenticationModeConfiguration property
     * @return a x509CertificateAuthenticationModeConfiguration
     */
    @javax.annotation.Nullable
    public X509CertificateAuthenticationModeConfiguration getAuthenticationModeConfiguration() {
        return this._authenticationModeConfiguration;
    }
    /**
     * Gets the certificateUserBindings property value. The certificateUserBindings property
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
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("authenticationModeConfiguration", (n) -> { currentObject.setAuthenticationModeConfiguration(n.getObjectValue(X509CertificateAuthenticationModeConfiguration::createFromDiscriminatorValue)); });
            this.put("certificateUserBindings", (n) -> { currentObject.setCertificateUserBindings(n.getCollectionOfObjectValues(X509CertificateUserBinding::createFromDiscriminatorValue)); });
            this.put("includeTargets", (n) -> { currentObject.setIncludeTargets(n.getCollectionOfObjectValues(AuthenticationMethodTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the includeTargets property value. The includeTargets property
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
     * Sets the authenticationModeConfiguration property value. The authenticationModeConfiguration property
     * @param value Value to set for the authenticationModeConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationModeConfiguration(@javax.annotation.Nullable final X509CertificateAuthenticationModeConfiguration value) {
        this._authenticationModeConfiguration = value;
    }
    /**
     * Sets the certificateUserBindings property value. The certificateUserBindings property
     * @param value Value to set for the certificateUserBindings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateUserBindings(@javax.annotation.Nullable final java.util.List<X509CertificateUserBinding> value) {
        this._certificateUserBindings = value;
    }
    /**
     * Sets the includeTargets property value. The includeTargets property
     * @param value Value to set for the includeTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeTargets(@javax.annotation.Nullable final java.util.List<AuthenticationMethodTarget> value) {
        this._includeTargets = value;
    }
}
