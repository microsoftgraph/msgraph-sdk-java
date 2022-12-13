package com.microsoft.graph.models;

import com.microsoft.graph.models.AssociatedTeamInfo;
import com.microsoft.graph.models.SharedWithChannelTeamInfo;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the admin singleton.
 */
public class TeamInfo extends Entity implements Parsable {
    /** The name of the team. */
    private String _displayName;
    /** The team property */
    private Team _team;
    /** The ID of the Azure Active Directory tenant. */
    private String _tenantId;
    /**
     * Instantiates a new teamInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamInfo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamInfo
     */
    @javax.annotation.Nonnull
    public static TeamInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.associatedTeamInfo": return new AssociatedTeamInfo();
                case "#microsoft.graph.sharedWithChannelTeamInfo": return new SharedWithChannelTeamInfo();
            }
        }
        return new TeamInfo();
    }
    /**
     * Gets the displayName property value. The name of the team.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("team", (n) -> { this.setTeam(n.getObjectValue(Team::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the team property value. The team property
     * @return a team
     */
    @javax.annotation.Nullable
    public Team getTeam() {
        return this._team;
    }
    /**
     * Gets the tenantId property value. The ID of the Azure Active Directory tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("team", this.getTeam());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the displayName property value. The name of the team.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the team property value. The team property
     * @param value Value to set for the team property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeam(@javax.annotation.Nullable final Team value) {
        this._team = value;
    }
    /**
     * Sets the tenantId property value. The ID of the Azure Active Directory tenant.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
