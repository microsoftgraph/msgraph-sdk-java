package com.microsoft.graph.drives.item.items.item.workbook.functions.tbilleq;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TbillEqPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The discount property
     */
    private Json discount;
    /**
     * The maturity property
     */
    private Json maturity;
    /**
     * The settlement property
     */
    private Json settlement;
    /**
     * Instantiates a new tbillEqPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TbillEqPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tbillEqPostRequestBody
     */
    @javax.annotation.Nonnull
    public static TbillEqPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TbillEqPostRequestBody();
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
     * Gets the discount property value. The discount property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getDiscount() {
        return this.discount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("discount", (n) -> { this.setDiscount(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("maturity", (n) -> { this.setMaturity(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("settlement", (n) -> { this.setSettlement(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the settlement property value. The settlement property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getSettlement() {
        return this.settlement;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("discount", this.getDiscount());
        writer.writeObjectValue("maturity", this.getMaturity());
        writer.writeObjectValue("settlement", this.getSettlement());
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
     * Sets the discount property value. The discount property
     * @param value Value to set for the discount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscount(@javax.annotation.Nullable final Json value) {
        this.discount = value;
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
     * Sets the settlement property value. The settlement property
     * @param value Value to set for the settlement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettlement(@javax.annotation.Nullable final Json value) {
        this.settlement = value;
    }
}
