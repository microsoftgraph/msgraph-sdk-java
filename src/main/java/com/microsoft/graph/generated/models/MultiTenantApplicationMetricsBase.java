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
public class MultiTenantApplicationMetricsBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MultiTenantApplicationMetricsBase} and sets the default values.
     */
    public MultiTenantApplicationMetricsBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MultiTenantApplicationMetricsBase}
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantApplicationMetricsBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.multiTenantApplicationMetricsInitial": return new MultiTenantApplicationMetricsInitial();
                case "#microsoft.graph.multiTenantApplicationMetricsRecent": return new MultiTenantApplicationMetricsRecent();
            }
        }
        return new MultiTenantApplicationMetricsBase();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("inboundMonthlyTotalApplications", (n) -> { this.setInboundMonthlyTotalApplications(n.getBigDecimalValue()); });
        deserializerMap.put("outboundMonthlyTotalApplications", (n) -> { this.setOutboundMonthlyTotalApplications(n.getBigDecimalValue()); });
        deserializerMap.put("watermarkDateTime", (n) -> { this.setWatermarkDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inboundMonthlyTotalApplications property value. The inboundMonthlyTotalApplications property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getInboundMonthlyTotalApplications() {
        return this.backingStore.get("inboundMonthlyTotalApplications");
    }
    /**
     * Gets the outboundMonthlyTotalApplications property value. The outboundMonthlyTotalApplications property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getOutboundMonthlyTotalApplications() {
        return this.backingStore.get("outboundMonthlyTotalApplications");
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
        writer.writeBigDecimalValue("inboundMonthlyTotalApplications", this.getInboundMonthlyTotalApplications());
        writer.writeBigDecimalValue("outboundMonthlyTotalApplications", this.getOutboundMonthlyTotalApplications());
        writer.writeOffsetDateTimeValue("watermarkDateTime", this.getWatermarkDateTime());
    }
    /**
     * Sets the inboundMonthlyTotalApplications property value. The inboundMonthlyTotalApplications property
     * @param value Value to set for the inboundMonthlyTotalApplications property.
     */
    public void setInboundMonthlyTotalApplications(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("inboundMonthlyTotalApplications", value);
    }
    /**
     * Sets the outboundMonthlyTotalApplications property value. The outboundMonthlyTotalApplications property
     * @param value Value to set for the outboundMonthlyTotalApplications property.
     */
    public void setOutboundMonthlyTotalApplications(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("outboundMonthlyTotalApplications", value);
    }
    /**
     * Sets the watermarkDateTime property value. The watermarkDateTime property
     * @param value Value to set for the watermarkDateTime property.
     */
    public void setWatermarkDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("watermarkDateTime", value);
    }
}
