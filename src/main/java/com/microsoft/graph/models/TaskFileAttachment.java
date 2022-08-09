package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TaskFileAttachment extends AttachmentBase implements Parsable {
    /** The base64-encoded contents of the file. */
    private byte[] _contentBytes;
    /**
     * Instantiates a new TaskFileAttachment and sets the default values.
     * @return a void
     */
    public TaskFileAttachment() {
        super();
        this.setOdataType("#microsoft.graph.taskFileAttachment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TaskFileAttachment
     */
    @javax.annotation.Nonnull
    public static TaskFileAttachment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskFileAttachment();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TaskFileAttachment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("contentBytes", (n) -> { currentObject.setContentBytes(n.getByteArrayValue()); });
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
    }
    /**
     * Sets the contentBytes property value. The base64-encoded contents of the file.
     * @param value Value to set for the contentBytes property.
     * @return a void
     */
    public void setContentBytes(@javax.annotation.Nullable final byte[] value) {
        this._contentBytes = value;
    }
}
