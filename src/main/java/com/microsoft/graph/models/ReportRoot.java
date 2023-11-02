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
public class ReportRoot implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ReportRoot and sets the default values.
     */
    public ReportRoot() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ReportRoot
     */
    @jakarta.annotation.Nonnull
    public static ReportRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportRoot();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the authenticationMethods property value. Container for navigation properties for Microsoft Entra authentication methods resources.
     * @return a AuthenticationMethodsRoot
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodsRoot getAuthenticationMethods() {
        return this.getBackingStore().get("authenticationMethods");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the dailyPrintUsageByPrinter property value. Retrieve a list of daily print usage summaries, grouped by printer.
     * @return a java.util.List<PrintUsageByPrinter>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getDailyPrintUsageByPrinter() {
        return this.getBackingStore().get("dailyPrintUsageByPrinter");
    }
    /**
     * Gets the dailyPrintUsageByUser property value. Retrieve a list of daily print usage summaries, grouped by user.
     * @return a java.util.List<PrintUsageByUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByUser> getDailyPrintUsageByUser() {
        return this.getBackingStore().get("dailyPrintUsageByUser");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("authenticationMethods", (n) -> { this.setAuthenticationMethods(n.getObjectValue(AuthenticationMethodsRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("dailyPrintUsageByPrinter", (n) -> { this.setDailyPrintUsageByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
        deserializerMap.put("dailyPrintUsageByUser", (n) -> { this.setDailyPrintUsageByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
        deserializerMap.put("monthlyPrintUsageByPrinter", (n) -> { this.setMonthlyPrintUsageByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
        deserializerMap.put("monthlyPrintUsageByUser", (n) -> { this.setMonthlyPrintUsageByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("security", (n) -> { this.setSecurity(n.getObjectValue(SecurityReportsRoot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the monthlyPrintUsageByPrinter property value. Retrieve a list of monthly print usage summaries, grouped by printer.
     * @return a java.util.List<PrintUsageByPrinter>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getMonthlyPrintUsageByPrinter() {
        return this.getBackingStore().get("monthlyPrintUsageByPrinter");
    }
    /**
     * Gets the monthlyPrintUsageByUser property value. Retrieve a list of monthly print usage summaries, grouped by user.
     * @return a java.util.List<PrintUsageByUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByUser> getMonthlyPrintUsageByUser() {
        return this.getBackingStore().get("monthlyPrintUsageByUser");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the security property value. Represents an abstract type that contains resources for attack simulation and training reports.
     * @return a SecurityReportsRoot
     */
    @jakarta.annotation.Nullable
    public SecurityReportsRoot getSecurity() {
        return this.getBackingStore().get("security");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authenticationMethods", this.getAuthenticationMethods());
        writer.writeCollectionOfObjectValues("dailyPrintUsageByPrinter", this.getDailyPrintUsageByPrinter());
        writer.writeCollectionOfObjectValues("dailyPrintUsageByUser", this.getDailyPrintUsageByUser());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageByPrinter", this.getMonthlyPrintUsageByPrinter());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageByUser", this.getMonthlyPrintUsageByUser());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("security", this.getSecurity());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the authenticationMethods property value. Container for navigation properties for Microsoft Entra authentication methods resources.
     * @param value Value to set for the authenticationMethods property.
     */
    public void setAuthenticationMethods(@jakarta.annotation.Nullable final AuthenticationMethodsRoot value) {
        this.getBackingStore().set("authenticationMethods", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the dailyPrintUsageByPrinter property value. Retrieve a list of daily print usage summaries, grouped by printer.
     * @param value Value to set for the dailyPrintUsageByPrinter property.
     */
    public void setDailyPrintUsageByPrinter(@jakarta.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this.getBackingStore().set("dailyPrintUsageByPrinter", value);
    }
    /**
     * Sets the dailyPrintUsageByUser property value. Retrieve a list of daily print usage summaries, grouped by user.
     * @param value Value to set for the dailyPrintUsageByUser property.
     */
    public void setDailyPrintUsageByUser(@jakarta.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this.getBackingStore().set("dailyPrintUsageByUser", value);
    }
    /**
     * Sets the monthlyPrintUsageByPrinter property value. Retrieve a list of monthly print usage summaries, grouped by printer.
     * @param value Value to set for the monthlyPrintUsageByPrinter property.
     */
    public void setMonthlyPrintUsageByPrinter(@jakarta.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this.getBackingStore().set("monthlyPrintUsageByPrinter", value);
    }
    /**
     * Sets the monthlyPrintUsageByUser property value. Retrieve a list of monthly print usage summaries, grouped by user.
     * @param value Value to set for the monthlyPrintUsageByUser property.
     */
    public void setMonthlyPrintUsageByUser(@jakarta.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this.getBackingStore().set("monthlyPrintUsageByUser", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the security property value. Represents an abstract type that contains resources for attack simulation and training reports.
     * @param value Value to set for the security property.
     */
    public void setSecurity(@jakarta.annotation.Nullable final SecurityReportsRoot value) {
        this.getBackingStore().set("security", value);
    }
}
