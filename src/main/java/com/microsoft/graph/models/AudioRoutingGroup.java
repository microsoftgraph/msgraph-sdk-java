package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AudioRoutingGroup extends Entity implements Parsable {
    /**
     * List of receiving participant ids.
     */
    private java.util.List<String> receivers;
    /**
     * The routingMode property
     */
    private RoutingMode routingMode;
    /**
     * List of source participant ids.
     */
    private java.util.List<String> sources;
    /**
     * Instantiates a new audioRoutingGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AudioRoutingGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a audioRoutingGroup
     */
    @javax.annotation.Nonnull
    public static AudioRoutingGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AudioRoutingGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("receivers", (n) -> { this.setReceivers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("routingMode", (n) -> { this.setRoutingMode(n.getEnumValue(RoutingMode.class)); });
        deserializerMap.put("sources", (n) -> { this.setSources(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the receivers property value. List of receiving participant ids.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getReceivers() {
        return this.receivers;
    }
    /**
     * Gets the routingMode property value. The routingMode property
     * @return a routingMode
     */
    @javax.annotation.Nullable
    public RoutingMode getRoutingMode() {
        return this.routingMode;
    }
    /**
     * Gets the sources property value. List of source participant ids.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSources() {
        return this.sources;
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
        writer.writeCollectionOfPrimitiveValues("receivers", this.getReceivers());
        writer.writeEnumValue("routingMode", this.getRoutingMode());
        writer.writeCollectionOfPrimitiveValues("sources", this.getSources());
    }
    /**
     * Sets the receivers property value. List of receiving participant ids.
     * @param value Value to set for the receivers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReceivers(@javax.annotation.Nullable final java.util.List<String> value) {
        this.receivers = value;
    }
    /**
     * Sets the routingMode property value. The routingMode property
     * @param value Value to set for the routingMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoutingMode(@javax.annotation.Nullable final RoutingMode value) {
        this.routingMode = value;
    }
    /**
     * Sets the sources property value. List of source participant ids.
     * @param value Value to set for the sources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSources(@javax.annotation.Nullable final java.util.List<String> value) {
        this.sources = value;
    }
}
