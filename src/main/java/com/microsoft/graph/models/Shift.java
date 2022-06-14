package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Shift extends ChangeTrackedEntity implements Parsable {
    /** The draft version of this shift that is viewable by managers. Required. */
    private ShiftItem _draftShift;
    /** ID of the scheduling group the shift is part of. Required. */
    private String _schedulingGroupId;
    /** The shared version of this shift that is viewable by both employees and managers. Required. */
    private ShiftItem _sharedShift;
    /** ID of the user assigned to the shift. Required. */
    private String _userId;
    /**
     * Instantiates a new Shift and sets the default values.
     * @return a void
     */
    public Shift() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Shift
     */
    @javax.annotation.Nonnull
    public static Shift createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Shift();
    }
    /**
     * Gets the draftShift property value. The draft version of this shift that is viewable by managers. Required.
     * @return a shiftItem
     */
    @javax.annotation.Nullable
    public ShiftItem getDraftShift() {
        return this._draftShift;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Shift currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("draftShift", (n) -> { currentObject.setDraftShift(n.getObjectValue(ShiftItem::createFromDiscriminatorValue)); });
            this.put("schedulingGroupId", (n) -> { currentObject.setSchedulingGroupId(n.getStringValue()); });
            this.put("sharedShift", (n) -> { currentObject.setSharedShift(n.getObjectValue(ShiftItem::createFromDiscriminatorValue)); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the schedulingGroupId property value. ID of the scheduling group the shift is part of. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSchedulingGroupId() {
        return this._schedulingGroupId;
    }
    /**
     * Gets the sharedShift property value. The shared version of this shift that is viewable by both employees and managers. Required.
     * @return a shiftItem
     */
    @javax.annotation.Nullable
    public ShiftItem getSharedShift() {
        return this._sharedShift;
    }
    /**
     * Gets the userId property value. ID of the user assigned to the shift. Required.
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
        writer.writeObjectValue("draftShift", this.getDraftShift());
        writer.writeStringValue("schedulingGroupId", this.getSchedulingGroupId());
        writer.writeObjectValue("sharedShift", this.getSharedShift());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the draftShift property value. The draft version of this shift that is viewable by managers. Required.
     * @param value Value to set for the draftShift property.
     * @return a void
     */
    public void setDraftShift(@javax.annotation.Nullable final ShiftItem value) {
        this._draftShift = value;
    }
    /**
     * Sets the schedulingGroupId property value. ID of the scheduling group the shift is part of. Required.
     * @param value Value to set for the schedulingGroupId property.
     * @return a void
     */
    public void setSchedulingGroupId(@javax.annotation.Nullable final String value) {
        this._schedulingGroupId = value;
    }
    /**
     * Sets the sharedShift property value. The shared version of this shift that is viewable by both employees and managers. Required.
     * @param value Value to set for the sharedShift property.
     * @return a void
     */
    public void setSharedShift(@javax.annotation.Nullable final ShiftItem value) {
        this._sharedShift = value;
    }
    /**
     * Sets the userId property value. ID of the user assigned to the shift. Required.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
