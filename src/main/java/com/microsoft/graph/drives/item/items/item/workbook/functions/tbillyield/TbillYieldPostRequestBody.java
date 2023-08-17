package com.microsoft.graph.drives.item.items.item.workbook.functions.tbillyield;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TbillYieldPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The maturity property
     */
    private Json maturity;
    /**
     * The pr property
     */
    private Json pr;
    /**
     * The settlement property
     */
    private Json settlement;
    /**
     * Instantiates a new tbillYieldPostRequestBody and sets the default values.
     */
    public TbillYieldPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tbillYieldPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static TbillYieldPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TbillYieldPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("maturity", (n) -> { this.setMaturity(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("pr", (n) -> { this.setPr(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("settlement", (n) -> { this.setSettlement(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the maturity property value. The maturity property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getMaturity() {
        return this.maturity;
    }
    /**
     * Gets the pr property value. The pr property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getPr() {
        return this.pr;
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
        writer.writeObjectValue("maturity", this.getMaturity());
        writer.writeObjectValue("pr", this.getPr());
        writer.writeObjectValue("settlement", this.getSettlement());
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
     * Sets the maturity property value. The maturity property
     * @param value Value to set for the maturity property.
     */
    public void setMaturity(@jakarta.annotation.Nullable final Json value) {
        this.maturity = value;
    }
    /**
     * Sets the pr property value. The pr property
     * @param value Value to set for the pr property.
     */
    public void setPr(@jakarta.annotation.Nullable final Json value) {
        this.pr = value;
    }
    /**
     * Sets the settlement property value. The settlement property
     * @param value Value to set for the settlement property.
     */
    public void setSettlement(@jakarta.annotation.Nullable final Json value) {
        this.settlement = value;
    }
}
