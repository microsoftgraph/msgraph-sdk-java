package com.microsoft.graph.drives.item.items.item.workbook.functions.rank_avg;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RankAvgPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number property
     */
    private Json number;
    /**
     * The order property
     */
    private Json order;
    /**
     * The ref property
     */
    private Json ref;
    /**
     * Instantiates a new RankAvgPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RankAvgPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RankAvgPostRequestBody
     */
    @javax.annotation.Nonnull
    public static RankAvgPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RankAvgPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("number", (n) -> { this.setNumber(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("order", (n) -> { this.setOrder(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("ref", (n) -> { this.setRef(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the number property value. The number property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNumber() {
        return this.number;
    }
    /**
     * Gets the order property value. The order property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getOrder() {
        return this.order;
    }
    /**
     * Gets the ref property value. The ref property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getRef() {
        return this.ref;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("number", this.getNumber());
        writer.writeObjectValue("order", this.getOrder());
        writer.writeObjectValue("ref", this.getRef());
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
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber(@javax.annotation.Nullable final Json value) {
        this.number = value;
    }
    /**
     * Sets the order property value. The order property
     * @param value Value to set for the order property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrder(@javax.annotation.Nullable final Json value) {
        this.order = value;
    }
    /**
     * Sets the ref property value. The ref property
     * @param value Value to set for the ref property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRef(@javax.annotation.Nullable final Json value) {
        this.ref = value;
    }
}
