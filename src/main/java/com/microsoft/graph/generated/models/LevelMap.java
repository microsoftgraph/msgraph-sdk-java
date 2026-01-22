package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LevelMap extends BaseMapFeature implements Parsable {
    /**
     * Instantiates a new {@link LevelMap} and sets the default values.
     */
    public LevelMap() {
        super();
        this.setOdataType("#microsoft.graph.levelMap");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LevelMap}
     */
    @jakarta.annotation.Nonnull
    public static LevelMap createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LevelMap();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fixtures", (n) -> { this.setFixtures(n.getCollectionOfObjectValues(FixtureMap::createFromDiscriminatorValue)); });
        deserializerMap.put("placeId", (n) -> { this.setPlaceId(n.getStringValue()); });
        deserializerMap.put("sections", (n) -> { this.setSections(n.getCollectionOfObjectValues(SectionMap::createFromDiscriminatorValue)); });
        deserializerMap.put("units", (n) -> { this.setUnits(n.getCollectionOfObjectValues(UnitMap::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fixtures property value. Collection of fixtures (such as furniture or equipment) on this level. Supports upsert.
     * @return a {@link java.util.List<FixtureMap>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FixtureMap> getFixtures() {
        return this.backingStore.get("fixtures");
    }
    /**
     * Gets the placeId property value. Identifier of the floor to which this levelMap belongs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlaceId() {
        return this.backingStore.get("placeId");
    }
    /**
     * Gets the sections property value. Collection of sections (such as zones or partitions) on this level. Supports upsert.
     * @return a {@link java.util.List<SectionMap>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SectionMap> getSections() {
        return this.backingStore.get("sections");
    }
    /**
     * Gets the units property value. Collection of units (such as rooms or offices) on this level. Supports upsert.
     * @return a {@link java.util.List<UnitMap>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnitMap> getUnits() {
        return this.backingStore.get("units");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("fixtures", this.getFixtures());
        writer.writeStringValue("placeId", this.getPlaceId());
        writer.writeCollectionOfObjectValues("sections", this.getSections());
        writer.writeCollectionOfObjectValues("units", this.getUnits());
    }
    /**
     * Sets the fixtures property value. Collection of fixtures (such as furniture or equipment) on this level. Supports upsert.
     * @param value Value to set for the fixtures property.
     */
    public void setFixtures(@jakarta.annotation.Nullable final java.util.List<FixtureMap> value) {
        this.backingStore.set("fixtures", value);
    }
    /**
     * Sets the placeId property value. Identifier of the floor to which this levelMap belongs.
     * @param value Value to set for the placeId property.
     */
    public void setPlaceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("placeId", value);
    }
    /**
     * Sets the sections property value. Collection of sections (such as zones or partitions) on this level. Supports upsert.
     * @param value Value to set for the sections property.
     */
    public void setSections(@jakarta.annotation.Nullable final java.util.List<SectionMap> value) {
        this.backingStore.set("sections", value);
    }
    /**
     * Sets the units property value. Collection of units (such as rooms or offices) on this level. Supports upsert.
     * @param value Value to set for the units property.
     */
    public void setUnits(@jakarta.annotation.Nullable final java.util.List<UnitMap> value) {
        this.backingStore.set("units", value);
    }
}
