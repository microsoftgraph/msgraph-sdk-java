package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MembersJoinedEventMessageDetail extends EventMessageDetail implements Parsable {
    /** Initiator of the event. */
    private IdentitySet _initiator;
    /** List of members who joined the chat. */
    private java.util.List<TeamworkUserIdentity> _members;
    /**
     * Instantiates a new MembersJoinedEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MembersJoinedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.membersJoinedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MembersJoinedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static MembersJoinedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MembersJoinedEventMessageDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MembersJoinedEventMessageDetail currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("initiator", (n) -> { currentObject.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfObjectValues(TeamworkUserIdentity::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getInitiator() {
        return this._initiator;
    }
    /**
     * Gets the members property value. List of members who joined the chat.
     * @return a teamworkUserIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkUserIdentity> getMembers() {
        return this._members;
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
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this._initiator = value;
    }
    /**
     * Sets the members property value. List of members who joined the chat.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<TeamworkUserIdentity> value) {
        this._members = value;
    }
}
