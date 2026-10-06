package com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentschedulerequests.item.updaterequest;

import com.microsoft.graph.models.EvaluationOutcome;
import com.microsoft.graph.models.RequestSchedule;
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
public class UpdateRequestPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UpdateRequestPostRequestBody} and sets the default values.
     */
    public UpdateRequestPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateRequestPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static UpdateRequestPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateRequestPostRequestBody();
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
     * Gets the evaluationId property value. The evaluationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEvaluationId() {
        return this.backingStore.get("evaluationId");
    }
    /**
     * Gets the evaluationOutcome property value. The evaluationOutcome property
     * @return a {@link EvaluationOutcome}
     */
    @jakarta.annotation.Nullable
    public EvaluationOutcome getEvaluationOutcome() {
        return this.backingStore.get("evaluationOutcome");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("evaluationId", (n) -> { this.setEvaluationId(n.getStringValue()); });
        deserializerMap.put("evaluationOutcome", (n) -> { this.setEvaluationOutcome(n.getEnumValue(EvaluationOutcome::forValue)); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("scheduleInfo", (n) -> { this.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reason property value. The reason property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.backingStore.get("reason");
    }
    /**
     * Gets the scheduleInfo property value. The scheduleInfo property
     * @return a {@link RequestSchedule}
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this.backingStore.get("scheduleInfo");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("evaluationId", this.getEvaluationId());
        writer.writeEnumValue("evaluationOutcome", this.getEvaluationOutcome());
        writer.writeStringValue("reason", this.getReason());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
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
     * Sets the evaluationId property value. The evaluationId property
     * @param value Value to set for the evaluationId property.
     */
    public void setEvaluationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("evaluationId", value);
    }
    /**
     * Sets the evaluationOutcome property value. The evaluationOutcome property
     * @param value Value to set for the evaluationOutcome property.
     */
    public void setEvaluationOutcome(@jakarta.annotation.Nullable final EvaluationOutcome value) {
        this.backingStore.set("evaluationOutcome", value);
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reason", value);
    }
    /**
     * Sets the scheduleInfo property value. The scheduleInfo property
     * @param value Value to set for the scheduleInfo property.
     */
    public void setScheduleInfo(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.backingStore.set("scheduleInfo", value);
    }
}
