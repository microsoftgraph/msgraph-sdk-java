package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Authentication extends Entity implements Parsable {
    /** Represents the FIDO2 security keys registered to a user for authentication.  */
    private java.util.List<Fido2AuthenticationMethod> _fido2Methods;
    /** Represents all authentication methods registered to a user.  */
    private java.util.List<AuthenticationMethod> _methods;
    /** The details of the Microsoft Authenticator app registered to a user for authentication.  */
    private java.util.List<MicrosoftAuthenticatorAuthenticationMethod> _microsoftAuthenticatorMethods;
    /** Represents the Windows Hello for Business authentication method registered to a user for authentication.  */
    private java.util.List<WindowsHelloForBusinessAuthenticationMethod> _windowsHelloForBusinessMethods;
    /**
     * Instantiates a new authentication and sets the default values.
     * @return a void
     */
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
     * Gets the fido2Methods property value. Represents the FIDO2 security keys registered to a user for authentication.
     * @return a fido2AuthenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<Fido2AuthenticationMethod> getFido2Methods() {
        return this._fido2Methods;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Authentication currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("fido2Methods", (n) -> { currentObject.setFido2Methods(n.getCollectionOfObjectValues(Fido2AuthenticationMethod::createFromDiscriminatorValue)); });
            this.put("methods", (n) -> { currentObject.setMethods(n.getCollectionOfObjectValues(AuthenticationMethod::createFromDiscriminatorValue)); });
            this.put("microsoftAuthenticatorMethods", (n) -> { currentObject.setMicrosoftAuthenticatorMethods(n.getCollectionOfObjectValues(MicrosoftAuthenticatorAuthenticationMethod::createFromDiscriminatorValue)); });
            this.put("windowsHelloForBusinessMethods", (n) -> { currentObject.setWindowsHelloForBusinessMethods(n.getCollectionOfObjectValues(WindowsHelloForBusinessAuthenticationMethod::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the methods property value. Represents all authentication methods registered to a user.
     * @return a authenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethod> getMethods() {
        return this._methods;
    }
    /**
     * Gets the microsoftAuthenticatorMethods property value. The details of the Microsoft Authenticator app registered to a user for authentication.
     * @return a microsoftAuthenticatorAuthenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<MicrosoftAuthenticatorAuthenticationMethod> getMicrosoftAuthenticatorMethods() {
        return this._microsoftAuthenticatorMethods;
    }
    /**
     * Gets the windowsHelloForBusinessMethods property value. Represents the Windows Hello for Business authentication method registered to a user for authentication.
     * @return a windowsHelloForBusinessAuthenticationMethod
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsHelloForBusinessAuthenticationMethod> getWindowsHelloForBusinessMethods() {
        return this._windowsHelloForBusinessMethods;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("fido2Methods", this.getFido2Methods());
        writer.writeCollectionOfObjectValues("methods", this.getMethods());
        writer.writeCollectionOfObjectValues("microsoftAuthenticatorMethods", this.getMicrosoftAuthenticatorMethods());
        writer.writeCollectionOfObjectValues("windowsHelloForBusinessMethods", this.getWindowsHelloForBusinessMethods());
    }
    /**
     * Sets the fido2Methods property value. Represents the FIDO2 security keys registered to a user for authentication.
     * @param value Value to set for the fido2Methods property.
     * @return a void
     */
    public void setFido2Methods(@javax.annotation.Nullable final java.util.List<Fido2AuthenticationMethod> value) {
        this._fido2Methods = value;
    }
    /**
     * Sets the methods property value. Represents all authentication methods registered to a user.
     * @param value Value to set for the methods property.
     * @return a void
     */
    public void setMethods(@javax.annotation.Nullable final java.util.List<AuthenticationMethod> value) {
        this._methods = value;
    }
    /**
     * Sets the microsoftAuthenticatorMethods property value. The details of the Microsoft Authenticator app registered to a user for authentication.
     * @param value Value to set for the microsoftAuthenticatorMethods property.
     * @return a void
     */
    public void setMicrosoftAuthenticatorMethods(@javax.annotation.Nullable final java.util.List<MicrosoftAuthenticatorAuthenticationMethod> value) {
        this._microsoftAuthenticatorMethods = value;
    }
    /**
     * Sets the windowsHelloForBusinessMethods property value. Represents the Windows Hello for Business authentication method registered to a user for authentication.
     * @param value Value to set for the windowsHelloForBusinessMethods property.
     * @return a void
     */
    public void setWindowsHelloForBusinessMethods(@javax.annotation.Nullable final java.util.List<WindowsHelloForBusinessAuthenticationMethod> value) {
        this._windowsHelloForBusinessMethods = value;
    }
}
