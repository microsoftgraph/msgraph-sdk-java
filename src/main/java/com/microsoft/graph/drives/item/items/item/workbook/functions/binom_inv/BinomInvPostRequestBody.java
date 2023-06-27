package com.microsoft.graph.drives.item.items.item.workbook.functions.binom_inv;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BinomInvPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The alpha property
     */
    private Json alpha;
    /**
     * The probabilityS property
     */
    private Json probabilityS;
    /**
     * The trials property
     */
    private Json trials;
    /**
     * Instantiates a new BinomInvPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BinomInvPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BinomInvPostRequestBody
     */
    @javax.annotation.Nonnull
    public static BinomInvPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BinomInvPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("alpha", (n) -> { this.setAlpha(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("probabilityS", (n) -> { this.setProbabilityS(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("trials", (n) -> { this.setTrials(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the probabilityS property value. The probabilityS property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getProbabilityS() {
        return this.probabilityS;
    }
    /**
     * Gets the trials property value. The trials property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getTrials() {
        return this.trials;
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
        writer.writeObjectValue("probabilityS", this.getProbabilityS());
        writer.writeObjectValue("trials", this.getTrials());
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
     * Sets the alpha property value. The alpha property
     * @param value Value to set for the alpha property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlpha(@javax.annotation.Nullable final Json value) {
        this.alpha = value;
    }
    /**
     * Sets the probabilityS property value. The probabilityS property
     * @param value Value to set for the probabilityS property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProbabilityS(@javax.annotation.Nullable final Json value) {
        this.probabilityS = value;
    }
    /**
     * Sets the trials property value. The trials property
     * @param value Value to set for the trials property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrials(@javax.annotation.Nullable final Json value) {
        this.trials = value;
    }
}
