package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsUpdateScheduledInstall extends WindowsUpdateInstallScheduleType implements Parsable {
    /**
     * Instantiates a new WindowsUpdateScheduledInstall and sets the default values.
     */
    public WindowsUpdateScheduledInstall() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdateScheduledInstall");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsUpdateScheduledInstall
     */
    @jakarta.annotation.Nonnull
    public static WindowsUpdateScheduledInstall createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUpdateScheduledInstall();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("scheduledInstallDay", (n) -> { this.setScheduledInstallDay(n.getEnumValue(WeeklySchedule::forValue)); });
        deserializerMap.put("scheduledInstallTime", (n) -> { this.setScheduledInstallTime(n.getLocalTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the scheduledInstallDay property value. Possible values for a weekly schedule.
     * @return a WeeklySchedule
     */
    @jakarta.annotation.Nullable
    public WeeklySchedule getScheduledInstallDay() {
        return this.backingStore.get("scheduledInstallDay");
    }
    /**
     * Gets the scheduledInstallTime property value. Scheduled Install Time during day
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getScheduledInstallTime() {
        return this.backingStore.get("scheduledInstallTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("scheduledInstallDay", this.getScheduledInstallDay());
        writer.writeLocalTimeValue("scheduledInstallTime", this.getScheduledInstallTime());
    }
    /**
     * Sets the scheduledInstallDay property value. Possible values for a weekly schedule.
     * @param value Value to set for the scheduledInstallDay property.
     */
    public void setScheduledInstallDay(@jakarta.annotation.Nullable final WeeklySchedule value) {
        this.backingStore.set("scheduledInstallDay", value);
    }
    /**
     * Sets the scheduledInstallTime property value. Scheduled Install Time during day
     * @param value Value to set for the scheduledInstallTime property.
     */
    public void setScheduledInstallTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("scheduledInstallTime", value);
    }
}
