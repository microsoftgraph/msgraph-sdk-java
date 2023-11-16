package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AlertEvidence implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new AlertEvidence and sets the default values.
     */
    public AlertEvidence() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AlertEvidence
     */
    @jakarta.annotation.Nonnull
    public static AlertEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.amazonResourceEvidence": return new AmazonResourceEvidence();
                case "#microsoft.graph.security.analyzedMessageEvidence": return new AnalyzedMessageEvidence();
                case "#microsoft.graph.security.azureResourceEvidence": return new AzureResourceEvidence();
                case "#microsoft.graph.security.blobContainerEvidence": return new BlobContainerEvidence();
                case "#microsoft.graph.security.blobEvidence": return new BlobEvidence();
                case "#microsoft.graph.security.cloudApplicationEvidence": return new CloudApplicationEvidence();
                case "#microsoft.graph.security.containerEvidence": return new ContainerEvidence();
                case "#microsoft.graph.security.containerImageEvidence": return new ContainerImageEvidence();
                case "#microsoft.graph.security.containerRegistryEvidence": return new ContainerRegistryEvidence();
                case "#microsoft.graph.security.deviceEvidence": return new DeviceEvidence();
                case "#microsoft.graph.security.fileEvidence": return new FileEvidence();
                case "#microsoft.graph.security.googleCloudResourceEvidence": return new GoogleCloudResourceEvidence();
                case "#microsoft.graph.security.ipEvidence": return new IpEvidence();
                case "#microsoft.graph.security.kubernetesClusterEvidence": return new KubernetesClusterEvidence();
                case "#microsoft.graph.security.kubernetesControllerEvidence": return new KubernetesControllerEvidence();
                case "#microsoft.graph.security.kubernetesNamespaceEvidence": return new KubernetesNamespaceEvidence();
                case "#microsoft.graph.security.kubernetesPodEvidence": return new KubernetesPodEvidence();
                case "#microsoft.graph.security.kubernetesSecretEvidence": return new KubernetesSecretEvidence();
                case "#microsoft.graph.security.kubernetesServiceAccountEvidence": return new KubernetesServiceAccountEvidence();
                case "#microsoft.graph.security.kubernetesServiceEvidence": return new KubernetesServiceEvidence();
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
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the evidence was created and added to the alert. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the detailedRoles property value. Detailed description of the entity role/s in an alert. Values are free-form.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDetailedRoles() {
        return this.backingStore.get("detailedRoles");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the remediationStatus property value. The remediationStatus property
     * @return a EvidenceRemediationStatus
     */
    @jakarta.annotation.Nullable
    public EvidenceRemediationStatus getRemediationStatus() {
        return this.backingStore.get("remediationStatus");
    }
    /**
     * Gets the remediationStatusDetails property value. Details about the remediation status.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemediationStatusDetails() {
        return this.backingStore.get("remediationStatusDetails");
    }
    /**
     * Gets the roles property value. The role/s that an evidence entity represents in an alert, for example, an IP address that is associated with an attacker has the evidence role Attacker.
     * @return a java.util.List<EvidenceRole>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EvidenceRole> getRoles() {
        return this.backingStore.get("roles");
    }
    /**
     * Gets the tags property value. Array of custom tags associated with an evidence instance, for example, to denote a group of devices, high-value assets, etc.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Gets the verdict property value. The verdict property
     * @return a EvidenceVerdict
     */
    @jakarta.annotation.Nullable
    public EvidenceVerdict getVerdict() {
        return this.backingStore.get("verdict");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the evidence was created and added to the alert. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the detailedRoles property value. Detailed description of the entity role/s in an alert. Values are free-form.
     * @param value Value to set for the detailedRoles property.
     */
    public void setDetailedRoles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("detailedRoles", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the remediationStatus property value. The remediationStatus property
     * @param value Value to set for the remediationStatus property.
     */
    public void setRemediationStatus(@jakarta.annotation.Nullable final EvidenceRemediationStatus value) {
        this.backingStore.set("remediationStatus", value);
    }
    /**
     * Sets the remediationStatusDetails property value. Details about the remediation status.
     * @param value Value to set for the remediationStatusDetails property.
     */
    public void setRemediationStatusDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remediationStatusDetails", value);
    }
    /**
     * Sets the roles property value. The role/s that an evidence entity represents in an alert, for example, an IP address that is associated with an attacker has the evidence role Attacker.
     * @param value Value to set for the roles property.
     */
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<EvidenceRole> value) {
        this.backingStore.set("roles", value);
    }
    /**
     * Sets the tags property value. Array of custom tags associated with an evidence instance, for example, to denote a group of devices, high-value assets, etc.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tags", value);
    }
    /**
     * Sets the verdict property value. The verdict property
     * @param value Value to set for the verdict property.
     */
    public void setVerdict(@jakarta.annotation.Nullable final EvidenceVerdict value) {
        this.backingStore.set("verdict", value);
    }
}
