package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SensorCandidate extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SensorCandidate} and sets the default values.
     */
    public SensorCandidate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SensorCandidate}
     */
    @jakarta.annotation.Nonnull
    public static SensorCandidate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensorCandidate();
    }
    /**
     * Gets the computerDnsName property value. The DNS name of the computer associated with the sensor.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComputerDnsName() {
        return this.backingStore.get("computerDnsName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("computerDnsName", (n) -> { this.setComputerDnsName(n.getStringValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("senseClientVersion", (n) -> { this.setSenseClientVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastSeenDateTime property value. The date and time when the sensor was last seen.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.backingStore.get("lastSeenDateTime");
    }
    /**
     * Gets the senseClientVersion property value. The version of the Defender for Identity sensor client. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSenseClientVersion() {
        return this.backingStore.get("senseClientVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("computerDnsName", this.getComputerDnsName());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("senseClientVersion", this.getSenseClientVersion());
    }
    /**
     * Sets the computerDnsName property value. The DNS name of the computer associated with the sensor.
     * @param value Value to set for the computerDnsName property.
     */
    public void setComputerDnsName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("computerDnsName", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The date and time when the sensor was last seen.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSeenDateTime", value);
    }
    /**
     * Sets the senseClientVersion property value. The version of the Defender for Identity sensor client. Supports $filter (eq).
     * @param value Value to set for the senseClientVersion property.
     */
    public void setSenseClientVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("senseClientVersion", value);
    }
}
