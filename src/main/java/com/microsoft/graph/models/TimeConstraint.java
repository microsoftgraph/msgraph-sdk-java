package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeConstraint implements AdditionalDataHolder, Parsable {
    /** The nature of the activity, optional. Possible values are: work, personal, unrestricted, or unknown.  */
    private ActivityDomain _activityDomain;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The timeSlots property  */
    private java.util.List<TimeSlot> _timeSlots;
    /**
     * Instantiates a new timeConstraint and sets the default values.
     * @return a void
     */
    public TimeConstraint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a timeConstraint
     */
    @javax.annotation.Nonnull
    public static TimeConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeConstraint();
    }
    /**
     * Gets the activityDomain property value. The nature of the activity, optional. Possible values are: work, personal, unrestricted, or unknown.
     * @return a activityDomain
     */
    @javax.annotation.Nullable
    public ActivityDomain getActivityDomain() {
        return this._activityDomain;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TimeConstraint currentObject = this;
        return new HashMap<>(2) {{
            this.put("activityDomain", (n) -> { currentObject.setActivityDomain(n.getEnumValue(ActivityDomain.class)); });
            this.put("timeSlots", (n) -> { currentObject.setTimeSlots(n.getCollectionOfObjectValues(TimeSlot::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the timeSlots property value. The timeSlots property
     * @return a timeSlot
     */
    @javax.annotation.Nullable
    public java.util.List<TimeSlot> getTimeSlots() {
        return this._timeSlots;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("activityDomain", this.getActivityDomain());
        writer.writeCollectionOfObjectValues("timeSlots", this.getTimeSlots());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityDomain property value. The nature of the activity, optional. Possible values are: work, personal, unrestricted, or unknown.
     * @param value Value to set for the activityDomain property.
     * @return a void
     */
    public void setActivityDomain(@javax.annotation.Nullable final ActivityDomain value) {
        this._activityDomain = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the timeSlots property value. The timeSlots property
     * @param value Value to set for the timeSlots property.
     * @return a void
     */
    public void setTimeSlots(@javax.annotation.Nullable final java.util.List<TimeSlot> value) {
        this._timeSlots = value;
    }
}
