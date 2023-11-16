package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics metric history.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsMetricHistory extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsMetricHistory and sets the default values.
     */
    public UserExperienceAnalyticsMetricHistory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsMetricHistory
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsMetricHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsMetricHistory();
    }
    /**
     * Gets the deviceId property value. The Intune device id of the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.BackingStore.get("deviceId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("metricDateTime", (n) -> { this.setMetricDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("metricType", (n) -> { this.setMetricType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metricDateTime property value. The metric date time. The value cannot be modified and is automatically populated when the metric is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getMetricDateTime() {
        return this.BackingStore.get("metricDateTime");
    }
    /**
     * Gets the metricType property value. The user experience analytics metric type.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMetricType() {
        return this.BackingStore.get("metricType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeOffsetDateTimeValue("metricDateTime", this.getMetricDateTime());
        writer.writeStringValue("metricType", this.getMetricType());
    }
    /**
     * Sets the deviceId property value. The Intune device id of the device.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deviceId", value);
    }
    /**
     * Sets the metricDateTime property value. The metric date time. The value cannot be modified and is automatically populated when the metric is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default.
     * @param value Value to set for the metricDateTime property.
     */
    public void setMetricDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("metricDateTime", value);
    }
    /**
     * Sets the metricType property value. The user experience analytics metric type.
     * @param value Value to set for the metricType property.
     */
    public void setMetricType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("metricType", value);
    }
}
