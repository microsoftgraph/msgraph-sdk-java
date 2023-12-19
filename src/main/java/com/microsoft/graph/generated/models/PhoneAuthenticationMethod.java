package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /**
     * Instantiates a new PhoneAuthenticationMethod and sets the default values.
     */
    public PhoneAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.phoneAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PhoneAuthenticationMethod
     */
    @jakarta.annotation.Nonnull
    public static PhoneAuthenticationMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneAuthenticationMethod();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("phoneType", (n) -> { this.setPhoneType(n.getEnumValue(PhoneAuthenticationMethodPhoneType::forValue)); });
        deserializerMap.put("smsSignInState", (n) -> { this.setSmsSignInState(n.getEnumValue(PhoneAuthenticationMethodSmsSignInState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the phoneNumber property value. The phone number to text or call for authentication. Phone numbers use the format +{country code} {number}x{extension}, with extension optional. For example, +1 5555551234 or +1 5555551234x123 are valid. Numbers are rejected when creating or updating if they don't match the required format.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.backingStore.get("phoneNumber");
    }
    /**
     * Gets the phoneType property value. The type of this phone. Possible values are: mobile, alternateMobile, or office.
     * @return a PhoneAuthenticationMethodPhoneType
     */
    @jakarta.annotation.Nullable
    public PhoneAuthenticationMethodPhoneType getPhoneType() {
        return this.backingStore.get("phoneType");
    }
    /**
     * Gets the smsSignInState property value. Whether a phone is ready to be used for SMS sign-in or not. Possible values are: notSupported, notAllowedByPolicy, notEnabled, phoneNumberNotUnique, ready, or notConfigured, unknownFutureValue.
     * @return a PhoneAuthenticationMethodSmsSignInState
     */
    @jakarta.annotation.Nullable
    public PhoneAuthenticationMethodSmsSignInState getSmsSignInState() {
        return this.backingStore.get("smsSignInState");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeEnumValue("phoneType", this.getPhoneType());
        writer.writeEnumValue("smsSignInState", this.getSmsSignInState());
    }
    /**
     * Sets the phoneNumber property value. The phone number to text or call for authentication. Phone numbers use the format +{country code} {number}x{extension}, with extension optional. For example, +1 5555551234 or +1 5555551234x123 are valid. Numbers are rejected when creating or updating if they don't match the required format.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phoneNumber", value);
    }
    /**
     * Sets the phoneType property value. The type of this phone. Possible values are: mobile, alternateMobile, or office.
     * @param value Value to set for the phoneType property.
     */
    public void setPhoneType(@jakarta.annotation.Nullable final PhoneAuthenticationMethodPhoneType value) {
        this.backingStore.set("phoneType", value);
    }
    /**
     * Sets the smsSignInState property value. Whether a phone is ready to be used for SMS sign-in or not. Possible values are: notSupported, notAllowedByPolicy, notEnabled, phoneNumberNotUnique, ready, or notConfigured, unknownFutureValue.
     * @param value Value to set for the smsSignInState property.
     */
    public void setSmsSignInState(@jakarta.annotation.Nullable final PhoneAuthenticationMethodSmsSignInState value) {
        this.backingStore.set("smsSignInState", value);
    }
}
