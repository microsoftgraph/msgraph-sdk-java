package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Conversation extends Entity implements Parsable {
    /** Indicates whether any of the posts within this Conversation has at least one attachment. Supports $filter (eq, ne) and $search. */
    private Boolean _hasAttachments;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, le, ge). */
    private OffsetDateTime _lastDeliveredDateTime;
    /** A short summary from the body of the latest post in this conversation. */
    private String _preview;
    /** A collection of all the conversation threads in the conversation. A navigation property. Read-only. Nullable. */
    private java.util.List<ConversationThread> _threads;
    /** The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated. */
    private String _topic;
    /** All the users that sent a message to this Conversation. */
    private java.util.List<String> _uniqueSenders;
    /**
     * Instantiates a new conversation and sets the default values.
     * @return a void
     */
    public Conversation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conversation
     */
    @javax.annotation.Nonnull
    public static Conversation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Conversation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Conversation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("hasAttachments", (n) -> { currentObject.setHasAttachments(n.getBooleanValue()); });
            this.put("lastDeliveredDateTime", (n) -> { currentObject.setLastDeliveredDateTime(n.getOffsetDateTimeValue()); });
            this.put("preview", (n) -> { currentObject.setPreview(n.getStringValue()); });
            this.put("threads", (n) -> { currentObject.setThreads(n.getCollectionOfObjectValues(ConversationThread::createFromDiscriminatorValue)); });
            this.put("topic", (n) -> { currentObject.setTopic(n.getStringValue()); });
            this.put("uniqueSenders", (n) -> { currentObject.setUniqueSenders(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the hasAttachments property value. Indicates whether any of the posts within this Conversation has at least one attachment. Supports $filter (eq, ne) and $search.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasAttachments() {
        return this._hasAttachments;
    }
    /**
     * Gets the lastDeliveredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, le, ge).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastDeliveredDateTime() {
        return this._lastDeliveredDateTime;
    }
    /**
     * Gets the preview property value. A short summary from the body of the latest post in this conversation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreview() {
        return this._preview;
    }
    /**
     * Gets the threads property value. A collection of all the conversation threads in the conversation. A navigation property. Read-only. Nullable.
     * @return a conversationThread
     */
    @javax.annotation.Nullable
    public java.util.List<ConversationThread> getThreads() {
        return this._threads;
    }
    /**
     * Gets the topic property value. The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTopic() {
        return this._topic;
    }
    /**
     * Gets the uniqueSenders property value. All the users that sent a message to this Conversation.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUniqueSenders() {
        return this._uniqueSenders;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("hasAttachments", this.getHasAttachments());
        writer.writeOffsetDateTimeValue("lastDeliveredDateTime", this.getLastDeliveredDateTime());
        writer.writeStringValue("preview", this.getPreview());
        writer.writeCollectionOfObjectValues("threads", this.getThreads());
        writer.writeStringValue("topic", this.getTopic());
        writer.writeCollectionOfPrimitiveValues("uniqueSenders", this.getUniqueSenders());
    }
    /**
     * Sets the hasAttachments property value. Indicates whether any of the posts within this Conversation has at least one attachment. Supports $filter (eq, ne) and $search.
     * @param value Value to set for the hasAttachments property.
     * @return a void
     */
    public void setHasAttachments(@javax.annotation.Nullable final Boolean value) {
        this._hasAttachments = value;
    }
    /**
     * Sets the lastDeliveredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, le, ge).
     * @param value Value to set for the lastDeliveredDateTime property.
     * @return a void
     */
    public void setLastDeliveredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastDeliveredDateTime = value;
    }
    /**
     * Sets the preview property value. A short summary from the body of the latest post in this conversation.
     * @param value Value to set for the preview property.
     * @return a void
     */
    public void setPreview(@javax.annotation.Nullable final String value) {
        this._preview = value;
    }
    /**
     * Sets the threads property value. A collection of all the conversation threads in the conversation. A navigation property. Read-only. Nullable.
     * @param value Value to set for the threads property.
     * @return a void
     */
    public void setThreads(@javax.annotation.Nullable final java.util.List<ConversationThread> value) {
        this._threads = value;
    }
    /**
     * Sets the topic property value. The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
     * @param value Value to set for the topic property.
     * @return a void
     */
    public void setTopic(@javax.annotation.Nullable final String value) {
        this._topic = value;
    }
    /**
     * Sets the uniqueSenders property value. All the users that sent a message to this Conversation.
     * @param value Value to set for the uniqueSenders property.
     * @return a void
     */
    public void setUniqueSenders(@javax.annotation.Nullable final java.util.List<String> value) {
        this._uniqueSenders = value;
    }
}
