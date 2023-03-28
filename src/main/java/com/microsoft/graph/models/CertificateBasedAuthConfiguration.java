package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CertificateBasedAuthConfiguration extends Entity implements Parsable {
    /** Collection of certificate authorities which creates a trusted certificate chain. */
    private java.util.List<CertificateAuthority> certificateAuthorities;
    /**
     * Instantiates a new certificateBasedAuthConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CertificateBasedAuthConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a certificateBasedAuthConfiguration
     */
    @javax.annotation.Nonnull
    public static CertificateBasedAuthConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateBasedAuthConfiguration();
    }
    /**
     * Gets the certificateAuthorities property value. Collection of certificate authorities which creates a trusted certificate chain.
     * @return a certificateAuthority
     */
    @javax.annotation.Nullable
    public java.util.List<CertificateAuthority> getCertificateAuthorities() {
        return this.certificateAuthorities;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateAuthorities", (n) -> { this.setCertificateAuthorities(n.getCollectionOfObjectValues(CertificateAuthority::createFromDiscriminatorValue)); });
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
        writer.writeCollectionOfObjectValues("certificateAuthorities", this.getCertificateAuthorities());
    }
    /**
     * Sets the certificateAuthorities property value. Collection of certificate authorities which creates a trusted certificate chain.
     * @param value Value to set for the certificateAuthorities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateAuthorities(@javax.annotation.Nullable final java.util.List<CertificateAuthority> value) {
        this.certificateAuthorities = value;
    }
}
