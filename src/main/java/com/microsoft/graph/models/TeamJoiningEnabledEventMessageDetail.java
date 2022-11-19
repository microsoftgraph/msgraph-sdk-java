package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamJoiningEnabledEventMessageDetail extends EventMessageDetail implements Parsable {
    /** Initiator of the event. */
    private IdentitySet _initiator;
    /** Unique identifier of the team. */
    private String _teamId;
    /**
     * Instantiates a new TeamJoiningEnabledEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamJoiningEnabledEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.teamJoiningEnabledEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamJoiningEnabledEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static TeamJoiningEnabledEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamJoiningEnabledEventMessageDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamJoiningEnabledEventMessageDetail currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("initiator", (n) -> { currentObject.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("teamId", (n) -> { currentObject.setTeamId(n.getStringValue()); });
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
     * Sets the teamId property value. Unique identifier of the team.
     * @param value Value to set for the teamId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamId(@javax.annotation.Nullable final String value) {
        this._teamId = value;
    }
}
