package com.microsoft.graph.drives.item.items.item.workbook.functions.convert;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConvertPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The fromUnit property
     */
    private Json fromUnit;
    /**
     * The number property
     */
    private Json number;
    /**
     * The toUnit property
     */
    private Json toUnit;
    /**
     * Instantiates a new convertPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConvertPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a convertPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ConvertPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConvertPostRequestBody();
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
        deserializerMap.put("fromUnit", (n) -> { this.setFromUnit(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("toUnit", (n) -> { this.setToUnit(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fromUnit property value. The fromUnit property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getFromUnit() {
        return this.fromUnit;
    }
    /**
     * Gets the number property value. The number property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNumber() {
        return this.number;
    }
    /**
     * Gets the toUnit property value. The toUnit property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getToUnit() {
        return this.toUnit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("fromUnit", this.getFromUnit());
        writer.writeObjectValue("number", this.getNumber());
        writer.writeObjectValue("toUnit", this.getToUnit());
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
     * Sets the fromUnit property value. The fromUnit property
     * @param value Value to set for the fromUnit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFromUnit(@javax.annotation.Nullable final Json value) {
        this.fromUnit = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber(@javax.annotation.Nullable final Json value) {
        this.number = value;
    }
    /**
     * Sets the toUnit property value. The toUnit property
     * @param value Value to set for the toUnit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setToUnit(@javax.annotation.Nullable final Json value) {
        this.toUnit = value;
    }
}
