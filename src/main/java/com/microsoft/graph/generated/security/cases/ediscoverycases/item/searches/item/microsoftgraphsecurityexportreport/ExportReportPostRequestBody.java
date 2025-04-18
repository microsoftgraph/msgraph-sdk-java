package com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.microsoftgraphsecurityexportreport;

import com.microsoft.graph.models.security.AdditionalOptions;
import com.microsoft.graph.models.security.CloudAttachmentVersion;
import com.microsoft.graph.models.security.DocumentVersion;
import com.microsoft.graph.models.security.ExportCriteria;
import com.microsoft.graph.models.security.ExportLocation;
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
public class ExportReportPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ExportReportPostRequestBody} and sets the default values.
     */
    public ExportReportPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExportReportPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ExportReportPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExportReportPostRequestBody();
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
     * Gets the additionalOptions property value. The additionalOptions property
     * @return a {@link EnumSet<AdditionalOptions>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<AdditionalOptions> getAdditionalOptions() {
        return this.backingStore.get("additionalOptions");
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
     * Gets the documentVersion property value. The documentVersion property
     * @return a {@link DocumentVersion}
     */
    @jakarta.annotation.Nullable
    public DocumentVersion getDocumentVersion() {
        return this.backingStore.get("documentVersion");
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
     * Gets the exportLocation property value. The exportLocation property
     * @return a {@link EnumSet<ExportLocation>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExportLocation> getExportLocation() {
        return this.backingStore.get("exportLocation");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("additionalOptions", (n) -> { this.setAdditionalOptions(n.getEnumSetValue(AdditionalOptions::forValue)); });
        deserializerMap.put("cloudAttachmentVersion", (n) -> { this.setCloudAttachmentVersion(n.getEnumValue(CloudAttachmentVersion::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("documentVersion", (n) -> { this.setDocumentVersion(n.getEnumValue(DocumentVersion::forValue)); });
        deserializerMap.put("exportCriteria", (n) -> { this.setExportCriteria(n.getEnumSetValue(ExportCriteria::forValue)); });
        deserializerMap.put("exportLocation", (n) -> { this.setExportLocation(n.getEnumSetValue(ExportLocation::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("additionalOptions", this.getAdditionalOptions());
        writer.writeEnumValue("cloudAttachmentVersion", this.getCloudAttachmentVersion());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("documentVersion", this.getDocumentVersion());
        writer.writeEnumSetValue("exportCriteria", this.getExportCriteria());
        writer.writeEnumSetValue("exportLocation", this.getExportLocation());
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
     * Sets the additionalOptions property value. The additionalOptions property
     * @param value Value to set for the additionalOptions property.
     */
    public void setAdditionalOptions(@jakarta.annotation.Nullable final EnumSet<AdditionalOptions> value) {
        this.backingStore.set("additionalOptions", value);
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
     * Sets the documentVersion property value. The documentVersion property
     * @param value Value to set for the documentVersion property.
     */
    public void setDocumentVersion(@jakarta.annotation.Nullable final DocumentVersion value) {
        this.backingStore.set("documentVersion", value);
    }
    /**
     * Sets the exportCriteria property value. The exportCriteria property
     * @param value Value to set for the exportCriteria property.
     */
    public void setExportCriteria(@jakarta.annotation.Nullable final EnumSet<ExportCriteria> value) {
        this.backingStore.set("exportCriteria", value);
    }
    /**
     * Sets the exportLocation property value. The exportLocation property
     * @param value Value to set for the exportLocation property.
     */
    public void setExportLocation(@jakarta.annotation.Nullable final EnumSet<ExportLocation> value) {
        this.backingStore.set("exportLocation", value);
    }
}
