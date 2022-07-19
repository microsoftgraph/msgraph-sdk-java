package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookSortField implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Represents whether the sorting is done in an ascending fashion. */
    private Boolean _ascending;
    /** Represents the color that is the target of the condition if the sorting is on font or cell color. */
    private String _color;
    /** Represents additional sorting options for this field. Possible values are: Normal, TextAsNumber. */
    private String _dataOption;
    /** Represents the icon that is the target of the condition if the sorting is on the cell's icon. */
    private WorkbookIcon _icon;
    /** Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row). */
    private Integer _key;
    /** The OdataType property */
    private String _odataType;
    /** Represents the type of sorting of this condition. Possible values are: Value, CellColor, FontColor, Icon. */
    private String _sortOn;
    /**
     * Instantiates a new workbookSortField and sets the default values.
     * @return a void
     */
    public WorkbookSortField() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.workbookSortField");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookSortField
     */
    @javax.annotation.Nonnull
    public static WorkbookSortField createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookSortField();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the ascending property value. Represents whether the sorting is done in an ascending fashion.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAscending() {
        return this._ascending;
    }
    /**
     * Gets the color property value. Represents the color that is the target of the condition if the sorting is on font or cell color.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getColor() {
        return this._color;
    }
    /**
     * Gets the dataOption property value. Represents additional sorting options for this field. Possible values are: Normal, TextAsNumber.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDataOption() {
        return this._dataOption;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookSortField currentObject = this;
        return new HashMap<>(7) {{
            this.put("ascending", (n) -> { currentObject.setAscending(n.getBooleanValue()); });
            this.put("color", (n) -> { currentObject.setColor(n.getStringValue()); });
            this.put("dataOption", (n) -> { currentObject.setDataOption(n.getStringValue()); });
            this.put("icon", (n) -> { currentObject.setIcon(n.getObjectValue(WorkbookIcon::createFromDiscriminatorValue)); });
            this.put("key", (n) -> { currentObject.setKey(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("sortOn", (n) -> { currentObject.setSortOn(n.getStringValue()); });
        }};
    }
    /**
     * Gets the icon property value. Represents the icon that is the target of the condition if the sorting is on the cell's icon.
     * @return a workbookIcon
     */
    @javax.annotation.Nullable
    public WorkbookIcon getIcon() {
        return this._icon;
    }
    /**
     * Gets the key property value. Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKey() {
        return this._key;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the sortOn property value. Represents the type of sorting of this condition. Possible values are: Value, CellColor, FontColor, Icon.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSortOn() {
        return this._sortOn;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("ascending", this.getAscending());
        writer.writeStringValue("color", this.getColor());
        writer.writeStringValue("dataOption", this.getDataOption());
        writer.writeObjectValue("icon", this.getIcon());
        writer.writeIntegerValue("key", this.getKey());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sortOn", this.getSortOn());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the ascending property value. Represents whether the sorting is done in an ascending fashion.
     * @param value Value to set for the ascending property.
     * @return a void
     */
    public void setAscending(@javax.annotation.Nullable final Boolean value) {
        this._ascending = value;
    }
    /**
     * Sets the color property value. Represents the color that is the target of the condition if the sorting is on font or cell color.
     * @param value Value to set for the color property.
     * @return a void
     */
    public void setColor(@javax.annotation.Nullable final String value) {
        this._color = value;
    }
    /**
     * Sets the dataOption property value. Represents additional sorting options for this field. Possible values are: Normal, TextAsNumber.
     * @param value Value to set for the dataOption property.
     * @return a void
     */
    public void setDataOption(@javax.annotation.Nullable final String value) {
        this._dataOption = value;
    }
    /**
     * Sets the icon property value. Represents the icon that is the target of the condition if the sorting is on the cell's icon.
     * @param value Value to set for the icon property.
     * @return a void
     */
    public void setIcon(@javax.annotation.Nullable final WorkbookIcon value) {
        this._icon = value;
    }
    /**
     * Sets the key property value. Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
     * @param value Value to set for the key property.
     * @return a void
     */
    public void setKey(@javax.annotation.Nullable final Integer value) {
        this._key = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the sortOn property value. Represents the type of sorting of this condition. Possible values are: Value, CellColor, FontColor, Icon.
     * @param value Value to set for the sortOn property.
     * @return a void
     */
    public void setSortOn(@javax.annotation.Nullable final String value) {
        this._sortOn = value;
    }
}
