package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Notebook extends OnenoteEntityHierarchyModel implements Parsable {
    /**
     * Instantiates a new Notebook and sets the default values.
     */
    public Notebook() {
        super();
        this.setOdataType("#microsoft.graph.notebook");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Notebook
     */
    @jakarta.annotation.Nonnull
    public static Notebook createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Notebook();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("isShared", (n) -> { this.setIsShared(n.getBooleanValue()); });
        deserializerMap.put("links", (n) -> { this.setLinks(n.getObjectValue(NotebookLinks::createFromDiscriminatorValue)); });
        deserializerMap.put("sectionGroups", (n) -> { this.setSectionGroups(n.getCollectionOfObjectValues(SectionGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("sectionGroupsUrl", (n) -> { this.setSectionGroupsUrl(n.getStringValue()); });
        deserializerMap.put("sections", (n) -> { this.setSections(n.getCollectionOfObjectValues(OnenoteSection::createFromDiscriminatorValue)); });
        deserializerMap.put("sectionsUrl", (n) -> { this.setSectionsUrl(n.getStringValue()); });
        deserializerMap.put("userRole", (n) -> { this.setUserRole(n.getEnumValue(OnenoteUserRole.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. Indicates whether this is the user's default notebook. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.backingStore.get("isDefault");
    }
    /**
     * Gets the isShared property value. Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the owner. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsShared() {
        return this.backingStore.get("isShared");
    }
    /**
     * Gets the links property value. Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
     * @return a NotebookLinks
     */
    @jakarta.annotation.Nullable
    public NotebookLinks getLinks() {
        return this.backingStore.get("links");
    }
    /**
     * Gets the sectionGroups property value. The section groups in the notebook. Read-only. Nullable.
     * @return a java.util.List<SectionGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SectionGroup> getSectionGroups() {
        return this.backingStore.get("sectionGroups");
    }
    /**
     * Gets the sectionGroupsUrl property value. The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSectionGroupsUrl() {
        return this.backingStore.get("sectionGroupsUrl");
    }
    /**
     * Gets the sections property value. The sections in the notebook. Read-only. Nullable.
     * @return a java.util.List<OnenoteSection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnenoteSection> getSections() {
        return this.backingStore.get("sections");
    }
    /**
     * Gets the sectionsUrl property value. The URL for the sections navigation property, which returns all the sections in the notebook. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSectionsUrl() {
        return this.backingStore.get("sectionsUrl");
    }
    /**
     * Gets the userRole property value. Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook. Contributor represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only.
     * @return a OnenoteUserRole
     */
    @jakarta.annotation.Nullable
    public OnenoteUserRole getUserRole() {
        return this.backingStore.get("userRole");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeBooleanValue("isShared", this.getIsShared());
        writer.writeObjectValue("links", this.getLinks());
        writer.writeCollectionOfObjectValues("sectionGroups", this.getSectionGroups());
        writer.writeStringValue("sectionGroupsUrl", this.getSectionGroupsUrl());
        writer.writeCollectionOfObjectValues("sections", this.getSections());
        writer.writeStringValue("sectionsUrl", this.getSectionsUrl());
        writer.writeEnumValue("userRole", this.getUserRole());
    }
    /**
     * Sets the isDefault property value. Indicates whether this is the user's default notebook. Read-only.
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefault", value);
    }
    /**
     * Sets the isShared property value. Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the owner. Read-only.
     * @param value Value to set for the isShared property.
     */
    public void setIsShared(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isShared", value);
    }
    /**
     * Sets the links property value. Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final NotebookLinks value) {
        this.backingStore.set("links", value);
    }
    /**
     * Sets the sectionGroups property value. The section groups in the notebook. Read-only. Nullable.
     * @param value Value to set for the sectionGroups property.
     */
    public void setSectionGroups(@jakarta.annotation.Nullable final java.util.List<SectionGroup> value) {
        this.backingStore.set("sectionGroups", value);
    }
    /**
     * Sets the sectionGroupsUrl property value. The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only.
     * @param value Value to set for the sectionGroupsUrl property.
     */
    public void setSectionGroupsUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sectionGroupsUrl", value);
    }
    /**
     * Sets the sections property value. The sections in the notebook. Read-only. Nullable.
     * @param value Value to set for the sections property.
     */
    public void setSections(@jakarta.annotation.Nullable final java.util.List<OnenoteSection> value) {
        this.backingStore.set("sections", value);
    }
    /**
     * Sets the sectionsUrl property value. The URL for the sections navigation property, which returns all the sections in the notebook. Read-only.
     * @param value Value to set for the sectionsUrl property.
     */
    public void setSectionsUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sectionsUrl", value);
    }
    /**
     * Sets the userRole property value. Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook. Contributor represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only.
     * @param value Value to set for the userRole property.
     */
    public void setUserRole(@jakarta.annotation.Nullable final OnenoteUserRole value) {
        this.backingStore.set("userRole", value);
    }
}
