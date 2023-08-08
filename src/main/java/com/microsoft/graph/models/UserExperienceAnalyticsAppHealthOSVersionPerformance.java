package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics device OS version performance entity contains OS version performance details.
 */
public class UserExperienceAnalyticsAppHealthOSVersionPerformance extends Entity implements Parsable {
    /**
     * The number of active devices for the OS version. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer activeDeviceCount;
    /**
     * The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     */
    private Integer meanTimeToFailureInMinutes;
    /**
     * The OS build number installed on the device. Supports: $select, $OrderBy. Read-only.
     */
    private String osBuildNumber;
    /**
     * The OS version installed on the device. Supports: $select, $OrderBy. Read-only.
     */
    private String osVersion;
    /**
     * The application health score of the OS version. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    private Double osVersionAppHealthScore;
    /**
     * Instantiates a new userExperienceAnalyticsAppHealthOSVersionPerformance and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsAppHealthOSVersionPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAppHealthOSVersionPerformance
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthOSVersionPerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthOSVersionPerformance();
    }
    /**
     * Gets the activeDeviceCount property value. The number of active devices for the OS version. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDeviceCount() {
        return this.activeDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDeviceCount", (n) -> { this.setActiveDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("meanTimeToFailureInMinutes", (n) -> { this.setMeanTimeToFailureInMinutes(n.getIntegerValue()); });
        deserializerMap.put("osBuildNumber", (n) -> { this.setOsBuildNumber(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("osVersionAppHealthScore", (n) -> { this.setOsVersionAppHealthScore(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the meanTimeToFailureInMinutes property value. The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this.meanTimeToFailureInMinutes;
    }
    /**
     * Gets the osBuildNumber property value. The OS build number installed on the device. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsBuildNumber() {
        return this.osBuildNumber;
    }
    /**
     * Gets the osVersion property value. The OS version installed on the device. Supports: $select, $OrderBy. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the osVersionAppHealthScore property value. The application health score of the OS version. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getOsVersionAppHealthScore() {
        return this.osVersionAppHealthScore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDeviceCount", this.getActiveDeviceCount());
        writer.writeIntegerValue("meanTimeToFailureInMinutes", this.getMeanTimeToFailureInMinutes());
        writer.writeStringValue("osBuildNumber", this.getOsBuildNumber());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeDoubleValue("osVersionAppHealthScore", this.getOsVersionAppHealthScore());
    }
    /**
     * Sets the activeDeviceCount property value. The number of active devices for the OS version. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the activeDeviceCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setActiveDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.activeDeviceCount = value;
    }
    /**
     * Sets the meanTimeToFailureInMinutes property value. The mean time to failure for the application in minutes. Valid values 0 to 2147483647. Supports: $filter, $select, $OrderBy. Read-only. Valid values -2147483648 to 2147483647
     * @param value Value to set for the meanTimeToFailureInMinutes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMeanTimeToFailureInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.meanTimeToFailureInMinutes = value;
    }
    /**
     * Sets the osBuildNumber property value. The OS build number installed on the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the osBuildNumber property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOsBuildNumber(@jakarta.annotation.Nullable final String value) {
        this.osBuildNumber = value;
    }
    /**
     * Sets the osVersion property value. The OS version installed on the device. Supports: $select, $OrderBy. Read-only.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the osVersionAppHealthScore property value. The application health score of the OS version. Valid values 0 to 100. Supports: $filter, $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the osVersionAppHealthScore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOsVersionAppHealthScore(@jakarta.annotation.Nullable final Double value) {
        this.osVersionAppHealthScore = value;
    }
}
