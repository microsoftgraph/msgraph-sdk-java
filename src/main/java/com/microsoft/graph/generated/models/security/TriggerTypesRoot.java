package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TriggerTypesRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TriggerTypesRoot} and sets the default values.
     */
    public TriggerTypesRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TriggerTypesRoot}
     */
    @jakarta.annotation.Nonnull
    public static TriggerTypesRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TriggerTypesRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("retentionEventTypes", (n) -> { this.setRetentionEventTypes(n.getCollectionOfObjectValues(RetentionEventType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the retentionEventTypes property value. The retentionEventTypes property
     * @return a {@link java.util.List<RetentionEventType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RetentionEventType> getRetentionEventTypes() {
        return this.backingStore.get("retentionEventTypes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("retentionEventTypes", this.getRetentionEventTypes());
    }
    /**
     * Sets the retentionEventTypes property value. The retentionEventTypes property
     * @param value Value to set for the retentionEventTypes property.
     */
    public void setRetentionEventTypes(@jakarta.annotation.Nullable final java.util.List<RetentionEventType> value) {
        this.backingStore.set("retentionEventTypes", value);
    }
}
