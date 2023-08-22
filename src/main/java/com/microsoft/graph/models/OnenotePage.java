package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnenotePage extends OnenoteEntitySchemaObjectModel implements Parsable {
    /**
     * The page's HTML content.
     */
    private byte[] content;
    /**
     * The URL for the page's HTML content.  Read-only.
     */
    private String contentUrl;
    /**
     * The unique identifier of the application that created the page. Read-only.
     */
    private String createdByAppId;
    /**
     * The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The indentation level of the page. Read-only.
     */
    private Integer level;
    /**
     * Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed. The oneNoteWebUrl link opens the page in OneNote on the web. Read-only.
     */
    private PageLinks links;
    /**
     * The order of the page within its parent section. Read-only.
     */
    private Integer order;
    /**
     * The notebook that contains the page.  Read-only.
     */
    private Notebook parentNotebook;
    /**
     * The section that contains the page. Read-only.
     */
    private OnenoteSection parentSection;
    /**
     * The title of the page.
     */
    private String title;
    /**
     * The userTags property
     */
    private java.util.List<String> userTags;
    /**
     * Instantiates a new onenotePage and sets the default values.
     */
    public OnenotePage() {
        super();
        this.setOdataType("#microsoft.graph.onenotePage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onenotePage
     */
    @jakarta.annotation.Nonnull
    public static OnenotePage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenotePage();
    }
    /**
     * Gets the content property value. The page's HTML content.
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * Gets the contentUrl property value. The URL for the page's HTML content.  Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContentUrl() {
        return this.contentUrl;
    }
    /**
     * Gets the createdByAppId property value. The unique identifier of the application that created the page. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCreatedByAppId() {
        return this.createdByAppId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("contentUrl", (n) -> { this.setContentUrl(n.getStringValue()); });
        deserializerMap.put("createdByAppId", (n) -> { this.setCreatedByAppId(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("level", (n) -> { this.setLevel(n.getIntegerValue()); });
        deserializerMap.put("links", (n) -> { this.setLinks(n.getObjectValue(PageLinks::createFromDiscriminatorValue)); });
        deserializerMap.put("order", (n) -> { this.setOrder(n.getIntegerValue()); });
        deserializerMap.put("parentNotebook", (n) -> { this.setParentNotebook(n.getObjectValue(Notebook::createFromDiscriminatorValue)); });
        deserializerMap.put("parentSection", (n) -> { this.setParentSection(n.getObjectValue(OnenoteSection::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("userTags", (n) -> { this.setUserTags(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the level property value. The indentation level of the page. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getLevel() {
        return this.level;
    }
    /**
     * Gets the links property value. Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed. The oneNoteWebUrl link opens the page in OneNote on the web. Read-only.
     * @return a pageLinks
     */
    @jakarta.annotation.Nullable
    public PageLinks getLinks() {
        return this.links;
    }
    /**
     * Gets the order property value. The order of the page within its parent section. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getOrder() {
        return this.order;
    }
    /**
     * Gets the parentNotebook property value. The notebook that contains the page.  Read-only.
     * @return a notebook
     */
    @jakarta.annotation.Nullable
    public Notebook getParentNotebook() {
        return this.parentNotebook;
    }
    /**
     * Gets the parentSection property value. The section that contains the page. Read-only.
     * @return a onenoteSection
     */
    @jakarta.annotation.Nullable
    public OnenoteSection getParentSection() {
        return this.parentSection;
    }
    /**
     * Gets the title property value. The title of the page.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the userTags property value. The userTags property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUserTags() {
        return this.userTags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the contentUrl property value. The URL for the page's HTML content.  Read-only.
     * @param value Value to set for the contentUrl property.
     */
    public void setContentUrl(@jakarta.annotation.Nullable final String value) {
        this.contentUrl = value;
    }
    /**
     * Sets the createdByAppId property value. The unique identifier of the application that created the page. Read-only.
     * @param value Value to set for the createdByAppId property.
     */
    public void setCreatedByAppId(@jakarta.annotation.Nullable final String value) {
        this.createdByAppId = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the level property value. The indentation level of the page. Read-only.
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final Integer value) {
        this.level = value;
    }
    /**
     * Sets the links property value. Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed. The oneNoteWebUrl link opens the page in OneNote on the web. Read-only.
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final PageLinks value) {
        this.links = value;
    }
    /**
     * Sets the order property value. The order of the page within its parent section. Read-only.
     * @param value Value to set for the order property.
     */
    public void setOrder(@jakarta.annotation.Nullable final Integer value) {
        this.order = value;
    }
    /**
     * Sets the parentNotebook property value. The notebook that contains the page.  Read-only.
     * @param value Value to set for the parentNotebook property.
     */
    public void setParentNotebook(@jakarta.annotation.Nullable final Notebook value) {
        this.parentNotebook = value;
    }
    /**
     * Sets the parentSection property value. The section that contains the page. Read-only.
     * @param value Value to set for the parentSection property.
     */
    public void setParentSection(@jakarta.annotation.Nullable final OnenoteSection value) {
        this.parentSection = value;
    }
    /**
     * Sets the title property value. The title of the page.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the userTags property value. The userTags property
     * @param value Value to set for the userTags property.
     */
    public void setUserTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.userTags = value;
    }
}
