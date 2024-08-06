package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookRangeBorder extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookRangeBorder} and sets the default values.
     */
    public WorkbookRangeBorder() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookRangeBorder}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookRangeBorder createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookRangeBorder();
    }
    /**
     * Gets the color property value. The HTML color code that represents the color of the border line. Can either be of the form #RRGGBB, for example 'FFA500', or a named HTML color, for example 'orange'.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getColor() {
        return this.backingStore.get("color");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * Gets the sideIndex property value. Indicates the specific side of the border. The possible values are: EdgeTop, EdgeBottom, EdgeLeft, EdgeRight, InsideVertical, InsideHorizontal, DiagonalDown, DiagonalUp. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSideIndex() {
        return this.backingStore.get("sideIndex");
    }
    /**
     * Gets the style property value. Indicates the line style for the border. The possible values are: None, Continuous, Dash, DashDot, DashDotDot, Dot, Double, SlantDashDot.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStyle() {
        return this.backingStore.get("style");
    }
    /**
     * Gets the weight property value. The weight of the border around a range. The possible values are: Hairline, Thin, Medium, Thick.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWeight() {
        return this.backingStore.get("weight");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("color", this.getColor());
        writer.writeStringValue("sideIndex", this.getSideIndex());
        writer.writeStringValue("style", this.getStyle());
        writer.writeStringValue("weight", this.getWeight());
    }
    /**
     * Sets the color property value. The HTML color code that represents the color of the border line. Can either be of the form #RRGGBB, for example 'FFA500', or a named HTML color, for example 'orange'.
     * @param value Value to set for the color property.
     */
    public void setColor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("color", value);
    }
    /**
     * Sets the sideIndex property value. Indicates the specific side of the border. The possible values are: EdgeTop, EdgeBottom, EdgeLeft, EdgeRight, InsideVertical, InsideHorizontal, DiagonalDown, DiagonalUp. Read-only.
     * @param value Value to set for the sideIndex property.
     */
    public void setSideIndex(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sideIndex", value);
    }
    /**
     * Sets the style property value. Indicates the line style for the border. The possible values are: None, Continuous, Dash, DashDot, DashDotDot, Dot, Double, SlantDashDot.
     * @param value Value to set for the style property.
     */
    public void setStyle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("style", value);
    }
    /**
     * Sets the weight property value. The weight of the border around a range. The possible values are: Hairline, Thin, Medium, Thick.
     * @param value Value to set for the weight property.
     */
    public void setWeight(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("weight", value);
    }
}
