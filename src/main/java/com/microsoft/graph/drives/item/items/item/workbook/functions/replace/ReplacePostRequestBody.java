package com.microsoft.graph.drives.item.items.item.workbook.functions.replace;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ReplacePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The newText property
     */
    private Json newText;
    /**
     * The numChars property
     */
    private Json numChars;
    /**
     * The oldText property
     */
    private Json oldText;
    /**
     * The startNum property
     */
    private Json startNum;
    /**
     * Instantiates a new replacePostRequestBody and sets the default values.
     */
    public ReplacePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a replacePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ReplacePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReplacePostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("newText", (n) -> { this.setNewText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("numChars", (n) -> { this.setNumChars(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("oldText", (n) -> { this.setOldText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startNum", (n) -> { this.setStartNum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the newText property value. The newText property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNewText() {
        return this.newText;
    }
    /**
     * Gets the numChars property value. The numChars property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNumChars() {
        return this.numChars;
    }
    /**
     * Gets the oldText property value. The oldText property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getOldText() {
        return this.oldText;
    }
    /**
     * Gets the startNum property value. The startNum property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getStartNum() {
        return this.startNum;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("newText", this.getNewText());
        writer.writeObjectValue("numChars", this.getNumChars());
        writer.writeObjectValue("oldText", this.getOldText());
        writer.writeObjectValue("startNum", this.getStartNum());
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
     * Sets the newText property value. The newText property
     * @param value Value to set for the newText property.
     */
    public void setNewText(@jakarta.annotation.Nullable final Json value) {
        this.newText = value;
    }
    /**
     * Sets the numChars property value. The numChars property
     * @param value Value to set for the numChars property.
     */
    public void setNumChars(@jakarta.annotation.Nullable final Json value) {
        this.numChars = value;
    }
    /**
     * Sets the oldText property value. The oldText property
     * @param value Value to set for the oldText property.
     */
    public void setOldText(@jakarta.annotation.Nullable final Json value) {
        this.oldText = value;
    }
    /**
     * Sets the startNum property value. The startNum property
     * @param value Value to set for the startNum property.
     */
    public void setStartNum(@jakarta.annotation.Nullable final Json value) {
        this.startNum = value;
    }
}
