package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamCreatedEventMessageDetail extends EventMessageDetail implements Parsable {
    /** Initiator of the event. */
    private IdentitySet _initiator;
    /** Description for the team. */
    private String _teamDescription;
    /** Display name of the team. */
    private String _teamDisplayName;
    /** Unique identifier of the team. */
    private String _teamId;
    /**
     * Instantiates a new TeamCreatedEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamCreatedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.teamCreatedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamCreatedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static TeamCreatedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamCreatedEventMessageDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamCreatedEventMessageDetail currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("initiator", (n) -> { currentObject.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("teamDescription", (n) -> { currentObject.setTeamDescription(n.getStringValue()); });
            this.put("teamDisplayName", (n) -> { currentObject.setTeamDisplayName(n.getStringValue()); });
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
     * Gets the teamDescription property value. Description for the team.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamDescription() {
        return this._teamDescription;
    }
    /**
     * Gets the teamDisplayName property value. Display name of the team.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamDisplayName() {
        return this._teamDisplayName;
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
        writer.writeStringValue("teamDisplayName", this.getTeamDisplayName());
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
     * Sets the teamDescription property value. Description for the team.
     * @param value Value to set for the teamDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamDescription(@javax.annotation.Nullable final String value) {
        this._teamDescription = value;
    }
    /**
     * Sets the teamDisplayName property value. Display name of the team.
     * @param value Value to set for the teamDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamDisplayName(@javax.annotation.Nullable final String value) {
        this._teamDisplayName = value;
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
