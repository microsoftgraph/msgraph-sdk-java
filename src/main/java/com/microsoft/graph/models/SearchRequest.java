package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The aggregationFilters property */
    private java.util.List<String> _aggregationFilters;
    /** The aggregations property */
    private java.util.List<AggregationOption> _aggregations;
    /** The contentSources property */
    private java.util.List<String> _contentSources;
    /** The enableTopResults property */
    private Boolean _enableTopResults;
    /** The entityTypes property */
    private java.util.List<String> _entityTypes;
    /** The fields property */
    private java.util.List<String> _fields;
    /** The from property */
    private Integer _from;
    /** The OdataType property */
    private String _odataType;
    /** The query property */
    private SearchQuery _query;
    /** The queryAlterationOptions property */
    private SearchAlterationOptions _queryAlterationOptions;
    /** The resultTemplateOptions property */
    private ResultTemplateOption _resultTemplateOptions;
    /** The size property */
    private Integer _size;
    /** The sortProperties property */
    private java.util.List<SortProperty> _sortProperties;
    /**
     * Instantiates a new searchRequest and sets the default values.
     * @return a void
     */
    public SearchRequest() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.searchRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchRequest
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
        return this._additionalData;
    }
    /**
     * Gets the aggregationFilters property value. The aggregationFilters property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAggregationFilters() {
        return this._aggregationFilters;
    }
    /**
     * Gets the aggregations property value. The aggregations property
     * @return a aggregationOption
     */
    @javax.annotation.Nullable
    public java.util.List<AggregationOption> getAggregations() {
        return this._aggregations;
    }
    /**
     * Gets the contentSources property value. The contentSources property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getContentSources() {
        return this._contentSources;
    }
    /**
     * Gets the enableTopResults property value. The enableTopResults property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableTopResults() {
        return this._enableTopResults;
    }
    /**
     * Gets the entityTypes property value. The entityTypes property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEntityTypes() {
        return this._entityTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SearchRequest currentObject = this;
        return new HashMap<>(13) {{
            this.put("aggregationFilters", (n) -> { currentObject.setAggregationFilters(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("aggregations", (n) -> { currentObject.setAggregations(n.getCollectionOfObjectValues(AggregationOption::createFromDiscriminatorValue)); });
            this.put("contentSources", (n) -> { currentObject.setContentSources(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("enableTopResults", (n) -> { currentObject.setEnableTopResults(n.getBooleanValue()); });
            this.put("entityTypes", (n) -> { currentObject.setEntityTypes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("fields", (n) -> { currentObject.setFields(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("from", (n) -> { currentObject.setFrom(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("query", (n) -> { currentObject.setQuery(n.getObjectValue(SearchQuery::createFromDiscriminatorValue)); });
            this.put("queryAlterationOptions", (n) -> { currentObject.setQueryAlterationOptions(n.getObjectValue(SearchAlterationOptions::createFromDiscriminatorValue)); });
            this.put("resultTemplateOptions", (n) -> { currentObject.setResultTemplateOptions(n.getObjectValue(ResultTemplateOption::createFromDiscriminatorValue)); });
            this.put("size", (n) -> { currentObject.setSize(n.getIntegerValue()); });
            this.put("sortProperties", (n) -> { currentObject.setSortProperties(n.getCollectionOfObjectValues(SortProperty::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the fields property value. The fields property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFields() {
        return this._fields;
    }
    /**
     * Gets the from property value. The from property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFrom() {
        return this._from;
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
     * Gets the query property value. The query property
     * @return a searchQuery
     */
    @javax.annotation.Nullable
    public SearchQuery getQuery() {
        return this._query;
    }
    /**
     * Gets the queryAlterationOptions property value. The queryAlterationOptions property
     * @return a searchAlterationOptions
     */
    @javax.annotation.Nullable
    public SearchAlterationOptions getQueryAlterationOptions() {
        return this._queryAlterationOptions;
    }
    /**
     * Gets the resultTemplateOptions property value. The resultTemplateOptions property
     * @return a resultTemplateOption
     */
    @javax.annotation.Nullable
    public ResultTemplateOption getResultTemplateOptions() {
        return this._resultTemplateOptions;
    }
    /**
     * Gets the size property value. The size property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSize() {
        return this._size;
    }
    /**
     * Gets the sortProperties property value. The sortProperties property
     * @return a sortProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SortProperty> getSortProperties() {
        return this._sortProperties;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("aggregationFilters", this.getAggregationFilters());
        writer.writeCollectionOfObjectValues("aggregations", this.getAggregations());
        writer.writeCollectionOfPrimitiveValues("contentSources", this.getContentSources());
        writer.writeBooleanValue("enableTopResults", this.getEnableTopResults());
        writer.writeCollectionOfPrimitiveValues("entityTypes", this.getEntityTypes());
        writer.writeCollectionOfPrimitiveValues("fields", this.getFields());
        writer.writeIntegerValue("from", this.getFrom());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("query", this.getQuery());
        writer.writeObjectValue("queryAlterationOptions", this.getQueryAlterationOptions());
        writer.writeObjectValue("resultTemplateOptions", this.getResultTemplateOptions());
        writer.writeIntegerValue("size", this.getSize());
        writer.writeCollectionOfObjectValues("sortProperties", this.getSortProperties());
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
     * Sets the aggregationFilters property value. The aggregationFilters property
     * @param value Value to set for the aggregationFilters property.
     * @return a void
     */
    public void setAggregationFilters(@javax.annotation.Nullable final java.util.List<String> value) {
        this._aggregationFilters = value;
    }
    /**
     * Sets the aggregations property value. The aggregations property
     * @param value Value to set for the aggregations property.
     * @return a void
     */
    public void setAggregations(@javax.annotation.Nullable final java.util.List<AggregationOption> value) {
        this._aggregations = value;
    }
    /**
     * Sets the contentSources property value. The contentSources property
     * @param value Value to set for the contentSources property.
     * @return a void
     */
    public void setContentSources(@javax.annotation.Nullable final java.util.List<String> value) {
        this._contentSources = value;
    }
    /**
     * Sets the enableTopResults property value. The enableTopResults property
     * @param value Value to set for the enableTopResults property.
     * @return a void
     */
    public void setEnableTopResults(@javax.annotation.Nullable final Boolean value) {
        this._enableTopResults = value;
    }
    /**
     * Sets the entityTypes property value. The entityTypes property
     * @param value Value to set for the entityTypes property.
     * @return a void
     */
    public void setEntityTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._entityTypes = value;
    }
    /**
     * Sets the fields property value. The fields property
     * @param value Value to set for the fields property.
     * @return a void
     */
    public void setFields(@javax.annotation.Nullable final java.util.List<String> value) {
        this._fields = value;
    }
    /**
     * Sets the from property value. The from property
     * @param value Value to set for the from property.
     * @return a void
     */
    public void setFrom(@javax.annotation.Nullable final Integer value) {
        this._from = value;
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
     * Sets the query property value. The query property
     * @param value Value to set for the query property.
     * @return a void
     */
    public void setQuery(@javax.annotation.Nullable final SearchQuery value) {
        this._query = value;
    }
    /**
     * Sets the queryAlterationOptions property value. The queryAlterationOptions property
     * @param value Value to set for the queryAlterationOptions property.
     * @return a void
     */
    public void setQueryAlterationOptions(@javax.annotation.Nullable final SearchAlterationOptions value) {
        this._queryAlterationOptions = value;
    }
    /**
     * Sets the resultTemplateOptions property value. The resultTemplateOptions property
     * @param value Value to set for the resultTemplateOptions property.
     * @return a void
     */
    public void setResultTemplateOptions(@javax.annotation.Nullable final ResultTemplateOption value) {
        this._resultTemplateOptions = value;
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     * @return a void
     */
    public void setSize(@javax.annotation.Nullable final Integer value) {
        this._size = value;
    }
    /**
     * Sets the sortProperties property value. The sortProperties property
     * @param value Value to set for the sortProperties property.
     * @return a void
     */
    public void setSortProperties(@javax.annotation.Nullable final java.util.List<SortProperty> value) {
        this._sortProperties = value;
    }
}
