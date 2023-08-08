package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ListItem extends BaseItem implements Parsable {
    /**
     * Analytics about the view activities that took place on this item.
     */
    private ItemAnalytics analytics;
    /**
     * The content type of this list item
     */
    private ContentTypeInfo contentType;
    /**
     * Version information for a document set version created by a user.
     */
    private java.util.List<DocumentSetVersion> documentSetVersions;
    /**
     * For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
     */
    private DriveItem driveItem;
    /**
     * The values of the columns set on this list item.
     */
    private FieldValueSet fields;
    /**
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    private SharepointIds sharepointIds;
    /**
     * The list of previous versions of the list item.
     */
    private java.util.List<ListItemVersion> versions;
    /**
     * Instantiates a new listItem and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ListItem() {
        super();
        this.setOdataType("#microsoft.graph.listItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a listItem
     */
    @jakarta.annotation.Nonnull
    public static ListItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListItem();
    }
    /**
     * Gets the analytics property value. Analytics about the view activities that took place on this item.
     * @return a itemAnalytics
     */
    @jakarta.annotation.Nullable
    public ItemAnalytics getAnalytics() {
        return this.analytics;
    }
    /**
     * Gets the contentType property value. The content type of this list item
     * @return a contentTypeInfo
     */
    @jakarta.annotation.Nullable
    public ContentTypeInfo getContentType() {
        return this.contentType;
    }
    /**
     * Gets the documentSetVersions property value. Version information for a document set version created by a user.
     * @return a documentSetVersion
     */
    @jakarta.annotation.Nullable
    public java.util.List<DocumentSetVersion> getDocumentSetVersions() {
        return this.documentSetVersions;
    }
    /**
     * Gets the driveItem property value. For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
     * @return a driveItem
     */
    @jakarta.annotation.Nullable
    public DriveItem getDriveItem() {
        return this.driveItem;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("analytics", (n) -> { this.setAnalytics(n.getObjectValue(ItemAnalytics::createFromDiscriminatorValue)); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getObjectValue(ContentTypeInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("documentSetVersions", (n) -> { this.setDocumentSetVersions(n.getCollectionOfObjectValues(DocumentSetVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("driveItem", (n) -> { this.setDriveItem(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("fields", (n) -> { this.setFields(n.getObjectValue(FieldValueSet::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepointIds", (n) -> { this.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
        deserializerMap.put("versions", (n) -> { this.setVersions(n.getCollectionOfObjectValues(ListItemVersion::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fields property value. The values of the columns set on this list item.
     * @return a fieldValueSet
     */
    @jakarta.annotation.Nullable
    public FieldValueSet getFields() {
        return this.fields;
    }
    /**
     * Gets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @return a sharepointIds
     */
    @jakarta.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this.sharepointIds;
    }
    /**
     * Gets the versions property value. The list of previous versions of the list item.
     * @return a listItemVersion
     */
    @jakarta.annotation.Nullable
    public java.util.List<ListItemVersion> getVersions() {
        return this.versions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setAnalytics(@jakarta.annotation.Nullable final ItemAnalytics value) {
        this.analytics = value;
    }
    /**
     * Sets the contentType property value. The content type of this list item
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setContentType(@jakarta.annotation.Nullable final ContentTypeInfo value) {
        this.contentType = value;
    }
    /**
     * Sets the documentSetVersions property value. Version information for a document set version created by a user.
     * @param value Value to set for the documentSetVersions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDocumentSetVersions(@jakarta.annotation.Nullable final java.util.List<DocumentSetVersion> value) {
        this.documentSetVersions = value;
    }
    /**
     * Sets the driveItem property value. For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
     * @param value Value to set for the driveItem property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDriveItem(@jakarta.annotation.Nullable final DriveItem value) {
        this.driveItem = value;
    }
    /**
     * Sets the fields property value. The values of the columns set on this list item.
     * @param value Value to set for the fields property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFields(@jakarta.annotation.Nullable final FieldValueSet value) {
        this.fields = value;
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSharepointIds(@jakarta.annotation.Nullable final SharepointIds value) {
        this.sharepointIds = value;
    }
    /**
     * Sets the versions property value. The list of previous versions of the list item.
     * @param value Value to set for the versions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersions(@jakarta.annotation.Nullable final java.util.List<ListItemVersion> value) {
        this.versions = value;
    }
}
