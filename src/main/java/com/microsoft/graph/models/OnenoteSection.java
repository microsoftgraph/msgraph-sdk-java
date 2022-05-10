package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnenoteSection extends OnenoteEntityHierarchyModel implements Parsable {
    /** Indicates whether this is the user's default section. Read-only. */
    private Boolean _isDefault;
    /** Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's installed. The oneNoteWebURL link opens the section in OneNote on the web. */
    private SectionLinks _links;
    /** The collection of pages in the section.  Read-only. Nullable. */
    private java.util.List<OnenotePage> _pages;
    /** The pages endpoint where you can get details for all the pages in the section. Read-only. */
    private String _pagesUrl;
    /** The notebook that contains the section.  Read-only. */
    private Notebook _parentNotebook;
    /** The section group that contains the section.  Read-only. */
    private SectionGroup _parentSectionGroup;
    /**
     * Instantiates a new onenoteSection and sets the default values.
     * @return a void
     */
    public OnenoteSection() {
        super();
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnenoteSection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("isDefault", (n) -> { currentObject.setIsDefault(n.getBooleanValue()); });
            this.put("links", (n) -> { currentObject.setLinks(n.getObjectValue(SectionLinks::createFromDiscriminatorValue)); });
            this.put("pages", (n) -> { currentObject.setPages(n.getCollectionOfObjectValues(OnenotePage::createFromDiscriminatorValue)); });
            this.put("pagesUrl", (n) -> { currentObject.setPagesUrl(n.getStringValue()); });
            this.put("parentNotebook", (n) -> { currentObject.setParentNotebook(n.getObjectValue(Notebook::createFromDiscriminatorValue)); });
            this.put("parentSectionGroup", (n) -> { currentObject.setParentSectionGroup(n.getObjectValue(SectionGroup::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isDefault property value. Indicates whether this is the user's default section. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this._isDefault;
    }
    /**
     * Gets the links property value. Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's installed. The oneNoteWebURL link opens the section in OneNote on the web.
     * @return a sectionLinks
     */
    @javax.annotation.Nullable
    public SectionLinks getLinks() {
        return this._links;
    }
    /**
     * Gets the pages property value. The collection of pages in the section.  Read-only. Nullable.
     * @return a onenotePage
     */
    @javax.annotation.Nullable
    public java.util.List<OnenotePage> getPages() {
        return this._pages;
    }
    /**
     * Gets the pagesUrl property value. The pages endpoint where you can get details for all the pages in the section. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPagesUrl() {
        return this._pagesUrl;
    }
    /**
     * Gets the parentNotebook property value. The notebook that contains the section.  Read-only.
     * @return a notebook
     */
    @javax.annotation.Nullable
    public Notebook getParentNotebook() {
        return this._parentNotebook;
    }
    /**
     * Gets the parentSectionGroup property value. The section group that contains the section.  Read-only.
     * @return a sectionGroup
     */
    @javax.annotation.Nullable
    public SectionGroup getParentSectionGroup() {
        return this._parentSectionGroup;
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
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this._isDefault = value;
    }
    /**
     * Sets the links property value. Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's installed. The oneNoteWebURL link opens the section in OneNote on the web.
     * @param value Value to set for the links property.
     * @return a void
     */
    public void setLinks(@javax.annotation.Nullable final SectionLinks value) {
        this._links = value;
    }
    /**
     * Sets the pages property value. The collection of pages in the section.  Read-only. Nullable.
     * @param value Value to set for the pages property.
     * @return a void
     */
    public void setPages(@javax.annotation.Nullable final java.util.List<OnenotePage> value) {
        this._pages = value;
    }
    /**
     * Sets the pagesUrl property value. The pages endpoint where you can get details for all the pages in the section. Read-only.
     * @param value Value to set for the pagesUrl property.
     * @return a void
     */
    public void setPagesUrl(@javax.annotation.Nullable final String value) {
        this._pagesUrl = value;
    }
    /**
     * Sets the parentNotebook property value. The notebook that contains the section.  Read-only.
     * @param value Value to set for the parentNotebook property.
     * @return a void
     */
    public void setParentNotebook(@javax.annotation.Nullable final Notebook value) {
        this._parentNotebook = value;
    }
    /**
     * Sets the parentSectionGroup property value. The section group that contains the section.  Read-only.
     * @param value Value to set for the parentSectionGroup property.
     * @return a void
     */
    public void setParentSectionGroup(@javax.annotation.Nullable final SectionGroup value) {
        this._parentSectionGroup = value;
    }
}
