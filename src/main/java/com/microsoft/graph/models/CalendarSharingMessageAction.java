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
public class CalendarSharingMessageAction implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new CalendarSharingMessageAction and sets the default values.
     */
    public CalendarSharingMessageAction() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CalendarSharingMessageAction
     */
    @jakarta.annotation.Nonnull
    public static CalendarSharingMessageAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CalendarSharingMessageAction();
    }
    /**
     * Gets the action property value. The action property
     * @return a CalendarSharingAction
     */
    @jakarta.annotation.Nullable
    public CalendarSharingAction getAction() {
        return this.getBackingStore().get("action");
    }
    /**
     * Gets the actionType property value. The actionType property
     * @return a CalendarSharingActionType
     */
    @jakarta.annotation.Nullable
    public CalendarSharingActionType getActionType() {
        return this.getBackingStore().get("actionType");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(CalendarSharingAction.class)); });
        deserializerMap.put("actionType", (n) -> { this.setActionType(n.getEnumValue(CalendarSharingActionType.class)); });
        deserializerMap.put("importance", (n) -> { this.setImportance(n.getEnumValue(CalendarSharingActionImportance.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the importance property value. The importance property
     * @return a CalendarSharingActionImportance
     */
    @jakarta.annotation.Nullable
    public CalendarSharingActionImportance getImportance() {
        return this.getBackingStore().get("importance");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeEnumValue("actionType", this.getActionType());
        writer.writeEnumValue("importance", this.getImportance());
        writer.writeStringValue("@odata.type", this.getOdataType());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final CalendarSharingAction value) {
        this.getBackingStore().set("action", value);
    }
    /**
     * Sets the actionType property value. The actionType property
     * @param value Value to set for the actionType property.
     */
    public void setActionType(@jakarta.annotation.Nullable final CalendarSharingActionType value) {
        this.getBackingStore().set("actionType", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the importance property value. The importance property
     * @param value Value to set for the importance property.
     */
    public void setImportance(@jakarta.annotation.Nullable final CalendarSharingActionImportance value) {
        this.getBackingStore().set("importance", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
}
