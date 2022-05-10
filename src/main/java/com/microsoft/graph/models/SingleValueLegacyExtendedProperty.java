package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SingleValueLegacyExtendedProperty extends Entity implements Parsable {
    /** A property value. */
    private String _value;
    /**
     * Instantiates a new singleValueLegacyExtendedProperty and sets the default values.
     * @return a void
     */
    public SingleValueLegacyExtendedProperty() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nonnull
    public static SingleValueLegacyExtendedProperty createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SingleValueLegacyExtendedProperty();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SingleValueLegacyExtendedProperty currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("value", (n) -> { currentObject.setValue(n.getStringValue()); });
        }};
    }
    /**
     * Gets the value property value. A property value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
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
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the value property value. A property value.
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final String value) {
        this._value = value;
    }
}
