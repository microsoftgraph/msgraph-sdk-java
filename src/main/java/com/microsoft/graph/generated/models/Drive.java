package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Drive extends BaseItem implements Parsable {
    /**
     * Instantiates a new {@link Drive} and sets the default values.
     */
    public Drive() {
        super();
        this.setOdataType("#microsoft.graph.drive");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Drive}
     */
    @jakarta.annotation.Nonnull
    public static Drive createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Drive();
    }
    /**
     * Gets the bundles property value. Collection of bundles (albums and multi-select-shared sets of items). Only in personal OneDrive.
     * @return a {@link java.util.List<DriveItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveItem> getBundles() {
        return this.backingStore.get("bundles");
    }
    /**
     * Gets the driveType property value. Describes the type of drive represented by this resource. OneDrive personal drives return personal. OneDrive for Business returns business. SharePoint document libraries return documentLibrary. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDriveType() {
        return this.backingStore.get("driveType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link java.util.List<DriveItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveItem> getFollowing() {
        return this.backingStore.get("following");
    }
    /**
     * Gets the items property value. All items contained in the drive. Read-only. Nullable.
     * @return a {@link java.util.List<DriveItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveItem> getItems() {
        return this.backingStore.get("items");
    }
    /**
     * Gets the list property value. For drives in SharePoint, the underlying document library list. Read-only. Nullable.
     * @return a {@link List}
     */
    @jakarta.annotation.Nullable
    public List getList() {
        return this.backingStore.get("list");
    }
    /**
     * Gets the owner property value. Optional. The user account that owns the drive. Read-only.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getOwner() {
        return this.backingStore.get("owner");
    }
    /**
     * Gets the quota property value. Optional. Information about the drive&apos;s storage space quota. Read-only.
     * @return a {@link Quota}
     */
    @jakarta.annotation.Nullable
    public Quota getQuota() {
        return this.backingStore.get("quota");
    }
    /**
     * Gets the root property value. The root folder of the drive. Read-only.
     * @return a {@link DriveItem}
     */
    @jakarta.annotation.Nullable
    public DriveItem getRoot() {
        return this.backingStore.get("root");
    }
    /**
     * Gets the sharePointIds property value. The sharePointIds property
     * @return a {@link SharepointIds}
     */
    @jakarta.annotation.Nullable
    public SharepointIds getSharePointIds() {
        return this.backingStore.get("sharePointIds");
    }
    /**
     * Gets the special property value. Collection of common folders available in OneDrive. Read-only. Nullable.
     * @return a {@link java.util.List<DriveItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveItem> getSpecial() {
        return this.backingStore.get("special");
    }
    /**
     * Gets the system property value. If present, indicates that it&apos;s a system-managed drive. Read-only.
     * @return a {@link SystemFacet}
     */
    @jakarta.annotation.Nullable
    public SystemFacet getSystem() {
        return this.backingStore.get("system");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the bundles property value. Collection of bundles (albums and multi-select-shared sets of items). Only in personal OneDrive.
     * @param value Value to set for the bundles property.
     */
    public void setBundles(@jakarta.annotation.Nullable final java.util.List<DriveItem> value) {
        this.backingStore.set("bundles", value);
    }
    /**
     * Sets the driveType property value. Describes the type of drive represented by this resource. OneDrive personal drives return personal. OneDrive for Business returns business. SharePoint document libraries return documentLibrary. Read-only.
     * @param value Value to set for the driveType property.
     */
    public void setDriveType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("driveType", value);
    }
    /**
     * Sets the following property value. The list of items the user is following. Only in OneDrive for Business.
     * @param value Value to set for the following property.
     */
    public void setFollowing(@jakarta.annotation.Nullable final java.util.List<DriveItem> value) {
        this.backingStore.set("following", value);
    }
    /**
     * Sets the items property value. All items contained in the drive. Read-only. Nullable.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<DriveItem> value) {
        this.backingStore.set("items", value);
    }
    /**
     * Sets the list property value. For drives in SharePoint, the underlying document library list. Read-only. Nullable.
     * @param value Value to set for the list property.
     */
    public void setList(@jakarta.annotation.Nullable final List value) {
        this.backingStore.set("list", value);
    }
    /**
     * Sets the owner property value. Optional. The user account that owns the drive. Read-only.
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("owner", value);
    }
    /**
     * Sets the quota property value. Optional. Information about the drive&apos;s storage space quota. Read-only.
     * @param value Value to set for the quota property.
     */
    public void setQuota(@jakarta.annotation.Nullable final Quota value) {
        this.backingStore.set("quota", value);
    }
    /**
     * Sets the root property value. The root folder of the drive. Read-only.
     * @param value Value to set for the root property.
     */
    public void setRoot(@jakarta.annotation.Nullable final DriveItem value) {
        this.backingStore.set("root", value);
    }
    /**
     * Sets the sharePointIds property value. The sharePointIds property
     * @param value Value to set for the sharePointIds property.
     */
    public void setSharePointIds(@jakarta.annotation.Nullable final SharepointIds value) {
        this.backingStore.set("sharePointIds", value);
    }
    /**
     * Sets the special property value. Collection of common folders available in OneDrive. Read-only. Nullable.
     * @param value Value to set for the special property.
     */
    public void setSpecial(@jakarta.annotation.Nullable final java.util.List<DriveItem> value) {
        this.backingStore.set("special", value);
    }
    /**
     * Sets the system property value. If present, indicates that it&apos;s a system-managed drive. Read-only.
     * @param value Value to set for the system property.
     */
    public void setSystem(@jakarta.annotation.Nullable final SystemFacet value) {
        this.backingStore.set("system", value);
    }
}
