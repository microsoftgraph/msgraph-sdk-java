package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationAssignmentPointsGradeType extends EducationAssignmentGradeType implements Parsable {
    /** Max points possible for this assignment. */
    private Float _maxPoints;
    /**
     * Instantiates a new EducationAssignmentPointsGradeType and sets the default values.
     * @return a void
     */
    public EducationAssignmentPointsGradeType() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationAssignmentPointsGradeType
     */
    @javax.annotation.Nonnull
    public static EducationAssignmentPointsGradeType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentPointsGradeType();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationAssignmentPointsGradeType currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("maxPoints", (n) -> { currentObject.setMaxPoints(n.getFloatValue()); });
        }};
    }
    /**
     * Gets the maxPoints property value. Max points possible for this assignment.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getMaxPoints() {
        return this._maxPoints;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeFloatValue("maxPoints", this.getMaxPoints());
    }
    /**
     * Sets the maxPoints property value. Max points possible for this assignment.
     * @param value Value to set for the maxPoints property.
     * @return a void
     */
    public void setMaxPoints(@javax.annotation.Nullable final Float value) {
        this._maxPoints = value;
    }
}
