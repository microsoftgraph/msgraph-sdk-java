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
    /**
     * The description of the site list.
     */
    private String description;
    /**
     * The name of the site list.
     */
    private String displayName;
    /**
     * The user who last modified the site list.
     */
    private IdentitySet lastModifiedBy;
    /**
     * The date and time when the site list was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The user who published the site list.
     */
    private IdentitySet publishedBy;
    /**
     * The date and time when the site list was published.
     */
    private OffsetDateTime publishedDateTime;
    /**
     * The current revision of the site list.
     */
    private String revision;
    /**
     * A collection of shared cookies defined for the site list.
     */
    private java.util.List<BrowserSharedCookie> sharedCookies;
    /**
     * A collection of sites defined for the site list.
     */
    private java.util.List<BrowserSite> sites;
    /**
     * The status property
     */
    private BrowserSiteListStatus status;
    /**
     * Instantiates a new browserSiteList and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public BrowserSiteList() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a browserSiteList
     */
    @jakarta.annotation.Nonnull
    public static BrowserSiteList createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSiteList();
    }
    /**
     * Gets the description property value. The description of the site list.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The name of the site list.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * Gets the lastModifiedBy property value. The user who last modified the site list.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the site list was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the publishedBy property value. The user who published the site list.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getPublishedBy() {
        return this.publishedBy;
    }
    /**
     * Gets the publishedDateTime property value. The date and time when the site list was published.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this.publishedDateTime;
    }
    /**
     * Gets the revision property value. The current revision of the site list.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRevision() {
        return this.revision;
    }
    /**
     * Gets the sharedCookies property value. A collection of shared cookies defined for the site list.
     * @return a browserSharedCookie
     */
    @jakarta.annotation.Nullable
    public java.util.List<BrowserSharedCookie> getSharedCookies() {
        return this.sharedCookies;
    }
    /**
     * Gets the sites property value. A collection of sites defined for the site list.
     * @return a browserSite
     */
    @jakarta.annotation.Nullable
    public java.util.List<BrowserSite> getSites() {
        return this.sites;
    }
    /**
     * Gets the status property value. The status property
     * @return a browserSiteListStatus
     */
    @jakarta.annotation.Nullable
    public BrowserSiteListStatus getStatus() {
        return this.status;
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
     * Sets the description property value. The description of the site list.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The name of the site list.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the site list.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the site list was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the publishedBy property value. The user who published the site list.
     * @param value Value to set for the publishedBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPublishedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.publishedBy = value;
    }
    /**
     * Sets the publishedDateTime property value. The date and time when the site list was published.
     * @param value Value to set for the publishedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPublishedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.publishedDateTime = value;
    }
    /**
     * Sets the revision property value. The current revision of the site list.
     * @param value Value to set for the revision property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRevision(@jakarta.annotation.Nullable final String value) {
        this.revision = value;
    }
    /**
     * Sets the sharedCookies property value. A collection of shared cookies defined for the site list.
     * @param value Value to set for the sharedCookies property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSharedCookies(@jakarta.annotation.Nullable final java.util.List<BrowserSharedCookie> value) {
        this.sharedCookies = value;
    }
    /**
     * Sets the sites property value. A collection of sites defined for the site list.
     * @param value Value to set for the sites property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSites(@jakarta.annotation.Nullable final java.util.List<BrowserSite> value) {
        this.sites = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final BrowserSiteListStatus value) {
        this.status = value;
    }
}
