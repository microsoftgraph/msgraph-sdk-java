package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BookingsAvailabilityWindow extends BookingsAvailability implements Parsable {
    /**
     * Instantiates a new {@link BookingsAvailabilityWindow} and sets the default values.
     */
    public BookingsAvailabilityWindow() {
        super();
        this.setOdataType("#microsoft.graph.bookingsAvailabilityWindow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BookingsAvailabilityWindow}
     */
    @jakarta.annotation.Nonnull
    public static BookingsAvailabilityWindow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingsAvailabilityWindow();
    }
    /**
     * Gets the endDate property value. End date of the availability window.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getEndDate() {
        return this.backingStore.get("endDate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getLocalDateValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getLocalDateValue()); });
        return deserializerMap;
    }
    /**
     * Gets the startDate property value. Start date of the availability window.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getStartDate() {
        return this.backingStore.get("startDate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalDateValue("endDate", this.getEndDate());
        writer.writeLocalDateValue("startDate", this.getStartDate());
    }
    /**
     * Sets the endDate property value. End date of the availability window.
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("endDate", value);
    }
    /**
     * Sets the startDate property value. Start date of the availability window.
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("startDate", value);
    }
}
