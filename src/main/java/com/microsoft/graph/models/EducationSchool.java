package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSchool extends EducationOrganization implements Parsable {
    /**
     * Address of the school.
     */
    private PhysicalAddress address;
    /**
     * The underlying administrativeUnit for this school.
     */
    private AdministrativeUnit administrativeUnit;
    /**
     * Classes taught at the school. Nullable.
     */
    private java.util.List<EducationClass> classes;
    /**
     * Entity who created the school.
     */
    private IdentitySet createdBy;
    /**
     * ID of school in syncing system.
     */
    private String externalId;
    /**
     * ID of principal in syncing system.
     */
    private String externalPrincipalId;
    /**
     * The fax property
     */
    private String fax;
    /**
     * Highest grade taught.
     */
    private String highestGrade;
    /**
     * Lowest grade taught.
     */
    private String lowestGrade;
    /**
     * Phone number of school.
     */
    private String phone;
    /**
     * Email address of the principal.
     */
    private String principalEmail;
    /**
     * Name of the principal.
     */
    private String principalName;
    /**
     * School Number.
     */
    private String schoolNumber;
    /**
     * Users in the school. Nullable.
     */
    private java.util.List<EducationUser> users;
    /**
     * Instantiates a new educationSchool and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationSchool() {
        super();
        this.setOdataType("#microsoft.graph.educationSchool");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationSchool
     */
    @javax.annotation.Nonnull
    public static EducationSchool createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSchool();
    }
    /**
     * Gets the address property value. Address of the school.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this.address;
    }
    /**
     * Gets the administrativeUnit property value. The underlying administrativeUnit for this school.
     * @return a administrativeUnit
     */
    @javax.annotation.Nullable
    public AdministrativeUnit getAdministrativeUnit() {
        return this.administrativeUnit;
    }
    /**
     * Gets the classes property value. Classes taught at the school. Nullable.
     * @return a educationClass
     */
    @javax.annotation.Nullable
    public java.util.List<EducationClass> getClasses() {
        return this.classes;
    }
    /**
     * Gets the createdBy property value. Entity who created the school.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the externalId property value. ID of school in syncing system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * Gets the externalPrincipalId property value. ID of principal in syncing system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalPrincipalId() {
        return this.externalPrincipalId;
    }
    /**
     * Gets the fax property value. The fax property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFax() {
        return this.fax;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("administrativeUnit", (n) -> { this.setAdministrativeUnit(n.getObjectValue(AdministrativeUnit::createFromDiscriminatorValue)); });
        deserializerMap.put("classes", (n) -> { this.setClasses(n.getCollectionOfObjectValues(EducationClass::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("externalPrincipalId", (n) -> { this.setExternalPrincipalId(n.getStringValue()); });
        deserializerMap.put("fax", (n) -> { this.setFax(n.getStringValue()); });
        deserializerMap.put("highestGrade", (n) -> { this.setHighestGrade(n.getStringValue()); });
        deserializerMap.put("lowestGrade", (n) -> { this.setLowestGrade(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("principalEmail", (n) -> { this.setPrincipalEmail(n.getStringValue()); });
        deserializerMap.put("principalName", (n) -> { this.setPrincipalName(n.getStringValue()); });
        deserializerMap.put("schoolNumber", (n) -> { this.setSchoolNumber(n.getStringValue()); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(EducationUser::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the highestGrade property value. Highest grade taught.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHighestGrade() {
        return this.highestGrade;
    }
    /**
     * Gets the lowestGrade property value. Lowest grade taught.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLowestGrade() {
        return this.lowestGrade;
    }
    /**
     * Gets the phone property value. Phone number of school.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the principalEmail property value. Email address of the principal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalEmail() {
        return this.principalEmail;
    }
    /**
     * Gets the principalName property value. Name of the principal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalName() {
        return this.principalName;
    }
    /**
     * Gets the schoolNumber property value. School Number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSchoolNumber() {
        return this.schoolNumber;
    }
    /**
     * Gets the users property value. Users in the school. Nullable.
     * @return a educationUser
     */
    @javax.annotation.Nullable
    public java.util.List<EducationUser> getUsers() {
        return this.users;
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
        writer.writeObjectValue("address", this.getAddress());
        writer.writeObjectValue("administrativeUnit", this.getAdministrativeUnit());
        writer.writeCollectionOfObjectValues("classes", this.getClasses());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeStringValue("externalPrincipalId", this.getExternalPrincipalId());
        writer.writeStringValue("fax", this.getFax());
        writer.writeStringValue("highestGrade", this.getHighestGrade());
        writer.writeStringValue("lowestGrade", this.getLowestGrade());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeStringValue("principalEmail", this.getPrincipalEmail());
        writer.writeStringValue("principalName", this.getPrincipalName());
        writer.writeStringValue("schoolNumber", this.getSchoolNumber());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
    }
    /**
     * Sets the address property value. Address of the school.
     * @param value Value to set for the address property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this.address = value;
    }
    /**
     * Sets the administrativeUnit property value. The underlying administrativeUnit for this school.
     * @param value Value to set for the administrativeUnit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdministrativeUnit(@javax.annotation.Nullable final AdministrativeUnit value) {
        this.administrativeUnit = value;
    }
    /**
     * Sets the classes property value. Classes taught at the school. Nullable.
     * @param value Value to set for the classes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClasses(@javax.annotation.Nullable final java.util.List<EducationClass> value) {
        this.classes = value;
    }
    /**
     * Sets the createdBy property value. Entity who created the school.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the externalId property value. ID of school in syncing system.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the externalPrincipalId property value. ID of principal in syncing system.
     * @param value Value to set for the externalPrincipalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalPrincipalId(@javax.annotation.Nullable final String value) {
        this.externalPrincipalId = value;
    }
    /**
     * Sets the fax property value. The fax property
     * @param value Value to set for the fax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFax(@javax.annotation.Nullable final String value) {
        this.fax = value;
    }
    /**
     * Sets the highestGrade property value. Highest grade taught.
     * @param value Value to set for the highestGrade property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHighestGrade(@javax.annotation.Nullable final String value) {
        this.highestGrade = value;
    }
    /**
     * Sets the lowestGrade property value. Lowest grade taught.
     * @param value Value to set for the lowestGrade property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLowestGrade(@javax.annotation.Nullable final String value) {
        this.lowestGrade = value;
    }
    /**
     * Sets the phone property value. Phone number of school.
     * @param value Value to set for the phone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhone(@javax.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the principalEmail property value. Email address of the principal.
     * @param value Value to set for the principalEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalEmail(@javax.annotation.Nullable final String value) {
        this.principalEmail = value;
    }
    /**
     * Sets the principalName property value. Name of the principal.
     * @param value Value to set for the principalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalName(@javax.annotation.Nullable final String value) {
        this.principalName = value;
    }
    /**
     * Sets the schoolNumber property value. School Number.
     * @param value Value to set for the schoolNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchoolNumber(@javax.annotation.Nullable final String value) {
        this.schoolNumber = value;
    }
    /**
     * Sets the users property value. Users in the school. Nullable.
     * @param value Value to set for the users property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsers(@javax.annotation.Nullable final java.util.List<EducationUser> value) {
        this.users = value;
    }
}
