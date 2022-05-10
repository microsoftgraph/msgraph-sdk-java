package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Thumbnail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The content stream for the thumbnail. */
    private byte[] _content;
    /** The height of the thumbnail, in pixels. */
    private Integer _height;
    /** The unique identifier of the item that provided the thumbnail. This is only available when a folder thumbnail is requested. */
    private String _sourceItemId;
    /** The URL used to fetch the thumbnail content. */
    private String _url;
    /** The width of the thumbnail, in pixels. */
    private Integer _width;
    /**
     * Instantiates a new thumbnail and sets the default values.
     * @return a void
     */
    public Thumbnail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a thumbnail
     */
    @javax.annotation.Nonnull
    public static Thumbnail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Thumbnail();
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
     * Gets the content property value. The content stream for the thumbnail.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this._content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Thumbnail currentObject = this;
        return new HashMap<>(5) {{
            this.put("content", (n) -> { currentObject.setContent(n.getByteArrayValue()); });
            this.put("height", (n) -> { currentObject.setHeight(n.getIntegerValue()); });
            this.put("sourceItemId", (n) -> { currentObject.setSourceItemId(n.getStringValue()); });
            this.put("url", (n) -> { currentObject.setUrl(n.getStringValue()); });
            this.put("width", (n) -> { currentObject.setWidth(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the height property value. The height of the thumbnail, in pixels.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHeight() {
        return this._height;
    }
    /**
     * Gets the sourceItemId property value. The unique identifier of the item that provided the thumbnail. This is only available when a folder thumbnail is requested.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceItemId() {
        return this._sourceItemId;
    }
    /**
     * Gets the url property value. The URL used to fetch the thumbnail content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUrl() {
        return this._url;
    }
    /**
     * Gets the width property value. The width of the thumbnail, in pixels.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWidth() {
        return this._width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeStringValue("sourceItemId", this.getSourceItemId());
        writer.writeStringValue("url", this.getUrl());
        writer.writeIntegerValue("width", this.getWidth());
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
     * Sets the content property value. The content stream for the thumbnail.
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this._content = value;
    }
    /**
     * Sets the height property value. The height of the thumbnail, in pixels.
     * @param value Value to set for the height property.
     * @return a void
     */
    public void setHeight(@javax.annotation.Nullable final Integer value) {
        this._height = value;
    }
    /**
     * Sets the sourceItemId property value. The unique identifier of the item that provided the thumbnail. This is only available when a folder thumbnail is requested.
     * @param value Value to set for the sourceItemId property.
     * @return a void
     */
    public void setSourceItemId(@javax.annotation.Nullable final String value) {
        this._sourceItemId = value;
    }
    /**
     * Sets the url property value. The URL used to fetch the thumbnail content.
     * @param value Value to set for the url property.
     * @return a void
     */
    public void setUrl(@javax.annotation.Nullable final String value) {
        this._url = value;
    }
    /**
     * Sets the width property value. The width of the thumbnail, in pixels.
     * @param value Value to set for the width property.
     * @return a void
     */
    public void setWidth(@javax.annotation.Nullable final Integer value) {
        this._width = value;
    }
}
