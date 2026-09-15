package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class B2bRegistrationMetrics extends Entity implements Parsable {
    /**
     * Instantiates a new {@link B2bRegistrationMetrics} and sets the default values.
     */
    public B2bRegistrationMetrics() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link B2bRegistrationMetrics}
     */
    @jakarta.annotation.Nonnull
    public static B2bRegistrationMetrics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new B2bRegistrationMetrics();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("initial", (n) -> { this.setInitial(n.getObjectValue(B2BRegistrationMetricsInitial::createFromDiscriminatorValue)); });
        deserializerMap.put("recent", (n) -> { this.setRecent(n.getObjectValue(B2BRegistrationMetricsRecent::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initial property value. The initial property
     * @return a {@link B2BRegistrationMetricsInitial}
     */
    @jakarta.annotation.Nullable
    public B2BRegistrationMetricsInitial getInitial() {
        return this.backingStore.get("initial");
    }
    /**
     * Gets the recent property value. The recent property
     * @return a {@link B2BRegistrationMetricsRecent}
     */
    @jakarta.annotation.Nullable
    public B2BRegistrationMetricsRecent getRecent() {
        return this.backingStore.get("recent");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("initial", this.getInitial());
        writer.writeObjectValue("recent", this.getRecent());
    }
    /**
     * Sets the initial property value. The initial property
     * @param value Value to set for the initial property.
     */
    public void setInitial(@jakarta.annotation.Nullable final B2BRegistrationMetricsInitial value) {
        this.backingStore.set("initial", value);
    }
    /**
     * Sets the recent property value. The recent property
     * @param value Value to set for the recent property.
     */
    public void setRecent(@jakarta.annotation.Nullable final B2BRegistrationMetricsRecent value) {
        this.backingStore.set("recent", value);
    }
}
