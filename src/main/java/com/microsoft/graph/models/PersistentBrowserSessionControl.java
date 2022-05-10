package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersistentBrowserSessionControl extends ConditionalAccessSessionControl implements Parsable {
    /** Possible values are: always, never. */
    private PersistentBrowserSessionMode _mode;
    /**
     * Instantiates a new persistentBrowserSessionControl and sets the default values.
     * @return a void
     */
    public PersistentBrowserSessionControl() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a persistentBrowserSessionControl
     */
    @javax.annotation.Nonnull
    public static PersistentBrowserSessionControl createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersistentBrowserSessionControl();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PersistentBrowserSessionControl currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("mode", (n) -> { currentObject.setMode(n.getEnumValue(PersistentBrowserSessionMode.class)); });
        }};
    }
    /**
     * Gets the mode property value. Possible values are: always, never.
     * @return a persistentBrowserSessionMode
     */
    @javax.annotation.Nullable
    public PersistentBrowserSessionMode getMode() {
        return this._mode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("mode", this.getMode());
    }
    /**
     * Sets the mode property value. Possible values are: always, never.
     * @param value Value to set for the mode property.
     * @return a void
     */
    public void setMode(@javax.annotation.Nullable final PersistentBrowserSessionMode value) {
        this._mode = value;
    }
}
