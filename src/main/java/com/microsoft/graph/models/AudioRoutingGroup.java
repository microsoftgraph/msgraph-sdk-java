package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AudioRoutingGroup extends Entity implements Parsable {
    /**
     * Instantiates a new AudioRoutingGroup and sets the default values.
     */
    public AudioRoutingGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AudioRoutingGroup
     */
    @jakarta.annotation.Nonnull
    public static AudioRoutingGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AudioRoutingGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("receivers", (n) -> { this.setReceivers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("routingMode", (n) -> { this.setRoutingMode(n.getEnumValue(RoutingMode.class)); });
        deserializerMap.put("sources", (n) -> { this.setSources(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the receivers property value. List of receiving participant ids.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getReceivers() {
        return this.backingStore.get("receivers");
    }
    /**
     * Gets the routingMode property value. The routingMode property
     * @return a RoutingMode
     */
    @jakarta.annotation.Nullable
    public RoutingMode getRoutingMode() {
        return this.backingStore.get("routingMode");
    }
    /**
     * Gets the sources property value. List of source participant ids.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSources() {
        return this.backingStore.get("sources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("receivers", this.getReceivers());
        writer.writeEnumValue("routingMode", this.getRoutingMode());
        writer.writeCollectionOfPrimitiveValues("sources", this.getSources());
    }
    /**
     * Sets the receivers property value. List of receiving participant ids.
     * @param value Value to set for the receivers property.
     */
    public void setReceivers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("receivers", value);
    }
    /**
     * Sets the routingMode property value. The routingMode property
     * @param value Value to set for the routingMode property.
     */
    public void setRoutingMode(@jakarta.annotation.Nullable final RoutingMode value) {
        this.backingStore.set("routingMode", value);
    }
    /**
     * Sets the sources property value. List of source participant ids.
     * @param value Value to set for the sources property.
     */
    public void setSources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sources", value);
    }
}
