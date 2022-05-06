package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Printer extends PrinterBase implements Parsable {
    /** The connectors that are associated with the printer.  */
    private java.util.List<PrintConnector> _connectors;
    /** True if the printer has a physical device for printing. Read-only.  */
    private Boolean _hasPhysicalDevice;
    /** True if the printer is shared; false otherwise. Read-only.  */
    private Boolean _isShared;
    /** The most recent dateTimeOffset when a printer interacted with Universal Print. Read-only.  */
    private OffsetDateTime _lastSeenDateTime;
    /** The DateTimeOffset when the printer was registered. Read-only.  */
    private OffsetDateTime _registeredDateTime;
    /** The list of printerShares that are associated with the printer. Currently, only one printerShare can be associated with the printer. Read-only. Nullable.  */
    private java.util.List<PrinterShare> _shares;
    /** A list of task triggers that are associated with the printer.  */
    private java.util.List<PrintTaskTrigger> _taskTriggers;
    /**
     * Instantiates a new printer and sets the default values.
     * @return a void
     */
    public Printer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printer
     */
    @javax.annotation.Nonnull
    public static Printer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Printer();
    }
    /**
     * Gets the connectors property value. The connectors that are associated with the printer.
     * @return a printConnector
     */
    @javax.annotation.Nullable
    public java.util.List<PrintConnector> getConnectors() {
        return this._connectors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Printer currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("connectors", (n) -> { currentObject.setConnectors(n.getCollectionOfObjectValues(PrintConnector::createFromDiscriminatorValue)); });
            this.put("hasPhysicalDevice", (n) -> { currentObject.setHasPhysicalDevice(n.getBooleanValue()); });
            this.put("isShared", (n) -> { currentObject.setIsShared(n.getBooleanValue()); });
            this.put("lastSeenDateTime", (n) -> { currentObject.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
            this.put("registeredDateTime", (n) -> { currentObject.setRegisteredDateTime(n.getOffsetDateTimeValue()); });
            this.put("shares", (n) -> { currentObject.setShares(n.getCollectionOfObjectValues(PrinterShare::createFromDiscriminatorValue)); });
            this.put("taskTriggers", (n) -> { currentObject.setTaskTriggers(n.getCollectionOfObjectValues(PrintTaskTrigger::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the hasPhysicalDevice property value. True if the printer has a physical device for printing. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasPhysicalDevice() {
        return this._hasPhysicalDevice;
    }
    /**
     * Gets the isShared property value. True if the printer is shared; false otherwise. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsShared() {
        return this._isShared;
    }
    /**
     * Gets the lastSeenDateTime property value. The most recent dateTimeOffset when a printer interacted with Universal Print. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this._lastSeenDateTime;
    }
    /**
     * Gets the registeredDateTime property value. The DateTimeOffset when the printer was registered. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRegisteredDateTime() {
        return this._registeredDateTime;
    }
    /**
     * Gets the shares property value. The list of printerShares that are associated with the printer. Currently, only one printerShare can be associated with the printer. Read-only. Nullable.
     * @return a printerShare
     */
    @javax.annotation.Nullable
    public java.util.List<PrinterShare> getShares() {
        return this._shares;
    }
    /**
     * Gets the taskTriggers property value. A list of task triggers that are associated with the printer.
     * @return a printTaskTrigger
     */
    @javax.annotation.Nullable
    public java.util.List<PrintTaskTrigger> getTaskTriggers() {
        return this._taskTriggers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("connectors", this.getConnectors());
        writer.writeBooleanValue("hasPhysicalDevice", this.getHasPhysicalDevice());
        writer.writeBooleanValue("isShared", this.getIsShared());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeOffsetDateTimeValue("registeredDateTime", this.getRegisteredDateTime());
        writer.writeCollectionOfObjectValues("shares", this.getShares());
        writer.writeCollectionOfObjectValues("taskTriggers", this.getTaskTriggers());
    }
    /**
     * Sets the connectors property value. The connectors that are associated with the printer.
     * @param value Value to set for the connectors property.
     * @return a void
     */
    public void setConnectors(@javax.annotation.Nullable final java.util.List<PrintConnector> value) {
        this._connectors = value;
    }
    /**
     * Sets the hasPhysicalDevice property value. True if the printer has a physical device for printing. Read-only.
     * @param value Value to set for the hasPhysicalDevice property.
     * @return a void
     */
    public void setHasPhysicalDevice(@javax.annotation.Nullable final Boolean value) {
        this._hasPhysicalDevice = value;
    }
    /**
     * Sets the isShared property value. True if the printer is shared; false otherwise. Read-only.
     * @param value Value to set for the isShared property.
     * @return a void
     */
    public void setIsShared(@javax.annotation.Nullable final Boolean value) {
        this._isShared = value;
    }
    /**
     * Sets the lastSeenDateTime property value. The most recent dateTimeOffset when a printer interacted with Universal Print. Read-only.
     * @param value Value to set for the lastSeenDateTime property.
     * @return a void
     */
    public void setLastSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSeenDateTime = value;
    }
    /**
     * Sets the registeredDateTime property value. The DateTimeOffset when the printer was registered. Read-only.
     * @param value Value to set for the registeredDateTime property.
     * @return a void
     */
    public void setRegisteredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._registeredDateTime = value;
    }
    /**
     * Sets the shares property value. The list of printerShares that are associated with the printer. Currently, only one printerShare can be associated with the printer. Read-only. Nullable.
     * @param value Value to set for the shares property.
     * @return a void
     */
    public void setShares(@javax.annotation.Nullable final java.util.List<PrinterShare> value) {
        this._shares = value;
    }
    /**
     * Sets the taskTriggers property value. A list of task triggers that are associated with the printer.
     * @param value Value to set for the taskTriggers property.
     * @return a void
     */
    public void setTaskTriggers(@javax.annotation.Nullable final java.util.List<PrintTaskTrigger> value) {
        this._taskTriggers = value;
    }
}
