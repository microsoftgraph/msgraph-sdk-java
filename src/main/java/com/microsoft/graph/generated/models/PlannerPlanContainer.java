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
public class PlannerPlanContainer implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PlannerPlanContainer} and sets the default values.
     */
    public PlannerPlanContainer() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerPlanContainer}
     */
    @jakarta.annotation.Nonnull
    public static PlannerPlanContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerPlanContainer();
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
     * Gets the containerId property value. The identifier of the resource that contains the plan. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContainerId() {
        return this.backingStore.get("containerId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("containerId", (n) -> { this.setContainerId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(PlannerContainerType::forValue)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
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
     * Gets the type property value. The type of the resource that contains the plan. For supported types, see the previous table. The possible values are: group, unknownFutureValue, roster. Use the Prefer: include-unknown-enum-members request header to get the following members in this evolvable enum: roster. Optional.
     * @return a {@link PlannerContainerType}
     */
    @jakarta.annotation.Nullable
    public PlannerContainerType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Gets the url property value. The full canonical URL of the container. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.backingStore.get("url");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("containerId", this.getContainerId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("type", this.getType());
        writer.writeStringValue("url", this.getUrl());
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
     * Sets the containerId property value. The identifier of the resource that contains the plan. Optional.
     * @param value Value to set for the containerId property.
     */
    public void setContainerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("containerId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the type property value. The type of the resource that contains the plan. For supported types, see the previous table. The possible values are: group, unknownFutureValue, roster. Use the Prefer: include-unknown-enum-members request header to get the following members in this evolvable enum: roster. Optional.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final PlannerContainerType value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the url property value. The full canonical URL of the container. Optional.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("url", value);
    }
}
