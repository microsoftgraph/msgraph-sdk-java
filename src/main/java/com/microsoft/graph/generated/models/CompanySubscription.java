package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CompanySubscription extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CompanySubscription} and sets the default values.
     */
    public CompanySubscription() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CompanySubscription}
     */
    @jakarta.annotation.Nonnull
    public static CompanySubscription createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompanySubscription();
    }
    /**
     * Gets the commerceSubscriptionId property value. The ID of this subscription in the commerce system. Alternate key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommerceSubscriptionId() {
        return this.backingStore.get("commerceSubscriptionId");
    }
    /**
     * Gets the createdDateTime property value. The date and time when this subscription was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("commerceSubscriptionId", (n) -> { this.setCommerceSubscriptionId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isTrial", (n) -> { this.setIsTrial(n.getBooleanValue()); });
        deserializerMap.put("nextLifecycleDateTime", (n) -> { this.setNextLifecycleDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ownerId", (n) -> { this.setOwnerId(n.getStringValue()); });
        deserializerMap.put("ownerTenantId", (n) -> { this.setOwnerTenantId(n.getStringValue()); });
        deserializerMap.put("ownerType", (n) -> { this.setOwnerType(n.getStringValue()); });
        deserializerMap.put("serviceStatus", (n) -> { this.setServiceStatus(n.getCollectionOfObjectValues(ServicePlanInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("skuId", (n) -> { this.setSkuId(n.getStringValue()); });
        deserializerMap.put("skuPartNumber", (n) -> { this.setSkuPartNumber(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("totalLicenses", (n) -> { this.setTotalLicenses(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isTrial property value. Whether the subscription is a free trial or purchased.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTrial() {
        return this.backingStore.get("isTrial");
    }
    /**
     * Gets the nextLifecycleDateTime property value. The date and time when the subscription will move to the next state (as defined by the status property) if not renewed by the tenant. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextLifecycleDateTime() {
        return this.backingStore.get("nextLifecycleDateTime");
    }
    /**
     * Gets the ownerId property value. The object ID of the account admin.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnerId() {
        return this.backingStore.get("ownerId");
    }
    /**
     * Gets the ownerTenantId property value. The unique identifier for the Microsoft partner tenant that created the subscription on a customer tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnerTenantId() {
        return this.backingStore.get("ownerTenantId");
    }
    /**
     * Gets the ownerType property value. Indicates the entity that ownerId belongs to, for example, 'User'.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnerType() {
        return this.backingStore.get("ownerType");
    }
    /**
     * Gets the serviceStatus property value. The provisioning status of each service included in this subscription.
     * @return a {@link java.util.List<ServicePlanInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePlanInfo> getServiceStatus() {
        return this.backingStore.get("serviceStatus");
    }
    /**
     * Gets the skuId property value. The object ID of the SKU associated with this subscription.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSkuId() {
        return this.backingStore.get("skuId");
    }
    /**
     * Gets the skuPartNumber property value. The SKU associated with this subscription.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSkuPartNumber() {
        return this.backingStore.get("skuPartNumber");
    }
    /**
     * Gets the status property value. The status of this subscription. Possible values are: Enabled, Deleted, Suspended, Warning, LockedOut.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the totalLicenses property value. The number of licenses included in this subscription.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLicenses() {
        return this.backingStore.get("totalLicenses");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("commerceSubscriptionId", this.getCommerceSubscriptionId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeBooleanValue("isTrial", this.getIsTrial());
        writer.writeOffsetDateTimeValue("nextLifecycleDateTime", this.getNextLifecycleDateTime());
        writer.writeStringValue("ownerId", this.getOwnerId());
        writer.writeStringValue("ownerTenantId", this.getOwnerTenantId());
        writer.writeStringValue("ownerType", this.getOwnerType());
        writer.writeCollectionOfObjectValues("serviceStatus", this.getServiceStatus());
        writer.writeStringValue("skuId", this.getSkuId());
        writer.writeStringValue("skuPartNumber", this.getSkuPartNumber());
        writer.writeStringValue("status", this.getStatus());
        writer.writeIntegerValue("totalLicenses", this.getTotalLicenses());
    }
    /**
     * Sets the commerceSubscriptionId property value. The ID of this subscription in the commerce system. Alternate key.
     * @param value Value to set for the commerceSubscriptionId property.
     */
    public void setCommerceSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("commerceSubscriptionId", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when this subscription was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the isTrial property value. Whether the subscription is a free trial or purchased.
     * @param value Value to set for the isTrial property.
     */
    public void setIsTrial(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTrial", value);
    }
    /**
     * Sets the nextLifecycleDateTime property value. The date and time when the subscription will move to the next state (as defined by the status property) if not renewed by the tenant. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the nextLifecycleDateTime property.
     */
    public void setNextLifecycleDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("nextLifecycleDateTime", value);
    }
    /**
     * Sets the ownerId property value. The object ID of the account admin.
     * @param value Value to set for the ownerId property.
     */
    public void setOwnerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerId", value);
    }
    /**
     * Sets the ownerTenantId property value. The unique identifier for the Microsoft partner tenant that created the subscription on a customer tenant.
     * @param value Value to set for the ownerTenantId property.
     */
    public void setOwnerTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerTenantId", value);
    }
    /**
     * Sets the ownerType property value. Indicates the entity that ownerId belongs to, for example, 'User'.
     * @param value Value to set for the ownerType property.
     */
    public void setOwnerType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerType", value);
    }
    /**
     * Sets the serviceStatus property value. The provisioning status of each service included in this subscription.
     * @param value Value to set for the serviceStatus property.
     */
    public void setServiceStatus(@jakarta.annotation.Nullable final java.util.List<ServicePlanInfo> value) {
        this.backingStore.set("serviceStatus", value);
    }
    /**
     * Sets the skuId property value. The object ID of the SKU associated with this subscription.
     * @param value Value to set for the skuId property.
     */
    public void setSkuId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("skuId", value);
    }
    /**
     * Sets the skuPartNumber property value. The SKU associated with this subscription.
     * @param value Value to set for the skuPartNumber property.
     */
    public void setSkuPartNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("skuPartNumber", value);
    }
    /**
     * Sets the status property value. The status of this subscription. Possible values are: Enabled, Deleted, Suspended, Warning, LockedOut.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the totalLicenses property value. The number of licenses included in this subscription.
     * @param value Value to set for the totalLicenses property.
     */
    public void setTotalLicenses(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalLicenses", value);
    }
}
