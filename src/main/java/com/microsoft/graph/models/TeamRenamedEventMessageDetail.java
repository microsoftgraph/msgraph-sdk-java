package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamRenamedEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Initiator of the event.
     */
    private IdentitySet initiator;
    /**
     * The updated name of the team.
     */
    private String teamDisplayName;
    /**
     * Unique identifier of the team.
     */
    private String teamId;
    /**
     * Instantiates a new TeamRenamedEventMessageDetail and sets the default values.
     */
    public TeamRenamedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.teamRenamedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamRenamedEventMessageDetail
     */
    @jakarta.annotation.Nonnull
    public static TeamRenamedEventMessageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamRenamedEventMessageDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("teamDisplayName", (n) -> { this.setTeamDisplayName(n.getStringValue()); });
        deserializerMap.put("teamId", (n) -> { this.setTeamId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.initiator;
    }
    /**
     * Gets the teamDisplayName property value. The updated name of the team.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTeamDisplayName() {
        return this.teamDisplayName;
    }
    /**
     * Gets the teamId property value. Unique identifier of the team.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTeamId() {
        return this.teamId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeStringValue("teamDisplayName", this.getTeamDisplayName());
        writer.writeStringValue("teamId", this.getTeamId());
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     */
    public void setInitiator(@jakarta.annotation.Nullable final IdentitySet value) {
        this.initiator = value;
    }
    /**
     * Sets the teamDisplayName property value. The updated name of the team.
     * @param value Value to set for the teamDisplayName property.
     */
    public void setTeamDisplayName(@jakarta.annotation.Nullable final String value) {
        this.teamDisplayName = value;
    }
    /**
     * Sets the teamId property value. Unique identifier of the team.
     * @param value Value to set for the teamId property.
     */
    public void setTeamId(@jakarta.annotation.Nullable final String value) {
        this.teamId = value;
    }
}
