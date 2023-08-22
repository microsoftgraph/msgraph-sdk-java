package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BaseItem extends Entity implements Parsable {
    /**
     * Identity of the user, device, or application which created the item. Read-only.
     */
    private IdentitySet createdBy;
    /**
     * Identity of the user who created the item. Read-only.
     */
    private User createdByUser;
    /**
     * Date and time of item creation. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Provides a user-visible description of the item. Optional.
     */
    private String description;
    /**
     * ETag for the item. Read-only.
     */
    private String eTag;
    /**
     * Identity of the user, device, and application which last modified the item. Read-only.
     */
    private IdentitySet lastModifiedBy;
    /**
     * Identity of the user who last modified the item. Read-only.
     */
    private User lastModifiedByUser;
    /**
     * Date and time the item was last modified. Read-only.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The name of the item. Read-write.
     */
    private String name;
    /**
     * Parent information, if the item has a parent. Read-write.
     */
    private ItemReference parentReference;
    /**
     * URL that displays the resource in the browser. Read-only.
     */
    private String webUrl;
    /**
     * Instantiates a new baseItem and sets the default values.
     */
    public BaseItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a baseItem
     */
    @jakarta.annotation.Nonnull
    public static BaseItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.drive": return new Drive();
                case "#microsoft.graph.driveItem": return new DriveItem();
                case "#microsoft.graph.list": return new List();
                case "#microsoft.graph.listItem": return new ListItem();
                case "#microsoft.graph.sharedDriveItem": return new SharedDriveItem();
                case "#microsoft.graph.site": return new Site();
            }
        }
        return new BaseItem();
    }
    /**
     * Gets the createdBy property value. Identity of the user, device, or application which created the item. Read-only.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdByUser property value. Identity of the user who created the item. Read-only.
     * @return a user
     */
    @jakarta.annotation.Nullable
    public User getCreatedByUser() {
        return this.createdByUser;
    }
    /**
     * Gets the createdDateTime property value. Date and time of item creation. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Provides a user-visible description of the item. Optional.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the eTag property value. ETag for the item. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getETag() {
        return this.eTag;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdByUser", (n) -> { this.setCreatedByUser(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("eTag", (n) -> { this.setETag(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedByUser", (n) -> { this.setLastModifiedByUser(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("parentReference", (n) -> { this.setParentReference(n.getObjectValue(ItemReference::createFromDiscriminatorValue)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user, device, and application which last modified the item. Read-only.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedByUser property value. Identity of the user who last modified the item. Read-only.
     * @return a user
     */
    @jakarta.annotation.Nullable
    public User getLastModifiedByUser() {
        return this.lastModifiedByUser;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time the item was last modified. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the name property value. The name of the item. Read-write.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the parentReference property value. Parent information, if the item has a parent. Read-write.
     * @return a itemReference
     */
    @jakarta.annotation.Nullable
    public ItemReference getParentReference() {
        return this.parentReference;
    }
    /**
     * Gets the webUrl property value. URL that displays the resource in the browser. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeObjectValue("createdByUser", this.getCreatedByUser());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("eTag", this.getETag());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeObjectValue("lastModifiedByUser", this.getLastModifiedByUser());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("parentReference", this.getParentReference());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the createdBy property value. Identity of the user, device, or application which created the item. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdByUser property value. Identity of the user who created the item. Read-only.
     * @param value Value to set for the createdByUser property.
     */
    public void setCreatedByUser(@jakarta.annotation.Nullable final User value) {
        this.createdByUser = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time of item creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Provides a user-visible description of the item. Optional.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the eTag property value. ETag for the item. Read-only.
     * @param value Value to set for the eTag property.
     */
    public void setETag(@jakarta.annotation.Nullable final String value) {
        this.eTag = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user, device, and application which last modified the item. Read-only.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedByUser property value. Identity of the user who last modified the item. Read-only.
     * @param value Value to set for the lastModifiedByUser property.
     */
    public void setLastModifiedByUser(@jakarta.annotation.Nullable final User value) {
        this.lastModifiedByUser = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time the item was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the name property value. The name of the item. Read-write.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the parentReference property value. Parent information, if the item has a parent. Read-write.
     * @param value Value to set for the parentReference property.
     */
    public void setParentReference(@jakarta.annotation.Nullable final ItemReference value) {
        this.parentReference = value;
    }
    /**
     * Sets the webUrl property value. URL that displays the resource in the browser. Read-only.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
