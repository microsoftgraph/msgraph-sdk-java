package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResourceVisualization implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A string describing where the item is stored. For example, the name of a SharePoint site or the user name identifying the owner of the OneDrive storing the item. */
    private String _containerDisplayName;
    /** Can be used for filtering by the type of container in which the file is stored. Such as Site or OneDriveBusiness. */
    private String _containerType;
    /** A path leading to the folder in which the item is stored. */
    private String _containerWebUrl;
    /** The item's media type. Can be used for filtering for a specific type of file based on supported IANA Media Mime Types. Note that not all Media Mime Types are supported. */
    private String _mediaType;
    /** A URL leading to the preview image for the item. */
    private String _previewImageUrl;
    /** A preview text for the item. */
    private String _previewText;
    /** The item's title text. */
    private String _title;
    /** The item's media type. Can be used for filtering for a specific file based on a specific type. See below for supported types. */
    private String _type;
    /**
     * Instantiates a new resourceVisualization and sets the default values.
     * @return a void
     */
    public ResourceVisualization() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a resourceVisualization
     */
    @javax.annotation.Nonnull
    public static ResourceVisualization createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceVisualization();
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
     * Gets the containerDisplayName property value. A string describing where the item is stored. For example, the name of a SharePoint site or the user name identifying the owner of the OneDrive storing the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContainerDisplayName() {
        return this._containerDisplayName;
    }
    /**
     * Gets the containerType property value. Can be used for filtering by the type of container in which the file is stored. Such as Site or OneDriveBusiness.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContainerType() {
        return this._containerType;
    }
    /**
     * Gets the containerWebUrl property value. A path leading to the folder in which the item is stored.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContainerWebUrl() {
        return this._containerWebUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ResourceVisualization currentObject = this;
        return new HashMap<>(8) {{
            this.put("containerDisplayName", (n) -> { currentObject.setContainerDisplayName(n.getStringValue()); });
            this.put("containerType", (n) -> { currentObject.setContainerType(n.getStringValue()); });
            this.put("containerWebUrl", (n) -> { currentObject.setContainerWebUrl(n.getStringValue()); });
            this.put("mediaType", (n) -> { currentObject.setMediaType(n.getStringValue()); });
            this.put("previewImageUrl", (n) -> { currentObject.setPreviewImageUrl(n.getStringValue()); });
            this.put("previewText", (n) -> { currentObject.setPreviewText(n.getStringValue()); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the mediaType property value. The item's media type. Can be used for filtering for a specific type of file based on supported IANA Media Mime Types. Note that not all Media Mime Types are supported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaType() {
        return this._mediaType;
    }
    /**
     * Gets the previewImageUrl property value. A URL leading to the preview image for the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreviewImageUrl() {
        return this._previewImageUrl;
    }
    /**
     * Gets the previewText property value. A preview text for the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreviewText() {
        return this._previewText;
    }
    /**
     * Gets the title property value. The item's title text.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Gets the type property value. The item's media type. Can be used for filtering for a specific file based on a specific type. See below for supported types.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("containerDisplayName", this.getContainerDisplayName());
        writer.writeStringValue("containerType", this.getContainerType());
        writer.writeStringValue("containerWebUrl", this.getContainerWebUrl());
        writer.writeStringValue("mediaType", this.getMediaType());
        writer.writeStringValue("previewImageUrl", this.getPreviewImageUrl());
        writer.writeStringValue("previewText", this.getPreviewText());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("type", this.getType());
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
     * Sets the containerDisplayName property value. A string describing where the item is stored. For example, the name of a SharePoint site or the user name identifying the owner of the OneDrive storing the item.
     * @param value Value to set for the containerDisplayName property.
     * @return a void
     */
    public void setContainerDisplayName(@javax.annotation.Nullable final String value) {
        this._containerDisplayName = value;
    }
    /**
     * Sets the containerType property value. Can be used for filtering by the type of container in which the file is stored. Such as Site or OneDriveBusiness.
     * @param value Value to set for the containerType property.
     * @return a void
     */
    public void setContainerType(@javax.annotation.Nullable final String value) {
        this._containerType = value;
    }
    /**
     * Sets the containerWebUrl property value. A path leading to the folder in which the item is stored.
     * @param value Value to set for the containerWebUrl property.
     * @return a void
     */
    public void setContainerWebUrl(@javax.annotation.Nullable final String value) {
        this._containerWebUrl = value;
    }
    /**
     * Sets the mediaType property value. The item's media type. Can be used for filtering for a specific type of file based on supported IANA Media Mime Types. Note that not all Media Mime Types are supported.
     * @param value Value to set for the mediaType property.
     * @return a void
     */
    public void setMediaType(@javax.annotation.Nullable final String value) {
        this._mediaType = value;
    }
    /**
     * Sets the previewImageUrl property value. A URL leading to the preview image for the item.
     * @param value Value to set for the previewImageUrl property.
     * @return a void
     */
    public void setPreviewImageUrl(@javax.annotation.Nullable final String value) {
        this._previewImageUrl = value;
    }
    /**
     * Sets the previewText property value. A preview text for the item.
     * @param value Value to set for the previewText property.
     * @return a void
     */
    public void setPreviewText(@javax.annotation.Nullable final String value) {
        this._previewText = value;
    }
    /**
     * Sets the title property value. The item's title text.
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
    /**
     * Sets the type property value. The item's media type. Can be used for filtering for a specific file based on a specific type. See below for supported types.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
