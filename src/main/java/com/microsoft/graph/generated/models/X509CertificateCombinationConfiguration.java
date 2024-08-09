package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class X509CertificateCombinationConfiguration extends AuthenticationCombinationConfiguration implements Parsable {
    /**
     * Instantiates a new {@link X509CertificateCombinationConfiguration} and sets the default values.
     */
    public X509CertificateCombinationConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.x509CertificateCombinationConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link X509CertificateCombinationConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static X509CertificateCombinationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new X509CertificateCombinationConfiguration();
    }
    /**
     * Gets the allowedIssuerSkis property value. A list of allowed subject key identifier values.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedIssuerSkis() {
        return this.backingStore.get("allowedIssuerSkis");
    }
    /**
     * Gets the allowedPolicyOIDs property value. A list of allowed policy OIDs.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedPolicyOIDs() {
        return this.backingStore.get("allowedPolicyOIDs");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedIssuerSkis", (n) -> { this.setAllowedIssuerSkis(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allowedPolicyOIDs", (n) -> { this.setAllowedPolicyOIDs(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("allowedIssuerSkis", this.getAllowedIssuerSkis());
        writer.writeCollectionOfPrimitiveValues("allowedPolicyOIDs", this.getAllowedPolicyOIDs());
    }
    /**
     * Sets the allowedIssuerSkis property value. A list of allowed subject key identifier values.
     * @param value Value to set for the allowedIssuerSkis property.
     */
    public void setAllowedIssuerSkis(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedIssuerSkis", value);
    }
    /**
     * Sets the allowedPolicyOIDs property value. A list of allowed policy OIDs.
     * @param value Value to set for the allowedPolicyOIDs property.
     */
    public void setAllowedPolicyOIDs(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedPolicyOIDs", value);
    }
}
