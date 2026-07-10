package com.microsoft.graph.models.entrarecoveryservices;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Snapshot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Snapshot} and sets the default values.
     */
    public Snapshot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Snapshot}
     */
    @jakarta.annotation.Nonnull
    public static Snapshot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Snapshot();
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recoveryJobs", (n) -> { this.setRecoveryJobs(n.getCollectionOfObjectValues(RecoveryJob::createFromDiscriminatorValue)); });
        deserializerMap.put("recoveryPreviewJobs", (n) -> { this.setRecoveryPreviewJobs(n.getCollectionOfObjectValues(RecoveryPreviewJob::createFromDiscriminatorValue)); });
        deserializerMap.put("totalChangedObjects", (n) -> { this.setTotalChangedObjects(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recoveryJobs property value. The recoveryJobs property
     * @return a {@link java.util.List<RecoveryJob>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RecoveryJob> getRecoveryJobs() {
        return this.backingStore.get("recoveryJobs");
    }
    /**
     * Gets the recoveryPreviewJobs property value. The recoveryPreviewJobs property
     * @return a {@link java.util.List<RecoveryPreviewJob>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RecoveryPreviewJob> getRecoveryPreviewJobs() {
        return this.backingStore.get("recoveryPreviewJobs");
    }
    /**
     * Gets the totalChangedObjects property value. The totalChangedObjects property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalChangedObjects() {
        return this.backingStore.get("totalChangedObjects");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("recoveryJobs", this.getRecoveryJobs());
        writer.writeCollectionOfObjectValues("recoveryPreviewJobs", this.getRecoveryPreviewJobs());
        writer.writeIntegerValue("totalChangedObjects", this.getTotalChangedObjects());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the recoveryJobs property value. The recoveryJobs property
     * @param value Value to set for the recoveryJobs property.
     */
    public void setRecoveryJobs(@jakarta.annotation.Nullable final java.util.List<RecoveryJob> value) {
        this.backingStore.set("recoveryJobs", value);
    }
    /**
     * Sets the recoveryPreviewJobs property value. The recoveryPreviewJobs property
     * @param value Value to set for the recoveryPreviewJobs property.
     */
    public void setRecoveryPreviewJobs(@jakarta.annotation.Nullable final java.util.List<RecoveryPreviewJob> value) {
        this.backingStore.set("recoveryPreviewJobs", value);
    }
    /**
     * Sets the totalChangedObjects property value. The totalChangedObjects property
     * @param value Value to set for the totalChangedObjects property.
     */
    public void setTotalChangedObjects(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalChangedObjects", value);
    }
}
