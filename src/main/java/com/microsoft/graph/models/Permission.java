package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Permission extends Entity implements Parsable {
    /** A format of yyyy-MM-ddTHH:mm:ssZ of DateTimeOffset indicates the expiration time of the permission. DateTime.MinValue indicates there is no expiration set for this permission. Optional.  */
    private OffsetDateTime _expirationDateTime;
    /** The grantedTo property  */
    private IdentitySet _grantedTo;
    /** The grantedToIdentities property  */
    private java.util.List<IdentitySet> _grantedToIdentities;
    /** For link type permissions, the details of the users to whom permission was granted. Read-only.  */
    private java.util.List<SharePointIdentitySet> _grantedToIdentitiesV2;
    /** For user type permissions, the details of the users and applications for this permission. Read-only.  */
    private SharePointIdentitySet _grantedToV2;
    /** Indicates whether the password is set for this permission. This property only appears in the response. Optional. Read-only. For OneDrive Personal only.  */
    private Boolean _hasPassword;
    /** Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only.  */
    private ItemReference _inheritedFrom;
    /** Details of any associated sharing invitation for this permission. Read-only.  */
    private SharingInvitation _invitation;
    /** Provides the link details of the current permission, if it is a link type permissions. Read-only.  */
    private SharingLink _link;
    /** The type of permission, for example, read. See below for the full list of roles. Read-only.  */
    private java.util.List<String> _roles;
    /** A unique token that can be used to access this shared item via the [shares API][]. Read-only.  */
    private String _shareId;
    /**
     * Instantiates a new permission and sets the default values.
     * @return a void
     */
    public Permission() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a permission
     */
    @javax.annotation.Nonnull
    public static Permission createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Permission();
    }
    /**
     * Gets the expirationDateTime property value. A format of yyyy-MM-ddTHH:mm:ssZ of DateTimeOffset indicates the expiration time of the permission. DateTime.MinValue indicates there is no expiration set for this permission. Optional.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Permission currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("grantedTo", (n) -> { currentObject.setGrantedTo(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("grantedToIdentities", (n) -> { currentObject.setGrantedToIdentities(n.getCollectionOfObjectValues(IdentitySet::createFromDiscriminatorValue)); });
            this.put("grantedToIdentitiesV2", (n) -> { currentObject.setGrantedToIdentitiesV2(n.getCollectionOfObjectValues(SharePointIdentitySet::createFromDiscriminatorValue)); });
            this.put("grantedToV2", (n) -> { currentObject.setGrantedToV2(n.getObjectValue(SharePointIdentitySet::createFromDiscriminatorValue)); });
            this.put("hasPassword", (n) -> { currentObject.setHasPassword(n.getBooleanValue()); });
            this.put("inheritedFrom", (n) -> { currentObject.setInheritedFrom(n.getObjectValue(ItemReference::createFromDiscriminatorValue)); });
            this.put("invitation", (n) -> { currentObject.setInvitation(n.getObjectValue(SharingInvitation::createFromDiscriminatorValue)); });
            this.put("link", (n) -> { currentObject.setLink(n.getObjectValue(SharingLink::createFromDiscriminatorValue)); });
            this.put("roles", (n) -> { currentObject.setRoles(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("shareId", (n) -> { currentObject.setShareId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the grantedTo property value. The grantedTo property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getGrantedTo() {
        return this._grantedTo;
    }
    /**
     * Gets the grantedToIdentities property value. The grantedToIdentities property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public java.util.List<IdentitySet> getGrantedToIdentities() {
        return this._grantedToIdentities;
    }
    /**
     * Gets the grantedToIdentitiesV2 property value. For link type permissions, the details of the users to whom permission was granted. Read-only.
     * @return a sharePointIdentitySet
     */
    @javax.annotation.Nullable
    public java.util.List<SharePointIdentitySet> getGrantedToIdentitiesV2() {
        return this._grantedToIdentitiesV2;
    }
    /**
     * Gets the grantedToV2 property value. For user type permissions, the details of the users and applications for this permission. Read-only.
     * @return a sharePointIdentitySet
     */
    @javax.annotation.Nullable
    public SharePointIdentitySet getGrantedToV2() {
        return this._grantedToV2;
    }
    /**
     * Gets the hasPassword property value. Indicates whether the password is set for this permission. This property only appears in the response. Optional. Read-only. For OneDrive Personal only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasPassword() {
        return this._hasPassword;
    }
    /**
     * Gets the inheritedFrom property value. Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only.
     * @return a itemReference
     */
    @javax.annotation.Nullable
    public ItemReference getInheritedFrom() {
        return this._inheritedFrom;
    }
    /**
     * Gets the invitation property value. Details of any associated sharing invitation for this permission. Read-only.
     * @return a sharingInvitation
     */
    @javax.annotation.Nullable
    public SharingInvitation getInvitation() {
        return this._invitation;
    }
    /**
     * Gets the link property value. Provides the link details of the current permission, if it is a link type permissions. Read-only.
     * @return a sharingLink
     */
    @javax.annotation.Nullable
    public SharingLink getLink() {
        return this._link;
    }
    /**
     * Gets the roles property value. The type of permission, for example, read. See below for the full list of roles. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this._roles;
    }
    /**
     * Gets the shareId property value. A unique token that can be used to access this shared item via the [shares API][]. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShareId() {
        return this._shareId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the grantedTo property value. The grantedTo property
     * @param value Value to set for the grantedTo property.
     * @return a void
     */
    public void setGrantedTo(@javax.annotation.Nullable final IdentitySet value) {
        this._grantedTo = value;
    }
    /**
     * Sets the grantedToIdentities property value. The grantedToIdentities property
     * @param value Value to set for the grantedToIdentities property.
     * @return a void
     */
    public void setGrantedToIdentities(@javax.annotation.Nullable final java.util.List<IdentitySet> value) {
        this._grantedToIdentities = value;
    }
    /**
     * Sets the grantedToIdentitiesV2 property value. For link type permissions, the details of the users to whom permission was granted. Read-only.
     * @param value Value to set for the grantedToIdentitiesV2 property.
     * @return a void
     */
    public void setGrantedToIdentitiesV2(@javax.annotation.Nullable final java.util.List<SharePointIdentitySet> value) {
        this._grantedToIdentitiesV2 = value;
    }
    /**
     * Sets the grantedToV2 property value. For user type permissions, the details of the users and applications for this permission. Read-only.
     * @param value Value to set for the grantedToV2 property.
     * @return a void
     */
    public void setGrantedToV2(@javax.annotation.Nullable final SharePointIdentitySet value) {
        this._grantedToV2 = value;
    }
    /**
     * Sets the hasPassword property value. Indicates whether the password is set for this permission. This property only appears in the response. Optional. Read-only. For OneDrive Personal only.
     * @param value Value to set for the hasPassword property.
     * @return a void
     */
    public void setHasPassword(@javax.annotation.Nullable final Boolean value) {
        this._hasPassword = value;
    }
    /**
     * Sets the inheritedFrom property value. Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only.
     * @param value Value to set for the inheritedFrom property.
     * @return a void
     */
    public void setInheritedFrom(@javax.annotation.Nullable final ItemReference value) {
        this._inheritedFrom = value;
    }
    /**
     * Sets the invitation property value. Details of any associated sharing invitation for this permission. Read-only.
     * @param value Value to set for the invitation property.
     * @return a void
     */
    public void setInvitation(@javax.annotation.Nullable final SharingInvitation value) {
        this._invitation = value;
    }
    /**
     * Sets the link property value. Provides the link details of the current permission, if it is a link type permissions. Read-only.
     * @param value Value to set for the link property.
     * @return a void
     */
    public void setLink(@javax.annotation.Nullable final SharingLink value) {
        this._link = value;
    }
    /**
     * Sets the roles property value. The type of permission, for example, read. See below for the full list of roles. Read-only.
     * @param value Value to set for the roles property.
     * @return a void
     */
    public void setRoles(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roles = value;
    }
    /**
     * Sets the shareId property value. A unique token that can be used to access this shared item via the [shares API][]. Read-only.
     * @param value Value to set for the shareId property.
     * @return a void
     */
    public void setShareId(@javax.annotation.Nullable final String value) {
        this._shareId = value;
    }
}
