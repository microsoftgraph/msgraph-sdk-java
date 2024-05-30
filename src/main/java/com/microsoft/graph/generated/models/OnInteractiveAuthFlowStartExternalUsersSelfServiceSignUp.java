package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnInteractiveAuthFlowStartExternalUsersSelfServiceSignUp extends OnInteractiveAuthFlowStartHandler implements Parsable {
    /**
     * Instantiates a new {@link OnInteractiveAuthFlowStartExternalUsersSelfServiceSignUp} and sets the default values.
     */
    public OnInteractiveAuthFlowStartExternalUsersSelfServiceSignUp() {
        super();
        this.setOdataType("#microsoft.graph.onInteractiveAuthFlowStartExternalUsersSelfServiceSignUp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnInteractiveAuthFlowStartExternalUsersSelfServiceSignUp}
     */
    @jakarta.annotation.Nonnull
    public static OnInteractiveAuthFlowStartExternalUsersSelfServiceSignUp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnInteractiveAuthFlowStartExternalUsersSelfServiceSignUp();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isSignUpAllowed", (n) -> { this.setIsSignUpAllowed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSignUpAllowed property value. Optional. Specifies whether the authentication flow includes an option to sign up (create account) and sign in. Default value is false meaning only sign in is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSignUpAllowed() {
        return this.backingStore.get("isSignUpAllowed");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isSignUpAllowed", this.getIsSignUpAllowed());
    }
    /**
     * Sets the isSignUpAllowed property value. Optional. Specifies whether the authentication flow includes an option to sign up (create account) and sign in. Default value is false meaning only sign in is enabled.
     * @param value Value to set for the isSignUpAllowed property.
     */
    public void setIsSignUpAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSignUpAllowed", value);
    }
}
