package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharedWithChannelTeamInfo extends TeamInfo implements Parsable {
    /** A collection of team members who have access to the shared channel. */
    private java.util.List<ConversationMember> _allowedMembers;
    /** Indicates whether the team is the host of the channel. */
    private Boolean _isHostTeam;
    /**
     * Instantiates a new SharedWithChannelTeamInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SharedWithChannelTeamInfo() {
        super();
        this.setOdataType("#microsoft.graph.sharedWithChannelTeamInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharedWithChannelTeamInfo
     */
    @javax.annotation.Nonnull
    public static SharedWithChannelTeamInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedWithChannelTeamInfo();
    }
    /**
     * Gets the allowedMembers property value. A collection of team members who have access to the shared channel.
     * @return a conversationMember
     */
    @javax.annotation.Nullable
    public java.util.List<ConversationMember> getAllowedMembers() {
        return this._allowedMembers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SharedWithChannelTeamInfo currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allowedMembers", (n) -> { currentObject.setAllowedMembers(n.getCollectionOfObjectValues(ConversationMember::createFromDiscriminatorValue)); });
            this.put("isHostTeam", (n) -> { currentObject.setIsHostTeam(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isHostTeam property value. Indicates whether the team is the host of the channel.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHostTeam() {
        return this._isHostTeam;
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
        writer.writeCollectionOfObjectValues("allowedMembers", this.getAllowedMembers());
        writer.writeBooleanValue("isHostTeam", this.getIsHostTeam());
    }
    /**
     * Sets the allowedMembers property value. A collection of team members who have access to the shared channel.
     * @param value Value to set for the allowedMembers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedMembers(@javax.annotation.Nullable final java.util.List<ConversationMember> value) {
        this._allowedMembers = value;
    }
    /**
     * Sets the isHostTeam property value. Indicates whether the team is the host of the channel.
     * @param value Value to set for the isHostTeam property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsHostTeam(@javax.annotation.Nullable final Boolean value) {
        this._isHostTeam = value;
    }
}
