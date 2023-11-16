package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * IOS Update Configuration, allows you to configure time window within week to install iOS updates
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosUpdateConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new IosUpdateConfiguration and sets the default values.
     */
    public IosUpdateConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosUpdateConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosUpdateConfiguration
     */
    @jakarta.annotation.Nonnull
    public static IosUpdateConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosUpdateConfiguration();
    }
    /**
     * Gets the activeHoursEnd property value. Active Hours End (active hours mean the time window when updates install should not happen)
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getActiveHoursEnd() {
        return this.BackingStore.get("activeHoursEnd");
    }
    /**
     * Gets the activeHoursStart property value. Active Hours Start (active hours mean the time window when updates install should not happen)
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getActiveHoursStart() {
        return this.BackingStore.get("activeHoursStart");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeHoursEnd", (n) -> { this.setActiveHoursEnd(n.getLocalTimeValue()); });
        deserializerMap.put("activeHoursStart", (n) -> { this.setActiveHoursStart(n.getLocalTimeValue()); });
        deserializerMap.put("scheduledInstallDays", (n) -> { this.setScheduledInstallDays(n.getCollectionOfEnumValues(DayOfWeek.class)); });
        deserializerMap.put("utcTimeOffsetInMinutes", (n) -> { this.setUtcTimeOffsetInMinutes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the scheduledInstallDays property value. Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
     * @return a java.util.List<DayOfWeek>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DayOfWeek> getScheduledInstallDays() {
        return this.BackingStore.get("scheduledInstallDays");
    }
    /**
     * Gets the utcTimeOffsetInMinutes property value. UTC Time Offset indicated in minutes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUtcTimeOffsetInMinutes() {
        return this.BackingStore.get("utcTimeOffsetInMinutes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalTimeValue("activeHoursEnd", this.getActiveHoursEnd());
        writer.writeLocalTimeValue("activeHoursStart", this.getActiveHoursStart());
        writer.writeCollectionOfEnumValues("scheduledInstallDays", this.getScheduledInstallDays());
        writer.writeIntegerValue("utcTimeOffsetInMinutes", this.getUtcTimeOffsetInMinutes());
    }
    /**
     * Sets the activeHoursEnd property value. Active Hours End (active hours mean the time window when updates install should not happen)
     * @param value Value to set for the activeHoursEnd property.
     */
    public void setActiveHoursEnd(@jakarta.annotation.Nullable final LocalTime value) {
        this.BackingStore.set("activeHoursEnd", value);
    }
    /**
     * Sets the activeHoursStart property value. Active Hours Start (active hours mean the time window when updates install should not happen)
     * @param value Value to set for the activeHoursStart property.
     */
    public void setActiveHoursStart(@jakarta.annotation.Nullable final LocalTime value) {
        this.BackingStore.set("activeHoursStart", value);
    }
    /**
     * Sets the scheduledInstallDays property value. Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
     * @param value Value to set for the scheduledInstallDays property.
     */
    public void setScheduledInstallDays(@jakarta.annotation.Nullable final java.util.List<DayOfWeek> value) {
        this.BackingStore.set("scheduledInstallDays", value);
    }
    /**
     * Sets the utcTimeOffsetInMinutes property value. UTC Time Offset indicated in minutes
     * @param value Value to set for the utcTimeOffsetInMinutes property.
     */
    public void setUtcTimeOffsetInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("utcTimeOffsetInMinutes", value);
    }
}
