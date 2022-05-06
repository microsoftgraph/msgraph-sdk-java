package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The unique identifier for a message in a Microsoft Teams channel.  */
    private String _messageId;
    /** The ID of the reply message.  */
    private String _replyChainMessageId;
    /** The unique identifier for a thread in Microsoft Teams.  */
    private String _threadId;
    /**
     * Instantiates a new chatInfo and sets the default values.
     * @return a void
     */
    public ChatInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chatInfo
     */
    @javax.annotation.Nonnull
    public static ChatInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatInfo();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChatInfo currentObject = this;
        return new HashMap<>(3) {{
            this.put("messageId", (n) -> { currentObject.setMessageId(n.getStringValue()); });
            this.put("replyChainMessageId", (n) -> { currentObject.setReplyChainMessageId(n.getStringValue()); });
            this.put("threadId", (n) -> { currentObject.setThreadId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the messageId property value. The unique identifier for a message in a Microsoft Teams channel.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessageId() {
        return this._messageId;
    }
    /**
     * Gets the replyChainMessageId property value. The ID of the reply message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReplyChainMessageId() {
        return this._replyChainMessageId;
    }
    /**
     * Gets the threadId property value. The unique identifier for a thread in Microsoft Teams.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThreadId() {
        return this._threadId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("messageId", this.getMessageId());
        writer.writeStringValue("replyChainMessageId", this.getReplyChainMessageId());
        writer.writeStringValue("threadId", this.getThreadId());
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
     * Sets the messageId property value. The unique identifier for a message in a Microsoft Teams channel.
     * @param value Value to set for the messageId property.
     * @return a void
     */
    public void setMessageId(@javax.annotation.Nullable final String value) {
        this._messageId = value;
    }
    /**
     * Sets the replyChainMessageId property value. The ID of the reply message.
     * @param value Value to set for the replyChainMessageId property.
     * @return a void
     */
    public void setReplyChainMessageId(@javax.annotation.Nullable final String value) {
        this._replyChainMessageId = value;
    }
    /**
     * Sets the threadId property value. The unique identifier for a thread in Microsoft Teams.
     * @param value Value to set for the threadId property.
     * @return a void
     */
    public void setThreadId(@javax.annotation.Nullable final String value) {
        this._threadId = value;
    }
}
