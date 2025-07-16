package com.microsoft.graph.models.partners.billing;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Billing extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Billing} and sets the default values.
     */
    public Billing() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Billing}
     */
    @jakarta.annotation.Nonnull
    public static Billing createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Billing();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("manifests", (n) -> { this.setManifests(n.getCollectionOfObjectValues(Manifest::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(Operation::createFromDiscriminatorValue)); });
        deserializerMap.put("reconciliation", (n) -> { this.setReconciliation(n.getObjectValue(BillingReconciliation::createFromDiscriminatorValue)); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getObjectValue(AzureUsage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the manifests property value. Represents metadata for the exported data.
     * @return a {@link java.util.List<Manifest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Manifest> getManifests() {
        return this.backingStore.get("manifests");
    }
    /**
     * Gets the operations property value. Represents an operation to export the billing data of a partner.
     * @return a {@link java.util.List<Operation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Operation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Gets the reconciliation property value. The reconciliation property
     * @return a {@link BillingReconciliation}
     */
    @jakarta.annotation.Nullable
    public BillingReconciliation getReconciliation() {
        return this.backingStore.get("reconciliation");
    }
    /**
     * Gets the usage property value. The usage property
     * @return a {@link AzureUsage}
     */
    @jakarta.annotation.Nullable
    public AzureUsage getUsage() {
        return this.backingStore.get("usage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("manifests", this.getManifests());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeObjectValue("reconciliation", this.getReconciliation());
        writer.writeObjectValue("usage", this.getUsage());
    }
    /**
     * Sets the manifests property value. Represents metadata for the exported data.
     * @param value Value to set for the manifests property.
     */
    public void setManifests(@jakarta.annotation.Nullable final java.util.List<Manifest> value) {
        this.backingStore.set("manifests", value);
    }
    /**
     * Sets the operations property value. Represents an operation to export the billing data of a partner.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<Operation> value) {
        this.backingStore.set("operations", value);
    }
    /**
     * Sets the reconciliation property value. The reconciliation property
     * @param value Value to set for the reconciliation property.
     */
    public void setReconciliation(@jakarta.annotation.Nullable final BillingReconciliation value) {
        this.backingStore.set("reconciliation", value);
    }
    /**
     * Sets the usage property value. The usage property
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final AzureUsage value) {
        this.backingStore.set("usage", value);
    }
}
