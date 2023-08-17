package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppleManagedIdentityProvider extends IdentityProviderBase implements Parsable {
    /**
     * The certificate data, which is a long string of text from the certificate. Can be null.
     */
    private String certificateData;
    /**
     * The Apple developer identifier. Required.
     */
    private String developerId;
    /**
     * The Apple key identifier. Required.
     */
    private String keyId;
    /**
     * The Apple service identifier. Required.
     */
    private String serviceId;
    /**
     * Instantiates a new appleManagedIdentityProvider and sets the default values.
     */
    public AppleManagedIdentityProvider() {
        super();
        this.setOdataType("#microsoft.graph.appleManagedIdentityProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appleManagedIdentityProvider
     */
    @jakarta.annotation.Nonnull
    public static AppleManagedIdentityProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppleManagedIdentityProvider();
    }
    /**
     * Gets the certificateData property value. The certificate data, which is a long string of text from the certificate. Can be null.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificateData() {
        return this.certificateData;
    }
    /**
     * Gets the developerId property value. The Apple developer identifier. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeveloperId() {
        return this.developerId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateData", (n) -> { this.setCertificateData(n.getStringValue()); });
        deserializerMap.put("developerId", (n) -> { this.setDeveloperId(n.getStringValue()); });
        deserializerMap.put("keyId", (n) -> { this.setKeyId(n.getStringValue()); });
        deserializerMap.put("serviceId", (n) -> { this.setServiceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyId property value. The Apple key identifier. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getKeyId() {
        return this.keyId;
    }
    /**
     * Gets the serviceId property value. The Apple service identifier. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getServiceId() {
        return this.serviceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("certificateData", this.getCertificateData());
        writer.writeStringValue("developerId", this.getDeveloperId());
        writer.writeStringValue("keyId", this.getKeyId());
        writer.writeStringValue("serviceId", this.getServiceId());
    }
    /**
     * Sets the certificateData property value. The certificate data, which is a long string of text from the certificate. Can be null.
     * @param value Value to set for the certificateData property.
     */
    public void setCertificateData(@jakarta.annotation.Nullable final String value) {
        this.certificateData = value;
    }
    /**
     * Sets the developerId property value. The Apple developer identifier. Required.
     * @param value Value to set for the developerId property.
     */
    public void setDeveloperId(@jakarta.annotation.Nullable final String value) {
        this.developerId = value;
    }
    /**
     * Sets the keyId property value. The Apple key identifier. Required.
     * @param value Value to set for the keyId property.
     */
    public void setKeyId(@jakarta.annotation.Nullable final String value) {
        this.keyId = value;
    }
    /**
     * Sets the serviceId property value. The Apple service identifier. Required.
     * @param value Value to set for the serviceId property.
     */
    public void setServiceId(@jakarta.annotation.Nullable final String value) {
        this.serviceId = value;
    }
}
