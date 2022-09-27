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
public class SimulationAutomation extends Entity implements Parsable {
    /** The createdBy property */
    private EmailIdentity _createdBy;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The lastModifiedBy property */
    private EmailIdentity _lastModifiedBy;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The lastRunDateTime property */
    private OffsetDateTime _lastRunDateTime;
    /** The nextRunDateTime property */
    private OffsetDateTime _nextRunDateTime;
    /** The runs property */
    private java.util.List<SimulationAutomationRun> _runs;
    /** The status property */
    private SimulationAutomationStatus _status;
    /**
     * Instantiates a new simulationAutomation and sets the default values.
     * @return a void
     */
    public SimulationAutomation() {
        super();
        this.setOdataType("#microsoft.graph.simulationAutomation");
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
        final SimulationAutomation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastRunDateTime", (n) -> { currentObject.setLastRunDateTime(n.getOffsetDateTimeValue()); });
            this.put("nextRunDateTime", (n) -> { currentObject.setNextRunDateTime(n.getOffsetDateTimeValue()); });
            this.put("runs", (n) -> { currentObject.setRuns(n.getCollectionOfObjectValues(SimulationAutomationRun::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(SimulationAutomationStatus.class)); });
        }};
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
     * Gets the lastRunDateTime property value. The lastRunDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRunDateTime() {
        return this._lastRunDateTime;
    }
    /**
     * Gets the nextRunDateTime property value. The nextRunDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getNextRunDateTime() {
        return this._nextRunDateTime;
    }
    /**
     * Gets the runs property value. The runs property
     * @return a simulationAutomationRun
     */
    @javax.annotation.Nullable
    public java.util.List<SimulationAutomationRun> getRuns() {
        return this._runs;
    }
    /**
     * Gets the status property value. The status property
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
     * Sets the lastRunDateTime property value. The lastRunDateTime property
     * @param value Value to set for the lastRunDateTime property.
     * @return a void
     */
    public void setLastRunDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRunDateTime = value;
    }
    /**
     * Sets the nextRunDateTime property value. The nextRunDateTime property
     * @param value Value to set for the nextRunDateTime property.
     * @return a void
     */
    public void setNextRunDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._nextRunDateTime = value;
    }
    /**
     * Sets the runs property value. The runs property
     * @param value Value to set for the runs property.
     * @return a void
     */
    public void setRuns(@javax.annotation.Nullable final java.util.List<SimulationAutomationRun> value) {
        this._runs = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final SimulationAutomationStatus value) {
        this._status = value;
    }
}
