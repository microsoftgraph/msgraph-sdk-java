package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MultiTenantApplicationMetrics extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MultiTenantApplicationMetrics} and sets the default values.
     */
    public MultiTenantApplicationMetrics() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MultiTenantApplicationMetrics}
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantApplicationMetrics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantApplicationMetrics();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("initial", (n) -> { this.setInitial(n.getObjectValue(MultiTenantApplicationMetricsInitial::createFromDiscriminatorValue)); });
        deserializerMap.put("recent", (n) -> { this.setRecent(n.getObjectValue(MultiTenantApplicationMetricsRecent::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initial property value. The initial property
     * @return a {@link MultiTenantApplicationMetricsInitial}
     */
    @jakarta.annotation.Nullable
    public MultiTenantApplicationMetricsInitial getInitial() {
        return this.backingStore.get("initial");
    }
    /**
     * Gets the recent property value. The recent property
     * @return a {@link MultiTenantApplicationMetricsRecent}
     */
    @jakarta.annotation.Nullable
    public MultiTenantApplicationMetricsRecent getRecent() {
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
    public void setInitial(@jakarta.annotation.Nullable final MultiTenantApplicationMetricsInitial value) {
        this.backingStore.set("initial", value);
    }
    /**
     * Sets the recent property value. The recent property
     * @param value Value to set for the recent property.
     */
    public void setRecent(@jakarta.annotation.Nullable final MultiTenantApplicationMetricsRecent value) {
        this.backingStore.set("recent", value);
    }
}
