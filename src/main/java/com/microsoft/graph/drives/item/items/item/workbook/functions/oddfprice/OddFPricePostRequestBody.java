package com.microsoft.graph.drives.item.items.item.workbook.functions.oddfprice;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OddFPricePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The basis property
     */
    private Json basis;
    /**
     * The firstCoupon property
     */
    private Json firstCoupon;
    /**
     * The frequency property
     */
    private Json frequency;
    /**
     * The issue property
     */
    private Json issue;
    /**
     * The maturity property
     */
    private Json maturity;
    /**
     * The rate property
     */
    private Json rate;
    /**
     * The redemption property
     */
    private Json redemption;
    /**
     * The settlement property
     */
    private Json settlement;
    /**
     * The yld property
     */
    private Json yld;
    /**
     * Instantiates a new oddFPricePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OddFPricePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a oddFPricePostRequestBody
     */
    @javax.annotation.Nonnull
    public static OddFPricePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OddFPricePostRequestBody();
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
     * Gets the basis property value. The basis property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getBasis() {
        return this.basis;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("basis", (n) -> { this.setBasis(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("firstCoupon", (n) -> { this.setFirstCoupon(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("frequency", (n) -> { this.setFrequency(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("issue", (n) -> { this.setIssue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("maturity", (n) -> { this.setMaturity(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("redemption", (n) -> { this.setRedemption(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("settlement", (n) -> { this.setSettlement(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("yld", (n) -> { this.setYld(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstCoupon property value. The firstCoupon property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getFirstCoupon() {
        return this.firstCoupon;
    }
    /**
     * Gets the frequency property value. The frequency property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getFrequency() {
        return this.frequency;
    }
    /**
     * Gets the issue property value. The issue property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getIssue() {
        return this.issue;
    }
    /**
     * Gets the maturity property value. The maturity property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getMaturity() {
        return this.maturity;
    }
    /**
     * Gets the rate property value. The rate property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getRate() {
        return this.rate;
    }
    /**
     * Gets the redemption property value. The redemption property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getRedemption() {
        return this.redemption;
    }
    /**
     * Gets the settlement property value. The settlement property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getSettlement() {
        return this.settlement;
    }
    /**
     * Gets the yld property value. The yld property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getYld() {
        return this.yld;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("basis", this.getBasis());
        writer.writeObjectValue("firstCoupon", this.getFirstCoupon());
        writer.writeObjectValue("frequency", this.getFrequency());
        writer.writeObjectValue("issue", this.getIssue());
        writer.writeObjectValue("maturity", this.getMaturity());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("redemption", this.getRedemption());
        writer.writeObjectValue("settlement", this.getSettlement());
        writer.writeObjectValue("yld", this.getYld());
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
     * Sets the basis property value. The basis property
     * @param value Value to set for the basis property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBasis(@javax.annotation.Nullable final Json value) {
        this.basis = value;
    }
    /**
     * Sets the firstCoupon property value. The firstCoupon property
     * @param value Value to set for the firstCoupon property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstCoupon(@javax.annotation.Nullable final Json value) {
        this.firstCoupon = value;
    }
    /**
     * Sets the frequency property value. The frequency property
     * @param value Value to set for the frequency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFrequency(@javax.annotation.Nullable final Json value) {
        this.frequency = value;
    }
    /**
     * Sets the issue property value. The issue property
     * @param value Value to set for the issue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssue(@javax.annotation.Nullable final Json value) {
        this.issue = value;
    }
    /**
     * Sets the maturity property value. The maturity property
     * @param value Value to set for the maturity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaturity(@javax.annotation.Nullable final Json value) {
        this.maturity = value;
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRate(@javax.annotation.Nullable final Json value) {
        this.rate = value;
    }
    /**
     * Sets the redemption property value. The redemption property
     * @param value Value to set for the redemption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedemption(@javax.annotation.Nullable final Json value) {
        this.redemption = value;
    }
    /**
     * Sets the settlement property value. The settlement property
     * @param value Value to set for the settlement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettlement(@javax.annotation.Nullable final Json value) {
        this.settlement = value;
    }
    /**
     * Sets the yld property value. The yld property
     * @param value Value to set for the yld property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYld(@javax.annotation.Nullable final Json value) {
        this.yld = value;
    }
}
