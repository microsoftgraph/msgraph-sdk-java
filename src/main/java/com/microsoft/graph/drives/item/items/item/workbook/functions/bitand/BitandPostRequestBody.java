package com.microsoft.graph.drives.item.items.item.workbook.functions.bitand;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BitandPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number1 property
     */
    private Json number1;
    /**
     * The number2 property
     */
    private Json number2;
    /**
     * Instantiates a new bitandPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BitandPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bitandPostRequestBody
     */
    @javax.annotation.Nonnull
    public static BitandPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BitandPostRequestBody();
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
        deserializerMap.put("number1", (n) -> { this.setNumber1(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("number2", (n) -> { this.setNumber2(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the number1 property value. The number1 property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNumber1() {
        return this.number1;
    }
    /**
     * Gets the number2 property value. The number2 property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNumber2() {
        return this.number2;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("number1", this.getNumber1());
        writer.writeObjectValue("number2", this.getNumber2());
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
     * Sets the number1 property value. The number1 property
     * @param value Value to set for the number1 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber1(@javax.annotation.Nullable final Json value) {
        this.number1 = value;
    }
    /**
     * Sets the number2 property value. The number2 property
     * @param value Value to set for the number2 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber2(@javax.annotation.Nullable final Json value) {
        this.number2 = value;
    }
}
