package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConversationThread extends Entity implements Parsable {
    /** The Cc: recipients for the thread. Returned only on $select.  */
    private java.util.List<Recipient> _ccRecipients;
    /** Indicates whether any of the posts within this thread has at least one attachment. Returned by default.  */
    private Boolean _hasAttachments;
    /** Indicates if the thread is locked. Returned by default.  */
    private Boolean _isLocked;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default.  */
    private OffsetDateTime _lastDeliveredDateTime;
    /** Read-only. Nullable.  */
    private java.util.List<Post> _posts;
    /** A short summary from the body of the latest post in this conversation. Returned by default.  */
    private String _preview;
    /** The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated. Returned by default.  */
    private String _topic;
    /** The To: recipients for the thread. Returned only on $select.  */
    private java.util.List<Recipient> _toRecipients;
    /** All the users that sent a message to this thread. Returned by default.  */
    private java.util.List<String> _uniqueSenders;
    /**
     * Instantiates a new conversationThread and sets the default values.
     * @return a void
     */
    public ConversationThread() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conversationThread
     */
    @javax.annotation.Nonnull
    public static ConversationThread createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConversationThread();
    }
    /**
     * Gets the ccRecipients property value. The Cc: recipients for the thread. Returned only on $select.
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getCcRecipients() {
        return this._ccRecipients;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConversationThread currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("ccRecipients", (n) -> { currentObject.setCcRecipients(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
            this.put("hasAttachments", (n) -> { currentObject.setHasAttachments(n.getBooleanValue()); });
            this.put("isLocked", (n) -> { currentObject.setIsLocked(n.getBooleanValue()); });
            this.put("lastDeliveredDateTime", (n) -> { currentObject.setLastDeliveredDateTime(n.getOffsetDateTimeValue()); });
            this.put("posts", (n) -> { currentObject.setPosts(n.getCollectionOfObjectValues(Post::createFromDiscriminatorValue)); });
            this.put("preview", (n) -> { currentObject.setPreview(n.getStringValue()); });
            this.put("topic", (n) -> { currentObject.setTopic(n.getStringValue()); });
            this.put("toRecipients", (n) -> { currentObject.setToRecipients(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
            this.put("uniqueSenders", (n) -> { currentObject.setUniqueSenders(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the hasAttachments property value. Indicates whether any of the posts within this thread has at least one attachment. Returned by default.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasAttachments() {
        return this._hasAttachments;
    }
    /**
     * Gets the isLocked property value. Indicates if the thread is locked. Returned by default.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsLocked() {
        return this._isLocked;
    }
    /**
     * Gets the lastDeliveredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastDeliveredDateTime() {
        return this._lastDeliveredDateTime;
    }
    /**
     * Gets the posts property value. Read-only. Nullable.
     * @return a post
     */
    @javax.annotation.Nullable
    public java.util.List<Post> getPosts() {
        return this._posts;
    }
    /**
     * Gets the preview property value. A short summary from the body of the latest post in this conversation. Returned by default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreview() {
        return this._preview;
    }
    /**
     * Gets the topic property value. The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated. Returned by default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTopic() {
        return this._topic;
    }
    /**
     * Gets the toRecipients property value. The To: recipients for the thread. Returned only on $select.
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getToRecipients() {
        return this._toRecipients;
    }
    /**
     * Gets the uniqueSenders property value. All the users that sent a message to this thread. Returned by default.
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
        writer.writeCollectionOfObjectValues("ccRecipients", this.getCcRecipients());
        writer.writeBooleanValue("hasAttachments", this.getHasAttachments());
        writer.writeBooleanValue("isLocked", this.getIsLocked());
        writer.writeOffsetDateTimeValue("lastDeliveredDateTime", this.getLastDeliveredDateTime());
        writer.writeCollectionOfObjectValues("posts", this.getPosts());
        writer.writeStringValue("preview", this.getPreview());
        writer.writeStringValue("topic", this.getTopic());
        writer.writeCollectionOfObjectValues("toRecipients", this.getToRecipients());
        writer.writeCollectionOfPrimitiveValues("uniqueSenders", this.getUniqueSenders());
    }
    /**
     * Sets the ccRecipients property value. The Cc: recipients for the thread. Returned only on $select.
     * @param value Value to set for the ccRecipients property.
     * @return a void
     */
    public void setCcRecipients(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this._ccRecipients = value;
    }
    /**
     * Sets the hasAttachments property value. Indicates whether any of the posts within this thread has at least one attachment. Returned by default.
     * @param value Value to set for the hasAttachments property.
     * @return a void
     */
    public void setHasAttachments(@javax.annotation.Nullable final Boolean value) {
        this._hasAttachments = value;
    }
    /**
     * Sets the isLocked property value. Indicates if the thread is locked. Returned by default.
     * @param value Value to set for the isLocked property.
     * @return a void
     */
    public void setIsLocked(@javax.annotation.Nullable final Boolean value) {
        this._isLocked = value;
    }
    /**
     * Sets the lastDeliveredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default.
     * @param value Value to set for the lastDeliveredDateTime property.
     * @return a void
     */
    public void setLastDeliveredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastDeliveredDateTime = value;
    }
    /**
     * Sets the posts property value. Read-only. Nullable.
     * @param value Value to set for the posts property.
     * @return a void
     */
    public void setPosts(@javax.annotation.Nullable final java.util.List<Post> value) {
        this._posts = value;
    }
    /**
     * Sets the preview property value. A short summary from the body of the latest post in this conversation. Returned by default.
     * @param value Value to set for the preview property.
     * @return a void
     */
    public void setPreview(@javax.annotation.Nullable final String value) {
        this._preview = value;
    }
    /**
     * Sets the topic property value. The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated. Returned by default.
     * @param value Value to set for the topic property.
     * @return a void
     */
    public void setTopic(@javax.annotation.Nullable final String value) {
        this._topic = value;
    }
    /**
     * Sets the toRecipients property value. The To: recipients for the thread. Returned only on $select.
     * @param value Value to set for the toRecipients property.
     * @return a void
     */
    public void setToRecipients(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this._toRecipients = value;
    }
    /**
     * Sets the uniqueSenders property value. All the users that sent a message to this thread. Returned by default.
     * @param value Value to set for the uniqueSenders property.
     * @return a void
     */
    public void setUniqueSenders(@javax.annotation.Nullable final java.util.List<String> value) {
        this._uniqueSenders = value;
    }
}
