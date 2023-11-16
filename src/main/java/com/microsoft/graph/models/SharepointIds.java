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
public class SharepointIds implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new SharepointIds and sets the default values.
     */
    public SharepointIds() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharepointIds
     */
    @jakarta.annotation.Nonnull
    public static SharepointIds createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharepointIds();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("listId", (n) -> { this.setListId(n.getStringValue()); });
        deserializerMap.put("listItemId", (n) -> { this.setListItemId(n.getStringValue()); });
        deserializerMap.put("listItemUniqueId", (n) -> { this.setListItemUniqueId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("siteId", (n) -> { this.setSiteId(n.getStringValue()); });
        deserializerMap.put("siteUrl", (n) -> { this.setSiteUrl(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("webId", (n) -> { this.setWebId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listId property value. The unique identifier (guid) for the item's list in SharePoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getListId() {
        return this.backingStore.get("listId");
    }
    /**
     * Gets the listItemId property value. An integer identifier for the item within the containing list.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getListItemId() {
        return this.backingStore.get("listItemId");
    }
    /**
     * Gets the listItemUniqueId property value. The unique identifier (guid) for the item within OneDrive for Business or a SharePoint site.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getListItemUniqueId() {
        return this.backingStore.get("listItemUniqueId");
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
     * Gets the siteId property value. The unique identifier (guid) for the item's site collection (SPSite).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSiteId() {
        return this.backingStore.get("siteId");
    }
    /**
     * Gets the siteUrl property value. The SharePoint URL for the site that contains the item.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSiteUrl() {
        return this.backingStore.get("siteUrl");
    }
    /**
     * Gets the tenantId property value. The unique identifier (guid) for the tenancy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the webId property value. The unique identifier (guid) for the item's site (SPWeb).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebId() {
        return this.backingStore.get("webId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("listId", this.getListId());
        writer.writeStringValue("listItemId", this.getListItemId());
        writer.writeStringValue("listItemUniqueId", this.getListItemUniqueId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("siteId", this.getSiteId());
        writer.writeStringValue("siteUrl", this.getSiteUrl());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("webId", this.getWebId());
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
     * Sets the listId property value. The unique identifier (guid) for the item's list in SharePoint.
     * @param value Value to set for the listId property.
     */
    public void setListId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("listId", value);
    }
    /**
     * Sets the listItemId property value. An integer identifier for the item within the containing list.
     * @param value Value to set for the listItemId property.
     */
    public void setListItemId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("listItemId", value);
    }
    /**
     * Sets the listItemUniqueId property value. The unique identifier (guid) for the item within OneDrive for Business or a SharePoint site.
     * @param value Value to set for the listItemUniqueId property.
     */
    public void setListItemUniqueId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("listItemUniqueId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the siteId property value. The unique identifier (guid) for the item's site collection (SPSite).
     * @param value Value to set for the siteId property.
     */
    public void setSiteId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteId", value);
    }
    /**
     * Sets the siteUrl property value. The SharePoint URL for the site that contains the item.
     * @param value Value to set for the siteUrl property.
     */
    public void setSiteUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteUrl", value);
    }
    /**
     * Sets the tenantId property value. The unique identifier (guid) for the tenancy.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the webId property value. The unique identifier (guid) for the item's site (SPWeb).
     * @param value Value to set for the webId property.
     */
    public void setWebId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webId", value);
    }
}
