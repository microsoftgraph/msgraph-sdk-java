package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatMessageAttachment implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The content of the attachment. If the attachment is a rich card, set the property to the rich card object. This property and contentUrl are mutually exclusive. */
    private String _content;
    /** The media type of the content attachment. It can have the following values: reference: Attachment is a link to another file. Populate the contentURL with the link to the object.Any contentTypes supported by the Bot Framework's Attachment objectapplication/vnd.microsoft.card.codesnippet: A code snippet. application/vnd.microsoft.card.announcement: An announcement header. */
    private String _contentType;
    /** URL for the content of the attachment. Supported protocols: http, https, file and data. */
    private String _contentUrl;
    /** Read-only. Unique id of the attachment. */
    private String _id;
    /** Name of the attachment. */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** URL to a thumbnail image that the channel can use if it supports using an alternative, smaller form of content or contentUrl. For example, if you set contentType to application/word and set contentUrl to the location of the Word document, you might include a thumbnail image that represents the document. The channel could display the thumbnail image instead of the document. When the user clicks the image, the channel would open the document. */
    private String _thumbnailUrl;
    /**
     * Instantiates a new chatMessageAttachment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChatMessageAttachment() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.chatMessageAttachment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chatMessageAttachment
     */
    @javax.annotation.Nonnull
    public static ChatMessageAttachment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessageAttachment();
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
     * Gets the content property value. The content of the attachment. If the attachment is a rich card, set the property to the rich card object. This property and contentUrl are mutually exclusive.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContent() {
        return this._content;
    }
    /**
     * Gets the contentType property value. The media type of the content attachment. It can have the following values: reference: Attachment is a link to another file. Populate the contentURL with the link to the object.Any contentTypes supported by the Bot Framework's Attachment objectapplication/vnd.microsoft.card.codesnippet: A code snippet. application/vnd.microsoft.card.announcement: An announcement header.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentType() {
        return this._contentType;
    }
    /**
     * Gets the contentUrl property value. URL for the content of the attachment. Supported protocols: http, https, file and data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentUrl() {
        return this._contentUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChatMessageAttachment currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(7);
        deserializerMap.put("content", (n) -> { currentObject.setContent(n.getStringValue()); });
        deserializerMap.put("contentType", (n) -> { currentObject.setContentType(n.getStringValue()); });
        deserializerMap.put("contentUrl", (n) -> { currentObject.setContentUrl(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("thumbnailUrl", (n) -> { currentObject.setThumbnailUrl(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the id property value. Read-only. Unique id of the attachment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the name property value. Name of the attachment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the thumbnailUrl property value. URL to a thumbnail image that the channel can use if it supports using an alternative, smaller form of content or contentUrl. For example, if you set contentType to application/word and set contentUrl to the location of the Word document, you might include a thumbnail image that represents the document. The channel could display the thumbnail image instead of the document. When the user clicks the image, the channel would open the document.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailUrl() {
        return this._thumbnailUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeStringValue("contentUrl", this.getContentUrl());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
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
     * Sets the content property value. The content of the attachment. If the attachment is a rich card, set the property to the rich card object. This property and contentUrl are mutually exclusive.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final String value) {
        this._content = value;
    }
    /**
     * Sets the contentType property value. The media type of the content attachment. It can have the following values: reference: Attachment is a link to another file. Populate the contentURL with the link to the object.Any contentTypes supported by the Bot Framework's Attachment objectapplication/vnd.microsoft.card.codesnippet: A code snippet. application/vnd.microsoft.card.announcement: An announcement header.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentType(@javax.annotation.Nullable final String value) {
        this._contentType = value;
    }
    /**
     * Sets the contentUrl property value. URL for the content of the attachment. Supported protocols: http, https, file and data.
     * @param value Value to set for the contentUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentUrl(@javax.annotation.Nullable final String value) {
        this._contentUrl = value;
    }
    /**
     * Sets the id property value. Read-only. Unique id of the attachment.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the name property value. Name of the attachment.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the thumbnailUrl property value. URL to a thumbnail image that the channel can use if it supports using an alternative, smaller form of content or contentUrl. For example, if you set contentType to application/word and set contentUrl to the location of the Word document, you might include a thumbnail image that represents the document. The channel could display the thumbnail image instead of the document. When the user clicks the image, the channel would open the document.
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThumbnailUrl(@javax.annotation.Nullable final String value) {
        this._thumbnailUrl = value;
    }
}
