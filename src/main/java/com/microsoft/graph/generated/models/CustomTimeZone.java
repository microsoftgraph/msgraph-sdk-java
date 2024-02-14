package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomTimeZone extends TimeZoneBase implements Parsable {
    /**
     * Instantiates a new {@link CustomTimeZone} and sets the default values.
     */
    public CustomTimeZone() {
        super();
        this.setOdataType("#microsoft.graph.customTimeZone");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomTimeZone}
     */
    @jakarta.annotation.Nonnull
    public static CustomTimeZone createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomTimeZone();
    }
    /**
     * Gets the bias property value. The time offset of the time zone from Coordinated Universal Time (UTC). This value is in minutes.Time zones that are ahead of UTC have a positive offset; time zones that are behind UTC have a negative offset.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBias() {
        return this.backingStore.get("bias");
    }
    /**
     * Gets the daylightOffset property value. Specifies when the time zone switches from standard time to daylight saving time.
     * @return a {@link DaylightTimeZoneOffset}
     */
    @jakarta.annotation.Nullable
    public DaylightTimeZoneOffset getDaylightOffset() {
        return this.backingStore.get("daylightOffset");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bias", (n) -> { this.setBias(n.getIntegerValue()); });
        deserializerMap.put("daylightOffset", (n) -> { this.setDaylightOffset(n.getObjectValue(DaylightTimeZoneOffset::createFromDiscriminatorValue)); });
        deserializerMap.put("standardOffset", (n) -> { this.setStandardOffset(n.getObjectValue(StandardTimeZoneOffset::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the standardOffset property value. Specifies when the time zone switches from daylight saving time to standard time.
     * @return a {@link StandardTimeZoneOffset}
     */
    @jakarta.annotation.Nullable
    public StandardTimeZoneOffset getStandardOffset() {
        return this.backingStore.get("standardOffset");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("bias", this.getBias());
        writer.writeObjectValue("daylightOffset", this.getDaylightOffset());
        writer.writeObjectValue("standardOffset", this.getStandardOffset());
    }
    /**
     * Sets the bias property value. The time offset of the time zone from Coordinated Universal Time (UTC). This value is in minutes.Time zones that are ahead of UTC have a positive offset; time zones that are behind UTC have a negative offset.
     * @param value Value to set for the bias property.
     */
    public void setBias(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("bias", value);
    }
    /**
     * Sets the daylightOffset property value. Specifies when the time zone switches from standard time to daylight saving time.
     * @param value Value to set for the daylightOffset property.
     */
    public void setDaylightOffset(@jakarta.annotation.Nullable final DaylightTimeZoneOffset value) {
        this.backingStore.set("daylightOffset", value);
    }
    /**
     * Sets the standardOffset property value. Specifies when the time zone switches from daylight saving time to standard time.
     * @param value Value to set for the standardOffset property.
     */
    public void setStandardOffset(@jakarta.annotation.Nullable final StandardTimeZoneOffset value) {
        this.backingStore.set("standardOffset", value);
    }
}
