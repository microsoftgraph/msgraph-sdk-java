package com.microsoft.graph.drives.item.items.item.workbook.functions.f_dist_rt;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FDistRTPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
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
     * Instantiates a new FDistRTPostRequestBody and sets the default values.
     */
    public FDistRTPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FDistRTPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static FDistRTPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FDistRTPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
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
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("degFreedom1", this.getDegFreedom1());
        writer.writeObjectValue("degFreedom2", this.getDegFreedom2());
        writer.writeObjectValue("x", this.getX());
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
     * Sets the degFreedom1 property value. The degFreedom1 property
     * @param value Value to set for the degFreedom1 property.
     */
    public void setDegFreedom1(@jakarta.annotation.Nullable final Json value) {
        this.degFreedom1 = value;
    }
    /**
     * Sets the degFreedom2 property value. The degFreedom2 property
     * @param value Value to set for the degFreedom2 property.
     */
    public void setDegFreedom2(@jakarta.annotation.Nullable final Json value) {
        this.degFreedom2 = value;
    }
    /**
     * Sets the x property value. The x property
     * @param value Value to set for the x property.
     */
    public void setX(@jakarta.annotation.Nullable final Json value) {
        this.x = value;
    }
}
