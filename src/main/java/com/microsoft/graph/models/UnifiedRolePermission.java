package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRolePermission implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Set of tasks that can be performed on a resource.  */
    private java.util.List<String> _allowedResourceActions;
    /** Optional constraints that must be met for the permission to be effective.  */
    private String _condition;
    /** Set of tasks that may not be performed on a resource. Not yet supported.  */
    private java.util.List<String> _excludedResourceActions;
    /**
     * Instantiates a new unifiedRolePermission and sets the default values.
     * @return a void
     */
    public UnifiedRolePermission() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRolePermission
     */
    @javax.annotation.Nonnull
    public static UnifiedRolePermission createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRolePermission();
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
     * Gets the allowedResourceActions property value. Set of tasks that can be performed on a resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedResourceActions() {
        return this._allowedResourceActions;
    }
    /**
     * Gets the condition property value. Optional constraints that must be met for the permission to be effective.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCondition() {
        return this._condition;
    }
    /**
     * Gets the excludedResourceActions property value. Set of tasks that may not be performed on a resource. Not yet supported.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludedResourceActions() {
        return this._excludedResourceActions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRolePermission currentObject = this;
        return new HashMap<>(3) {{
            this.put("allowedResourceActions", (n) -> { currentObject.setAllowedResourceActions(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("condition", (n) -> { currentObject.setCondition(n.getStringValue()); });
            this.put("excludedResourceActions", (n) -> { currentObject.setExcludedResourceActions(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedResourceActions", this.getAllowedResourceActions());
        writer.writeStringValue("condition", this.getCondition());
        writer.writeCollectionOfPrimitiveValues("excludedResourceActions", this.getExcludedResourceActions());
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
     * Sets the allowedResourceActions property value. Set of tasks that can be performed on a resource.
     * @param value Value to set for the allowedResourceActions property.
     * @return a void
     */
    public void setAllowedResourceActions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedResourceActions = value;
    }
    /**
     * Sets the condition property value. Optional constraints that must be met for the permission to be effective.
     * @param value Value to set for the condition property.
     * @return a void
     */
    public void setCondition(@javax.annotation.Nullable final String value) {
        this._condition = value;
    }
    /**
     * Sets the excludedResourceActions property value. Set of tasks that may not be performed on a resource. Not yet supported.
     * @param value Value to set for the excludedResourceActions property.
     * @return a void
     */
    public void setExcludedResourceActions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludedResourceActions = value;
    }
}
