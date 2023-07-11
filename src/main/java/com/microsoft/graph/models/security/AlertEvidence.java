package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AlertEvidence implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time when the evidence was created and added to the alert. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The detailedRoles property
     */
    private java.util.List<String> detailedRoles;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The remediationStatus property
     */
    private EvidenceRemediationStatus remediationStatus;
    /**
     * Details about the remediation status.
     */
    private String remediationStatusDetails;
    /**
     * One or more roles that an evidence entity represents in an alert. For example, an IP address that is associated with an attacker has the evidence role Attacker.
     */
    private java.util.List<EvidenceRole> roles;
    /**
     * Array of custom tags associated with an evidence instance. For example, to denote a group of devices or high value assets.
     */
    private java.util.List<String> tags;
    /**
     * The verdict property
     */
    private EvidenceVerdict verdict;
    /**
     * Instantiates a new alertEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AlertEvidence() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alertEvidence
     */
    @javax.annotation.Nonnull
    public static AlertEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.amazonResourceEvidence": return new AmazonResourceEvidence();
                case "#microsoft.graph.security.analyzedMessageEvidence": return new AnalyzedMessageEvidence();
                case "#microsoft.graph.security.azureResourceEvidence": return new AzureResourceEvidence();
                case "#microsoft.graph.security.cloudApplicationEvidence": return new CloudApplicationEvidence();
                case "#microsoft.graph.security.deviceEvidence": return new DeviceEvidence();
                case "#microsoft.graph.security.fileEvidence": return new FileEvidence();
                case "#microsoft.graph.security.googleCloudResourceEvidence": return new GoogleCloudResourceEvidence();
                case "#microsoft.graph.security.ipEvidence": return new IpEvidence();
                case "#microsoft.graph.security.mailboxEvidence": return new MailboxEvidence();
                case "#microsoft.graph.security.mailClusterEvidence": return new MailClusterEvidence();
                case "#microsoft.graph.security.oauthApplicationEvidence": return new OauthApplicationEvidence();
                case "#microsoft.graph.security.processEvidence": return new ProcessEvidence();
                case "#microsoft.graph.security.registryKeyEvidence": return new RegistryKeyEvidence();
                case "#microsoft.graph.security.registryValueEvidence": return new RegistryValueEvidence();
                case "#microsoft.graph.security.securityGroupEvidence": return new SecurityGroupEvidence();
                case "#microsoft.graph.security.urlEvidence": return new UrlEvidence();
                case "#microsoft.graph.security.userEvidence": return new UserEvidence();
            }
        }
        return new AlertEvidence();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the evidence was created and added to the alert. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the detailedRoles property value. The detailedRoles property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDetailedRoles() {
        return this.detailedRoles;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("detailedRoles", (n) -> { this.setDetailedRoles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("remediationStatus", (n) -> { this.setRemediationStatus(n.getEnumValue(EvidenceRemediationStatus.class)); });
        deserializerMap.put("remediationStatusDetails", (n) -> { this.setRemediationStatusDetails(n.getStringValue()); });
        deserializerMap.put("roles", (n) -> { this.setRoles(n.getCollectionOfEnumValues(EvidenceRole.class)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("verdict", (n) -> { this.setVerdict(n.getEnumValue(EvidenceVerdict.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the remediationStatus property value. The remediationStatus property
     * @return a evidenceRemediationStatus
     */
    @javax.annotation.Nullable
    public EvidenceRemediationStatus getRemediationStatus() {
        return this.remediationStatus;
    }
    /**
     * Gets the remediationStatusDetails property value. Details about the remediation status.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemediationStatusDetails() {
        return this.remediationStatusDetails;
    }
    /**
     * Gets the roles property value. One or more roles that an evidence entity represents in an alert. For example, an IP address that is associated with an attacker has the evidence role Attacker.
     * @return a evidenceRole
     */
    @javax.annotation.Nullable
    public java.util.List<EvidenceRole> getRoles() {
        return this.roles;
    }
    /**
     * Gets the tags property value. Array of custom tags associated with an evidence instance. For example, to denote a group of devices or high value assets.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }
    /**
     * Gets the verdict property value. The verdict property
     * @return a evidenceVerdict
     */
    @javax.annotation.Nullable
    public EvidenceVerdict getVerdict() {
        return this.verdict;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfPrimitiveValues("detailedRoles", this.getDetailedRoles());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("remediationStatus", this.getRemediationStatus());
        writer.writeStringValue("remediationStatusDetails", this.getRemediationStatusDetails());
        writer.writeCollectionOfEnumValues("roles", this.getRoles());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeEnumValue("verdict", this.getVerdict());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the evidence was created and added to the alert. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the detailedRoles property value. The detailedRoles property
     * @param value Value to set for the detailedRoles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetailedRoles(@javax.annotation.Nullable final java.util.List<String> value) {
        this.detailedRoles = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the remediationStatus property value. The remediationStatus property
     * @param value Value to set for the remediationStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediationStatus(@javax.annotation.Nullable final EvidenceRemediationStatus value) {
        this.remediationStatus = value;
    }
    /**
     * Sets the remediationStatusDetails property value. Details about the remediation status.
     * @param value Value to set for the remediationStatusDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediationStatusDetails(@javax.annotation.Nullable final String value) {
        this.remediationStatusDetails = value;
    }
    /**
     * Sets the roles property value. One or more roles that an evidence entity represents in an alert. For example, an IP address that is associated with an attacker has the evidence role Attacker.
     * @param value Value to set for the roles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoles(@javax.annotation.Nullable final java.util.List<EvidenceRole> value) {
        this.roles = value;
    }
    /**
     * Sets the tags property value. Array of custom tags associated with an evidence instance. For example, to denote a group of devices or high value assets.
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this.tags = value;
    }
    /**
     * Sets the verdict property value. The verdict property
     * @param value Value to set for the verdict property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerdict(@javax.annotation.Nullable final EvidenceVerdict value) {
        this.verdict = value;
    }
}
