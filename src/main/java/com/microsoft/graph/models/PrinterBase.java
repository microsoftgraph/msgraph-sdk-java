package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrinterBase extends Entity implements Parsable {
    /**
     * Instantiates a new PrinterBase and sets the default values.
     */
    public PrinterBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrinterBase
     */
    @jakarta.annotation.Nonnull
    public static PrinterBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.printer": return new Printer();
                case "#microsoft.graph.printerShare": return new PrinterShare();
            }
        }
        return new PrinterBase();
    }
    /**
     * Gets the capabilities property value. The capabilities of the printer/printerShare.
     * @return a PrinterCapabilities
     */
    @jakarta.annotation.Nullable
    public PrinterCapabilities getCapabilities() {
        return this.backingStore.get("capabilities");
    }
    /**
     * Gets the defaults property value. The default print settings of printer/printerShare.
     * @return a PrinterDefaults
     */
    @jakarta.annotation.Nullable
    public PrinterDefaults getDefaults() {
        return this.backingStore.get("defaults");
    }
    /**
     * Gets the displayName property value. The name of the printer/printerShare.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getObjectValue(PrinterCapabilities::createFromDiscriminatorValue)); });
        deserializerMap.put("defaults", (n) -> { this.setDefaults(n.getObjectValue(PrinterDefaults::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isAcceptingJobs", (n) -> { this.setIsAcceptingJobs(n.getBooleanValue()); });
        deserializerMap.put("jobs", (n) -> { this.setJobs(n.getCollectionOfObjectValues(PrintJob::createFromDiscriminatorValue)); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(PrinterLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(PrinterStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isAcceptingJobs property value. Specifies whether the printer/printerShare is currently accepting new print jobs.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAcceptingJobs() {
        return this.backingStore.get("isAcceptingJobs");
    }
    /**
     * Gets the jobs property value. The list of jobs that are queued for printing by the printer/printerShare.
     * @return a java.util.List<PrintJob>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintJob> getJobs() {
        return this.backingStore.get("jobs");
    }
    /**
     * Gets the location property value. The physical and/or organizational location of the printer/printerShare.
     * @return a PrinterLocation
     */
    @jakarta.annotation.Nullable
    public PrinterLocation getLocation() {
        return this.backingStore.get("location");
    }
    /**
     * Gets the manufacturer property value. The manufacturer of the printer/printerShare.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. The model name of the printer/printerShare.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the status property value. The status property
     * @return a PrinterStatus
     */
    @jakarta.annotation.Nullable
    public PrinterStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("capabilities", this.getCapabilities());
        writer.writeObjectValue("defaults", this.getDefaults());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isAcceptingJobs", this.getIsAcceptingJobs());
        writer.writeCollectionOfObjectValues("jobs", this.getJobs());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeObjectValue("status", this.getStatus());
    }
    /**
     * Sets the capabilities property value. The capabilities of the printer/printerShare.
     * @param value Value to set for the capabilities property.
     */
    public void setCapabilities(@jakarta.annotation.Nullable final PrinterCapabilities value) {
        this.backingStore.set("capabilities", value);
    }
    /**
     * Sets the defaults property value. The default print settings of printer/printerShare.
     * @param value Value to set for the defaults property.
     */
    public void setDefaults(@jakarta.annotation.Nullable final PrinterDefaults value) {
        this.backingStore.set("defaults", value);
    }
    /**
     * Sets the displayName property value. The name of the printer/printerShare.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isAcceptingJobs property value. Specifies whether the printer/printerShare is currently accepting new print jobs.
     * @param value Value to set for the isAcceptingJobs property.
     */
    public void setIsAcceptingJobs(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAcceptingJobs", value);
    }
    /**
     * Sets the jobs property value. The list of jobs that are queued for printing by the printer/printerShare.
     * @param value Value to set for the jobs property.
     */
    public void setJobs(@jakarta.annotation.Nullable final java.util.List<PrintJob> value) {
        this.backingStore.set("jobs", value);
    }
    /**
     * Sets the location property value. The physical and/or organizational location of the printer/printerShare.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final PrinterLocation value) {
        this.backingStore.set("location", value);
    }
    /**
     * Sets the manufacturer property value. The manufacturer of the printer/printerShare.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. The model name of the printer/printerShare.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PrinterStatus value) {
        this.backingStore.set("status", value);
    }
}
