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
public class ClaimBinding implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ClaimBinding} and sets the default values.
     */
    public ClaimBinding() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClaimBinding}
     */
    @jakarta.annotation.Nonnull
    public static ClaimBinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClaimBinding();
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
        deserializerMap.put("matchConfidenceLevel", (n) -> { this.setMatchConfidenceLevel(n.getEnumValue(MatchConfidenceLevel::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sourceAttribute", (n) -> { this.setSourceAttribute(n.getStringValue()); });
        deserializerMap.put("verifiedIdClaim", (n) -> { this.setVerifiedIdClaim(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the matchConfidenceLevel property value. The matchConfidenceLevel property
     * @return a {@link MatchConfidenceLevel}
     */
    @jakarta.annotation.Nullable
    public MatchConfidenceLevel getMatchConfidenceLevel() {
        return this.backingStore.get("matchConfidenceLevel");
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
     * Gets the sourceAttribute property value. Source attribute name from the source system, for example a directory attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceAttribute() {
        return this.backingStore.get("sourceAttribute");
    }
    /**
     * Gets the verifiedIdClaim property value. Verified ID claim name or path, for example vc.credentialSubject.firstName.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVerifiedIdClaim() {
        return this.backingStore.get("verifiedIdClaim");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("matchConfidenceLevel", this.getMatchConfidenceLevel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sourceAttribute", this.getSourceAttribute());
        writer.writeStringValue("verifiedIdClaim", this.getVerifiedIdClaim());
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
     * Sets the matchConfidenceLevel property value. The matchConfidenceLevel property
     * @param value Value to set for the matchConfidenceLevel property.
     */
    public void setMatchConfidenceLevel(@jakarta.annotation.Nullable final MatchConfidenceLevel value) {
        this.backingStore.set("matchConfidenceLevel", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sourceAttribute property value. Source attribute name from the source system, for example a directory attribute.
     * @param value Value to set for the sourceAttribute property.
     */
    public void setSourceAttribute(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceAttribute", value);
    }
    /**
     * Sets the verifiedIdClaim property value. Verified ID claim name or path, for example vc.credentialSubject.firstName.
     * @param value Value to set for the verifiedIdClaim property.
     */
    public void setVerifiedIdClaim(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("verifiedIdClaim", value);
    }
}
