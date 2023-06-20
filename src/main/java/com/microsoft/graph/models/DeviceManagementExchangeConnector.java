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
public class DeviceManagementExchangeConnector extends Entity implements Parsable {
    /** The name of the server hosting the Exchange Connector. */
    private String connectorServerName;
    /** An alias assigned to the Exchange server */
    private String exchangeAlias;
    /** The type of Exchange Connector. */
    private DeviceManagementExchangeConnectorType exchangeConnectorType;
    /** Exchange Organization to the Exchange server */
    private String exchangeOrganization;
    /** Last sync time for the Exchange Connector */
    private OffsetDateTime lastSyncDateTime;
    /** Email address used to configure the Service To Service Exchange Connector. */
    private String primarySmtpAddress;
    /** The name of the Exchange server. */
    private String serverName;
    /** The current status of the Exchange Connector. */
    private DeviceManagementExchangeConnectorStatus status;
    /** The version of the ExchangeConnectorAgent */
    private String version;
    /**
     * Instantiates a new deviceManagementExchangeConnector and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementExchangeConnector
     */
    @javax.annotation.Nonnull
    public static DeviceManagementExchangeConnector createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementExchangeConnector();
    }
    /**
     * Gets the connectorServerName property value. The name of the server hosting the Exchange Connector.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectorServerName() {
        return this.connectorServerName;
    }
    /**
     * Gets the exchangeAlias property value. An alias assigned to the Exchange server
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExchangeAlias() {
        return this.exchangeAlias;
    }
    /**
     * Gets the exchangeConnectorType property value. The type of Exchange Connector.
     * @return a DeviceManagementExchangeConnectorType
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeConnectorType getExchangeConnectorType() {
        return this.exchangeConnectorType;
    }
    /**
     * Gets the exchangeOrganization property value. Exchange Organization to the Exchange server
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExchangeOrganization() {
        return this.exchangeOrganization;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectorServerName", (n) -> { this.setConnectorServerName(n.getStringValue()); });
        deserializerMap.put("exchangeAlias", (n) -> { this.setExchangeAlias(n.getStringValue()); });
        deserializerMap.put("exchangeConnectorType", (n) -> { this.setExchangeConnectorType(n.getEnumValue(DeviceManagementExchangeConnectorType.class)); });
        deserializerMap.put("exchangeOrganization", (n) -> { this.setExchangeOrganization(n.getStringValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("primarySmtpAddress", (n) -> { this.setPrimarySmtpAddress(n.getStringValue()); });
        deserializerMap.put("serverName", (n) -> { this.setServerName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DeviceManagementExchangeConnectorStatus.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastSyncDateTime property value. Last sync time for the Exchange Connector
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the primarySmtpAddress property value. Email address used to configure the Service To Service Exchange Connector.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimarySmtpAddress() {
        return this.primarySmtpAddress;
    }
    /**
     * Gets the serverName property value. The name of the Exchange server.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServerName() {
        return this.serverName;
    }
    /**
     * Gets the status property value. The current status of the Exchange Connector.
     * @return a DeviceManagementExchangeConnectorStatus
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeConnectorStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the version property value. The version of the ExchangeConnectorAgent
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorServerName(@javax.annotation.Nullable final String value) {
        this.connectorServerName = value;
    }
    /**
     * Sets the exchangeAlias property value. An alias assigned to the Exchange server
     * @param value Value to set for the exchangeAlias property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeAlias(@javax.annotation.Nullable final String value) {
        this.exchangeAlias = value;
    }
    /**
     * Sets the exchangeConnectorType property value. The type of Exchange Connector.
     * @param value Value to set for the exchangeConnectorType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeConnectorType(@javax.annotation.Nullable final DeviceManagementExchangeConnectorType value) {
        this.exchangeConnectorType = value;
    }
    /**
     * Sets the exchangeOrganization property value. Exchange Organization to the Exchange server
     * @param value Value to set for the exchangeOrganization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeOrganization(@javax.annotation.Nullable final String value) {
        this.exchangeOrganization = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Last sync time for the Exchange Connector
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the primarySmtpAddress property value. Email address used to configure the Service To Service Exchange Connector.
     * @param value Value to set for the primarySmtpAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimarySmtpAddress(@javax.annotation.Nullable final String value) {
        this.primarySmtpAddress = value;
    }
    /**
     * Sets the serverName property value. The name of the Exchange server.
     * @param value Value to set for the serverName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServerName(@javax.annotation.Nullable final String value) {
        this.serverName = value;
    }
    /**
     * Sets the status property value. The current status of the Exchange Connector.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final DeviceManagementExchangeConnectorStatus value) {
        this.status = value;
    }
    /**
     * Sets the version property value. The version of the ExchangeConnectorAgent
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
