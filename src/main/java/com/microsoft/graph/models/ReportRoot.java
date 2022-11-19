package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ReportRoot extends Entity implements Parsable {
    /** The dailyPrintUsageByPrinter property */
    private java.util.List<PrintUsageByPrinter> _dailyPrintUsageByPrinter;
    /** The dailyPrintUsageByUser property */
    private java.util.List<PrintUsageByUser> _dailyPrintUsageByUser;
    /** The monthlyPrintUsageByPrinter property */
    private java.util.List<PrintUsageByPrinter> _monthlyPrintUsageByPrinter;
    /** The monthlyPrintUsageByUser property */
    private java.util.List<PrintUsageByUser> _monthlyPrintUsageByUser;
    /** The security property */
    private SecurityReportsRoot _security;
    /**
     * Instantiates a new ReportRoot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReportRoot() {
        super();
        this.setOdataType("#microsoft.graph.reportRoot");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ReportRoot
     */
    @javax.annotation.Nonnull
    public static ReportRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportRoot();
    }
    /**
     * Gets the dailyPrintUsageByPrinter property value. The dailyPrintUsageByPrinter property
     * @return a printUsageByPrinter
     */
    @javax.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getDailyPrintUsageByPrinter() {
        return this._dailyPrintUsageByPrinter;
    }
    /**
     * Gets the dailyPrintUsageByUser property value. The dailyPrintUsageByUser property
     * @return a printUsageByUser
     */
    @javax.annotation.Nullable
    public java.util.List<PrintUsageByUser> getDailyPrintUsageByUser() {
        return this._dailyPrintUsageByUser;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ReportRoot currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dailyPrintUsageByPrinter", (n) -> { currentObject.setDailyPrintUsageByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
        deserializerMap.put("dailyPrintUsageByUser", (n) -> { currentObject.setDailyPrintUsageByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
        deserializerMap.put("monthlyPrintUsageByPrinter", (n) -> { currentObject.setMonthlyPrintUsageByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
        deserializerMap.put("monthlyPrintUsageByUser", (n) -> { currentObject.setMonthlyPrintUsageByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
        deserializerMap.put("security", (n) -> { currentObject.setSecurity(n.getObjectValue(SecurityReportsRoot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the monthlyPrintUsageByPrinter property value. The monthlyPrintUsageByPrinter property
     * @return a printUsageByPrinter
     */
    @javax.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getMonthlyPrintUsageByPrinter() {
        return this._monthlyPrintUsageByPrinter;
    }
    /**
     * Gets the monthlyPrintUsageByUser property value. The monthlyPrintUsageByUser property
     * @return a printUsageByUser
     */
    @javax.annotation.Nullable
    public java.util.List<PrintUsageByUser> getMonthlyPrintUsageByUser() {
        return this._monthlyPrintUsageByUser;
    }
    /**
     * Gets the security property value. The security property
     * @return a securityReportsRoot
     */
    @javax.annotation.Nullable
    public SecurityReportsRoot getSecurity() {
        return this._security;
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
        writer.writeCollectionOfObjectValues("dailyPrintUsageByPrinter", this.getDailyPrintUsageByPrinter());
        writer.writeCollectionOfObjectValues("dailyPrintUsageByUser", this.getDailyPrintUsageByUser());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageByPrinter", this.getMonthlyPrintUsageByPrinter());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageByUser", this.getMonthlyPrintUsageByUser());
        writer.writeObjectValue("security", this.getSecurity());
    }
    /**
     * Sets the dailyPrintUsageByPrinter property value. The dailyPrintUsageByPrinter property
     * @param value Value to set for the dailyPrintUsageByPrinter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDailyPrintUsageByPrinter(@javax.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this._dailyPrintUsageByPrinter = value;
    }
    /**
     * Sets the dailyPrintUsageByUser property value. The dailyPrintUsageByUser property
     * @param value Value to set for the dailyPrintUsageByUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDailyPrintUsageByUser(@javax.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this._dailyPrintUsageByUser = value;
    }
    /**
     * Sets the monthlyPrintUsageByPrinter property value. The monthlyPrintUsageByPrinter property
     * @param value Value to set for the monthlyPrintUsageByPrinter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMonthlyPrintUsageByPrinter(@javax.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this._monthlyPrintUsageByPrinter = value;
    }
    /**
     * Sets the monthlyPrintUsageByUser property value. The monthlyPrintUsageByUser property
     * @param value Value to set for the monthlyPrintUsageByUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMonthlyPrintUsageByUser(@javax.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this._monthlyPrintUsageByUser = value;
    }
    /**
     * Sets the security property value. The security property
     * @param value Value to set for the security property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurity(@javax.annotation.Nullable final SecurityReportsRoot value) {
        this._security = value;
    }
}
