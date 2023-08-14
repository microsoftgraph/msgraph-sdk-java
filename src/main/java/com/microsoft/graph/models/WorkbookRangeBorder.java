package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookRangeBorder extends Entity implements Parsable {
    /**
     * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color (e.g. 'orange').
     */
    private String color;
    /**
     * Constant value that indicates the specific side of the border. The possible values are: EdgeTop, EdgeBottom, EdgeLeft, EdgeRight, InsideVertical, InsideHorizontal, DiagonalDown, DiagonalUp. Read-only.
     */
    private String sideIndex;
    /**
     * One of the constants of line style specifying the line style for the border. The possible values are: None, Continuous, Dash, DashDot, DashDotDot, Dot, Double, SlantDashDot.
     */
    private String style;
    /**
     * Specifies the weight of the border around a range. The possible values are: Hairline, Thin, Medium, Thick.
     */
    private String weight;
    /**
     * Instantiates a new workbookRangeBorder and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WorkbookRangeBorder() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookRangeBorder
     */
    @jakarta.annotation.Nonnull
    public static WorkbookRangeBorder createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookRangeBorder();
    }
    /**
     * Gets the color property value. HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color (e.g. 'orange').
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getColor() {
        return this.color;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("color", (n) -> { this.setColor(n.getStringValue()); });
        deserializerMap.put("sideIndex", (n) -> { this.setSideIndex(n.getStringValue()); });
        deserializerMap.put("style", (n) -> { this.setStyle(n.getStringValue()); });
        deserializerMap.put("weight", (n) -> { this.setWeight(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sideIndex property value. Constant value that indicates the specific side of the border. The possible values are: EdgeTop, EdgeBottom, EdgeLeft, EdgeRight, InsideVertical, InsideHorizontal, DiagonalDown, DiagonalUp. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSideIndex() {
        return this.sideIndex;
    }
    /**
     * Gets the style property value. One of the constants of line style specifying the line style for the border. The possible values are: None, Continuous, Dash, DashDot, DashDotDot, Dot, Double, SlantDashDot.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getStyle() {
        return this.style;
    }
    /**
     * Gets the weight property value. Specifies the weight of the border around a range. The possible values are: Hairline, Thin, Medium, Thick.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWeight() {
        return this.weight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setColor(@jakarta.annotation.Nullable final String value) {
        this.color = value;
    }
    /**
     * Sets the sideIndex property value. Constant value that indicates the specific side of the border. The possible values are: EdgeTop, EdgeBottom, EdgeLeft, EdgeRight, InsideVertical, InsideHorizontal, DiagonalDown, DiagonalUp. Read-only.
     * @param value Value to set for the sideIndex property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSideIndex(@jakarta.annotation.Nullable final String value) {
        this.sideIndex = value;
    }
    /**
     * Sets the style property value. One of the constants of line style specifying the line style for the border. The possible values are: None, Continuous, Dash, DashDot, DashDotDot, Dot, Double, SlantDashDot.
     * @param value Value to set for the style property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStyle(@jakarta.annotation.Nullable final String value) {
        this.style = value;
    }
    /**
     * Sets the weight property value. Specifies the weight of the border around a range. The possible values are: Hairline, Thin, Medium, Thick.
     * @param value Value to set for the weight property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWeight(@jakarta.annotation.Nullable final String value) {
        this.weight = value;
    }
}
