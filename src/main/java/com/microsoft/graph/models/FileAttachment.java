package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FileAttachment extends Attachment implements Parsable {
    /** The base64-encoded contents of the file. */
    private byte[] _contentBytes;
    /** The ID of the attachment in the Exchange store. */
    private String _contentId;
    /** Do not use this property as it is not supported. */
    private String _contentLocation;
    /**
     * Instantiates a new FileAttachment and sets the default values.
     * @return a void
     */
    public FileAttachment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileAttachment
     */
    @javax.annotation.Nonnull
    public static FileAttachment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileAttachment();
    }
    /**
     * Gets the contentBytes property value. The base64-encoded contents of the file.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContentBytes() {
        return this._contentBytes;
    }
    /**
     * Gets the contentId property value. The ID of the attachment in the Exchange store.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentId() {
        return this._contentId;
    }
    /**
     * Gets the contentLocation property value. Do not use this property as it is not supported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentLocation() {
        return this._contentLocation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final FileAttachment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("contentBytes", (n) -> { currentObject.setContentBytes(n.getByteArrayValue()); });
            this.put("contentId", (n) -> { currentObject.setContentId(n.getStringValue()); });
            this.put("contentLocation", (n) -> { currentObject.setContentLocation(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("contentBytes", this.getContentBytes());
        writer.writeStringValue("contentId", this.getContentId());
        writer.writeStringValue("contentLocation", this.getContentLocation());
    }
    /**
     * Sets the contentBytes property value. The base64-encoded contents of the file.
     * @param value Value to set for the contentBytes property.
     * @return a void
     */
    public void setContentBytes(@javax.annotation.Nullable final byte[] value) {
        this._contentBytes = value;
    }
    /**
     * Sets the contentId property value. The ID of the attachment in the Exchange store.
     * @param value Value to set for the contentId property.
     * @return a void
     */
    public void setContentId(@javax.annotation.Nullable final String value) {
        this._contentId = value;
    }
    /**
     * Sets the contentLocation property value. Do not use this property as it is not supported.
     * @param value Value to set for the contentLocation property.
     * @return a void
     */
    public void setContentLocation(@javax.annotation.Nullable final String value) {
        this._contentLocation = value;
    }
}
