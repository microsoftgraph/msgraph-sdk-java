package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookComment extends Entity implements Parsable {
    /**
     * Instantiates a new WorkbookComment and sets the default values.
     */
    public WorkbookComment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookComment
     */
    @jakarta.annotation.Nonnull
    public static WorkbookComment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookComment();
    }
    /**
     * Gets the content property value. The content of comment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the contentType property value. Indicates the type for the comment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentType() {
        return this.backingStore.get("contentType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("replies", (n) -> { this.setReplies(n.getCollectionOfObjectValues(WorkbookCommentReply::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the replies property value. The replies property
     * @return a java.util.List<WorkbookCommentReply>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookCommentReply> getReplies() {
        return this.backingStore.get("replies");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeCollectionOfObjectValues("replies", this.getReplies());
    }
    /**
     * Sets the content property value. The content of comment.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the contentType property value. Indicates the type for the comment.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentType", value);
    }
    /**
     * Sets the replies property value. The replies property
     * @param value Value to set for the replies property.
     */
    public void setReplies(@jakarta.annotation.Nullable final java.util.List<WorkbookCommentReply> value) {
        this.backingStore.set("replies", value);
    }
}
