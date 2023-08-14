package com.microsoft.graph.drives.item.items.item.workbook.functions.lognorm_inv;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LogNormInvPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The mean property
     */
    private Json mean;
    /**
     * The probability property
     */
    private Json probability;
    /**
     * The standardDev property
     */
    private Json standardDev;
    /**
     * Instantiates a new LogNormInvPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public LogNormInvPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LogNormInvPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static LogNormInvPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LogNormInvPostRequestBody();
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
        deserializerMap.put("mean", (n) -> { this.setMean(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("probability", (n) -> { this.setProbability(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("standardDev", (n) -> { this.setStandardDev(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mean property value. The mean property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getMean() {
        return this.mean;
    }
    /**
     * Gets the probability property value. The probability property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getProbability() {
        return this.probability;
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("mean", this.getMean());
        writer.writeObjectValue("probability", this.getProbability());
        writer.writeObjectValue("standardDev", this.getStandardDev());
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
     * Sets the mean property value. The mean property
     * @param value Value to set for the mean property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMean(@jakarta.annotation.Nullable final Json value) {
        this.mean = value;
    }
    /**
     * Sets the probability property value. The probability property
     * @param value Value to set for the probability property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProbability(@jakarta.annotation.Nullable final Json value) {
        this.probability = value;
    }
    /**
     * Sets the standardDev property value. The standardDev property
     * @param value Value to set for the standardDev property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStandardDev(@jakarta.annotation.Nullable final Json value) {
        this.standardDev = value;
    }
}
