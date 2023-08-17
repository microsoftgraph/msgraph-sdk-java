package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LearningContent extends Entity implements Parsable {
    /**
     * Keywords, topics, and other tags associated with the learning content. Optional.
     */
    private java.util.List<String> additionalTags;
    /**
     * The content web URL for the learning content. Required.
     */
    private String contentWebUrl;
    /**
     * The authors, creators, or contributors of the learning content. Optional.
     */
    private java.util.List<String> contributors;
    /**
     * The date and time when the learning content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description or summary for the learning content. Optional.
     */
    private String description;
    /**
     * The duration of the learning content in seconds. The value is represented in ISO 8601 format for durations. Optional.
     */
    private PeriodAndDuration duration;
    /**
     * Unique external content ID for the learning content. Required.
     */
    private String externalId;
    /**
     * The format of the learning content. For example, Course, Video, Book, Book Summary, Audiobook Summary. Optional.
     */
    private String format;
    /**
     * Indicates whether the content is active or not. Inactive content doesn't show up in the UI. The default value is true. Optional.
     */
    private Boolean isActive;
    /**
     * Indicates whether the learning content requires the user to sign-in on the learning provider platform or not. The default value is false. Optional.
     */
    private Boolean isPremium;
    /**
     * Indicates whether the learning content is searchable or not. The default value is true. Optional.
     */
    private Boolean isSearchable;
    /**
     * The language of the learning content, for example, en-us or fr-fr. Required.
     */
    private String languageTag;
    /**
     * The date and time when the learning content was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The number of pages of the learning content, for example, 9. Optional.
     */
    private Integer numberOfPages;
    /**
     * The skills tags associated with the learning content. Optional.
     */
    private java.util.List<String> skillTags;
    /**
     * The source name of the learning content, such as LinkedIn Learning or Coursera. Optional.
     */
    private String sourceName;
    /**
     * The URL of learning content thumbnail image. Optional.
     */
    private String thumbnailWebUrl;
    /**
     * The title of the learning content. Required.
     */
    private String title;
    /**
     * Instantiates a new learningContent and sets the default values.
     */
    public LearningContent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a learningContent
     */
    @jakarta.annotation.Nonnull
    public static LearningContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LearningContent();
    }
    /**
     * Gets the additionalTags property value. Keywords, topics, and other tags associated with the learning content. Optional.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdditionalTags() {
        return this.additionalTags;
    }
    /**
     * Gets the contentWebUrl property value. The content web URL for the learning content. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContentWebUrl() {
        return this.contentWebUrl;
    }
    /**
     * Gets the contributors property value. The authors, creators, or contributors of the learning content. Optional.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getContributors() {
        return this.contributors;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the learning content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description or summary for the learning content. Optional.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the duration property value. The duration of the learning content in seconds. The value is represented in ISO 8601 format for durations. Optional.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDuration() {
        return this.duration;
    }
    /**
     * Gets the externalId property value. Unique external content ID for the learning content. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFormat() {
        return this.format;
    }
    /**
     * Gets the isActive property value. Indicates whether the content is active or not. Inactive content doesn't show up in the UI. The default value is true. Optional.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }
    /**
     * Gets the isPremium property value. Indicates whether the learning content requires the user to sign-in on the learning provider platform or not. The default value is false. Optional.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPremium() {
        return this.isPremium;
    }
    /**
     * Gets the isSearchable property value. Indicates whether the learning content is searchable or not. The default value is true. Optional.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSearchable() {
        return this.isSearchable;
    }
    /**
     * Gets the languageTag property value. The language of the learning content, for example, en-us or fr-fr. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLanguageTag() {
        return this.languageTag;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the learning content was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the numberOfPages property value. The number of pages of the learning content, for example, 9. Optional.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfPages() {
        return this.numberOfPages;
    }
    /**
     * Gets the skillTags property value. The skills tags associated with the learning content. Optional.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSkillTags() {
        return this.skillTags;
    }
    /**
     * Gets the sourceName property value. The source name of the learning content, such as LinkedIn Learning or Coursera. Optional.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSourceName() {
        return this.sourceName;
    }
    /**
     * Gets the thumbnailWebUrl property value. The URL of learning content thumbnail image. Optional.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getThumbnailWebUrl() {
        return this.thumbnailWebUrl;
    }
    /**
     * Gets the title property value. The title of the learning content. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
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
        this.additionalTags = value;
    }
    /**
     * Sets the contentWebUrl property value. The content web URL for the learning content. Required.
     * @param value Value to set for the contentWebUrl property.
     */
    public void setContentWebUrl(@jakarta.annotation.Nullable final String value) {
        this.contentWebUrl = value;
    }
    /**
     * Sets the contributors property value. The authors, creators, or contributors of the learning content. Optional.
     * @param value Value to set for the contributors property.
     */
    public void setContributors(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.contributors = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the learning content was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description or summary for the learning content. Optional.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the duration property value. The duration of the learning content in seconds. The value is represented in ISO 8601 format for durations. Optional.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.duration = value;
    }
    /**
     * Sets the externalId property value. Unique external content ID for the learning content. Required.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the format property value. The format of the learning content. For example, Course, Video, Book, Book Summary, Audiobook Summary. Optional.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final String value) {
        this.format = value;
    }
    /**
     * Sets the isActive property value. Indicates whether the content is active or not. Inactive content doesn't show up in the UI. The default value is true. Optional.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.isActive = value;
    }
    /**
     * Sets the isPremium property value. Indicates whether the learning content requires the user to sign-in on the learning provider platform or not. The default value is false. Optional.
     * @param value Value to set for the isPremium property.
     */
    public void setIsPremium(@jakarta.annotation.Nullable final Boolean value) {
        this.isPremium = value;
    }
    /**
     * Sets the isSearchable property value. Indicates whether the learning content is searchable or not. The default value is true. Optional.
     * @param value Value to set for the isSearchable property.
     */
    public void setIsSearchable(@jakarta.annotation.Nullable final Boolean value) {
        this.isSearchable = value;
    }
    /**
     * Sets the languageTag property value. The language of the learning content, for example, en-us or fr-fr. Required.
     * @param value Value to set for the languageTag property.
     */
    public void setLanguageTag(@jakarta.annotation.Nullable final String value) {
        this.languageTag = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the learning content was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the numberOfPages property value. The number of pages of the learning content, for example, 9. Optional.
     * @param value Value to set for the numberOfPages property.
     */
    public void setNumberOfPages(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfPages = value;
    }
    /**
     * Sets the skillTags property value. The skills tags associated with the learning content. Optional.
     * @param value Value to set for the skillTags property.
     */
    public void setSkillTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.skillTags = value;
    }
    /**
     * Sets the sourceName property value. The source name of the learning content, such as LinkedIn Learning or Coursera. Optional.
     * @param value Value to set for the sourceName property.
     */
    public void setSourceName(@jakarta.annotation.Nullable final String value) {
        this.sourceName = value;
    }
    /**
     * Sets the thumbnailWebUrl property value. The URL of learning content thumbnail image. Optional.
     * @param value Value to set for the thumbnailWebUrl property.
     */
    public void setThumbnailWebUrl(@jakarta.annotation.Nullable final String value) {
        this.thumbnailWebUrl = value;
    }
    /**
     * Sets the title property value. The title of the learning content. Required.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
