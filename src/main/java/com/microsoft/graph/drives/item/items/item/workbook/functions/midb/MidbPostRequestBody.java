package com.microsoft.graph.drives.item.items.item.workbook.functions.midb;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MidbPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The numBytes property */
    private Json numBytes;
    /** The startNum property */
    private Json startNum;
    /** The text property */
    private Json text;
    /**
     * Instantiates a new midbPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MidbPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a midbPostRequestBody
     */
    @javax.annotation.Nonnull
    public static MidbPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MidbPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("numBytes", (n) -> { this.setNumBytes(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startNum", (n) -> { this.setStartNum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the numBytes property value. The numBytes property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNumBytes() {
        return this.numBytes;
    }
    /**
     * Gets the startNum property value. The startNum property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getStartNum() {
        return this.startNum;
    }
    /**
     * Gets the text property value. The text property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getText() {
        return this.text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("numBytes", this.getNumBytes());
        writer.writeObjectValue("startNum", this.getStartNum());
        writer.writeObjectValue("text", this.getText());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the numBytes property value. The numBytes property
     * @param value Value to set for the numBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumBytes(@javax.annotation.Nullable final Json value) {
        this.numBytes = value;
    }
    /**
     * Sets the startNum property value. The startNum property
     * @param value Value to set for the startNum property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartNum(@javax.annotation.Nullable final Json value) {
        this.startNum = value;
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setText(@javax.annotation.Nullable final Json value) {
        this.text = value;
    }
}
