package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TopicModelingSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Indicates whether the themes model should dynamically optimize the number of generated topics. To learn more, see Adjust maximum number of themes dynamically. */
    private Boolean dynamicallyAdjustTopicCount;
    /** Indicates whether the themes model should exclude numbers while parsing document texts. To learn more, see Include numbers in themes. */
    private Boolean ignoreNumbers;
    /** Indicates whether themes model is enabled for the case. */
    private Boolean isEnabled;
    /** The OdataType property */
    private String odataType;
    /** The total number of topics that the themes model will generate for a review set. To learn more, see Maximum number of themes. */
    private Integer topicCount;
    /**
     * Instantiates a new topicModelingSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TopicModelingSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a topicModelingSettings
     */
    @javax.annotation.Nonnull
    public static TopicModelingSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TopicModelingSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the dynamicallyAdjustTopicCount property value. Indicates whether the themes model should dynamically optimize the number of generated topics. To learn more, see Adjust maximum number of themes dynamically.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDynamicallyAdjustTopicCount() {
        return this.dynamicallyAdjustTopicCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("dynamicallyAdjustTopicCount", (n) -> { this.setDynamicallyAdjustTopicCount(n.getBooleanValue()); });
        deserializerMap.put("ignoreNumbers", (n) -> { this.setIgnoreNumbers(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("topicCount", (n) -> { this.setTopicCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignoreNumbers property value. Indicates whether the themes model should exclude numbers while parsing document texts. To learn more, see Include numbers in themes.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIgnoreNumbers() {
        return this.ignoreNumbers;
    }
    /**
     * Gets the isEnabled property value. Indicates whether themes model is enabled for the case.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the topicCount property value. The total number of topics that the themes model will generate for a review set. To learn more, see Maximum number of themes.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTopicCount() {
        return this.topicCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("dynamicallyAdjustTopicCount", this.getDynamicallyAdjustTopicCount());
        writer.writeBooleanValue("ignoreNumbers", this.getIgnoreNumbers());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("topicCount", this.getTopicCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the dynamicallyAdjustTopicCount property value. Indicates whether the themes model should dynamically optimize the number of generated topics. To learn more, see Adjust maximum number of themes dynamically.
     * @param value Value to set for the dynamicallyAdjustTopicCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDynamicallyAdjustTopicCount(@javax.annotation.Nullable final Boolean value) {
        this.dynamicallyAdjustTopicCount = value;
    }
    /**
     * Sets the ignoreNumbers property value. Indicates whether the themes model should exclude numbers while parsing document texts. To learn more, see Include numbers in themes.
     * @param value Value to set for the ignoreNumbers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIgnoreNumbers(@javax.annotation.Nullable final Boolean value) {
        this.ignoreNumbers = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether themes model is enabled for the case.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the topicCount property value. The total number of topics that the themes model will generate for a review set. To learn more, see Maximum number of themes.
     * @param value Value to set for the topicCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopicCount(@javax.annotation.Nullable final Integer value) {
        this.topicCount = value;
    }
}
