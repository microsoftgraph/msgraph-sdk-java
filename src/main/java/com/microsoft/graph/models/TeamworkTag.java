package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkTag extends Entity implements Parsable {
    /**
     * The description of the tag as it appears to the user in Microsoft Teams. A teamworkTag can't have more than 200 teamworkTagMembers.
     */
    private String description;
    /**
     * The name of the tag as it appears to the user in Microsoft Teams.
     */
    private String displayName;
    /**
     * The number of users assigned to the tag.
     */
    private Integer memberCount;
    /**
     * Users assigned to the tag.
     */
    private java.util.List<TeamworkTagMember> members;
    /**
     * The type of the tag. Default is standard.
     */
    private TeamworkTagType tagType;
    /**
     * ID of the team in which the tag is defined.
     */
    private String teamId;
    /**
     * Instantiates a new TeamworkTag and sets the default values.
     */
    public TeamworkTag() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkTag
     */
    @jakarta.annotation.Nonnull
    public static TeamworkTag createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkTag();
    }
    /**
     * Gets the description property value. The description of the tag as it appears to the user in Microsoft Teams. A teamworkTag can't have more than 200 teamworkTagMembers.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The name of the tag as it appears to the user in Microsoft Teams.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMemberCount() {
        return this.memberCount;
    }
    /**
     * Gets the members property value. Users assigned to the tag.
     * @return a java.util.List<TeamworkTagMember>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamworkTagMember> getMembers() {
        return this.members;
    }
    /**
     * Gets the tagType property value. The type of the tag. Default is standard.
     * @return a TeamworkTagType
     */
    @jakarta.annotation.Nullable
    public TeamworkTagType getTagType() {
        return this.tagType;
    }
    /**
     * Gets the teamId property value. ID of the team in which the tag is defined.
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("memberCount", this.getMemberCount());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeEnumValue("tagType", this.getTagType());
        writer.writeStringValue("teamId", this.getTeamId());
    }
    /**
     * Sets the description property value. The description of the tag as it appears to the user in Microsoft Teams. A teamworkTag can't have more than 200 teamworkTagMembers.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The name of the tag as it appears to the user in Microsoft Teams.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the memberCount property value. The number of users assigned to the tag.
     * @param value Value to set for the memberCount property.
     */
    public void setMemberCount(@jakarta.annotation.Nullable final Integer value) {
        this.memberCount = value;
    }
    /**
     * Sets the members property value. Users assigned to the tag.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<TeamworkTagMember> value) {
        this.members = value;
    }
    /**
     * Sets the tagType property value. The type of the tag. Default is standard.
     * @param value Value to set for the tagType property.
     */
    public void setTagType(@jakarta.annotation.Nullable final TeamworkTagType value) {
        this.tagType = value;
    }
    /**
     * Sets the teamId property value. ID of the team in which the tag is defined.
     * @param value Value to set for the teamId property.
     */
    public void setTeamId(@jakarta.annotation.Nullable final String value) {
        this.teamId = value;
    }
}
