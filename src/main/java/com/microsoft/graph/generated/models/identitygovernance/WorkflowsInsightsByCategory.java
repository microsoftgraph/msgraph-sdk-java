package com.microsoft.graph.models.identitygovernance;

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
public class WorkflowsInsightsByCategory implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WorkflowsInsightsByCategory} and sets the default values.
     */
    public WorkflowsInsightsByCategory() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkflowsInsightsByCategory}
     */
    @jakarta.annotation.Nonnull
    public static WorkflowsInsightsByCategory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkflowsInsightsByCategory();
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
     * Gets the failedJoinerRuns property value. Failed 'Joiner' workflows processed in a tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedJoinerRuns() {
        return this.backingStore.get("failedJoinerRuns");
    }
    /**
     * Gets the failedLeaverRuns property value. Failed 'Leaver' workflows processed in a tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedLeaverRuns() {
        return this.backingStore.get("failedLeaverRuns");
    }
    /**
     * Gets the failedMoverRuns property value. Failed 'Mover' workflows processed in a tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedMoverRuns() {
        return this.backingStore.get("failedMoverRuns");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("failedJoinerRuns", (n) -> { this.setFailedJoinerRuns(n.getIntegerValue()); });
        deserializerMap.put("failedLeaverRuns", (n) -> { this.setFailedLeaverRuns(n.getIntegerValue()); });
        deserializerMap.put("failedMoverRuns", (n) -> { this.setFailedMoverRuns(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("successfulJoinerRuns", (n) -> { this.setSuccessfulJoinerRuns(n.getIntegerValue()); });
        deserializerMap.put("successfulLeaverRuns", (n) -> { this.setSuccessfulLeaverRuns(n.getIntegerValue()); });
        deserializerMap.put("successfulMoverRuns", (n) -> { this.setSuccessfulMoverRuns(n.getIntegerValue()); });
        deserializerMap.put("totalJoinerRuns", (n) -> { this.setTotalJoinerRuns(n.getIntegerValue()); });
        deserializerMap.put("totalLeaverRuns", (n) -> { this.setTotalLeaverRuns(n.getIntegerValue()); });
        deserializerMap.put("totalMoverRuns", (n) -> { this.setTotalMoverRuns(n.getIntegerValue()); });
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
     * Gets the successfulJoinerRuns property value. Successful 'Joiner' workflows processed in a tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulJoinerRuns() {
        return this.backingStore.get("successfulJoinerRuns");
    }
    /**
     * Gets the successfulLeaverRuns property value. Successful 'Leaver' workflows processed in a tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulLeaverRuns() {
        return this.backingStore.get("successfulLeaverRuns");
    }
    /**
     * Gets the successfulMoverRuns property value. Successful 'Mover' workflows processed in a tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulMoverRuns() {
        return this.backingStore.get("successfulMoverRuns");
    }
    /**
     * Gets the totalJoinerRuns property value. Total 'Joiner' workflows processed in a tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalJoinerRuns() {
        return this.backingStore.get("totalJoinerRuns");
    }
    /**
     * Gets the totalLeaverRuns property value. Total 'Leaver' workflows processed in a tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLeaverRuns() {
        return this.backingStore.get("totalLeaverRuns");
    }
    /**
     * Gets the totalMoverRuns property value. Total 'Mover' workflows processed in a tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalMoverRuns() {
        return this.backingStore.get("totalMoverRuns");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedJoinerRuns", this.getFailedJoinerRuns());
        writer.writeIntegerValue("failedLeaverRuns", this.getFailedLeaverRuns());
        writer.writeIntegerValue("failedMoverRuns", this.getFailedMoverRuns());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("successfulJoinerRuns", this.getSuccessfulJoinerRuns());
        writer.writeIntegerValue("successfulLeaverRuns", this.getSuccessfulLeaverRuns());
        writer.writeIntegerValue("successfulMoverRuns", this.getSuccessfulMoverRuns());
        writer.writeIntegerValue("totalJoinerRuns", this.getTotalJoinerRuns());
        writer.writeIntegerValue("totalLeaverRuns", this.getTotalLeaverRuns());
        writer.writeIntegerValue("totalMoverRuns", this.getTotalMoverRuns());
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
     * Sets the failedJoinerRuns property value. Failed 'Joiner' workflows processed in a tenant.
     * @param value Value to set for the failedJoinerRuns property.
     */
    public void setFailedJoinerRuns(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedJoinerRuns", value);
    }
    /**
     * Sets the failedLeaverRuns property value. Failed 'Leaver' workflows processed in a tenant.
     * @param value Value to set for the failedLeaverRuns property.
     */
    public void setFailedLeaverRuns(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedLeaverRuns", value);
    }
    /**
     * Sets the failedMoverRuns property value. Failed 'Mover' workflows processed in a tenant.
     * @param value Value to set for the failedMoverRuns property.
     */
    public void setFailedMoverRuns(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedMoverRuns", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the successfulJoinerRuns property value. Successful 'Joiner' workflows processed in a tenant.
     * @param value Value to set for the successfulJoinerRuns property.
     */
    public void setSuccessfulJoinerRuns(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulJoinerRuns", value);
    }
    /**
     * Sets the successfulLeaverRuns property value. Successful 'Leaver' workflows processed in a tenant.
     * @param value Value to set for the successfulLeaverRuns property.
     */
    public void setSuccessfulLeaverRuns(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulLeaverRuns", value);
    }
    /**
     * Sets the successfulMoverRuns property value. Successful 'Mover' workflows processed in a tenant.
     * @param value Value to set for the successfulMoverRuns property.
     */
    public void setSuccessfulMoverRuns(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulMoverRuns", value);
    }
    /**
     * Sets the totalJoinerRuns property value. Total 'Joiner' workflows processed in a tenant.
     * @param value Value to set for the totalJoinerRuns property.
     */
    public void setTotalJoinerRuns(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalJoinerRuns", value);
    }
    /**
     * Sets the totalLeaverRuns property value. Total 'Leaver' workflows processed in a tenant.
     * @param value Value to set for the totalLeaverRuns property.
     */
    public void setTotalLeaverRuns(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalLeaverRuns", value);
    }
    /**
     * Sets the totalMoverRuns property value. Total 'Mover' workflows processed in a tenant.
     * @param value Value to set for the totalMoverRuns property.
     */
    public void setTotalMoverRuns(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalMoverRuns", value);
    }
}
