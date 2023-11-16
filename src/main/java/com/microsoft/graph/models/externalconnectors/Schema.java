package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Schema extends Entity implements Parsable {
    /**
     * Instantiates a new Schema and sets the default values.
     */
    public Schema() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Schema
     */
    @jakarta.annotation.Nonnull
    public static Schema createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Schema();
    }
    /**
     * Gets the baseType property value. Must be set to microsoft.graph.externalConnector.externalItem. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBaseType() {
        return this.BackingStore.get("baseType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("baseType", (n) -> { this.setBaseType(n.getStringValue()); });
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getCollectionOfObjectValues(Property::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the properties property value. The properties defined for the items in the connection. The minimum number of properties is one, the maximum is 128.
     * @return a java.util.List<Property>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Property> getProperties() {
        return this.BackingStore.get("properties");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("baseType", this.getBaseType());
        writer.writeCollectionOfObjectValues("properties", this.getProperties());
    }
    /**
     * Sets the baseType property value. Must be set to microsoft.graph.externalConnector.externalItem. Required.
     * @param value Value to set for the baseType property.
     */
    public void setBaseType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("baseType", value);
    }
    /**
     * Sets the properties property value. The properties defined for the items in the connection. The minimum number of properties is one, the maximum is 128.
     * @param value Value to set for the properties property.
     */
    public void setProperties(@jakarta.annotation.Nullable final java.util.List<Property> value) {
        this.BackingStore.set("properties", value);
    }
}
