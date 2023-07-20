package com.microsoft.graph.drives.item.items.item.workbook.functions.complex;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ComplexPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The iNum property
     */
    private Json iNum;
    /**
     * The realNum property
     */
    private Json realNum;
    /**
     * The suffix property
     */
    private Json suffix;
    /**
     * Instantiates a new complexPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ComplexPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a complexPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ComplexPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComplexPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("iNum", (n) -> { this.setINum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("realNum", (n) -> { this.setRealNum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("suffix", (n) -> { this.setSuffix(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the iNum property value. The iNum property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getINum() {
        return this.iNum;
    }
    /**
     * Gets the realNum property value. The realNum property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getRealNum() {
        return this.realNum;
    }
    /**
     * Gets the suffix property value. The suffix property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getSuffix() {
        return this.suffix;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("iNum", this.getINum());
        writer.writeObjectValue("realNum", this.getRealNum());
        writer.writeObjectValue("suffix", this.getSuffix());
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
     * Sets the iNum property value. The iNum property
     * @param value Value to set for the iNum property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setINum(@javax.annotation.Nullable final Json value) {
        this.iNum = value;
    }
    /**
     * Sets the realNum property value. The realNum property
     * @param value Value to set for the realNum property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRealNum(@javax.annotation.Nullable final Json value) {
        this.realNum = value;
    }
    /**
     * Sets the suffix property value. The suffix property
     * @param value Value to set for the suffix property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuffix(@javax.annotation.Nullable final Json value) {
        this.suffix = value;
    }
}
