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
public class TeamMemberSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new TeamMemberSettings and sets the default values.
     */
    public TeamMemberSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamMemberSettings
     */
    @jakarta.annotation.Nonnull
    public static TeamMemberSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamMemberSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the allowAddRemoveApps property value. If set to true, members can add and remove apps.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAddRemoveApps() {
        return this.backingStore.get("allowAddRemoveApps");
    }
    /**
     * Gets the allowCreatePrivateChannels property value. If set to true, members can add and update private channels.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCreatePrivateChannels() {
        return this.backingStore.get("allowCreatePrivateChannels");
    }
    /**
     * Gets the allowCreateUpdateChannels property value. If set to true, members can add and update channels.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCreateUpdateChannels() {
        return this.backingStore.get("allowCreateUpdateChannels");
    }
    /**
     * Gets the allowCreateUpdateRemoveConnectors property value. If set to true, members can add, update, and remove connectors.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCreateUpdateRemoveConnectors() {
        return this.backingStore.get("allowCreateUpdateRemoveConnectors");
    }
    /**
     * Gets the allowCreateUpdateRemoveTabs property value. If set to true, members can add, update, and remove tabs.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCreateUpdateRemoveTabs() {
        return this.backingStore.get("allowCreateUpdateRemoveTabs");
    }
    /**
     * Gets the allowDeleteChannels property value. If set to true, members can delete channels.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeleteChannels() {
        return this.backingStore.get("allowDeleteChannels");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("allowAddRemoveApps", (n) -> { this.setAllowAddRemoveApps(n.getBooleanValue()); });
        deserializerMap.put("allowCreatePrivateChannels", (n) -> { this.setAllowCreatePrivateChannels(n.getBooleanValue()); });
        deserializerMap.put("allowCreateUpdateChannels", (n) -> { this.setAllowCreateUpdateChannels(n.getBooleanValue()); });
        deserializerMap.put("allowCreateUpdateRemoveConnectors", (n) -> { this.setAllowCreateUpdateRemoveConnectors(n.getBooleanValue()); });
        deserializerMap.put("allowCreateUpdateRemoveTabs", (n) -> { this.setAllowCreateUpdateRemoveTabs(n.getBooleanValue()); });
        deserializerMap.put("allowDeleteChannels", (n) -> { this.setAllowDeleteChannels(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowAddRemoveApps", this.getAllowAddRemoveApps());
        writer.writeBooleanValue("allowCreatePrivateChannels", this.getAllowCreatePrivateChannels());
        writer.writeBooleanValue("allowCreateUpdateChannels", this.getAllowCreateUpdateChannels());
        writer.writeBooleanValue("allowCreateUpdateRemoveConnectors", this.getAllowCreateUpdateRemoveConnectors());
        writer.writeBooleanValue("allowCreateUpdateRemoveTabs", this.getAllowCreateUpdateRemoveTabs());
        writer.writeBooleanValue("allowDeleteChannels", this.getAllowDeleteChannels());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the allowAddRemoveApps property value. If set to true, members can add and remove apps.
     * @param value Value to set for the allowAddRemoveApps property.
     */
    public void setAllowAddRemoveApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowAddRemoveApps", value);
    }
    /**
     * Sets the allowCreatePrivateChannels property value. If set to true, members can add and update private channels.
     * @param value Value to set for the allowCreatePrivateChannels property.
     */
    public void setAllowCreatePrivateChannels(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowCreatePrivateChannels", value);
    }
    /**
     * Sets the allowCreateUpdateChannels property value. If set to true, members can add and update channels.
     * @param value Value to set for the allowCreateUpdateChannels property.
     */
    public void setAllowCreateUpdateChannels(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowCreateUpdateChannels", value);
    }
    /**
     * Sets the allowCreateUpdateRemoveConnectors property value. If set to true, members can add, update, and remove connectors.
     * @param value Value to set for the allowCreateUpdateRemoveConnectors property.
     */
    public void setAllowCreateUpdateRemoveConnectors(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowCreateUpdateRemoveConnectors", value);
    }
    /**
     * Sets the allowCreateUpdateRemoveTabs property value. If set to true, members can add, update, and remove tabs.
     * @param value Value to set for the allowCreateUpdateRemoveTabs property.
     */
    public void setAllowCreateUpdateRemoveTabs(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowCreateUpdateRemoveTabs", value);
    }
    /**
     * Sets the allowDeleteChannels property value. If set to true, members can delete channels.
     * @param value Value to set for the allowDeleteChannels property.
     */
    public void setAllowDeleteChannels(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowDeleteChannels", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
