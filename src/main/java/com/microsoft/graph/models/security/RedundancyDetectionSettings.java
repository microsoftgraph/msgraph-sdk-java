package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RedundancyDetectionSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether email threading and near duplicate detection are enabled. */
    private Boolean _isEnabled;
    /** Specifies the maximum number of words used for email threading and near duplicate detection. To learn more, see Minimum/maximum number of words. */
    private Integer _maxWords;
    /** Specifies the minimum number of words used for email threading and near duplicate detection. To learn more, see Minimum/maximum number of words. */
    private Integer _minWords;
    /** The OdataType property */
    private String _odataType;
    /** Specifies the similarity level for documents to be put in the same near duplicate set. To learn more, see Document and email similarity threshold. */
    private Integer _similarityThreshold;
    /**
     * Instantiates a new redundancyDetectionSettings and sets the default values.
     * @return a void
     */
    public RedundancyDetectionSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.security.redundancyDetectionSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a redundancyDetectionSettings
     */
    @javax.annotation.Nonnull
    public static RedundancyDetectionSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedundancyDetectionSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RedundancyDetectionSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("maxWords", (n) -> { currentObject.setMaxWords(n.getIntegerValue()); });
            this.put("minWords", (n) -> { currentObject.setMinWords(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("similarityThreshold", (n) -> { currentObject.setSimilarityThreshold(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the isEnabled property value. Indicates whether email threading and near duplicate detection are enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the maxWords property value. Specifies the maximum number of words used for email threading and near duplicate detection. To learn more, see Minimum/maximum number of words.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxWords() {
        return this._maxWords;
    }
    /**
     * Gets the minWords property value. Specifies the minimum number of words used for email threading and near duplicate detection. To learn more, see Minimum/maximum number of words.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinWords() {
        return this._minWords;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the similarityThreshold property value. Specifies the similarity level for documents to be put in the same near duplicate set. To learn more, see Document and email similarity threshold.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSimilarityThreshold() {
        return this._similarityThreshold;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether email threading and near duplicate detection are enabled.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the maxWords property value. Specifies the maximum number of words used for email threading and near duplicate detection. To learn more, see Minimum/maximum number of words.
     * @param value Value to set for the maxWords property.
     * @return a void
     */
    public void setMaxWords(@javax.annotation.Nullable final Integer value) {
        this._maxWords = value;
    }
    /**
     * Sets the minWords property value. Specifies the minimum number of words used for email threading and near duplicate detection. To learn more, see Minimum/maximum number of words.
     * @param value Value to set for the minWords property.
     * @return a void
     */
    public void setMinWords(@javax.annotation.Nullable final Integer value) {
        this._minWords = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the similarityThreshold property value. Specifies the similarity level for documents to be put in the same near duplicate set. To learn more, see Document and email similarity threshold.
     * @param value Value to set for the similarityThreshold property.
     * @return a void
     */
    public void setSimilarityThreshold(@javax.annotation.Nullable final Integer value) {
        this._similarityThreshold = value;
    }
}
