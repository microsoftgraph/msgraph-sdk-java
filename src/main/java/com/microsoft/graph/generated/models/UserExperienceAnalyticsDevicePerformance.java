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
 * The user experience analytics device performance entity contains device boot performance details.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsDevicePerformance extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserExperienceAnalyticsDevicePerformance} and sets the default values.
     */
    public UserExperienceAnalyticsDevicePerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserExperienceAnalyticsDevicePerformance}
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsDevicePerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDevicePerformance();
    }
    /**
     * Gets the averageBlueScreens property value. Average (mean) number of Blue Screens per device in the last 30 days. Valid values 0 to 9999999
     * @return a {@link UserExperienceAnalyticsDevicePerformanceAverageBlueScreens}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsDevicePerformanceAverageBlueScreens getAverageBlueScreens() {
        return this.backingStore.get("averageBlueScreens");
    }
    /**
     * Gets the averageRestarts property value. Average (mean) number of Restarts per device in the last 30 days. Valid values 0 to 9999999
     * @return a {@link UserExperienceAnalyticsDevicePerformanceAverageRestarts}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsDevicePerformanceAverageRestarts getAverageRestarts() {
        return this.backingStore.get("averageRestarts");
    }
    /**
     * Gets the blueScreenCount property value. Number of Blue Screens in the last 30 days. Valid values 0 to 9999999
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBlueScreenCount() {
        return this.backingStore.get("blueScreenCount");
    }
    /**
     * Gets the bootScore property value. The user experience analytics device boot score.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBootScore() {
        return this.backingStore.get("bootScore");
    }
    /**
     * Gets the coreBootTimeInMs property value. The user experience analytics device core boot time in milliseconds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCoreBootTimeInMs() {
        return this.backingStore.get("coreBootTimeInMs");
    }
    /**
     * Gets the coreLoginTimeInMs property value. The user experience analytics device core login time in milliseconds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCoreLoginTimeInMs() {
        return this.backingStore.get("coreLoginTimeInMs");
    }
    /**
     * Gets the deviceCount property value. User experience analytics summarized device count.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDeviceCount() {
        return this.backingStore.get("deviceCount");
    }
    /**
     * Gets the deviceName property value. The user experience analytics device name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the diskType property value. The diskType property
     * @return a {@link DiskType}
     */
    @jakarta.annotation.Nullable
    public DiskType getDiskType() {
        return this.backingStore.get("diskType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("averageBlueScreens", (n) -> { this.setAverageBlueScreens(n.getObjectValue(UserExperienceAnalyticsDevicePerformanceAverageBlueScreens::createFromDiscriminatorValue)); });
        deserializerMap.put("averageRestarts", (n) -> { this.setAverageRestarts(n.getObjectValue(UserExperienceAnalyticsDevicePerformanceAverageRestarts::createFromDiscriminatorValue)); });
        deserializerMap.put("blueScreenCount", (n) -> { this.setBlueScreenCount(n.getIntegerValue()); });
        deserializerMap.put("bootScore", (n) -> { this.setBootScore(n.getIntegerValue()); });
        deserializerMap.put("coreBootTimeInMs", (n) -> { this.setCoreBootTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("coreLoginTimeInMs", (n) -> { this.setCoreLoginTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getLongValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("diskType", (n) -> { this.setDiskType(n.getEnumValue(DiskType::forValue)); });
        deserializerMap.put("groupPolicyBootTimeInMs", (n) -> { this.setGroupPolicyBootTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("groupPolicyLoginTimeInMs", (n) -> { this.setGroupPolicyLoginTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState::forValue)); });
        deserializerMap.put("loginScore", (n) -> { this.setLoginScore(n.getIntegerValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("modelStartupPerformanceScore", (n) -> { this.setModelStartupPerformanceScore(n.getObjectValue(UserExperienceAnalyticsDevicePerformanceModelStartupPerformanceScore::createFromDiscriminatorValue)); });
        deserializerMap.put("operatingSystemVersion", (n) -> { this.setOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("responsiveDesktopTimeInMs", (n) -> { this.setResponsiveDesktopTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("restartCount", (n) -> { this.setRestartCount(n.getIntegerValue()); });
        deserializerMap.put("startupPerformanceScore", (n) -> { this.setStartupPerformanceScore(n.getObjectValue(UserExperienceAnalyticsDevicePerformanceStartupPerformanceScore::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyBootTimeInMs property value. The user experience analytics device group policy boot time in milliseconds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getGroupPolicyBootTimeInMs() {
        return this.backingStore.get("groupPolicyBootTimeInMs");
    }
    /**
     * Gets the groupPolicyLoginTimeInMs property value. The user experience analytics device group policy login time in milliseconds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getGroupPolicyLoginTimeInMs() {
        return this.backingStore.get("groupPolicyLoginTimeInMs");
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
     * Gets the loginScore property value. The user experience analytics device login score.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLoginScore() {
        return this.backingStore.get("loginScore");
    }
    /**
     * Gets the manufacturer property value. The user experience analytics device manufacturer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. The user experience analytics device model.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the modelStartupPerformanceScore property value. The user experience analytics model level startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsDevicePerformanceModelStartupPerformanceScore}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsDevicePerformanceModelStartupPerformanceScore getModelStartupPerformanceScore() {
        return this.backingStore.get("modelStartupPerformanceScore");
    }
    /**
     * Gets the operatingSystemVersion property value. The user experience analytics device Operating System version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystemVersion() {
        return this.backingStore.get("operatingSystemVersion");
    }
    /**
     * Gets the responsiveDesktopTimeInMs property value. The user experience analytics responsive desktop time in milliseconds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getResponsiveDesktopTimeInMs() {
        return this.backingStore.get("responsiveDesktopTimeInMs");
    }
    /**
     * Gets the restartCount property value. Number of Restarts in the last 30 days. Valid values 0 to 9999999
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRestartCount() {
        return this.backingStore.get("restartCount");
    }
    /**
     * Gets the startupPerformanceScore property value. The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a {@link UserExperienceAnalyticsDevicePerformanceStartupPerformanceScore}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsDevicePerformanceStartupPerformanceScore getStartupPerformanceScore() {
        return this.backingStore.get("startupPerformanceScore");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("averageBlueScreens", this.getAverageBlueScreens());
        writer.writeObjectValue("averageRestarts", this.getAverageRestarts());
        writer.writeIntegerValue("blueScreenCount", this.getBlueScreenCount());
        writer.writeIntegerValue("bootScore", this.getBootScore());
        writer.writeIntegerValue("coreBootTimeInMs", this.getCoreBootTimeInMs());
        writer.writeIntegerValue("coreLoginTimeInMs", this.getCoreLoginTimeInMs());
        writer.writeLongValue("deviceCount", this.getDeviceCount());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeEnumValue("diskType", this.getDiskType());
        writer.writeIntegerValue("groupPolicyBootTimeInMs", this.getGroupPolicyBootTimeInMs());
        writer.writeIntegerValue("groupPolicyLoginTimeInMs", this.getGroupPolicyLoginTimeInMs());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeIntegerValue("loginScore", this.getLoginScore());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeObjectValue("modelStartupPerformanceScore", this.getModelStartupPerformanceScore());
        writer.writeStringValue("operatingSystemVersion", this.getOperatingSystemVersion());
        writer.writeIntegerValue("responsiveDesktopTimeInMs", this.getResponsiveDesktopTimeInMs());
        writer.writeIntegerValue("restartCount", this.getRestartCount());
        writer.writeObjectValue("startupPerformanceScore", this.getStartupPerformanceScore());
    }
    /**
     * Sets the averageBlueScreens property value. Average (mean) number of Blue Screens per device in the last 30 days. Valid values 0 to 9999999
     * @param value Value to set for the averageBlueScreens property.
     */
    public void setAverageBlueScreens(@jakarta.annotation.Nullable final UserExperienceAnalyticsDevicePerformanceAverageBlueScreens value) {
        this.backingStore.set("averageBlueScreens", value);
    }
    /**
     * Sets the averageRestarts property value. Average (mean) number of Restarts per device in the last 30 days. Valid values 0 to 9999999
     * @param value Value to set for the averageRestarts property.
     */
    public void setAverageRestarts(@jakarta.annotation.Nullable final UserExperienceAnalyticsDevicePerformanceAverageRestarts value) {
        this.backingStore.set("averageRestarts", value);
    }
    /**
     * Sets the blueScreenCount property value. Number of Blue Screens in the last 30 days. Valid values 0 to 9999999
     * @param value Value to set for the blueScreenCount property.
     */
    public void setBlueScreenCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("blueScreenCount", value);
    }
    /**
     * Sets the bootScore property value. The user experience analytics device boot score.
     * @param value Value to set for the bootScore property.
     */
    public void setBootScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("bootScore", value);
    }
    /**
     * Sets the coreBootTimeInMs property value. The user experience analytics device core boot time in milliseconds.
     * @param value Value to set for the coreBootTimeInMs property.
     */
    public void setCoreBootTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("coreBootTimeInMs", value);
    }
    /**
     * Sets the coreLoginTimeInMs property value. The user experience analytics device core login time in milliseconds.
     * @param value Value to set for the coreLoginTimeInMs property.
     */
    public void setCoreLoginTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("coreLoginTimeInMs", value);
    }
    /**
     * Sets the deviceCount property value. User experience analytics summarized device count.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("deviceCount", value);
    }
    /**
     * Sets the deviceName property value. The user experience analytics device name.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the diskType property value. The diskType property
     * @param value Value to set for the diskType property.
     */
    public void setDiskType(@jakarta.annotation.Nullable final DiskType value) {
        this.backingStore.set("diskType", value);
    }
    /**
     * Sets the groupPolicyBootTimeInMs property value. The user experience analytics device group policy boot time in milliseconds.
     * @param value Value to set for the groupPolicyBootTimeInMs property.
     */
    public void setGroupPolicyBootTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("groupPolicyBootTimeInMs", value);
    }
    /**
     * Sets the groupPolicyLoginTimeInMs property value. The user experience analytics device group policy login time in milliseconds.
     * @param value Value to set for the groupPolicyLoginTimeInMs property.
     */
    public void setGroupPolicyLoginTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("groupPolicyLoginTimeInMs", value);
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.backingStore.set("healthStatus", value);
    }
    /**
     * Sets the loginScore property value. The user experience analytics device login score.
     * @param value Value to set for the loginScore property.
     */
    public void setLoginScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("loginScore", value);
    }
    /**
     * Sets the manufacturer property value. The user experience analytics device manufacturer.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. The user experience analytics device model.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the modelStartupPerformanceScore property value. The user experience analytics model level startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the modelStartupPerformanceScore property.
     */
    public void setModelStartupPerformanceScore(@jakarta.annotation.Nullable final UserExperienceAnalyticsDevicePerformanceModelStartupPerformanceScore value) {
        this.backingStore.set("modelStartupPerformanceScore", value);
    }
    /**
     * Sets the operatingSystemVersion property value. The user experience analytics device Operating System version.
     * @param value Value to set for the operatingSystemVersion property.
     */
    public void setOperatingSystemVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystemVersion", value);
    }
    /**
     * Sets the responsiveDesktopTimeInMs property value. The user experience analytics responsive desktop time in milliseconds.
     * @param value Value to set for the responsiveDesktopTimeInMs property.
     */
    public void setResponsiveDesktopTimeInMs(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("responsiveDesktopTimeInMs", value);
    }
    /**
     * Sets the restartCount property value. Number of Restarts in the last 30 days. Valid values 0 to 9999999
     * @param value Value to set for the restartCount property.
     */
    public void setRestartCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("restartCount", value);
    }
    /**
     * Sets the startupPerformanceScore property value. The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the startupPerformanceScore property.
     */
    public void setStartupPerformanceScore(@jakarta.annotation.Nullable final UserExperienceAnalyticsDevicePerformanceStartupPerformanceScore value) {
        this.backingStore.set("startupPerformanceScore", value);
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class UserExperienceAnalyticsDevicePerformanceAverageBlueScreens implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsDevicePerformanceAverageBlueScreens} and sets the default values.
         */
        public UserExperienceAnalyticsDevicePerformanceAverageBlueScreens() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsDevicePerformanceAverageBlueScreens}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsDevicePerformanceAverageBlueScreens createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsDevicePerformanceAverageBlueScreens result = new UserExperienceAnalyticsDevicePerformanceAverageBlueScreens();
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
    public static class UserExperienceAnalyticsDevicePerformanceAverageRestarts implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsDevicePerformanceAverageRestarts} and sets the default values.
         */
        public UserExperienceAnalyticsDevicePerformanceAverageRestarts() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsDevicePerformanceAverageRestarts}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsDevicePerformanceAverageRestarts createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsDevicePerformanceAverageRestarts result = new UserExperienceAnalyticsDevicePerformanceAverageRestarts();
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
    public static class UserExperienceAnalyticsDevicePerformanceModelStartupPerformanceScore implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsDevicePerformanceModelStartupPerformanceScore} and sets the default values.
         */
        public UserExperienceAnalyticsDevicePerformanceModelStartupPerformanceScore() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsDevicePerformanceModelStartupPerformanceScore}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsDevicePerformanceModelStartupPerformanceScore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsDevicePerformanceModelStartupPerformanceScore result = new UserExperienceAnalyticsDevicePerformanceModelStartupPerformanceScore();
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
    public static class UserExperienceAnalyticsDevicePerformanceStartupPerformanceScore implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link UserExperienceAnalyticsDevicePerformanceStartupPerformanceScore} and sets the default values.
         */
        public UserExperienceAnalyticsDevicePerformanceStartupPerformanceScore() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link UserExperienceAnalyticsDevicePerformanceStartupPerformanceScore}
         */
        @jakarta.annotation.Nonnull
        public static UserExperienceAnalyticsDevicePerformanceStartupPerformanceScore createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final UserExperienceAnalyticsDevicePerformanceStartupPerformanceScore result = new UserExperienceAnalyticsDevicePerformanceStartupPerformanceScore();
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
