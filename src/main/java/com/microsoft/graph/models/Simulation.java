package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Simulation extends Entity implements Parsable {
    /**
     * Instantiates a new Simulation and sets the default values.
     */
    public Simulation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Simulation
     */
    @jakarta.annotation.Nonnull
    public static Simulation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Simulation();
    }
    /**
     * Gets the attackTechnique property value. The social engineering technique used in the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, credentialHarvesting, attachmentMalware, driveByUrl, linkInAttachment, linkToMalwareFile, unknownFutureValue, oAuthConsentGrant. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: oAuthConsentGrant. For more information on the types of social engineering attack techniques, see simulations.
     * @return a SimulationAttackTechnique
     */
    @jakarta.annotation.Nullable
    public SimulationAttackTechnique getAttackTechnique() {
        return this.BackingStore.get("attackTechnique");
    }
    /**
     * Gets the attackType property value. Attack type of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, social, cloud, endpoint, unknownFutureValue.
     * @return a SimulationAttackType
     */
    @jakarta.annotation.Nullable
    public SimulationAttackType getAttackType() {
        return this.BackingStore.get("attackType");
    }
    /**
     * Gets the automationId property value. Unique identifier for the attack simulation automation.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAutomationId() {
        return this.BackingStore.get("automationId");
    }
    /**
     * Gets the completionDateTime property value. Date and time of completion of the attack simulation and training campaign. Supports $filter and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this.BackingStore.get("completionDateTime");
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the attack simulation and training campaign.
     * @return a EmailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getCreatedBy() {
        return this.BackingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Date and time of creation of the attack simulation and training campaign.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Description of the attack simulation and training campaign.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. Display name of the attack simulation and training campaign. Supports $filter and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the durationInDays property value. Simulation duration in days.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDurationInDays() {
        return this.BackingStore.get("durationInDays");
    }
    /**
     * Gets the endUserNotificationSetting property value. Details about the end user notification setting.
     * @return a EndUserNotificationSetting
     */
    @jakarta.annotation.Nullable
    public EndUserNotificationSetting getEndUserNotificationSetting() {
        return this.BackingStore.get("endUserNotificationSetting");
    }
    /**
     * Gets the excludedAccountTarget property value. Users excluded from the simulation.
     * @return a AccountTargetContent
     */
    @jakarta.annotation.Nullable
    public AccountTargetContent getExcludedAccountTarget() {
        return this.BackingStore.get("excludedAccountTarget");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attackTechnique", (n) -> { this.setAttackTechnique(n.getEnumValue(SimulationAttackTechnique.class)); });
        deserializerMap.put("attackType", (n) -> { this.setAttackType(n.getEnumValue(SimulationAttackType.class)); });
        deserializerMap.put("automationId", (n) -> { this.setAutomationId(n.getStringValue()); });
        deserializerMap.put("completionDateTime", (n) -> { this.setCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("durationInDays", (n) -> { this.setDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("endUserNotificationSetting", (n) -> { this.setEndUserNotificationSetting(n.getObjectValue(EndUserNotificationSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("excludedAccountTarget", (n) -> { this.setExcludedAccountTarget(n.getObjectValue(AccountTargetContent::createFromDiscriminatorValue)); });
        deserializerMap.put("includedAccountTarget", (n) -> { this.setIncludedAccountTarget(n.getObjectValue(AccountTargetContent::createFromDiscriminatorValue)); });
        deserializerMap.put("isAutomated", (n) -> { this.setIsAutomated(n.getBooleanValue()); });
        deserializerMap.put("landingPage", (n) -> { this.setLandingPage(n.getObjectValue(LandingPage::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("launchDateTime", (n) -> { this.setLaunchDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("loginPage", (n) -> { this.setLoginPage(n.getObjectValue(LoginPage::createFromDiscriminatorValue)); });
        deserializerMap.put("oAuthConsentAppDetail", (n) -> { this.setOAuthConsentAppDetail(n.getObjectValue(OAuthConsentAppDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getObjectValue(Payload::createFromDiscriminatorValue)); });
        deserializerMap.put("payloadDeliveryPlatform", (n) -> { this.setPayloadDeliveryPlatform(n.getEnumValue(PayloadDeliveryPlatform.class)); });
        deserializerMap.put("report", (n) -> { this.setReport(n.getObjectValue(SimulationReport::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SimulationStatus.class)); });
        deserializerMap.put("trainingSetting", (n) -> { this.setTrainingSetting(n.getObjectValue(TrainingSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the includedAccountTarget property value. Users targeted in the simulation.
     * @return a AccountTargetContent
     */
    @jakarta.annotation.Nullable
    public AccountTargetContent getIncludedAccountTarget() {
        return this.BackingStore.get("includedAccountTarget");
    }
    /**
     * Gets the isAutomated property value. Flag that represents if the attack simulation and training campaign was created from a simulation automation flow. Supports $filter and $orderby.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAutomated() {
        return this.BackingStore.get("isAutomated");
    }
    /**
     * Gets the landingPage property value. The landing page associated with a simulation during its creation.
     * @return a LandingPage
     */
    @jakarta.annotation.Nullable
    public LandingPage getLandingPage() {
        return this.BackingStore.get("landingPage");
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who most recently modified the attack simulation and training campaign.
     * @return a EmailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getLastModifiedBy() {
        return this.BackingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time of the most recent modification of the attack simulation and training campaign.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the launchDateTime property value. Date and time of the launch/start of the attack simulation and training campaign. Supports $filter and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLaunchDateTime() {
        return this.BackingStore.get("launchDateTime");
    }
    /**
     * Gets the loginPage property value. The login page associated with a simulation during its creation.
     * @return a LoginPage
     */
    @jakarta.annotation.Nullable
    public LoginPage getLoginPage() {
        return this.BackingStore.get("loginPage");
    }
    /**
     * Gets the oAuthConsentAppDetail property value. OAuth app details for the OAuth technique.
     * @return a OAuthConsentAppDetail
     */
    @jakarta.annotation.Nullable
    public OAuthConsentAppDetail getOAuthConsentAppDetail() {
        return this.BackingStore.get("oAuthConsentAppDetail");
    }
    /**
     * Gets the payload property value. The payload associated with a simulation during its creation.
     * @return a Payload
     */
    @jakarta.annotation.Nullable
    public Payload getPayload() {
        return this.BackingStore.get("payload");
    }
    /**
     * Gets the payloadDeliveryPlatform property value. Method of delivery of the phishing payload used in the attack simulation and training campaign. Possible values are: unknown, sms, email, teams, unknownFutureValue.
     * @return a PayloadDeliveryPlatform
     */
    @jakarta.annotation.Nullable
    public PayloadDeliveryPlatform getPayloadDeliveryPlatform() {
        return this.BackingStore.get("payloadDeliveryPlatform");
    }
    /**
     * Gets the report property value. Report of the attack simulation and training campaign.
     * @return a SimulationReport
     */
    @jakarta.annotation.Nullable
    public SimulationReport getReport() {
        return this.BackingStore.get("report");
    }
    /**
     * Gets the status property value. Status of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, draft, running, scheduled, succeeded, failed, cancelled, excluded, unknownFutureValue.
     * @return a SimulationStatus
     */
    @jakarta.annotation.Nullable
    public SimulationStatus getStatus() {
        return this.BackingStore.get("status");
    }
    /**
     * Gets the trainingSetting property value. Details about the training settings for a simulation.
     * @return a TrainingSetting
     */
    @jakarta.annotation.Nullable
    public TrainingSetting getTrainingSetting() {
        return this.BackingStore.get("trainingSetting");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("attackTechnique", this.getAttackTechnique());
        writer.writeEnumValue("attackType", this.getAttackType());
        writer.writeStringValue("automationId", this.getAutomationId());
        writer.writeOffsetDateTimeValue("completionDateTime", this.getCompletionDateTime());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("durationInDays", this.getDurationInDays());
        writer.writeObjectValue("endUserNotificationSetting", this.getEndUserNotificationSetting());
        writer.writeObjectValue("excludedAccountTarget", this.getExcludedAccountTarget());
        writer.writeObjectValue("includedAccountTarget", this.getIncludedAccountTarget());
        writer.writeBooleanValue("isAutomated", this.getIsAutomated());
        writer.writeObjectValue("landingPage", this.getLandingPage());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("launchDateTime", this.getLaunchDateTime());
        writer.writeObjectValue("loginPage", this.getLoginPage());
        writer.writeObjectValue("oAuthConsentAppDetail", this.getOAuthConsentAppDetail());
        writer.writeObjectValue("payload", this.getPayload());
        writer.writeEnumValue("payloadDeliveryPlatform", this.getPayloadDeliveryPlatform());
        writer.writeObjectValue("report", this.getReport());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("trainingSetting", this.getTrainingSetting());
    }
    /**
     * Sets the attackTechnique property value. The social engineering technique used in the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, credentialHarvesting, attachmentMalware, driveByUrl, linkInAttachment, linkToMalwareFile, unknownFutureValue, oAuthConsentGrant. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: oAuthConsentGrant. For more information on the types of social engineering attack techniques, see simulations.
     * @param value Value to set for the attackTechnique property.
     */
    public void setAttackTechnique(@jakarta.annotation.Nullable final SimulationAttackTechnique value) {
        this.BackingStore.set("attackTechnique", value);
    }
    /**
     * Sets the attackType property value. Attack type of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, social, cloud, endpoint, unknownFutureValue.
     * @param value Value to set for the attackType property.
     */
    public void setAttackType(@jakarta.annotation.Nullable final SimulationAttackType value) {
        this.BackingStore.set("attackType", value);
    }
    /**
     * Sets the automationId property value. Unique identifier for the attack simulation automation.
     * @param value Value to set for the automationId property.
     */
    public void setAutomationId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("automationId", value);
    }
    /**
     * Sets the completionDateTime property value. Date and time of completion of the attack simulation and training campaign. Supports $filter and $orderby.
     * @param value Value to set for the completionDateTime property.
     */
    public void setCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("completionDateTime", value);
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the attack simulation and training campaign.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.BackingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time of creation of the attack simulation and training campaign.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Description of the attack simulation and training campaign.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Display name of the attack simulation and training campaign. Supports $filter and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the durationInDays property value. Simulation duration in days.
     * @param value Value to set for the durationInDays property.
     */
    public void setDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("durationInDays", value);
    }
    /**
     * Sets the endUserNotificationSetting property value. Details about the end user notification setting.
     * @param value Value to set for the endUserNotificationSetting property.
     */
    public void setEndUserNotificationSetting(@jakarta.annotation.Nullable final EndUserNotificationSetting value) {
        this.BackingStore.set("endUserNotificationSetting", value);
    }
    /**
     * Sets the excludedAccountTarget property value. Users excluded from the simulation.
     * @param value Value to set for the excludedAccountTarget property.
     */
    public void setExcludedAccountTarget(@jakarta.annotation.Nullable final AccountTargetContent value) {
        this.BackingStore.set("excludedAccountTarget", value);
    }
    /**
     * Sets the includedAccountTarget property value. Users targeted in the simulation.
     * @param value Value to set for the includedAccountTarget property.
     */
    public void setIncludedAccountTarget(@jakarta.annotation.Nullable final AccountTargetContent value) {
        this.BackingStore.set("includedAccountTarget", value);
    }
    /**
     * Sets the isAutomated property value. Flag that represents if the attack simulation and training campaign was created from a simulation automation flow. Supports $filter and $orderby.
     * @param value Value to set for the isAutomated property.
     */
    public void setIsAutomated(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isAutomated", value);
    }
    /**
     * Sets the landingPage property value. The landing page associated with a simulation during its creation.
     * @param value Value to set for the landingPage property.
     */
    public void setLandingPage(@jakarta.annotation.Nullable final LandingPage value) {
        this.BackingStore.set("landingPage", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who most recently modified the attack simulation and training campaign.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.BackingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time of the most recent modification of the attack simulation and training campaign.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the launchDateTime property value. Date and time of the launch/start of the attack simulation and training campaign. Supports $filter and $orderby.
     * @param value Value to set for the launchDateTime property.
     */
    public void setLaunchDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("launchDateTime", value);
    }
    /**
     * Sets the loginPage property value. The login page associated with a simulation during its creation.
     * @param value Value to set for the loginPage property.
     */
    public void setLoginPage(@jakarta.annotation.Nullable final LoginPage value) {
        this.BackingStore.set("loginPage", value);
    }
    /**
     * Sets the oAuthConsentAppDetail property value. OAuth app details for the OAuth technique.
     * @param value Value to set for the oAuthConsentAppDetail property.
     */
    public void setOAuthConsentAppDetail(@jakarta.annotation.Nullable final OAuthConsentAppDetail value) {
        this.BackingStore.set("oAuthConsentAppDetail", value);
    }
    /**
     * Sets the payload property value. The payload associated with a simulation during its creation.
     * @param value Value to set for the payload property.
     */
    public void setPayload(@jakarta.annotation.Nullable final Payload value) {
        this.BackingStore.set("payload", value);
    }
    /**
     * Sets the payloadDeliveryPlatform property value. Method of delivery of the phishing payload used in the attack simulation and training campaign. Possible values are: unknown, sms, email, teams, unknownFutureValue.
     * @param value Value to set for the payloadDeliveryPlatform property.
     */
    public void setPayloadDeliveryPlatform(@jakarta.annotation.Nullable final PayloadDeliveryPlatform value) {
        this.BackingStore.set("payloadDeliveryPlatform", value);
    }
    /**
     * Sets the report property value. Report of the attack simulation and training campaign.
     * @param value Value to set for the report property.
     */
    public void setReport(@jakarta.annotation.Nullable final SimulationReport value) {
        this.BackingStore.set("report", value);
    }
    /**
     * Sets the status property value. Status of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, draft, running, scheduled, succeeded, failed, cancelled, excluded, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SimulationStatus value) {
        this.BackingStore.set("status", value);
    }
    /**
     * Sets the trainingSetting property value. Details about the training settings for a simulation.
     * @param value Value to set for the trainingSetting property.
     */
    public void setTrainingSetting(@jakarta.annotation.Nullable final TrainingSetting value) {
        this.BackingStore.set("trainingSetting", value);
    }
}
