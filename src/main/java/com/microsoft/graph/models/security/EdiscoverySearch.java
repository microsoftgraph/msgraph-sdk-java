package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoverySearch extends Search implements Parsable {
    /** Adds an additional source to the eDiscovery search. */
    private java.util.List<DataSource> _additionalSources;
    /** Adds the results of the eDiscovery search to the specified reviewSet. */
    private EdiscoveryAddToReviewSetOperation _addToReviewSetOperation;
    /** Custodian sources that are included in the eDiscovery search. */
    private java.util.List<DataSource> _custodianSources;
    /** When specified, the collection will span across a service for an entire workload. Possible values are: none, allTenantMailboxes, allTenantSites, allCaseCustodians, allCaseNoncustodialDataSources. */
    private DataSourceScopes _dataSourceScopes;
    /** The last estimate operation associated with the eDiscovery search. */
    private EdiscoveryEstimateOperation _lastEstimateStatisticsOperation;
    /** noncustodialDataSource sources that are included in the eDiscovery search */
    private java.util.List<EdiscoveryNoncustodialDataSource> _noncustodialSources;
    /**
     * Instantiates a new EdiscoverySearch and sets the default values.
     * @return a void
     */
    public EdiscoverySearch() {
        super();
        this.setOdataType("#microsoft.graph.security.ediscoverySearch");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdiscoverySearch
     */
    @javax.annotation.Nonnull
    public static EdiscoverySearch createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoverySearch();
    }
    /**
     * Gets the additionalSources property value. Adds an additional source to the eDiscovery search.
     * @return a dataSource
     */
    @javax.annotation.Nullable
    public java.util.List<DataSource> getAdditionalSources() {
        return this._additionalSources;
    }
    /**
     * Gets the addToReviewSetOperation property value. Adds the results of the eDiscovery search to the specified reviewSet.
     * @return a ediscoveryAddToReviewSetOperation
     */
    @javax.annotation.Nullable
    public EdiscoveryAddToReviewSetOperation getAddToReviewSetOperation() {
        return this._addToReviewSetOperation;
    }
    /**
     * Gets the custodianSources property value. Custodian sources that are included in the eDiscovery search.
     * @return a dataSource
     */
    @javax.annotation.Nullable
    public java.util.List<DataSource> getCustodianSources() {
        return this._custodianSources;
    }
    /**
     * Gets the dataSourceScopes property value. When specified, the collection will span across a service for an entire workload. Possible values are: none, allTenantMailboxes, allTenantSites, allCaseCustodians, allCaseNoncustodialDataSources.
     * @return a dataSourceScopes
     */
    @javax.annotation.Nullable
    public DataSourceScopes getDataSourceScopes() {
        return this._dataSourceScopes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EdiscoverySearch currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("additionalSources", (n) -> { currentObject.setAdditionalSources(n.getCollectionOfObjectValues(DataSource::createFromDiscriminatorValue)); });
            this.put("addToReviewSetOperation", (n) -> { currentObject.setAddToReviewSetOperation(n.getObjectValue(EdiscoveryAddToReviewSetOperation::createFromDiscriminatorValue)); });
            this.put("custodianSources", (n) -> { currentObject.setCustodianSources(n.getCollectionOfObjectValues(DataSource::createFromDiscriminatorValue)); });
            this.put("dataSourceScopes", (n) -> { currentObject.setDataSourceScopes(n.getEnumValue(DataSourceScopes.class)); });
            this.put("lastEstimateStatisticsOperation", (n) -> { currentObject.setLastEstimateStatisticsOperation(n.getObjectValue(EdiscoveryEstimateOperation::createFromDiscriminatorValue)); });
            this.put("noncustodialSources", (n) -> { currentObject.setNoncustodialSources(n.getCollectionOfObjectValues(EdiscoveryNoncustodialDataSource::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastEstimateStatisticsOperation property value. The last estimate operation associated with the eDiscovery search.
     * @return a ediscoveryEstimateOperation
     */
    @javax.annotation.Nullable
    public EdiscoveryEstimateOperation getLastEstimateStatisticsOperation() {
        return this._lastEstimateStatisticsOperation;
    }
    /**
     * Gets the noncustodialSources property value. noncustodialDataSource sources that are included in the eDiscovery search
     * @return a ediscoveryNoncustodialDataSource
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryNoncustodialDataSource> getNoncustodialSources() {
        return this._noncustodialSources;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("additionalSources", this.getAdditionalSources());
        writer.writeObjectValue("addToReviewSetOperation", this.getAddToReviewSetOperation());
        writer.writeCollectionOfObjectValues("custodianSources", this.getCustodianSources());
        writer.writeEnumValue("dataSourceScopes", this.getDataSourceScopes());
        writer.writeObjectValue("lastEstimateStatisticsOperation", this.getLastEstimateStatisticsOperation());
        writer.writeCollectionOfObjectValues("noncustodialSources", this.getNoncustodialSources());
    }
    /**
     * Sets the additionalSources property value. Adds an additional source to the eDiscovery search.
     * @param value Value to set for the additionalSources property.
     * @return a void
     */
    public void setAdditionalSources(@javax.annotation.Nullable final java.util.List<DataSource> value) {
        this._additionalSources = value;
    }
    /**
     * Sets the addToReviewSetOperation property value. Adds the results of the eDiscovery search to the specified reviewSet.
     * @param value Value to set for the addToReviewSetOperation property.
     * @return a void
     */
    public void setAddToReviewSetOperation(@javax.annotation.Nullable final EdiscoveryAddToReviewSetOperation value) {
        this._addToReviewSetOperation = value;
    }
    /**
     * Sets the custodianSources property value. Custodian sources that are included in the eDiscovery search.
     * @param value Value to set for the custodianSources property.
     * @return a void
     */
    public void setCustodianSources(@javax.annotation.Nullable final java.util.List<DataSource> value) {
        this._custodianSources = value;
    }
    /**
     * Sets the dataSourceScopes property value. When specified, the collection will span across a service for an entire workload. Possible values are: none, allTenantMailboxes, allTenantSites, allCaseCustodians, allCaseNoncustodialDataSources.
     * @param value Value to set for the dataSourceScopes property.
     * @return a void
     */
    public void setDataSourceScopes(@javax.annotation.Nullable final DataSourceScopes value) {
        this._dataSourceScopes = value;
    }
    /**
     * Sets the lastEstimateStatisticsOperation property value. The last estimate operation associated with the eDiscovery search.
     * @param value Value to set for the lastEstimateStatisticsOperation property.
     * @return a void
     */
    public void setLastEstimateStatisticsOperation(@javax.annotation.Nullable final EdiscoveryEstimateOperation value) {
        this._lastEstimateStatisticsOperation = value;
    }
    /**
     * Sets the noncustodialSources property value. noncustodialDataSource sources that are included in the eDiscovery search
     * @param value Value to set for the noncustodialSources property.
     * @return a void
     */
    public void setNoncustodialSources(@javax.annotation.Nullable final java.util.List<EdiscoveryNoncustodialDataSource> value) {
        this._noncustodialSources = value;
    }
}
