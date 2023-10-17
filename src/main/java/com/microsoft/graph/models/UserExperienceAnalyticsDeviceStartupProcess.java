package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics device startup process details.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsDeviceStartupProcess extends Entity implements Parsable {
    /**
     * The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     */
    private String managedDeviceId;
    /**
     * The name of the process. Examples: outlook, excel. Supports: $select, $OrderBy. Read-only.
     */
    private String processName;
    /**
     * The product name of the process. Examples: Microsoft Outlook, Microsoft Excel. Supports: $select, $OrderBy. Read-only.
     */
    private String productName;
    /**
     * The publisher of the process. Examples: Microsoft Corporation, Contoso Corp. Supports: $select, $OrderBy. Read-only.
     */
    private String publisher;
    /**
     * The impact of startup process on device boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     */
    private Integer startupImpactInMs;
    /**
     * Instantiates a new UserExperienceAnalyticsDeviceStartupProcess and sets the default values.
     */
    public UserExperienceAnalyticsDeviceStartupProcess() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsDeviceStartupProcess
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceStartupProcess createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceStartupProcess();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("processName", (n) -> { this.setProcessName(n.getStringValue()); });
        deserializerMap.put("productName", (n) -> { this.setProductName(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("startupImpactInMs", (n) -> { this.setStartupImpactInMs(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceId property value. The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }
    /**
     * Gets the processName property value. The name of the process. Examples: outlook, excel. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProcessName() {
        return this.processName;
    }
    /**
     * Gets the productName property value. The product name of the process. Examples: Microsoft Outlook, Microsoft Excel. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductName() {
        return this.productName;
    }
    /**
     * Gets the publisher property value. The publisher of the process. Examples: Microsoft Corporation, Contoso Corp. Supports: $select, $OrderBy. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * Gets the startupImpactInMs property value. The impact of startup process on device boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getStartupImpactInMs() {
        return this.startupImpactInMs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("processName", this.getProcessName());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeIntegerValue("startupImpactInMs", this.getStartupImpactInMs());
    }
    /**
     * Sets the managedDeviceId property value. The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.managedDeviceId = value;
    }
    /**
     * Sets the processName property value. The name of the process. Examples: outlook, excel. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the processName property.
     */
    public void setProcessName(@jakarta.annotation.Nullable final String value) {
        this.processName = value;
    }
    /**
     * Sets the productName property value. The product name of the process. Examples: Microsoft Outlook, Microsoft Excel. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the productName property.
     */
    public void setProductName(@jakarta.annotation.Nullable final String value) {
        this.productName = value;
    }
    /**
     * Sets the publisher property value. The publisher of the process. Examples: Microsoft Corporation, Contoso Corp. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.publisher = value;
    }
    /**
     * Sets the startupImpactInMs property value. The impact of startup process on device boot time in milliseconds. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the startupImpactInMs property.
     */
    public void setStartupImpactInMs(@jakarta.annotation.Nullable final Integer value) {
        this.startupImpactInMs = value;
    }
}
