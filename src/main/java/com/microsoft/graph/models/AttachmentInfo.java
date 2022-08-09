package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttachmentInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The type of the attachment. The possible values are: file, item, reference. Required. */
    private AttachmentType _attachmentType;
    /** The nature of the data in the attachment. Optional. */
    private String _contentType;
    /** The display name of the attachment. This can be a descriptive string and does not have to be the actual file name. Required. */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** The length of the attachment in bytes. Required. */
    private Long _size;
    /**
     * Instantiates a new attachmentInfo and sets the default values.
     * @return a void
     */
    public AttachmentInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.attachmentInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attachmentInfo
     */
    @javax.annotation.Nonnull
    public static AttachmentInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttachmentInfo();
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
     * Gets the attachmentType property value. The type of the attachment. The possible values are: file, item, reference. Required.
     * @return a attachmentType
     */
    @javax.annotation.Nullable
    public AttachmentType getAttachmentType() {
        return this._attachmentType;
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
        final AttachmentInfo currentObject = this;
        return new HashMap<>(5) {{
            this.put("attachmentType", (n) -> { currentObject.setAttachmentType(n.getEnumValue(AttachmentType.class)); });
            this.put("contentType", (n) -> { currentObject.setContentType(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("size", (n) -> { currentObject.setSize(n.getLongValue()); });
        }};
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
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
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
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the attachmentType property value. The type of the attachment. The possible values are: file, item, reference. Required.
     * @param value Value to set for the attachmentType property.
     * @return a void
     */
    public void setAttachmentType(@javax.annotation.Nullable final AttachmentType value) {
        this._attachmentType = value;
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
     * Sets the name property value. The display name of the attachment. This can be a descriptive string and does not have to be the actual file name. Required.
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
     * Sets the size property value. The length of the attachment in bytes. Required.
     * @param value Value to set for the size property.
     * @return a void
     */
    public void setSize(@javax.annotation.Nullable final Long value) {
        this._size = value;
    }
}
