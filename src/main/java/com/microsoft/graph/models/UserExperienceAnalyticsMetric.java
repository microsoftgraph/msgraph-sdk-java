package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics metric contains the score and units of a metric of a user experience anlaytics category.
 */
public class UserExperienceAnalyticsMetric extends Entity implements Parsable {
    /**
     * The unit of the user experience analytics metric. Examples: none, percentage, count, seconds, score.
     */
    private String unit;
    /**
     * The value of the user experience analytics metric.
     */
    private Double value;
    /**
     * Instantiates a new userExperienceAnalyticsMetric and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsMetric
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsMetric createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsMetric();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the unit property value. The unit of the user experience analytics metric. Examples: none, percentage, count, seconds, score.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUnit() {
        return this.unit;
    }
    /**
     * Gets the value property value. The value of the user experience analytics metric.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("unit", this.getUnit());
        writer.writeDoubleValue("value", this.getValue());
    }
    /**
     * Sets the unit property value. The unit of the user experience analytics metric. Examples: none, percentage, count, seconds, score.
     * @param value Value to set for the unit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnit(@javax.annotation.Nullable final String value) {
        this.unit = value;
    }
    /**
     * Sets the value property value. The value of the user experience analytics metric.
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final Double value) {
        this.value = value;
    }
}
