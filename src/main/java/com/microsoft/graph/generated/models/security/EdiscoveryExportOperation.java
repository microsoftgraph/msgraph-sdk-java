package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryExportOperation extends CaseOperation implements Parsable {
    /**
     * Instantiates a new EdiscoveryExportOperation and sets the default values.
     */
    public EdiscoveryExportOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdiscoveryExportOperation
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryExportOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryExportOperation();
    }
    /**
     * Gets the description property value. The description provided for the export.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the exportFileMetadata property value. The exportFileMetadata property
     * @return a java.util.List<ExportFileMetadata>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExportFileMetadata> getExportFileMetadata() {
        return this.backingStore.get("exportFileMetadata");
    }
    /**
     * Gets the exportOptions property value. The options provided for the export. For more information, see reviewSet: export. Possible values are: originalFiles, text, pdfReplacement,  tags.
     * @return a EdiscoveryExportOperationExportOptions
     */
    @jakarta.annotation.Nullable
    public EdiscoveryExportOperationExportOptions getExportOptions() {
        return this.backingStore.get("exportOptions");
    }
    /**
     * Gets the exportStructure property value. The options that specify the structure of the export. For more information, see reviewSet: export. Possible values are: none, directory, pst.
     * @return a EdiscoveryExportOperationExportStructure
     */
    @jakarta.annotation.Nullable
    public EdiscoveryExportOperationExportStructure getExportStructure() {
        return this.backingStore.get("exportStructure");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("exportFileMetadata", (n) -> { this.setExportFileMetadata(n.getCollectionOfObjectValues(ExportFileMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("exportOptions", (n) -> { this.setExportOptions(n.getEnumValue(EdiscoveryExportOperationExportOptions::forValue)); });
        deserializerMap.put("exportStructure", (n) -> { this.setExportStructure(n.getEnumValue(EdiscoveryExportOperationExportStructure::forValue)); });
        deserializerMap.put("outputName", (n) -> { this.setOutputName(n.getStringValue()); });
        deserializerMap.put("reviewSet", (n) -> { this.setReviewSet(n.getObjectValue(EdiscoveryReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewSetQuery", (n) -> { this.setReviewSetQuery(n.getObjectValue(EdiscoveryReviewSetQuery::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the outputName property value. The name provided for the export.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOutputName() {
        return this.backingStore.get("outputName");
    }
    /**
     * Gets the reviewSet property value. Review set from where documents are exported.
     * @return a EdiscoveryReviewSet
     */
    @jakarta.annotation.Nullable
    public EdiscoveryReviewSet getReviewSet() {
        return this.backingStore.get("reviewSet");
    }
    /**
     * Gets the reviewSetQuery property value. The review set query that is used to filter the documents for export.
     * @return a EdiscoveryReviewSetQuery
     */
    @jakarta.annotation.Nullable
    public EdiscoveryReviewSetQuery getReviewSetQuery() {
        return this.backingStore.get("reviewSetQuery");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("exportFileMetadata", this.getExportFileMetadata());
        writer.writeEnumValue("exportOptions", this.getExportOptions());
        writer.writeEnumValue("exportStructure", this.getExportStructure());
        writer.writeStringValue("outputName", this.getOutputName());
        writer.writeObjectValue("reviewSet", this.getReviewSet());
        writer.writeObjectValue("reviewSetQuery", this.getReviewSetQuery());
    }
    /**
     * Sets the description property value. The description provided for the export.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the exportFileMetadata property value. The exportFileMetadata property
     * @param value Value to set for the exportFileMetadata property.
     */
    public void setExportFileMetadata(@jakarta.annotation.Nullable final java.util.List<ExportFileMetadata> value) {
        this.backingStore.set("exportFileMetadata", value);
    }
    /**
     * Sets the exportOptions property value. The options provided for the export. For more information, see reviewSet: export. Possible values are: originalFiles, text, pdfReplacement,  tags.
     * @param value Value to set for the exportOptions property.
     */
    public void setExportOptions(@jakarta.annotation.Nullable final EdiscoveryExportOperationExportOptions value) {
        this.backingStore.set("exportOptions", value);
    }
    /**
     * Sets the exportStructure property value. The options that specify the structure of the export. For more information, see reviewSet: export. Possible values are: none, directory, pst.
     * @param value Value to set for the exportStructure property.
     */
    public void setExportStructure(@jakarta.annotation.Nullable final EdiscoveryExportOperationExportStructure value) {
        this.backingStore.set("exportStructure", value);
    }
    /**
     * Sets the outputName property value. The name provided for the export.
     * @param value Value to set for the outputName property.
     */
    public void setOutputName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("outputName", value);
    }
    /**
     * Sets the reviewSet property value. Review set from where documents are exported.
     * @param value Value to set for the reviewSet property.
     */
    public void setReviewSet(@jakarta.annotation.Nullable final EdiscoveryReviewSet value) {
        this.backingStore.set("reviewSet", value);
    }
    /**
     * Sets the reviewSetQuery property value. The review set query that is used to filter the documents for export.
     * @param value Value to set for the reviewSetQuery property.
     */
    public void setReviewSetQuery(@jakarta.annotation.Nullable final EdiscoveryReviewSetQuery value) {
        this.backingStore.set("reviewSetQuery", value);
    }
}
