package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Drive extends BaseItem implements Parsable {
    /** Collection of [bundles][bundle] (albums and multi-select-shared sets of items). Only in personal OneDrive. */
    private java.util.List<DriveItem> _bundles;
    /** Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for Business will return business. SharePoint document libraries will return documentLibrary. Read-only. */
    private String _driveType;
    /** The list of items the user is following. Only in OneDrive for Business. */
    private java.util.List<DriveItem> _following;
    /** All items contained in the drive. Read-only. Nullable. */
    private java.util.List<DriveItem> _items;
    /** For drives in SharePoint, the underlying document library list. Read-only. Nullable. */
    private List _list;
    /** Optional. The user account that owns the drive. Read-only. */
    private IdentitySet _owner;
    /** Optional. Information about the drive's storage space quota. Read-only. */
    private Quota _quota;
    /** The root folder of the drive. Read-only. */
    private DriveItem _root;
    /** The sharePointIds property */
    private SharepointIds _sharePointIds;
    /** Collection of common folders available in OneDrive. Read-only. Nullable. */
    private java.util.List<DriveItem> _special;
    /** If present, indicates that this is a system-managed drive. Read-only. */
    private SystemFacet _system;
    /**
     * Instantiates a new Drive and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Drive() {
        super();
        this.setOdataType("#microsoft.graph.drive");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Drive
     */
    @javax.annotation.Nonnull
    public static Drive createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Drive();
    }
    /**
     * Gets the bundles property value. Collection of [bundles][bundle] (albums and multi-select-shared sets of items). Only in personal OneDrive.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public java.util.List<DriveItem> getBundles() {
        return this._bundles;
    }
    /**
     * Gets the driveType property value. Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for Business will return business. SharePoint document libraries will return documentLibrary. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDriveType() {
        return this._driveType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Drive currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bundles", (n) -> { currentObject.setBundles(n.getCollectionOfObjectValues(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("driveType", (n) -> { currentObject.setDriveType(n.getStringValue()); });
        deserializerMap.put("following", (n) -> { currentObject.setFollowing(n.getCollectionOfObjectValues(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("items", (n) -> { currentObject.setItems(n.getCollectionOfObjectValues(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("list", (n) -> { currentObject.setList(n.getObjectValue(List::createFromDiscriminatorValue)); });
        deserializerMap.put("owner", (n) -> { currentObject.setOwner(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("quota", (n) -> { currentObject.setQuota(n.getObjectValue(Quota::createFromDiscriminatorValue)); });
        deserializerMap.put("root", (n) -> { currentObject.setRoot(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("sharePointIds", (n) -> { currentObject.setSharePointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
        deserializerMap.put("special", (n) -> { currentObject.setSpecial(n.getCollectionOfObjectValues(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("system", (n) -> { currentObject.setSystem(n.getObjectValue(SystemFacet::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the following property value. The list of items the user is following. Only in OneDrive for Business.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public java.util.List<DriveItem> getFollowing() {
        return this._following;
    }
    /**
     * Gets the items property value. All items contained in the drive. Read-only. Nullable.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public java.util.List<DriveItem> getItems() {
        return this._items;
    }
    /**
     * Gets the list property value. For drives in SharePoint, the underlying document library list. Read-only. Nullable.
     * @return a list
     */
    @javax.annotation.Nullable
    public List getList() {
        return this._list;
    }
    /**
     * Gets the owner property value. Optional. The user account that owns the drive. Read-only.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getOwner() {
        return this._owner;
    }
    /**
     * Gets the quota property value. Optional. Information about the drive's storage space quota. Read-only.
     * @return a quota
     */
    @javax.annotation.Nullable
    public Quota getQuota() {
        return this._quota;
    }
    /**
     * Gets the root property value. The root folder of the drive. Read-only.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public DriveItem getRoot() {
        return this._root;
    }
    /**
     * Gets the sharePointIds property value. The sharePointIds property
     * @return a sharepointIds
     */
    @javax.annotation.Nullable
    public SharepointIds getSharePointIds() {
        return this._sharePointIds;
    }
    /**
     * Gets the special property value. Collection of common folders available in OneDrive. Read-only. Nullable.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public java.util.List<DriveItem> getSpecial() {
        return this._special;
    }
    /**
     * Gets the system property value. If present, indicates that this is a system-managed drive. Read-only.
     * @return a systemFacet
     */
    @javax.annotation.Nullable
    public SystemFacet getSystem() {
        return this._system;
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
        writer.writeCollectionOfObjectValues("bundles", this.getBundles());
        writer.writeStringValue("driveType", this.getDriveType());
        writer.writeCollectionOfObjectValues("following", this.getFollowing());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeObjectValue("list", this.getList());
        writer.writeObjectValue("owner", this.getOwner());
        writer.writeObjectValue("quota", this.getQuota());
        writer.writeObjectValue("root", this.getRoot());
        writer.writeObjectValue("sharePointIds", this.getSharePointIds());
        writer.writeCollectionOfObjectValues("special", this.getSpecial());
        writer.writeObjectValue("system", this.getSystem());
    }
    /**
     * Sets the bundles property value. Collection of [bundles][bundle] (albums and multi-select-shared sets of items). Only in personal OneDrive.
     * @param value Value to set for the bundles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBundles(@javax.annotation.Nullable final java.util.List<DriveItem> value) {
        this._bundles = value;
    }
    /**
     * Sets the driveType property value. Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for Business will return business. SharePoint document libraries will return documentLibrary. Read-only.
     * @param value Value to set for the driveType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDriveType(@javax.annotation.Nullable final String value) {
        this._driveType = value;
    }
    /**
     * Sets the following property value. The list of items the user is following. Only in OneDrive for Business.
     * @param value Value to set for the following property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFollowing(@javax.annotation.Nullable final java.util.List<DriveItem> value) {
        this._following = value;
    }
    /**
     * Sets the items property value. All items contained in the drive. Read-only. Nullable.
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<DriveItem> value) {
        this._items = value;
    }
    /**
     * Sets the list property value. For drives in SharePoint, the underlying document library list. Read-only. Nullable.
     * @param value Value to set for the list property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setList(@javax.annotation.Nullable final List value) {
        this._list = value;
    }
    /**
     * Sets the owner property value. Optional. The user account that owns the drive. Read-only.
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final IdentitySet value) {
        this._owner = value;
    }
    /**
     * Sets the quota property value. Optional. Information about the drive's storage space quota. Read-only.
     * @param value Value to set for the quota property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuota(@javax.annotation.Nullable final Quota value) {
        this._quota = value;
    }
    /**
     * Sets the root property value. The root folder of the drive. Read-only.
     * @param value Value to set for the root property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoot(@javax.annotation.Nullable final DriveItem value) {
        this._root = value;
    }
    /**
     * Sets the sharePointIds property value. The sharePointIds property
     * @param value Value to set for the sharePointIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharePointIds(@javax.annotation.Nullable final SharepointIds value) {
        this._sharePointIds = value;
    }
    /**
     * Sets the special property value. Collection of common folders available in OneDrive. Read-only. Nullable.
     * @param value Value to set for the special property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpecial(@javax.annotation.Nullable final java.util.List<DriveItem> value) {
        this._special = value;
    }
    /**
     * Sets the system property value. If present, indicates that this is a system-managed drive. Read-only.
     * @param value Value to set for the system property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystem(@javax.annotation.Nullable final SystemFacet value) {
        this._system = value;
    }
}
