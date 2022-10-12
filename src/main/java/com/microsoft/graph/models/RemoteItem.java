package com.microsoft.graph.models;

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
    /** The createdBy property */
    private IdentitySet _createdBy;
    /** Date and time of item creation. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The file property */
    private File _file;
    /** The fileSystemInfo property */
    private FileSystemInfo _fileSystemInfo;
    /** The folder property */
    private Folder _folder;
    /** Unique identifier for the remote item in its drive. Read-only. */
    private String _id;
    /** The image property */
    private Image _image;
    /** The lastModifiedBy property */
    private IdentitySet _lastModifiedBy;
    /** Date and time the item was last modified. Read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Optional. Filename of the remote item. Read-only. */
    private String _name;
    /** The package property */
    private Package_escaped _package_escaped;
    /** The parentReference property */
    private ItemReference _parentReference;
    /** The shared property */
    private Shared _shared;
    /** The sharepointIds property */
    private SharepointIds _sharepointIds;
    /** Size of the remote item. Read-only. */
    private Long _size;
    /** The specialFolder property */
    private SpecialFolder _specialFolder;
    /** The video property */
    private Video _video;
    /** DAV compatible URL for the item. */
    private String _webDavUrl;
    /** URL that displays the resource in the browser. Read-only. */
    private String _webUrl;
    /**
     * Instantiates a new remoteItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RemoteItem() {
        this.setAdditionalData(new HashMap<>());
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
     * Gets the createdBy property value. The createdBy property
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
        return new HashMap<String, Consumer<ParseNode>>(19) {{
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
     * Gets the file property value. The file property
     * @return a file
     */
    @javax.annotation.Nullable
    public File getFile() {
        return this._file;
    }
    /**
     * Gets the fileSystemInfo property value. The fileSystemInfo property
     * @return a fileSystemInfo
     */
    @javax.annotation.Nullable
    public FileSystemInfo getFileSystemInfo() {
        return this._fileSystemInfo;
    }
    /**
     * Gets the folder property value. The folder property
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
     * Gets the image property value. The image property
     * @return a image
     */
    @javax.annotation.Nullable
    public Image getImage() {
        return this._image;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
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
     * Gets the package property value. The package property
     * @return a package_escaped
     */
    @javax.annotation.Nullable
    public Package_escaped getPackage() {
        return this._package_escaped;
    }
    /**
     * Gets the parentReference property value. The parentReference property
     * @return a itemReference
     */
    @javax.annotation.Nullable
    public ItemReference getParentReference() {
        return this._parentReference;
    }
    /**
     * Gets the shared property value. The shared property
     * @return a shared
     */
    @javax.annotation.Nullable
    public Shared getShared() {
        return this._shared;
    }
    /**
     * Gets the sharepointIds property value. The sharepointIds property
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
     * Gets the specialFolder property value. The specialFolder property
     * @return a specialFolder
     */
    @javax.annotation.Nullable
    public SpecialFolder getSpecialFolder() {
        return this._specialFolder;
    }
    /**
     * Gets the video property value. The video property
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
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time of item creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the file property value. The file property
     * @param value Value to set for the file property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFile(@javax.annotation.Nullable final File value) {
        this._file = value;
    }
    /**
     * Sets the fileSystemInfo property value. The fileSystemInfo property
     * @param value Value to set for the fileSystemInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileSystemInfo(@javax.annotation.Nullable final FileSystemInfo value) {
        this._fileSystemInfo = value;
    }
    /**
     * Sets the folder property value. The folder property
     * @param value Value to set for the folder property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFolder(@javax.annotation.Nullable final Folder value) {
        this._folder = value;
    }
    /**
     * Sets the id property value. Unique identifier for the remote item in its drive. Read-only.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the image property value. The image property
     * @param value Value to set for the image property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImage(@javax.annotation.Nullable final Image value) {
        this._image = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time the item was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the name property value. Optional. Filename of the remote item. Read-only.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the package property value. The package property
     * @param value Value to set for the package property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackage(@javax.annotation.Nullable final Package_escaped value) {
        this._package_escaped = value;
    }
    /**
     * Sets the parentReference property value. The parentReference property
     * @param value Value to set for the parentReference property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentReference(@javax.annotation.Nullable final ItemReference value) {
        this._parentReference = value;
    }
    /**
     * Sets the shared property value. The shared property
     * @param value Value to set for the shared property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShared(@javax.annotation.Nullable final Shared value) {
        this._shared = value;
    }
    /**
     * Sets the sharepointIds property value. The sharepointIds property
     * @param value Value to set for the sharepointIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharepointIds(@javax.annotation.Nullable final SharepointIds value) {
        this._sharepointIds = value;
    }
    /**
     * Sets the size property value. Size of the remote item. Read-only.
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Long value) {
        this._size = value;
    }
    /**
     * Sets the specialFolder property value. The specialFolder property
     * @param value Value to set for the specialFolder property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpecialFolder(@javax.annotation.Nullable final SpecialFolder value) {
        this._specialFolder = value;
    }
    /**
     * Sets the video property value. The video property
     * @param value Value to set for the video property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVideo(@javax.annotation.Nullable final Video value) {
        this._video = value;
    }
    /**
     * Sets the webDavUrl property value. DAV compatible URL for the item.
     * @param value Value to set for the webDavUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebDavUrl(@javax.annotation.Nullable final String value) {
        this._webDavUrl = value;
    }
    /**
     * Sets the webUrl property value. URL that displays the resource in the browser. Read-only.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
