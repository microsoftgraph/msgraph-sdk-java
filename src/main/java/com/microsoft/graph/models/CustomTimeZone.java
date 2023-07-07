package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomTimeZone extends TimeZoneBase implements Parsable {
    /**
     * The time offset of the time zone from Coordinated Universal Time (UTC). This value is in minutes.Time zones that are ahead of UTC have a positive offset; time zones that are behind UTC have a negative offset.
     */
    private Integer bias;
    /**
     * Specifies when the time zone switches from standard time to daylight saving time.
     */
    private DaylightTimeZoneOffset daylightOffset;
    /**
     * Specifies when the time zone switches from daylight saving time to standard time.
     */
    private StandardTimeZoneOffset standardOffset;
    /**
     * Instantiates a new CustomTimeZone and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustomTimeZone() {
        super();
        this.setOdataType("#microsoft.graph.customTimeZone");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CustomTimeZone
     */
    @javax.annotation.Nonnull
    public static CustomTimeZone createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomTimeZone();
    }
    /**
     * Gets the bias property value. The time offset of the time zone from Coordinated Universal Time (UTC). This value is in minutes.Time zones that are ahead of UTC have a positive offset; time zones that are behind UTC have a negative offset.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBias() {
        return this.bias;
    }
    /**
     * Gets the daylightOffset property value. Specifies when the time zone switches from standard time to daylight saving time.
     * @return a daylightTimeZoneOffset
     */
    @javax.annotation.Nullable
    public DaylightTimeZoneOffset getDaylightOffset() {
        return this.daylightOffset;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bias", (n) -> { this.setBias(n.getIntegerValue()); });
        deserializerMap.put("daylightOffset", (n) -> { this.setDaylightOffset(n.getObjectValue(DaylightTimeZoneOffset::createFromDiscriminatorValue)); });
        deserializerMap.put("standardOffset", (n) -> { this.setStandardOffset(n.getObjectValue(StandardTimeZoneOffset::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the standardOffset property value. Specifies when the time zone switches from daylight saving time to standard time.
     * @return a standardTimeZoneOffset
     */
    @javax.annotation.Nullable
    public StandardTimeZoneOffset getStandardOffset() {
        return this.standardOffset;
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
        writer.writeIntegerValue("bias", this.getBias());
        writer.writeObjectValue("daylightOffset", this.getDaylightOffset());
        writer.writeObjectValue("standardOffset", this.getStandardOffset());
    }
    /**
     * Sets the bias property value. The time offset of the time zone from Coordinated Universal Time (UTC). This value is in minutes.Time zones that are ahead of UTC have a positive offset; time zones that are behind UTC have a negative offset.
     * @param value Value to set for the bias property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBias(@javax.annotation.Nullable final Integer value) {
        this.bias = value;
    }
    /**
     * Sets the daylightOffset property value. Specifies when the time zone switches from standard time to daylight saving time.
     * @param value Value to set for the daylightOffset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDaylightOffset(@javax.annotation.Nullable final DaylightTimeZoneOffset value) {
        this.daylightOffset = value;
    }
    /**
     * Sets the standardOffset property value. Specifies when the time zone switches from daylight saving time to standard time.
     * @param value Value to set for the standardOffset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStandardOffset(@javax.annotation.Nullable final StandardTimeZoneOffset value) {
        this.standardOffset = value;
    }
}
