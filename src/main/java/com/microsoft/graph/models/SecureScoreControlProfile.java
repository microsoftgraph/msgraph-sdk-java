package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SecureScoreControlProfile extends Entity implements Parsable {
    /** Control action type (Config, Review, Behavior). */
    private String actionType;
    /** URL to where the control can be actioned. */
    private String actionUrl;
    /** GUID string for tenant ID. */
    private String azureTenantId;
    /** The collection of compliance information associated with secure score control */
    private java.util.List<ComplianceInformation> complianceInformation;
    /** Control action category (Identity, Data, Device, Apps, Infrastructure). */
    private String controlCategory;
    /** Flag to indicate where the tenant has marked a control (ignored, thirdParty, reviewed) (supports update). */
    private java.util.List<SecureScoreControlStateUpdate> controlStateUpdates;
    /** Flag to indicate if a control is depreciated. */
    private Boolean deprecated;
    /** Resource cost of implemmentating control (low, moderate, high). */
    private String implementationCost;
    /** Time at which the control profile entity was last modified. The Timestamp type represents date and time */
    private OffsetDateTime lastModifiedDateTime;
    /** max attainable score for the control. */
    private Double maxScore;
    /** Microsoft's stack ranking of control. */
    private Integer rank;
    /** Description of what the control will help remediate. */
    private String remediation;
    /** Description of the impact on users of the remediation. */
    private String remediationImpact;
    /** Service that owns the control (Exchange, Sharepoint, Azure AD). */
    private String service;
    /** List of threats the control mitigates (accountBreach,dataDeletion,dataExfiltration,dataSpillage, */
    private java.util.List<String> threats;
    /** The tier property */
    private String tier;
    /** The title property */
    private String title;
    /** The userImpact property */
    private String userImpact;
    /** The vendorInformation property */
    private SecurityVendorInformation vendorInformation;
    /**
     * Instantiates a new secureScoreControlProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SecureScoreControlProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a secureScoreControlProfile
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
        return this.actionType;
    }
    /**
     * Gets the actionUrl property value. URL to where the control can be actioned.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionUrl() {
        return this.actionUrl;
    }
    /**
     * Gets the azureTenantId property value. GUID string for tenant ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureTenantId() {
        return this.azureTenantId;
    }
    /**
     * Gets the complianceInformation property value. The collection of compliance information associated with secure score control
     * @return a complianceInformation
     */
    @javax.annotation.Nullable
    public java.util.List<ComplianceInformation> getComplianceInformation() {
        return this.complianceInformation;
    }
    /**
     * Gets the controlCategory property value. Control action category (Identity, Data, Device, Apps, Infrastructure).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getControlCategory() {
        return this.controlCategory;
    }
    /**
     * Gets the controlStateUpdates property value. Flag to indicate where the tenant has marked a control (ignored, thirdParty, reviewed) (supports update).
     * @return a secureScoreControlStateUpdate
     */
    @javax.annotation.Nullable
    public java.util.List<SecureScoreControlStateUpdate> getControlStateUpdates() {
        return this.controlStateUpdates;
    }
    /**
     * Gets the deprecated property value. Flag to indicate if a control is depreciated.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeprecated() {
        return this.deprecated;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionType", (n) -> { this.setActionType(n.getStringValue()); });
        deserializerMap.put("actionUrl", (n) -> { this.setActionUrl(n.getStringValue()); });
        deserializerMap.put("azureTenantId", (n) -> { this.setAzureTenantId(n.getStringValue()); });
        deserializerMap.put("complianceInformation", (n) -> { this.setComplianceInformation(n.getCollectionOfObjectValues(ComplianceInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("controlCategory", (n) -> { this.setControlCategory(n.getStringValue()); });
        deserializerMap.put("controlStateUpdates", (n) -> { this.setControlStateUpdates(n.getCollectionOfObjectValues(SecureScoreControlStateUpdate::createFromDiscriminatorValue)); });
        deserializerMap.put("deprecated", (n) -> { this.setDeprecated(n.getBooleanValue()); });
        deserializerMap.put("implementationCost", (n) -> { this.setImplementationCost(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("maxScore", (n) -> { this.setMaxScore(n.getDoubleValue()); });
        deserializerMap.put("rank", (n) -> { this.setRank(n.getIntegerValue()); });
        deserializerMap.put("remediation", (n) -> { this.setRemediation(n.getStringValue()); });
        deserializerMap.put("remediationImpact", (n) -> { this.setRemediationImpact(n.getStringValue()); });
        deserializerMap.put("service", (n) -> { this.setService(n.getStringValue()); });
        deserializerMap.put("threats", (n) -> { this.setThreats(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tier", (n) -> { this.setTier(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("userImpact", (n) -> { this.setUserImpact(n.getStringValue()); });
        deserializerMap.put("vendorInformation", (n) -> { this.setVendorInformation(n.getObjectValue(SecurityVendorInformation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the implementationCost property value. Resource cost of implemmentating control (low, moderate, high).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImplementationCost() {
        return this.implementationCost;
    }
    /**
     * Gets the lastModifiedDateTime property value. Time at which the control profile entity was last modified. The Timestamp type represents date and time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the maxScore property value. max attainable score for the control.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaxScore() {
        return this.maxScore;
    }
    /**
     * Gets the rank property value. Microsoft's stack ranking of control.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRank() {
        return this.rank;
    }
    /**
     * Gets the remediation property value. Description of what the control will help remediate.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemediation() {
        return this.remediation;
    }
    /**
     * Gets the remediationImpact property value. Description of the impact on users of the remediation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemediationImpact() {
        return this.remediationImpact;
    }
    /**
     * Gets the service property value. Service that owns the control (Exchange, Sharepoint, Azure AD).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getService() {
        return this.service;
    }
    /**
     * Gets the threats property value. List of threats the control mitigates (accountBreach,dataDeletion,dataExfiltration,dataSpillage,
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getThreats() {
        return this.threats;
    }
    /**
     * Gets the tier property value. The tier property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTier() {
        return this.tier;
    }
    /**
     * Gets the title property value. The title property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the userImpact property value. The userImpact property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserImpact() {
        return this.userImpact;
    }
    /**
     * Gets the vendorInformation property value. The vendorInformation property
     * @return a securityVendorInformation
     */
    @javax.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this.vendorInformation;
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
    @javax.annotation.Nonnull
    public void setActionType(@javax.annotation.Nullable final String value) {
        this.actionType = value;
    }
    /**
     * Sets the actionUrl property value. URL to where the control can be actioned.
     * @param value Value to set for the actionUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionUrl(@javax.annotation.Nullable final String value) {
        this.actionUrl = value;
    }
    /**
     * Sets the azureTenantId property value. GUID string for tenant ID.
     * @param value Value to set for the azureTenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureTenantId(@javax.annotation.Nullable final String value) {
        this.azureTenantId = value;
    }
    /**
     * Sets the complianceInformation property value. The collection of compliance information associated with secure score control
     * @param value Value to set for the complianceInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceInformation(@javax.annotation.Nullable final java.util.List<ComplianceInformation> value) {
        this.complianceInformation = value;
    }
    /**
     * Sets the controlCategory property value. Control action category (Identity, Data, Device, Apps, Infrastructure).
     * @param value Value to set for the controlCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setControlCategory(@javax.annotation.Nullable final String value) {
        this.controlCategory = value;
    }
    /**
     * Sets the controlStateUpdates property value. Flag to indicate where the tenant has marked a control (ignored, thirdParty, reviewed) (supports update).
     * @param value Value to set for the controlStateUpdates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setControlStateUpdates(@javax.annotation.Nullable final java.util.List<SecureScoreControlStateUpdate> value) {
        this.controlStateUpdates = value;
    }
    /**
     * Sets the deprecated property value. Flag to indicate if a control is depreciated.
     * @param value Value to set for the deprecated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeprecated(@javax.annotation.Nullable final Boolean value) {
        this.deprecated = value;
    }
    /**
     * Sets the implementationCost property value. Resource cost of implemmentating control (low, moderate, high).
     * @param value Value to set for the implementationCost property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImplementationCost(@javax.annotation.Nullable final String value) {
        this.implementationCost = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Time at which the control profile entity was last modified. The Timestamp type represents date and time
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the maxScore property value. max attainable score for the control.
     * @param value Value to set for the maxScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxScore(@javax.annotation.Nullable final Double value) {
        this.maxScore = value;
    }
    /**
     * Sets the rank property value. Microsoft's stack ranking of control.
     * @param value Value to set for the rank property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRank(@javax.annotation.Nullable final Integer value) {
        this.rank = value;
    }
    /**
     * Sets the remediation property value. Description of what the control will help remediate.
     * @param value Value to set for the remediation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediation(@javax.annotation.Nullable final String value) {
        this.remediation = value;
    }
    /**
     * Sets the remediationImpact property value. Description of the impact on users of the remediation.
     * @param value Value to set for the remediationImpact property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediationImpact(@javax.annotation.Nullable final String value) {
        this.remediationImpact = value;
    }
    /**
     * Sets the service property value. Service that owns the control (Exchange, Sharepoint, Azure AD).
     * @param value Value to set for the service property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setService(@javax.annotation.Nullable final String value) {
        this.service = value;
    }
    /**
     * Sets the threats property value. List of threats the control mitigates (accountBreach,dataDeletion,dataExfiltration,dataSpillage,
     * @param value Value to set for the threats property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreats(@javax.annotation.Nullable final java.util.List<String> value) {
        this.threats = value;
    }
    /**
     * Sets the tier property value. The tier property
     * @param value Value to set for the tier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTier(@javax.annotation.Nullable final String value) {
        this.tier = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the userImpact property value. The userImpact property
     * @param value Value to set for the userImpact property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserImpact(@javax.annotation.Nullable final String value) {
        this.userImpact = value;
    }
    /**
     * Sets the vendorInformation property value. The vendorInformation property
     * @param value Value to set for the vendorInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendorInformation(@javax.annotation.Nullable final SecurityVendorInformation value) {
        this.vendorInformation = value;
    }
}
