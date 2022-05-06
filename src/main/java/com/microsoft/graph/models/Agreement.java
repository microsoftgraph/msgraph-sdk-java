package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Agreement extends Entity implements Parsable {
    /** Read-only. Information about acceptances of this agreement.  */
    private java.util.List<AgreementAcceptance> _acceptances;
    /** Display name of the agreement. The display name is used for internal tracking of the agreement but is not shown to end users who view the agreement. Supports $filter (eq).  */
    private String _displayName;
    /** Default PDF linked to this agreement.  */
    private AgreementFile _file;
    /** PDFs linked to this agreement. Note: This property is in the process of being deprecated. Use the  file property instead.  */
    private java.util.List<AgreementFileLocalization> _files;
    /** This setting enables you to require end users to accept this agreement on every device that they are accessing it from. The end user will be required to register their device in Azure AD, if they haven't already done so. Supports $filter (eq).  */
    private Boolean _isPerDeviceAcceptanceRequired;
    /** Indicates whether the user has to expand the agreement before accepting. Supports $filter (eq).  */
    private Boolean _isViewingBeforeAcceptanceRequired;
    /** Expiration schedule and frequency of agreement for all users.  Supports $filter (eq).  */
    private TermsExpiration _termsExpiration;
    /** The duration after which the user must re-accept the terms of use. The value is represented in ISO 8601 format for durations.  */
    private Period _userReacceptRequiredFrequency;
    /**
     * Instantiates a new agreement and sets the default values.
     * @return a void
     */
    public Agreement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a agreement
     */
    @javax.annotation.Nonnull
    public static Agreement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Agreement();
    }
    /**
     * Gets the acceptances property value. Read-only. Information about acceptances of this agreement.
     * @return a agreementAcceptance
     */
    @javax.annotation.Nullable
    public java.util.List<AgreementAcceptance> getAcceptances() {
        return this._acceptances;
    }
    /**
     * Gets the displayName property value. Display name of the agreement. The display name is used for internal tracking of the agreement but is not shown to end users who view the agreement. Supports $filter (eq).
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
        final Agreement currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("acceptances", (n) -> { currentObject.setAcceptances(n.getCollectionOfObjectValues(AgreementAcceptance::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("file", (n) -> { currentObject.setFile(n.getObjectValue(AgreementFile::createFromDiscriminatorValue)); });
            this.put("files", (n) -> { currentObject.setFiles(n.getCollectionOfObjectValues(AgreementFileLocalization::createFromDiscriminatorValue)); });
            this.put("isPerDeviceAcceptanceRequired", (n) -> { currentObject.setIsPerDeviceAcceptanceRequired(n.getBooleanValue()); });
            this.put("isViewingBeforeAcceptanceRequired", (n) -> { currentObject.setIsViewingBeforeAcceptanceRequired(n.getBooleanValue()); });
            this.put("termsExpiration", (n) -> { currentObject.setTermsExpiration(n.getObjectValue(TermsExpiration::createFromDiscriminatorValue)); });
            this.put("userReacceptRequiredFrequency", (n) -> { currentObject.setUserReacceptRequiredFrequency(n.getPeriodValue()); });
        }};
    }
    /**
     * Gets the file property value. Default PDF linked to this agreement.
     * @return a agreementFile
     */
    @javax.annotation.Nullable
    public AgreementFile getFile() {
        return this._file;
    }
    /**
     * Gets the files property value. PDFs linked to this agreement. Note: This property is in the process of being deprecated. Use the  file property instead.
     * @return a agreementFileLocalization
     */
    @javax.annotation.Nullable
    public java.util.List<AgreementFileLocalization> getFiles() {
        return this._files;
    }
    /**
     * Gets the isPerDeviceAcceptanceRequired property value. This setting enables you to require end users to accept this agreement on every device that they are accessing it from. The end user will be required to register their device in Azure AD, if they haven't already done so. Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPerDeviceAcceptanceRequired() {
        return this._isPerDeviceAcceptanceRequired;
    }
    /**
     * Gets the isViewingBeforeAcceptanceRequired property value. Indicates whether the user has to expand the agreement before accepting. Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsViewingBeforeAcceptanceRequired() {
        return this._isViewingBeforeAcceptanceRequired;
    }
    /**
     * Gets the termsExpiration property value. Expiration schedule and frequency of agreement for all users.  Supports $filter (eq).
     * @return a termsExpiration
     */
    @javax.annotation.Nullable
    public TermsExpiration getTermsExpiration() {
        return this._termsExpiration;
    }
    /**
     * Gets the userReacceptRequiredFrequency property value. The duration after which the user must re-accept the terms of use. The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getUserReacceptRequiredFrequency() {
        return this._userReacceptRequiredFrequency;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acceptances", this.getAcceptances());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("file", this.getFile());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeBooleanValue("isPerDeviceAcceptanceRequired", this.getIsPerDeviceAcceptanceRequired());
        writer.writeBooleanValue("isViewingBeforeAcceptanceRequired", this.getIsViewingBeforeAcceptanceRequired());
        writer.writeObjectValue("termsExpiration", this.getTermsExpiration());
        writer.writePeriodValue("userReacceptRequiredFrequency", this.getUserReacceptRequiredFrequency());
    }
    /**
     * Sets the acceptances property value. Read-only. Information about acceptances of this agreement.
     * @param value Value to set for the acceptances property.
     * @return a void
     */
    public void setAcceptances(@javax.annotation.Nullable final java.util.List<AgreementAcceptance> value) {
        this._acceptances = value;
    }
    /**
     * Sets the displayName property value. Display name of the agreement. The display name is used for internal tracking of the agreement but is not shown to end users who view the agreement. Supports $filter (eq).
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the file property value. Default PDF linked to this agreement.
     * @param value Value to set for the file property.
     * @return a void
     */
    public void setFile(@javax.annotation.Nullable final AgreementFile value) {
        this._file = value;
    }
    /**
     * Sets the files property value. PDFs linked to this agreement. Note: This property is in the process of being deprecated. Use the  file property instead.
     * @param value Value to set for the files property.
     * @return a void
     */
    public void setFiles(@javax.annotation.Nullable final java.util.List<AgreementFileLocalization> value) {
        this._files = value;
    }
    /**
     * Sets the isPerDeviceAcceptanceRequired property value. This setting enables you to require end users to accept this agreement on every device that they are accessing it from. The end user will be required to register their device in Azure AD, if they haven't already done so. Supports $filter (eq).
     * @param value Value to set for the isPerDeviceAcceptanceRequired property.
     * @return a void
     */
    public void setIsPerDeviceAcceptanceRequired(@javax.annotation.Nullable final Boolean value) {
        this._isPerDeviceAcceptanceRequired = value;
    }
    /**
     * Sets the isViewingBeforeAcceptanceRequired property value. Indicates whether the user has to expand the agreement before accepting. Supports $filter (eq).
     * @param value Value to set for the isViewingBeforeAcceptanceRequired property.
     * @return a void
     */
    public void setIsViewingBeforeAcceptanceRequired(@javax.annotation.Nullable final Boolean value) {
        this._isViewingBeforeAcceptanceRequired = value;
    }
    /**
     * Sets the termsExpiration property value. Expiration schedule and frequency of agreement for all users.  Supports $filter (eq).
     * @param value Value to set for the termsExpiration property.
     * @return a void
     */
    public void setTermsExpiration(@javax.annotation.Nullable final TermsExpiration value) {
        this._termsExpiration = value;
    }
    /**
     * Sets the userReacceptRequiredFrequency property value. The duration after which the user must re-accept the terms of use. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the userReacceptRequiredFrequency property.
     * @return a void
     */
    public void setUserReacceptRequiredFrequency(@javax.annotation.Nullable final Period value) {
        this._userReacceptRequiredFrequency = value;
    }
}
