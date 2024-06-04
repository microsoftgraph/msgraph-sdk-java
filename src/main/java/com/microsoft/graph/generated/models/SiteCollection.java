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
public class SiteCollection implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SiteCollection} and sets the default values.
     */
    public SiteCollection() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SiteCollection}
     */
    @jakarta.annotation.Nonnull
    public static SiteCollection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SiteCollection();
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
     * Gets the archivalDetails property value. Represents whether the site collection is recently archived, fully archived, or reactivating. Possible values are: recentlyArchived, fullyArchived, reactivating, unknownFutureValue.
     * @return a {@link SiteArchivalDetails}
     */
    @jakarta.annotation.Nullable
    public SiteArchivalDetails getArchivalDetails() {
        return this.backingStore.get("archivalDetails");
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
     * Gets the dataLocationCode property value. The geographic region code for where this site collection resides. Only present for multi-geo tenants. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataLocationCode() {
        return this.backingStore.get("dataLocationCode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("archivalDetails", (n) -> { this.setArchivalDetails(n.getObjectValue(SiteArchivalDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("dataLocationCode", (n) -> { this.setDataLocationCode(n.getStringValue()); });
        deserializerMap.put("hostname", (n) -> { this.setHostname(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("root", (n) -> { this.setRoot(n.getObjectValue(Root::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hostname property value. The hostname for the site collection. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHostname() {
        return this.backingStore.get("hostname");
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
     * Gets the root property value. If present, indicates that this is a root site collection in SharePoint. Read-only.
     * @return a {@link Root}
     */
    @jakarta.annotation.Nullable
    public Root getRoot() {
        return this.backingStore.get("root");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("archivalDetails", this.getArchivalDetails());
        writer.writeStringValue("dataLocationCode", this.getDataLocationCode());
        writer.writeStringValue("hostname", this.getHostname());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("root", this.getRoot());
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
     * Sets the archivalDetails property value. Represents whether the site collection is recently archived, fully archived, or reactivating. Possible values are: recentlyArchived, fullyArchived, reactivating, unknownFutureValue.
     * @param value Value to set for the archivalDetails property.
     */
    public void setArchivalDetails(@jakarta.annotation.Nullable final SiteArchivalDetails value) {
        this.backingStore.set("archivalDetails", value);
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
     * Sets the dataLocationCode property value. The geographic region code for where this site collection resides. Only present for multi-geo tenants. Read-only.
     * @param value Value to set for the dataLocationCode property.
     */
    public void setDataLocationCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dataLocationCode", value);
    }
    /**
     * Sets the hostname property value. The hostname for the site collection. Read-only.
     * @param value Value to set for the hostname property.
     */
    public void setHostname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hostname", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the root property value. If present, indicates that this is a root site collection in SharePoint. Read-only.
     * @param value Value to set for the root property.
     */
    public void setRoot(@jakarta.annotation.Nullable final Root value) {
        this.backingStore.set("root", value);
    }
}
