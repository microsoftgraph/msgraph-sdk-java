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
public class IncompleteData implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The service does not have source data before the specified time. */
    private OffsetDateTime _missingDataBeforeDateTime;
    /** The OdataType property */
    private String _odataType;
    /** Some data was not recorded due to excessive activity. */
    private Boolean _wasThrottled;
    /**
     * Instantiates a new incompleteData and sets the default values.
     * @return a void
     */
    public IncompleteData() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.incompleteData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a incompleteData
     */
    @javax.annotation.Nonnull
    public static IncompleteData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IncompleteData();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IncompleteData currentObject = this;
        return new HashMap<>(3) {{
            this.put("missingDataBeforeDateTime", (n) -> { currentObject.setMissingDataBeforeDateTime(n.getOffsetDateTimeValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("wasThrottled", (n) -> { currentObject.setWasThrottled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the missingDataBeforeDateTime property value. The service does not have source data before the specified time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getMissingDataBeforeDateTime() {
        return this._missingDataBeforeDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the wasThrottled property value. Some data was not recorded due to excessive activity.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWasThrottled() {
        return this._wasThrottled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("missingDataBeforeDateTime", this.getMissingDataBeforeDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("wasThrottled", this.getWasThrottled());
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
     * Sets the missingDataBeforeDateTime property value. The service does not have source data before the specified time.
     * @param value Value to set for the missingDataBeforeDateTime property.
     * @return a void
     */
    public void setMissingDataBeforeDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._missingDataBeforeDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the wasThrottled property value. Some data was not recorded due to excessive activity.
     * @param value Value to set for the wasThrottled property.
     * @return a void
     */
    public void setWasThrottled(@javax.annotation.Nullable final Boolean value) {
        this._wasThrottled = value;
    }
}
