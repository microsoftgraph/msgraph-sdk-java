package com.microsoft.graph.drives.item.items.item.workbook.functions.fixed;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FixedPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The decimals property
     */
    private Json decimals;
    /**
     * The noCommas property
     */
    private Json noCommas;
    /**
     * The number property
     */
    private Json number;
    /**
     * Instantiates a new FixedPostRequestBody and sets the default values.
     */
    public FixedPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FixedPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static FixedPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FixedPostRequestBody();
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
     * Gets the decimals property value. The decimals property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getDecimals() {
        return this.decimals;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("decimals", (n) -> { this.setDecimals(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("noCommas", (n) -> { this.setNoCommas(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the noCommas property value. The noCommas property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNoCommas() {
        return this.noCommas;
    }
    /**
     * Gets the number property value. The number property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNumber() {
        return this.number;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("decimals", this.getDecimals());
        writer.writeObjectValue("noCommas", this.getNoCommas());
        writer.writeObjectValue("number", this.getNumber());
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
     * Sets the decimals property value. The decimals property
     * @param value Value to set for the decimals property.
     */
    public void setDecimals(@jakarta.annotation.Nullable final Json value) {
        this.decimals = value;
    }
    /**
     * Sets the noCommas property value. The noCommas property
     * @param value Value to set for the noCommas property.
     */
    public void setNoCommas(@jakarta.annotation.Nullable final Json value) {
        this.noCommas = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final Json value) {
        this.number = value;
    }
}
