package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryCaseSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EdiscoveryCaseSettings} and sets the default values.
     */
    public EdiscoveryCaseSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EdiscoveryCaseSettings}
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryCaseSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryCaseSettings();
    }
    /**
     * Gets the caseType property value. The caseType property
     * @return a {@link CaseType}
     */
    @jakarta.annotation.Nullable
    public CaseType getCaseType() {
        return this.backingStore.get("caseType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("caseType", (n) -> { this.setCaseType(n.getEnumValue(CaseType::forValue)); });
        deserializerMap.put("ocr", (n) -> { this.setOcr(n.getObjectValue(OcrSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("redundancyDetection", (n) -> { this.setRedundancyDetection(n.getObjectValue(RedundancyDetectionSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewSetSettings", (n) -> { this.setReviewSetSettings(n.getEnumSetValue(ReviewSetSettings::forValue)); });
        deserializerMap.put("topicModeling", (n) -> { this.setTopicModeling(n.getObjectValue(TopicModelingSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ocr property value. The OCR (Optical Character Recognition) settings for the case.
     * @return a {@link OcrSettings}
     */
    @jakarta.annotation.Nullable
    public OcrSettings getOcr() {
        return this.backingStore.get("ocr");
    }
    /**
     * Gets the redundancyDetection property value. The redundancy (near duplicate and email threading) detection settings for the case.
     * @return a {@link RedundancyDetectionSettings}
     */
    @jakarta.annotation.Nullable
    public RedundancyDetectionSettings getRedundancyDetection() {
        return this.backingStore.get("redundancyDetection");
    }
    /**
     * Gets the reviewSetSettings property value. The settings of the review set for the case. The possible values are: none, disableGrouping, unknownFutureValue.
     * @return a {@link EnumSet<ReviewSetSettings>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ReviewSetSettings> getReviewSetSettings() {
        return this.backingStore.get("reviewSetSettings");
    }
    /**
     * Gets the topicModeling property value. The Topic Modeling (Themes) settings for the case.
     * @return a {@link TopicModelingSettings}
     */
    @jakarta.annotation.Nullable
    public TopicModelingSettings getTopicModeling() {
        return this.backingStore.get("topicModeling");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("caseType", this.getCaseType());
        writer.writeObjectValue("ocr", this.getOcr());
        writer.writeObjectValue("redundancyDetection", this.getRedundancyDetection());
        writer.writeEnumSetValue("reviewSetSettings", this.getReviewSetSettings());
        writer.writeObjectValue("topicModeling", this.getTopicModeling());
    }
    /**
     * Sets the caseType property value. The caseType property
     * @param value Value to set for the caseType property.
     */
    public void setCaseType(@jakarta.annotation.Nullable final CaseType value) {
        this.backingStore.set("caseType", value);
    }
    /**
     * Sets the ocr property value. The OCR (Optical Character Recognition) settings for the case.
     * @param value Value to set for the ocr property.
     */
    public void setOcr(@jakarta.annotation.Nullable final OcrSettings value) {
        this.backingStore.set("ocr", value);
    }
    /**
     * Sets the redundancyDetection property value. The redundancy (near duplicate and email threading) detection settings for the case.
     * @param value Value to set for the redundancyDetection property.
     */
    public void setRedundancyDetection(@jakarta.annotation.Nullable final RedundancyDetectionSettings value) {
        this.backingStore.set("redundancyDetection", value);
    }
    /**
     * Sets the reviewSetSettings property value. The settings of the review set for the case. The possible values are: none, disableGrouping, unknownFutureValue.
     * @param value Value to set for the reviewSetSettings property.
     */
    public void setReviewSetSettings(@jakarta.annotation.Nullable final EnumSet<ReviewSetSettings> value) {
        this.backingStore.set("reviewSetSettings", value);
    }
    /**
     * Sets the topicModeling property value. The Topic Modeling (Themes) settings for the case.
     * @param value Value to set for the topicModeling property.
     */
    public void setTopicModeling(@jakarta.annotation.Nullable final TopicModelingSettings value) {
        this.backingStore.set("topicModeling", value);
    }
}
