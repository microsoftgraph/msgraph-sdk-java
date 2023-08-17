package com.microsoft.graph.drives.item.items.item.workbook.functions.time;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The hour property
     */
    private Json hour;
    /**
     * The minute property
     */
    private Json minute;
    /**
     * The second property
     */
    private Json second;
    /**
     * Instantiates a new timePostRequestBody and sets the default values.
     */
    public TimePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a timePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static TimePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimePostRequestBody();
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
        deserializerMap.put("hour", (n) -> { this.setHour(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("minute", (n) -> { this.setMinute(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("second", (n) -> { this.setSecond(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hour property value. The hour property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getHour() {
        return this.hour;
    }
    /**
     * Gets the minute property value. The minute property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getMinute() {
        return this.minute;
    }
    /**
     * Gets the second property value. The second property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getSecond() {
        return this.second;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("hour", this.getHour());
        writer.writeObjectValue("minute", this.getMinute());
        writer.writeObjectValue("second", this.getSecond());
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
     * Sets the hour property value. The hour property
     * @param value Value to set for the hour property.
     */
    public void setHour(@jakarta.annotation.Nullable final Json value) {
        this.hour = value;
    }
    /**
     * Sets the minute property value. The minute property
     * @param value Value to set for the minute property.
     */
    public void setMinute(@jakarta.annotation.Nullable final Json value) {
        this.minute = value;
    }
    /**
     * Sets the second property value. The second property
     * @param value Value to set for the second property.
     */
    public void setSecond(@jakarta.annotation.Nullable final Json value) {
        this.second = value;
    }
}
