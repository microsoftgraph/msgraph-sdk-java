package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Event representing an general failure.
 */
public class DeviceManagementTroubleshootingEvent extends Entity implements Parsable {
    /**
     * Id used for tracing the failure in the service.
     */
    private String correlationId;
    /**
     * Time when the event occurred .
     */
    private OffsetDateTime eventDateTime;
    /**
     * Instantiates a new deviceManagementTroubleshootingEvent and sets the default values.
     */
    public DeviceManagementTroubleshootingEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementTroubleshootingEvent
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementTroubleshootingEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.enrollmentTroubleshootingEvent": return new EnrollmentTroubleshootingEvent();
            }
        }
        return new DeviceManagementTroubleshootingEvent();
    }
    /**
     * Gets the correlationId property value. Id used for tracing the failure in the service.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * Gets the eventDateTime property value. Time when the event occurred .
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.eventDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
    }
    /**
     * Sets the correlationId property value. Id used for tracing the failure in the service.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the eventDateTime property value. Time when the event occurred .
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.eventDateTime = value;
    }
}
