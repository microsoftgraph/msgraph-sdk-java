package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ControlScore implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Control action category (Identity, Data, Device, Apps, Infrastructure).  */
    private String _controlCategory;
    /** Control unique name.  */
    private String _controlName;
    /** Description of the control.  */
    private String _description;
    /** Tenant achieved score for the control (it varies day by day depending on tenant operations on the control).  */
    private Double _score;
    /**
     * Instantiates a new controlScore and sets the default values.
     * @return a void
     */
    public ControlScore() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a controlScore
     */
    @javax.annotation.Nonnull
    public static ControlScore createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ControlScore();
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
     * Gets the controlCategory property value. Control action category (Identity, Data, Device, Apps, Infrastructure).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getControlCategory() {
        return this._controlCategory;
    }
    /**
     * Gets the controlName property value. Control unique name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getControlName() {
        return this._controlName;
    }
    /**
     * Gets the description property value. Description of the control.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ControlScore currentObject = this;
        return new HashMap<>(4) {{
            this.put("controlCategory", (n) -> { currentObject.setControlCategory(n.getStringValue()); });
            this.put("controlName", (n) -> { currentObject.setControlName(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("score", (n) -> { currentObject.setScore(n.getDoubleValue()); });
        }};
    }
    /**
     * Gets the score property value. Tenant achieved score for the control (it varies day by day depending on tenant operations on the control).
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getScore() {
        return this._score;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("controlCategory", this.getControlCategory());
        writer.writeStringValue("controlName", this.getControlName());
        writer.writeStringValue("description", this.getDescription());
        writer.writeDoubleValue("score", this.getScore());
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
     * Sets the controlCategory property value. Control action category (Identity, Data, Device, Apps, Infrastructure).
     * @param value Value to set for the controlCategory property.
     * @return a void
     */
    public void setControlCategory(@javax.annotation.Nullable final String value) {
        this._controlCategory = value;
    }
    /**
     * Sets the controlName property value. Control unique name.
     * @param value Value to set for the controlName property.
     * @return a void
     */
    public void setControlName(@javax.annotation.Nullable final String value) {
        this._controlName = value;
    }
    /**
     * Sets the description property value. Description of the control.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the score property value. Tenant achieved score for the control (it varies day by day depending on tenant operations on the control).
     * @param value Value to set for the score property.
     * @return a void
     */
    public void setScore(@javax.annotation.Nullable final Double value) {
        this._score = value;
    }
}
