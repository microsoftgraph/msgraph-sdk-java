package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Payload extends Entity implements Parsable {
    /**
     * The brand property
     */
    private PayloadBrand brand;
    /**
     * The complexity property
     */
    private PayloadComplexity complexity;
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
     * The detail property
     */
    private PayloadDetail detail;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The industry property
     */
    private PayloadIndustry industry;
    /**
     * The isAutomated property
     */
    private Boolean isAutomated;
    /**
     * The isControversial property
     */
    private Boolean isControversial;
    /**
     * The isCurrentEvent property
     */
    private Boolean isCurrentEvent;
    /**
     * The language property
     */
    private String language;
    /**
     * The lastModifiedBy property
     */
    private EmailIdentity lastModifiedBy;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The payloadTags property
     */
    private java.util.List<String> payloadTags;
    /**
     * The platform property
     */
    private PayloadDeliveryPlatform platform;
    /**
     * The predictedCompromiseRate property
     */
    private Double predictedCompromiseRate;
    /**
     * The simulationAttackType property
     */
    private SimulationAttackType simulationAttackType;
    /**
     * The source property
     */
    private SimulationContentSource source;
    /**
     * The status property
     */
    private SimulationContentStatus status;
    /**
     * The technique property
     */
    private SimulationAttackTechnique technique;
    /**
     * The theme property
     */
    private PayloadTheme theme;
    /**
     * Instantiates a new Payload and sets the default values.
     */
    public Payload() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Payload
     */
    @jakarta.annotation.Nonnull
    public static Payload createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Payload();
    }
    /**
     * Gets the brand property value. The brand property
     * @return a PayloadBrand
     */
    @jakarta.annotation.Nullable
    public PayloadBrand getBrand() {
        return this.brand;
    }
    /**
     * Gets the complexity property value. The complexity property
     * @return a PayloadComplexity
     */
    @jakarta.annotation.Nullable
    public PayloadComplexity getComplexity() {
        return this.complexity;
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
     * Gets the detail property value. The detail property
     * @return a PayloadDetail
     */
    @jakarta.annotation.Nullable
    public PayloadDetail getDetail() {
        return this.detail;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("brand", (n) -> { this.setBrand(n.getEnumValue(PayloadBrand.class)); });
        deserializerMap.put("complexity", (n) -> { this.setComplexity(n.getEnumValue(PayloadComplexity.class)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getObjectValue(PayloadDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("industry", (n) -> { this.setIndustry(n.getEnumValue(PayloadIndustry.class)); });
        deserializerMap.put("isAutomated", (n) -> { this.setIsAutomated(n.getBooleanValue()); });
        deserializerMap.put("isControversial", (n) -> { this.setIsControversial(n.getBooleanValue()); });
        deserializerMap.put("isCurrentEvent", (n) -> { this.setIsCurrentEvent(n.getBooleanValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(EmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("payloadTags", (n) -> { this.setPayloadTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(PayloadDeliveryPlatform.class)); });
        deserializerMap.put("predictedCompromiseRate", (n) -> { this.setPredictedCompromiseRate(n.getDoubleValue()); });
        deserializerMap.put("simulationAttackType", (n) -> { this.setSimulationAttackType(n.getEnumValue(SimulationAttackType.class)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(SimulationContentSource.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SimulationContentStatus.class)); });
        deserializerMap.put("technique", (n) -> { this.setTechnique(n.getEnumValue(SimulationAttackTechnique.class)); });
        deserializerMap.put("theme", (n) -> { this.setTheme(n.getEnumValue(PayloadTheme.class)); });
        return deserializerMap;
    }
    /**
     * Gets the industry property value. The industry property
     * @return a PayloadIndustry
     */
    @jakarta.annotation.Nullable
    public PayloadIndustry getIndustry() {
        return this.industry;
    }
    /**
     * Gets the isAutomated property value. The isAutomated property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAutomated() {
        return this.isAutomated;
    }
    /**
     * Gets the isControversial property value. The isControversial property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsControversial() {
        return this.isControversial;
    }
    /**
     * Gets the isCurrentEvent property value. The isCurrentEvent property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCurrentEvent() {
        return this.isCurrentEvent;
    }
    /**
     * Gets the language property value. The language property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.language;
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
     * Gets the payloadTags property value. The payloadTags property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPayloadTags() {
        return this.payloadTags;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a PayloadDeliveryPlatform
     */
    @jakarta.annotation.Nullable
    public PayloadDeliveryPlatform getPlatform() {
        return this.platform;
    }
    /**
     * Gets the predictedCompromiseRate property value. The predictedCompromiseRate property
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getPredictedCompromiseRate() {
        return this.predictedCompromiseRate;
    }
    /**
     * Gets the simulationAttackType property value. The simulationAttackType property
     * @return a SimulationAttackType
     */
    @jakarta.annotation.Nullable
    public SimulationAttackType getSimulationAttackType() {
        return this.simulationAttackType;
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
     * Gets the status property value. The status property
     * @return a SimulationContentStatus
     */
    @jakarta.annotation.Nullable
    public SimulationContentStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the technique property value. The technique property
     * @return a SimulationAttackTechnique
     */
    @jakarta.annotation.Nullable
    public SimulationAttackTechnique getTechnique() {
        return this.technique;
    }
    /**
     * Gets the theme property value. The theme property
     * @return a PayloadTheme
     */
    @jakarta.annotation.Nullable
    public PayloadTheme getTheme() {
        return this.theme;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("brand", this.getBrand());
        writer.writeEnumValue("complexity", this.getComplexity());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("detail", this.getDetail());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("industry", this.getIndustry());
        writer.writeBooleanValue("isAutomated", this.getIsAutomated());
        writer.writeBooleanValue("isControversial", this.getIsControversial());
        writer.writeBooleanValue("isCurrentEvent", this.getIsCurrentEvent());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("payloadTags", this.getPayloadTags());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeDoubleValue("predictedCompromiseRate", this.getPredictedCompromiseRate());
        writer.writeEnumValue("simulationAttackType", this.getSimulationAttackType());
        writer.writeEnumValue("source", this.getSource());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumValue("technique", this.getTechnique());
        writer.writeEnumValue("theme", this.getTheme());
    }
    /**
     * Sets the brand property value. The brand property
     * @param value Value to set for the brand property.
     */
    public void setBrand(@jakarta.annotation.Nullable final PayloadBrand value) {
        this.brand = value;
    }
    /**
     * Sets the complexity property value. The complexity property
     * @param value Value to set for the complexity property.
     */
    public void setComplexity(@jakarta.annotation.Nullable final PayloadComplexity value) {
        this.complexity = value;
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
     * Sets the detail property value. The detail property
     * @param value Value to set for the detail property.
     */
    public void setDetail(@jakarta.annotation.Nullable final PayloadDetail value) {
        this.detail = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the industry property value. The industry property
     * @param value Value to set for the industry property.
     */
    public void setIndustry(@jakarta.annotation.Nullable final PayloadIndustry value) {
        this.industry = value;
    }
    /**
     * Sets the isAutomated property value. The isAutomated property
     * @param value Value to set for the isAutomated property.
     */
    public void setIsAutomated(@jakarta.annotation.Nullable final Boolean value) {
        this.isAutomated = value;
    }
    /**
     * Sets the isControversial property value. The isControversial property
     * @param value Value to set for the isControversial property.
     */
    public void setIsControversial(@jakarta.annotation.Nullable final Boolean value) {
        this.isControversial = value;
    }
    /**
     * Sets the isCurrentEvent property value. The isCurrentEvent property
     * @param value Value to set for the isCurrentEvent property.
     */
    public void setIsCurrentEvent(@jakarta.annotation.Nullable final Boolean value) {
        this.isCurrentEvent = value;
    }
    /**
     * Sets the language property value. The language property
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.language = value;
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
     * Sets the payloadTags property value. The payloadTags property
     * @param value Value to set for the payloadTags property.
     */
    public void setPayloadTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.payloadTags = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final PayloadDeliveryPlatform value) {
        this.platform = value;
    }
    /**
     * Sets the predictedCompromiseRate property value. The predictedCompromiseRate property
     * @param value Value to set for the predictedCompromiseRate property.
     */
    public void setPredictedCompromiseRate(@jakarta.annotation.Nullable final Double value) {
        this.predictedCompromiseRate = value;
    }
    /**
     * Sets the simulationAttackType property value. The simulationAttackType property
     * @param value Value to set for the simulationAttackType property.
     */
    public void setSimulationAttackType(@jakarta.annotation.Nullable final SimulationAttackType value) {
        this.simulationAttackType = value;
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final SimulationContentSource value) {
        this.source = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SimulationContentStatus value) {
        this.status = value;
    }
    /**
     * Sets the technique property value. The technique property
     * @param value Value to set for the technique property.
     */
    public void setTechnique(@jakarta.annotation.Nullable final SimulationAttackTechnique value) {
        this.technique = value;
    }
    /**
     * Sets the theme property value. The theme property
     * @param value Value to set for the theme property.
     */
    public void setTheme(@jakarta.annotation.Nullable final PayloadTheme value) {
        this.theme = value;
    }
}
