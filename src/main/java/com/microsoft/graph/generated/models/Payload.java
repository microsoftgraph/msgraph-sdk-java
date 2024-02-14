package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Payload extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Payload} and sets the default values.
     */
    public Payload() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Payload}
     */
    @jakarta.annotation.Nonnull
    public static Payload createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Payload();
    }
    /**
     * Gets the brand property value. The branch of a payload. Possible values are: unknown, other, americanExpress, capitalOne, dhl, docuSign, dropbox, facebook, firstAmerican, microsoft, netflix, scotiabank, sendGrid, stewartTitle, tesco, wellsFargo, syrinxCloud, adobe, teams, zoom, unknownFutureValue.
     * @return a {@link PayloadBrand}
     */
    @jakarta.annotation.Nullable
    public PayloadBrand getBrand() {
        return this.backingStore.get("brand");
    }
    /**
     * Gets the complexity property value. The complexity of a payload. Possible values are: unknown, low, medium, high, unknownFutureValue.
     * @return a {@link PayloadComplexity}
     */
    @jakarta.annotation.Nullable
    public PayloadComplexity getComplexity() {
        return this.backingStore.get("complexity");
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the attack simulation and training campaign payload.
     * @return a {@link EmailIdentity}
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Date and time when the attack simulation and training campaign payload. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Description of the attack simulation and training campaign payload.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the detail property value. Additional details about the payload.
     * @return a {@link PayloadDetail}
     */
    @jakarta.annotation.Nullable
    public PayloadDetail getDetail() {
        return this.backingStore.get("detail");
    }
    /**
     * Gets the displayName property value. Display name of the attack simulation and training campaign payload. Supports $filter and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("brand", (n) -> { this.setBrand(n.getEnumValue(PayloadBrand::forValue)); });
        deserializerMap.put("complexity", (n) -> { this.setComplexity(n.getEnumValue(PayloadComplexity::forValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getObjectValue(PayloadDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("industry", (n) -> { this.setIndustry(n.getEnumValue(PayloadIndustry::forValue)); });
        deserializerMap.put("isAutomated", (n) -> { this.setIsAutomated(n.getBooleanValue()); });
        deserializerMap.put("isControversial", (n) -> { this.setIsControversial(n.getBooleanValue()); });
        deserializerMap.put("isCurrentEvent", (n) -> { this.setIsCurrentEvent(n.getBooleanValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("payloadTags", (n) -> { this.setPayloadTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(PayloadDeliveryPlatform::forValue)); });
        deserializerMap.put("predictedCompromiseRate", (n) -> { this.setPredictedCompromiseRate(n.getDoubleValue()); });
        deserializerMap.put("simulationAttackType", (n) -> { this.setSimulationAttackType(n.getEnumValue(SimulationAttackType::forValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(SimulationContentSource::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SimulationContentStatus::forValue)); });
        deserializerMap.put("technique", (n) -> { this.setTechnique(n.getEnumValue(SimulationAttackTechnique::forValue)); });
        deserializerMap.put("theme", (n) -> { this.setTheme(n.getEnumValue(PayloadTheme::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the industry property value. Industry of a payload. Possible values are: unknown, other, banking, businessServices, consumerServices, education, energy, construction, consulting, financialServices, government, hospitality, insurance, legal, courierServices, IT, healthcare, manufacturing, retail, telecom, realEstate, unknownFutureValue.
     * @return a {@link PayloadIndustry}
     */
    @jakarta.annotation.Nullable
    public PayloadIndustry getIndustry() {
        return this.backingStore.get("industry");
    }
    /**
     * Gets the isAutomated property value. Indicates whether the attack simulation and training campaign payload was created from an automation flow. Supports $filter and $orderby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAutomated() {
        return this.backingStore.get("isAutomated");
    }
    /**
     * Gets the isControversial property value. Indicates whether the payload is controversial.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsControversial() {
        return this.backingStore.get("isControversial");
    }
    /**
     * Gets the isCurrentEvent property value. Indicates whether the payload is from any recent event.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCurrentEvent() {
        return this.backingStore.get("isCurrentEvent");
    }
    /**
     * Gets the language property value. Payload language.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.backingStore.get("language");
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who most recently modified the attack simulation and training campaign payload.
     * @return a {@link EmailIdentity}
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time when the attack simulation and training campaign payload was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the payloadTags property value. Free text tags for a payload.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPayloadTags() {
        return this.backingStore.get("payloadTags");
    }
    /**
     * Gets the platform property value. The payload delivery platform for a simulation. Possible values are: unknown, sms, email, teams, unknownFutureValue.
     * @return a {@link PayloadDeliveryPlatform}
     */
    @jakarta.annotation.Nullable
    public PayloadDeliveryPlatform getPlatform() {
        return this.backingStore.get("platform");
    }
    /**
     * Gets the predictedCompromiseRate property value. Predicted probability for a payload to phish a targeted user.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPredictedCompromiseRate() {
        return this.backingStore.get("predictedCompromiseRate");
    }
    /**
     * Gets the simulationAttackType property value. Attack type of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, social, cloud, endpoint, unknownFutureValue.
     * @return a {@link SimulationAttackType}
     */
    @jakarta.annotation.Nullable
    public SimulationAttackType getSimulationAttackType() {
        return this.backingStore.get("simulationAttackType");
    }
    /**
     * Gets the source property value. The source property
     * @return a {@link SimulationContentSource}
     */
    @jakarta.annotation.Nullable
    public SimulationContentSource getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Gets the status property value. Simulation content status. Supports $filter and $orderby. Possible values are: unknown, draft, ready, archive, delete, unknownFutureValue.
     * @return a {@link SimulationContentStatus}
     */
    @jakarta.annotation.Nullable
    public SimulationContentStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the technique property value. The social engineering technique used in the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, credentialHarvesting, attachmentMalware, driveByUrl, linkInAttachment, linkToMalwareFile, unknownFutureValue, oAuthConsentGrant. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: oAuthConsentGrant. For more information on the types of social engineering attack techniques, see simulations.
     * @return a {@link SimulationAttackTechnique}
     */
    @jakarta.annotation.Nullable
    public SimulationAttackTechnique getTechnique() {
        return this.backingStore.get("technique");
    }
    /**
     * Gets the theme property value. The theme of a payload. Possible values are: unknown, other, accountActivation, accountVerification, billing, cleanUpMail, controversial, documentReceived, expense, fax, financeReport, incomingMessages, invoice, itemReceived, loginAlert, mailReceived, password, payment, payroll, personalizedOffer, quarantine, remoteWork, reviewMessage, securityUpdate, serviceSuspended, signatureRequired, upgradeMailboxStorage, verifyMailbox, voicemail, advertisement, employeeEngagement, unknownFutureValue.
     * @return a {@link PayloadTheme}
     */
    @jakarta.annotation.Nullable
    public PayloadTheme getTheme() {
        return this.backingStore.get("theme");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("brand", this.getBrand());
        writer.writeEnumValue("complexity", this.getComplexity());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("detail", this.getDetail());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("industry", this.getIndustry());
        writer.writeBooleanValue("isAutomated", this.getIsAutomated());
        writer.writeBooleanValue("isControversial", this.getIsControversial());
        writer.writeBooleanValue("isCurrentEvent", this.getIsCurrentEvent());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("payloadTags", this.getPayloadTags());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeDoubleValue("predictedCompromiseRate", this.getPredictedCompromiseRate());
        writer.writeEnumValue("simulationAttackType", this.getSimulationAttackType());
        writer.writeEnumValue("source", this.getSource());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumValue("technique", this.getTechnique());
        writer.writeEnumValue("theme", this.getTheme());
    }
    /**
     * Sets the brand property value. The branch of a payload. Possible values are: unknown, other, americanExpress, capitalOne, dhl, docuSign, dropbox, facebook, firstAmerican, microsoft, netflix, scotiabank, sendGrid, stewartTitle, tesco, wellsFargo, syrinxCloud, adobe, teams, zoom, unknownFutureValue.
     * @param value Value to set for the brand property.
     */
    public void setBrand(@jakarta.annotation.Nullable final PayloadBrand value) {
        this.backingStore.set("brand", value);
    }
    /**
     * Sets the complexity property value. The complexity of a payload. Possible values are: unknown, low, medium, high, unknownFutureValue.
     * @param value Value to set for the complexity property.
     */
    public void setComplexity(@jakarta.annotation.Nullable final PayloadComplexity value) {
        this.backingStore.set("complexity", value);
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the attack simulation and training campaign payload.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time when the attack simulation and training campaign payload. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Description of the attack simulation and training campaign payload.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the detail property value. Additional details about the payload.
     * @param value Value to set for the detail property.
     */
    public void setDetail(@jakarta.annotation.Nullable final PayloadDetail value) {
        this.backingStore.set("detail", value);
    }
    /**
     * Sets the displayName property value. Display name of the attack simulation and training campaign payload. Supports $filter and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the industry property value. Industry of a payload. Possible values are: unknown, other, banking, businessServices, consumerServices, education, energy, construction, consulting, financialServices, government, hospitality, insurance, legal, courierServices, IT, healthcare, manufacturing, retail, telecom, realEstate, unknownFutureValue.
     * @param value Value to set for the industry property.
     */
    public void setIndustry(@jakarta.annotation.Nullable final PayloadIndustry value) {
        this.backingStore.set("industry", value);
    }
    /**
     * Sets the isAutomated property value. Indicates whether the attack simulation and training campaign payload was created from an automation flow. Supports $filter and $orderby.
     * @param value Value to set for the isAutomated property.
     */
    public void setIsAutomated(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAutomated", value);
    }
    /**
     * Sets the isControversial property value. Indicates whether the payload is controversial.
     * @param value Value to set for the isControversial property.
     */
    public void setIsControversial(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isControversial", value);
    }
    /**
     * Sets the isCurrentEvent property value. Indicates whether the payload is from any recent event.
     * @param value Value to set for the isCurrentEvent property.
     */
    public void setIsCurrentEvent(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCurrentEvent", value);
    }
    /**
     * Sets the language property value. Payload language.
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("language", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who most recently modified the attack simulation and training campaign payload.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time when the attack simulation and training campaign payload was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the payloadTags property value. Free text tags for a payload.
     * @param value Value to set for the payloadTags property.
     */
    public void setPayloadTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("payloadTags", value);
    }
    /**
     * Sets the platform property value. The payload delivery platform for a simulation. Possible values are: unknown, sms, email, teams, unknownFutureValue.
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final PayloadDeliveryPlatform value) {
        this.backingStore.set("platform", value);
    }
    /**
     * Sets the predictedCompromiseRate property value. Predicted probability for a payload to phish a targeted user.
     * @param value Value to set for the predictedCompromiseRate property.
     */
    public void setPredictedCompromiseRate(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("predictedCompromiseRate", value);
    }
    /**
     * Sets the simulationAttackType property value. Attack type of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, social, cloud, endpoint, unknownFutureValue.
     * @param value Value to set for the simulationAttackType property.
     */
    public void setSimulationAttackType(@jakarta.annotation.Nullable final SimulationAttackType value) {
        this.backingStore.set("simulationAttackType", value);
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final SimulationContentSource value) {
        this.backingStore.set("source", value);
    }
    /**
     * Sets the status property value. Simulation content status. Supports $filter and $orderby. Possible values are: unknown, draft, ready, archive, delete, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SimulationContentStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the technique property value. The social engineering technique used in the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, credentialHarvesting, attachmentMalware, driveByUrl, linkInAttachment, linkToMalwareFile, unknownFutureValue, oAuthConsentGrant. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: oAuthConsentGrant. For more information on the types of social engineering attack techniques, see simulations.
     * @param value Value to set for the technique property.
     */
    public void setTechnique(@jakarta.annotation.Nullable final SimulationAttackTechnique value) {
        this.backingStore.set("technique", value);
    }
    /**
     * Sets the theme property value. The theme of a payload. Possible values are: unknown, other, accountActivation, accountVerification, billing, cleanUpMail, controversial, documentReceived, expense, fax, financeReport, incomingMessages, invoice, itemReceived, loginAlert, mailReceived, password, payment, payroll, personalizedOffer, quarantine, remoteWork, reviewMessage, securityUpdate, serviceSuspended, signatureRequired, upgradeMailboxStorage, verifyMailbox, voicemail, advertisement, employeeEngagement, unknownFutureValue.
     * @param value Value to set for the theme property.
     */
    public void setTheme(@jakarta.annotation.Nullable final PayloadTheme value) {
        this.backingStore.set("theme", value);
    }
}
