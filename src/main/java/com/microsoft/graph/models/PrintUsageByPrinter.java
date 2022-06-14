package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintUsageByPrinter extends PrintUsage implements Parsable {
    /** The printerId property */
    private String _printerId;
    /**
     * Instantiates a new PrintUsageByPrinter and sets the default values.
     * @return a void
     */
    public PrintUsageByPrinter() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrintUsageByPrinter
     */
    @javax.annotation.Nonnull
    public static PrintUsageByPrinter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintUsageByPrinter();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrintUsageByPrinter currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("printerId", (n) -> { currentObject.setPrinterId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the printerId property value. The printerId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrinterId() {
        return this._printerId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("printerId", this.getPrinterId());
    }
    /**
     * Sets the printerId property value. The printerId property
     * @param value Value to set for the printerId property.
     * @return a void
     */
    public void setPrinterId(@javax.annotation.Nullable final String value) {
        this._printerId = value;
    }
}
