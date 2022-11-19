package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class TeamworkTagMember extends Entity implements Parsable {
    /** The member's display name. */
    private String _displayName;
    /** The ID of the tenant that the tag member is a part of. */
    private String _tenantId;
    /** The user ID of the member. */
    private String _userId;
    /**
     * Instantiates a new teamworkTagMember and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkTagMember() {
        super();
        this.setOdataType("#microsoft.graph.teamworkTagMember");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkTagMember
     */
    @javax.annotation.Nonnull
    public static TeamworkTagMember createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkTagMember();
    }
    /**
     * Gets the displayName property value. The member's display name.
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
        final TeamworkTagMember currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the tenantId property value. The ID of the tenant that the tag member is a part of.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the userId property value. The user ID of the member.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
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
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the displayName property value. The member's display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the tenantId property value. The ID of the tenant that the tag member is a part of.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the userId property value. The user ID of the member.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
