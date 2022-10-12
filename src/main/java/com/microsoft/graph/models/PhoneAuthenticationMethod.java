package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PhoneAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /** The phone number to text or call for authentication. Phone numbers use the format +{country code} {number}x{extension}, with extension optional. For example, +1 5555551234 or +1 5555551234x123 are valid. Numbers are rejected when creating or updating if they do not match the required format. */
    private String _phoneNumber;
    /** The phoneType property */
    private AuthenticationPhoneType _phoneType;
    /** The smsSignInState property */
    private AuthenticationMethodSignInState _smsSignInState;
    /**
     * Instantiates a new phoneAuthenticationMethod and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PhoneAuthenticationMethod() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a phoneAuthenticationMethod
     */
    @javax.annotation.Nonnull
    public static PhoneAuthenticationMethod createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneAuthenticationMethod();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PhoneAuthenticationMethod currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("phoneNumber", (n) -> { currentObject.setPhoneNumber(n.getStringValue()); });
            this.put("phoneType", (n) -> { currentObject.setPhoneType(n.getEnumValue(AuthenticationPhoneType.class)); });
            this.put("smsSignInState", (n) -> { currentObject.setSmsSignInState(n.getEnumValue(AuthenticationMethodSignInState.class)); });
        }};
    }
    /**
     * Gets the phoneNumber property value. The phone number to text or call for authentication. Phone numbers use the format +{country code} {number}x{extension}, with extension optional. For example, +1 5555551234 or +1 5555551234x123 are valid. Numbers are rejected when creating or updating if they do not match the required format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this._phoneNumber;
    }
    /**
     * Gets the phoneType property value. The phoneType property
     * @return a authenticationPhoneType
     */
    @javax.annotation.Nullable
    public AuthenticationPhoneType getPhoneType() {
        return this._phoneType;
    }
    /**
     * Gets the smsSignInState property value. The smsSignInState property
     * @return a authenticationMethodSignInState
     */
    @javax.annotation.Nullable
    public AuthenticationMethodSignInState getSmsSignInState() {
        return this._smsSignInState;
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
        this._phoneNumber = value;
    }
    /**
     * Sets the phoneType property value. The phoneType property
     * @param value Value to set for the phoneType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneType(@javax.annotation.Nullable final AuthenticationPhoneType value) {
        this._phoneType = value;
    }
    /**
     * Sets the smsSignInState property value. The smsSignInState property
     * @param value Value to set for the smsSignInState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmsSignInState(@javax.annotation.Nullable final AuthenticationMethodSignInState value) {
        this._smsSignInState = value;
    }
}
