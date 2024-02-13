package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceLocalCredential extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceLocalCredential} and sets the default values.
     */
    public DeviceLocalCredential() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceLocalCredential}
     */
    @jakarta.annotation.Nonnull
    public static DeviceLocalCredential createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceLocalCredential();
    }
    /**
     * Gets the accountName property value. The name of the local admin account for which LAPS is enabled.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.backingStore.get("accountName");
    }
    /**
     * Gets the accountSid property value. The SID of the local admin account for which LAPS is enabled.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountSid() {
        return this.backingStore.get("accountSid");
    }
    /**
     * Gets the backupDateTime property value. When the local administrator account credential for the device object was backed up to Azure Active Directory.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBackupDateTime() {
        return this.backingStore.get("backupDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("accountSid", (n) -> { this.setAccountSid(n.getStringValue()); });
        deserializerMap.put("backupDateTime", (n) -> { this.setBackupDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("passwordBase64", (n) -> { this.setPasswordBase64(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passwordBase64 property value. The password for the local administrator account that is backed up to Azure Active Directory and returned as a Base64 encoded value.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPasswordBase64() {
        return this.backingStore.get("passwordBase64");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeStringValue("accountSid", this.getAccountSid());
        writer.writeOffsetDateTimeValue("backupDateTime", this.getBackupDateTime());
        writer.writeStringValue("passwordBase64", this.getPasswordBase64());
    }
    /**
     * Sets the accountName property value. The name of the local admin account for which LAPS is enabled.
     * @param value Value to set for the accountName property.
     */
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accountName", value);
    }
    /**
     * Sets the accountSid property value. The SID of the local admin account for which LAPS is enabled.
     * @param value Value to set for the accountSid property.
     */
    public void setAccountSid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accountSid", value);
    }
    /**
     * Sets the backupDateTime property value. When the local administrator account credential for the device object was backed up to Azure Active Directory.
     * @param value Value to set for the backupDateTime property.
     */
    public void setBackupDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("backupDateTime", value);
    }
    /**
     * Sets the passwordBase64 property value. The password for the local administrator account that is backed up to Azure Active Directory and returned as a Base64 encoded value.
     * @param value Value to set for the passwordBase64 property.
     */
    public void setPasswordBase64(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("passwordBase64", value);
    }
}
