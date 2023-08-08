package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ReportRoot implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Container for navigation properties for Azure AD authentication methods resources.
     */
    private AuthenticationMethodsRoot authenticationMethods;
    /**
     * Retrieve a list of daily print usage summaries, grouped by printer.
     */
    private java.util.List<PrintUsageByPrinter> dailyPrintUsageByPrinter;
    /**
     * Retrieve a list of daily print usage summaries, grouped by user.
     */
    private java.util.List<PrintUsageByUser> dailyPrintUsageByUser;
    /**
     * Retrieve a list of monthly print usage summaries, grouped by printer.
     */
    private java.util.List<PrintUsageByPrinter> monthlyPrintUsageByPrinter;
    /**
     * Retrieve a list of monthly print usage summaries, grouped by user.
     */
    private java.util.List<PrintUsageByUser> monthlyPrintUsageByUser;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Represents an abstract type that contains resources for attack simulation and training reports.
     */
    private SecurityReportsRoot security;
    /**
     * Instantiates a new reportRoot and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ReportRoot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a reportRoot
     */
    @jakarta.annotation.Nonnull
    public static ReportRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportRoot();
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
     * Gets the authenticationMethods property value. Container for navigation properties for Azure AD authentication methods resources.
     * @return a authenticationMethodsRoot
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodsRoot getAuthenticationMethods() {
        return this.authenticationMethods;
    }
    /**
     * Gets the dailyPrintUsageByPrinter property value. Retrieve a list of daily print usage summaries, grouped by printer.
     * @return a printUsageByPrinter
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getDailyPrintUsageByPrinter() {
        return this.dailyPrintUsageByPrinter;
    }
    /**
     * Gets the dailyPrintUsageByUser property value. Retrieve a list of daily print usage summaries, grouped by user.
     * @return a printUsageByUser
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByUser> getDailyPrintUsageByUser() {
        return this.dailyPrintUsageByUser;
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
     * @return a printUsageByPrinter
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getMonthlyPrintUsageByPrinter() {
        return this.monthlyPrintUsageByPrinter;
    }
    /**
     * Gets the monthlyPrintUsageByUser property value. Retrieve a list of monthly print usage summaries, grouped by user.
     * @return a printUsageByUser
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByUser> getMonthlyPrintUsageByUser() {
        return this.monthlyPrintUsageByUser;
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
     * Gets the security property value. Represents an abstract type that contains resources for attack simulation and training reports.
     * @return a securityReportsRoot
     */
    @jakarta.annotation.Nullable
    public SecurityReportsRoot getSecurity() {
        return this.security;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the authenticationMethods property value. Container for navigation properties for Azure AD authentication methods resources.
     * @param value Value to set for the authenticationMethods property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAuthenticationMethods(@jakarta.annotation.Nullable final AuthenticationMethodsRoot value) {
        this.authenticationMethods = value;
    }
    /**
     * Sets the dailyPrintUsageByPrinter property value. Retrieve a list of daily print usage summaries, grouped by printer.
     * @param value Value to set for the dailyPrintUsageByPrinter property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDailyPrintUsageByPrinter(@jakarta.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this.dailyPrintUsageByPrinter = value;
    }
    /**
     * Sets the dailyPrintUsageByUser property value. Retrieve a list of daily print usage summaries, grouped by user.
     * @param value Value to set for the dailyPrintUsageByUser property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDailyPrintUsageByUser(@jakarta.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this.dailyPrintUsageByUser = value;
    }
    /**
     * Sets the monthlyPrintUsageByPrinter property value. Retrieve a list of monthly print usage summaries, grouped by printer.
     * @param value Value to set for the monthlyPrintUsageByPrinter property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMonthlyPrintUsageByPrinter(@jakarta.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this.monthlyPrintUsageByPrinter = value;
    }
    /**
     * Sets the monthlyPrintUsageByUser property value. Retrieve a list of monthly print usage summaries, grouped by user.
     * @param value Value to set for the monthlyPrintUsageByUser property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMonthlyPrintUsageByUser(@jakarta.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this.monthlyPrintUsageByUser = value;
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
     * Sets the security property value. Represents an abstract type that contains resources for attack simulation and training reports.
     * @param value Value to set for the security property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSecurity(@jakarta.annotation.Nullable final SecurityReportsRoot value) {
        this.security = value;
    }
}
