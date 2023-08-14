package com.microsoft.graph.drives.item.items.item.workbook.functions.findb;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FindBPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The findText property
     */
    private Json findText;
    /**
     * The startNum property
     */
    private Json startNum;
    /**
     * The withinText property
     */
    private Json withinText;
    /**
     * Instantiates a new findBPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public FindBPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a findBPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static FindBPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FindBPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("findText", (n) -> { this.setFindText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startNum", (n) -> { this.setStartNum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("withinText", (n) -> { this.setWithinText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the findText property value. The findText property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getFindText() {
        return this.findText;
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
     * Gets the withinText property value. The withinText property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getWithinText() {
        return this.withinText;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("findText", this.getFindText());
        writer.writeObjectValue("startNum", this.getStartNum());
        writer.writeObjectValue("withinText", this.getWithinText());
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
     * Sets the findText property value. The findText property
     * @param value Value to set for the findText property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFindText(@jakarta.annotation.Nullable final Json value) {
        this.findText = value;
    }
    /**
     * Sets the startNum property value. The startNum property
     * @param value Value to set for the startNum property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartNum(@jakarta.annotation.Nullable final Json value) {
        this.startNum = value;
    }
    /**
     * Sets the withinText property value. The withinText property
     * @param value Value to set for the withinText property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWithinText(@jakarta.annotation.Nullable final Json value) {
        this.withinText = value;
    }
}
