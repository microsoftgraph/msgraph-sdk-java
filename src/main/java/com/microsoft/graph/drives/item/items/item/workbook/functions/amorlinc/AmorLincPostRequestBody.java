package com.microsoft.graph.drives.item.items.item.workbook.functions.amorlinc;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AmorLincPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The basis property
     */
    private Json basis;
    /**
     * The cost property
     */
    private Json cost;
    /**
     * The datePurchased property
     */
    private Json datePurchased;
    /**
     * The firstPeriod property
     */
    private Json firstPeriod;
    /**
     * The period property
     */
    private Json period;
    /**
     * The rate property
     */
    private Json rate;
    /**
     * The salvage property
     */
    private Json salvage;
    /**
     * Instantiates a new AmorLincPostRequestBody and sets the default values.
     */
    public AmorLincPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AmorLincPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AmorLincPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AmorLincPostRequestBody();
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
     * Gets the basis property value. The basis property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getBasis() {
        return this.basis;
    }
    /**
     * Gets the cost property value. The cost property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getCost() {
        return this.cost;
    }
    /**
     * Gets the datePurchased property value. The datePurchased property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getDatePurchased() {
        return this.datePurchased;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("basis", (n) -> { this.setBasis(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("cost", (n) -> { this.setCost(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("datePurchased", (n) -> { this.setDatePurchased(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("firstPeriod", (n) -> { this.setFirstPeriod(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("period", (n) -> { this.setPeriod(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("salvage", (n) -> { this.setSalvage(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstPeriod property value. The firstPeriod property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getFirstPeriod() {
        return this.firstPeriod;
    }
    /**
     * Gets the period property value. The period property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getPeriod() {
        return this.period;
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
     * Gets the salvage property value. The salvage property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getSalvage() {
        return this.salvage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("basis", this.getBasis());
        writer.writeObjectValue("cost", this.getCost());
        writer.writeObjectValue("datePurchased", this.getDatePurchased());
        writer.writeObjectValue("firstPeriod", this.getFirstPeriod());
        writer.writeObjectValue("period", this.getPeriod());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("salvage", this.getSalvage());
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
     * Sets the basis property value. The basis property
     * @param value Value to set for the basis property.
     */
    public void setBasis(@jakarta.annotation.Nullable final Json value) {
        this.basis = value;
    }
    /**
     * Sets the cost property value. The cost property
     * @param value Value to set for the cost property.
     */
    public void setCost(@jakarta.annotation.Nullable final Json value) {
        this.cost = value;
    }
    /**
     * Sets the datePurchased property value. The datePurchased property
     * @param value Value to set for the datePurchased property.
     */
    public void setDatePurchased(@jakarta.annotation.Nullable final Json value) {
        this.datePurchased = value;
    }
    /**
     * Sets the firstPeriod property value. The firstPeriod property
     * @param value Value to set for the firstPeriod property.
     */
    public void setFirstPeriod(@jakarta.annotation.Nullable final Json value) {
        this.firstPeriod = value;
    }
    /**
     * Sets the period property value. The period property
     * @param value Value to set for the period property.
     */
    public void setPeriod(@jakarta.annotation.Nullable final Json value) {
        this.period = value;
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     */
    public void setRate(@jakarta.annotation.Nullable final Json value) {
        this.rate = value;
    }
    /**
     * Sets the salvage property value. The salvage property
     * @param value Value to set for the salvage property.
     */
    public void setSalvage(@jakarta.annotation.Nullable final Json value) {
        this.salvage = value;
    }
}
