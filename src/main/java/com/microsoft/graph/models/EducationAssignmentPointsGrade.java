package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationAssignmentPointsGrade extends EducationAssignmentGrade implements Parsable {
    /** Number of points a teacher is giving this submission object. */
    private Float _points;
    /**
     * Instantiates a new EducationAssignmentPointsGrade and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationAssignmentPointsGrade() {
        super();
        this.setOdataType("#microsoft.graph.educationAssignmentPointsGrade");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationAssignmentPointsGrade
     */
    @javax.annotation.Nonnull
    public static EducationAssignmentPointsGrade createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentPointsGrade();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationAssignmentPointsGrade currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("points", (n) -> { currentObject.setPoints(n.getFloatValue()); });
        }};
    }
    /**
     * Gets the points property value. Number of points a teacher is giving this submission object.
     * @return a float
     */
    @javax.annotation.Nullable
    public Float getPoints() {
        return this._points;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeFloatValue("points", this.getPoints());
    }
    /**
     * Sets the points property value. Number of points a teacher is giving this submission object.
     * @param value Value to set for the points property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPoints(@javax.annotation.Nullable final Float value) {
        this._points = value;
    }
}
