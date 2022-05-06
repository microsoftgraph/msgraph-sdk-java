package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DirectoryRole extends DirectoryObject implements Parsable {
    /** The description for the directory role. Read-only. Supports $filter (eq), $search, $select.  */
    private String _description;
    /** The display name for the directory role. Read-only. Supports $filter (eq), $search, $select.  */
    private String _displayName;
    /** Users that are members of this directory role. HTTP Methods: GET, POST, DELETE. Read-only. Nullable. Supports $expand.  */
    private java.util.List<DirectoryObject> _members;
    /** The id of the directoryRoleTemplate that this role is based on. The property must be specified when activating a directory role in a tenant with a POST operation. After the directory role has been activated, the property is read only. Supports $filter (eq), $select.  */
    private String _roleTemplateId;
    /** Members of this directory role that are scoped to administrative units. Read-only. Nullable.  */
    private java.util.List<ScopedRoleMembership> _scopedMembers;
    /**
     * Instantiates a new directoryRole and sets the default values.
     * @return a void
     */
    public DirectoryRole() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directoryRole
     */
    @javax.annotation.Nonnull
    public static DirectoryRole createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectoryRole();
    }
    /**
     * Gets the description property value. The description for the directory role. Read-only. Supports $filter (eq), $search, $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name for the directory role. Read-only. Supports $filter (eq), $search, $select.
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
        final DirectoryRole currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("roleTemplateId", (n) -> { currentObject.setRoleTemplateId(n.getStringValue()); });
            this.put("scopedMembers", (n) -> { currentObject.setScopedMembers(n.getCollectionOfObjectValues(ScopedRoleMembership::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the members property value. Users that are members of this directory role. HTTP Methods: GET, POST, DELETE. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMembers() {
        return this._members;
    }
    /**
     * Gets the roleTemplateId property value. The id of the directoryRoleTemplate that this role is based on. The property must be specified when activating a directory role in a tenant with a POST operation. After the directory role has been activated, the property is read only. Supports $filter (eq), $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleTemplateId() {
        return this._roleTemplateId;
    }
    /**
     * Gets the scopedMembers property value. Members of this directory role that are scoped to administrative units. Read-only. Nullable.
     * @return a scopedRoleMembership
     */
    @javax.annotation.Nullable
    public java.util.List<ScopedRoleMembership> getScopedMembers() {
        return this._scopedMembers;
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
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeStringValue("roleTemplateId", this.getRoleTemplateId());
        writer.writeCollectionOfObjectValues("scopedMembers", this.getScopedMembers());
    }
    /**
     * Sets the description property value. The description for the directory role. Read-only. Supports $filter (eq), $search, $select.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name for the directory role. Read-only. Supports $filter (eq), $search, $select.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the members property value. Users that are members of this directory role. HTTP Methods: GET, POST, DELETE. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the members property.
     * @return a void
     */
    public void setMembers(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._members = value;
    }
    /**
     * Sets the roleTemplateId property value. The id of the directoryRoleTemplate that this role is based on. The property must be specified when activating a directory role in a tenant with a POST operation. After the directory role has been activated, the property is read only. Supports $filter (eq), $select.
     * @param value Value to set for the roleTemplateId property.
     * @return a void
     */
    public void setRoleTemplateId(@javax.annotation.Nullable final String value) {
        this._roleTemplateId = value;
    }
    /**
     * Sets the scopedMembers property value. Members of this directory role that are scoped to administrative units. Read-only. Nullable.
     * @param value Value to set for the scopedMembers property.
     * @return a void
     */
    public void setScopedMembers(@javax.annotation.Nullable final java.util.List<ScopedRoleMembership> value) {
        this._scopedMembers = value;
    }
}
