package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity which represents a connection to an Exchange environment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementExchangeConnector extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementExchangeConnector and sets the default values.
     */
    public DeviceManagementExchangeConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementExchangeConnector
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementExchangeConnector createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementExchangeConnector();
    }
    /**
     * Gets the connectorServerName property value. The name of the server hosting the Exchange Connector.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectorServerName() {
        return this.backingStore.get("connectorServerName");
    }
    /**
     * Gets the exchangeAlias property value. An alias assigned to the Exchange server
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExchangeAlias() {
        return this.backingStore.get("exchangeAlias");
    }
    /**
     * Gets the exchangeConnectorType property value. The type of Exchange Connector.
     * @return a DeviceManagementExchangeConnectorType
     */
    @jakarta.annotation.Nullable
    public DeviceManagementExchangeConnectorType getExchangeConnectorType() {
        return this.backingStore.get("exchangeConnectorType");
    }
    /**
     * Gets the exchangeOrganization property value. Exchange Organization to the Exchange server
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExchangeOrganization() {
        return this.backingStore.get("exchangeOrganization");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectorServerName", (n) -> { this.setConnectorServerName(n.getStringValue()); });
        deserializerMap.put("exchangeAlias", (n) -> { this.setExchangeAlias(n.getStringValue()); });
        deserializerMap.put("exchangeConnectorType", (n) -> { this.setExchangeConnectorType(n.getEnumValue(DeviceManagementExchangeConnectorType::forValue)); });
        deserializerMap.put("exchangeOrganization", (n) -> { this.setExchangeOrganization(n.getStringValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("primarySmtpAddress", (n) -> { this.setPrimarySmtpAddress(n.getStringValue()); });
        deserializerMap.put("serverName", (n) -> { this.setServerName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DeviceManagementExchangeConnectorStatus::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastSyncDateTime property value. Last sync time for the Exchange Connector
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.backingStore.get("lastSyncDateTime");
    }
    /**
     * Gets the primarySmtpAddress property value. Email address used to configure the Service To Service Exchange Connector.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimarySmtpAddress() {
        return this.backingStore.get("primarySmtpAddress");
    }
    /**
     * Gets the serverName property value. The name of the Exchange server.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServerName() {
        return this.backingStore.get("serverName");
    }
    /**
     * Gets the status property value. The current status of the Exchange Connector.
     * @return a DeviceManagementExchangeConnectorStatus
     */
    @jakarta.annotation.Nullable
    public DeviceManagementExchangeConnectorStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the version property value. The version of the ExchangeConnectorAgent
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("connectorServerName", this.getConnectorServerName());
        writer.writeStringValue("exchangeAlias", this.getExchangeAlias());
        writer.writeEnumValue("exchangeConnectorType", this.getExchangeConnectorType());
        writer.writeStringValue("exchangeOrganization", this.getExchangeOrganization());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeStringValue("primarySmtpAddress", this.getPrimarySmtpAddress());
        writer.writeStringValue("serverName", this.getServerName());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the connectorServerName property value. The name of the server hosting the Exchange Connector.
     * @param value Value to set for the connectorServerName property.
     */
    public void setConnectorServerName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectorServerName", value);
    }
    /**
     * Sets the exchangeAlias property value. An alias assigned to the Exchange server
     * @param value Value to set for the exchangeAlias property.
     */
    public void setExchangeAlias(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("exchangeAlias", value);
    }
    /**
     * Sets the exchangeConnectorType property value. The type of Exchange Connector.
     * @param value Value to set for the exchangeConnectorType property.
     */
    public void setExchangeConnectorType(@jakarta.annotation.Nullable final DeviceManagementExchangeConnectorType value) {
        this.backingStore.set("exchangeConnectorType", value);
    }
    /**
     * Sets the exchangeOrganization property value. Exchange Organization to the Exchange server
     * @param value Value to set for the exchangeOrganization property.
     */
    public void setExchangeOrganization(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("exchangeOrganization", value);
    }
    /**
     * Sets the lastSyncDateTime property value. Last sync time for the Exchange Connector
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncDateTime", value);
    }
    /**
     * Sets the primarySmtpAddress property value. Email address used to configure the Service To Service Exchange Connector.
     * @param value Value to set for the primarySmtpAddress property.
     */
    public void setPrimarySmtpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("primarySmtpAddress", value);
    }
    /**
     * Sets the serverName property value. The name of the Exchange server.
     * @param value Value to set for the serverName property.
     */
    public void setServerName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serverName", value);
    }
    /**
     * Sets the status property value. The current status of the Exchange Connector.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DeviceManagementExchangeConnectorStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the version property value. The version of the ExchangeConnectorAgent
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
