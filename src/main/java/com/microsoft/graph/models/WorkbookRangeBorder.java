package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class WorkbookRangeBorder extends Entity implements Parsable {
    /** HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color (e.g. 'orange'). */
    private String _color;
    /** Constant value that indicates the specific side of the border. The possible values are: EdgeTop, EdgeBottom, EdgeLeft, EdgeRight, InsideVertical, InsideHorizontal, DiagonalDown, DiagonalUp. Read-only. */
    private String _sideIndex;
    /** One of the constants of line style specifying the line style for the border. The possible values are: None, Continuous, Dash, DashDot, DashDotDot, Dot, Double, SlantDashDot. */
    private String _style;
    /** Specifies the weight of the border around a range. The possible values are: Hairline, Thin, Medium, Thick. */
    private String _weight;
    /**
     * Instantiates a new workbookRangeBorder and sets the default values.
     * @return a void
     */
    public WorkbookRangeBorder() {
        super();
        this.setOdataType("#microsoft.graph.workbookRangeBorder");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookRangeBorder
     */
    @javax.annotation.Nonnull
    public static WorkbookRangeBorder createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookRangeBorder();
    }
    /**
     * Gets the color property value. HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color (e.g. 'orange').
     * @return a string
     */
    @javax.annotation.Nullable
    public String getColor() {
        return this._color;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookRangeBorder currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("color", (n) -> { currentObject.setColor(n.getStringValue()); });
            this.put("sideIndex", (n) -> { currentObject.setSideIndex(n.getStringValue()); });
            this.put("style", (n) -> { currentObject.setStyle(n.getStringValue()); });
            this.put("weight", (n) -> { currentObject.setWeight(n.getStringValue()); });
        }};
    }
    /**
     * Gets the sideIndex property value. Constant value that indicates the specific side of the border. The possible values are: EdgeTop, EdgeBottom, EdgeLeft, EdgeRight, InsideVertical, InsideHorizontal, DiagonalDown, DiagonalUp. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSideIndex() {
        return this._sideIndex;
    }
    /**
     * Gets the style property value. One of the constants of line style specifying the line style for the border. The possible values are: None, Continuous, Dash, DashDot, DashDotDot, Dot, Double, SlantDashDot.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStyle() {
        return this._style;
    }
    /**
     * Gets the weight property value. Specifies the weight of the border around a range. The possible values are: Hairline, Thin, Medium, Thick.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWeight() {
        return this._weight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("color", this.getColor());
        writer.writeStringValue("sideIndex", this.getSideIndex());
        writer.writeStringValue("style", this.getStyle());
        writer.writeStringValue("weight", this.getWeight());
    }
    /**
     * Sets the color property value. HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color (e.g. 'orange').
     * @param value Value to set for the color property.
     * @return a void
     */
    public void setColor(@javax.annotation.Nullable final String value) {
        this._color = value;
    }
    /**
     * Sets the sideIndex property value. Constant value that indicates the specific side of the border. The possible values are: EdgeTop, EdgeBottom, EdgeLeft, EdgeRight, InsideVertical, InsideHorizontal, DiagonalDown, DiagonalUp. Read-only.
     * @param value Value to set for the sideIndex property.
     * @return a void
     */
    public void setSideIndex(@javax.annotation.Nullable final String value) {
        this._sideIndex = value;
    }
    /**
     * Sets the style property value. One of the constants of line style specifying the line style for the border. The possible values are: None, Continuous, Dash, DashDot, DashDotDot, Dot, Double, SlantDashDot.
     * @param value Value to set for the style property.
     * @return a void
     */
    public void setStyle(@javax.annotation.Nullable final String value) {
        this._style = value;
    }
    /**
     * Sets the weight property value. Specifies the weight of the border around a range. The possible values are: Hairline, Thin, Medium, Thick.
     * @param value Value to set for the weight property.
     * @return a void
     */
    public void setWeight(@javax.annotation.Nullable final String value) {
        this._weight = value;
    }
}
