package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BrowserSharedCookie extends Entity implements Parsable {
    /**
     * The comment for the shared cookie.
     */
    private String comment;
    /**
     * The date and time when the shared cookie was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The date and time when the shared cookie was deleted.
     */
    private OffsetDateTime deletedDateTime;
    /**
     * The name of the cookie.
     */
    private String displayName;
    /**
     * The history of modifications applied to the cookie.
     */
    private java.util.List<BrowserSharedCookieHistory> history;
    /**
     * Controls whether a cookie is a host-only or domain cookie.
     */
    private Boolean hostOnly;
    /**
     * The URL of the cookie.
     */
    private String hostOrDomain;
    /**
     * The user who last modified the cookie.
     */
    private IdentitySet lastModifiedBy;
    /**
     * The date and time when the cookie was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The path of the cookie.
     */
    private String path;
    /**
     * The sourceEnvironment property
     */
    private BrowserSharedCookieSourceEnvironment sourceEnvironment;
    /**
     * The status property
     */
    private BrowserSharedCookieStatus status;
    /**
     * Instantiates a new browserSharedCookie and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BrowserSharedCookie() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a browserSharedCookie
     */
    @javax.annotation.Nonnull
    public static BrowserSharedCookie createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSharedCookie();
    }
    /**
     * Gets the comment property value. The comment for the shared cookie.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this.comment;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the shared cookie was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the deletedDateTime property value. The date and time when the shared cookie was deleted.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this.deletedDateTime;
    }
    /**
     * Gets the displayName property value. The name of the cookie.
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
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("history", (n) -> { this.setHistory(n.getCollectionOfObjectValues(BrowserSharedCookieHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("hostOnly", (n) -> { this.setHostOnly(n.getBooleanValue()); });
        deserializerMap.put("hostOrDomain", (n) -> { this.setHostOrDomain(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("sourceEnvironment", (n) -> { this.setSourceEnvironment(n.getEnumValue(BrowserSharedCookieSourceEnvironment.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(BrowserSharedCookieStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. The history of modifications applied to the cookie.
     * @return a BrowserSharedCookieHistory
     */
    @javax.annotation.Nullable
    public java.util.List<BrowserSharedCookieHistory> getHistory() {
        return this.history;
    }
    /**
     * Gets the hostOnly property value. Controls whether a cookie is a host-only or domain cookie.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHostOnly() {
        return this.hostOnly;
    }
    /**
     * Gets the hostOrDomain property value. The URL of the cookie.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHostOrDomain() {
        return this.hostOrDomain;
    }
    /**
     * Gets the lastModifiedBy property value. The user who last modified the cookie.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the cookie was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the path property value. The path of the cookie.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Gets the sourceEnvironment property value. The sourceEnvironment property
     * @return a BrowserSharedCookieSourceEnvironment
     */
    @javax.annotation.Nullable
    public BrowserSharedCookieSourceEnvironment getSourceEnvironment() {
        return this.sourceEnvironment;
    }
    /**
     * Gets the status property value. The status property
     * @return a BrowserSharedCookieStatus
     */
    @javax.annotation.Nullable
    public BrowserSharedCookieStatus getStatus() {
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
        writer.writeStringValue("comment", this.getComment());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("deletedDateTime", this.getDeletedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeBooleanValue("hostOnly", this.getHostOnly());
        writer.writeStringValue("hostOrDomain", this.getHostOrDomain());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("path", this.getPath());
        writer.writeEnumValue("sourceEnvironment", this.getSourceEnvironment());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the comment property value. The comment for the shared cookie.
     * @param value Value to set for the comment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComment(@javax.annotation.Nullable final String value) {
        this.comment = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the shared cookie was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the deletedDateTime property value. The date and time when the shared cookie was deleted.
     * @param value Value to set for the deletedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.deletedDateTime = value;
    }
    /**
     * Sets the displayName property value. The name of the cookie.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the history property value. The history of modifications applied to the cookie.
     * @param value Value to set for the history property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHistory(@javax.annotation.Nullable final java.util.List<BrowserSharedCookieHistory> value) {
        this.history = value;
    }
    /**
     * Sets the hostOnly property value. Controls whether a cookie is a host-only or domain cookie.
     * @param value Value to set for the hostOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostOnly(@javax.annotation.Nullable final Boolean value) {
        this.hostOnly = value;
    }
    /**
     * Sets the hostOrDomain property value. The URL of the cookie.
     * @param value Value to set for the hostOrDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostOrDomain(@javax.annotation.Nullable final String value) {
        this.hostOrDomain = value;
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the cookie.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the cookie was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the path property value. The path of the cookie.
     * @param value Value to set for the path property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPath(@javax.annotation.Nullable final String value) {
        this.path = value;
    }
    /**
     * Sets the sourceEnvironment property value. The sourceEnvironment property
     * @param value Value to set for the sourceEnvironment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceEnvironment(@javax.annotation.Nullable final BrowserSharedCookieSourceEnvironment value) {
        this.sourceEnvironment = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final BrowserSharedCookieStatus value) {
        this.status = value;
    }
}
