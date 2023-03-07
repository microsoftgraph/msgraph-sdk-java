package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkConversationIdentity extends Identity implements Parsable {
    /** Type of conversation. Possible values are: team, channel, chat, and unknownFutureValue. */
    private TeamworkConversationIdentityType conversationIdentityType;
    /**
     * Instantiates a new TeamworkConversationIdentity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkConversationIdentity() {
        super();
        this.setOdataType("#microsoft.graph.teamworkConversationIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkConversationIdentity
     */
    @javax.annotation.Nonnull
    public static TeamworkConversationIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkConversationIdentity();
    }
    /**
     * Gets the conversationIdentityType property value. Type of conversation. Possible values are: team, channel, chat, and unknownFutureValue.
     * @return a teamworkConversationIdentityType
     */
    @javax.annotation.Nullable
    public TeamworkConversationIdentityType getConversationIdentityType() {
        return this.conversationIdentityType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conversationIdentityType", (n) -> { this.setConversationIdentityType(n.getEnumValue(TeamworkConversationIdentityType.class)); });
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
        writer.writeEnumValue("conversationIdentityType", this.getConversationIdentityType());
    }
    /**
     * Sets the conversationIdentityType property value. Type of conversation. Possible values are: team, channel, chat, and unknownFutureValue.
     * @param value Value to set for the conversationIdentityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConversationIdentityType(@javax.annotation.Nullable final TeamworkConversationIdentityType value) {
        this.conversationIdentityType = value;
    }
}
