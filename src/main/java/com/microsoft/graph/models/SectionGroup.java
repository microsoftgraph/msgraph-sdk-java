package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SectionGroup extends OnenoteEntityHierarchyModel implements Parsable {
    /**
     * Instantiates a new SectionGroup and sets the default values.
     */
    public SectionGroup() {
        super();
        this.setOdataType("#microsoft.graph.sectionGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SectionGroup
     */
    @jakarta.annotation.Nonnull
    public static SectionGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SectionGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("parentNotebook", (n) -> { this.setParentNotebook(n.getObjectValue(Notebook::createFromDiscriminatorValue)); });
        deserializerMap.put("parentSectionGroup", (n) -> { this.setParentSectionGroup(n.getObjectValue(SectionGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("sectionGroups", (n) -> { this.setSectionGroups(n.getCollectionOfObjectValues(SectionGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("sectionGroupsUrl", (n) -> { this.setSectionGroupsUrl(n.getStringValue()); });
        deserializerMap.put("sections", (n) -> { this.setSections(n.getCollectionOfObjectValues(OnenoteSection::createFromDiscriminatorValue)); });
        deserializerMap.put("sectionsUrl", (n) -> { this.setSectionsUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the parentNotebook property value. The notebook that contains the section group. Read-only.
     * @return a Notebook
     */
    @jakarta.annotation.Nullable
    public Notebook getParentNotebook() {
        return this.backingStore.get("parentNotebook");
    }
    /**
     * Gets the parentSectionGroup property value. The section group that contains the section group. Read-only.
     * @return a SectionGroup
     */
    @jakarta.annotation.Nullable
    public SectionGroup getParentSectionGroup() {
        return this.backingStore.get("parentSectionGroup");
    }
    /**
     * Gets the sectionGroups property value. The section groups in the section. Read-only. Nullable.
     * @return a java.util.List<SectionGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SectionGroup> getSectionGroups() {
        return this.backingStore.get("sectionGroups");
    }
    /**
     * Gets the sectionGroupsUrl property value. The URL for the sectionGroups navigation property, which returns all the section groups in the section group. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSectionGroupsUrl() {
        return this.backingStore.get("sectionGroupsUrl");
    }
    /**
     * Gets the sections property value. The sections in the section group. Read-only. Nullable.
     * @return a java.util.List<OnenoteSection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnenoteSection> getSections() {
        return this.backingStore.get("sections");
    }
    /**
     * Gets the sectionsUrl property value. The URL for the sections navigation property, which returns all the sections in the section group. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSectionsUrl() {
        return this.backingStore.get("sectionsUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("parentNotebook", this.getParentNotebook());
        writer.writeObjectValue("parentSectionGroup", this.getParentSectionGroup());
        writer.writeCollectionOfObjectValues("sectionGroups", this.getSectionGroups());
        writer.writeStringValue("sectionGroupsUrl", this.getSectionGroupsUrl());
        writer.writeCollectionOfObjectValues("sections", this.getSections());
        writer.writeStringValue("sectionsUrl", this.getSectionsUrl());
    }
    /**
     * Sets the parentNotebook property value. The notebook that contains the section group. Read-only.
     * @param value Value to set for the parentNotebook property.
     */
    public void setParentNotebook(@jakarta.annotation.Nullable final Notebook value) {
        this.backingStore.set("parentNotebook", value);
    }
    /**
     * Sets the parentSectionGroup property value. The section group that contains the section group. Read-only.
     * @param value Value to set for the parentSectionGroup property.
     */
    public void setParentSectionGroup(@jakarta.annotation.Nullable final SectionGroup value) {
        this.backingStore.set("parentSectionGroup", value);
    }
    /**
     * Sets the sectionGroups property value. The section groups in the section. Read-only. Nullable.
     * @param value Value to set for the sectionGroups property.
     */
    public void setSectionGroups(@jakarta.annotation.Nullable final java.util.List<SectionGroup> value) {
        this.backingStore.set("sectionGroups", value);
    }
    /**
     * Sets the sectionGroupsUrl property value. The URL for the sectionGroups navigation property, which returns all the section groups in the section group. Read-only.
     * @param value Value to set for the sectionGroupsUrl property.
     */
    public void setSectionGroupsUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sectionGroupsUrl", value);
    }
    /**
     * Sets the sections property value. The sections in the section group. Read-only. Nullable.
     * @param value Value to set for the sections property.
     */
    public void setSections(@jakarta.annotation.Nullable final java.util.List<OnenoteSection> value) {
        this.backingStore.set("sections", value);
    }
    /**
     * Sets the sectionsUrl property value. The URL for the sections navigation property, which returns all the sections in the section group. Read-only.
     * @param value Value to set for the sectionsUrl property.
     */
    public void setSectionsUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sectionsUrl", value);
    }
}
