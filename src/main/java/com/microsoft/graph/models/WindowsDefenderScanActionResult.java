package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsDefenderScanActionResult extends DeviceActionResult implements Parsable {
    /** Scan type either full scan or quick scan */
    private String _scanType;
    /**
     * Instantiates a new WindowsDefenderScanActionResult and sets the default values.
     * @return a void
     */
    public WindowsDefenderScanActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsDefenderScanActionResult
     */
    @javax.annotation.Nonnull
    public static WindowsDefenderScanActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDefenderScanActionResult();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsDefenderScanActionResult currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("scanType", (n) -> { currentObject.setScanType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the scanType property value. Scan type either full scan or quick scan
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScanType() {
        return this._scanType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("scanType", this.getScanType());
    }
    /**
     * Sets the scanType property value. Scan type either full scan or quick scan
     * @param value Value to set for the scanType property.
     * @return a void
     */
    public void setScanType(@javax.annotation.Nullable final String value) {
        this._scanType = value;
    }
}
