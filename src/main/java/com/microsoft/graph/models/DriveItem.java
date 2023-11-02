package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriveItem extends BaseItem implements Parsable {
    /**
     * Instantiates a new DriveItem and sets the default values.
     */
    public DriveItem() {
        super();
        this.setOdataType("#microsoft.graph.driveItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DriveItem
     */
    @jakarta.annotation.Nonnull
    public static DriveItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveItem();
    }
    /**
     * Gets the analytics property value. Analytics about the view activities that took place on this item.
     * @return a ItemAnalytics
     */
    @jakarta.annotation.Nullable
    public ItemAnalytics getAnalytics() {
        return this.getBackingStore().get("analytics");
    }
    /**
     * Gets the audio property value. Audio metadata, if the item is an audio file. Read-only. Read-only. Only on OneDrive Personal.
     * @return a Audio
     */
    @jakarta.annotation.Nullable
    public Audio getAudio() {
        return this.getBackingStore().get("audio");
    }
    /**
     * Gets the bundle property value. Bundle metadata, if the item is a bundle. Read-only.
     * @return a Bundle
     */
    @jakarta.annotation.Nullable
    public Bundle getBundle() {
        return this.getBackingStore().get("bundle");
    }
    /**
     * Gets the children property value. Collection containing Item objects for the immediate children of Item. Only items representing folders have children. Read-only. Nullable.
     * @return a java.util.List<DriveItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveItem> getChildren() {
        return this.getBackingStore().get("children");
    }
    /**
     * Gets the content property value. The content stream, if the item represents a file.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.getBackingStore().get("content");
    }
    /**
     * Gets the cTag property value. An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is not returned if the item is a folder. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCTag() {
        return this.getBackingStore().get("cTag");
    }
    /**
     * Gets the deleted property value. Information about the deleted state of the item. Read-only.
     * @return a Deleted
     */
    @jakarta.annotation.Nullable
    public Deleted getDeleted() {
        return this.getBackingStore().get("deleted");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("analytics", (n) -> { this.setAnalytics(n.getObjectValue(ItemAnalytics::createFromDiscriminatorValue)); });
        deserializerMap.put("audio", (n) -> { this.setAudio(n.getObjectValue(Audio::createFromDiscriminatorValue)); });
        deserializerMap.put("bundle", (n) -> { this.setBundle(n.getObjectValue(Bundle::createFromDiscriminatorValue)); });
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfObjectValues(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("cTag", (n) -> { this.setCTag(n.getStringValue()); });
        deserializerMap.put("deleted", (n) -> { this.setDeleted(n.getObjectValue(Deleted::createFromDiscriminatorValue)); });
        deserializerMap.put("file", (n) -> { this.setFile(n.getObjectValue(File::createFromDiscriminatorValue)); });
        deserializerMap.put("fileSystemInfo", (n) -> { this.setFileSystemInfo(n.getObjectValue(FileSystemInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("folder", (n) -> { this.setFolder(n.getObjectValue(Folder::createFromDiscriminatorValue)); });
        deserializerMap.put("image", (n) -> { this.setImage(n.getObjectValue(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("listItem", (n) -> { this.setListItem(n.getObjectValue(ListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(GeoCoordinates::createFromDiscriminatorValue)); });
        deserializerMap.put("malware", (n) -> { this.setMalware(n.getObjectValue(Malware::createFromDiscriminatorValue)); });
        deserializerMap.put("package", (n) -> { this.setPackage(n.getObjectValue(PackageEscaped::createFromDiscriminatorValue)); });
        deserializerMap.put("pendingOperations", (n) -> { this.setPendingOperations(n.getObjectValue(PendingOperations::createFromDiscriminatorValue)); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfObjectValues(Permission::createFromDiscriminatorValue)); });
        deserializerMap.put("photo", (n) -> { this.setPhoto(n.getObjectValue(Photo::createFromDiscriminatorValue)); });
        deserializerMap.put("publication", (n) -> { this.setPublication(n.getObjectValue(PublicationFacet::createFromDiscriminatorValue)); });
        deserializerMap.put("remoteItem", (n) -> { this.setRemoteItem(n.getObjectValue(RemoteItem::createFromDiscriminatorValue)); });
        deserializerMap.put("root", (n) -> { this.setRoot(n.getObjectValue(Root::createFromDiscriminatorValue)); });
        deserializerMap.put("searchResult", (n) -> { this.setSearchResult(n.getObjectValue(SearchResult::createFromDiscriminatorValue)); });
        deserializerMap.put("shared", (n) -> { this.setShared(n.getObjectValue(Shared::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepointIds", (n) -> { this.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("specialFolder", (n) -> { this.setSpecialFolder(n.getObjectValue(SpecialFolder::createFromDiscriminatorValue)); });
        deserializerMap.put("subscriptions", (n) -> { this.setSubscriptions(n.getCollectionOfObjectValues(Subscription::createFromDiscriminatorValue)); });
        deserializerMap.put("thumbnails", (n) -> { this.setThumbnails(n.getCollectionOfObjectValues(ThumbnailSet::createFromDiscriminatorValue)); });
        deserializerMap.put("versions", (n) -> { this.setVersions(n.getCollectionOfObjectValues(DriveItemVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("video", (n) -> { this.setVideo(n.getObjectValue(Video::createFromDiscriminatorValue)); });
        deserializerMap.put("webDavUrl", (n) -> { this.setWebDavUrl(n.getStringValue()); });
        deserializerMap.put("workbook", (n) -> { this.setWorkbook(n.getObjectValue(Workbook::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the file property value. File metadata, if the item is a file. Read-only.
     * @return a File
     */
    @jakarta.annotation.Nullable
    public File getFile() {
        return this.getBackingStore().get("file");
    }
    /**
     * Gets the fileSystemInfo property value. File system information on client. Read-write.
     * @return a FileSystemInfo
     */
    @jakarta.annotation.Nullable
    public FileSystemInfo getFileSystemInfo() {
        return this.getBackingStore().get("fileSystemInfo");
    }
    /**
     * Gets the folder property value. Folder metadata, if the item is a folder. Read-only.
     * @return a Folder
     */
    @jakarta.annotation.Nullable
    public Folder getFolder() {
        return this.getBackingStore().get("folder");
    }
    /**
     * Gets the image property value. Image metadata, if the item is an image. Read-only.
     * @return a Image
     */
    @jakarta.annotation.Nullable
    public Image getImage() {
        return this.getBackingStore().get("image");
    }
    /**
     * Gets the listItem property value. For drives in SharePoint, the associated document library list item. Read-only. Nullable.
     * @return a ListItem
     */
    @jakarta.annotation.Nullable
    public ListItem getListItem() {
        return this.getBackingStore().get("listItem");
    }
    /**
     * Gets the location property value. Location metadata, if the item has location data. Read-only.
     * @return a GeoCoordinates
     */
    @jakarta.annotation.Nullable
    public GeoCoordinates getLocation() {
        return this.getBackingStore().get("location");
    }
    /**
     * Gets the malware property value. Malware metadata, if the item was detected to contain malware. Read-only.
     * @return a Malware
     */
    @jakarta.annotation.Nullable
    public Malware getMalware() {
        return this.getBackingStore().get("malware");
    }
    /**
     * Gets the package property value. If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     * @return a PackageEscaped
     */
    @jakarta.annotation.Nullable
    public PackageEscaped getPackage() {
        return this.getBackingStore().get("package");
    }
    /**
     * Gets the pendingOperations property value. If present, indicates that one or more operations that might affect the state of the driveItem are pending completion. Read-only.
     * @return a PendingOperations
     */
    @jakarta.annotation.Nullable
    public PendingOperations getPendingOperations() {
        return this.getBackingStore().get("pendingOperations");
    }
    /**
     * Gets the permissions property value. The set of permissions for the item. Read-only. Nullable.
     * @return a java.util.List<Permission>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Permission> getPermissions() {
        return this.getBackingStore().get("permissions");
    }
    /**
     * Gets the photo property value. Photo metadata, if the item is a photo. Read-only.
     * @return a Photo
     */
    @jakarta.annotation.Nullable
    public Photo getPhoto() {
        return this.getBackingStore().get("photo");
    }
    /**
     * Gets the publication property value. Provides information about the published or checked-out state of an item, in locations that support such actions. This property is not returned by default. Read-only.
     * @return a PublicationFacet
     */
    @jakarta.annotation.Nullable
    public PublicationFacet getPublication() {
        return this.getBackingStore().get("publication");
    }
    /**
     * Gets the remoteItem property value. Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.
     * @return a RemoteItem
     */
    @jakarta.annotation.Nullable
    public RemoteItem getRemoteItem() {
        return this.getBackingStore().get("remoteItem");
    }
    /**
     * Gets the root property value. If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.
     * @return a Root
     */
    @jakarta.annotation.Nullable
    public Root getRoot() {
        return this.getBackingStore().get("root");
    }
    /**
     * Gets the searchResult property value. Search metadata, if the item is from a search result. Read-only.
     * @return a SearchResult
     */
    @jakarta.annotation.Nullable
    public SearchResult getSearchResult() {
        return this.getBackingStore().get("searchResult");
    }
    /**
     * Gets the shared property value. Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     * @return a Shared
     */
    @jakarta.annotation.Nullable
    public Shared getShared() {
        return this.getBackingStore().get("shared");
    }
    /**
     * Gets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @return a SharepointIds
     */
    @jakarta.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this.getBackingStore().get("sharepointIds");
    }
    /**
     * Gets the size property value. Size of the item in bytes. Read-only.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.getBackingStore().get("size");
    }
    /**
     * Gets the specialFolder property value. If the current item is also available as a special folder, this facet is returned. Read-only.
     * @return a SpecialFolder
     */
    @jakarta.annotation.Nullable
    public SpecialFolder getSpecialFolder() {
        return this.getBackingStore().get("specialFolder");
    }
    /**
     * Gets the subscriptions property value. The set of subscriptions on the item. Only supported on the root of a drive.
     * @return a java.util.List<Subscription>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Subscription> getSubscriptions() {
        return this.getBackingStore().get("subscriptions");
    }
    /**
     * Gets the thumbnails property value. Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][]. Read-only. Nullable.
     * @return a java.util.List<ThumbnailSet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ThumbnailSet> getThumbnails() {
        return this.getBackingStore().get("thumbnails");
    }
    /**
     * Gets the versions property value. The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable.
     * @return a java.util.List<DriveItemVersion>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveItemVersion> getVersions() {
        return this.getBackingStore().get("versions");
    }
    /**
     * Gets the video property value. Video metadata, if the item is a video. Read-only.
     * @return a Video
     */
    @jakarta.annotation.Nullable
    public Video getVideo() {
        return this.getBackingStore().get("video");
    }
    /**
     * Gets the webDavUrl property value. WebDAV compatible URL for the item.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebDavUrl() {
        return this.getBackingStore().get("webDavUrl");
    }
    /**
     * Gets the workbook property value. For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
     * @return a Workbook
     */
    @jakarta.annotation.Nullable
    public Workbook getWorkbook() {
        return this.getBackingStore().get("workbook");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("analytics", this.getAnalytics());
        writer.writeObjectValue("audio", this.getAudio());
        writer.writeObjectValue("bundle", this.getBundle());
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeStringValue("cTag", this.getCTag());
        writer.writeObjectValue("deleted", this.getDeleted());
        writer.writeObjectValue("file", this.getFile());
        writer.writeObjectValue("fileSystemInfo", this.getFileSystemInfo());
        writer.writeObjectValue("folder", this.getFolder());
        writer.writeObjectValue("image", this.getImage());
        writer.writeObjectValue("listItem", this.getListItem());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeObjectValue("malware", this.getMalware());
        writer.writeObjectValue("package", this.getPackage());
        writer.writeObjectValue("pendingOperations", this.getPendingOperations());
        writer.writeCollectionOfObjectValues("permissions", this.getPermissions());
        writer.writeObjectValue("photo", this.getPhoto());
        writer.writeObjectValue("publication", this.getPublication());
        writer.writeObjectValue("remoteItem", this.getRemoteItem());
        writer.writeObjectValue("root", this.getRoot());
        writer.writeObjectValue("searchResult", this.getSearchResult());
        writer.writeObjectValue("shared", this.getShared());
        writer.writeObjectValue("sharepointIds", this.getSharepointIds());
        writer.writeLongValue("size", this.getSize());
        writer.writeObjectValue("specialFolder", this.getSpecialFolder());
        writer.writeCollectionOfObjectValues("subscriptions", this.getSubscriptions());
        writer.writeCollectionOfObjectValues("thumbnails", this.getThumbnails());
        writer.writeCollectionOfObjectValues("versions", this.getVersions());
        writer.writeObjectValue("video", this.getVideo());
        writer.writeStringValue("webDavUrl", this.getWebDavUrl());
        writer.writeObjectValue("workbook", this.getWorkbook());
    }
    /**
     * Sets the analytics property value. Analytics about the view activities that took place on this item.
     * @param value Value to set for the analytics property.
     */
    public void setAnalytics(@jakarta.annotation.Nullable final ItemAnalytics value) {
        this.getBackingStore().set("analytics", value);
    }
    /**
     * Sets the audio property value. Audio metadata, if the item is an audio file. Read-only. Read-only. Only on OneDrive Personal.
     * @param value Value to set for the audio property.
     */
    public void setAudio(@jakarta.annotation.Nullable final Audio value) {
        this.getBackingStore().set("audio", value);
    }
    /**
     * Sets the bundle property value. Bundle metadata, if the item is a bundle. Read-only.
     * @param value Value to set for the bundle property.
     */
    public void setBundle(@jakarta.annotation.Nullable final Bundle value) {
        this.getBackingStore().set("bundle", value);
    }
    /**
     * Sets the children property value. Collection containing Item objects for the immediate children of Item. Only items representing folders have children. Read-only. Nullable.
     * @param value Value to set for the children property.
     */
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<DriveItem> value) {
        this.getBackingStore().set("children", value);
    }
    /**
     * Sets the content property value. The content stream, if the item represents a file.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.getBackingStore().set("content", value);
    }
    /**
     * Sets the cTag property value. An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is not returned if the item is a folder. Read-only.
     * @param value Value to set for the cTag property.
     */
    public void setCTag(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("cTag", value);
    }
    /**
     * Sets the deleted property value. Information about the deleted state of the item. Read-only.
     * @param value Value to set for the deleted property.
     */
    public void setDeleted(@jakarta.annotation.Nullable final Deleted value) {
        this.getBackingStore().set("deleted", value);
    }
    /**
     * Sets the file property value. File metadata, if the item is a file. Read-only.
     * @param value Value to set for the file property.
     */
    public void setFile(@jakarta.annotation.Nullable final File value) {
        this.getBackingStore().set("file", value);
    }
    /**
     * Sets the fileSystemInfo property value. File system information on client. Read-write.
     * @param value Value to set for the fileSystemInfo property.
     */
    public void setFileSystemInfo(@jakarta.annotation.Nullable final FileSystemInfo value) {
        this.getBackingStore().set("fileSystemInfo", value);
    }
    /**
     * Sets the folder property value. Folder metadata, if the item is a folder. Read-only.
     * @param value Value to set for the folder property.
     */
    public void setFolder(@jakarta.annotation.Nullable final Folder value) {
        this.getBackingStore().set("folder", value);
    }
    /**
     * Sets the image property value. Image metadata, if the item is an image. Read-only.
     * @param value Value to set for the image property.
     */
    public void setImage(@jakarta.annotation.Nullable final Image value) {
        this.getBackingStore().set("image", value);
    }
    /**
     * Sets the listItem property value. For drives in SharePoint, the associated document library list item. Read-only. Nullable.
     * @param value Value to set for the listItem property.
     */
    public void setListItem(@jakarta.annotation.Nullable final ListItem value) {
        this.getBackingStore().set("listItem", value);
    }
    /**
     * Sets the location property value. Location metadata, if the item has location data. Read-only.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final GeoCoordinates value) {
        this.getBackingStore().set("location", value);
    }
    /**
     * Sets the malware property value. Malware metadata, if the item was detected to contain malware. Read-only.
     * @param value Value to set for the malware property.
     */
    public void setMalware(@jakarta.annotation.Nullable final Malware value) {
        this.getBackingStore().set("malware", value);
    }
    /**
     * Sets the package property value. If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     * @param value Value to set for the package property.
     */
    public void setPackage(@jakarta.annotation.Nullable final PackageEscaped value) {
        this.getBackingStore().set("package", value);
    }
    /**
     * Sets the pendingOperations property value. If present, indicates that one or more operations that might affect the state of the driveItem are pending completion. Read-only.
     * @param value Value to set for the pendingOperations property.
     */
    public void setPendingOperations(@jakarta.annotation.Nullable final PendingOperations value) {
        this.getBackingStore().set("pendingOperations", value);
    }
    /**
     * Sets the permissions property value. The set of permissions for the item. Read-only. Nullable.
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<Permission> value) {
        this.getBackingStore().set("permissions", value);
    }
    /**
     * Sets the photo property value. Photo metadata, if the item is a photo. Read-only.
     * @param value Value to set for the photo property.
     */
    public void setPhoto(@jakarta.annotation.Nullable final Photo value) {
        this.getBackingStore().set("photo", value);
    }
    /**
     * Sets the publication property value. Provides information about the published or checked-out state of an item, in locations that support such actions. This property is not returned by default. Read-only.
     * @param value Value to set for the publication property.
     */
    public void setPublication(@jakarta.annotation.Nullable final PublicationFacet value) {
        this.getBackingStore().set("publication", value);
    }
    /**
     * Sets the remoteItem property value. Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.
     * @param value Value to set for the remoteItem property.
     */
    public void setRemoteItem(@jakarta.annotation.Nullable final RemoteItem value) {
        this.getBackingStore().set("remoteItem", value);
    }
    /**
     * Sets the root property value. If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.
     * @param value Value to set for the root property.
     */
    public void setRoot(@jakarta.annotation.Nullable final Root value) {
        this.getBackingStore().set("root", value);
    }
    /**
     * Sets the searchResult property value. Search metadata, if the item is from a search result. Read-only.
     * @param value Value to set for the searchResult property.
     */
    public void setSearchResult(@jakarta.annotation.Nullable final SearchResult value) {
        this.getBackingStore().set("searchResult", value);
    }
    /**
     * Sets the shared property value. Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     * @param value Value to set for the shared property.
     */
    public void setShared(@jakarta.annotation.Nullable final Shared value) {
        this.getBackingStore().set("shared", value);
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     */
    public void setSharepointIds(@jakarta.annotation.Nullable final SharepointIds value) {
        this.getBackingStore().set("sharepointIds", value);
    }
    /**
     * Sets the size property value. Size of the item in bytes. Read-only.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.getBackingStore().set("size", value);
    }
    /**
     * Sets the specialFolder property value. If the current item is also available as a special folder, this facet is returned. Read-only.
     * @param value Value to set for the specialFolder property.
     */
    public void setSpecialFolder(@jakarta.annotation.Nullable final SpecialFolder value) {
        this.getBackingStore().set("specialFolder", value);
    }
    /**
     * Sets the subscriptions property value. The set of subscriptions on the item. Only supported on the root of a drive.
     * @param value Value to set for the subscriptions property.
     */
    public void setSubscriptions(@jakarta.annotation.Nullable final java.util.List<Subscription> value) {
        this.getBackingStore().set("subscriptions", value);
    }
    /**
     * Sets the thumbnails property value. Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][]. Read-only. Nullable.
     * @param value Value to set for the thumbnails property.
     */
    public void setThumbnails(@jakarta.annotation.Nullable final java.util.List<ThumbnailSet> value) {
        this.getBackingStore().set("thumbnails", value);
    }
    /**
     * Sets the versions property value. The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable.
     * @param value Value to set for the versions property.
     */
    public void setVersions(@jakarta.annotation.Nullable final java.util.List<DriveItemVersion> value) {
        this.getBackingStore().set("versions", value);
    }
    /**
     * Sets the video property value. Video metadata, if the item is a video. Read-only.
     * @param value Value to set for the video property.
     */
    public void setVideo(@jakarta.annotation.Nullable final Video value) {
        this.getBackingStore().set("video", value);
    }
    /**
     * Sets the webDavUrl property value. WebDAV compatible URL for the item.
     * @param value Value to set for the webDavUrl property.
     */
    public void setWebDavUrl(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("webDavUrl", value);
    }
    /**
     * Sets the workbook property value. For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
     * @param value Value to set for the workbook property.
     */
    public void setWorkbook(@jakarta.annotation.Nullable final Workbook value) {
        this.getBackingStore().set("workbook", value);
    }
}
