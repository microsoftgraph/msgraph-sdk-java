package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LearningCourseActivity extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LearningCourseActivity} and sets the default values.
     */
    public LearningCourseActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LearningCourseActivity}
     */
    @jakarta.annotation.Nonnull
    public static LearningCourseActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.learningAssignment": return new LearningAssignment();
                case "#microsoft.graph.learningSelfInitiatedCourse": return new LearningSelfInitiatedCourse();
            }
        }
        return new LearningCourseActivity();
    }
    /**
     * Gets the completedDateTime property value. Date and time when the assignment was completed. Optional.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * Gets the completionPercentage property value. The percentage completion value of the course activity. Optional.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCompletionPercentage() {
        return this.backingStore.get("completionPercentage");
    }
    /**
     * Gets the externalcourseActivityId property value. The externalcourseActivityId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalcourseActivityId() {
        return this.backingStore.get("externalcourseActivityId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("completionPercentage", (n) -> { this.setCompletionPercentage(n.getIntegerValue()); });
        deserializerMap.put("externalcourseActivityId", (n) -> { this.setExternalcourseActivityId(n.getStringValue()); });
        deserializerMap.put("learnerUserId", (n) -> { this.setLearnerUserId(n.getStringValue()); });
        deserializerMap.put("learningContentId", (n) -> { this.setLearningContentId(n.getStringValue()); });
        deserializerMap.put("learningProviderId", (n) -> { this.setLearningProviderId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CourseStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the learnerUserId property value. The user ID of the learner to whom the activity is assigned. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLearnerUserId() {
        return this.backingStore.get("learnerUserId");
    }
    /**
     * Gets the learningContentId property value. The ID of the learning content created in Viva Learning. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLearningContentId() {
        return this.backingStore.get("learningContentId");
    }
    /**
     * Gets the learningProviderId property value. The registration ID of the provider. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLearningProviderId() {
        return this.backingStore.get("learningProviderId");
    }
    /**
     * Gets the status property value. The status of the course activity. Possible values are: notStarted, inProgress, completed. Required.
     * @return a {@link CourseStatus}
     */
    @jakarta.annotation.Nullable
    public CourseStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeIntegerValue("completionPercentage", this.getCompletionPercentage());
        writer.writeStringValue("externalcourseActivityId", this.getExternalcourseActivityId());
        writer.writeStringValue("learnerUserId", this.getLearnerUserId());
        writer.writeStringValue("learningContentId", this.getLearningContentId());
        writer.writeStringValue("learningProviderId", this.getLearningProviderId());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the completedDateTime property value. Date and time when the assignment was completed. Optional.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the completionPercentage property value. The percentage completion value of the course activity. Optional.
     * @param value Value to set for the completionPercentage property.
     */
    public void setCompletionPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("completionPercentage", value);
    }
    /**
     * Sets the externalcourseActivityId property value. The externalcourseActivityId property
     * @param value Value to set for the externalcourseActivityId property.
     */
    public void setExternalcourseActivityId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalcourseActivityId", value);
    }
    /**
     * Sets the learnerUserId property value. The user ID of the learner to whom the activity is assigned. Required.
     * @param value Value to set for the learnerUserId property.
     */
    public void setLearnerUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("learnerUserId", value);
    }
    /**
     * Sets the learningContentId property value. The ID of the learning content created in Viva Learning. Required.
     * @param value Value to set for the learningContentId property.
     */
    public void setLearningContentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("learningContentId", value);
    }
    /**
     * Sets the learningProviderId property value. The registration ID of the provider. Required.
     * @param value Value to set for the learningProviderId property.
     */
    public void setLearningProviderId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("learningProviderId", value);
    }
    /**
     * Sets the status property value. The status of the course activity. Possible values are: notStarted, inProgress, completed. Required.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CourseStatus value) {
        this.backingStore.set("status", value);
    }
}
