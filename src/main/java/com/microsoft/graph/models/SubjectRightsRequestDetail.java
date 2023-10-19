package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubjectRightsRequestDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Count of items that are excluded from the request.
     */
    private Long excludedItemCount;
    /**
     * Count of items per insight.
     */
    private java.util.List<KeyValuePair> insightCounts;
    /**
     * Count of items found.
     */
    private Long itemCount;
    /**
     * Count of item that need review.
     */
    private Long itemNeedReview;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Count of items per product, such as Exchange, SharePoint, OneDrive, and Teams.
     */
    private java.util.List<KeyValuePair> productItemCounts;
    /**
     * Count of items signed off by the administrator.
     */
    private Long signedOffItemCount;
    /**
     * Total item size in bytes.
     */
    private Long totalItemSize;
    /**
     * Instantiates a new SubjectRightsRequestDetail and sets the default values.
     */
    public SubjectRightsRequestDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubjectRightsRequestDetail
     */
    @jakarta.annotation.Nonnull
    public static SubjectRightsRequestDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubjectRightsRequestDetail();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the excludedItemCount property value. Count of items that are excluded from the request.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getExcludedItemCount() {
        return this.excludedItemCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("excludedItemCount", (n) -> { this.setExcludedItemCount(n.getLongValue()); });
        deserializerMap.put("insightCounts", (n) -> { this.setInsightCounts(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("itemCount", (n) -> { this.setItemCount(n.getLongValue()); });
        deserializerMap.put("itemNeedReview", (n) -> { this.setItemNeedReview(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("productItemCounts", (n) -> { this.setProductItemCounts(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("signedOffItemCount", (n) -> { this.setSignedOffItemCount(n.getLongValue()); });
        deserializerMap.put("totalItemSize", (n) -> { this.setTotalItemSize(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the insightCounts property value. Count of items per insight.
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getInsightCounts() {
        return this.insightCounts;
    }
    /**
     * Gets the itemCount property value. Count of items found.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getItemCount() {
        return this.itemCount;
    }
    /**
     * Gets the itemNeedReview property value. Count of item that need review.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getItemNeedReview() {
        return this.itemNeedReview;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the productItemCounts property value. Count of items per product, such as Exchange, SharePoint, OneDrive, and Teams.
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getProductItemCounts() {
        return this.productItemCounts;
    }
    /**
     * Gets the signedOffItemCount property value. Count of items signed off by the administrator.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSignedOffItemCount() {
        return this.signedOffItemCount;
    }
    /**
     * Gets the totalItemSize property value. Total item size in bytes.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTotalItemSize() {
        return this.totalItemSize;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("excludedItemCount", this.getExcludedItemCount());
        writer.writeCollectionOfObjectValues("insightCounts", this.getInsightCounts());
        writer.writeLongValue("itemCount", this.getItemCount());
        writer.writeLongValue("itemNeedReview", this.getItemNeedReview());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("productItemCounts", this.getProductItemCounts());
        writer.writeLongValue("signedOffItemCount", this.getSignedOffItemCount());
        writer.writeLongValue("totalItemSize", this.getTotalItemSize());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the excludedItemCount property value. Count of items that are excluded from the request.
     * @param value Value to set for the excludedItemCount property.
     */
    public void setExcludedItemCount(@jakarta.annotation.Nullable final Long value) {
        this.excludedItemCount = value;
    }
    /**
     * Sets the insightCounts property value. Count of items per insight.
     * @param value Value to set for the insightCounts property.
     */
    public void setInsightCounts(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.insightCounts = value;
    }
    /**
     * Sets the itemCount property value. Count of items found.
     * @param value Value to set for the itemCount property.
     */
    public void setItemCount(@jakarta.annotation.Nullable final Long value) {
        this.itemCount = value;
    }
    /**
     * Sets the itemNeedReview property value. Count of item that need review.
     * @param value Value to set for the itemNeedReview property.
     */
    public void setItemNeedReview(@jakarta.annotation.Nullable final Long value) {
        this.itemNeedReview = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the productItemCounts property value. Count of items per product, such as Exchange, SharePoint, OneDrive, and Teams.
     * @param value Value to set for the productItemCounts property.
     */
    public void setProductItemCounts(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.productItemCounts = value;
    }
    /**
     * Sets the signedOffItemCount property value. Count of items signed off by the administrator.
     * @param value Value to set for the signedOffItemCount property.
     */
    public void setSignedOffItemCount(@jakarta.annotation.Nullable final Long value) {
        this.signedOffItemCount = value;
    }
    /**
     * Sets the totalItemSize property value. Total item size in bytes.
     * @param value Value to set for the totalItemSize property.
     */
    public void setTotalItemSize(@jakarta.annotation.Nullable final Long value) {
        this.totalItemSize = value;
    }
}
