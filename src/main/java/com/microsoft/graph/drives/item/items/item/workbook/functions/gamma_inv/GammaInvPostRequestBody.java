package com.microsoft.graph.drives.item.items.item.workbook.functions.gamma_inv;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GammaInvPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The alpha property
     */
    private Json alpha;
    /**
     * The beta property
     */
    private Json beta;
    /**
     * The probability property
     */
    private Json probability;
    /**
     * Instantiates a new GammaInvPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GammaInvPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GammaInvPostRequestBody
     */
    @javax.annotation.Nonnull
    public static GammaInvPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GammaInvPostRequestBody();
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
     * Gets the alpha property value. The alpha property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getAlpha() {
        return this.alpha;
    }
    /**
     * Gets the beta property value. The beta property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getBeta() {
        return this.beta;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("alpha", (n) -> { this.setAlpha(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("beta", (n) -> { this.setBeta(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("probability", (n) -> { this.setProbability(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the probability property value. The probability property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getProbability() {
        return this.probability;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("alpha", this.getAlpha());
        writer.writeObjectValue("beta", this.getBeta());
        writer.writeObjectValue("probability", this.getProbability());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the alpha property value. The alpha property
     * @param value Value to set for the alpha property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlpha(@javax.annotation.Nullable final Json value) {
        this.alpha = value;
    }
    /**
     * Sets the beta property value. The beta property
     * @param value Value to set for the beta property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBeta(@javax.annotation.Nullable final Json value) {
        this.beta = value;
    }
    /**
     * Sets the probability property value. The probability property
     * @param value Value to set for the probability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProbability(@javax.annotation.Nullable final Json value) {
        this.probability = value;
    }
}
