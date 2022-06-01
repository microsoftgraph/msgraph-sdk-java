package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Casts the previous resource to user. */
public class OpenShift extends ChangeTrackedEntity implements Parsable {
    /** An unpublished open shift. */
    private OpenShiftItem _draftOpenShift;
    /** ID for the scheduling group that the open shift belongs to. */
    private String _schedulingGroupId;
    /** A published open shift. */
    private OpenShiftItem _sharedOpenShift;
    /**
     * Instantiates a new openShift and sets the default values.
     * @return a void
     */
    public OpenShift() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a openShift
     */
    @javax.annotation.Nonnull
    public static OpenShift createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenShift();
    }
    /**
     * Gets the draftOpenShift property value. An unpublished open shift.
     * @return a openShiftItem
     */
    @javax.annotation.Nullable
    public OpenShiftItem getDraftOpenShift() {
        return this._draftOpenShift;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OpenShift currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("draftOpenShift", (n) -> { currentObject.setDraftOpenShift(n.getObjectValue(OpenShiftItem::createFromDiscriminatorValue)); });
            this.put("schedulingGroupId", (n) -> { currentObject.setSchedulingGroupId(n.getStringValue()); });
            this.put("sharedOpenShift", (n) -> { currentObject.setSharedOpenShift(n.getObjectValue(OpenShiftItem::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the schedulingGroupId property value. ID for the scheduling group that the open shift belongs to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSchedulingGroupId() {
        return this._schedulingGroupId;
    }
    /**
     * Gets the sharedOpenShift property value. A published open shift.
     * @return a openShiftItem
     */
    @javax.annotation.Nullable
    public OpenShiftItem getSharedOpenShift() {
        return this._sharedOpenShift;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("draftOpenShift", this.getDraftOpenShift());
        writer.writeStringValue("schedulingGroupId", this.getSchedulingGroupId());
        writer.writeObjectValue("sharedOpenShift", this.getSharedOpenShift());
    }
    /**
     * Sets the draftOpenShift property value. An unpublished open shift.
     * @param value Value to set for the draftOpenShift property.
     * @return a void
     */
    public void setDraftOpenShift(@javax.annotation.Nullable final OpenShiftItem value) {
        this._draftOpenShift = value;
    }
    /**
     * Sets the schedulingGroupId property value. ID for the scheduling group that the open shift belongs to.
     * @param value Value to set for the schedulingGroupId property.
     * @return a void
     */
    public void setSchedulingGroupId(@javax.annotation.Nullable final String value) {
        this._schedulingGroupId = value;
    }
    /**
     * Sets the sharedOpenShift property value. A published open shift.
     * @param value Value to set for the sharedOpenShift property.
     * @return a void
     */
    public void setSharedOpenShift(@javax.annotation.Nullable final OpenShiftItem value) {
        this._sharedOpenShift = value;
    }
}
