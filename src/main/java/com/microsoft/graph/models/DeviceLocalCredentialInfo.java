package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceLocalCredentialInfo extends Entity implements Parsable {
    /**
     * The credentials of the device's local administrator account backed up to Azure Active Directory.
     */
    private java.util.List<DeviceLocalCredential> credentials;
    /**
     * Display name of the device that the local credentials are associated with.
     */
    private String deviceName;
    /**
     * When the local administrator account credential was backed up to Azure Active Directory.
     */
    private OffsetDateTime lastBackupDateTime;
    /**
     * When the local administrator account credential will be refreshed and backed up to Azure Active Directory.
     */
    private OffsetDateTime refreshDateTime;
    /**
     * Instantiates a new DeviceLocalCredentialInfo and sets the default values.
     */
    public DeviceLocalCredentialInfo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceLocalCredentialInfo
     */
    @jakarta.annotation.Nonnull
    public static DeviceLocalCredentialInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceLocalCredentialInfo();
    }
    /**
     * Gets the credentials property value. The credentials of the device's local administrator account backed up to Azure Active Directory.
     * @return a java.util.List<DeviceLocalCredential>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceLocalCredential> getCredentials() {
        return this.credentials;
    }
    /**
     * Gets the deviceName property value. Display name of the device that the local credentials are associated with.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("credentials", (n) -> { this.setCredentials(n.getCollectionOfObjectValues(DeviceLocalCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("lastBackupDateTime", (n) -> { this.setLastBackupDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("refreshDateTime", (n) -> { this.setRefreshDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastBackupDateTime property value. When the local administrator account credential was backed up to Azure Active Directory.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastBackupDateTime() {
        return this.lastBackupDateTime;
    }
    /**
     * Gets the refreshDateTime property value. When the local administrator account credential will be refreshed and backed up to Azure Active Directory.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRefreshDateTime() {
        return this.refreshDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("credentials", this.getCredentials());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeOffsetDateTimeValue("lastBackupDateTime", this.getLastBackupDateTime());
        writer.writeOffsetDateTimeValue("refreshDateTime", this.getRefreshDateTime());
    }
    /**
     * Sets the credentials property value. The credentials of the device's local administrator account backed up to Azure Active Directory.
     * @param value Value to set for the credentials property.
     */
    public void setCredentials(@jakarta.annotation.Nullable final java.util.List<DeviceLocalCredential> value) {
        this.credentials = value;
    }
    /**
     * Sets the deviceName property value. Display name of the device that the local credentials are associated with.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the lastBackupDateTime property value. When the local administrator account credential was backed up to Azure Active Directory.
     * @param value Value to set for the lastBackupDateTime property.
     */
    public void setLastBackupDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastBackupDateTime = value;
    }
    /**
     * Sets the refreshDateTime property value. When the local administrator account credential will be refreshed and backed up to Azure Active Directory.
     * @param value Value to set for the refreshDateTime property.
     */
    public void setRefreshDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.refreshDateTime = value;
    }
}
