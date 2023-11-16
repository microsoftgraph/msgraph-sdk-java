package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RegistryValueEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new RegistryValueEvidence and sets the default values.
     */
    public RegistryValueEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.registryValueEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RegistryValueEvidence
     */
    @jakarta.annotation.Nonnull
    public static RegistryValueEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegistryValueEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mdeDeviceId", (n) -> { this.setMdeDeviceId(n.getStringValue()); });
        deserializerMap.put("registryHive", (n) -> { this.setRegistryHive(n.getStringValue()); });
        deserializerMap.put("registryKey", (n) -> { this.setRegistryKey(n.getStringValue()); });
        deserializerMap.put("registryValue", (n) -> { this.setRegistryValue(n.getStringValue()); });
        deserializerMap.put("registryValueName", (n) -> { this.setRegistryValueName(n.getStringValue()); });
        deserializerMap.put("registryValueType", (n) -> { this.setRegistryValueType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMdeDeviceId() {
        return this.BackingStore.get("mdeDeviceId");
    }
    /**
     * Gets the registryHive property value. Registry hive of the key that the recorded action was applied to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegistryHive() {
        return this.BackingStore.get("registryHive");
    }
    /**
     * Gets the registryKey property value. Registry key that the recorded action was applied to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegistryKey() {
        return this.BackingStore.get("registryKey");
    }
    /**
     * Gets the registryValue property value. Data of the registry value that the recorded action was applied to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegistryValue() {
        return this.BackingStore.get("registryValue");
    }
    /**
     * Gets the registryValueName property value. Name of the registry value that the recorded action was applied to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegistryValueName() {
        return this.BackingStore.get("registryValueName");
    }
    /**
     * Gets the registryValueType property value. Data type, such as binary or string, of the registry value that the recorded action was applied to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegistryValueType() {
        return this.BackingStore.get("registryValueType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("mdeDeviceId", this.getMdeDeviceId());
        writer.writeStringValue("registryHive", this.getRegistryHive());
        writer.writeStringValue("registryKey", this.getRegistryKey());
        writer.writeStringValue("registryValue", this.getRegistryValue());
        writer.writeStringValue("registryValueName", this.getRegistryValueName());
        writer.writeStringValue("registryValueType", this.getRegistryValueType());
    }
    /**
     * Sets the mdeDeviceId property value. A unique identifier assigned to a device by Microsoft Defender for Endpoint.
     * @param value Value to set for the mdeDeviceId property.
     */
    public void setMdeDeviceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("mdeDeviceId", value);
    }
    /**
     * Sets the registryHive property value. Registry hive of the key that the recorded action was applied to.
     * @param value Value to set for the registryHive property.
     */
    public void setRegistryHive(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("registryHive", value);
    }
    /**
     * Sets the registryKey property value. Registry key that the recorded action was applied to.
     * @param value Value to set for the registryKey property.
     */
    public void setRegistryKey(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("registryKey", value);
    }
    /**
     * Sets the registryValue property value. Data of the registry value that the recorded action was applied to.
     * @param value Value to set for the registryValue property.
     */
    public void setRegistryValue(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("registryValue", value);
    }
    /**
     * Sets the registryValueName property value. Name of the registry value that the recorded action was applied to.
     * @param value Value to set for the registryValueName property.
     */
    public void setRegistryValueName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("registryValueName", value);
    }
    /**
     * Sets the registryValueType property value. Data type, such as binary or string, of the registry value that the recorded action was applied to.
     * @param value Value to set for the registryValueType property.
     */
    public void setRegistryValueType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("registryValueType", value);
    }
}
