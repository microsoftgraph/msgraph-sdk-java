package com.microsoft.graph.drives.item.items.item.workbook.functions.dollarfr;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DollarFrPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The decimalDollar property */
    private Json decimalDollar;
    /** The fraction property */
    private Json fraction;
    /**
     * Instantiates a new dollarFrPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DollarFrPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dollarFrPostRequestBody
     */
    @javax.annotation.Nonnull
    public static DollarFrPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DollarFrPostRequestBody();
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
     * Gets the decimalDollar property value. The decimalDollar property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getDecimalDollar() {
        return this.decimalDollar;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("decimalDollar", (n) -> { this.setDecimalDollar(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("fraction", (n) -> { this.setFraction(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fraction property value. The fraction property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getFraction() {
        return this.fraction;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("decimalDollar", this.getDecimalDollar());
        writer.writeObjectValue("fraction", this.getFraction());
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
     * Sets the decimalDollar property value. The decimalDollar property
     * @param value Value to set for the decimalDollar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDecimalDollar(@javax.annotation.Nullable final Json value) {
        this.decimalDollar = value;
    }
    /**
     * Sets the fraction property value. The fraction property
     * @param value Value to set for the fraction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFraction(@javax.annotation.Nullable final Json value) {
        this.fraction = value;
    }
}
