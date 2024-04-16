package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IpEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link IpEvidence} and sets the default values.
     */
    public IpEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.ipEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IpEvidence}
     */
    @jakarta.annotation.Nonnull
    public static IpEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpEvidence();
    }
    /**
     * Gets the countryLetterCode property value. The two-letter country code according to ISO 3166 format, for example: US, UK, CA, etc.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryLetterCode() {
        return this.backingStore.get("countryLetterCode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("countryLetterCode", (n) -> { this.setCountryLetterCode(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(GeoLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("stream", (n) -> { this.setStream(n.getObjectValue(Stream::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. The value of the IP Address, can be either in V4 address or V6 address format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.backingStore.get("ipAddress");
    }
    /**
     * Gets the location property value. The location property
     * @return a {@link GeoLocation}
     */
    @jakarta.annotation.Nullable
    public GeoLocation getLocation() {
        return this.backingStore.get("location");
    }
    /**
     * Gets the stream property value. The stream property
     * @return a {@link Stream}
     */
    @jakarta.annotation.Nullable
    public Stream getStream() {
        return this.backingStore.get("stream");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("countryLetterCode", this.getCountryLetterCode());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeObjectValue("stream", this.getStream());
    }
    /**
     * Sets the countryLetterCode property value. The two-letter country code according to ISO 3166 format, for example: US, UK, CA, etc.
     * @param value Value to set for the countryLetterCode property.
     */
    public void setCountryLetterCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("countryLetterCode", value);
    }
    /**
     * Sets the ipAddress property value. The value of the IP Address, can be either in V4 address or V6 address format.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipAddress", value);
    }
    /**
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final GeoLocation value) {
        this.backingStore.set("location", value);
    }
    /**
     * Sets the stream property value. The stream property
     * @param value Value to set for the stream property.
     */
    public void setStream(@jakarta.annotation.Nullable final Stream value) {
        this.backingStore.set("stream", value);
    }
}
