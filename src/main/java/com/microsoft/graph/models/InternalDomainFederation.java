package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InternalDomainFederation extends SamlOrWsFedProvider implements Parsable {
    /** URL of the endpoint used by active clients when authenticating with federated domains set up for single sign-on in Azure Active Directory (Azure AD). Corresponds to the ActiveLogOnUri property of the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet. */
    private String _activeSignInUri;
    /** Determines whether Azure AD accepts the MFA performed by the federated IdP when a federated user accesses an application that is governed by a conditional access policy that requires MFA. The possible values are: acceptIfMfaDoneByFederatedIdp, enforceMfaByFederatedIdp, rejectMfaByFederatedIdp, unknownFutureValue. For more information, see federatedIdpMfaBehavior values. */
    private FederatedIdpMfaBehavior _federatedIdpMfaBehavior;
    /** If true, when SAML authentication requests are sent to the federated SAML IdP, Azure AD will sign those requests using the OrgID signing key. If false (default), the SAML authentication requests sent to the federated IdP are not signed. */
    private Boolean _isSignedAuthenticationRequestRequired;
    /** Fallback token signing certificate that is used to sign tokens when the primary signing certificate expires. Formatted as Base64 encoded strings of the public portion of the federated IdP's token signing certificate. Needs to be compatible with the X509Certificate2 class. Much like the signingCertificate, the nextSigningCertificate property is used if a rollover is required outside of the auto-rollover update, a new federation service is being set up, or if the new token signing certificate is not present in the federation properties after the federation service certificate has been updated. */
    private String _nextSigningCertificate;
    /** Sets the preferred behavior for the sign-in prompt. The possible values are: translateToFreshPasswordAuthentication, nativeSupport, disabled, unknownFutureValue. */
    private PromptLoginBehavior _promptLoginBehavior;
    /** Provides status and timestamp of the last update of the signing certificate. */
    private SigningCertificateUpdateStatus _signingCertificateUpdateStatus;
    /** URI that clients are redirected to when they sign out of Azure AD services. Corresponds to the LogOffUri property of the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet. */
    private String _signOutUri;
    /**
     * Instantiates a new internalDomainFederation and sets the default values.
     * @return a void
     */
    public InternalDomainFederation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a internalDomainFederation
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
        return this._activeSignInUri;
    }
    /**
     * Gets the federatedIdpMfaBehavior property value. Determines whether Azure AD accepts the MFA performed by the federated IdP when a federated user accesses an application that is governed by a conditional access policy that requires MFA. The possible values are: acceptIfMfaDoneByFederatedIdp, enforceMfaByFederatedIdp, rejectMfaByFederatedIdp, unknownFutureValue. For more information, see federatedIdpMfaBehavior values.
     * @return a federatedIdpMfaBehavior
     */
    @javax.annotation.Nullable
    public FederatedIdpMfaBehavior getFederatedIdpMfaBehavior() {
        return this._federatedIdpMfaBehavior;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InternalDomainFederation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activeSignInUri", (n) -> { currentObject.setActiveSignInUri(n.getStringValue()); });
            this.put("federatedIdpMfaBehavior", (n) -> { currentObject.setFederatedIdpMfaBehavior(n.getEnumValue(FederatedIdpMfaBehavior.class)); });
            this.put("isSignedAuthenticationRequestRequired", (n) -> { currentObject.setIsSignedAuthenticationRequestRequired(n.getBooleanValue()); });
            this.put("nextSigningCertificate", (n) -> { currentObject.setNextSigningCertificate(n.getStringValue()); });
            this.put("promptLoginBehavior", (n) -> { currentObject.setPromptLoginBehavior(n.getEnumValue(PromptLoginBehavior.class)); });
            this.put("signingCertificateUpdateStatus", (n) -> { currentObject.setSigningCertificateUpdateStatus(n.getObjectValue(SigningCertificateUpdateStatus::createFromDiscriminatorValue)); });
            this.put("signOutUri", (n) -> { currentObject.setSignOutUri(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isSignedAuthenticationRequestRequired property value. If true, when SAML authentication requests are sent to the federated SAML IdP, Azure AD will sign those requests using the OrgID signing key. If false (default), the SAML authentication requests sent to the federated IdP are not signed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSignedAuthenticationRequestRequired() {
        return this._isSignedAuthenticationRequestRequired;
    }
    /**
     * Gets the nextSigningCertificate property value. Fallback token signing certificate that is used to sign tokens when the primary signing certificate expires. Formatted as Base64 encoded strings of the public portion of the federated IdP's token signing certificate. Needs to be compatible with the X509Certificate2 class. Much like the signingCertificate, the nextSigningCertificate property is used if a rollover is required outside of the auto-rollover update, a new federation service is being set up, or if the new token signing certificate is not present in the federation properties after the federation service certificate has been updated.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNextSigningCertificate() {
        return this._nextSigningCertificate;
    }
    /**
     * Gets the promptLoginBehavior property value. Sets the preferred behavior for the sign-in prompt. The possible values are: translateToFreshPasswordAuthentication, nativeSupport, disabled, unknownFutureValue.
     * @return a promptLoginBehavior
     */
    @javax.annotation.Nullable
    public PromptLoginBehavior getPromptLoginBehavior() {
        return this._promptLoginBehavior;
    }
    /**
     * Gets the signingCertificateUpdateStatus property value. Provides status and timestamp of the last update of the signing certificate.
     * @return a signingCertificateUpdateStatus
     */
    @javax.annotation.Nullable
    public SigningCertificateUpdateStatus getSigningCertificateUpdateStatus() {
        return this._signingCertificateUpdateStatus;
    }
    /**
     * Gets the signOutUri property value. URI that clients are redirected to when they sign out of Azure AD services. Corresponds to the LogOffUri property of the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignOutUri() {
        return this._signOutUri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setActiveSignInUri(@javax.annotation.Nullable final String value) {
        this._activeSignInUri = value;
    }
    /**
     * Sets the federatedIdpMfaBehavior property value. Determines whether Azure AD accepts the MFA performed by the federated IdP when a federated user accesses an application that is governed by a conditional access policy that requires MFA. The possible values are: acceptIfMfaDoneByFederatedIdp, enforceMfaByFederatedIdp, rejectMfaByFederatedIdp, unknownFutureValue. For more information, see federatedIdpMfaBehavior values.
     * @param value Value to set for the federatedIdpMfaBehavior property.
     * @return a void
     */
    public void setFederatedIdpMfaBehavior(@javax.annotation.Nullable final FederatedIdpMfaBehavior value) {
        this._federatedIdpMfaBehavior = value;
    }
    /**
     * Sets the isSignedAuthenticationRequestRequired property value. If true, when SAML authentication requests are sent to the federated SAML IdP, Azure AD will sign those requests using the OrgID signing key. If false (default), the SAML authentication requests sent to the federated IdP are not signed.
     * @param value Value to set for the isSignedAuthenticationRequestRequired property.
     * @return a void
     */
    public void setIsSignedAuthenticationRequestRequired(@javax.annotation.Nullable final Boolean value) {
        this._isSignedAuthenticationRequestRequired = value;
    }
    /**
     * Sets the nextSigningCertificate property value. Fallback token signing certificate that is used to sign tokens when the primary signing certificate expires. Formatted as Base64 encoded strings of the public portion of the federated IdP's token signing certificate. Needs to be compatible with the X509Certificate2 class. Much like the signingCertificate, the nextSigningCertificate property is used if a rollover is required outside of the auto-rollover update, a new federation service is being set up, or if the new token signing certificate is not present in the federation properties after the federation service certificate has been updated.
     * @param value Value to set for the nextSigningCertificate property.
     * @return a void
     */
    public void setNextSigningCertificate(@javax.annotation.Nullable final String value) {
        this._nextSigningCertificate = value;
    }
    /**
     * Sets the promptLoginBehavior property value. Sets the preferred behavior for the sign-in prompt. The possible values are: translateToFreshPasswordAuthentication, nativeSupport, disabled, unknownFutureValue.
     * @param value Value to set for the promptLoginBehavior property.
     * @return a void
     */
    public void setPromptLoginBehavior(@javax.annotation.Nullable final PromptLoginBehavior value) {
        this._promptLoginBehavior = value;
    }
    /**
     * Sets the signingCertificateUpdateStatus property value. Provides status and timestamp of the last update of the signing certificate.
     * @param value Value to set for the signingCertificateUpdateStatus property.
     * @return a void
     */
    public void setSigningCertificateUpdateStatus(@javax.annotation.Nullable final SigningCertificateUpdateStatus value) {
        this._signingCertificateUpdateStatus = value;
    }
    /**
     * Sets the signOutUri property value. URI that clients are redirected to when they sign out of Azure AD services. Corresponds to the LogOffUri property of the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet.
     * @param value Value to set for the signOutUri property.
     * @return a void
     */
    public void setSignOutUri(@javax.annotation.Nullable final String value) {
        this._signOutUri = value;
    }
}
