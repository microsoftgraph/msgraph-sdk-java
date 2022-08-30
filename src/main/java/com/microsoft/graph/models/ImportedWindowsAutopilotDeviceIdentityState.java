package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ImportedWindowsAutopilotDeviceIdentityState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Device error code reported by Device Directory Service(DDS). */
    private Integer _deviceErrorCode;
    /** Device error name reported by Device Directory Service(DDS). */
    private String _deviceErrorName;
    /** The deviceImportStatus property */
    private ImportedWindowsAutopilotDeviceIdentityImportStatus _deviceImportStatus;
    /** Device Registration ID for successfully added device reported by Device Directory Service(DDS). */
    private String _deviceRegistrationId;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new importedWindowsAutopilotDeviceIdentityState and sets the default values.
     * @return a void
     */
    public ImportedWindowsAutopilotDeviceIdentityState() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.importedWindowsAutopilotDeviceIdentityState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a importedWindowsAutopilotDeviceIdentityState
     */
    @javax.annotation.Nonnull
    public static ImportedWindowsAutopilotDeviceIdentityState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportedWindowsAutopilotDeviceIdentityState();
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
     * Gets the deviceErrorCode property value. Device error code reported by Device Directory Service(DDS).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceErrorCode() {
        return this._deviceErrorCode;
    }
    /**
     * Gets the deviceErrorName property value. Device error name reported by Device Directory Service(DDS).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceErrorName() {
        return this._deviceErrorName;
    }
    /**
     * Gets the deviceImportStatus property value. The deviceImportStatus property
     * @return a importedWindowsAutopilotDeviceIdentityImportStatus
     */
    @javax.annotation.Nullable
    public ImportedWindowsAutopilotDeviceIdentityImportStatus getDeviceImportStatus() {
        return this._deviceImportStatus;
    }
    /**
     * Gets the deviceRegistrationId property value. Device Registration ID for successfully added device reported by Device Directory Service(DDS).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceRegistrationId() {
        return this._deviceRegistrationId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ImportedWindowsAutopilotDeviceIdentityState currentObject = this;
        return new HashMap<>(5) {{
            this.put("deviceErrorCode", (n) -> { currentObject.setDeviceErrorCode(n.getIntegerValue()); });
            this.put("deviceErrorName", (n) -> { currentObject.setDeviceErrorName(n.getStringValue()); });
            this.put("deviceImportStatus", (n) -> { currentObject.setDeviceImportStatus(n.getEnumValue(ImportedWindowsAutopilotDeviceIdentityImportStatus.class)); });
            this.put("deviceRegistrationId", (n) -> { currentObject.setDeviceRegistrationId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("deviceErrorCode", this.getDeviceErrorCode());
        writer.writeStringValue("deviceErrorName", this.getDeviceErrorName());
        writer.writeEnumValue("deviceImportStatus", this.getDeviceImportStatus());
        writer.writeStringValue("deviceRegistrationId", this.getDeviceRegistrationId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the deviceErrorCode property value. Device error code reported by Device Directory Service(DDS).
     * @param value Value to set for the deviceErrorCode property.
     * @return a void
     */
    public void setDeviceErrorCode(@javax.annotation.Nullable final Integer value) {
        this._deviceErrorCode = value;
    }
    /**
     * Sets the deviceErrorName property value. Device error name reported by Device Directory Service(DDS).
     * @param value Value to set for the deviceErrorName property.
     * @return a void
     */
    public void setDeviceErrorName(@javax.annotation.Nullable final String value) {
        this._deviceErrorName = value;
    }
    /**
     * Sets the deviceImportStatus property value. The deviceImportStatus property
     * @param value Value to set for the deviceImportStatus property.
     * @return a void
     */
    public void setDeviceImportStatus(@javax.annotation.Nullable final ImportedWindowsAutopilotDeviceIdentityImportStatus value) {
        this._deviceImportStatus = value;
    }
    /**
     * Sets the deviceRegistrationId property value. Device Registration ID for successfully added device reported by Device Directory Service(DDS).
     * @param value Value to set for the deviceRegistrationId property.
     * @return a void
     */
    public void setDeviceRegistrationId(@javax.annotation.Nullable final String value) {
        this._deviceRegistrationId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
