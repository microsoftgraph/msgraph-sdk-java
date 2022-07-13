package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationClass extends Entity implements Parsable {
    /** All categories associated with this class. Nullable. */
    private java.util.List<EducationCategory> _assignmentCategories;
    /** Specifies class-level defaults respected by new assignments created in the class. */
    private EducationAssignmentDefaults _assignmentDefaults;
    /** All assignments associated with this class. Nullable. */
    private java.util.List<EducationAssignment> _assignments;
    /** Specifies class-level assignments settings. */
    private EducationAssignmentSettings _assignmentSettings;
    /** Class code used by the school to identify the class. */
    private String _classCode;
    /** Course information for the class. */
    private EducationCourse _course;
    /** Entity who created the class. */
    private IdentitySet _createdBy;
    /** Description of the class. */
    private String _description;
    /** Name of the class. */
    private String _displayName;
    /** ID of the class from the syncing system. */
    private String _externalId;
    /** Name of the class in the syncing system. */
    private String _externalName;
    /** The type of external source this resource was generated from (automatically determined from externalSourceDetail). Possible values are: sis, lms, or manual. */
    private EducationExternalSource _externalSource;
    /** The name of the external source this resources was generated from. */
    private String _externalSourceDetail;
    /** Grade level of the class. */
    private String _grade;
    /** The underlying Microsoft 365 group object. */
    private Group _group;
    /** Mail name for sending email to all members, if this is enabled. */
    private String _mailNickname;
    /** All users in the class. Nullable. */
    private java.util.List<EducationUser> _members;
    /** All schools that this class is associated with. Nullable. */
    private java.util.List<EducationSchool> _schools;
    /** All teachers in the class. Nullable. */
    private java.util.List<EducationUser> _teachers;
    /** Term for the class. */
    private EducationTerm _term;
    /**
     * Instantiates a new EducationClass and sets the default values.
     * @return a void
     */
    public EducationClass() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationClass
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
        return this._assignmentCategories;
    }
    /**
     * Gets the assignmentDefaults property value. Specifies class-level defaults respected by new assignments created in the class.
     * @return a educationAssignmentDefaults
     */
    @javax.annotation.Nullable
    public EducationAssignmentDefaults getAssignmentDefaults() {
        return this._assignmentDefaults;
    }
    /**
     * Gets the assignments property value. All assignments associated with this class. Nullable.
     * @return a educationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<EducationAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the assignmentSettings property value. Specifies class-level assignments settings.
     * @return a educationAssignmentSettings
     */
    @javax.annotation.Nullable
    public EducationAssignmentSettings getAssignmentSettings() {
        return this._assignmentSettings;
    }
    /**
     * Gets the classCode property value. Class code used by the school to identify the class.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClassCode() {
        return this._classCode;
    }
    /**
     * Gets the course property value. Course information for the class.
     * @return a educationCourse
     */
    @javax.annotation.Nullable
    public EducationCourse getCourse() {
        return this._course;
    }
    /**
     * Gets the createdBy property value. Entity who created the class.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the description property value. Description of the class.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Name of the class.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the externalId property value. ID of the class from the syncing system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * Gets the externalName property value. Name of the class in the syncing system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalName() {
        return this._externalName;
    }
    /**
     * Gets the externalSource property value. The type of external source this resource was generated from (automatically determined from externalSourceDetail). Possible values are: sis, lms, or manual.
     * @return a educationExternalSource
     */
    @javax.annotation.Nullable
    public EducationExternalSource getExternalSource() {
        return this._externalSource;
    }
    /**
     * Gets the externalSourceDetail property value. The name of the external source this resources was generated from.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalSourceDetail() {
        return this._externalSourceDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationClass currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignmentCategories", (n) -> { currentObject.setAssignmentCategories(n.getCollectionOfObjectValues(EducationCategory::createFromDiscriminatorValue)); });
            this.put("assignmentDefaults", (n) -> { currentObject.setAssignmentDefaults(n.getObjectValue(EducationAssignmentDefaults::createFromDiscriminatorValue)); });
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(EducationAssignment::createFromDiscriminatorValue)); });
            this.put("assignmentSettings", (n) -> { currentObject.setAssignmentSettings(n.getObjectValue(EducationAssignmentSettings::createFromDiscriminatorValue)); });
            this.put("classCode", (n) -> { currentObject.setClassCode(n.getStringValue()); });
            this.put("course", (n) -> { currentObject.setCourse(n.getObjectValue(EducationCourse::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
            this.put("externalName", (n) -> { currentObject.setExternalName(n.getStringValue()); });
            this.put("externalSource", (n) -> { currentObject.setExternalSource(n.getEnumValue(EducationExternalSource.class)); });
            this.put("externalSourceDetail", (n) -> { currentObject.setExternalSourceDetail(n.getStringValue()); });
            this.put("grade", (n) -> { currentObject.setGrade(n.getStringValue()); });
            this.put("group", (n) -> { currentObject.setGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
            this.put("mailNickname", (n) -> { currentObject.setMailNickname(n.getStringValue()); });
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfObjectValues(EducationUser::createFromDiscriminatorValue)); });
            this.put("schools", (n) -> { currentObject.setSchools(n.getCollectionOfObjectValues(EducationSchool::createFromDiscriminatorValue)); });
            this.put("teachers", (n) -> { currentObject.setTeachers(n.getCollectionOfObjectValues(EducationUser::createFromDiscriminatorValue)); });
            this.put("term", (n) -> { currentObject.setTerm(n.getObjectValue(EducationTerm::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the grade property value. Grade level of the class.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGrade() {
        return this._grade;
    }
    /**
     * Gets the group property value. The underlying Microsoft 365 group object.
     * @return a group
     */
    @javax.annotation.Nullable
    public Group getGroup() {
        return this._group;
    }
    /**
     * Gets the mailNickname property value. Mail name for sending email to all members, if this is enabled.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMailNickname() {
        return this._mailNickname;
    }
    /**
     * Gets the members property value. All users in the class. Nullable.
     * @return a educationUser
     */
    @javax.annotation.Nullable
    public java.util.List<EducationUser> getMembers() {
        return this._members;
    }
    /**
     * Gets the schools property value. All schools that this class is associated with. Nullable.
     * @return a educationSchool
     */
    @javax.annotation.Nullable
    public java.util.List<EducationSchool> getSchools() {
        return this._schools;
    }
    /**
     * Gets the teachers property value. All teachers in the class. Nullable.
     * @return a educationUser
     */
    @javax.annotation.Nullable
    public java.util.List<EducationUser> getTeachers() {
        return this._teachers;
    }
    /**
     * Gets the term property value. Term for the class.
     * @return a educationTerm
     */
    @javax.annotation.Nullable
    public EducationTerm getTerm() {
        return this._term;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAssignmentCategories(@javax.annotation.Nullable final java.util.List<EducationCategory> value) {
        this._assignmentCategories = value;
    }
    /**
     * Sets the assignmentDefaults property value. Specifies class-level defaults respected by new assignments created in the class.
     * @param value Value to set for the assignmentDefaults property.
     * @return a void
     */
    public void setAssignmentDefaults(@javax.annotation.Nullable final EducationAssignmentDefaults value) {
        this._assignmentDefaults = value;
    }
    /**
     * Sets the assignments property value. All assignments associated with this class. Nullable.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<EducationAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the assignmentSettings property value. Specifies class-level assignments settings.
     * @param value Value to set for the assignmentSettings property.
     * @return a void
     */
    public void setAssignmentSettings(@javax.annotation.Nullable final EducationAssignmentSettings value) {
        this._assignmentSettings = value;
    }
    /**
     * Sets the classCode property value. Class code used by the school to identify the class.
     * @param value Value to set for the classCode property.
     * @return a void
     */
    public void setClassCode(@javax.annotation.Nullable final String value) {
        this._classCode = value;
    }
    /**
     * Sets the course property value. Course information for the class.
     * @param value Value to set for the course property.
     * @return a void
     */
    public void setCourse(@javax.annotation.Nullable final EducationCourse value) {
        this._course = value;
    }
    /**
     * Sets the createdBy property value. Entity who created the class.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the description property value. Description of the class.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Name of the class.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the externalId property value. ID of the class from the syncing system.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the externalName property value. Name of the class in the syncing system.
     * @param value Value to set for the externalName property.
     * @return a void
     */
    public void setExternalName(@javax.annotation.Nullable final String value) {
        this._externalName = value;
    }
    /**
     * Sets the externalSource property value. The type of external source this resource was generated from (automatically determined from externalSourceDetail). Possible values are: sis, lms, or manual.
     * @param value Value to set for the externalSource property.
     * @return a void
     */
    public void setExternalSource(@javax.annotation.Nullable final EducationExternalSource value) {
        this._externalSource = value;
    }
    /**
     * Sets the externalSourceDetail property value. The name of the external source this resources was generated from.
     * @param value Value to set for the externalSourceDetail property.
     * @return a void
     */
    public void setExternalSourceDetail(@javax.annotation.Nullable final String value) {
        this._externalSourceDetail = value;
    }
    /**
     * Sets the grade property value. Grade level of the class.
     * @param value Value to set for the grade property.
     * @return a void
     */
    public void setGrade(@javax.annotation.Nullable final String value) {
        this._grade = value;
    }
    /**
     * Sets the group property value. The underlying Microsoft 365 group object.
     * @param value Value to set for the group property.
     * @return a void
     */
    public void setGroup(@javax.annotation.Nullable final Group value) {
        this._group = value;
    }
    /**
     * Sets the mailNickname property value. Mail name for sending email to all members, if this is enabled.
     * @param value Value to set for the mailNickname property.
     * @return a void
     */
    public void setMailNickname(@javax.annotation.Nullable final String value) {
        this._mailNickname = value;
    }
    /**
     * Sets the members property value. All users in the class. Nullable.
     * @param value Value to set for the members property.
     * @return a void
     */
    public void setMembers(@javax.annotation.Nullable final java.util.List<EducationUser> value) {
        this._members = value;
    }
    /**
     * Sets the schools property value. All schools that this class is associated with. Nullable.
     * @param value Value to set for the schools property.
     * @return a void
     */
    public void setSchools(@javax.annotation.Nullable final java.util.List<EducationSchool> value) {
        this._schools = value;
    }
    /**
     * Sets the teachers property value. All teachers in the class. Nullable.
     * @param value Value to set for the teachers property.
     * @return a void
     */
    public void setTeachers(@javax.annotation.Nullable final java.util.List<EducationUser> value) {
        this._teachers = value;
    }
    /**
     * Sets the term property value. Term for the class.
     * @param value Value to set for the term property.
     * @return a void
     */
    public void setTerm(@javax.annotation.Nullable final EducationTerm value) {
        this._term = value;
    }
}
