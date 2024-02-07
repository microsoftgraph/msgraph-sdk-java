package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttributeMappingFunctionSchema extends Entity implements Parsable {
    /**
     * Instantiates a new AttributeMappingFunctionSchema and sets the default values.
     */
    public AttributeMappingFunctionSchema() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttributeMappingFunctionSchema
     */
    @jakarta.annotation.Nonnull
    public static AttributeMappingFunctionSchema createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeMappingFunctionSchema();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("parameters", (n) -> { this.setParameters(n.getCollectionOfObjectValues(AttributeMappingParameterSchema::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the parameters property value. Collection of function parameters.
     * @return a java.util.List<AttributeMappingParameterSchema>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttributeMappingParameterSchema> getParameters() {
        return this.backingStore.get("parameters");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
    }
    /**
     * Sets the parameters property value. Collection of function parameters.
     * @param value Value to set for the parameters property.
     */
    public void setParameters(@jakarta.annotation.Nullable final java.util.List<AttributeMappingParameterSchema> value) {
        this.backingStore.set("parameters", value);
    }
}
