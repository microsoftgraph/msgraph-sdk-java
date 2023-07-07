package com.microsoft.graph.drives.item.items.item.workbook.functions.atan2;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Atan2PostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The xNum property
     */
    private Json xNum;
    /**
     * The yNum property
     */
    private Json yNum;
    /**
     * Instantiates a new atan2PostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Atan2PostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a atan2PostRequestBody
     */
    @javax.annotation.Nonnull
    public static Atan2PostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Atan2PostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("xNum", (n) -> { this.setXNum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("yNum", (n) -> { this.setYNum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the xNum property value. The xNum property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getXNum() {
        return this.xNum;
    }
    /**
     * Gets the yNum property value. The yNum property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getYNum() {
        return this.yNum;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("xNum", this.getXNum());
        writer.writeObjectValue("yNum", this.getYNum());
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
     * Sets the xNum property value. The xNum property
     * @param value Value to set for the xNum property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setXNum(@javax.annotation.Nullable final Json value) {
        this.xNum = value;
    }
    /**
     * Sets the yNum property value. The yNum property
     * @param value Value to set for the yNum property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYNum(@javax.annotation.Nullable final Json value) {
        this.yNum = value;
    }
}
