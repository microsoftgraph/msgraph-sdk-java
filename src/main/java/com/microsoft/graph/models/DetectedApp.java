package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DetectedApp extends Entity implements Parsable {
    /** The number of devices that have installed this application */
    private Integer _deviceCount;
    /** Name of the discovered application. Read-only */
    private String _displayName;
    /** The devices that have the discovered application installed */
    private java.util.List<ManagedDevice> _managedDevices;
    /** Discovered application size in bytes. Read-only */
    private Long _sizeInByte;
    /** Version of the discovered application. Read-only */
    private String _version;
    /**
     * Instantiates a new detectedApp and sets the default values.
     * @return a void
     */
    public DetectedApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a detectedApp
     */
    @javax.annotation.Nonnull
    public static DetectedApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DetectedApp();
    }
    /**
     * Gets the deviceCount property value. The number of devices that have installed this application
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceCount() {
        return this._deviceCount;
    }
    /**
     * Gets the displayName property value. Name of the discovered application. Read-only
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DetectedApp currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceCount", (n) -> { currentObject.setDeviceCount(n.getIntegerValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("managedDevices", (n) -> { currentObject.setManagedDevices(n.getCollectionOfObjectValues(ManagedDevice::createFromDiscriminatorValue)); });
            this.put("sizeInByte", (n) -> { currentObject.setSizeInByte(n.getLongValue()); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the managedDevices property value. The devices that have the discovered application installed
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDevice> getManagedDevices() {
        return this._managedDevices;
    }
    /**
     * Gets the sizeInByte property value. Discovered application size in bytes. Read-only
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSizeInByte() {
        return this._sizeInByte;
    }
    /**
     * Gets the version property value. Version of the discovered application. Read-only
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("managedDevices", this.getManagedDevices());
        writer.writeLongValue("sizeInByte", this.getSizeInByte());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the deviceCount property value. The number of devices that have installed this application
     * @param value Value to set for the deviceCount property.
     * @return a void
     */
    public void setDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._deviceCount = value;
    }
    /**
     * Sets the displayName property value. Name of the discovered application. Read-only
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the managedDevices property value. The devices that have the discovered application installed
     * @param value Value to set for the managedDevices property.
     * @return a void
     */
    public void setManagedDevices(@javax.annotation.Nullable final java.util.List<ManagedDevice> value) {
        this._managedDevices = value;
    }
    /**
     * Sets the sizeInByte property value. Discovered application size in bytes. Read-only
     * @param value Value to set for the sizeInByte property.
     * @return a void
     */
    public void setSizeInByte(@javax.annotation.Nullable final Long value) {
        this._sizeInByte = value;
    }
    /**
     * Sets the version property value. Version of the discovered application. Read-only
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
