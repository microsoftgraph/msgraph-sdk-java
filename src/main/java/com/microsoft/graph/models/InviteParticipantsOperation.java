package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InviteParticipantsOperation extends CommsOperation implements Parsable {
    /** The participants to invite. */
    private java.util.List<InvitationParticipantInfo> _participants;
    /**
     * Instantiates a new InviteParticipantsOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InviteParticipantsOperation() {
        super();
        this.setOdataType("#microsoft.graph.inviteParticipantsOperation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InviteParticipantsOperation
     */
    @javax.annotation.Nonnull
    public static InviteParticipantsOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InviteParticipantsOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InviteParticipantsOperation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("participants", (n) -> { currentObject.setParticipants(n.getCollectionOfObjectValues(InvitationParticipantInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the participants property value. The participants to invite.
     * @return a invitationParticipantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<InvitationParticipantInfo> getParticipants() {
        return this._participants;
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
        writer.writeCollectionOfObjectValues("participants", this.getParticipants());
    }
    /**
     * Sets the participants property value. The participants to invite.
     * @param value Value to set for the participants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParticipants(@javax.annotation.Nullable final java.util.List<InvitationParticipantInfo> value) {
        this._participants = value;
    }
}
