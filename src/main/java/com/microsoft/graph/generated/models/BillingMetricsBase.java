package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingMetricsBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link BillingMetricsBase} and sets the default values.
     */
    public BillingMetricsBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BillingMetricsBase}
     */
    @jakarta.annotation.Nonnull
    public static BillingMetricsBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.billingMetricsInitial": return new BillingMetricsInitial();
                case "#microsoft.graph.billingMetricsRecent": return new BillingMetricsRecent();
            }
        }
        return new BillingMetricsBase();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("foreignAssociatedTenantBillingManagementActiveCount", (n) -> { this.setForeignAssociatedTenantBillingManagementActiveCount(n.getBigDecimalValue()); });
        deserializerMap.put("foreignAssociatedTenantCount", (n) -> { this.setForeignAssociatedTenantCount(n.getBigDecimalValue()); });
        deserializerMap.put("foreignAssociatedTenantProvisioningActiveCount", (n) -> { this.setForeignAssociatedTenantProvisioningActiveCount(n.getBigDecimalValue()); });
        deserializerMap.put("localAssociatedTenantBillingManagementActiveCount", (n) -> { this.setLocalAssociatedTenantBillingManagementActiveCount(n.getBigDecimalValue()); });
        deserializerMap.put("localAssociatedTenantCount", (n) -> { this.setLocalAssociatedTenantCount(n.getBigDecimalValue()); });
        deserializerMap.put("localAssociatedTenantIds", (n) -> { this.setLocalAssociatedTenantIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("localAssociatedTenantProvisioningActiveCount", (n) -> { this.setLocalAssociatedTenantProvisioningActiveCount(n.getBigDecimalValue()); });
        deserializerMap.put("watermarkDateTime", (n) -> { this.setWatermarkDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the foreignAssociatedTenantBillingManagementActiveCount property value. The foreignAssociatedTenantBillingManagementActiveCount property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getForeignAssociatedTenantBillingManagementActiveCount() {
        return this.backingStore.get("foreignAssociatedTenantBillingManagementActiveCount");
    }
    /**
     * Gets the foreignAssociatedTenantCount property value. The foreignAssociatedTenantCount property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getForeignAssociatedTenantCount() {
        return this.backingStore.get("foreignAssociatedTenantCount");
    }
    /**
     * Gets the foreignAssociatedTenantProvisioningActiveCount property value. The foreignAssociatedTenantProvisioningActiveCount property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getForeignAssociatedTenantProvisioningActiveCount() {
        return this.backingStore.get("foreignAssociatedTenantProvisioningActiveCount");
    }
    /**
     * Gets the localAssociatedTenantBillingManagementActiveCount property value. The localAssociatedTenantBillingManagementActiveCount property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getLocalAssociatedTenantBillingManagementActiveCount() {
        return this.backingStore.get("localAssociatedTenantBillingManagementActiveCount");
    }
    /**
     * Gets the localAssociatedTenantCount property value. The localAssociatedTenantCount property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getLocalAssociatedTenantCount() {
        return this.backingStore.get("localAssociatedTenantCount");
    }
    /**
     * Gets the localAssociatedTenantIds property value. The localAssociatedTenantIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLocalAssociatedTenantIds() {
        return this.backingStore.get("localAssociatedTenantIds");
    }
    /**
     * Gets the localAssociatedTenantProvisioningActiveCount property value. The localAssociatedTenantProvisioningActiveCount property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getLocalAssociatedTenantProvisioningActiveCount() {
        return this.backingStore.get("localAssociatedTenantProvisioningActiveCount");
    }
    /**
     * Gets the watermarkDateTime property value. The watermarkDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getWatermarkDateTime() {
        return this.backingStore.get("watermarkDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBigDecimalValue("foreignAssociatedTenantBillingManagementActiveCount", this.getForeignAssociatedTenantBillingManagementActiveCount());
        writer.writeBigDecimalValue("foreignAssociatedTenantCount", this.getForeignAssociatedTenantCount());
        writer.writeBigDecimalValue("foreignAssociatedTenantProvisioningActiveCount", this.getForeignAssociatedTenantProvisioningActiveCount());
        writer.writeBigDecimalValue("localAssociatedTenantBillingManagementActiveCount", this.getLocalAssociatedTenantBillingManagementActiveCount());
        writer.writeBigDecimalValue("localAssociatedTenantCount", this.getLocalAssociatedTenantCount());
        writer.writeCollectionOfPrimitiveValues("localAssociatedTenantIds", this.getLocalAssociatedTenantIds());
        writer.writeBigDecimalValue("localAssociatedTenantProvisioningActiveCount", this.getLocalAssociatedTenantProvisioningActiveCount());
        writer.writeOffsetDateTimeValue("watermarkDateTime", this.getWatermarkDateTime());
    }
    /**
     * Sets the foreignAssociatedTenantBillingManagementActiveCount property value. The foreignAssociatedTenantBillingManagementActiveCount property
     * @param value Value to set for the foreignAssociatedTenantBillingManagementActiveCount property.
     */
    public void setForeignAssociatedTenantBillingManagementActiveCount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("foreignAssociatedTenantBillingManagementActiveCount", value);
    }
    /**
     * Sets the foreignAssociatedTenantCount property value. The foreignAssociatedTenantCount property
     * @param value Value to set for the foreignAssociatedTenantCount property.
     */
    public void setForeignAssociatedTenantCount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("foreignAssociatedTenantCount", value);
    }
    /**
     * Sets the foreignAssociatedTenantProvisioningActiveCount property value. The foreignAssociatedTenantProvisioningActiveCount property
     * @param value Value to set for the foreignAssociatedTenantProvisioningActiveCount property.
     */
    public void setForeignAssociatedTenantProvisioningActiveCount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("foreignAssociatedTenantProvisioningActiveCount", value);
    }
    /**
     * Sets the localAssociatedTenantBillingManagementActiveCount property value. The localAssociatedTenantBillingManagementActiveCount property
     * @param value Value to set for the localAssociatedTenantBillingManagementActiveCount property.
     */
    public void setLocalAssociatedTenantBillingManagementActiveCount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("localAssociatedTenantBillingManagementActiveCount", value);
    }
    /**
     * Sets the localAssociatedTenantCount property value. The localAssociatedTenantCount property
     * @param value Value to set for the localAssociatedTenantCount property.
     */
    public void setLocalAssociatedTenantCount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("localAssociatedTenantCount", value);
    }
    /**
     * Sets the localAssociatedTenantIds property value. The localAssociatedTenantIds property
     * @param value Value to set for the localAssociatedTenantIds property.
     */
    public void setLocalAssociatedTenantIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("localAssociatedTenantIds", value);
    }
    /**
     * Sets the localAssociatedTenantProvisioningActiveCount property value. The localAssociatedTenantProvisioningActiveCount property
     * @param value Value to set for the localAssociatedTenantProvisioningActiveCount property.
     */
    public void setLocalAssociatedTenantProvisioningActiveCount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("localAssociatedTenantProvisioningActiveCount", value);
    }
    /**
     * Sets the watermarkDateTime property value. The watermarkDateTime property
     * @param value Value to set for the watermarkDateTime property.
     */
    public void setWatermarkDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("watermarkDateTime", value);
    }
}
