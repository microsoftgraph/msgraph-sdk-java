package com.microsoft.graph.security.cases.ediscoverycases.item.reviewsets.item.microsoftgraphsecurityaddtoreviewset;

import com.microsoft.graph.models.security.AdditionalDataOptions;
import com.microsoft.graph.models.security.CloudAttachmentVersion;
import com.microsoft.graph.models.security.DocumentVersion;
import com.microsoft.graph.models.security.EdiscoverySearch;
import com.microsoft.graph.models.security.ItemsToInclude;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddToReviewSetPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AddToReviewSetPostRequestBody} and sets the default values.
     */
    public AddToReviewSetPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AddToReviewSetPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static AddToReviewSetPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddToReviewSetPostRequestBody();
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
     * Gets the additionalDataOptions property value. The additionalDataOptions property
     * @return a {@link EnumSet<AdditionalDataOptions>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<AdditionalDataOptions> getAdditionalDataOptions() {
        return this.backingStore.get("additionalDataOptions");
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
     * Gets the cloudAttachmentVersion property value. The cloudAttachmentVersion property
     * @return a {@link CloudAttachmentVersion}
     */
    @jakarta.annotation.Nullable
    public CloudAttachmentVersion getCloudAttachmentVersion() {
        return this.backingStore.get("cloudAttachmentVersion");
    }
    /**
     * Gets the documentVersion property value. The documentVersion property
     * @return a {@link DocumentVersion}
     */
    @jakarta.annotation.Nullable
    public DocumentVersion getDocumentVersion() {
        return this.backingStore.get("documentVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("additionalDataOptions", (n) -> { this.setAdditionalDataOptions(n.getEnumSetValue(AdditionalDataOptions::forValue)); });
        deserializerMap.put("cloudAttachmentVersion", (n) -> { this.setCloudAttachmentVersion(n.getEnumValue(CloudAttachmentVersion::forValue)); });
        deserializerMap.put("documentVersion", (n) -> { this.setDocumentVersion(n.getEnumValue(DocumentVersion::forValue)); });
        deserializerMap.put("itemsToInclude", (n) -> { this.setItemsToInclude(n.getEnumSetValue(ItemsToInclude::forValue)); });
        deserializerMap.put("search", (n) -> { this.setSearch(n.getObjectValue(EdiscoverySearch::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemsToInclude property value. The itemsToInclude property
     * @return a {@link EnumSet<ItemsToInclude>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ItemsToInclude> getItemsToInclude() {
        return this.backingStore.get("itemsToInclude");
    }
    /**
     * Gets the search property value. The search property
     * @return a {@link EdiscoverySearch}
     */
    @jakarta.annotation.Nullable
    public EdiscoverySearch getSearch() {
        return this.backingStore.get("search");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("additionalDataOptions", this.getAdditionalDataOptions());
        writer.writeEnumValue("cloudAttachmentVersion", this.getCloudAttachmentVersion());
        writer.writeEnumValue("documentVersion", this.getDocumentVersion());
        writer.writeEnumSetValue("itemsToInclude", this.getItemsToInclude());
        writer.writeObjectValue("search", this.getSearch());
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
     * Sets the additionalDataOptions property value. The additionalDataOptions property
     * @param value Value to set for the additionalDataOptions property.
     */
    public void setAdditionalDataOptions(@jakarta.annotation.Nullable final EnumSet<AdditionalDataOptions> value) {
        this.backingStore.set("additionalDataOptions", value);
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
     * Sets the cloudAttachmentVersion property value. The cloudAttachmentVersion property
     * @param value Value to set for the cloudAttachmentVersion property.
     */
    public void setCloudAttachmentVersion(@jakarta.annotation.Nullable final CloudAttachmentVersion value) {
        this.backingStore.set("cloudAttachmentVersion", value);
    }
    /**
     * Sets the documentVersion property value. The documentVersion property
     * @param value Value to set for the documentVersion property.
     */
    public void setDocumentVersion(@jakarta.annotation.Nullable final DocumentVersion value) {
        this.backingStore.set("documentVersion", value);
    }
    /**
     * Sets the itemsToInclude property value. The itemsToInclude property
     * @param value Value to set for the itemsToInclude property.
     */
    public void setItemsToInclude(@jakarta.annotation.Nullable final EnumSet<ItemsToInclude> value) {
        this.backingStore.set("itemsToInclude", value);
    }
    /**
     * Sets the search property value. The search property
     * @param value Value to set for the search property.
     */
    public void setSearch(@jakarta.annotation.Nullable final EdiscoverySearch value) {
        this.backingStore.set("search", value);
    }
}
