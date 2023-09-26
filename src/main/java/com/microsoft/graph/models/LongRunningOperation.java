package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LongRunningOperation extends Entity implements Parsable {
    /**
     * The start time of the operation. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The time of the last action in the operation. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime lastActionDateTime;
    /**
     * URI of the resource that the operation is performed on.
     */
    private String resourceLocation;
    /**
     * The status of the operation. The possible values are: notStarted, running, succeeded, failed, unknownFutureValue.
     */
    private LongRunningOperationStatus status;
    /**
     * Details about the status of the operation.
     */
    private String statusDetail;
    /**
     * Instantiates a new LongRunningOperation and sets the default values.
     */
    public LongRunningOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LongRunningOperation
     */
    @jakarta.annotation.Nonnull
    public static LongRunningOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.richLongRunningOperation": return new RichLongRunningOperation();
            }
        }
        return new LongRunningOperation();
    }
    /**
     * Gets the createdDateTime property value. The start time of the operation. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resourceLocation", (n) -> { this.setResourceLocation(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(LongRunningOperationStatus.class)); });
        deserializerMap.put("statusDetail", (n) -> { this.setStatusDetail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionDateTime property value. The time of the last action in the operation. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }
    /**
     * Gets the resourceLocation property value. URI of the resource that the operation is performed on.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceLocation() {
        return this.resourceLocation;
    }
    /**
     * Gets the status property value. The status of the operation. The possible values are: notStarted, running, succeeded, failed, unknownFutureValue.
     * @return a LongRunningOperationStatus
     */
    @jakarta.annotation.Nullable
    public LongRunningOperationStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the statusDetail property value. Details about the status of the operation.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatusDetail() {
        return this.statusDetail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("resourceLocation", this.getResourceLocation());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusDetail", this.getStatusDetail());
    }
    /**
     * Sets the createdDateTime property value. The start time of the operation. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the lastActionDateTime property value. The time of the last action in the operation. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastActionDateTime = value;
    }
    /**
     * Sets the resourceLocation property value. URI of the resource that the operation is performed on.
     * @param value Value to set for the resourceLocation property.
     */
    public void setResourceLocation(@jakarta.annotation.Nullable final String value) {
        this.resourceLocation = value;
    }
    /**
     * Sets the status property value. The status of the operation. The possible values are: notStarted, running, succeeded, failed, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final LongRunningOperationStatus value) {
        this.status = value;
    }
    /**
     * Sets the statusDetail property value. Details about the status of the operation.
     * @param value Value to set for the statusDetail property.
     */
    public void setStatusDetail(@jakarta.annotation.Nullable final String value) {
        this.statusDetail = value;
    }
}
