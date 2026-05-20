package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifiableCredentialAuthenticationMethodTarget extends AuthenticationMethodTarget implements Parsable {
    /**
     * Instantiates a new {@link VerifiableCredentialAuthenticationMethodTarget} and sets the default values.
     */
    public VerifiableCredentialAuthenticationMethodTarget() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VerifiableCredentialAuthenticationMethodTarget}
     */
    @jakarta.annotation.Nonnull
    public static VerifiableCredentialAuthenticationMethodTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifiableCredentialAuthenticationMethodTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("verifiedIdProfiles", (n) -> { this.setVerifiedIdProfiles(n.getCollectionOfPrimitiveValues(UUID.class)); });
        return deserializerMap;
    }
    /**
     * Gets the verifiedIdProfiles property value. A collection of Verified ID profile IDs. The profiles define the credentials that users can present to prove their id when signing in, onboarding, or recovering. Verified ID profiles are managed through the Verified ID APIs.
     * @return a {@link java.util.List<UUID>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getVerifiedIdProfiles() {
        return this.backingStore.get("verifiedIdProfiles");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("verifiedIdProfiles", this.getVerifiedIdProfiles());
    }
    /**
     * Sets the verifiedIdProfiles property value. A collection of Verified ID profile IDs. The profiles define the credentials that users can present to prove their id when signing in, onboarding, or recovering. Verified ID profiles are managed through the Verified ID APIs.
     * @param value Value to set for the verifiedIdProfiles property.
     */
    public void setVerifiedIdProfiles(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.backingStore.set("verifiedIdProfiles", value);
    }
}
