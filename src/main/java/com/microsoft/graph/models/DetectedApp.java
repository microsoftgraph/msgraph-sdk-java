package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A managed or unmanaged app that is installed on a managed device. Unmanaged apps will only appear for devices marked as corporate owned.
 */
public class DetectedApp extends Entity implements Parsable {
    /**
     * The number of devices that have installed this application
     */
    private Integer deviceCount;
    /**
     * Name of the discovered application. Read-only
     */
    private String displayName;
    /**
     * The devices that have the discovered application installed
     */
    private java.util.List<ManagedDevice> managedDevices;
    /**
     * Indicates the operating system / platform of the discovered application.  Some possible values are Windows, iOS, macOS. The default value is unknown (0).
     */
    private DetectedAppPlatformType platform;
    /**
     * Indicates the publisher of the discovered application. For example: 'Microsoft'.  The default value is an empty string.
     */
    private String publisher;
    /**
     * Discovered application size in bytes. Read-only
     */
    private Long sizeInByte;
    /**
     * Version of the discovered application. Read-only
     */
    private String version;
    /**
     * Instantiates a new detectedApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.deviceCount;
    }
    /**
     * Gets the displayName property value. Name of the discovered application. Read-only
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("managedDevices", (n) -> { this.setManagedDevices(n.getCollectionOfObjectValues(ManagedDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(DetectedAppPlatformType.class)); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("sizeInByte", (n) -> { this.setSizeInByte(n.getLongValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedDevices property value. The devices that have the discovered application installed
     * @return a managedDevice
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDevice> getManagedDevices() {
        return this.managedDevices;
    }
    /**
     * Gets the platform property value. Indicates the operating system / platform of the discovered application.  Some possible values are Windows, iOS, macOS. The default value is unknown (0).
     * @return a DetectedAppPlatformType
     */
    @javax.annotation.Nullable
    public DetectedAppPlatformType getPlatform() {
        return this.platform;
    }
    /**
     * Gets the publisher property value. Indicates the publisher of the discovered application. For example: 'Microsoft'.  The default value is an empty string.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * Gets the sizeInByte property value. Discovered application size in bytes. Read-only
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSizeInByte() {
        return this.sizeInByte;
    }
    /**
     * Gets the version property value. Version of the discovered application. Read-only
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("managedDevices", this.getManagedDevices());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeLongValue("sizeInByte", this.getSizeInByte());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the deviceCount property value. The number of devices that have installed this application
     * @param value Value to set for the deviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.deviceCount = value;
    }
    /**
     * Sets the displayName property value. Name of the discovered application. Read-only
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the managedDevices property value. The devices that have the discovered application installed
     * @param value Value to set for the managedDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDevices(@javax.annotation.Nullable final java.util.List<ManagedDevice> value) {
        this.managedDevices = value;
    }
    /**
     * Sets the platform property value. Indicates the operating system / platform of the discovered application.  Some possible values are Windows, iOS, macOS. The default value is unknown (0).
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final DetectedAppPlatformType value) {
        this.platform = value;
    }
    /**
     * Sets the publisher property value. Indicates the publisher of the discovered application. For example: 'Microsoft'.  The default value is an empty string.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this.publisher = value;
    }
    /**
     * Sets the sizeInByte property value. Discovered application size in bytes. Read-only
     * @param value Value to set for the sizeInByte property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSizeInByte(@javax.annotation.Nullable final Long value) {
        this.sizeInByte = value;
    }
    /**
     * Sets the version property value. Version of the discovered application. Read-only
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
