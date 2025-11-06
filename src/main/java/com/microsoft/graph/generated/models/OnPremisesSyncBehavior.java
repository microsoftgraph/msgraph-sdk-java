package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPremisesSyncBehavior extends Entity implements Parsable {
    /**
     * Instantiates a new {@link OnPremisesSyncBehavior} and sets the default values.
     */
    public OnPremisesSyncBehavior() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnPremisesSyncBehavior}
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesSyncBehavior createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesSyncBehavior();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isCloudManaged", (n) -> { this.setIsCloudManaged(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCloudManaged property value. The isCloudManaged property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCloudManaged() {
        return this.backingStore.get("isCloudManaged");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isCloudManaged", this.getIsCloudManaged());
    }
    /**
     * Sets the isCloudManaged property value. The isCloudManaged property
     * @param value Value to set for the isCloudManaged property.
     */
    public void setIsCloudManaged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCloudManaged", value);
    }
}
