package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchBucket implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A token containing the encoded filter to aggregate search matches by the specific key value. To use the filter, pass the token as part of the aggregationFilter property in a searchRequest object, in the format '{field}:/'{aggregationFilterToken}/''. See an example. */
    private String _aggregationFilterToken;
    /** The approximate number of search matches that share the same value specified in the key property. Note that this number is not the exact number of matches. */
    private Integer _count;
    /** The discrete value of the field that an aggregation was computed on. */
    private String _key;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new searchBucket and sets the default values.
     * @return a void
     */
    public SearchBucket() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.searchBucket");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchBucket
     */
    @javax.annotation.Nonnull
    public static SearchBucket createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchBucket();
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
     * Gets the aggregationFilterToken property value. A token containing the encoded filter to aggregate search matches by the specific key value. To use the filter, pass the token as part of the aggregationFilter property in a searchRequest object, in the format '{field}:/'{aggregationFilterToken}/''. See an example.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAggregationFilterToken() {
        return this._aggregationFilterToken;
    }
    /**
     * Gets the count property value. The approximate number of search matches that share the same value specified in the key property. Note that this number is not the exact number of matches.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCount() {
        return this._count;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SearchBucket currentObject = this;
        return new HashMap<>(4) {{
            this.put("aggregationFilterToken", (n) -> { currentObject.setAggregationFilterToken(n.getStringValue()); });
            this.put("count", (n) -> { currentObject.setCount(n.getIntegerValue()); });
            this.put("key", (n) -> { currentObject.setKey(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the key property value. The discrete value of the field that an aggregation was computed on.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKey() {
        return this._key;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("aggregationFilterToken", this.getAggregationFilterToken());
        writer.writeIntegerValue("count", this.getCount());
        writer.writeStringValue("key", this.getKey());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the aggregationFilterToken property value. A token containing the encoded filter to aggregate search matches by the specific key value. To use the filter, pass the token as part of the aggregationFilter property in a searchRequest object, in the format '{field}:/'{aggregationFilterToken}/''. See an example.
     * @param value Value to set for the aggregationFilterToken property.
     * @return a void
     */
    public void setAggregationFilterToken(@javax.annotation.Nullable final String value) {
        this._aggregationFilterToken = value;
    }
    /**
     * Sets the count property value. The approximate number of search matches that share the same value specified in the key property. Note that this number is not the exact number of matches.
     * @param value Value to set for the count property.
     * @return a void
     */
    public void setCount(@javax.annotation.Nullable final Integer value) {
        this._count = value;
    }
    /**
     * Sets the key property value. The discrete value of the field that an aggregation was computed on.
     * @param value Value to set for the key property.
     * @return a void
     */
    public void setKey(@javax.annotation.Nullable final String value) {
        this._key = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
