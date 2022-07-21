package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSchool extends EducationOrganization implements Parsable {
    /** Address of the school. */
    private PhysicalAddress _address;
    /** The underlying administrativeUnit for this school. */
    private AdministrativeUnit _administrativeUnit;
    /** Classes taught at the school. Nullable. */
    private java.util.List<EducationClass> _classes;
    /** Entity who created the school. */
    private IdentitySet _createdBy;
    /** ID of school in syncing system. */
    private String _externalId;
    /** ID of principal in syncing system. */
    private String _externalPrincipalId;
    /** The fax property */
    private String _fax;
    /** Highest grade taught. */
    private String _highestGrade;
    /** Lowest grade taught. */
    private String _lowestGrade;
    /** Phone number of school. */
    private String _phone;
    /** Email address of the principal. */
    private String _principalEmail;
    /** Name of the principal. */
    private String _principalName;
    /** School Number. */
    private String _schoolNumber;
    /** Users in the school. Nullable. */
    private java.util.List<EducationUser> _users;
    /**
     * Instantiates a new EducationSchool and sets the default values.
     * @return a void
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
        return this._address;
    }
    /**
     * Gets the administrativeUnit property value. The underlying administrativeUnit for this school.
     * @return a administrativeUnit
     */
    @javax.annotation.Nullable
    public AdministrativeUnit getAdministrativeUnit() {
        return this._administrativeUnit;
    }
    /**
     * Gets the classes property value. Classes taught at the school. Nullable.
     * @return a educationClass
     */
    @javax.annotation.Nullable
    public java.util.List<EducationClass> getClasses() {
        return this._classes;
    }
    /**
     * Gets the createdBy property value. Entity who created the school.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the externalId property value. ID of school in syncing system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * Gets the externalPrincipalId property value. ID of principal in syncing system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalPrincipalId() {
        return this._externalPrincipalId;
    }
    /**
     * Gets the fax property value. The fax property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFax() {
        return this._fax;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationSchool currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
            this.put("administrativeUnit", (n) -> { currentObject.setAdministrativeUnit(n.getObjectValue(AdministrativeUnit::createFromDiscriminatorValue)); });
            this.put("classes", (n) -> { currentObject.setClasses(n.getCollectionOfObjectValues(EducationClass::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
            this.put("externalPrincipalId", (n) -> { currentObject.setExternalPrincipalId(n.getStringValue()); });
            this.put("fax", (n) -> { currentObject.setFax(n.getStringValue()); });
            this.put("highestGrade", (n) -> { currentObject.setHighestGrade(n.getStringValue()); });
            this.put("lowestGrade", (n) -> { currentObject.setLowestGrade(n.getStringValue()); });
            this.put("phone", (n) -> { currentObject.setPhone(n.getStringValue()); });
            this.put("principalEmail", (n) -> { currentObject.setPrincipalEmail(n.getStringValue()); });
            this.put("principalName", (n) -> { currentObject.setPrincipalName(n.getStringValue()); });
            this.put("schoolNumber", (n) -> { currentObject.setSchoolNumber(n.getStringValue()); });
            this.put("users", (n) -> { currentObject.setUsers(n.getCollectionOfObjectValues(EducationUser::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the highestGrade property value. Highest grade taught.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHighestGrade() {
        return this._highestGrade;
    }
    /**
     * Gets the lowestGrade property value. Lowest grade taught.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLowestGrade() {
        return this._lowestGrade;
    }
    /**
     * Gets the phone property value. Phone number of school.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhone() {
        return this._phone;
    }
    /**
     * Gets the principalEmail property value. Email address of the principal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalEmail() {
        return this._principalEmail;
    }
    /**
     * Gets the principalName property value. Name of the principal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalName() {
        return this._principalName;
    }
    /**
     * Gets the schoolNumber property value. School Number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSchoolNumber() {
        return this._schoolNumber;
    }
    /**
     * Gets the users property value. Users in the school. Nullable.
     * @return a educationUser
     */
    @javax.annotation.Nullable
    public java.util.List<EducationUser> getUsers() {
        return this._users;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this._address = value;
    }
    /**
     * Sets the administrativeUnit property value. The underlying administrativeUnit for this school.
     * @param value Value to set for the administrativeUnit property.
     * @return a void
     */
    public void setAdministrativeUnit(@javax.annotation.Nullable final AdministrativeUnit value) {
        this._administrativeUnit = value;
    }
    /**
     * Sets the classes property value. Classes taught at the school. Nullable.
     * @param value Value to set for the classes property.
     * @return a void
     */
    public void setClasses(@javax.annotation.Nullable final java.util.List<EducationClass> value) {
        this._classes = value;
    }
    /**
     * Sets the createdBy property value. Entity who created the school.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the externalId property value. ID of school in syncing system.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the externalPrincipalId property value. ID of principal in syncing system.
     * @param value Value to set for the externalPrincipalId property.
     * @return a void
     */
    public void setExternalPrincipalId(@javax.annotation.Nullable final String value) {
        this._externalPrincipalId = value;
    }
    /**
     * Sets the fax property value. The fax property
     * @param value Value to set for the fax property.
     * @return a void
     */
    public void setFax(@javax.annotation.Nullable final String value) {
        this._fax = value;
    }
    /**
     * Sets the highestGrade property value. Highest grade taught.
     * @param value Value to set for the highestGrade property.
     * @return a void
     */
    public void setHighestGrade(@javax.annotation.Nullable final String value) {
        this._highestGrade = value;
    }
    /**
     * Sets the lowestGrade property value. Lowest grade taught.
     * @param value Value to set for the lowestGrade property.
     * @return a void
     */
    public void setLowestGrade(@javax.annotation.Nullable final String value) {
        this._lowestGrade = value;
    }
    /**
     * Sets the phone property value. Phone number of school.
     * @param value Value to set for the phone property.
     * @return a void
     */
    public void setPhone(@javax.annotation.Nullable final String value) {
        this._phone = value;
    }
    /**
     * Sets the principalEmail property value. Email address of the principal.
     * @param value Value to set for the principalEmail property.
     * @return a void
     */
    public void setPrincipalEmail(@javax.annotation.Nullable final String value) {
        this._principalEmail = value;
    }
    /**
     * Sets the principalName property value. Name of the principal.
     * @param value Value to set for the principalName property.
     * @return a void
     */
    public void setPrincipalName(@javax.annotation.Nullable final String value) {
        this._principalName = value;
    }
    /**
     * Sets the schoolNumber property value. School Number.
     * @param value Value to set for the schoolNumber property.
     * @return a void
     */
    public void setSchoolNumber(@javax.annotation.Nullable final String value) {
        this._schoolNumber = value;
    }
    /**
     * Sets the users property value. Users in the school. Nullable.
     * @param value Value to set for the users property.
     * @return a void
     */
    public void setUsers(@javax.annotation.Nullable final java.util.List<EducationUser> value) {
        this._users = value;
    }
}
