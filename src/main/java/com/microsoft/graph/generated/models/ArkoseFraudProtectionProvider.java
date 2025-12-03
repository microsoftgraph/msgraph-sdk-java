package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ArkoseFraudProtectionProvider extends FraudProtectionProvider implements Parsable {
    /**
     * Instantiates a new {@link ArkoseFraudProtectionProvider} and sets the default values.
     */
    public ArkoseFraudProtectionProvider() {
        super();
        this.setOdataType("#microsoft.graph.arkoseFraudProtectionProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ArkoseFraudProtectionProvider}
     */
    @jakarta.annotation.Nonnull
    public static ArkoseFraudProtectionProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ArkoseFraudProtectionProvider();
    }
    /**
     * Gets the clientSubDomain property value. Used to invoke the Arkose service from the client application. Request from your Arkose Customer Success Manager or use the default client-api value.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientSubDomain() {
        return this.backingStore.get("clientSubDomain");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clientSubDomain", (n) -> { this.setClientSubDomain(n.getStringValue()); });
        deserializerMap.put("privateKey", (n) -> { this.setPrivateKey(n.getStringValue()); });
        deserializerMap.put("publicKey", (n) -> { this.setPublicKey(n.getStringValue()); });
        deserializerMap.put("verifySubDomain", (n) -> { this.setVerifySubDomain(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the privateKey property value. The private key available on the Arkose Portal. Contact your Arkose Customer Success Manager for assistance with your keys.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrivateKey() {
        return this.backingStore.get("privateKey");
    }
    /**
     * Gets the publicKey property value. The public key available on the Arkose Portal. Contact your Arkose Customer Success Manager for assistance with your keys.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublicKey() {
        return this.backingStore.get("publicKey");
    }
    /**
     * Gets the verifySubDomain property value. Used to invoke the Arkose service from the Microsoft authentication server. Request from your Arkose Customer Success Manager or use the default verify-api value.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVerifySubDomain() {
        return this.backingStore.get("verifySubDomain");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("clientSubDomain", this.getClientSubDomain());
        writer.writeStringValue("privateKey", this.getPrivateKey());
        writer.writeStringValue("publicKey", this.getPublicKey());
        writer.writeStringValue("verifySubDomain", this.getVerifySubDomain());
    }
    /**
     * Sets the clientSubDomain property value. Used to invoke the Arkose service from the client application. Request from your Arkose Customer Success Manager or use the default client-api value.
     * @param value Value to set for the clientSubDomain property.
     */
    public void setClientSubDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientSubDomain", value);
    }
    /**
     * Sets the privateKey property value. The private key available on the Arkose Portal. Contact your Arkose Customer Success Manager for assistance with your keys.
     * @param value Value to set for the privateKey property.
     */
    public void setPrivateKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("privateKey", value);
    }
    /**
     * Sets the publicKey property value. The public key available on the Arkose Portal. Contact your Arkose Customer Success Manager for assistance with your keys.
     * @param value Value to set for the publicKey property.
     */
    public void setPublicKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publicKey", value);
    }
    /**
     * Sets the verifySubDomain property value. Used to invoke the Arkose service from the Microsoft authentication server. Request from your Arkose Customer Success Manager or use the default verify-api value.
     * @param value Value to set for the verifySubDomain property.
     */
    public void setVerifySubDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("verifySubDomain", value);
    }
}
