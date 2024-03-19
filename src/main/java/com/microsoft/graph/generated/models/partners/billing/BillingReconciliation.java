package com.microsoft.graph.models.partners.billing;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BillingReconciliation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link BillingReconciliation} and sets the default values.
     */
    public BillingReconciliation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BillingReconciliation}
     */
    @jakarta.annotation.Nonnull
    public static BillingReconciliation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BillingReconciliation();
    }
    /**
     * Gets the billed property value. The billed property
     * @return a {@link BilledReconciliation}
     */
    @jakarta.annotation.Nullable
    public BilledReconciliation getBilled() {
        return this.backingStore.get("billed");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("billed", (n) -> { this.setBilled(n.getObjectValue(BilledReconciliation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("billed", this.getBilled());
    }
    /**
     * Sets the billed property value. The billed property
     * @param value Value to set for the billed property.
     */
    public void setBilled(@jakarta.annotation.Nullable final BilledReconciliation value) {
        this.backingStore.set("billed", value);
    }
}
