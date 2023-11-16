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
public class Fido2KeyRestrictions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new Fido2KeyRestrictions and sets the default values.
     */
    public Fido2KeyRestrictions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Fido2KeyRestrictions
     */
    @jakarta.annotation.Nonnull
    public static Fido2KeyRestrictions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fido2KeyRestrictions();
    }
    /**
     * Gets the aaGuids property value. A collection of Authenticator Attestation GUIDs. AADGUIDs define key types and manufacturers.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAaGuids() {
        return this.backingStore.get("aaGuids");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the enforcementType property value. Enforcement type. Possible values are: allow, block.
     * @return a Fido2RestrictionEnforcementType
     */
    @jakarta.annotation.Nullable
    public Fido2RestrictionEnforcementType getEnforcementType() {
        return this.backingStore.get("enforcementType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("aaGuids", (n) -> { this.setAaGuids(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enforcementType", (n) -> { this.setEnforcementType(n.getEnumValue(Fido2RestrictionEnforcementType.class)); });
        deserializerMap.put("isEnforced", (n) -> { this.setIsEnforced(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnforced property value. Determines if the configured key enforcement is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnforced() {
        return this.backingStore.get("isEnforced");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
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
        writer.writeCollectionOfPrimitiveValues("aaGuids", this.getAaGuids());
        writer.writeEnumValue("enforcementType", this.getEnforcementType());
        writer.writeBooleanValue("isEnforced", this.getIsEnforced());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the aaGuids property value. A collection of Authenticator Attestation GUIDs. AADGUIDs define key types and manufacturers.
     * @param value Value to set for the aaGuids property.
     */
    public void setAaGuids(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("aaGuids", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the enforcementType property value. Enforcement type. Possible values are: allow, block.
     * @param value Value to set for the enforcementType property.
     */
    public void setEnforcementType(@jakarta.annotation.Nullable final Fido2RestrictionEnforcementType value) {
        this.backingStore.set("enforcementType", value);
    }
    /**
     * Sets the isEnforced property value. Determines if the configured key enforcement is enabled.
     * @param value Value to set for the isEnforced property.
     */
    public void setIsEnforced(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnforced", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
