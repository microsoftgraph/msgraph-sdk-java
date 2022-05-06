package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookPivotTable extends Entity implements Parsable {
    /** Name of the PivotTable.  */
    private String _name;
    /** The worksheet containing the current PivotTable. Read-only.  */
    private WorkbookWorksheet _worksheet;
    /**
     * Instantiates a new workbookPivotTable and sets the default values.
     * @return a void
     */
    public WorkbookPivotTable() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookPivotTable
     */
    @javax.annotation.Nonnull
    public static WorkbookPivotTable createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookPivotTable();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookPivotTable currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("worksheet", (n) -> { currentObject.setWorksheet(n.getObjectValue(WorkbookWorksheet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the name property value. Name of the PivotTable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the worksheet property value. The worksheet containing the current PivotTable. Read-only.
     * @return a workbookWorksheet
     */
    @javax.annotation.Nullable
    public WorkbookWorksheet getWorksheet() {
        return this._worksheet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("worksheet", this.getWorksheet());
    }
    /**
     * Sets the name property value. Name of the PivotTable.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the worksheet property value. The worksheet containing the current PivotTable. Read-only.
     * @param value Value to set for the worksheet property.
     * @return a void
     */
    public void setWorksheet(@javax.annotation.Nullable final WorkbookWorksheet value) {
        this._worksheet = value;
    }
}
