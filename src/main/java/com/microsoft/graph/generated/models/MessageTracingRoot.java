package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageTracingRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MessageTracingRoot} and sets the default values.
     */
    public MessageTracingRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MessageTracingRoot}
     */
    @jakarta.annotation.Nonnull
    public static MessageTracingRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageTracingRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("messageTraces", (n) -> { this.setMessageTraces(n.getCollectionOfObjectValues(ExchangeMessageTrace::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the messageTraces property value. Represents the trace information of messages that pass through Exchange Online organizations.
     * @return a {@link java.util.List<ExchangeMessageTrace>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExchangeMessageTrace> getMessageTraces() {
        return this.backingStore.get("messageTraces");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("messageTraces", this.getMessageTraces());
    }
    /**
     * Sets the messageTraces property value. Represents the trace information of messages that pass through Exchange Online organizations.
     * @param value Value to set for the messageTraces property.
     */
    public void setMessageTraces(@jakarta.annotation.Nullable final java.util.List<ExchangeMessageTrace> value) {
        this.backingStore.set("messageTraces", value);
    }
}
