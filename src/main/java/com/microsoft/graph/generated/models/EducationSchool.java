package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationSchool extends EducationOrganization implements Parsable {
    /**
     * Instantiates a new EducationSchool and sets the default values.
     */
    public EducationSchool() {
        super();
        this.setOdataType("#microsoft.graph.educationSchool");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationSchool
     */
    @jakarta.annotation.Nonnull
    public static EducationSchool createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSchool();
    }
    /**
     * Gets the address property value. Address of the school.
     * @return a PhysicalAddress
     */
    @jakarta.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this.backingStore.get("address");
    }
    /**
     * Gets the administrativeUnit property value. The underlying administrativeUnit for this school.
     * @return a AdministrativeUnit
     */
    @jakarta.annotation.Nullable
    public AdministrativeUnit getAdministrativeUnit() {
        return this.backingStore.get("administrativeUnit");
    }
    /**
     * Gets the classes property value. Classes taught at the school. Nullable.
     * @return a java.util.List<EducationClass>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationClass> getClasses() {
        return this.backingStore.get("classes");
    }
    /**
     * Gets the createdBy property value. Entity who created the school.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the externalId property value. ID of school in syncing system.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * Gets the externalPrincipalId property value. ID of principal in syncing system.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalPrincipalId() {
        return this.backingStore.get("externalPrincipalId");
    }
    /**
     * Gets the fax property value. The fax property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFax() {
        return this.backingStore.get("fax");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHighestGrade() {
        return this.backingStore.get("highestGrade");
    }
    /**
     * Gets the lowestGrade property value. Lowest grade taught.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLowestGrade() {
        return this.backingStore.get("lowestGrade");
    }
    /**
     * Gets the phone property value. Phone number of school.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.backingStore.get("phone");
    }
    /**
     * Gets the principalEmail property value. Email address of the principal.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrincipalEmail() {
        return this.backingStore.get("principalEmail");
    }
    /**
     * Gets the principalName property value. Name of the principal.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrincipalName() {
        return this.backingStore.get("principalName");
    }
    /**
     * Gets the schoolNumber property value. School Number.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSchoolNumber() {
        return this.backingStore.get("schoolNumber");
    }
    /**
     * Gets the users property value. Users in the school. Nullable.
     * @return a java.util.List<EducationUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationUser> getUsers() {
        return this.backingStore.get("users");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAddress(@jakarta.annotation.Nullable final PhysicalAddress value) {
        this.backingStore.set("address", value);
    }
    /**
     * Sets the administrativeUnit property value. The underlying administrativeUnit for this school.
     * @param value Value to set for the administrativeUnit property.
     */
    public void setAdministrativeUnit(@jakarta.annotation.Nullable final AdministrativeUnit value) {
        this.backingStore.set("administrativeUnit", value);
    }
    /**
     * Sets the classes property value. Classes taught at the school. Nullable.
     * @param value Value to set for the classes property.
     */
    public void setClasses(@jakarta.annotation.Nullable final java.util.List<EducationClass> value) {
        this.backingStore.set("classes", value);
    }
    /**
     * Sets the createdBy property value. Entity who created the school.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the externalId property value. ID of school in syncing system.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the externalPrincipalId property value. ID of principal in syncing system.
     * @param value Value to set for the externalPrincipalId property.
     */
    public void setExternalPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalPrincipalId", value);
    }
    /**
     * Sets the fax property value. The fax property
     * @param value Value to set for the fax property.
     */
    public void setFax(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fax", value);
    }
    /**
     * Sets the highestGrade property value. Highest grade taught.
     * @param value Value to set for the highestGrade property.
     */
    public void setHighestGrade(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("highestGrade", value);
    }
    /**
     * Sets the lowestGrade property value. Lowest grade taught.
     * @param value Value to set for the lowestGrade property.
     */
    public void setLowestGrade(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lowestGrade", value);
    }
    /**
     * Sets the phone property value. Phone number of school.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phone", value);
    }
    /**
     * Sets the principalEmail property value. Email address of the principal.
     * @param value Value to set for the principalEmail property.
     */
    public void setPrincipalEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalEmail", value);
    }
    /**
     * Sets the principalName property value. Name of the principal.
     * @param value Value to set for the principalName property.
     */
    public void setPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalName", value);
    }
    /**
     * Sets the schoolNumber property value. School Number.
     * @param value Value to set for the schoolNumber property.
     */
    public void setSchoolNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("schoolNumber", value);
    }
    /**
     * Sets the users property value. Users in the school. Nullable.
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<EducationUser> value) {
        this.backingStore.set("users", value);
    }
}
