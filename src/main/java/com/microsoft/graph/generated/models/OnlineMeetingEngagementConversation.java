package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A conversation for Teams QA online meeting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnlineMeetingEngagementConversation extends EngagementConversation implements Parsable {
    /**
     * Instantiates a new {@link OnlineMeetingEngagementConversation} and sets the default values.
     */
    public OnlineMeetingEngagementConversation() {
        super();
        this.setOdataType("#microsoft.graph.onlineMeetingEngagementConversation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnlineMeetingEngagementConversation}
     */
    @jakarta.annotation.Nonnull
    public static OnlineMeetingEngagementConversation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnlineMeetingEngagementConversation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("moderationState", (n) -> { this.setModerationState(n.getEnumValue(EngagementConversationModerationState::forValue)); });
        deserializerMap.put("onlineMeeting", (n) -> { this.setOnlineMeeting(n.getObjectValue(OnlineMeeting::createFromDiscriminatorValue)); });
        deserializerMap.put("onlineMeetingId", (n) -> { this.setOnlineMeetingId(n.getStringValue()); });
        deserializerMap.put("organizer", (n) -> { this.setOrganizer(n.getObjectValue(EngagementIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("upvoteCount", (n) -> { this.setUpvoteCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the moderationState property value. Represents the moderation state of an Engage conversation message.
     * @return a {@link EngagementConversationModerationState}
     */
    @jakarta.annotation.Nullable
    public EngagementConversationModerationState getModerationState() {
        return this.backingStore.get("moderationState");
    }
    /**
     * Gets the onlineMeeting property value. The onlineMeeting property
     * @return a {@link OnlineMeeting}
     */
    @jakarta.annotation.Nullable
    public OnlineMeeting getOnlineMeeting() {
        return this.backingStore.get("onlineMeeting");
    }
    /**
     * Gets the onlineMeetingId property value. The unique identifier of the online meeting associated with this conversation. The online meeting ID links the conversation to a specific meeting instance.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnlineMeetingId() {
        return this.backingStore.get("onlineMeetingId");
    }
    /**
     * Gets the organizer property value. The organizer property
     * @return a {@link EngagementIdentitySet}
     */
    @jakarta.annotation.Nullable
    public EngagementIdentitySet getOrganizer() {
        return this.backingStore.get("organizer");
    }
    /**
     * Gets the upvoteCount property value. The number of upvotes the conversation received.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUpvoteCount() {
        return this.backingStore.get("upvoteCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("moderationState", this.getModerationState());
        writer.writeObjectValue("onlineMeeting", this.getOnlineMeeting());
        writer.writeStringValue("onlineMeetingId", this.getOnlineMeetingId());
        writer.writeObjectValue("organizer", this.getOrganizer());
    }
    /**
     * Sets the moderationState property value. Represents the moderation state of an Engage conversation message.
     * @param value Value to set for the moderationState property.
     */
    public void setModerationState(@jakarta.annotation.Nullable final EngagementConversationModerationState value) {
        this.backingStore.set("moderationState", value);
    }
    /**
     * Sets the onlineMeeting property value. The onlineMeeting property
     * @param value Value to set for the onlineMeeting property.
     */
    public void setOnlineMeeting(@jakarta.annotation.Nullable final OnlineMeeting value) {
        this.backingStore.set("onlineMeeting", value);
    }
    /**
     * Sets the onlineMeetingId property value. The unique identifier of the online meeting associated with this conversation. The online meeting ID links the conversation to a specific meeting instance.
     * @param value Value to set for the onlineMeetingId property.
     */
    public void setOnlineMeetingId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onlineMeetingId", value);
    }
    /**
     * Sets the organizer property value. The organizer property
     * @param value Value to set for the organizer property.
     */
    public void setOrganizer(@jakarta.annotation.Nullable final EngagementIdentitySet value) {
        this.backingStore.set("organizer", value);
    }
    /**
     * Sets the upvoteCount property value. The number of upvotes the conversation received.
     * @param value Value to set for the upvoteCount property.
     */
    public void setUpvoteCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("upvoteCount", value);
    }
}
