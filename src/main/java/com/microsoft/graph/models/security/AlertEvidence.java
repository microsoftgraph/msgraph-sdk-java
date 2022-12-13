package com.microsoft.graph.models.security;

import com.microsoft.graph.models.security.AnalyzedMessageEvidence;
import com.microsoft.graph.models.security.CloudApplicationEvidence;
import com.microsoft.graph.models.security.DeviceEvidence;
import com.microsoft.graph.models.security.FileEvidence;
import com.microsoft.graph.models.security.IpEvidence;
import com.microsoft.graph.models.security.MailboxEvidence;
import com.microsoft.graph.models.security.MailClusterEvidence;
import com.microsoft.graph.models.security.OauthApplicationEvidence;
import com.microsoft.graph.models.security.ProcessEvidence;
import com.microsoft.graph.models.security.RegistryKeyEvidence;
import com.microsoft.graph.models.security.RegistryValueEvidence;
import com.microsoft.graph.models.security.SecurityGroupEvidence;
import com.microsoft.graph.models.security.UrlEvidence;
import com.microsoft.graph.models.security.UserEvidence;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AlertEvidence implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The OdataType property */
    private String _odataType;
    /** The remediationStatus property */
    private EvidenceRemediationStatus _remediationStatus;
    /** The remediationStatusDetails property */
    private String _remediationStatusDetails;
    /** The roles property */
    private java.util.List<EvidenceRole> _roles;
    /** The tags property */
    private java.util.List<String> _tags;
    /** The verdict property */
    private EvidenceVerdict _verdict;
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
                case "#microsoft.graph.security.analyzedMessageEvidence": return new AnalyzedMessageEvidence();
                case "#microsoft.graph.security.cloudApplicationEvidence": return new CloudApplicationEvidence();
                case "#microsoft.graph.security.deviceEvidence": return new DeviceEvidence();
                case "#microsoft.graph.security.fileEvidence": return new FileEvidence();
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
        return this._additionalData;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(7);
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
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
        return this._odataType;
    }
    /**
     * Gets the remediationStatus property value. The remediationStatus property
     * @return a evidenceRemediationStatus
     */
    @javax.annotation.Nullable
    public EvidenceRemediationStatus getRemediationStatus() {
        return this._remediationStatus;
    }
    /**
     * Gets the remediationStatusDetails property value. The remediationStatusDetails property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemediationStatusDetails() {
        return this._remediationStatusDetails;
    }
    /**
     * Gets the roles property value. The roles property
     * @return a evidenceRole
     */
    @javax.annotation.Nullable
    public java.util.List<EvidenceRole> getRoles() {
        return this._roles;
    }
    /**
     * Gets the tags property value. The tags property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this._tags;
    }
    /**
     * Gets the verdict property value. The verdict property
     * @return a evidenceVerdict
     */
    @javax.annotation.Nullable
    public EvidenceVerdict getVerdict() {
        return this._verdict;
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
        this._additionalData = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the remediationStatus property value. The remediationStatus property
     * @param value Value to set for the remediationStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediationStatus(@javax.annotation.Nullable final EvidenceRemediationStatus value) {
        this._remediationStatus = value;
    }
    /**
     * Sets the remediationStatusDetails property value. The remediationStatusDetails property
     * @param value Value to set for the remediationStatusDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediationStatusDetails(@javax.annotation.Nullable final String value) {
        this._remediationStatusDetails = value;
    }
    /**
     * Sets the roles property value. The roles property
     * @param value Value to set for the roles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoles(@javax.annotation.Nullable final java.util.List<EvidenceRole> value) {
        this._roles = value;
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tags = value;
    }
    /**
     * Sets the verdict property value. The verdict property
     * @param value Value to set for the verdict property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerdict(@javax.annotation.Nullable final EvidenceVerdict value) {
        this._verdict = value;
    }
}
