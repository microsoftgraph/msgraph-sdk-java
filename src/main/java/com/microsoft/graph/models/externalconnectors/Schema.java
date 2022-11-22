package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Schema extends Entity implements Parsable {
    /** Must be set to microsoft.graph.externalConnector.externalItem. Required. */
    private String _baseType;
    /** The properties defined for the items in the connection. The minimum number of properties is one, the maximum is 128. */
    private java.util.List<Property> _properties;
    /**
     * Instantiates a new schema and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Schema() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a schema
     */
    @javax.annotation.Nonnull
    public static Schema createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Schema();
    }
    /**
     * Gets the baseType property value. Must be set to microsoft.graph.externalConnector.externalItem. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBaseType() {
        return this._baseType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("baseType", (n) -> { this.setBaseType(n.getStringValue()); });
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getCollectionOfObjectValues(Property::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the properties property value. The properties defined for the items in the connection. The minimum number of properties is one, the maximum is 128.
     * @return a property
     */
    @javax.annotation.Nullable
    public java.util.List<Property> getProperties() {
        return this._properties;
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
        writer.writeStringValue("baseType", this.getBaseType());
        writer.writeCollectionOfObjectValues("properties", this.getProperties());
    }
    /**
     * Sets the baseType property value. Must be set to microsoft.graph.externalConnector.externalItem. Required.
     * @param value Value to set for the baseType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBaseType(@javax.annotation.Nullable final String value) {
        this._baseType = value;
    }
    /**
     * Sets the properties property value. The properties defined for the items in the connection. The minimum number of properties is one, the maximum is 128.
     * @param value Value to set for the properties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProperties(@javax.annotation.Nullable final java.util.List<Property> value) {
        this._properties = value;
    }
}
