package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Imported windows autopilot devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImportedWindowsAutopilotDeviceIdentity extends Entity implements Parsable {
    /**
     * UPN of the user the device will be assigned
     */
    private String assignedUserPrincipalName;
    /**
     * Group Tag of the Windows autopilot device.
     */
    private String groupTag;
    /**
     * Hardware Blob of the Windows autopilot device.
     */
    private Base64url hardwareIdentifier;
    /**
     * The Import Id of the Windows autopilot device.
     */
    private String importId;
    /**
     * Product Key of the Windows autopilot device.
     */
    private String productKey;
    /**
     * Serial number of the Windows autopilot device.
     */
    private String serialNumber;
    /**
     * Current state of the imported device.
     */
    private ImportedWindowsAutopilotDeviceIdentityState state;
    /**
     * Instantiates a new ImportedWindowsAutopilotDeviceIdentity and sets the default values.
     */
    public ImportedWindowsAutopilotDeviceIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ImportedWindowsAutopilotDeviceIdentity
     */
    @jakarta.annotation.Nonnull
    public static ImportedWindowsAutopilotDeviceIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportedWindowsAutopilotDeviceIdentity();
    }
    /**
     * Gets the assignedUserPrincipalName property value. UPN of the user the device will be assigned
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssignedUserPrincipalName() {
        return this.assignedUserPrincipalName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedUserPrincipalName", (n) -> { this.setAssignedUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("groupTag", (n) -> { this.setGroupTag(n.getStringValue()); });
        deserializerMap.put("hardwareIdentifier", (n) -> { this.setHardwareIdentifier(n.getObjectValue(Base64url::createFromDiscriminatorValue)); });
        deserializerMap.put("importId", (n) -> { this.setImportId(n.getStringValue()); });
        deserializerMap.put("productKey", (n) -> { this.setProductKey(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getObjectValue(ImportedWindowsAutopilotDeviceIdentityState::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupTag property value. Group Tag of the Windows autopilot device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupTag() {
        return this.groupTag;
    }
    /**
     * Gets the hardwareIdentifier property value. Hardware Blob of the Windows autopilot device.
     * @return a Base64url
     */
    @jakarta.annotation.Nullable
    public Base64url getHardwareIdentifier() {
        return this.hardwareIdentifier;
    }
    /**
     * Gets the importId property value. The Import Id of the Windows autopilot device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getImportId() {
        return this.importId;
    }
    /**
     * Gets the productKey property value. Product Key of the Windows autopilot device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductKey() {
        return this.productKey;
    }
    /**
     * Gets the serialNumber property value. Serial number of the Windows autopilot device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Gets the state property value. Current state of the imported device.
     * @return a ImportedWindowsAutopilotDeviceIdentityState
     */
    @jakarta.annotation.Nullable
    public ImportedWindowsAutopilotDeviceIdentityState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignedUserPrincipalName", this.getAssignedUserPrincipalName());
        writer.writeStringValue("groupTag", this.getGroupTag());
        writer.writeObjectValue("hardwareIdentifier", this.getHardwareIdentifier());
        writer.writeStringValue("importId", this.getImportId());
        writer.writeStringValue("productKey", this.getProductKey());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeObjectValue("state", this.getState());
    }
    /**
     * Sets the assignedUserPrincipalName property value. UPN of the user the device will be assigned
     * @param value Value to set for the assignedUserPrincipalName property.
     */
    public void setAssignedUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.assignedUserPrincipalName = value;
    }
    /**
     * Sets the groupTag property value. Group Tag of the Windows autopilot device.
     * @param value Value to set for the groupTag property.
     */
    public void setGroupTag(@jakarta.annotation.Nullable final String value) {
        this.groupTag = value;
    }
    /**
     * Sets the hardwareIdentifier property value. Hardware Blob of the Windows autopilot device.
     * @param value Value to set for the hardwareIdentifier property.
     */
    public void setHardwareIdentifier(@jakarta.annotation.Nullable final Base64url value) {
        this.hardwareIdentifier = value;
    }
    /**
     * Sets the importId property value. The Import Id of the Windows autopilot device.
     * @param value Value to set for the importId property.
     */
    public void setImportId(@jakarta.annotation.Nullable final String value) {
        this.importId = value;
    }
    /**
     * Sets the productKey property value. Product Key of the Windows autopilot device.
     * @param value Value to set for the productKey property.
     */
    public void setProductKey(@jakarta.annotation.Nullable final String value) {
        this.productKey = value;
    }
    /**
     * Sets the serialNumber property value. Serial number of the Windows autopilot device.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
    /**
     * Sets the state property value. Current state of the imported device.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ImportedWindowsAutopilotDeviceIdentityState value) {
        this.state = value;
    }
}
