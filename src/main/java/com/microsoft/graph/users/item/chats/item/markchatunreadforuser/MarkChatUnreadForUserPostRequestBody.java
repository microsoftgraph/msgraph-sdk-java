package com.microsoft.graph.users.item.chats.item.markchatunreadforuser;

import com.microsoft.graph.models.TeamworkUserIdentity;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MarkChatUnreadForUserPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The lastMessageReadDateTime property
     */
    private OffsetDateTime lastMessageReadDateTime;
    /**
     * The user property
     */
    private TeamworkUserIdentity user;
    /**
     * Instantiates a new MarkChatUnreadForUserPostRequestBody and sets the default values.
     */
    public MarkChatUnreadForUserPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MarkChatUnreadForUserPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static MarkChatUnreadForUserPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MarkChatUnreadForUserPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("lastMessageReadDateTime", (n) -> { this.setLastMessageReadDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(TeamworkUserIdentity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastMessageReadDateTime property value. The lastMessageReadDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastMessageReadDateTime() {
        return this.lastMessageReadDateTime;
    }
    /**
     * Gets the user property value. The user property
     * @return a TeamworkUserIdentity
     */
    @jakarta.annotation.Nullable
    public TeamworkUserIdentity getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("lastMessageReadDateTime", this.getLastMessageReadDateTime());
        writer.writeObjectValue("user", this.getUser());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the lastMessageReadDateTime property value. The lastMessageReadDateTime property
     * @param value Value to set for the lastMessageReadDateTime property.
     */
    public void setLastMessageReadDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastMessageReadDateTime = value;
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final TeamworkUserIdentity value) {
        this.user = value;
    }
}
