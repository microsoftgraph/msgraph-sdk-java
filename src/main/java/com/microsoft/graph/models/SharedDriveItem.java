package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharedDriveItem extends BaseItem implements Parsable {
    /** Used to access the underlying driveItem  */
    private DriveItem _driveItem;
    /** All driveItems contained in the sharing root. This collection cannot be enumerated.  */
    private java.util.List<DriveItem> _items;
    /** Used to access the underlying list  */
    private List _list;
    /** Used to access the underlying listItem  */
    private ListItem _listItem;
    /** Information about the owner of the shared item being referenced.  */
    private IdentitySet _owner;
    /** Used to access the permission representing the underlying sharing link  */
    private Permission _permission;
    /** Used to access the underlying driveItem. Deprecated -- use driveItem instead.  */
    private DriveItem _root;
    /** Used to access the underlying site  */
    private Site _site;
    /**
     * Instantiates a new sharedDriveItem and sets the default values.
     * @return a void
     */
    public SharedDriveItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharedDriveItem
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
        return this._driveItem;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SharedDriveItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("driveItem", (n) -> { currentObject.setDriveItem(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
            this.put("items", (n) -> { currentObject.setItems(n.getCollectionOfObjectValues(DriveItem::createFromDiscriminatorValue)); });
            this.put("list", (n) -> { currentObject.setList(n.getObjectValue(List::createFromDiscriminatorValue)); });
            this.put("listItem", (n) -> { currentObject.setListItem(n.getObjectValue(ListItem::createFromDiscriminatorValue)); });
            this.put("owner", (n) -> { currentObject.setOwner(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("permission", (n) -> { currentObject.setPermission(n.getObjectValue(Permission::createFromDiscriminatorValue)); });
            this.put("root", (n) -> { currentObject.setRoot(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
            this.put("site", (n) -> { currentObject.setSite(n.getObjectValue(Site::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the items property value. All driveItems contained in the sharing root. This collection cannot be enumerated.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public java.util.List<DriveItem> getItems() {
        return this._items;
    }
    /**
     * Gets the list property value. Used to access the underlying list
     * @return a list
     */
    @javax.annotation.Nullable
    public List getList() {
        return this._list;
    }
    /**
     * Gets the listItem property value. Used to access the underlying listItem
     * @return a listItem
     */
    @javax.annotation.Nullable
    public ListItem getListItem() {
        return this._listItem;
    }
    /**
     * Gets the owner property value. Information about the owner of the shared item being referenced.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getOwner() {
        return this._owner;
    }
    /**
     * Gets the permission property value. Used to access the permission representing the underlying sharing link
     * @return a permission
     */
    @javax.annotation.Nullable
    public Permission getPermission() {
        return this._permission;
    }
    /**
     * Gets the root property value. Used to access the underlying driveItem. Deprecated -- use driveItem instead.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public DriveItem getRoot() {
        return this._root;
    }
    /**
     * Gets the site property value. Used to access the underlying site
     * @return a site
     */
    @javax.annotation.Nullable
    public Site getSite() {
        return this._site;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDriveItem(@javax.annotation.Nullable final DriveItem value) {
        this._driveItem = value;
    }
    /**
     * Sets the items property value. All driveItems contained in the sharing root. This collection cannot be enumerated.
     * @param value Value to set for the items property.
     * @return a void
     */
    public void setItems(@javax.annotation.Nullable final java.util.List<DriveItem> value) {
        this._items = value;
    }
    /**
     * Sets the list property value. Used to access the underlying list
     * @param value Value to set for the list property.
     * @return a void
     */
    public void setList(@javax.annotation.Nullable final List value) {
        this._list = value;
    }
    /**
     * Sets the listItem property value. Used to access the underlying listItem
     * @param value Value to set for the listItem property.
     * @return a void
     */
    public void setListItem(@javax.annotation.Nullable final ListItem value) {
        this._listItem = value;
    }
    /**
     * Sets the owner property value. Information about the owner of the shared item being referenced.
     * @param value Value to set for the owner property.
     * @return a void
     */
    public void setOwner(@javax.annotation.Nullable final IdentitySet value) {
        this._owner = value;
    }
    /**
     * Sets the permission property value. Used to access the permission representing the underlying sharing link
     * @param value Value to set for the permission property.
     * @return a void
     */
    public void setPermission(@javax.annotation.Nullable final Permission value) {
        this._permission = value;
    }
    /**
     * Sets the root property value. Used to access the underlying driveItem. Deprecated -- use driveItem instead.
     * @param value Value to set for the root property.
     * @return a void
     */
    public void setRoot(@javax.annotation.Nullable final DriveItem value) {
        this._root = value;
    }
    /**
     * Sets the site property value. Used to access the underlying site
     * @param value Value to set for the site property.
     * @return a void
     */
    public void setSite(@javax.annotation.Nullable final Site value) {
        this._site = value;
    }
}
