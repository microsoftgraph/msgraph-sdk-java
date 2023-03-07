package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConversationMemberRoleUpdatedEventMessageDetail extends EventMessageDetail implements Parsable {
    /** Roles for the coversation member user. */
    private java.util.List<String> conversationMemberRoles;
    /** Identity of the conversation member user. */
    private TeamworkUserIdentity conversationMemberUser;
    /** Initiator of the event. */
    private IdentitySet initiator;
    /**
     * Instantiates a new ConversationMemberRoleUpdatedEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConversationMemberRoleUpdatedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.conversationMemberRoleUpdatedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConversationMemberRoleUpdatedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static ConversationMemberRoleUpdatedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConversationMemberRoleUpdatedEventMessageDetail();
    }
    /**
     * Gets the conversationMemberRoles property value. Roles for the coversation member user.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getConversationMemberRoles() {
        return this.conversationMemberRoles;
    }
    /**
     * Gets the conversationMemberUser property value. Identity of the conversation member user.
     * @return a teamworkUserIdentity
     */
    @javax.annotation.Nullable
    public TeamworkUserIdentity getConversationMemberUser() {
        return this.conversationMemberUser;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conversationMemberRoles", (n) -> { this.setConversationMemberRoles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("conversationMemberUser", (n) -> { this.setConversationMemberUser(n.getObjectValue(TeamworkUserIdentity::createFromDiscriminatorValue)); });
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
        writer.writeCollectionOfPrimitiveValues("conversationMemberRoles", this.getConversationMemberRoles());
        writer.writeObjectValue("conversationMemberUser", this.getConversationMemberUser());
        writer.writeObjectValue("initiator", this.getInitiator());
    }
    /**
     * Sets the conversationMemberRoles property value. Roles for the coversation member user.
     * @param value Value to set for the conversationMemberRoles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConversationMemberRoles(@javax.annotation.Nullable final java.util.List<String> value) {
        this.conversationMemberRoles = value;
    }
    /**
     * Sets the conversationMemberUser property value. Identity of the conversation member user.
     * @param value Value to set for the conversationMemberUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConversationMemberUser(@javax.annotation.Nullable final TeamworkUserIdentity value) {
        this.conversationMemberUser = value;
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
