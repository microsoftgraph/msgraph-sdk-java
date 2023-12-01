package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BrowserSharedCookie extends Entity implements Parsable {
    /**
     * Instantiates a new BrowserSharedCookie and sets the default values.
     */
    public BrowserSharedCookie() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BrowserSharedCookie
     */
    @jakarta.annotation.Nonnull
    public static BrowserSharedCookie createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSharedCookie();
    }
    /**
     * Gets the comment property value. The comment for the shared cookie.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.backingStore.get("comment");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the shared cookie was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deletedDateTime property value. The date and time when the shared cookie was deleted.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this.backingStore.get("deletedDateTime");
    }
    /**
     * Gets the displayName property value. The name of the cookie.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
        deserializerMap.put("sourceEnvironment", (n) -> { this.setSourceEnvironment(n.getEnumValue(BrowserSharedCookieSourceEnvironment::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(BrowserSharedCookieStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. The history of modifications applied to the cookie.
     * @return a java.util.List<BrowserSharedCookieHistory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BrowserSharedCookieHistory> getHistory() {
        return this.backingStore.get("history");
    }
    /**
     * Gets the hostOnly property value. Controls whether a cookie is a host-only or domain cookie.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHostOnly() {
        return this.backingStore.get("hostOnly");
    }
    /**
     * Gets the hostOrDomain property value. The URL of the cookie.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHostOrDomain() {
        return this.backingStore.get("hostOrDomain");
    }
    /**
     * Gets the lastModifiedBy property value. The user who last modified the cookie.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the cookie was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the path property value. The path of the cookie.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.backingStore.get("path");
    }
    /**
     * Gets the sourceEnvironment property value. The sourceEnvironment property
     * @return a BrowserSharedCookieSourceEnvironment
     */
    @jakarta.annotation.Nullable
    public BrowserSharedCookieSourceEnvironment getSourceEnvironment() {
        return this.backingStore.get("sourceEnvironment");
    }
    /**
     * Gets the status property value. The status property
     * @return a BrowserSharedCookieStatus
     */
    @jakarta.annotation.Nullable
    public BrowserSharedCookieStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("comment", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the shared cookie was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deletedDateTime property value. The date and time when the shared cookie was deleted.
     * @param value Value to set for the deletedDateTime property.
     */
    public void setDeletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deletedDateTime", value);
    }
    /**
     * Sets the displayName property value. The name of the cookie.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the history property value. The history of modifications applied to the cookie.
     * @param value Value to set for the history property.
     */
    public void setHistory(@jakarta.annotation.Nullable final java.util.List<BrowserSharedCookieHistory> value) {
        this.backingStore.set("history", value);
    }
    /**
     * Sets the hostOnly property value. Controls whether a cookie is a host-only or domain cookie.
     * @param value Value to set for the hostOnly property.
     */
    public void setHostOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hostOnly", value);
    }
    /**
     * Sets the hostOrDomain property value. The URL of the cookie.
     * @param value Value to set for the hostOrDomain property.
     */
    public void setHostOrDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hostOrDomain", value);
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the cookie.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the cookie was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the path property value. The path of the cookie.
     * @param value Value to set for the path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("path", value);
    }
    /**
     * Sets the sourceEnvironment property value. The sourceEnvironment property
     * @param value Value to set for the sourceEnvironment property.
     */
    public void setSourceEnvironment(@jakarta.annotation.Nullable final BrowserSharedCookieSourceEnvironment value) {
        this.backingStore.set("sourceEnvironment", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final BrowserSharedCookieStatus value) {
        this.backingStore.set("status", value);
    }
}
