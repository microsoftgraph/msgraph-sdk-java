package com.microsoft.graph.drives.item.items.item.workbook.functions.workday;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkDayPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The days property
     */
    private Json days;
    /**
     * The holidays property
     */
    private Json holidays;
    /**
     * The startDate property
     */
    private Json startDate;
    /**
     * Instantiates a new workDayPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkDayPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workDayPostRequestBody
     */
    @javax.annotation.Nonnull
    public static WorkDayPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkDayPostRequestBody();
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
     * Gets the days property value. The days property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getDays() {
        return this.days;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("days", (n) -> { this.setDays(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("holidays", (n) -> { this.setHolidays(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the holidays property value. The holidays property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getHolidays() {
        return this.holidays;
    }
    /**
     * Gets the startDate property value. The startDate property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getStartDate() {
        return this.startDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("days", this.getDays());
        writer.writeObjectValue("holidays", this.getHolidays());
        writer.writeObjectValue("startDate", this.getStartDate());
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
     * Sets the days property value. The days property
     * @param value Value to set for the days property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDays(@javax.annotation.Nullable final Json value) {
        this.days = value;
    }
    /**
     * Sets the holidays property value. The holidays property
     * @param value Value to set for the holidays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHolidays(@javax.annotation.Nullable final Json value) {
        this.holidays = value;
    }
    /**
     * Sets the startDate property value. The startDate property
     * @param value Value to set for the startDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDate(@javax.annotation.Nullable final Json value) {
        this.startDate = value;
    }
}
