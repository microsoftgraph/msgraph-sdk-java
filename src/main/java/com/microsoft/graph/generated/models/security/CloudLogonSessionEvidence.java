package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudLogonSessionEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link CloudLogonSessionEvidence} and sets the default values.
     */
    public CloudLogonSessionEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.cloudLogonSessionEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudLogonSessionEvidence}
     */
    @jakarta.annotation.Nonnull
    public static CloudLogonSessionEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudLogonSessionEvidence();
    }
    /**
     * Gets the account property value. The account associated with the sign-in session.
     * @return a {@link UserEvidence}
     */
    @jakarta.annotation.Nullable
    public UserEvidence getAccount() {
        return this.backingStore.get("account");
    }
    /**
     * Gets the browser property value. The browser that is used for the sign-in, if known.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrowser() {
        return this.backingStore.get("browser");
    }
    /**
     * Gets the deviceName property value. The friendly name of the device, if known.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("account", (n) -> { this.setAccount(n.getObjectValue(UserEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("browser", (n) -> { this.setBrowser(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("previousLogonDateTime", (n) -> { this.setPreviousLogonDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getStringValue()); });
        deserializerMap.put("sessionId", (n) -> { this.setSessionId(n.getStringValue()); });
        deserializerMap.put("startUtcDateTime", (n) -> { this.setStartUtcDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("userAgent", (n) -> { this.setUserAgent(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the operatingSystem property value. The operating system that the device is running, if known.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystem() {
        return this.backingStore.get("operatingSystem");
    }
    /**
     * Gets the previousLogonDateTime property value. The previous sign-in time for this account, if known.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPreviousLogonDateTime() {
        return this.backingStore.get("previousLogonDateTime");
    }
    /**
     * Gets the protocol property value. The authentication protocol that is used in this session, if known.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProtocol() {
        return this.backingStore.get("protocol");
    }
    /**
     * Gets the sessionId property value. The session ID for the account reported in the alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.backingStore.get("sessionId");
    }
    /**
     * Gets the startUtcDateTime property value. The session start time, if known.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartUtcDateTime() {
        return this.backingStore.get("startUtcDateTime");
    }
    /**
     * Gets the userAgent property value. The user agent that is used for the sign-in, if known.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserAgent() {
        return this.backingStore.get("userAgent");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("account", this.getAccount());
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeOffsetDateTimeValue("previousLogonDateTime", this.getPreviousLogonDateTime());
        writer.writeStringValue("protocol", this.getProtocol());
        writer.writeStringValue("sessionId", this.getSessionId());
        writer.writeOffsetDateTimeValue("startUtcDateTime", this.getStartUtcDateTime());
        writer.writeStringValue("userAgent", this.getUserAgent());
    }
    /**
     * Sets the account property value. The account associated with the sign-in session.
     * @param value Value to set for the account property.
     */
    public void setAccount(@jakarta.annotation.Nullable final UserEvidence value) {
        this.backingStore.set("account", value);
    }
    /**
     * Sets the browser property value. The browser that is used for the sign-in, if known.
     * @param value Value to set for the browser property.
     */
    public void setBrowser(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("browser", value);
    }
    /**
     * Sets the deviceName property value. The friendly name of the device, if known.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the operatingSystem property value. The operating system that the device is running, if known.
     * @param value Value to set for the operatingSystem property.
     */
    public void setOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystem", value);
    }
    /**
     * Sets the previousLogonDateTime property value. The previous sign-in time for this account, if known.
     * @param value Value to set for the previousLogonDateTime property.
     */
    public void setPreviousLogonDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("previousLogonDateTime", value);
    }
    /**
     * Sets the protocol property value. The authentication protocol that is used in this session, if known.
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("protocol", value);
    }
    /**
     * Sets the sessionId property value. The session ID for the account reported in the alert.
     * @param value Value to set for the sessionId property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sessionId", value);
    }
    /**
     * Sets the startUtcDateTime property value. The session start time, if known.
     * @param value Value to set for the startUtcDateTime property.
     */
    public void setStartUtcDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startUtcDateTime", value);
    }
    /**
     * Sets the userAgent property value. The user agent that is used for the sign-in, if known.
     * @param value Value to set for the userAgent property.
     */
    public void setUserAgent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userAgent", value);
    }
}
