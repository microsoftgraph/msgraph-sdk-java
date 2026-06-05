package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicationRiskFactorCertificateInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ApplicationRiskFactorCertificateInfo} and sets the default values.
     */
    public ApplicationRiskFactorCertificateInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicationRiskFactorCertificateInfo}
     */
    @jakarta.annotation.Nonnull
    public static ApplicationRiskFactorCertificateInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationRiskFactorCertificateInfo();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("hasBadCommonName", (n) -> { this.setHasBadCommonName(n.getBooleanValue()); });
        deserializerMap.put("hasInsecureSignature", (n) -> { this.setHasInsecureSignature(n.getBooleanValue()); });
        deserializerMap.put("hasNoChainOfTrust", (n) -> { this.setHasNoChainOfTrust(n.getBooleanValue()); });
        deserializerMap.put("isDenylisted", (n) -> { this.setIsDenylisted(n.getBooleanValue()); });
        deserializerMap.put("isHostnameMismatch", (n) -> { this.setIsHostnameMismatch(n.getBooleanValue()); });
        deserializerMap.put("isNotAfter", (n) -> { this.setIsNotAfter(n.getBooleanValue()); });
        deserializerMap.put("isNotBefore", (n) -> { this.setIsNotBefore(n.getBooleanValue()); });
        deserializerMap.put("isRevoked", (n) -> { this.setIsRevoked(n.getBooleanValue()); });
        deserializerMap.put("isSelfSigned", (n) -> { this.setIsSelfSigned(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasBadCommonName property value. Indicates whether the certificate&apos;s common name doesn&apos;t match the expected domain name.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasBadCommonName() {
        return this.backingStore.get("hasBadCommonName");
    }
    /**
     * Gets the hasInsecureSignature property value. Indicates whether the certificate uses a weak or insecure signature algorithm (for example, MD5 or SHA-1).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasInsecureSignature() {
        return this.backingStore.get("hasInsecureSignature");
    }
    /**
     * Gets the hasNoChainOfTrust property value. Indicates whether the certificate chain of trust is incomplete or invalid.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasNoChainOfTrust() {
        return this.backingStore.get("hasNoChainOfTrust");
    }
    /**
     * Gets the isDenylisted property value. Indicates whether the certificate is on a known denylist or associated with compromised issuers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDenylisted() {
        return this.backingStore.get("isDenylisted");
    }
    /**
     * Gets the isHostnameMismatch property value. Indicates whether the certificate&apos;s hostname doesn&apos;t match the domain it was issued for.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHostnameMismatch() {
        return this.backingStore.get("isHostnameMismatch");
    }
    /**
     * Gets the isNotAfter property value. Indicates whether the certificate is expired and no longer valid.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsNotAfter() {
        return this.backingStore.get("isNotAfter");
    }
    /**
     * Gets the isNotBefore property value. Indicates whether the certificate isn&apos;t yet valid based on its activation date.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsNotBefore() {
        return this.backingStore.get("isNotBefore");
    }
    /**
     * Gets the isRevoked property value. Indicates whether the issuing certificate authority revoked the certificate.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRevoked() {
        return this.backingStore.get("isRevoked");
    }
    /**
     * Gets the isSelfSigned property value. Indicates whether the certificate is self-signed rather than issued by a trusted certificate authority.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSelfSigned() {
        return this.backingStore.get("isSelfSigned");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("hasBadCommonName", this.getHasBadCommonName());
        writer.writeBooleanValue("hasInsecureSignature", this.getHasInsecureSignature());
        writer.writeBooleanValue("hasNoChainOfTrust", this.getHasNoChainOfTrust());
        writer.writeBooleanValue("isDenylisted", this.getIsDenylisted());
        writer.writeBooleanValue("isHostnameMismatch", this.getIsHostnameMismatch());
        writer.writeBooleanValue("isNotAfter", this.getIsNotAfter());
        writer.writeBooleanValue("isNotBefore", this.getIsNotBefore());
        writer.writeBooleanValue("isRevoked", this.getIsRevoked());
        writer.writeBooleanValue("isSelfSigned", this.getIsSelfSigned());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the hasBadCommonName property value. Indicates whether the certificate&apos;s common name doesn&apos;t match the expected domain name.
     * @param value Value to set for the hasBadCommonName property.
     */
    public void setHasBadCommonName(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasBadCommonName", value);
    }
    /**
     * Sets the hasInsecureSignature property value. Indicates whether the certificate uses a weak or insecure signature algorithm (for example, MD5 or SHA-1).
     * @param value Value to set for the hasInsecureSignature property.
     */
    public void setHasInsecureSignature(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasInsecureSignature", value);
    }
    /**
     * Sets the hasNoChainOfTrust property value. Indicates whether the certificate chain of trust is incomplete or invalid.
     * @param value Value to set for the hasNoChainOfTrust property.
     */
    public void setHasNoChainOfTrust(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasNoChainOfTrust", value);
    }
    /**
     * Sets the isDenylisted property value. Indicates whether the certificate is on a known denylist or associated with compromised issuers.
     * @param value Value to set for the isDenylisted property.
     */
    public void setIsDenylisted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDenylisted", value);
    }
    /**
     * Sets the isHostnameMismatch property value. Indicates whether the certificate&apos;s hostname doesn&apos;t match the domain it was issued for.
     * @param value Value to set for the isHostnameMismatch property.
     */
    public void setIsHostnameMismatch(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHostnameMismatch", value);
    }
    /**
     * Sets the isNotAfter property value. Indicates whether the certificate is expired and no longer valid.
     * @param value Value to set for the isNotAfter property.
     */
    public void setIsNotAfter(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isNotAfter", value);
    }
    /**
     * Sets the isNotBefore property value. Indicates whether the certificate isn&apos;t yet valid based on its activation date.
     * @param value Value to set for the isNotBefore property.
     */
    public void setIsNotBefore(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isNotBefore", value);
    }
    /**
     * Sets the isRevoked property value. Indicates whether the issuing certificate authority revoked the certificate.
     * @param value Value to set for the isRevoked property.
     */
    public void setIsRevoked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRevoked", value);
    }
    /**
     * Sets the isSelfSigned property value. Indicates whether the certificate is self-signed rather than issued by a trusted certificate authority.
     * @param value Value to set for the isSelfSigned property.
     */
    public void setIsSelfSigned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSelfSigned", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
