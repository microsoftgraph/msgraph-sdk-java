package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DelegatedPermissionClassification extends Entity implements Parsable {
    /** The classification value being given. Possible value: low. Does not support $filter.  */
    private PermissionClassificationType _classification;
    /** The unique identifier (id) for the delegated permission listed in the publishedPermissionScopes collection of the servicePrincipal. Required on create. Does not support $filter.  */
    private String _permissionId;
    /** The claim value (value) for the delegated permission listed in the publishedPermissionScopes collection of the servicePrincipal. Does not support $filter.  */
    private String _permissionName;
    /**
     * Instantiates a new delegatedPermissionClassification and sets the default values.
     * @return a void
     */
    public DelegatedPermissionClassification() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a delegatedPermissionClassification
     */
    @javax.annotation.Nonnull
    public static DelegatedPermissionClassification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedPermissionClassification();
    }
    /**
     * Gets the classification property value. The classification value being given. Possible value: low. Does not support $filter.
     * @return a permissionClassificationType
     */
    @javax.annotation.Nullable
    public PermissionClassificationType getClassification() {
        return this._classification;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DelegatedPermissionClassification currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("classification", (n) -> { currentObject.setClassification(n.getEnumValue(PermissionClassificationType.class)); });
            this.put("permissionId", (n) -> { currentObject.setPermissionId(n.getStringValue()); });
            this.put("permissionName", (n) -> { currentObject.setPermissionName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the permissionId property value. The unique identifier (id) for the delegated permission listed in the publishedPermissionScopes collection of the servicePrincipal. Required on create. Does not support $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPermissionId() {
        return this._permissionId;
    }
    /**
     * Gets the permissionName property value. The claim value (value) for the delegated permission listed in the publishedPermissionScopes collection of the servicePrincipal. Does not support $filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPermissionName() {
        return this._permissionName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeStringValue("permissionId", this.getPermissionId());
        writer.writeStringValue("permissionName", this.getPermissionName());
    }
    /**
     * Sets the classification property value. The classification value being given. Possible value: low. Does not support $filter.
     * @param value Value to set for the classification property.
     * @return a void
     */
    public void setClassification(@javax.annotation.Nullable final PermissionClassificationType value) {
        this._classification = value;
    }
    /**
     * Sets the permissionId property value. The unique identifier (id) for the delegated permission listed in the publishedPermissionScopes collection of the servicePrincipal. Required on create. Does not support $filter.
     * @param value Value to set for the permissionId property.
     * @return a void
     */
    public void setPermissionId(@javax.annotation.Nullable final String value) {
        this._permissionId = value;
    }
    /**
     * Sets the permissionName property value. The claim value (value) for the delegated permission listed in the publishedPermissionScopes collection of the servicePrincipal. Does not support $filter.
     * @param value Value to set for the permissionName property.
     * @return a void
     */
    public void setPermissionName(@javax.annotation.Nullable final String value) {
        this._permissionName = value;
    }
}
