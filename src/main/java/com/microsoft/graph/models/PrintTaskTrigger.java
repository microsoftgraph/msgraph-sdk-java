package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class PrintTaskTrigger extends Entity implements Parsable {
    /** The definition property */
    private PrintTaskDefinition _definition;
    /** The event property */
    private PrintEvent _event;
    /**
     * Instantiates a new printTaskTrigger and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintTaskTrigger() {
        super();
        this.setOdataType("#microsoft.graph.printTaskTrigger");
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
        return this._definition;
    }
    /**
     * Gets the event property value. The event property
     * @return a printEvent
     */
    @javax.annotation.Nullable
    public PrintEvent getEvent() {
        return this._event;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrintTaskTrigger currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("definition", (n) -> { currentObject.setDefinition(n.getObjectValue(PrintTaskDefinition::createFromDiscriminatorValue)); });
            this.put("event", (n) -> { currentObject.setEvent(n.getEnumValue(PrintEvent.class)); });
        }};
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
        this._definition = value;
    }
    /**
     * Sets the event property value. The event property
     * @param value Value to set for the event property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvent(@javax.annotation.Nullable final PrintEvent value) {
        this._event = value;
    }
}
