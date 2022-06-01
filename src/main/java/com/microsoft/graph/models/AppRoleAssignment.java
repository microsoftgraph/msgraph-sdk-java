package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the instantiate method. */
public class AppRoleAssignment extends DirectoryObject implements Parsable {
    /** The identifier (id) for the app role which is assigned to the principal. This app role must be exposed in the appRoles property on the resource application's service principal (resourceId). If the resource application has not declared any app roles, a default app role ID of 00000000-0000-0000-0000-000000000000 can be specified to signal that the principal is assigned to the resource app without any specific app roles. Required on create. */
    private String _appRoleId;
    /** The time when the app role assignment was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The display name of the user, group, or service principal that was granted the app role assignment. Read-only. Supports $filter (eq and startswith). */
    private String _principalDisplayName;
    /** The unique identifier (id) for the user, group, or service principal being granted the app role. Required on create. */
    private String _principalId;
    /** The type of the assigned principal. This can either be User, Group, or ServicePrincipal. Read-only. */
    private String _principalType;
    /** The display name of the resource app's service principal to which the assignment is made. */
    private String _resourceDisplayName;
    /** The unique identifier (id) for the resource service principal for which the assignment is made. Required on create. Supports $filter (eq only). */
    private String _resourceId;
    /**
     * Instantiates a new appRoleAssignment and sets the default values.
     * @return a void
     */
    public AppRoleAssignment() {
        super();
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppRoleId() {
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
        final AppRoleAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appRoleId", (n) -> { currentObject.setAppRoleId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("principalDisplayName", (n) -> { currentObject.setPrincipalDisplayName(n.getStringValue()); });
            this.put("principalId", (n) -> { currentObject.setPrincipalId(n.getStringValue()); });
            this.put("principalType", (n) -> { currentObject.setPrincipalType(n.getStringValue()); });
            this.put("resourceDisplayName", (n) -> { currentObject.setResourceDisplayName(n.getStringValue()); });
            this.put("resourceId", (n) -> { currentObject.setResourceId(n.getStringValue()); });
        }};
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
     * Gets the principalId property value. The unique identifier (id) for the user, group, or service principal being granted the app role. Required on create.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalId() {
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appRoleId", this.getAppRoleId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("principalDisplayName", this.getPrincipalDisplayName());
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeStringValue("principalType", this.getPrincipalType());
        writer.writeStringValue("resourceDisplayName", this.getResourceDisplayName());
        writer.writeStringValue("resourceId", this.getResourceId());
    }
    /**
     * Sets the appRoleId property value. The identifier (id) for the app role which is assigned to the principal. This app role must be exposed in the appRoles property on the resource application's service principal (resourceId). If the resource application has not declared any app roles, a default app role ID of 00000000-0000-0000-0000-000000000000 can be specified to signal that the principal is assigned to the resource app without any specific app roles. Required on create.
     * @param value Value to set for the appRoleId property.
     * @return a void
     */
    public void setAppRoleId(@javax.annotation.Nullable final String value) {
        this._appRoleId = value;
    }
    /**
     * Sets the createdDateTime property value. The time when the app role assignment was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the principalDisplayName property value. The display name of the user, group, or service principal that was granted the app role assignment. Read-only. Supports $filter (eq and startswith).
     * @param value Value to set for the principalDisplayName property.
     * @return a void
     */
    public void setPrincipalDisplayName(@javax.annotation.Nullable final String value) {
        this._principalDisplayName = value;
    }
    /**
     * Sets the principalId property value. The unique identifier (id) for the user, group, or service principal being granted the app role. Required on create.
     * @param value Value to set for the principalId property.
     * @return a void
     */
    public void setPrincipalId(@javax.annotation.Nullable final String value) {
        this._principalId = value;
    }
    /**
     * Sets the principalType property value. The type of the assigned principal. This can either be User, Group, or ServicePrincipal. Read-only.
     * @param value Value to set for the principalType property.
     * @return a void
     */
    public void setPrincipalType(@javax.annotation.Nullable final String value) {
        this._principalType = value;
    }
    /**
     * Sets the resourceDisplayName property value. The display name of the resource app's service principal to which the assignment is made.
     * @param value Value to set for the resourceDisplayName property.
     * @return a void
     */
    public void setResourceDisplayName(@javax.annotation.Nullable final String value) {
        this._resourceDisplayName = value;
    }
    /**
     * Sets the resourceId property value. The unique identifier (id) for the resource service principal for which the assignment is made. Required on create. Supports $filter (eq only).
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
}
