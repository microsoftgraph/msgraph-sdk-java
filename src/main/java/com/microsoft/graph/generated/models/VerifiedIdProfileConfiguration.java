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
public class VerifiedIdProfileConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link VerifiedIdProfileConfiguration} and sets the default values.
     */
    public VerifiedIdProfileConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VerifiedIdProfileConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static VerifiedIdProfileConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifiedIdProfileConfiguration();
    }
    /**
     * Gets the acceptedIssuer property value. Trusted Verified ID issuer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAcceptedIssuer() {
        return this.backingStore.get("acceptedIssuer");
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
     * Gets the claimBindings property value. Claim bindings from Verified ID to source attributes.
     * @return a {@link java.util.List<ClaimBinding>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ClaimBinding> getClaimBindings() {
        return this.backingStore.get("claimBindings");
    }
    /**
     * Gets the claimBindingSource property value. The claimBindingSource property
     * @return a {@link ClaimBindingSource}
     */
    @jakarta.annotation.Nullable
    public ClaimBindingSource getClaimBindingSource() {
        return this.backingStore.get("claimBindingSource");
    }
    /**
     * Gets the claimValidation property value. The claimValidation property
     * @return a {@link ClaimValidation}
     */
    @jakarta.annotation.Nullable
    public ClaimValidation getClaimValidation() {
        return this.backingStore.get("claimValidation");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("acceptedIssuer", (n) -> { this.setAcceptedIssuer(n.getStringValue()); });
        deserializerMap.put("claimBindings", (n) -> { this.setClaimBindings(n.getCollectionOfObjectValues(ClaimBinding::createFromDiscriminatorValue)); });
        deserializerMap.put("claimBindingSource", (n) -> { this.setClaimBindingSource(n.getEnumValue(ClaimBindingSource::forValue)); });
        deserializerMap.put("claimValidation", (n) -> { this.setClaimValidation(n.getObjectValue(ClaimValidation::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the type property value. Verified ID type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("acceptedIssuer", this.getAcceptedIssuer());
        writer.writeCollectionOfObjectValues("claimBindings", this.getClaimBindings());
        writer.writeEnumValue("claimBindingSource", this.getClaimBindingSource());
        writer.writeObjectValue("claimValidation", this.getClaimValidation());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acceptedIssuer property value. Trusted Verified ID issuer.
     * @param value Value to set for the acceptedIssuer property.
     */
    public void setAcceptedIssuer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("acceptedIssuer", value);
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
     * Sets the claimBindings property value. Claim bindings from Verified ID to source attributes.
     * @param value Value to set for the claimBindings property.
     */
    public void setClaimBindings(@jakarta.annotation.Nullable final java.util.List<ClaimBinding> value) {
        this.backingStore.set("claimBindings", value);
    }
    /**
     * Sets the claimBindingSource property value. The claimBindingSource property
     * @param value Value to set for the claimBindingSource property.
     */
    public void setClaimBindingSource(@jakarta.annotation.Nullable final ClaimBindingSource value) {
        this.backingStore.set("claimBindingSource", value);
    }
    /**
     * Sets the claimValidation property value. The claimValidation property
     * @param value Value to set for the claimValidation property.
     */
    public void setClaimValidation(@jakarta.annotation.Nullable final ClaimValidation value) {
        this.backingStore.set("claimValidation", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the type property value. Verified ID type.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("type", value);
    }
}
