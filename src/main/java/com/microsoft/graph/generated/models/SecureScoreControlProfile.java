package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecureScoreControlProfile extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SecureScoreControlProfile} and sets the default values.
     */
    public SecureScoreControlProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SecureScoreControlProfile}
     */
    @jakarta.annotation.Nonnull
    public static SecureScoreControlProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecureScoreControlProfile();
    }
    /**
     * Gets the actionType property value. Control action type (Config, Review, Behavior).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionType() {
        return this.backingStore.get("actionType");
    }
    /**
     * Gets the actionUrl property value. URL to where the control can be actioned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionUrl() {
        return this.backingStore.get("actionUrl");
    }
    /**
     * Gets the azureTenantId property value. GUID string for tenant ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureTenantId() {
        return this.backingStore.get("azureTenantId");
    }
    /**
     * Gets the complianceInformation property value. The collection of compliance information associated with secure score control
     * @return a {@link java.util.List<ComplianceInformation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ComplianceInformation> getComplianceInformation() {
        return this.backingStore.get("complianceInformation");
    }
    /**
     * Gets the controlCategory property value. Control action category (Identity, Data, Device, Apps, Infrastructure).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getControlCategory() {
        return this.backingStore.get("controlCategory");
    }
    /**
     * Gets the controlStateUpdates property value. Flag to indicate where the tenant has marked a control (ignored, thirdParty, reviewed) (supports update).
     * @return a {@link java.util.List<SecureScoreControlStateUpdate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecureScoreControlStateUpdate> getControlStateUpdates() {
        return this.backingStore.get("controlStateUpdates");
    }
    /**
     * Gets the deprecated property value. Flag to indicate if a control is depreciated.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeprecated() {
        return this.backingStore.get("deprecated");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImplementationCost() {
        return this.backingStore.get("implementationCost");
    }
    /**
     * Gets the lastModifiedDateTime property value. Time at which the control profile entity was last modified. The Timestamp type represents date and time
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the maxScore property value. max attainable score for the control.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxScore() {
        return this.backingStore.get("maxScore");
    }
    /**
     * Gets the rank property value. Microsoft's stack ranking of control.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRank() {
        return this.backingStore.get("rank");
    }
    /**
     * Gets the remediation property value. Description of what the control will help remediate.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemediation() {
        return this.backingStore.get("remediation");
    }
    /**
     * Gets the remediationImpact property value. Description of the impact on users of the remediation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemediationImpact() {
        return this.backingStore.get("remediationImpact");
    }
    /**
     * Gets the service property value. Service that owns the control (Exchange, Sharepoint, Microsoft Entra ID).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getService() {
        return this.backingStore.get("service");
    }
    /**
     * Gets the threats property value. List of threats the control mitigates (accountBreach, dataDeletion, dataExfiltration, dataSpillage, elevationOfPrivilege, maliciousInsider, passwordCracking, phishingOrWhaling, spoofing).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getThreats() {
        return this.backingStore.get("threats");
    }
    /**
     * Gets the tier property value. Control tier (Core, Defense in Depth, Advanced.)
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTier() {
        return this.backingStore.get("tier");
    }
    /**
     * Gets the title property value. Title of the control.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Gets the userImpact property value. User impact of implementing control (low, moderate, high).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserImpact() {
        return this.backingStore.get("userImpact");
    }
    /**
     * Gets the vendorInformation property value. Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required.
     * @return a {@link SecurityVendorInformation}
     */
    @jakarta.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this.backingStore.get("vendorInformation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setActionType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("actionType", value);
    }
    /**
     * Sets the actionUrl property value. URL to where the control can be actioned.
     * @param value Value to set for the actionUrl property.
     */
    public void setActionUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("actionUrl", value);
    }
    /**
     * Sets the azureTenantId property value. GUID string for tenant ID.
     * @param value Value to set for the azureTenantId property.
     */
    public void setAzureTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureTenantId", value);
    }
    /**
     * Sets the complianceInformation property value. The collection of compliance information associated with secure score control
     * @param value Value to set for the complianceInformation property.
     */
    public void setComplianceInformation(@jakarta.annotation.Nullable final java.util.List<ComplianceInformation> value) {
        this.backingStore.set("complianceInformation", value);
    }
    /**
     * Sets the controlCategory property value. Control action category (Identity, Data, Device, Apps, Infrastructure).
     * @param value Value to set for the controlCategory property.
     */
    public void setControlCategory(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("controlCategory", value);
    }
    /**
     * Sets the controlStateUpdates property value. Flag to indicate where the tenant has marked a control (ignored, thirdParty, reviewed) (supports update).
     * @param value Value to set for the controlStateUpdates property.
     */
    public void setControlStateUpdates(@jakarta.annotation.Nullable final java.util.List<SecureScoreControlStateUpdate> value) {
        this.backingStore.set("controlStateUpdates", value);
    }
    /**
     * Sets the deprecated property value. Flag to indicate if a control is depreciated.
     * @param value Value to set for the deprecated property.
     */
    public void setDeprecated(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deprecated", value);
    }
    /**
     * Sets the implementationCost property value. Resource cost of implemmentating control (low, moderate, high).
     * @param value Value to set for the implementationCost property.
     */
    public void setImplementationCost(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("implementationCost", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Time at which the control profile entity was last modified. The Timestamp type represents date and time
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the maxScore property value. max attainable score for the control.
     * @param value Value to set for the maxScore property.
     */
    public void setMaxScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("maxScore", value);
    }
    /**
     * Sets the rank property value. Microsoft's stack ranking of control.
     * @param value Value to set for the rank property.
     */
    public void setRank(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("rank", value);
    }
    /**
     * Sets the remediation property value. Description of what the control will help remediate.
     * @param value Value to set for the remediation property.
     */
    public void setRemediation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remediation", value);
    }
    /**
     * Sets the remediationImpact property value. Description of the impact on users of the remediation.
     * @param value Value to set for the remediationImpact property.
     */
    public void setRemediationImpact(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remediationImpact", value);
    }
    /**
     * Sets the service property value. Service that owns the control (Exchange, Sharepoint, Microsoft Entra ID).
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("service", value);
    }
    /**
     * Sets the threats property value. List of threats the control mitigates (accountBreach, dataDeletion, dataExfiltration, dataSpillage, elevationOfPrivilege, maliciousInsider, passwordCracking, phishingOrWhaling, spoofing).
     * @param value Value to set for the threats property.
     */
    public void setThreats(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("threats", value);
    }
    /**
     * Sets the tier property value. Control tier (Core, Defense in Depth, Advanced.)
     * @param value Value to set for the tier property.
     */
    public void setTier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tier", value);
    }
    /**
     * Sets the title property value. Title of the control.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
    /**
     * Sets the userImpact property value. User impact of implementing control (low, moderate, high).
     * @param value Value to set for the userImpact property.
     */
    public void setUserImpact(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userImpact", value);
    }
    /**
     * Sets the vendorInformation property value. Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required.
     * @param value Value to set for the vendorInformation property.
     */
    public void setVendorInformation(@jakarta.annotation.Nullable final SecurityVendorInformation value) {
        this.backingStore.set("vendorInformation", value);
    }
}
