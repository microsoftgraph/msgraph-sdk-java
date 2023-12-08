package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LicenseDetails extends Entity implements Parsable {
    /**
     * Instantiates a new LicenseDetails and sets the default values.
     */
    public LicenseDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LicenseDetails
     */
    @jakarta.annotation.Nonnull
    public static LicenseDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LicenseDetails();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("servicePlans", (n) -> { this.setServicePlans(n.getCollectionOfObjectValues(ServicePlanInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("skuId", (n) -> { this.setSkuId(n.getUUIDValue()); });
        deserializerMap.put("skuPartNumber", (n) -> { this.setSkuPartNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the servicePlans property value. Information about the service plans assigned with the license. Read-only, Not nullable
     * @return a java.util.List<ServicePlanInfo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePlanInfo> getServicePlans() {
        return this.backingStore.get("servicePlans");
    }
    /**
     * Gets the skuId property value. Unique identifier (GUID) for the service SKU. Equal to the skuId property on the related SubscribedSku object. Read-only
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getSkuId() {
        return this.backingStore.get("skuId");
    }
    /**
     * Gets the skuPartNumber property value. Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku object; for example: 'AAD_Premium'. Read-only
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSkuPartNumber() {
        return this.backingStore.get("skuPartNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("servicePlans", this.getServicePlans());
        writer.writeUUIDValue("skuId", this.getSkuId());
        writer.writeStringValue("skuPartNumber", this.getSkuPartNumber());
    }
    /**
     * Sets the servicePlans property value. Information about the service plans assigned with the license. Read-only, Not nullable
     * @param value Value to set for the servicePlans property.
     */
    public void setServicePlans(@jakarta.annotation.Nullable final java.util.List<ServicePlanInfo> value) {
        this.backingStore.set("servicePlans", value);
    }
    /**
     * Sets the skuId property value. Unique identifier (GUID) for the service SKU. Equal to the skuId property on the related SubscribedSku object. Read-only
     * @param value Value to set for the skuId property.
     */
    public void setSkuId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("skuId", value);
    }
    /**
     * Sets the skuPartNumber property value. Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku object; for example: 'AAD_Premium'. Read-only
     * @param value Value to set for the skuPartNumber property.
     */
    public void setSkuPartNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("skuPartNumber", value);
    }
}
