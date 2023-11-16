package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Printer extends PrinterBase implements Parsable {
    /**
     * Instantiates a new Printer and sets the default values.
     */
    public Printer() {
        super();
        this.setOdataType("#microsoft.graph.printer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Printer
     */
    @jakarta.annotation.Nonnull
    public static Printer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Printer();
    }
    /**
     * Gets the connectors property value. The connectors that are associated with the printer.
     * @return a java.util.List<PrintConnector>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintConnector> getConnectors() {
        return this.backingStore.get("connectors");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectors", (n) -> { this.setConnectors(n.getCollectionOfObjectValues(PrintConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("hasPhysicalDevice", (n) -> { this.setHasPhysicalDevice(n.getBooleanValue()); });
        deserializerMap.put("isShared", (n) -> { this.setIsShared(n.getBooleanValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("registeredDateTime", (n) -> { this.setRegisteredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("shares", (n) -> { this.setShares(n.getCollectionOfObjectValues(PrinterShare::createFromDiscriminatorValue)); });
        deserializerMap.put("taskTriggers", (n) -> { this.setTaskTriggers(n.getCollectionOfObjectValues(PrintTaskTrigger::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hasPhysicalDevice property value. True if the printer has a physical device for printing. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasPhysicalDevice() {
        return this.backingStore.get("hasPhysicalDevice");
    }
    /**
     * Gets the isShared property value. True if the printer is shared; false otherwise. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsShared() {
        return this.backingStore.get("isShared");
    }
    /**
     * Gets the lastSeenDateTime property value. The most recent dateTimeOffset when a printer interacted with Universal Print. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.backingStore.get("lastSeenDateTime");
    }
    /**
     * Gets the registeredDateTime property value. The DateTimeOffset when the printer was registered. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRegisteredDateTime() {
        return this.backingStore.get("registeredDateTime");
    }
    /**
     * Gets the shares property value. The list of printerShares that are associated with the printer. Currently, only one printerShare can be associated with the printer. Read-only. Nullable.
     * @return a java.util.List<PrinterShare>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrinterShare> getShares() {
        return this.backingStore.get("shares");
    }
    /**
     * Gets the taskTriggers property value. A list of task triggers that are associated with the printer.
     * @return a java.util.List<PrintTaskTrigger>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintTaskTrigger> getTaskTriggers() {
        return this.backingStore.get("taskTriggers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setConnectors(@jakarta.annotation.Nullable final java.util.List<PrintConnector> value) {
        this.backingStore.set("connectors", value);
    }
    /**
     * Sets the hasPhysicalDevice property value. True if the printer has a physical device for printing. Read-only.
     * @param value Value to set for the hasPhysicalDevice property.
     */
    public void setHasPhysicalDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasPhysicalDevice", value);
    }
    /**
     * Sets the isShared property value. True if the printer is shared; false otherwise. Read-only.
     * @param value Value to set for the isShared property.
     */
    public void setIsShared(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isShared", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The most recent dateTimeOffset when a printer interacted with Universal Print. Read-only.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSeenDateTime", value);
    }
    /**
     * Sets the registeredDateTime property value. The DateTimeOffset when the printer was registered. Read-only.
     * @param value Value to set for the registeredDateTime property.
     */
    public void setRegisteredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("registeredDateTime", value);
    }
    /**
     * Sets the shares property value. The list of printerShares that are associated with the printer. Currently, only one printerShare can be associated with the printer. Read-only. Nullable.
     * @param value Value to set for the shares property.
     */
    public void setShares(@jakarta.annotation.Nullable final java.util.List<PrinterShare> value) {
        this.backingStore.set("shares", value);
    }
    /**
     * Sets the taskTriggers property value. A list of task triggers that are associated with the printer.
     * @param value Value to set for the taskTriggers property.
     */
    public void setTaskTriggers(@jakarta.annotation.Nullable final java.util.List<PrintTaskTrigger> value) {
        this.backingStore.set("taskTriggers", value);
    }
}
