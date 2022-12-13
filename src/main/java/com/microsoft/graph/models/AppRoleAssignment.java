package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Provides operations to manage the collection of agreement entities.
 */
public class AppRoleAssignment extends DirectoryObject implements Parsable {
    /** The identifier (id) for the app role which is assigned to the principal. This app role must be exposed in the appRoles property on the resource application's service principal (resourceId). If the resource application has not declared any app roles, a default app role ID of 00000000-0000-0000-0000-000000000000 can be specified to signal that the principal is assigned to the resource app without any specific app roles. Required on create. */
    private UUID _appRoleId;
    /** The time when the app role assignment was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The display name of the user, group, or service principal that was granted the app role assignment. Read-only. Supports $filter (eq and startswith). */
    private String _principalDisplayName;
    /** The unique identifier (id) for the user, security group, or service principal being granted the app role. Security groups with dynamic memberships are supported. Required on create. */
    private UUID _principalId;
    /** The type of the assigned principal. This can either be User, Group, or ServicePrincipal. Read-only. */
    private String _principalType;
    /** The display name of the resource app's service principal to which the assignment is made. */
    private String _resourceDisplayName;
    /** The unique identifier (id) for the resource service principal for which the assignment is made. Required on create. Supports $filter (eq only). */
    private UUID _resourceId;
    /**
     * Instantiates a new appRoleAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppRoleAssignment() {
        super();
        this.setOdataType("#microsoft.graph.appRoleAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appRoleAssignment
     */
    @javax.annotation.Nonnull
    public static AppRoleAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppRoleAssignment();
    }
    /**
     * Gets the appRoleId property value. The identifier (id) for the app role which is assigned to the principal. This app role must be exposed in the appRoles property on the resource application's service principal (resourceId). If the resource application has not declared any app roles, a default app role ID of 00000000-0000-0000-0000-000000000000 can be specified to signal that the principal is assigned to the resource app without any specific app roles. Required on create.
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getAppRoleId() {
        return this._appRoleId;
    }
    /**
     * Gets the createdDateTime property value. The time when the app role assignment was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appRoleId", (n) -> { this.setAppRoleId(n.getUUIDValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("principalDisplayName", (n) -> { this.setPrincipalDisplayName(n.getStringValue()); });
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getUUIDValue()); });
        deserializerMap.put("principalType", (n) -> { this.setPrincipalType(n.getStringValue()); });
        deserializerMap.put("resourceDisplayName", (n) -> { this.setResourceDisplayName(n.getStringValue()); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the principalDisplayName property value. The display name of the user, group, or service principal that was granted the app role assignment. Read-only. Supports $filter (eq and startswith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalDisplayName() {
        return this._principalDisplayName;
    }
    /**
     * Gets the principalId property value. The unique identifier (id) for the user, security group, or service principal being granted the app role. Security groups with dynamic memberships are supported. Required on create.
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getPrincipalId() {
        return this._principalId;
    }
    /**
     * Gets the principalType property value. The type of the assigned principal. This can either be User, Group, or ServicePrincipal. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalType() {
        return this._principalType;
    }
    /**
     * Gets the resourceDisplayName property value. The display name of the resource app's service principal to which the assignment is made.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceDisplayName() {
        return this._resourceDisplayName;
    }
    /**
     * Gets the resourceId property value. The unique identifier (id) for the resource service principal for which the assignment is made. Required on create. Supports $filter (eq only).
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getResourceId() {
        return this._resourceId;
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
        writer.writeUUIDValue("appRoleId", this.getAppRoleId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("principalDisplayName", this.getPrincipalDisplayName());
        writer.writeUUIDValue("principalId", this.getPrincipalId());
        writer.writeStringValue("principalType", this.getPrincipalType());
        writer.writeStringValue("resourceDisplayName", this.getResourceDisplayName());
        writer.writeUUIDValue("resourceId", this.getResourceId());
    }
    /**
     * Sets the appRoleId property value. The identifier (id) for the app role which is assigned to the principal. This app role must be exposed in the appRoles property on the resource application's service principal (resourceId). If the resource application has not declared any app roles, a default app role ID of 00000000-0000-0000-0000-000000000000 can be specified to signal that the principal is assigned to the resource app without any specific app roles. Required on create.
     * @param value Value to set for the appRoleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppRoleId(@javax.annotation.Nullable final UUID value) {
        this._appRoleId = value;
    }
    /**
     * Sets the createdDateTime property value. The time when the app role assignment was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the principalDisplayName property value. The display name of the user, group, or service principal that was granted the app role assignment. Read-only. Supports $filter (eq and startswith).
     * @param value Value to set for the principalDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalDisplayName(@javax.annotation.Nullable final String value) {
        this._principalDisplayName = value;
    }
    /**
     * Sets the principalId property value. The unique identifier (id) for the user, security group, or service principal being granted the app role. Security groups with dynamic memberships are supported. Required on create.
     * @param value Value to set for the principalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalId(@javax.annotation.Nullable final UUID value) {
        this._principalId = value;
    }
    /**
     * Sets the principalType property value. The type of the assigned principal. This can either be User, Group, or ServicePrincipal. Read-only.
     * @param value Value to set for the principalType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalType(@javax.annotation.Nullable final String value) {
        this._principalType = value;
    }
    /**
     * Sets the resourceDisplayName property value. The display name of the resource app's service principal to which the assignment is made.
     * @param value Value to set for the resourceDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceDisplayName(@javax.annotation.Nullable final String value) {
        this._resourceDisplayName = value;
    }
    /**
     * Sets the resourceId property value. The unique identifier (id) for the resource service principal for which the assignment is made. Required on create. Supports $filter (eq only).
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceId(@javax.annotation.Nullable final UUID value) {
        this._resourceId = value;
    }
}
