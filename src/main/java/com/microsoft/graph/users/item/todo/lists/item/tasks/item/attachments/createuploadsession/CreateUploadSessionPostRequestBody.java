package microsoft.graph.users.item.todo.lists.item.tasks.item.attachments.createuploadsession;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.AttachmentInfo;
/** Provides operations to call the createUploadSession method. */
public class CreateUploadSessionPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The attachmentInfo property */
    private AttachmentInfo _attachmentInfo;
    /**
     * Instantiates a new createUploadSessionPostRequestBody and sets the default values.
     * @return a void
     */
    public CreateUploadSessionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a createUploadSessionPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CreateUploadSessionPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateUploadSessionPostRequestBody();
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
     * Gets the attachmentInfo property value. The attachmentInfo property
     * @return a attachmentInfo
     */
    @javax.annotation.Nullable
    public AttachmentInfo getAttachmentInfo() {
        return this._attachmentInfo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CreateUploadSessionPostRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("attachmentInfo", (n) -> { currentObject.setAttachmentInfo(n.getObjectValue(AttachmentInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("attachmentInfo", this.getAttachmentInfo());
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
     * Sets the attachmentInfo property value. The attachmentInfo property
     * @param value Value to set for the attachmentInfo property.
     * @return a void
     */
    public void setAttachmentInfo(@javax.annotation.Nullable final AttachmentInfo value) {
        this._attachmentInfo = value;
    }
}
