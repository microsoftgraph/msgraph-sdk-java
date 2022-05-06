package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ShiftPreferences extends ChangeTrackedEntity implements Parsable {
    /** Availability of the user to be scheduled for work and its recurrence pattern.  */
    private java.util.List<ShiftAvailability> _availability;
    /**
     * Instantiates a new shiftPreferences and sets the default values.
     * @return a void
     */
    public ShiftPreferences() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a shiftPreferences
     */
    @javax.annotation.Nonnull
    public static ShiftPreferences createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShiftPreferences();
    }
    /**
     * Gets the availability property value. Availability of the user to be scheduled for work and its recurrence pattern.
     * @return a shiftAvailability
     */
    @javax.annotation.Nullable
    public java.util.List<ShiftAvailability> getAvailability() {
        return this._availability;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ShiftPreferences currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("availability", (n) -> { currentObject.setAvailability(n.getCollectionOfObjectValues(ShiftAvailability::createFromDiscriminatorValue)); });
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
        writer.writeCollectionOfObjectValues("availability", this.getAvailability());
    }
    /**
     * Sets the availability property value. Availability of the user to be scheduled for work and its recurrence pattern.
     * @param value Value to set for the availability property.
     * @return a void
     */
    public void setAvailability(@javax.annotation.Nullable final java.util.List<ShiftAvailability> value) {
        this._availability = value;
    }
}
