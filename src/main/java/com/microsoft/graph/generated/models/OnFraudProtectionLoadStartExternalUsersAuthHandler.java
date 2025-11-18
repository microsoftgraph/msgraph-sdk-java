package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnFraudProtectionLoadStartExternalUsersAuthHandler extends OnFraudProtectionLoadStartHandler implements Parsable {
    /**
     * Instantiates a new {@link OnFraudProtectionLoadStartExternalUsersAuthHandler} and sets the default values.
     */
    public OnFraudProtectionLoadStartExternalUsersAuthHandler() {
        super();
        this.setOdataType("#microsoft.graph.onFraudProtectionLoadStartExternalUsersAuthHandler");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnFraudProtectionLoadStartExternalUsersAuthHandler}
     */
    @jakarta.annotation.Nonnull
    public static OnFraudProtectionLoadStartExternalUsersAuthHandler createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnFraudProtectionLoadStartExternalUsersAuthHandler();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("signUp", (n) -> { this.setSignUp(n.getObjectValue(FraudProtectionConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the signUp property value. Specifies the fraud protection configuration for sign-up events.
     * @return a {@link FraudProtectionConfiguration}
     */
    @jakarta.annotation.Nullable
    public FraudProtectionConfiguration getSignUp() {
        return this.backingStore.get("signUp");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("signUp", this.getSignUp());
    }
    /**
     * Sets the signUp property value. Specifies the fraud protection configuration for sign-up events.
     * @param value Value to set for the signUp property.
     */
    public void setSignUp(@jakarta.annotation.Nullable final FraudProtectionConfiguration value) {
        this.backingStore.set("signUp", value);
    }
}
