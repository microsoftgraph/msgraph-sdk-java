package com.microsoft.graph.drives.item.items.item.workbook.functions.xnpv;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class XnpvPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The dates property
     */
    private Json dates;
    /**
     * The rate property
     */
    private Json rate;
    /**
     * The values property
     */
    private Json values;
    /**
     * Instantiates a new XnpvPostRequestBody and sets the default values.
     */
    public XnpvPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a XnpvPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static XnpvPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new XnpvPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the dates property value. The dates property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getDates() {
        return this.dates;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("dates", (n) -> { this.setDates(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rate property value. The rate property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getRate() {
        return this.rate;
    }
    /**
     * Gets the values property value. The values property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getValues() {
        return this.values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("dates", this.getDates());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("values", this.getValues());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the dates property value. The dates property
     * @param value Value to set for the dates property.
     */
    public void setDates(@jakarta.annotation.Nullable final Json value) {
        this.dates = value;
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     */
    public void setRate(@jakarta.annotation.Nullable final Json value) {
        this.rate = value;
    }
    /**
     * Sets the values property value. The values property
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final Json value) {
        this.values = value;
    }
}
