package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity which represents a connection to an Exchange environment. */
public class DeviceManagementExchangeConnector extends Entity implements Parsable {
    /** The name of the server hosting the Exchange Connector. */
    private String _connectorServerName;
    /** An alias assigned to the Exchange server */
    private String _exchangeAlias;
    /** The type of Exchange Connector Configured. Possible values are: onPremises, hosted, serviceToService, dedicated. */
    private DeviceManagementExchangeConnectorType _exchangeConnectorType;
    /** Exchange Organization to the Exchange server */
    private String _exchangeOrganization;
    /** Last sync time for the Exchange Connector */
    private OffsetDateTime _lastSyncDateTime;
    /** Email address used to configure the Service To Service Exchange Connector. */
    private String _primarySmtpAddress;
    /** The name of the Exchange server. */
    private String _serverName;
    /** Exchange Connector Status. Possible values are: none, connectionPending, connected, disconnected. */
    private DeviceManagementExchangeConnectorStatus _status;
    /** The version of the ExchangeConnectorAgent */
    private String _version;
    /**
     * Instantiates a new deviceManagementExchangeConnector and sets the default values.
     * @return a void
     */
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
        return this._connectorServerName;
    }
    /**
     * Gets the exchangeAlias property value. An alias assigned to the Exchange server
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExchangeAlias() {
        return this._exchangeAlias;
    }
    /**
     * Gets the exchangeConnectorType property value. The type of Exchange Connector Configured. Possible values are: onPremises, hosted, serviceToService, dedicated.
     * @return a deviceManagementExchangeConnectorType
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeConnectorType getExchangeConnectorType() {
        return this._exchangeConnectorType;
    }
    /**
     * Gets the exchangeOrganization property value. Exchange Organization to the Exchange server
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExchangeOrganization() {
        return this._exchangeOrganization;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementExchangeConnector currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("connectorServerName", (n) -> { currentObject.setConnectorServerName(n.getStringValue()); });
            this.put("exchangeAlias", (n) -> { currentObject.setExchangeAlias(n.getStringValue()); });
            this.put("exchangeConnectorType", (n) -> { currentObject.setExchangeConnectorType(n.getEnumValue(DeviceManagementExchangeConnectorType.class)); });
            this.put("exchangeOrganization", (n) -> { currentObject.setExchangeOrganization(n.getStringValue()); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("primarySmtpAddress", (n) -> { currentObject.setPrimarySmtpAddress(n.getStringValue()); });
            this.put("serverName", (n) -> { currentObject.setServerName(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(DeviceManagementExchangeConnectorStatus.class)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastSyncDateTime property value. Last sync time for the Exchange Connector
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the primarySmtpAddress property value. Email address used to configure the Service To Service Exchange Connector.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimarySmtpAddress() {
        return this._primarySmtpAddress;
    }
    /**
     * Gets the serverName property value. The name of the Exchange server.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServerName() {
        return this._serverName;
    }
    /**
     * Gets the status property value. Exchange Connector Status. Possible values are: none, connectionPending, connected, disconnected.
     * @return a deviceManagementExchangeConnectorStatus
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeConnectorStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the version property value. The version of the ExchangeConnectorAgent
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setConnectorServerName(@javax.annotation.Nullable final String value) {
        this._connectorServerName = value;
    }
    /**
     * Sets the exchangeAlias property value. An alias assigned to the Exchange server
     * @param value Value to set for the exchangeAlias property.
     * @return a void
     */
    public void setExchangeAlias(@javax.annotation.Nullable final String value) {
        this._exchangeAlias = value;
    }
    /**
     * Sets the exchangeConnectorType property value. The type of Exchange Connector Configured. Possible values are: onPremises, hosted, serviceToService, dedicated.
     * @param value Value to set for the exchangeConnectorType property.
     * @return a void
     */
    public void setExchangeConnectorType(@javax.annotation.Nullable final DeviceManagementExchangeConnectorType value) {
        this._exchangeConnectorType = value;
    }
    /**
     * Sets the exchangeOrganization property value. Exchange Organization to the Exchange server
     * @param value Value to set for the exchangeOrganization property.
     * @return a void
     */
    public void setExchangeOrganization(@javax.annotation.Nullable final String value) {
        this._exchangeOrganization = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Last sync time for the Exchange Connector
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the primarySmtpAddress property value. Email address used to configure the Service To Service Exchange Connector.
     * @param value Value to set for the primarySmtpAddress property.
     * @return a void
     */
    public void setPrimarySmtpAddress(@javax.annotation.Nullable final String value) {
        this._primarySmtpAddress = value;
    }
    /**
     * Sets the serverName property value. The name of the Exchange server.
     * @param value Value to set for the serverName property.
     * @return a void
     */
    public void setServerName(@javax.annotation.Nullable final String value) {
        this._serverName = value;
    }
    /**
     * Sets the status property value. Exchange Connector Status. Possible values are: none, connectionPending, connected, disconnected.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final DeviceManagementExchangeConnectorStatus value) {
        this._status = value;
    }
    /**
     * Sets the version property value. The version of the ExchangeConnectorAgent
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
