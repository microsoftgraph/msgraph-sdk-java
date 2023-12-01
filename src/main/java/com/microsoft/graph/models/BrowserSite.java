package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Singleton entity which is used to specify IE mode site metadata
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BrowserSite extends Entity implements Parsable {
    /**
     * Instantiates a new BrowserSite and sets the default values.
     */
    public BrowserSite() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BrowserSite
     */
    @jakarta.annotation.Nonnull
    public static BrowserSite createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSite();
    }
    /**
     * Gets the allowRedirect property value. Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowRedirect() {
        return this.backingStore.get("allowRedirect");
    }
    /**
     * Gets the comment property value. The comment for the site.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.backingStore.get("comment");
    }
    /**
     * Gets the compatibilityMode property value. The compatibilityMode property
     * @return a BrowserSiteCompatibilityMode
     */
    @jakarta.annotation.Nullable
    public BrowserSiteCompatibilityMode getCompatibilityMode() {
        return this.backingStore.get("compatibilityMode");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the site was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deletedDateTime property value. The date and time when the site was deleted.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this.backingStore.get("deletedDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowRedirect", (n) -> { this.setAllowRedirect(n.getBooleanValue()); });
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("compatibilityMode", (n) -> { this.setCompatibilityMode(n.getEnumValue(BrowserSiteCompatibilityMode::forValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("history", (n) -> { this.setHistory(n.getCollectionOfObjectValues(BrowserSiteHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mergeType", (n) -> { this.setMergeType(n.getEnumValue(BrowserSiteMergeType::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(BrowserSiteStatus::forValue)); });
        deserializerMap.put("targetEnvironment", (n) -> { this.setTargetEnvironment(n.getEnumValue(BrowserSiteTargetEnvironment::forValue)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. The history of modifications applied to the site.
     * @return a java.util.List<BrowserSiteHistory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BrowserSiteHistory> getHistory() {
        return this.backingStore.get("history");
    }
    /**
     * Gets the lastModifiedBy property value. The user who last modified the site.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the site was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the mergeType property value. The mergeType property
     * @return a BrowserSiteMergeType
     */
    @jakarta.annotation.Nullable
    public BrowserSiteMergeType getMergeType() {
        return this.backingStore.get("mergeType");
    }
    /**
     * Gets the status property value. The status property
     * @return a BrowserSiteStatus
     */
    @jakarta.annotation.Nullable
    public BrowserSiteStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the targetEnvironment property value. The targetEnvironment property
     * @return a BrowserSiteTargetEnvironment
     */
    @jakarta.annotation.Nullable
    public BrowserSiteTargetEnvironment getTargetEnvironment() {
        return this.backingStore.get("targetEnvironment");
    }
    /**
     * Gets the webUrl property value. The URL of the site.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowRedirect", this.getAllowRedirect());
        writer.writeStringValue("comment", this.getComment());
        writer.writeEnumValue("compatibilityMode", this.getCompatibilityMode());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("deletedDateTime", this.getDeletedDateTime());
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("mergeType", this.getMergeType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumValue("targetEnvironment", this.getTargetEnvironment());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the allowRedirect property value. Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain.
     * @param value Value to set for the allowRedirect property.
     */
    public void setAllowRedirect(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowRedirect", value);
    }
    /**
     * Sets the comment property value. The comment for the site.
     * @param value Value to set for the comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("comment", value);
    }
    /**
     * Sets the compatibilityMode property value. The compatibilityMode property
     * @param value Value to set for the compatibilityMode property.
     */
    public void setCompatibilityMode(@jakarta.annotation.Nullable final BrowserSiteCompatibilityMode value) {
        this.backingStore.set("compatibilityMode", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the site was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deletedDateTime property value. The date and time when the site was deleted.
     * @param value Value to set for the deletedDateTime property.
     */
    public void setDeletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deletedDateTime", value);
    }
    /**
     * Sets the history property value. The history of modifications applied to the site.
     * @param value Value to set for the history property.
     */
    public void setHistory(@jakarta.annotation.Nullable final java.util.List<BrowserSiteHistory> value) {
        this.backingStore.set("history", value);
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the site.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the site was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the mergeType property value. The mergeType property
     * @param value Value to set for the mergeType property.
     */
    public void setMergeType(@jakarta.annotation.Nullable final BrowserSiteMergeType value) {
        this.backingStore.set("mergeType", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final BrowserSiteStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the targetEnvironment property value. The targetEnvironment property
     * @param value Value to set for the targetEnvironment property.
     */
    public void setTargetEnvironment(@jakarta.annotation.Nullable final BrowserSiteTargetEnvironment value) {
        this.backingStore.set("targetEnvironment", value);
    }
    /**
     * Sets the webUrl property value. The URL of the site.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
