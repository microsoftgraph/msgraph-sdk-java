package com.microsoft.graph.models;

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
/**
 * Contains properties for file encryption information for the content version of a line of business app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileEncryptionInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link FileEncryptionInfo} and sets the default values.
     */
    public FileEncryptionInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FileEncryptionInfo}
     */
    @jakarta.annotation.Nonnull
    public static FileEncryptionInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileEncryptionInfo();
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
     * Gets the encryptionKey property value. The key used to encrypt the file content.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getEncryptionKey() {
        return this.backingStore.get("encryptionKey");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("encryptionKey", (n) -> { this.setEncryptionKey(n.getByteArrayValue()); });
        deserializerMap.put("fileDigest", (n) -> { this.setFileDigest(n.getByteArrayValue()); });
        deserializerMap.put("fileDigestAlgorithm", (n) -> { this.setFileDigestAlgorithm(n.getStringValue()); });
        deserializerMap.put("initializationVector", (n) -> { this.setInitializationVector(n.getByteArrayValue()); });
        deserializerMap.put("mac", (n) -> { this.setMac(n.getByteArrayValue()); });
        deserializerMap.put("macKey", (n) -> { this.setMacKey(n.getByteArrayValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("profileIdentifier", (n) -> { this.setProfileIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileDigest property value. The file digest prior to encryption. ProfileVersion1 requires a non-null FileDigest.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getFileDigest() {
        return this.backingStore.get("fileDigest");
    }
    /**
     * Gets the fileDigestAlgorithm property value. The file digest algorithm. ProfileVersion1 currently only supports SHA256 for the FileDigestAlgorithm.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileDigestAlgorithm() {
        return this.backingStore.get("fileDigestAlgorithm");
    }
    /**
     * Gets the initializationVector property value. The initialization vector (IV) used for the encryption algorithm. Must be 16 bytes.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getInitializationVector() {
        return this.backingStore.get("initializationVector");
    }
    /**
     * Gets the mac property value. The hash of the concatenation of the IV and encrypted file content. Must be 32 bytes.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getMac() {
        return this.backingStore.get("mac");
    }
    /**
     * Gets the macKey property value. The key used to compute the message authentication code of the concatenation of the IV and encrypted file content. Must be 32 bytes.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getMacKey() {
        return this.backingStore.get("macKey");
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
     * Gets the profileIdentifier property value. The profile identifier. Maps to the strategy used to encrypt the file. Currently, only ProfileVersion1 is supported.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProfileIdentifier() {
        return this.backingStore.get("profileIdentifier");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("encryptionKey", this.getEncryptionKey());
        writer.writeByteArrayValue("fileDigest", this.getFileDigest());
        writer.writeStringValue("fileDigestAlgorithm", this.getFileDigestAlgorithm());
        writer.writeByteArrayValue("initializationVector", this.getInitializationVector());
        writer.writeByteArrayValue("mac", this.getMac());
        writer.writeByteArrayValue("macKey", this.getMacKey());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("profileIdentifier", this.getProfileIdentifier());
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
     * Sets the encryptionKey property value. The key used to encrypt the file content.
     * @param value Value to set for the encryptionKey property.
     */
    public void setEncryptionKey(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("encryptionKey", value);
    }
    /**
     * Sets the fileDigest property value. The file digest prior to encryption. ProfileVersion1 requires a non-null FileDigest.
     * @param value Value to set for the fileDigest property.
     */
    public void setFileDigest(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("fileDigest", value);
    }
    /**
     * Sets the fileDigestAlgorithm property value. The file digest algorithm. ProfileVersion1 currently only supports SHA256 for the FileDigestAlgorithm.
     * @param value Value to set for the fileDigestAlgorithm property.
     */
    public void setFileDigestAlgorithm(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileDigestAlgorithm", value);
    }
    /**
     * Sets the initializationVector property value. The initialization vector (IV) used for the encryption algorithm. Must be 16 bytes.
     * @param value Value to set for the initializationVector property.
     */
    public void setInitializationVector(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("initializationVector", value);
    }
    /**
     * Sets the mac property value. The hash of the concatenation of the IV and encrypted file content. Must be 32 bytes.
     * @param value Value to set for the mac property.
     */
    public void setMac(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("mac", value);
    }
    /**
     * Sets the macKey property value. The key used to compute the message authentication code of the concatenation of the IV and encrypted file content. Must be 32 bytes.
     * @param value Value to set for the macKey property.
     */
    public void setMacKey(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("macKey", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the profileIdentifier property value. The profile identifier. Maps to the strategy used to encrypt the file. Currently, only ProfileVersion1 is supported.
     * @param value Value to set for the profileIdentifier property.
     */
    public void setProfileIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profileIdentifier", value);
    }
}
