package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProtectedApplicationMetadata extends IntegratedApplicationMetadata implements Parsable {
    /**
     * Instantiates a new {@link ProtectedApplicationMetadata} and sets the default values.
     */
    public ProtectedApplicationMetadata() {
        super();
        this.setOdataType("#microsoft.graph.protectedApplicationMetadata");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProtectedApplicationMetadata}
     */
    @jakarta.annotation.Nonnull
    public static ProtectedApplicationMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProtectedApplicationMetadata();
    }
    /**
     * Gets the applicationLocation property value. The client (application) ID of the Microsoft Entra application. Required.
     * @return a {@link PolicyLocation}
     */
    @jakarta.annotation.Nullable
    public PolicyLocation getApplicationLocation() {
        return this.backingStore.get("applicationLocation");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationLocation", (n) -> { this.setApplicationLocation(n.getObjectValue(PolicyLocation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("applicationLocation", this.getApplicationLocation());
    }
    /**
     * Sets the applicationLocation property value. The client (application) ID of the Microsoft Entra application. Required.
     * @param value Value to set for the applicationLocation property.
     */
    public void setApplicationLocation(@jakarta.annotation.Nullable final PolicyLocation value) {
        this.backingStore.set("applicationLocation", value);
    }
}
