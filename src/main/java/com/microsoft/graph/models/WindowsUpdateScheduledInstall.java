package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsUpdateScheduledInstall extends WindowsUpdateInstallScheduleType implements Parsable {
    /** Possible values for a weekly schedule. */
    private WeeklySchedule _scheduledInstallDay;
    /** Scheduled Install Time during day */
    private LocalTime _scheduledInstallTime;
    /**
     * Instantiates a new WindowsUpdateScheduledInstall and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsUpdateScheduledInstall() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdateScheduledInstall");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsUpdateScheduledInstall
     */
    @javax.annotation.Nonnull
    public static WindowsUpdateScheduledInstall createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUpdateScheduledInstall();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("scheduledInstallDay", (n) -> { this.setScheduledInstallDay(n.getEnumValue(WeeklySchedule.class)); });
        deserializerMap.put("scheduledInstallTime", (n) -> { this.setScheduledInstallTime(n.getLocalTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the scheduledInstallDay property value. Possible values for a weekly schedule.
     * @return a weeklySchedule
     */
    @javax.annotation.Nullable
    public WeeklySchedule getScheduledInstallDay() {
        return this._scheduledInstallDay;
    }
    /**
     * Gets the scheduledInstallTime property value. Scheduled Install Time during day
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getScheduledInstallTime() {
        return this._scheduledInstallTime;
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
        writer.writeEnumValue("scheduledInstallDay", this.getScheduledInstallDay());
        writer.writeLocalTimeValue("scheduledInstallTime", this.getScheduledInstallTime());
    }
    /**
     * Sets the scheduledInstallDay property value. Possible values for a weekly schedule.
     * @param value Value to set for the scheduledInstallDay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScheduledInstallDay(@javax.annotation.Nullable final WeeklySchedule value) {
        this._scheduledInstallDay = value;
    }
    /**
     * Sets the scheduledInstallTime property value. Scheduled Install Time during day
     * @param value Value to set for the scheduledInstallTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScheduledInstallTime(@javax.annotation.Nullable final LocalTime value) {
        this._scheduledInstallTime = value;
    }
}
