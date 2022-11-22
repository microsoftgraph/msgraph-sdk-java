package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class SimulationAutomation extends Entity implements Parsable {
    /** Identity of the user who created the attack simulation automation. */
    private EmailIdentity _createdBy;
    /** Date and time when the attack simulation automation was created. */
    private OffsetDateTime _createdDateTime;
    /** Description of the attack simulation automation. */
    private String _description;
    /** Display name of the attack simulation automation. Supports $filter and $orderby. */
    private String _displayName;
    /** Identity of the user who most recently modified the attack simulation automation. */
    private EmailIdentity _lastModifiedBy;
    /** Date and time when the attack simulation automation was most recently modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Date and time of the latest run of the attack simulation automation. */
    private OffsetDateTime _lastRunDateTime;
    /** Date and time of the upcoming run of the attack simulation automation. */
    private OffsetDateTime _nextRunDateTime;
    /** A collection of simulation automation runs. */
    private java.util.List<SimulationAutomationRun> _runs;
    /** Status of the attack simulation automation. Supports $filter and $orderby. The possible values are: unknown, draft, notRunning, running, completed, unknownFutureValue. */
    private SimulationAutomationStatus _status;
    /**
     * Instantiates a new simulationAutomation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SimulationAutomation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a simulationAutomation
     */
    @javax.annotation.Nonnull
    public static SimulationAutomation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimulationAutomation();
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the attack simulation automation.
     * @return a emailIdentity
     */
    @javax.annotation.Nullable
    public EmailIdentity getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. Date and time when the attack simulation automation was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Description of the attack simulation automation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Display name of the attack simulation automation. Supports $filter and $orderby.
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
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastRunDateTime", (n) -> { this.setLastRunDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("nextRunDateTime", (n) -> { this.setNextRunDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("runs", (n) -> { this.setRuns(n.getCollectionOfObjectValues(SimulationAutomationRun::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SimulationAutomationStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who most recently modified the attack simulation automation.
     * @return a emailIdentity
     */
    @javax.annotation.Nullable
    public EmailIdentity getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time when the attack simulation automation was most recently modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the lastRunDateTime property value. Date and time of the latest run of the attack simulation automation.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRunDateTime() {
        return this._lastRunDateTime;
    }
    /**
     * Gets the nextRunDateTime property value. Date and time of the upcoming run of the attack simulation automation.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getNextRunDateTime() {
        return this._nextRunDateTime;
    }
    /**
     * Gets the runs property value. A collection of simulation automation runs.
     * @return a simulationAutomationRun
     */
    @javax.annotation.Nullable
    public java.util.List<SimulationAutomationRun> getRuns() {
        return this._runs;
    }
    /**
     * Gets the status property value. Status of the attack simulation automation. Supports $filter and $orderby. The possible values are: unknown, draft, notRunning, running, completed, unknownFutureValue.
     * @return a simulationAutomationStatus
     */
    @javax.annotation.Nullable
    public SimulationAutomationStatus getStatus() {
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
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("lastRunDateTime", this.getLastRunDateTime());
        writer.writeOffsetDateTimeValue("nextRunDateTime", this.getNextRunDateTime());
        writer.writeCollectionOfObjectValues("runs", this.getRuns());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the attack simulation automation.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final EmailIdentity value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time when the attack simulation automation was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the attack simulation automation.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Display name of the attack simulation automation. Supports $filter and $orderby.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who most recently modified the attack simulation automation.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final EmailIdentity value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time when the attack simulation automation was most recently modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the lastRunDateTime property value. Date and time of the latest run of the attack simulation automation.
     * @param value Value to set for the lastRunDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastRunDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRunDateTime = value;
    }
    /**
     * Sets the nextRunDateTime property value. Date and time of the upcoming run of the attack simulation automation.
     * @param value Value to set for the nextRunDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNextRunDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._nextRunDateTime = value;
    }
    /**
     * Sets the runs property value. A collection of simulation automation runs.
     * @param value Value to set for the runs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRuns(@javax.annotation.Nullable final java.util.List<SimulationAutomationRun> value) {
        this._runs = value;
    }
    /**
     * Sets the status property value. Status of the attack simulation automation. Supports $filter and $orderby. The possible values are: unknown, draft, notRunning, running, completed, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final SimulationAutomationStatus value) {
        this._status = value;
    }
}
