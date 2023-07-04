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
public class BrowserSite extends Entity implements Parsable {
    /**
     * Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain.
     */
    private Boolean allowRedirect;
    /**
     * The comment for the site.
     */
    private String comment;
    /**
     * The compatibilityMode property
     */
    private BrowserSiteCompatibilityMode compatibilityMode;
    /**
     * The date and time when the site was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The date and time when the site was deleted.
     */
    private OffsetDateTime deletedDateTime;
    /**
     * The history of modifications applied to the site.
     */
    private java.util.List<BrowserSiteHistory> history;
    /**
     * The user who last modified the site.
     */
    private IdentitySet lastModifiedBy;
    /**
     * The date and time when the site was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The mergeType property
     */
    private BrowserSiteMergeType mergeType;
    /**
     * The status property
     */
    private BrowserSiteStatus status;
    /**
     * The targetEnvironment property
     */
    private BrowserSiteTargetEnvironment targetEnvironment;
    /**
     * The URL of the site.
     */
    private String webUrl;
    /**
     * Instantiates a new browserSite and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BrowserSite() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a browserSite
     */
    @javax.annotation.Nonnull
    public static BrowserSite createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSite();
    }
    /**
     * Gets the allowRedirect property value. Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowRedirect() {
        return this.allowRedirect;
    }
    /**
     * Gets the comment property value. The comment for the site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this.comment;
    }
    /**
     * Gets the compatibilityMode property value. The compatibilityMode property
     * @return a BrowserSiteCompatibilityMode
     */
    @javax.annotation.Nullable
    public BrowserSiteCompatibilityMode getCompatibilityMode() {
        return this.compatibilityMode;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the site was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the deletedDateTime property value. The date and time when the site was deleted.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this.deletedDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowRedirect", (n) -> { this.setAllowRedirect(n.getBooleanValue()); });
        deserializerMap.put("comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("compatibilityMode", (n) -> { this.setCompatibilityMode(n.getEnumValue(BrowserSiteCompatibilityMode.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("history", (n) -> { this.setHistory(n.getCollectionOfObjectValues(BrowserSiteHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mergeType", (n) -> { this.setMergeType(n.getEnumValue(BrowserSiteMergeType.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(BrowserSiteStatus.class)); });
        deserializerMap.put("targetEnvironment", (n) -> { this.setTargetEnvironment(n.getEnumValue(BrowserSiteTargetEnvironment.class)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. The history of modifications applied to the site.
     * @return a BrowserSiteHistory
     */
    @javax.annotation.Nullable
    public java.util.List<BrowserSiteHistory> getHistory() {
        return this.history;
    }
    /**
     * Gets the lastModifiedBy property value. The user who last modified the site.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the site was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the mergeType property value. The mergeType property
     * @return a BrowserSiteMergeType
     */
    @javax.annotation.Nullable
    public BrowserSiteMergeType getMergeType() {
        return this.mergeType;
    }
    /**
     * Gets the status property value. The status property
     * @return a BrowserSiteStatus
     */
    @javax.annotation.Nullable
    public BrowserSiteStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the targetEnvironment property value. The targetEnvironment property
     * @return a BrowserSiteTargetEnvironment
     */
    @javax.annotation.Nullable
    public BrowserSiteTargetEnvironment getTargetEnvironment() {
        return this.targetEnvironment;
    }
    /**
     * Gets the webUrl property value. The URL of the site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowRedirect(@javax.annotation.Nullable final Boolean value) {
        this.allowRedirect = value;
    }
    /**
     * Sets the comment property value. The comment for the site.
     * @param value Value to set for the comment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComment(@javax.annotation.Nullable final String value) {
        this.comment = value;
    }
    /**
     * Sets the compatibilityMode property value. The compatibilityMode property
     * @param value Value to set for the compatibilityMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompatibilityMode(@javax.annotation.Nullable final BrowserSiteCompatibilityMode value) {
        this.compatibilityMode = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the site was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the deletedDateTime property value. The date and time when the site was deleted.
     * @param value Value to set for the deletedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.deletedDateTime = value;
    }
    /**
     * Sets the history property value. The history of modifications applied to the site.
     * @param value Value to set for the history property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHistory(@javax.annotation.Nullable final java.util.List<BrowserSiteHistory> value) {
        this.history = value;
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the site.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the site was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the mergeType property value. The mergeType property
     * @param value Value to set for the mergeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMergeType(@javax.annotation.Nullable final BrowserSiteMergeType value) {
        this.mergeType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final BrowserSiteStatus value) {
        this.status = value;
    }
    /**
     * Sets the targetEnvironment property value. The targetEnvironment property
     * @param value Value to set for the targetEnvironment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetEnvironment(@javax.annotation.Nullable final BrowserSiteTargetEnvironment value) {
        this.targetEnvironment = value;
    }
    /**
     * Sets the webUrl property value. The URL of the site.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
