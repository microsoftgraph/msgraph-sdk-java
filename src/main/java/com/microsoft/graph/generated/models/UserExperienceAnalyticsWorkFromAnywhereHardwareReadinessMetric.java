package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics hardware readiness entity contains account level information about hardware blockers for windows upgrade.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric} and sets the default values.
     */
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric}
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("osCheckFailedPercentage", (n) -> { this.setOsCheckFailedPercentage(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricOsCheckFailedPercentage::createFromDiscriminatorValue)); });
        deserializerMap.put("processor64BitCheckFailedPercentage", (n) -> { this.setProcessor64BitCheckFailedPercentage(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessor64BitCheckFailedPercentage::createFromDiscriminatorValue)); });
        deserializerMap.put("processorCoreCountCheckFailedPercentage", (n) -> { this.setProcessorCoreCountCheckFailedPercentage(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorCoreCountCheckFailedPercentage::createFromDiscriminatorValue)); });
        deserializerMap.put("processorFamilyCheckFailedPercentage", (n) -> { this.setProcessorFamilyCheckFailedPercentage(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorFamilyCheckFailedPercentage::createFromDiscriminatorValue)); });
        deserializerMap.put("processorSpeedCheckFailedPercentage", (n) -> { this.setProcessorSpeedCheckFailedPercentage(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorSpeedCheckFailedPercentage::createFromDiscriminatorValue)); });
        deserializerMap.put("ramCheckFailedPercentage", (n) -> { this.setRamCheckFailedPercentage(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRamCheckFailedPercentage::createFromDiscriminatorValue)); });
        deserializerMap.put("secureBootCheckFailedPercentage", (n) -> { this.setSecureBootCheckFailedPercentage(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricSecureBootCheckFailedPercentage::createFromDiscriminatorValue)); });
        deserializerMap.put("storageCheckFailedPercentage", (n) -> { this.setStorageCheckFailedPercentage(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricStorageCheckFailedPercentage::createFromDiscriminatorValue)); });
        deserializerMap.put("totalDeviceCount", (n) -> { this.setTotalDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("tpmCheckFailedPercentage", (n) -> { this.setTpmCheckFailedPercentage(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricTpmCheckFailedPercentage::createFromDiscriminatorValue)); });
        deserializerMap.put("upgradeEligibleDeviceCount", (n) -> { this.setUpgradeEligibleDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the osCheckFailedPercentage property value. The percentage of devices for which OS check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricOsCheckFailedPercentage}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricOsCheckFailedPercentage getOsCheckFailedPercentage() {
        return this.backingStore.get("osCheckFailedPercentage");
    }
    /**
     * Gets the processor64BitCheckFailedPercentage property value. The percentage of devices for which processor hardware 64-bit architecture check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessor64BitCheckFailedPercentage}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessor64BitCheckFailedPercentage getProcessor64BitCheckFailedPercentage() {
        return this.backingStore.get("processor64BitCheckFailedPercentage");
    }
    /**
     * Gets the processorCoreCountCheckFailedPercentage property value. The percentage of devices for which processor hardware core count check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorCoreCountCheckFailedPercentage}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorCoreCountCheckFailedPercentage getProcessorCoreCountCheckFailedPercentage() {
        return this.backingStore.get("processorCoreCountCheckFailedPercentage");
    }
    /**
     * Gets the processorFamilyCheckFailedPercentage property value. The percentage of devices for which processor hardware family check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorFamilyCheckFailedPercentage}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorFamilyCheckFailedPercentage getProcessorFamilyCheckFailedPercentage() {
        return this.backingStore.get("processorFamilyCheckFailedPercentage");
    }
    /**
     * Gets the processorSpeedCheckFailedPercentage property value. The percentage of devices for which processor hardware speed check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorSpeedCheckFailedPercentage}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorSpeedCheckFailedPercentage getProcessorSpeedCheckFailedPercentage() {
        return this.backingStore.get("processorSpeedCheckFailedPercentage");
    }
    /**
     * Gets the ramCheckFailedPercentage property value. The percentage of devices for which RAM hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRamCheckFailedPercentage}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRamCheckFailedPercentage getRamCheckFailedPercentage() {
        return this.backingStore.get("ramCheckFailedPercentage");
    }
    /**
     * Gets the secureBootCheckFailedPercentage property value. The percentage of devices for which secure boot hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricSecureBootCheckFailedPercentage}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricSecureBootCheckFailedPercentage getSecureBootCheckFailedPercentage() {
        return this.backingStore.get("secureBootCheckFailedPercentage");
    }
    /**
     * Gets the storageCheckFailedPercentage property value. The percentage of devices for which storage hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricStorageCheckFailedPercentage}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricStorageCheckFailedPercentage getStorageCheckFailedPercentage() {
        return this.backingStore.get("storageCheckFailedPercentage");
    }
    /**
     * Gets the totalDeviceCount property value. The count of total devices in an organization. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalDeviceCount() {
        return this.backingStore.get("totalDeviceCount");
    }
    /**
     * Gets the tpmCheckFailedPercentage property value. The percentage of devices for which Trusted Platform Module (TPM) hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricTpmCheckFailedPercentage}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricTpmCheckFailedPercentage getTpmCheckFailedPercentage() {
        return this.backingStore.get("tpmCheckFailedPercentage");
    }
    /**
     * Gets the upgradeEligibleDeviceCount property value. The count of devices in an organization eligible for windows upgrade. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUpgradeEligibleDeviceCount() {
        return this.backingStore.get("upgradeEligibleDeviceCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("osCheckFailedPercentage", this.getOsCheckFailedPercentage());
        writer.writeObjectValue("processor64BitCheckFailedPercentage", this.getProcessor64BitCheckFailedPercentage());
        writer.writeObjectValue("processorCoreCountCheckFailedPercentage", this.getProcessorCoreCountCheckFailedPercentage());
        writer.writeObjectValue("processorFamilyCheckFailedPercentage", this.getProcessorFamilyCheckFailedPercentage());
        writer.writeObjectValue("processorSpeedCheckFailedPercentage", this.getProcessorSpeedCheckFailedPercentage());
        writer.writeObjectValue("ramCheckFailedPercentage", this.getRamCheckFailedPercentage());
        writer.writeObjectValue("secureBootCheckFailedPercentage", this.getSecureBootCheckFailedPercentage());
        writer.writeObjectValue("storageCheckFailedPercentage", this.getStorageCheckFailedPercentage());
        writer.writeIntegerValue("totalDeviceCount", this.getTotalDeviceCount());
        writer.writeObjectValue("tpmCheckFailedPercentage", this.getTpmCheckFailedPercentage());
        writer.writeIntegerValue("upgradeEligibleDeviceCount", this.getUpgradeEligibleDeviceCount());
    }
    /**
     * Sets the osCheckFailedPercentage property value. The percentage of devices for which OS check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the osCheckFailedPercentage property.
     */
    public void setOsCheckFailedPercentage(@jakarta.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricOsCheckFailedPercentage value) {
        this.backingStore.set("osCheckFailedPercentage", value);
    }
    /**
     * Sets the processor64BitCheckFailedPercentage property value. The percentage of devices for which processor hardware 64-bit architecture check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the processor64BitCheckFailedPercentage property.
     */
    public void setProcessor64BitCheckFailedPercentage(@jakarta.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessor64BitCheckFailedPercentage value) {
        this.backingStore.set("processor64BitCheckFailedPercentage", value);
    }
    /**
     * Sets the processorCoreCountCheckFailedPercentage property value. The percentage of devices for which processor hardware core count check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the processorCoreCountCheckFailedPercentage property.
     */
    public void setProcessorCoreCountCheckFailedPercentage(@jakarta.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorCoreCountCheckFailedPercentage value) {
        this.backingStore.set("processorCoreCountCheckFailedPercentage", value);
    }
    /**
     * Sets the processorFamilyCheckFailedPercentage property value. The percentage of devices for which processor hardware family check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the processorFamilyCheckFailedPercentage property.
     */
    public void setProcessorFamilyCheckFailedPercentage(@jakarta.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorFamilyCheckFailedPercentage value) {
        this.backingStore.set("processorFamilyCheckFailedPercentage", value);
    }
    /**
     * Sets the processorSpeedCheckFailedPercentage property value. The percentage of devices for which processor hardware speed check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the processorSpeedCheckFailedPercentage property.
     */
    public void setProcessorSpeedCheckFailedPercentage(@jakarta.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorSpeedCheckFailedPercentage value) {
        this.backingStore.set("processorSpeedCheckFailedPercentage", value);
    }
    /**
     * Sets the ramCheckFailedPercentage property value. The percentage of devices for which RAM hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the ramCheckFailedPercentage property.
     */
    public void setRamCheckFailedPercentage(@jakarta.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRamCheckFailedPercentage value) {
        this.backingStore.set("ramCheckFailedPercentage", value);
    }
    /**
     * Sets the secureBootCheckFailedPercentage property value. The percentage of devices for which secure boot hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the secureBootCheckFailedPercentage property.
     */
    public void setSecureBootCheckFailedPercentage(@jakarta.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricSecureBootCheckFailedPercentage value) {
        this.backingStore.set("secureBootCheckFailedPercentage", value);
    }
    /**
     * Sets the storageCheckFailedPercentage property value. The percentage of devices for which storage hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the storageCheckFailedPercentage property.
     */
    public void setStorageCheckFailedPercentage(@jakarta.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricStorageCheckFailedPercentage value) {
        this.backingStore.set("storageCheckFailedPercentage", value);
    }
    /**
     * Sets the totalDeviceCount property value. The count of total devices in an organization. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the totalDeviceCount property.
     */
    public void setTotalDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalDeviceCount", value);
    }
    /**
     * Sets the tpmCheckFailedPercentage property value. The percentage of devices for which Trusted Platform Module (TPM) hardware check has failed. Valid values 0 to 100. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the tpmCheckFailedPercentage property.
     */
    public void setTpmCheckFailedPercentage(@jakarta.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricTpmCheckFailedPercentage value) {
        this.backingStore.set("tpmCheckFailedPercentage", value);
    }
    /**
     * Sets the upgradeEligibleDeviceCount property value. The count of devices in an organization eligible for windows upgrade. Valid values 0 to 2147483647. Supports: $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the upgradeEligibleDeviceCount property.
     */
    public void setUpgradeEligibleDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("upgradeEligibleDeviceCount", value);
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricOsCheckFailedPercentage implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricOsCheckFailedPercentage} and sets the default values.
         */
        public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricOsCheckFailedPercentage() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricOsCheckFailedPercentage}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricOsCheckFailedPercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricOsCheckFailedPercentage result = new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricOsCheckFailedPercentage();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessor64BitCheckFailedPercentage implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessor64BitCheckFailedPercentage} and sets the default values.
         */
        public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessor64BitCheckFailedPercentage() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessor64BitCheckFailedPercentage}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessor64BitCheckFailedPercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessor64BitCheckFailedPercentage result = new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessor64BitCheckFailedPercentage();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorCoreCountCheckFailedPercentage implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorCoreCountCheckFailedPercentage} and sets the default values.
         */
        public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorCoreCountCheckFailedPercentage() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorCoreCountCheckFailedPercentage}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorCoreCountCheckFailedPercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorCoreCountCheckFailedPercentage result = new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorCoreCountCheckFailedPercentage();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorFamilyCheckFailedPercentage implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorFamilyCheckFailedPercentage} and sets the default values.
         */
        public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorFamilyCheckFailedPercentage() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorFamilyCheckFailedPercentage}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorFamilyCheckFailedPercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorFamilyCheckFailedPercentage result = new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorFamilyCheckFailedPercentage();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorSpeedCheckFailedPercentage implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorSpeedCheckFailedPercentage} and sets the default values.
         */
        public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorSpeedCheckFailedPercentage() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorSpeedCheckFailedPercentage}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorSpeedCheckFailedPercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorSpeedCheckFailedPercentage result = new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricProcessorSpeedCheckFailedPercentage();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRamCheckFailedPercentage implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRamCheckFailedPercentage} and sets the default values.
         */
        public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRamCheckFailedPercentage() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRamCheckFailedPercentage}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRamCheckFailedPercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRamCheckFailedPercentage result = new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricRamCheckFailedPercentage();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricSecureBootCheckFailedPercentage implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricSecureBootCheckFailedPercentage} and sets the default values.
         */
        public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricSecureBootCheckFailedPercentage() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricSecureBootCheckFailedPercentage}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricSecureBootCheckFailedPercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricSecureBootCheckFailedPercentage result = new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricSecureBootCheckFailedPercentage();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricStorageCheckFailedPercentage implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricStorageCheckFailedPercentage} and sets the default values.
         */
        public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricStorageCheckFailedPercentage() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricStorageCheckFailedPercentage}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricStorageCheckFailedPercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricStorageCheckFailedPercentage result = new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricStorageCheckFailedPercentage();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricTpmCheckFailedPercentage implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricTpmCheckFailedPercentage} and sets the default values.
         */
        public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricTpmCheckFailedPercentage() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricTpmCheckFailedPercentage}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricTpmCheckFailedPercentage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricTpmCheckFailedPercentage result = new UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetricTpmCheckFailedPercentage();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
}
