package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintTaskTrigger extends Entity implements Parsable {
    /**
     * The definition property
     */
    private PrintTaskDefinition definition;
    /**
     * The event property
     */
    private PrintEvent event;
    /**
     * Instantiates a new printTaskTrigger and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintTaskTrigger() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printTaskTrigger
     */
    @javax.annotation.Nonnull
    public static PrintTaskTrigger createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintTaskTrigger();
    }
    /**
     * Gets the definition property value. The definition property
     * @return a printTaskDefinition
     */
    @javax.annotation.Nullable
    public PrintTaskDefinition getDefinition() {
        return this.definition;
    }
    /**
     * Gets the event property value. The event property
     * @return a printEvent
     */
    @javax.annotation.Nullable
    public PrintEvent getEvent() {
        return this.event;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("definition", (n) -> { this.setDefinition(n.getObjectValue(PrintTaskDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("event", (n) -> { this.setEvent(n.getEnumValue(PrintEvent.class)); });
        return deserializerMap;
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
        writer.writeObjectValue("definition", this.getDefinition());
        writer.writeEnumValue("event", this.getEvent());
    }
    /**
     * Sets the definition property value. The definition property
     * @param value Value to set for the definition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinition(@javax.annotation.Nullable final PrintTaskDefinition value) {
        this.definition = value;
    }
    /**
     * Sets the event property value. The event property
     * @param value Value to set for the event property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvent(@javax.annotation.Nullable final PrintEvent value) {
        this.event = value;
    }
}
