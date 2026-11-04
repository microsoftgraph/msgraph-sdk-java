package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RegistryValueEntityMapping extends EntityMapping implements Parsable {
    /**
     * Instantiates a new {@link RegistryValueEntityMapping} and sets the default values.
     */
    public RegistryValueEntityMapping() {
        super();
        this.setOdataType("#microsoft.graph.security.registryValueEntityMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RegistryValueEntityMapping}
     */
    @jakarta.annotation.Nonnull
    public static RegistryValueEntityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegistryValueEntityMapping();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("keyColumn", (n) -> { this.setKeyColumn(n.getStringValue()); });
        deserializerMap.put("valueNameColumn", (n) -> { this.setValueNameColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyColumn property value. Name of the detection query column that maps to the registry key of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKeyColumn() {
        return this.backingStore.get("keyColumn");
    }
    /**
     * Gets the valueNameColumn property value. Name of the detection query column that maps to the value name of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValueNameColumn() {
        return this.backingStore.get("valueNameColumn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("keyColumn", this.getKeyColumn());
        writer.writeStringValue("valueNameColumn", this.getValueNameColumn());
    }
    /**
     * Sets the keyColumn property value. Name of the detection query column that maps to the registry key of the alert entity.
     * @param value Value to set for the keyColumn property.
     */
    public void setKeyColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("keyColumn", value);
    }
    /**
     * Sets the valueNameColumn property value. Name of the detection query column that maps to the value name of the alert entity.
     * @param value Value to set for the valueNameColumn property.
     */
    public void setValueNameColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("valueNameColumn", value);
    }
}
