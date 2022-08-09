package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SecureScoreControlProfile extends Entity implements Parsable {
    /** Control action type (Config, Review, Behavior). */
    private String _actionType;
    /** URL to where the control can be actioned. */
    private String _actionUrl;
    /** GUID string for tenant ID. */
    private String _azureTenantId;
    /** The collection of compliance information associated with secure score control */
    private java.util.List<ComplianceInformation> _complianceInformation;
    /** Control action category (Account, Data, Device, Apps, Infrastructure). */
    private String _controlCategory;
    /** Flag to indicate where the tenant has marked a control (ignore, thirdParty, reviewed) (supports update). */
    private java.util.List<SecureScoreControlStateUpdate> _controlStateUpdates;
    /** Flag to indicate if a control is depreciated. */
    private Boolean _deprecated;
    /** Resource cost of implemmentating control (low, moderate, high). */
    private String _implementationCost;
    /** Time at which the control profile entity was last modified. The Timestamp type represents date and time */
    private OffsetDateTime _lastModifiedDateTime;
    /** Current obtained max score on specified date. */
    private Double _maxScore;
    /** Microsoft's stack ranking of control. */
    private Integer _rank;
    /** Description of what the control will help remediate. */
    private String _remediation;
    /** Description of the impact on users of the remediation. */
    private String _remediationImpact;
    /** Service that owns the control (Exchange, Sharepoint, Azure AD). */
    private String _service;
    /** List of threats the control mitigates (accountBreach,dataDeletion,dataExfiltration,dataSpillage,elevationOfPrivilege,maliciousInsider,passwordCracking,phishingOrWhaling,spoofing). */
    private java.util.List<String> _threats;
    /** Control tier (Core, Defense in Depth, Advanced.) */
    private String _tier;
    /** Title of the control. */
    private String _title;
    /** User impact of implementing control (low, moderate, high). */
    private String _userImpact;
    /** The vendorInformation property */
    private SecurityVendorInformation _vendorInformation;
    /**
     * Instantiates a new SecureScoreControlProfile and sets the default values.
     * @return a void
     */
    public SecureScoreControlProfile() {
        super();
        this.setOdataType("#microsoft.graph.secureScoreControlProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SecureScoreControlProfile
     */
    @javax.annotation.Nonnull
    public static SecureScoreControlProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecureScoreControlProfile();
    }
    /**
     * Gets the actionType property value. Control action type (Config, Review, Behavior).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionType() {
        return this._actionType;
    }
    /**
     * Gets the actionUrl property value. URL to where the control can be actioned.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionUrl() {
        return this._actionUrl;
    }
    /**
     * Gets the azureTenantId property value. GUID string for tenant ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureTenantId() {
        return this._azureTenantId;
    }
    /**
     * Gets the complianceInformation property value. The collection of compliance information associated with secure score control
     * @return a complianceInformation
     */
    @javax.annotation.Nullable
    public java.util.List<ComplianceInformation> getComplianceInformation() {
        return this._complianceInformation;
    }
    /**
     * Gets the controlCategory property value. Control action category (Account, Data, Device, Apps, Infrastructure).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getControlCategory() {
        return this._controlCategory;
    }
    /**
     * Gets the controlStateUpdates property value. Flag to indicate where the tenant has marked a control (ignore, thirdParty, reviewed) (supports update).
     * @return a secureScoreControlStateUpdate
     */
    @javax.annotation.Nullable
    public java.util.List<SecureScoreControlStateUpdate> getControlStateUpdates() {
        return this._controlStateUpdates;
    }
    /**
     * Gets the deprecated property value. Flag to indicate if a control is depreciated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeprecated() {
        return this._deprecated;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecureScoreControlProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("actionType", (n) -> { currentObject.setActionType(n.getStringValue()); });
            this.put("actionUrl", (n) -> { currentObject.setActionUrl(n.getStringValue()); });
            this.put("azureTenantId", (n) -> { currentObject.setAzureTenantId(n.getStringValue()); });
            this.put("complianceInformation", (n) -> { currentObject.setComplianceInformation(n.getCollectionOfObjectValues(ComplianceInformation::createFromDiscriminatorValue)); });
            this.put("controlCategory", (n) -> { currentObject.setControlCategory(n.getStringValue()); });
            this.put("controlStateUpdates", (n) -> { currentObject.setControlStateUpdates(n.getCollectionOfObjectValues(SecureScoreControlStateUpdate::createFromDiscriminatorValue)); });
            this.put("deprecated", (n) -> { currentObject.setDeprecated(n.getBooleanValue()); });
            this.put("implementationCost", (n) -> { currentObject.setImplementationCost(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("maxScore", (n) -> { currentObject.setMaxScore(n.getDoubleValue()); });
            this.put("rank", (n) -> { currentObject.setRank(n.getIntegerValue()); });
            this.put("remediation", (n) -> { currentObject.setRemediation(n.getStringValue()); });
            this.put("remediationImpact", (n) -> { currentObject.setRemediationImpact(n.getStringValue()); });
            this.put("service", (n) -> { currentObject.setService(n.getStringValue()); });
            this.put("threats", (n) -> { currentObject.setThreats(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("tier", (n) -> { currentObject.setTier(n.getStringValue()); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
            this.put("userImpact", (n) -> { currentObject.setUserImpact(n.getStringValue()); });
            this.put("vendorInformation", (n) -> { currentObject.setVendorInformation(n.getObjectValue(SecurityVendorInformation::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the implementationCost property value. Resource cost of implemmentating control (low, moderate, high).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImplementationCost() {
        return this._implementationCost;
    }
    /**
     * Gets the lastModifiedDateTime property value. Time at which the control profile entity was last modified. The Timestamp type represents date and time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the maxScore property value. Current obtained max score on specified date.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaxScore() {
        return this._maxScore;
    }
    /**
     * Gets the rank property value. Microsoft's stack ranking of control.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRank() {
        return this._rank;
    }
    /**
     * Gets the remediation property value. Description of what the control will help remediate.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemediation() {
        return this._remediation;
    }
    /**
     * Gets the remediationImpact property value. Description of the impact on users of the remediation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemediationImpact() {
        return this._remediationImpact;
    }
    /**
     * Gets the service property value. Service that owns the control (Exchange, Sharepoint, Azure AD).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getService() {
        return this._service;
    }
    /**
     * Gets the threats property value. List of threats the control mitigates (accountBreach,dataDeletion,dataExfiltration,dataSpillage,elevationOfPrivilege,maliciousInsider,passwordCracking,phishingOrWhaling,spoofing).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getThreats() {
        return this._threats;
    }
    /**
     * Gets the tier property value. Control tier (Core, Defense in Depth, Advanced.)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTier() {
        return this._tier;
    }
    /**
     * Gets the title property value. Title of the control.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Gets the userImpact property value. User impact of implementing control (low, moderate, high).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserImpact() {
        return this._userImpact;
    }
    /**
     * Gets the vendorInformation property value. The vendorInformation property
     * @return a securityVendorInformation
     */
    @javax.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this._vendorInformation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("actionType", this.getActionType());
        writer.writeStringValue("actionUrl", this.getActionUrl());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeCollectionOfObjectValues("complianceInformation", this.getComplianceInformation());
        writer.writeStringValue("controlCategory", this.getControlCategory());
        writer.writeCollectionOfObjectValues("controlStateUpdates", this.getControlStateUpdates());
        writer.writeBooleanValue("deprecated", this.getDeprecated());
        writer.writeStringValue("implementationCost", this.getImplementationCost());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeDoubleValue("maxScore", this.getMaxScore());
        writer.writeIntegerValue("rank", this.getRank());
        writer.writeStringValue("remediation", this.getRemediation());
        writer.writeStringValue("remediationImpact", this.getRemediationImpact());
        writer.writeStringValue("service", this.getService());
        writer.writeCollectionOfPrimitiveValues("threats", this.getThreats());
        writer.writeStringValue("tier", this.getTier());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("userImpact", this.getUserImpact());
        writer.writeObjectValue("vendorInformation", this.getVendorInformation());
    }
    /**
     * Sets the actionType property value. Control action type (Config, Review, Behavior).
     * @param value Value to set for the actionType property.
     * @return a void
     */
    public void setActionType(@javax.annotation.Nullable final String value) {
        this._actionType = value;
    }
    /**
     * Sets the actionUrl property value. URL to where the control can be actioned.
     * @param value Value to set for the actionUrl property.
     * @return a void
     */
    public void setActionUrl(@javax.annotation.Nullable final String value) {
        this._actionUrl = value;
    }
    /**
     * Sets the azureTenantId property value. GUID string for tenant ID.
     * @param value Value to set for the azureTenantId property.
     * @return a void
     */
    public void setAzureTenantId(@javax.annotation.Nullable final String value) {
        this._azureTenantId = value;
    }
    /**
     * Sets the complianceInformation property value. The collection of compliance information associated with secure score control
     * @param value Value to set for the complianceInformation property.
     * @return a void
     */
    public void setComplianceInformation(@javax.annotation.Nullable final java.util.List<ComplianceInformation> value) {
        this._complianceInformation = value;
    }
    /**
     * Sets the controlCategory property value. Control action category (Account, Data, Device, Apps, Infrastructure).
     * @param value Value to set for the controlCategory property.
     * @return a void
     */
    public void setControlCategory(@javax.annotation.Nullable final String value) {
        this._controlCategory = value;
    }
    /**
     * Sets the controlStateUpdates property value. Flag to indicate where the tenant has marked a control (ignore, thirdParty, reviewed) (supports update).
     * @param value Value to set for the controlStateUpdates property.
     * @return a void
     */
    public void setControlStateUpdates(@javax.annotation.Nullable final java.util.List<SecureScoreControlStateUpdate> value) {
        this._controlStateUpdates = value;
    }
    /**
     * Sets the deprecated property value. Flag to indicate if a control is depreciated.
     * @param value Value to set for the deprecated property.
     * @return a void
     */
    public void setDeprecated(@javax.annotation.Nullable final Boolean value) {
        this._deprecated = value;
    }
    /**
     * Sets the implementationCost property value. Resource cost of implemmentating control (low, moderate, high).
     * @param value Value to set for the implementationCost property.
     * @return a void
     */
    public void setImplementationCost(@javax.annotation.Nullable final String value) {
        this._implementationCost = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Time at which the control profile entity was last modified. The Timestamp type represents date and time
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the maxScore property value. Current obtained max score on specified date.
     * @param value Value to set for the maxScore property.
     * @return a void
     */
    public void setMaxScore(@javax.annotation.Nullable final Double value) {
        this._maxScore = value;
    }
    /**
     * Sets the rank property value. Microsoft's stack ranking of control.
     * @param value Value to set for the rank property.
     * @return a void
     */
    public void setRank(@javax.annotation.Nullable final Integer value) {
        this._rank = value;
    }
    /**
     * Sets the remediation property value. Description of what the control will help remediate.
     * @param value Value to set for the remediation property.
     * @return a void
     */
    public void setRemediation(@javax.annotation.Nullable final String value) {
        this._remediation = value;
    }
    /**
     * Sets the remediationImpact property value. Description of the impact on users of the remediation.
     * @param value Value to set for the remediationImpact property.
     * @return a void
     */
    public void setRemediationImpact(@javax.annotation.Nullable final String value) {
        this._remediationImpact = value;
    }
    /**
     * Sets the service property value. Service that owns the control (Exchange, Sharepoint, Azure AD).
     * @param value Value to set for the service property.
     * @return a void
     */
    public void setService(@javax.annotation.Nullable final String value) {
        this._service = value;
    }
    /**
     * Sets the threats property value. List of threats the control mitigates (accountBreach,dataDeletion,dataExfiltration,dataSpillage,elevationOfPrivilege,maliciousInsider,passwordCracking,phishingOrWhaling,spoofing).
     * @param value Value to set for the threats property.
     * @return a void
     */
    public void setThreats(@javax.annotation.Nullable final java.util.List<String> value) {
        this._threats = value;
    }
    /**
     * Sets the tier property value. Control tier (Core, Defense in Depth, Advanced.)
     * @param value Value to set for the tier property.
     * @return a void
     */
    public void setTier(@javax.annotation.Nullable final String value) {
        this._tier = value;
    }
    /**
     * Sets the title property value. Title of the control.
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
    /**
     * Sets the userImpact property value. User impact of implementing control (low, moderate, high).
     * @param value Value to set for the userImpact property.
     * @return a void
     */
    public void setUserImpact(@javax.annotation.Nullable final String value) {
        this._userImpact = value;
    }
    /**
     * Sets the vendorInformation property value. The vendorInformation property
     * @param value Value to set for the vendorInformation property.
     * @return a void
     */
    public void setVendorInformation(@javax.annotation.Nullable final SecurityVendorInformation value) {
        this._vendorInformation = value;
    }
}
