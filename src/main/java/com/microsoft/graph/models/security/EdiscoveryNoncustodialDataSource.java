package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryNoncustodialDataSource extends DataSourceContainer implements Parsable {
    /** User source or SharePoint site data source as non-custodial data source. */
    private DataSource dataSource;
    /** Operation entity that represents the latest indexing for the non-custodial data source. */
    private EdiscoveryIndexOperation lastIndexOperation;
    /**
     * Instantiates a new ediscoveryNoncustodialDataSource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryNoncustodialDataSource() {
        super();
        this.setOdataType("#microsoft.graph.security.ediscoveryNoncustodialDataSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ediscoveryNoncustodialDataSource
     */
    @javax.annotation.Nonnull
    public static EdiscoveryNoncustodialDataSource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryNoncustodialDataSource();
    }
    /**
     * Gets the dataSource property value. User source or SharePoint site data source as non-custodial data source.
     * @return a dataSource
     */
    @javax.annotation.Nullable
    public DataSource getDataSource() {
        return this.dataSource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dataSource", (n) -> { this.setDataSource(n.getObjectValue(DataSource::createFromDiscriminatorValue)); });
        deserializerMap.put("lastIndexOperation", (n) -> { this.setLastIndexOperation(n.getObjectValue(EdiscoveryIndexOperation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastIndexOperation property value. Operation entity that represents the latest indexing for the non-custodial data source.
     * @return a ediscoveryIndexOperation
     */
    @javax.annotation.Nullable
    public EdiscoveryIndexOperation getLastIndexOperation() {
        return this.lastIndexOperation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("dataSource", this.getDataSource());
        writer.writeObjectValue("lastIndexOperation", this.getLastIndexOperation());
    }
    /**
     * Sets the dataSource property value. User source or SharePoint site data source as non-custodial data source.
     * @param value Value to set for the dataSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataSource(@javax.annotation.Nullable final DataSource value) {
        this.dataSource = value;
    }
    /**
     * Sets the lastIndexOperation property value. Operation entity that represents the latest indexing for the non-custodial data source.
     * @param value Value to set for the lastIndexOperation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastIndexOperation(@javax.annotation.Nullable final EdiscoveryIndexOperation value) {
        this.lastIndexOperation = value;
    }
}
