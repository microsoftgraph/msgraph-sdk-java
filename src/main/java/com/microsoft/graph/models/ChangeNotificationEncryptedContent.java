package com.microsoft.graph.models;

import com.microsoft.graph.core.models.DecryptableContent;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ChangeNotificationEncryptedContent implements DecryptableContent, AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ChangeNotificationEncryptedContent} and sets the default values.
     */
    public ChangeNotificationEncryptedContent() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ChangeNotificationEncryptedContent}
     */
    @jakarta.annotation.Nonnull
    public static ChangeNotificationEncryptedContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangeNotificationEncryptedContent();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the data property value. The data property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getData() {
        return this.backingStore.get("data");
    }
    /**
     * Gets the dataKey property value. The dataKey property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataKey() {
        return this.backingStore.get("dataKey");
    }
    /**
     * Gets the dataSignature property value. The dataSignature property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataSignature() {
        return this.backingStore.get("dataSignature");
    }
    /**
     * Gets the encryptionCertificateId property value. The encryptionCertificateId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEncryptionCertificateId() {
        return this.backingStore.get("encryptionCertificateId");
    }
    /**
     * Gets the encryptionCertificateThumbprint property value. The encryptionCertificateThumbprint property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEncryptionCertificateThumbprint() {
        return this.backingStore.get("encryptionCertificateThumbprint");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("data", (n) -> { this.setData(n.getStringValue()); });
        deserializerMap.put("dataKey", (n) -> { this.setDataKey(n.getStringValue()); });
        deserializerMap.put("dataSignature", (n) -> { this.setDataSignature(n.getStringValue()); });
        deserializerMap.put("encryptionCertificateId", (n) -> { this.setEncryptionCertificateId(n.getStringValue()); });
        deserializerMap.put("encryptionCertificateThumbprint", (n) -> { this.setEncryptionCertificateThumbprint(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("data", this.getData());
        writer.writeStringValue("dataKey", this.getDataKey());
        writer.writeStringValue("dataSignature", this.getDataSignature());
        writer.writeStringValue("encryptionCertificateId", this.getEncryptionCertificateId());
        writer.writeStringValue("encryptionCertificateThumbprint", this.getEncryptionCertificateThumbprint());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the data property value. The data property
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("data", value);
    }
    /**
     * Sets the dataKey property value. The dataKey property
     * @param value Value to set for the dataKey property.
     */
    public void setDataKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dataKey", value);
    }
    /**
     * Sets the dataSignature property value. The dataSignature property
     * @param value Value to set for the dataSignature property.
     */
    public void setDataSignature(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dataSignature", value);
    }
    /**
     * Sets the encryptionCertificateId property value. The encryptionCertificateId property
     * @param value Value to set for the encryptionCertificateId property.
     */
    public void setEncryptionCertificateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("encryptionCertificateId", value);
    }
    /**
     * Sets the encryptionCertificateThumbprint property value. The encryptionCertificateThumbprint property
     * @param value Value to set for the encryptionCertificateThumbprint property.
     */
    public void setEncryptionCertificateThumbprint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("encryptionCertificateThumbprint", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
