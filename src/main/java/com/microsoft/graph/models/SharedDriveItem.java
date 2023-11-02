package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharedDriveItem extends BaseItem implements Parsable {
    /**
     * Instantiates a new SharedDriveItem and sets the default values.
     */
    public SharedDriveItem() {
        super();
        this.setOdataType("#microsoft.graph.sharedDriveItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharedDriveItem
     */
    @jakarta.annotation.Nonnull
    public static SharedDriveItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedDriveItem();
    }
    /**
     * Gets the driveItem property value. Used to access the underlying driveItem
     * @return a DriveItem
     */
    @jakarta.annotation.Nullable
    public DriveItem getDriveItem() {
        return this.getBackingStore().get("driveItem");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a java.util.List<DriveItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveItem> getItems() {
        return this.getBackingStore().get("items");
    }
    /**
     * Gets the list property value. Used to access the underlying list
     * @return a List
     */
    @jakarta.annotation.Nullable
    public List getList() {
        return this.getBackingStore().get("list");
    }
    /**
     * Gets the listItem property value. Used to access the underlying listItem
     * @return a ListItem
     */
    @jakarta.annotation.Nullable
    public ListItem getListItem() {
        return this.getBackingStore().get("listItem");
    }
    /**
     * Gets the owner property value. Information about the owner of the shared item being referenced.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getOwner() {
        return this.getBackingStore().get("owner");
    }
    /**
     * Gets the permission property value. Used to access the permission representing the underlying sharing link
     * @return a Permission
     */
    @jakarta.annotation.Nullable
    public Permission getPermission() {
        return this.getBackingStore().get("permission");
    }
    /**
     * Gets the root property value. Used to access the underlying driveItem. Deprecated -- use driveItem instead.
     * @return a DriveItem
     */
    @jakarta.annotation.Nullable
    public DriveItem getRoot() {
        return this.getBackingStore().get("root");
    }
    /**
     * Gets the site property value. Used to access the underlying site
     * @return a Site
     */
    @jakarta.annotation.Nullable
    public Site getSite() {
        return this.getBackingStore().get("site");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDriveItem(@jakarta.annotation.Nullable final DriveItem value) {
        this.getBackingStore().set("driveItem", value);
    }
    /**
     * Sets the items property value. All driveItems contained in the sharing root. This collection cannot be enumerated.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<DriveItem> value) {
        this.getBackingStore().set("items", value);
    }
    /**
     * Sets the list property value. Used to access the underlying list
     * @param value Value to set for the list property.
     */
    public void setList(@jakarta.annotation.Nullable final List value) {
        this.getBackingStore().set("list", value);
    }
    /**
     * Sets the listItem property value. Used to access the underlying listItem
     * @param value Value to set for the listItem property.
     */
    public void setListItem(@jakarta.annotation.Nullable final ListItem value) {
        this.getBackingStore().set("listItem", value);
    }
    /**
     * Sets the owner property value. Information about the owner of the shared item being referenced.
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final IdentitySet value) {
        this.getBackingStore().set("owner", value);
    }
    /**
     * Sets the permission property value. Used to access the permission representing the underlying sharing link
     * @param value Value to set for the permission property.
     */
    public void setPermission(@jakarta.annotation.Nullable final Permission value) {
        this.getBackingStore().set("permission", value);
    }
    /**
     * Sets the root property value. Used to access the underlying driveItem. Deprecated -- use driveItem instead.
     * @param value Value to set for the root property.
     */
    public void setRoot(@jakarta.annotation.Nullable final DriveItem value) {
        this.getBackingStore().set("root", value);
    }
    /**
     * Sets the site property value. Used to access the underlying site
     * @param value Value to set for the site property.
     */
    public void setSite(@jakarta.annotation.Nullable final Site value) {
        this.getBackingStore().set("site", value);
    }
}
