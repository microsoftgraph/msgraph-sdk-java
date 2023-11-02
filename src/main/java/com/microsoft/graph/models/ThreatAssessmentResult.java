package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ThreatAssessmentResult extends Entity implements Parsable {
    /**
     * Instantiates a new ThreatAssessmentResult and sets the default values.
     */
    public ThreatAssessmentResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ThreatAssessmentResult
     */
    @jakarta.annotation.Nonnull
    public static ThreatAssessmentResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ThreatAssessmentResult();
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.getBackingStore().get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("resultType", (n) -> { this.setResultType(n.getEnumValue(ThreatAssessmentResultType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The result message for each threat assessment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.getBackingStore().get("message");
    }
    /**
     * Gets the resultType property value. The threat assessment result type. Possible values are: checkPolicy, rescan.
     * @return a ThreatAssessmentResultType
     */
    @jakarta.annotation.Nullable
    public ThreatAssessmentResultType getResultType() {
        return this.getBackingStore().get("resultType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("message", this.getMessage());
        writer.writeEnumValue("resultType", this.getResultType());
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("createdDateTime", value);
    }
    /**
     * Sets the message property value. The result message for each threat assessment.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("message", value);
    }
    /**
     * Sets the resultType property value. The threat assessment result type. Possible values are: checkPolicy, rescan.
     * @param value Value to set for the resultType property.
     */
    public void setResultType(@jakarta.annotation.Nullable final ThreatAssessmentResultType value) {
        this.getBackingStore().set("resultType", value);
    }
}
