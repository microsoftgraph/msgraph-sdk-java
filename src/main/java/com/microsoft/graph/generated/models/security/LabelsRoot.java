package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LabelsRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LabelsRoot} and sets the default values.
     */
    public LabelsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LabelsRoot}
     */
    @jakarta.annotation.Nonnull
    public static LabelsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LabelsRoot();
    }
    /**
     * Gets the authorities property value. The authorities property
     * @return a {@link java.util.List<AuthorityTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthorityTemplate> getAuthorities() {
        return this.backingStore.get("authorities");
    }
    /**
     * Gets the categories property value. The categories property
     * @return a {@link java.util.List<CategoryTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CategoryTemplate> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * Gets the citations property value. The citations property
     * @return a {@link java.util.List<CitationTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CitationTemplate> getCitations() {
        return this.backingStore.get("citations");
    }
    /**
     * Gets the departments property value. The departments property
     * @return a {@link java.util.List<DepartmentTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DepartmentTemplate> getDepartments() {
        return this.backingStore.get("departments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authorities", (n) -> { this.setAuthorities(n.getCollectionOfObjectValues(AuthorityTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfObjectValues(CategoryTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("citations", (n) -> { this.setCitations(n.getCollectionOfObjectValues(CitationTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("departments", (n) -> { this.setDepartments(n.getCollectionOfObjectValues(DepartmentTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("filePlanReferences", (n) -> { this.setFilePlanReferences(n.getCollectionOfObjectValues(FilePlanReferenceTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("retentionLabels", (n) -> { this.setRetentionLabels(n.getCollectionOfObjectValues(RetentionLabel::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filePlanReferences property value. The filePlanReferences property
     * @return a {@link java.util.List<FilePlanReferenceTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FilePlanReferenceTemplate> getFilePlanReferences() {
        return this.backingStore.get("filePlanReferences");
    }
    /**
     * Gets the retentionLabels property value. The retentionLabels property
     * @return a {@link java.util.List<RetentionLabel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RetentionLabel> getRetentionLabels() {
        return this.backingStore.get("retentionLabels");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("authorities", this.getAuthorities());
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeCollectionOfObjectValues("citations", this.getCitations());
        writer.writeCollectionOfObjectValues("departments", this.getDepartments());
        writer.writeCollectionOfObjectValues("filePlanReferences", this.getFilePlanReferences());
        writer.writeCollectionOfObjectValues("retentionLabels", this.getRetentionLabels());
    }
    /**
     * Sets the authorities property value. The authorities property
     * @param value Value to set for the authorities property.
     */
    public void setAuthorities(@jakarta.annotation.Nullable final java.util.List<AuthorityTemplate> value) {
        this.backingStore.set("authorities", value);
    }
    /**
     * Sets the categories property value. The categories property
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<CategoryTemplate> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the citations property value. The citations property
     * @param value Value to set for the citations property.
     */
    public void setCitations(@jakarta.annotation.Nullable final java.util.List<CitationTemplate> value) {
        this.backingStore.set("citations", value);
    }
    /**
     * Sets the departments property value. The departments property
     * @param value Value to set for the departments property.
     */
    public void setDepartments(@jakarta.annotation.Nullable final java.util.List<DepartmentTemplate> value) {
        this.backingStore.set("departments", value);
    }
    /**
     * Sets the filePlanReferences property value. The filePlanReferences property
     * @param value Value to set for the filePlanReferences property.
     */
    public void setFilePlanReferences(@jakarta.annotation.Nullable final java.util.List<FilePlanReferenceTemplate> value) {
        this.backingStore.set("filePlanReferences", value);
    }
    /**
     * Sets the retentionLabels property value. The retentionLabels property
     * @param value Value to set for the retentionLabels property.
     */
    public void setRetentionLabels(@jakarta.annotation.Nullable final java.util.List<RetentionLabel> value) {
        this.backingStore.set("retentionLabels", value);
    }
}
