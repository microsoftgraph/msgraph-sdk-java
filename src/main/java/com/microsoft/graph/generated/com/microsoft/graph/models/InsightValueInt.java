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
public class InsightValueInt extends UserExperienceAnalyticsInsightValue implements Parsable {
    /**
     * Instantiates a new InsightValueInt and sets the default values.
     */
    public InsightValueInt() {
        super();
        this.setOdataType("#microsoft.graph.insightValueInt");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InsightValueInt
     */
    @jakarta.annotation.Nonnull
    public static InsightValueInt createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InsightValueInt();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The int value of the user experience analytics insight.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("value", this.getValue());
    }
    /**
     * Sets the value property value. The int value of the user experience analytics insight.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("value", value);
    }
}
