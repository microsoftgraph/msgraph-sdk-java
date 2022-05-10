package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookNamedItem extends Entity implements Parsable {
    /** Represents the comment associated with this name. */
    private String _comment;
    /** The name of the object. Read-only. */
    private String _name;
    /** Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only. */
    private String _scope;
    /** Indicates what type of reference is associated with the name. Possible values are: String, Integer, Double, Boolean, Range. Read-only. */
    private String _type;
    /** Represents the formula that the name is defined to refer to. E.g. =Sheet14!$B$2:$H$12, =4.75, etc. Read-only. */
    private Json _value;
    /** Specifies whether the object is visible or not. */
    private Boolean _visible;
    /** Returns the worksheet on which the named item is scoped to. Available only if the item is scoped to the worksheet. Read-only. */
    private WorkbookWorksheet _worksheet;
    /**
     * Instantiates a new workbookNamedItem and sets the default values.
     * @return a void
     */
    public WorkbookNamedItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookNamedItem
     */
    @javax.annotation.Nonnull
    public static WorkbookNamedItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookNamedItem();
    }
    /**
     * Gets the comment property value. Represents the comment associated with this name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this._comment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookNamedItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("comment", (n) -> { currentObject.setComment(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("scope", (n) -> { currentObject.setScope(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
            this.put("value", (n) -> { currentObject.setValue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("visible", (n) -> { currentObject.setVisible(n.getBooleanValue()); });
            this.put("worksheet", (n) -> { currentObject.setWorksheet(n.getObjectValue(WorkbookWorksheet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the name property value. The name of the object. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the scope property value. Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScope() {
        return this._scope;
    }
    /**
     * Gets the type property value. Indicates what type of reference is associated with the name. Possible values are: String, Integer, Double, Boolean, Range. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Gets the value property value. Represents the formula that the name is defined to refer to. E.g. =Sheet14!$B$2:$H$12, =4.75, etc. Read-only.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getValue() {
        return this._value;
    }
    /**
     * Gets the visible property value. Specifies whether the object is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVisible() {
        return this._visible;
    }
    /**
     * Gets the worksheet property value. Returns the worksheet on which the named item is scoped to. Available only if the item is scoped to the worksheet. Read-only.
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
        writer.writeStringValue("comment", this.getComment());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("scope", this.getScope());
        writer.writeStringValue("type", this.getType());
        writer.writeObjectValue("value", this.getValue());
        writer.writeBooleanValue("visible", this.getVisible());
        writer.writeObjectValue("worksheet", this.getWorksheet());
    }
    /**
     * Sets the comment property value. Represents the comment associated with this name.
     * @param value Value to set for the comment property.
     * @return a void
     */
    public void setComment(@javax.annotation.Nullable final String value) {
        this._comment = value;
    }
    /**
     * Sets the name property value. The name of the object. Read-only.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the scope property value. Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only.
     * @param value Value to set for the scope property.
     * @return a void
     */
    public void setScope(@javax.annotation.Nullable final String value) {
        this._scope = value;
    }
    /**
     * Sets the type property value. Indicates what type of reference is associated with the name. Possible values are: String, Integer, Double, Boolean, Range. Read-only.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
    /**
     * Sets the value property value. Represents the formula that the name is defined to refer to. E.g. =Sheet14!$B$2:$H$12, =4.75, etc. Read-only.
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final Json value) {
        this._value = value;
    }
    /**
     * Sets the visible property value. Specifies whether the object is visible or not.
     * @param value Value to set for the visible property.
     * @return a void
     */
    public void setVisible(@javax.annotation.Nullable final Boolean value) {
        this._visible = value;
    }
    /**
     * Sets the worksheet property value. Returns the worksheet on which the named item is scoped to. Available only if the item is scoped to the worksheet. Read-only.
     * @param value Value to set for the worksheet property.
     * @return a void
     */
    public void setWorksheet(@javax.annotation.Nullable final WorkbookWorksheet value) {
        this._worksheet = value;
    }
}
