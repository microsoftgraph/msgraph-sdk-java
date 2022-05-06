package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Onenote extends Entity implements Parsable {
    /** The collection of OneNote notebooks that are owned by the user or group. Read-only. Nullable.  */
    private java.util.List<Notebook> _notebooks;
    /** The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.  */
    private java.util.List<OnenoteOperation> _operations;
    /** The pages in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.  */
    private java.util.List<OnenotePage> _pages;
    /** The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get the binary content of a specific resource. Read-only. Nullable.  */
    private java.util.List<OnenoteResource> _resources;
    /** The section groups in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.  */
    private java.util.List<SectionGroup> _sectionGroups;
    /** The sections in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.  */
    private java.util.List<OnenoteSection> _sections;
    /**
     * Instantiates a new onenote and sets the default values.
     * @return a void
     */
    public Onenote() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onenote
     */
    @javax.annotation.Nonnull
    public static Onenote createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Onenote();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Onenote currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("notebooks", (n) -> { currentObject.setNotebooks(n.getCollectionOfObjectValues(Notebook::createFromDiscriminatorValue)); });
            this.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfObjectValues(OnenoteOperation::createFromDiscriminatorValue)); });
            this.put("pages", (n) -> { currentObject.setPages(n.getCollectionOfObjectValues(OnenotePage::createFromDiscriminatorValue)); });
            this.put("resources", (n) -> { currentObject.setResources(n.getCollectionOfObjectValues(OnenoteResource::createFromDiscriminatorValue)); });
            this.put("sectionGroups", (n) -> { currentObject.setSectionGroups(n.getCollectionOfObjectValues(SectionGroup::createFromDiscriminatorValue)); });
            this.put("sections", (n) -> { currentObject.setSections(n.getCollectionOfObjectValues(OnenoteSection::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the notebooks property value. The collection of OneNote notebooks that are owned by the user or group. Read-only. Nullable.
     * @return a notebook
     */
    @javax.annotation.Nullable
    public java.util.List<Notebook> getNotebooks() {
        return this._notebooks;
    }
    /**
     * Gets the operations property value. The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.
     * @return a onenoteOperation
     */
    @javax.annotation.Nullable
    public java.util.List<OnenoteOperation> getOperations() {
        return this._operations;
    }
    /**
     * Gets the pages property value. The pages in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     * @return a onenotePage
     */
    @javax.annotation.Nullable
    public java.util.List<OnenotePage> getPages() {
        return this._pages;
    }
    /**
     * Gets the resources property value. The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get the binary content of a specific resource. Read-only. Nullable.
     * @return a onenoteResource
     */
    @javax.annotation.Nullable
    public java.util.List<OnenoteResource> getResources() {
        return this._resources;
    }
    /**
     * Gets the sectionGroups property value. The section groups in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     * @return a sectionGroup
     */
    @javax.annotation.Nullable
    public java.util.List<SectionGroup> getSectionGroups() {
        return this._sectionGroups;
    }
    /**
     * Gets the sections property value. The sections in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     * @return a onenoteSection
     */
    @javax.annotation.Nullable
    public java.util.List<OnenoteSection> getSections() {
        return this._sections;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setNotebooks(@javax.annotation.Nullable final java.util.List<Notebook> value) {
        this._notebooks = value;
    }
    /**
     * Sets the operations property value. The status of OneNote operations. Getting an operations collection is not supported, but you can get the status of long-running operations if the Operation-Location header is returned in the response. Read-only. Nullable.
     * @param value Value to set for the operations property.
     * @return a void
     */
    public void setOperations(@javax.annotation.Nullable final java.util.List<OnenoteOperation> value) {
        this._operations = value;
    }
    /**
     * Sets the pages property value. The pages in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     * @param value Value to set for the pages property.
     * @return a void
     */
    public void setPages(@javax.annotation.Nullable final java.util.List<OnenotePage> value) {
        this._pages = value;
    }
    /**
     * Sets the resources property value. The image and other file resources in OneNote pages. Getting a resources collection is not supported, but you can get the binary content of a specific resource. Read-only. Nullable.
     * @param value Value to set for the resources property.
     * @return a void
     */
    public void setResources(@javax.annotation.Nullable final java.util.List<OnenoteResource> value) {
        this._resources = value;
    }
    /**
     * Sets the sectionGroups property value. The section groups in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     * @param value Value to set for the sectionGroups property.
     * @return a void
     */
    public void setSectionGroups(@javax.annotation.Nullable final java.util.List<SectionGroup> value) {
        this._sectionGroups = value;
    }
    /**
     * Sets the sections property value. The sections in all OneNote notebooks that are owned by the user or group.  Read-only. Nullable.
     * @param value Value to set for the sections property.
     * @return a void
     */
    public void setSections(@javax.annotation.Nullable final java.util.List<OnenoteSection> value) {
        this._sections = value;
    }
}
