package com.microsoft.graph.models;

import com.microsoft.graph.models.AadUserConversationMember;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreement entities. */
public class ConversationMember extends Entity implements Parsable {
    /** The display name of the user. */
    private String _displayName;
    /** The roles for that user. This property only contains additional qualifiers when relevant - for example, if the member has owner privileges, the roles property contains owner as one of the values. Similarly, if the member is a guest, the roles property contains guest as one of the values. A basic member should not have any values specified in the roles property. */
    private java.util.List<String> _roles;
    /** The timestamp denoting how far back a conversation's history is shared with the conversation member. This property is settable only for members of a chat. */
    private OffsetDateTime _visibleHistoryStartDateTime;
    /**
     * Instantiates a new conversationMember and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConversationMember() {
        super();
        this.setOdataType("#microsoft.graph.conversationMember");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conversationMember
     */
    @javax.annotation.Nonnull
    public static ConversationMember createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.aadUserConversationMember": return new AadUserConversationMember();
            }
        }
        return new ConversationMember();
    }
    /**
     * Gets the displayName property value. The display name of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConversationMember currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("roles", (n) -> { currentObject.setRoles(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("visibleHistoryStartDateTime", (n) -> { currentObject.setVisibleHistoryStartDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the roles property value. The roles for that user. This property only contains additional qualifiers when relevant - for example, if the member has owner privileges, the roles property contains owner as one of the values. Similarly, if the member is a guest, the roles property contains guest as one of the values. A basic member should not have any values specified in the roles property.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this._roles;
    }
    /**
     * Gets the visibleHistoryStartDateTime property value. The timestamp denoting how far back a conversation's history is shared with the conversation member. This property is settable only for members of a chat.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getVisibleHistoryStartDateTime() {
        return this._visibleHistoryStartDateTime;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("roles", this.getRoles());
        writer.writeOffsetDateTimeValue("visibleHistoryStartDateTime", this.getVisibleHistoryStartDateTime());
    }
    /**
     * Sets the displayName property value. The display name of the user.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the roles property value. The roles for that user. This property only contains additional qualifiers when relevant - for example, if the member has owner privileges, the roles property contains owner as one of the values. Similarly, if the member is a guest, the roles property contains guest as one of the values. A basic member should not have any values specified in the roles property.
     * @param value Value to set for the roles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoles(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roles = value;
    }
    /**
     * Sets the visibleHistoryStartDateTime property value. The timestamp denoting how far back a conversation's history is shared with the conversation member. This property is settable only for members of a chat.
     * @param value Value to set for the visibleHistoryStartDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisibleHistoryStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._visibleHistoryStartDateTime = value;
    }
}
