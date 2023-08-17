package com.microsoft.graph.drives.item.items.item.workbook.functions.ceiling_math;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CeilingMathPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The mode property
     */
    private Json mode;
    /**
     * The number property
     */
    private Json number;
    /**
     * The significance property
     */
    private Json significance;
    /**
     * Instantiates a new CeilingMathPostRequestBody and sets the default values.
     */
    public CeilingMathPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CeilingMathPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static CeilingMathPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CeilingMathPostRequestBody();
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
        deserializerMap.put("mode", (n) -> { this.setMode(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("significance", (n) -> { this.setSignificance(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mode property value. The mode property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getMode() {
        return this.mode;
    }
    /**
     * Gets the number property value. The number property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNumber() {
        return this.number;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("mode", this.getMode());
        writer.writeObjectValue("number", this.getNumber());
        writer.writeObjectValue("significance", this.getSignificance());
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
     * Sets the mode property value. The mode property
     * @param value Value to set for the mode property.
     */
    public void setMode(@jakarta.annotation.Nullable final Json value) {
        this.mode = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final Json value) {
        this.number = value;
    }
    /**
     * Sets the significance property value. The significance property
     * @param value Value to set for the significance property.
     */
    public void setSignificance(@jakarta.annotation.Nullable final Json value) {
        this.significance = value;
    }
}
