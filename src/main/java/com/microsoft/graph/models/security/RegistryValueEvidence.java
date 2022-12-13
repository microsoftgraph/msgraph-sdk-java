package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegistryValueEvidence extends AlertEvidence implements Parsable {
    /** The registryHive property */
    private String _registryHive;
    /** The registryKey property */
    private String _registryKey;
    /** The registryValue property */
    private String _registryValue;
    /** The registryValueName property */
    private String _registryValueName;
    /** The registryValueType property */
    private String _registryValueType;
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("registryHive", (n) -> { this.setRegistryHive(n.getStringValue()); });
        deserializerMap.put("registryKey", (n) -> { this.setRegistryKey(n.getStringValue()); });
        deserializerMap.put("registryValue", (n) -> { this.setRegistryValue(n.getStringValue()); });
        deserializerMap.put("registryValueName", (n) -> { this.setRegistryValueName(n.getStringValue()); });
        deserializerMap.put("registryValueType", (n) -> { this.setRegistryValueType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the registryHive property value. The registryHive property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryHive() {
        return this._registryHive;
    }
    /**
     * Gets the registryKey property value. The registryKey property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryKey() {
        return this._registryKey;
    }
    /**
     * Gets the registryValue property value. The registryValue property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryValue() {
        return this._registryValue;
    }
    /**
     * Gets the registryValueName property value. The registryValueName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryValueName() {
        return this._registryValueName;
    }
    /**
     * Gets the registryValueType property value. The registryValueType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistryValueType() {
        return this._registryValueType;
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
     * Sets the registryHive property value. The registryHive property
     * @param value Value to set for the registryHive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryHive(@javax.annotation.Nullable final String value) {
        this._registryHive = value;
    }
    /**
     * Sets the registryKey property value. The registryKey property
     * @param value Value to set for the registryKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryKey(@javax.annotation.Nullable final String value) {
        this._registryKey = value;
    }
    /**
     * Sets the registryValue property value. The registryValue property
     * @param value Value to set for the registryValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryValue(@javax.annotation.Nullable final String value) {
        this._registryValue = value;
    }
    /**
     * Sets the registryValueName property value. The registryValueName property
     * @param value Value to set for the registryValueName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryValueName(@javax.annotation.Nullable final String value) {
        this._registryValueName = value;
    }
    /**
     * Sets the registryValueType property value. The registryValueType property
     * @param value Value to set for the registryValueType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistryValueType(@javax.annotation.Nullable final String value) {
        this._registryValueType = value;
    }
}
