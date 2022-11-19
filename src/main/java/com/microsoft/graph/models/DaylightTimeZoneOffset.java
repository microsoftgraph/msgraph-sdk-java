package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DaylightTimeZoneOffset extends StandardTimeZoneOffset implements Parsable {
    /** The time offset from Coordinated Universal Time (UTC) for daylight saving time. This value is in minutes. */
    private Integer _daylightBias;
    /**
     * Instantiates a new DaylightTimeZoneOffset and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DaylightTimeZoneOffset() {
        super();
        this.setOdataType("#microsoft.graph.daylightTimeZoneOffset");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DaylightTimeZoneOffset
     */
    @javax.annotation.Nonnull
    public static DaylightTimeZoneOffset createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DaylightTimeZoneOffset();
    }
    /**
     * Gets the daylightBias property value. The time offset from Coordinated Universal Time (UTC) for daylight saving time. This value is in minutes.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDaylightBias() {
        return this._daylightBias;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DaylightTimeZoneOffset currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("daylightBias", (n) -> { currentObject.setDaylightBias(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("daylightBias", this.getDaylightBias());
    }
    /**
     * Sets the daylightBias property value. The time offset from Coordinated Universal Time (UTC) for daylight saving time. This value is in minutes.
     * @param value Value to set for the daylightBias property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDaylightBias(@javax.annotation.Nullable final Integer value) {
        this._daylightBias = value;
    }
}
