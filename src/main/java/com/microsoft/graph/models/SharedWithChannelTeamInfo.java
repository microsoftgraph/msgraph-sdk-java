package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharedWithChannelTeamInfo extends TeamInfo implements Parsable {
    /**
     * Instantiates a new SharedWithChannelTeamInfo and sets the default values.
     */
    public SharedWithChannelTeamInfo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharedWithChannelTeamInfo
     */
    @jakarta.annotation.Nonnull
    public static SharedWithChannelTeamInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedWithChannelTeamInfo();
    }
    /**
     * Gets the allowedMembers property value. A collection of team members who have access to the shared channel.
     * @return a java.util.List<ConversationMember>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConversationMember> getAllowedMembers() {
        return this.backingStore.get("allowedMembers");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedMembers", (n) -> { this.setAllowedMembers(n.getCollectionOfObjectValues(ConversationMember::createFromDiscriminatorValue)); });
        deserializerMap.put("isHostTeam", (n) -> { this.setIsHostTeam(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isHostTeam property value. Indicates whether the team is the host of the channel.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHostTeam() {
        return this.backingStore.get("isHostTeam");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("allowedMembers", this.getAllowedMembers());
        writer.writeBooleanValue("isHostTeam", this.getIsHostTeam());
    }
    /**
     * Sets the allowedMembers property value. A collection of team members who have access to the shared channel.
     * @param value Value to set for the allowedMembers property.
     */
    public void setAllowedMembers(@jakarta.annotation.Nullable final java.util.List<ConversationMember> value) {
        this.backingStore.set("allowedMembers", value);
    }
    /**
     * Sets the isHostTeam property value. Indicates whether the team is the host of the channel.
     * @param value Value to set for the isHostTeam property.
     */
    public void setIsHostTeam(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHostTeam", value);
    }
}
