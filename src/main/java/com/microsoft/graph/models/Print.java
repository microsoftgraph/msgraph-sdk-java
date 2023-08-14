package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Print implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The list of available print connectors.
     */
    private java.util.List<PrintConnector> connectors;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The list of print long running operations.
     */
    private java.util.List<PrintOperation> operations;
    /**
     * The list of printers registered in the tenant.
     */
    private java.util.List<Printer> printers;
    /**
     * The list of available Universal Print service endpoints.
     */
    private java.util.List<PrintService> services;
    /**
     * Tenant-wide settings for the Universal Print service.
     */
    private PrintSettings settings;
    /**
     * The list of printer shares registered in the tenant.
     */
    private java.util.List<PrinterShare> shares;
    /**
     * List of abstract definition for a task that can be triggered when various events occur within Universal Print.
     */
    private java.util.List<PrintTaskDefinition> taskDefinitions;
    /**
     * Instantiates a new print and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Print() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a print
     */
    @jakarta.annotation.Nonnull
    public static Print createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Print();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the connectors property value. The list of available print connectors.
     * @return a printConnector
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintConnector> getConnectors() {
        return this.connectors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("connectors", (n) -> { this.setConnectors(n.getCollectionOfObjectValues(PrintConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(PrintOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("printers", (n) -> { this.setPrinters(n.getCollectionOfObjectValues(Printer::createFromDiscriminatorValue)); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(PrintService::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(PrintSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("shares", (n) -> { this.setShares(n.getCollectionOfObjectValues(PrinterShare::createFromDiscriminatorValue)); });
        deserializerMap.put("taskDefinitions", (n) -> { this.setTaskDefinitions(n.getCollectionOfObjectValues(PrintTaskDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the operations property value. The list of print long running operations.
     * @return a printOperation
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the printers property value. The list of printers registered in the tenant.
     * @return a printer
     */
    @jakarta.annotation.Nullable
    public java.util.List<Printer> getPrinters() {
        return this.printers;
    }
    /**
     * Gets the services property value. The list of available Universal Print service endpoints.
     * @return a printService
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintService> getServices() {
        return this.services;
    }
    /**
     * Gets the settings property value. Tenant-wide settings for the Universal Print service.
     * @return a printSettings
     */
    @jakarta.annotation.Nullable
    public PrintSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the shares property value. The list of printer shares registered in the tenant.
     * @return a printerShare
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrinterShare> getShares() {
        return this.shares;
    }
    /**
     * Gets the taskDefinitions property value. List of abstract definition for a task that can be triggered when various events occur within Universal Print.
     * @return a printTaskDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintTaskDefinition> getTaskDefinitions() {
        return this.taskDefinitions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the connectors property value. The list of available print connectors.
     * @param value Value to set for the connectors property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConnectors(@jakarta.annotation.Nullable final java.util.List<PrintConnector> value) {
        this.connectors = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the operations property value. The list of print long running operations.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<PrintOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the printers property value. The list of printers registered in the tenant.
     * @param value Value to set for the printers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrinters(@jakarta.annotation.Nullable final java.util.List<Printer> value) {
        this.printers = value;
    }
    /**
     * Sets the services property value. The list of available Universal Print service endpoints.
     * @param value Value to set for the services property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setServices(@jakarta.annotation.Nullable final java.util.List<PrintService> value) {
        this.services = value;
    }
    /**
     * Sets the settings property value. Tenant-wide settings for the Universal Print service.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSettings(@jakarta.annotation.Nullable final PrintSettings value) {
        this.settings = value;
    }
    /**
     * Sets the shares property value. The list of printer shares registered in the tenant.
     * @param value Value to set for the shares property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setShares(@jakarta.annotation.Nullable final java.util.List<PrinterShare> value) {
        this.shares = value;
    }
    /**
     * Sets the taskDefinitions property value. List of abstract definition for a task that can be triggered when various events occur within Universal Print.
     * @param value Value to set for the taskDefinitions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTaskDefinitions(@jakarta.annotation.Nullable final java.util.List<PrintTaskDefinition> value) {
        this.taskDefinitions = value;
    }
}
