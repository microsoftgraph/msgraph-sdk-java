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
     * Gets the additionalOptions property value. The additionalOptions property
     * @return a {@link EnumSet<AdditionalOptions>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<AdditionalOptions> getAdditionalOptions() {
        return this.backingStore.get("additionalOptions");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the exportCriteria property value. The exportCriteria property
     * @return a {@link EnumSet<ExportCriteria>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExportCriteria> getExportCriteria() {
        return this.backingStore.get("exportCriteria");
    }
    /**
     * Gets the exportFileMetadata property value. The exportFileMetadata property
     * @return a {@link java.util.List<ExportFileMetadata>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExportFileMetadata> getExportFileMetadata() {
        return this.backingStore.get("exportFileMetadata");
    }
    /**
     * Gets the exportFormat property value. The exportFormat property
     * @return a {@link ExportFormat}
     */
    @jakarta.annotation.Nullable
    public ExportFormat getExportFormat() {
        return this.backingStore.get("exportFormat");
    }
    /**
     * Gets the exportLocation property value. The exportLocation property
     * @return a {@link EnumSet<ExportLocation>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExportLocation> getExportLocation() {
        return this.backingStore.get("exportLocation");
    }
    /**
     * Gets the exportSingleItems property value. The exportSingleItems property
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("exportCriteria", (n) -> { this.setExportCriteria(n.getEnumSetValue(ExportCriteria::forValue)); });
        deserializerMap.put("exportFileMetadata", (n) -> { this.setExportFileMetadata(n.getCollectionOfObjectValues(ExportFileMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("exportFormat", (n) -> { this.setExportFormat(n.getEnumValue(ExportFormat::forValue)); });
        deserializerMap.put("exportLocation", (n) -> { this.setExportLocation(n.getEnumSetValue(ExportLocation::forValue)); });
        deserializerMap.put("exportSingleItems", (n) -> { this.setExportSingleItems(n.getBooleanValue()); });
        deserializerMap.put("search", (n) -> { this.setSearch(n.getObjectValue(EdiscoverySearch::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        super.serialize(writer);
        writer.writeEnumSetValue("additionalOptions", this.getAdditionalOptions());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumSetValue("exportCriteria", this.getExportCriteria());
        writer.writeCollectionOfObjectValues("exportFileMetadata", this.getExportFileMetadata());
        writer.writeEnumValue("exportFormat", this.getExportFormat());
        writer.writeEnumSetValue("exportLocation", this.getExportLocation());
        writer.writeBooleanValue("exportSingleItems", this.getExportSingleItems());
        writer.writeObjectValue("search", this.getSearch());
    }
    /**
     * Sets the additionalOptions property value. The additionalOptions property
     * @param value Value to set for the additionalOptions property.
     */
    public void setAdditionalOptions(@jakarta.annotation.Nullable final EnumSet<AdditionalOptions> value) {
        this.backingStore.set("additionalOptions", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the exportCriteria property value. The exportCriteria property
     * @param value Value to set for the exportCriteria property.
     */
    public void setExportCriteria(@jakarta.annotation.Nullable final EnumSet<ExportCriteria> value) {
        this.backingStore.set("exportCriteria", value);
    }
    /**
     * Sets the exportFileMetadata property value. The exportFileMetadata property
     * @param value Value to set for the exportFileMetadata property.
     */
    public void setExportFileMetadata(@jakarta.annotation.Nullable final java.util.List<ExportFileMetadata> value) {
        this.backingStore.set("exportFileMetadata", value);
    }
    /**
     * Sets the exportFormat property value. The exportFormat property
     * @param value Value to set for the exportFormat property.
     */
    public void setExportFormat(@jakarta.annotation.Nullable final ExportFormat value) {
        this.backingStore.set("exportFormat", value);
    }
    /**
     * Sets the exportLocation property value. The exportLocation property
     * @param value Value to set for the exportLocation property.
     */
    public void setExportLocation(@jakarta.annotation.Nullable final EnumSet<ExportLocation> value) {
        this.backingStore.set("exportLocation", value);
    }
    /**
     * Sets the exportSingleItems property value. The exportSingleItems property
     * @param value Value to set for the exportSingleItems property.
     */
    public void setExportSingleItems(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("exportSingleItems", value);
    }
    /**
     * Sets the search property value. The search property
     * @param value Value to set for the search property.
     */
    public void setSearch(@jakarta.annotation.Nullable final EdiscoverySearch value) {
        this.backingStore.set("search", value);
    }
}
