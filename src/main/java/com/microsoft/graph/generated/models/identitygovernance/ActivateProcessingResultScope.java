package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivateProcessingResultScope extends ActivationScope implements Parsable {
    /**
     * Instantiates a new {@link ActivateProcessingResultScope} and sets the default values.
     */
    public ActivateProcessingResultScope() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.activateProcessingResultScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ActivateProcessingResultScope}
     */
    @jakarta.annotation.Nonnull
    public static ActivateProcessingResultScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivateProcessingResultScope();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("processingResults", (n) -> { this.setProcessingResults(n.getCollectionOfObjectValues(UserProcessingResult::createFromDiscriminatorValue)); });
        deserializerMap.put("taskScope", (n) -> { this.setTaskScope(n.getEnumValue(ActivationTaskScopeType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the processingResults property value. The processingResults property
     * @return a {@link java.util.List<UserProcessingResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserProcessingResult> getProcessingResults() {
        return this.backingStore.get("processingResults");
    }
    /**
     * Gets the taskScope property value. The taskScope property
     * @return a {@link ActivationTaskScopeType}
     */
    @jakarta.annotation.Nullable
    public ActivationTaskScopeType getTaskScope() {
        return this.backingStore.get("taskScope");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("processingResults", this.getProcessingResults());
        writer.writeEnumValue("taskScope", this.getTaskScope());
    }
    /**
     * Sets the processingResults property value. The processingResults property
     * @param value Value to set for the processingResults property.
     */
    public void setProcessingResults(@jakarta.annotation.Nullable final java.util.List<UserProcessingResult> value) {
        this.backingStore.set("processingResults", value);
    }
    /**
     * Sets the taskScope property value. The taskScope property
     * @param value Value to set for the taskScope property.
     */
    public void setTaskScope(@jakarta.annotation.Nullable final ActivationTaskScopeType value) {
        this.backingStore.set("taskScope", value);
    }
}
