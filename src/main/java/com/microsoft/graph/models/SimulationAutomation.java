package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SimulationAutomation extends Entity implements Parsable {
    /**
     * Identity of the user who created the attack simulation automation.
     */
    private EmailIdentity createdBy;
    /**
     * Date and time when the attack simulation automation was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Description of the attack simulation automation.
     */
    private String description;
    /**
     * Display name of the attack simulation automation. Supports $filter and $orderby.
     */
    private String displayName;
    /**
     * Identity of the user who most recently modified the attack simulation automation.
     */
    private EmailIdentity lastModifiedBy;
    /**
     * Date and time when the attack simulation automation was most recently modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Date and time of the latest run of the attack simulation automation.
     */
    private OffsetDateTime lastRunDateTime;
    /**
     * Date and time of the upcoming run of the attack simulation automation.
     */
    private OffsetDateTime nextRunDateTime;
    /**
     * A collection of simulation automation runs.
     */
    private java.util.List<SimulationAutomationRun> runs;
    /**
     * Status of the attack simulation automation. Supports $filter and $orderby. The possible values are: unknown, draft, notRunning, running, completed, unknownFutureValue.
     */
    private SimulationAutomationStatus status;
    /**
     * Instantiates a new simulationAutomation and sets the default values.
     */
    public SimulationAutomation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a simulationAutomation
     */
    @jakarta.annotation.Nonnull
    public static SimulationAutomation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimulationAutomation();
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the attack simulation automation.
     * @return a emailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. Date and time when the attack simulation automation was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Description of the attack simulation automation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name of the attack simulation automation. Supports $filter and $orderby.
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
    @jakarta.annotation.Nullable
    public EmailIdentity getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time when the attack simulation automation was most recently modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the lastRunDateTime property value. Date and time of the latest run of the attack simulation automation.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRunDateTime() {
        return this.lastRunDateTime;
    }
    /**
     * Gets the nextRunDateTime property value. Date and time of the upcoming run of the attack simulation automation.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextRunDateTime() {
        return this.nextRunDateTime;
    }
    /**
     * Gets the runs property value. A collection of simulation automation runs.
     * @return a simulationAutomationRun
     */
    @jakarta.annotation.Nullable
    public java.util.List<SimulationAutomationRun> getRuns() {
        return this.runs;
    }
    /**
     * Gets the status property value. Status of the attack simulation automation. Supports $filter and $orderby. The possible values are: unknown, draft, notRunning, running, completed, unknownFutureValue.
     * @return a simulationAutomationStatus
     */
    @jakarta.annotation.Nullable
    public SimulationAutomationStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time when the attack simulation automation was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the attack simulation automation.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name of the attack simulation automation. Supports $filter and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who most recently modified the attack simulation automation.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time when the attack simulation automation was most recently modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the lastRunDateTime property value. Date and time of the latest run of the attack simulation automation.
     * @param value Value to set for the lastRunDateTime property.
     */
    public void setLastRunDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastRunDateTime = value;
    }
    /**
     * Sets the nextRunDateTime property value. Date and time of the upcoming run of the attack simulation automation.
     * @param value Value to set for the nextRunDateTime property.
     */
    public void setNextRunDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.nextRunDateTime = value;
    }
    /**
     * Sets the runs property value. A collection of simulation automation runs.
     * @param value Value to set for the runs property.
     */
    public void setRuns(@jakarta.annotation.Nullable final java.util.List<SimulationAutomationRun> value) {
        this.runs = value;
    }
    /**
     * Sets the status property value. Status of the attack simulation automation. Supports $filter and $orderby. The possible values are: unknown, draft, notRunning, running, completed, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SimulationAutomationStatus value) {
        this.status = value;
    }
}
