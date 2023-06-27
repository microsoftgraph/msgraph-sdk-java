package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationClass extends Entity implements Parsable {
    /**
     * All categories associated with this class. Nullable.
     */
    private java.util.List<EducationCategory> assignmentCategories;
    /**
     * Specifies class-level defaults respected by new assignments created in the class.
     */
    private EducationAssignmentDefaults assignmentDefaults;
    /**
     * All assignments associated with this class. Nullable.
     */
    private java.util.List<EducationAssignment> assignments;
    /**
     * Specifies class-level assignments settings.
     */
    private EducationAssignmentSettings assignmentSettings;
    /**
     * Class code used by the school to identify the class.
     */
    private String classCode;
    /**
     * The course property
     */
    private EducationCourse course;
    /**
     * Entity who created the class
     */
    private IdentitySet createdBy;
    /**
     * Description of the class.
     */
    private String description;
    /**
     * Name of the class.
     */
    private String displayName;
    /**
     * ID of the class from the syncing system.
     */
    private String externalId;
    /**
     * Name of the class in the syncing system.
     */
    private String externalName;
    /**
     * How this class was created. Possible values are: sis, manual.
     */
    private EducationExternalSource externalSource;
    /**
     * The name of the external source this resources was generated from.
     */
    private String externalSourceDetail;
    /**
     * Grade level of the class.
     */
    private String grade;
    /**
     * The underlying Microsoft 365 group object.
     */
    private Group group;
    /**
     * Mail name for sending email to all members, if this is enabled.
     */
    private String mailNickname;
    /**
     * All users in the class. Nullable.
     */
    private java.util.List<EducationUser> members;
    /**
     * All schools that this class is associated with. Nullable.
     */
    private java.util.List<EducationSchool> schools;
    /**
     * All teachers in the class. Nullable.
     */
    private java.util.List<EducationUser> teachers;
    /**
     * Term for this class.
     */
    private EducationTerm term;
    /**
     * Instantiates a new educationClass and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationClass() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationClass
     */
    @javax.annotation.Nonnull
    public static EducationClass createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationClass();
    }
    /**
     * Gets the assignmentCategories property value. All categories associated with this class. Nullable.
     * @return a educationCategory
     */
    @javax.annotation.Nullable
    public java.util.List<EducationCategory> getAssignmentCategories() {
        return this.assignmentCategories;
    }
    /**
     * Gets the assignmentDefaults property value. Specifies class-level defaults respected by new assignments created in the class.
     * @return a educationAssignmentDefaults
     */
    @javax.annotation.Nullable
    public EducationAssignmentDefaults getAssignmentDefaults() {
        return this.assignmentDefaults;
    }
    /**
     * Gets the assignments property value. All assignments associated with this class. Nullable.
     * @return a educationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<EducationAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the assignmentSettings property value. Specifies class-level assignments settings.
     * @return a educationAssignmentSettings
     */
    @javax.annotation.Nullable
    public EducationAssignmentSettings getAssignmentSettings() {
        return this.assignmentSettings;
    }
    /**
     * Gets the classCode property value. Class code used by the school to identify the class.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClassCode() {
        return this.classCode;
    }
    /**
     * Gets the course property value. The course property
     * @return a educationCourse
     */
    @javax.annotation.Nullable
    public EducationCourse getCourse() {
        return this.course;
    }
    /**
     * Gets the createdBy property value. Entity who created the class
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the description property value. Description of the class.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Name of the class.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the externalId property value. ID of the class from the syncing system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * Gets the externalName property value. Name of the class in the syncing system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalName() {
        return this.externalName;
    }
    /**
     * Gets the externalSource property value. How this class was created. Possible values are: sis, manual.
     * @return a educationExternalSource
     */
    @javax.annotation.Nullable
    public EducationExternalSource getExternalSource() {
        return this.externalSource;
    }
    /**
     * Gets the externalSourceDetail property value. The name of the external source this resources was generated from.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalSourceDetail() {
        return this.externalSourceDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentCategories", (n) -> { this.setAssignmentCategories(n.getCollectionOfObjectValues(EducationCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentDefaults", (n) -> { this.setAssignmentDefaults(n.getObjectValue(EducationAssignmentDefaults::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(EducationAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentSettings", (n) -> { this.setAssignmentSettings(n.getObjectValue(EducationAssignmentSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("classCode", (n) -> { this.setClassCode(n.getStringValue()); });
        deserializerMap.put("course", (n) -> { this.setCourse(n.getObjectValue(EducationCourse::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("externalName", (n) -> { this.setExternalName(n.getStringValue()); });
        deserializerMap.put("externalSource", (n) -> { this.setExternalSource(n.getEnumValue(EducationExternalSource.class)); });
        deserializerMap.put("externalSourceDetail", (n) -> { this.setExternalSourceDetail(n.getStringValue()); });
        deserializerMap.put("grade", (n) -> { this.setGrade(n.getStringValue()); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("mailNickname", (n) -> { this.setMailNickname(n.getStringValue()); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(EducationUser::createFromDiscriminatorValue)); });
        deserializerMap.put("schools", (n) -> { this.setSchools(n.getCollectionOfObjectValues(EducationSchool::createFromDiscriminatorValue)); });
        deserializerMap.put("teachers", (n) -> { this.setTeachers(n.getCollectionOfObjectValues(EducationUser::createFromDiscriminatorValue)); });
        deserializerMap.put("term", (n) -> { this.setTerm(n.getObjectValue(EducationTerm::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the grade property value. Grade level of the class.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGrade() {
        return this.grade;
    }
    /**
     * Gets the group property value. The underlying Microsoft 365 group object.
     * @return a group
     */
    @javax.annotation.Nullable
    public Group getGroup() {
        return this.group;
    }
    /**
     * Gets the mailNickname property value. Mail name for sending email to all members, if this is enabled.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMailNickname() {
        return this.mailNickname;
    }
    /**
     * Gets the members property value. All users in the class. Nullable.
     * @return a educationUser
     */
    @javax.annotation.Nullable
    public java.util.List<EducationUser> getMembers() {
        return this.members;
    }
    /**
     * Gets the schools property value. All schools that this class is associated with. Nullable.
     * @return a educationSchool
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSchool> getSchools() {
        return this.schools;
    }
    /**
     * Gets the teachers property value. All teachers in the class. Nullable.
     * @return a educationUser
     */
    @javax.annotation.Nullable
    public java.util.List<EducationUser> getTeachers() {
        return this.teachers;
    }
    /**
     * Gets the term property value. Term for this class.
     * @return a educationTerm
     */
    @javax.annotation.Nullable
    public EducationTerm getTerm() {
        return this.term;
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
        writer.writeCollectionOfObjectValues("assignmentCategories", this.getAssignmentCategories());
        writer.writeObjectValue("assignmentDefaults", this.getAssignmentDefaults());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeObjectValue("assignmentSettings", this.getAssignmentSettings());
        writer.writeStringValue("classCode", this.getClassCode());
        writer.writeObjectValue("course", this.getCourse());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeStringValue("externalName", this.getExternalName());
        writer.writeEnumValue("externalSource", this.getExternalSource());
        writer.writeStringValue("externalSourceDetail", this.getExternalSourceDetail());
        writer.writeStringValue("grade", this.getGrade());
        writer.writeObjectValue("group", this.getGroup());
        writer.writeStringValue("mailNickname", this.getMailNickname());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeCollectionOfObjectValues("schools", this.getSchools());
        writer.writeCollectionOfObjectValues("teachers", this.getTeachers());
        writer.writeObjectValue("term", this.getTerm());
    }
    /**
     * Sets the assignmentCategories property value. All categories associated with this class. Nullable.
     * @param value Value to set for the assignmentCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentCategories(@javax.annotation.Nullable final java.util.List<EducationCategory> value) {
        this.assignmentCategories = value;
    }
    /**
     * Sets the assignmentDefaults property value. Specifies class-level defaults respected by new assignments created in the class.
     * @param value Value to set for the assignmentDefaults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentDefaults(@javax.annotation.Nullable final EducationAssignmentDefaults value) {
        this.assignmentDefaults = value;
    }
    /**
     * Sets the assignments property value. All assignments associated with this class. Nullable.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<EducationAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the assignmentSettings property value. Specifies class-level assignments settings.
     * @param value Value to set for the assignmentSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentSettings(@javax.annotation.Nullable final EducationAssignmentSettings value) {
        this.assignmentSettings = value;
    }
    /**
     * Sets the classCode property value. Class code used by the school to identify the class.
     * @param value Value to set for the classCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassCode(@javax.annotation.Nullable final String value) {
        this.classCode = value;
    }
    /**
     * Sets the course property value. The course property
     * @param value Value to set for the course property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCourse(@javax.annotation.Nullable final EducationCourse value) {
        this.course = value;
    }
    /**
     * Sets the createdBy property value. Entity who created the class
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the description property value. Description of the class.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Name of the class.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the externalId property value. ID of the class from the syncing system.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the externalName property value. Name of the class in the syncing system.
     * @param value Value to set for the externalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalName(@javax.annotation.Nullable final String value) {
        this.externalName = value;
    }
    /**
     * Sets the externalSource property value. How this class was created. Possible values are: sis, manual.
     * @param value Value to set for the externalSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalSource(@javax.annotation.Nullable final EducationExternalSource value) {
        this.externalSource = value;
    }
    /**
     * Sets the externalSourceDetail property value. The name of the external source this resources was generated from.
     * @param value Value to set for the externalSourceDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalSourceDetail(@javax.annotation.Nullable final String value) {
        this.externalSourceDetail = value;
    }
    /**
     * Sets the grade property value. Grade level of the class.
     * @param value Value to set for the grade property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGrade(@javax.annotation.Nullable final String value) {
        this.grade = value;
    }
    /**
     * Sets the group property value. The underlying Microsoft 365 group object.
     * @param value Value to set for the group property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroup(@javax.annotation.Nullable final Group value) {
        this.group = value;
    }
    /**
     * Sets the mailNickname property value. Mail name for sending email to all members, if this is enabled.
     * @param value Value to set for the mailNickname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailNickname(@javax.annotation.Nullable final String value) {
        this.mailNickname = value;
    }
    /**
     * Sets the members property value. All users in the class. Nullable.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<EducationUser> value) {
        this.members = value;
    }
    /**
     * Sets the schools property value. All schools that this class is associated with. Nullable.
     * @param value Value to set for the schools property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchools(@javax.annotation.Nullable final java.util.List<EducationSchool> value) {
        this.schools = value;
    }
    /**
     * Sets the teachers property value. All teachers in the class. Nullable.
     * @param value Value to set for the teachers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeachers(@javax.annotation.Nullable final java.util.List<EducationUser> value) {
        this.teachers = value;
    }
    /**
     * Sets the term property value. Term for this class.
     * @param value Value to set for the term property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTerm(@javax.annotation.Nullable final EducationTerm value) {
        this.term = value;
    }
}
