package com.microsoft.graph.models;

import com.microsoft.graph.models.Printer;
import com.microsoft.graph.models.PrinterShare;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrinterBase extends Entity implements Parsable {
    /** The capabilities of the printer/printerShare. */
    private PrinterCapabilities _capabilities;
    /** The default print settings of printer/printerShare. */
    private PrinterDefaults _defaults;
    /** The name of the printer/printerShare. */
    private String _displayName;
    /** Whether the printer/printerShare is currently accepting new print jobs. */
    private Boolean _isAcceptingJobs;
    /** The list of jobs that are queued for printing by the printer/printerShare. */
    private java.util.List<PrintJob> _jobs;
    /** The physical and/or organizational location of the printer/printerShare. */
    private PrinterLocation _location;
    /** The manufacturer of the printer/printerShare. */
    private String _manufacturer;
    /** The model name of the printer/printerShare. */
    private String _model;
    /** The status property */
    private PrinterStatus _status;
    /**
     * Instantiates a new printerBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrinterBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printerBase
     */
    @javax.annotation.Nonnull
    public static PrinterBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a printerCapabilities
     */
    @javax.annotation.Nullable
    public PrinterCapabilities getCapabilities() {
        return this._capabilities;
    }
    /**
     * Gets the defaults property value. The default print settings of printer/printerShare.
     * @return a printerDefaults
     */
    @javax.annotation.Nullable
    public PrinterDefaults getDefaults() {
        return this._defaults;
    }
    /**
     * Gets the displayName property value. The name of the printer/printerShare.
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
        final PrinterBase currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("capabilities", (n) -> { currentObject.setCapabilities(n.getObjectValue(PrinterCapabilities::createFromDiscriminatorValue)); });
            this.put("defaults", (n) -> { currentObject.setDefaults(n.getObjectValue(PrinterDefaults::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isAcceptingJobs", (n) -> { currentObject.setIsAcceptingJobs(n.getBooleanValue()); });
            this.put("jobs", (n) -> { currentObject.setJobs(n.getCollectionOfObjectValues(PrintJob::createFromDiscriminatorValue)); });
            this.put("location", (n) -> { currentObject.setLocation(n.getObjectValue(PrinterLocation::createFromDiscriminatorValue)); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getObjectValue(PrinterStatus::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isAcceptingJobs property value. Whether the printer/printerShare is currently accepting new print jobs.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAcceptingJobs() {
        return this._isAcceptingJobs;
    }
    /**
     * Gets the jobs property value. The list of jobs that are queued for printing by the printer/printerShare.
     * @return a printJob
     */
    @javax.annotation.Nullable
    public java.util.List<PrintJob> getJobs() {
        return this._jobs;
    }
    /**
     * Gets the location property value. The physical and/or organizational location of the printer/printerShare.
     * @return a printerLocation
     */
    @javax.annotation.Nullable
    public PrinterLocation getLocation() {
        return this._location;
    }
    /**
     * Gets the manufacturer property value. The manufacturer of the printer/printerShare.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the model property value. The model name of the printer/printerShare.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the status property value. The status property
     * @return a printerStatus
     */
    @javax.annotation.Nullable
    public PrinterStatus getStatus() {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCapabilities(@javax.annotation.Nullable final PrinterCapabilities value) {
        this._capabilities = value;
    }
    /**
     * Sets the defaults property value. The default print settings of printer/printerShare.
     * @param value Value to set for the defaults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaults(@javax.annotation.Nullable final PrinterDefaults value) {
        this._defaults = value;
    }
    /**
     * Sets the displayName property value. The name of the printer/printerShare.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isAcceptingJobs property value. Whether the printer/printerShare is currently accepting new print jobs.
     * @param value Value to set for the isAcceptingJobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAcceptingJobs(@javax.annotation.Nullable final Boolean value) {
        this._isAcceptingJobs = value;
    }
    /**
     * Sets the jobs property value. The list of jobs that are queued for printing by the printer/printerShare.
     * @param value Value to set for the jobs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobs(@javax.annotation.Nullable final java.util.List<PrintJob> value) {
        this._jobs = value;
    }
    /**
     * Sets the location property value. The physical and/or organizational location of the printer/printerShare.
     * @param value Value to set for the location property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocation(@javax.annotation.Nullable final PrinterLocation value) {
        this._location = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer of the printer/printerShare.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the model property value. The model name of the printer/printerShare.
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final PrinterStatus value) {
        this._status = value;
    }
}
