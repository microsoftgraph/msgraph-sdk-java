package com.microsoft.graph.models.entrarecoveryservices;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecoveryJobEntityNameAndIdsFilter extends RecoveryJobFilteringCriteriaBase implements Parsable {
    /**
     * Instantiates a new {@link RecoveryJobEntityNameAndIdsFilter} and sets the default values.
     */
    public RecoveryJobEntityNameAndIdsFilter() {
        super();
        this.setOdataType("#microsoft.graph.entraRecoveryServices.recoveryJobEntityNameAndIdsFilter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RecoveryJobEntityNameAndIdsFilter}
     */
    @jakarta.annotation.Nonnull
    public static RecoveryJobEntityNameAndIdsFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecoveryJobEntityNameAndIdsFilter();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("filterValues", (n) -> { this.setFilterValues(n.getCollectionOfObjectValues(EntityTypeAndIds::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filterValues property value. The list of entity type and ID pairs to include in the recovery job. Duplicate entity types are not allowed and return a 400 Bad Request error.
     * @return a {@link java.util.List<EntityTypeAndIds>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EntityTypeAndIds> getFilterValues() {
        return this.backingStore.get("filterValues");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("filterValues", this.getFilterValues());
    }
    /**
     * Sets the filterValues property value. The list of entity type and ID pairs to include in the recovery job. Duplicate entity types are not allowed and return a 400 Bad Request error.
     * @param value Value to set for the filterValues property.
     */
    public void setFilterValues(@jakarta.annotation.Nullable final java.util.List<EntityTypeAndIds> value) {
        this.backingStore.set("filterValues", value);
    }
}
