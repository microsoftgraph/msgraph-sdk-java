package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryCaseSettings extends Entity implements Parsable {
    /**
     * Instantiates a new EdiscoveryCaseSettings and sets the default values.
     */
    public EdiscoveryCaseSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdiscoveryCaseSettings
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryCaseSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryCaseSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ocr", (n) -> { this.setOcr(n.getObjectValue(OcrSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("redundancyDetection", (n) -> { this.setRedundancyDetection(n.getObjectValue(RedundancyDetectionSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("topicModeling", (n) -> { this.setTopicModeling(n.getObjectValue(TopicModelingSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ocr property value. The OCR (Optical Character Recognition) settings for the case.
     * @return a OcrSettings
     */
    @jakarta.annotation.Nullable
    public OcrSettings getOcr() {
        return this.BackingStore.get("ocr");
    }
    /**
     * Gets the redundancyDetection property value. The redundancy (near duplicate and email threading) detection settings for the case.
     * @return a RedundancyDetectionSettings
     */
    @jakarta.annotation.Nullable
    public RedundancyDetectionSettings getRedundancyDetection() {
        return this.BackingStore.get("redundancyDetection");
    }
    /**
     * Gets the topicModeling property value. The Topic Modeling (Themes) settings for the case.
     * @return a TopicModelingSettings
     */
    @jakarta.annotation.Nullable
    public TopicModelingSettings getTopicModeling() {
        return this.BackingStore.get("topicModeling");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("ocr", this.getOcr());
        writer.writeObjectValue("redundancyDetection", this.getRedundancyDetection());
        writer.writeObjectValue("topicModeling", this.getTopicModeling());
    }
    /**
     * Sets the ocr property value. The OCR (Optical Character Recognition) settings for the case.
     * @param value Value to set for the ocr property.
     */
    public void setOcr(@jakarta.annotation.Nullable final OcrSettings value) {
        this.BackingStore.set("ocr", value);
    }
    /**
     * Sets the redundancyDetection property value. The redundancy (near duplicate and email threading) detection settings for the case.
     * @param value Value to set for the redundancyDetection property.
     */
    public void setRedundancyDetection(@jakarta.annotation.Nullable final RedundancyDetectionSettings value) {
        this.BackingStore.set("redundancyDetection", value);
    }
    /**
     * Sets the topicModeling property value. The Topic Modeling (Themes) settings for the case.
     * @param value Value to set for the topicModeling property.
     */
    public void setTopicModeling(@jakarta.annotation.Nullable final TopicModelingSettings value) {
        this.BackingStore.set("topicModeling", value);
    }
}
