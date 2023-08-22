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
     * The two-letter country code according to ISO 3166 format, for example: US, UK, CA, etc..).
     */
    private String countryLetterCode;
    /**
     * The value of the IP Address, can be either in V4 address or V6 address format.
     */
    private String ipAddress;
    /**
     * Instantiates a new ipEvidence and sets the default values.
     */
    public IpEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.ipEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ipEvidence
     */
    @jakarta.annotation.Nonnull
    public static IpEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpEvidence();
    }
    /**
     * Gets the countryLetterCode property value. The two-letter country code according to ISO 3166 format, for example: US, UK, CA, etc..).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCountryLetterCode() {
        return this.countryLetterCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("countryLetterCode", (n) -> { this.setCountryLetterCode(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. The value of the IP Address, can be either in V4 address or V6 address format.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
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
    }
    /**
     * Sets the countryLetterCode property value. The two-letter country code according to ISO 3166 format, for example: US, UK, CA, etc..).
     * @param value Value to set for the countryLetterCode property.
     */
    public void setCountryLetterCode(@jakarta.annotation.Nullable final String value) {
        this.countryLetterCode = value;
    }
    /**
     * Sets the ipAddress property value. The value of the IP Address, can be either in V4 address or V6 address format.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
}
