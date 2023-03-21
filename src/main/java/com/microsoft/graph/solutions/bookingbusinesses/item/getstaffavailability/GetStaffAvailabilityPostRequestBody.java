package com.microsoft.graph.solutions.bookingbusinesses.item.getstaffavailability;

import com.microsoft.graph.models.DateTimeTimeZone;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GetStaffAvailabilityPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The endDateTime property */
    private DateTimeTimeZone endDateTime;
    /** The staffIds property */
    private java.util.List<String> staffIds;
    /** The startDateTime property */
    private DateTimeTimeZone startDateTime;
    /**
     * Instantiates a new getStaffAvailabilityPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GetStaffAvailabilityPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getStaffAvailabilityPostRequestBody
     */
    @javax.annotation.Nonnull
    public static GetStaffAvailabilityPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetStaffAvailabilityPostRequestBody();
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
     * Gets the endDateTime property value. The endDateTime property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("staffIds", (n) -> { this.setStaffIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the staffIds property value. The staffIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getStaffIds() {
        return this.staffIds;
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("endDateTime", this.getEndDateTime());
        writer.writeCollectionOfPrimitiveValues("staffIds", this.getStaffIds());
        writer.writeObjectValue("startDateTime", this.getStartDateTime());
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
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.endDateTime = value;
    }
    /**
     * Sets the staffIds property value. The staffIds property
     * @param value Value to set for the staffIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStaffIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.staffIds = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.startDateTime = value;
    }
}
