package com.microsoft.graph.drives.item.items.item.workbook.functions.accrint;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccrIntPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The basis property
     */
    private Json basis;
    /**
     * The calcMethod property
     */
    private Json calcMethod;
    /**
     * The firstInterest property
     */
    private Json firstInterest;
    /**
     * The frequency property
     */
    private Json frequency;
    /**
     * The issue property
     */
    private Json issue;
    /**
     * The par property
     */
    private Json par;
    /**
     * The rate property
     */
    private Json rate;
    /**
     * The settlement property
     */
    private Json settlement;
    /**
     * Instantiates a new AccrIntPostRequestBody and sets the default values.
     */
    public AccrIntPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccrIntPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AccrIntPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccrIntPostRequestBody();
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
     * Gets the calcMethod property value. The calcMethod property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getCalcMethod() {
        return this.calcMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("basis", (n) -> { this.setBasis(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("calcMethod", (n) -> { this.setCalcMethod(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("firstInterest", (n) -> { this.setFirstInterest(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("frequency", (n) -> { this.setFrequency(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("issue", (n) -> { this.setIssue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("par", (n) -> { this.setPar(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("settlement", (n) -> { this.setSettlement(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstInterest property value. The firstInterest property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getFirstInterest() {
        return this.firstInterest;
    }
    /**
     * Gets the frequency property value. The frequency property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getFrequency() {
        return this.frequency;
    }
    /**
     * Gets the issue property value. The issue property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getIssue() {
        return this.issue;
    }
    /**
     * Gets the par property value. The par property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getPar() {
        return this.par;
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
     * Gets the settlement property value. The settlement property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getSettlement() {
        return this.settlement;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("basis", this.getBasis());
        writer.writeObjectValue("calcMethod", this.getCalcMethod());
        writer.writeObjectValue("firstInterest", this.getFirstInterest());
        writer.writeObjectValue("frequency", this.getFrequency());
        writer.writeObjectValue("issue", this.getIssue());
        writer.writeObjectValue("par", this.getPar());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("settlement", this.getSettlement());
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
     * Sets the calcMethod property value. The calcMethod property
     * @param value Value to set for the calcMethod property.
     */
    public void setCalcMethod(@jakarta.annotation.Nullable final Json value) {
        this.calcMethod = value;
    }
    /**
     * Sets the firstInterest property value. The firstInterest property
     * @param value Value to set for the firstInterest property.
     */
    public void setFirstInterest(@jakarta.annotation.Nullable final Json value) {
        this.firstInterest = value;
    }
    /**
     * Sets the frequency property value. The frequency property
     * @param value Value to set for the frequency property.
     */
    public void setFrequency(@jakarta.annotation.Nullable final Json value) {
        this.frequency = value;
    }
    /**
     * Sets the issue property value. The issue property
     * @param value Value to set for the issue property.
     */
    public void setIssue(@jakarta.annotation.Nullable final Json value) {
        this.issue = value;
    }
    /**
     * Sets the par property value. The par property
     * @param value Value to set for the par property.
     */
    public void setPar(@jakarta.annotation.Nullable final Json value) {
        this.par = value;
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     */
    public void setRate(@jakarta.annotation.Nullable final Json value) {
        this.rate = value;
    }
    /**
     * Sets the settlement property value. The settlement property
     * @param value Value to set for the settlement property.
     */
    public void setSettlement(@jakarta.annotation.Nullable final Json value) {
        this.settlement = value;
    }
}
