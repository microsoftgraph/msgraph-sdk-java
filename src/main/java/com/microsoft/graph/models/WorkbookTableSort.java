package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookTableSort extends Entity implements Parsable {
    /** Represents the current conditions used to last sort the table. Read-only. */
    private java.util.List<WorkbookSortField> _fields;
    /** Represents whether the casing impacted the last sort of the table. Read-only. */
    private Boolean _matchCase;
    /** Represents Chinese character ordering method last used to sort the table. Possible values are: PinYin, StrokeCount. Read-only. */
    private String _method;
    /**
     * Instantiates a new workbookTableSort and sets the default values.
     * @return a void
     */
    public WorkbookTableSort() {
        super();
        this.setOdataType("#microsoft.graph.workbookTableSort");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookTableSort
     */
    @javax.annotation.Nonnull
    public static WorkbookTableSort createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookTableSort();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookTableSort currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("fields", (n) -> { currentObject.setFields(n.getCollectionOfObjectValues(WorkbookSortField::createFromDiscriminatorValue)); });
            this.put("matchCase", (n) -> { currentObject.setMatchCase(n.getBooleanValue()); });
            this.put("method", (n) -> { currentObject.setMethod(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fields property value. Represents the current conditions used to last sort the table. Read-only.
     * @return a workbookSortField
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookSortField> getFields() {
        return this._fields;
    }
    /**
     * Gets the matchCase property value. Represents whether the casing impacted the last sort of the table. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMatchCase() {
        return this._matchCase;
    }
    /**
     * Gets the method property value. Represents Chinese character ordering method last used to sort the table. Possible values are: PinYin, StrokeCount. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMethod() {
        return this._method;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("fields", this.getFields());
        writer.writeBooleanValue("matchCase", this.getMatchCase());
        writer.writeStringValue("method", this.getMethod());
    }
    /**
     * Sets the fields property value. Represents the current conditions used to last sort the table. Read-only.
     * @param value Value to set for the fields property.
     * @return a void
     */
    public void setFields(@javax.annotation.Nullable final java.util.List<WorkbookSortField> value) {
        this._fields = value;
    }
    /**
     * Sets the matchCase property value. Represents whether the casing impacted the last sort of the table. Read-only.
     * @param value Value to set for the matchCase property.
     * @return a void
     */
    public void setMatchCase(@javax.annotation.Nullable final Boolean value) {
        this._matchCase = value;
    }
    /**
     * Sets the method property value. Represents Chinese character ordering method last used to sort the table. Possible values are: PinYin, StrokeCount. Read-only.
     * @param value Value to set for the method property.
     * @return a void
     */
    public void setMethod(@javax.annotation.Nullable final String value) {
        this._method = value;
    }
}
