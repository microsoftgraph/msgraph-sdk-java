package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InternalDomainFederation extends SamlOrWsFedProvider implements Parsable {
    /**
     * URL of the endpoint used by active clients when authenticating with federated domains set up for single sign-on in Azure Active Directory (Azure AD). Corresponds to the ActiveLogOnUri property of the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet.
     */
    private String activeSignInUri;
    /**
     * Determines whether Azure AD accepts the MFA performed by the federated IdP when a federated user accesses an application that is governed by a conditional access policy that requires MFA. The possible values are: acceptIfMfaDoneByFederatedIdp, enforceMfaByFederatedIdp, rejectMfaByFederatedIdp, unknownFutureValue. For more information, see federatedIdpMfaBehavior values.
     */
    private FederatedIdpMfaBehavior federatedIdpMfaBehavior;
    /**
     * If true, when SAML authentication requests are sent to the federated SAML IdP, Azure AD will sign those requests using the OrgID signing key. If false (default), the SAML authentication requests sent to the federated IdP are not signed.
     */
    private Boolean isSignedAuthenticationRequestRequired;
    /**
     * Fallback token signing certificate that is used to sign tokens when the primary signing certificate expires. Formatted as Base64 encoded strings of the public portion of the federated IdP's token signing certificate. Needs to be compatible with the X509Certificate2 class. Much like the signingCertificate, the nextSigningCertificate property is used if a rollover is required outside of the auto-rollover update, a new federation service is being set up, or if the new token signing certificate is not present in the federation properties after the federation service certificate has been updated.
     */
    private String nextSigningCertificate;
    /**
     * Sets the preferred behavior for the sign-in prompt. The possible values are: translateToFreshPasswordAuthentication, nativeSupport, disabled, unknownFutureValue.
     */
    private PromptLoginBehavior promptLoginBehavior;
    /**
     * Provides status and timestamp of the last update of the signing certificate.
     */
    private SigningCertificateUpdateStatus signingCertificateUpdateStatus;
    /**
     * URI that clients are redirected to when they sign out of Azure AD services. Corresponds to the LogOffUri property of the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet.
     */
    private String signOutUri;
    /**
     * Instantiates a new InternalDomainFederation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InternalDomainFederation() {
        super();
        this.setOdataType("#microsoft.graph.internalDomainFederation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InternalDomainFederation
     */
    @javax.annotation.Nonnull
    public static InternalDomainFederation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InternalDomainFederation();
    }
    /**
     * Gets the activeSignInUri property value. URL of the endpoint used by active clients when authenticating with federated domains set up for single sign-on in Azure Active Directory (Azure AD). Corresponds to the ActiveLogOnUri property of the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActiveSignInUri() {
        return this.activeSignInUri;
    }
    /**
     * Gets the federatedIdpMfaBehavior property value. Determines whether Azure AD accepts the MFA performed by the federated IdP when a federated user accesses an application that is governed by a conditional access policy that requires MFA. The possible values are: acceptIfMfaDoneByFederatedIdp, enforceMfaByFederatedIdp, rejectMfaByFederatedIdp, unknownFutureValue. For more information, see federatedIdpMfaBehavior values.
     * @return a federatedIdpMfaBehavior
     */
    @javax.annotation.Nullable
    public FederatedIdpMfaBehavior getFederatedIdpMfaBehavior() {
        return this.federatedIdpMfaBehavior;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeSignInUri", (n) -> { this.setActiveSignInUri(n.getStringValue()); });
        deserializerMap.put("federatedIdpMfaBehavior", (n) -> { this.setFederatedIdpMfaBehavior(n.getEnumValue(FederatedIdpMfaBehavior.class)); });
        deserializerMap.put("isSignedAuthenticationRequestRequired", (n) -> { this.setIsSignedAuthenticationRequestRequired(n.getBooleanValue()); });
        deserializerMap.put("nextSigningCertificate", (n) -> { this.setNextSigningCertificate(n.getStringValue()); });
        deserializerMap.put("promptLoginBehavior", (n) -> { this.setPromptLoginBehavior(n.getEnumValue(PromptLoginBehavior.class)); });
        deserializerMap.put("signingCertificateUpdateStatus", (n) -> { this.setSigningCertificateUpdateStatus(n.getObjectValue(SigningCertificateUpdateStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("signOutUri", (n) -> { this.setSignOutUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSignedAuthenticationRequestRequired property value. If true, when SAML authentication requests are sent to the federated SAML IdP, Azure AD will sign those requests using the OrgID signing key. If false (default), the SAML authentication requests sent to the federated IdP are not signed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSignedAuthenticationRequestRequired() {
        return this.isSignedAuthenticationRequestRequired;
    }
    /**
     * Gets the nextSigningCertificate property value. Fallback token signing certificate that is used to sign tokens when the primary signing certificate expires. Formatted as Base64 encoded strings of the public portion of the federated IdP's token signing certificate. Needs to be compatible with the X509Certificate2 class. Much like the signingCertificate, the nextSigningCertificate property is used if a rollover is required outside of the auto-rollover update, a new federation service is being set up, or if the new token signing certificate is not present in the federation properties after the federation service certificate has been updated.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNextSigningCertificate() {
        return this.nextSigningCertificate;
    }
    /**
     * Gets the promptLoginBehavior property value. Sets the preferred behavior for the sign-in prompt. The possible values are: translateToFreshPasswordAuthentication, nativeSupport, disabled, unknownFutureValue.
     * @return a promptLoginBehavior
     */
    @javax.annotation.Nullable
    public PromptLoginBehavior getPromptLoginBehavior() {
        return this.promptLoginBehavior;
    }
    /**
     * Gets the signingCertificateUpdateStatus property value. Provides status and timestamp of the last update of the signing certificate.
     * @return a signingCertificateUpdateStatus
     */
    @javax.annotation.Nullable
    public SigningCertificateUpdateStatus getSigningCertificateUpdateStatus() {
        return this.signingCertificateUpdateStatus;
    }
    /**
     * Gets the signOutUri property value. URI that clients are redirected to when they sign out of Azure AD services. Corresponds to the LogOffUri property of the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignOutUri() {
        return this.signOutUri;
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
        writer.writeStringValue("activeSignInUri", this.getActiveSignInUri());
        writer.writeEnumValue("federatedIdpMfaBehavior", this.getFederatedIdpMfaBehavior());
        writer.writeBooleanValue("isSignedAuthenticationRequestRequired", this.getIsSignedAuthenticationRequestRequired());
        writer.writeStringValue("nextSigningCertificate", this.getNextSigningCertificate());
        writer.writeEnumValue("promptLoginBehavior", this.getPromptLoginBehavior());
        writer.writeObjectValue("signingCertificateUpdateStatus", this.getSigningCertificateUpdateStatus());
        writer.writeStringValue("signOutUri", this.getSignOutUri());
    }
    /**
     * Sets the activeSignInUri property value. URL of the endpoint used by active clients when authenticating with federated domains set up for single sign-on in Azure Active Directory (Azure AD). Corresponds to the ActiveLogOnUri property of the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet.
     * @param value Value to set for the activeSignInUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveSignInUri(@javax.annotation.Nullable final String value) {
        this.activeSignInUri = value;
    }
    /**
     * Sets the federatedIdpMfaBehavior property value. Determines whether Azure AD accepts the MFA performed by the federated IdP when a federated user accesses an application that is governed by a conditional access policy that requires MFA. The possible values are: acceptIfMfaDoneByFederatedIdp, enforceMfaByFederatedIdp, rejectMfaByFederatedIdp, unknownFutureValue. For more information, see federatedIdpMfaBehavior values.
     * @param value Value to set for the federatedIdpMfaBehavior property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFederatedIdpMfaBehavior(@javax.annotation.Nullable final FederatedIdpMfaBehavior value) {
        this.federatedIdpMfaBehavior = value;
    }
    /**
     * Sets the isSignedAuthenticationRequestRequired property value. If true, when SAML authentication requests are sent to the federated SAML IdP, Azure AD will sign those requests using the OrgID signing key. If false (default), the SAML authentication requests sent to the federated IdP are not signed.
     * @param value Value to set for the isSignedAuthenticationRequestRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSignedAuthenticationRequestRequired(@javax.annotation.Nullable final Boolean value) {
        this.isSignedAuthenticationRequestRequired = value;
    }
    /**
     * Sets the nextSigningCertificate property value. Fallback token signing certificate that is used to sign tokens when the primary signing certificate expires. Formatted as Base64 encoded strings of the public portion of the federated IdP's token signing certificate. Needs to be compatible with the X509Certificate2 class. Much like the signingCertificate, the nextSigningCertificate property is used if a rollover is required outside of the auto-rollover update, a new federation service is being set up, or if the new token signing certificate is not present in the federation properties after the federation service certificate has been updated.
     * @param value Value to set for the nextSigningCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNextSigningCertificate(@javax.annotation.Nullable final String value) {
        this.nextSigningCertificate = value;
    }
    /**
     * Sets the promptLoginBehavior property value. Sets the preferred behavior for the sign-in prompt. The possible values are: translateToFreshPasswordAuthentication, nativeSupport, disabled, unknownFutureValue.
     * @param value Value to set for the promptLoginBehavior property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPromptLoginBehavior(@javax.annotation.Nullable final PromptLoginBehavior value) {
        this.promptLoginBehavior = value;
    }
    /**
     * Sets the signingCertificateUpdateStatus property value. Provides status and timestamp of the last update of the signing certificate.
     * @param value Value to set for the signingCertificateUpdateStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSigningCertificateUpdateStatus(@javax.annotation.Nullable final SigningCertificateUpdateStatus value) {
        this.signingCertificateUpdateStatus = value;
    }
    /**
     * Sets the signOutUri property value. URI that clients are redirected to when they sign out of Azure AD services. Corresponds to the LogOffUri property of the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet.
     * @param value Value to set for the signOutUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignOutUri(@javax.annotation.Nullable final String value) {
        this.signOutUri = value;
    }
}
