package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamDescriptionUpdatedEventMessageDetail extends EventMessageDetail implements Parsable {
    /** Initiator of the event. */
    private IdentitySet _initiator;
    /** The updated description for the team. */
    private String _teamDescription;
    /** Unique identifier of the team. */
    private String _teamId;
    /**
     * Instantiates a new TeamDescriptionUpdatedEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamDescriptionUpdatedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.teamDescriptionUpdatedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamDescriptionUpdatedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static TeamDescriptionUpdatedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamDescriptionUpdatedEventMessageDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamDescriptionUpdatedEventMessageDetail currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("initiator", (n) -> { currentObject.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("teamDescription", (n) -> { currentObject.setTeamDescription(n.getStringValue()); });
            this.put("teamId", (n) -> { currentObject.setTeamId(n.getStringValue()); });
        }};
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
     * Gets the teamDescription property value. The updated description for the team.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamDescription() {
        return this._teamDescription;
    }
    /**
     * Gets the teamId property value. Unique identifier of the team.
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
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeStringValue("teamDescription", this.getTeamDescription());
        writer.writeStringValue("teamId", this.getTeamId());
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
     * Sets the teamDescription property value. The updated description for the team.
     * @param value Value to set for the teamDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamDescription(@javax.annotation.Nullable final String value) {
        this._teamDescription = value;
    }
    /**
     * Sets the teamId property value. Unique identifier of the team.
     * @param value Value to set for the teamId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamId(@javax.annotation.Nullable final String value) {
        this._teamId = value;
    }
}
