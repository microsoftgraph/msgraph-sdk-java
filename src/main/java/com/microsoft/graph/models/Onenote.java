package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Onenote extends Entity implements Parsable {
    /**
     * The collection of OneNote notebooks that are owned by the user or group. Read-only. Nullable.
     */
    private java.util.List<Notebook> notebooks;
    /**
     * The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.
     */
    private java.util.List<OnenoteOperation> operations;
    /**
     * The pages in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     */
    private java.util.List<OnenotePage> pages;
    /**
     * The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get the binary content of a specific resource. Read-only. Nullable.
     */
    private java.util.List<OnenoteResource> resources;
    /**
     * The section groups in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     */
    private java.util.List<SectionGroup> sectionGroups;
    /**
     * The sections in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     */
    private java.util.List<OnenoteSection> sections;
    /**
     * Instantiates a new onenote and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Onenote() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onenote
     */
    @jakarta.annotation.Nonnull
    public static Onenote createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Onenote();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("notebooks", (n) -> { this.setNotebooks(n.getCollectionOfObjectValues(Notebook::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(OnenoteOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("pages", (n) -> { this.setPages(n.getCollectionOfObjectValues(OnenotePage::createFromDiscriminatorValue)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(OnenoteResource::createFromDiscriminatorValue)); });
        deserializerMap.put("sectionGroups", (n) -> { this.setSectionGroups(n.getCollectionOfObjectValues(SectionGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("sections", (n) -> { this.setSections(n.getCollectionOfObjectValues(OnenoteSection::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the notebooks property value. The collection of OneNote notebooks that are owned by the user or group. Read-only. Nullable.
     * @return a notebook
     */
    @jakarta.annotation.Nullable
    public java.util.List<Notebook> getNotebooks() {
        return this.notebooks;
    }
    /**
     * Gets the operations property value. The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.
     * @return a onenoteOperation
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnenoteOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the pages property value. The pages in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     * @return a onenotePage
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnenotePage> getPages() {
        return this.pages;
    }
    /**
     * Gets the resources property value. The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get the binary content of a specific resource. Read-only. Nullable.
     * @return a onenoteResource
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnenoteResource> getResources() {
        return this.resources;
    }
    /**
     * Gets the sectionGroups property value. The section groups in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     * @return a sectionGroup
     */
    @jakarta.annotation.Nullable
    public java.util.List<SectionGroup> getSectionGroups() {
        return this.sectionGroups;
    }
    /**
     * Gets the sections property value. The sections in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     * @return a onenoteSection
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnenoteSection> getSections() {
        return this.sections;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("notebooks", this.getNotebooks());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("pages", this.getPages());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeCollectionOfObjectValues("sectionGroups", this.getSectionGroups());
        writer.writeCollectionOfObjectValues("sections", this.getSections());
    }
    /**
     * Sets the notebooks property value. The collection of OneNote notebooks that are owned by the user or group. Read-only. Nullable.
     * @param value Value to set for the notebooks property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNotebooks(@jakarta.annotation.Nullable final java.util.List<Notebook> value) {
        this.notebooks = value;
    }
    /**
     * Sets the operations property value. The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<OnenoteOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the pages property value. The pages in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     * @param value Value to set for the pages property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPages(@jakarta.annotation.Nullable final java.util.List<OnenotePage> value) {
        this.pages = value;
    }
    /**
     * Sets the resources property value. The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get the binary content of a specific resource. Read-only. Nullable.
     * @param value Value to set for the resources property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResources(@jakarta.annotation.Nullable final java.util.List<OnenoteResource> value) {
        this.resources = value;
    }
    /**
     * Sets the sectionGroups property value. The section groups in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     * @param value Value to set for the sectionGroups property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSectionGroups(@jakarta.annotation.Nullable final java.util.List<SectionGroup> value) {
        this.sectionGroups = value;
    }
    /**
     * Sets the sections property value. The sections in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     * @param value Value to set for the sections property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSections(@jakarta.annotation.Nullable final java.util.List<OnenoteSection> value) {
        this.sections = value;
    }
}
