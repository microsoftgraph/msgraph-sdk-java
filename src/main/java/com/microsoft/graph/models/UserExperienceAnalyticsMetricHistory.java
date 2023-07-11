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
public class UserExperienceAnalyticsMetricHistory extends Entity implements Parsable {
    /**
     * The Intune device id of the device.
     */
    private String deviceId;
    /**
     * The metric date time. The value cannot be modified and is automatically populated when the metric is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default.
     */
    private OffsetDateTime metricDateTime;
    /**
     * The user experience analytics metric type.
     */
    private String metricType;
    /**
     * Instantiates a new userExperienceAnalyticsMetricHistory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsMetricHistory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsMetricHistory
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsMetricHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsMetricHistory();
    }
    /**
     * Gets the deviceId property value. The Intune device id of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public OffsetDateTime getMetricDateTime() {
        return this.metricDateTime;
    }
    /**
     * Gets the metricType property value. The user experience analytics metric type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMetricType() {
        return this.metricType;
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
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeOffsetDateTimeValue("metricDateTime", this.getMetricDateTime());
        writer.writeStringValue("metricType", this.getMetricType());
    }
    /**
     * Sets the deviceId property value. The Intune device id of the device.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the metricDateTime property value. The metric date time. The value cannot be modified and is automatically populated when the metric is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default.
     * @param value Value to set for the metricDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetricDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.metricDateTime = value;
    }
    /**
     * Sets the metricType property value. The user experience analytics metric type.
     * @param value Value to set for the metricType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetricType(@javax.annotation.Nullable final String value) {
        this.metricType = value;
    }
}
