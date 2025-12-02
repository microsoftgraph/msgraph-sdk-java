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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointMigrationContainerInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SharePointMigrationContainerInfo} and sets the default values.
     */
    public SharePointMigrationContainerInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMigrationContainerInfo}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMigrationContainerInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointMigrationContainerInfo();
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
     * Gets the dataContainerUri property value. A valid URL with a SAS token for accessing the Azure blob storage container that contains the file content. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataContainerUri() {
        return this.backingStore.get("dataContainerUri");
    }
    /**
     * Gets the encryptionKey property value. Provides the AES-256-CBC encryption key if files stored in Azure blob containers are encrypted. The key is Base64-encoded. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEncryptionKey() {
        return this.backingStore.get("encryptionKey");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("dataContainerUri", (n) -> { this.setDataContainerUri(n.getStringValue()); });
        deserializerMap.put("encryptionKey", (n) -> { this.setEncryptionKey(n.getStringValue()); });
        deserializerMap.put("metadataContainerUri", (n) -> { this.setMetadataContainerUri(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metadataContainerUri property value. A valid URL with a SAS token for accessing the Azure blob storage container that contains the file metadata. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMetadataContainerUri() {
        return this.backingStore.get("metadataContainerUri");
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
        writer.writeStringValue("dataContainerUri", this.getDataContainerUri());
        writer.writeStringValue("encryptionKey", this.getEncryptionKey());
        writer.writeStringValue("metadataContainerUri", this.getMetadataContainerUri());
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
     * Sets the dataContainerUri property value. A valid URL with a SAS token for accessing the Azure blob storage container that contains the file content. Read-only.
     * @param value Value to set for the dataContainerUri property.
     */
    public void setDataContainerUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dataContainerUri", value);
    }
    /**
     * Sets the encryptionKey property value. Provides the AES-256-CBC encryption key if files stored in Azure blob containers are encrypted. The key is Base64-encoded. Read-only.
     * @param value Value to set for the encryptionKey property.
     */
    public void setEncryptionKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("encryptionKey", value);
    }
    /**
     * Sets the metadataContainerUri property value. A valid URL with a SAS token for accessing the Azure blob storage container that contains the file metadata. Read-only.
     * @param value Value to set for the metadataContainerUri property.
     */
    public void setMetadataContainerUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("metadataContainerUri", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
