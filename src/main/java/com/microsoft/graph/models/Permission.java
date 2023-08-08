package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Permission extends Entity implements Parsable {
    /**
     * A format of yyyy-MM-ddTHH:mm:ssZ of DateTimeOffset indicates the expiration time of the permission. DateTime.MinValue indicates there is no expiration set for this permission. Optional.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The grantedTo property
     */
    private IdentitySet grantedTo;
    /**
     * The grantedToIdentities property
     */
    private java.util.List<IdentitySet> grantedToIdentities;
    /**
     * For link type permissions, the details of the users to whom permission was granted. Read-only.
     */
    private java.util.List<SharePointIdentitySet> grantedToIdentitiesV2;
    /**
     * For user type permissions, the details of the users and applications for this permission. Read-only.
     */
    private SharePointIdentitySet grantedToV2;
    /**
     * Indicates whether the password is set for this permission. This property only appears in the response. Optional. Read-only. For OneDrive Personal only..
     */
    private Boolean hasPassword;
    /**
     * Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only.
     */
    private ItemReference inheritedFrom;
    /**
     * Details of any associated sharing invitation for this permission. Read-only.
     */
    private SharingInvitation invitation;
    /**
     * Provides the link details of the current permission, if it is a link type permissions. Read-only.
     */
    private SharingLink link;
    /**
     * The type of permission, for example, read. See below for the full list of roles. Read-only.
     */
    private java.util.List<String> roles;
    /**
     * A unique token that can be used to access this shared item via the shares API. Read-only.
     */
    private String shareId;
    /**
     * Instantiates a new permission and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Permission() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a permission
     */
    @jakarta.annotation.Nonnull
    public static Permission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Permission();
    }
    /**
     * Gets the expirationDateTime property value. A format of yyyy-MM-ddTHH:mm:ssZ of DateTimeOffset indicates the expiration time of the permission. DateTime.MinValue indicates there is no expiration set for this permission. Optional.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * Gets the grantedTo property value. The grantedTo property
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getGrantedTo() {
        return this.grantedTo;
    }
    /**
     * Gets the grantedToIdentities property value. The grantedToIdentities property
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentitySet> getGrantedToIdentities() {
        return this.grantedToIdentities;
    }
    /**
     * Gets the grantedToIdentitiesV2 property value. For link type permissions, the details of the users to whom permission was granted. Read-only.
     * @return a sharePointIdentitySet
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharePointIdentitySet> getGrantedToIdentitiesV2() {
        return this.grantedToIdentitiesV2;
    }
    /**
     * Gets the grantedToV2 property value. For user type permissions, the details of the users and applications for this permission. Read-only.
     * @return a sharePointIdentitySet
     */
    @jakarta.annotation.Nullable
    public SharePointIdentitySet getGrantedToV2() {
        return this.grantedToV2;
    }
    /**
     * Gets the hasPassword property value. Indicates whether the password is set for this permission. This property only appears in the response. Optional. Read-only. For OneDrive Personal only..
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasPassword() {
        return this.hasPassword;
    }
    /**
     * Gets the inheritedFrom property value. Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only.
     * @return a itemReference
     */
    @jakarta.annotation.Nullable
    public ItemReference getInheritedFrom() {
        return this.inheritedFrom;
    }
    /**
     * Gets the invitation property value. Details of any associated sharing invitation for this permission. Read-only.
     * @return a sharingInvitation
     */
    @jakarta.annotation.Nullable
    public SharingInvitation getInvitation() {
        return this.invitation;
    }
    /**
     * Gets the link property value. Provides the link details of the current permission, if it is a link type permissions. Read-only.
     * @return a sharingLink
     */
    @jakarta.annotation.Nullable
    public SharingLink getLink() {
        return this.link;
    }
    /**
     * Gets the roles property value. The type of permission, for example, read. See below for the full list of roles. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this.roles;
    }
    /**
     * Gets the shareId property value. A unique token that can be used to access this shared item via the shares API. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getShareId() {
        return this.shareId;
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
     * Sets the expirationDateTime property value. A format of yyyy-MM-ddTHH:mm:ssZ of DateTimeOffset indicates the expiration time of the permission. DateTime.MinValue indicates there is no expiration set for this permission. Optional.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the grantedTo property value. The grantedTo property
     * @param value Value to set for the grantedTo property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGrantedTo(@jakarta.annotation.Nullable final IdentitySet value) {
        this.grantedTo = value;
    }
    /**
     * Sets the grantedToIdentities property value. The grantedToIdentities property
     * @param value Value to set for the grantedToIdentities property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGrantedToIdentities(@jakarta.annotation.Nullable final java.util.List<IdentitySet> value) {
        this.grantedToIdentities = value;
    }
    /**
     * Sets the grantedToIdentitiesV2 property value. For link type permissions, the details of the users to whom permission was granted. Read-only.
     * @param value Value to set for the grantedToIdentitiesV2 property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGrantedToIdentitiesV2(@jakarta.annotation.Nullable final java.util.List<SharePointIdentitySet> value) {
        this.grantedToIdentitiesV2 = value;
    }
    /**
     * Sets the grantedToV2 property value. For user type permissions, the details of the users and applications for this permission. Read-only.
     * @param value Value to set for the grantedToV2 property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGrantedToV2(@jakarta.annotation.Nullable final SharePointIdentitySet value) {
        this.grantedToV2 = value;
    }
    /**
     * Sets the hasPassword property value. Indicates whether the password is set for this permission. This property only appears in the response. Optional. Read-only. For OneDrive Personal only..
     * @param value Value to set for the hasPassword property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHasPassword(@jakarta.annotation.Nullable final Boolean value) {
        this.hasPassword = value;
    }
    /**
     * Sets the inheritedFrom property value. Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only.
     * @param value Value to set for the inheritedFrom property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInheritedFrom(@jakarta.annotation.Nullable final ItemReference value) {
        this.inheritedFrom = value;
    }
    /**
     * Sets the invitation property value. Details of any associated sharing invitation for this permission. Read-only.
     * @param value Value to set for the invitation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInvitation(@jakarta.annotation.Nullable final SharingInvitation value) {
        this.invitation = value;
    }
    /**
     * Sets the link property value. Provides the link details of the current permission, if it is a link type permissions. Read-only.
     * @param value Value to set for the link property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLink(@jakarta.annotation.Nullable final SharingLink value) {
        this.link = value;
    }
    /**
     * Sets the roles property value. The type of permission, for example, read. See below for the full list of roles. Read-only.
     * @param value Value to set for the roles property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roles = value;
    }
    /**
     * Sets the shareId property value. A unique token that can be used to access this shared item via the shares API. Read-only.
     * @param value Value to set for the shareId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setShareId(@jakarta.annotation.Nullable final String value) {
        this.shareId = value;
    }
}
