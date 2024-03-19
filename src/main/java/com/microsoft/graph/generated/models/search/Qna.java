package com.microsoft.graph.models.search;

import com.microsoft.graph.models.DevicePlatformType;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Qna extends SearchAnswer implements Parsable {
    /**
     * Instantiates a new {@link Qna} and sets the default values.
     */
    public Qna() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Qna}
     */
    @jakarta.annotation.Nonnull
    public static Qna createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Qna();
    }
    /**
     * Gets the availabilityEndDateTime property value. Date and time when the QnA stops appearing as a search result. Set as null for always available. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAvailabilityEndDateTime() {
        return this.backingStore.get("availabilityEndDateTime");
    }
    /**
     * Gets the availabilityStartDateTime property value. Date and time when the QnA starts to appear as a search result. Set as null for always available. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAvailabilityStartDateTime() {
        return this.backingStore.get("availabilityStartDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availabilityEndDateTime", (n) -> { this.setAvailabilityEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("availabilityStartDateTime", (n) -> { this.setAvailabilityStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupIds", (n) -> { this.setGroupIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isSuggested", (n) -> { this.setIsSuggested(n.getBooleanValue()); });
        deserializerMap.put("keywords", (n) -> { this.setKeywords(n.getObjectValue(AnswerKeyword::createFromDiscriminatorValue)); });
        deserializerMap.put("languageTags", (n) -> { this.setLanguageTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("platforms", (n) -> { this.setPlatforms(n.getCollectionOfEnumValues(DevicePlatformType::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AnswerState::forValue)); });
        deserializerMap.put("targetedVariations", (n) -> { this.setTargetedVariations(n.getCollectionOfObjectValues(AnswerVariant::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupIds property value. The list of security groups that are able to view this QnA.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGroupIds() {
        return this.backingStore.get("groupIds");
    }
    /**
     * Gets the isSuggested property value. True if a user or Microsoft suggested this QnA to the admin. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSuggested() {
        return this.backingStore.get("isSuggested");
    }
    /**
     * Gets the keywords property value. Keywords that trigger this QnA to appear in search results.
     * @return a {@link AnswerKeyword}
     */
    @jakarta.annotation.Nullable
    public AnswerKeyword getKeywords() {
        return this.backingStore.get("keywords");
    }
    /**
     * Gets the languageTags property value. A list of geographically specific language names in which this QnA can be viewed. Each language tag value follows the pattern {language}-{region}. For example, en-us is English as used in the United States. For the list of possible values, see Supported language tags.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLanguageTags() {
        return this.backingStore.get("languageTags");
    }
    /**
     * Gets the platforms property value. List of devices and operating systems that are able to view this QnA. Possible values are: android, androidForWork, ios, macOS, windowsPhone81, windowsPhone81AndLater, windows10AndLater, androidWorkProfile, unknown, androidASOP, androidMobileApplicationManagement, iOSMobileApplicationManagement, unknownFutureValue.
     * @return a {@link java.util.List<DevicePlatformType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DevicePlatformType> getPlatforms() {
        return this.backingStore.get("platforms");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link AnswerState}
     */
    @jakarta.annotation.Nullable
    public AnswerState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the targetedVariations property value. Variations of a QnA for different countries or devices. Use when you need to show different content to users based on their device, country/region, or both. The date and group settings apply to all variations.
     * @return a {@link java.util.List<AnswerVariant>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AnswerVariant> getTargetedVariations() {
        return this.backingStore.get("targetedVariations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("availabilityEndDateTime", this.getAvailabilityEndDateTime());
        writer.writeOffsetDateTimeValue("availabilityStartDateTime", this.getAvailabilityStartDateTime());
        writer.writeCollectionOfPrimitiveValues("groupIds", this.getGroupIds());
        writer.writeBooleanValue("isSuggested", this.getIsSuggested());
        writer.writeObjectValue("keywords", this.getKeywords());
        writer.writeCollectionOfPrimitiveValues("languageTags", this.getLanguageTags());
        writer.writeCollectionOfEnumValues("platforms", this.getPlatforms());
        writer.writeEnumValue("state", this.getState());
        writer.writeCollectionOfObjectValues("targetedVariations", this.getTargetedVariations());
    }
    /**
     * Sets the availabilityEndDateTime property value. Date and time when the QnA stops appearing as a search result. Set as null for always available. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the availabilityEndDateTime property.
     */
    public void setAvailabilityEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("availabilityEndDateTime", value);
    }
    /**
     * Sets the availabilityStartDateTime property value. Date and time when the QnA starts to appear as a search result. Set as null for always available. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the availabilityStartDateTime property.
     */
    public void setAvailabilityStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("availabilityStartDateTime", value);
    }
    /**
     * Sets the groupIds property value. The list of security groups that are able to view this QnA.
     * @param value Value to set for the groupIds property.
     */
    public void setGroupIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("groupIds", value);
    }
    /**
     * Sets the isSuggested property value. True if a user or Microsoft suggested this QnA to the admin. Read-only.
     * @param value Value to set for the isSuggested property.
     */
    public void setIsSuggested(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSuggested", value);
    }
    /**
     * Sets the keywords property value. Keywords that trigger this QnA to appear in search results.
     * @param value Value to set for the keywords property.
     */
    public void setKeywords(@jakarta.annotation.Nullable final AnswerKeyword value) {
        this.backingStore.set("keywords", value);
    }
    /**
     * Sets the languageTags property value. A list of geographically specific language names in which this QnA can be viewed. Each language tag value follows the pattern {language}-{region}. For example, en-us is English as used in the United States. For the list of possible values, see Supported language tags.
     * @param value Value to set for the languageTags property.
     */
    public void setLanguageTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("languageTags", value);
    }
    /**
     * Sets the platforms property value. List of devices and operating systems that are able to view this QnA. Possible values are: android, androidForWork, ios, macOS, windowsPhone81, windowsPhone81AndLater, windows10AndLater, androidWorkProfile, unknown, androidASOP, androidMobileApplicationManagement, iOSMobileApplicationManagement, unknownFutureValue.
     * @param value Value to set for the platforms property.
     */
    public void setPlatforms(@jakarta.annotation.Nullable final java.util.List<DevicePlatformType> value) {
        this.backingStore.set("platforms", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AnswerState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the targetedVariations property value. Variations of a QnA for different countries or devices. Use when you need to show different content to users based on their device, country/region, or both. The date and group settings apply to all variations.
     * @param value Value to set for the targetedVariations property.
     */
    public void setTargetedVariations(@jakarta.annotation.Nullable final java.util.List<AnswerVariant> value) {
        this.backingStore.set("targetedVariations", value);
    }
}
