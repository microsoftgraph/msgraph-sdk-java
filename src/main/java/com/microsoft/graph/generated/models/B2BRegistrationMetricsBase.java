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
public class B2BRegistrationMetricsBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link B2BRegistrationMetricsBase} and sets the default values.
     */
    public B2BRegistrationMetricsBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link B2BRegistrationMetricsBase}
     */
    @jakarta.annotation.Nonnull
    public static B2BRegistrationMetricsBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.b2BRegistrationMetricsInitial": return new B2BRegistrationMetricsInitial();
                case "#microsoft.graph.b2BRegistrationMetricsRecent": return new B2BRegistrationMetricsRecent();
            }
        }
        return new B2BRegistrationMetricsBase();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("inboundTotalUsers", (n) -> { this.setInboundTotalUsers(n.getBigDecimalValue()); });
        deserializerMap.put("outboundTotalUsers", (n) -> { this.setOutboundTotalUsers(n.getBigDecimalValue()); });
        deserializerMap.put("watermarkDateTime", (n) -> { this.setWatermarkDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inboundTotalUsers property value. The inboundTotalUsers property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getInboundTotalUsers() {
        return this.backingStore.get("inboundTotalUsers");
    }
    /**
     * Gets the outboundTotalUsers property value. The outboundTotalUsers property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getOutboundTotalUsers() {
        return this.backingStore.get("outboundTotalUsers");
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
        writer.writeBigDecimalValue("inboundTotalUsers", this.getInboundTotalUsers());
        writer.writeBigDecimalValue("outboundTotalUsers", this.getOutboundTotalUsers());
        writer.writeOffsetDateTimeValue("watermarkDateTime", this.getWatermarkDateTime());
    }
    /**
     * Sets the inboundTotalUsers property value. The inboundTotalUsers property
     * @param value Value to set for the inboundTotalUsers property.
     */
    public void setInboundTotalUsers(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("inboundTotalUsers", value);
    }
    /**
     * Sets the outboundTotalUsers property value. The outboundTotalUsers property
     * @param value Value to set for the outboundTotalUsers property.
     */
    public void setOutboundTotalUsers(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("outboundTotalUsers", value);
    }
    /**
     * Sets the watermarkDateTime property value. The watermarkDateTime property
     * @param value Value to set for the watermarkDateTime property.
     */
    public void setWatermarkDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("watermarkDateTime", value);
    }
}
