package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class Simulation extends Entity implements Parsable {
    /** The attackTechnique property */
    private SimulationAttackTechnique _attackTechnique;
    /** The attackType property */
    private SimulationAttackType _attackType;
    /** The automationId property */
    private String _automationId;
    /** The completionDateTime property */
    private OffsetDateTime _completionDateTime;
    /** The createdBy property */
    private EmailIdentity _createdBy;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The isAutomated property */
    private Boolean _isAutomated;
    /** The lastModifiedBy property */
    private EmailIdentity _lastModifiedBy;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The launchDateTime property */
    private OffsetDateTime _launchDateTime;
    /** The payloadDeliveryPlatform property */
    private PayloadDeliveryPlatform _payloadDeliveryPlatform;
    /** The report property */
    private SimulationReport _report;
    /** The status property */
    private SimulationStatus _status;
    /**
     * Instantiates a new simulation and sets the default values.
     * @return a void
     */
    public Simulation() {
        super();
        this.setOdataType("#microsoft.graph.simulation");
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
     * Gets the attackTechnique property value. The attackTechnique property
     * @return a simulationAttackTechnique
     */
    @javax.annotation.Nullable
    public SimulationAttackTechnique getAttackTechnique() {
        return this._attackTechnique;
    }
    /**
     * Gets the attackType property value. The attackType property
     * @return a simulationAttackType
     */
    @javax.annotation.Nullable
    public SimulationAttackType getAttackType() {
        return this._attackType;
    }
    /**
     * Gets the automationId property value. The automationId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAutomationId() {
        return this._automationId;
    }
    /**
     * Gets the completionDateTime property value. The completionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this._completionDateTime;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a emailIdentity
     */
    @javax.annotation.Nullable
    public EmailIdentity getCreatedBy() {
        return this._createdBy;
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
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The displayName property
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
        final Simulation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("attackTechnique", (n) -> { currentObject.setAttackTechnique(n.getEnumValue(SimulationAttackTechnique.class)); });
            this.put("attackType", (n) -> { currentObject.setAttackType(n.getEnumValue(SimulationAttackType.class)); });
            this.put("automationId", (n) -> { currentObject.setAutomationId(n.getStringValue()); });
            this.put("completionDateTime", (n) -> { currentObject.setCompletionDateTime(n.getOffsetDateTimeValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isAutomated", (n) -> { currentObject.setIsAutomated(n.getBooleanValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("launchDateTime", (n) -> { currentObject.setLaunchDateTime(n.getOffsetDateTimeValue()); });
            this.put("payloadDeliveryPlatform", (n) -> { currentObject.setPayloadDeliveryPlatform(n.getEnumValue(PayloadDeliveryPlatform.class)); });
            this.put("report", (n) -> { currentObject.setReport(n.getObjectValue(SimulationReport::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(SimulationStatus.class)); });
        }};
    }
    /**
     * Gets the isAutomated property value. The isAutomated property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAutomated() {
        return this._isAutomated;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a emailIdentity
     */
    @javax.annotation.Nullable
    public EmailIdentity getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the launchDateTime property value. The launchDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLaunchDateTime() {
        return this._launchDateTime;
    }
    /**
     * Gets the payloadDeliveryPlatform property value. The payloadDeliveryPlatform property
     * @return a payloadDeliveryPlatform
     */
    @javax.annotation.Nullable
    public PayloadDeliveryPlatform getPayloadDeliveryPlatform() {
        return this._payloadDeliveryPlatform;
    }
    /**
     * Gets the report property value. The report property
     * @return a simulationReport
     */
    @javax.annotation.Nullable
    public SimulationReport getReport() {
        return this._report;
    }
    /**
     * Gets the status property value. The status property
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
     * Sets the attackTechnique property value. The attackTechnique property
     * @param value Value to set for the attackTechnique property.
     * @return a void
     */
    public void setAttackTechnique(@javax.annotation.Nullable final SimulationAttackTechnique value) {
        this._attackTechnique = value;
    }
    /**
     * Sets the attackType property value. The attackType property
     * @param value Value to set for the attackType property.
     * @return a void
     */
    public void setAttackType(@javax.annotation.Nullable final SimulationAttackType value) {
        this._attackType = value;
    }
    /**
     * Sets the automationId property value. The automationId property
     * @param value Value to set for the automationId property.
     * @return a void
     */
    public void setAutomationId(@javax.annotation.Nullable final String value) {
        this._automationId = value;
    }
    /**
     * Sets the completionDateTime property value. The completionDateTime property
     * @param value Value to set for the completionDateTime property.
     * @return a void
     */
    public void setCompletionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completionDateTime = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final EmailIdentity value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isAutomated property value. The isAutomated property
     * @param value Value to set for the isAutomated property.
     * @return a void
     */
    public void setIsAutomated(@javax.annotation.Nullable final Boolean value) {
        this._isAutomated = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final EmailIdentity value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the launchDateTime property value. The launchDateTime property
     * @param value Value to set for the launchDateTime property.
     * @return a void
     */
    public void setLaunchDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._launchDateTime = value;
    }
    /**
     * Sets the payloadDeliveryPlatform property value. The payloadDeliveryPlatform property
     * @param value Value to set for the payloadDeliveryPlatform property.
     * @return a void
     */
    public void setPayloadDeliveryPlatform(@javax.annotation.Nullable final PayloadDeliveryPlatform value) {
        this._payloadDeliveryPlatform = value;
    }
    /**
     * Sets the report property value. The report property
     * @param value Value to set for the report property.
     * @return a void
     */
    public void setReport(@javax.annotation.Nullable final SimulationReport value) {
        this._report = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final SimulationStatus value) {
        this._status = value;
    }
}
