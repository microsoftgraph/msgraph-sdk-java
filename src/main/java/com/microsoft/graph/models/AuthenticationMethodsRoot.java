package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationMethodsRoot extends Entity implements Parsable {
    /**
     * Represents the state of a user's authentication methods, including which methods are registered and which features the user is registered and capable of (such as multi-factor authentication, self-service password reset, and passwordless authentication).
     */
    private java.util.List<UserRegistrationDetails> userRegistrationDetails;
    /**
     * Instantiates a new authenticationMethodsRoot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationMethodsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationMethodsRoot
     */
    @javax.annotation.Nonnull
    public static AuthenticationMethodsRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationMethodsRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userRegistrationDetails", (n) -> { this.setUserRegistrationDetails(n.getCollectionOfObjectValues(UserRegistrationDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the userRegistrationDetails property value. Represents the state of a user's authentication methods, including which methods are registered and which features the user is registered and capable of (such as multi-factor authentication, self-service password reset, and passwordless authentication).
     * @return a userRegistrationDetails
     */
    @javax.annotation.Nullable
    public java.util.List<UserRegistrationDetails> getUserRegistrationDetails() {
        return this.userRegistrationDetails;
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
        writer.writeCollectionOfObjectValues("userRegistrationDetails", this.getUserRegistrationDetails());
    }
    /**
     * Sets the userRegistrationDetails property value. Represents the state of a user's authentication methods, including which methods are registered and which features the user is registered and capable of (such as multi-factor authentication, self-service password reset, and passwordless authentication).
     * @param value Value to set for the userRegistrationDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRegistrationDetails(@javax.annotation.Nullable final java.util.List<UserRegistrationDetails> value) {
        this.userRegistrationDetails = value;
    }
}
