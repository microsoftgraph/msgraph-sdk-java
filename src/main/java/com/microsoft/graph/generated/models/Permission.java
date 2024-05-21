package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Permission extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Permission} and sets the default values.
     */
    public Permission() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Permission}
     */
    @jakarta.annotation.Nonnull
    public static Permission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Permission();
    }
    /**
     * Gets the expirationDateTime property value. A format of yyyy-MM-ddTHH:mm:ssZ of DateTimeOffset indicates the expiration time of the permission. DateTime.MinValue indicates there's no expiration set for this permission. Optional.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("grantedTo", (n) -> { this.setGrantedTo(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("grantedToIdentities", (n) -> { this.setGrantedToIdentities(n.getCollectionOfObjectValues(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("grantedToIdentitiesV2", (n) -> { this.setGrantedToIdentitiesV2(n.getCollectionOfObjectValues(SharePointIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("grantedToV2", (n) -> { this.setGrantedToV2(n.getObjectValue(SharePointIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("hasPassword", (n) -> { this.setHasPassword(n.getBooleanValue()); });
        deserializerMap.put("inheritedFrom", (n) -> { this.setInheritedFrom(n.getObjectValue(ItemReference::createFromDiscriminatorValue)); });
        deserializerMap.put("invitation", (n) -> { this.setInvitation(n.getObjectValue(SharingInvitation::createFromDiscriminatorValue)); });
        deserializerMap.put("link", (n) -> { this.setLink(n.getObjectValue(SharingLink::createFromDiscriminatorValue)); });
        deserializerMap.put("roles", (n) -> { this.setRoles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("shareId", (n) -> { this.setShareId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the grantedTo property value. For user type permissions, the details of the users and applications for this permission. Read-only.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getGrantedTo() {
        return this.backingStore.get("grantedTo");
    }
    /**
     * Gets the grantedToIdentities property value. For type permissions, the details of the users to whom permission was granted. Read-only.
     * @return a {@link java.util.List<IdentitySet>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentitySet> getGrantedToIdentities() {
        return this.backingStore.get("grantedToIdentities");
    }
    /**
     * Gets the grantedToIdentitiesV2 property value. For link type permissions, the details of the users to whom permission was granted. Read-only.
     * @return a {@link java.util.List<SharePointIdentitySet>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharePointIdentitySet> getGrantedToIdentitiesV2() {
        return this.backingStore.get("grantedToIdentitiesV2");
    }
    /**
     * Gets the grantedToV2 property value. For user type permissions, the details of the users and applications for this permission. Read-only.
     * @return a {@link SharePointIdentitySet}
     */
    @jakarta.annotation.Nullable
    public SharePointIdentitySet getGrantedToV2() {
        return this.backingStore.get("grantedToV2");
    }
    /**
     * Gets the hasPassword property value. Indicates whether the password is set for this permission. This property only appears in the response. Optional. Read-only. For OneDrive Personal only..
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasPassword() {
        return this.backingStore.get("hasPassword");
    }
    /**
     * Gets the inheritedFrom property value. Provides a reference to the ancestor of the current permission, if it's inherited from an ancestor. Read-only.
     * @return a {@link ItemReference}
     */
    @jakarta.annotation.Nullable
    public ItemReference getInheritedFrom() {
        return this.backingStore.get("inheritedFrom");
    }
    /**
     * Gets the invitation property value. Details of any associated sharing invitation for this permission. Read-only.
     * @return a {@link SharingInvitation}
     */
    @jakarta.annotation.Nullable
    public SharingInvitation getInvitation() {
        return this.backingStore.get("invitation");
    }
    /**
     * Gets the link property value. Provides the link details of the current permission, if it's a link type permission. Read-only.
     * @return a {@link SharingLink}
     */
    @jakarta.annotation.Nullable
    public SharingLink getLink() {
        return this.backingStore.get("link");
    }
    /**
     * Gets the roles property value. The type of permission, for example, read. See below for the full list of roles. Read-only.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this.backingStore.get("roles");
    }
    /**
     * Gets the shareId property value. A unique token that can be used to access this shared item via the shares API. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShareId() {
        return this.backingStore.get("shareId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeObjectValue("grantedTo", this.getGrantedTo());
        writer.writeCollectionOfObjectValues("grantedToIdentities", this.getGrantedToIdentities());
        writer.writeCollectionOfObjectValues("grantedToIdentitiesV2", this.getGrantedToIdentitiesV2());
        writer.writeObjectValue("grantedToV2", this.getGrantedToV2());
        writer.writeBooleanValue("hasPassword", this.getHasPassword());
        writer.writeObjectValue("inheritedFrom", this.getInheritedFrom());
        writer.writeObjectValue("invitation", this.getInvitation());
        writer.writeObjectValue("link", this.getLink());
        writer.writeCollectionOfPrimitiveValues("roles", this.getRoles());
        writer.writeStringValue("shareId", this.getShareId());
    }
    /**
     * Sets the expirationDateTime property value. A format of yyyy-MM-ddTHH:mm:ssZ of DateTimeOffset indicates the expiration time of the permission. DateTime.MinValue indicates there's no expiration set for this permission. Optional.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the grantedTo property value. For user type permissions, the details of the users and applications for this permission. Read-only.
     * @param value Value to set for the grantedTo property.
     */
    public void setGrantedTo(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("grantedTo", value);
    }
    /**
     * Sets the grantedToIdentities property value. For type permissions, the details of the users to whom permission was granted. Read-only.
     * @param value Value to set for the grantedToIdentities property.
     */
    public void setGrantedToIdentities(@jakarta.annotation.Nullable final java.util.List<IdentitySet> value) {
        this.backingStore.set("grantedToIdentities", value);
    }
    /**
     * Sets the grantedToIdentitiesV2 property value. For link type permissions, the details of the users to whom permission was granted. Read-only.
     * @param value Value to set for the grantedToIdentitiesV2 property.
     */
    public void setGrantedToIdentitiesV2(@jakarta.annotation.Nullable final java.util.List<SharePointIdentitySet> value) {
        this.backingStore.set("grantedToIdentitiesV2", value);
    }
    /**
     * Sets the grantedToV2 property value. For user type permissions, the details of the users and applications for this permission. Read-only.
     * @param value Value to set for the grantedToV2 property.
     */
    public void setGrantedToV2(@jakarta.annotation.Nullable final SharePointIdentitySet value) {
        this.backingStore.set("grantedToV2", value);
    }
    /**
     * Sets the hasPassword property value. Indicates whether the password is set for this permission. This property only appears in the response. Optional. Read-only. For OneDrive Personal only..
     * @param value Value to set for the hasPassword property.
     */
    public void setHasPassword(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasPassword", value);
    }
    /**
     * Sets the inheritedFrom property value. Provides a reference to the ancestor of the current permission, if it's inherited from an ancestor. Read-only.
     * @param value Value to set for the inheritedFrom property.
     */
    public void setInheritedFrom(@jakarta.annotation.Nullable final ItemReference value) {
        this.backingStore.set("inheritedFrom", value);
    }
    /**
     * Sets the invitation property value. Details of any associated sharing invitation for this permission. Read-only.
     * @param value Value to set for the invitation property.
     */
    public void setInvitation(@jakarta.annotation.Nullable final SharingInvitation value) {
        this.backingStore.set("invitation", value);
    }
    /**
     * Sets the link property value. Provides the link details of the current permission, if it's a link type permission. Read-only.
     * @param value Value to set for the link property.
     */
    public void setLink(@jakarta.annotation.Nullable final SharingLink value) {
        this.backingStore.set("link", value);
    }
    /**
     * Sets the roles property value. The type of permission, for example, read. See below for the full list of roles. Read-only.
     * @param value Value to set for the roles property.
     */
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roles", value);
    }
    /**
     * Sets the shareId property value. A unique token that can be used to access this shared item via the shares API. Read-only.
     * @param value Value to set for the shareId property.
     */
    public void setShareId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("shareId", value);
    }
}
