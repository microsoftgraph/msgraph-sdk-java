package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeOff extends ChangeTrackedEntity implements Parsable {
    /** The draft version of this timeOff that is viewable by managers. Required. */
    private TimeOffItem _draftTimeOff;
    /** The shared version of this timeOff that is viewable by both employees and managers. Required. */
    private TimeOffItem _sharedTimeOff;
    /** ID of the user assigned to the timeOff. Required. */
    private String _userId;
    /**
     * Instantiates a new timeOff and sets the default values.
     * @return a void
     */
    public TimeOff() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a timeOff
     */
    @javax.annotation.Nonnull
    public static TimeOff createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeOff();
    }
    /**
     * Gets the draftTimeOff property value. The draft version of this timeOff that is viewable by managers. Required.
     * @return a timeOffItem
     */
    @javax.annotation.Nullable
    public TimeOffItem getDraftTimeOff() {
        return this._draftTimeOff;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TimeOff currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("draftTimeOff", (n) -> { currentObject.setDraftTimeOff(n.getObjectValue(TimeOffItem::createFromDiscriminatorValue)); });
            this.put("sharedTimeOff", (n) -> { currentObject.setSharedTimeOff(n.getObjectValue(TimeOffItem::createFromDiscriminatorValue)); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the sharedTimeOff property value. The shared version of this timeOff that is viewable by both employees and managers. Required.
     * @return a timeOffItem
     */
    @javax.annotation.Nullable
    public TimeOffItem getSharedTimeOff() {
        return this._sharedTimeOff;
    }
    /**
     * Gets the userId property value. ID of the user assigned to the timeOff. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("draftTimeOff", this.getDraftTimeOff());
        writer.writeObjectValue("sharedTimeOff", this.getSharedTimeOff());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the draftTimeOff property value. The draft version of this timeOff that is viewable by managers. Required.
     * @param value Value to set for the draftTimeOff property.
     * @return a void
     */
    public void setDraftTimeOff(@javax.annotation.Nullable final TimeOffItem value) {
        this._draftTimeOff = value;
    }
    /**
     * Sets the sharedTimeOff property value. The shared version of this timeOff that is viewable by both employees and managers. Required.
     * @param value Value to set for the sharedTimeOff property.
     * @return a void
     */
    public void setSharedTimeOff(@javax.annotation.Nullable final TimeOffItem value) {
        this._sharedTimeOff = value;
    }
    /**
     * Sets the userId property value. ID of the user assigned to the timeOff. Required.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
