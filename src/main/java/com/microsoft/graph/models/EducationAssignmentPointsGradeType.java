package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationAssignmentPointsGradeType extends EducationAssignmentGradeType implements Parsable {
    /**
     * Max points possible for this assignment.
     */
    private Float maxPoints;
    /**
     * Instantiates a new EducationAssignmentPointsGradeType and sets the default values.
     */
    public EducationAssignmentPointsGradeType() {
        super();
        this.setOdataType("#microsoft.graph.educationAssignmentPointsGradeType");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationAssignmentPointsGradeType
     */
    @jakarta.annotation.Nonnull
    public static EducationAssignmentPointsGradeType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentPointsGradeType();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maxPoints", (n) -> { this.setMaxPoints(n.getFloatValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxPoints property value. Max points possible for this assignment.
     * @return a Float
     */
    @jakarta.annotation.Nullable
    public Float getMaxPoints() {
        return this.maxPoints;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeFloatValue("maxPoints", this.getMaxPoints());
    }
    /**
     * Sets the maxPoints property value. Max points possible for this assignment.
     * @param value Value to set for the maxPoints property.
     */
    public void setMaxPoints(@jakarta.annotation.Nullable final Float value) {
        this.maxPoints = value;
    }
}
