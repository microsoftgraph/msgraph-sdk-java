package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BaseMapFeature extends Entity implements Parsable {
    /**
     * Instantiates a new {@link BaseMapFeature} and sets the default values.
     */
    public BaseMapFeature() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BaseMapFeature}
     */
    @jakarta.annotation.Nonnull
    public static BaseMapFeature createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.buildingMap": return new BuildingMap();
                case "#microsoft.graph.fixtureMap": return new FixtureMap();
                case "#microsoft.graph.footprintMap": return new FootprintMap();
                case "#microsoft.graph.levelMap": return new LevelMap();
                case "#microsoft.graph.sectionMap": return new SectionMap();
                case "#microsoft.graph.unitMap": return new UnitMap();
            }
        }
        return new BaseMapFeature();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the properties property value. Concatenated key-value pair of all properties of a GeoJSON file for this baseMapFeature.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProperties() {
        return this.backingStore.get("properties");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("properties", this.getProperties());
    }
    /**
     * Sets the properties property value. Concatenated key-value pair of all properties of a GeoJSON file for this baseMapFeature.
     * @param value Value to set for the properties property.
     */
    public void setProperties(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("properties", value);
    }
}
