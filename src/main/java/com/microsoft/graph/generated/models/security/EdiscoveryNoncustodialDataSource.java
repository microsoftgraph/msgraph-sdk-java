package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryNoncustodialDataSource extends DataSourceContainer implements Parsable {
    /**
     * Instantiates a new {@link EdiscoveryNoncustodialDataSource} and sets the default values.
     */
    public EdiscoveryNoncustodialDataSource() {
        super();
        this.setOdataType("#microsoft.graph.security.ediscoveryNoncustodialDataSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EdiscoveryNoncustodialDataSource}
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryNoncustodialDataSource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryNoncustodialDataSource();
    }
    /**
     * Gets the dataSource property value. User source or SharePoint site data source as noncustodial data source.
     * @return a {@link DataSource}
     */
    @jakarta.annotation.Nullable
    public DataSource getDataSource() {
        return this.backingStore.get("dataSource");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dataSource", (n) -> { this.setDataSource(n.getObjectValue(DataSource::createFromDiscriminatorValue)); });
        deserializerMap.put("lastIndexOperation", (n) -> { this.setLastIndexOperation(n.getObjectValue(EdiscoveryIndexOperation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastIndexOperation property value. Operation entity that represents the latest indexing for the noncustodial data source.
     * @return a {@link EdiscoveryIndexOperation}
     */
    @jakarta.annotation.Nullable
    public EdiscoveryIndexOperation getLastIndexOperation() {
        return this.backingStore.get("lastIndexOperation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("dataSource", this.getDataSource());
        writer.writeObjectValue("lastIndexOperation", this.getLastIndexOperation());
    }
    /**
     * Sets the dataSource property value. User source or SharePoint site data source as noncustodial data source.
     * @param value Value to set for the dataSource property.
     */
    public void setDataSource(@jakarta.annotation.Nullable final DataSource value) {
        this.backingStore.set("dataSource", value);
    }
    /**
     * Sets the lastIndexOperation property value. Operation entity that represents the latest indexing for the noncustodial data source.
     * @param value Value to set for the lastIndexOperation property.
     */
    public void setLastIndexOperation(@jakarta.annotation.Nullable final EdiscoveryIndexOperation value) {
        this.backingStore.set("lastIndexOperation", value);
    }
}
