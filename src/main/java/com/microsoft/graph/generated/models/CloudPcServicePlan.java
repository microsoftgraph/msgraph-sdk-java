package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcServicePlan extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcServicePlan} and sets the default values.
     */
    public CloudPcServicePlan() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcServicePlan}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcServicePlan createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcServicePlan();
    }
    /**
     * Gets the displayName property value. The name for the service plan. Read-only.
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
        deserializerMap.put("ramInGB", (n) -> { this.setRamInGB(n.getIntegerValue()); });
        deserializerMap.put("storageInGB", (n) -> { this.setStorageInGB(n.getIntegerValue()); });
        deserializerMap.put("vCpuCount", (n) -> { this.setVCpuCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ramInGB property value. The size of the RAM in GB. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRamInGB() {
        return this.backingStore.get("ramInGB");
    }
    /**
     * Gets the storageInGB property value. The size of the operating system disk in GB. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStorageInGB() {
        return this.backingStore.get("storageInGB");
    }
    /**
     * Gets the vCpuCount property value. The number of vCPUs. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVCpuCount() {
        return this.backingStore.get("vCpuCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("ramInGB", this.getRamInGB());
        writer.writeIntegerValue("storageInGB", this.getStorageInGB());
        writer.writeIntegerValue("vCpuCount", this.getVCpuCount());
    }
    /**
     * Sets the displayName property value. The name for the service plan. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the ramInGB property value. The size of the RAM in GB. Read-only.
     * @param value Value to set for the ramInGB property.
     */
    public void setRamInGB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("ramInGB", value);
    }
    /**
     * Sets the storageInGB property value. The size of the operating system disk in GB. Read-only.
     * @param value Value to set for the storageInGB property.
     */
    public void setStorageInGB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("storageInGB", value);
    }
    /**
     * Sets the vCpuCount property value. The number of vCPUs. Read-only.
     * @param value Value to set for the vCpuCount property.
     */
    public void setVCpuCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("vCpuCount", value);
    }
}
