package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StorageQuotaBreakdown extends Entity implements Parsable {
    /**
     * Instantiates a new {@link StorageQuotaBreakdown} and sets the default values.
     */
    public StorageQuotaBreakdown() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StorageQuotaBreakdown}
     */
    @jakarta.annotation.Nonnull
    public static StorageQuotaBreakdown createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.serviceStorageQuotaBreakdown": return new ServiceStorageQuotaBreakdown();
            }
        }
        return new StorageQuotaBreakdown();
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("manageWebUrl", (n) -> { this.setManageWebUrl(n.getStringValue()); });
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("manageWebUrl", this.getManageWebUrl());
        writer.writeLongValue("used", this.getUsed());
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the manageWebUrl property value. The manageWebUrl property
     * @param value Value to set for the manageWebUrl property.
     */
    public void setManageWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manageWebUrl", value);
    }
    /**
     * Sets the used property value. The used property
     * @param value Value to set for the used property.
     */
    public void setUsed(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("used", value);
    }
}
