package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains the set of ResourceActions determining the allowed and not allowed permissions for each role.  */
public class RolePermission implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Resource Actions each containing a set of allowed and not allowed permissions.  */
    private java.util.List<ResourceAction> _resourceActions;
    /**
     * Instantiates a new rolePermission and sets the default values.
     * @return a void
     */
    public RolePermission() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rolePermission
     */
    @javax.annotation.Nonnull
    public static RolePermission createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RolePermission();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RolePermission currentObject = this;
        return new HashMap<>(1) {{
            this.put("resourceActions", (n) -> { currentObject.setResourceActions(n.getCollectionOfObjectValues(ResourceAction::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the resourceActions property value. Resource Actions each containing a set of allowed and not allowed permissions.
     * @return a resourceAction
     */
    @javax.annotation.Nullable
    public java.util.List<ResourceAction> getResourceActions() {
        return this._resourceActions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("resourceActions", this.getResourceActions());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the resourceActions property value. Resource Actions each containing a set of allowed and not allowed permissions.
     * @param value Value to set for the resourceActions property.
     * @return a void
     */
    public void setResourceActions(@javax.annotation.Nullable final java.util.List<ResourceAction> value) {
        this._resourceActions = value;
    }
}
