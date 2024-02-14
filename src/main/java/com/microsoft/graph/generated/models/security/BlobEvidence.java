package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlobEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link BlobEvidence} and sets the default values.
     */
    public BlobEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.blobEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BlobEvidence}
     */
    @jakarta.annotation.Nonnull
    public static BlobEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlobEvidence();
    }
    /**
     * Gets the blobContainer property value. The container which the blob belongs to.
     * @return a {@link BlobContainerEvidence}
     */
    @jakarta.annotation.Nullable
    public BlobContainerEvidence getBlobContainer() {
        return this.backingStore.get("blobContainer");
    }
    /**
     * Gets the etag property value. The Etag associated with this blob.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEtag() {
        return this.backingStore.get("etag");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("blobContainer", (n) -> { this.setBlobContainer(n.getObjectValue(BlobContainerEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("etag", (n) -> { this.setEtag(n.getStringValue()); });
        deserializerMap.put("fileHashes", (n) -> { this.setFileHashes(n.getCollectionOfObjectValues(FileHash::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileHashes property value. The file hashes associated with this blob.
     * @return a {@link java.util.List<FileHash>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileHash> getFileHashes() {
        return this.backingStore.get("fileHashes");
    }
    /**
     * Gets the name property value. The name of the blob.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the url property value. The full URL representation of the blob.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.backingStore.get("url");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("blobContainer", this.getBlobContainer());
        writer.writeStringValue("etag", this.getEtag());
        writer.writeCollectionOfObjectValues("fileHashes", this.getFileHashes());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the blobContainer property value. The container which the blob belongs to.
     * @param value Value to set for the blobContainer property.
     */
    public void setBlobContainer(@jakarta.annotation.Nullable final BlobContainerEvidence value) {
        this.backingStore.set("blobContainer", value);
    }
    /**
     * Sets the etag property value. The Etag associated with this blob.
     * @param value Value to set for the etag property.
     */
    public void setEtag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("etag", value);
    }
    /**
     * Sets the fileHashes property value. The file hashes associated with this blob.
     * @param value Value to set for the fileHashes property.
     */
    public void setFileHashes(@jakarta.annotation.Nullable final java.util.List<FileHash> value) {
        this.backingStore.set("fileHashes", value);
    }
    /**
     * Sets the name property value. The name of the blob.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the url property value. The full URL representation of the blob.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("url", value);
    }
}
