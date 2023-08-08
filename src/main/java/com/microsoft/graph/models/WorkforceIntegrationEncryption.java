package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkforceIntegrationEncryption implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Possible values are: sharedSecret, unknownFutureValue.
     */
    private WorkforceIntegrationEncryptionProtocol protocol;
    /**
     * Encryption shared secret.
     */
    private String secret;
    /**
     * Instantiates a new workforceIntegrationEncryption and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WorkforceIntegrationEncryption() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workforceIntegrationEncryption
     */
    @jakarta.annotation.Nonnull
    public static WorkforceIntegrationEncryption createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkforceIntegrationEncryption();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumValue(WorkforceIntegrationEncryptionProtocol.class)); });
        deserializerMap.put("secret", (n) -> { this.setSecret(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the protocol property value. Possible values are: sharedSecret, unknownFutureValue.
     * @return a workforceIntegrationEncryptionProtocol
     */
    @jakarta.annotation.Nullable
    public WorkforceIntegrationEncryptionProtocol getProtocol() {
        return this.protocol;
    }
    /**
     * Gets the secret property value. Encryption shared secret.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSecret() {
        return this.secret;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("protocol", this.getProtocol());
        writer.writeStringValue("secret", this.getSecret());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the protocol property value. Possible values are: sharedSecret, unknownFutureValue.
     * @param value Value to set for the protocol property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProtocol(@jakarta.annotation.Nullable final WorkforceIntegrationEncryptionProtocol value) {
        this.protocol = value;
    }
    /**
     * Sets the secret property value. Encryption shared secret.
     * @param value Value to set for the secret property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSecret(@jakarta.annotation.Nullable final String value) {
        this.secret = value;
    }
}
