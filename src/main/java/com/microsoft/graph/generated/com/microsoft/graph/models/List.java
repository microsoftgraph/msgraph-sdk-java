package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class List extends BaseItem implements Parsable {
    /**
     * Instantiates a new List and sets the default values.
     */
    public List() {
        super();
        this.setOdataType("#microsoft.graph.list");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a List
     */
    @jakarta.annotation.Nonnull
    public static List createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new List();
    }
    /**
     * Gets the columns property value. The collection of field definitions for this list.
     * @return a java.util.List<ColumnDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ColumnDefinition> getColumns() {
        return this.backingStore.get("columns");
    }
    /**
     * Gets the contentTypes property value. The collection of content types present in this list.
     * @return a java.util.List<ContentType>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentType> getContentTypes() {
        return this.backingStore.get("contentTypes");
    }
    /**
     * Gets the displayName property value. The displayable title of the list.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the drive property value. Allows access to the list as a drive resource with driveItems. Only present on document libraries.
     * @return a Drive
     */
    @jakarta.annotation.Nullable
    public Drive getDrive() {
        return this.backingStore.get("drive");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a java.util.List<ListItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ListItem> getItems() {
        return this.backingStore.get("items");
    }
    /**
     * Gets the list property value. Contains more details about the list.
     * @return a ListInfo
     */
    @jakarta.annotation.Nullable
    public ListInfo getList() {
        return this.backingStore.get("list");
    }
    /**
     * Gets the operations property value. The collection of long-running operations on the list.
     * @return a java.util.List<RichLongRunningOperation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RichLongRunningOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Gets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @return a SharepointIds
     */
    @jakarta.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this.backingStore.get("sharepointIds");
    }
    /**
     * Gets the subscriptions property value. The set of subscriptions on the list.
     * @return a java.util.List<Subscription>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Subscription> getSubscriptions() {
        return this.backingStore.get("subscriptions");
    }
    /**
     * Gets the system property value. If present, indicates that the list is system-managed. Read-only.
     * @return a SystemFacet
     */
    @jakarta.annotation.Nullable
    public SystemFacet getSystem() {
        return this.backingStore.get("system");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setColumns(@jakarta.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this.backingStore.set("columns", value);
    }
    /**
     * Sets the contentTypes property value. The collection of content types present in this list.
     * @param value Value to set for the contentTypes property.
     */
    public void setContentTypes(@jakarta.annotation.Nullable final java.util.List<ContentType> value) {
        this.backingStore.set("contentTypes", value);
    }
    /**
     * Sets the displayName property value. The displayable title of the list.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the drive property value. Allows access to the list as a drive resource with driveItems. Only present on document libraries.
     * @param value Value to set for the drive property.
     */
    public void setDrive(@jakarta.annotation.Nullable final Drive value) {
        this.backingStore.set("drive", value);
    }
    /**
     * Sets the items property value. All items contained in the list.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<ListItem> value) {
        this.backingStore.set("items", value);
    }
    /**
     * Sets the list property value. Contains more details about the list.
     * @param value Value to set for the list property.
     */
    public void setList(@jakarta.annotation.Nullable final ListInfo value) {
        this.backingStore.set("list", value);
    }
    /**
     * Sets the operations property value. The collection of long-running operations on the list.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<RichLongRunningOperation> value) {
        this.backingStore.set("operations", value);
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     */
    public void setSharepointIds(@jakarta.annotation.Nullable final SharepointIds value) {
        this.backingStore.set("sharepointIds", value);
    }
    /**
     * Sets the subscriptions property value. The set of subscriptions on the list.
     * @param value Value to set for the subscriptions property.
     */
    public void setSubscriptions(@jakarta.annotation.Nullable final java.util.List<Subscription> value) {
        this.backingStore.set("subscriptions", value);
    }
    /**
     * Sets the system property value. If present, indicates that the list is system-managed. Read-only.
     * @param value Value to set for the system property.
     */
    public void setSystem(@jakarta.annotation.Nullable final SystemFacet value) {
        this.backingStore.set("system", value);
    }
}
