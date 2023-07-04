package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharedDriveItem extends BaseItem implements Parsable {
    /**
     * Used to access the underlying driveItem
     */
    private DriveItem driveItem;
    /**
     * All driveItems contained in the sharing root. This collection cannot be enumerated.
     */
    private java.util.List<DriveItem> items;
    /**
     * Used to access the underlying list
     */
    private List list;
    /**
     * Used to access the underlying listItem
     */
    private ListItem listItem;
    /**
     * Information about the owner of the shared item being referenced.
     */
    private IdentitySet owner;
    /**
     * Used to access the permission representing the underlying sharing link
     */
    private Permission permission;
    /**
     * Used to access the underlying driveItem. Deprecated -- use driveItem instead.
     */
    private DriveItem root;
    /**
     * Used to access the underlying site
     */
    private Site site;
    /**
     * Instantiates a new SharedDriveItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SharedDriveItem() {
        super();
        this.setOdataType("#microsoft.graph.sharedDriveItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharedDriveItem
     */
    @javax.annotation.Nonnull
    public static SharedDriveItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedDriveItem();
    }
    /**
     * Gets the driveItem property value. Used to access the underlying driveItem
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public DriveItem getDriveItem() {
        return this.driveItem;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("driveItem", (n) -> { this.setDriveItem(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("list", (n) -> { this.setList(n.getObjectValue(List::createFromDiscriminatorValue)); });
        deserializerMap.put("listItem", (n) -> { this.setListItem(n.getObjectValue(ListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("permission", (n) -> { this.setPermission(n.getObjectValue(Permission::createFromDiscriminatorValue)); });
        deserializerMap.put("root", (n) -> { this.setRoot(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("site", (n) -> { this.setSite(n.getObjectValue(Site::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. All driveItems contained in the sharing root. This collection cannot be enumerated.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public java.util.List<DriveItem> getItems() {
        return this.items;
    }
    /**
     * Gets the list property value. Used to access the underlying list
     * @return a list
     */
    @javax.annotation.Nullable
    public List getList() {
        return this.list;
    }
    /**
     * Gets the listItem property value. Used to access the underlying listItem
     * @return a listItem
     */
    @javax.annotation.Nullable
    public ListItem getListItem() {
        return this.listItem;
    }
    /**
     * Gets the owner property value. Information about the owner of the shared item being referenced.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getOwner() {
        return this.owner;
    }
    /**
     * Gets the permission property value. Used to access the permission representing the underlying sharing link
     * @return a permission
     */
    @javax.annotation.Nullable
    public Permission getPermission() {
        return this.permission;
    }
    /**
     * Gets the root property value. Used to access the underlying driveItem. Deprecated -- use driveItem instead.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public DriveItem getRoot() {
        return this.root;
    }
    /**
     * Gets the site property value. Used to access the underlying site
     * @return a site
     */
    @javax.annotation.Nullable
    public Site getSite() {
        return this.site;
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
        writer.writeObjectValue("driveItem", this.getDriveItem());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeObjectValue("list", this.getList());
        writer.writeObjectValue("listItem", this.getListItem());
        writer.writeObjectValue("owner", this.getOwner());
        writer.writeObjectValue("permission", this.getPermission());
        writer.writeObjectValue("root", this.getRoot());
        writer.writeObjectValue("site", this.getSite());
    }
    /**
     * Sets the driveItem property value. Used to access the underlying driveItem
     * @param value Value to set for the driveItem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDriveItem(@javax.annotation.Nullable final DriveItem value) {
        this.driveItem = value;
    }
    /**
     * Sets the items property value. All driveItems contained in the sharing root. This collection cannot be enumerated.
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<DriveItem> value) {
        this.items = value;
    }
    /**
     * Sets the list property value. Used to access the underlying list
     * @param value Value to set for the list property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setList(@javax.annotation.Nullable final List value) {
        this.list = value;
    }
    /**
     * Sets the listItem property value. Used to access the underlying listItem
     * @param value Value to set for the listItem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setListItem(@javax.annotation.Nullable final ListItem value) {
        this.listItem = value;
    }
    /**
     * Sets the owner property value. Information about the owner of the shared item being referenced.
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final IdentitySet value) {
        this.owner = value;
    }
    /**
     * Sets the permission property value. Used to access the permission representing the underlying sharing link
     * @param value Value to set for the permission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermission(@javax.annotation.Nullable final Permission value) {
        this.permission = value;
    }
    /**
     * Sets the root property value. Used to access the underlying driveItem. Deprecated -- use driveItem instead.
     * @param value Value to set for the root property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoot(@javax.annotation.Nullable final DriveItem value) {
        this.root = value;
    }
    /**
     * Sets the site property value. Used to access the underlying site
     * @param value Value to set for the site property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSite(@javax.annotation.Nullable final Site value) {
        this.site = value;
    }
}
