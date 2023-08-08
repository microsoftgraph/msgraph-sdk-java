package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ImportedWindowsAutopilotDeviceIdentityState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Device error code reported by Device Directory Service(DDS).
     */
    private Integer deviceErrorCode;
    /**
     * Device error name reported by Device Directory Service(DDS).
     */
    private String deviceErrorName;
    /**
     * The deviceImportStatus property
     */
    private ImportedWindowsAutopilotDeviceIdentityImportStatus deviceImportStatus;
    /**
     * Device Registration ID for successfully added device reported by Device Directory Service(DDS).
     */
    private String deviceRegistrationId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new importedWindowsAutopilotDeviceIdentityState and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ImportedWindowsAutopilotDeviceIdentityState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a importedWindowsAutopilotDeviceIdentityState
     */
    @jakarta.annotation.Nonnull
    public static ImportedWindowsAutopilotDeviceIdentityState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportedWindowsAutopilotDeviceIdentityState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deviceErrorCode property value. Device error code reported by Device Directory Service(DDS).
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceErrorCode() {
        return this.deviceErrorCode;
    }
    /**
     * Gets the deviceErrorName property value. Device error name reported by Device Directory Service(DDS).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceErrorName() {
        return this.deviceErrorName;
    }
    /**
     * Gets the deviceImportStatus property value. The deviceImportStatus property
     * @return a importedWindowsAutopilotDeviceIdentityImportStatus
     */
    @jakarta.annotation.Nullable
    public ImportedWindowsAutopilotDeviceIdentityImportStatus getDeviceImportStatus() {
        return this.deviceImportStatus;
    }
    /**
     * Gets the deviceRegistrationId property value. Device Registration ID for successfully added device reported by Device Directory Service(DDS).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceRegistrationId() {
        return this.deviceRegistrationId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("deviceErrorCode", (n) -> { this.setDeviceErrorCode(n.getIntegerValue()); });
        deserializerMap.put("deviceErrorName", (n) -> { this.setDeviceErrorName(n.getStringValue()); });
        deserializerMap.put("deviceImportStatus", (n) -> { this.setDeviceImportStatus(n.getEnumValue(ImportedWindowsAutopilotDeviceIdentityImportStatus.class)); });
        deserializerMap.put("deviceRegistrationId", (n) -> { this.setDeviceRegistrationId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceErrorCode property value. Device error code reported by Device Directory Service(DDS).
     * @param value Value to set for the deviceErrorCode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.deviceErrorCode = value;
    }
    /**
     * Sets the deviceErrorName property value. Device error name reported by Device Directory Service(DDS).
     * @param value Value to set for the deviceErrorName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceErrorName(@jakarta.annotation.Nullable final String value) {
        this.deviceErrorName = value;
    }
    /**
     * Sets the deviceImportStatus property value. The deviceImportStatus property
     * @param value Value to set for the deviceImportStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceImportStatus(@jakarta.annotation.Nullable final ImportedWindowsAutopilotDeviceIdentityImportStatus value) {
        this.deviceImportStatus = value;
    }
    /**
     * Sets the deviceRegistrationId property value. Device Registration ID for successfully added device reported by Device Directory Service(DDS).
     * @param value Value to set for the deviceRegistrationId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceRegistrationId(@jakarta.annotation.Nullable final String value) {
        this.deviceRegistrationId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
