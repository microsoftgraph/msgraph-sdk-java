package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Authentication extends Entity implements Parsable {
    /**
     * The email address registered to a user for authentication.
     */
    private java.util.List<EmailAuthenticationMethod> emailMethods;
    /**
     * Represents the FIDO2 security keys registered to a user for authentication.
     */
    private java.util.List<Fido2AuthenticationMethod> fido2Methods;
    /**
     * Represents all authentication methods registered to a user.
     */
    private java.util.List<AuthenticationMethod> methods;
    /**
     * The details of the Microsoft Authenticator app registered to a user for authentication.
     */
    private java.util.List<MicrosoftAuthenticatorAuthenticationMethod> microsoftAuthenticatorMethods;
    /**
     * Represents the status of a long-running operation.
     */
    private java.util.List<LongRunningOperation> operations;
    /**
     * Represents the password that's registered to a user for authentication. For security, the password itself will never be returned in the object, but action can be taken to reset a password.
     */
    private java.util.List<PasswordAuthenticationMethod> passwordMethods;
    /**
     * The phone numbers registered to a user for authentication.
     */
    private java.util.List<PhoneAuthenticationMethod> phoneMethods;
    /**
     * The software OATH TOTP applications registered to a user for authentication.
     */
    private java.util.List<SoftwareOathAuthenticationMethod> softwareOathMethods;
    /**
     * Represents a Temporary Access Pass registered to a user for authentication through time-limited passcodes.
     */
    private java.util.List<TemporaryAccessPassAuthenticationMethod> temporaryAccessPassMethods;
    /**
     * Represents the Windows Hello for Business authentication method registered to a user for authentication.
     */
    private java.util.List<WindowsHelloForBusinessAuthenticationMethod> windowsHelloForBusinessMethods;
    /**
     * Instantiates a new authentication and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Authentication() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authentication
     */
    @javax.annotation.Nonnull
    public static Authentication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Authentication();
    }
    /**
     * Gets the emailMethods property value. The email address registered to a user for authentication.
     * @return a emailAuthenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<EmailAuthenticationMethod> getEmailMethods() {
        return this.emailMethods;
    }
    /**
     * Gets the fido2Methods property value. Represents the FIDO2 security keys registered to a user for authentication.
     * @return a fido2AuthenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<Fido2AuthenticationMethod> getFido2Methods() {
        return this.fido2Methods;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("emailMethods", (n) -> { this.setEmailMethods(n.getCollectionOfObjectValues(EmailAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("fido2Methods", (n) -> { this.setFido2Methods(n.getCollectionOfObjectValues(Fido2AuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("methods", (n) -> { this.setMethods(n.getCollectionOfObjectValues(AuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftAuthenticatorMethods", (n) -> { this.setMicrosoftAuthenticatorMethods(n.getCollectionOfObjectValues(MicrosoftAuthenticatorAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(LongRunningOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("passwordMethods", (n) -> { this.setPasswordMethods(n.getCollectionOfObjectValues(PasswordAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("phoneMethods", (n) -> { this.setPhoneMethods(n.getCollectionOfObjectValues(PhoneAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("softwareOathMethods", (n) -> { this.setSoftwareOathMethods(n.getCollectionOfObjectValues(SoftwareOathAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("temporaryAccessPassMethods", (n) -> { this.setTemporaryAccessPassMethods(n.getCollectionOfObjectValues(TemporaryAccessPassAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsHelloForBusinessMethods", (n) -> { this.setWindowsHelloForBusinessMethods(n.getCollectionOfObjectValues(WindowsHelloForBusinessAuthenticationMethod::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the methods property value. Represents all authentication methods registered to a user.
     * @return a authenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethod> getMethods() {
        return this.methods;
    }
    /**
     * Gets the microsoftAuthenticatorMethods property value. The details of the Microsoft Authenticator app registered to a user for authentication.
     * @return a microsoftAuthenticatorAuthenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<MicrosoftAuthenticatorAuthenticationMethod> getMicrosoftAuthenticatorMethods() {
        return this.microsoftAuthenticatorMethods;
    }
    /**
     * Gets the operations property value. Represents the status of a long-running operation.
     * @return a longRunningOperation
     */
    @javax.annotation.Nullable
    public java.util.List<LongRunningOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the passwordMethods property value. Represents the password that's registered to a user for authentication. For security, the password itself will never be returned in the object, but action can be taken to reset a password.
     * @return a passwordAuthenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<PasswordAuthenticationMethod> getPasswordMethods() {
        return this.passwordMethods;
    }
    /**
     * Gets the phoneMethods property value. The phone numbers registered to a user for authentication.
     * @return a phoneAuthenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<PhoneAuthenticationMethod> getPhoneMethods() {
        return this.phoneMethods;
    }
    /**
     * Gets the softwareOathMethods property value. The software OATH TOTP applications registered to a user for authentication.
     * @return a softwareOathAuthenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<SoftwareOathAuthenticationMethod> getSoftwareOathMethods() {
        return this.softwareOathMethods;
    }
    /**
     * Gets the temporaryAccessPassMethods property value. Represents a Temporary Access Pass registered to a user for authentication through time-limited passcodes.
     * @return a temporaryAccessPassAuthenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<TemporaryAccessPassAuthenticationMethod> getTemporaryAccessPassMethods() {
        return this.temporaryAccessPassMethods;
    }
    /**
     * Gets the windowsHelloForBusinessMethods property value. Represents the Windows Hello for Business authentication method registered to a user for authentication.
     * @return a windowsHelloForBusinessAuthenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsHelloForBusinessAuthenticationMethod> getWindowsHelloForBusinessMethods() {
        return this.windowsHelloForBusinessMethods;
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
        writer.writeCollectionOfObjectValues("emailMethods", this.getEmailMethods());
        writer.writeCollectionOfObjectValues("fido2Methods", this.getFido2Methods());
        writer.writeCollectionOfObjectValues("methods", this.getMethods());
        writer.writeCollectionOfObjectValues("microsoftAuthenticatorMethods", this.getMicrosoftAuthenticatorMethods());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("passwordMethods", this.getPasswordMethods());
        writer.writeCollectionOfObjectValues("phoneMethods", this.getPhoneMethods());
        writer.writeCollectionOfObjectValues("softwareOathMethods", this.getSoftwareOathMethods());
        writer.writeCollectionOfObjectValues("temporaryAccessPassMethods", this.getTemporaryAccessPassMethods());
        writer.writeCollectionOfObjectValues("windowsHelloForBusinessMethods", this.getWindowsHelloForBusinessMethods());
    }
    /**
     * Sets the emailMethods property value. The email address registered to a user for authentication.
     * @param value Value to set for the emailMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailMethods(@javax.annotation.Nullable final java.util.List<EmailAuthenticationMethod> value) {
        this.emailMethods = value;
    }
    /**
     * Sets the fido2Methods property value. Represents the FIDO2 security keys registered to a user for authentication.
     * @param value Value to set for the fido2Methods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFido2Methods(@javax.annotation.Nullable final java.util.List<Fido2AuthenticationMethod> value) {
        this.fido2Methods = value;
    }
    /**
     * Sets the methods property value. Represents all authentication methods registered to a user.
     * @param value Value to set for the methods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMethods(@javax.annotation.Nullable final java.util.List<AuthenticationMethod> value) {
        this.methods = value;
    }
    /**
     * Sets the microsoftAuthenticatorMethods property value. The details of the Microsoft Authenticator app registered to a user for authentication.
     * @param value Value to set for the microsoftAuthenticatorMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftAuthenticatorMethods(@javax.annotation.Nullable final java.util.List<MicrosoftAuthenticatorAuthenticationMethod> value) {
        this.microsoftAuthenticatorMethods = value;
    }
    /**
     * Sets the operations property value. Represents the status of a long-running operation.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<LongRunningOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the passwordMethods property value. Represents the password that's registered to a user for authentication. For security, the password itself will never be returned in the object, but action can be taken to reset a password.
     * @param value Value to set for the passwordMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMethods(@javax.annotation.Nullable final java.util.List<PasswordAuthenticationMethod> value) {
        this.passwordMethods = value;
    }
    /**
     * Sets the phoneMethods property value. The phone numbers registered to a user for authentication.
     * @param value Value to set for the phoneMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneMethods(@javax.annotation.Nullable final java.util.List<PhoneAuthenticationMethod> value) {
        this.phoneMethods = value;
    }
    /**
     * Sets the softwareOathMethods property value. The software OATH TOTP applications registered to a user for authentication.
     * @param value Value to set for the softwareOathMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareOathMethods(@javax.annotation.Nullable final java.util.List<SoftwareOathAuthenticationMethod> value) {
        this.softwareOathMethods = value;
    }
    /**
     * Sets the temporaryAccessPassMethods property value. Represents a Temporary Access Pass registered to a user for authentication through time-limited passcodes.
     * @param value Value to set for the temporaryAccessPassMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemporaryAccessPassMethods(@javax.annotation.Nullable final java.util.List<TemporaryAccessPassAuthenticationMethod> value) {
        this.temporaryAccessPassMethods = value;
    }
    /**
     * Sets the windowsHelloForBusinessMethods property value. Represents the Windows Hello for Business authentication method registered to a user for authentication.
     * @param value Value to set for the windowsHelloForBusinessMethods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsHelloForBusinessMethods(@javax.annotation.Nullable final java.util.List<WindowsHelloForBusinessAuthenticationMethod> value) {
        this.windowsHelloForBusinessMethods = value;
    }
}
