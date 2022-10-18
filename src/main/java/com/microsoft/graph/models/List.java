package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class List extends BaseItem implements Parsable {
    /** The collection of field definitions for this list. */
    private java.util.List<ColumnDefinition> _columns;
    /** The collection of content types present in this list. */
    private java.util.List<ContentType> _contentTypes;
    /** The displayable title of the list. */
    private String _displayName;
    /** Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem]. */
    private Drive _drive;
    /** All items contained in the list. */
    private java.util.List<ListItem> _items;
    /** Provides additional details about the list. */
    private ListInfo _list;
    /** The collection of long-running operations on the list. */
    private java.util.List<RichLongRunningOperation> _operations;
    /** Returns identifiers useful for SharePoint REST compatibility. Read-only. */
    private SharepointIds _sharepointIds;
    /** The set of subscriptions on the list. */
    private java.util.List<Subscription> _subscriptions;
    /** If present, indicates that this is a system-managed list. Read-only. */
    private SystemFacet _system;
    /**
     * Instantiates a new list and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public List() {
        super();
        this.setOdataType("#microsoft.graph.list");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a list
     */
    @javax.annotation.Nonnull
    public static List createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new List();
    }
    /**
     * Gets the columns property value. The collection of field definitions for this list.
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<ColumnDefinition> getColumns() {
        return this._columns;
    }
    /**
     * Gets the contentTypes property value. The collection of content types present in this list.
     * @return a contentType
     */
    @javax.annotation.Nullable
    public java.util.List<ContentType> getContentTypes() {
        return this._contentTypes;
    }
    /**
     * Gets the displayName property value. The displayable title of the list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the drive property value. Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
     * @return a drive
     */
    @javax.annotation.Nullable
    public Drive getDrive() {
        return this._drive;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final List currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("columns", (n) -> { currentObject.setColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
            this.put("contentTypes", (n) -> { currentObject.setContentTypes(n.getCollectionOfObjectValues(ContentType::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("drive", (n) -> { currentObject.setDrive(n.getObjectValue(Drive::createFromDiscriminatorValue)); });
            this.put("items", (n) -> { currentObject.setItems(n.getCollectionOfObjectValues(ListItem::createFromDiscriminatorValue)); });
            this.put("list", (n) -> { currentObject.setList(n.getObjectValue(ListInfo::createFromDiscriminatorValue)); });
            this.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfObjectValues(RichLongRunningOperation::createFromDiscriminatorValue)); });
            this.put("sharepointIds", (n) -> { currentObject.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
            this.put("subscriptions", (n) -> { currentObject.setSubscriptions(n.getCollectionOfObjectValues(Subscription::createFromDiscriminatorValue)); });
            this.put("system", (n) -> { currentObject.setSystem(n.getObjectValue(SystemFacet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the items property value. All items contained in the list.
     * @return a listItem
     */
    @javax.annotation.Nullable
    public java.util.List<ListItem> getItems() {
        return this._items;
    }
    /**
     * Gets the list property value. Provides additional details about the list.
     * @return a listInfo
     */
    @javax.annotation.Nullable
    public ListInfo getList() {
        return this._list;
    }
    /**
     * Gets the operations property value. The collection of long-running operations on the list.
     * @return a richLongRunningOperation
     */
    @javax.annotation.Nullable
    public java.util.List<RichLongRunningOperation> getOperations() {
        return this._operations;
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
     * Gets the subscriptions property value. The set of subscriptions on the list.
     * @return a subscription
     */
    @javax.annotation.Nullable
    public java.util.List<Subscription> getSubscriptions() {
        return this._subscriptions;
    }
    /**
     * Gets the system property value. If present, indicates that this is a system-managed list. Read-only.
     * @return a systemFacet
     */
    @javax.annotation.Nullable
    public SystemFacet getSystem() {
        return this._system;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeCollectionOfObjectValues("contentTypes", this.getContentTypes());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("drive", this.getDrive());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeObjectValue("list", this.getList());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeObjectValue("sharepointIds", this.getSharepointIds());
        writer.writeCollectionOfObjectValues("subscriptions", this.getSubscriptions());
        writer.writeObjectValue("system", this.getSystem());
    }
    /**
     * Sets the columns property value. The collection of field definitions for this list.
     * @param value Value to set for the columns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumns(@javax.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this._columns = value;
    }
    /**
     * Sets the contentTypes property value. The collection of content types present in this list.
     * @param value Value to set for the contentTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentTypes(@javax.annotation.Nullable final java.util.List<ContentType> value) {
        this._contentTypes = value;
    }
    /**
     * Sets the displayName property value. The displayable title of the list.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the drive property value. Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
     * @param value Value to set for the drive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDrive(@javax.annotation.Nullable final Drive value) {
        this._drive = value;
    }
    /**
     * Sets the items property value. All items contained in the list.
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<ListItem> value) {
        this._items = value;
    }
    /**
     * Sets the list property value. Provides additional details about the list.
     * @param value Value to set for the list property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setList(@javax.annotation.Nullable final ListInfo value) {
        this._list = value;
    }
    /**
     * Sets the operations property value. The collection of long-running operations on the list.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<RichLongRunningOperation> value) {
        this._operations = value;
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharepointIds(@javax.annotation.Nullable final SharepointIds value) {
        this._sharepointIds = value;
    }
    /**
     * Sets the subscriptions property value. The set of subscriptions on the list.
     * @param value Value to set for the subscriptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptions(@javax.annotation.Nullable final java.util.List<Subscription> value) {
        this._subscriptions = value;
    }
    /**
     * Sets the system property value. If present, indicates that this is a system-managed list. Read-only.
     * @param value Value to set for the system property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystem(@javax.annotation.Nullable final SystemFacet value) {
        this._system = value;
    }
}
