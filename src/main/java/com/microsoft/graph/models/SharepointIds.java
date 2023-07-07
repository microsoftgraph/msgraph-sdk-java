package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharepointIds implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier (guid) for the item's list in SharePoint.
     */
    private String listId;
    /**
     * An integer identifier for the item within the containing list.
     */
    private String listItemId;
    /**
     * The unique identifier (guid) for the item within OneDrive for Business or a SharePoint site.
     */
    private String listItemUniqueId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The unique identifier (guid) for the item's site collection (SPSite).
     */
    private String siteId;
    /**
     * The SharePoint URL for the site that contains the item.
     */
    private String siteUrl;
    /**
     * The unique identifier (guid) for the tenancy.
     */
    private String tenantId;
    /**
     * The unique identifier (guid) for the item's site (SPWeb).
     */
    private String webId;
    /**
     * Instantiates a new sharepointIds and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SharepointIds() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharepointIds
     */
    @javax.annotation.Nonnull
    public static SharepointIds createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharepointIds();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getListId() {
        return this.listId;
    }
    /**
     * Gets the listItemId property value. An integer identifier for the item within the containing list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getListItemId() {
        return this.listItemId;
    }
    /**
     * Gets the listItemUniqueId property value. The unique identifier (guid) for the item within OneDrive for Business or a SharePoint site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getListItemUniqueId() {
        return this.listItemUniqueId;
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
     * Gets the siteId property value. The unique identifier (guid) for the item's site collection (SPSite).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSiteId() {
        return this.siteId;
    }
    /**
     * Gets the siteUrl property value. The SharePoint URL for the site that contains the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSiteUrl() {
        return this.siteUrl;
    }
    /**
     * Gets the tenantId property value. The unique identifier (guid) for the tenancy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the webId property value. The unique identifier (guid) for the item's site (SPWeb).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebId() {
        return this.webId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the listId property value. The unique identifier (guid) for the item's list in SharePoint.
     * @param value Value to set for the listId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setListId(@javax.annotation.Nullable final String value) {
        this.listId = value;
    }
    /**
     * Sets the listItemId property value. An integer identifier for the item within the containing list.
     * @param value Value to set for the listItemId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setListItemId(@javax.annotation.Nullable final String value) {
        this.listItemId = value;
    }
    /**
     * Sets the listItemUniqueId property value. The unique identifier (guid) for the item within OneDrive for Business or a SharePoint site.
     * @param value Value to set for the listItemUniqueId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setListItemUniqueId(@javax.annotation.Nullable final String value) {
        this.listItemUniqueId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the siteId property value. The unique identifier (guid) for the item's site collection (SPSite).
     * @param value Value to set for the siteId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteId(@javax.annotation.Nullable final String value) {
        this.siteId = value;
    }
    /**
     * Sets the siteUrl property value. The SharePoint URL for the site that contains the item.
     * @param value Value to set for the siteUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteUrl(@javax.annotation.Nullable final String value) {
        this.siteUrl = value;
    }
    /**
     * Sets the tenantId property value. The unique identifier (guid) for the tenancy.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the webId property value. The unique identifier (guid) for the item's site (SPWeb).
     * @param value Value to set for the webId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebId(@javax.annotation.Nullable final String value) {
        this.webId = value;
    }
}
