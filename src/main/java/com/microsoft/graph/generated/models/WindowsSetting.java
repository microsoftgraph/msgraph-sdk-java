package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WindowsSetting} and sets the default values.
     */
    public WindowsSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsSetting}
     */
    @jakarta.annotation.Nonnull
    public static WindowsSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("instances", (n) -> { this.setInstances(n.getCollectionOfObjectValues(WindowsSettingInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("payloadType", (n) -> { this.setPayloadType(n.getStringValue()); });
        deserializerMap.put("settingType", (n) -> { this.setSettingType(n.getEnumValue(WindowsSettingType::forValue)); });
        deserializerMap.put("windowsDeviceId", (n) -> { this.setWindowsDeviceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instances property value. A collection of setting values for a given windowsSetting.
     * @return a {@link java.util.List<WindowsSettingInstance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsSettingInstance> getInstances() {
        return this.backingStore.get("instances");
    }
    /**
     * Gets the payloadType property value. The type of setting payloads contained in the instances navigation property.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayloadType() {
        return this.backingStore.get("payloadType");
    }
    /**
     * Gets the settingType property value. The settingType property
     * @return a {@link WindowsSettingType}
     */
    @jakarta.annotation.Nullable
    public WindowsSettingType getSettingType() {
        return this.backingStore.get("settingType");
    }
    /**
     * Gets the windowsDeviceId property value. A unique identifier for the device the setting might belong to if it is of the settingType backup.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWindowsDeviceId() {
        return this.backingStore.get("windowsDeviceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("instances", this.getInstances());
        writer.writeStringValue("payloadType", this.getPayloadType());
        writer.writeEnumValue("settingType", this.getSettingType());
        writer.writeStringValue("windowsDeviceId", this.getWindowsDeviceId());
    }
    /**
     * Sets the instances property value. A collection of setting values for a given windowsSetting.
     * @param value Value to set for the instances property.
     */
    public void setInstances(@jakarta.annotation.Nullable final java.util.List<WindowsSettingInstance> value) {
        this.backingStore.set("instances", value);
    }
    /**
     * Sets the payloadType property value. The type of setting payloads contained in the instances navigation property.
     * @param value Value to set for the payloadType property.
     */
    public void setPayloadType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("payloadType", value);
    }
    /**
     * Sets the settingType property value. The settingType property
     * @param value Value to set for the settingType property.
     */
    public void setSettingType(@jakarta.annotation.Nullable final WindowsSettingType value) {
        this.backingStore.set("settingType", value);
    }
    /**
     * Sets the windowsDeviceId property value. A unique identifier for the device the setting might belong to if it is of the settingType backup.
     * @param value Value to set for the windowsDeviceId property.
     */
    public void setWindowsDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("windowsDeviceId", value);
    }
}
