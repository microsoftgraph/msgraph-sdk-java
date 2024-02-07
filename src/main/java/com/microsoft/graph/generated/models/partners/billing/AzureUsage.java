package com.microsoft.graph.models.partners.billing;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureUsage extends Entity implements Parsable {
    /**
     * Instantiates a new AzureUsage and sets the default values.
     */
    public AzureUsage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AzureUsage
     */
    @jakarta.annotation.Nonnull
    public static AzureUsage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureUsage();
    }
    /**
     * Gets the billed property value. The billed property
     * @return a BilledUsage
     */
    @jakarta.annotation.Nullable
    public BilledUsage getBilled() {
        return this.backingStore.get("billed");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("billed", (n) -> { this.setBilled(n.getObjectValue(BilledUsage::createFromDiscriminatorValue)); });
        deserializerMap.put("unbilled", (n) -> { this.setUnbilled(n.getObjectValue(UnbilledUsage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the unbilled property value. The unbilled property
     * @return a UnbilledUsage
     */
    @jakarta.annotation.Nullable
    public UnbilledUsage getUnbilled() {
        return this.backingStore.get("unbilled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("billed", this.getBilled());
        writer.writeObjectValue("unbilled", this.getUnbilled());
    }
    /**
     * Sets the billed property value. The billed property
     * @param value Value to set for the billed property.
     */
    public void setBilled(@jakarta.annotation.Nullable final BilledUsage value) {
        this.backingStore.set("billed", value);
    }
    /**
     * Sets the unbilled property value. The unbilled property
     * @param value Value to set for the unbilled property.
     */
    public void setUnbilled(@jakarta.annotation.Nullable final UnbilledUsage value) {
        this.backingStore.set("unbilled", value);
    }
}
