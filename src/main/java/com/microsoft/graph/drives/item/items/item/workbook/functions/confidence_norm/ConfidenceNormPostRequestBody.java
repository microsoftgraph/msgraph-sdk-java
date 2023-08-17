package com.microsoft.graph.drives.item.items.item.workbook.functions.confidence_norm;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConfidenceNormPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The alpha property
     */
    private Json alpha;
    /**
     * The size property
     */
    private Json size;
    /**
     * The standardDev property
     */
    private Json standardDev;
    /**
     * Instantiates a new ConfidenceNormPostRequestBody and sets the default values.
     */
    public ConfidenceNormPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConfidenceNormPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ConfidenceNormPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfidenceNormPostRequestBody();
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
     * Gets the alpha property value. The alpha property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getAlpha() {
        return this.alpha;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("alpha", (n) -> { this.setAlpha(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("standardDev", (n) -> { this.setStandardDev(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the size property value. The size property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getSize() {
        return this.size;
    }
    /**
     * Gets the standardDev property value. The standardDev property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getStandardDev() {
        return this.standardDev;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("alpha", this.getAlpha());
        writer.writeObjectValue("size", this.getSize());
        writer.writeObjectValue("standardDev", this.getStandardDev());
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
     * Sets the alpha property value. The alpha property
     * @param value Value to set for the alpha property.
     */
    public void setAlpha(@jakarta.annotation.Nullable final Json value) {
        this.alpha = value;
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Json value) {
        this.size = value;
    }
    /**
     * Sets the standardDev property value. The standardDev property
     * @param value Value to set for the standardDev property.
     */
    public void setStandardDev(@jakarta.annotation.Nullable final Json value) {
        this.standardDev = value;
    }
}
