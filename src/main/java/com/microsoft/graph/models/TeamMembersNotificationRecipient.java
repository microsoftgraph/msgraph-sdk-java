package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamMembersNotificationRecipient extends TeamworkNotificationRecipient implements Parsable {
    /** The unique identifier for the team whose members should receive the notification. */
    private String _teamId;
    /**
     * Instantiates a new TeamMembersNotificationRecipient and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamMembersNotificationRecipient() {
        super();
        this.setOdataType("#microsoft.graph.teamMembersNotificationRecipient");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamMembersNotificationRecipient
     */
    @javax.annotation.Nonnull
    public static TeamMembersNotificationRecipient createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamMembersNotificationRecipient();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamMembersNotificationRecipient currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("teamId", (n) -> { currentObject.setTeamId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the teamId property value. The unique identifier for the team whose members should receive the notification.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamId() {
        return this._teamId;
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
        writer.writeStringValue("teamId", this.getTeamId());
    }
    /**
     * Sets the teamId property value. The unique identifier for the team whose members should receive the notification.
     * @param value Value to set for the teamId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamId(@javax.annotation.Nullable final String value) {
        this._teamId = value;
    }
}
