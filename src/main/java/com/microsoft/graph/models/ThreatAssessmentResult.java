package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ThreatAssessmentResult extends Entity implements Parsable {
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  */
    private OffsetDateTime _createdDateTime;
    /** The result message for each threat assessment.  */
    private String _message;
    /** The threat assessment result type. Possible values are: checkPolicy (only for mail assessment), rescan.  */
    private ThreatAssessmentResultType _resultType;
    /**
     * Instantiates a new threatAssessmentResult and sets the default values.
     * @return a void
     */
    public ThreatAssessmentResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a threatAssessmentResult
     */
    @javax.annotation.Nonnull
    public static ThreatAssessmentResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ThreatAssessmentResult();
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ThreatAssessmentResult currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("message", (n) -> { currentObject.setMessage(n.getStringValue()); });
            this.put("resultType", (n) -> { currentObject.setResultType(n.getEnumValue(ThreatAssessmentResultType.class)); });
        }};
    }
    /**
     * Gets the message property value. The result message for each threat assessment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this._message;
    }
    /**
     * Gets the resultType property value. The threat assessment result type. Possible values are: checkPolicy (only for mail assessment), rescan.
     * @return a threatAssessmentResultType
     */
    @javax.annotation.Nullable
    public ThreatAssessmentResultType getResultType() {
        return this._resultType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("message", this.getMessage());
        writer.writeEnumValue("resultType", this.getResultType());
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the message property value. The result message for each threat assessment.
     * @param value Value to set for the message property.
     * @return a void
     */
    public void setMessage(@javax.annotation.Nullable final String value) {
        this._message = value;
    }
    /**
     * Sets the resultType property value. The threat assessment result type. Possible values are: checkPolicy (only for mail assessment), rescan.
     * @param value Value to set for the resultType property.
     * @return a void
     */
    public void setResultType(@javax.annotation.Nullable final ThreatAssessmentResultType value) {
        this._resultType = value;
    }
}
