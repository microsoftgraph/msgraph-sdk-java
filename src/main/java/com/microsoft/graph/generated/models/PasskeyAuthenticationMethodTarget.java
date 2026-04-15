package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PasskeyAuthenticationMethodTarget extends AuthenticationMethodTarget implements Parsable {
    /**
     * Instantiates a new {@link PasskeyAuthenticationMethodTarget} and sets the default values.
     */
    public PasskeyAuthenticationMethodTarget() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PasskeyAuthenticationMethodTarget}
     */
    @jakarta.annotation.Nonnull
    public static PasskeyAuthenticationMethodTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasskeyAuthenticationMethodTarget();
    }
    /**
     * Gets the allowedPasskeyProfiles property value. List of passkey profiles scoped to the targets. Required.
     * @return a {@link java.util.List<UUID>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getAllowedPasskeyProfiles() {
        return this.backingStore.get("allowedPasskeyProfiles");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedPasskeyProfiles", (n) -> { this.setAllowedPasskeyProfiles(n.getCollectionOfPrimitiveValues(UUID.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("allowedPasskeyProfiles", this.getAllowedPasskeyProfiles());
    }
    /**
     * Sets the allowedPasskeyProfiles property value. List of passkey profiles scoped to the targets. Required.
     * @param value Value to set for the allowedPasskeyProfiles property.
     */
    public void setAllowedPasskeyProfiles(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.backingStore.set("allowedPasskeyProfiles", value);
    }
}
