package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class TeamworkTag extends Entity implements Parsable {
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The memberCount property */
    private Integer _memberCount;
    /** The members property */
    private java.util.List<TeamworkTagMember> _members;
    /** The tagType property */
    private TeamworkTagType _tagType;
    /** The teamId property */
    private String _teamId;
    /**
     * Instantiates a new teamworkTag and sets the default values.
     * @return a void
     */
    public TeamworkTag() {
        super();
        this.setOdataType("#microsoft.graph.teamworkTag");
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
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The displayName property
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
        final TeamworkTag currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("memberCount", (n) -> { currentObject.setMemberCount(n.getIntegerValue()); });
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfObjectValues(TeamworkTagMember::createFromDiscriminatorValue)); });
            this.put("tagType", (n) -> { currentObject.setTagType(n.getEnumValue(TeamworkTagType.class)); });
            this.put("teamId", (n) -> { currentObject.setTeamId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the memberCount property value. The memberCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMemberCount() {
        return this._memberCount;
    }
    /**
     * Gets the members property value. The members property
     * @return a teamworkTagMember
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkTagMember> getMembers() {
        return this._members;
    }
    /**
     * Gets the tagType property value. The tagType property
     * @return a teamworkTagType
     */
    @javax.annotation.Nullable
    public TeamworkTagType getTagType() {
        return this._tagType;
    }
    /**
     * Gets the teamId property value. The teamId property
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
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the memberCount property value. The memberCount property
     * @param value Value to set for the memberCount property.
     * @return a void
     */
    public void setMemberCount(@javax.annotation.Nullable final Integer value) {
        this._memberCount = value;
    }
    /**
     * Sets the members property value. The members property
     * @param value Value to set for the members property.
     * @return a void
     */
    public void setMembers(@javax.annotation.Nullable final java.util.List<TeamworkTagMember> value) {
        this._members = value;
    }
    /**
     * Sets the tagType property value. The tagType property
     * @param value Value to set for the tagType property.
     * @return a void
     */
    public void setTagType(@javax.annotation.Nullable final TeamworkTagType value) {
        this._tagType = value;
    }
    /**
     * Sets the teamId property value. The teamId property
     * @param value Value to set for the teamId property.
     * @return a void
     */
    public void setTeamId(@javax.annotation.Nullable final String value) {
        this._teamId = value;
    }
}
