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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BrowserSiteList extends Entity implements Parsable {
    /**
     * Instantiates a new BrowserSiteList and sets the default values.
     */
    public BrowserSiteList() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BrowserSiteList
     */
    @jakarta.annotation.Nonnull
    public static BrowserSiteList createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSiteList();
    }
    /**
     * Gets the description property value. The description of the site list.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. The name of the site list.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
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
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.BackingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the site list was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the publishedBy property value. The user who published the site list.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getPublishedBy() {
        return this.BackingStore.get("publishedBy");
    }
    /**
     * Gets the publishedDateTime property value. The date and time when the site list was published.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this.BackingStore.get("publishedDateTime");
    }
    /**
     * Gets the revision property value. The current revision of the site list.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRevision() {
        return this.BackingStore.get("revision");
    }
    /**
     * Gets the sharedCookies property value. A collection of shared cookies defined for the site list.
     * @return a java.util.List<BrowserSharedCookie>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BrowserSharedCookie> getSharedCookies() {
        return this.BackingStore.get("sharedCookies");
    }
    /**
     * Gets the sites property value. A collection of sites defined for the site list.
     * @return a java.util.List<BrowserSite>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BrowserSite> getSites() {
        return this.BackingStore.get("sites");
    }
    /**
     * Gets the status property value. The status property
     * @return a BrowserSiteListStatus
     */
    @jakarta.annotation.Nullable
    public BrowserSiteListStatus getStatus() {
        return this.BackingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The name of the site list.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the site list.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.BackingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the site list was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the publishedBy property value. The user who published the site list.
     * @param value Value to set for the publishedBy property.
     */
    public void setPublishedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.BackingStore.set("publishedBy", value);
    }
    /**
     * Sets the publishedDateTime property value. The date and time when the site list was published.
     * @param value Value to set for the publishedDateTime property.
     */
    public void setPublishedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("publishedDateTime", value);
    }
    /**
     * Sets the revision property value. The current revision of the site list.
     * @param value Value to set for the revision property.
     */
    public void setRevision(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("revision", value);
    }
    /**
     * Sets the sharedCookies property value. A collection of shared cookies defined for the site list.
     * @param value Value to set for the sharedCookies property.
     */
    public void setSharedCookies(@jakarta.annotation.Nullable final java.util.List<BrowserSharedCookie> value) {
        this.BackingStore.set("sharedCookies", value);
    }
    /**
     * Sets the sites property value. A collection of sites defined for the site list.
     * @param value Value to set for the sites property.
     */
    public void setSites(@jakarta.annotation.Nullable final java.util.List<BrowserSite> value) {
        this.BackingStore.set("sites", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final BrowserSiteListStatus value) {
        this.BackingStore.set("status", value);
    }
}
