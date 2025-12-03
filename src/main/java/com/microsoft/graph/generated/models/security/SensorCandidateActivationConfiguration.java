package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SensorCandidateActivationConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SensorCandidateActivationConfiguration} and sets the default values.
     */
    public SensorCandidateActivationConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SensorCandidateActivationConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static SensorCandidateActivationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensorCandidateActivationConfiguration();
    }
    /**
     * Gets the activationMode property value. The activationMode property
     * @return a {@link SensorCandidateActivationMode}
     */
    @jakarta.annotation.Nullable
    public SensorCandidateActivationMode getActivationMode() {
        return this.backingStore.get("activationMode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activationMode", (n) -> { this.setActivationMode(n.getEnumValue(SensorCandidateActivationMode::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("activationMode", this.getActivationMode());
    }
    /**
     * Sets the activationMode property value. The activationMode property
     * @param value Value to set for the activationMode property.
     */
    public void setActivationMode(@jakarta.annotation.Nullable final SensorCandidateActivationMode value) {
        this.backingStore.set("activationMode", value);
    }
}
