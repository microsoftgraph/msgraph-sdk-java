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
public class DelegatedAdministrationRoleAssignmentSnapshot implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DelegatedAdministrationRoleAssignmentSnapshot} and sets the default values.
     */
    public DelegatedAdministrationRoleAssignmentSnapshot() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DelegatedAdministrationRoleAssignmentSnapshot}
     */
    @jakarta.annotation.Nonnull
    public static DelegatedAdministrationRoleAssignmentSnapshot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdministrationRoleAssignmentSnapshot();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("groupDisplayName", (n) -> { this.setGroupDisplayName(n.getStringValue()); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("roleTemplates", (n) -> { this.setRoleTemplates(n.getCollectionOfObjectValues(RoleTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupDisplayName property value. The groupDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupDisplayName() {
        return this.backingStore.get("groupDisplayName");
    }
    /**
     * Gets the groupId property value. The groupId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.backingStore.get("groupId");
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
     * Gets the roleTemplates property value. The roleTemplates property
     * @return a {@link java.util.List<RoleTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RoleTemplate> getRoleTemplates() {
        return this.backingStore.get("roleTemplates");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("groupDisplayName", this.getGroupDisplayName());
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("roleTemplates", this.getRoleTemplates());
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
     * Sets the groupDisplayName property value. The groupDisplayName property
     * @param value Value to set for the groupDisplayName property.
     */
    public void setGroupDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupDisplayName", value);
    }
    /**
     * Sets the groupId property value. The groupId property
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the roleTemplates property value. The roleTemplates property
     * @param value Value to set for the roleTemplates property.
     */
    public void setRoleTemplates(@jakarta.annotation.Nullable final java.util.List<RoleTemplate> value) {
        this.backingStore.set("roleTemplates", value);
    }
}
