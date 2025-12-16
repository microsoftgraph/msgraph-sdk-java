package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BuildingMap extends BaseMapFeature implements Parsable {
    /**
     * Instantiates a new {@link BuildingMap} and sets the default values.
     */
    public BuildingMap() {
        super();
        this.setOdataType("#microsoft.graph.buildingMap");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BuildingMap}
     */
    @jakarta.annotation.Nonnull
    public static BuildingMap createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BuildingMap();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("footprints", (n) -> { this.setFootprints(n.getCollectionOfObjectValues(FootprintMap::createFromDiscriminatorValue)); });
        deserializerMap.put("levels", (n) -> { this.setLevels(n.getCollectionOfObjectValues(LevelMap::createFromDiscriminatorValue)); });
        deserializerMap.put("placeId", (n) -> { this.setPlaceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the footprints property value. Represents the approximate physical extent of a referenced building. It corresponds to footprint.geojson in IMDF format.
     * @return a {@link java.util.List<FootprintMap>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FootprintMap> getFootprints() {
        return this.backingStore.get("footprints");
    }
    /**
     * Gets the levels property value. Represents a physical floor structure within a building. It corresponds to level.geojson in IMDF format.
     * @return a {@link java.util.List<LevelMap>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LevelMap> getLevels() {
        return this.backingStore.get("levels");
    }
    /**
     * Gets the placeId property value. Identifier for the building to which this buildingMap belongs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlaceId() {
        return this.backingStore.get("placeId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("footprints", this.getFootprints());
        writer.writeCollectionOfObjectValues("levels", this.getLevels());
        writer.writeStringValue("placeId", this.getPlaceId());
    }
    /**
     * Sets the footprints property value. Represents the approximate physical extent of a referenced building. It corresponds to footprint.geojson in IMDF format.
     * @param value Value to set for the footprints property.
     */
    public void setFootprints(@jakarta.annotation.Nullable final java.util.List<FootprintMap> value) {
        this.backingStore.set("footprints", value);
    }
    /**
     * Sets the levels property value. Represents a physical floor structure within a building. It corresponds to level.geojson in IMDF format.
     * @param value Value to set for the levels property.
     */
    public void setLevels(@jakarta.annotation.Nullable final java.util.List<LevelMap> value) {
        this.backingStore.set("levels", value);
    }
    /**
     * Sets the placeId property value. Identifier for the building to which this buildingMap belongs.
     * @param value Value to set for the placeId property.
     */
    public void setPlaceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("placeId", value);
    }
}
