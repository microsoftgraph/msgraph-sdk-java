package com.microsoft.graph.models;

import com.microsoft.graph.models.MicrosoftAuthenticatorAuthenticationMethodTarget;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of authenticationMethodConfiguration entities.
 */
public class AuthenticationMethodTarget extends Entity implements Parsable {
    /** Determines if the user is enforced to register the authentication method. */
    private Boolean _isRegistrationRequired;
    /** The targetType property */
    private AuthenticationMethodTargetType _targetType;
    /**
     * Instantiates a new authenticationMethodTarget and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationMethodTarget() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationMethodTarget
     */
    @javax.annotation.Nonnull
    public static AuthenticationMethodTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.microsoftAuthenticatorAuthenticationMethodTarget": return new MicrosoftAuthenticatorAuthenticationMethodTarget();
            }
        }
        return new AuthenticationMethodTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isRegistrationRequired", (n) -> { this.setIsRegistrationRequired(n.getBooleanValue()); });
        deserializerMap.put("targetType", (n) -> { this.setTargetType(n.getEnumValue(AuthenticationMethodTargetType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isRegistrationRequired property value. Determines if the user is enforced to register the authentication method.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRegistrationRequired() {
        return this._isRegistrationRequired;
    }
    /**
     * Gets the targetType property value. The targetType property
     * @return a authenticationMethodTargetType
     */
    @javax.annotation.Nullable
    public AuthenticationMethodTargetType getTargetType() {
        return this._targetType;
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
        writer.writeBooleanValue("isRegistrationRequired", this.getIsRegistrationRequired());
        writer.writeEnumValue("targetType", this.getTargetType());
    }
    /**
     * Sets the isRegistrationRequired property value. Determines if the user is enforced to register the authentication method.
     * @param value Value to set for the isRegistrationRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRegistrationRequired(@javax.annotation.Nullable final Boolean value) {
        this._isRegistrationRequired = value;
    }
    /**
     * Sets the targetType property value. The targetType property
     * @param value Value to set for the targetType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetType(@javax.annotation.Nullable final AuthenticationMethodTargetType value) {
        this._targetType = value;
    }
}
