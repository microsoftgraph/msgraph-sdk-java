package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventsRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link VirtualEventsRoot} and sets the default values.
     */
    public VirtualEventsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventsRoot}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventsRoot();
    }
    /**
     * Gets the events property value. The events property
     * @return a {@link java.util.List<VirtualEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEvent> getEvents() {
        return this.backingStore.get("events");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(VirtualEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("townhalls", (n) -> { this.setTownhalls(n.getCollectionOfObjectValues(VirtualEventTownhall::createFromDiscriminatorValue)); });
        deserializerMap.put("webinars", (n) -> { this.setWebinars(n.getCollectionOfObjectValues(VirtualEventWebinar::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the townhalls property value. A collection of town halls. Nullable.
     * @return a {@link java.util.List<VirtualEventTownhall>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventTownhall> getTownhalls() {
        return this.backingStore.get("townhalls");
    }
    /**
     * Gets the webinars property value. A collection of webinars. Nullable.
     * @return a {@link java.util.List<VirtualEventWebinar>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventWebinar> getWebinars() {
        return this.backingStore.get("webinars");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeCollectionOfObjectValues("townhalls", this.getTownhalls());
        writer.writeCollectionOfObjectValues("webinars", this.getWebinars());
    }
    /**
     * Sets the events property value. The events property
     * @param value Value to set for the events property.
     */
    public void setEvents(@jakarta.annotation.Nullable final java.util.List<VirtualEvent> value) {
        this.backingStore.set("events", value);
    }
    /**
     * Sets the townhalls property value. A collection of town halls. Nullable.
     * @param value Value to set for the townhalls property.
     */
    public void setTownhalls(@jakarta.annotation.Nullable final java.util.List<VirtualEventTownhall> value) {
        this.backingStore.set("townhalls", value);
    }
    /**
     * Sets the webinars property value. A collection of webinars. Nullable.
     * @param value Value to set for the webinars property.
     */
    public void setWebinars(@jakarta.annotation.Nullable final java.util.List<VirtualEventWebinar> value) {
        this.backingStore.set("webinars", value);
    }
}
