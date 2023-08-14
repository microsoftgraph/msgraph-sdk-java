package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BucketAggregationDefinition implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * True to specify the sort order as descending. The default is false, with the sort order as ascending. Optional.
     */
    private Boolean isDescending;
    /**
     * The minimum number of items that should be present in the aggregation to be returned in a bucket. Optional.
     */
    private Integer minimumCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * A filter to define a matching criteria. The key should start with the specified prefix to be returned in the response. Optional.
     */
    private String prefixFilter;
    /**
     * Specifies the manual ranges to compute the aggregations. This is only valid for non-string refiners of date or numeric type. Optional.
     */
    private java.util.List<BucketAggregationRange> ranges;
    /**
     * The sortBy property
     */
    private BucketAggregationSortProperty sortBy;
    /**
     * Instantiates a new bucketAggregationDefinition and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public BucketAggregationDefinition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bucketAggregationDefinition
     */
    @jakarta.annotation.Nonnull
    public static BucketAggregationDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BucketAggregationDefinition();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("isDescending", (n) -> { this.setIsDescending(n.getBooleanValue()); });
        deserializerMap.put("minimumCount", (n) -> { this.setMinimumCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("prefixFilter", (n) -> { this.setPrefixFilter(n.getStringValue()); });
        deserializerMap.put("ranges", (n) -> { this.setRanges(n.getCollectionOfObjectValues(BucketAggregationRange::createFromDiscriminatorValue)); });
        deserializerMap.put("sortBy", (n) -> { this.setSortBy(n.getEnumValue(BucketAggregationSortProperty.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isDescending property value. True to specify the sort order as descending. The default is false, with the sort order as ascending. Optional.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDescending() {
        return this.isDescending;
    }
    /**
     * Gets the minimumCount property value. The minimum number of items that should be present in the aggregation to be returned in a bucket. Optional.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumCount() {
        return this.minimumCount;
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
     * Gets the prefixFilter property value. A filter to define a matching criteria. The key should start with the specified prefix to be returned in the response. Optional.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPrefixFilter() {
        return this.prefixFilter;
    }
    /**
     * Gets the ranges property value. Specifies the manual ranges to compute the aggregations. This is only valid for non-string refiners of date or numeric type. Optional.
     * @return a bucketAggregationRange
     */
    @jakarta.annotation.Nullable
    public java.util.List<BucketAggregationRange> getRanges() {
        return this.ranges;
    }
    /**
     * Gets the sortBy property value. The sortBy property
     * @return a bucketAggregationSortProperty
     */
    @jakarta.annotation.Nullable
    public BucketAggregationSortProperty getSortBy() {
        return this.sortBy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isDescending", this.getIsDescending());
        writer.writeIntegerValue("minimumCount", this.getMinimumCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("prefixFilter", this.getPrefixFilter());
        writer.writeCollectionOfObjectValues("ranges", this.getRanges());
        writer.writeEnumValue("sortBy", this.getSortBy());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isDescending property value. True to specify the sort order as descending. The default is false, with the sort order as ascending. Optional.
     * @param value Value to set for the isDescending property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsDescending(@jakarta.annotation.Nullable final Boolean value) {
        this.isDescending = value;
    }
    /**
     * Sets the minimumCount property value. The minimum number of items that should be present in the aggregation to be returned in a bucket. Optional.
     * @param value Value to set for the minimumCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMinimumCount(@jakarta.annotation.Nullable final Integer value) {
        this.minimumCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the prefixFilter property value. A filter to define a matching criteria. The key should start with the specified prefix to be returned in the response. Optional.
     * @param value Value to set for the prefixFilter property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrefixFilter(@jakarta.annotation.Nullable final String value) {
        this.prefixFilter = value;
    }
    /**
     * Sets the ranges property value. Specifies the manual ranges to compute the aggregations. This is only valid for non-string refiners of date or numeric type. Optional.
     * @param value Value to set for the ranges property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRanges(@jakarta.annotation.Nullable final java.util.List<BucketAggregationRange> value) {
        this.ranges = value;
    }
    /**
     * Sets the sortBy property value. The sortBy property
     * @param value Value to set for the sortBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSortBy(@jakarta.annotation.Nullable final BucketAggregationSortProperty value) {
        this.sortBy = value;
    }
}
