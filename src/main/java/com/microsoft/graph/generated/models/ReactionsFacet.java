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
public class ReactionsFacet implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ReactionsFacet} and sets the default values.
     */
    public ReactionsFacet() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReactionsFacet}
     */
    @jakarta.annotation.Nonnull
    public static ReactionsFacet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReactionsFacet();
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
     * Gets the commentCount property value. Count of comments.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCommentCount() {
        return this.backingStore.get("commentCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("commentCount", (n) -> { this.setCommentCount(n.getIntegerValue()); });
        deserializerMap.put("likeCount", (n) -> { this.setLikeCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("shareCount", (n) -> { this.setShareCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the likeCount property value. Count of likes.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLikeCount() {
        return this.backingStore.get("likeCount");
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
     * Gets the shareCount property value. Count of shares.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getShareCount() {
        return this.backingStore.get("shareCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("commentCount", this.getCommentCount());
        writer.writeIntegerValue("likeCount", this.getLikeCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("shareCount", this.getShareCount());
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
     * Sets the commentCount property value. Count of comments.
     * @param value Value to set for the commentCount property.
     */
    public void setCommentCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("commentCount", value);
    }
    /**
     * Sets the likeCount property value. Count of likes.
     * @param value Value to set for the likeCount property.
     */
    public void setLikeCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("likeCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the shareCount property value. Count of shares.
     * @param value Value to set for the shareCount property.
     */
    public void setShareCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("shareCount", value);
    }
}
