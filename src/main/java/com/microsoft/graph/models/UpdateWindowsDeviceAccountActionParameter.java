package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateWindowsDeviceAccountActionParameter implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Not yet documented */
    private Boolean _calendarSyncEnabled;
    /** Not yet documented */
    private WindowsDeviceAccount _deviceAccount;
    /** Not yet documented */
    private String _deviceAccountEmail;
    /** Not yet documented */
    private String _exchangeServer;
    /** The OdataType property */
    private String _odataType;
    /** Not yet documented */
    private Boolean _passwordRotationEnabled;
    /** Not yet documented */
    private String _sessionInitiationProtocalAddress;
    /**
     * Instantiates a new updateWindowsDeviceAccountActionParameter and sets the default values.
     * @return a void
     */
    public UpdateWindowsDeviceAccountActionParameter() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.updateWindowsDeviceAccountActionParameter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateWindowsDeviceAccountActionParameter
     */
    @javax.annotation.Nonnull
    public static UpdateWindowsDeviceAccountActionParameter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateWindowsDeviceAccountActionParameter();
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
     * Gets the calendarSyncEnabled property value. Not yet documented
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCalendarSyncEnabled() {
        return this._calendarSyncEnabled;
    }
    /**
     * Gets the deviceAccount property value. Not yet documented
     * @return a windowsDeviceAccount
     */
    @javax.annotation.Nullable
    public WindowsDeviceAccount getDeviceAccount() {
        return this._deviceAccount;
    }
    /**
     * Gets the deviceAccountEmail property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceAccountEmail() {
        return this._deviceAccountEmail;
    }
    /**
     * Gets the exchangeServer property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExchangeServer() {
        return this._exchangeServer;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UpdateWindowsDeviceAccountActionParameter currentObject = this;
        return new HashMap<>(7) {{
            this.put("calendarSyncEnabled", (n) -> { currentObject.setCalendarSyncEnabled(n.getBooleanValue()); });
            this.put("deviceAccount", (n) -> { currentObject.setDeviceAccount(n.getObjectValue(WindowsDeviceAccount::createFromDiscriminatorValue)); });
            this.put("deviceAccountEmail", (n) -> { currentObject.setDeviceAccountEmail(n.getStringValue()); });
            this.put("exchangeServer", (n) -> { currentObject.setExchangeServer(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("passwordRotationEnabled", (n) -> { currentObject.setPasswordRotationEnabled(n.getBooleanValue()); });
            this.put("sessionInitiationProtocalAddress", (n) -> { currentObject.setSessionInitiationProtocalAddress(n.getStringValue()); });
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
     * Gets the passwordRotationEnabled property value. Not yet documented
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRotationEnabled() {
        return this._passwordRotationEnabled;
    }
    /**
     * Gets the sessionInitiationProtocalAddress property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSessionInitiationProtocalAddress() {
        return this._sessionInitiationProtocalAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("calendarSyncEnabled", this.getCalendarSyncEnabled());
        writer.writeObjectValue("deviceAccount", this.getDeviceAccount());
        writer.writeStringValue("deviceAccountEmail", this.getDeviceAccountEmail());
        writer.writeStringValue("exchangeServer", this.getExchangeServer());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("passwordRotationEnabled", this.getPasswordRotationEnabled());
        writer.writeStringValue("sessionInitiationProtocalAddress", this.getSessionInitiationProtocalAddress());
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
     * Sets the calendarSyncEnabled property value. Not yet documented
     * @param value Value to set for the calendarSyncEnabled property.
     * @return a void
     */
    public void setCalendarSyncEnabled(@javax.annotation.Nullable final Boolean value) {
        this._calendarSyncEnabled = value;
    }
    /**
     * Sets the deviceAccount property value. Not yet documented
     * @param value Value to set for the deviceAccount property.
     * @return a void
     */
    public void setDeviceAccount(@javax.annotation.Nullable final WindowsDeviceAccount value) {
        this._deviceAccount = value;
    }
    /**
     * Sets the deviceAccountEmail property value. Not yet documented
     * @param value Value to set for the deviceAccountEmail property.
     * @return a void
     */
    public void setDeviceAccountEmail(@javax.annotation.Nullable final String value) {
        this._deviceAccountEmail = value;
    }
    /**
     * Sets the exchangeServer property value. Not yet documented
     * @param value Value to set for the exchangeServer property.
     * @return a void
     */
    public void setExchangeServer(@javax.annotation.Nullable final String value) {
        this._exchangeServer = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the passwordRotationEnabled property value. Not yet documented
     * @param value Value to set for the passwordRotationEnabled property.
     * @return a void
     */
    public void setPasswordRotationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._passwordRotationEnabled = value;
    }
    /**
     * Sets the sessionInitiationProtocalAddress property value. Not yet documented
     * @param value Value to set for the sessionInitiationProtocalAddress property.
     * @return a void
     */
    public void setSessionInitiationProtocalAddress(@javax.annotation.Nullable final String value) {
        this._sessionInitiationProtocalAddress = value;
    }
}
