package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttachmentItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The type of attachment. Possible values are: file, item, reference. Required.  */
    private AttachmentType _attachmentType;
    /** The CID or Content-Id of the attachment for referencing in case of in-line attachments using <img src='cid:contentId'> tag in HTML messages. Optional.  */
    private String _contentId;
    /** The nature of the data in the attachment. Optional.  */
    private String _contentType;
    /** true if the attachment is an inline attachment; otherwise, false. Optional.  */
    private Boolean _isInline;
    /** The display name of the attachment. This can be a descriptive string and does not have to be the actual file name. Required.  */
    private String _name;
    /** The length of the attachment in bytes. Required.  */
    private Long _size;
    /**
     * Instantiates a new attachmentItem and sets the default values.
     * @return a void
     */
    public AttachmentItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attachmentItem
     */
    @javax.annotation.Nonnull
    public static AttachmentItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttachmentItem();
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
     * Gets the attachmentType property value. The type of attachment. Possible values are: file, item, reference. Required.
     * @return a attachmentType
     */
    @javax.annotation.Nullable
    public AttachmentType getAttachmentType() {
        return this._attachmentType;
    }
    /**
     * Gets the contentId property value. The CID or Content-Id of the attachment for referencing in case of in-line attachments using <img src='cid:contentId'> tag in HTML messages. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentId() {
        return this._contentId;
    }
    /**
     * Gets the contentType property value. The nature of the data in the attachment. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentType() {
        return this._contentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AttachmentItem currentObject = this;
        return new HashMap<>(6) {{
            this.put("attachmentType", (n) -> { currentObject.setAttachmentType(n.getEnumValue(AttachmentType.class)); });
            this.put("contentId", (n) -> { currentObject.setContentId(n.getStringValue()); });
            this.put("contentType", (n) -> { currentObject.setContentType(n.getStringValue()); });
            this.put("isInline", (n) -> { currentObject.setIsInline(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("size", (n) -> { currentObject.setSize(n.getLongValue()); });
        }};
    }
    /**
     * Gets the isInline property value. true if the attachment is an inline attachment; otherwise, false. Optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsInline() {
        return this._isInline;
    }
    /**
     * Gets the name property value. The display name of the attachment. This can be a descriptive string and does not have to be the actual file name. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the size property value. The length of the attachment in bytes. Required.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSize() {
        return this._size;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("attachmentType", this.getAttachmentType());
        writer.writeStringValue("contentId", this.getContentId());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeBooleanValue("isInline", this.getIsInline());
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("size", this.getSize());
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
     * Sets the attachmentType property value. The type of attachment. Possible values are: file, item, reference. Required.
     * @param value Value to set for the attachmentType property.
     * @return a void
     */
    public void setAttachmentType(@javax.annotation.Nullable final AttachmentType value) {
        this._attachmentType = value;
    }
    /**
     * Sets the contentId property value. The CID or Content-Id of the attachment for referencing in case of in-line attachments using <img src='cid:contentId'> tag in HTML messages. Optional.
     * @param value Value to set for the contentId property.
     * @return a void
     */
    public void setContentId(@javax.annotation.Nullable final String value) {
        this._contentId = value;
    }
    /**
     * Sets the contentType property value. The nature of the data in the attachment. Optional.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    public void setContentType(@javax.annotation.Nullable final String value) {
        this._contentType = value;
    }
    /**
     * Sets the isInline property value. true if the attachment is an inline attachment; otherwise, false. Optional.
     * @param value Value to set for the isInline property.
     * @return a void
     */
    public void setIsInline(@javax.annotation.Nullable final Boolean value) {
        this._isInline = value;
    }
    /**
     * Sets the name property value. The display name of the attachment. This can be a descriptive string and does not have to be the actual file name. Required.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the size property value. The length of the attachment in bytes. Required.
     * @param value Value to set for the size property.
     * @return a void
     */
    public void setSize(@javax.annotation.Nullable final Long value) {
        this._size = value;
    }
}
