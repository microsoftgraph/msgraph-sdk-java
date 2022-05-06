package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnenotePage extends OnenoteEntitySchemaObjectModel implements Parsable {
    /** The page's HTML content.  */
    private byte[] _content;
    /** The URL for the page's HTML content.  Read-only.  */
    private String _contentUrl;
    /** The unique identifier of the application that created the page. Read-only.  */
    private String _createdByAppId;
    /** The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.  */
    private OffsetDateTime _lastModifiedDateTime;
    /** The indentation level of the page. Read-only.  */
    private Integer _level;
    /** Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed. The oneNoteWebUrl link opens the page in OneNote on the web. Read-only.  */
    private PageLinks _links;
    /** The order of the page within its parent section. Read-only.  */
    private Integer _order;
    /** The notebook that contains the page.  Read-only.  */
    private Notebook _parentNotebook;
    /** The section that contains the page. Read-only.  */
    private OnenoteSection _parentSection;
    /** The title of the page.  */
    private String _title;
    /** The userTags property  */
    private java.util.List<String> _userTags;
    /**
     * Instantiates a new onenotePage and sets the default values.
     * @return a void
     */
    public OnenotePage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onenotePage
     */
    @javax.annotation.Nonnull
    public static OnenotePage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenotePage();
    }
    /**
     * Gets the content property value. The page's HTML content.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this._content;
    }
    /**
     * Gets the contentUrl property value. The URL for the page's HTML content.  Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentUrl() {
        return this._contentUrl;
    }
    /**
     * Gets the createdByAppId property value. The unique identifier of the application that created the page. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedByAppId() {
        return this._createdByAppId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnenotePage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("content", (n) -> { currentObject.setContent(n.getByteArrayValue()); });
            this.put("contentUrl", (n) -> { currentObject.setContentUrl(n.getStringValue()); });
            this.put("createdByAppId", (n) -> { currentObject.setCreatedByAppId(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("level", (n) -> { currentObject.setLevel(n.getIntegerValue()); });
            this.put("links", (n) -> { currentObject.setLinks(n.getObjectValue(PageLinks::createFromDiscriminatorValue)); });
            this.put("order", (n) -> { currentObject.setOrder(n.getIntegerValue()); });
            this.put("parentNotebook", (n) -> { currentObject.setParentNotebook(n.getObjectValue(Notebook::createFromDiscriminatorValue)); });
            this.put("parentSection", (n) -> { currentObject.setParentSection(n.getObjectValue(OnenoteSection::createFromDiscriminatorValue)); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
            this.put("userTags", (n) -> { currentObject.setUserTags(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the level property value. The indentation level of the page. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLevel() {
        return this._level;
    }
    /**
     * Gets the links property value. Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed. The oneNoteWebUrl link opens the page in OneNote on the web. Read-only.
     * @return a pageLinks
     */
    @javax.annotation.Nullable
    public PageLinks getLinks() {
        return this._links;
    }
    /**
     * Gets the order property value. The order of the page within its parent section. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOrder() {
        return this._order;
    }
    /**
     * Gets the parentNotebook property value. The notebook that contains the page.  Read-only.
     * @return a notebook
     */
    @javax.annotation.Nullable
    public Notebook getParentNotebook() {
        return this._parentNotebook;
    }
    /**
     * Gets the parentSection property value. The section that contains the page. Read-only.
     * @return a onenoteSection
     */
    @javax.annotation.Nullable
    public OnenoteSection getParentSection() {
        return this._parentSection;
    }
    /**
     * Gets the title property value. The title of the page.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Gets the userTags property value. The userTags property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUserTags() {
        return this._userTags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeStringValue("contentUrl", this.getContentUrl());
        writer.writeStringValue("createdByAppId", this.getCreatedByAppId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeIntegerValue("level", this.getLevel());
        writer.writeObjectValue("links", this.getLinks());
        writer.writeIntegerValue("order", this.getOrder());
        writer.writeObjectValue("parentNotebook", this.getParentNotebook());
        writer.writeObjectValue("parentSection", this.getParentSection());
        writer.writeStringValue("title", this.getTitle());
        writer.writeCollectionOfPrimitiveValues("userTags", this.getUserTags());
    }
    /**
     * Sets the content property value. The page's HTML content.
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this._content = value;
    }
    /**
     * Sets the contentUrl property value. The URL for the page's HTML content.  Read-only.
     * @param value Value to set for the contentUrl property.
     * @return a void
     */
    public void setContentUrl(@javax.annotation.Nullable final String value) {
        this._contentUrl = value;
    }
    /**
     * Sets the createdByAppId property value. The unique identifier of the application that created the page. Read-only.
     * @param value Value to set for the createdByAppId property.
     * @return a void
     */
    public void setCreatedByAppId(@javax.annotation.Nullable final String value) {
        this._createdByAppId = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the level property value. The indentation level of the page. Read-only.
     * @param value Value to set for the level property.
     * @return a void
     */
    public void setLevel(@javax.annotation.Nullable final Integer value) {
        this._level = value;
    }
    /**
     * Sets the links property value. Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed. The oneNoteWebUrl link opens the page in OneNote on the web. Read-only.
     * @param value Value to set for the links property.
     * @return a void
     */
    public void setLinks(@javax.annotation.Nullable final PageLinks value) {
        this._links = value;
    }
    /**
     * Sets the order property value. The order of the page within its parent section. Read-only.
     * @param value Value to set for the order property.
     * @return a void
     */
    public void setOrder(@javax.annotation.Nullable final Integer value) {
        this._order = value;
    }
    /**
     * Sets the parentNotebook property value. The notebook that contains the page.  Read-only.
     * @param value Value to set for the parentNotebook property.
     * @return a void
     */
    public void setParentNotebook(@javax.annotation.Nullable final Notebook value) {
        this._parentNotebook = value;
    }
    /**
     * Sets the parentSection property value. The section that contains the page. Read-only.
     * @param value Value to set for the parentSection property.
     * @return a void
     */
    public void setParentSection(@javax.annotation.Nullable final OnenoteSection value) {
        this._parentSection = value;
    }
    /**
     * Sets the title property value. The title of the page.
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
    /**
     * Sets the userTags property value. The userTags property
     * @param value Value to set for the userTags property.
     * @return a void
     */
    public void setUserTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._userTags = value;
    }
}
