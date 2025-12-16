package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnitMap extends BaseMapFeature implements Parsable {
    /**
     * Instantiates a new {@link UnitMap} and sets the default values.
     */
    public UnitMap() {
        super();
        this.setOdataType("#microsoft.graph.unitMap");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnitMap}
     */
    @jakarta.annotation.Nonnull
    public static UnitMap createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnitMap();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("placeId", (n) -> { this.setPlaceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the placeId property value. Identifier of the place (such as a room) to which this unitMap belongs.
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
        writer.writeStringValue("placeId", this.getPlaceId());
    }
    /**
     * Sets the placeId property value. Identifier of the place (such as a room) to which this unitMap belongs.
     * @param value Value to set for the placeId property.
     */
    public void setPlaceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("placeId", value);
    }
}
