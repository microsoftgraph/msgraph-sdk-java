package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates the browser information of the used for signing in. */
    private String _browser;
    /** Refers to the UniqueID of the device used for signing in. */
    private String _deviceId;
    /** Refers to the name of the device used for signing in. */
    private String _displayName;
    /** Indicates whether the device is compliant. */
    private Boolean _isCompliant;
    /** Indicates whether the device is managed. */
    private Boolean _isManaged;
    /** The OdataType property */
    private String _odataType;
    /** Indicates the operating system name and version used for signing in. */
    private String _operatingSystem;
    /** Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined. */
    private String _trustType;
    /**
     * Instantiates a new deviceDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceDetail() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceDetail
     */
    @javax.annotation.Nonnull
    public static DeviceDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceDetail();
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
     * Gets the browser property value. Indicates the browser information of the used for signing in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBrowser() {
        return this._browser;
    }
    /**
     * Gets the deviceId property value. Refers to the UniqueID of the device used for signing in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the displayName property value. Refers to the name of the device used for signing in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceDetail currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(8);
        deserializerMap.put("browser", (n) -> { currentObject.setBrowser(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isCompliant", (n) -> { currentObject.setIsCompliant(n.getBooleanValue()); });
        deserializerMap.put("isManaged", (n) -> { currentObject.setIsManaged(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("operatingSystem", (n) -> { currentObject.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("trustType", (n) -> { currentObject.setTrustType(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the isCompliant property value. Indicates whether the device is compliant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCompliant() {
        return this._isCompliant;
    }
    /**
     * Gets the isManaged property value. Indicates whether the device is managed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsManaged() {
        return this._isManaged;
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
     * Gets the operatingSystem property value. Indicates the operating system name and version used for signing in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this._operatingSystem;
    }
    /**
     * Gets the trustType property value. Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTrustType() {
        return this._trustType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isCompliant", this.getIsCompliant());
        writer.writeBooleanValue("isManaged", this.getIsManaged());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeStringValue("trustType", this.getTrustType());
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
     * Sets the browser property value. Indicates the browser information of the used for signing in.
     * @param value Value to set for the browser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrowser(@javax.annotation.Nullable final String value) {
        this._browser = value;
    }
    /**
     * Sets the deviceId property value. Refers to the UniqueID of the device used for signing in.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the displayName property value. Refers to the name of the device used for signing in.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isCompliant property value. Indicates whether the device is compliant.
     * @param value Value to set for the isCompliant property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCompliant(@javax.annotation.Nullable final Boolean value) {
        this._isCompliant = value;
    }
    /**
     * Sets the isManaged property value. Indicates whether the device is managed.
     * @param value Value to set for the isManaged property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsManaged(@javax.annotation.Nullable final Boolean value) {
        this._isManaged = value;
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
     * Sets the operatingSystem property value. Indicates the operating system name and version used for signing in.
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this._operatingSystem = value;
    }
    /**
     * Sets the trustType property value. Provides information about whether the signed-in device is Workplace Joined, AzureAD Joined, Domain Joined.
     * @param value Value to set for the trustType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrustType(@javax.annotation.Nullable final String value) {
        this._trustType = value;
    }
}
