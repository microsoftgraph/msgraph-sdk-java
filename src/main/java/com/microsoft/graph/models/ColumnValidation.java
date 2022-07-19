package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ColumnValidation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Default BCP 47 language tag for the description. */
    private String _defaultLanguage;
    /** Localized messages that explain what is needed for this column's value to be considered valid. User will be prompted with this message if validation fails. */
    private java.util.List<DisplayNameLocalization> _descriptions;
    /** The formula to validate column value. For examples, see Examples of common formulas in lists */
    private String _formula;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new columnValidation and sets the default values.
     * @return a void
     */
    public ColumnValidation() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.columnValidation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a columnValidation
     */
    @javax.annotation.Nonnull
    public static ColumnValidation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ColumnValidation();
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
     * Gets the defaultLanguage property value. Default BCP 47 language tag for the description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultLanguage() {
        return this._defaultLanguage;
    }
    /**
     * Gets the descriptions property value. Localized messages that explain what is needed for this column's value to be considered valid. User will be prompted with this message if validation fails.
     * @return a displayNameLocalization
     */
    @javax.annotation.Nullable
    public java.util.List<DisplayNameLocalization> getDescriptions() {
        return this._descriptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ColumnValidation currentObject = this;
        return new HashMap<>(4) {{
            this.put("defaultLanguage", (n) -> { currentObject.setDefaultLanguage(n.getStringValue()); });
            this.put("descriptions", (n) -> { currentObject.setDescriptions(n.getCollectionOfObjectValues(DisplayNameLocalization::createFromDiscriminatorValue)); });
            this.put("formula", (n) -> { currentObject.setFormula(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the formula property value. The formula to validate column value. For examples, see Examples of common formulas in lists
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultLanguage", this.getDefaultLanguage());
        writer.writeCollectionOfObjectValues("descriptions", this.getDescriptions());
        writer.writeStringValue("formula", this.getFormula());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the defaultLanguage property value. Default BCP 47 language tag for the description.
     * @param value Value to set for the defaultLanguage property.
     * @return a void
     */
    public void setDefaultLanguage(@javax.annotation.Nullable final String value) {
        this._defaultLanguage = value;
    }
    /**
     * Sets the descriptions property value. Localized messages that explain what is needed for this column's value to be considered valid. User will be prompted with this message if validation fails.
     * @param value Value to set for the descriptions property.
     * @return a void
     */
    public void setDescriptions(@javax.annotation.Nullable final java.util.List<DisplayNameLocalization> value) {
        this._descriptions = value;
    }
    /**
     * Sets the formula property value. The formula to validate column value. For examples, see Examples of common formulas in lists
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
}
