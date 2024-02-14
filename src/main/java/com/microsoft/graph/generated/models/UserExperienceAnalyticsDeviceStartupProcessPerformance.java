package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics device startup process performance.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsDeviceStartupProcessPerformance extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserExperienceAnalyticsDeviceStartupProcessPerformance} and sets the default values.
     */
    public UserExperienceAnalyticsDeviceStartupProcessPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserExperienceAnalyticsDeviceStartupProcessPerformance}
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceStartupProcessPerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceStartupProcessPerformance();
    }
    /**
     * Gets the deviceCount property value. The count of devices which initiated this process on startup. Supports: $filter, $select, $OrderBy. Read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDeviceCount() {
        return this.backingStore.get("deviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getLongValue()); });
        deserializerMap.put("medianImpactInMs", (n) -> { this.setMedianImpactInMs(n.getLongValue()); });
        deserializerMap.put("processName", (n) -> { this.setProcessName(n.getStringValue()); });
        deserializerMap.put("productName", (n) -> { this.setProductName(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("totalImpactInMs", (n) -> { this.setTotalImpactInMs(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the medianImpactInMs property value. The median impact of startup process on device boot time in milliseconds. Supports: $filter, $select, $OrderBy. Read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMedianImpactInMs() {
        return this.backingStore.get("medianImpactInMs");
    }
    /**
     * Gets the processName property value. The name of the startup process. Examples: outlook, excel. Supports: $select, $OrderBy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProcessName() {
        return this.backingStore.get("processName");
    }
    /**
     * Gets the productName property value. The product name of the startup process. Examples: Microsoft Outlook, Microsoft Excel. Supports: $select, $OrderBy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductName() {
        return this.backingStore.get("productName");
    }
    /**
     * Gets the publisher property value. The publisher of the startup process. Examples: Microsoft Corporation, Contoso Corp. Supports: $select, $OrderBy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.backingStore.get("publisher");
    }
    /**
     * Gets the totalImpactInMs property value. The total impact of startup process on device boot time in milliseconds. Supports: $filter, $select, $OrderBy. Read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalImpactInMs() {
        return this.backingStore.get("totalImpactInMs");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("deviceCount", this.getDeviceCount());
        writer.writeLongValue("medianImpactInMs", this.getMedianImpactInMs());
        writer.writeStringValue("processName", this.getProcessName());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeLongValue("totalImpactInMs", this.getTotalImpactInMs());
    }
    /**
     * Sets the deviceCount property value. The count of devices which initiated this process on startup. Supports: $filter, $select, $OrderBy. Read-only.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("deviceCount", value);
    }
    /**
     * Sets the medianImpactInMs property value. The median impact of startup process on device boot time in milliseconds. Supports: $filter, $select, $OrderBy. Read-only.
     * @param value Value to set for the medianImpactInMs property.
     */
    public void setMedianImpactInMs(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("medianImpactInMs", value);
    }
    /**
     * Sets the processName property value. The name of the startup process. Examples: outlook, excel. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the processName property.
     */
    public void setProcessName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("processName", value);
    }
    /**
     * Sets the productName property value. The product name of the startup process. Examples: Microsoft Outlook, Microsoft Excel. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the productName property.
     */
    public void setProductName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productName", value);
    }
    /**
     * Sets the publisher property value. The publisher of the startup process. Examples: Microsoft Corporation, Contoso Corp. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisher", value);
    }
    /**
     * Sets the totalImpactInMs property value. The total impact of startup process on device boot time in milliseconds. Supports: $filter, $select, $OrderBy. Read-only.
     * @param value Value to set for the totalImpactInMs property.
     */
    public void setTotalImpactInMs(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalImpactInMs", value);
    }
}
