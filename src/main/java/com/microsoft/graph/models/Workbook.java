package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Workbook extends Entity implements Parsable {
    /**
     * The application property
     */
    private WorkbookApplication application;
    /**
     * Represents a collection of comments in a workbook.
     */
    private java.util.List<WorkbookComment> comments;
    /**
     * The functions property
     */
    private WorkbookFunctions functions;
    /**
     * Represents a collection of workbooks scoped named items (named ranges and constants). Read-only.
     */
    private java.util.List<WorkbookNamedItem> names;
    /**
     * The status of workbook operations. Getting an operation collection is not supported, but you can get the status of a long-running operation if the Location header is returned in the response. Read-only.
     */
    private java.util.List<WorkbookOperation> operations;
    /**
     * Represents a collection of tables associated with the workbook. Read-only.
     */
    private java.util.List<WorkbookTable> tables;
    /**
     * Represents a collection of worksheets associated with the workbook. Read-only.
     */
    private java.util.List<WorkbookWorksheet> worksheets;
    /**
     * Instantiates a new workbook and sets the default values.
     */
    public Workbook() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbook
     */
    @jakarta.annotation.Nonnull
    public static Workbook createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Workbook();
    }
    /**
     * Gets the application property value. The application property
     * @return a workbookApplication
     */
    @jakarta.annotation.Nullable
    public WorkbookApplication getApplication() {
        return this.application;
    }
    /**
     * Gets the comments property value. Represents a collection of comments in a workbook.
     * @return a workbookComment
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookComment> getComments() {
        return this.comments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("application", (n) -> { this.setApplication(n.getObjectValue(WorkbookApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("comments", (n) -> { this.setComments(n.getCollectionOfObjectValues(WorkbookComment::createFromDiscriminatorValue)); });
        deserializerMap.put("functions", (n) -> { this.setFunctions(n.getObjectValue(WorkbookFunctions::createFromDiscriminatorValue)); });
        deserializerMap.put("names", (n) -> { this.setNames(n.getCollectionOfObjectValues(WorkbookNamedItem::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(WorkbookOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("tables", (n) -> { this.setTables(n.getCollectionOfObjectValues(WorkbookTable::createFromDiscriminatorValue)); });
        deserializerMap.put("worksheets", (n) -> { this.setWorksheets(n.getCollectionOfObjectValues(WorkbookWorksheet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the functions property value. The functions property
     * @return a workbookFunctions
     */
    @jakarta.annotation.Nullable
    public WorkbookFunctions getFunctions() {
        return this.functions;
    }
    /**
     * Gets the names property value. Represents a collection of workbooks scoped named items (named ranges and constants). Read-only.
     * @return a workbookNamedItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookNamedItem> getNames() {
        return this.names;
    }
    /**
     * Gets the operations property value. The status of workbook operations. Getting an operation collection is not supported, but you can get the status of a long-running operation if the Location header is returned in the response. Read-only.
     * @return a workbookOperation
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the tables property value. Represents a collection of tables associated with the workbook. Read-only.
     * @return a workbookTable
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookTable> getTables() {
        return this.tables;
    }
    /**
     * Gets the worksheets property value. Represents a collection of worksheets associated with the workbook. Read-only.
     * @return a workbookWorksheet
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookWorksheet> getWorksheets() {
        return this.worksheets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setApplication(@jakarta.annotation.Nullable final WorkbookApplication value) {
        this.application = value;
    }
    /**
     * Sets the comments property value. Represents a collection of comments in a workbook.
     * @param value Value to set for the comments property.
     */
    public void setComments(@jakarta.annotation.Nullable final java.util.List<WorkbookComment> value) {
        this.comments = value;
    }
    /**
     * Sets the functions property value. The functions property
     * @param value Value to set for the functions property.
     */
    public void setFunctions(@jakarta.annotation.Nullable final WorkbookFunctions value) {
        this.functions = value;
    }
    /**
     * Sets the names property value. Represents a collection of workbooks scoped named items (named ranges and constants). Read-only.
     * @param value Value to set for the names property.
     */
    public void setNames(@jakarta.annotation.Nullable final java.util.List<WorkbookNamedItem> value) {
        this.names = value;
    }
    /**
     * Sets the operations property value. The status of workbook operations. Getting an operation collection is not supported, but you can get the status of a long-running operation if the Location header is returned in the response. Read-only.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<WorkbookOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the tables property value. Represents a collection of tables associated with the workbook. Read-only.
     * @param value Value to set for the tables property.
     */
    public void setTables(@jakarta.annotation.Nullable final java.util.List<WorkbookTable> value) {
        this.tables = value;
    }
    /**
     * Sets the worksheets property value. Represents a collection of worksheets associated with the workbook. Read-only.
     * @param value Value to set for the worksheets property.
     */
    public void setWorksheets(@jakarta.annotation.Nullable final java.util.List<WorkbookWorksheet> value) {
        this.worksheets = value;
    }
}
