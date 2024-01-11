package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SearchRequest implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new SearchRequest and sets the default values.
     */
    public SearchRequest() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SearchRequest
     */
    @jakarta.annotation.Nonnull
    public static SearchRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchRequest();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the aggregationFilters property value. Contains one or more filters to obtain search results aggregated and filtered to a specific value of a field. Optional.Build this filter based on a prior search that aggregates by the same field. From the response of the prior search, identify the searchBucket that filters results to the specific value of the field, use the string in its aggregationFilterToken property, and build an aggregation filter string in the format '{field}:/'{aggregationFilterToken}/''. If multiple values for the same field need to be provided, use the strings in its aggregationFilterToken property and build an aggregation filter string in the format '{field}:or(/'{aggregationFilterToken1}/',/'{aggregationFilterToken2}/')'. For example, searching and aggregating drive items by file type returns a searchBucket for the file type docx in the response. You can conveniently use the aggregationFilterToken returned for this searchBucket in a subsequent search query and filter matches down to drive items of the docx file type. Example 1 and example 2 show the actual requests and responses.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAggregationFilters() {
        return this.backingStore.get("aggregationFilters");
    }
    /**
     * Gets the aggregations property value. Specifies aggregations (also known as refiners) to be returned alongside search results. Optional.
     * @return a java.util.List<AggregationOption>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AggregationOption> getAggregations() {
        return this.backingStore.get("aggregations");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the collapseProperties property value. Contains the ordered collection of fields and limit to collapse results. Optional.
     * @return a java.util.List<CollapseProperty>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CollapseProperty> getCollapseProperties() {
        return this.backingStore.get("collapseProperties");
    }
    /**
     * Gets the contentSources property value. Contains the connection to be targeted.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getContentSources() {
        return this.backingStore.get("contentSources");
    }
    /**
     * Gets the enableTopResults property value. This triggers hybrid sort for messages : the first 3 messages are the most relevant. This property is only applicable to entityType=message. Optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableTopResults() {
        return this.backingStore.get("enableTopResults");
    }
    /**
     * Gets the entityTypes property value. One or more types of resources expected in the response. Possible values are: event, message, driveItem, externalItem, site, list, listItem, drive, chatMessage, person, acronym, bookmark.  Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: chatMessage, person, acronym, bookmark. See known limitations for those combinations of two or more entity types that are supported in the same search request. Required.
     * @return a java.util.List<EntityType>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EntityType> getEntityTypes() {
        return this.backingStore.get("entityTypes");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("aggregationFilters", (n) -> { this.setAggregationFilters(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("aggregations", (n) -> { this.setAggregations(n.getCollectionOfObjectValues(AggregationOption::createFromDiscriminatorValue)); });
        deserializerMap.put("collapseProperties", (n) -> { this.setCollapseProperties(n.getCollectionOfObjectValues(CollapseProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("contentSources", (n) -> { this.setContentSources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enableTopResults", (n) -> { this.setEnableTopResults(n.getBooleanValue()); });
        deserializerMap.put("entityTypes", (n) -> { this.setEntityTypes(n.getCollectionOfEnumValues(EntityType::forValue)); });
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
     * Gets the fields property value. Contains the fields to be returned for each resource object specified in entityTypes, allowing customization of the fields returned by default; otherwise, including additional fields such as custom managed properties from SharePoint and OneDrive, or custom fields in externalItem from the content that Microsoft Graph connectors bring in. The fields property can use the semantic labels applied to properties. For example, if a property is labeled as title, you can retrieve it using the following syntax: label_title. Optional.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFields() {
        return this.backingStore.get("fields");
    }
    /**
     * Gets the from property value. Specifies the offset for the search results. Offset 0 returns the very first result. Optional.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFrom() {
        return this.backingStore.get("from");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the query property value. The query property
     * @return a SearchQuery
     */
    @jakarta.annotation.Nullable
    public SearchQuery getQuery() {
        return this.backingStore.get("query");
    }
    /**
     * Gets the queryAlterationOptions property value. Query alteration options formatted in a JSON blob that contains two optional flags related to spelling correction. Optional.
     * @return a SearchAlterationOptions
     */
    @jakarta.annotation.Nullable
    public SearchAlterationOptions getQueryAlterationOptions() {
        return this.backingStore.get("queryAlterationOptions");
    }
    /**
     * Gets the region property value. The geographic location for the search. Required for searches that use application permissions. For details, see Get the region value.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.backingStore.get("region");
    }
    /**
     * Gets the resultTemplateOptions property value. Provides the search result template options to render search results from connectors.
     * @return a ResultTemplateOption
     */
    @jakarta.annotation.Nullable
    public ResultTemplateOption getResultTemplateOptions() {
        return this.backingStore.get("resultTemplateOptions");
    }
    /**
     * Gets the sharePointOneDriveOptions property value. Indicates the kind of contents to be searched when a search is performed using application permissions. Optional.
     * @return a SharePointOneDriveOptions
     */
    @jakarta.annotation.Nullable
    public SharePointOneDriveOptions getSharePointOneDriveOptions() {
        return this.backingStore.get("sharePointOneDriveOptions");
    }
    /**
     * Gets the size property value. The size of the page to be retrieved. The maximum value is 500. Optional.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Gets the sortProperties property value. Contains the ordered collection of fields and direction to sort results. There can be at most 5 sort properties in the collection. Optional.
     * @return a java.util.List<SortProperty>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SortProperty> getSortProperties() {
        return this.backingStore.get("sortProperties");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the aggregationFilters property value. Contains one or more filters to obtain search results aggregated and filtered to a specific value of a field. Optional.Build this filter based on a prior search that aggregates by the same field. From the response of the prior search, identify the searchBucket that filters results to the specific value of the field, use the string in its aggregationFilterToken property, and build an aggregation filter string in the format '{field}:/'{aggregationFilterToken}/''. If multiple values for the same field need to be provided, use the strings in its aggregationFilterToken property and build an aggregation filter string in the format '{field}:or(/'{aggregationFilterToken1}/',/'{aggregationFilterToken2}/')'. For example, searching and aggregating drive items by file type returns a searchBucket for the file type docx in the response. You can conveniently use the aggregationFilterToken returned for this searchBucket in a subsequent search query and filter matches down to drive items of the docx file type. Example 1 and example 2 show the actual requests and responses.
     * @param value Value to set for the aggregationFilters property.
     */
    public void setAggregationFilters(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("aggregationFilters", value);
    }
    /**
     * Sets the aggregations property value. Specifies aggregations (also known as refiners) to be returned alongside search results. Optional.
     * @param value Value to set for the aggregations property.
     */
    public void setAggregations(@jakarta.annotation.Nullable final java.util.List<AggregationOption> value) {
        this.backingStore.set("aggregations", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the collapseProperties property value. Contains the ordered collection of fields and limit to collapse results. Optional.
     * @param value Value to set for the collapseProperties property.
     */
    public void setCollapseProperties(@jakarta.annotation.Nullable final java.util.List<CollapseProperty> value) {
        this.backingStore.set("collapseProperties", value);
    }
    /**
     * Sets the contentSources property value. Contains the connection to be targeted.
     * @param value Value to set for the contentSources property.
     */
    public void setContentSources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("contentSources", value);
    }
    /**
     * Sets the enableTopResults property value. This triggers hybrid sort for messages : the first 3 messages are the most relevant. This property is only applicable to entityType=message. Optional.
     * @param value Value to set for the enableTopResults property.
     */
    public void setEnableTopResults(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableTopResults", value);
    }
    /**
     * Sets the entityTypes property value. One or more types of resources expected in the response. Possible values are: event, message, driveItem, externalItem, site, list, listItem, drive, chatMessage, person, acronym, bookmark.  Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: chatMessage, person, acronym, bookmark. See known limitations for those combinations of two or more entity types that are supported in the same search request. Required.
     * @param value Value to set for the entityTypes property.
     */
    public void setEntityTypes(@jakarta.annotation.Nullable final java.util.List<EntityType> value) {
        this.backingStore.set("entityTypes", value);
    }
    /**
     * Sets the fields property value. Contains the fields to be returned for each resource object specified in entityTypes, allowing customization of the fields returned by default; otherwise, including additional fields such as custom managed properties from SharePoint and OneDrive, or custom fields in externalItem from the content that Microsoft Graph connectors bring in. The fields property can use the semantic labels applied to properties. For example, if a property is labeled as title, you can retrieve it using the following syntax: label_title. Optional.
     * @param value Value to set for the fields property.
     */
    public void setFields(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("fields", value);
    }
    /**
     * Sets the from property value. Specifies the offset for the search results. Offset 0 returns the very first result. Optional.
     * @param value Value to set for the from property.
     */
    public void setFrom(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("from", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the query property value. The query property
     * @param value Value to set for the query property.
     */
    public void setQuery(@jakarta.annotation.Nullable final SearchQuery value) {
        this.backingStore.set("query", value);
    }
    /**
     * Sets the queryAlterationOptions property value. Query alteration options formatted in a JSON blob that contains two optional flags related to spelling correction. Optional.
     * @param value Value to set for the queryAlterationOptions property.
     */
    public void setQueryAlterationOptions(@jakarta.annotation.Nullable final SearchAlterationOptions value) {
        this.backingStore.set("queryAlterationOptions", value);
    }
    /**
     * Sets the region property value. The geographic location for the search. Required for searches that use application permissions. For details, see Get the region value.
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("region", value);
    }
    /**
     * Sets the resultTemplateOptions property value. Provides the search result template options to render search results from connectors.
     * @param value Value to set for the resultTemplateOptions property.
     */
    public void setResultTemplateOptions(@jakarta.annotation.Nullable final ResultTemplateOption value) {
        this.backingStore.set("resultTemplateOptions", value);
    }
    /**
     * Sets the sharePointOneDriveOptions property value. Indicates the kind of contents to be searched when a search is performed using application permissions. Optional.
     * @param value Value to set for the sharePointOneDriveOptions property.
     */
    public void setSharePointOneDriveOptions(@jakarta.annotation.Nullable final SharePointOneDriveOptions value) {
        this.backingStore.set("sharePointOneDriveOptions", value);
    }
    /**
     * Sets the size property value. The size of the page to be retrieved. The maximum value is 500. Optional.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("size", value);
    }
    /**
     * Sets the sortProperties property value. Contains the ordered collection of fields and direction to sort results. There can be at most 5 sort properties in the collection. Optional.
     * @param value Value to set for the sortProperties property.
     */
    public void setSortProperties(@jakarta.annotation.Nullable final java.util.List<SortProperty> value) {
        this.backingStore.set("sortProperties", value);
    }
}
