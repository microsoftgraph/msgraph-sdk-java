package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookCommentReply extends Entity implements Parsable {
    /** The content of replied comment. */
    private String _content;
    /** Indicates the type for the replied comment. */
    private String _contentType;
    /**
     * Instantiates a new workbookCommentReply and sets the default values.
     * @return a void
     */
    public WorkbookCommentReply() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookCommentReply
     */
    @javax.annotation.Nonnull
    public static WorkbookCommentReply createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookCommentReply();
    }
    /**
     * Gets the content property value. The content of replied comment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContent() {
        return this._content;
    }
    /**
     * Gets the contentType property value. Indicates the type for the replied comment.
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
        final WorkbookCommentReply currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("content", (n) -> { currentObject.setContent(n.getStringValue()); });
            this.put("contentType", (n) -> { currentObject.setContentType(n.getStringValue()); });
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
        writer.writeStringValue("content", this.getContent());
        writer.writeStringValue("contentType", this.getContentType());
    }
    /**
     * Sets the content property value. The content of replied comment.
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final String value) {
        this._content = value;
    }
    /**
     * Sets the contentType property value. Indicates the type for the replied comment.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    public void setContentType(@javax.annotation.Nullable final String value) {
        this._contentType = value;
    }
}
