package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LocationConstraintItem extends Location implements Parsable {
    /**
     * Instantiates a new LocationConstraintItem and sets the default values.
     */
    public LocationConstraintItem() {
        super();
        this.setOdataType("#microsoft.graph.locationConstraintItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LocationConstraintItem
     */
    @jakarta.annotation.Nonnull
    public static LocationConstraintItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LocationConstraintItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("resolveAvailability", (n) -> { this.setResolveAvailability(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resolveAvailability property value. If set to true and the specified resource is busy, findMeetingTimes looks for another resource that is free. If set to false and the specified resource is busy, findMeetingTimes returns the resource best ranked in the user's cache without checking if it's free. Default is true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getResolveAvailability() {
        return this.backingStore.get("resolveAvailability");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("resolveAvailability", this.getResolveAvailability());
    }
    /**
     * Sets the resolveAvailability property value. If set to true and the specified resource is busy, findMeetingTimes looks for another resource that is free. If set to false and the specified resource is busy, findMeetingTimes returns the resource best ranked in the user's cache without checking if it's free. Default is true.
     * @param value Value to set for the resolveAvailability property.
     */
    public void setResolveAvailability(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("resolveAvailability", value);
    }
}
