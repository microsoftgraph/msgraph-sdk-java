package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Imported windows autopilot devices. */
public class ImportedWindowsAutopilotDeviceIdentity extends Entity implements Parsable {
    /** UPN of the user the device will be assigned */
    private String _assignedUserPrincipalName;
    /** Group Tag of the Windows autopilot device. */
    private String _groupTag;
    /** Hardware Blob of the Windows autopilot device. */
    private byte[] _hardwareIdentifier;
    /** The Import Id of the Windows autopilot device. */
    private String _importId;
    /** Product Key of the Windows autopilot device. */
    private String _productKey;
    /** Serial number of the Windows autopilot device. */
    private String _serialNumber;
    /** Current state of the imported device. */
    private ImportedWindowsAutopilotDeviceIdentityState _state;
    /**
     * Instantiates a new importedWindowsAutopilotDeviceIdentity and sets the default values.
     * @return a void
     */
    public ImportedWindowsAutopilotDeviceIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a importedWindowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nonnull
    public static ImportedWindowsAutopilotDeviceIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportedWindowsAutopilotDeviceIdentity();
    }
    /**
     * Gets the assignedUserPrincipalName property value. UPN of the user the device will be assigned
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignedUserPrincipalName() {
        return this._assignedUserPrincipalName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ImportedWindowsAutopilotDeviceIdentity currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignedUserPrincipalName", (n) -> { currentObject.setAssignedUserPrincipalName(n.getStringValue()); });
            this.put("groupTag", (n) -> { currentObject.setGroupTag(n.getStringValue()); });
            this.put("hardwareIdentifier", (n) -> { currentObject.setHardwareIdentifier(n.getByteArrayValue()); });
            this.put("importId", (n) -> { currentObject.setImportId(n.getStringValue()); });
            this.put("productKey", (n) -> { currentObject.setProductKey(n.getStringValue()); });
            this.put("serialNumber", (n) -> { currentObject.setSerialNumber(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getObjectValue(ImportedWindowsAutopilotDeviceIdentityState::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the groupTag property value. Group Tag of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupTag() {
        return this._groupTag;
    }
    /**
     * Gets the hardwareIdentifier property value. Hardware Blob of the Windows autopilot device.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getHardwareIdentifier() {
        return this._hardwareIdentifier;
    }
    /**
     * Gets the importId property value. The Import Id of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImportId() {
        return this._importId;
    }
    /**
     * Gets the productKey property value. Product Key of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductKey() {
        return this._productKey;
    }
    /**
     * Gets the serialNumber property value. Serial number of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this._serialNumber;
    }
    /**
     * Gets the state property value. Current state of the imported device.
     * @return a importedWindowsAutopilotDeviceIdentityState
     */
    @javax.annotation.Nullable
    public ImportedWindowsAutopilotDeviceIdentityState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignedUserPrincipalName", this.getAssignedUserPrincipalName());
        writer.writeStringValue("groupTag", this.getGroupTag());
        writer.writeByteArrayValue("hardwareIdentifier", this.getHardwareIdentifier());
        writer.writeStringValue("importId", this.getImportId());
        writer.writeStringValue("productKey", this.getProductKey());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeObjectValue("state", this.getState());
    }
    /**
     * Sets the assignedUserPrincipalName property value. UPN of the user the device will be assigned
     * @param value Value to set for the assignedUserPrincipalName property.
     * @return a void
     */
    public void setAssignedUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._assignedUserPrincipalName = value;
    }
    /**
     * Sets the groupTag property value. Group Tag of the Windows autopilot device.
     * @param value Value to set for the groupTag property.
     * @return a void
     */
    public void setGroupTag(@javax.annotation.Nullable final String value) {
        this._groupTag = value;
    }
    /**
     * Sets the hardwareIdentifier property value. Hardware Blob of the Windows autopilot device.
     * @param value Value to set for the hardwareIdentifier property.
     * @return a void
     */
    public void setHardwareIdentifier(@javax.annotation.Nullable final byte[] value) {
        this._hardwareIdentifier = value;
    }
    /**
     * Sets the importId property value. The Import Id of the Windows autopilot device.
     * @param value Value to set for the importId property.
     * @return a void
     */
    public void setImportId(@javax.annotation.Nullable final String value) {
        this._importId = value;
    }
    /**
     * Sets the productKey property value. Product Key of the Windows autopilot device.
     * @param value Value to set for the productKey property.
     * @return a void
     */
    public void setProductKey(@javax.annotation.Nullable final String value) {
        this._productKey = value;
    }
    /**
     * Sets the serialNumber property value. Serial number of the Windows autopilot device.
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this._serialNumber = value;
    }
    /**
     * Sets the state property value. Current state of the imported device.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final ImportedWindowsAutopilotDeviceIdentityState value) {
        this._state = value;
    }
}
