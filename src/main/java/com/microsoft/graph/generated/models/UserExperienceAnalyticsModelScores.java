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
 * The user experience analytics model scores entity consolidates the various Endpoint Analytics scores.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsModelScores extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserExperienceAnalyticsModelScores} and sets the default values.
     */
    public UserExperienceAnalyticsModelScores() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserExperienceAnalyticsModelScores}
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsModelScores createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsModelScores();
    }
    /**
     * Gets the appReliabilityScore property value. Indicates a score calculated from application health data to indicate when a device is having problems running one or more applications. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsModelScoresAppReliabilityScore}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsModelScoresAppReliabilityScore getAppReliabilityScore() {
        return this.backingStore.get("appReliabilityScore");
    }
    /**
     * Gets the batteryHealthScore property value. Indicates a calulated score indicating the health of the device's battery. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsModelScoresBatteryHealthScore}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsModelScoresBatteryHealthScore getBatteryHealthScore() {
        return this.backingStore.get("batteryHealthScore");
    }
    /**
     * Gets the endpointAnalyticsScore property value. Indicates a weighted average of the various scores. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsModelScoresEndpointAnalyticsScore}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsModelScoresEndpointAnalyticsScore getEndpointAnalyticsScore() {
        return this.backingStore.get("endpointAnalyticsScore");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appReliabilityScore", (n) -> { this.setAppReliabilityScore(n.getObjectValue(UserExperienceAnalyticsModelScoresAppReliabilityScore::createFromDiscriminatorValue)); });
        deserializerMap.put("batteryHealthScore", (n) -> { this.setBatteryHealthScore(n.getObjectValue(UserExperienceAnalyticsModelScoresBatteryHealthScore::createFromDiscriminatorValue)); });
        deserializerMap.put("endpointAnalyticsScore", (n) -> { this.setEndpointAnalyticsScore(n.getObjectValue(UserExperienceAnalyticsModelScoresEndpointAnalyticsScore::createFromDiscriminatorValue)); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState::forValue)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("modelDeviceCount", (n) -> { this.setModelDeviceCount(n.getLongValue()); });
        deserializerMap.put("startupPerformanceScore", (n) -> { this.setStartupPerformanceScore(n.getObjectValue(UserExperienceAnalyticsModelScoresStartupPerformanceScore::createFromDiscriminatorValue)); });
        deserializerMap.put("workFromAnywhereScore", (n) -> { this.setWorkFromAnywhereScore(n.getObjectValue(UserExperienceAnalyticsModelScoresWorkFromAnywhereScore::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a {@link UserExperienceAnalyticsHealthState}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this.backingStore.get("healthStatus");
    }
    /**
     * Gets the manufacturer property value. The manufacturer name of the device. Examples: Microsoft Corporation, HP, Lenovo. Supports: $select, $OrderBy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the modelDeviceCount property value. Indicates unique devices count of given model in a consolidated report. Supports: $select, $OrderBy. Read-only. Valid values -9.22337203685478E+18 to 9.22337203685478E+18
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getModelDeviceCount() {
        return this.backingStore.get("modelDeviceCount");
    }
    /**
     * Gets the startupPerformanceScore property value. Indicates a weighted average of boot score and logon score used for measuring startup performance. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsModelScoresStartupPerformanceScore}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsModelScoresStartupPerformanceScore getStartupPerformanceScore() {
        return this.backingStore.get("startupPerformanceScore");
    }
    /**
     * Gets the workFromAnywhereScore property value. Indicates a weighted score of the work from anywhere on a device level. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsModelScoresWorkFromAnywhereScore}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsModelScoresWorkFromAnywhereScore getWorkFromAnywhereScore() {
        return this.backingStore.get("workFromAnywhereScore");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("appReliabilityScore", this.getAppReliabilityScore());
        writer.writeObjectValue("batteryHealthScore", this.getBatteryHealthScore());
        writer.writeObjectValue("endpointAnalyticsScore", this.getEndpointAnalyticsScore());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeLongValue("modelDeviceCount", this.getModelDeviceCount());
        writer.writeObjectValue("startupPerformanceScore", this.getStartupPerformanceScore());
        writer.writeObjectValue("workFromAnywhereScore", this.getWorkFromAnywhereScore());
    }
    /**
     * Sets the appReliabilityScore property value. Indicates a score calculated from application health data to indicate when a device is having problems running one or more applications. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the appReliabilityScore property.
     */
    public void setAppReliabilityScore(@jakarta.annotation.Nullable final UserExperienceAnalyticsModelScoresAppReliabilityScore value) {
        this.backingStore.set("appReliabilityScore", value);
    }
    /**
     * Sets the batteryHealthScore property value. Indicates a calulated score indicating the health of the device's battery. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the batteryHealthScore property.
     */
    public void setBatteryHealthScore(@jakarta.annotation.Nullable final UserExperienceAnalyticsModelScoresBatteryHealthScore value) {
        this.backingStore.set("batteryHealthScore", value);
    }
    /**
     * Sets the endpointAnalyticsScore property value. Indicates a weighted average of the various scores. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the endpointAnalyticsScore property.
     */
    public void setEndpointAnalyticsScore(@jakarta.annotation.Nullable final UserExperienceAnalyticsModelScoresEndpointAnalyticsScore value) {
        this.backingStore.set("endpointAnalyticsScore", value);
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.backingStore.set("healthStatus", value);
    }
    /**
     * Sets the manufacturer property value. The manufacturer name of the device. Examples: Microsoft Corporation, HP, Lenovo. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. The model name of the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the modelDeviceCount property value. Indicates unique devices count of given model in a consolidated report. Supports: $select, $OrderBy. Read-only. Valid values -9.22337203685478E+18 to 9.22337203685478E+18
     * @param value Value to set for the modelDeviceCount property.
     */
    public void setModelDeviceCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("modelDeviceCount", value);
    }
    /**
     * Sets the startupPerformanceScore property value. Indicates a weighted average of boot score and logon score used for measuring startup performance. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the startupPerformanceScore property.
     */
    public void setStartupPerformanceScore(@jakarta.annotation.Nullable final UserExperienceAnalyticsModelScoresStartupPerformanceScore value) {
        this.backingStore.set("startupPerformanceScore", value);
    }
    /**
     * Sets the workFromAnywhereScore property value. Indicates a weighted score of the work from anywhere on a device level. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the workFromAnywhereScore property.
     */
    public void setWorkFromAnywhereScore(@jakarta.annotation.Nullable final UserExperienceAnalyticsModelScoresWorkFromAnywhereScore value) {
        this.backingStore.set("workFromAnywhereScore", value);
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class UserExperienceAnalyticsModelScoresAppReliabilityScore implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsModelScoresAppReliabilityScore} and sets the default values.
         */
        public UserExperienceAnalyticsModelScoresAppReliabilityScore() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsModelScoresAppReliabilityScore}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsModelScoresAppReliabilityScore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsModelScoresAppReliabilityScore result = new UserExperienceAnalyticsModelScoresAppReliabilityScore();
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
    public static class UserExperienceAnalyticsModelScoresBatteryHealthScore implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsModelScoresBatteryHealthScore} and sets the default values.
         */
        public UserExperienceAnalyticsModelScoresBatteryHealthScore() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsModelScoresBatteryHealthScore}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsModelScoresBatteryHealthScore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsModelScoresBatteryHealthScore result = new UserExperienceAnalyticsModelScoresBatteryHealthScore();
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
    public static class UserExperienceAnalyticsModelScoresEndpointAnalyticsScore implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsModelScoresEndpointAnalyticsScore} and sets the default values.
         */
        public UserExperienceAnalyticsModelScoresEndpointAnalyticsScore() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsModelScoresEndpointAnalyticsScore}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsModelScoresEndpointAnalyticsScore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsModelScoresEndpointAnalyticsScore result = new UserExperienceAnalyticsModelScoresEndpointAnalyticsScore();
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
    public static class UserExperienceAnalyticsModelScoresStartupPerformanceScore implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsModelScoresStartupPerformanceScore} and sets the default values.
         */
        public UserExperienceAnalyticsModelScoresStartupPerformanceScore() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsModelScoresStartupPerformanceScore}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsModelScoresStartupPerformanceScore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsModelScoresStartupPerformanceScore result = new UserExperienceAnalyticsModelScoresStartupPerformanceScore();
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
    public static class UserExperienceAnalyticsModelScoresWorkFromAnywhereScore implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsModelScoresWorkFromAnywhereScore} and sets the default values.
         */
        public UserExperienceAnalyticsModelScoresWorkFromAnywhereScore() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsModelScoresWorkFromAnywhereScore}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsModelScoresWorkFromAnywhereScore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsModelScoresWorkFromAnywhereScore result = new UserExperienceAnalyticsModelScoresWorkFromAnywhereScore();
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
