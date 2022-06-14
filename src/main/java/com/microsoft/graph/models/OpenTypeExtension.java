package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OpenTypeExtension extends Extension implements Parsable {
    /** A unique text identifier for an open type data extension. Required. */
    private String _extensionName;
    /**
     * Instantiates a new OpenTypeExtension and sets the default values.
     * @return a void
     */
    public OpenTypeExtension() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OpenTypeExtension
     */
    @javax.annotation.Nonnull
    public static OpenTypeExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenTypeExtension();
    }
    /**
     * Gets the extensionName property value. A unique text identifier for an open type data extension. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionName() {
        return this._extensionName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OpenTypeExtension currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("extensionName", (n) -> { currentObject.setExtensionName(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("extensionName", this.getExtensionName());
    }
    /**
     * Sets the extensionName property value. A unique text identifier for an open type data extension. Required.
     * @param value Value to set for the extensionName property.
     * @return a void
     */
    public void setExtensionName(@javax.annotation.Nullable final String value) {
        this._extensionName = value;
    }
}
