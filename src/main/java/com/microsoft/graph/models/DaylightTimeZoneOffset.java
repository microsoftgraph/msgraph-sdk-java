package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DaylightTimeZoneOffset extends StandardTimeZoneOffset implements Parsable {
    /**
     * The time offset from Coordinated Universal Time (UTC) for daylight saving time. This value is in minutes.
     */
    private Integer daylightBias;
    /**
     * Instantiates a new daylightTimeZoneOffset and sets the default values.
     */
    public DaylightTimeZoneOffset() {
        super();
        this.setOdataType("#microsoft.graph.daylightTimeZoneOffset");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a daylightTimeZoneOffset
     */
    @jakarta.annotation.Nonnull
    public static DaylightTimeZoneOffset createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DaylightTimeZoneOffset();
    }
    /**
     * Gets the daylightBias property value. The time offset from Coordinated Universal Time (UTC) for daylight saving time. This value is in minutes.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDaylightBias() {
        return this.daylightBias;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("daylightBias", (n) -> { this.setDaylightBias(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("daylightBias", this.getDaylightBias());
    }
    /**
     * Sets the daylightBias property value. The time offset from Coordinated Universal Time (UTC) for daylight saving time. This value is in minutes.
     * @param value Value to set for the daylightBias property.
     */
    public void setDaylightBias(@jakarta.annotation.Nullable final Integer value) {
        this.daylightBias = value;
    }
}
