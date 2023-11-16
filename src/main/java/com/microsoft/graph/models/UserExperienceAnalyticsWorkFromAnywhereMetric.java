package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics metric for work from anywhere report.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsWorkFromAnywhereMetric extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsWorkFromAnywhereMetric and sets the default values.
     */
    public UserExperienceAnalyticsWorkFromAnywhereMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsWorkFromAnywhereMetric
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsWorkFromAnywhereMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsWorkFromAnywhereMetric();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("metricDevices", (n) -> { this.setMetricDevices(n.getCollectionOfObjectValues(UserExperienceAnalyticsWorkFromAnywhereDevice::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the metricDevices property value. The work from anywhere metric devices. Read-only.
     * @return a java.util.List<UserExperienceAnalyticsWorkFromAnywhereDevice>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsWorkFromAnywhereDevice> getMetricDevices() {
        return this.BackingStore.get("metricDevices");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("metricDevices", this.getMetricDevices());
    }
    /**
     * Sets the metricDevices property value. The work from anywhere metric devices. Read-only.
     * @param value Value to set for the metricDevices property.
     */
    public void setMetricDevices(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsWorkFromAnywhereDevice> value) {
        this.BackingStore.set("metricDevices", value);
    }
}
