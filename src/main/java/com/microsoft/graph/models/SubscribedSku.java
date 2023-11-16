package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubscribedSku extends Entity implements Parsable {
    /**
     * Instantiates a new SubscribedSku and sets the default values.
     */
    public SubscribedSku() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubscribedSku
     */
    @jakarta.annotation.Nonnull
    public static SubscribedSku createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubscribedSku();
    }
    /**
     * Gets the accountId property value. The unique ID of the account this SKU belongs to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountId() {
        return this.BackingStore.get("accountId");
    }
    /**
     * Gets the accountName property value. The name of the account this SKU belongs to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.BackingStore.get("accountName");
    }
    /**
     * Gets the appliesTo property value. The target class for this SKU. Only SKUs with target class User are assignable. Possible values are: 'User', 'Company'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppliesTo() {
        return this.BackingStore.get("appliesTo");
    }
    /**
     * Gets the capabilityStatus property value. Enabled indicates that the prepaidUnits property has at least one unit that is enabled. LockedOut indicates that the customer canceled their subscription. Possible values are: Enabled, Warning, Suspended, Deleted, LockedOut.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCapabilityStatus() {
        return this.BackingStore.get("capabilityStatus");
    }
    /**
     * Gets the consumedUnits property value. The number of licenses that have been assigned.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConsumedUnits() {
        return this.BackingStore.get("consumedUnits");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountId", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("appliesTo", (n) -> { this.setAppliesTo(n.getStringValue()); });
        deserializerMap.put("capabilityStatus", (n) -> { this.setCapabilityStatus(n.getStringValue()); });
        deserializerMap.put("consumedUnits", (n) -> { this.setConsumedUnits(n.getIntegerValue()); });
        deserializerMap.put("prepaidUnits", (n) -> { this.setPrepaidUnits(n.getObjectValue(LicenseUnitsDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePlans", (n) -> { this.setServicePlans(n.getCollectionOfObjectValues(ServicePlanInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("skuId", (n) -> { this.setSkuId(n.getUUIDValue()); });
        deserializerMap.put("skuPartNumber", (n) -> { this.setSkuPartNumber(n.getStringValue()); });
        deserializerMap.put("subscriptionIds", (n) -> { this.setSubscriptionIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the prepaidUnits property value. Information about the number and status of prepaid licenses.
     * @return a LicenseUnitsDetail
     */
    @jakarta.annotation.Nullable
    public LicenseUnitsDetail getPrepaidUnits() {
        return this.BackingStore.get("prepaidUnits");
    }
    /**
     * Gets the servicePlans property value. Information about the service plans that are available with the SKU. Not nullable.
     * @return a java.util.List<ServicePlanInfo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePlanInfo> getServicePlans() {
        return this.BackingStore.get("servicePlans");
    }
    /**
     * Gets the skuId property value. The unique identifier (GUID) for the service SKU.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getSkuId() {
        return this.BackingStore.get("skuId");
    }
    /**
     * Gets the skuPartNumber property value. The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. To get a list of commercial subscriptions that an organization has acquired, see List subscribedSkus.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSkuPartNumber() {
        return this.BackingStore.get("skuPartNumber");
    }
    /**
     * Gets the subscriptionIds property value. The subscriptionIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSubscriptionIds() {
        return this.BackingStore.get("subscriptionIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accountId", this.getAccountId());
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeStringValue("appliesTo", this.getAppliesTo());
        writer.writeStringValue("capabilityStatus", this.getCapabilityStatus());
        writer.writeIntegerValue("consumedUnits", this.getConsumedUnits());
        writer.writeObjectValue("prepaidUnits", this.getPrepaidUnits());
        writer.writeCollectionOfObjectValues("servicePlans", this.getServicePlans());
        writer.writeUUIDValue("skuId", this.getSkuId());
        writer.writeStringValue("skuPartNumber", this.getSkuPartNumber());
        writer.writeCollectionOfPrimitiveValues("subscriptionIds", this.getSubscriptionIds());
    }
    /**
     * Sets the accountId property value. The unique ID of the account this SKU belongs to.
     * @param value Value to set for the accountId property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("accountId", value);
    }
    /**
     * Sets the accountName property value. The name of the account this SKU belongs to.
     * @param value Value to set for the accountName property.
     */
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("accountName", value);
    }
    /**
     * Sets the appliesTo property value. The target class for this SKU. Only SKUs with target class User are assignable. Possible values are: 'User', 'Company'.
     * @param value Value to set for the appliesTo property.
     */
    public void setAppliesTo(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("appliesTo", value);
    }
    /**
     * Sets the capabilityStatus property value. Enabled indicates that the prepaidUnits property has at least one unit that is enabled. LockedOut indicates that the customer canceled their subscription. Possible values are: Enabled, Warning, Suspended, Deleted, LockedOut.
     * @param value Value to set for the capabilityStatus property.
     */
    public void setCapabilityStatus(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("capabilityStatus", value);
    }
    /**
     * Sets the consumedUnits property value. The number of licenses that have been assigned.
     * @param value Value to set for the consumedUnits property.
     */
    public void setConsumedUnits(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("consumedUnits", value);
    }
    /**
     * Sets the prepaidUnits property value. Information about the number and status of prepaid licenses.
     * @param value Value to set for the prepaidUnits property.
     */
    public void setPrepaidUnits(@jakarta.annotation.Nullable final LicenseUnitsDetail value) {
        this.BackingStore.set("prepaidUnits", value);
    }
    /**
     * Sets the servicePlans property value. Information about the service plans that are available with the SKU. Not nullable.
     * @param value Value to set for the servicePlans property.
     */
    public void setServicePlans(@jakarta.annotation.Nullable final java.util.List<ServicePlanInfo> value) {
        this.BackingStore.set("servicePlans", value);
    }
    /**
     * Sets the skuId property value. The unique identifier (GUID) for the service SKU.
     * @param value Value to set for the skuId property.
     */
    public void setSkuId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("skuId", value);
    }
    /**
     * Sets the skuPartNumber property value. The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. To get a list of commercial subscriptions that an organization has acquired, see List subscribedSkus.
     * @param value Value to set for the skuPartNumber property.
     */
    public void setSkuPartNumber(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("skuPartNumber", value);
    }
    /**
     * Sets the subscriptionIds property value. The subscriptionIds property
     * @param value Value to set for the subscriptionIds property.
     */
    public void setSubscriptionIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("subscriptionIds", value);
    }
}
