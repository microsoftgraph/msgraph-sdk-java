package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivateRunScope extends ActivationScope implements Parsable {
    /**
     * Instantiates a new {@link ActivateRunScope} and sets the default values.
     */
    public ActivateRunScope() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.activateRunScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ActivateRunScope}
     */
    @jakarta.annotation.Nonnull
    public static ActivateRunScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivateRunScope();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("run", (n) -> { this.setRun(n.getObjectValue(Run::createFromDiscriminatorValue)); });
        deserializerMap.put("taskScope", (n) -> { this.setTaskScope(n.getEnumValue(ActivationTaskScopeType::forValue)); });
        deserializerMap.put("userScope", (n) -> { this.setUserScope(n.getEnumValue(ActivationUserScopeType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the run property value. The run property
     * @return a {@link Run}
     */
    @jakarta.annotation.Nullable
    public Run getRun() {
        return this.backingStore.get("run");
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
     * Gets the userScope property value. The userScope property
     * @return a {@link ActivationUserScopeType}
     */
    @jakarta.annotation.Nullable
    public ActivationUserScopeType getUserScope() {
        return this.backingStore.get("userScope");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("run", this.getRun());
        writer.writeEnumValue("taskScope", this.getTaskScope());
        writer.writeEnumValue("userScope", this.getUserScope());
    }
    /**
     * Sets the run property value. The run property
     * @param value Value to set for the run property.
     */
    public void setRun(@jakarta.annotation.Nullable final Run value) {
        this.backingStore.set("run", value);
    }
    /**
     * Sets the taskScope property value. The taskScope property
     * @param value Value to set for the taskScope property.
     */
    public void setTaskScope(@jakarta.annotation.Nullable final ActivationTaskScopeType value) {
        this.backingStore.set("taskScope", value);
    }
    /**
     * Sets the userScope property value. The userScope property
     * @param value Value to set for the userScope property.
     */
    public void setUserScope(@jakarta.annotation.Nullable final ActivationUserScopeType value) {
        this.backingStore.set("userScope", value);
    }
}
