package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Training extends Entity implements Parsable {
    /**
     * Instantiates a new Training and sets the default values.
     */
    public Training() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Training
     */
    @jakarta.annotation.Nonnull
    public static Training createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Training();
    }
    /**
     * Gets the availabilityStatus property value. Training availability status. Possible values are: unknown, notAvailable, available, archive, delete, unknownFutureValue.
     * @return a TrainingAvailabilityStatus
     */
    @jakarta.annotation.Nullable
    public TrainingAvailabilityStatus getAvailabilityStatus() {
        return this.backingStore.get("availabilityStatus");
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the training.
     * @return a EmailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Date and time when the training was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description for the training.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name for the training.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the durationInMinutes property value. Training duration.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDurationInMinutes() {
        return this.backingStore.get("durationInMinutes");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availabilityStatus", (n) -> { this.setAvailabilityStatus(n.getEnumValue(TrainingAvailabilityStatus::forValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("durationInMinutes", (n) -> { this.setDurationInMinutes(n.getIntegerValue()); });
        deserializerMap.put("hasEvaluation", (n) -> { this.setHasEvaluation(n.getBooleanValue()); });
        deserializerMap.put("languageDetails", (n) -> { this.setLanguageDetails(n.getCollectionOfObjectValues(TrainingLanguageDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(SimulationContentSource::forValue)); });
        deserializerMap.put("supportedLocales", (n) -> { this.setSupportedLocales(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(TrainingType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hasEvaluation property value. Indicates whether the training has any evaluation.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasEvaluation() {
        return this.backingStore.get("hasEvaluation");
    }
    /**
     * Gets the languageDetails property value. Language specific details on a training.
     * @return a java.util.List<TrainingLanguageDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrainingLanguageDetail> getLanguageDetails() {
        return this.backingStore.get("languageDetails");
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who last modified the training.
     * @return a EmailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time when the training was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the source property value. Training content source. Possible values are: unknown, global, tenant, unknownFutureValue.
     * @return a SimulationContentSource
     */
    @jakarta.annotation.Nullable
    public SimulationContentSource getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Gets the supportedLocales property value. Supported locales for content for the associated training.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedLocales() {
        return this.backingStore.get("supportedLocales");
    }
    /**
     * Gets the tags property value. Training tags.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Gets the type property value. The type of training. Possible values are: unknown, phishing, unknownFutureValue.
     * @return a TrainingType
     */
    @jakarta.annotation.Nullable
    public TrainingType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("availabilityStatus", this.getAvailabilityStatus());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("durationInMinutes", this.getDurationInMinutes());
        writer.writeBooleanValue("hasEvaluation", this.getHasEvaluation());
        writer.writeCollectionOfObjectValues("languageDetails", this.getLanguageDetails());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("source", this.getSource());
        writer.writeCollectionOfPrimitiveValues("supportedLocales", this.getSupportedLocales());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the availabilityStatus property value. Training availability status. Possible values are: unknown, notAvailable, available, archive, delete, unknownFutureValue.
     * @param value Value to set for the availabilityStatus property.
     */
    public void setAvailabilityStatus(@jakarta.annotation.Nullable final TrainingAvailabilityStatus value) {
        this.backingStore.set("availabilityStatus", value);
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the training.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time when the training was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description for the training.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name for the training.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the durationInMinutes property value. Training duration.
     * @param value Value to set for the durationInMinutes property.
     */
    public void setDurationInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("durationInMinutes", value);
    }
    /**
     * Sets the hasEvaluation property value. Indicates whether the training has any evaluation.
     * @param value Value to set for the hasEvaluation property.
     */
    public void setHasEvaluation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasEvaluation", value);
    }
    /**
     * Sets the languageDetails property value. Language specific details on a training.
     * @param value Value to set for the languageDetails property.
     */
    public void setLanguageDetails(@jakarta.annotation.Nullable final java.util.List<TrainingLanguageDetail> value) {
        this.backingStore.set("languageDetails", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who last modified the training.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time when the training was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the source property value. Training content source. Possible values are: unknown, global, tenant, unknownFutureValue.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final SimulationContentSource value) {
        this.backingStore.set("source", value);
    }
    /**
     * Sets the supportedLocales property value. Supported locales for content for the associated training.
     * @param value Value to set for the supportedLocales property.
     */
    public void setSupportedLocales(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportedLocales", value);
    }
    /**
     * Sets the tags property value. Training tags.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tags", value);
    }
    /**
     * Sets the type property value. The type of training. Possible values are: unknown, phishing, unknownFutureValue.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final TrainingType value) {
        this.backingStore.set("type", value);
    }
}
