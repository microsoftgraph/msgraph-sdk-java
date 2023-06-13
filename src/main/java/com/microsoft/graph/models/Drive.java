package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Drive extends BaseItem implements Parsable {
    /** Collection of [bundles][bundle] (albums and multi-select-shared sets of items). Only in personal OneDrive. */
    private java.util.List<DriveItem> bundles;
    /** Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for Business will return business. SharePoint document libraries will return documentLibrary. Read-only. */
    private String driveType;
    /** The list of items the user is following. Only in OneDrive for Business. */
    private java.util.List<DriveItem> following;
    /** All items contained in the drive. Read-only. Nullable. */
    private java.util.List<DriveItem> items;
    /** For drives in SharePoint, the underlying document library list. Read-only. Nullable. */
    private List list;
    /** Optional. The user account that owns the drive. Read-only. */
    private IdentitySet owner;
    /** Optional. Information about the drive's storage space quota. Read-only. */
    private Quota quota;
    /** The root folder of the drive. Read-only. */
    private DriveItem root;
    /** The sharePointIds property */
    private SharepointIds sharePointIds;
    /** Collection of common folders available in OneDrive. Read-only. Nullable. */
    private java.util.List<DriveItem> special;
    /** If present, indicates that this is a system-managed drive. Read-only. */
    private SystemFacet system;
    /**
     * Instantiates a new drive and sets the default values.
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
     * @return a drive
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
        return this.bundles;
    }
    /**
     * Gets the driveType property value. Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for Business will return business. SharePoint document libraries will return documentLibrary. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDriveType() {
        return this.driveType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bundles", (n) -> { this.setBundles(n.getCollectionOfObjectValues(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("driveType", (n) -> { this.setDriveType(n.getStringValue()); });
        deserializerMap.put("following", (n) -> { this.setFollowing(n.getCollectionOfObjectValues(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("list", (n) -> { this.setList(n.getObjectValue(List::createFromDiscriminatorValue)); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("quota", (n) -> { this.setQuota(n.getObjectValue(Quota::createFromDiscriminatorValue)); });
        deserializerMap.put("root", (n) -> { this.setRoot(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("sharePointIds", (n) -> { this.setSharePointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
        deserializerMap.put("special", (n) -> { this.setSpecial(n.getCollectionOfObjectValues(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("system", (n) -> { this.setSystem(n.getObjectValue(SystemFacet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the following property value. The list of items the user is following. Only in OneDrive for Business.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public java.util.List<DriveItem> getFollowing() {
        return this.following;
    }
    /**
     * Gets the items property value. All items contained in the drive. Read-only. Nullable.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public java.util.List<DriveItem> getItems() {
        return this.items;
    }
    /**
     * Gets the list property value. For drives in SharePoint, the underlying document library list. Read-only. Nullable.
     * @return a list
     */
    @javax.annotation.Nullable
    public List getList() {
        return this.list;
    }
    /**
     * Gets the owner property value. Optional. The user account that owns the drive. Read-only.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getOwner() {
        return this.owner;
    }
    /**
     * Gets the quota property value. Optional. Information about the drive's storage space quota. Read-only.
     * @return a quota
     */
    @javax.annotation.Nullable
    public Quota getQuota() {
        return this.quota;
    }
    /**
     * Gets the root property value. The root folder of the drive. Read-only.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public DriveItem getRoot() {
        return this.root;
    }
    /**
     * Gets the sharePointIds property value. The sharePointIds property
     * @return a sharepointIds
     */
    @javax.annotation.Nullable
    public SharepointIds getSharePointIds() {
        return this.sharePointIds;
    }
    /**
     * Gets the special property value. Collection of common folders available in OneDrive. Read-only. Nullable.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public java.util.List<DriveItem> getSpecial() {
        return this.special;
    }
    /**
     * Gets the system property value. If present, indicates that this is a system-managed drive. Read-only.
     * @return a systemFacet
     */
    @javax.annotation.Nullable
    public SystemFacet getSystem() {
        return this.system;
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
        this.bundles = value;
    }
    /**
     * Sets the driveType property value. Describes the type of drive represented by this resource. OneDrive personal drives will return personal. OneDrive for Business will return business. SharePoint document libraries will return documentLibrary. Read-only.
     * @param value Value to set for the driveType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDriveType(@javax.annotation.Nullable final String value) {
        this.driveType = value;
    }
    /**
     * Sets the following property value. The list of items the user is following. Only in OneDrive for Business.
     * @param value Value to set for the following property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFollowing(@javax.annotation.Nullable final java.util.List<DriveItem> value) {
        this.following = value;
    }
    /**
     * Sets the items property value. All items contained in the drive. Read-only. Nullable.
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<DriveItem> value) {
        this.items = value;
    }
    /**
     * Sets the list property value. For drives in SharePoint, the underlying document library list. Read-only. Nullable.
     * @param value Value to set for the list property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setList(@javax.annotation.Nullable final List value) {
        this.list = value;
    }
    /**
     * Sets the owner property value. Optional. The user account that owns the drive. Read-only.
     * @param value Value to set for the owner property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwner(@javax.annotation.Nullable final IdentitySet value) {
        this.owner = value;
    }
    /**
     * Sets the quota property value. Optional. Information about the drive's storage space quota. Read-only.
     * @param value Value to set for the quota property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuota(@javax.annotation.Nullable final Quota value) {
        this.quota = value;
    }
    /**
     * Sets the root property value. The root folder of the drive. Read-only.
     * @param value Value to set for the root property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoot(@javax.annotation.Nullable final DriveItem value) {
        this.root = value;
    }
    /**
     * Sets the sharePointIds property value. The sharePointIds property
     * @param value Value to set for the sharePointIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharePointIds(@javax.annotation.Nullable final SharepointIds value) {
        this.sharePointIds = value;
    }
    /**
     * Sets the special property value. Collection of common folders available in OneDrive. Read-only. Nullable.
     * @param value Value to set for the special property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpecial(@javax.annotation.Nullable final java.util.List<DriveItem> value) {
        this.special = value;
    }
    /**
     * Sets the system property value. If present, indicates that this is a system-managed drive. Read-only.
     * @param value Value to set for the system property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystem(@javax.annotation.Nullable final SystemFacet value) {
        this.system = value;
    }
}
