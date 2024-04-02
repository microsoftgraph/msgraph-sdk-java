package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FilePlanDescriptor extends Entity implements Parsable {
    /**
     * Instantiates a new {@link FilePlanDescriptor} and sets the default values.
     */
    public FilePlanDescriptor() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FilePlanDescriptor}
     */
    @jakarta.annotation.Nonnull
    public static FilePlanDescriptor createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FilePlanDescriptor();
    }
    /**
     * Gets the authority property value. The authority property
     * @return a {@link FilePlanAuthority}
     */
    @jakarta.annotation.Nullable
    public FilePlanAuthority getAuthority() {
        return this.backingStore.get("authority");
    }
    /**
     * Gets the authorityTemplate property value. The authorityTemplate property
     * @return a {@link AuthorityTemplate}
     */
    @jakarta.annotation.Nullable
    public AuthorityTemplate getAuthorityTemplate() {
        return this.backingStore.get("authorityTemplate");
    }
    /**
     * Gets the category property value. The category property
     * @return a {@link FilePlanAppliedCategory}
     */
    @jakarta.annotation.Nullable
    public FilePlanAppliedCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the categoryTemplate property value. The categoryTemplate property
     * @return a {@link CategoryTemplate}
     */
    @jakarta.annotation.Nullable
    public CategoryTemplate getCategoryTemplate() {
        return this.backingStore.get("categoryTemplate");
    }
    /**
     * Gets the citation property value. The citation property
     * @return a {@link FilePlanCitation}
     */
    @jakarta.annotation.Nullable
    public FilePlanCitation getCitation() {
        return this.backingStore.get("citation");
    }
    /**
     * Gets the citationTemplate property value. The citationTemplate property
     * @return a {@link CitationTemplate}
     */
    @jakarta.annotation.Nullable
    public CitationTemplate getCitationTemplate() {
        return this.backingStore.get("citationTemplate");
    }
    /**
     * Gets the department property value. The department property
     * @return a {@link FilePlanDepartment}
     */
    @jakarta.annotation.Nullable
    public FilePlanDepartment getDepartment() {
        return this.backingStore.get("department");
    }
    /**
     * Gets the departmentTemplate property value. The departmentTemplate property
     * @return a {@link DepartmentTemplate}
     */
    @jakarta.annotation.Nullable
    public DepartmentTemplate getDepartmentTemplate() {
        return this.backingStore.get("departmentTemplate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authority", (n) -> { this.setAuthority(n.getObjectValue(FilePlanAuthority::createFromDiscriminatorValue)); });
        deserializerMap.put("authorityTemplate", (n) -> { this.setAuthorityTemplate(n.getObjectValue(AuthorityTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getObjectValue(FilePlanAppliedCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("categoryTemplate", (n) -> { this.setCategoryTemplate(n.getObjectValue(CategoryTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("citation", (n) -> { this.setCitation(n.getObjectValue(FilePlanCitation::createFromDiscriminatorValue)); });
        deserializerMap.put("citationTemplate", (n) -> { this.setCitationTemplate(n.getObjectValue(CitationTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getObjectValue(FilePlanDepartment::createFromDiscriminatorValue)); });
        deserializerMap.put("departmentTemplate", (n) -> { this.setDepartmentTemplate(n.getObjectValue(DepartmentTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("filePlanReference", (n) -> { this.setFilePlanReference(n.getObjectValue(FilePlanReference::createFromDiscriminatorValue)); });
        deserializerMap.put("filePlanReferenceTemplate", (n) -> { this.setFilePlanReferenceTemplate(n.getObjectValue(FilePlanReferenceTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filePlanReference property value. The filePlanReference property
     * @return a {@link FilePlanReference}
     */
    @jakarta.annotation.Nullable
    public FilePlanReference getFilePlanReference() {
        return this.backingStore.get("filePlanReference");
    }
    /**
     * Gets the filePlanReferenceTemplate property value. The filePlanReferenceTemplate property
     * @return a {@link FilePlanReferenceTemplate}
     */
    @jakarta.annotation.Nullable
    public FilePlanReferenceTemplate getFilePlanReferenceTemplate() {
        return this.backingStore.get("filePlanReferenceTemplate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("authority", this.getAuthority());
        writer.writeObjectValue("authorityTemplate", this.getAuthorityTemplate());
        writer.writeObjectValue("category", this.getCategory());
        writer.writeObjectValue("categoryTemplate", this.getCategoryTemplate());
        writer.writeObjectValue("citation", this.getCitation());
        writer.writeObjectValue("citationTemplate", this.getCitationTemplate());
        writer.writeObjectValue("department", this.getDepartment());
        writer.writeObjectValue("departmentTemplate", this.getDepartmentTemplate());
        writer.writeObjectValue("filePlanReference", this.getFilePlanReference());
        writer.writeObjectValue("filePlanReferenceTemplate", this.getFilePlanReferenceTemplate());
    }
    /**
     * Sets the authority property value. The authority property
     * @param value Value to set for the authority property.
     */
    public void setAuthority(@jakarta.annotation.Nullable final FilePlanAuthority value) {
        this.backingStore.set("authority", value);
    }
    /**
     * Sets the authorityTemplate property value. The authorityTemplate property
     * @param value Value to set for the authorityTemplate property.
     */
    public void setAuthorityTemplate(@jakarta.annotation.Nullable final AuthorityTemplate value) {
        this.backingStore.set("authorityTemplate", value);
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final FilePlanAppliedCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the categoryTemplate property value. The categoryTemplate property
     * @param value Value to set for the categoryTemplate property.
     */
    public void setCategoryTemplate(@jakarta.annotation.Nullable final CategoryTemplate value) {
        this.backingStore.set("categoryTemplate", value);
    }
    /**
     * Sets the citation property value. The citation property
     * @param value Value to set for the citation property.
     */
    public void setCitation(@jakarta.annotation.Nullable final FilePlanCitation value) {
        this.backingStore.set("citation", value);
    }
    /**
     * Sets the citationTemplate property value. The citationTemplate property
     * @param value Value to set for the citationTemplate property.
     */
    public void setCitationTemplate(@jakarta.annotation.Nullable final CitationTemplate value) {
        this.backingStore.set("citationTemplate", value);
    }
    /**
     * Sets the department property value. The department property
     * @param value Value to set for the department property.
     */
    public void setDepartment(@jakarta.annotation.Nullable final FilePlanDepartment value) {
        this.backingStore.set("department", value);
    }
    /**
     * Sets the departmentTemplate property value. The departmentTemplate property
     * @param value Value to set for the departmentTemplate property.
     */
    public void setDepartmentTemplate(@jakarta.annotation.Nullable final DepartmentTemplate value) {
        this.backingStore.set("departmentTemplate", value);
    }
    /**
     * Sets the filePlanReference property value. The filePlanReference property
     * @param value Value to set for the filePlanReference property.
     */
    public void setFilePlanReference(@jakarta.annotation.Nullable final FilePlanReference value) {
        this.backingStore.set("filePlanReference", value);
    }
    /**
     * Sets the filePlanReferenceTemplate property value. The filePlanReferenceTemplate property
     * @param value Value to set for the filePlanReferenceTemplate property.
     */
    public void setFilePlanReferenceTemplate(@jakarta.annotation.Nullable final FilePlanReferenceTemplate value) {
        this.backingStore.set("filePlanReferenceTemplate", value);
    }
}
