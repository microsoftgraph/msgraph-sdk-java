package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegistryKeyEvidence extends AlertEvidence implements Parsable {
    /** Registry hive of the key that the recorded action was applied to. */
    private String registryHive;
    /** Registry key that the recorded action was applied to. */
    private String registryKey;
    /**
     * Instantiates a new RegistryKeyEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RegistryKeyEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RegistryKeyEvidence
     */
    @javax.annotation.Nonnull
    public static RegistryKeyEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegistryKeyEvidence();
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
}
