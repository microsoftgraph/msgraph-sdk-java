package com.microsoft.graph.drives.item.items.item.workbook.functions.dollarde;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DollarDePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The fraction property
     */
    private Json fraction;
    /**
     * The fractionalDollar property
     */
    private Json fractionalDollar;
    /**
     * Instantiates a new DollarDePostRequestBody and sets the default values.
     */
    public DollarDePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DollarDePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static DollarDePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DollarDePostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("fraction", (n) -> { this.setFraction(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("fractionalDollar", (n) -> { this.setFractionalDollar(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fraction property value. The fraction property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getFraction() {
        return this.fraction;
    }
    /**
     * Gets the fractionalDollar property value. The fractionalDollar property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getFractionalDollar() {
        return this.fractionalDollar;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("fraction", this.getFraction());
        writer.writeObjectValue("fractionalDollar", this.getFractionalDollar());
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
     * Sets the fraction property value. The fraction property
     * @param value Value to set for the fraction property.
     */
    public void setFraction(@jakarta.annotation.Nullable final Json value) {
        this.fraction = value;
    }
    /**
     * Sets the fractionalDollar property value. The fractionalDollar property
     * @param value Value to set for the fractionalDollar property.
     */
    public void setFractionalDollar(@jakarta.annotation.Nullable final Json value) {
        this.fractionalDollar = value;
    }
}
