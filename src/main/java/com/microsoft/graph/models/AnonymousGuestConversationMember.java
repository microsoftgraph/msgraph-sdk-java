package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AnonymousGuestConversationMember extends ConversationMember implements Parsable {
    /** The anonymousGuestId property */
    private String _anonymousGuestId;
    /**
     * Instantiates a new AnonymousGuestConversationMember and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AnonymousGuestConversationMember() {
        super();
        this.setOdataType("#microsoft.graph.anonymousGuestConversationMember");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AnonymousGuestConversationMember
     */
    @javax.annotation.Nonnull
    public static AnonymousGuestConversationMember createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnonymousGuestConversationMember();
    }
    /**
     * Gets the anonymousGuestId property value. The anonymousGuestId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAnonymousGuestId() {
        return this._anonymousGuestId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("anonymousGuestId", (n) -> { this.setAnonymousGuestId(n.getStringValue()); });
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
        writer.writeStringValue("anonymousGuestId", this.getAnonymousGuestId());
    }
    /**
     * Sets the anonymousGuestId property value. The anonymousGuestId property
     * @param value Value to set for the anonymousGuestId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnonymousGuestId(@javax.annotation.Nullable final String value) {
        this._anonymousGuestId = value;
    }
}
