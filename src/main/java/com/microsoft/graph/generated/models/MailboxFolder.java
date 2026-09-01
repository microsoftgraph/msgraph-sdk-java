package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailboxFolder extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MailboxFolder} and sets the default values.
     */
    public MailboxFolder() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MailboxFolder}
     */
    @jakarta.annotation.Nonnull
    public static MailboxFolder createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailboxFolder();
    }
    /**
     * Gets the childFolderCount property value. The number of immediate child folders in the current folder.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getChildFolderCount() {
        return this.backingStore.get("childFolderCount");
    }
    /**
     * Gets the childFolders property value. The collection of child folders in this folder.
     * @return a {@link java.util.List<MailboxFolder>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MailboxFolder> getChildFolders() {
        return this.backingStore.get("childFolders");
    }
    /**
     * Gets the displayName property value. The display name of the folder.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("childFolderCount", (n) -> { this.setChildFolderCount(n.getIntegerValue()); });
        deserializerMap.put("childFolders", (n) -> { this.setChildFolders(n.getCollectionOfObjectValues(MailboxFolder::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(MailboxItem::createFromDiscriminatorValue)); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("parentFolderId", (n) -> { this.setParentFolderId(n.getStringValue()); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("totalItemCount", (n) -> { this.setTotalItemCount(n.getIntegerValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("wellKnownName", (n) -> { this.setWellKnownName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. The collection of items in this folder.
     * @return a {@link java.util.List<MailboxItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MailboxItem> getItems() {
        return this.backingStore.get("items");
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the mailboxFolder.
     * @return a {@link java.util.List<MultiValueLegacyExtendedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.backingStore.get("multiValueExtendedProperties");
    }
    /**
     * Gets the parentFolderId property value. The unique identifier for the parent folder of this folder.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentFolderId() {
        return this.backingStore.get("parentFolderId");
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the mailboxFolder.
     * @return a {@link java.util.List<SingleValueLegacyExtendedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.backingStore.get("singleValueExtendedProperties");
    }
    /**
     * Gets the totalItemCount property value. The number of items in the folder.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalItemCount() {
        return this.backingStore.get("totalItemCount");
    }
    /**
     * Gets the type property value. Describes the folder class type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.backingStore.get("type");
    }
    /**
     * Gets the wellKnownName property value. The locale-independent well-known name of the folder for folders created by Outlook, such as inbox, sentitems, drafts, deleteditems, or archive. For user-created folders, the value is null. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWellKnownName() {
        return this.backingStore.get("wellKnownName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("childFolderCount", this.getChildFolderCount());
        writer.writeCollectionOfObjectValues("childFolders", this.getChildFolders());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeStringValue("parentFolderId", this.getParentFolderId());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
        writer.writeIntegerValue("totalItemCount", this.getTotalItemCount());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("wellKnownName", this.getWellKnownName());
    }
    /**
     * Sets the childFolderCount property value. The number of immediate child folders in the current folder.
     * @param value Value to set for the childFolderCount property.
     */
    public void setChildFolderCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("childFolderCount", value);
    }
    /**
     * Sets the childFolders property value. The collection of child folders in this folder.
     * @param value Value to set for the childFolders property.
     */
    public void setChildFolders(@jakarta.annotation.Nullable final java.util.List<MailboxFolder> value) {
        this.backingStore.set("childFolders", value);
    }
    /**
     * Sets the displayName property value. The display name of the folder.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the items property value. The collection of items in this folder.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<MailboxItem> value) {
        this.backingStore.set("items", value);
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the mailboxFolder.
     * @param value Value to set for the multiValueExtendedProperties property.
     */
    public void setMultiValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.backingStore.set("multiValueExtendedProperties", value);
    }
    /**
     * Sets the parentFolderId property value. The unique identifier for the parent folder of this folder.
     * @param value Value to set for the parentFolderId property.
     */
    public void setParentFolderId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentFolderId", value);
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the mailboxFolder.
     * @param value Value to set for the singleValueExtendedProperties property.
     */
    public void setSingleValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.backingStore.set("singleValueExtendedProperties", value);
    }
    /**
     * Sets the totalItemCount property value. The number of items in the folder.
     * @param value Value to set for the totalItemCount property.
     */
    public void setTotalItemCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalItemCount", value);
    }
    /**
     * Sets the type property value. Describes the folder class type.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the wellKnownName property value. The locale-independent well-known name of the folder for folders created by Outlook, such as inbox, sentitems, drafts, deleteditems, or archive. For user-created folders, the value is null. Read-only.
     * @param value Value to set for the wellKnownName property.
     */
    public void setWellKnownName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("wellKnownName", value);
    }
}
