package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the admin singleton.
 */
public class Simulation extends Entity implements Parsable {
    /** The social engineering technique used in the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, credentialHarvesting, attachmentMalware, driveByUrl, linkInAttachment, linkToMalwareFile, unknownFutureValue. For more information on the types of social engineering attack techniques, see simulations. */
    private SimulationAttackTechnique _attackTechnique;
    /** Attack type of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, social, cloud, endpoint, unknownFutureValue. */
    private SimulationAttackType _attackType;
    /** Unique identifier for the attack simulation automation. */
    private String _automationId;
    /** Date and time of completion of the attack simulation and training campaign. Supports $filter and $orderby. */
    private OffsetDateTime _completionDateTime;
    /** Identity of the user who created the attack simulation and training campaign. */
    private EmailIdentity _createdBy;
    /** Date and time of creation of the attack simulation and training campaign. */
    private OffsetDateTime _createdDateTime;
    /** Description of the attack simulation and training campaign. */
    private String _description;
    /** Display name of the attack simulation and training campaign. Supports $filter and $orderby. */
    private String _displayName;
    /** Flag that represents if the attack simulation and training campaign was created from a simulation automation flow. Supports $filter and $orderby. */
    private Boolean _isAutomated;
    /** Identity of the user who most recently modified the attack simulation and training campaign. */
    private EmailIdentity _lastModifiedBy;
    /** Date and time of the most recent modification of the attack simulation and training campaign. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Date and time of the launch/start of the attack simulation and training campaign. Supports $filter and $orderby. */
    private OffsetDateTime _launchDateTime;
    /** Method of delivery of the phishing payload used in the attack simulation and training campaign. Possible values are: unknown, sms, email, teams, unknownFutureValue. */
    private PayloadDeliveryPlatform _payloadDeliveryPlatform;
    /** Report of the attack simulation and training campaign. */
    private SimulationReport _report;
    /** Status of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, draft, running, scheduled, succeeded, failed, cancelled, excluded, unknownFutureValue. */
    private SimulationStatus _status;
    /**
     * Instantiates a new simulation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Simulation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a simulation
     */
    @javax.annotation.Nonnull
    public static Simulation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Simulation();
    }
    /**
     * Gets the attackTechnique property value. The social engineering technique used in the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, credentialHarvesting, attachmentMalware, driveByUrl, linkInAttachment, linkToMalwareFile, unknownFutureValue. For more information on the types of social engineering attack techniques, see simulations.
     * @return a simulationAttackTechnique
     */
    @javax.annotation.Nullable
    public SimulationAttackTechnique getAttackTechnique() {
        return this._attackTechnique;
    }
    /**
     * Gets the attackType property value. Attack type of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, social, cloud, endpoint, unknownFutureValue.
     * @return a simulationAttackType
     */
    @javax.annotation.Nullable
    public SimulationAttackType getAttackType() {
        return this._attackType;
    }
    /**
     * Gets the automationId property value. Unique identifier for the attack simulation automation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAutomationId() {
        return this._automationId;
    }
    /**
     * Gets the completionDateTime property value. Date and time of completion of the attack simulation and training campaign. Supports $filter and $orderby.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this._completionDateTime;
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the attack simulation and training campaign.
     * @return a emailIdentity
     */
    @javax.annotation.Nullable
    public EmailIdentity getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. Date and time of creation of the attack simulation and training campaign.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Description of the attack simulation and training campaign.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Display name of the attack simulation and training campaign. Supports $filter and $orderby.
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
    @javax.annotation.Nullable
    public Boolean getIsAutomated() {
        return this._isAutomated;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who most recently modified the attack simulation and training campaign.
     * @return a emailIdentity
     */
    @javax.annotation.Nullable
    public EmailIdentity getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time of the most recent modification of the attack simulation and training campaign.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the launchDateTime property value. Date and time of the launch/start of the attack simulation and training campaign. Supports $filter and $orderby.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLaunchDateTime() {
        return this._launchDateTime;
    }
    /**
     * Gets the payloadDeliveryPlatform property value. Method of delivery of the phishing payload used in the attack simulation and training campaign. Possible values are: unknown, sms, email, teams, unknownFutureValue.
     * @return a payloadDeliveryPlatform
     */
    @javax.annotation.Nullable
    public PayloadDeliveryPlatform getPayloadDeliveryPlatform() {
        return this._payloadDeliveryPlatform;
    }
    /**
     * Gets the report property value. Report of the attack simulation and training campaign.
     * @return a simulationReport
     */
    @javax.annotation.Nullable
    public SimulationReport getReport() {
        return this._report;
    }
    /**
     * Gets the status property value. Status of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, draft, running, scheduled, succeeded, failed, cancelled, excluded, unknownFutureValue.
     * @return a simulationStatus
     */
    @javax.annotation.Nullable
    public SimulationStatus getStatus() {
        return this._status;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttackTechnique(@javax.annotation.Nullable final SimulationAttackTechnique value) {
        this._attackTechnique = value;
    }
    /**
     * Sets the attackType property value. Attack type of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, social, cloud, endpoint, unknownFutureValue.
     * @param value Value to set for the attackType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttackType(@javax.annotation.Nullable final SimulationAttackType value) {
        this._attackType = value;
    }
    /**
     * Sets the automationId property value. Unique identifier for the attack simulation automation.
     * @param value Value to set for the automationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutomationId(@javax.annotation.Nullable final String value) {
        this._automationId = value;
    }
    /**
     * Sets the completionDateTime property value. Date and time of completion of the attack simulation and training campaign. Supports $filter and $orderby.
     * @param value Value to set for the completionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completionDateTime = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the attack simulation and training campaign.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final EmailIdentity value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time of creation of the attack simulation and training campaign.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the attack simulation and training campaign.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Display name of the attack simulation and training campaign. Supports $filter and $orderby.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isAutomated property value. Flag that represents if the attack simulation and training campaign was created from a simulation automation flow. Supports $filter and $orderby.
     * @param value Value to set for the isAutomated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAutomated(@javax.annotation.Nullable final Boolean value) {
        this._isAutomated = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who most recently modified the attack simulation and training campaign.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final EmailIdentity value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time of the most recent modification of the attack simulation and training campaign.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the launchDateTime property value. Date and time of the launch/start of the attack simulation and training campaign. Supports $filter and $orderby.
     * @param value Value to set for the launchDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLaunchDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._launchDateTime = value;
    }
    /**
     * Sets the payloadDeliveryPlatform property value. Method of delivery of the phishing payload used in the attack simulation and training campaign. Possible values are: unknown, sms, email, teams, unknownFutureValue.
     * @param value Value to set for the payloadDeliveryPlatform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayloadDeliveryPlatform(@javax.annotation.Nullable final PayloadDeliveryPlatform value) {
        this._payloadDeliveryPlatform = value;
    }
    /**
     * Sets the report property value. Report of the attack simulation and training campaign.
     * @param value Value to set for the report property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReport(@javax.annotation.Nullable final SimulationReport value) {
        this._report = value;
    }
    /**
     * Sets the status property value. Status of the attack simulation and training campaign. Supports $filter and $orderby. Possible values are: unknown, draft, running, scheduled, succeeded, failed, cancelled, excluded, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final SimulationStatus value) {
        this._status = value;
    }
}
