package com.microsoft.graph.devicemanagement.reports.getcachedreport;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GetCachedReportPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The groupBy property
     */
    private java.util.List<String> groupBy;
    /**
     * The id property
     */
    private String id;
    /**
     * The orderBy property
     */
    private java.util.List<String> orderBy;
    /**
     * The search property
     */
    private String search;
    /**
     * The select property
     */
    private java.util.List<String> select;
    /**
     * The skip property
     */
    private Integer skip;
    /**
     * The top property
     */
    private Integer top;
    /**
     * Instantiates a new getCachedReportPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public GetCachedReportPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getCachedReportPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static GetCachedReportPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetCachedReportPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("groupBy", (n) -> { this.setGroupBy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("orderBy", (n) -> { this.setOrderBy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("search", (n) -> { this.setSearch(n.getStringValue()); });
        deserializerMap.put("select", (n) -> { this.setSelect(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("skip", (n) -> { this.setSkip(n.getIntegerValue()); });
        deserializerMap.put("top", (n) -> { this.setTop(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupBy property value. The groupBy property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the orderBy property value. The orderBy property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOrderBy() {
        return this.orderBy;
    }
    /**
     * Gets the search property value. The search property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSearch() {
        return this.search;
    }
    /**
     * Gets the select property value. The select property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSelect() {
        return this.select;
    }
    /**
     * Gets the skip property value. The skip property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSkip() {
        return this.skip;
    }
    /**
     * Gets the top property value. The top property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTop() {
        return this.top;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("groupBy", this.getGroupBy());
        writer.writeStringValue("id", this.getId());
        writer.writeCollectionOfPrimitiveValues("orderBy", this.getOrderBy());
        writer.writeStringValue("search", this.getSearch());
        writer.writeCollectionOfPrimitiveValues("select", this.getSelect());
        writer.writeIntegerValue("skip", this.getSkip());
        writer.writeIntegerValue("top", this.getTop());
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
     * Sets the groupBy property value. The groupBy property
     * @param value Value to set for the groupBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGroupBy(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.groupBy = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the orderBy property value. The orderBy property
     * @param value Value to set for the orderBy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOrderBy(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.orderBy = value;
    }
    /**
     * Sets the search property value. The search property
     * @param value Value to set for the search property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSearch(@jakarta.annotation.Nullable final String value) {
        this.search = value;
    }
    /**
     * Sets the select property value. The select property
     * @param value Value to set for the select property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSelect(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.select = value;
    }
    /**
     * Sets the skip property value. The skip property
     * @param value Value to set for the skip property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSkip(@jakarta.annotation.Nullable final Integer value) {
        this.skip = value;
    }
    /**
     * Sets the top property value. The top property
     * @param value Value to set for the top property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTop(@jakarta.annotation.Nullable final Integer value) {
        this.top = value;
    }
}
