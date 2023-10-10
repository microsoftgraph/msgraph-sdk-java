package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SoftwareOathAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /**
     * The secret key of the method. Always returns null.
     */
    private String secretKey;
    /**
     * Instantiates a new SoftwareOathAuthenticationMethod and sets the default values.
     */
    public SoftwareOathAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.softwareOathAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SoftwareOathAuthenticationMethod
     */
    @jakarta.annotation.Nonnull
    public static SoftwareOathAuthenticationMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SoftwareOathAuthenticationMethod();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("secretKey", (n) -> { this.setSecretKey(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the secretKey property value. The secret key of the method. Always returns null.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSecretKey() {
        return this.secretKey;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("secretKey", this.getSecretKey());
    }
    /**
     * Sets the secretKey property value. The secret key of the method. Always returns null.
     * @param value Value to set for the secretKey property.
     */
    public void setSecretKey(@jakarta.annotation.Nullable final String value) {
        this.secretKey = value;
    }
}
