package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClientCertificateAuthentication extends ApiAuthenticationConfigurationBase implements Parsable {
    /**
     * The list of certificates uploaded for this API connector.
     */
    private java.util.List<Pkcs12CertificateInformation> certificateList;
    /**
     * Instantiates a new clientCertificateAuthentication and sets the default values.
     */
    public ClientCertificateAuthentication() {
        super();
        this.setOdataType("#microsoft.graph.clientCertificateAuthentication");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a clientCertificateAuthentication
     */
    @jakarta.annotation.Nonnull
    public static ClientCertificateAuthentication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClientCertificateAuthentication();
    }
    /**
     * Gets the certificateList property value. The list of certificates uploaded for this API connector.
     * @return a pkcs12CertificateInformation
     */
    @jakarta.annotation.Nullable
    public java.util.List<Pkcs12CertificateInformation> getCertificateList() {
        return this.certificateList;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateList", (n) -> { this.setCertificateList(n.getCollectionOfObjectValues(Pkcs12CertificateInformation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("certificateList", this.getCertificateList());
    }
    /**
     * Sets the certificateList property value. The list of certificates uploaded for this API connector.
     * @param value Value to set for the certificateList property.
     */
    public void setCertificateList(@jakarta.annotation.Nullable final java.util.List<Pkcs12CertificateInformation> value) {
        this.certificateList = value;
    }
}
