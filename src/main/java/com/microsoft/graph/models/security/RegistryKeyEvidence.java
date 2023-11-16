package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RegistryKeyEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new RegistryKeyEvidence and sets the default values.
     */
    public RegistryKeyEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.registryKeyEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RegistryKeyEvidence
     */
    @jakarta.annotation.Nonnull
    public static RegistryKeyEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegistryKeyEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("registryHive", (n) -> { this.setRegistryHive(n.getStringValue()); });
        deserializerMap.put("registryKey", (n) -> { this.setRegistryKey(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("registryHive", this.getRegistryHive());
        writer.writeStringValue("registryKey", this.getRegistryKey());
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
}
