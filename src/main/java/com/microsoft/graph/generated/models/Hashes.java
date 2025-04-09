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
public class Hashes implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link Hashes} and sets the default values.
     */
    public Hashes() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Hashes}
     */
    @jakarta.annotation.Nonnull
    public static Hashes createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Hashes();
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
     * Gets the crc32Hash property value. The CRC32 value of the file (if available). Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCrc32Hash() {
        return this.backingStore.get("crc32Hash");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("crc32Hash", (n) -> { this.setCrc32Hash(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("quickXorHash", (n) -> { this.setQuickXorHash(n.getStringValue()); });
        deserializerMap.put("sha1Hash", (n) -> { this.setSha1Hash(n.getStringValue()); });
        deserializerMap.put("sha256Hash", (n) -> { this.setSha256Hash(n.getStringValue()); });
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
     * Gets the quickXorHash property value. A proprietary hash of the file that can be used to determine if the contents of the file change (if available). Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQuickXorHash() {
        return this.backingStore.get("quickXorHash");
    }
    /**
     * Gets the sha1Hash property value. SHA1 hash for the contents of the file (if available). Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSha1Hash() {
        return this.backingStore.get("sha1Hash");
    }
    /**
     * Gets the sha256Hash property value. This property isn&apos;t supported. Don&apos;t use.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSha256Hash() {
        return this.backingStore.get("sha256Hash");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("crc32Hash", this.getCrc32Hash());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("quickXorHash", this.getQuickXorHash());
        writer.writeStringValue("sha1Hash", this.getSha1Hash());
        writer.writeStringValue("sha256Hash", this.getSha256Hash());
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
     * Sets the crc32Hash property value. The CRC32 value of the file (if available). Read-only.
     * @param value Value to set for the crc32Hash property.
     */
    public void setCrc32Hash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("crc32Hash", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the quickXorHash property value. A proprietary hash of the file that can be used to determine if the contents of the file change (if available). Read-only.
     * @param value Value to set for the quickXorHash property.
     */
    public void setQuickXorHash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("quickXorHash", value);
    }
    /**
     * Sets the sha1Hash property value. SHA1 hash for the contents of the file (if available). Read-only.
     * @param value Value to set for the sha1Hash property.
     */
    public void setSha1Hash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sha1Hash", value);
    }
    /**
     * Sets the sha256Hash property value. This property isn&apos;t supported. Don&apos;t use.
     * @param value Value to set for the sha256Hash property.
     */
    public void setSha256Hash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sha256Hash", value);
    }
}
