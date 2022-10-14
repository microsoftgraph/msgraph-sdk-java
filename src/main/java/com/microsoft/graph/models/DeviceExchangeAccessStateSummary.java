package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device Exchange Access State summary */
public class DeviceExchangeAccessStateSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Total count of devices with Exchange Access State: Allowed. */
    private Integer _allowedDeviceCount;
    /** Total count of devices with Exchange Access State: Blocked. */
    private Integer _blockedDeviceCount;
    /** The OdataType property */
    private String _odataType;
    /** Total count of devices with Exchange Access State: Quarantined. */
    private Integer _quarantinedDeviceCount;
    /** Total count of devices for which no Exchange Access State could be found. */
    private Integer _unavailableDeviceCount;
    /** Total count of devices with Exchange Access State: Unknown. */
    private Integer _unknownDeviceCount;
    /**
     * Instantiates a new deviceExchangeAccessStateSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceExchangeAccessStateSummary() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceExchangeAccessStateSummary");
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
        return this._additionalData;
    }
    /**
     * Gets the allowedDeviceCount property value. Total count of devices with Exchange Access State: Allowed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAllowedDeviceCount() {
        return this._allowedDeviceCount;
    }
    /**
     * Gets the blockedDeviceCount property value. Total count of devices with Exchange Access State: Blocked.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBlockedDeviceCount() {
        return this._blockedDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceExchangeAccessStateSummary currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("allowedDeviceCount", (n) -> { currentObject.setAllowedDeviceCount(n.getIntegerValue()); });
            this.put("blockedDeviceCount", (n) -> { currentObject.setBlockedDeviceCount(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("quarantinedDeviceCount", (n) -> { currentObject.setQuarantinedDeviceCount(n.getIntegerValue()); });
            this.put("unavailableDeviceCount", (n) -> { currentObject.setUnavailableDeviceCount(n.getIntegerValue()); });
            this.put("unknownDeviceCount", (n) -> { currentObject.setUnknownDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the quarantinedDeviceCount property value. Total count of devices with Exchange Access State: Quarantined.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getQuarantinedDeviceCount() {
        return this._quarantinedDeviceCount;
    }
    /**
     * Gets the unavailableDeviceCount property value. Total count of devices for which no Exchange Access State could be found.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnavailableDeviceCount() {
        return this._unavailableDeviceCount;
    }
    /**
     * Gets the unknownDeviceCount property value. Total count of devices with Exchange Access State: Unknown.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this._unknownDeviceCount;
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the allowedDeviceCount property value. Total count of devices with Exchange Access State: Allowed.
     * @param value Value to set for the allowedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._allowedDeviceCount = value;
    }
    /**
     * Sets the blockedDeviceCount property value. Total count of devices with Exchange Access State: Blocked.
     * @param value Value to set for the blockedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._blockedDeviceCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the quarantinedDeviceCount property value. Total count of devices with Exchange Access State: Quarantined.
     * @param value Value to set for the quarantinedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuarantinedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._quarantinedDeviceCount = value;
    }
    /**
     * Sets the unavailableDeviceCount property value. Total count of devices for which no Exchange Access State could be found.
     * @param value Value to set for the unavailableDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnavailableDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._unavailableDeviceCount = value;
    }
    /**
     * Sets the unknownDeviceCount property value. Total count of devices with Exchange Access State: Unknown.
     * @param value Value to set for the unknownDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnknownDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._unknownDeviceCount = value;
    }
}
