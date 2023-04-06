package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftAuthenticatorAuthenticationMethodTarget extends AuthenticationMethodTarget implements Parsable {
    /** The authenticationMode property */
    private MicrosoftAuthenticatorAuthenticationMode authenticationMode;
    /**
     * Instantiates a new MicrosoftAuthenticatorAuthenticationMethodTarget and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftAuthenticatorAuthenticationMethodTarget() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftAuthenticatorAuthenticationMethodTarget
     */
    @javax.annotation.Nonnull
    public static MicrosoftAuthenticatorAuthenticationMethodTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftAuthenticatorAuthenticationMethodTarget();
    }
    /**
     * Gets the authenticationMode property value. The authenticationMode property
     * @return a microsoftAuthenticatorAuthenticationMode
     */
    @javax.annotation.Nullable
    public MicrosoftAuthenticatorAuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMode", (n) -> { this.setAuthenticationMode(n.getEnumValue(MicrosoftAuthenticatorAuthenticationMode.class)); });
        return deserializerMap;
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
        writer.writeEnumValue("authenticationMode", this.getAuthenticationMode());
    }
    /**
     * Sets the authenticationMode property value. The authenticationMode property
     * @param value Value to set for the authenticationMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMode(@javax.annotation.Nullable final MicrosoftAuthenticatorAuthenticationMode value) {
        this.authenticationMode = value;
    }
}
