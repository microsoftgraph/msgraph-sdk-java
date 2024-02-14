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
/**
 * Network Usage Rules allow enterprises to specify how managed apps use networks, such as cellular data networks.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosNetworkUsageRule implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link IosNetworkUsageRule} and sets the default values.
     */
    public IosNetworkUsageRule() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosNetworkUsageRule}
     */
    @jakarta.annotation.Nonnull
    public static IosNetworkUsageRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosNetworkUsageRule();
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
     * Gets the cellularDataBlocked property value. If set to true, corresponding managed apps will not be allowed to use cellular data at any time.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularDataBlocked() {
        return this.backingStore.get("cellularDataBlocked");
    }
    /**
     * Gets the cellularDataBlockWhenRoaming property value. If set to true, corresponding managed apps will not be allowed to use cellular data when roaming.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularDataBlockWhenRoaming() {
        return this.backingStore.get("cellularDataBlockWhenRoaming");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cellularDataBlocked", (n) -> { this.setCellularDataBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularDataBlockWhenRoaming", (n) -> { this.setCellularDataBlockWhenRoaming(n.getBooleanValue()); });
        deserializerMap.put("managedApps", (n) -> { this.setManagedApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedApps property value. Information about the managed apps that this rule is going to apply to. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<AppListItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getManagedApps() {
        return this.backingStore.get("managedApps");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("cellularDataBlocked", this.getCellularDataBlocked());
        writer.writeBooleanValue("cellularDataBlockWhenRoaming", this.getCellularDataBlockWhenRoaming());
        writer.writeCollectionOfObjectValues("managedApps", this.getManagedApps());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the cellularDataBlocked property value. If set to true, corresponding managed apps will not be allowed to use cellular data at any time.
     * @param value Value to set for the cellularDataBlocked property.
     */
    public void setCellularDataBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cellularDataBlocked", value);
    }
    /**
     * Sets the cellularDataBlockWhenRoaming property value. If set to true, corresponding managed apps will not be allowed to use cellular data when roaming.
     * @param value Value to set for the cellularDataBlockWhenRoaming property.
     */
    public void setCellularDataBlockWhenRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cellularDataBlockWhenRoaming", value);
    }
    /**
     * Sets the managedApps property value. Information about the managed apps that this rule is going to apply to. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the managedApps property.
     */
    public void setManagedApps(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("managedApps", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
