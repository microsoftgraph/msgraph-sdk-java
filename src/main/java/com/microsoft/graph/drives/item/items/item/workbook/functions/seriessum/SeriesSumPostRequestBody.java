package com.microsoft.graph.drives.item.items.item.workbook.functions.seriessum;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SeriesSumPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The coefficients property */
    private Json coefficients;
    /** The m property */
    private Json m;
    /** The n property */
    private Json n;
    /** The x property */
    private Json x;
    /**
     * Instantiates a new seriesSumPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SeriesSumPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a seriesSumPostRequestBody
     */
    @javax.annotation.Nonnull
    public static SeriesSumPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SeriesSumPostRequestBody();
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
     * Gets the coefficients property value. The coefficients property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getCoefficients() {
        return this.coefficients;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("coefficients", (n) -> { this.setCoefficients(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("m", (n) -> { this.setM(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("n", (n) -> { this.setN(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("x", (n) -> { this.setX(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the m property value. The m property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getM() {
        return this.m;
    }
    /**
     * Gets the n property value. The n property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getN() {
        return this.n;
    }
    /**
     * Gets the x property value. The x property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getX() {
        return this.x;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("coefficients", this.getCoefficients());
        writer.writeObjectValue("m", this.getM());
        writer.writeObjectValue("n", this.getN());
        writer.writeObjectValue("x", this.getX());
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
     * Sets the coefficients property value. The coefficients property
     * @param value Value to set for the coefficients property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCoefficients(@javax.annotation.Nullable final Json value) {
        this.coefficients = value;
    }
    /**
     * Sets the m property value. The m property
     * @param value Value to set for the m property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setM(@javax.annotation.Nullable final Json value) {
        this.m = value;
    }
    /**
     * Sets the n property value. The n property
     * @param value Value to set for the n property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setN(@javax.annotation.Nullable final Json value) {
        this.n = value;
    }
    /**
     * Sets the x property value. The x property
     * @param value Value to set for the x property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setX(@javax.annotation.Nullable final Json value) {
        this.x = value;
    }
}
