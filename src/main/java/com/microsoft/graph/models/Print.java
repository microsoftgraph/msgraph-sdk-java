package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Print implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The list of available print connectors. */
    private java.util.List<PrintConnector> _connectors;
    /** The OdataType property */
    private String _odataType;
    /** The list of print long running operations. */
    private java.util.List<PrintOperation> _operations;
    /** The list of printers registered in the tenant. */
    private java.util.List<Printer> _printers;
    /** The list of available Universal Print service endpoints. */
    private java.util.List<PrintService> _services;
    /** Tenant-wide settings for the Universal Print service. */
    private PrintSettings _settings;
    /** The list of printer shares registered in the tenant. */
    private java.util.List<PrinterShare> _shares;
    /** List of abstract definition for a task that can be triggered when various events occur within Universal Print. */
    private java.util.List<PrintTaskDefinition> _taskDefinitions;
    /**
     * Instantiates a new Print and sets the default values.
     * @return a void
     */
    public Print() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.print");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Print
     */
    @javax.annotation.Nonnull
    public static Print createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Print();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the connectors property value. The list of available print connectors.
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
        final Print currentObject = this;
        return new HashMap<>(8) {{
            this.put("connectors", (n) -> { currentObject.setConnectors(n.getCollectionOfObjectValues(PrintConnector::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfObjectValues(PrintOperation::createFromDiscriminatorValue)); });
            this.put("printers", (n) -> { currentObject.setPrinters(n.getCollectionOfObjectValues(Printer::createFromDiscriminatorValue)); });
            this.put("services", (n) -> { currentObject.setServices(n.getCollectionOfObjectValues(PrintService::createFromDiscriminatorValue)); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(PrintSettings::createFromDiscriminatorValue)); });
            this.put("shares", (n) -> { currentObject.setShares(n.getCollectionOfObjectValues(PrinterShare::createFromDiscriminatorValue)); });
            this.put("taskDefinitions", (n) -> { currentObject.setTaskDefinitions(n.getCollectionOfObjectValues(PrintTaskDefinition::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the operations property value. The list of print long running operations.
     * @return a printOperation
     */
    @javax.annotation.Nullable
    public java.util.List<PrintOperation> getOperations() {
        return this._operations;
    }
    /**
     * Gets the printers property value. The list of printers registered in the tenant.
     * @return a printer
     */
    @javax.annotation.Nullable
    public java.util.List<Printer> getPrinters() {
        return this._printers;
    }
    /**
     * Gets the services property value. The list of available Universal Print service endpoints.
     * @return a printService
     */
    @javax.annotation.Nullable
    public java.util.List<PrintService> getServices() {
        return this._services;
    }
    /**
     * Gets the settings property value. Tenant-wide settings for the Universal Print service.
     * @return a printSettings
     */
    @javax.annotation.Nullable
    public PrintSettings getSettings() {
        return this._settings;
    }
    /**
     * Gets the shares property value. The list of printer shares registered in the tenant.
     * @return a printerShare
     */
    @javax.annotation.Nullable
    public java.util.List<PrinterShare> getShares() {
        return this._shares;
    }
    /**
     * Gets the taskDefinitions property value. List of abstract definition for a task that can be triggered when various events occur within Universal Print.
     * @return a printTaskDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<PrintTaskDefinition> getTaskDefinitions() {
        return this._taskDefinitions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("connectors", this.getConnectors());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("printers", this.getPrinters());
        writer.writeCollectionOfObjectValues("services", this.getServices());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeCollectionOfObjectValues("shares", this.getShares());
        writer.writeCollectionOfObjectValues("taskDefinitions", this.getTaskDefinitions());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the connectors property value. The list of available print connectors.
     * @param value Value to set for the connectors property.
     * @return a void
     */
    public void setConnectors(@javax.annotation.Nullable final java.util.List<PrintConnector> value) {
        this._connectors = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the operations property value. The list of print long running operations.
     * @param value Value to set for the operations property.
     * @return a void
     */
    public void setOperations(@javax.annotation.Nullable final java.util.List<PrintOperation> value) {
        this._operations = value;
    }
    /**
     * Sets the printers property value. The list of printers registered in the tenant.
     * @param value Value to set for the printers property.
     * @return a void
     */
    public void setPrinters(@javax.annotation.Nullable final java.util.List<Printer> value) {
        this._printers = value;
    }
    /**
     * Sets the services property value. The list of available Universal Print service endpoints.
     * @param value Value to set for the services property.
     * @return a void
     */
    public void setServices(@javax.annotation.Nullable final java.util.List<PrintService> value) {
        this._services = value;
    }
    /**
     * Sets the settings property value. Tenant-wide settings for the Universal Print service.
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final PrintSettings value) {
        this._settings = value;
    }
    /**
     * Sets the shares property value. The list of printer shares registered in the tenant.
     * @param value Value to set for the shares property.
     * @return a void
     */
    public void setShares(@javax.annotation.Nullable final java.util.List<PrinterShare> value) {
        this._shares = value;
    }
    /**
     * Sets the taskDefinitions property value. List of abstract definition for a task that can be triggered when various events occur within Universal Print.
     * @param value Value to set for the taskDefinitions property.
     * @return a void
     */
    public void setTaskDefinitions(@javax.annotation.Nullable final java.util.List<PrintTaskDefinition> value) {
        this._taskDefinitions = value;
    }
}
