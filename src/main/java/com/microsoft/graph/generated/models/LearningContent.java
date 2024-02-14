package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LearningContent extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LearningContent} and sets the default values.
     */
    public LearningContent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LearningContent}
     */
    @jakarta.annotation.Nonnull
    public static LearningContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LearningContent();
    }
    /**
     * Gets the additionalTags property value. Keywords, topics, and other tags associated with the learning content. Optional.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdditionalTags() {
        return this.backingStore.get("additionalTags");
    }
    /**
     * Gets the contentWebUrl property value. The content web URL for the learning content. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentWebUrl() {
        return this.backingStore.get("contentWebUrl");
    }
    /**
     * Gets the contributors property value. The authors, creators, or contributors of the learning content. Optional.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getContributors() {
        return this.backingStore.get("contributors");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the learning content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description or summary for the learning content. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the duration property value. The duration of the learning content in seconds. The value is represented in ISO 8601 format for durations. Optional.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDuration() {
        return this.backingStore.get("duration");
    }
    /**
     * Gets the externalId property value. Unique external content ID for the learning content. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalTags", (n) -> { this.setAdditionalTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("contentWebUrl", (n) -> { this.setContentWebUrl(n.getStringValue()); });
        deserializerMap.put("contributors", (n) -> { this.setContributors(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getStringValue()); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("isPremium", (n) -> { this.setIsPremium(n.getBooleanValue()); });
        deserializerMap.put("isSearchable", (n) -> { this.setIsSearchable(n.getBooleanValue()); });
        deserializerMap.put("languageTag", (n) -> { this.setLanguageTag(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("numberOfPages", (n) -> { this.setNumberOfPages(n.getIntegerValue()); });
        deserializerMap.put("skillTags", (n) -> { this.setSkillTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sourceName", (n) -> { this.setSourceName(n.getStringValue()); });
        deserializerMap.put("thumbnailWebUrl", (n) -> { this.setThumbnailWebUrl(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. The format of the learning content. For example, Course, Video, Book, Book Summary, Audiobook Summary. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFormat() {
        return this.backingStore.get("format");
    }
    /**
     * Gets the isActive property value. Indicates whether the content is active or not. Inactive content doesn't show up in the UI. The default value is true. Optional.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.backingStore.get("isActive");
    }
    /**
     * Gets the isPremium property value. Indicates whether the learning content requires the user to sign-in on the learning provider platform or not. The default value is false. Optional.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPremium() {
        return this.backingStore.get("isPremium");
    }
    /**
     * Gets the isSearchable property value. Indicates whether the learning content is searchable or not. The default value is true. Optional.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSearchable() {
        return this.backingStore.get("isSearchable");
    }
    /**
     * Gets the languageTag property value. The language of the learning content, for example, en-us or fr-fr. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguageTag() {
        return this.backingStore.get("languageTag");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the learning content was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the numberOfPages property value. The number of pages of the learning content, for example, 9. Optional.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfPages() {
        return this.backingStore.get("numberOfPages");
    }
    /**
     * Gets the skillTags property value. The skills tags associated with the learning content. Optional.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSkillTags() {
        return this.backingStore.get("skillTags");
    }
    /**
     * Gets the sourceName property value. The source name of the learning content, such as LinkedIn Learning or Coursera. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceName() {
        return this.backingStore.get("sourceName");
    }
    /**
     * Gets the thumbnailWebUrl property value. The URL of learning content thumbnail image. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThumbnailWebUrl() {
        return this.backingStore.get("thumbnailWebUrl");
    }
    /**
     * Gets the title property value. The title of the learning content. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("additionalTags", this.getAdditionalTags());
        writer.writeStringValue("contentWebUrl", this.getContentWebUrl());
        writer.writeCollectionOfPrimitiveValues("contributors", this.getContributors());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writePeriodAndDurationValue("duration", this.getDuration());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeStringValue("format", this.getFormat());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeBooleanValue("isPremium", this.getIsPremium());
        writer.writeBooleanValue("isSearchable", this.getIsSearchable());
        writer.writeStringValue("languageTag", this.getLanguageTag());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeIntegerValue("numberOfPages", this.getNumberOfPages());
        writer.writeCollectionOfPrimitiveValues("skillTags", this.getSkillTags());
        writer.writeStringValue("sourceName", this.getSourceName());
        writer.writeStringValue("thumbnailWebUrl", this.getThumbnailWebUrl());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the additionalTags property value. Keywords, topics, and other tags associated with the learning content. Optional.
     * @param value Value to set for the additionalTags property.
     */
    public void setAdditionalTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("additionalTags", value);
    }
    /**
     * Sets the contentWebUrl property value. The content web URL for the learning content. Required.
     * @param value Value to set for the contentWebUrl property.
     */
    public void setContentWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentWebUrl", value);
    }
    /**
     * Sets the contributors property value. The authors, creators, or contributors of the learning content. Optional.
     * @param value Value to set for the contributors property.
     */
    public void setContributors(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("contributors", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the learning content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description or summary for the learning content. Optional.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the duration property value. The duration of the learning content in seconds. The value is represented in ISO 8601 format for durations. Optional.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("duration", value);
    }
    /**
     * Sets the externalId property value. Unique external content ID for the learning content. Required.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the format property value. The format of the learning content. For example, Course, Video, Book, Book Summary, Audiobook Summary. Optional.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("format", value);
    }
    /**
     * Sets the isActive property value. Indicates whether the content is active or not. Inactive content doesn't show up in the UI. The default value is true. Optional.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isActive", value);
    }
    /**
     * Sets the isPremium property value. Indicates whether the learning content requires the user to sign-in on the learning provider platform or not. The default value is false. Optional.
     * @param value Value to set for the isPremium property.
     */
    public void setIsPremium(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPremium", value);
    }
    /**
     * Sets the isSearchable property value. Indicates whether the learning content is searchable or not. The default value is true. Optional.
     * @param value Value to set for the isSearchable property.
     */
    public void setIsSearchable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSearchable", value);
    }
    /**
     * Sets the languageTag property value. The language of the learning content, for example, en-us or fr-fr. Required.
     * @param value Value to set for the languageTag property.
     */
    public void setLanguageTag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("languageTag", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the learning content was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the numberOfPages property value. The number of pages of the learning content, for example, 9. Optional.
     * @param value Value to set for the numberOfPages property.
     */
    public void setNumberOfPages(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfPages", value);
    }
    /**
     * Sets the skillTags property value. The skills tags associated with the learning content. Optional.
     * @param value Value to set for the skillTags property.
     */
    public void setSkillTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("skillTags", value);
    }
    /**
     * Sets the sourceName property value. The source name of the learning content, such as LinkedIn Learning or Coursera. Optional.
     * @param value Value to set for the sourceName property.
     */
    public void setSourceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceName", value);
    }
    /**
     * Sets the thumbnailWebUrl property value. The URL of learning content thumbnail image. Optional.
     * @param value Value to set for the thumbnailWebUrl property.
     */
    public void setThumbnailWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thumbnailWebUrl", value);
    }
    /**
     * Sets the title property value. The title of the learning content. Required.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}
