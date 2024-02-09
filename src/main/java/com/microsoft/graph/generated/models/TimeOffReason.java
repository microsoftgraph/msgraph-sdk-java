package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TimeOffReason extends ChangeTrackedEntity implements Parsable {
    /**
     * Instantiates a new {@link TimeOffReason} and sets the default values.
     */
    public TimeOffReason() {
        super();
        this.setOdataType("#microsoft.graph.timeOffReason");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TimeOffReason}
     */
    @jakarta.annotation.Nonnull
    public static TimeOffReason createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeOffReason();
    }
    /**
     * Gets the displayName property value. The name of the timeOffReason. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("iconType", (n) -> { this.setIconType(n.getEnumValue(TimeOffReasonIconType::forValue)); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the iconType property value. Supported icon types are: none, car, calendar, running, plane, firstAid, doctor, notWorking, clock, juryDuty, globe, cup, phone, weather, umbrella, piggyBank, dog, cake, trafficCone, pin, sunny. Required.
     * @return a {@link TimeOffReasonIconType}
     */
    @jakarta.annotation.Nullable
    public TimeOffReasonIconType getIconType() {
        return this.backingStore.get("iconType");
    }
    /**
     * Gets the isActive property value. Indicates whether the timeOffReason can be used when creating new entities or updating existing ones. Required.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.backingStore.get("isActive");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("iconType", this.getIconType());
        writer.writeBooleanValue("isActive", this.getIsActive());
    }
    /**
     * Sets the displayName property value. The name of the timeOffReason. Required.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the iconType property value. Supported icon types are: none, car, calendar, running, plane, firstAid, doctor, notWorking, clock, juryDuty, globe, cup, phone, weather, umbrella, piggyBank, dog, cake, trafficCone, pin, sunny. Required.
     * @param value Value to set for the iconType property.
     */
    public void setIconType(@jakarta.annotation.Nullable final TimeOffReasonIconType value) {
        this.backingStore.set("iconType", value);
    }
    /**
     * Sets the isActive property value. Indicates whether the timeOffReason can be used when creating new entities or updating existing ones. Required.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isActive", value);
    }
}
