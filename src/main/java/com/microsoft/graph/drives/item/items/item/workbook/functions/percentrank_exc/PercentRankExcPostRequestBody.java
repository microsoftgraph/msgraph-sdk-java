package com.microsoft.graph.drives.item.items.item.workbook.functions.percentrank_exc;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PercentRankExcPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The array property
     */
    private Json array;
    /**
     * The significance property
     */
    private Json significance;
    /**
     * The x property
     */
    private Json x;
    /**
     * Instantiates a new PercentRankExcPostRequestBody and sets the default values.
     */
    public PercentRankExcPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PercentRankExcPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static PercentRankExcPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PercentRankExcPostRequestBody();
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
     * Gets the array property value. The array property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getArray() {
        return this.array;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("array", (n) -> { this.setArray(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("significance", (n) -> { this.setSignificance(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("x", (n) -> { this.setX(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the significance property value. The significance property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getSignificance() {
        return this.significance;
    }
    /**
     * Gets the x property value. The x property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getX() {
        return this.x;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("array", this.getArray());
        writer.writeObjectValue("significance", this.getSignificance());
        writer.writeObjectValue("x", this.getX());
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
     * Sets the array property value. The array property
     * @param value Value to set for the array property.
     */
    public void setArray(@jakarta.annotation.Nullable final Json value) {
        this.array = value;
    }
    /**
     * Sets the significance property value. The significance property
     * @param value Value to set for the significance property.
     */
    public void setSignificance(@jakarta.annotation.Nullable final Json value) {
        this.significance = value;
    }
    /**
     * Sets the x property value. The x property
     * @param value Value to set for the x property.
     */
    public void setX(@jakarta.annotation.Nullable final Json value) {
        this.x = value;
    }
}
