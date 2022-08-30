package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Notebook extends OnenoteEntityHierarchyModel implements Parsable {
    /** Indicates whether this is the user's default notebook. Read-only. */
    private Boolean _isDefault;
    /** Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the owner. Read-only. */
    private Boolean _isShared;
    /** Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's installed. The oneNoteWebURL link opens the notebook in OneNote on the web. */
    private NotebookLinks _links;
    /** The section groups in the notebook. Read-only. Nullable. */
    private java.util.List<SectionGroup> _sectionGroups;
    /** The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only. */
    private String _sectionGroupsUrl;
    /** The sections in the notebook. Read-only. Nullable. */
    private java.util.List<OnenoteSection> _sections;
    /** The URL for the sections navigation property, which returns all the sections in the notebook. Read-only. */
    private String _sectionsUrl;
    /** Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook. Contributor represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only. */
    private OnenoteUserRole _userRole;
    /**
     * Instantiates a new Notebook and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static Notebook createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Notebook();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Notebook currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("isDefault", (n) -> { currentObject.setIsDefault(n.getBooleanValue()); });
            this.put("isShared", (n) -> { currentObject.setIsShared(n.getBooleanValue()); });
            this.put("links", (n) -> { currentObject.setLinks(n.getObjectValue(NotebookLinks::createFromDiscriminatorValue)); });
            this.put("sectionGroups", (n) -> { currentObject.setSectionGroups(n.getCollectionOfObjectValues(SectionGroup::createFromDiscriminatorValue)); });
            this.put("sectionGroupsUrl", (n) -> { currentObject.setSectionGroupsUrl(n.getStringValue()); });
            this.put("sections", (n) -> { currentObject.setSections(n.getCollectionOfObjectValues(OnenoteSection::createFromDiscriminatorValue)); });
            this.put("sectionsUrl", (n) -> { currentObject.setSectionsUrl(n.getStringValue()); });
            this.put("userRole", (n) -> { currentObject.setUserRole(n.getEnumValue(OnenoteUserRole.class)); });
        }};
    }
    /**
     * Gets the isDefault property value. Indicates whether this is the user's default notebook. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this._isDefault;
    }
    /**
     * Gets the isShared property value. Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the owner. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsShared() {
        return this._isShared;
    }
    /**
     * Gets the links property value. Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
     * @return a notebookLinks
     */
    @javax.annotation.Nullable
    public NotebookLinks getLinks() {
        return this._links;
    }
    /**
     * Gets the sectionGroups property value. The section groups in the notebook. Read-only. Nullable.
     * @return a sectionGroup
     */
    @javax.annotation.Nullable
    public java.util.List<SectionGroup> getSectionGroups() {
        return this._sectionGroups;
    }
    /**
     * Gets the sectionGroupsUrl property value. The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSectionGroupsUrl() {
        return this._sectionGroupsUrl;
    }
    /**
     * Gets the sections property value. The sections in the notebook. Read-only. Nullable.
     * @return a onenoteSection
     */
    @javax.annotation.Nullable
    public java.util.List<OnenoteSection> getSections() {
        return this._sections;
    }
    /**
     * Gets the sectionsUrl property value. The URL for the sections navigation property, which returns all the sections in the notebook. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSectionsUrl() {
        return this._sectionsUrl;
    }
    /**
     * Gets the userRole property value. Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook. Contributor represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only.
     * @return a onenoteUserRole
     */
    @javax.annotation.Nullable
    public OnenoteUserRole getUserRole() {
        return this._userRole;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this._isDefault = value;
    }
    /**
     * Sets the isShared property value. Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the owner. Read-only.
     * @param value Value to set for the isShared property.
     * @return a void
     */
    public void setIsShared(@javax.annotation.Nullable final Boolean value) {
        this._isShared = value;
    }
    /**
     * Sets the links property value. Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
     * @param value Value to set for the links property.
     * @return a void
     */
    public void setLinks(@javax.annotation.Nullable final NotebookLinks value) {
        this._links = value;
    }
    /**
     * Sets the sectionGroups property value. The section groups in the notebook. Read-only. Nullable.
     * @param value Value to set for the sectionGroups property.
     * @return a void
     */
    public void setSectionGroups(@javax.annotation.Nullable final java.util.List<SectionGroup> value) {
        this._sectionGroups = value;
    }
    /**
     * Sets the sectionGroupsUrl property value. The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only.
     * @param value Value to set for the sectionGroupsUrl property.
     * @return a void
     */
    public void setSectionGroupsUrl(@javax.annotation.Nullable final String value) {
        this._sectionGroupsUrl = value;
    }
    /**
     * Sets the sections property value. The sections in the notebook. Read-only. Nullable.
     * @param value Value to set for the sections property.
     * @return a void
     */
    public void setSections(@javax.annotation.Nullable final java.util.List<OnenoteSection> value) {
        this._sections = value;
    }
    /**
     * Sets the sectionsUrl property value. The URL for the sections navigation property, which returns all the sections in the notebook. Read-only.
     * @param value Value to set for the sectionsUrl property.
     * @return a void
     */
    public void setSectionsUrl(@javax.annotation.Nullable final String value) {
        this._sectionsUrl = value;
    }
    /**
     * Sets the userRole property value. Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook. Contributor represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only.
     * @param value Value to set for the userRole property.
     * @return a void
     */
    public void setUserRole(@javax.annotation.Nullable final OnenoteUserRole value) {
        this._userRole = value;
    }
}
