package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExchangeAdmin extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ExchangeAdmin} and sets the default values.
     */
    public ExchangeAdmin() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExchangeAdmin}
     */
    @jakarta.annotation.Nonnull
    public static ExchangeAdmin createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExchangeAdmin();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mailboxes", (n) -> { this.setMailboxes(n.getCollectionOfObjectValues(Mailbox::createFromDiscriminatorValue)); });
        deserializerMap.put("tracing", (n) -> { this.setTracing(n.getObjectValue(MessageTracingRoot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mailboxes property value. Represents a user&apos;s mailboxes.
     * @return a {@link java.util.List<Mailbox>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Mailbox> getMailboxes() {
        return this.backingStore.get("mailboxes");
    }
    /**
     * Gets the tracing property value. Represents a container for administrative resources to trace messages.
     * @return a {@link MessageTracingRoot}
     */
    @jakarta.annotation.Nullable
    public MessageTracingRoot getTracing() {
        return this.backingStore.get("tracing");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("mailboxes", this.getMailboxes());
        writer.writeObjectValue("tracing", this.getTracing());
    }
    /**
     * Sets the mailboxes property value. Represents a user&apos;s mailboxes.
     * @param value Value to set for the mailboxes property.
     */
    public void setMailboxes(@jakarta.annotation.Nullable final java.util.List<Mailbox> value) {
        this.backingStore.set("mailboxes", value);
    }
    /**
     * Sets the tracing property value. Represents a container for administrative resources to trace messages.
     * @param value Value to set for the tracing property.
     */
    public void setTracing(@jakarta.annotation.Nullable final MessageTracingRoot value) {
        this.backingStore.set("tracing", value);
    }
}
