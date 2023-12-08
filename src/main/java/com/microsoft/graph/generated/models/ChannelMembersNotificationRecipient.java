package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChannelMembersNotificationRecipient extends TeamworkNotificationRecipient implements Parsable {
    /**
     * Instantiates a new ChannelMembersNotificationRecipient and sets the default values.
     */
    public ChannelMembersNotificationRecipient() {
        super();
        this.setOdataType("#microsoft.graph.channelMembersNotificationRecipient");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChannelMembersNotificationRecipient
     */
    @jakarta.annotation.Nonnull
    public static ChannelMembersNotificationRecipient createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChannelMembersNotificationRecipient();
    }
    /**
     * Gets the channelId property value. The unique identifier for the channel whose members should receive the notification.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getChannelId() {
        return this.backingStore.get("channelId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("channelId", (n) -> { this.setChannelId(n.getStringValue()); });
        deserializerMap.put("teamId", (n) -> { this.setTeamId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the teamId property value. The unique identifier for the team under which the channel resides.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTeamId() {
        return this.backingStore.get("teamId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("channelId", this.getChannelId());
        writer.writeStringValue("teamId", this.getTeamId());
    }
    /**
     * Sets the channelId property value. The unique identifier for the channel whose members should receive the notification.
     * @param value Value to set for the channelId property.
     */
    public void setChannelId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("channelId", value);
    }
    /**
     * Sets the teamId property value. The unique identifier for the team under which the channel resides.
     * @param value Value to set for the teamId property.
     */
    public void setTeamId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("teamId", value);
    }
}
