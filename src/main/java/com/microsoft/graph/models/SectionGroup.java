package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SectionGroup extends OnenoteEntityHierarchyModel implements Parsable {
    /** The notebook that contains the section group. Read-only. */
    private Notebook _parentNotebook;
    /** The section group that contains the section group. Read-only. */
    private SectionGroup _parentSectionGroup;
    /** The section groups in the section. Read-only. Nullable. */
    private java.util.List<SectionGroup> _sectionGroups;
    /** The URL for the sectionGroups navigation property, which returns all the section groups in the section group. Read-only. */
    private String _sectionGroupsUrl;
    /** The sections in the section group. Read-only. Nullable. */
    private java.util.List<OnenoteSection> _sections;
    /** The URL for the sections navigation property, which returns all the sections in the section group. Read-only. */
    private String _sectionsUrl;
    /**
     * Instantiates a new sectionGroup and sets the default values.
     * @return a void
     */
    public SectionGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sectionGroup
     */
    @javax.annotation.Nonnull
    public static SectionGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SectionGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SectionGroup currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("parentNotebook", (n) -> { currentObject.setParentNotebook(n.getObjectValue(Notebook::createFromDiscriminatorValue)); });
            this.put("parentSectionGroup", (n) -> { currentObject.setParentSectionGroup(n.getObjectValue(SectionGroup::createFromDiscriminatorValue)); });
            this.put("sectionGroups", (n) -> { currentObject.setSectionGroups(n.getCollectionOfObjectValues(SectionGroup::createFromDiscriminatorValue)); });
            this.put("sectionGroupsUrl", (n) -> { currentObject.setSectionGroupsUrl(n.getStringValue()); });
            this.put("sections", (n) -> { currentObject.setSections(n.getCollectionOfObjectValues(OnenoteSection::createFromDiscriminatorValue)); });
            this.put("sectionsUrl", (n) -> { currentObject.setSectionsUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the parentNotebook property value. The notebook that contains the section group. Read-only.
     * @return a notebook
     */
    @javax.annotation.Nullable
    public Notebook getParentNotebook() {
        return this._parentNotebook;
    }
    /**
     * Gets the parentSectionGroup property value. The section group that contains the section group. Read-only.
     * @return a sectionGroup
     */
    @javax.annotation.Nullable
    public SectionGroup getParentSectionGroup() {
        return this._parentSectionGroup;
    }
    /**
     * Gets the sectionGroups property value. The section groups in the section. Read-only. Nullable.
     * @return a sectionGroup
     */
    @javax.annotation.Nullable
    public java.util.List<SectionGroup> getSectionGroups() {
        return this._sectionGroups;
    }
    /**
     * Gets the sectionGroupsUrl property value. The URL for the sectionGroups navigation property, which returns all the section groups in the section group. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSectionGroupsUrl() {
        return this._sectionGroupsUrl;
    }
    /**
     * Gets the sections property value. The sections in the section group. Read-only. Nullable.
     * @return a onenoteSection
     */
    @javax.annotation.Nullable
    public java.util.List<OnenoteSection> getSections() {
        return this._sections;
    }
    /**
     * Gets the sectionsUrl property value. The URL for the sections navigation property, which returns all the sections in the section group. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSectionsUrl() {
        return this._sectionsUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setParentNotebook(@javax.annotation.Nullable final Notebook value) {
        this._parentNotebook = value;
    }
    /**
     * Sets the parentSectionGroup property value. The section group that contains the section group. Read-only.
     * @param value Value to set for the parentSectionGroup property.
     * @return a void
     */
    public void setParentSectionGroup(@javax.annotation.Nullable final SectionGroup value) {
        this._parentSectionGroup = value;
    }
    /**
     * Sets the sectionGroups property value. The section groups in the section. Read-only. Nullable.
     * @param value Value to set for the sectionGroups property.
     * @return a void
     */
    public void setSectionGroups(@javax.annotation.Nullable final java.util.List<SectionGroup> value) {
        this._sectionGroups = value;
    }
    /**
     * Sets the sectionGroupsUrl property value. The URL for the sectionGroups navigation property, which returns all the section groups in the section group. Read-only.
     * @param value Value to set for the sectionGroupsUrl property.
     * @return a void
     */
    public void setSectionGroupsUrl(@javax.annotation.Nullable final String value) {
        this._sectionGroupsUrl = value;
    }
    /**
     * Sets the sections property value. The sections in the section group. Read-only. Nullable.
     * @param value Value to set for the sections property.
     * @return a void
     */
    public void setSections(@javax.annotation.Nullable final java.util.List<OnenoteSection> value) {
        this._sections = value;
    }
    /**
     * Sets the sectionsUrl property value. The URL for the sections navigation property, which returns all the sections in the section group. Read-only.
     * @param value Value to set for the sectionsUrl property.
     * @return a void
     */
    public void setSectionsUrl(@javax.annotation.Nullable final String value) {
        this._sectionsUrl = value;
    }
}
