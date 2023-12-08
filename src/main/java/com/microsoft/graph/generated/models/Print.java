package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Print implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new Print and sets the default values.
     */
    public Print() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Print
     */
    @jakarta.annotation.Nonnull
    public static Print createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Print();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the connectors property value. The list of available print connectors.
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the operations property value. The list of print long running operations.
     * @return a java.util.List<PrintOperation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Gets the printers property value. The list of printers registered in the tenant.
     * @return a java.util.List<Printer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Printer> getPrinters() {
        return this.backingStore.get("printers");
    }
    /**
     * Gets the services property value. The list of available Universal Print service endpoints.
     * @return a java.util.List<PrintService>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintService> getServices() {
        return this.backingStore.get("services");
    }
    /**
     * Gets the settings property value. Tenant-wide settings for the Universal Print service.
     * @return a PrintSettings
     */
    @jakarta.annotation.Nullable
    public PrintSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the shares property value. The list of printer shares registered in the tenant.
     * @return a java.util.List<PrinterShare>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrinterShare> getShares() {
        return this.backingStore.get("shares");
    }
    /**
     * Gets the taskDefinitions property value. List of abstract definition for a task that can be triggered when various events occur within Universal Print.
     * @return a java.util.List<PrintTaskDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintTaskDefinition> getTaskDefinitions() {
        return this.backingStore.get("taskDefinitions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the connectors property value. The list of available print connectors.
     * @param value Value to set for the connectors property.
     */
    public void setConnectors(@jakarta.annotation.Nullable final java.util.List<PrintConnector> value) {
        this.backingStore.set("connectors", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the operations property value. The list of print long running operations.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<PrintOperation> value) {
        this.backingStore.set("operations", value);
    }
    /**
     * Sets the printers property value. The list of printers registered in the tenant.
     * @param value Value to set for the printers property.
     */
    public void setPrinters(@jakarta.annotation.Nullable final java.util.List<Printer> value) {
        this.backingStore.set("printers", value);
    }
    /**
     * Sets the services property value. The list of available Universal Print service endpoints.
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<PrintService> value) {
        this.backingStore.set("services", value);
    }
    /**
     * Sets the settings property value. Tenant-wide settings for the Universal Print service.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final PrintSettings value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the shares property value. The list of printer shares registered in the tenant.
     * @param value Value to set for the shares property.
     */
    public void setShares(@jakarta.annotation.Nullable final java.util.List<PrinterShare> value) {
        this.backingStore.set("shares", value);
    }
    /**
     * Sets the taskDefinitions property value. List of abstract definition for a task that can be triggered when various events occur within Universal Print.
     * @param value Value to set for the taskDefinitions property.
     */
    public void setTaskDefinitions(@jakarta.annotation.Nullable final java.util.List<PrintTaskDefinition> value) {
        this.backingStore.set("taskDefinitions", value);
    }
}
