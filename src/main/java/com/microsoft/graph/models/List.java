package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class List extends BaseItem implements Parsable {
    /** The collection of field definitions for this list. */
    private java.util.List<ColumnDefinition> columns;
    /** The collection of content types present in this list. */
    private java.util.List<ContentType> contentTypes;
    /** The displayable title of the list. */
    private String displayName;
    /** Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem]. */
    private Drive drive;
    /** All items contained in the list. */
    private java.util.List<ListItem> items;
    /** Provides additional details about the list. */
    private ListInfo list;
    /** The collection of long-running operations on the list. */
    private java.util.List<RichLongRunningOperation> operations;
    /** Returns identifiers useful for SharePoint REST compatibility. Read-only. */
    private SharepointIds sharepointIds;
    /** The set of subscriptions on the list. */
    private java.util.List<Subscription> subscriptions;
    /** If present, indicates that this is a system-managed list. Read-only. */
    private SystemFacet system;
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
        return this.columns;
    }
    /**
     * Gets the contentTypes property value. The collection of content types present in this list.
     * @return a contentType
     */
    @javax.annotation.Nullable
    public java.util.List<ContentType> getContentTypes() {
        return this.contentTypes;
    }
    /**
     * Gets the displayName property value. The displayable title of the list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the drive property value. Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
     * @return a drive
     */
    @javax.annotation.Nullable
    public Drive getDrive() {
        return this.drive;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("columns", (n) -> { this.setColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("contentTypes", (n) -> { this.setContentTypes(n.getCollectionOfObjectValues(ContentType::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("drive", (n) -> { this.setDrive(n.getObjectValue(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(ListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("list", (n) -> { this.setList(n.getObjectValue(ListInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(RichLongRunningOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepointIds", (n) -> { this.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
        deserializerMap.put("subscriptions", (n) -> { this.setSubscriptions(n.getCollectionOfObjectValues(Subscription::createFromDiscriminatorValue)); });
        deserializerMap.put("system", (n) -> { this.setSystem(n.getObjectValue(SystemFacet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. All items contained in the list.
     * @return a listItem
     */
    @javax.annotation.Nullable
    public java.util.List<ListItem> getItems() {
        return this.items;
    }
    /**
     * Gets the list property value. Provides additional details about the list.
     * @return a listInfo
     */
    @javax.annotation.Nullable
    public ListInfo getList() {
        return this.list;
    }
    /**
     * Gets the operations property value. The collection of long-running operations on the list.
     * @return a richLongRunningOperation
     */
    @javax.annotation.Nullable
    public java.util.List<RichLongRunningOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @return a sharepointIds
     */
    @javax.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this.sharepointIds;
    }
    /**
     * Gets the subscriptions property value. The set of subscriptions on the list.
     * @return a subscription
     */
    @javax.annotation.Nullable
    public java.util.List<Subscription> getSubscriptions() {
        return this.subscriptions;
    }
    /**
     * Gets the system property value. If present, indicates that this is a system-managed list. Read-only.
     * @return a systemFacet
     */
    @javax.annotation.Nullable
    public SystemFacet getSystem() {
        return this.system;
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
        this.columns = value;
    }
    /**
     * Sets the contentTypes property value. The collection of content types present in this list.
     * @param value Value to set for the contentTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentTypes(@javax.annotation.Nullable final java.util.List<ContentType> value) {
        this.contentTypes = value;
    }
    /**
     * Sets the displayName property value. The displayable title of the list.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the drive property value. Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
     * @param value Value to set for the drive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDrive(@javax.annotation.Nullable final Drive value) {
        this.drive = value;
    }
    /**
     * Sets the items property value. All items contained in the list.
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<ListItem> value) {
        this.items = value;
    }
    /**
     * Sets the list property value. Provides additional details about the list.
     * @param value Value to set for the list property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setList(@javax.annotation.Nullable final ListInfo value) {
        this.list = value;
    }
    /**
     * Sets the operations property value. The collection of long-running operations on the list.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<RichLongRunningOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharepointIds(@javax.annotation.Nullable final SharepointIds value) {
        this.sharepointIds = value;
    }
    /**
     * Sets the subscriptions property value. The set of subscriptions on the list.
     * @param value Value to set for the subscriptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptions(@javax.annotation.Nullable final java.util.List<Subscription> value) {
        this.subscriptions = value;
    }
    /**
     * Sets the system property value. If present, indicates that this is a system-managed list. Read-only.
     * @param value Value to set for the system property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystem(@javax.annotation.Nullable final SystemFacet value) {
        this.system = value;
    }
}
