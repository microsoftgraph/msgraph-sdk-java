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
public class AwaitedWorkflowProcessingResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AwaitedWorkflowProcessingResult} and sets the default values.
     */
    public AwaitedWorkflowProcessingResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AwaitedWorkflowProcessingResult}
     */
    @jakarta.annotation.Nonnull
    public static AwaitedWorkflowProcessingResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwaitedWorkflowProcessingResult();
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
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("processingStatus", (n) -> { this.setProcessingStatus(n.getEnumValue(LifecycleWorkflowProcessingStatus::forValue)); });
        deserializerMap.put("statusReasons", (n) -> { this.setStatusReasons(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getObjectValue(WorkflowSubject::createFromDiscriminatorValue)); });
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
     * Gets the processingStatus property value. The processingStatus property
     * @return a {@link LifecycleWorkflowProcessingStatus}
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowProcessingStatus getProcessingStatus() {
        return this.backingStore.get("processingStatus");
    }
    /**
     * Gets the statusReasons property value. A collection of reasons for the current processing status. May be empty.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStatusReasons() {
        return this.backingStore.get("statusReasons");
    }
    /**
     * Gets the subject property value. The subject that was processed by the workflow.
     * @return a {@link WorkflowSubject}
     */
    @jakarta.annotation.Nullable
    public WorkflowSubject getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("processingStatus", this.getProcessingStatus());
        writer.writeCollectionOfPrimitiveValues("statusReasons", this.getStatusReasons());
        writer.writeObjectValue("subject", this.getSubject());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the processingStatus property value. The processingStatus property
     * @param value Value to set for the processingStatus property.
     */
    public void setProcessingStatus(@jakarta.annotation.Nullable final LifecycleWorkflowProcessingStatus value) {
        this.backingStore.set("processingStatus", value);
    }
    /**
     * Sets the statusReasons property value. A collection of reasons for the current processing status. May be empty.
     * @param value Value to set for the statusReasons property.
     */
    public void setStatusReasons(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("statusReasons", value);
    }
    /**
     * Sets the subject property value. The subject that was processed by the workflow.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final WorkflowSubject value) {
        this.backingStore.set("subject", value);
    }
}
