package com.microsoft.graph.models;

import com.microsoft.graph.models.termstore.Store;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of agreement entities.
 */
public class Site extends BaseItem implements Parsable {
    /** Analytics about the view activities that took place in this site. */
    private ItemAnalytics _analytics;
    /** The collection of column definitions reusable across lists under this site. */
    private java.util.List<ColumnDefinition> _columns;
    /** The collection of content types defined for this site. */
    private java.util.List<ContentType> _contentTypes;
    /** The full title for the site. Read-only. */
    private String _displayName;
    /** The default drive (document library) for this site. */
    private Drive _drive;
    /** The collection of drives (document libraries) under this site. */
    private java.util.List<Drive> _drives;
    /** The error property */
    private PublicError _error;
    /** The externalColumns property */
    private java.util.List<ColumnDefinition> _externalColumns;
    /** Used to address any item contained in this site. This collection can't be enumerated. */
    private java.util.List<BaseItem> _items;
    /** The collection of lists under this site. */
    private java.util.List<List> _lists;
    /** Calls the OneNote service for notebook related operations. */
    private Onenote _onenote;
    /** The collection of long-running operations on the site. */
    private java.util.List<RichLongRunningOperation> _operations;
    /** The permissions associated with the site. Nullable. */
    private java.util.List<Permission> _permissions;
    /** If present, indicates that this is the root site in the site collection. Read-only. */
    private Root _root;
    /** Returns identifiers useful for SharePoint REST compatibility. Read-only. */
    private SharepointIds _sharepointIds;
    /** Provides details about the site's site collection. Available only on the root site. Read-only. */
    private SiteCollection _siteCollection;
    /** The collection of the sub-sites under this site. */
    private java.util.List<Site> _sites;
    /** The default termStore under this site. */
    private Store _termStore;
    /** The collection of termStores under this site. */
    private java.util.List<Store> _termStores;
    /**
     * Instantiates a new site and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Site() {
        super();
        this.setOdataType("#microsoft.graph.site");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a site
     */
    @javax.annotation.Nonnull
    public static Site createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Site();
    }
    /**
     * Gets the analytics property value. Analytics about the view activities that took place in this site.
     * @return a itemAnalytics
     */
    @javax.annotation.Nullable
    public ItemAnalytics getAnalytics() {
        return this._analytics;
    }
    /**
     * Gets the columns property value. The collection of column definitions reusable across lists under this site.
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<ColumnDefinition> getColumns() {
        return this._columns;
    }
    /**
     * Gets the contentTypes property value. The collection of content types defined for this site.
     * @return a contentType
     */
    @javax.annotation.Nullable
    public java.util.List<ContentType> getContentTypes() {
        return this._contentTypes;
    }
    /**
     * Gets the displayName property value. The full title for the site. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the drive property value. The default drive (document library) for this site.
     * @return a drive
     */
    @javax.annotation.Nullable
    public Drive getDrive() {
        return this._drive;
    }
    /**
     * Gets the drives property value. The collection of drives (document libraries) under this site.
     * @return a drive
     */
    @javax.annotation.Nullable
    public java.util.List<Drive> getDrives() {
        return this._drives;
    }
    /**
     * Gets the error property value. The error property
     * @return a publicError
     */
    @javax.annotation.Nullable
    public PublicError getError() {
        return this._error;
    }
    /**
     * Gets the externalColumns property value. The externalColumns property
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<ColumnDefinition> getExternalColumns() {
        return this._externalColumns;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("analytics", (n) -> { this.setAnalytics(n.getObjectValue(ItemAnalytics::createFromDiscriminatorValue)); });
        deserializerMap.put("columns", (n) -> { this.setColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("contentTypes", (n) -> { this.setContentTypes(n.getCollectionOfObjectValues(ContentType::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("drive", (n) -> { this.setDrive(n.getObjectValue(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("drives", (n) -> { this.setDrives(n.getCollectionOfObjectValues(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("externalColumns", (n) -> { this.setExternalColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(BaseItem::createFromDiscriminatorValue)); });
        deserializerMap.put("lists", (n) -> { this.setLists(n.getCollectionOfObjectValues(List::createFromDiscriminatorValue)); });
        deserializerMap.put("onenote", (n) -> { this.setOnenote(n.getObjectValue(Onenote::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(RichLongRunningOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfObjectValues(Permission::createFromDiscriminatorValue)); });
        deserializerMap.put("root", (n) -> { this.setRoot(n.getObjectValue(Root::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepointIds", (n) -> { this.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
        deserializerMap.put("siteCollection", (n) -> { this.setSiteCollection(n.getObjectValue(SiteCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("sites", (n) -> { this.setSites(n.getCollectionOfObjectValues(Site::createFromDiscriminatorValue)); });
        deserializerMap.put("termStore", (n) -> { this.setTermStore(n.getObjectValue(Store::createFromDiscriminatorValue)); });
        deserializerMap.put("termStores", (n) -> { this.setTermStores(n.getCollectionOfObjectValues(Store::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. Used to address any item contained in this site. This collection can't be enumerated.
     * @return a baseItem
     */
    @javax.annotation.Nullable
    public java.util.List<BaseItem> getItems() {
        return this._items;
    }
    /**
     * Gets the lists property value. The collection of lists under this site.
     * @return a list
     */
    @javax.annotation.Nullable
    public java.util.List<List> getLists() {
        return this._lists;
    }
    /**
     * Gets the onenote property value. Calls the OneNote service for notebook related operations.
     * @return a onenote
     */
    @javax.annotation.Nullable
    public Onenote getOnenote() {
        return this._onenote;
    }
    /**
     * Gets the operations property value. The collection of long-running operations on the site.
     * @return a richLongRunningOperation
     */
    @javax.annotation.Nullable
    public java.util.List<RichLongRunningOperation> getOperations() {
        return this._operations;
    }
    /**
     * Gets the permissions property value. The permissions associated with the site. Nullable.
     * @return a permission
     */
    @javax.annotation.Nullable
    public java.util.List<Permission> getPermissions() {
        return this._permissions;
    }
    /**
     * Gets the root property value. If present, indicates that this is the root site in the site collection. Read-only.
     * @return a root
     */
    @javax.annotation.Nullable
    public Root getRoot() {
        return this._root;
    }
    /**
     * Gets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @return a sharepointIds
     */
    @javax.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this._sharepointIds;
    }
    /**
     * Gets the siteCollection property value. Provides details about the site's site collection. Available only on the root site. Read-only.
     * @return a siteCollection
     */
    @javax.annotation.Nullable
    public SiteCollection getSiteCollection() {
        return this._siteCollection;
    }
    /**
     * Gets the sites property value. The collection of the sub-sites under this site.
     * @return a site
     */
    @javax.annotation.Nullable
    public java.util.List<Site> getSites() {
        return this._sites;
    }
    /**
     * Gets the termStore property value. The default termStore under this site.
     * @return a store
     */
    @javax.annotation.Nullable
    public Store getTermStore() {
        return this._termStore;
    }
    /**
     * Gets the termStores property value. The collection of termStores under this site.
     * @return a store
     */
    @javax.annotation.Nullable
    public java.util.List<Store> getTermStores() {
        return this._termStores;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("analytics", this.getAnalytics());
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeCollectionOfObjectValues("contentTypes", this.getContentTypes());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("drive", this.getDrive());
        writer.writeCollectionOfObjectValues("drives", this.getDrives());
        writer.writeObjectValue("error", this.getError());
        writer.writeCollectionOfObjectValues("externalColumns", this.getExternalColumns());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeCollectionOfObjectValues("lists", this.getLists());
        writer.writeObjectValue("onenote", this.getOnenote());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("permissions", this.getPermissions());
        writer.writeObjectValue("root", this.getRoot());
        writer.writeObjectValue("sharepointIds", this.getSharepointIds());
        writer.writeObjectValue("siteCollection", this.getSiteCollection());
        writer.writeCollectionOfObjectValues("sites", this.getSites());
        writer.writeObjectValue("termStore", this.getTermStore());
        writer.writeCollectionOfObjectValues("termStores", this.getTermStores());
    }
    /**
     * Sets the analytics property value. Analytics about the view activities that took place in this site.
     * @param value Value to set for the analytics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnalytics(@javax.annotation.Nullable final ItemAnalytics value) {
        this._analytics = value;
    }
    /**
     * Sets the columns property value. The collection of column definitions reusable across lists under this site.
     * @param value Value to set for the columns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumns(@javax.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this._columns = value;
    }
    /**
     * Sets the contentTypes property value. The collection of content types defined for this site.
     * @param value Value to set for the contentTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentTypes(@javax.annotation.Nullable final java.util.List<ContentType> value) {
        this._contentTypes = value;
    }
    /**
     * Sets the displayName property value. The full title for the site. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the drive property value. The default drive (document library) for this site.
     * @param value Value to set for the drive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDrive(@javax.annotation.Nullable final Drive value) {
        this._drive = value;
    }
    /**
     * Sets the drives property value. The collection of drives (document libraries) under this site.
     * @param value Value to set for the drives property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDrives(@javax.annotation.Nullable final java.util.List<Drive> value) {
        this._drives = value;
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final PublicError value) {
        this._error = value;
    }
    /**
     * Sets the externalColumns property value. The externalColumns property
     * @param value Value to set for the externalColumns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalColumns(@javax.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this._externalColumns = value;
    }
    /**
     * Sets the items property value. Used to address any item contained in this site. This collection can't be enumerated.
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<BaseItem> value) {
        this._items = value;
    }
    /**
     * Sets the lists property value. The collection of lists under this site.
     * @param value Value to set for the lists property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLists(@javax.annotation.Nullable final java.util.List<List> value) {
        this._lists = value;
    }
    /**
     * Sets the onenote property value. Calls the OneNote service for notebook related operations.
     * @param value Value to set for the onenote property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnenote(@javax.annotation.Nullable final Onenote value) {
        this._onenote = value;
    }
    /**
     * Sets the operations property value. The collection of long-running operations on the site.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<RichLongRunningOperation> value) {
        this._operations = value;
    }
    /**
     * Sets the permissions property value. The permissions associated with the site. Nullable.
     * @param value Value to set for the permissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermissions(@javax.annotation.Nullable final java.util.List<Permission> value) {
        this._permissions = value;
    }
    /**
     * Sets the root property value. If present, indicates that this is the root site in the site collection. Read-only.
     * @param value Value to set for the root property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoot(@javax.annotation.Nullable final Root value) {
        this._root = value;
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharepointIds(@javax.annotation.Nullable final SharepointIds value) {
        this._sharepointIds = value;
    }
    /**
     * Sets the siteCollection property value. Provides details about the site's site collection. Available only on the root site. Read-only.
     * @param value Value to set for the siteCollection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteCollection(@javax.annotation.Nullable final SiteCollection value) {
        this._siteCollection = value;
    }
    /**
     * Sets the sites property value. The collection of the sub-sites under this site.
     * @param value Value to set for the sites property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSites(@javax.annotation.Nullable final java.util.List<Site> value) {
        this._sites = value;
    }
    /**
     * Sets the termStore property value. The default termStore under this site.
     * @param value Value to set for the termStore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermStore(@javax.annotation.Nullable final Store value) {
        this._termStore = value;
    }
    /**
     * Sets the termStores property value. The collection of termStores under this site.
     * @param value Value to set for the termStores property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermStores(@javax.annotation.Nullable final java.util.List<Store> value) {
        this._termStores = value;
    }
}
