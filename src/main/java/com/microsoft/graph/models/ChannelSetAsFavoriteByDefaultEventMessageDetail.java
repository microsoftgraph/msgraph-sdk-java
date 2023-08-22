package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChannelSetAsFavoriteByDefaultEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Unique identifier of the channel.
     */
    private String channelId;
    /**
     * Initiator of the event.
     */
    private IdentitySet initiator;
    /**
     * Instantiates a new channelSetAsFavoriteByDefaultEventMessageDetail and sets the default values.
     */
    public ChannelSetAsFavoriteByDefaultEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.channelSetAsFavoriteByDefaultEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a channelSetAsFavoriteByDefaultEventMessageDetail
     */
    @jakarta.annotation.Nonnull
    public static ChannelSetAsFavoriteByDefaultEventMessageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChannelSetAsFavoriteByDefaultEventMessageDetail();
    }
    /**
     * Gets the channelId property value. Unique identifier of the channel.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getChannelId() {
        return this.channelId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("channelId", (n) -> { this.setChannelId(n.getStringValue()); });
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.initiator;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("channelId", this.getChannelId());
        writer.writeObjectValue("initiator", this.getInitiator());
    }
    /**
     * Sets the channelId property value. Unique identifier of the channel.
     * @param value Value to set for the channelId property.
     */
    public void setChannelId(@jakarta.annotation.Nullable final String value) {
        this.channelId = value;
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     */
    public void setInitiator(@jakarta.annotation.Nullable final IdentitySet value) {
        this.initiator = value;
    }
}
