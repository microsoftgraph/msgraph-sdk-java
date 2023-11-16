package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoverySearch extends Search implements Parsable {
    /**
     * Instantiates a new EdiscoverySearch and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static EdiscoverySearch createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoverySearch();
    }
    /**
     * Gets the additionalSources property value. Adds an additional source to the eDiscovery search.
     * @return a java.util.List<DataSource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DataSource> getAdditionalSources() {
        return this.BackingStore.get("additionalSources");
    }
    /**
     * Gets the addToReviewSetOperation property value. Adds the results of the eDiscovery search to the specified reviewSet.
     * @return a EdiscoveryAddToReviewSetOperation
     */
    @jakarta.annotation.Nullable
    public EdiscoveryAddToReviewSetOperation getAddToReviewSetOperation() {
        return this.BackingStore.get("addToReviewSetOperation");
    }
    /**
     * Gets the custodianSources property value. Custodian sources that are included in the eDiscovery search.
     * @return a java.util.List<DataSource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DataSource> getCustodianSources() {
        return this.BackingStore.get("custodianSources");
    }
    /**
     * Gets the dataSourceScopes property value. When specified, the collection will span across a service for an entire workload. Possible values are: none, allTenantMailboxes, allTenantSites, allCaseCustodians, allCaseNoncustodialDataSources.
     * @return a EnumSet<DataSourceScopes>
     */
    @jakarta.annotation.Nullable
    public EnumSet<DataSourceScopes> getDataSourceScopes() {
        return this.BackingStore.get("dataSourceScopes");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalSources", (n) -> { this.setAdditionalSources(n.getCollectionOfObjectValues(DataSource::createFromDiscriminatorValue)); });
        deserializerMap.put("addToReviewSetOperation", (n) -> { this.setAddToReviewSetOperation(n.getObjectValue(EdiscoveryAddToReviewSetOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("custodianSources", (n) -> { this.setCustodianSources(n.getCollectionOfObjectValues(DataSource::createFromDiscriminatorValue)); });
        deserializerMap.put("dataSourceScopes", (n) -> { this.setDataSourceScopes(n.getEnumSetValue(DataSourceScopes.class)); });
        deserializerMap.put("lastEstimateStatisticsOperation", (n) -> { this.setLastEstimateStatisticsOperation(n.getObjectValue(EdiscoveryEstimateOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("noncustodialSources", (n) -> { this.setNoncustodialSources(n.getCollectionOfObjectValues(EdiscoveryNoncustodialDataSource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastEstimateStatisticsOperation property value. The last estimate operation associated with the eDiscovery search.
     * @return a EdiscoveryEstimateOperation
     */
    @jakarta.annotation.Nullable
    public EdiscoveryEstimateOperation getLastEstimateStatisticsOperation() {
        return this.BackingStore.get("lastEstimateStatisticsOperation");
    }
    /**
     * Gets the noncustodialSources property value. noncustodialDataSource sources that are included in the eDiscovery search
     * @return a java.util.List<EdiscoveryNoncustodialDataSource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoveryNoncustodialDataSource> getNoncustodialSources() {
        return this.BackingStore.get("noncustodialSources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("additionalSources", this.getAdditionalSources());
        writer.writeObjectValue("addToReviewSetOperation", this.getAddToReviewSetOperation());
        writer.writeCollectionOfObjectValues("custodianSources", this.getCustodianSources());
        writer.writeEnumSetValue("dataSourceScopes", this.getDataSourceScopes());
        writer.writeObjectValue("lastEstimateStatisticsOperation", this.getLastEstimateStatisticsOperation());
        writer.writeCollectionOfObjectValues("noncustodialSources", this.getNoncustodialSources());
    }
    /**
     * Sets the additionalSources property value. Adds an additional source to the eDiscovery search.
     * @param value Value to set for the additionalSources property.
     */
    public void setAdditionalSources(@jakarta.annotation.Nullable final java.util.List<DataSource> value) {
        this.BackingStore.set("additionalSources", value);
    }
    /**
     * Sets the addToReviewSetOperation property value. Adds the results of the eDiscovery search to the specified reviewSet.
     * @param value Value to set for the addToReviewSetOperation property.
     */
    public void setAddToReviewSetOperation(@jakarta.annotation.Nullable final EdiscoveryAddToReviewSetOperation value) {
        this.BackingStore.set("addToReviewSetOperation", value);
    }
    /**
     * Sets the custodianSources property value. Custodian sources that are included in the eDiscovery search.
     * @param value Value to set for the custodianSources property.
     */
    public void setCustodianSources(@jakarta.annotation.Nullable final java.util.List<DataSource> value) {
        this.BackingStore.set("custodianSources", value);
    }
    /**
     * Sets the dataSourceScopes property value. When specified, the collection will span across a service for an entire workload. Possible values are: none, allTenantMailboxes, allTenantSites, allCaseCustodians, allCaseNoncustodialDataSources.
     * @param value Value to set for the dataSourceScopes property.
     */
    public void setDataSourceScopes(@jakarta.annotation.Nullable final EnumSet<DataSourceScopes> value) {
        this.BackingStore.set("dataSourceScopes", value);
    }
    /**
     * Sets the lastEstimateStatisticsOperation property value. The last estimate operation associated with the eDiscovery search.
     * @param value Value to set for the lastEstimateStatisticsOperation property.
     */
    public void setLastEstimateStatisticsOperation(@jakarta.annotation.Nullable final EdiscoveryEstimateOperation value) {
        this.BackingStore.set("lastEstimateStatisticsOperation", value);
    }
    /**
     * Sets the noncustodialSources property value. noncustodialDataSource sources that are included in the eDiscovery search
     * @param value Value to set for the noncustodialSources property.
     */
    public void setNoncustodialSources(@jakarta.annotation.Nullable final java.util.List<EdiscoveryNoncustodialDataSource> value) {
        this.BackingStore.set("noncustodialSources", value);
    }
}
