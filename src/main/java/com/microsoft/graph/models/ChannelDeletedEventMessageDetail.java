package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChannelDeletedEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Display name of the channel.
     */
    private String channelDisplayName;
    /**
     * Unique identifier of the channel.
     */
    private String channelId;
    /**
     * Initiator of the event.
     */
    private IdentitySet initiator;
    /**
     * Instantiates a new ChannelDeletedEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChannelDeletedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.channelDeletedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChannelDeletedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static ChannelDeletedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChannelDeletedEventMessageDetail();
    }
    /**
     * Gets the channelDisplayName property value. Display name of the channel.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChannelDisplayName() {
        return this.channelDisplayName;
    }
    /**
     * Gets the channelId property value. Unique identifier of the channel.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getChannelId() {
        return this.channelId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("channelDisplayName", (n) -> { this.setChannelDisplayName(n.getStringValue()); });
        deserializerMap.put("channelId", (n) -> { this.setChannelId(n.getStringValue()); });
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.initiator;
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
        writer.writeStringValue("channelDisplayName", this.getChannelDisplayName());
        writer.writeStringValue("channelId", this.getChannelId());
        writer.writeObjectValue("initiator", this.getInitiator());
    }
    /**
     * Sets the channelDisplayName property value. Display name of the channel.
     * @param value Value to set for the channelDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChannelDisplayName(@javax.annotation.Nullable final String value) {
        this.channelDisplayName = value;
    }
    /**
     * Sets the channelId property value. Unique identifier of the channel.
     * @param value Value to set for the channelId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChannelId(@javax.annotation.Nullable final String value) {
        this.channelId = value;
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this.initiator = value;
    }
}
