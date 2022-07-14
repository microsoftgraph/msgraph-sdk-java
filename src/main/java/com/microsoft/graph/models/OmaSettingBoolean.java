package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OmaSettingBoolean extends OmaSetting implements Parsable {
    /** Value. */
    private Boolean _value;
    /**
     * Instantiates a new OmaSettingBoolean and sets the default values.
     * @return a void
     */
    public OmaSettingBoolean() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OmaSettingBoolean
     */
    @javax.annotation.Nonnull
    public static OmaSettingBoolean createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OmaSettingBoolean();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OmaSettingBoolean currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("value", (n) -> { currentObject.setValue(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the value property value. Value.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getValue() {
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
        writer.writeBooleanValue("value", this.getValue());
    }
    /**
     * Sets the value property value. Value.
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final Boolean value) {
        this._value = value;
    }
}
