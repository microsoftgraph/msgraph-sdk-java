package com.microsoft.graph.models;

import com.microsoft.graph.models.Drive;
import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.List;
import com.microsoft.graph.models.ListItem;
import com.microsoft.graph.models.SharedDriveItem;
import com.microsoft.graph.models.Site;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BaseItem extends Entity implements Parsable {
    /** Identity of the user, device, or application which created the item. Read-only. */
    private IdentitySet _createdBy;
    /** Identity of the user who created the item. Read-only. */
    private User _createdByUser;
    /** Date and time of item creation. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** Provides a user-visible description of the item. Optional. */
    private String _description;
    /** ETag for the item. Read-only. */
    private String _eTag;
    /** Identity of the user, device, and application which last modified the item. Read-only. */
    private IdentitySet _lastModifiedBy;
    /** Identity of the user who last modified the item. Read-only. */
    private User _lastModifiedByUser;
    /** Date and time the item was last modified. Read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The name of the item. Read-write. */
    private String _name;
    /** Parent information, if the item has a parent. Read-write. */
    private ItemReference _parentReference;
    /** URL that displays the resource in the browser. Read-only. */
    private String _webUrl;
    /**
     * Instantiates a new baseItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BaseItem() {
        super();
        this.setOdataType("#microsoft.graph.baseItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a baseItem
     */
    @javax.annotation.Nonnull
    public static BaseItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdByUser property value. Identity of the user who created the item. Read-only.
     * @return a user
     */
    @javax.annotation.Nullable
    public User getCreatedByUser() {
        return this._createdByUser;
    }
    /**
     * Gets the createdDateTime property value. Date and time of item creation. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Provides a user-visible description of the item. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the eTag property value. ETag for the item. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getETag() {
        return this._eTag;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BaseItem currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdByUser", (n) -> { currentObject.setCreatedByUser(n.getObjectValue(User::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("eTag", (n) -> { currentObject.setETag(n.getStringValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedByUser", (n) -> { currentObject.setLastModifiedByUser(n.getObjectValue(User::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("parentReference", (n) -> { currentObject.setParentReference(n.getObjectValue(ItemReference::createFromDiscriminatorValue)); });
            this.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user, device, and application which last modified the item. Read-only.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedByUser property value. Identity of the user who last modified the item. Read-only.
     * @return a user
     */
    @javax.annotation.Nullable
    public User getLastModifiedByUser() {
        return this._lastModifiedByUser;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time the item was last modified. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the name property value. The name of the item. Read-write.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the parentReference property value. Parent information, if the item has a parent. Read-write.
     * @return a itemReference
     */
    @javax.annotation.Nullable
    public ItemReference getParentReference() {
        return this._parentReference;
    }
    /**
     * Gets the webUrl property value. URL that displays the resource in the browser. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdByUser property value. Identity of the user who created the item. Read-only.
     * @param value Value to set for the createdByUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedByUser(@javax.annotation.Nullable final User value) {
        this._createdByUser = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time of item creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Provides a user-visible description of the item. Optional.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the eTag property value. ETag for the item. Read-only.
     * @param value Value to set for the eTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setETag(@javax.annotation.Nullable final String value) {
        this._eTag = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user, device, and application which last modified the item. Read-only.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedByUser property value. Identity of the user who last modified the item. Read-only.
     * @param value Value to set for the lastModifiedByUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedByUser(@javax.annotation.Nullable final User value) {
        this._lastModifiedByUser = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time the item was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the name property value. The name of the item. Read-write.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the parentReference property value. Parent information, if the item has a parent. Read-write.
     * @param value Value to set for the parentReference property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentReference(@javax.annotation.Nullable final ItemReference value) {
        this._parentReference = value;
    }
    /**
     * Sets the webUrl property value. URL that displays the resource in the browser. Read-only.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
