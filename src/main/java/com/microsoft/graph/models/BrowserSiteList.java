package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A singleton entity which is used to specify IE mode site list metadata
 */
public class BrowserSiteList extends Entity implements Parsable {
    /** Description for the site list */
    private String description;
    /** Display name of this site list */
    private String displayName;
    /** Name of the admin who made the last update on the site list */
    private IdentitySet lastModifiedBy;
    /** The datetime that the admin last updated the site list. */
    private OffsetDateTime lastModifiedDateTime;
    /** Name of the admin who published the site list */
    private IdentitySet publishedBy;
    /** The datetime that admin published the site list to users in their organization. */
    private OffsetDateTime publishedDateTime;
    /** Admin can have multiple revisions of the site list and the revision is generated whenever admin create/update the site list. */
    private String revision;
    /** The sharedCookies property */
    private java.util.List<BrowserSharedCookie> sharedCookies;
    /** The sites property */
    private java.util.List<BrowserSite> sites;
    /** The status property */
    private BrowserSiteListStatus status;
    /**
     * Instantiates a new browserSiteList and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BrowserSiteList() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a browserSiteList
     */
    @javax.annotation.Nonnull
    public static BrowserSiteList createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSiteList();
    }
    /**
     * Gets the description property value. Description for the site list
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name of this site list
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("publishedBy", (n) -> { this.setPublishedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("publishedDateTime", (n) -> { this.setPublishedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("revision", (n) -> { this.setRevision(n.getStringValue()); });
        deserializerMap.put("sharedCookies", (n) -> { this.setSharedCookies(n.getCollectionOfObjectValues(BrowserSharedCookie::createFromDiscriminatorValue)); });
        deserializerMap.put("sites", (n) -> { this.setSites(n.getCollectionOfObjectValues(BrowserSite::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(BrowserSiteListStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. Name of the admin who made the last update on the site list
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The datetime that the admin last updated the site list.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the publishedBy property value. Name of the admin who published the site list
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getPublishedBy() {
        return this.publishedBy;
    }
    /**
     * Gets the publishedDateTime property value. The datetime that admin published the site list to users in their organization.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this.publishedDateTime;
    }
    /**
     * Gets the revision property value. Admin can have multiple revisions of the site list and the revision is generated whenever admin create/update the site list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRevision() {
        return this.revision;
    }
    /**
     * Gets the sharedCookies property value. The sharedCookies property
     * @return a browserSharedCookie
     */
    @javax.annotation.Nullable
    public java.util.List<BrowserSharedCookie> getSharedCookies() {
        return this.sharedCookies;
    }
    /**
     * Gets the sites property value. The sites property
     * @return a browserSite
     */
    @javax.annotation.Nullable
    public java.util.List<BrowserSite> getSites() {
        return this.sites;
    }
    /**
     * Gets the status property value. The status property
     * @return a browserSiteListStatus
     */
    @javax.annotation.Nullable
    public BrowserSiteListStatus getStatus() {
        return this.status;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("publishedBy", this.getPublishedBy());
        writer.writeOffsetDateTimeValue("publishedDateTime", this.getPublishedDateTime());
        writer.writeStringValue("revision", this.getRevision());
        writer.writeCollectionOfObjectValues("sharedCookies", this.getSharedCookies());
        writer.writeCollectionOfObjectValues("sites", this.getSites());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the description property value. Description for the site list
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name of this site list
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedBy property value. Name of the admin who made the last update on the site list
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The datetime that the admin last updated the site list.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the publishedBy property value. Name of the admin who published the site list
     * @param value Value to set for the publishedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.publishedBy = value;
    }
    /**
     * Sets the publishedDateTime property value. The datetime that admin published the site list to users in their organization.
     * @param value Value to set for the publishedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.publishedDateTime = value;
    }
    /**
     * Sets the revision property value. Admin can have multiple revisions of the site list and the revision is generated whenever admin create/update the site list.
     * @param value Value to set for the revision property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRevision(@javax.annotation.Nullable final String value) {
        this.revision = value;
    }
    /**
     * Sets the sharedCookies property value. The sharedCookies property
     * @param value Value to set for the sharedCookies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedCookies(@javax.annotation.Nullable final java.util.List<BrowserSharedCookie> value) {
        this.sharedCookies = value;
    }
    /**
     * Sets the sites property value. The sites property
     * @param value Value to set for the sites property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSites(@javax.annotation.Nullable final java.util.List<BrowserSite> value) {
        this.sites = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final BrowserSiteListStatus value) {
        this.status = value;
    }
}
