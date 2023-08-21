package com.microsoft.graph.drives.item.items.item.workbook.functions.quotient;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QuotientPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The denominator property
     */
    private Json denominator;
    /**
     * The numerator property
     */
    private Json numerator;
    /**
     * Instantiates a new quotientPostRequestBody and sets the default values.
     */
    public QuotientPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a quotientPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static QuotientPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QuotientPostRequestBody();
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
     * Gets the denominator property value. The denominator property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getDenominator() {
        return this.denominator;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("denominator", (n) -> { this.setDenominator(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("numerator", (n) -> { this.setNumerator(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the numerator property value. The numerator property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNumerator() {
        return this.numerator;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("denominator", this.getDenominator());
        writer.writeObjectValue("numerator", this.getNumerator());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the denominator property value. The denominator property
     * @param value Value to set for the denominator property.
     */
    public void setDenominator(@jakarta.annotation.Nullable final Json value) {
        this.denominator = value;
    }
    /**
     * Sets the numerator property value. The numerator property
     * @param value Value to set for the numerator property.
     */
    public void setNumerator(@jakarta.annotation.Nullable final Json value) {
        this.numerator = value;
    }
}
