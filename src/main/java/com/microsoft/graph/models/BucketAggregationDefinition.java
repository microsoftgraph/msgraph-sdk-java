package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BucketAggregationDefinition implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** True to specify the sort order as descending. The default is false, with the sort order as ascending. Optional.  */
    private Boolean _isDescending;
    /** The minimum number of items that should be present in the aggregation to be returned in a bucket. Optional.  */
    private Integer _minimumCount;
    /** A filter to define a matching criteria. The key should start with the specified prefix to be returned in the response. Optional.  */
    private String _prefixFilter;
    /** Specifies the manual ranges to compute the aggregations. This is only valid for non-string refiners of date or numeric type. Optional.  */
    private java.util.List<BucketAggregationRange> _ranges;
    /** The possible values are count to sort by the number of matches in the aggregation, keyAsStringto sort alphabeticaly based on the key in the aggregation, keyAsNumber for numerical sorting based on the key in the aggregation. Required.  */
    private BucketAggregationSortProperty _sortBy;
    /**
     * Instantiates a new bucketAggregationDefinition and sets the default values.
     * @return a void
     */
    public BucketAggregationDefinition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bucketAggregationDefinition
     */
    @javax.annotation.Nonnull
    public static BucketAggregationDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BucketAggregationDefinition();
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
        final BucketAggregationDefinition currentObject = this;
        return new HashMap<>(5) {{
            this.put("isDescending", (n) -> { currentObject.setIsDescending(n.getBooleanValue()); });
            this.put("minimumCount", (n) -> { currentObject.setMinimumCount(n.getIntegerValue()); });
            this.put("prefixFilter", (n) -> { currentObject.setPrefixFilter(n.getStringValue()); });
            this.put("ranges", (n) -> { currentObject.setRanges(n.getCollectionOfObjectValues(BucketAggregationRange::createFromDiscriminatorValue)); });
            this.put("sortBy", (n) -> { currentObject.setSortBy(n.getEnumValue(BucketAggregationSortProperty.class)); });
        }};
    }
    /**
     * Gets the isDescending property value. True to specify the sort order as descending. The default is false, with the sort order as ascending. Optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDescending() {
        return this._isDescending;
    }
    /**
     * Gets the minimumCount property value. The minimum number of items that should be present in the aggregation to be returned in a bucket. Optional.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumCount() {
        return this._minimumCount;
    }
    /**
     * Gets the prefixFilter property value. A filter to define a matching criteria. The key should start with the specified prefix to be returned in the response. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrefixFilter() {
        return this._prefixFilter;
    }
    /**
     * Gets the ranges property value. Specifies the manual ranges to compute the aggregations. This is only valid for non-string refiners of date or numeric type. Optional.
     * @return a bucketAggregationRange
     */
    @javax.annotation.Nullable
    public java.util.List<BucketAggregationRange> getRanges() {
        return this._ranges;
    }
    /**
     * Gets the sortBy property value. The possible values are count to sort by the number of matches in the aggregation, keyAsStringto sort alphabeticaly based on the key in the aggregation, keyAsNumber for numerical sorting based on the key in the aggregation. Required.
     * @return a bucketAggregationSortProperty
     */
    @javax.annotation.Nullable
    public BucketAggregationSortProperty getSortBy() {
        return this._sortBy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isDescending", this.getIsDescending());
        writer.writeIntegerValue("minimumCount", this.getMinimumCount());
        writer.writeStringValue("prefixFilter", this.getPrefixFilter());
        writer.writeCollectionOfObjectValues("ranges", this.getRanges());
        writer.writeEnumValue("sortBy", this.getSortBy());
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
     * Sets the isDescending property value. True to specify the sort order as descending. The default is false, with the sort order as ascending. Optional.
     * @param value Value to set for the isDescending property.
     * @return a void
     */
    public void setIsDescending(@javax.annotation.Nullable final Boolean value) {
        this._isDescending = value;
    }
    /**
     * Sets the minimumCount property value. The minimum number of items that should be present in the aggregation to be returned in a bucket. Optional.
     * @param value Value to set for the minimumCount property.
     * @return a void
     */
    public void setMinimumCount(@javax.annotation.Nullable final Integer value) {
        this._minimumCount = value;
    }
    /**
     * Sets the prefixFilter property value. A filter to define a matching criteria. The key should start with the specified prefix to be returned in the response. Optional.
     * @param value Value to set for the prefixFilter property.
     * @return a void
     */
    public void setPrefixFilter(@javax.annotation.Nullable final String value) {
        this._prefixFilter = value;
    }
    /**
     * Sets the ranges property value. Specifies the manual ranges to compute the aggregations. This is only valid for non-string refiners of date or numeric type. Optional.
     * @param value Value to set for the ranges property.
     * @return a void
     */
    public void setRanges(@javax.annotation.Nullable final java.util.List<BucketAggregationRange> value) {
        this._ranges = value;
    }
    /**
     * Sets the sortBy property value. The possible values are count to sort by the number of matches in the aggregation, keyAsStringto sort alphabeticaly based on the key in the aggregation, keyAsNumber for numerical sorting based on the key in the aggregation. Required.
     * @param value Value to set for the sortBy property.
     * @return a void
     */
    public void setSortBy(@javax.annotation.Nullable final BucketAggregationSortProperty value) {
        this._sortBy = value;
    }
}
