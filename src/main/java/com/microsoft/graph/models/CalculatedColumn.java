package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CalculatedColumn implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** For dateTime output types, the format of the value. Must be one of dateOnly or dateTime. */
    private String _format;
    /** The formula used to compute the value for this column. */
    private String _formula;
    /** The OdataType property */
    private String _odataType;
    /** The output type used to format values in this column. Must be one of boolean, currency, dateTime, number, or text. */
    private String _outputType;
    /**
     * Instantiates a new calculatedColumn and sets the default values.
     * @return a void
     */
    public CalculatedColumn() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.calculatedColumn");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a calculatedColumn
     */
    @javax.annotation.Nonnull
    public static CalculatedColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalculatedColumn();
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
        final CalculatedColumn currentObject = this;
        return new HashMap<>(4) {{
            this.put("format", (n) -> { currentObject.setFormat(n.getStringValue()); });
            this.put("formula", (n) -> { currentObject.setFormula(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("outputType", (n) -> { currentObject.setOutputType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the format property value. For dateTime output types, the format of the value. Must be one of dateOnly or dateTime.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFormat() {
        return this._format;
    }
    /**
     * Gets the formula property value. The formula used to compute the value for this column.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFormula() {
        return this._formula;
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
     * Gets the outputType property value. The output type used to format values in this column. Must be one of boolean, currency, dateTime, number, or text.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOutputType() {
        return this._outputType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("format", this.getFormat());
        writer.writeStringValue("formula", this.getFormula());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("outputType", this.getOutputType());
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
     * Sets the format property value. For dateTime output types, the format of the value. Must be one of dateOnly or dateTime.
     * @param value Value to set for the format property.
     * @return a void
     */
    public void setFormat(@javax.annotation.Nullable final String value) {
        this._format = value;
    }
    /**
     * Sets the formula property value. The formula used to compute the value for this column.
     * @param value Value to set for the formula property.
     * @return a void
     */
    public void setFormula(@javax.annotation.Nullable final String value) {
        this._formula = value;
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
     * Sets the outputType property value. The output type used to format values in this column. Must be one of boolean, currency, dateTime, number, or text.
     * @param value Value to set for the outputType property.
     * @return a void
     */
    public void setOutputType(@javax.annotation.Nullable final String value) {
        this._outputType = value;
    }
}
