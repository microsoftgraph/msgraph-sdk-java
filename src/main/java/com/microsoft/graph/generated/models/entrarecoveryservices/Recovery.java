package com.microsoft.graph.models.entrarecoveryservices;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Recovery extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Recovery} and sets the default values.
     */
    public Recovery() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Recovery}
     */
    @jakarta.annotation.Nonnull
    public static Recovery createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Recovery();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("jobs", (n) -> { this.setJobs(n.getCollectionOfObjectValues(RecoveryJobBase::createFromDiscriminatorValue)); });
        deserializerMap.put("snapshots", (n) -> { this.setSnapshots(n.getCollectionOfObjectValues(Snapshot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the jobs property value. The jobs property
     * @return a {@link java.util.List<RecoveryJobBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RecoveryJobBase> getJobs() {
        return this.backingStore.get("jobs");
    }
    /**
     * Gets the snapshots property value. The snapshots property
     * @return a {@link java.util.List<Snapshot>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Snapshot> getSnapshots() {
        return this.backingStore.get("snapshots");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("jobs", this.getJobs());
        writer.writeCollectionOfObjectValues("snapshots", this.getSnapshots());
    }
    /**
     * Sets the jobs property value. The jobs property
     * @param value Value to set for the jobs property.
     */
    public void setJobs(@jakarta.annotation.Nullable final java.util.List<RecoveryJobBase> value) {
        this.backingStore.set("jobs", value);
    }
    /**
     * Sets the snapshots property value. The snapshots property
     * @param value Value to set for the snapshots property.
     */
    public void setSnapshots(@jakarta.annotation.Nullable final java.util.List<Snapshot> value) {
        this.backingStore.set("snapshots", value);
    }
}
