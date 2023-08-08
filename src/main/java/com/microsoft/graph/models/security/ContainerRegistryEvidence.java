package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContainerRegistryEvidence extends AlertEvidence implements Parsable {
    /**
     * The registry URI.
     */
    private String registry;
    /**
     * Instantiates a new containerRegistryEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ContainerRegistryEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.containerRegistryEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a containerRegistryEvidence
     */
    @javax.annotation.Nonnull
    public static ContainerRegistryEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContainerRegistryEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("registry", (n) -> { this.setRegistry(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the registry property value. The registry URI.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistry() {
        return this.registry;
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
        writer.writeStringValue("registry", this.getRegistry());
    }
    /**
     * Sets the registry property value. The registry URI.
     * @param value Value to set for the registry property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistry(@javax.annotation.Nullable final String value) {
        this.registry = value;
    }
}
