package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosUpdateConfiguration extends DeviceConfiguration implements Parsable {
    /** Active Hours End (active hours mean the time window when updates install should not happen) */
    private LocalTime _activeHoursEnd;
    /** Active Hours Start (active hours mean the time window when updates install should not happen) */
    private LocalTime _activeHoursStart;
    /** Days in week for which active hours are configured. This collection can contain a maximum of 7 elements. */
    private java.util.List<DayOfWeek> _scheduledInstallDays;
    /** UTC Time Offset indicated in minutes */
    private Integer _utcTimeOffsetInMinutes;
    /**
     * Instantiates a new IosUpdateConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosUpdateConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosUpdateConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosUpdateConfiguration
     */
    @javax.annotation.Nonnull
    public static IosUpdateConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosUpdateConfiguration();
    }
    /**
     * Gets the activeHoursEnd property value. Active Hours End (active hours mean the time window when updates install should not happen)
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getActiveHoursEnd() {
        return this._activeHoursEnd;
    }
    /**
     * Gets the activeHoursStart property value. Active Hours Start (active hours mean the time window when updates install should not happen)
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getActiveHoursStart() {
        return this._activeHoursStart;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosUpdateConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("activeHoursEnd", (n) -> { currentObject.setActiveHoursEnd(n.getLocalTimeValue()); });
            this.put("activeHoursStart", (n) -> { currentObject.setActiveHoursStart(n.getLocalTimeValue()); });
            this.put("scheduledInstallDays", (n) -> { currentObject.setScheduledInstallDays(n.getCollectionOfEnumValues(DayOfWeek.class)); });
            this.put("utcTimeOffsetInMinutes", (n) -> { currentObject.setUtcTimeOffsetInMinutes(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the scheduledInstallDays property value. Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
     * @return a dayOfWeek
     */
    @javax.annotation.Nullable
    public java.util.List<DayOfWeek> getScheduledInstallDays() {
        return this._scheduledInstallDays;
    }
    /**
     * Gets the utcTimeOffsetInMinutes property value. UTC Time Offset indicated in minutes
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUtcTimeOffsetInMinutes() {
        return this._utcTimeOffsetInMinutes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveHoursEnd(@javax.annotation.Nullable final LocalTime value) {
        this._activeHoursEnd = value;
    }
    /**
     * Sets the activeHoursStart property value. Active Hours Start (active hours mean the time window when updates install should not happen)
     * @param value Value to set for the activeHoursStart property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveHoursStart(@javax.annotation.Nullable final LocalTime value) {
        this._activeHoursStart = value;
    }
    /**
     * Sets the scheduledInstallDays property value. Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
     * @param value Value to set for the scheduledInstallDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScheduledInstallDays(@javax.annotation.Nullable final java.util.List<DayOfWeek> value) {
        this._scheduledInstallDays = value;
    }
    /**
     * Sets the utcTimeOffsetInMinutes property value. UTC Time Offset indicated in minutes
     * @param value Value to set for the utcTimeOffsetInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUtcTimeOffsetInMinutes(@javax.annotation.Nullable final Integer value) {
        this._utcTimeOffsetInMinutes = value;
    }
}
