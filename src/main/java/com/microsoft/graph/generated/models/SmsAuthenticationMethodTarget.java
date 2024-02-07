package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SmsAuthenticationMethodTarget extends AuthenticationMethodTarget implements Parsable {
    /**
     * Instantiates a new SmsAuthenticationMethodTarget and sets the default values.
     */
    public SmsAuthenticationMethodTarget() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SmsAuthenticationMethodTarget
     */
    @jakarta.annotation.Nonnull
    public static SmsAuthenticationMethodTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SmsAuthenticationMethodTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isUsableForSignIn", (n) -> { this.setIsUsableForSignIn(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isUsableForSignIn property value. Determines if users can use this authentication method to sign in to Microsoft Entra ID. true if users can use this method for primary authentication, otherwise false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsUsableForSignIn() {
        return this.backingStore.get("isUsableForSignIn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isUsableForSignIn", this.getIsUsableForSignIn());
    }
    /**
     * Sets the isUsableForSignIn property value. Determines if users can use this authentication method to sign in to Microsoft Entra ID. true if users can use this method for primary authentication, otherwise false.
     * @param value Value to set for the isUsableForSignIn property.
     */
    public void setIsUsableForSignIn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isUsableForSignIn", value);
    }
}
