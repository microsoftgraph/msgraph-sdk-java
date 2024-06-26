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
public class AccessPackageResourceAttribute implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AccessPackageResourceAttribute} and sets the default values.
     */
    public AccessPackageResourceAttribute() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageResourceAttribute}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceAttribute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceAttribute();
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
     * Gets the destination property value. Information about how to set the attribute, currently a accessPackageUserDirectoryAttributeStore type.
     * @return a {@link AccessPackageResourceAttributeDestination}
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceAttributeDestination getDestination() {
        return this.backingStore.get("destination");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("destination", (n) -> { this.setDestination(n.getObjectValue(AccessPackageResourceAttributeDestination::createFromDiscriminatorValue)); });
        deserializerMap.put("isEditable", (n) -> { this.setIsEditable(n.getBooleanValue()); });
        deserializerMap.put("isPersistedOnAssignmentRemoval", (n) -> { this.setIsPersistedOnAssignmentRemoval(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getObjectValue(AccessPackageResourceAttributeSource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEditable property value. The isEditable property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEditable() {
        return this.backingStore.get("isEditable");
    }
    /**
     * Gets the isPersistedOnAssignmentRemoval property value. The isPersistedOnAssignmentRemoval property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPersistedOnAssignmentRemoval() {
        return this.backingStore.get("isPersistedOnAssignmentRemoval");
    }
    /**
     * Gets the name property value. The name of the attribute in the end system. If the destination is accessPackageUserDirectoryAttributeStore, then a user property such as jobTitle or a directory schema extension for the user object type, such as extension2b676109c7c74ae2b41549205f1947edpersonalTitle.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
     * Gets the source property value. Information about how to populate the attribute value when an accessPackageAssignmentRequest is being fulfilled, currently a accessPackageResourceAttributeQuestion type.
     * @return a {@link AccessPackageResourceAttributeSource}
     */
    @jakarta.annotation.Nullable
    public AccessPackageResourceAttributeSource getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("destination", this.getDestination());
        writer.writeBooleanValue("isEditable", this.getIsEditable());
        writer.writeBooleanValue("isPersistedOnAssignmentRemoval", this.getIsPersistedOnAssignmentRemoval());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("source", this.getSource());
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
     * Sets the destination property value. Information about how to set the attribute, currently a accessPackageUserDirectoryAttributeStore type.
     * @param value Value to set for the destination property.
     */
    public void setDestination(@jakarta.annotation.Nullable final AccessPackageResourceAttributeDestination value) {
        this.backingStore.set("destination", value);
    }
    /**
     * Sets the isEditable property value. The isEditable property
     * @param value Value to set for the isEditable property.
     */
    public void setIsEditable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEditable", value);
    }
    /**
     * Sets the isPersistedOnAssignmentRemoval property value. The isPersistedOnAssignmentRemoval property
     * @param value Value to set for the isPersistedOnAssignmentRemoval property.
     */
    public void setIsPersistedOnAssignmentRemoval(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPersistedOnAssignmentRemoval", value);
    }
    /**
     * Sets the name property value. The name of the attribute in the end system. If the destination is accessPackageUserDirectoryAttributeStore, then a user property such as jobTitle or a directory schema extension for the user object type, such as extension2b676109c7c74ae2b41549205f1947edpersonalTitle.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the source property value. Information about how to populate the attribute value when an accessPackageAssignmentRequest is being fulfilled, currently a accessPackageResourceAttributeQuestion type.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final AccessPackageResourceAttributeSource value) {
        this.backingStore.set("source", value);
    }
}
