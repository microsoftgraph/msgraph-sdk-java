package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationRubric extends Entity implements Parsable {
    /**
     * The user who created this resource.
     */
    private IdentitySet createdBy;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description of this rubric.
     */
    private EducationItemBody description;
    /**
     * The name of this rubric.
     */
    private String displayName;
    /**
     * The grading type of this rubric -- null for a no-points rubric, or educationAssignmentPointsGradeType for a points rubric.
     */
    private EducationAssignmentGradeType grading;
    /**
     * The last user to modify the resource.
     */
    private IdentitySet lastModifiedBy;
    /**
     * Moment in time when the resource was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The collection of levels making up this rubric.
     */
    private java.util.List<RubricLevel> levels;
    /**
     * The collection of qualities making up this rubric.
     */
    private java.util.List<RubricQuality> qualities;
    /**
     * Instantiates a new EducationRubric and sets the default values.
     */
    public EducationRubric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationRubric
     */
    @jakarta.annotation.Nonnull
    public static EducationRubric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationRubric();
    }
    /**
     * Gets the createdBy property value. The user who created this resource.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description of this rubric.
     * @return a EducationItemBody
     */
    @jakarta.annotation.Nullable
    public EducationItemBody getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The name of this rubric.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getObjectValue(EducationItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("grading", (n) -> { this.setGrading(n.getObjectValue(EducationAssignmentGradeType::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("levels", (n) -> { this.setLevels(n.getCollectionOfObjectValues(RubricLevel::createFromDiscriminatorValue)); });
        deserializerMap.put("qualities", (n) -> { this.setQualities(n.getCollectionOfObjectValues(RubricQuality::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the grading property value. The grading type of this rubric -- null for a no-points rubric, or educationAssignmentPointsGradeType for a points rubric.
     * @return a EducationAssignmentGradeType
     */
    @jakarta.annotation.Nullable
    public EducationAssignmentGradeType getGrading() {
        return this.grading;
    }
    /**
     * Gets the lastModifiedBy property value. The last user to modify the resource.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Moment in time when the resource was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the levels property value. The collection of levels making up this rubric.
     * @return a java.util.List<RubricLevel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RubricLevel> getLevels() {
        return this.levels;
    }
    /**
     * Gets the qualities property value. The collection of qualities making up this rubric.
     * @return a java.util.List<RubricQuality>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RubricQuality> getQualities() {
        return this.qualities;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("grading", this.getGrading());
        writer.writeCollectionOfObjectValues("levels", this.getLevels());
        writer.writeCollectionOfObjectValues("qualities", this.getQualities());
    }
    /**
     * Sets the createdBy property value. The user who created this resource.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of this rubric.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final EducationItemBody value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The name of this rubric.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the grading property value. The grading type of this rubric -- null for a no-points rubric, or educationAssignmentPointsGradeType for a points rubric.
     * @param value Value to set for the grading property.
     */
    public void setGrading(@jakarta.annotation.Nullable final EducationAssignmentGradeType value) {
        this.grading = value;
    }
    /**
     * Sets the lastModifiedBy property value. The last user to modify the resource.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Moment in time when the resource was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the levels property value. The collection of levels making up this rubric.
     * @param value Value to set for the levels property.
     */
    public void setLevels(@jakarta.annotation.Nullable final java.util.List<RubricLevel> value) {
        this.levels = value;
    }
    /**
     * Sets the qualities property value. The collection of qualities making up this rubric.
     * @param value Value to set for the qualities property.
     */
    public void setQualities(@jakarta.annotation.Nullable final java.util.List<RubricQuality> value) {
        this.qualities = value;
    }
}
