package com.microsoft.graph.drives.item.items.item.workbook.functions.fv;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FvPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The nper property
     */
    private Json nper;
    /**
     * The pmt property
     */
    private Json pmt;
    /**
     * The pv property
     */
    private Json pv;
    /**
     * The rate property
     */
    private Json rate;
    /**
     * The type property
     */
    private Json type;
    /**
     * Instantiates a new fvPostRequestBody and sets the default values.
     */
    public FvPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fvPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static FvPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FvPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("nper", (n) -> { this.setNper(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("pmt", (n) -> { this.setPmt(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("pv", (n) -> { this.setPv(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the nper property value. The nper property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNper() {
        return this.nper;
    }
    /**
     * Gets the pmt property value. The pmt property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getPmt() {
        return this.pmt;
    }
    /**
     * Gets the pv property value. The pv property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getPv() {
        return this.pv;
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
     * Gets the type property value. The type property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("nper", this.getNper());
        writer.writeObjectValue("pmt", this.getPmt());
        writer.writeObjectValue("pv", this.getPv());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("type", this.getType());
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
     * Sets the nper property value. The nper property
     * @param value Value to set for the nper property.
     */
    public void setNper(@jakarta.annotation.Nullable final Json value) {
        this.nper = value;
    }
    /**
     * Sets the pmt property value. The pmt property
     * @param value Value to set for the pmt property.
     */
    public void setPmt(@jakarta.annotation.Nullable final Json value) {
        this.pmt = value;
    }
    /**
     * Sets the pv property value. The pv property
     * @param value Value to set for the pv property.
     */
    public void setPv(@jakarta.annotation.Nullable final Json value) {
        this.pv = value;
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     */
    public void setRate(@jakarta.annotation.Nullable final Json value) {
        this.rate = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final Json value) {
        this.type = value;
    }
}
