package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConversationThread extends Entity implements Parsable {
    /**
     * Instantiates a new ConversationThread and sets the default values.
     */
    public ConversationThread() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConversationThread
     */
    @jakarta.annotation.Nonnull
    public static ConversationThread createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConversationThread();
    }
    /**
     * Gets the ccRecipients property value. The Cc: recipients for the thread. Returned only on $select.
     * @return a java.util.List<Recipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getCcRecipients() {
        return this.backingStore.get("ccRecipients");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ccRecipients", (n) -> { this.setCcRecipients(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("hasAttachments", (n) -> { this.setHasAttachments(n.getBooleanValue()); });
        deserializerMap.put("isLocked", (n) -> { this.setIsLocked(n.getBooleanValue()); });
        deserializerMap.put("lastDeliveredDateTime", (n) -> { this.setLastDeliveredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("posts", (n) -> { this.setPosts(n.getCollectionOfObjectValues(Post::createFromDiscriminatorValue)); });
        deserializerMap.put("preview", (n) -> { this.setPreview(n.getStringValue()); });
        deserializerMap.put("topic", (n) -> { this.setTopic(n.getStringValue()); });
        deserializerMap.put("toRecipients", (n) -> { this.setToRecipients(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("uniqueSenders", (n) -> { this.setUniqueSenders(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hasAttachments property value. Indicates whether any of the posts within this thread has at least one attachment. Returned by default.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.backingStore.get("hasAttachments");
    }
    /**
     * Gets the isLocked property value. Indicates if the thread is locked. Returned by default.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLocked() {
        return this.backingStore.get("isLocked");
    }
    /**
     * Gets the lastDeliveredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.Returned by default.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastDeliveredDateTime() {
        return this.backingStore.get("lastDeliveredDateTime");
    }
    /**
     * Gets the posts property value. The posts property
     * @return a java.util.List<Post>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Post> getPosts() {
        return this.backingStore.get("posts");
    }
    /**
     * Gets the preview property value. A short summary from the body of the latest post in this conversation. Returned by default.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreview() {
        return this.backingStore.get("preview");
    }
    /**
     * Gets the topic property value. The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated. Returned by default.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTopic() {
        return this.backingStore.get("topic");
    }
    /**
     * Gets the toRecipients property value. The To: recipients for the thread. Returned only on $select.
     * @return a java.util.List<Recipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recipient> getToRecipients() {
        return this.backingStore.get("toRecipients");
    }
    /**
     * Gets the uniqueSenders property value. All the users that sent a message to this thread. Returned by default.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUniqueSenders() {
        return this.backingStore.get("uniqueSenders");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCcRecipients(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.backingStore.set("ccRecipients", value);
    }
    /**
     * Sets the hasAttachments property value. Indicates whether any of the posts within this thread has at least one attachment. Returned by default.
     * @param value Value to set for the hasAttachments property.
     */
    public void setHasAttachments(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasAttachments", value);
    }
    /**
     * Sets the isLocked property value. Indicates if the thread is locked. Returned by default.
     * @param value Value to set for the isLocked property.
     */
    public void setIsLocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isLocked", value);
    }
    /**
     * Sets the lastDeliveredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.Returned by default.
     * @param value Value to set for the lastDeliveredDateTime property.
     */
    public void setLastDeliveredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastDeliveredDateTime", value);
    }
    /**
     * Sets the posts property value. The posts property
     * @param value Value to set for the posts property.
     */
    public void setPosts(@jakarta.annotation.Nullable final java.util.List<Post> value) {
        this.backingStore.set("posts", value);
    }
    /**
     * Sets the preview property value. A short summary from the body of the latest post in this conversation. Returned by default.
     * @param value Value to set for the preview property.
     */
    public void setPreview(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preview", value);
    }
    /**
     * Sets the topic property value. The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated. Returned by default.
     * @param value Value to set for the topic property.
     */
    public void setTopic(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("topic", value);
    }
    /**
     * Sets the toRecipients property value. The To: recipients for the thread. Returned only on $select.
     * @param value Value to set for the toRecipients property.
     */
    public void setToRecipients(@jakarta.annotation.Nullable final java.util.List<Recipient> value) {
        this.backingStore.set("toRecipients", value);
    }
    /**
     * Sets the uniqueSenders property value. All the users that sent a message to this thread. Returned by default.
     * @param value Value to set for the uniqueSenders property.
     */
    public void setUniqueSenders(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("uniqueSenders", value);
    }
}
