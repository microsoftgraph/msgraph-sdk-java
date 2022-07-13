package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SamlOrWsFedProvider extends IdentityProviderBase implements Parsable {
    /** Issuer URI of the federation server. */
    private String _issuerUri;
    /** URI of the metadata exchange endpoint used for authentication from rich client applications. */
    private String _metadataExchangeUri;
    /** URI that web-based clients are directed to when signing in to Azure Active Directory (Azure AD) services. */
    private String _passiveSignInUri;
    /** Preferred authentication protocol. Supported values include saml or wsfed. */
    private AuthenticationProtocol _preferredAuthenticationProtocol;
    /** Current certificate used to sign tokens passed to the Microsoft identity platform. The certificate is formatted as a Base64 encoded string of the public portion of the federated IdP's token signing certificate and must be compatible with the X509Certificate2 class.   This property is used in the following scenarios:  if a rollover is required outside of the autorollover update a new federation service is being set up  if the new token signing certificate isn't present in the federation properties after the federation service certificate has been updated.   Azure AD updates certificates via an autorollover process in which it attempts to retrieve a new certificate from the federation service metadata, 30 days before expiry of the current certificate. If a new certificate isn't available, Azure AD monitors the metadata daily and will update the federation settings for the domain when a new certificate is available. */
    private String _signingCertificate;
    /**
     * Instantiates a new SamlOrWsFedProvider and sets the default values.
     * @return a void
     */
    public SamlOrWsFedProvider() {
        super();
        this.setType("#microsoft.graph.samlOrWsFedProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SamlOrWsFedProvider
     */
    @javax.annotation.Nonnull
    public static SamlOrWsFedProvider createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.internalDomainFederation": return new InternalDomainFederation();
                case "#microsoft.graph.samlOrWsFedExternalDomainFederation": return new SamlOrWsFedExternalDomainFederation();
            }
        }
        return new SamlOrWsFedProvider();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SamlOrWsFedProvider currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("issuerUri", (n) -> { currentObject.setIssuerUri(n.getStringValue()); });
            this.put("metadataExchangeUri", (n) -> { currentObject.setMetadataExchangeUri(n.getStringValue()); });
            this.put("passiveSignInUri", (n) -> { currentObject.setPassiveSignInUri(n.getStringValue()); });
            this.put("preferredAuthenticationProtocol", (n) -> { currentObject.setPreferredAuthenticationProtocol(n.getEnumValue(AuthenticationProtocol.class)); });
            this.put("signingCertificate", (n) -> { currentObject.setSigningCertificate(n.getStringValue()); });
        }};
    }
    /**
     * Gets the issuerUri property value. Issuer URI of the federation server.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssuerUri() {
        return this._issuerUri;
    }
    /**
     * Gets the metadataExchangeUri property value. URI of the metadata exchange endpoint used for authentication from rich client applications.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMetadataExchangeUri() {
        return this._metadataExchangeUri;
    }
    /**
     * Gets the passiveSignInUri property value. URI that web-based clients are directed to when signing in to Azure Active Directory (Azure AD) services.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPassiveSignInUri() {
        return this._passiveSignInUri;
    }
    /**
     * Gets the preferredAuthenticationProtocol property value. Preferred authentication protocol. Supported values include saml or wsfed.
     * @return a authenticationProtocol
     */
    @javax.annotation.Nullable
    public AuthenticationProtocol getPreferredAuthenticationProtocol() {
        return this._preferredAuthenticationProtocol;
    }
    /**
     * Gets the signingCertificate property value. Current certificate used to sign tokens passed to the Microsoft identity platform. The certificate is formatted as a Base64 encoded string of the public portion of the federated IdP's token signing certificate and must be compatible with the X509Certificate2 class.   This property is used in the following scenarios:  if a rollover is required outside of the autorollover update a new federation service is being set up  if the new token signing certificate isn't present in the federation properties after the federation service certificate has been updated.   Azure AD updates certificates via an autorollover process in which it attempts to retrieve a new certificate from the federation service metadata, 30 days before expiry of the current certificate. If a new certificate isn't available, Azure AD monitors the metadata daily and will update the federation settings for the domain when a new certificate is available.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSigningCertificate() {
        return this._signingCertificate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("issuerUri", this.getIssuerUri());
        writer.writeStringValue("metadataExchangeUri", this.getMetadataExchangeUri());
        writer.writeStringValue("passiveSignInUri", this.getPassiveSignInUri());
        writer.writeEnumValue("preferredAuthenticationProtocol", this.getPreferredAuthenticationProtocol());
        writer.writeStringValue("signingCertificate", this.getSigningCertificate());
    }
    /**
     * Sets the issuerUri property value. Issuer URI of the federation server.
     * @param value Value to set for the issuerUri property.
     * @return a void
     */
    public void setIssuerUri(@javax.annotation.Nullable final String value) {
        this._issuerUri = value;
    }
    /**
     * Sets the metadataExchangeUri property value. URI of the metadata exchange endpoint used for authentication from rich client applications.
     * @param value Value to set for the metadataExchangeUri property.
     * @return a void
     */
    public void setMetadataExchangeUri(@javax.annotation.Nullable final String value) {
        this._metadataExchangeUri = value;
    }
    /**
     * Sets the passiveSignInUri property value. URI that web-based clients are directed to when signing in to Azure Active Directory (Azure AD) services.
     * @param value Value to set for the passiveSignInUri property.
     * @return a void
     */
    public void setPassiveSignInUri(@javax.annotation.Nullable final String value) {
        this._passiveSignInUri = value;
    }
    /**
     * Sets the preferredAuthenticationProtocol property value. Preferred authentication protocol. Supported values include saml or wsfed.
     * @param value Value to set for the preferredAuthenticationProtocol property.
     * @return a void
     */
    public void setPreferredAuthenticationProtocol(@javax.annotation.Nullable final AuthenticationProtocol value) {
        this._preferredAuthenticationProtocol = value;
    }
    /**
     * Sets the signingCertificate property value. Current certificate used to sign tokens passed to the Microsoft identity platform. The certificate is formatted as a Base64 encoded string of the public portion of the federated IdP's token signing certificate and must be compatible with the X509Certificate2 class.   This property is used in the following scenarios:  if a rollover is required outside of the autorollover update a new federation service is being set up  if the new token signing certificate isn't present in the federation properties after the federation service certificate has been updated.   Azure AD updates certificates via an autorollover process in which it attempts to retrieve a new certificate from the federation service metadata, 30 days before expiry of the current certificate. If a new certificate isn't available, Azure AD monitors the metadata daily and will update the federation settings for the domain when a new certificate is available.
     * @param value Value to set for the signingCertificate property.
     * @return a void
     */
    public void setSigningCertificate(@javax.annotation.Nullable final String value) {
        this._signingCertificate = value;
    }
}
