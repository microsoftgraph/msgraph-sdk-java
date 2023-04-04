package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegistryValueEvidence extends AlertEvidence implements Parsable {
    /** Registry hive of the key that the recorded action was applied to. */
    private String registryHive;
    /** Registry key that the recorded action was applied to. */
    private String registryKey;
    /** Data of the registry value that the recorded action was applied to. */
    private String registryValue;
    /** Name of the registry value that the recorded action was applied to. */
    private String registryValueName;
    /** Data type, such as binary or string, of the registry value that the recorded action was applied to. */
    private String registryValueType;
    /**
     * Instantiates a new RegistryValueEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RegistryValueEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RegistryValueEvidence
     */
    @javax.annotation.Nonnull
    public static RegistryValueEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegistryValueEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("registryHive", (n) -> { this.setRegistryHive(n.getStringValue()); });
        deserializerMap.put("registryKey", (n) -> { this.setRegistryKey(n.getStringValue()); });
        deserializerMap.put("registryValue", (n) -> { this.setRegistryValue(n.getStringValue()); });
        deserializerMap.put("registryValueName", (n) -> { this.setRegistryValueName(n.getStringValue()); });
        deserializerMap.put("registryValueType", (n) -> { this.setRegistryValueType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the registryHive property value. Registry hive of the key that the recorded action was applied to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryHive() {
        return this.registryHive;
    }
    /**
     * Gets the registryKey property value. Registry key that the recorded action was applied to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryKey() {
        return this.registryKey;
    }
    /**
     * Gets the registryValue property value. Data of the registry value that the recorded action was applied to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryValue() {
        return this.registryValue;
    }
    /**
     * Gets the registryValueName property value. Name of the registry value that the recorded action was applied to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryValueName() {
        return this.registryValueName;
    }
    /**
     * Gets the registryValueType property value. Data type, such as binary or string, of the registry value that the recorded action was applied to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryValueType() {
        return this.registryValueType;
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
        writer.writeStringValue("registryHive", this.getRegistryHive());
        writer.writeStringValue("registryKey", this.getRegistryKey());
        writer.writeStringValue("registryValue", this.getRegistryValue());
        writer.writeStringValue("registryValueName", this.getRegistryValueName());
        writer.writeStringValue("registryValueType", this.getRegistryValueType());
    }
    /**
     * Sets the registryHive property value. Registry hive of the key that the recorded action was applied to.
     * @param value Value to set for the registryHive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryHive(@javax.annotation.Nullable final String value) {
        this.registryHive = value;
    }
    /**
     * Sets the registryKey property value. Registry key that the recorded action was applied to.
     * @param value Value to set for the registryKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryKey(@javax.annotation.Nullable final String value) {
        this.registryKey = value;
    }
    /**
     * Sets the registryValue property value. Data of the registry value that the recorded action was applied to.
     * @param value Value to set for the registryValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryValue(@javax.annotation.Nullable final String value) {
        this.registryValue = value;
    }
    /**
     * Sets the registryValueName property value. Name of the registry value that the recorded action was applied to.
     * @param value Value to set for the registryValueName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryValueName(@javax.annotation.Nullable final String value) {
        this.registryValueName = value;
    }
    /**
     * Sets the registryValueType property value. Data type, such as binary or string, of the registry value that the recorded action was applied to.
     * @param value Value to set for the registryValueType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryValueType(@javax.annotation.Nullable final String value) {
        this.registryValueType = value;
    }
}
