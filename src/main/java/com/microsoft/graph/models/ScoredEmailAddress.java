package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ScoredEmailAddress implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The email address.  */
    private String _address;
    /** The itemId property  */
    private String _itemId;
    /** The relevance score of the email address. A relevance score is used as a sort key, in relation to the other returned results. A higher relevance score value corresponds to a more relevant result. Relevance is determined by the user’s communication and collaboration patterns and business relationships.  */
    private Double _relevanceScore;
    /** The selectionLikelihood property  */
    private SelectionLikelihoodInfo _selectionLikelihood;
    /**
     * Instantiates a new scoredEmailAddress and sets the default values.
     * @return a void
     */
    public ScoredEmailAddress() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a scoredEmailAddress
     */
    @javax.annotation.Nonnull
    public static ScoredEmailAddress createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScoredEmailAddress();
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
     * Gets the address property value. The email address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddress() {
        return this._address;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ScoredEmailAddress currentObject = this;
        return new HashMap<>(4) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getStringValue()); });
            this.put("itemId", (n) -> { currentObject.setItemId(n.getStringValue()); });
            this.put("relevanceScore", (n) -> { currentObject.setRelevanceScore(n.getDoubleValue()); });
            this.put("selectionLikelihood", (n) -> { currentObject.setSelectionLikelihood(n.getEnumValue(SelectionLikelihoodInfo.class)); });
        }};
    }
    /**
     * Gets the itemId property value. The itemId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getItemId() {
        return this._itemId;
    }
    /**
     * Gets the relevanceScore property value. The relevance score of the email address. A relevance score is used as a sort key, in relation to the other returned results. A higher relevance score value corresponds to a more relevant result. Relevance is determined by the user’s communication and collaboration patterns and business relationships.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getRelevanceScore() {
        return this._relevanceScore;
    }
    /**
     * Gets the selectionLikelihood property value. The selectionLikelihood property
     * @return a selectionLikelihoodInfo
     */
    @javax.annotation.Nullable
    public SelectionLikelihoodInfo getSelectionLikelihood() {
        return this._selectionLikelihood;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("address", this.getAddress());
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeDoubleValue("relevanceScore", this.getRelevanceScore());
        writer.writeEnumValue("selectionLikelihood", this.getSelectionLikelihood());
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
     * Sets the address property value. The email address.
     * @param value Value to set for the address property.
     * @return a void
     */
    public void setAddress(@javax.annotation.Nullable final String value) {
        this._address = value;
    }
    /**
     * Sets the itemId property value. The itemId property
     * @param value Value to set for the itemId property.
     * @return a void
     */
    public void setItemId(@javax.annotation.Nullable final String value) {
        this._itemId = value;
    }
    /**
     * Sets the relevanceScore property value. The relevance score of the email address. A relevance score is used as a sort key, in relation to the other returned results. A higher relevance score value corresponds to a more relevant result. Relevance is determined by the user’s communication and collaboration patterns and business relationships.
     * @param value Value to set for the relevanceScore property.
     * @return a void
     */
    public void setRelevanceScore(@javax.annotation.Nullable final Double value) {
        this._relevanceScore = value;
    }
    /**
     * Sets the selectionLikelihood property value. The selectionLikelihood property
     * @param value Value to set for the selectionLikelihood property.
     * @return a void
     */
    public void setSelectionLikelihood(@javax.annotation.Nullable final SelectionLikelihoodInfo value) {
        this._selectionLikelihood = value;
    }
}
