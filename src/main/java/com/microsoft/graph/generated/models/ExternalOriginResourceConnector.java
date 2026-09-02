package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalOriginResourceConnector extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ExternalOriginResourceConnector} and sets the default values.
     */
    public ExternalOriginResourceConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExternalOriginResourceConnector}
     */
    @jakarta.annotation.Nonnull
    public static ExternalOriginResourceConnector createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalOriginResourceConnector();
    }
    /**
     * Gets the connectionInfo property value. The connectionInfo property
     * @return a {@link ConnectionInfo}
     */
    @jakarta.annotation.Nullable
    public ConnectionInfo getConnectionInfo() {
        return this.backingStore.get("connectionInfo");
    }
    /**
     * Gets the connectorType property value. The connectorType property
     * @return a {@link ConnectorType}
     */
    @jakarta.annotation.Nullable
    public ConnectorType getConnectorType() {
        return this.backingStore.get("connectorType");
    }
    /**
     * Gets the createdBy property value. The identifier of the user or application that created the connector.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the connector was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. A description of the connector.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the connector.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectionInfo", (n) -> { this.setConnectionInfo(n.getObjectValue(ConnectionInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("connectorType", (n) -> { this.setConnectorType(n.getEnumValue(ConnectorType::forValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("modifiedBy", (n) -> { this.setModifiedBy(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedBy property value. The identifier of the user or application that last modified the connector.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModifiedBy() {
        return this.backingStore.get("modifiedBy");
    }
    /**
     * Gets the modifiedDateTime property value. The date and time when the connector was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.backingStore.get("modifiedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("connectionInfo", this.getConnectionInfo());
        writer.writeEnumValue("connectorType", this.getConnectorType());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("modifiedBy", this.getModifiedBy());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
    }
    /**
     * Sets the connectionInfo property value. The connectionInfo property
     * @param value Value to set for the connectionInfo property.
     */
    public void setConnectionInfo(@jakarta.annotation.Nullable final ConnectionInfo value) {
        this.backingStore.set("connectionInfo", value);
    }
    /**
     * Sets the connectorType property value. The connectorType property
     * @param value Value to set for the connectorType property.
     */
    public void setConnectorType(@jakarta.annotation.Nullable final ConnectorType value) {
        this.backingStore.set("connectorType", value);
    }
    /**
     * Sets the createdBy property value. The identifier of the user or application that created the connector.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the connector was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. A description of the connector.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the connector.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the modifiedBy property value. The identifier of the user or application that last modified the connector.
     * @param value Value to set for the modifiedBy property.
     */
    public void setModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("modifiedBy", value);
    }
    /**
     * Sets the modifiedDateTime property value. The date and time when the connector was last modified.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modifiedDateTime", value);
    }
}
