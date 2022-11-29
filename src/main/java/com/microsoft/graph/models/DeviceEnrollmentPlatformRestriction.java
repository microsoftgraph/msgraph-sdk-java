package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Platform specific enrollment restrictions */
public class DeviceEnrollmentPlatformRestriction implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Max OS version supported */
    private String _osMaximumVersion;
    /** Min OS version supported */
    private String _osMinimumVersion;
    /** Block personally owned devices from enrolling */
    private Boolean _personalDeviceEnrollmentBlocked;
    /** Block the platform from enrolling */
    private Boolean _platformBlocked;
    /**
     * Instantiates a new deviceEnrollmentPlatformRestriction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceEnrollmentPlatformRestriction
     */
    @javax.annotation.Nonnull
    public static DeviceEnrollmentPlatformRestriction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEnrollmentPlatformRestriction();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceEnrollmentPlatformRestriction currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("osMaximumVersion", (n) -> { currentObject.setOsMaximumVersion(n.getStringValue()); });
            this.put("osMinimumVersion", (n) -> { currentObject.setOsMinimumVersion(n.getStringValue()); });
            this.put("personalDeviceEnrollmentBlocked", (n) -> { currentObject.setPersonalDeviceEnrollmentBlocked(n.getBooleanValue()); });
            this.put("platformBlocked", (n) -> { currentObject.setPlatformBlocked(n.getBooleanValue()); });
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
     * Gets the osMaximumVersion property value. Max OS version supported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMaximumVersion() {
        return this._osMaximumVersion;
    }
    /**
     * Gets the osMinimumVersion property value. Min OS version supported
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMinimumVersion() {
        return this._osMinimumVersion;
    }
    /**
     * Gets the personalDeviceEnrollmentBlocked property value. Block personally owned devices from enrolling
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPersonalDeviceEnrollmentBlocked() {
        return this._personalDeviceEnrollmentBlocked;
    }
    /**
     * Gets the platformBlocked property value. Block the platform from enrolling
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPlatformBlocked() {
        return this._platformBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("osMaximumVersion", this.getOsMaximumVersion());
        writer.writeStringValue("osMinimumVersion", this.getOsMinimumVersion());
        writer.writeBooleanValue("personalDeviceEnrollmentBlocked", this.getPersonalDeviceEnrollmentBlocked());
        writer.writeBooleanValue("platformBlocked", this.getPlatformBlocked());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the osMaximumVersion property value. Max OS version supported
     * @param value Value to set for the osMaximumVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsMaximumVersion(@javax.annotation.Nullable final String value) {
        this._osMaximumVersion = value;
    }
    /**
     * Sets the osMinimumVersion property value. Min OS version supported
     * @param value Value to set for the osMinimumVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsMinimumVersion(@javax.annotation.Nullable final String value) {
        this._osMinimumVersion = value;
    }
    /**
     * Sets the personalDeviceEnrollmentBlocked property value. Block personally owned devices from enrolling
     * @param value Value to set for the personalDeviceEnrollmentBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalDeviceEnrollmentBlocked(@javax.annotation.Nullable final Boolean value) {
        this._personalDeviceEnrollmentBlocked = value;
    }
    /**
     * Sets the platformBlocked property value. Block the platform from enrolling
     * @param value Value to set for the platformBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatformBlocked(@javax.annotation.Nullable final Boolean value) {
        this._platformBlocked = value;
    }
}
