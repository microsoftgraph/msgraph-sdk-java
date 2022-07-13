package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LocateDeviceActionResult extends DeviceActionResult implements Parsable {
    /** device location */
    private DeviceGeoLocation _deviceLocation;
    /**
     * Instantiates a new LocateDeviceActionResult and sets the default values.
     * @return a void
     */
    public LocateDeviceActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LocateDeviceActionResult
     */
    @javax.annotation.Nonnull
    public static LocateDeviceActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LocateDeviceActionResult();
    }
    /**
     * Gets the deviceLocation property value. device location
     * @return a deviceGeoLocation
     */
    @javax.annotation.Nullable
    public DeviceGeoLocation getDeviceLocation() {
        return this._deviceLocation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LocateDeviceActionResult currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceLocation", (n) -> { currentObject.setDeviceLocation(n.getObjectValue(DeviceGeoLocation::createFromDiscriminatorValue)); });
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
        writer.writeObjectValue("deviceLocation", this.getDeviceLocation());
    }
    /**
     * Sets the deviceLocation property value. device location
     * @param value Value to set for the deviceLocation property.
     * @return a void
     */
    public void setDeviceLocation(@javax.annotation.Nullable final DeviceGeoLocation value) {
        this._deviceLocation = value;
    }
}
