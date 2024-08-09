package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedStorageQuota extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UnifiedStorageQuota} and sets the default values.
     */
    public UnifiedStorageQuota() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedStorageQuota}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedStorageQuota createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedStorageQuota();
    }
    /**
     * Gets the deleted property value. The deleted property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDeleted() {
        return this.backingStore.get("deleted");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deleted", (n) -> { this.setDeleted(n.getLongValue()); });
        deserializerMap.put("manageWebUrl", (n) -> { this.setManageWebUrl(n.getStringValue()); });
        deserializerMap.put("remaining", (n) -> { this.setRemaining(n.getLongValue()); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(ServiceStorageQuotaBreakdown::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getLongValue()); });
        deserializerMap.put("used", (n) -> { this.setUsed(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the manageWebUrl property value. The manageWebUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManageWebUrl() {
        return this.backingStore.get("manageWebUrl");
    }
    /**
     * Gets the remaining property value. The remaining property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRemaining() {
        return this.backingStore.get("remaining");
    }
    /**
     * Gets the services property value. The services property
     * @return a {@link java.util.List<ServiceStorageQuotaBreakdown>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceStorageQuotaBreakdown> getServices() {
        return this.backingStore.get("services");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the total property value. The total property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotal() {
        return this.backingStore.get("total");
    }
    /**
     * Gets the used property value. The used property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getUsed() {
        return this.backingStore.get("used");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("deleted", this.getDeleted());
        writer.writeStringValue("manageWebUrl", this.getManageWebUrl());
        writer.writeLongValue("remaining", this.getRemaining());
        writer.writeCollectionOfObjectValues("services", this.getServices());
        writer.writeStringValue("state", this.getState());
        writer.writeLongValue("total", this.getTotal());
        writer.writeLongValue("used", this.getUsed());
    }
    /**
     * Sets the deleted property value. The deleted property
     * @param value Value to set for the deleted property.
     */
    public void setDeleted(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("deleted", value);
    }
    /**
     * Sets the manageWebUrl property value. The manageWebUrl property
     * @param value Value to set for the manageWebUrl property.
     */
    public void setManageWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manageWebUrl", value);
    }
    /**
     * Sets the remaining property value. The remaining property
     * @param value Value to set for the remaining property.
     */
    public void setRemaining(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("remaining", value);
    }
    /**
     * Sets the services property value. The services property
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<ServiceStorageQuotaBreakdown> value) {
        this.backingStore.set("services", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the total property value. The total property
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("total", value);
    }
    /**
     * Sets the used property value. The used property
     * @param value Value to set for the used property.
     */
    public void setUsed(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("used", value);
    }
}
