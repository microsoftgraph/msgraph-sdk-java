package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TimeOffItem extends ScheduleEntity implements Parsable {
    /**
     * Instantiates a new TimeOffItem and sets the default values.
     */
    public TimeOffItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TimeOffItem
     */
    @jakarta.annotation.Nonnull
    public static TimeOffItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeOffItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("timeOffReasonId", (n) -> { this.setTimeOffReasonId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the timeOffReasonId property value. ID of the timeOffReason for this timeOffItem. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTimeOffReasonId() {
        return this.backingStore.get("timeOffReasonId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("timeOffReasonId", this.getTimeOffReasonId());
    }
    /**
     * Sets the timeOffReasonId property value. ID of the timeOffReason for this timeOffItem. Required.
     * @param value Value to set for the timeOffReasonId property.
     */
    public void setTimeOffReasonId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("timeOffReasonId", value);
    }
}
