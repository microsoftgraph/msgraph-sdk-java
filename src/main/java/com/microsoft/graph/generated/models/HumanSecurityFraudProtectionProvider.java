package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HumanSecurityFraudProtectionProvider extends FraudProtectionProvider implements Parsable {
    /**
     * Instantiates a new {@link HumanSecurityFraudProtectionProvider} and sets the default values.
     */
    public HumanSecurityFraudProtectionProvider() {
        super();
        this.setOdataType("#microsoft.graph.humanSecurityFraudProtectionProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HumanSecurityFraudProtectionProvider}
     */
    @jakarta.annotation.Nonnull
    public static HumanSecurityFraudProtectionProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HumanSecurityFraudProtectionProvider();
    }
    /**
     * Gets the appId property value. Unique identifier for an individual application. You can retrieve this from the HUMAN Security Admin Console or request it from your HUMAN Security Customer Success Manager.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("serverToken", (n) -> { this.setServerToken(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the serverToken property value. Unique identifier used to authenticate API calls between the Server side integration and the HUMAN platform. You can retrieve this from the HUMAN Security Admin Console or request it from your HUMAN Security Customer Success Manager.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServerToken() {
        return this.backingStore.get("serverToken");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("serverToken", this.getServerToken());
    }
    /**
     * Sets the appId property value. Unique identifier for an individual application. You can retrieve this from the HUMAN Security Admin Console or request it from your HUMAN Security Customer Success Manager.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the serverToken property value. Unique identifier used to authenticate API calls between the Server side integration and the HUMAN platform. You can retrieve this from the HUMAN Security Admin Console or request it from your HUMAN Security Customer Success Manager.
     * @param value Value to set for the serverToken property.
     */
    public void setServerToken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serverToken", value);
    }
}
