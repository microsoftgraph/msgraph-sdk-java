package com.microsoft.graph.groups.item.threads.item.posts.item.inreplyto.reply;

import com.microsoft.graph.models.Post;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the reply method. */
public class ReplyPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The Post property */
    private Post _post;
    /**
     * Instantiates a new replyPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReplyPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a replyPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ReplyPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReplyPostRequestBody();
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
        final ReplyPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("post", (n) -> { currentObject.setPost(n.getObjectValue(Post::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the post property value. The Post property
     * @return a post
     */
    @javax.annotation.Nullable
    public Post getPost() {
        return this._post;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("post", this.getPost());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the post property value. The Post property
     * @param value Value to set for the Post property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPost(@javax.annotation.Nullable final Post value) {
        this._post = value;
    }
}
