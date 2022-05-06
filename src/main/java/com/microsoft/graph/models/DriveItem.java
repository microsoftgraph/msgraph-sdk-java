package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DriveItem extends BaseItem implements Parsable {
    /** Analytics about the view activities that took place on this item.  */
    private ItemAnalytics _analytics;
    /** Audio metadata, if the item is an audio file. Read-only. Only on OneDrive Personal.  */
    private Audio _audio;
    /** Bundle metadata, if the item is a bundle. Read-only.  */
    private Bundle _bundle;
    /** Collection containing Item objects for the immediate children of Item. Only items representing folders have children. Read-only. Nullable.  */
    private java.util.List<DriveItem> _children;
    /** The content stream, if the item represents a file.  */
    private byte[] _content;
    /** An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is not returned if the item is a folder. Read-only.  */
    private String _cTag;
    /** Information about the deleted state of the item. Read-only.  */
    private Deleted _deleted;
    /** File metadata, if the item is a file. Read-only.  */
    private File _file;
    /** File system information on client. Read-write.  */
    private FileSystemInfo _fileSystemInfo;
    /** Folder metadata, if the item is a folder. Read-only.  */
    private Folder _folder;
    /** Image metadata, if the item is an image. Read-only.  */
    private Image _image;
    /** For drives in SharePoint, the associated document library list item. Read-only. Nullable.  */
    private ListItem _listItem;
    /** Location metadata, if the item has location data. Read-only.  */
    private GeoCoordinates _location;
    /** Malware metadata, if the item was detected to contain malware. Read-only.  */
    private Malware _malware;
    /** If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.  */
    private Package_escaped _package_escaped;
    /** If present, indicates that indicates that one or more operations that may affect the state of the driveItem are pending completion. Read-only.  */
    private PendingOperations _pendingOperations;
    /** The set of permissions for the item. Read-only. Nullable.  */
    private java.util.List<Permission> _permissions;
    /** Photo metadata, if the item is a photo. Read-only.  */
    private Photo _photo;
    /** Provides information about the published or checked-out state of an item, in locations that support such actions. This property is not returned by default. Read-only.  */
    private PublicationFacet _publication;
    /** Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.  */
    private RemoteItem _remoteItem;
    /** If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.  */
    private Root _root;
    /** Search metadata, if the item is from a search result. Read-only.  */
    private SearchResult _searchResult;
    /** Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.  */
    private Shared _shared;
    /** Returns identifiers useful for SharePoint REST compatibility. Read-only.  */
    private SharepointIds _sharepointIds;
    /** Size of the item in bytes. Read-only.  */
    private Long _size;
    /** If the current item is also available as a special folder, this facet is returned. Read-only.  */
    private SpecialFolder _specialFolder;
    /** The set of subscriptions on the item. Only supported on the root of a drive.  */
    private java.util.List<Subscription> _subscriptions;
    /** Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][]. Read-only. Nullable.  */
    private java.util.List<ThumbnailSet> _thumbnails;
    /** The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable.  */
    private java.util.List<DriveItemVersion> _versions;
    /** Video metadata, if the item is a video. Read-only.  */
    private Video _video;
    /** WebDAV compatible URL for the item.  */
    private String _webDavUrl;
    /** For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.  */
    private Workbook _workbook;
    /**
     * Instantiates a new driveItem and sets the default values.
     * @return a void
     */
    public DriveItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a driveItem
     */
    @javax.annotation.Nonnull
    public static DriveItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveItem();
    }
    /**
     * Gets the analytics property value. Analytics about the view activities that took place on this item.
     * @return a itemAnalytics
     */
    @javax.annotation.Nullable
    public ItemAnalytics getAnalytics() {
        return this._analytics;
    }
    /**
     * Gets the audio property value. Audio metadata, if the item is an audio file. Read-only. Only on OneDrive Personal.
     * @return a audio
     */
    @javax.annotation.Nullable
    public Audio getAudio() {
        return this._audio;
    }
    /**
     * Gets the bundle property value. Bundle metadata, if the item is a bundle. Read-only.
     * @return a bundle
     */
    @javax.annotation.Nullable
    public Bundle getBundle() {
        return this._bundle;
    }
    /**
     * Gets the children property value. Collection containing Item objects for the immediate children of Item. Only items representing folders have children. Read-only. Nullable.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public java.util.List<DriveItem> getChildren() {
        return this._children;
    }
    /**
     * Gets the content property value. The content stream, if the item represents a file.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this._content;
    }
    /**
     * Gets the cTag property value. An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is not returned if the item is a folder. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCTag() {
        return this._cTag;
    }
    /**
     * Gets the deleted property value. Information about the deleted state of the item. Read-only.
     * @return a deleted
     */
    @javax.annotation.Nullable
    public Deleted getDeleted() {
        return this._deleted;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DriveItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("analytics", (n) -> { currentObject.setAnalytics(n.getObjectValue(ItemAnalytics::createFromDiscriminatorValue)); });
            this.put("audio", (n) -> { currentObject.setAudio(n.getObjectValue(Audio::createFromDiscriminatorValue)); });
            this.put("bundle", (n) -> { currentObject.setBundle(n.getObjectValue(Bundle::createFromDiscriminatorValue)); });
            this.put("children", (n) -> { currentObject.setChildren(n.getCollectionOfObjectValues(DriveItem::createFromDiscriminatorValue)); });
            this.put("content", (n) -> { currentObject.setContent(n.getByteArrayValue()); });
            this.put("cTag", (n) -> { currentObject.setCTag(n.getStringValue()); });
            this.put("deleted", (n) -> { currentObject.setDeleted(n.getObjectValue(Deleted::createFromDiscriminatorValue)); });
            this.put("file", (n) -> { currentObject.setFile(n.getObjectValue(File::createFromDiscriminatorValue)); });
            this.put("fileSystemInfo", (n) -> { currentObject.setFileSystemInfo(n.getObjectValue(FileSystemInfo::createFromDiscriminatorValue)); });
            this.put("folder", (n) -> { currentObject.setFolder(n.getObjectValue(Folder::createFromDiscriminatorValue)); });
            this.put("image", (n) -> { currentObject.setImage(n.getObjectValue(Image::createFromDiscriminatorValue)); });
            this.put("listItem", (n) -> { currentObject.setListItem(n.getObjectValue(ListItem::createFromDiscriminatorValue)); });
            this.put("location", (n) -> { currentObject.setLocation(n.getObjectValue(GeoCoordinates::createFromDiscriminatorValue)); });
            this.put("malware", (n) -> { currentObject.setMalware(n.getObjectValue(Malware::createFromDiscriminatorValue)); });
            this.put("package", (n) -> { currentObject.setPackage(n.getObjectValue(Package_escaped::createFromDiscriminatorValue)); });
            this.put("pendingOperations", (n) -> { currentObject.setPendingOperations(n.getObjectValue(PendingOperations::createFromDiscriminatorValue)); });
            this.put("permissions", (n) -> { currentObject.setPermissions(n.getCollectionOfObjectValues(Permission::createFromDiscriminatorValue)); });
            this.put("photo", (n) -> { currentObject.setPhoto(n.getObjectValue(Photo::createFromDiscriminatorValue)); });
            this.put("publication", (n) -> { currentObject.setPublication(n.getObjectValue(PublicationFacet::createFromDiscriminatorValue)); });
            this.put("remoteItem", (n) -> { currentObject.setRemoteItem(n.getObjectValue(RemoteItem::createFromDiscriminatorValue)); });
            this.put("root", (n) -> { currentObject.setRoot(n.getObjectValue(Root::createFromDiscriminatorValue)); });
            this.put("searchResult", (n) -> { currentObject.setSearchResult(n.getObjectValue(SearchResult::createFromDiscriminatorValue)); });
            this.put("shared", (n) -> { currentObject.setShared(n.getObjectValue(Shared::createFromDiscriminatorValue)); });
            this.put("sharepointIds", (n) -> { currentObject.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
            this.put("size", (n) -> { currentObject.setSize(n.getLongValue()); });
            this.put("specialFolder", (n) -> { currentObject.setSpecialFolder(n.getObjectValue(SpecialFolder::createFromDiscriminatorValue)); });
            this.put("subscriptions", (n) -> { currentObject.setSubscriptions(n.getCollectionOfObjectValues(Subscription::createFromDiscriminatorValue)); });
            this.put("thumbnails", (n) -> { currentObject.setThumbnails(n.getCollectionOfObjectValues(ThumbnailSet::createFromDiscriminatorValue)); });
            this.put("versions", (n) -> { currentObject.setVersions(n.getCollectionOfObjectValues(DriveItemVersion::createFromDiscriminatorValue)); });
            this.put("video", (n) -> { currentObject.setVideo(n.getObjectValue(Video::createFromDiscriminatorValue)); });
            this.put("webDavUrl", (n) -> { currentObject.setWebDavUrl(n.getStringValue()); });
            this.put("workbook", (n) -> { currentObject.setWorkbook(n.getObjectValue(Workbook::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the file property value. File metadata, if the item is a file. Read-only.
     * @return a file
     */
    @javax.annotation.Nullable
    public File getFile() {
        return this._file;
    }
    /**
     * Gets the fileSystemInfo property value. File system information on client. Read-write.
     * @return a fileSystemInfo
     */
    @javax.annotation.Nullable
    public FileSystemInfo getFileSystemInfo() {
        return this._fileSystemInfo;
    }
    /**
     * Gets the folder property value. Folder metadata, if the item is a folder. Read-only.
     * @return a folder
     */
    @javax.annotation.Nullable
    public Folder getFolder() {
        return this._folder;
    }
    /**
     * Gets the image property value. Image metadata, if the item is an image. Read-only.
     * @return a image
     */
    @javax.annotation.Nullable
    public Image getImage() {
        return this._image;
    }
    /**
     * Gets the listItem property value. For drives in SharePoint, the associated document library list item. Read-only. Nullable.
     * @return a listItem
     */
    @javax.annotation.Nullable
    public ListItem getListItem() {
        return this._listItem;
    }
    /**
     * Gets the location property value. Location metadata, if the item has location data. Read-only.
     * @return a geoCoordinates
     */
    @javax.annotation.Nullable
    public GeoCoordinates getLocation() {
        return this._location;
    }
    /**
     * Gets the malware property value. Malware metadata, if the item was detected to contain malware. Read-only.
     * @return a malware
     */
    @javax.annotation.Nullable
    public Malware getMalware() {
        return this._malware;
    }
    /**
     * Gets the package property value. If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     * @return a package_escaped
     */
    @javax.annotation.Nullable
    public Package_escaped getPackage() {
        return this._package_escaped;
    }
    /**
     * Gets the pendingOperations property value. If present, indicates that indicates that one or more operations that may affect the state of the driveItem are pending completion. Read-only.
     * @return a pendingOperations
     */
    @javax.annotation.Nullable
    public PendingOperations getPendingOperations() {
        return this._pendingOperations;
    }
    /**
     * Gets the permissions property value. The set of permissions for the item. Read-only. Nullable.
     * @return a permission
     */
    @javax.annotation.Nullable
    public java.util.List<Permission> getPermissions() {
        return this._permissions;
    }
    /**
     * Gets the photo property value. Photo metadata, if the item is a photo. Read-only.
     * @return a photo
     */
    @javax.annotation.Nullable
    public Photo getPhoto() {
        return this._photo;
    }
    /**
     * Gets the publication property value. Provides information about the published or checked-out state of an item, in locations that support such actions. This property is not returned by default. Read-only.
     * @return a publicationFacet
     */
    @javax.annotation.Nullable
    public PublicationFacet getPublication() {
        return this._publication;
    }
    /**
     * Gets the remoteItem property value. Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.
     * @return a remoteItem
     */
    @javax.annotation.Nullable
    public RemoteItem getRemoteItem() {
        return this._remoteItem;
    }
    /**
     * Gets the root property value. If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.
     * @return a root
     */
    @javax.annotation.Nullable
    public Root getRoot() {
        return this._root;
    }
    /**
     * Gets the searchResult property value. Search metadata, if the item is from a search result. Read-only.
     * @return a searchResult
     */
    @javax.annotation.Nullable
    public SearchResult getSearchResult() {
        return this._searchResult;
    }
    /**
     * Gets the shared property value. Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     * @return a shared
     */
    @javax.annotation.Nullable
    public Shared getShared() {
        return this._shared;
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
     * Gets the size property value. Size of the item in bytes. Read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSize() {
        return this._size;
    }
    /**
     * Gets the specialFolder property value. If the current item is also available as a special folder, this facet is returned. Read-only.
     * @return a specialFolder
     */
    @javax.annotation.Nullable
    public SpecialFolder getSpecialFolder() {
        return this._specialFolder;
    }
    /**
     * Gets the subscriptions property value. The set of subscriptions on the item. Only supported on the root of a drive.
     * @return a subscription
     */
    @javax.annotation.Nullable
    public java.util.List<Subscription> getSubscriptions() {
        return this._subscriptions;
    }
    /**
     * Gets the thumbnails property value. Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][]. Read-only. Nullable.
     * @return a thumbnailSet
     */
    @javax.annotation.Nullable
    public java.util.List<ThumbnailSet> getThumbnails() {
        return this._thumbnails;
    }
    /**
     * Gets the versions property value. The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable.
     * @return a driveItemVersion
     */
    @javax.annotation.Nullable
    public java.util.List<DriveItemVersion> getVersions() {
        return this._versions;
    }
    /**
     * Gets the video property value. Video metadata, if the item is a video. Read-only.
     * @return a video
     */
    @javax.annotation.Nullable
    public Video getVideo() {
        return this._video;
    }
    /**
     * Gets the webDavUrl property value. WebDAV compatible URL for the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebDavUrl() {
        return this._webDavUrl;
    }
    /**
     * Gets the workbook property value. For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
     * @return a workbook
     */
    @javax.annotation.Nullable
    public Workbook getWorkbook() {
        return this._workbook;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAnalytics(@javax.annotation.Nullable final ItemAnalytics value) {
        this._analytics = value;
    }
    /**
     * Sets the audio property value. Audio metadata, if the item is an audio file. Read-only. Only on OneDrive Personal.
     * @param value Value to set for the audio property.
     * @return a void
     */
    public void setAudio(@javax.annotation.Nullable final Audio value) {
        this._audio = value;
    }
    /**
     * Sets the bundle property value. Bundle metadata, if the item is a bundle. Read-only.
     * @param value Value to set for the bundle property.
     * @return a void
     */
    public void setBundle(@javax.annotation.Nullable final Bundle value) {
        this._bundle = value;
    }
    /**
     * Sets the children property value. Collection containing Item objects for the immediate children of Item. Only items representing folders have children. Read-only. Nullable.
     * @param value Value to set for the children property.
     * @return a void
     */
    public void setChildren(@javax.annotation.Nullable final java.util.List<DriveItem> value) {
        this._children = value;
    }
    /**
     * Sets the content property value. The content stream, if the item represents a file.
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this._content = value;
    }
    /**
     * Sets the cTag property value. An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is not returned if the item is a folder. Read-only.
     * @param value Value to set for the cTag property.
     * @return a void
     */
    public void setCTag(@javax.annotation.Nullable final String value) {
        this._cTag = value;
    }
    /**
     * Sets the deleted property value. Information about the deleted state of the item. Read-only.
     * @param value Value to set for the deleted property.
     * @return a void
     */
    public void setDeleted(@javax.annotation.Nullable final Deleted value) {
        this._deleted = value;
    }
    /**
     * Sets the file property value. File metadata, if the item is a file. Read-only.
     * @param value Value to set for the file property.
     * @return a void
     */
    public void setFile(@javax.annotation.Nullable final File value) {
        this._file = value;
    }
    /**
     * Sets the fileSystemInfo property value. File system information on client. Read-write.
     * @param value Value to set for the fileSystemInfo property.
     * @return a void
     */
    public void setFileSystemInfo(@javax.annotation.Nullable final FileSystemInfo value) {
        this._fileSystemInfo = value;
    }
    /**
     * Sets the folder property value. Folder metadata, if the item is a folder. Read-only.
     * @param value Value to set for the folder property.
     * @return a void
     */
    public void setFolder(@javax.annotation.Nullable final Folder value) {
        this._folder = value;
    }
    /**
     * Sets the image property value. Image metadata, if the item is an image. Read-only.
     * @param value Value to set for the image property.
     * @return a void
     */
    public void setImage(@javax.annotation.Nullable final Image value) {
        this._image = value;
    }
    /**
     * Sets the listItem property value. For drives in SharePoint, the associated document library list item. Read-only. Nullable.
     * @param value Value to set for the listItem property.
     * @return a void
     */
    public void setListItem(@javax.annotation.Nullable final ListItem value) {
        this._listItem = value;
    }
    /**
     * Sets the location property value. Location metadata, if the item has location data. Read-only.
     * @param value Value to set for the location property.
     * @return a void
     */
    public void setLocation(@javax.annotation.Nullable final GeoCoordinates value) {
        this._location = value;
    }
    /**
     * Sets the malware property value. Malware metadata, if the item was detected to contain malware. Read-only.
     * @param value Value to set for the malware property.
     * @return a void
     */
    public void setMalware(@javax.annotation.Nullable final Malware value) {
        this._malware = value;
    }
    /**
     * Sets the package property value. If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only.
     * @param value Value to set for the package property.
     * @return a void
     */
    public void setPackage(@javax.annotation.Nullable final Package_escaped value) {
        this._package_escaped = value;
    }
    /**
     * Sets the pendingOperations property value. If present, indicates that indicates that one or more operations that may affect the state of the driveItem are pending completion. Read-only.
     * @param value Value to set for the pendingOperations property.
     * @return a void
     */
    public void setPendingOperations(@javax.annotation.Nullable final PendingOperations value) {
        this._pendingOperations = value;
    }
    /**
     * Sets the permissions property value. The set of permissions for the item. Read-only. Nullable.
     * @param value Value to set for the permissions property.
     * @return a void
     */
    public void setPermissions(@javax.annotation.Nullable final java.util.List<Permission> value) {
        this._permissions = value;
    }
    /**
     * Sets the photo property value. Photo metadata, if the item is a photo. Read-only.
     * @param value Value to set for the photo property.
     * @return a void
     */
    public void setPhoto(@javax.annotation.Nullable final Photo value) {
        this._photo = value;
    }
    /**
     * Sets the publication property value. Provides information about the published or checked-out state of an item, in locations that support such actions. This property is not returned by default. Read-only.
     * @param value Value to set for the publication property.
     * @return a void
     */
    public void setPublication(@javax.annotation.Nullable final PublicationFacet value) {
        this._publication = value;
    }
    /**
     * Sets the remoteItem property value. Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.
     * @param value Value to set for the remoteItem property.
     * @return a void
     */
    public void setRemoteItem(@javax.annotation.Nullable final RemoteItem value) {
        this._remoteItem = value;
    }
    /**
     * Sets the root property value. If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.
     * @param value Value to set for the root property.
     * @return a void
     */
    public void setRoot(@javax.annotation.Nullable final Root value) {
        this._root = value;
    }
    /**
     * Sets the searchResult property value. Search metadata, if the item is from a search result. Read-only.
     * @param value Value to set for the searchResult property.
     * @return a void
     */
    public void setSearchResult(@javax.annotation.Nullable final SearchResult value) {
        this._searchResult = value;
    }
    /**
     * Sets the shared property value. Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only.
     * @param value Value to set for the shared property.
     * @return a void
     */
    public void setShared(@javax.annotation.Nullable final Shared value) {
        this._shared = value;
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     * @return a void
     */
    public void setSharepointIds(@javax.annotation.Nullable final SharepointIds value) {
        this._sharepointIds = value;
    }
    /**
     * Sets the size property value. Size of the item in bytes. Read-only.
     * @param value Value to set for the size property.
     * @return a void
     */
    public void setSize(@javax.annotation.Nullable final Long value) {
        this._size = value;
    }
    /**
     * Sets the specialFolder property value. If the current item is also available as a special folder, this facet is returned. Read-only.
     * @param value Value to set for the specialFolder property.
     * @return a void
     */
    public void setSpecialFolder(@javax.annotation.Nullable final SpecialFolder value) {
        this._specialFolder = value;
    }
    /**
     * Sets the subscriptions property value. The set of subscriptions on the item. Only supported on the root of a drive.
     * @param value Value to set for the subscriptions property.
     * @return a void
     */
    public void setSubscriptions(@javax.annotation.Nullable final java.util.List<Subscription> value) {
        this._subscriptions = value;
    }
    /**
     * Sets the thumbnails property value. Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][]. Read-only. Nullable.
     * @param value Value to set for the thumbnails property.
     * @return a void
     */
    public void setThumbnails(@javax.annotation.Nullable final java.util.List<ThumbnailSet> value) {
        this._thumbnails = value;
    }
    /**
     * Sets the versions property value. The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable.
     * @param value Value to set for the versions property.
     * @return a void
     */
    public void setVersions(@javax.annotation.Nullable final java.util.List<DriveItemVersion> value) {
        this._versions = value;
    }
    /**
     * Sets the video property value. Video metadata, if the item is a video. Read-only.
     * @param value Value to set for the video property.
     * @return a void
     */
    public void setVideo(@javax.annotation.Nullable final Video value) {
        this._video = value;
    }
    /**
     * Sets the webDavUrl property value. WebDAV compatible URL for the item.
     * @param value Value to set for the webDavUrl property.
     * @return a void
     */
    public void setWebDavUrl(@javax.annotation.Nullable final String value) {
        this._webDavUrl = value;
    }
    /**
     * Sets the workbook property value. For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
     * @param value Value to set for the workbook property.
     * @return a void
     */
    public void setWorkbook(@javax.annotation.Nullable final Workbook value) {
        this._workbook = value;
    }
}
