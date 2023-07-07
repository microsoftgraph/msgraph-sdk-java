package com.microsoft.graph.devicemanagement.reports.getpolicynoncompliancesummaryreport;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GetPolicyNonComplianceSummaryReportPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The filter property
     */
    private String filter;
    /**
     * The groupBy property
     */
    private java.util.List<String> groupBy;
    /**
     * The name property
     */
    private String name;
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
     * The sessionId property
     */
    private String sessionId;
    /**
     * The skip property
     */
    private Integer skip;
    /**
     * The top property
     */
    private Integer top;
    /**
     * Instantiates a new getPolicyNonComplianceSummaryReportPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GetPolicyNonComplianceSummaryReportPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getPolicyNonComplianceSummaryReportPostRequestBody
     */
    @javax.annotation.Nonnull
    public static GetPolicyNonComplianceSummaryReportPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetPolicyNonComplianceSummaryReportPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("filter", (n) -> { this.setFilter(n.getStringValue()); });
        deserializerMap.put("groupBy", (n) -> { this.setGroupBy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("orderBy", (n) -> { this.setOrderBy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("search", (n) -> { this.setSearch(n.getStringValue()); });
        deserializerMap.put("select", (n) -> { this.setSelect(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sessionId", (n) -> { this.setSessionId(n.getStringValue()); });
        deserializerMap.put("skip", (n) -> { this.setSkip(n.getIntegerValue()); });
        deserializerMap.put("top", (n) -> { this.setTop(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filter property value. The filter property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilter() {
        return this.filter;
    }
    /**
     * Gets the groupBy property value. The groupBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the orderBy property value. The orderBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOrderBy() {
        return this.orderBy;
    }
    /**
     * Gets the search property value. The search property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSearch() {
        return this.search;
    }
    /**
     * Gets the select property value. The select property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSelect() {
        return this.select;
    }
    /**
     * Gets the sessionId property value. The sessionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSessionId() {
        return this.sessionId;
    }
    /**
     * Gets the skip property value. The skip property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSkip() {
        return this.skip;
    }
    /**
     * Gets the top property value. The top property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTop() {
        return this.top;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("filter", this.getFilter());
        writer.writeCollectionOfPrimitiveValues("groupBy", this.getGroupBy());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("orderBy", this.getOrderBy());
        writer.writeStringValue("search", this.getSearch());
        writer.writeCollectionOfPrimitiveValues("select", this.getSelect());
        writer.writeStringValue("sessionId", this.getSessionId());
        writer.writeIntegerValue("skip", this.getSkip());
        writer.writeIntegerValue("top", this.getTop());
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
     * Sets the filter property value. The filter property
     * @param value Value to set for the filter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilter(@javax.annotation.Nullable final String value) {
        this.filter = value;
    }
    /**
     * Sets the groupBy property value. The groupBy property
     * @param value Value to set for the groupBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupBy(@javax.annotation.Nullable final java.util.List<String> value) {
        this.groupBy = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the orderBy property value. The orderBy property
     * @param value Value to set for the orderBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrderBy(@javax.annotation.Nullable final java.util.List<String> value) {
        this.orderBy = value;
    }
    /**
     * Sets the search property value. The search property
     * @param value Value to set for the search property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearch(@javax.annotation.Nullable final String value) {
        this.search = value;
    }
    /**
     * Sets the select property value. The select property
     * @param value Value to set for the select property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSelect(@javax.annotation.Nullable final java.util.List<String> value) {
        this.select = value;
    }
    /**
     * Sets the sessionId property value. The sessionId property
     * @param value Value to set for the sessionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSessionId(@javax.annotation.Nullable final String value) {
        this.sessionId = value;
    }
    /**
     * Sets the skip property value. The skip property
     * @param value Value to set for the skip property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkip(@javax.annotation.Nullable final Integer value) {
        this.skip = value;
    }
    /**
     * Sets the top property value. The top property
     * @param value Value to set for the top property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTop(@javax.annotation.Nullable final Integer value) {
        this.top = value;
    }
}
