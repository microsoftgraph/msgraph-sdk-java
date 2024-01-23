package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostLogonSessionEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new HostLogonSessionEvidence and sets the default values.
     */
    public HostLogonSessionEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.hostLogonSessionEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HostLogonSessionEvidence
     */
    @jakarta.annotation.Nonnull
    public static HostLogonSessionEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostLogonSessionEvidence();
    }
    /**
     * Gets the account property value. The account property
     * @return a UserEvidence
     */
    @jakarta.annotation.Nullable
    public UserEvidence getAccount() {
        return this.backingStore.get("account");
    }
    /**
     * Gets the endUtcDateTime property value. The endUtcDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndUtcDateTime() {
        return this.backingStore.get("endUtcDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("account", (n) -> { this.setAccount(n.getObjectValue(UserEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("endUtcDateTime", (n) -> { this.setEndUtcDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("host", (n) -> { this.setHost(n.getObjectValue(DeviceEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("sessionId", (n) -> { this.setSessionId(n.getStringValue()); });
        deserializerMap.put("startUtcDateTime", (n) -> { this.setStartUtcDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the host property value. The host property
     * @return a DeviceEvidence
     */
    @jakarta.annotation.Nullable
    public DeviceEvidence getHost() {
        return this.backingStore.get("host");
    }
    /**
     * Gets the sessionId property value. The sessionId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.backingStore.get("sessionId");
    }
    /**
     * Gets the startUtcDateTime property value. The startUtcDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartUtcDateTime() {
        return this.backingStore.get("startUtcDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("account", this.getAccount());
        writer.writeOffsetDateTimeValue("endUtcDateTime", this.getEndUtcDateTime());
        writer.writeObjectValue("host", this.getHost());
        writer.writeStringValue("sessionId", this.getSessionId());
        writer.writeOffsetDateTimeValue("startUtcDateTime", this.getStartUtcDateTime());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     */
    public void setAccount(@jakarta.annotation.Nullable final UserEvidence value) {
        this.backingStore.set("account", value);
    }
    /**
     * Sets the endUtcDateTime property value. The endUtcDateTime property
     * @param value Value to set for the endUtcDateTime property.
     */
    public void setEndUtcDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endUtcDateTime", value);
    }
    /**
     * Sets the host property value. The host property
     * @param value Value to set for the host property.
     */
    public void setHost(@jakarta.annotation.Nullable final DeviceEvidence value) {
        this.backingStore.set("host", value);
    }
    /**
     * Sets the sessionId property value. The sessionId property
     * @param value Value to set for the sessionId property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sessionId", value);
    }
    /**
     * Sets the startUtcDateTime property value. The startUtcDateTime property
     * @param value Value to set for the startUtcDateTime property.
     */
    public void setStartUtcDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startUtcDateTime", value);
    }
}
