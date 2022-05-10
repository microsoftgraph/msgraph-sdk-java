package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MultiValueLegacyExtendedProperty extends Entity implements Parsable {
    /** A collection of property values. */
    private java.util.List<String> _value;
    /**
     * Instantiates a new multiValueLegacyExtendedProperty and sets the default values.
     * @return a void
     */
    public MultiValueLegacyExtendedProperty() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nonnull
    public static MultiValueLegacyExtendedProperty createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiValueLegacyExtendedProperty();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MultiValueLegacyExtendedProperty currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("value", (n) -> { currentObject.setValue(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the value property value. A collection of property values.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getValue() {
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
        writer.writeCollectionOfPrimitiveValues("value", this.getValue());
    }
    /**
     * Sets the value property value. A collection of property values.
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final java.util.List<String> value) {
        this._value = value;
    }
}
