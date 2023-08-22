package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SamlOrWsFedProvider extends IdentityProviderBase implements Parsable {
    /**
     * Issuer URI of the federation server.
     */
    private String issuerUri;
    /**
     * URI of the metadata exchange endpoint used for authentication from rich client applications.
     */
    private String metadataExchangeUri;
    /**
     * URI that web-based clients are directed to when signing in to Azure Active Directory (Azure AD) services.
     */
    private String passiveSignInUri;
    /**
     * Preferred authentication protocol. The possible values are: wsFed, saml, unknownFutureValue.
     */
    private AuthenticationProtocol preferredAuthenticationProtocol;
    /**
     * Current certificate used to sign tokens passed to the Microsoft identity platform. The certificate is formatted as a Base64 encoded string of the public portion of the federated IdP's token signing certificate and must be compatible with the X509Certificate2 class.   This property is used in the following scenarios:  if a rollover is required outside of the autorollover update a new federation service is being set up  if the new token signing certificate isn't present in the federation properties after the federation service certificate has been updated.   Azure AD updates certificates via an autorollover process in which it attempts to retrieve a new certificate from the federation service metadata, 30 days before expiry of the current certificate. If a new certificate isn't available, Azure AD monitors the metadata daily and will update the federation settings for the domain when a new certificate is available.
     */
    private String signingCertificate;
    /**
     * Instantiates a new samlOrWsFedProvider and sets the default values.
     */
    public SamlOrWsFedProvider() {
        super();
        this.setOdataType("#microsoft.graph.samlOrWsFedProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a samlOrWsFedProvider
     */
    @jakarta.annotation.Nonnull
    public static SamlOrWsFedProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("issuerUri", (n) -> { this.setIssuerUri(n.getStringValue()); });
        deserializerMap.put("metadataExchangeUri", (n) -> { this.setMetadataExchangeUri(n.getStringValue()); });
        deserializerMap.put("passiveSignInUri", (n) -> { this.setPassiveSignInUri(n.getStringValue()); });
        deserializerMap.put("preferredAuthenticationProtocol", (n) -> { this.setPreferredAuthenticationProtocol(n.getEnumValue(AuthenticationProtocol.class)); });
        deserializerMap.put("signingCertificate", (n) -> { this.setSigningCertificate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuerUri property value. Issuer URI of the federation server.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIssuerUri() {
        return this.issuerUri;
    }
    /**
     * Gets the metadataExchangeUri property value. URI of the metadata exchange endpoint used for authentication from rich client applications.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMetadataExchangeUri() {
        return this.metadataExchangeUri;
    }
    /**
     * Gets the passiveSignInUri property value. URI that web-based clients are directed to when signing in to Azure Active Directory (Azure AD) services.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPassiveSignInUri() {
        return this.passiveSignInUri;
    }
    /**
     * Gets the preferredAuthenticationProtocol property value. Preferred authentication protocol. The possible values are: wsFed, saml, unknownFutureValue.
     * @return a authenticationProtocol
     */
    @jakarta.annotation.Nullable
    public AuthenticationProtocol getPreferredAuthenticationProtocol() {
        return this.preferredAuthenticationProtocol;
    }
    /**
     * Gets the signingCertificate property value. Current certificate used to sign tokens passed to the Microsoft identity platform. The certificate is formatted as a Base64 encoded string of the public portion of the federated IdP's token signing certificate and must be compatible with the X509Certificate2 class.   This property is used in the following scenarios:  if a rollover is required outside of the autorollover update a new federation service is being set up  if the new token signing certificate isn't present in the federation properties after the federation service certificate has been updated.   Azure AD updates certificates via an autorollover process in which it attempts to retrieve a new certificate from the federation service metadata, 30 days before expiry of the current certificate. If a new certificate isn't available, Azure AD monitors the metadata daily and will update the federation settings for the domain when a new certificate is available.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSigningCertificate() {
        return this.signingCertificate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setIssuerUri(@jakarta.annotation.Nullable final String value) {
        this.issuerUri = value;
    }
    /**
     * Sets the metadataExchangeUri property value. URI of the metadata exchange endpoint used for authentication from rich client applications.
     * @param value Value to set for the metadataExchangeUri property.
     */
    public void setMetadataExchangeUri(@jakarta.annotation.Nullable final String value) {
        this.metadataExchangeUri = value;
    }
    /**
     * Sets the passiveSignInUri property value. URI that web-based clients are directed to when signing in to Azure Active Directory (Azure AD) services.
     * @param value Value to set for the passiveSignInUri property.
     */
    public void setPassiveSignInUri(@jakarta.annotation.Nullable final String value) {
        this.passiveSignInUri = value;
    }
    /**
     * Sets the preferredAuthenticationProtocol property value. Preferred authentication protocol. The possible values are: wsFed, saml, unknownFutureValue.
     * @param value Value to set for the preferredAuthenticationProtocol property.
     */
    public void setPreferredAuthenticationProtocol(@jakarta.annotation.Nullable final AuthenticationProtocol value) {
        this.preferredAuthenticationProtocol = value;
    }
    /**
     * Sets the signingCertificate property value. Current certificate used to sign tokens passed to the Microsoft identity platform. The certificate is formatted as a Base64 encoded string of the public portion of the federated IdP's token signing certificate and must be compatible with the X509Certificate2 class.   This property is used in the following scenarios:  if a rollover is required outside of the autorollover update a new federation service is being set up  if the new token signing certificate isn't present in the federation properties after the federation service certificate has been updated.   Azure AD updates certificates via an autorollover process in which it attempts to retrieve a new certificate from the federation service metadata, 30 days before expiry of the current certificate. If a new certificate isn't available, Azure AD monitors the metadata daily and will update the federation settings for the domain when a new certificate is available.
     * @param value Value to set for the signingCertificate property.
     */
    public void setSigningCertificate(@jakarta.annotation.Nullable final String value) {
        this.signingCertificate = value;
    }
}
