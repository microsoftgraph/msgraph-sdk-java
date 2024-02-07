package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Article extends Entity implements Parsable {
    /**
     * Instantiates a new Article and sets the default values.
     */
    public Article() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Article
     */
    @jakarta.annotation.Nonnull
    public static Article createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Article();
    }
    /**
     * Gets the body property value. The body property
     * @return a FormattedContent
     */
    @jakarta.annotation.Nullable
    public FormattedContent getBody() {
        return this.backingStore.get("body");
    }
    /**
     * Gets the createdDateTime property value. The date and time when this article was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("body", (n) -> { this.setBody(n.getObjectValue(FormattedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("imageUrl", (n) -> { this.setImageUrl(n.getStringValue()); });
        deserializerMap.put("indicators", (n) -> { this.setIndicators(n.getCollectionOfObjectValues(ArticleIndicator::createFromDiscriminatorValue)); });
        deserializerMap.put("isFeatured", (n) -> { this.setIsFeatured(n.getBooleanValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getObjectValue(FormattedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the imageUrl property value. URL of the header image for this article, used for display purposes.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getImageUrl() {
        return this.backingStore.get("imageUrl");
    }
    /**
     * Gets the indicators property value. Indicators related to this article.
     * @return a java.util.List<ArticleIndicator>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ArticleIndicator> getIndicators() {
        return this.backingStore.get("indicators");
    }
    /**
     * Gets the isFeatured property value. Indicates whether this article is currently featured by Microsoft.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFeatured() {
        return this.backingStore.get("isFeatured");
    }
    /**
     * Gets the lastUpdatedDateTime property value. The most recent date and time when this article was updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the summary property value. The summary property
     * @return a FormattedContent
     */
    @jakarta.annotation.Nullable
    public FormattedContent getSummary() {
        return this.backingStore.get("summary");
    }
    /**
     * Gets the tags property value. Tags for this article, communicating keywords, or key concepts.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Gets the title property value. The title of this article.
     * @return a String
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
        writer.writeObjectValue("body", this.getBody());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("imageUrl", this.getImageUrl());
        writer.writeCollectionOfObjectValues("indicators", this.getIndicators());
        writer.writeBooleanValue("isFeatured", this.getIsFeatured());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeObjectValue("summary", this.getSummary());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the body property value. The body property
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final FormattedContent value) {
        this.backingStore.set("body", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when this article was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the imageUrl property value. URL of the header image for this article, used for display purposes.
     * @param value Value to set for the imageUrl property.
     */
    public void setImageUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("imageUrl", value);
    }
    /**
     * Sets the indicators property value. Indicators related to this article.
     * @param value Value to set for the indicators property.
     */
    public void setIndicators(@jakarta.annotation.Nullable final java.util.List<ArticleIndicator> value) {
        this.backingStore.set("indicators", value);
    }
    /**
     * Sets the isFeatured property value. Indicates whether this article is currently featured by Microsoft.
     * @param value Value to set for the isFeatured property.
     */
    public void setIsFeatured(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFeatured", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. The most recent date and time when this article was updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the summary property value. The summary property
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final FormattedContent value) {
        this.backingStore.set("summary", value);
    }
    /**
     * Sets the tags property value. Tags for this article, communicating keywords, or key concepts.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tags", value);
    }
    /**
     * Sets the title property value. The title of this article.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}
