package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeOffItem extends ScheduleEntity implements Parsable {
    /** ID of the timeOffReason for this timeOffItem. Required. */
    private String _timeOffReasonId;
    /**
     * Instantiates a new TimeOffItem and sets the default values.
     * @return a void
     */
    public TimeOffItem() {
        super();
        this.setOdataType("#microsoft.graph.timeOffItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TimeOffItem
     */
    @javax.annotation.Nonnull
    public static TimeOffItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeOffItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TimeOffItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("timeOffReasonId", (n) -> { currentObject.setTimeOffReasonId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the timeOffReasonId property value. ID of the timeOffReason for this timeOffItem. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeOffReasonId() {
        return this._timeOffReasonId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("timeOffReasonId", this.getTimeOffReasonId());
    }
    /**
     * Sets the timeOffReasonId property value. ID of the timeOffReason for this timeOffItem. Required.
     * @param value Value to set for the timeOffReasonId property.
     * @return a void
     */
    public void setTimeOffReasonId(@javax.annotation.Nullable final String value) {
        this._timeOffReasonId = value;
    }
}
