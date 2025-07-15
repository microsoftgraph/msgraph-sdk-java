package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleManagementPolicyRuleTarget implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UnifiedRoleManagementPolicyRuleTarget} and sets the default values.
     */
    public UnifiedRoleManagementPolicyRuleTarget() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedRoleManagementPolicyRuleTarget}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleManagementPolicyRuleTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyRuleTarget();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the caller property value. The type of caller that&apos;s the target of the policy rule. Allowed values are: None, Admin, EndUser.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaller() {
        return this.backingStore.get("caller");
    }
    /**
     * Gets the enforcedSettings property value. The list of role settings that are enforced and cannot be overridden by child scopes. Use All for all settings.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnforcedSettings() {
        return this.backingStore.get("enforcedSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("caller", (n) -> { this.setCaller(n.getStringValue()); });
        deserializerMap.put("enforcedSettings", (n) -> { this.setEnforcedSettings(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("inheritableSettings", (n) -> { this.setInheritableSettings(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("level", (n) -> { this.setLevel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("targetObjects", (n) -> { this.setTargetObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inheritableSettings property value. The list of role settings that can be inherited by child scopes. Use All for all settings.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInheritableSettings() {
        return this.backingStore.get("inheritableSettings");
    }
    /**
     * Gets the level property value. The role assignment type that&apos;s the target of policy rule. Allowed values are: Eligibility, Assignment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLevel() {
        return this.backingStore.get("level");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the operations property value. The role management operations that are the target of the policy rule. Allowed values are: All, Activate, Deactivate, Assign, Update, Remove, Extend, Renew.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Gets the targetObjects property value. The targetObjects property
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getTargetObjects() {
        return this.backingStore.get("targetObjects");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("caller", this.getCaller());
        writer.writeCollectionOfPrimitiveValues("enforcedSettings", this.getEnforcedSettings());
        writer.writeCollectionOfPrimitiveValues("inheritableSettings", this.getInheritableSettings());
        writer.writeStringValue("level", this.getLevel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("targetObjects", this.getTargetObjects());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the caller property value. The type of caller that&apos;s the target of the policy rule. Allowed values are: None, Admin, EndUser.
     * @param value Value to set for the caller property.
     */
    public void setCaller(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("caller", value);
    }
    /**
     * Sets the enforcedSettings property value. The list of role settings that are enforced and cannot be overridden by child scopes. Use All for all settings.
     * @param value Value to set for the enforcedSettings property.
     */
    public void setEnforcedSettings(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("enforcedSettings", value);
    }
    /**
     * Sets the inheritableSettings property value. The list of role settings that can be inherited by child scopes. Use All for all settings.
     * @param value Value to set for the inheritableSettings property.
     */
    public void setInheritableSettings(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("inheritableSettings", value);
    }
    /**
     * Sets the level property value. The role assignment type that&apos;s the target of policy rule. Allowed values are: Eligibility, Assignment.
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("level", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the operations property value. The role management operations that are the target of the policy rule. Allowed values are: All, Activate, Deactivate, Assign, Update, Remove, Extend, Renew.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("operations", value);
    }
    /**
     * Sets the targetObjects property value. The targetObjects property
     * @param value Value to set for the targetObjects property.
     */
    public void setTargetObjects(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("targetObjects", value);
    }
}
