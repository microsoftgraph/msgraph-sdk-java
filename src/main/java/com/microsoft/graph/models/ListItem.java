package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ListItem extends BaseItem implements Parsable {
    /** Analytics about the view activities that took place on this item. */
    private ItemAnalytics _analytics;
    /** The content type of this list item */
    private ContentTypeInfo _contentType;
    /** Version information for a document set version created by a user. */
    private java.util.List<DocumentSetVersion> _documentSetVersions;
    /** For document libraries, the driveItem relationship exposes the listItem as a [driveItem][] */
    private DriveItem _driveItem;
    /** The values of the columns set on this list item. */
    private FieldValueSet _fields;
    /** Returns identifiers useful for SharePoint REST compatibility. Read-only. */
    private SharepointIds _sharepointIds;
    /** The list of previous versions of the list item. */
    private java.util.List<ListItemVersion> _versions;
    /**
     * Instantiates a new listItem and sets the default values.
     * @return a void
     */
    public ListItem() {
        super();
        this.setOdataType("#microsoft.graph.listItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a listItem
     */
    @javax.annotation.Nonnull
    public static ListItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListItem();
    }
    /**
     * Gets the analytics property value. Analytics about the view activities that took place on this item.
     * @return a itemAnalytics
     */
    @javax.annotation.Nullable
    public ItemAnalytics getAnalytics() {
        return this._analytics;
    }
    /**
     * Gets the contentType property value. The content type of this list item
     * @return a contentTypeInfo
     */
    @javax.annotation.Nullable
    public ContentTypeInfo getContentType() {
        return this._contentType;
    }
    /**
     * Gets the documentSetVersions property value. Version information for a document set version created by a user.
     * @return a documentSetVersion
     */
    @javax.annotation.Nullable
    public java.util.List<DocumentSetVersion> getDocumentSetVersions() {
        return this._documentSetVersions;
    }
    /**
     * Gets the driveItem property value. For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public DriveItem getDriveItem() {
        return this._driveItem;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ListItem currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("analytics", (n) -> { currentObject.setAnalytics(n.getObjectValue(ItemAnalytics::createFromDiscriminatorValue)); });
            this.put("contentType", (n) -> { currentObject.setContentType(n.getObjectValue(ContentTypeInfo::createFromDiscriminatorValue)); });
            this.put("documentSetVersions", (n) -> { currentObject.setDocumentSetVersions(n.getCollectionOfObjectValues(DocumentSetVersion::createFromDiscriminatorValue)); });
            this.put("driveItem", (n) -> { currentObject.setDriveItem(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
            this.put("fields", (n) -> { currentObject.setFields(n.getObjectValue(FieldValueSet::createFromDiscriminatorValue)); });
            this.put("sharepointIds", (n) -> { currentObject.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
            this.put("versions", (n) -> { currentObject.setVersions(n.getCollectionOfObjectValues(ListItemVersion::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the fields property value. The values of the columns set on this list item.
     * @return a fieldValueSet
     */
    @javax.annotation.Nullable
    public FieldValueSet getFields() {
        return this._fields;
    }
    /**
     * Gets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @return a sharepointIds
     */
    @javax.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this._sharepointIds;
    }
    /**
     * Gets the versions property value. The list of previous versions of the list item.
     * @return a listItemVersion
     */
    @javax.annotation.Nullable
    public java.util.List<ListItemVersion> getVersions() {
        return this._versions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("analytics", this.getAnalytics());
        writer.writeObjectValue("contentType", this.getContentType());
        writer.writeCollectionOfObjectValues("documentSetVersions", this.getDocumentSetVersions());
        writer.writeObjectValue("driveItem", this.getDriveItem());
        writer.writeObjectValue("fields", this.getFields());
        writer.writeObjectValue("sharepointIds", this.getSharepointIds());
        writer.writeCollectionOfObjectValues("versions", this.getVersions());
    }
    /**
     * Sets the analytics property value. Analytics about the view activities that took place on this item.
     * @param value Value to set for the analytics property.
     * @return a void
     */
    public void setAnalytics(@javax.annotation.Nullable final ItemAnalytics value) {
        this._analytics = value;
    }
    /**
     * Sets the contentType property value. The content type of this list item
     * @param value Value to set for the contentType property.
     * @return a void
     */
    public void setContentType(@javax.annotation.Nullable final ContentTypeInfo value) {
        this._contentType = value;
    }
    /**
     * Sets the documentSetVersions property value. Version information for a document set version created by a user.
     * @param value Value to set for the documentSetVersions property.
     * @return a void
     */
    public void setDocumentSetVersions(@javax.annotation.Nullable final java.util.List<DocumentSetVersion> value) {
        this._documentSetVersions = value;
    }
    /**
     * Sets the driveItem property value. For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
     * @param value Value to set for the driveItem property.
     * @return a void
     */
    public void setDriveItem(@javax.annotation.Nullable final DriveItem value) {
        this._driveItem = value;
    }
    /**
     * Sets the fields property value. The values of the columns set on this list item.
     * @param value Value to set for the fields property.
     * @return a void
     */
    public void setFields(@javax.annotation.Nullable final FieldValueSet value) {
        this._fields = value;
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     * @return a void
     */
    public void setSharepointIds(@javax.annotation.Nullable final SharepointIds value) {
        this._sharepointIds = value;
    }
    /**
     * Sets the versions property value. The list of previous versions of the list item.
     * @param value Value to set for the versions property.
     * @return a void
     */
    public void setVersions(@javax.annotation.Nullable final java.util.List<ListItemVersion> value) {
        this._versions = value;
    }
}
