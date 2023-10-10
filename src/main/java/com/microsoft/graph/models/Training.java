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
     * The availabilityStatus property
     */
    private TrainingAvailabilityStatus availabilityStatus;
    /**
     * The createdBy property
     */
    private EmailIdentity createdBy;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description property
     */
    private String description;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The durationInMinutes property
     */
    private Integer durationInMinutes;
    /**
     * The hasEvaluation property
     */
    private Boolean hasEvaluation;
    /**
     * The languageDetails property
     */
    private java.util.List<TrainingLanguageDetail> languageDetails;
    /**
     * The lastModifiedBy property
     */
    private EmailIdentity lastModifiedBy;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The source property
     */
    private SimulationContentSource source;
    /**
     * The supportedLocales property
     */
    private java.util.List<String> supportedLocales;
    /**
     * The tags property
     */
    private java.util.List<String> tags;
    /**
     * The type property
     */
    private TrainingType type;
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
     * Gets the availabilityStatus property value. The availabilityStatus property
     * @return a TrainingAvailabilityStatus
     */
    @jakarta.annotation.Nullable
    public TrainingAvailabilityStatus getAvailabilityStatus() {
        return this.availabilityStatus;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a EmailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the durationInMinutes property value. The durationInMinutes property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDurationInMinutes() {
        return this.durationInMinutes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availabilityStatus", (n) -> { this.setAvailabilityStatus(n.getEnumValue(TrainingAvailabilityStatus.class)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("durationInMinutes", (n) -> { this.setDurationInMinutes(n.getIntegerValue()); });
        deserializerMap.put("hasEvaluation", (n) -> { this.setHasEvaluation(n.getBooleanValue()); });
        deserializerMap.put("languageDetails", (n) -> { this.setLanguageDetails(n.getCollectionOfObjectValues(TrainingLanguageDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(SimulationContentSource.class)); });
        deserializerMap.put("supportedLocales", (n) -> { this.setSupportedLocales(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(TrainingType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hasEvaluation property value. The hasEvaluation property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasEvaluation() {
        return this.hasEvaluation;
    }
    /**
     * Gets the languageDetails property value. The languageDetails property
     * @return a java.util.List<TrainingLanguageDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrainingLanguageDetail> getLanguageDetails() {
        return this.languageDetails;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a EmailIdentity
     */
    @jakarta.annotation.Nullable
    public EmailIdentity getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the source property value. The source property
     * @return a SimulationContentSource
     */
    @jakarta.annotation.Nullable
    public SimulationContentSource getSource() {
        return this.source;
    }
    /**
     * Gets the supportedLocales property value. The supportedLocales property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedLocales() {
        return this.supportedLocales;
    }
    /**
     * Gets the tags property value. The tags property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }
    /**
     * Gets the type property value. The type property
     * @return a TrainingType
     */
    @jakarta.annotation.Nullable
    public TrainingType getType() {
        return this.type;
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
     * Sets the availabilityStatus property value. The availabilityStatus property
     * @param value Value to set for the availabilityStatus property.
     */
    public void setAvailabilityStatus(@jakarta.annotation.Nullable final TrainingAvailabilityStatus value) {
        this.availabilityStatus = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the durationInMinutes property value. The durationInMinutes property
     * @param value Value to set for the durationInMinutes property.
     */
    public void setDurationInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.durationInMinutes = value;
    }
    /**
     * Sets the hasEvaluation property value. The hasEvaluation property
     * @param value Value to set for the hasEvaluation property.
     */
    public void setHasEvaluation(@jakarta.annotation.Nullable final Boolean value) {
        this.hasEvaluation = value;
    }
    /**
     * Sets the languageDetails property value. The languageDetails property
     * @param value Value to set for the languageDetails property.
     */
    public void setLanguageDetails(@jakarta.annotation.Nullable final java.util.List<TrainingLanguageDetail> value) {
        this.languageDetails = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final EmailIdentity value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final SimulationContentSource value) {
        this.source = value;
    }
    /**
     * Sets the supportedLocales property value. The supportedLocales property
     * @param value Value to set for the supportedLocales property.
     */
    public void setSupportedLocales(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.supportedLocales = value;
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tags = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final TrainingType value) {
        this.type = value;
    }
}
