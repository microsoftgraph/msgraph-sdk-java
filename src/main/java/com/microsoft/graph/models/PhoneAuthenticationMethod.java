package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PhoneAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /** The phone number to text or call for authentication. Phone numbers use the format +{country code} {number}x{extension}, with extension optional. For example, +1 5555551234 or +1 5555551234x123 are valid. Numbers are rejected when creating or updating if they do not match the required format. */
    private String phoneNumber;
    /** The type of this phone. Possible values are: mobile, alternateMobile, or office. */
    private AuthenticationPhoneType phoneType;
    /** Whether a phone is ready to be used for SMS sign-in or not. Possible values are: notSupported, notAllowedByPolicy, notEnabled, phoneNumberNotUnique, ready, or notConfigured, unknownFutureValue. */
    private AuthenticationMethodSignInState smsSignInState;
    /**
     * Instantiates a new PhoneAuthenticationMethod and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PhoneAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.phoneAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PhoneAuthenticationMethod
     */
    @javax.annotation.Nonnull
    public static PhoneAuthenticationMethod createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneAuthenticationMethod();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("phoneType", (n) -> { this.setPhoneType(n.getEnumValue(AuthenticationPhoneType.class)); });
        deserializerMap.put("smsSignInState", (n) -> { this.setSmsSignInState(n.getEnumValue(AuthenticationMethodSignInState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the phoneNumber property value. The phone number to text or call for authentication. Phone numbers use the format +{country code} {number}x{extension}, with extension optional. For example, +1 5555551234 or +1 5555551234x123 are valid. Numbers are rejected when creating or updating if they do not match the required format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the phoneType property value. The type of this phone. Possible values are: mobile, alternateMobile, or office.
     * @return a authenticationPhoneType
     */
    @javax.annotation.Nullable
    public AuthenticationPhoneType getPhoneType() {
        return this.phoneType;
    }
    /**
     * Gets the smsSignInState property value. Whether a phone is ready to be used for SMS sign-in or not. Possible values are: notSupported, notAllowedByPolicy, notEnabled, phoneNumberNotUnique, ready, or notConfigured, unknownFutureValue.
     * @return a authenticationMethodSignInState
     */
    @javax.annotation.Nullable
    public AuthenticationMethodSignInState getSmsSignInState() {
        return this.smsSignInState;
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
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeEnumValue("phoneType", this.getPhoneType());
        writer.writeEnumValue("smsSignInState", this.getSmsSignInState());
    }
    /**
     * Sets the phoneNumber property value. The phone number to text or call for authentication. Phone numbers use the format +{country code} {number}x{extension}, with extension optional. For example, +1 5555551234 or +1 5555551234x123 are valid. Numbers are rejected when creating or updating if they do not match the required format.
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the phoneType property value. The type of this phone. Possible values are: mobile, alternateMobile, or office.
     * @param value Value to set for the phoneType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneType(@javax.annotation.Nullable final AuthenticationPhoneType value) {
        this.phoneType = value;
    }
    /**
     * Sets the smsSignInState property value. Whether a phone is ready to be used for SMS sign-in or not. Possible values are: notSupported, notAllowedByPolicy, notEnabled, phoneNumberNotUnique, ready, or notConfigured, unknownFutureValue.
     * @param value Value to set for the smsSignInState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmsSignInState(@javax.annotation.Nullable final AuthenticationMethodSignInState value) {
        this.smsSignInState = value;
    }
}
