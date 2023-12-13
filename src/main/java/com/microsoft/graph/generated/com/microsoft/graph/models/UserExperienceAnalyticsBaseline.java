package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics baseline entity contains baseline values against which to compare the user experience analytics scores.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsBaseline extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsBaseline and sets the default values.
     */
    public UserExperienceAnalyticsBaseline() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsBaseline
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsBaseline createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBaseline();
    }
    /**
     * Gets the appHealthMetrics property value. The scores and insights for the application health metrics.
     * @return a UserExperienceAnalyticsCategory
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsCategory getAppHealthMetrics() {
        return this.backingStore.get("appHealthMetrics");
    }
    /**
     * Gets the batteryHealthMetrics property value. The scores and insights for the battery health metrics.
     * @return a UserExperienceAnalyticsCategory
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsCategory getBatteryHealthMetrics() {
        return this.backingStore.get("batteryHealthMetrics");
    }
    /**
     * Gets the bestPracticesMetrics property value. The scores and insights for the best practices metrics.
     * @return a UserExperienceAnalyticsCategory
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsCategory getBestPracticesMetrics() {
        return this.backingStore.get("bestPracticesMetrics");
    }
    /**
     * Gets the createdDateTime property value. The date the custom baseline was created. The value cannot be modified and is automatically populated when the baseline is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deviceBootPerformanceMetrics property value. The scores and insights for the device boot performance metrics.
     * @return a UserExperienceAnalyticsCategory
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsCategory getDeviceBootPerformanceMetrics() {
        return this.backingStore.get("deviceBootPerformanceMetrics");
    }
    /**
     * Gets the displayName property value. The name of the baseline.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appHealthMetrics", (n) -> { this.setAppHealthMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("batteryHealthMetrics", (n) -> { this.setBatteryHealthMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("bestPracticesMetrics", (n) -> { this.setBestPracticesMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceBootPerformanceMetrics", (n) -> { this.setDeviceBootPerformanceMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isBuiltIn", (n) -> { this.setIsBuiltIn(n.getBooleanValue()); });
        deserializerMap.put("rebootAnalyticsMetrics", (n) -> { this.setRebootAnalyticsMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("resourcePerformanceMetrics", (n) -> { this.setResourcePerformanceMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("workFromAnywhereMetrics", (n) -> { this.setWorkFromAnywhereMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isBuiltIn property value. When TRUE, indicates the current baseline is the commercial median baseline. When FALSE, indicates it is a custom baseline. FALSE by default.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this.backingStore.get("isBuiltIn");
    }
    /**
     * Gets the rebootAnalyticsMetrics property value. The scores and insights for the reboot analytics metrics.
     * @return a UserExperienceAnalyticsCategory
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsCategory getRebootAnalyticsMetrics() {
        return this.backingStore.get("rebootAnalyticsMetrics");
    }
    /**
     * Gets the resourcePerformanceMetrics property value. The scores and insights for the resource performance metrics.
     * @return a UserExperienceAnalyticsCategory
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsCategory getResourcePerformanceMetrics() {
        return this.backingStore.get("resourcePerformanceMetrics");
    }
    /**
     * Gets the workFromAnywhereMetrics property value. The scores and insights for the work from anywhere metrics.
     * @return a UserExperienceAnalyticsCategory
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsCategory getWorkFromAnywhereMetrics() {
        return this.backingStore.get("workFromAnywhereMetrics");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("appHealthMetrics", this.getAppHealthMetrics());
        writer.writeObjectValue("batteryHealthMetrics", this.getBatteryHealthMetrics());
        writer.writeObjectValue("bestPracticesMetrics", this.getBestPracticesMetrics());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("deviceBootPerformanceMetrics", this.getDeviceBootPerformanceMetrics());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isBuiltIn", this.getIsBuiltIn());
        writer.writeObjectValue("rebootAnalyticsMetrics", this.getRebootAnalyticsMetrics());
        writer.writeObjectValue("resourcePerformanceMetrics", this.getResourcePerformanceMetrics());
        writer.writeObjectValue("workFromAnywhereMetrics", this.getWorkFromAnywhereMetrics());
    }
    /**
     * Sets the appHealthMetrics property value. The scores and insights for the application health metrics.
     * @param value Value to set for the appHealthMetrics property.
     */
    public void setAppHealthMetrics(@jakarta.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.backingStore.set("appHealthMetrics", value);
    }
    /**
     * Sets the batteryHealthMetrics property value. The scores and insights for the battery health metrics.
     * @param value Value to set for the batteryHealthMetrics property.
     */
    public void setBatteryHealthMetrics(@jakarta.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.backingStore.set("batteryHealthMetrics", value);
    }
    /**
     * Sets the bestPracticesMetrics property value. The scores and insights for the best practices metrics.
     * @param value Value to set for the bestPracticesMetrics property.
     */
    public void setBestPracticesMetrics(@jakarta.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.backingStore.set("bestPracticesMetrics", value);
    }
    /**
     * Sets the createdDateTime property value. The date the custom baseline was created. The value cannot be modified and is automatically populated when the baseline is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deviceBootPerformanceMetrics property value. The scores and insights for the device boot performance metrics.
     * @param value Value to set for the deviceBootPerformanceMetrics property.
     */
    public void setDeviceBootPerformanceMetrics(@jakarta.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.backingStore.set("deviceBootPerformanceMetrics", value);
    }
    /**
     * Sets the displayName property value. The name of the baseline.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isBuiltIn property value. When TRUE, indicates the current baseline is the commercial median baseline. When FALSE, indicates it is a custom baseline. FALSE by default.
     * @param value Value to set for the isBuiltIn property.
     */
    public void setIsBuiltIn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBuiltIn", value);
    }
    /**
     * Sets the rebootAnalyticsMetrics property value. The scores and insights for the reboot analytics metrics.
     * @param value Value to set for the rebootAnalyticsMetrics property.
     */
    public void setRebootAnalyticsMetrics(@jakarta.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.backingStore.set("rebootAnalyticsMetrics", value);
    }
    /**
     * Sets the resourcePerformanceMetrics property value. The scores and insights for the resource performance metrics.
     * @param value Value to set for the resourcePerformanceMetrics property.
     */
    public void setResourcePerformanceMetrics(@jakarta.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.backingStore.set("resourcePerformanceMetrics", value);
    }
    /**
     * Sets the workFromAnywhereMetrics property value. The scores and insights for the work from anywhere metrics.
     * @param value Value to set for the workFromAnywhereMetrics property.
     */
    public void setWorkFromAnywhereMetrics(@jakarta.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.backingStore.set("workFromAnywhereMetrics", value);
    }
}
