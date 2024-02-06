package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationClass extends Entity implements Parsable {
    /**
     * Instantiates a new EducationClass and sets the default values.
     */
    public EducationClass() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationClass
     */
    @jakarta.annotation.Nonnull
    public static EducationClass createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationClass();
    }
    /**
     * Gets the assignmentCategories property value. All categories associated with this class. Nullable.
     * @return a java.util.List<EducationCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationCategory> getAssignmentCategories() {
        return this.backingStore.get("assignmentCategories");
    }
    /**
     * Gets the assignmentDefaults property value. Specifies class-level defaults respected by new assignments created in the class.
     * @return a EducationAssignmentDefaults
     */
    @jakarta.annotation.Nullable
    public EducationAssignmentDefaults getAssignmentDefaults() {
        return this.backingStore.get("assignmentDefaults");
    }
    /**
     * Gets the assignments property value. All assignments associated with this class. Nullable.
     * @return a java.util.List<EducationAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the assignmentSettings property value. Specifies class-level assignments settings.
     * @return a EducationAssignmentSettings
     */
    @jakarta.annotation.Nullable
    public EducationAssignmentSettings getAssignmentSettings() {
        return this.backingStore.get("assignmentSettings");
    }
    /**
     * Gets the classCode property value. Class code used by the school to identify the class.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClassCode() {
        return this.backingStore.get("classCode");
    }
    /**
     * Gets the course property value. The course property
     * @return a EducationCourse
     */
    @jakarta.annotation.Nullable
    public EducationCourse getCourse() {
        return this.backingStore.get("course");
    }
    /**
     * Gets the createdBy property value. Entity who created the class
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the description property value. Description of the class.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Name of the class.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the externalId property value. ID of the class from the syncing system.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * Gets the externalName property value. Name of the class in the syncing system.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalName() {
        return this.backingStore.get("externalName");
    }
    /**
     * Gets the externalSource property value. How this class was created. Possible values are: sis, manual.
     * @return a EducationExternalSource
     */
    @jakarta.annotation.Nullable
    public EducationExternalSource getExternalSource() {
        return this.backingStore.get("externalSource");
    }
    /**
     * Gets the externalSourceDetail property value. The name of the external source this resources was generated from.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalSourceDetail() {
        return this.backingStore.get("externalSourceDetail");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
        deserializerMap.put("externalSource", (n) -> { this.setExternalSource(n.getEnumValue(EducationExternalSource::forValue)); });
        deserializerMap.put("externalSourceDetail", (n) -> { this.setExternalSourceDetail(n.getStringValue()); });
        deserializerMap.put("grade", (n) -> { this.setGrade(n.getStringValue()); });
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("mailNickname", (n) -> { this.setMailNickname(n.getStringValue()); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(EducationUser::createFromDiscriminatorValue)); });
        deserializerMap.put("modules", (n) -> { this.setModules(n.getCollectionOfObjectValues(EducationModule::createFromDiscriminatorValue)); });
        deserializerMap.put("schools", (n) -> { this.setSchools(n.getCollectionOfObjectValues(EducationSchool::createFromDiscriminatorValue)); });
        deserializerMap.put("teachers", (n) -> { this.setTeachers(n.getCollectionOfObjectValues(EducationUser::createFromDiscriminatorValue)); });
        deserializerMap.put("term", (n) -> { this.setTerm(n.getObjectValue(EducationTerm::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the grade property value. Grade level of the class.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGrade() {
        return this.backingStore.get("grade");
    }
    /**
     * Gets the group property value. The underlying Microsoft 365 group object.
     * @return a Group
     */
    @jakarta.annotation.Nullable
    public Group getGroup() {
        return this.backingStore.get("group");
    }
    /**
     * Gets the mailNickname property value. Mail name for sending email to all members, if this is enabled.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMailNickname() {
        return this.backingStore.get("mailNickname");
    }
    /**
     * Gets the members property value. All users in the class. Nullable.
     * @return a java.util.List<EducationUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationUser> getMembers() {
        return this.backingStore.get("members");
    }
    /**
     * Gets the modules property value. The modules property
     * @return a java.util.List<EducationModule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationModule> getModules() {
        return this.backingStore.get("modules");
    }
    /**
     * Gets the schools property value. All schools that this class is associated with. Nullable.
     * @return a java.util.List<EducationSchool>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationSchool> getSchools() {
        return this.backingStore.get("schools");
    }
    /**
     * Gets the teachers property value. All teachers in the class. Nullable.
     * @return a java.util.List<EducationUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationUser> getTeachers() {
        return this.backingStore.get("teachers");
    }
    /**
     * Gets the term property value. Term for this class.
     * @return a EducationTerm
     */
    @jakarta.annotation.Nullable
    public EducationTerm getTerm() {
        return this.backingStore.get("term");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeCollectionOfObjectValues("modules", this.getModules());
        writer.writeCollectionOfObjectValues("schools", this.getSchools());
        writer.writeCollectionOfObjectValues("teachers", this.getTeachers());
        writer.writeObjectValue("term", this.getTerm());
    }
    /**
     * Sets the assignmentCategories property value. All categories associated with this class. Nullable.
     * @param value Value to set for the assignmentCategories property.
     */
    public void setAssignmentCategories(@jakarta.annotation.Nullable final java.util.List<EducationCategory> value) {
        this.backingStore.set("assignmentCategories", value);
    }
    /**
     * Sets the assignmentDefaults property value. Specifies class-level defaults respected by new assignments created in the class.
     * @param value Value to set for the assignmentDefaults property.
     */
    public void setAssignmentDefaults(@jakarta.annotation.Nullable final EducationAssignmentDefaults value) {
        this.backingStore.set("assignmentDefaults", value);
    }
    /**
     * Sets the assignments property value. All assignments associated with this class. Nullable.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<EducationAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the assignmentSettings property value. Specifies class-level assignments settings.
     * @param value Value to set for the assignmentSettings property.
     */
    public void setAssignmentSettings(@jakarta.annotation.Nullable final EducationAssignmentSettings value) {
        this.backingStore.set("assignmentSettings", value);
    }
    /**
     * Sets the classCode property value. Class code used by the school to identify the class.
     * @param value Value to set for the classCode property.
     */
    public void setClassCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("classCode", value);
    }
    /**
     * Sets the course property value. The course property
     * @param value Value to set for the course property.
     */
    public void setCourse(@jakarta.annotation.Nullable final EducationCourse value) {
        this.backingStore.set("course", value);
    }
    /**
     * Sets the createdBy property value. Entity who created the class
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the description property value. Description of the class.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Name of the class.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the externalId property value. ID of the class from the syncing system.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the externalName property value. Name of the class in the syncing system.
     * @param value Value to set for the externalName property.
     */
    public void setExternalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalName", value);
    }
    /**
     * Sets the externalSource property value. How this class was created. Possible values are: sis, manual.
     * @param value Value to set for the externalSource property.
     */
    public void setExternalSource(@jakarta.annotation.Nullable final EducationExternalSource value) {
        this.backingStore.set("externalSource", value);
    }
    /**
     * Sets the externalSourceDetail property value. The name of the external source this resources was generated from.
     * @param value Value to set for the externalSourceDetail property.
     */
    public void setExternalSourceDetail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalSourceDetail", value);
    }
    /**
     * Sets the grade property value. Grade level of the class.
     * @param value Value to set for the grade property.
     */
    public void setGrade(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("grade", value);
    }
    /**
     * Sets the group property value. The underlying Microsoft 365 group object.
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final Group value) {
        this.backingStore.set("group", value);
    }
    /**
     * Sets the mailNickname property value. Mail name for sending email to all members, if this is enabled.
     * @param value Value to set for the mailNickname property.
     */
    public void setMailNickname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mailNickname", value);
    }
    /**
     * Sets the members property value. All users in the class. Nullable.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<EducationUser> value) {
        this.backingStore.set("members", value);
    }
    /**
     * Sets the modules property value. The modules property
     * @param value Value to set for the modules property.
     */
    public void setModules(@jakarta.annotation.Nullable final java.util.List<EducationModule> value) {
        this.backingStore.set("modules", value);
    }
    /**
     * Sets the schools property value. All schools that this class is associated with. Nullable.
     * @param value Value to set for the schools property.
     */
    public void setSchools(@jakarta.annotation.Nullable final java.util.List<EducationSchool> value) {
        this.backingStore.set("schools", value);
    }
    /**
     * Sets the teachers property value. All teachers in the class. Nullable.
     * @param value Value to set for the teachers property.
     */
    public void setTeachers(@jakarta.annotation.Nullable final java.util.List<EducationUser> value) {
        this.backingStore.set("teachers", value);
    }
    /**
     * Sets the term property value. Term for this class.
     * @param value Value to set for the term property.
     */
    public void setTerm(@jakarta.annotation.Nullable final EducationTerm value) {
        this.backingStore.set("term", value);
    }
}
