package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InviteParticipantsOperation extends CommsOperation implements Parsable {
    /**
     * The participants to invite.
     */
    private java.util.List<InvitationParticipantInfo> participants;
    /**
     * Instantiates a new inviteParticipantsOperation and sets the default values.
     */
    public InviteParticipantsOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a inviteParticipantsOperation
     */
    @jakarta.annotation.Nonnull
    public static InviteParticipantsOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InviteParticipantsOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("participants", (n) -> { this.setParticipants(n.getCollectionOfObjectValues(InvitationParticipantInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the participants property value. The participants to invite.
     * @return a invitationParticipantInfo
     */
    @jakarta.annotation.Nullable
    public java.util.List<InvitationParticipantInfo> getParticipants() {
        return this.participants;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("participants", this.getParticipants());
    }
    /**
     * Sets the participants property value. The participants to invite.
     * @param value Value to set for the participants property.
     */
    public void setParticipants(@jakarta.annotation.Nullable final java.util.List<InvitationParticipantInfo> value) {
        this.participants = value;
    }
}
