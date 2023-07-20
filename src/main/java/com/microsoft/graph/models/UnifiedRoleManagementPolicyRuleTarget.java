package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicyRuleTarget implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The type of caller that's the target of the policy rule. Allowed values are: None, Admin, EndUser.
     */
    private String caller;
    /**
     * The list of role settings that are enforced and cannot be overridden by child scopes. Use All for all settings.
     */
    private java.util.List<String> enforcedSettings;
    /**
     * The list of role settings that can be inherited by child scopes. Use All for all settings.
     */
    private java.util.List<String> inheritableSettings;
    /**
     * The role assignment type that's the target of policy rule. Allowed values are: Eligibility, Assignment.
     */
    private String level;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The role management operations that are the target of the policy rule. Allowed values are: All, Activate, Deactivate, Assign, Update, Remove, Extend, Renew.
     */
    private java.util.List<UnifiedRoleManagementPolicyRuleTargetOperations> operations;
    /**
     * The targetObjects property
     */
    private java.util.List<DirectoryObject> targetObjects;
    /**
     * Instantiates a new unifiedRoleManagementPolicyRuleTarget and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * Gets the caller property value. The type of caller that's the target of the policy rule. Allowed values are: None, Admin, EndUser.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCaller() {
        return this.caller;
    }
    /**
     * Gets the enforcedSettings property value. The list of role settings that are enforced and cannot be overridden by child scopes. Use All for all settings.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnforcedSettings() {
        return this.enforcedSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("caller", (n) -> { this.setCaller(n.getStringValue()); });
        deserializerMap.put("enforcedSettings", (n) -> { this.setEnforcedSettings(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("inheritableSettings", (n) -> { this.setInheritableSettings(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("level", (n) -> { this.setLevel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfEnumValues(UnifiedRoleManagementPolicyRuleTargetOperations.class)); });
        deserializerMap.put("targetObjects", (n) -> { this.setTargetObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inheritableSettings property value. The list of role settings that can be inherited by child scopes. Use All for all settings.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getInheritableSettings() {
        return this.inheritableSettings;
    }
    /**
     * Gets the level property value. The role assignment type that's the target of policy rule. Allowed values are: Eligibility, Assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLevel() {
        return this.level;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the operations property value. The role management operations that are the target of the policy rule. Allowed values are: All, Activate, Deactivate, Assign, Update, Remove, Extend, Renew.
     * @return a unifiedRoleManagementPolicyRuleTargetOperations
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicyRuleTargetOperations> getOperations() {
        return this.operations;
    }
    /**
     * Gets the targetObjects property value. The targetObjects property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getTargetObjects() {
        return this.targetObjects;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("caller", this.getCaller());
        writer.writeCollectionOfPrimitiveValues("enforcedSettings", this.getEnforcedSettings());
        writer.writeCollectionOfPrimitiveValues("inheritableSettings", this.getInheritableSettings());
        writer.writeStringValue("level", this.getLevel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfEnumValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("targetObjects", this.getTargetObjects());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the caller property value. The type of caller that's the target of the policy rule. Allowed values are: None, Admin, EndUser.
     * @param value Value to set for the caller property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCaller(@javax.annotation.Nullable final String value) {
        this.caller = value;
    }
    /**
     * Sets the enforcedSettings property value. The list of role settings that are enforced and cannot be overridden by child scopes. Use All for all settings.
     * @param value Value to set for the enforcedSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnforcedSettings(@javax.annotation.Nullable final java.util.List<String> value) {
        this.enforcedSettings = value;
    }
    /**
     * Sets the inheritableSettings property value. The list of role settings that can be inherited by child scopes. Use All for all settings.
     * @param value Value to set for the inheritableSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInheritableSettings(@javax.annotation.Nullable final java.util.List<String> value) {
        this.inheritableSettings = value;
    }
    /**
     * Sets the level property value. The role assignment type that's the target of policy rule. Allowed values are: Eligibility, Assignment.
     * @param value Value to set for the level property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLevel(@javax.annotation.Nullable final String value) {
        this.level = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the operations property value. The role management operations that are the target of the policy rule. Allowed values are: All, Activate, Deactivate, Assign, Update, Remove, Extend, Renew.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicyRuleTargetOperations> value) {
        this.operations = value;
    }
    /**
     * Sets the targetObjects property value. The targetObjects property
     * @param value Value to set for the targetObjects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetObjects(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.targetObjects = value;
    }
}
