package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RedundancyDetectionSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether email threading and near duplicate detection are enabled.
     */
    private Boolean isEnabled;
    /**
     * Specifies the maximum number of words used for email threading and near duplicate detection. To learn more, see Minimum/maximum number of words.
     */
    private Integer maxWords;
    /**
     * Specifies the minimum number of words used for email threading and near duplicate detection. To learn more, see Minimum/maximum number of words.
     */
    private Integer minWords;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Specifies the similarity level for documents to be put in the same near duplicate set. To learn more, see Document and email similarity threshold.
     */
    private Integer similarityThreshold;
    /**
     * Instantiates a new redundancyDetectionSettings and sets the default values.
     */
    public RedundancyDetectionSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a redundancyDetectionSettings
     */
    @jakarta.annotation.Nonnull
    public static RedundancyDetectionSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedundancyDetectionSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("maxWords", (n) -> { this.setMaxWords(n.getIntegerValue()); });
        deserializerMap.put("minWords", (n) -> { this.setMinWords(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("similarityThreshold", (n) -> { this.setSimilarityThreshold(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Indicates whether email threading and near duplicate detection are enabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the maxWords property value. Specifies the maximum number of words used for email threading and near duplicate detection. To learn more, see Minimum/maximum number of words.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxWords() {
        return this.maxWords;
    }
    /**
     * Gets the minWords property value. Specifies the minimum number of words used for email threading and near duplicate detection. To learn more, see Minimum/maximum number of words.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinWords() {
        return this.minWords;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the similarityThreshold property value. Specifies the similarity level for documents to be put in the same near duplicate set. To learn more, see Document and email similarity threshold.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSimilarityThreshold() {
        return this.similarityThreshold;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeIntegerValue("maxWords", this.getMaxWords());
        writer.writeIntegerValue("minWords", this.getMinWords());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("similarityThreshold", this.getSimilarityThreshold());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether email threading and near duplicate detection are enabled.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the maxWords property value. Specifies the maximum number of words used for email threading and near duplicate detection. To learn more, see Minimum/maximum number of words.
     * @param value Value to set for the maxWords property.
     */
    public void setMaxWords(@jakarta.annotation.Nullable final Integer value) {
        this.maxWords = value;
    }
    /**
     * Sets the minWords property value. Specifies the minimum number of words used for email threading and near duplicate detection. To learn more, see Minimum/maximum number of words.
     * @param value Value to set for the minWords property.
     */
    public void setMinWords(@jakarta.annotation.Nullable final Integer value) {
        this.minWords = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the similarityThreshold property value. Specifies the similarity level for documents to be put in the same near duplicate set. To learn more, see Document and email similarity threshold.
     * @param value Value to set for the similarityThreshold property.
     */
    public void setSimilarityThreshold(@jakarta.annotation.Nullable final Integer value) {
        this.similarityThreshold = value;
    }
}
