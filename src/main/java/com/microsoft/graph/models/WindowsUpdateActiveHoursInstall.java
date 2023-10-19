package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsUpdateActiveHoursInstall extends WindowsUpdateInstallScheduleType implements Parsable {
    /**
     * Active Hours End
     */
    private LocalTime activeHoursEnd;
    /**
     * Active Hours Start
     */
    private LocalTime activeHoursStart;
    /**
     * Instantiates a new WindowsUpdateActiveHoursInstall and sets the default values.
     */
    public WindowsUpdateActiveHoursInstall() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdateActiveHoursInstall");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsUpdateActiveHoursInstall
     */
    @jakarta.annotation.Nonnull
    public static WindowsUpdateActiveHoursInstall createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUpdateActiveHoursInstall();
    }
    /**
     * Gets the activeHoursEnd property value. Active Hours End
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getActiveHoursEnd() {
        return this.activeHoursEnd;
    }
    /**
     * Gets the activeHoursStart property value. Active Hours Start
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getActiveHoursStart() {
        return this.activeHoursStart;
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
        return deserializerMap;
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
    }
    /**
     * Sets the activeHoursEnd property value. Active Hours End
     * @param value Value to set for the activeHoursEnd property.
     */
    public void setActiveHoursEnd(@jakarta.annotation.Nullable final LocalTime value) {
        this.activeHoursEnd = value;
    }
    /**
     * Sets the activeHoursStart property value. Active Hours Start
     * @param value Value to set for the activeHoursStart property.
     */
    public void setActiveHoursStart(@jakarta.annotation.Nullable final LocalTime value) {
        this.activeHoursStart = value;
    }
}
