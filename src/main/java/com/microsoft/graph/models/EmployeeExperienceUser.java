package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmployeeExperienceUser extends Entity implements Parsable {
    /**
     * The learningCourseActivities property
     */
    private java.util.List<LearningCourseActivity> learningCourseActivities;
    /**
     * Instantiates a new employeeExperienceUser and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EmployeeExperienceUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a employeeExperienceUser
     */
    @javax.annotation.Nonnull
    public static EmployeeExperienceUser createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmployeeExperienceUser();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("learningCourseActivities", (n) -> { this.setLearningCourseActivities(n.getCollectionOfObjectValues(LearningCourseActivity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the learningCourseActivities property value. The learningCourseActivities property
     * @return a learningCourseActivity
     */
    @javax.annotation.Nullable
    public java.util.List<LearningCourseActivity> getLearningCourseActivities() {
        return this.learningCourseActivities;
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
        writer.writeCollectionOfObjectValues("learningCourseActivities", this.getLearningCourseActivities());
    }
    /**
     * Sets the learningCourseActivities property value. The learningCourseActivities property
     * @param value Value to set for the learningCourseActivities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLearningCourseActivities(@javax.annotation.Nullable final java.util.List<LearningCourseActivity> value) {
        this.learningCourseActivities = value;
    }
}
