package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HorizontalSection extends Entity implements Parsable {
    /**
     * Instantiates a new {@link HorizontalSection} and sets the default values.
     */
    public HorizontalSection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HorizontalSection}
     */
    @jakarta.annotation.Nonnull
    public static HorizontalSection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HorizontalSection();
    }
    /**
     * Gets the columns property value. The set of vertical columns in this section.
     * @return a {@link java.util.List<HorizontalSectionColumn>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HorizontalSectionColumn> getColumns() {
        return this.backingStore.get("columns");
    }
    /**
     * Gets the emphasis property value. Enumeration value that indicates the emphasis of the section background. The possible values are: none, netural, soft, strong, unknownFutureValue.
     * @return a {@link SectionEmphasisType}
     */
    @jakarta.annotation.Nullable
    public SectionEmphasisType getEmphasis() {
        return this.backingStore.get("emphasis");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("columns", (n) -> { this.setColumns(n.getCollectionOfObjectValues(HorizontalSectionColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("emphasis", (n) -> { this.setEmphasis(n.getEnumValue(SectionEmphasisType::forValue)); });
        deserializerMap.put("layout", (n) -> { this.setLayout(n.getEnumValue(HorizontalSectionLayoutType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the layout property value. Layout type of the section. The possible values are: none, oneColumn, twoColumns, threeColumns, oneThirdLeftColumn, oneThirdRightColumn, fullWidth, unknownFutureValue.
     * @return a {@link HorizontalSectionLayoutType}
     */
    @jakarta.annotation.Nullable
    public HorizontalSectionLayoutType getLayout() {
        return this.backingStore.get("layout");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeEnumValue("emphasis", this.getEmphasis());
        writer.writeEnumValue("layout", this.getLayout());
    }
    /**
     * Sets the columns property value. The set of vertical columns in this section.
     * @param value Value to set for the columns property.
     */
    public void setColumns(@jakarta.annotation.Nullable final java.util.List<HorizontalSectionColumn> value) {
        this.backingStore.set("columns", value);
    }
    /**
     * Sets the emphasis property value. Enumeration value that indicates the emphasis of the section background. The possible values are: none, netural, soft, strong, unknownFutureValue.
     * @param value Value to set for the emphasis property.
     */
    public void setEmphasis(@jakarta.annotation.Nullable final SectionEmphasisType value) {
        this.backingStore.set("emphasis", value);
    }
    /**
     * Sets the layout property value. Layout type of the section. The possible values are: none, oneColumn, twoColumns, threeColumns, oneThirdLeftColumn, oneThirdRightColumn, fullWidth, unknownFutureValue.
     * @param value Value to set for the layout property.
     */
    public void setLayout(@jakarta.annotation.Nullable final HorizontalSectionLayoutType value) {
        this.backingStore.set("layout", value);
    }
}
