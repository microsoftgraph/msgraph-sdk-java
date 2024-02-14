package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnenoteSection extends OnenoteEntityHierarchyModel implements Parsable {
    /**
     * Instantiates a new {@link OnenoteSection} and sets the default values.
     */
    public OnenoteSection() {
        super();
        this.setOdataType("#microsoft.graph.onenoteSection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnenoteSection}
     */
    @jakarta.annotation.Nonnull
    public static OnenoteSection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenoteSection();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.backingStore.get("isDefault");
    }
    /**
     * Gets the links property value. Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's installed. The oneNoteWebURL link opens the section in OneNote on the web.
     * @return a {@link SectionLinks}
     */
    @jakarta.annotation.Nullable
    public SectionLinks getLinks() {
        return this.backingStore.get("links");
    }
    /**
     * Gets the pages property value. The collection of pages in the section.  Read-only. Nullable.
     * @return a {@link java.util.List<OnenotePage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnenotePage> getPages() {
        return this.backingStore.get("pages");
    }
    /**
     * Gets the pagesUrl property value. The pages endpoint where you can get details for all the pages in the section. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPagesUrl() {
        return this.backingStore.get("pagesUrl");
    }
    /**
     * Gets the parentNotebook property value. The notebook that contains the section.  Read-only.
     * @return a {@link Notebook}
     */
    @jakarta.annotation.Nullable
    public Notebook getParentNotebook() {
        return this.backingStore.get("parentNotebook");
    }
    /**
     * Gets the parentSectionGroup property value. The section group that contains the section.  Read-only.
     * @return a {@link SectionGroup}
     */
    @jakarta.annotation.Nullable
    public SectionGroup getParentSectionGroup() {
        return this.backingStore.get("parentSectionGroup");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefault", value);
    }
    /**
     * Sets the links property value. Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's installed. The oneNoteWebURL link opens the section in OneNote on the web.
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final SectionLinks value) {
        this.backingStore.set("links", value);
    }
    /**
     * Sets the pages property value. The collection of pages in the section.  Read-only. Nullable.
     * @param value Value to set for the pages property.
     */
    public void setPages(@jakarta.annotation.Nullable final java.util.List<OnenotePage> value) {
        this.backingStore.set("pages", value);
    }
    /**
     * Sets the pagesUrl property value. The pages endpoint where you can get details for all the pages in the section. Read-only.
     * @param value Value to set for the pagesUrl property.
     */
    public void setPagesUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("pagesUrl", value);
    }
    /**
     * Sets the parentNotebook property value. The notebook that contains the section.  Read-only.
     * @param value Value to set for the parentNotebook property.
     */
    public void setParentNotebook(@jakarta.annotation.Nullable final Notebook value) {
        this.backingStore.set("parentNotebook", value);
    }
    /**
     * Sets the parentSectionGroup property value. The section group that contains the section.  Read-only.
     * @param value Value to set for the parentSectionGroup property.
     */
    public void setParentSectionGroup(@jakarta.annotation.Nullable final SectionGroup value) {
        this.backingStore.set("parentSectionGroup", value);
    }
}
