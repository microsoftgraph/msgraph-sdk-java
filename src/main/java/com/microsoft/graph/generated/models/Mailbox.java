package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Mailbox extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link Mailbox} and sets the default values.
     */
    public Mailbox() {
        super();
        this.setOdataType("#microsoft.graph.mailbox");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Mailbox}
     */
    @jakarta.annotation.Nonnull
    public static Mailbox createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Mailbox();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("folders", (n) -> { this.setFolders(n.getCollectionOfObjectValues(MailboxFolder::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the folders property value. The folders property
     * @return a {@link java.util.List<MailboxFolder>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MailboxFolder> getFolders() {
        return this.backingStore.get("folders");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("folders", this.getFolders());
    }
    /**
     * Sets the folders property value. The folders property
     * @param value Value to set for the folders property.
     */
    public void setFolders(@jakarta.annotation.Nullable final java.util.List<MailboxFolder> value) {
        this.backingStore.set("folders", value);
    }
}
