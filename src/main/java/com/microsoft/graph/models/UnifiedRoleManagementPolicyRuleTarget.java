package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicyRuleTarget implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The caller for the policy rule target. Allowed values are: None, Admin, EndUser. */
    private String _caller;
    /** The list of settings which are enforced and cannot be overridden by child scopes. Use All for all settings. */
    private java.util.List<String> _enforcedSettings;
    /** The list of settings which can be inherited by child scopes. Use All for all settings. */
    private java.util.List<String> _inheritableSettings;
    /** The level for the policy rule target. Allowed values are: Eligibility, Assignment. */
    private String _level;
    /** The operations for policy rule target. Allowed values are: All, Activate, Deactivate, Assign, Update, Remove, Extend, Renew. */
    private java.util.List<String> _operations;
    /** The targetObjects property */
    private java.util.List<DirectoryObject> _targetObjects;
    /**
     * Instantiates a new unifiedRoleManagementPolicyRuleTarget and sets the default values.
     * @return a void
     */
    public UnifiedRoleManagementPolicyRuleTarget() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleManagementPolicyRuleTarget
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementPolicyRuleTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyRuleTarget();
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
     * Gets the caller property value. The caller for the policy rule target. Allowed values are: None, Admin, EndUser.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCaller() {
        return this._caller;
    }
    /**
     * Gets the enforcedSettings property value. The list of settings which are enforced and cannot be overridden by child scopes. Use All for all settings.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnforcedSettings() {
        return this._enforcedSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleManagementPolicyRuleTarget currentObject = this;
        return new HashMap<>(6) {{
            this.put("caller", (n) -> { currentObject.setCaller(n.getStringValue()); });
            this.put("enforcedSettings", (n) -> { currentObject.setEnforcedSettings(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("inheritableSettings", (n) -> { currentObject.setInheritableSettings(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("level", (n) -> { currentObject.setLevel(n.getStringValue()); });
            this.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("targetObjects", (n) -> { currentObject.setTargetObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the inheritableSettings property value. The list of settings which can be inherited by child scopes. Use All for all settings.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getInheritableSettings() {
        return this._inheritableSettings;
    }
    /**
     * Gets the level property value. The level for the policy rule target. Allowed values are: Eligibility, Assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLevel() {
        return this._level;
    }
    /**
     * Gets the operations property value. The operations for policy rule target. Allowed values are: All, Activate, Deactivate, Assign, Update, Remove, Extend, Renew.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOperations() {
        return this._operations;
    }
    /**
     * Gets the targetObjects property value. The targetObjects property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getTargetObjects() {
        return this._targetObjects;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("caller", this.getCaller());
        writer.writeCollectionOfPrimitiveValues("enforcedSettings", this.getEnforcedSettings());
        writer.writeCollectionOfPrimitiveValues("inheritableSettings", this.getInheritableSettings());
        writer.writeStringValue("level", this.getLevel());
        writer.writeCollectionOfPrimitiveValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("targetObjects", this.getTargetObjects());
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
     * Sets the caller property value. The caller for the policy rule target. Allowed values are: None, Admin, EndUser.
     * @param value Value to set for the caller property.
     * @return a void
     */
    public void setCaller(@javax.annotation.Nullable final String value) {
        this._caller = value;
    }
    /**
     * Sets the enforcedSettings property value. The list of settings which are enforced and cannot be overridden by child scopes. Use All for all settings.
     * @param value Value to set for the enforcedSettings property.
     * @return a void
     */
    public void setEnforcedSettings(@javax.annotation.Nullable final java.util.List<String> value) {
        this._enforcedSettings = value;
    }
    /**
     * Sets the inheritableSettings property value. The list of settings which can be inherited by child scopes. Use All for all settings.
     * @param value Value to set for the inheritableSettings property.
     * @return a void
     */
    public void setInheritableSettings(@javax.annotation.Nullable final java.util.List<String> value) {
        this._inheritableSettings = value;
    }
    /**
     * Sets the level property value. The level for the policy rule target. Allowed values are: Eligibility, Assignment.
     * @param value Value to set for the level property.
     * @return a void
     */
    public void setLevel(@javax.annotation.Nullable final String value) {
        this._level = value;
    }
    /**
     * Sets the operations property value. The operations for policy rule target. Allowed values are: All, Activate, Deactivate, Assign, Update, Remove, Extend, Renew.
     * @param value Value to set for the operations property.
     * @return a void
     */
    public void setOperations(@javax.annotation.Nullable final java.util.List<String> value) {
        this._operations = value;
    }
    /**
     * Sets the targetObjects property value. The targetObjects property
     * @param value Value to set for the targetObjects property.
     * @return a void
     */
    public void setTargetObjects(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._targetObjects = value;
    }
}
