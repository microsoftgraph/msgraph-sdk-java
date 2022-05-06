package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Workbook extends Entity implements Parsable {
    /** The application property  */
    private WorkbookApplication _application;
    /** The comments property  */
    private java.util.List<WorkbookComment> _comments;
    /** The functions property  */
    private WorkbookFunctions _functions;
    /** Represents a collection of workbooks scoped named items (named ranges and constants). Read-only.  */
    private java.util.List<WorkbookNamedItem> _names;
    /** The status of Workbook operations. Getting an operation collection is not supported, but you can get the status of a long-running operation if the Location header is returned in the response. Read-only. Nullable.  */
    private java.util.List<WorkbookOperation> _operations;
    /** Represents a collection of tables associated with the workbook. Read-only.  */
    private java.util.List<WorkbookTable> _tables;
    /** Represents a collection of worksheets associated with the workbook. Read-only.  */
    private java.util.List<WorkbookWorksheet> _worksheets;
    /**
     * Instantiates a new workbook and sets the default values.
     * @return a void
     */
    public Workbook() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbook
     */
    @javax.annotation.Nonnull
    public static Workbook createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Workbook();
    }
    /**
     * Gets the application property value. The application property
     * @return a workbookApplication
     */
    @javax.annotation.Nullable
    public WorkbookApplication getApplication() {
        return this._application;
    }
    /**
     * Gets the comments property value. The comments property
     * @return a workbookComment
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookComment> getComments() {
        return this._comments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Workbook currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("application", (n) -> { currentObject.setApplication(n.getObjectValue(WorkbookApplication::createFromDiscriminatorValue)); });
            this.put("comments", (n) -> { currentObject.setComments(n.getCollectionOfObjectValues(WorkbookComment::createFromDiscriminatorValue)); });
            this.put("functions", (n) -> { currentObject.setFunctions(n.getObjectValue(WorkbookFunctions::createFromDiscriminatorValue)); });
            this.put("names", (n) -> { currentObject.setNames(n.getCollectionOfObjectValues(WorkbookNamedItem::createFromDiscriminatorValue)); });
            this.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfObjectValues(WorkbookOperation::createFromDiscriminatorValue)); });
            this.put("tables", (n) -> { currentObject.setTables(n.getCollectionOfObjectValues(WorkbookTable::createFromDiscriminatorValue)); });
            this.put("worksheets", (n) -> { currentObject.setWorksheets(n.getCollectionOfObjectValues(WorkbookWorksheet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the functions property value. The functions property
     * @return a workbookFunctions
     */
    @javax.annotation.Nullable
    public WorkbookFunctions getFunctions() {
        return this._functions;
    }
    /**
     * Gets the names property value. Represents a collection of workbooks scoped named items (named ranges and constants). Read-only.
     * @return a workbookNamedItem
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookNamedItem> getNames() {
        return this._names;
    }
    /**
     * Gets the operations property value. The status of Workbook operations. Getting an operation collection is not supported, but you can get the status of a long-running operation if the Location header is returned in the response. Read-only. Nullable.
     * @return a workbookOperation
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookOperation> getOperations() {
        return this._operations;
    }
    /**
     * Gets the tables property value. Represents a collection of tables associated with the workbook. Read-only.
     * @return a workbookTable
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookTable> getTables() {
        return this._tables;
    }
    /**
     * Gets the worksheets property value. Represents a collection of worksheets associated with the workbook. Read-only.
     * @return a workbookWorksheet
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookWorksheet> getWorksheets() {
        return this._worksheets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("application", this.getApplication());
        writer.writeCollectionOfObjectValues("comments", this.getComments());
        writer.writeObjectValue("functions", this.getFunctions());
        writer.writeCollectionOfObjectValues("names", this.getNames());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("tables", this.getTables());
        writer.writeCollectionOfObjectValues("worksheets", this.getWorksheets());
    }
    /**
     * Sets the application property value. The application property
     * @param value Value to set for the application property.
     * @return a void
     */
    public void setApplication(@javax.annotation.Nullable final WorkbookApplication value) {
        this._application = value;
    }
    /**
     * Sets the comments property value. The comments property
     * @param value Value to set for the comments property.
     * @return a void
     */
    public void setComments(@javax.annotation.Nullable final java.util.List<WorkbookComment> value) {
        this._comments = value;
    }
    /**
     * Sets the functions property value. The functions property
     * @param value Value to set for the functions property.
     * @return a void
     */
    public void setFunctions(@javax.annotation.Nullable final WorkbookFunctions value) {
        this._functions = value;
    }
    /**
     * Sets the names property value. Represents a collection of workbooks scoped named items (named ranges and constants). Read-only.
     * @param value Value to set for the names property.
     * @return a void
     */
    public void setNames(@javax.annotation.Nullable final java.util.List<WorkbookNamedItem> value) {
        this._names = value;
    }
    /**
     * Sets the operations property value. The status of Workbook operations. Getting an operation collection is not supported, but you can get the status of a long-running operation if the Location header is returned in the response. Read-only. Nullable.
     * @param value Value to set for the operations property.
     * @return a void
     */
    public void setOperations(@javax.annotation.Nullable final java.util.List<WorkbookOperation> value) {
        this._operations = value;
    }
    /**
     * Sets the tables property value. Represents a collection of tables associated with the workbook. Read-only.
     * @param value Value to set for the tables property.
     * @return a void
     */
    public void setTables(@javax.annotation.Nullable final java.util.List<WorkbookTable> value) {
        this._tables = value;
    }
    /**
     * Sets the worksheets property value. Represents a collection of worksheets associated with the workbook. Read-only.
     * @param value Value to set for the worksheets property.
     * @return a void
     */
    public void setWorksheets(@javax.annotation.Nullable final java.util.List<WorkbookWorksheet> value) {
        this._worksheets = value;
    }
}
