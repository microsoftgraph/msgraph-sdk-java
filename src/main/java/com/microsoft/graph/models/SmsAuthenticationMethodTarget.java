package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SmsAuthenticationMethodTarget extends AuthenticationMethodTarget implements Parsable {
    /** Determines if users can use this authentication method to sign in to Azure AD. true if users can use this method for primary authentication, otherwise false. */
    private Boolean isUsableForSignIn;
    /**
     * Instantiates a new SmsAuthenticationMethodTarget and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SmsAuthenticationMethodTarget() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SmsAuthenticationMethodTarget
     */
    @javax.annotation.Nonnull
    public static SmsAuthenticationMethodTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SmsAuthenticationMethodTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isUsableForSignIn", (n) -> { this.setIsUsableForSignIn(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isUsableForSignIn property value. Determines if users can use this authentication method to sign in to Azure AD. true if users can use this method for primary authentication, otherwise false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsUsableForSignIn() {
        return this.isUsableForSignIn;
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
        writer.writeBooleanValue("isUsableForSignIn", this.getIsUsableForSignIn());
    }
    /**
     * Sets the isUsableForSignIn property value. Determines if users can use this authentication method to sign in to Azure AD. true if users can use this method for primary authentication, otherwise false.
     * @param value Value to set for the isUsableForSignIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsUsableForSignIn(@javax.annotation.Nullable final Boolean value) {
        this.isUsableForSignIn = value;
    }
}
