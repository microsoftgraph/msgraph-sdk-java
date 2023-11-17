package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The value in an user experience analytics insight.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InsightValueDouble extends UserExperienceAnalyticsInsightValue implements Parsable {
    /**
     * Instantiates a new InsightValueDouble and sets the default values.
     */
    public InsightValueDouble() {
        super();
        this.setOdataType("#microsoft.graph.insightValueDouble");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InsightValueDouble
     */
    @jakarta.annotation.Nonnull
    public static InsightValueDouble createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InsightValueDouble();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The double value of the user experience analytics insight.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeDoubleValue("value", this.getValue());
    }
    /**
     * Sets the value property value. The double value of the user experience analytics insight.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("value", value);
    }
}
