package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnenoteSection extends OnenoteEntityHierarchyModel implements Parsable {
    /**
     * Indicates whether this is the user's default section. Read-only.
     */
    private Boolean isDefault;
    /**
     * Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's installed. The oneNoteWebURL link opens the section in OneNote on the web.
     */
    private SectionLinks links;
    /**
     * The collection of pages in the section.  Read-only. Nullable.
     */
    private java.util.List<OnenotePage> pages;
    /**
     * The pages endpoint where you can get details for all the pages in the section. Read-only.
     */
    private String pagesUrl;
    /**
     * The notebook that contains the section.  Read-only.
     */
    private Notebook parentNotebook;
    /**
     * The section group that contains the section.  Read-only.
     */
    private SectionGroup parentSectionGroup;
    /**
     * Instantiates a new onenoteSection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnenoteSection() {
        super();
        this.setOdataType("#microsoft.graph.onenoteSection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onenoteSection
     */
    @javax.annotation.Nonnull
    public static OnenoteSection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenoteSection();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("links", (n) -> { this.setLinks(n.getObjectValue(SectionLinks::createFromDiscriminatorValue)); });
        deserializerMap.put("pages", (n) -> { this.setPages(n.getCollectionOfObjectValues(OnenotePage::createFromDiscriminatorValue)); });
        deserializerMap.put("pagesUrl", (n) -> { this.setPagesUrl(n.getStringValue()); });
        deserializerMap.put("parentNotebook", (n) -> { this.setParentNotebook(n.getObjectValue(Notebook::createFromDiscriminatorValue)); });
        deserializerMap.put("parentSectionGroup", (n) -> { this.setParentSectionGroup(n.getObjectValue(SectionGroup::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. Indicates whether this is the user's default section. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the links property value. Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's installed. The oneNoteWebURL link opens the section in OneNote on the web.
     * @return a sectionLinks
     */
    @javax.annotation.Nullable
    public SectionLinks getLinks() {
        return this.links;
    }
    /**
     * Gets the pages property value. The collection of pages in the section.  Read-only. Nullable.
     * @return a onenotePage
     */
    @javax.annotation.Nullable
    public java.util.List<OnenotePage> getPages() {
        return this.pages;
    }
    /**
     * Gets the pagesUrl property value. The pages endpoint where you can get details for all the pages in the section. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPagesUrl() {
        return this.pagesUrl;
    }
    /**
     * Gets the parentNotebook property value. The notebook that contains the section.  Read-only.
     * @return a notebook
     */
    @javax.annotation.Nullable
    public Notebook getParentNotebook() {
        return this.parentNotebook;
    }
    /**
     * Gets the parentSectionGroup property value. The section group that contains the section.  Read-only.
     * @return a sectionGroup
     */
    @javax.annotation.Nullable
    public SectionGroup getParentSectionGroup() {
        return this.parentSectionGroup;
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
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeObjectValue("links", this.getLinks());
        writer.writeCollectionOfObjectValues("pages", this.getPages());
        writer.writeStringValue("pagesUrl", this.getPagesUrl());
        writer.writeObjectValue("parentNotebook", this.getParentNotebook());
        writer.writeObjectValue("parentSectionGroup", this.getParentSectionGroup());
    }
    /**
     * Sets the isDefault property value. Indicates whether this is the user's default section. Read-only.
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the links property value. Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's installed. The oneNoteWebURL link opens the section in OneNote on the web.
     * @param value Value to set for the links property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLinks(@javax.annotation.Nullable final SectionLinks value) {
        this.links = value;
    }
    /**
     * Sets the pages property value. The collection of pages in the section.  Read-only. Nullable.
     * @param value Value to set for the pages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPages(@javax.annotation.Nullable final java.util.List<OnenotePage> value) {
        this.pages = value;
    }
    /**
     * Sets the pagesUrl property value. The pages endpoint where you can get details for all the pages in the section. Read-only.
     * @param value Value to set for the pagesUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPagesUrl(@javax.annotation.Nullable final String value) {
        this.pagesUrl = value;
    }
    /**
     * Sets the parentNotebook property value. The notebook that contains the section.  Read-only.
     * @param value Value to set for the parentNotebook property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentNotebook(@javax.annotation.Nullable final Notebook value) {
        this.parentNotebook = value;
    }
    /**
     * Sets the parentSectionGroup property value. The section group that contains the section.  Read-only.
     * @param value Value to set for the parentSectionGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentSectionGroup(@javax.annotation.Nullable final SectionGroup value) {
        this.parentSectionGroup = value;
    }
}
