package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class TeamworkTag extends Entity implements Parsable {
    /** The description of the tag as it will appear to the user in Microsoft Teams. */
    private String _description;
    /** The name of the tag as it will appear to the user in Microsoft Teams. */
    private String _displayName;
    /** The number of users assigned to the tag. */
    private Integer _memberCount;
    /** Users assigned to the tag. */
    private java.util.List<TeamworkTagMember> _members;
    /** The type of the tag. Default is standard. */
    private TeamworkTagType _tagType;
    /** ID of the team in which the tag is defined. */
    private String _teamId;
    /**
     * Instantiates a new teamworkTag and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkTag() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkTag
     */
    @javax.annotation.Nonnull
    public static TeamworkTag createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkTag();
    }
    /**
     * Gets the description property value. The description of the tag as it will appear to the user in Microsoft Teams.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name of the tag as it will appear to the user in Microsoft Teams.
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("memberCount", (n) -> { this.setMemberCount(n.getIntegerValue()); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(TeamworkTagMember::createFromDiscriminatorValue)); });
        deserializerMap.put("tagType", (n) -> { this.setTagType(n.getEnumValue(TeamworkTagType.class)); });
        deserializerMap.put("teamId", (n) -> { this.setTeamId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the memberCount property value. The number of users assigned to the tag.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMemberCount() {
        return this._memberCount;
    }
    /**
     * Gets the members property value. Users assigned to the tag.
     * @return a teamworkTagMember
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkTagMember> getMembers() {
        return this._members;
    }
    /**
     * Gets the tagType property value. The type of the tag. Default is standard.
     * @return a teamworkTagType
     */
    @javax.annotation.Nullable
    public TeamworkTagType getTagType() {
        return this._tagType;
    }
    /**
     * Gets the teamId property value. ID of the team in which the tag is defined.
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("memberCount", this.getMemberCount());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeEnumValue("tagType", this.getTagType());
        writer.writeStringValue("teamId", this.getTeamId());
    }
    /**
     * Sets the description property value. The description of the tag as it will appear to the user in Microsoft Teams.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name of the tag as it will appear to the user in Microsoft Teams.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the memberCount property value. The number of users assigned to the tag.
     * @param value Value to set for the memberCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberCount(@javax.annotation.Nullable final Integer value) {
        this._memberCount = value;
    }
    /**
     * Sets the members property value. Users assigned to the tag.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<TeamworkTagMember> value) {
        this._members = value;
    }
    /**
     * Sets the tagType property value. The type of the tag. Default is standard.
     * @param value Value to set for the tagType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTagType(@javax.annotation.Nullable final TeamworkTagType value) {
        this._tagType = value;
    }
    /**
     * Sets the teamId property value. ID of the team in which the tag is defined.
     * @param value Value to set for the teamId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamId(@javax.annotation.Nullable final String value) {
        this._teamId = value;
    }
}
