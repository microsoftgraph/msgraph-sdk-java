package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MailFolder extends Entity implements Parsable {
    /**
     * The number of immediate child mailFolders in the current mailFolder.
     */
    private Integer childFolderCount;
    /**
     * The collection of child folders in the mailFolder.
     */
    private java.util.List<MailFolder> childFolders;
    /**
     * The mailFolder's display name.
     */
    private String displayName;
    /**
     * Indicates whether the mailFolder is hidden. This property can be set only when creating the folder. Find more information in Hidden mail folders.
     */
    private Boolean isHidden;
    /**
     * The collection of rules that apply to the user's Inbox folder.
     */
    private java.util.List<MessageRule> messageRules;
    /**
     * The collection of messages in the mailFolder.
     */
    private java.util.List<Message> messages;
    /**
     * The collection of multi-value extended properties defined for the mailFolder. Read-only. Nullable.
     */
    private java.util.List<MultiValueLegacyExtendedProperty> multiValueExtendedProperties;
    /**
     * The unique identifier for the mailFolder's parent mailFolder.
     */
    private String parentFolderId;
    /**
     * The collection of single-value extended properties defined for the mailFolder. Read-only. Nullable.
     */
    private java.util.List<SingleValueLegacyExtendedProperty> singleValueExtendedProperties;
    /**
     * The number of items in the mailFolder.
     */
    private Integer totalItemCount;
    /**
     * The number of items in the mailFolder marked as unread.
     */
    private Integer unreadItemCount;
    /**
     * Instantiates a new mailFolder and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MailFolder() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mailFolder
     */
    @javax.annotation.Nonnull
    public static MailFolder createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.mailSearchFolder": return new MailSearchFolder();
            }
        }
        return new MailFolder();
    }
    /**
     * Gets the childFolderCount property value. The number of immediate child mailFolders in the current mailFolder.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getChildFolderCount() {
        return this.childFolderCount;
    }
    /**
     * Gets the childFolders property value. The collection of child folders in the mailFolder.
     * @return a mailFolder
     */
    @javax.annotation.Nullable
    public java.util.List<MailFolder> getChildFolders() {
        return this.childFolders;
    }
    /**
     * Gets the displayName property value. The mailFolder's display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("childFolderCount", (n) -> { this.setChildFolderCount(n.getIntegerValue()); });
        deserializerMap.put("childFolders", (n) -> { this.setChildFolders(n.getCollectionOfObjectValues(MailFolder::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isHidden", (n) -> { this.setIsHidden(n.getBooleanValue()); });
        deserializerMap.put("messageRules", (n) -> { this.setMessageRules(n.getCollectionOfObjectValues(MessageRule::createFromDiscriminatorValue)); });
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(Message::createFromDiscriminatorValue)); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("parentFolderId", (n) -> { this.setParentFolderId(n.getStringValue()); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("totalItemCount", (n) -> { this.setTotalItemCount(n.getIntegerValue()); });
        deserializerMap.put("unreadItemCount", (n) -> { this.setUnreadItemCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isHidden property value. Indicates whether the mailFolder is hidden. This property can be set only when creating the folder. Find more information in Hidden mail folders.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHidden() {
        return this.isHidden;
    }
    /**
     * Gets the messageRules property value. The collection of rules that apply to the user's Inbox folder.
     * @return a messageRule
     */
    @javax.annotation.Nullable
    public java.util.List<MessageRule> getMessageRules() {
        return this.messageRules;
    }
    /**
     * Gets the messages property value. The collection of messages in the mailFolder.
     * @return a message
     */
    @javax.annotation.Nullable
    public java.util.List<Message> getMessages() {
        return this.messages;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the mailFolder. Read-only. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.multiValueExtendedProperties;
    }
    /**
     * Gets the parentFolderId property value. The unique identifier for the mailFolder's parent mailFolder.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentFolderId() {
        return this.parentFolderId;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the mailFolder. Read-only. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.singleValueExtendedProperties;
    }
    /**
     * Gets the totalItemCount property value. The number of items in the mailFolder.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalItemCount() {
        return this.totalItemCount;
    }
    /**
     * Gets the unreadItemCount property value. The number of items in the mailFolder marked as unread.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnreadItemCount() {
        return this.unreadItemCount;
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
        writer.writeIntegerValue("childFolderCount", this.getChildFolderCount());
        writer.writeCollectionOfObjectValues("childFolders", this.getChildFolders());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isHidden", this.getIsHidden());
        writer.writeCollectionOfObjectValues("messageRules", this.getMessageRules());
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeStringValue("parentFolderId", this.getParentFolderId());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
        writer.writeIntegerValue("totalItemCount", this.getTotalItemCount());
        writer.writeIntegerValue("unreadItemCount", this.getUnreadItemCount());
    }
    /**
     * Sets the childFolderCount property value. The number of immediate child mailFolders in the current mailFolder.
     * @param value Value to set for the childFolderCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChildFolderCount(@javax.annotation.Nullable final Integer value) {
        this.childFolderCount = value;
    }
    /**
     * Sets the childFolders property value. The collection of child folders in the mailFolder.
     * @param value Value to set for the childFolders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChildFolders(@javax.annotation.Nullable final java.util.List<MailFolder> value) {
        this.childFolders = value;
    }
    /**
     * Sets the displayName property value. The mailFolder's display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isHidden property value. Indicates whether the mailFolder is hidden. This property can be set only when creating the folder. Find more information in Hidden mail folders.
     * @param value Value to set for the isHidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsHidden(@javax.annotation.Nullable final Boolean value) {
        this.isHidden = value;
    }
    /**
     * Sets the messageRules property value. The collection of rules that apply to the user's Inbox folder.
     * @param value Value to set for the messageRules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessageRules(@javax.annotation.Nullable final java.util.List<MessageRule> value) {
        this.messageRules = value;
    }
    /**
     * Sets the messages property value. The collection of messages in the mailFolder.
     * @param value Value to set for the messages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessages(@javax.annotation.Nullable final java.util.List<Message> value) {
        this.messages = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the mailFolder. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.multiValueExtendedProperties = value;
    }
    /**
     * Sets the parentFolderId property value. The unique identifier for the mailFolder's parent mailFolder.
     * @param value Value to set for the parentFolderId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentFolderId(@javax.annotation.Nullable final String value) {
        this.parentFolderId = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the mailFolder. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.singleValueExtendedProperties = value;
    }
    /**
     * Sets the totalItemCount property value. The number of items in the mailFolder.
     * @param value Value to set for the totalItemCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalItemCount(@javax.annotation.Nullable final Integer value) {
        this.totalItemCount = value;
    }
    /**
     * Sets the unreadItemCount property value. The number of items in the mailFolder marked as unread.
     * @param value Value to set for the unreadItemCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnreadItemCount(@javax.annotation.Nullable final Integer value) {
        this.unreadItemCount = value;
    }
}
