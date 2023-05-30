package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementTroubleshootingEvent extends Entity implements Parsable {
    /** Id used for tracing the failure in the service. */
    private String correlationId;
    /** Time when the event occurred . */
    private OffsetDateTime eventDateTime;
    /**
     * Instantiates a new DeviceManagementTroubleshootingEvent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementTroubleshootingEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementTroubleshootingEvent
     */
    @javax.annotation.Nonnull
    public static DeviceManagementTroubleshootingEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * Gets the eventDateTime property value. Time when the event occurred .
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.eventDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
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
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
    }
    /**
     * Sets the correlationId property value. Id used for tracing the failure in the service.
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the eventDateTime property value. Time when the event occurred .
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.eventDateTime = value;
    }
}
