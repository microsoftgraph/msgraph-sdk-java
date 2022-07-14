package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OmaSettingFloatingPoint extends OmaSetting implements Parsable {
    /** Value. */
    private Float _value;
    /**
     * Instantiates a new OmaSettingFloatingPoint and sets the default values.
     * @return a void
     */
    public OmaSettingFloatingPoint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OmaSettingFloatingPoint
     */
    @javax.annotation.Nonnull
    public static OmaSettingFloatingPoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OmaSettingFloatingPoint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OmaSettingFloatingPoint currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("value", (n) -> { currentObject.setValue(n.getFloatValue()); });
        }};
    }
    /**
     * Gets the value property value. Value.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getValue() {
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
        writer.writeFloatValue("value", this.getValue());
    }
    /**
     * Sets the value property value. Value.
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final Float value) {
        this._value = value;
    }
}
