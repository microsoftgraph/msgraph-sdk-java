package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsUpdateActiveHoursInstall extends WindowsUpdateInstallScheduleType implements Parsable {
    /** Active Hours End */
    private LocalTime _activeHoursEnd;
    /** Active Hours Start */
    private LocalTime _activeHoursStart;
    /**
     * Instantiates a new WindowsUpdateActiveHoursInstall and sets the default values.
     * @return a void
     */
    public WindowsUpdateActiveHoursInstall() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsUpdateActiveHoursInstall
     */
    @javax.annotation.Nonnull
    public static WindowsUpdateActiveHoursInstall createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUpdateActiveHoursInstall();
    }
    /**
     * Gets the activeHoursEnd property value. Active Hours End
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getActiveHoursEnd() {
        return this._activeHoursEnd;
    }
    /**
     * Gets the activeHoursStart property value. Active Hours Start
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
        final WindowsUpdateActiveHoursInstall currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activeHoursEnd", (n) -> { currentObject.setActiveHoursEnd(n.getLocalTimeValue()); });
            this.put("activeHoursStart", (n) -> { currentObject.setActiveHoursStart(n.getLocalTimeValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalTimeValue("activeHoursEnd", this.getActiveHoursEnd());
        writer.writeLocalTimeValue("activeHoursStart", this.getActiveHoursStart());
    }
    /**
     * Sets the activeHoursEnd property value. Active Hours End
     * @param value Value to set for the activeHoursEnd property.
     * @return a void
     */
    public void setActiveHoursEnd(@javax.annotation.Nullable final LocalTime value) {
        this._activeHoursEnd = value;
    }
    /**
     * Sets the activeHoursStart property value. Active Hours Start
     * @param value Value to set for the activeHoursStart property.
     * @return a void
     */
    public void setActiveHoursStart(@javax.annotation.Nullable final LocalTime value) {
        this._activeHoursStart = value;
    }
}
