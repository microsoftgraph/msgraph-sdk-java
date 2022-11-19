package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SubjectRightsRequestDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Count of items that are excluded from the request. */
    private Long _excludedItemCount;
    /** Count of items per insight. */
    private java.util.List<KeyValuePair> _insightCounts;
    /** Count of items found. */
    private Long _itemCount;
    /** Count of item that need review. */
    private Long _itemNeedReview;
    /** The OdataType property */
    private String _odataType;
    /** Count of items per product, such as Exchange, SharePoint, OneDrive, and Teams. */
    private java.util.List<KeyValuePair> _productItemCounts;
    /** Count of items signed off by the administrator. */
    private Long _signedOffItemCount;
    /** Total item size in bytes. */
    private Long _totalItemSize;
    /**
     * Instantiates a new subjectRightsRequestDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SubjectRightsRequestDetail() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.subjectRightsRequestDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a subjectRightsRequestDetail
     */
    @javax.annotation.Nonnull
    public static SubjectRightsRequestDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubjectRightsRequestDetail();
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
     * Gets the excludedItemCount property value. Count of items that are excluded from the request.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getExcludedItemCount() {
        return this._excludedItemCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SubjectRightsRequestDetail currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(8);
        deserializerMap.put("excludedItemCount", (n) -> { currentObject.setExcludedItemCount(n.getLongValue()); });
        deserializerMap.put("insightCounts", (n) -> { currentObject.setInsightCounts(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("itemCount", (n) -> { currentObject.setItemCount(n.getLongValue()); });
        deserializerMap.put("itemNeedReview", (n) -> { currentObject.setItemNeedReview(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("productItemCounts", (n) -> { currentObject.setProductItemCounts(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("signedOffItemCount", (n) -> { currentObject.setSignedOffItemCount(n.getLongValue()); });
        deserializerMap.put("totalItemSize", (n) -> { currentObject.setTotalItemSize(n.getLongValue()); });
        return deserializerMap
    }
    /**
     * Gets the insightCounts property value. Count of items per insight.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getInsightCounts() {
        return this._insightCounts;
    }
    /**
     * Gets the itemCount property value. Count of items found.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getItemCount() {
        return this._itemCount;
    }
    /**
     * Gets the itemNeedReview property value. Count of item that need review.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getItemNeedReview() {
        return this._itemNeedReview;
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
     * Gets the productItemCounts property value. Count of items per product, such as Exchange, SharePoint, OneDrive, and Teams.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getProductItemCounts() {
        return this._productItemCounts;
    }
    /**
     * Gets the signedOffItemCount property value. Count of items signed off by the administrator.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSignedOffItemCount() {
        return this._signedOffItemCount;
    }
    /**
     * Gets the totalItemSize property value. Total item size in bytes.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalItemSize() {
        return this._totalItemSize;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the excludedItemCount property value. Count of items that are excluded from the request.
     * @param value Value to set for the excludedItemCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludedItemCount(@javax.annotation.Nullable final Long value) {
        this._excludedItemCount = value;
    }
    /**
     * Sets the insightCounts property value. Count of items per insight.
     * @param value Value to set for the insightCounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInsightCounts(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._insightCounts = value;
    }
    /**
     * Sets the itemCount property value. Count of items found.
     * @param value Value to set for the itemCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemCount(@javax.annotation.Nullable final Long value) {
        this._itemCount = value;
    }
    /**
     * Sets the itemNeedReview property value. Count of item that need review.
     * @param value Value to set for the itemNeedReview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemNeedReview(@javax.annotation.Nullable final Long value) {
        this._itemNeedReview = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the productItemCounts property value. Count of items per product, such as Exchange, SharePoint, OneDrive, and Teams.
     * @param value Value to set for the productItemCounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductItemCounts(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._productItemCounts = value;
    }
    /**
     * Sets the signedOffItemCount property value. Count of items signed off by the administrator.
     * @param value Value to set for the signedOffItemCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignedOffItemCount(@javax.annotation.Nullable final Long value) {
        this._signedOffItemCount = value;
    }
    /**
     * Sets the totalItemSize property value. Total item size in bytes.
     * @param value Value to set for the totalItemSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalItemSize(@javax.annotation.Nullable final Long value) {
        this._totalItemSize = value;
    }
}
