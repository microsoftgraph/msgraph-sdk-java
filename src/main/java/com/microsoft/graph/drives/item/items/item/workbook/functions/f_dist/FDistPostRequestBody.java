package com.microsoft.graph.drives.item.items.item.workbook.functions.f_dist;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FDistPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cumulative property
     */
    private Json cumulative;
    /**
     * The degFreedom1 property
     */
    private Json degFreedom1;
    /**
     * The degFreedom2 property
     */
    private Json degFreedom2;
    /**
     * The x property
     */
    private Json x;
    /**
     * Instantiates a new FDistPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public FDistPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FDistPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static FDistPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FDistPostRequestBody();
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
     * Gets the cumulative property value. The cumulative property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getCumulative() {
        return this.cumulative;
    }
    /**
     * Gets the degFreedom1 property value. The degFreedom1 property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getDegFreedom1() {
        return this.degFreedom1;
    }
    /**
     * Gets the degFreedom2 property value. The degFreedom2 property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getDegFreedom2() {
        return this.degFreedom2;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cumulative", (n) -> { this.setCumulative(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("degFreedom1", (n) -> { this.setDegFreedom1(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("degFreedom2", (n) -> { this.setDegFreedom2(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("x", (n) -> { this.setX(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the x property value. The x property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getX() {
        return this.x;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cumulative", this.getCumulative());
        writer.writeObjectValue("degFreedom1", this.getDegFreedom1());
        writer.writeObjectValue("degFreedom2", this.getDegFreedom2());
        writer.writeObjectValue("x", this.getX());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the cumulative property value. The cumulative property
     * @param value Value to set for the cumulative property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCumulative(@jakarta.annotation.Nullable final Json value) {
        this.cumulative = value;
    }
    /**
     * Sets the degFreedom1 property value. The degFreedom1 property
     * @param value Value to set for the degFreedom1 property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDegFreedom1(@jakarta.annotation.Nullable final Json value) {
        this.degFreedom1 = value;
    }
    /**
     * Sets the degFreedom2 property value. The degFreedom2 property
     * @param value Value to set for the degFreedom2 property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDegFreedom2(@jakarta.annotation.Nullable final Json value) {
        this.degFreedom2 = value;
    }
    /**
     * Sets the x property value. The x property
     * @param value Value to set for the x property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setX(@jakarta.annotation.Nullable final Json value) {
        this.x = value;
    }
}
