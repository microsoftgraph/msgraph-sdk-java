package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Pkcs12Certificate extends ApiAuthenticationConfigurationBase implements Parsable {
    /**
     * Instantiates a new Pkcs12Certificate and sets the default values.
     */
    public Pkcs12Certificate() {
        super();
        this.setOdataType("#microsoft.graph.pkcs12Certificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Pkcs12Certificate
     */
    @jakarta.annotation.Nonnull
    public static Pkcs12Certificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Pkcs12Certificate();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("pkcs12Value", (n) -> { this.setPkcs12Value(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the password property value. The password for the pfx file. Required. If no password is used, you must still provide a value of ''.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.getBackingStore().get("password");
    }
    /**
     * Gets the pkcs12Value property value. Represents the pfx content that is sent. The value should be a base-64 encoded version of the actual certificate content. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPkcs12Value() {
        return this.getBackingStore().get("pkcs12Value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("password", this.getPassword());
        writer.writeStringValue("pkcs12Value", this.getPkcs12Value());
    }
    /**
     * Sets the password property value. The password for the pfx file. Required. If no password is used, you must still provide a value of ''.
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("password", value);
    }
    /**
     * Sets the pkcs12Value property value. Represents the pfx content that is sent. The value should be a base-64 encoded version of the actual certificate content. Required.
     * @param value Value to set for the pkcs12Value property.
     */
    public void setPkcs12Value(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("pkcs12Value", value);
    }
}
