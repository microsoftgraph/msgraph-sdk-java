package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SkypeUserConversationMember extends ConversationMember implements Parsable {
    /** Skype ID of the user. */
    private String skypeId;
    /**
     * Instantiates a new SkypeUserConversationMember and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SkypeUserConversationMember() {
        super();
        this.setOdataType("#microsoft.graph.skypeUserConversationMember");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SkypeUserConversationMember
     */
    @javax.annotation.Nonnull
    public static SkypeUserConversationMember createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SkypeUserConversationMember();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("skypeId", (n) -> { this.setSkypeId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the skypeId property value. Skype ID of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkypeId() {
        return this.skypeId;
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
        writer.writeStringValue("skypeId", this.getSkypeId());
    }
    /**
     * Sets the skypeId property value. Skype ID of the user.
     * @param value Value to set for the skypeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkypeId(@javax.annotation.Nullable final String value) {
        this.skypeId = value;
    }
}
