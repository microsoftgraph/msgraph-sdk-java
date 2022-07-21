package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookFunctionResult extends Entity implements Parsable {
    /** The error property */
    private String _error;
    /** The value property */
    private Json _value;
    /**
     * Instantiates a new WorkbookFunctionResult and sets the default values.
     * @return a void
     */
    public WorkbookFunctionResult() {
        super();
        this.setOdataType("#microsoft.graph.workbookFunctionResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookFunctionResult
     */
    @javax.annotation.Nonnull
    public static WorkbookFunctionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookFunctionResult();
    }
    /**
     * Gets the error property value. The error property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookFunctionResult currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("error", (n) -> { currentObject.setError(n.getStringValue()); });
            this.put("value", (n) -> { currentObject.setValue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the value property value. The value property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("error", this.getError());
        writer.writeObjectValue("value", this.getValue());
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     * @return a void
     */
    public void setError(@javax.annotation.Nullable final String value) {
        this._error = value;
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final Json value) {
        this._value = value;
    }
}
