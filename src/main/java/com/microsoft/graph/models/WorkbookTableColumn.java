package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookTableColumn extends Entity implements Parsable {
    /** Retrieve the filter applied to the column. Read-only. */
    private WorkbookFilter _filter;
    /** Returns the index number of the column within the columns collection of the table. Zero-indexed. Read-only. */
    private Integer _index;
    /** Returns the name of the table column. */
    private String _name;
    /** Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string. */
    private Json _values;
    /**
     * Instantiates a new workbookTableColumn and sets the default values.
     * @return a void
     */
    public WorkbookTableColumn() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookTableColumn
     */
    @javax.annotation.Nonnull
    public static WorkbookTableColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookTableColumn();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookTableColumn currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("filter", (n) -> { currentObject.setFilter(n.getObjectValue(WorkbookFilter::createFromDiscriminatorValue)); });
            this.put("index", (n) -> { currentObject.setIndex(n.getIntegerValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("values", (n) -> { currentObject.setValues(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the filter property value. Retrieve the filter applied to the column. Read-only.
     * @return a workbookFilter
     */
    @javax.annotation.Nullable
    public WorkbookFilter getFilter() {
        return this._filter;
    }
    /**
     * Gets the index property value. Returns the index number of the column within the columns collection of the table. Zero-indexed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIndex() {
        return this._index;
    }
    /**
     * Gets the name property value. Returns the name of the table column.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the values property value. Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getValues() {
        return this._values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("filter", this.getFilter());
        writer.writeIntegerValue("index", this.getIndex());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("values", this.getValues());
    }
    /**
     * Sets the filter property value. Retrieve the filter applied to the column. Read-only.
     * @param value Value to set for the filter property.
     * @return a void
     */
    public void setFilter(@javax.annotation.Nullable final WorkbookFilter value) {
        this._filter = value;
    }
    /**
     * Sets the index property value. Returns the index number of the column within the columns collection of the table. Zero-indexed. Read-only.
     * @param value Value to set for the index property.
     * @return a void
     */
    public void setIndex(@javax.annotation.Nullable final Integer value) {
        this._index = value;
    }
    /**
     * Sets the name property value. Returns the name of the table column.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the values property value. Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     * @param value Value to set for the values property.
     * @return a void
     */
    public void setValues(@javax.annotation.Nullable final Json value) {
        this._values = value;
    }
}
