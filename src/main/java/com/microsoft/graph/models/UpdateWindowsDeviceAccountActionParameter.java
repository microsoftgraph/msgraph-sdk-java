package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateWindowsDeviceAccountActionParameter implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Not yet documented
     */
    private Boolean calendarSyncEnabled;
    /**
     * Not yet documented
     */
    private WindowsDeviceAccount deviceAccount;
    /**
     * Not yet documented
     */
    private String deviceAccountEmail;
    /**
     * Not yet documented
     */
    private String exchangeServer;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Not yet documented
     */
    private Boolean passwordRotationEnabled;
    /**
     * Not yet documented
     */
    private String sessionInitiationProtocalAddress;
    /**
     * Instantiates a new updateWindowsDeviceAccountActionParameter and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdateWindowsDeviceAccountActionParameter() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
    }
    /**
     * Gets the calendarSyncEnabled property value. Not yet documented
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCalendarSyncEnabled() {
        return this.calendarSyncEnabled;
    }
    /**
     * Gets the deviceAccount property value. Not yet documented
     * @return a windowsDeviceAccount
     */
    @javax.annotation.Nullable
    public WindowsDeviceAccount getDeviceAccount() {
        return this.deviceAccount;
    }
    /**
     * Gets the deviceAccountEmail property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceAccountEmail() {
        return this.deviceAccountEmail;
    }
    /**
     * Gets the exchangeServer property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExchangeServer() {
        return this.exchangeServer;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("calendarSyncEnabled", (n) -> { this.setCalendarSyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("deviceAccount", (n) -> { this.setDeviceAccount(n.getObjectValue(WindowsDeviceAccount::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceAccountEmail", (n) -> { this.setDeviceAccountEmail(n.getStringValue()); });
        deserializerMap.put("exchangeServer", (n) -> { this.setExchangeServer(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("passwordRotationEnabled", (n) -> { this.setPasswordRotationEnabled(n.getBooleanValue()); });
        deserializerMap.put("sessionInitiationProtocalAddress", (n) -> { this.setSessionInitiationProtocalAddress(n.getStringValue()); });
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
     * Gets the passwordRotationEnabled property value. Not yet documented
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRotationEnabled() {
        return this.passwordRotationEnabled;
    }
    /**
     * Gets the sessionInitiationProtocalAddress property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSessionInitiationProtocalAddress() {
        return this.sessionInitiationProtocalAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the calendarSyncEnabled property value. Not yet documented
     * @param value Value to set for the calendarSyncEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalendarSyncEnabled(@javax.annotation.Nullable final Boolean value) {
        this.calendarSyncEnabled = value;
    }
    /**
     * Sets the deviceAccount property value. Not yet documented
     * @param value Value to set for the deviceAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceAccount(@javax.annotation.Nullable final WindowsDeviceAccount value) {
        this.deviceAccount = value;
    }
    /**
     * Sets the deviceAccountEmail property value. Not yet documented
     * @param value Value to set for the deviceAccountEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceAccountEmail(@javax.annotation.Nullable final String value) {
        this.deviceAccountEmail = value;
    }
    /**
     * Sets the exchangeServer property value. Not yet documented
     * @param value Value to set for the exchangeServer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeServer(@javax.annotation.Nullable final String value) {
        this.exchangeServer = value;
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
     * Sets the passwordRotationEnabled property value. Not yet documented
     * @param value Value to set for the passwordRotationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRotationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.passwordRotationEnabled = value;
    }
    /**
     * Sets the sessionInitiationProtocalAddress property value. Not yet documented
     * @param value Value to set for the sessionInitiationProtocalAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSessionInitiationProtocalAddress(@javax.annotation.Nullable final String value) {
        this.sessionInitiationProtocalAddress = value;
    }
}
