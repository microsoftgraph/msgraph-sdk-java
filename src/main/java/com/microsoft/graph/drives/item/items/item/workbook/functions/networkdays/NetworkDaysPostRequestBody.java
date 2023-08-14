package com.microsoft.graph.drives.item.items.item.workbook.functions.networkdays;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NetworkDaysPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The endDate property
     */
    private Json endDate;
    /**
     * The holidays property
     */
    private Json holidays;
    /**
     * The startDate property
     */
    private Json startDate;
    /**
     * Instantiates a new networkDaysPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public NetworkDaysPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a networkDaysPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static NetworkDaysPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkDaysPostRequestBody();
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
     * Gets the endDate property value. The endDate property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getEndDate() {
        return this.endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("holidays", (n) -> { this.setHolidays(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the holidays property value. The holidays property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getHolidays() {
        return this.holidays;
    }
    /**
     * Gets the startDate property value. The startDate property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getStartDate() {
        return this.startDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("endDate", this.getEndDate());
        writer.writeObjectValue("holidays", this.getHolidays());
        writer.writeObjectValue("startDate", this.getStartDate());
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
     * Sets the endDate property value. The endDate property
     * @param value Value to set for the endDate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEndDate(@jakarta.annotation.Nullable final Json value) {
        this.endDate = value;
    }
    /**
     * Sets the holidays property value. The holidays property
     * @param value Value to set for the holidays property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHolidays(@jakarta.annotation.Nullable final Json value) {
        this.holidays = value;
    }
    /**
     * Sets the startDate property value. The startDate property
     * @param value Value to set for the startDate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStartDate(@jakarta.annotation.Nullable final Json value) {
        this.startDate = value;
    }
}
