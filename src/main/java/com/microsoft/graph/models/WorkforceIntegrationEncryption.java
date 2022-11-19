package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkforceIntegrationEncryption implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Possible values are: sharedSecret, unknownFutureValue. */
    private WorkforceIntegrationEncryptionProtocol _protocol;
    /** Encryption shared secret. */
    private String _secret;
    /**
     * Instantiates a new workforceIntegrationEncryption and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkforceIntegrationEncryption() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.workforceIntegrationEncryption");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workforceIntegrationEncryption
     */
    @javax.annotation.Nonnull
    public static WorkforceIntegrationEncryption createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkforceIntegrationEncryption();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkforceIntegrationEncryption currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("protocol", (n) -> { currentObject.setProtocol(n.getEnumValue(WorkforceIntegrationEncryptionProtocol.class)); });
        deserializerMap.put("secret", (n) -> { currentObject.setSecret(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the protocol property value. Possible values are: sharedSecret, unknownFutureValue.
     * @return a workforceIntegrationEncryptionProtocol
     */
    @javax.annotation.Nullable
    public WorkforceIntegrationEncryptionProtocol getProtocol() {
        return this._protocol;
    }
    /**
     * Gets the secret property value. Encryption shared secret.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecret() {
        return this._secret;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("protocol", this.getProtocol());
        writer.writeStringValue("secret", this.getSecret());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the protocol property value. Possible values are: sharedSecret, unknownFutureValue.
     * @param value Value to set for the protocol property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProtocol(@javax.annotation.Nullable final WorkforceIntegrationEncryptionProtocol value) {
        this._protocol = value;
    }
    /**
     * Sets the secret property value. Encryption shared secret.
     * @param value Value to set for the secret property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecret(@javax.annotation.Nullable final String value) {
        this._secret = value;
    }
}
