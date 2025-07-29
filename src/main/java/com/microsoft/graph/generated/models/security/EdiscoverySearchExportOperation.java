package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoverySearchExportOperation extends CaseOperation implements Parsable {
    /**
     * Instantiates a new {@link EdiscoverySearchExportOperation} and sets the default values.
     */
    public EdiscoverySearchExportOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EdiscoverySearchExportOperation}
     */
    @jakarta.annotation.Nonnull
    public static EdiscoverySearchExportOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoverySearchExportOperation();
    }
    /**
     * Gets the additionalOptions property value. The additional items to include in the export. The possible values are: none, teamsAndYammerConversations, cloudAttachments, allDocumentVersions, subfolderContents, listAttachments, unknownFutureValue, htmlTranscripts, advancedIndexing, allItemsInFolder, includeFolderAndPath, condensePaths, friendlyName, splitSource, includeReport. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: htmlTranscripts, advancedIndexing, allItemsInFolder, includeFolderAndPath, condensePaths, friendlyName, splitSource, includeReport.
     * @return a {@link EnumSet<AdditionalOptions>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<AdditionalOptions> getAdditionalOptions() {
        return this.backingStore.get("additionalOptions");
    }
    /**
     * Gets the cloudAttachmentVersion property value. The versions of cloud attachments to include in messages. Possible values are: latest, recent10, recent100, all, unknownFutureValue.
     * @return a {@link CloudAttachmentVersion}
     */
    @jakarta.annotation.Nullable
    public CloudAttachmentVersion getCloudAttachmentVersion() {
        return this.backingStore.get("cloudAttachmentVersion");
    }
    /**
     * Gets the description property value. The description of the export by the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The name of export provided by the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the documentVersion property value. The versions of files in SharePoint to include. Possible values are: latest, recent10, recent100, all, unknownFutureValue.
     * @return a {@link DocumentVersion}
     */
    @jakarta.annotation.Nullable
    public DocumentVersion getDocumentVersion() {
        return this.backingStore.get("documentVersion");
    }
    /**
     * Gets the exportCriteria property value. Items to be included in the export. The possible values are: searchHits, partiallyIndexed, unknownFutureValue.
     * @return a {@link EnumSet<ExportCriteria>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExportCriteria> getExportCriteria() {
        return this.backingStore.get("exportCriteria");
    }
    /**
     * Gets the exportFileMetadata property value. Contains the properties for an export file metadata, including downloadUrl, fileName, and size.
     * @return a {@link java.util.List<ExportFileMetadata>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExportFileMetadata> getExportFileMetadata() {
        return this.backingStore.get("exportFileMetadata");
    }
    /**
     * Gets the exportFormat property value. Format of the emails of the export. The possible values are: pst, msg, eml (deprecated), unknownFutureValue. The eml member is deprecated. It remains in v1.0 for backward compatibility. Going forward, use either pst or msg.
     * @return a {@link ExportFormat}
     */
    @jakarta.annotation.Nullable
    public ExportFormat getExportFormat() {
        return this.backingStore.get("exportFormat");
    }
    /**
     * Gets the exportLocation property value. Location scope for partially indexed items. You can choose to include partially indexed items only in responsive locations with search hits or in all targeted locations. The possible values are: responsiveLocations, nonresponsiveLocations, unknownFutureValue.
     * @return a {@link EnumSet<ExportLocation>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExportLocation> getExportLocation() {
        return this.backingStore.get("exportLocation");
    }
    /**
     * Gets the exportSingleItems property value. Indicates whether to export single items.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExportSingleItems() {
        return this.backingStore.get("exportSingleItems");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalOptions", (n) -> { this.setAdditionalOptions(n.getEnumSetValue(AdditionalOptions::forValue)); });
        deserializerMap.put("cloudAttachmentVersion", (n) -> { this.setCloudAttachmentVersion(n.getEnumValue(CloudAttachmentVersion::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("documentVersion", (n) -> { this.setDocumentVersion(n.getEnumValue(DocumentVersion::forValue)); });
        deserializerMap.put("exportCriteria", (n) -> { this.setExportCriteria(n.getEnumSetValue(ExportCriteria::forValue)); });
        deserializerMap.put("exportFileMetadata", (n) -> { this.setExportFileMetadata(n.getCollectionOfObjectValues(ExportFileMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("exportFormat", (n) -> { this.setExportFormat(n.getEnumValue(ExportFormat::forValue)); });
        deserializerMap.put("exportLocation", (n) -> { this.setExportLocation(n.getEnumSetValue(ExportLocation::forValue)); });
        deserializerMap.put("exportSingleItems", (n) -> { this.setExportSingleItems(n.getBooleanValue()); });
        deserializerMap.put("search", (n) -> { this.setSearch(n.getObjectValue(EdiscoverySearch::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the search property value. The eDiscovery searches under each case.
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
        writer.writeEnumSetValue("additionalOptions", this.getAdditionalOptions());
        writer.writeEnumValue("cloudAttachmentVersion", this.getCloudAttachmentVersion());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("documentVersion", this.getDocumentVersion());
        writer.writeEnumSetValue("exportCriteria", this.getExportCriteria());
        writer.writeCollectionOfObjectValues("exportFileMetadata", this.getExportFileMetadata());
        writer.writeEnumValue("exportFormat", this.getExportFormat());
        writer.writeEnumSetValue("exportLocation", this.getExportLocation());
        writer.writeBooleanValue("exportSingleItems", this.getExportSingleItems());
        writer.writeObjectValue("search", this.getSearch());
    }
    /**
     * Sets the additionalOptions property value. The additional items to include in the export. The possible values are: none, teamsAndYammerConversations, cloudAttachments, allDocumentVersions, subfolderContents, listAttachments, unknownFutureValue, htmlTranscripts, advancedIndexing, allItemsInFolder, includeFolderAndPath, condensePaths, friendlyName, splitSource, includeReport. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: htmlTranscripts, advancedIndexing, allItemsInFolder, includeFolderAndPath, condensePaths, friendlyName, splitSource, includeReport.
     * @param value Value to set for the additionalOptions property.
     */
    public void setAdditionalOptions(@jakarta.annotation.Nullable final EnumSet<AdditionalOptions> value) {
        this.backingStore.set("additionalOptions", value);
    }
    /**
     * Sets the cloudAttachmentVersion property value. The versions of cloud attachments to include in messages. Possible values are: latest, recent10, recent100, all, unknownFutureValue.
     * @param value Value to set for the cloudAttachmentVersion property.
     */
    public void setCloudAttachmentVersion(@jakarta.annotation.Nullable final CloudAttachmentVersion value) {
        this.backingStore.set("cloudAttachmentVersion", value);
    }
    /**
     * Sets the description property value. The description of the export by the user.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The name of export provided by the user.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the documentVersion property value. The versions of files in SharePoint to include. Possible values are: latest, recent10, recent100, all, unknownFutureValue.
     * @param value Value to set for the documentVersion property.
     */
    public void setDocumentVersion(@jakarta.annotation.Nullable final DocumentVersion value) {
        this.backingStore.set("documentVersion", value);
    }
    /**
     * Sets the exportCriteria property value. Items to be included in the export. The possible values are: searchHits, partiallyIndexed, unknownFutureValue.
     * @param value Value to set for the exportCriteria property.
     */
    public void setExportCriteria(@jakarta.annotation.Nullable final EnumSet<ExportCriteria> value) {
        this.backingStore.set("exportCriteria", value);
    }
    /**
     * Sets the exportFileMetadata property value. Contains the properties for an export file metadata, including downloadUrl, fileName, and size.
     * @param value Value to set for the exportFileMetadata property.
     */
    public void setExportFileMetadata(@jakarta.annotation.Nullable final java.util.List<ExportFileMetadata> value) {
        this.backingStore.set("exportFileMetadata", value);
    }
    /**
     * Sets the exportFormat property value. Format of the emails of the export. The possible values are: pst, msg, eml (deprecated), unknownFutureValue. The eml member is deprecated. It remains in v1.0 for backward compatibility. Going forward, use either pst or msg.
     * @param value Value to set for the exportFormat property.
     */
    public void setExportFormat(@jakarta.annotation.Nullable final ExportFormat value) {
        this.backingStore.set("exportFormat", value);
    }
    /**
     * Sets the exportLocation property value. Location scope for partially indexed items. You can choose to include partially indexed items only in responsive locations with search hits or in all targeted locations. The possible values are: responsiveLocations, nonresponsiveLocations, unknownFutureValue.
     * @param value Value to set for the exportLocation property.
     */
    public void setExportLocation(@jakarta.annotation.Nullable final EnumSet<ExportLocation> value) {
        this.backingStore.set("exportLocation", value);
    }
    /**
     * Sets the exportSingleItems property value. Indicates whether to export single items.
     * @param value Value to set for the exportSingleItems property.
     */
    public void setExportSingleItems(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("exportSingleItems", value);
    }
    /**
     * Sets the search property value. The eDiscovery searches under each case.
     * @param value Value to set for the search property.
     */
    public void setSearch(@jakarta.annotation.Nullable final EdiscoverySearch value) {
        this.backingStore.set("search", value);
    }
}
