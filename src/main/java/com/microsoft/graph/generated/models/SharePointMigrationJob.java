package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointMigrationJob extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SharePointMigrationJob} and sets the default values.
     */
    public SharePointMigrationJob() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMigrationJob}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMigrationJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointMigrationJob();
    }
    /**
     * Gets the containerInfo property value. The containerInfo property
     * @return a {@link SharePointMigrationContainerInfo}
     */
    @jakarta.annotation.Nullable
    public SharePointMigrationContainerInfo getContainerInfo() {
        return this.backingStore.get("containerInfo");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("containerInfo", (n) -> { this.setContainerInfo(n.getObjectValue(SharePointMigrationContainerInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("progressEvents", (n) -> { this.setProgressEvents(n.getCollectionOfObjectValues(SharePointMigrationEvent::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the progressEvents property value. A collection of migration events that reflects the job status changes.
     * @return a {@link java.util.List<SharePointMigrationEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharePointMigrationEvent> getProgressEvents() {
        return this.backingStore.get("progressEvents");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("containerInfo", this.getContainerInfo());
        writer.writeCollectionOfObjectValues("progressEvents", this.getProgressEvents());
    }
    /**
     * Sets the containerInfo property value. The containerInfo property
     * @param value Value to set for the containerInfo property.
     */
    public void setContainerInfo(@jakarta.annotation.Nullable final SharePointMigrationContainerInfo value) {
        this.backingStore.set("containerInfo", value);
    }
    /**
     * Sets the progressEvents property value. A collection of migration events that reflects the job status changes.
     * @param value Value to set for the progressEvents property.
     */
    public void setProgressEvents(@jakarta.annotation.Nullable final java.util.List<SharePointMigrationEvent> value) {
        this.backingStore.set("progressEvents", value);
    }
}
