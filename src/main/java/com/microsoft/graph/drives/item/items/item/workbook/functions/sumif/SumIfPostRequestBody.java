package com.microsoft.graph.drives.item.items.item.workbook.functions.sumif;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SumIfPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The criteria property
     */
    private Json criteria;
    /**
     * The range property
     */
    private Json range;
    /**
     * The sumRange property
     */
    private Json sumRange;
    /**
     * Instantiates a new sumIfPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SumIfPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sumIfPostRequestBody
     */
    @javax.annotation.Nonnull
    public static SumIfPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SumIfPostRequestBody();
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
     * Gets the criteria property value. The criteria property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getCriteria() {
        return this.criteria;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("criteria", (n) -> { this.setCriteria(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("range", (n) -> { this.setRange(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("sumRange", (n) -> { this.setSumRange(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the range property value. The range property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getRange() {
        return this.range;
    }
    /**
     * Gets the sumRange property value. The sumRange property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getSumRange() {
        return this.sumRange;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("criteria", this.getCriteria());
        writer.writeObjectValue("range", this.getRange());
        writer.writeObjectValue("sumRange", this.getSumRange());
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
     * Sets the criteria property value. The criteria property
     * @param value Value to set for the criteria property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCriteria(@javax.annotation.Nullable final Json value) {
        this.criteria = value;
    }
    /**
     * Sets the range property value. The range property
     * @param value Value to set for the range property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRange(@javax.annotation.Nullable final Json value) {
        this.range = value;
    }
    /**
     * Sets the sumRange property value. The sumRange property
     * @param value Value to set for the sumRange property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSumRange(@javax.annotation.Nullable final Json value) {
        this.sumRange = value;
    }
}
