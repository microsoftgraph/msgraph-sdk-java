package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The aggregationFilters property
     */
    private java.util.List<String> aggregationFilters;
    /**
     * The aggregations property
     */
    private java.util.List<AggregationOption> aggregations;
    /**
     * The collapseProperties property
     */
    private java.util.List<CollapseProperty> collapseProperties;
    /**
     * The contentSources property
     */
    private java.util.List<String> contentSources;
    /**
     * The enableTopResults property
     */
    private Boolean enableTopResults;
    /**
     * The entityTypes property
     */
    private java.util.List<EntityType> entityTypes;
    /**
     * The fields property
     */
    private java.util.List<String> fields;
    /**
     * The from property
     */
    private Integer from;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The query property
     */
    private SearchQuery query;
    /**
     * The queryAlterationOptions property
     */
    private SearchAlterationOptions queryAlterationOptions;
    /**
     * The region property
     */
    private String region;
    /**
     * The resultTemplateOptions property
     */
    private ResultTemplateOption resultTemplateOptions;
    /**
     * The sharePointOneDriveOptions property
     */
    private SharePointOneDriveOptions sharePointOneDriveOptions;
    /**
     * The size property
     */
    private Integer size;
    /**
     * The sortProperties property
     */
    private java.util.List<SortProperty> sortProperties;
    /**
     * Instantiates a new SearchRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SearchRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SearchRequest
     */
    @javax.annotation.Nonnull
    public static SearchRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchRequest();
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
     * Gets the aggregationFilters property value. The aggregationFilters property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAggregationFilters() {
        return this.aggregationFilters;
    }
    /**
     * Gets the aggregations property value. The aggregations property
     * @return a aggregationOption
     */
    @javax.annotation.Nullable
    public java.util.List<AggregationOption> getAggregations() {
        return this.aggregations;
    }
    /**
     * Gets the collapseProperties property value. The collapseProperties property
     * @return a collapseProperty
     */
    @javax.annotation.Nullable
    public java.util.List<CollapseProperty> getCollapseProperties() {
        return this.collapseProperties;
    }
    /**
     * Gets the contentSources property value. The contentSources property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getContentSources() {
        return this.contentSources;
    }
    /**
     * Gets the enableTopResults property value. The enableTopResults property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableTopResults() {
        return this.enableTopResults;
    }
    /**
     * Gets the entityTypes property value. The entityTypes property
     * @return a entityType
     */
    @javax.annotation.Nullable
    public java.util.List<EntityType> getEntityTypes() {
        return this.entityTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("aggregationFilters", (n) -> { this.setAggregationFilters(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("aggregations", (n) -> { this.setAggregations(n.getCollectionOfObjectValues(AggregationOption::createFromDiscriminatorValue)); });
        deserializerMap.put("collapseProperties", (n) -> { this.setCollapseProperties(n.getCollectionOfObjectValues(CollapseProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("contentSources", (n) -> { this.setContentSources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enableTopResults", (n) -> { this.setEnableTopResults(n.getBooleanValue()); });
        deserializerMap.put("entityTypes", (n) -> { this.setEntityTypes(n.getCollectionOfEnumValues(EntityType.class)); });
        deserializerMap.put("fields", (n) -> { this.setFields(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("from", (n) -> { this.setFrom(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("query", (n) -> { this.setQuery(n.getObjectValue(SearchQuery::createFromDiscriminatorValue)); });
        deserializerMap.put("queryAlterationOptions", (n) -> { this.setQueryAlterationOptions(n.getObjectValue(SearchAlterationOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("resultTemplateOptions", (n) -> { this.setResultTemplateOptions(n.getObjectValue(ResultTemplateOption::createFromDiscriminatorValue)); });
        deserializerMap.put("sharePointOneDriveOptions", (n) -> { this.setSharePointOneDriveOptions(n.getObjectValue(SharePointOneDriveOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getIntegerValue()); });
        deserializerMap.put("sortProperties", (n) -> { this.setSortProperties(n.getCollectionOfObjectValues(SortProperty::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fields property value. The fields property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFields() {
        return this.fields;
    }
    /**
     * Gets the from property value. The from property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFrom() {
        return this.from;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the query property value. The query property
     * @return a SearchQuery
     */
    @javax.annotation.Nullable
    public SearchQuery getQuery() {
        return this.query;
    }
    /**
     * Gets the queryAlterationOptions property value. The queryAlterationOptions property
     * @return a searchAlterationOptions
     */
    @javax.annotation.Nullable
    public SearchAlterationOptions getQueryAlterationOptions() {
        return this.queryAlterationOptions;
    }
    /**
     * Gets the region property value. The region property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Gets the resultTemplateOptions property value. The resultTemplateOptions property
     * @return a resultTemplateOption
     */
    @javax.annotation.Nullable
    public ResultTemplateOption getResultTemplateOptions() {
        return this.resultTemplateOptions;
    }
    /**
     * Gets the sharePointOneDriveOptions property value. The sharePointOneDriveOptions property
     * @return a sharePointOneDriveOptions
     */
    @javax.annotation.Nullable
    public SharePointOneDriveOptions getSharePointOneDriveOptions() {
        return this.sharePointOneDriveOptions;
    }
    /**
     * Gets the size property value. The size property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSize() {
        return this.size;
    }
    /**
     * Gets the sortProperties property value. The sortProperties property
     * @return a sortProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SortProperty> getSortProperties() {
        return this.sortProperties;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("aggregationFilters", this.getAggregationFilters());
        writer.writeCollectionOfObjectValues("aggregations", this.getAggregations());
        writer.writeCollectionOfObjectValues("collapseProperties", this.getCollapseProperties());
        writer.writeCollectionOfPrimitiveValues("contentSources", this.getContentSources());
        writer.writeBooleanValue("enableTopResults", this.getEnableTopResults());
        writer.writeCollectionOfEnumValues("entityTypes", this.getEntityTypes());
        writer.writeCollectionOfPrimitiveValues("fields", this.getFields());
        writer.writeIntegerValue("from", this.getFrom());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("query", this.getQuery());
        writer.writeObjectValue("queryAlterationOptions", this.getQueryAlterationOptions());
        writer.writeStringValue("region", this.getRegion());
        writer.writeObjectValue("resultTemplateOptions", this.getResultTemplateOptions());
        writer.writeObjectValue("sharePointOneDriveOptions", this.getSharePointOneDriveOptions());
        writer.writeIntegerValue("size", this.getSize());
        writer.writeCollectionOfObjectValues("sortProperties", this.getSortProperties());
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
     * Sets the aggregationFilters property value. The aggregationFilters property
     * @param value Value to set for the aggregationFilters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAggregationFilters(@javax.annotation.Nullable final java.util.List<String> value) {
        this.aggregationFilters = value;
    }
    /**
     * Sets the aggregations property value. The aggregations property
     * @param value Value to set for the aggregations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAggregations(@javax.annotation.Nullable final java.util.List<AggregationOption> value) {
        this.aggregations = value;
    }
    /**
     * Sets the collapseProperties property value. The collapseProperties property
     * @param value Value to set for the collapseProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCollapseProperties(@javax.annotation.Nullable final java.util.List<CollapseProperty> value) {
        this.collapseProperties = value;
    }
    /**
     * Sets the contentSources property value. The contentSources property
     * @param value Value to set for the contentSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentSources(@javax.annotation.Nullable final java.util.List<String> value) {
        this.contentSources = value;
    }
    /**
     * Sets the enableTopResults property value. The enableTopResults property
     * @param value Value to set for the enableTopResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableTopResults(@javax.annotation.Nullable final Boolean value) {
        this.enableTopResults = value;
    }
    /**
     * Sets the entityTypes property value. The entityTypes property
     * @param value Value to set for the entityTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEntityTypes(@javax.annotation.Nullable final java.util.List<EntityType> value) {
        this.entityTypes = value;
    }
    /**
     * Sets the fields property value. The fields property
     * @param value Value to set for the fields property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFields(@javax.annotation.Nullable final java.util.List<String> value) {
        this.fields = value;
    }
    /**
     * Sets the from property value. The from property
     * @param value Value to set for the from property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFrom(@javax.annotation.Nullable final Integer value) {
        this.from = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the query property value. The query property
     * @param value Value to set for the query property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuery(@javax.annotation.Nullable final SearchQuery value) {
        this.query = value;
    }
    /**
     * Sets the queryAlterationOptions property value. The queryAlterationOptions property
     * @param value Value to set for the queryAlterationOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryAlterationOptions(@javax.annotation.Nullable final SearchAlterationOptions value) {
        this.queryAlterationOptions = value;
    }
    /**
     * Sets the region property value. The region property
     * @param value Value to set for the region property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegion(@javax.annotation.Nullable final String value) {
        this.region = value;
    }
    /**
     * Sets the resultTemplateOptions property value. The resultTemplateOptions property
     * @param value Value to set for the resultTemplateOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResultTemplateOptions(@javax.annotation.Nullable final ResultTemplateOption value) {
        this.resultTemplateOptions = value;
    }
    /**
     * Sets the sharePointOneDriveOptions property value. The sharePointOneDriveOptions property
     * @param value Value to set for the sharePointOneDriveOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharePointOneDriveOptions(@javax.annotation.Nullable final SharePointOneDriveOptions value) {
        this.sharePointOneDriveOptions = value;
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Integer value) {
        this.size = value;
    }
    /**
     * Sets the sortProperties property value. The sortProperties property
     * @param value Value to set for the sortProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSortProperties(@javax.annotation.Nullable final java.util.List<SortProperty> value) {
        this.sortProperties = value;
    }
}
