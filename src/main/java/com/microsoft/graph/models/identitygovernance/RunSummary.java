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
public class RunSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new RunSummary and sets the default values.
     */
    public RunSummary() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunSummary
     */
    @jakarta.annotation.Nonnull
    public static RunSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the failedRuns property value. The number of failed workflow runs.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedRuns() {
        return this.BackingStore.get("failedRuns");
    }
    /**
     * Gets the failedTasks property value. The number of failed tasks of a workflow.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedTasks() {
        return this.BackingStore.get("failedTasks");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("failedRuns", (n) -> { this.setFailedRuns(n.getIntegerValue()); });
        deserializerMap.put("failedTasks", (n) -> { this.setFailedTasks(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("successfulRuns", (n) -> { this.setSuccessfulRuns(n.getIntegerValue()); });
        deserializerMap.put("totalRuns", (n) -> { this.setTotalRuns(n.getIntegerValue()); });
        deserializerMap.put("totalTasks", (n) -> { this.setTotalTasks(n.getIntegerValue()); });
        deserializerMap.put("totalUsers", (n) -> { this.setTotalUsers(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the successfulRuns property value. The number of successful workflow runs.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulRuns() {
        return this.BackingStore.get("successfulRuns");
    }
    /**
     * Gets the totalRuns property value. The total number of runs for a workflow.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalRuns() {
        return this.BackingStore.get("totalRuns");
    }
    /**
     * Gets the totalTasks property value. The total number of tasks processed by a workflow.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalTasks() {
        return this.BackingStore.get("totalTasks");
    }
    /**
     * Gets the totalUsers property value. The total number of users processed by a workflow.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalUsers() {
        return this.BackingStore.get("totalUsers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedRuns", this.getFailedRuns());
        writer.writeIntegerValue("failedTasks", this.getFailedTasks());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("successfulRuns", this.getSuccessfulRuns());
        writer.writeIntegerValue("totalRuns", this.getTotalRuns());
        writer.writeIntegerValue("totalTasks", this.getTotalTasks());
        writer.writeIntegerValue("totalUsers", this.getTotalUsers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the failedRuns property value. The number of failed workflow runs.
     * @param value Value to set for the failedRuns property.
     */
    public void setFailedRuns(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("failedRuns", value);
    }
    /**
     * Sets the failedTasks property value. The number of failed tasks of a workflow.
     * @param value Value to set for the failedTasks property.
     */
    public void setFailedTasks(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("failedTasks", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the successfulRuns property value. The number of successful workflow runs.
     * @param value Value to set for the successfulRuns property.
     */
    public void setSuccessfulRuns(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("successfulRuns", value);
    }
    /**
     * Sets the totalRuns property value. The total number of runs for a workflow.
     * @param value Value to set for the totalRuns property.
     */
    public void setTotalRuns(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalRuns", value);
    }
    /**
     * Sets the totalTasks property value. The total number of tasks processed by a workflow.
     * @param value Value to set for the totalTasks property.
     */
    public void setTotalTasks(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalTasks", value);
    }
    /**
     * Sets the totalUsers property value. The total number of users processed by a workflow.
     * @param value Value to set for the totalUsers property.
     */
    public void setTotalUsers(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalUsers", value);
    }
}
