package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The resource that represents an instance of Enrollment Failure Reports.  */
public class ReportRoot extends Entity implements Parsable {
    /** The dailyPrintUsageByPrinter property  */
    private java.util.List<PrintUsageByPrinter> _dailyPrintUsageByPrinter;
    /** The dailyPrintUsageByUser property  */
    private java.util.List<PrintUsageByUser> _dailyPrintUsageByUser;
    /** The monthlyPrintUsageByPrinter property  */
    private java.util.List<PrintUsageByPrinter> _monthlyPrintUsageByPrinter;
    /** The monthlyPrintUsageByUser property  */
    private java.util.List<PrintUsageByUser> _monthlyPrintUsageByUser;
    /**
     * Instantiates a new reportRoot and sets the default values.
     * @return a void
     */
    public ReportRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a reportRoot
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
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("dailyPrintUsageByPrinter", (n) -> { currentObject.setDailyPrintUsageByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
            this.put("dailyPrintUsageByUser", (n) -> { currentObject.setDailyPrintUsageByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
            this.put("monthlyPrintUsageByPrinter", (n) -> { currentObject.setMonthlyPrintUsageByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
            this.put("monthlyPrintUsageByUser", (n) -> { currentObject.setMonthlyPrintUsageByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
        }};
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("dailyPrintUsageByPrinter", this.getDailyPrintUsageByPrinter());
        writer.writeCollectionOfObjectValues("dailyPrintUsageByUser", this.getDailyPrintUsageByUser());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageByPrinter", this.getMonthlyPrintUsageByPrinter());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageByUser", this.getMonthlyPrintUsageByUser());
    }
    /**
     * Sets the dailyPrintUsageByPrinter property value. The dailyPrintUsageByPrinter property
     * @param value Value to set for the dailyPrintUsageByPrinter property.
     * @return a void
     */
    public void setDailyPrintUsageByPrinter(@javax.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this._dailyPrintUsageByPrinter = value;
    }
    /**
     * Sets the dailyPrintUsageByUser property value. The dailyPrintUsageByUser property
     * @param value Value to set for the dailyPrintUsageByUser property.
     * @return a void
     */
    public void setDailyPrintUsageByUser(@javax.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this._dailyPrintUsageByUser = value;
    }
    /**
     * Sets the monthlyPrintUsageByPrinter property value. The monthlyPrintUsageByPrinter property
     * @param value Value to set for the monthlyPrintUsageByPrinter property.
     * @return a void
     */
    public void setMonthlyPrintUsageByPrinter(@javax.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this._monthlyPrintUsageByPrinter = value;
    }
    /**
     * Sets the monthlyPrintUsageByUser property value. The monthlyPrintUsageByUser property
     * @param value Value to set for the monthlyPrintUsageByUser property.
     * @return a void
     */
    public void setMonthlyPrintUsageByUser(@javax.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this._monthlyPrintUsageByUser = value;
    }
}
