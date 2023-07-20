package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Exchange Access State summary
 */
public class DeviceExchangeAccessStateSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Total count of devices with Exchange Access State: Allowed.
     */
    private Integer allowedDeviceCount;
    /**
     * Total count of devices with Exchange Access State: Blocked.
     */
    private Integer blockedDeviceCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Total count of devices with Exchange Access State: Quarantined.
     */
    private Integer quarantinedDeviceCount;
    /**
     * Total count of devices for which no Exchange Access State could be found.
     */
    private Integer unavailableDeviceCount;
    /**
     * Total count of devices with Exchange Access State: Unknown.
     */
    private Integer unknownDeviceCount;
    /**
     * Instantiates a new deviceExchangeAccessStateSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceExchangeAccessStateSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceExchangeAccessStateSummary
     */
    @javax.annotation.Nonnull
    public static DeviceExchangeAccessStateSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceExchangeAccessStateSummary();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the allowedDeviceCount property value. Total count of devices with Exchange Access State: Allowed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAllowedDeviceCount() {
        return this.allowedDeviceCount;
    }
    /**
     * Gets the blockedDeviceCount property value. Total count of devices with Exchange Access State: Blocked.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBlockedDeviceCount() {
        return this.blockedDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("allowedDeviceCount", (n) -> { this.setAllowedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("blockedDeviceCount", (n) -> { this.setBlockedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("quarantinedDeviceCount", (n) -> { this.setQuarantinedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("unavailableDeviceCount", (n) -> { this.setUnavailableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("unknownDeviceCount", (n) -> { this.setUnknownDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the quarantinedDeviceCount property value. Total count of devices with Exchange Access State: Quarantined.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getQuarantinedDeviceCount() {
        return this.quarantinedDeviceCount;
    }
    /**
     * Gets the unavailableDeviceCount property value. Total count of devices for which no Exchange Access State could be found.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnavailableDeviceCount() {
        return this.unavailableDeviceCount;
    }
    /**
     * Gets the unknownDeviceCount property value. Total count of devices with Exchange Access State: Unknown.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this.unknownDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("allowedDeviceCount", this.getAllowedDeviceCount());
        writer.writeIntegerValue("blockedDeviceCount", this.getBlockedDeviceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("quarantinedDeviceCount", this.getQuarantinedDeviceCount());
        writer.writeIntegerValue("unavailableDeviceCount", this.getUnavailableDeviceCount());
        writer.writeIntegerValue("unknownDeviceCount", this.getUnknownDeviceCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowedDeviceCount property value. Total count of devices with Exchange Access State: Allowed.
     * @param value Value to set for the allowedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.allowedDeviceCount = value;
    }
    /**
     * Sets the blockedDeviceCount property value. Total count of devices with Exchange Access State: Blocked.
     * @param value Value to set for the blockedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.blockedDeviceCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the quarantinedDeviceCount property value. Total count of devices with Exchange Access State: Quarantined.
     * @param value Value to set for the quarantinedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuarantinedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.quarantinedDeviceCount = value;
    }
    /**
     * Sets the unavailableDeviceCount property value. Total count of devices for which no Exchange Access State could be found.
     * @param value Value to set for the unavailableDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnavailableDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.unavailableDeviceCount = value;
    }
    /**
     * Sets the unknownDeviceCount property value. Total count of devices with Exchange Access State: Unknown.
     * @param value Value to set for the unknownDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnknownDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.unknownDeviceCount = value;
    }
}
