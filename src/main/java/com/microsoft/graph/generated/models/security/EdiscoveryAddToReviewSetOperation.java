package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryAddToReviewSetOperation extends CaseOperation implements Parsable {
    /**
     * Instantiates a new {@link EdiscoveryAddToReviewSetOperation} and sets the default values.
     */
    public EdiscoveryAddToReviewSetOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EdiscoveryAddToReviewSetOperation}
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryAddToReviewSetOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryAddToReviewSetOperation();
    }
    /**
     * Gets the additionalDataOptions property value. The options to add items to the review set. Possible values are: allVersions, linkedFiles, unknownFutureValue, advancedIndexing, listAttachments, htmlTranscripts, messageConversationExpansion, locationsWithoutHits, allItemsInFolder. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: advancedIndexing, listAttachments, htmlTranscripts, messageConversationExpansion, locationsWithoutHits, allItemsInFolder.
     * @return a {@link EnumSet<AdditionalDataOptions>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<AdditionalDataOptions> getAdditionalDataOptions() {
        return this.backingStore.get("additionalDataOptions");
    }
    /**
     * Gets the cloudAttachmentVersion property value. Specifies the number of most recent versions of cloud attachments to collect. Possible values are: latest, recent10, recent100, all, unknownFutureValue.
     * @return a {@link CloudAttachmentVersion}
     */
    @jakarta.annotation.Nullable
    public CloudAttachmentVersion getCloudAttachmentVersion() {
        return this.backingStore.get("cloudAttachmentVersion");
    }
    /**
     * Gets the documentVersion property value. Specifies the number of most recent versions of SharePoint documents to collect. Possible values are: latest, recent10, recent100, all, unknownFutureValue.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalDataOptions", (n) -> { this.setAdditionalDataOptions(n.getEnumSetValue(AdditionalDataOptions::forValue)); });
        deserializerMap.put("cloudAttachmentVersion", (n) -> { this.setCloudAttachmentVersion(n.getEnumValue(CloudAttachmentVersion::forValue)); });
        deserializerMap.put("documentVersion", (n) -> { this.setDocumentVersion(n.getEnumValue(DocumentVersion::forValue)); });
        deserializerMap.put("itemsToInclude", (n) -> { this.setItemsToInclude(n.getEnumSetValue(ItemsToInclude::forValue)); });
        deserializerMap.put("reviewSet", (n) -> { this.setReviewSet(n.getObjectValue(EdiscoveryReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("search", (n) -> { this.setSearch(n.getObjectValue(EdiscoverySearch::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemsToInclude property value. The items to include in the review set. Possible values are: searchHits, partiallyIndexed, unknownFutureValue.
     * @return a {@link EnumSet<ItemsToInclude>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ItemsToInclude> getItemsToInclude() {
        return this.backingStore.get("itemsToInclude");
    }
    /**
     * Gets the reviewSet property value. eDiscovery review set to which items matching source collection query gets added.
     * @return a {@link EdiscoveryReviewSet}
     */
    @jakarta.annotation.Nullable
    public EdiscoveryReviewSet getReviewSet() {
        return this.backingStore.get("reviewSet");
    }
    /**
     * Gets the search property value. eDiscovery search that gets added to review set.
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
        super.serialize(writer);
        writer.writeEnumSetValue("additionalDataOptions", this.getAdditionalDataOptions());
        writer.writeEnumValue("cloudAttachmentVersion", this.getCloudAttachmentVersion());
        writer.writeEnumValue("documentVersion", this.getDocumentVersion());
        writer.writeEnumSetValue("itemsToInclude", this.getItemsToInclude());
        writer.writeObjectValue("reviewSet", this.getReviewSet());
        writer.writeObjectValue("search", this.getSearch());
    }
    /**
     * Sets the additionalDataOptions property value. The options to add items to the review set. Possible values are: allVersions, linkedFiles, unknownFutureValue, advancedIndexing, listAttachments, htmlTranscripts, messageConversationExpansion, locationsWithoutHits, allItemsInFolder. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: advancedIndexing, listAttachments, htmlTranscripts, messageConversationExpansion, locationsWithoutHits, allItemsInFolder.
     * @param value Value to set for the additionalDataOptions property.
     */
    public void setAdditionalDataOptions(@jakarta.annotation.Nullable final EnumSet<AdditionalDataOptions> value) {
        this.backingStore.set("additionalDataOptions", value);
    }
    /**
     * Sets the cloudAttachmentVersion property value. Specifies the number of most recent versions of cloud attachments to collect. Possible values are: latest, recent10, recent100, all, unknownFutureValue.
     * @param value Value to set for the cloudAttachmentVersion property.
     */
    public void setCloudAttachmentVersion(@jakarta.annotation.Nullable final CloudAttachmentVersion value) {
        this.backingStore.set("cloudAttachmentVersion", value);
    }
    /**
     * Sets the documentVersion property value. Specifies the number of most recent versions of SharePoint documents to collect. Possible values are: latest, recent10, recent100, all, unknownFutureValue.
     * @param value Value to set for the documentVersion property.
     */
    public void setDocumentVersion(@jakarta.annotation.Nullable final DocumentVersion value) {
        this.backingStore.set("documentVersion", value);
    }
    /**
     * Sets the itemsToInclude property value. The items to include in the review set. Possible values are: searchHits, partiallyIndexed, unknownFutureValue.
     * @param value Value to set for the itemsToInclude property.
     */
    public void setItemsToInclude(@jakarta.annotation.Nullable final EnumSet<ItemsToInclude> value) {
        this.backingStore.set("itemsToInclude", value);
    }
    /**
     * Sets the reviewSet property value. eDiscovery review set to which items matching source collection query gets added.
     * @param value Value to set for the reviewSet property.
     */
    public void setReviewSet(@jakarta.annotation.Nullable final EdiscoveryReviewSet value) {
        this.backingStore.set("reviewSet", value);
    }
    /**
     * Sets the search property value. eDiscovery search that gets added to review set.
     * @param value Value to set for the search property.
     */
    public void setSearch(@jakarta.annotation.Nullable final EdiscoverySearch value) {
        this.backingStore.set("search", value);
    }
}
