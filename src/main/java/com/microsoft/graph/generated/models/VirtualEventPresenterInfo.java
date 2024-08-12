package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventPresenterInfo extends MeetingParticipantInfo implements Parsable {
    /**
     * Instantiates a new {@link VirtualEventPresenterInfo} and sets the default values.
     */
    public VirtualEventPresenterInfo() {
        super();
        this.setOdataType("#microsoft.graph.virtualEventPresenterInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventPresenterInfo}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventPresenterInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventPresenterInfo();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("presenterDetails", (n) -> { this.setPresenterDetails(n.getObjectValue(VirtualEventPresenterDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the presenterDetails property value. The presenterDetails property
     * @return a {@link VirtualEventPresenterDetails}
     */
    @jakarta.annotation.Nullable
    public VirtualEventPresenterDetails getPresenterDetails() {
        return this.backingStore.get("presenterDetails");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("presenterDetails", this.getPresenterDetails());
    }
    /**
     * Sets the presenterDetails property value. The presenterDetails property
     * @param value Value to set for the presenterDetails property.
     */
    public void setPresenterDetails(@jakarta.annotation.Nullable final VirtualEventPresenterDetails value) {
        this.backingStore.set("presenterDetails", value);
    }
}
