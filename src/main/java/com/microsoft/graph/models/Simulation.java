package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Simulation extends Entity implements Parsable {
    /**
     * The social engineering technique used in the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, credentialHarvesting, attachmentMalware, driveByUrl, linkInAttachment, linkToMalwareFile, unknownFutureValue. For more information on the types of social engineering attack techniques, see simulations.
     */
    private SimulationAttackTechnique attackTechnique;
    /**
     * Attack type of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, social, cloud, endpoint, unknownFutureValue.
     */
    private SimulationAttackType attackType;
    /**
     * Unique identifier for the attack simulation automation.
     */
    private String automationId;
    /**
     * Date and time of completion of the attack simulation and training campaign. Supports $filter and $orderby.
     */
    private OffsetDateTime completionDateTime;
    /**
     * Identity of the user who created the attack simulation and training campaign.
     */
    private EmailIdentity createdBy;
    /**
     * Date and time of creation of the attack simulation and training campaign.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Description of the attack simulation and training campaign.
     */
    private String description;
    /**
     * Display name of the attack simulation and training campaign. Supports $filter and $orderby.
     */
    private String displayName;
    /**
     * Flag that represents if the attack simulation and training campaign was created from a simulation automation flow. Supports $filter and $orderby.
     */
    private Boolean isAutomated;
    /**
     * Identity of the user who most recently modified the attack simulation and training campaign.
     */
    private EmailIdentity lastModifiedBy;
    /**
     * Date and time of the most recent modification of the attack simulation and training campaign.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Date and time of the launch/start of the attack simulation and training campaign. Supports $filter and $orderby.
     */
    private OffsetDateTime launchDateTime;
    /**
     * Method of delivery of the phishing payload used in the attack simulation and training campaign. Possible values are: unknown, sms, email, teams, unknownFutureValue.
     */
    private PayloadDeliveryPlatform payloadDeliveryPlatform;
    /**
     * Report of the attack simulation and training campaign.
     */
    private SimulationReport report;
    /**
     * Status of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, draft, running, scheduled, succeeded, failed, cancelled, excluded, unknownFutureValue.
     */
    private SimulationStatus status;
    /**
     * Instantiates a new simulation and sets the default values.
     */
    public Simulation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a simulation
     */
    @jakarta.annotation.Nonnull
    public static Simulation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Simulation();
    }
    /**
     * Gets the attackTechnique property value. The social engineering technique used in the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, credentialHarvesting, attachmentMalware, driveByUrl, linkInAttachment, linkToMalwareFile, unknownFutureValue. For more information on the types of social engineering attack techniques, see simulations.
     * @return a simulationAttackTechnique
     */
    @jakarta.annotation.Nullable
    public SimulationAttackTechnique getAttackTechnique() {
        return this.attackTechnique;
    }
    /**
     * Gets the attackType property value. Attack type of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, social, cloud, endpoint, unknownFutureValue.
     * @return a simulationAttackType
     */
    @jakarta.annotation.Nullable
    public SimulationAttackType getAttackType() {
        return this.attackType;
    }
    /**
     * Gets the automationId property value. Unique identifier for the attack simulation automation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAutomationId() {
        return this.automationId;
    }
    /**
     * Gets the completionDateTime property value. Date and time of completion of the attack simulation and training campaign. Supports $filter and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this.completionDateTime;
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the attack simulation and training campaign.
     * @return a emailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. Date and time of creation of the attack simulation and training campaign.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Description of the attack simulation and training campaign.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name of the attack simulation and training campaign. Supports $filter and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
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
        deserializerMap.put("isAutomated", (n) -> { this.setIsAutomated(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("launchDateTime", (n) -> { this.setLaunchDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("payloadDeliveryPlatform", (n) -> { this.setPayloadDeliveryPlatform(n.getEnumValue(PayloadDeliveryPlatform.class)); });
        deserializerMap.put("report", (n) -> { this.setReport(n.getObjectValue(SimulationReport::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SimulationStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isAutomated property value. Flag that represents if the attack simulation and training campaign was created from a simulation automation flow. Supports $filter and $orderby.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAutomated() {
        return this.isAutomated;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who most recently modified the attack simulation and training campaign.
     * @return a emailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time of the most recent modification of the attack simulation and training campaign.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the launchDateTime property value. Date and time of the launch/start of the attack simulation and training campaign. Supports $filter and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLaunchDateTime() {
        return this.launchDateTime;
    }
    /**
     * Gets the payloadDeliveryPlatform property value. Method of delivery of the phishing payload used in the attack simulation and training campaign. Possible values are: unknown, sms, email, teams, unknownFutureValue.
     * @return a payloadDeliveryPlatform
     */
    @jakarta.annotation.Nullable
    public PayloadDeliveryPlatform getPayloadDeliveryPlatform() {
        return this.payloadDeliveryPlatform;
    }
    /**
     * Gets the report property value. Report of the attack simulation and training campaign.
     * @return a simulationReport
     */
    @jakarta.annotation.Nullable
    public SimulationReport getReport() {
        return this.report;
    }
    /**
     * Gets the status property value. Status of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, draft, running, scheduled, succeeded, failed, cancelled, excluded, unknownFutureValue.
     * @return a simulationStatus
     */
    @jakarta.annotation.Nullable
    public SimulationStatus getStatus() {
        return this.status;
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
        writer.writeBooleanValue("isAutomated", this.getIsAutomated());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("launchDateTime", this.getLaunchDateTime());
        writer.writeEnumValue("payloadDeliveryPlatform", this.getPayloadDeliveryPlatform());
        writer.writeObjectValue("report", this.getReport());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the attackTechnique property value. The social engineering technique used in the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, credentialHarvesting, attachmentMalware, driveByUrl, linkInAttachment, linkToMalwareFile, unknownFutureValue. For more information on the types of social engineering attack techniques, see simulations.
     * @param value Value to set for the attackTechnique property.
     */
    public void setAttackTechnique(@jakarta.annotation.Nullable final SimulationAttackTechnique value) {
        this.attackTechnique = value;
    }
    /**
     * Sets the attackType property value. Attack type of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, social, cloud, endpoint, unknownFutureValue.
     * @param value Value to set for the attackType property.
     */
    public void setAttackType(@jakarta.annotation.Nullable final SimulationAttackType value) {
        this.attackType = value;
    }
    /**
     * Sets the automationId property value. Unique identifier for the attack simulation automation.
     * @param value Value to set for the automationId property.
     */
    public void setAutomationId(@jakarta.annotation.Nullable final String value) {
        this.automationId = value;
    }
    /**
     * Sets the completionDateTime property value. Date and time of completion of the attack simulation and training campaign. Supports $filter and $orderby.
     * @param value Value to set for the completionDateTime property.
     */
    public void setCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completionDateTime = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the attack simulation and training campaign.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time of creation of the attack simulation and training campaign.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the attack simulation and training campaign.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name of the attack simulation and training campaign. Supports $filter and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isAutomated property value. Flag that represents if the attack simulation and training campaign was created from a simulation automation flow. Supports $filter and $orderby.
     * @param value Value to set for the isAutomated property.
     */
    public void setIsAutomated(@jakarta.annotation.Nullable final Boolean value) {
        this.isAutomated = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who most recently modified the attack simulation and training campaign.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time of the most recent modification of the attack simulation and training campaign.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the launchDateTime property value. Date and time of the launch/start of the attack simulation and training campaign. Supports $filter and $orderby.
     * @param value Value to set for the launchDateTime property.
     */
    public void setLaunchDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.launchDateTime = value;
    }
    /**
     * Sets the payloadDeliveryPlatform property value. Method of delivery of the phishing payload used in the attack simulation and training campaign. Possible values are: unknown, sms, email, teams, unknownFutureValue.
     * @param value Value to set for the payloadDeliveryPlatform property.
     */
    public void setPayloadDeliveryPlatform(@jakarta.annotation.Nullable final PayloadDeliveryPlatform value) {
        this.payloadDeliveryPlatform = value;
    }
    /**
     * Sets the report property value. Report of the attack simulation and training campaign.
     * @param value Value to set for the report property.
     */
    public void setReport(@jakarta.annotation.Nullable final SimulationReport value) {
        this.report = value;
    }
    /**
     * Sets the status property value. Status of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, draft, running, scheduled, succeeded, failed, cancelled, excluded, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SimulationStatus value) {
        this.status = value;
    }
}
