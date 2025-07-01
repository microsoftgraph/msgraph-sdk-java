package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PublicKeyInfrastructureRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PublicKeyInfrastructureRoot} and sets the default values.
     */
    public PublicKeyInfrastructureRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PublicKeyInfrastructureRoot}
     */
    @jakarta.annotation.Nonnull
    public static PublicKeyInfrastructureRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PublicKeyInfrastructureRoot();
    }
    /**
     * Gets the certificateBasedAuthConfigurations property value. The collection of public key infrastructure instances for the certificate-based authentication feature for users.
     * @return a {@link java.util.List<CertificateBasedAuthPki>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CertificateBasedAuthPki> getCertificateBasedAuthConfigurations() {
        return this.backingStore.get("certificateBasedAuthConfigurations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateBasedAuthConfigurations", (n) -> { this.setCertificateBasedAuthConfigurations(n.getCollectionOfObjectValues(CertificateBasedAuthPki::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("certificateBasedAuthConfigurations", this.getCertificateBasedAuthConfigurations());
    }
    /**
     * Sets the certificateBasedAuthConfigurations property value. The collection of public key infrastructure instances for the certificate-based authentication feature for users.
     * @param value Value to set for the certificateBasedAuthConfigurations property.
     */
    public void setCertificateBasedAuthConfigurations(@jakarta.annotation.Nullable final java.util.List<CertificateBasedAuthPki> value) {
        this.backingStore.set("certificateBasedAuthConfigurations", value);
    }
}
