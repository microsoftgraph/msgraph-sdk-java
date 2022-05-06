package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResourceSpecificPermissionGrant extends DirectoryObject implements Parsable {
    /** ID of the service principal of the Azure AD app that has been granted access. Read-only.  */
    private String _clientAppId;
    /** ID of the Azure AD app that has been granted access. Read-only.  */
    private String _clientId;
    /** The name of the resource-specific permission. Read-only.  */
    private String _permission;
    /** The type of permission. Possible values are: Application, Delegated. Read-only.  */
    private String _permissionType;
    /** ID of the Azure AD app that is hosting the resource. Read-only.  */
    private String _resourceAppId;
    /**
     * Instantiates a new resourceSpecificPermissionGrant and sets the default values.
     * @return a void
     */
    public ResourceSpecificPermissionGrant() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a resourceSpecificPermissionGrant
     */
    @javax.annotation.Nonnull
    public static ResourceSpecificPermissionGrant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceSpecificPermissionGrant();
    }
    /**
     * Gets the clientAppId property value. ID of the service principal of the Azure AD app that has been granted access. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientAppId() {
        return this._clientAppId;
    }
    /**
     * Gets the clientId property value. ID of the Azure AD app that has been granted access. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientId() {
        return this._clientId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ResourceSpecificPermissionGrant currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("clientAppId", (n) -> { currentObject.setClientAppId(n.getStringValue()); });
            this.put("clientId", (n) -> { currentObject.setClientId(n.getStringValue()); });
            this.put("permission", (n) -> { currentObject.setPermission(n.getStringValue()); });
            this.put("permissionType", (n) -> { currentObject.setPermissionType(n.getStringValue()); });
            this.put("resourceAppId", (n) -> { currentObject.setResourceAppId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the permission property value. The name of the resource-specific permission. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPermission() {
        return this._permission;
    }
    /**
     * Gets the permissionType property value. The type of permission. Possible values are: Application, Delegated. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPermissionType() {
        return this._permissionType;
    }
    /**
     * Gets the resourceAppId property value. ID of the Azure AD app that is hosting the resource. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceAppId() {
        return this._resourceAppId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("clientAppId", this.getClientAppId());
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("permission", this.getPermission());
        writer.writeStringValue("permissionType", this.getPermissionType());
        writer.writeStringValue("resourceAppId", this.getResourceAppId());
    }
    /**
     * Sets the clientAppId property value. ID of the service principal of the Azure AD app that has been granted access. Read-only.
     * @param value Value to set for the clientAppId property.
     * @return a void
     */
    public void setClientAppId(@javax.annotation.Nullable final String value) {
        this._clientAppId = value;
    }
    /**
     * Sets the clientId property value. ID of the Azure AD app that has been granted access. Read-only.
     * @param value Value to set for the clientId property.
     * @return a void
     */
    public void setClientId(@javax.annotation.Nullable final String value) {
        this._clientId = value;
    }
    /**
     * Sets the permission property value. The name of the resource-specific permission. Read-only.
     * @param value Value to set for the permission property.
     * @return a void
     */
    public void setPermission(@javax.annotation.Nullable final String value) {
        this._permission = value;
    }
    /**
     * Sets the permissionType property value. The type of permission. Possible values are: Application, Delegated. Read-only.
     * @param value Value to set for the permissionType property.
     * @return a void
     */
    public void setPermissionType(@javax.annotation.Nullable final String value) {
        this._permissionType = value;
    }
    /**
     * Sets the resourceAppId property value. ID of the Azure AD app that is hosting the resource. Read-only.
     * @param value Value to set for the resourceAppId property.
     * @return a void
     */
    public void setResourceAppId(@javax.annotation.Nullable final String value) {
        this._resourceAppId = value;
    }
}
