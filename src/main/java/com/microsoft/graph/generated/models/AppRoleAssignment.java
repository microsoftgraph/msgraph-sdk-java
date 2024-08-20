package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppRoleAssignment extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link AppRoleAssignment} and sets the default values.
     */
    public AppRoleAssignment() {
        super();
        this.setOdataType("#microsoft.graph.appRoleAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppRoleAssignment}
     */
    @jakarta.annotation.Nonnull
    public static AppRoleAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppRoleAssignment();
    }
    /**
     * Gets the appRoleId property value. The identifier (id) for the app role that's assigned to the principal. This app role must be exposed in the appRoles property on the resource application's service principal (resourceId). If the resource application hasn't declared any app roles, a default app role ID of 00000000-0000-0000-0000-000000000000 can be specified to signal that the principal is assigned to the resource app without any specific app roles. Required on create.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getAppRoleId() {
        return this.backingStore.get("appRoleId");
    }
    /**
     * Gets the createdDateTime property value. The time when the app role assignment was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrincipalDisplayName() {
        return this.backingStore.get("principalDisplayName");
    }
    /**
     * Gets the principalId property value. The unique identifier (id) for the user, security group, or service principal being granted the app role. Security groups with dynamic memberships are supported. Required on create.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getPrincipalId() {
        return this.backingStore.get("principalId");
    }
    /**
     * Gets the principalType property value. The type of the assigned principal. This can either be User, Group, or ServicePrincipal. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrincipalType() {
        return this.backingStore.get("principalType");
    }
    /**
     * Gets the resourceDisplayName property value. The display name of the resource app's service principal to which the assignment is made.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceDisplayName() {
        return this.backingStore.get("resourceDisplayName");
    }
    /**
     * Gets the resourceId property value. The unique identifier (id) for the resource service principal for which the assignment is made. Required on create. Supports $filter (eq only).
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getResourceId() {
        return this.backingStore.get("resourceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the appRoleId property value. The identifier (id) for the app role that's assigned to the principal. This app role must be exposed in the appRoles property on the resource application's service principal (resourceId). If the resource application hasn't declared any app roles, a default app role ID of 00000000-0000-0000-0000-000000000000 can be specified to signal that the principal is assigned to the resource app without any specific app roles. Required on create.
     * @param value Value to set for the appRoleId property.
     */
    public void setAppRoleId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("appRoleId", value);
    }
    /**
     * Sets the createdDateTime property value. The time when the app role assignment was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the principalDisplayName property value. The display name of the user, group, or service principal that was granted the app role assignment. Read-only. Supports $filter (eq and startswith).
     * @param value Value to set for the principalDisplayName property.
     */
    public void setPrincipalDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalDisplayName", value);
    }
    /**
     * Sets the principalId property value. The unique identifier (id) for the user, security group, or service principal being granted the app role. Security groups with dynamic memberships are supported. Required on create.
     * @param value Value to set for the principalId property.
     */
    public void setPrincipalId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("principalId", value);
    }
    /**
     * Sets the principalType property value. The type of the assigned principal. This can either be User, Group, or ServicePrincipal. Read-only.
     * @param value Value to set for the principalType property.
     */
    public void setPrincipalType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalType", value);
    }
    /**
     * Sets the resourceDisplayName property value. The display name of the resource app's service principal to which the assignment is made.
     * @param value Value to set for the resourceDisplayName property.
     */
    public void setResourceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceDisplayName", value);
    }
    /**
     * Sets the resourceId property value. The unique identifier (id) for the resource service principal for which the assignment is made. Required on create. Supports $filter (eq only).
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("resourceId", value);
    }
}
