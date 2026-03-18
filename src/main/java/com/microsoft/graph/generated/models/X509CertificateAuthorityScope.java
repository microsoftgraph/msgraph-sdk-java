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
public class X509CertificateAuthorityScope implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link X509CertificateAuthorityScope} and sets the default values.
     */
    public X509CertificateAuthorityScope() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link X509CertificateAuthorityScope}
     */
    @jakarta.annotation.Nonnull
    public static X509CertificateAuthorityScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new X509CertificateAuthorityScope();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("includeTargets", (n) -> { this.setIncludeTargets(n.getCollectionOfObjectValues(IncludeTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("publicKeyInfrastructureIdentifier", (n) -> { this.setPublicKeyInfrastructureIdentifier(n.getStringValue()); });
        deserializerMap.put("subjectKeyIdentifier", (n) -> { this.setSubjectKeyIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. The includeTargets property
     * @return a {@link java.util.List<IncludeTarget>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IncludeTarget> getIncludeTargets() {
        return this.backingStore.get("includeTargets");
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
     * Gets the publicKeyInfrastructureIdentifier property value. The publicKeyInfrastructureIdentifier property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublicKeyInfrastructureIdentifier() {
        return this.backingStore.get("publicKeyInfrastructureIdentifier");
    }
    /**
     * Gets the subjectKeyIdentifier property value. The subjectKeyIdentifier property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubjectKeyIdentifier() {
        return this.backingStore.get("subjectKeyIdentifier");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("publicKeyInfrastructureIdentifier", this.getPublicKeyInfrastructureIdentifier());
        writer.writeStringValue("subjectKeyIdentifier", this.getSubjectKeyIdentifier());
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
     * Sets the includeTargets property value. The includeTargets property
     * @param value Value to set for the includeTargets property.
     */
    public void setIncludeTargets(@jakarta.annotation.Nullable final java.util.List<IncludeTarget> value) {
        this.backingStore.set("includeTargets", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the publicKeyInfrastructureIdentifier property value. The publicKeyInfrastructureIdentifier property
     * @param value Value to set for the publicKeyInfrastructureIdentifier property.
     */
    public void setPublicKeyInfrastructureIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publicKeyInfrastructureIdentifier", value);
    }
    /**
     * Sets the subjectKeyIdentifier property value. The subjectKeyIdentifier property
     * @param value Value to set for the subjectKeyIdentifier property.
     */
    public void setSubjectKeyIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subjectKeyIdentifier", value);
    }
}
