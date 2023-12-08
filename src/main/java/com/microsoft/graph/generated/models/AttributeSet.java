package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttributeSet extends Entity implements Parsable {
    /**
     * Instantiates a new AttributeSet and sets the default values.
     */
    public AttributeSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttributeSet
     */
    @jakarta.annotation.Nonnull
    public static AttributeSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeSet();
    }
    /**
     * Gets the description property value. Description of the attribute set. Can be up to 128 characters long and include Unicode characters. Can be changed later.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("maxAttributesPerSet", (n) -> { this.setMaxAttributesPerSet(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxAttributesPerSet property value. Maximum number of custom security attributes that can be defined in this attribute set. Default value is null. If not specified, the administrator can add up to the maximum of 500 active attributes per tenant. Can be changed later.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxAttributesPerSet() {
        return this.backingStore.get("maxAttributesPerSet");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeIntegerValue("maxAttributesPerSet", this.getMaxAttributesPerSet());
    }
    /**
     * Sets the description property value. Description of the attribute set. Can be up to 128 characters long and include Unicode characters. Can be changed later.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the maxAttributesPerSet property value. Maximum number of custom security attributes that can be defined in this attribute set. Default value is null. If not specified, the administrator can add up to the maximum of 500 active attributes per tenant. Can be changed later.
     * @param value Value to set for the maxAttributesPerSet property.
     */
    public void setMaxAttributesPerSet(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maxAttributesPerSet", value);
    }
}
