package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RemoteItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Identity of the user, device, and application which created the item. Read-only. */
    private IdentitySet _createdBy;
    /** Date and time of item creation. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** Indicates that the remote item is a file. Read-only. */
    private File _file;
    /** Information about the remote item from the local file system. Read-only. */
    private FileSystemInfo _fileSystemInfo;
    /** Indicates that the remote item is a folder. Read-only. */
    private Folder _folder;
    /** Unique identifier for the remote item in its drive. Read-only. */
    private String _id;
    /** Image metadata, if the item is an image. Read-only. */
    private Image _image;
    /** Identity of the user, device, and application which last modified the item. Read-only. */
    private IdentitySet _lastModifiedBy;
    /** Date and time the item was last modified. Read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Optional. Filename of the remote item. Read-only. */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only. */
    private Package_escaped _package_escaped;
    /** Properties of the parent of the remote item. Read-only. */
    private ItemReference _parentReference;
    /** Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only. */
    private Shared _shared;
    /** Provides interop between items in OneDrive for Business and SharePoint with the full set of item identifiers. Read-only. */
    private SharepointIds _sharepointIds;
    /** Size of the remote item. Read-only. */
    private Long _size;
    /** If the current item is also available as a special folder, this facet is returned. Read-only. */
    private SpecialFolder _specialFolder;
    /** Video metadata, if the item is a video. Read-only. */
    private Video _video;
    /** DAV compatible URL for the item. */
    private String _webDavUrl;
    /** URL that displays the resource in the browser. Read-only. */
    private String _webUrl;
    /**
     * Instantiates a new remoteItem and sets the default values.
     * @return a void
     */
    public RemoteItem() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.remoteItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a remoteItem
     */
    @javax.annotation.Nonnull
    public static RemoteItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteItem();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the createdBy property value. Identity of the user, device, and application which created the item. Read-only.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. Date and time of item creation. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RemoteItem currentObject = this;
        return new HashMap<>(20) {{
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("file", (n) -> { currentObject.setFile(n.getObjectValue(File::createFromDiscriminatorValue)); });
            this.put("fileSystemInfo", (n) -> { currentObject.setFileSystemInfo(n.getObjectValue(FileSystemInfo::createFromDiscriminatorValue)); });
            this.put("folder", (n) -> { currentObject.setFolder(n.getObjectValue(Folder::createFromDiscriminatorValue)); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("image", (n) -> { currentObject.setImage(n.getObjectValue(Image::createFromDiscriminatorValue)); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("package", (n) -> { currentObject.setPackage(n.getObjectValue(Package_escaped::createFromDiscriminatorValue)); });
            this.put("parentReference", (n) -> { currentObject.setParentReference(n.getObjectValue(ItemReference::createFromDiscriminatorValue)); });
            this.put("shared", (n) -> { currentObject.setShared(n.getObjectValue(Shared::createFromDiscriminatorValue)); });
            this.put("sharepointIds", (n) -> { currentObject.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
            this.put("size", (n) -> { currentObject.setSize(n.getLongValue()); });
            this.put("specialFolder", (n) -> { currentObject.setSpecialFolder(n.getObjectValue(SpecialFolder::createFromDiscriminatorValue)); });
            this.put("video", (n) -> { currentObject.setVideo(n.getObjectValue(Video::createFromDiscriminatorValue)); });
            this.put("webDavUrl", (n) -> { currentObject.setWebDavUrl(n.getStringValue()); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the file property value. Indicates that the remote item is a file. Read-only.
     * @return a file
     */
    @javax.annotation.Nullable
    public File getFile() {
        return this._file;
    }
    /**
     * Gets the fileSystemInfo property value. Information about the remote item from the local file system. Read-only.
     * @return a fileSystemInfo
     */
    @javax.annotation.Nullable
    public FileSystemInfo getFileSystemInfo() {
        return this._fileSystemInfo;
    }
    /**
     * Gets the folder property value. Indicates that the remote item is a folder. Read-only.
     * @return a folder
     */
    @javax.annotation.Nullable
    public Folder getFolder() {
        return this._folder;
    }
    /**
     * Gets the id property value. Unique identifier for the remote item in its drive. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
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
     * Gets the lastModifiedBy property value. Identity of the user, device, and application which last modified the item. Read-only.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time the item was last modified. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the name property value. Optional. Filename of the remote item. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
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
     * Gets the parentReference property value. Properties of the parent of the remote item. Read-only.
     * @return a itemReference
     */
    @javax.annotation.Nullable
    public ItemReference getParentReference() {
        return this._parentReference;
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
     * Gets the sharepointIds property value. Provides interop between items in OneDrive for Business and SharePoint with the full set of item identifiers. Read-only.
     * @return a sharepointIds
     */
    @javax.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this._sharepointIds;
    }
    /**
     * Gets the size property value. Size of the remote item. Read-only.
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
     * Gets the video property value. Video metadata, if the item is a video. Read-only.
     * @return a video
     */
    @javax.annotation.Nullable
    public Video getVideo() {
        return this._video;
    }
    /**
     * Gets the webDavUrl property value. DAV compatible URL for the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebDavUrl() {
        return this._webDavUrl;
    }
    /**
     * Gets the webUrl property value. URL that displays the resource in the browser. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("file", this.getFile());
        writer.writeObjectValue("fileSystemInfo", this.getFileSystemInfo());
        writer.writeObjectValue("folder", this.getFolder());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("image", this.getImage());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("package", this.getPackage());
        writer.writeObjectValue("parentReference", this.getParentReference());
        writer.writeObjectValue("shared", this.getShared());
        writer.writeObjectValue("sharepointIds", this.getSharepointIds());
        writer.writeLongValue("size", this.getSize());
        writer.writeObjectValue("specialFolder", this.getSpecialFolder());
        writer.writeObjectValue("video", this.getVideo());
        writer.writeStringValue("webDavUrl", this.getWebDavUrl());
        writer.writeStringValue("webUrl", this.getWebUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user, device, and application which created the item. Read-only.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time of item creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the file property value. Indicates that the remote item is a file. Read-only.
     * @param value Value to set for the file property.
     * @return a void
     */
    public void setFile(@javax.annotation.Nullable final File value) {
        this._file = value;
    }
    /**
     * Sets the fileSystemInfo property value. Information about the remote item from the local file system. Read-only.
     * @param value Value to set for the fileSystemInfo property.
     * @return a void
     */
    public void setFileSystemInfo(@javax.annotation.Nullable final FileSystemInfo value) {
        this._fileSystemInfo = value;
    }
    /**
     * Sets the folder property value. Indicates that the remote item is a folder. Read-only.
     * @param value Value to set for the folder property.
     * @return a void
     */
    public void setFolder(@javax.annotation.Nullable final Folder value) {
        this._folder = value;
    }
    /**
     * Sets the id property value. Unique identifier for the remote item in its drive. Read-only.
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
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
     * Sets the lastModifiedBy property value. Identity of the user, device, and application which last modified the item. Read-only.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time the item was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the name property value. Optional. Filename of the remote item. Read-only.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
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
     * Sets the parentReference property value. Properties of the parent of the remote item. Read-only.
     * @param value Value to set for the parentReference property.
     * @return a void
     */
    public void setParentReference(@javax.annotation.Nullable final ItemReference value) {
        this._parentReference = value;
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
     * Sets the sharepointIds property value. Provides interop between items in OneDrive for Business and SharePoint with the full set of item identifiers. Read-only.
     * @param value Value to set for the sharepointIds property.
     * @return a void
     */
    public void setSharepointIds(@javax.annotation.Nullable final SharepointIds value) {
        this._sharepointIds = value;
    }
    /**
     * Sets the size property value. Size of the remote item. Read-only.
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
     * Sets the video property value. Video metadata, if the item is a video. Read-only.
     * @param value Value to set for the video property.
     * @return a void
     */
    public void setVideo(@javax.annotation.Nullable final Video value) {
        this._video = value;
    }
    /**
     * Sets the webDavUrl property value. DAV compatible URL for the item.
     * @param value Value to set for the webDavUrl property.
     * @return a void
     */
    public void setWebDavUrl(@javax.annotation.Nullable final String value) {
        this._webDavUrl = value;
    }
    /**
     * Sets the webUrl property value. URL that displays the resource in the browser. Read-only.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
