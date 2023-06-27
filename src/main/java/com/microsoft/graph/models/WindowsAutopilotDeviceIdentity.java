package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The windowsAutopilotDeviceIdentity resource represents a Windows Autopilot Device.
 */
public class WindowsAutopilotDeviceIdentity extends Entity implements Parsable {
    /**
     * Addressable user name.
     */
    private String addressableUserName;
    /**
     * AAD Device ID - to be deprecated
     */
    private String azureActiveDirectoryDeviceId;
    /**
     * Display Name
     */
    private String displayName;
    /**
     * The enrollmentState property
     */
    private EnrollmentState enrollmentState;
    /**
     * Group Tag of the Windows autopilot device.
     */
    private String groupTag;
    /**
     * Intune Last Contacted Date Time of the Windows autopilot device.
     */
    private OffsetDateTime lastContactedDateTime;
    /**
     * Managed Device ID
     */
    private String managedDeviceId;
    /**
     * Oem manufacturer of the Windows autopilot device.
     */
    private String manufacturer;
    /**
     * Model name of the Windows autopilot device.
     */
    private String model;
    /**
     * Product Key of the Windows autopilot device.
     */
    private String productKey;
    /**
     * Purchase Order Identifier of the Windows autopilot device.
     */
    private String purchaseOrderIdentifier;
    /**
     * Resource Name.
     */
    private String resourceName;
    /**
     * Serial number of the Windows autopilot device.
     */
    private String serialNumber;
    /**
     * SKU Number
     */
    private String skuNumber;
    /**
     * System Family
     */
    private String systemFamily;
    /**
     * User Principal Name.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new windowsAutopilotDeviceIdentity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsAutopilotDeviceIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nonnull
    public static WindowsAutopilotDeviceIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAutopilotDeviceIdentity();
    }
    /**
     * Gets the addressableUserName property value. Addressable user name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddressableUserName() {
        return this.addressableUserName;
    }
    /**
     * Gets the azureActiveDirectoryDeviceId property value. AAD Device ID - to be deprecated
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureActiveDirectoryDeviceId() {
        return this.azureActiveDirectoryDeviceId;
    }
    /**
     * Gets the displayName property value. Display Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the enrollmentState property value. The enrollmentState property
     * @return a EnrollmentState
     */
    @javax.annotation.Nullable
    public EnrollmentState getEnrollmentState() {
        return this.enrollmentState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addressableUserName", (n) -> { this.setAddressableUserName(n.getStringValue()); });
        deserializerMap.put("azureActiveDirectoryDeviceId", (n) -> { this.setAzureActiveDirectoryDeviceId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enrollmentState", (n) -> { this.setEnrollmentState(n.getEnumValue(EnrollmentState.class)); });
        deserializerMap.put("groupTag", (n) -> { this.setGroupTag(n.getStringValue()); });
        deserializerMap.put("lastContactedDateTime", (n) -> { this.setLastContactedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("productKey", (n) -> { this.setProductKey(n.getStringValue()); });
        deserializerMap.put("purchaseOrderIdentifier", (n) -> { this.setPurchaseOrderIdentifier(n.getStringValue()); });
        deserializerMap.put("resourceName", (n) -> { this.setResourceName(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("skuNumber", (n) -> { this.setSkuNumber(n.getStringValue()); });
        deserializerMap.put("systemFamily", (n) -> { this.setSystemFamily(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupTag property value. Group Tag of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupTag() {
        return this.groupTag;
    }
    /**
     * Gets the lastContactedDateTime property value. Intune Last Contacted Date Time of the Windows autopilot device.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastContactedDateTime() {
        return this.lastContactedDateTime;
    }
    /**
     * Gets the managedDeviceId property value. Managed Device ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }
    /**
     * Gets the manufacturer property value. Oem manufacturer of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. Model name of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the productKey property value. Product Key of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductKey() {
        return this.productKey;
    }
    /**
     * Gets the purchaseOrderIdentifier property value. Purchase Order Identifier of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPurchaseOrderIdentifier() {
        return this.purchaseOrderIdentifier;
    }
    /**
     * Gets the resourceName property value. Resource Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceName() {
        return this.resourceName;
    }
    /**
     * Gets the serialNumber property value. Serial number of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Gets the skuNumber property value. SKU Number
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuNumber() {
        return this.skuNumber;
    }
    /**
     * Gets the systemFamily property value. System Family
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSystemFamily() {
        return this.systemFamily;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("addressableUserName", this.getAddressableUserName());
        writer.writeStringValue("azureActiveDirectoryDeviceId", this.getAzureActiveDirectoryDeviceId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("enrollmentState", this.getEnrollmentState());
        writer.writeStringValue("groupTag", this.getGroupTag());
        writer.writeOffsetDateTimeValue("lastContactedDateTime", this.getLastContactedDateTime());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("productKey", this.getProductKey());
        writer.writeStringValue("purchaseOrderIdentifier", this.getPurchaseOrderIdentifier());
        writer.writeStringValue("resourceName", this.getResourceName());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("skuNumber", this.getSkuNumber());
        writer.writeStringValue("systemFamily", this.getSystemFamily());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the addressableUserName property value. Addressable user name.
     * @param value Value to set for the addressableUserName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddressableUserName(@javax.annotation.Nullable final String value) {
        this.addressableUserName = value;
    }
    /**
     * Sets the azureActiveDirectoryDeviceId property value. AAD Device ID - to be deprecated
     * @param value Value to set for the azureActiveDirectoryDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureActiveDirectoryDeviceId(@javax.annotation.Nullable final String value) {
        this.azureActiveDirectoryDeviceId = value;
    }
    /**
     * Sets the displayName property value. Display Name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the enrollmentState property value. The enrollmentState property
     * @param value Value to set for the enrollmentState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentState(@javax.annotation.Nullable final EnrollmentState value) {
        this.enrollmentState = value;
    }
    /**
     * Sets the groupTag property value. Group Tag of the Windows autopilot device.
     * @param value Value to set for the groupTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupTag(@javax.annotation.Nullable final String value) {
        this.groupTag = value;
    }
    /**
     * Sets the lastContactedDateTime property value. Intune Last Contacted Date Time of the Windows autopilot device.
     * @param value Value to set for the lastContactedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastContactedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastContactedDateTime = value;
    }
    /**
     * Sets the managedDeviceId property value. Managed Device ID
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this.managedDeviceId = value;
    }
    /**
     * Sets the manufacturer property value. Oem manufacturer of the Windows autopilot device.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. Model name of the Windows autopilot device.
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the productKey property value. Product Key of the Windows autopilot device.
     * @param value Value to set for the productKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductKey(@javax.annotation.Nullable final String value) {
        this.productKey = value;
    }
    /**
     * Sets the purchaseOrderIdentifier property value. Purchase Order Identifier of the Windows autopilot device.
     * @param value Value to set for the purchaseOrderIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPurchaseOrderIdentifier(@javax.annotation.Nullable final String value) {
        this.purchaseOrderIdentifier = value;
    }
    /**
     * Sets the resourceName property value. Resource Name.
     * @param value Value to set for the resourceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceName(@javax.annotation.Nullable final String value) {
        this.resourceName = value;
    }
    /**
     * Sets the serialNumber property value. Serial number of the Windows autopilot device.
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
    /**
     * Sets the skuNumber property value. SKU Number
     * @param value Value to set for the skuNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuNumber(@javax.annotation.Nullable final String value) {
        this.skuNumber = value;
    }
    /**
     * Sets the systemFamily property value. System Family
     * @param value Value to set for the systemFamily property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemFamily(@javax.annotation.Nullable final String value) {
        this.systemFamily = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
