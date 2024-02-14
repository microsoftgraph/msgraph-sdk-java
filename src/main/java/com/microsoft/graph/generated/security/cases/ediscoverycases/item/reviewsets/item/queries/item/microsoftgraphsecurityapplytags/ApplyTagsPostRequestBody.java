package com.microsoft.graph.security.cases.ediscoverycases.item.reviewsets.item.queries.item.microsoftgraphsecurityapplytags;

import com.microsoft.graph.models.security.EdiscoveryReviewTag;
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
public class ApplyTagsPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ApplyTagsPostRequestBody} and sets the default values.
     */
    public ApplyTagsPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplyTagsPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ApplyTagsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyTagsPostRequestBody();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("tagsToAdd", (n) -> { this.setTagsToAdd(n.getCollectionOfObjectValues(EdiscoveryReviewTag::createFromDiscriminatorValue)); });
        deserializerMap.put("tagsToRemove", (n) -> { this.setTagsToRemove(n.getCollectionOfObjectValues(EdiscoveryReviewTag::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tagsToAdd property value. The tagsToAdd property
     * @return a {@link java.util.List<EdiscoveryReviewTag>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoveryReviewTag> getTagsToAdd() {
        return this.backingStore.get("tagsToAdd");
    }
    /**
     * Gets the tagsToRemove property value. The tagsToRemove property
     * @return a {@link java.util.List<EdiscoveryReviewTag>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoveryReviewTag> getTagsToRemove() {
        return this.backingStore.get("tagsToRemove");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("tagsToAdd", this.getTagsToAdd());
        writer.writeCollectionOfObjectValues("tagsToRemove", this.getTagsToRemove());
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
     * Sets the tagsToAdd property value. The tagsToAdd property
     * @param value Value to set for the tagsToAdd property.
     */
    public void setTagsToAdd(@jakarta.annotation.Nullable final java.util.List<EdiscoveryReviewTag> value) {
        this.backingStore.set("tagsToAdd", value);
    }
    /**
     * Sets the tagsToRemove property value. The tagsToRemove property
     * @param value Value to set for the tagsToRemove property.
     */
    public void setTagsToRemove(@jakarta.annotation.Nullable final java.util.List<EdiscoveryReviewTag> value) {
        this.backingStore.set("tagsToRemove", value);
    }
}
