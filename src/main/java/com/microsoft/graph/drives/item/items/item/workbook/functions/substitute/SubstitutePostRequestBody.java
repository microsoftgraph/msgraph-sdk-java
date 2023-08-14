package com.microsoft.graph.drives.item.items.item.workbook.functions.substitute;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubstitutePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The instanceNum property
     */
    private Json instanceNum;
    /**
     * The newText property
     */
    private Json newText;
    /**
     * The oldText property
     */
    private Json oldText;
    /**
     * The text property
     */
    private Json text;
    /**
     * Instantiates a new substitutePostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SubstitutePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a substitutePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SubstitutePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubstitutePostRequestBody();
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
        deserializerMap.put("instanceNum", (n) -> { this.setInstanceNum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("newText", (n) -> { this.setNewText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("oldText", (n) -> { this.setOldText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the instanceNum property value. The instanceNum property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getInstanceNum() {
        return this.instanceNum;
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
     * Gets the oldText property value. The oldText property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getOldText() {
        return this.oldText;
    }
    /**
     * Gets the text property value. The text property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getText() {
        return this.text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("instanceNum", this.getInstanceNum());
        writer.writeObjectValue("newText", this.getNewText());
        writer.writeObjectValue("oldText", this.getOldText());
        writer.writeObjectValue("text", this.getText());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the instanceNum property value. The instanceNum property
     * @param value Value to set for the instanceNum property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInstanceNum(@jakarta.annotation.Nullable final Json value) {
        this.instanceNum = value;
    }
    /**
     * Sets the newText property value. The newText property
     * @param value Value to set for the newText property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNewText(@jakarta.annotation.Nullable final Json value) {
        this.newText = value;
    }
    /**
     * Sets the oldText property value. The oldText property
     * @param value Value to set for the oldText property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOldText(@jakarta.annotation.Nullable final Json value) {
        this.oldText = value;
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setText(@jakarta.annotation.Nullable final Json value) {
        this.text = value;
    }
}
