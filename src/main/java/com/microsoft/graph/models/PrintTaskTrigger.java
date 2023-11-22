package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrintTaskTrigger extends Entity implements Parsable {
    /**
     * Instantiates a new PrintTaskTrigger and sets the default values.
     */
    public PrintTaskTrigger() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrintTaskTrigger
     */
    @jakarta.annotation.Nonnull
    public static PrintTaskTrigger createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintTaskTrigger();
    }
    /**
     * Gets the definition property value. The definition property
     * @return a PrintTaskDefinition
     */
    @jakarta.annotation.Nullable
    public PrintTaskDefinition getDefinition() {
        return this.backingStore.get("definition");
    }
    /**
     * Gets the event property value. The event property
     * @return a PrintEvent
     */
    @jakarta.annotation.Nullable
    public PrintEvent getEvent() {
        return this.backingStore.get("event");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("definition", (n) -> { this.setDefinition(n.getObjectValue(PrintTaskDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("event", (n) -> { this.setEvent(n.getEnumValue(PrintEvent::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("definition", this.getDefinition());
        writer.writeEnumValue("event", this.getEvent());
    }
    /**
     * Sets the definition property value. The definition property
     * @param value Value to set for the definition property.
     */
    public void setDefinition(@jakarta.annotation.Nullable final PrintTaskDefinition value) {
        this.backingStore.set("definition", value);
    }
    /**
     * Sets the event property value. The event property
     * @param value Value to set for the event property.
     */
    public void setEvent(@jakarta.annotation.Nullable final PrintEvent value) {
        this.backingStore.set("event", value);
    }
}
