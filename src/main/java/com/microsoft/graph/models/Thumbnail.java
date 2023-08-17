package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Thumbnail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The content stream for the thumbnail.
     */
    private byte[] content;
    /**
     * The height of the thumbnail, in pixels.
     */
    private Integer height;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The unique identifier of the item that provided the thumbnail. This is only available when a folder thumbnail is requested.
     */
    private String sourceItemId;
    /**
     * The URL used to fetch the thumbnail content.
     */
    private String url;
    /**
     * The width of the thumbnail, in pixels.
     */
    private Integer width;
    /**
     * Instantiates a new thumbnail and sets the default values.
     */
    public Thumbnail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a thumbnail
     */
    @jakarta.annotation.Nonnull
    public static Thumbnail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Thumbnail();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the content property value. The content stream for the thumbnail.
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sourceItemId", (n) -> { this.setSourceItemId(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the height property value. The height of the thumbnail, in pixels.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getHeight() {
        return this.height;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the sourceItemId property value. The unique identifier of the item that provided the thumbnail. This is only available when a folder thumbnail is requested.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSourceItemId() {
        return this.sourceItemId;
    }
    /**
     * Gets the url property value. The URL used to fetch the thumbnail content.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Gets the width property value. The width of the thumbnail, in pixels.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sourceItemId", this.getSourceItemId());
        writer.writeStringValue("url", this.getUrl());
        writer.writeIntegerValue("width", this.getWidth());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the content property value. The content stream for the thumbnail.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the height property value. The height of the thumbnail, in pixels.
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final Integer value) {
        this.height = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sourceItemId property value. The unique identifier of the item that provided the thumbnail. This is only available when a folder thumbnail is requested.
     * @param value Value to set for the sourceItemId property.
     */
    public void setSourceItemId(@jakarta.annotation.Nullable final String value) {
        this.sourceItemId = value;
    }
    /**
     * Sets the url property value. The URL used to fetch the thumbnail content.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
    /**
     * Sets the width property value. The width of the thumbnail, in pixels.
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final Integer value) {
        this.width = value;
    }
}
