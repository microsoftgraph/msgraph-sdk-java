package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaPoliciesDeletableRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CaPoliciesDeletableRoot} and sets the default values.
     */
    public CaPoliciesDeletableRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CaPoliciesDeletableRoot}
     */
    @jakarta.annotation.Nonnull
    public static CaPoliciesDeletableRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CaPoliciesDeletableRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("namedLocations", (n) -> { this.setNamedLocations(n.getCollectionOfObjectValues(NamedLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("policies", (n) -> { this.setPolicies(n.getCollectionOfObjectValues(ConditionalAccessPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the namedLocations property value. The namedLocations property
     * @return a {@link java.util.List<NamedLocation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NamedLocation> getNamedLocations() {
        return this.backingStore.get("namedLocations");
    }
    /**
     * Gets the policies property value. The policies property
     * @return a {@link java.util.List<ConditionalAccessPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessPolicy> getPolicies() {
        return this.backingStore.get("policies");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("namedLocations", this.getNamedLocations());
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
    }
    /**
     * Sets the namedLocations property value. The namedLocations property
     * @param value Value to set for the namedLocations property.
     */
    public void setNamedLocations(@jakarta.annotation.Nullable final java.util.List<NamedLocation> value) {
        this.backingStore.set("namedLocations", value);
    }
    /**
     * Sets the policies property value. The policies property
     * @param value Value to set for the policies property.
     */
    public void setPolicies(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessPolicy> value) {
        this.backingStore.set("policies", value);
    }
}
