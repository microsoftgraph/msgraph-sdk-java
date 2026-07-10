package com.microsoft.graph.models.entrarecoveryservices;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecoveryJobEntityNamesFilter extends RecoveryJobFilteringCriteriaBase implements Parsable {
    /**
     * Instantiates a new {@link RecoveryJobEntityNamesFilter} and sets the default values.
     */
    public RecoveryJobEntityNamesFilter() {
        super();
        this.setOdataType("#microsoft.graph.entraRecoveryServices.recoveryJobEntityNamesFilter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RecoveryJobEntityNamesFilter}
     */
    @jakarta.annotation.Nonnull
    public static RecoveryJobEntityNamesFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecoveryJobEntityNamesFilter();
    }
    /**
     * Gets the entityTypes property value. The entityTypes property
     * @return a {@link java.util.List<ResourceTypeName>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourceTypeName> getEntityTypes() {
        return this.backingStore.get("entityTypes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("entityTypes", (n) -> { this.setEntityTypes(n.getCollectionOfEnumValues(ResourceTypeName::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfEnumValues("entityTypes", this.getEntityTypes());
    }
    /**
     * Sets the entityTypes property value. The entityTypes property
     * @param value Value to set for the entityTypes property.
     */
    public void setEntityTypes(@jakarta.annotation.Nullable final java.util.List<ResourceTypeName> value) {
        this.backingStore.set("entityTypes", value);
    }
}
