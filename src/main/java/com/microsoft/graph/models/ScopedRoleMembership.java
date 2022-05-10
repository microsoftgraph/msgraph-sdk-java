package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ScopedRoleMembership extends Entity implements Parsable {
    /** Unique identifier for the administrative unit that the directory role is scoped to */
    private String _administrativeUnitId;
    /** Unique identifier for the directory role that the member is in. */
    private String _roleId;
    /** The roleMemberInfo property */
    private Identity _roleMemberInfo;
    /**
     * Instantiates a new scopedRoleMembership and sets the default values.
     * @return a void
     */
    public ScopedRoleMembership() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a scopedRoleMembership
     */
    @javax.annotation.Nonnull
    public static ScopedRoleMembership createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScopedRoleMembership();
    }
    /**
     * Gets the administrativeUnitId property value. Unique identifier for the administrative unit that the directory role is scoped to
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdministrativeUnitId() {
        return this._administrativeUnitId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ScopedRoleMembership currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("administrativeUnitId", (n) -> { currentObject.setAdministrativeUnitId(n.getStringValue()); });
            this.put("roleId", (n) -> { currentObject.setRoleId(n.getStringValue()); });
            this.put("roleMemberInfo", (n) -> { currentObject.setRoleMemberInfo(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the roleId property value. Unique identifier for the directory role that the member is in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this._roleId;
    }
    /**
     * Gets the roleMemberInfo property value. The roleMemberInfo property
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getRoleMemberInfo() {
        return this._roleMemberInfo;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("administrativeUnitId", this.getAdministrativeUnitId());
        writer.writeStringValue("roleId", this.getRoleId());
        writer.writeObjectValue("roleMemberInfo", this.getRoleMemberInfo());
    }
    /**
     * Sets the administrativeUnitId property value. Unique identifier for the administrative unit that the directory role is scoped to
     * @param value Value to set for the administrativeUnitId property.
     * @return a void
     */
    public void setAdministrativeUnitId(@javax.annotation.Nullable final String value) {
        this._administrativeUnitId = value;
    }
    /**
     * Sets the roleId property value. Unique identifier for the directory role that the member is in.
     * @param value Value to set for the roleId property.
     * @return a void
     */
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this._roleId = value;
    }
    /**
     * Sets the roleMemberInfo property value. The roleMemberInfo property
     * @param value Value to set for the roleMemberInfo property.
     * @return a void
     */
    public void setRoleMemberInfo(@javax.annotation.Nullable final Identity value) {
        this._roleMemberInfo = value;
    }
}
