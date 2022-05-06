package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RequestSchedule implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** When the access should expire.  */
    private ExpirationPattern _expiration;
    /** For recurring access. Not used at present.  */
    private PatternedRecurrence _recurrence;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  */
    private OffsetDateTime _startDateTime;
    /**
     * Instantiates a new requestSchedule and sets the default values.
     * @return a void
     */
    public RequestSchedule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a requestSchedule
     */
    @javax.annotation.Nonnull
    public static RequestSchedule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RequestSchedule();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the expiration property value. When the access should expire.
     * @return a expirationPattern
     */
    @javax.annotation.Nullable
    public ExpirationPattern getExpiration() {
        return this._expiration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RequestSchedule currentObject = this;
        return new HashMap<>(3) {{
            this.put("expiration", (n) -> { currentObject.setExpiration(n.getObjectValue(ExpirationPattern::createFromDiscriminatorValue)); });
            this.put("recurrence", (n) -> { currentObject.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the recurrence property value. For recurring access. Not used at present.
     * @return a patternedRecurrence
     */
    @javax.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this._recurrence;
    }
    /**
     * Gets the startDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("expiration", this.getExpiration());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the expiration property value. When the access should expire.
     * @param value Value to set for the expiration property.
     * @return a void
     */
    public void setExpiration(@javax.annotation.Nullable final ExpirationPattern value) {
        this._expiration = value;
    }
    /**
     * Sets the recurrence property value. For recurring access. Not used at present.
     * @param value Value to set for the recurrence property.
     * @return a void
     */
    public void setRecurrence(@javax.annotation.Nullable final PatternedRecurrence value) {
        this._recurrence = value;
    }
    /**
     * Sets the startDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
}
