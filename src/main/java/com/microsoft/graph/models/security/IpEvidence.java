package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IpEvidence extends AlertEvidence implements Parsable {
    /** The countryLetterCode property */
    private String _countryLetterCode;
    /** The ipAddress property */
    private String _ipAddress;
    /**
     * Instantiates a new IpEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IpEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IpEvidence
     */
    @javax.annotation.Nonnull
    public static IpEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpEvidence();
    }
    /**
     * Gets the countryLetterCode property value. The countryLetterCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryLetterCode() {
        return this._countryLetterCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("countryLetterCode", (n) -> { this.setCountryLetterCode(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. The ipAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this._ipAddress;
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
        writer.writeStringValue("countryLetterCode", this.getCountryLetterCode());
        writer.writeStringValue("ipAddress", this.getIpAddress());
    }
    /**
     * Sets the countryLetterCode property value. The countryLetterCode property
     * @param value Value to set for the countryLetterCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountryLetterCode(@javax.annotation.Nullable final String value) {
        this._countryLetterCode = value;
    }
    /**
     * Sets the ipAddress property value. The ipAddress property
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
    }
}
