package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.LocalDate;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicationRiskFactorSecurityInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ApplicationRiskFactorSecurityInfo} and sets the default values.
     */
    public ApplicationRiskFactorSecurityInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicationRiskFactorSecurityInfo}
     */
    @jakarta.annotation.Nonnull
    public static ApplicationRiskFactorSecurityInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationRiskFactorSecurityInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the certificate property value. The certificate property
     * @return a {@link ApplicationRiskFactorCertificateInfo}
     */
    @jakarta.annotation.Nullable
    public ApplicationRiskFactorCertificateInfo getCertificate() {
        return this.backingStore.get("certificate");
    }
    /**
     * Gets the domainToCheck property value. Specifies the domain or hostname evaluated during the security assessment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomainToCheck() {
        return this.backingStore.get("domainToCheck");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(26);
        deserializerMap.put("certificate", (n) -> { this.setCertificate(n.getObjectValue(ApplicationRiskFactorCertificateInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("domainToCheck", (n) -> { this.setDomainToCheck(n.getStringValue()); });
        deserializerMap.put("hasAdminAuditTrail", (n) -> { this.setHasAdminAuditTrail(n.getBooleanValue()); });
        deserializerMap.put("hasAnonymousUsage", (n) -> { this.setHasAnonymousUsage(n.getBooleanValue()); });
        deserializerMap.put("hasDataAuditTrail", (n) -> { this.setHasDataAuditTrail(n.getBooleanValue()); });
        deserializerMap.put("hasDataClassification", (n) -> { this.setHasDataClassification(n.getBooleanValue()); });
        deserializerMap.put("hasDataEncrypted", (n) -> { this.setHasDataEncrypted(n.getBooleanValue()); });
        deserializerMap.put("hasEnforceTransportEnc", (n) -> { this.setHasEnforceTransportEnc(n.getBooleanValue()); });
        deserializerMap.put("hasIpRestriction", (n) -> { this.setHasIpRestriction(n.getBooleanValue()); });
        deserializerMap.put("hasMFA", (n) -> { this.setHasMFA(n.getBooleanValue()); });
        deserializerMap.put("hasPenTest", (n) -> { this.setHasPenTest(n.getBooleanValue()); });
        deserializerMap.put("hasRememberPassword", (n) -> { this.setHasRememberPassword(n.getBooleanValue()); });
        deserializerMap.put("hasSamlSupport", (n) -> { this.setHasSamlSupport(n.getBooleanValue()); });
        deserializerMap.put("hasUserAuditLogs", (n) -> { this.setHasUserAuditLogs(n.getBooleanValue()); });
        deserializerMap.put("hasUserDataUpload", (n) -> { this.setHasUserDataUpload(n.getBooleanValue()); });
        deserializerMap.put("hasUserRolesSupport", (n) -> { this.setHasUserRolesSupport(n.getBooleanValue()); });
        deserializerMap.put("hasValidCertName", (n) -> { this.setHasValidCertName(n.getBooleanValue()); });
        deserializerMap.put("httpsSecurityHeaders", (n) -> { this.setHttpsSecurityHeaders(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isCertTrusted", (n) -> { this.setIsCertTrusted(n.getBooleanValue()); });
        deserializerMap.put("isDrownVulnerable", (n) -> { this.setIsDrownVulnerable(n.getBooleanValue()); });
        deserializerMap.put("isHeartbleedProof", (n) -> { this.setIsHeartbleedProof(n.getBooleanValue()); });
        deserializerMap.put("lastBreachDate", (n) -> { this.setLastBreachDate(n.getLocalDateValue()); });
        deserializerMap.put("latestValidSSL", (n) -> { this.setLatestValidSSL(n.getEnumValue(SslVersion::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("passwordPolicy", (n) -> { this.setPasswordPolicy(n.getEnumSetValue(PasswordPolicy::forValue)); });
        deserializerMap.put("restEncryptionType", (n) -> { this.setRestEncryptionType(n.getEnumValue(RestEncryptionType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hasAdminAuditTrail property value. Indicates whether the application maintains an audit trail for administrative actions.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasAdminAuditTrail() {
        return this.backingStore.get("hasAdminAuditTrail");
    }
    /**
     * Gets the hasAnonymousUsage property value. Indicates whether the application allows anonymous or unauthenticated usage.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasAnonymousUsage() {
        return this.backingStore.get("hasAnonymousUsage");
    }
    /**
     * Gets the hasDataAuditTrail property value. Indicates whether the application logs access or modification of customer data for audit purposes.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasDataAuditTrail() {
        return this.backingStore.get("hasDataAuditTrail");
    }
    /**
     * Gets the hasDataClassification property value. Indicates whether the application classifies and labels data based on sensitivity levels.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasDataClassification() {
        return this.backingStore.get("hasDataClassification");
    }
    /**
     * Gets the hasDataEncrypted property value. Indicates whether data at rest and in transit are encrypted using approved algorithms.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasDataEncrypted() {
        return this.backingStore.get("hasDataEncrypted");
    }
    /**
     * Gets the hasEnforceTransportEnc property value. Indicates whether HTTPS or equivalent secure transport is enforced for all communication channels.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasEnforceTransportEnc() {
        return this.backingStore.get("hasEnforceTransportEnc");
    }
    /**
     * Gets the hasIpRestriction property value. Indicates whether access to the application can be restricted based on IP address or network range.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasIpRestriction() {
        return this.backingStore.get("hasIpRestriction");
    }
    /**
     * Gets the hasMFA property value. Indicates whether the application supports or enforces multi-factor authentication (MFA).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasMFA() {
        return this.backingStore.get("hasMFA");
    }
    /**
     * Gets the hasPenTest property value. Indicates whether the application undergoes periodic penetration testing or external security reviews.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasPenTest() {
        return this.backingStore.get("hasPenTest");
    }
    /**
     * Gets the hasRememberPassword property value. Indicates whether the application supports password-saving functionality, which may pose a security risk.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasRememberPassword() {
        return this.backingStore.get("hasRememberPassword");
    }
    /**
     * Gets the hasSamlSupport property value. Indicates whether the application supports SAML-based single sign-on (SSO).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasSamlSupport() {
        return this.backingStore.get("hasSamlSupport");
    }
    /**
     * Gets the hasUserAuditLogs property value. Indicates whether user activity is logged for security or compliance monitoring.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasUserAuditLogs() {
        return this.backingStore.get("hasUserAuditLogs");
    }
    /**
     * Gets the hasUserDataUpload property value. Indicates whether users can upload or store personal or organizational data within the application.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasUserDataUpload() {
        return this.backingStore.get("hasUserDataUpload");
    }
    /**
     * Gets the hasUserRolesSupport property value. Indicates whether the application supports role-based access control (RBAC).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasUserRolesSupport() {
        return this.backingStore.get("hasUserRolesSupport");
    }
    /**
     * Gets the hasValidCertName property value. Indicates whether the certificates common name matches the applications verified domain.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasValidCertName() {
        return this.backingStore.get("hasValidCertName");
    }
    /**
     * Gets the httpsSecurityHeaders property value. Lists the HTTP security headers detected for the application (for example, HSTS, X-Frame-Options, or CSP).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getHttpsSecurityHeaders() {
        return this.backingStore.get("httpsSecurityHeaders");
    }
    /**
     * Gets the isCertTrusted property value. Indicates whether the applications certificate is signed by a trusted certificate authority (CA).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCertTrusted() {
        return this.backingStore.get("isCertTrusted");
    }
    /**
     * Gets the isDrownVulnerable property value. Indicates whether the application is vulnerable to the DROWN (Decrypting RSA with Obsolete and Weakened eNcryption) attack.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDrownVulnerable() {
        return this.backingStore.get("isDrownVulnerable");
    }
    /**
     * Gets the isHeartbleedProof property value. Indicates whether the applications SSL implementation is protected from the Heartbleed vulnerability.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHeartbleedProof() {
        return this.backingStore.get("isHeartbleedProof");
    }
    /**
     * Gets the lastBreachDate property value. Specifies the date of the last publicly reported data breach or security incident related to the application, if known.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getLastBreachDate() {
        return this.backingStore.get("lastBreachDate");
    }
    /**
     * Gets the latestValidSSL property value. The latestValidSSL property
     * @return a {@link SslVersion}
     */
    @jakarta.annotation.Nullable
    public SslVersion getLatestValidSSL() {
        return this.backingStore.get("latestValidSSL");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the passwordPolicy property value. The passwordPolicy property
     * @return a {@link EnumSet<PasswordPolicy>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<PasswordPolicy> getPasswordPolicy() {
        return this.backingStore.get("passwordPolicy");
    }
    /**
     * Gets the restEncryptionType property value. The restEncryptionType property
     * @return a {@link RestEncryptionType}
     */
    @jakarta.annotation.Nullable
    public RestEncryptionType getRestEncryptionType() {
        return this.backingStore.get("restEncryptionType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("certificate", this.getCertificate());
        writer.writeStringValue("domainToCheck", this.getDomainToCheck());
        writer.writeBooleanValue("hasAdminAuditTrail", this.getHasAdminAuditTrail());
        writer.writeBooleanValue("hasAnonymousUsage", this.getHasAnonymousUsage());
        writer.writeBooleanValue("hasDataAuditTrail", this.getHasDataAuditTrail());
        writer.writeBooleanValue("hasDataClassification", this.getHasDataClassification());
        writer.writeBooleanValue("hasDataEncrypted", this.getHasDataEncrypted());
        writer.writeBooleanValue("hasEnforceTransportEnc", this.getHasEnforceTransportEnc());
        writer.writeBooleanValue("hasIpRestriction", this.getHasIpRestriction());
        writer.writeBooleanValue("hasMFA", this.getHasMFA());
        writer.writeBooleanValue("hasPenTest", this.getHasPenTest());
        writer.writeBooleanValue("hasRememberPassword", this.getHasRememberPassword());
        writer.writeBooleanValue("hasSamlSupport", this.getHasSamlSupport());
        writer.writeBooleanValue("hasUserAuditLogs", this.getHasUserAuditLogs());
        writer.writeBooleanValue("hasUserDataUpload", this.getHasUserDataUpload());
        writer.writeBooleanValue("hasUserRolesSupport", this.getHasUserRolesSupport());
        writer.writeBooleanValue("hasValidCertName", this.getHasValidCertName());
        writer.writeCollectionOfPrimitiveValues("httpsSecurityHeaders", this.getHttpsSecurityHeaders());
        writer.writeBooleanValue("isCertTrusted", this.getIsCertTrusted());
        writer.writeBooleanValue("isDrownVulnerable", this.getIsDrownVulnerable());
        writer.writeBooleanValue("isHeartbleedProof", this.getIsHeartbleedProof());
        writer.writeLocalDateValue("lastBreachDate", this.getLastBreachDate());
        writer.writeEnumValue("latestValidSSL", this.getLatestValidSSL());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumSetValue("passwordPolicy", this.getPasswordPolicy());
        writer.writeEnumValue("restEncryptionType", this.getRestEncryptionType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the certificate property value. The certificate property
     * @param value Value to set for the certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final ApplicationRiskFactorCertificateInfo value) {
        this.backingStore.set("certificate", value);
    }
    /**
     * Sets the domainToCheck property value. Specifies the domain or hostname evaluated during the security assessment.
     * @param value Value to set for the domainToCheck property.
     */
    public void setDomainToCheck(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domainToCheck", value);
    }
    /**
     * Sets the hasAdminAuditTrail property value. Indicates whether the application maintains an audit trail for administrative actions.
     * @param value Value to set for the hasAdminAuditTrail property.
     */
    public void setHasAdminAuditTrail(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasAdminAuditTrail", value);
    }
    /**
     * Sets the hasAnonymousUsage property value. Indicates whether the application allows anonymous or unauthenticated usage.
     * @param value Value to set for the hasAnonymousUsage property.
     */
    public void setHasAnonymousUsage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasAnonymousUsage", value);
    }
    /**
     * Sets the hasDataAuditTrail property value. Indicates whether the application logs access or modification of customer data for audit purposes.
     * @param value Value to set for the hasDataAuditTrail property.
     */
    public void setHasDataAuditTrail(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasDataAuditTrail", value);
    }
    /**
     * Sets the hasDataClassification property value. Indicates whether the application classifies and labels data based on sensitivity levels.
     * @param value Value to set for the hasDataClassification property.
     */
    public void setHasDataClassification(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasDataClassification", value);
    }
    /**
     * Sets the hasDataEncrypted property value. Indicates whether data at rest and in transit are encrypted using approved algorithms.
     * @param value Value to set for the hasDataEncrypted property.
     */
    public void setHasDataEncrypted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasDataEncrypted", value);
    }
    /**
     * Sets the hasEnforceTransportEnc property value. Indicates whether HTTPS or equivalent secure transport is enforced for all communication channels.
     * @param value Value to set for the hasEnforceTransportEnc property.
     */
    public void setHasEnforceTransportEnc(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasEnforceTransportEnc", value);
    }
    /**
     * Sets the hasIpRestriction property value. Indicates whether access to the application can be restricted based on IP address or network range.
     * @param value Value to set for the hasIpRestriction property.
     */
    public void setHasIpRestriction(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasIpRestriction", value);
    }
    /**
     * Sets the hasMFA property value. Indicates whether the application supports or enforces multi-factor authentication (MFA).
     * @param value Value to set for the hasMFA property.
     */
    public void setHasMFA(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasMFA", value);
    }
    /**
     * Sets the hasPenTest property value. Indicates whether the application undergoes periodic penetration testing or external security reviews.
     * @param value Value to set for the hasPenTest property.
     */
    public void setHasPenTest(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasPenTest", value);
    }
    /**
     * Sets the hasRememberPassword property value. Indicates whether the application supports password-saving functionality, which may pose a security risk.
     * @param value Value to set for the hasRememberPassword property.
     */
    public void setHasRememberPassword(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasRememberPassword", value);
    }
    /**
     * Sets the hasSamlSupport property value. Indicates whether the application supports SAML-based single sign-on (SSO).
     * @param value Value to set for the hasSamlSupport property.
     */
    public void setHasSamlSupport(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasSamlSupport", value);
    }
    /**
     * Sets the hasUserAuditLogs property value. Indicates whether user activity is logged for security or compliance monitoring.
     * @param value Value to set for the hasUserAuditLogs property.
     */
    public void setHasUserAuditLogs(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasUserAuditLogs", value);
    }
    /**
     * Sets the hasUserDataUpload property value. Indicates whether users can upload or store personal or organizational data within the application.
     * @param value Value to set for the hasUserDataUpload property.
     */
    public void setHasUserDataUpload(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasUserDataUpload", value);
    }
    /**
     * Sets the hasUserRolesSupport property value. Indicates whether the application supports role-based access control (RBAC).
     * @param value Value to set for the hasUserRolesSupport property.
     */
    public void setHasUserRolesSupport(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasUserRolesSupport", value);
    }
    /**
     * Sets the hasValidCertName property value. Indicates whether the certificates common name matches the applications verified domain.
     * @param value Value to set for the hasValidCertName property.
     */
    public void setHasValidCertName(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasValidCertName", value);
    }
    /**
     * Sets the httpsSecurityHeaders property value. Lists the HTTP security headers detected for the application (for example, HSTS, X-Frame-Options, or CSP).
     * @param value Value to set for the httpsSecurityHeaders property.
     */
    public void setHttpsSecurityHeaders(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("httpsSecurityHeaders", value);
    }
    /**
     * Sets the isCertTrusted property value. Indicates whether the applications certificate is signed by a trusted certificate authority (CA).
     * @param value Value to set for the isCertTrusted property.
     */
    public void setIsCertTrusted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCertTrusted", value);
    }
    /**
     * Sets the isDrownVulnerable property value. Indicates whether the application is vulnerable to the DROWN (Decrypting RSA with Obsolete and Weakened eNcryption) attack.
     * @param value Value to set for the isDrownVulnerable property.
     */
    public void setIsDrownVulnerable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDrownVulnerable", value);
    }
    /**
     * Sets the isHeartbleedProof property value. Indicates whether the applications SSL implementation is protected from the Heartbleed vulnerability.
     * @param value Value to set for the isHeartbleedProof property.
     */
    public void setIsHeartbleedProof(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHeartbleedProof", value);
    }
    /**
     * Sets the lastBreachDate property value. Specifies the date of the last publicly reported data breach or security incident related to the application, if known.
     * @param value Value to set for the lastBreachDate property.
     */
    public void setLastBreachDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("lastBreachDate", value);
    }
    /**
     * Sets the latestValidSSL property value. The latestValidSSL property
     * @param value Value to set for the latestValidSSL property.
     */
    public void setLatestValidSSL(@jakarta.annotation.Nullable final SslVersion value) {
        this.backingStore.set("latestValidSSL", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the passwordPolicy property value. The passwordPolicy property
     * @param value Value to set for the passwordPolicy property.
     */
    public void setPasswordPolicy(@jakarta.annotation.Nullable final EnumSet<PasswordPolicy> value) {
        this.backingStore.set("passwordPolicy", value);
    }
    /**
     * Sets the restEncryptionType property value. The restEncryptionType property
     * @param value Value to set for the restEncryptionType property.
     */
    public void setRestEncryptionType(@jakarta.annotation.Nullable final RestEncryptionType value) {
        this.backingStore.set("restEncryptionType", value);
    }
}
