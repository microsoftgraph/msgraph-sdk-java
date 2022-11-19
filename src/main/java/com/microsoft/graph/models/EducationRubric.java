package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationRubric extends Entity implements Parsable {
    /** The user who created this resource. */
    private IdentitySet _createdBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _createdDateTime;
    /** The description of this rubric. */
    private EducationItemBody _description;
    /** The name of this rubric. */
    private String _displayName;
    /** The grading type of this rubric -- null for a no-points rubric, or educationAssignmentPointsGradeType for a points rubric. */
    private EducationAssignmentGradeType _grading;
    /** The last user to modify the resource. */
    private IdentitySet _lastModifiedBy;
    /** Moment in time when the resource was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _lastModifiedDateTime;
    /** The collection of levels making up this rubric. */
    private java.util.List<RubricLevel> _levels;
    /** The collection of qualities making up this rubric. */
    private java.util.List<RubricQuality> _qualities;
    /**
     * Instantiates a new educationRubric and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationRubric() {
        super();
        this.setOdataType("#microsoft.graph.educationRubric");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationRubric
     */
    @javax.annotation.Nonnull
    public static EducationRubric createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationRubric();
    }
    /**
     * Gets the createdBy property value. The user who created this resource.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The description of this rubric.
     * @return a educationItemBody
     */
    @javax.annotation.Nullable
    public EducationItemBody getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name of this rubric.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationRubric currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getObjectValue(EducationItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("grading", (n) -> { currentObject.setGrading(n.getObjectValue(EducationAssignmentGradeType::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("levels", (n) -> { currentObject.setLevels(n.getCollectionOfObjectValues(RubricLevel::createFromDiscriminatorValue)); });
        deserializerMap.put("qualities", (n) -> { currentObject.setQualities(n.getCollectionOfObjectValues(RubricQuality::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the grading property value. The grading type of this rubric -- null for a no-points rubric, or educationAssignmentPointsGradeType for a points rubric.
     * @return a educationAssignmentGradeType
     */
    @javax.annotation.Nullable
    public EducationAssignmentGradeType getGrading() {
        return this._grading;
    }
    /**
     * Gets the lastModifiedBy property value. The last user to modify the resource.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Moment in time when the resource was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the levels property value. The collection of levels making up this rubric.
     * @return a rubricLevel
     */
    @javax.annotation.Nullable
    public java.util.List<RubricLevel> getLevels() {
        return this._levels;
    }
    /**
     * Gets the qualities property value. The collection of qualities making up this rubric.
     * @return a rubricQuality
     */
    @javax.annotation.Nullable
    public java.util.List<RubricQuality> getQualities() {
        return this._qualities;
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
        writer.writeObjectValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("grading", this.getGrading());
        writer.writeCollectionOfObjectValues("levels", this.getLevels());
        writer.writeCollectionOfObjectValues("qualities", this.getQualities());
    }
    /**
     * Sets the createdBy property value. The user who created this resource.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of this rubric.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final EducationItemBody value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name of this rubric.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the grading property value. The grading type of this rubric -- null for a no-points rubric, or educationAssignmentPointsGradeType for a points rubric.
     * @param value Value to set for the grading property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGrading(@javax.annotation.Nullable final EducationAssignmentGradeType value) {
        this._grading = value;
    }
    /**
     * Sets the lastModifiedBy property value. The last user to modify the resource.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Moment in time when the resource was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the levels property value. The collection of levels making up this rubric.
     * @param value Value to set for the levels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLevels(@javax.annotation.Nullable final java.util.List<RubricLevel> value) {
        this._levels = value;
    }
    /**
     * Sets the qualities property value. The collection of qualities making up this rubric.
     * @param value Value to set for the qualities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQualities(@javax.annotation.Nullable final java.util.List<RubricQuality> value) {
        this._qualities = value;
    }
}
