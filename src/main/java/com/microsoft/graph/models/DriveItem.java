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
     * Analytics about the view activities that took place on this item.
     */
    private ItemAnalytics analytics;
    /**
     * Audio metadata, if the item is an audio file. Read-only. Read-only. Only on OneDrive Personal.
     */
    private Audio audio;
    /**
     * Bundle metadata, if the item is a bundle. Read-only.
     */
    private Bundle bundle;
    /**
     * Collection containing Item objects for the immediate children of Item. Only items representing folders have children. Read-only. Nullable.
     */
    private java.util.List<DriveItem> children;
    /**
     * The content stream, if the item represents a file.
     */
    private byte[] content;
    /**
     * An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is not returned if the item is a folder. Read-only.
     */
    private String cTag;
    /**
     * Information about the deleted state of the item. Read-only.
     */
    private Deleted deleted;
    /**
     * File metadata, if the item is a file. Read-only.
     */
    private File file;
    /**
     * File system information on client. Read-write.
     */
    private FileSystemInfo fileSystemInfo;
    /**
     * Folder metadata, if the item is a folder. Read-only.
     */
    private Folder folder;
    /**
     * Image metadata, if the item is an image. Read-only.
     */
    private Image image;
    /**
     * For drives in SharePoint, the associated document library list item. Read-only. Nullable.
     */
    private ListItem listItem;
    /**
     * Location metadata, if the item has location data. Read-only.
     */
    private GeoCoordinates location;
    /**
     * Malware metadata, if the item was detected to contain malware. Read-only.
     */
    private Malware malware;
    /**
     * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     */
    private PackageEscaped packageEscaped;
    /**
     * If present, indicates that one or more operations that might affect the state of the driveItem are pending completion. Read-only.
     */
    private PendingOperations pendingOperations;
    /**
     * The set of permissions for the item. Read-only. Nullable.
     */
    private java.util.List<Permission> permissions;
    /**
     * Photo metadata, if the item is a photo. Read-only.
     */
    private Photo photo;
    /**
     * Provides information about the published or checked-out state of an item, in locations that support such actions. This property is not returned by default. Read-only.
     */
    private PublicationFacet publication;
    /**
     * Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.
     */
    private RemoteItem remoteItem;
    /**
     * If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.
     */
    private Root root;
    /**
     * Search metadata, if the item is from a search result. Read-only.
     */
    private SearchResult searchResult;
    /**
     * Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     */
    private Shared shared;
    /**
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    private SharepointIds sharepointIds;
    /**
     * Size of the item in bytes. Read-only.
     */
    private Long size;
    /**
     * If the current item is also available as a special folder, this facet is returned. Read-only.
     */
    private SpecialFolder specialFolder;
    /**
     * The set of subscriptions on the item. Only supported on the root of a drive.
     */
    private java.util.List<Subscription> subscriptions;
    /**
     * Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][]. Read-only. Nullable.
     */
    private java.util.List<ThumbnailSet> thumbnails;
    /**
     * The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable.
     */
    private java.util.List<DriveItemVersion> versions;
    /**
     * Video metadata, if the item is a video. Read-only.
     */
    private Video video;
    /**
     * WebDAV compatible URL for the item.
     */
    private String webDavUrl;
    /**
     * For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
     */
    private Workbook workbook;
    /**
     * Instantiates a new driveItem and sets the default values.
     */
    public DriveItem() {
        super();
        this.setOdataType("#microsoft.graph.driveItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a driveItem
     */
    @jakarta.annotation.Nonnull
    public static DriveItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveItem();
    }
    /**
     * Gets the analytics property value. Analytics about the view activities that took place on this item.
     * @return a itemAnalytics
     */
    @jakarta.annotation.Nullable
    public ItemAnalytics getAnalytics() {
        return this.analytics;
    }
    /**
     * Gets the audio property value. Audio metadata, if the item is an audio file. Read-only. Read-only. Only on OneDrive Personal.
     * @return a audio
     */
    @jakarta.annotation.Nullable
    public Audio getAudio() {
        return this.audio;
    }
    /**
     * Gets the bundle property value. Bundle metadata, if the item is a bundle. Read-only.
     * @return a bundle
     */
    @jakarta.annotation.Nullable
    public Bundle getBundle() {
        return this.bundle;
    }
    /**
     * Gets the children property value. Collection containing Item objects for the immediate children of Item. Only items representing folders have children. Read-only. Nullable.
     * @return a driveItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveItem> getChildren() {
        return this.children;
    }
    /**
     * Gets the content property value. The content stream, if the item represents a file.
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * Gets the cTag property value. An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is not returned if the item is a folder. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCTag() {
        return this.cTag;
    }
    /**
     * Gets the deleted property value. Information about the deleted state of the item. Read-only.
     * @return a deleted
     */
    @jakarta.annotation.Nullable
    public Deleted getDeleted() {
        return this.deleted;
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
     * @return a file
     */
    @jakarta.annotation.Nullable
    public File getFile() {
        return this.file;
    }
    /**
     * Gets the fileSystemInfo property value. File system information on client. Read-write.
     * @return a fileSystemInfo
     */
    @jakarta.annotation.Nullable
    public FileSystemInfo getFileSystemInfo() {
        return this.fileSystemInfo;
    }
    /**
     * Gets the folder property value. Folder metadata, if the item is a folder. Read-only.
     * @return a folder
     */
    @jakarta.annotation.Nullable
    public Folder getFolder() {
        return this.folder;
    }
    /**
     * Gets the image property value. Image metadata, if the item is an image. Read-only.
     * @return a image
     */
    @jakarta.annotation.Nullable
    public Image getImage() {
        return this.image;
    }
    /**
     * Gets the listItem property value. For drives in SharePoint, the associated document library list item. Read-only. Nullable.
     * @return a listItem
     */
    @jakarta.annotation.Nullable
    public ListItem getListItem() {
        return this.listItem;
    }
    /**
     * Gets the location property value. Location metadata, if the item has location data. Read-only.
     * @return a geoCoordinates
     */
    @jakarta.annotation.Nullable
    public GeoCoordinates getLocation() {
        return this.location;
    }
    /**
     * Gets the malware property value. Malware metadata, if the item was detected to contain malware. Read-only.
     * @return a malware
     */
    @jakarta.annotation.Nullable
    public Malware getMalware() {
        return this.malware;
    }
    /**
     * Gets the package property value. If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     * @return a packageEscaped
     */
    @jakarta.annotation.Nullable
    public PackageEscaped getPackage() {
        return this.packageEscaped;
    }
    /**
     * Gets the pendingOperations property value. If present, indicates that one or more operations that might affect the state of the driveItem are pending completion. Read-only.
     * @return a pendingOperations
     */
    @jakarta.annotation.Nullable
    public PendingOperations getPendingOperations() {
        return this.pendingOperations;
    }
    /**
     * Gets the permissions property value. The set of permissions for the item. Read-only. Nullable.
     * @return a permission
     */
    @jakarta.annotation.Nullable
    public java.util.List<Permission> getPermissions() {
        return this.permissions;
    }
    /**
     * Gets the photo property value. Photo metadata, if the item is a photo. Read-only.
     * @return a photo
     */
    @jakarta.annotation.Nullable
    public Photo getPhoto() {
        return this.photo;
    }
    /**
     * Gets the publication property value. Provides information about the published or checked-out state of an item, in locations that support such actions. This property is not returned by default. Read-only.
     * @return a publicationFacet
     */
    @jakarta.annotation.Nullable
    public PublicationFacet getPublication() {
        return this.publication;
    }
    /**
     * Gets the remoteItem property value. Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.
     * @return a remoteItem
     */
    @jakarta.annotation.Nullable
    public RemoteItem getRemoteItem() {
        return this.remoteItem;
    }
    /**
     * Gets the root property value. If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.
     * @return a root
     */
    @jakarta.annotation.Nullable
    public Root getRoot() {
        return this.root;
    }
    /**
     * Gets the searchResult property value. Search metadata, if the item is from a search result. Read-only.
     * @return a searchResult
     */
    @jakarta.annotation.Nullable
    public SearchResult getSearchResult() {
        return this.searchResult;
    }
    /**
     * Gets the shared property value. Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     * @return a shared
     */
    @jakarta.annotation.Nullable
    public Shared getShared() {
        return this.shared;
    }
    /**
     * Gets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @return a sharepointIds
     */
    @jakarta.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this.sharepointIds;
    }
    /**
     * Gets the size property value. Size of the item in bytes. Read-only.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the specialFolder property value. If the current item is also available as a special folder, this facet is returned. Read-only.
     * @return a specialFolder
     */
    @jakarta.annotation.Nullable
    public SpecialFolder getSpecialFolder() {
        return this.specialFolder;
    }
    /**
     * Gets the subscriptions property value. The set of subscriptions on the item. Only supported on the root of a drive.
     * @return a subscription
     */
    @jakarta.annotation.Nullable
    public java.util.List<Subscription> getSubscriptions() {
        return this.subscriptions;
    }
    /**
     * Gets the thumbnails property value. Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][]. Read-only. Nullable.
     * @return a thumbnailSet
     */
    @jakarta.annotation.Nullable
    public java.util.List<ThumbnailSet> getThumbnails() {
        return this.thumbnails;
    }
    /**
     * Gets the versions property value. The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable.
     * @return a driveItemVersion
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveItemVersion> getVersions() {
        return this.versions;
    }
    /**
     * Gets the video property value. Video metadata, if the item is a video. Read-only.
     * @return a video
     */
    @jakarta.annotation.Nullable
    public Video getVideo() {
        return this.video;
    }
    /**
     * Gets the webDavUrl property value. WebDAV compatible URL for the item.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWebDavUrl() {
        return this.webDavUrl;
    }
    /**
     * Gets the workbook property value. For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
     * @return a workbook
     */
    @jakarta.annotation.Nullable
    public Workbook getWorkbook() {
        return this.workbook;
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
        this.analytics = value;
    }
    /**
     * Sets the audio property value. Audio metadata, if the item is an audio file. Read-only. Read-only. Only on OneDrive Personal.
     * @param value Value to set for the audio property.
     */
    public void setAudio(@jakarta.annotation.Nullable final Audio value) {
        this.audio = value;
    }
    /**
     * Sets the bundle property value. Bundle metadata, if the item is a bundle. Read-only.
     * @param value Value to set for the bundle property.
     */
    public void setBundle(@jakarta.annotation.Nullable final Bundle value) {
        this.bundle = value;
    }
    /**
     * Sets the children property value. Collection containing Item objects for the immediate children of Item. Only items representing folders have children. Read-only. Nullable.
     * @param value Value to set for the children property.
     */
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<DriveItem> value) {
        this.children = value;
    }
    /**
     * Sets the content property value. The content stream, if the item represents a file.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the cTag property value. An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is not returned if the item is a folder. Read-only.
     * @param value Value to set for the cTag property.
     */
    public void setCTag(@jakarta.annotation.Nullable final String value) {
        this.cTag = value;
    }
    /**
     * Sets the deleted property value. Information about the deleted state of the item. Read-only.
     * @param value Value to set for the deleted property.
     */
    public void setDeleted(@jakarta.annotation.Nullable final Deleted value) {
        this.deleted = value;
    }
    /**
     * Sets the file property value. File metadata, if the item is a file. Read-only.
     * @param value Value to set for the file property.
     */
    public void setFile(@jakarta.annotation.Nullable final File value) {
        this.file = value;
    }
    /**
     * Sets the fileSystemInfo property value. File system information on client. Read-write.
     * @param value Value to set for the fileSystemInfo property.
     */
    public void setFileSystemInfo(@jakarta.annotation.Nullable final FileSystemInfo value) {
        this.fileSystemInfo = value;
    }
    /**
     * Sets the folder property value. Folder metadata, if the item is a folder. Read-only.
     * @param value Value to set for the folder property.
     */
    public void setFolder(@jakarta.annotation.Nullable final Folder value) {
        this.folder = value;
    }
    /**
     * Sets the image property value. Image metadata, if the item is an image. Read-only.
     * @param value Value to set for the image property.
     */
    public void setImage(@jakarta.annotation.Nullable final Image value) {
        this.image = value;
    }
    /**
     * Sets the listItem property value. For drives in SharePoint, the associated document library list item. Read-only. Nullable.
     * @param value Value to set for the listItem property.
     */
    public void setListItem(@jakarta.annotation.Nullable final ListItem value) {
        this.listItem = value;
    }
    /**
     * Sets the location property value. Location metadata, if the item has location data. Read-only.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final GeoCoordinates value) {
        this.location = value;
    }
    /**
     * Sets the malware property value. Malware metadata, if the item was detected to contain malware. Read-only.
     * @param value Value to set for the malware property.
     */
    public void setMalware(@jakarta.annotation.Nullable final Malware value) {
        this.malware = value;
    }
    /**
     * Sets the package property value. If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     * @param value Value to set for the package property.
     */
    public void setPackage(@jakarta.annotation.Nullable final PackageEscaped value) {
        this.packageEscaped = value;
    }
    /**
     * Sets the pendingOperations property value. If present, indicates that one or more operations that might affect the state of the driveItem are pending completion. Read-only.
     * @param value Value to set for the pendingOperations property.
     */
    public void setPendingOperations(@jakarta.annotation.Nullable final PendingOperations value) {
        this.pendingOperations = value;
    }
    /**
     * Sets the permissions property value. The set of permissions for the item. Read-only. Nullable.
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<Permission> value) {
        this.permissions = value;
    }
    /**
     * Sets the photo property value. Photo metadata, if the item is a photo. Read-only.
     * @param value Value to set for the photo property.
     */
    public void setPhoto(@jakarta.annotation.Nullable final Photo value) {
        this.photo = value;
    }
    /**
     * Sets the publication property value. Provides information about the published or checked-out state of an item, in locations that support such actions. This property is not returned by default. Read-only.
     * @param value Value to set for the publication property.
     */
    public void setPublication(@jakarta.annotation.Nullable final PublicationFacet value) {
        this.publication = value;
    }
    /**
     * Sets the remoteItem property value. Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.
     * @param value Value to set for the remoteItem property.
     */
    public void setRemoteItem(@jakarta.annotation.Nullable final RemoteItem value) {
        this.remoteItem = value;
    }
    /**
     * Sets the root property value. If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.
     * @param value Value to set for the root property.
     */
    public void setRoot(@jakarta.annotation.Nullable final Root value) {
        this.root = value;
    }
    /**
     * Sets the searchResult property value. Search metadata, if the item is from a search result. Read-only.
     * @param value Value to set for the searchResult property.
     */
    public void setSearchResult(@jakarta.annotation.Nullable final SearchResult value) {
        this.searchResult = value;
    }
    /**
     * Sets the shared property value. Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     * @param value Value to set for the shared property.
     */
    public void setShared(@jakarta.annotation.Nullable final Shared value) {
        this.shared = value;
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     */
    public void setSharepointIds(@jakarta.annotation.Nullable final SharepointIds value) {
        this.sharepointIds = value;
    }
    /**
     * Sets the size property value. Size of the item in bytes. Read-only.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the specialFolder property value. If the current item is also available as a special folder, this facet is returned. Read-only.
     * @param value Value to set for the specialFolder property.
     */
    public void setSpecialFolder(@jakarta.annotation.Nullable final SpecialFolder value) {
        this.specialFolder = value;
    }
    /**
     * Sets the subscriptions property value. The set of subscriptions on the item. Only supported on the root of a drive.
     * @param value Value to set for the subscriptions property.
     */
    public void setSubscriptions(@jakarta.annotation.Nullable final java.util.List<Subscription> value) {
        this.subscriptions = value;
    }
    /**
     * Sets the thumbnails property value. Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][]. Read-only. Nullable.
     * @param value Value to set for the thumbnails property.
     */
    public void setThumbnails(@jakarta.annotation.Nullable final java.util.List<ThumbnailSet> value) {
        this.thumbnails = value;
    }
    /**
     * Sets the versions property value. The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable.
     * @param value Value to set for the versions property.
     */
    public void setVersions(@jakarta.annotation.Nullable final java.util.List<DriveItemVersion> value) {
        this.versions = value;
    }
    /**
     * Sets the video property value. Video metadata, if the item is a video. Read-only.
     * @param value Value to set for the video property.
     */
    public void setVideo(@jakarta.annotation.Nullable final Video value) {
        this.video = value;
    }
    /**
     * Sets the webDavUrl property value. WebDAV compatible URL for the item.
     * @param value Value to set for the webDavUrl property.
     */
    public void setWebDavUrl(@jakarta.annotation.Nullable final String value) {
        this.webDavUrl = value;
    }
    /**
     * Sets the workbook property value. For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
     * @param value Value to set for the workbook property.
     */
    public void setWorkbook(@jakarta.annotation.Nullable final Workbook value) {
        this.workbook = value;
    }
}
