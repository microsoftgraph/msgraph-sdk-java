package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignedPlaceMode extends PlaceMode implements Parsable {
    /**
     * Instantiates a new {@link AssignedPlaceMode} and sets the default values.
     */
    public AssignedPlaceMode() {
        super();
        this.setOdataType("#microsoft.graph.assignedPlaceMode");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AssignedPlaceMode}
     */
    @jakarta.annotation.Nonnull
    public static AssignedPlaceMode createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignedPlaceMode();
    }
    /**
     * Gets the assignedUserEmailAddress property value. The assignedUserEmailAddress property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedUserEmailAddress() {
        return this.backingStore.get("assignedUserEmailAddress");
    }
    /**
     * Gets the assignedUserId property value. The assignedUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedUserId() {
        return this.backingStore.get("assignedUserId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedUserEmailAddress", (n) -> { this.setAssignedUserEmailAddress(n.getStringValue()); });
        deserializerMap.put("assignedUserId", (n) -> { this.setAssignedUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignedUserEmailAddress", this.getAssignedUserEmailAddress());
        writer.writeStringValue("assignedUserId", this.getAssignedUserId());
    }
    /**
     * Sets the assignedUserEmailAddress property value. The assignedUserEmailAddress property
     * @param value Value to set for the assignedUserEmailAddress property.
     */
    public void setAssignedUserEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignedUserEmailAddress", value);
    }
    /**
     * Sets the assignedUserId property value. The assignedUserId property
     * @param value Value to set for the assignedUserId property.
     */
    public void setAssignedUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignedUserId", value);
    }
}
