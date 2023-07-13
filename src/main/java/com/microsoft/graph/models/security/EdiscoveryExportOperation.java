package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryExportOperation extends CaseOperation implements Parsable {
    /**
     * The description provided for the export.
     */
    private String description;
    /**
     * The exportFileMetadata property
     */
    private java.util.List<ExportFileMetadata> exportFileMetadata;
    /**
     * The options provided for the export. For more details, see reviewSet: export. Possible values are: originalFiles, text, pdfReplacement,  tags.
     */
    private ExportOptions exportOptions;
    /**
     * The options provided that specify the structure of the export. For more details, see reviewSet: export. Possible values are: none, directory, pst.
     */
    private ExportFileStructure exportStructure;
    /**
     * The name provided for the export.
     */
    private String outputName;
    /**
     * Review set from where documents are exported.
     */
    private EdiscoveryReviewSet reviewSet;
    /**
     * The review set query which is used to filter the documents for export.
     */
    private EdiscoveryReviewSetQuery reviewSetQuery;
    /**
     * Instantiates a new ediscoveryExportOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryExportOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ediscoveryExportOperation
     */
    @javax.annotation.Nonnull
    public static EdiscoveryExportOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryExportOperation();
    }
    /**
     * Gets the description property value. The description provided for the export.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the exportFileMetadata property value. The exportFileMetadata property
     * @return a exportFileMetadata
     */
    @javax.annotation.Nullable
    public java.util.List<ExportFileMetadata> getExportFileMetadata() {
        return this.exportFileMetadata;
    }
    /**
     * Gets the exportOptions property value. The options provided for the export. For more details, see reviewSet: export. Possible values are: originalFiles, text, pdfReplacement,  tags.
     * @return a exportOptions
     */
    @javax.annotation.Nullable
    public ExportOptions getExportOptions() {
        return this.exportOptions;
    }
    /**
     * Gets the exportStructure property value. The options provided that specify the structure of the export. For more details, see reviewSet: export. Possible values are: none, directory, pst.
     * @return a exportFileStructure
     */
    @javax.annotation.Nullable
    public ExportFileStructure getExportStructure() {
        return this.exportStructure;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("exportFileMetadata", (n) -> { this.setExportFileMetadata(n.getCollectionOfObjectValues(ExportFileMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("exportOptions", (n) -> { this.setExportOptions(n.getEnumValue(ExportOptions.class)); });
        deserializerMap.put("exportStructure", (n) -> { this.setExportStructure(n.getEnumValue(ExportFileStructure.class)); });
        deserializerMap.put("outputName", (n) -> { this.setOutputName(n.getStringValue()); });
        deserializerMap.put("reviewSet", (n) -> { this.setReviewSet(n.getObjectValue(EdiscoveryReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewSetQuery", (n) -> { this.setReviewSetQuery(n.getObjectValue(EdiscoveryReviewSetQuery::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the outputName property value. The name provided for the export.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOutputName() {
        return this.outputName;
    }
    /**
     * Gets the reviewSet property value. Review set from where documents are exported.
     * @return a ediscoveryReviewSet
     */
    @javax.annotation.Nullable
    public EdiscoveryReviewSet getReviewSet() {
        return this.reviewSet;
    }
    /**
     * Gets the reviewSetQuery property value. The review set query which is used to filter the documents for export.
     * @return a ediscoveryReviewSetQuery
     */
    @javax.annotation.Nullable
    public EdiscoveryReviewSetQuery getReviewSetQuery() {
        return this.reviewSetQuery;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the exportFileMetadata property value. The exportFileMetadata property
     * @param value Value to set for the exportFileMetadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExportFileMetadata(@javax.annotation.Nullable final java.util.List<ExportFileMetadata> value) {
        this.exportFileMetadata = value;
    }
    /**
     * Sets the exportOptions property value. The options provided for the export. For more details, see reviewSet: export. Possible values are: originalFiles, text, pdfReplacement,  tags.
     * @param value Value to set for the exportOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExportOptions(@javax.annotation.Nullable final ExportOptions value) {
        this.exportOptions = value;
    }
    /**
     * Sets the exportStructure property value. The options provided that specify the structure of the export. For more details, see reviewSet: export. Possible values are: none, directory, pst.
     * @param value Value to set for the exportStructure property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExportStructure(@javax.annotation.Nullable final ExportFileStructure value) {
        this.exportStructure = value;
    }
    /**
     * Sets the outputName property value. The name provided for the export.
     * @param value Value to set for the outputName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutputName(@javax.annotation.Nullable final String value) {
        this.outputName = value;
    }
    /**
     * Sets the reviewSet property value. Review set from where documents are exported.
     * @param value Value to set for the reviewSet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewSet(@javax.annotation.Nullable final EdiscoveryReviewSet value) {
        this.reviewSet = value;
    }
    /**
     * Sets the reviewSetQuery property value. The review set query which is used to filter the documents for export.
     * @param value Value to set for the reviewSetQuery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewSetQuery(@javax.annotation.Nullable final EdiscoveryReviewSetQuery value) {
        this.reviewSetQuery = value;
    }
}
