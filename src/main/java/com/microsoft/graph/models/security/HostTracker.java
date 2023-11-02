package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostTracker extends Artifact implements Parsable {
    /**
     * Instantiates a new HostTracker and sets the default values.
     */
    public HostTracker() {
        super();
        this.setOdataType("#microsoft.graph.security.hostTracker");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HostTracker
     */
    @jakarta.annotation.Nonnull
    public static HostTracker createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostTracker();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("host", (n) -> { this.setHost(n.getObjectValue(Host::createFromDiscriminatorValue)); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getStringValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The first date and time when this hostTracker was observed by Microsoft Defender Threat Intelligence. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.getBackingStore().get("firstSeenDateTime");
    }
    /**
     * Gets the host property value. The host property
     * @return a Host
     */
    @jakarta.annotation.Nullable
    public Host getHost() {
        return this.getBackingStore().get("host");
    }
    /**
     * Gets the kind property value. The kind of hostTracker that was detected. For example, GoogleAnalyticsID or JarmHash.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKind() {
        return this.getBackingStore().get("kind");
    }
    /**
     * Gets the lastSeenDateTime property value. The most recent date and time when this hostTracker was observed by Microsoft Defender Threat Intelligence. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.getBackingStore().get("lastSeenDateTime");
    }
    /**
     * Gets the value property value. The identification value for the hostTracker.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.getBackingStore().get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeObjectValue("host", this.getHost());
        writer.writeStringValue("kind", this.getKind());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the firstSeenDateTime property value. The first date and time when this hostTracker was observed by Microsoft Defender Threat Intelligence. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("firstSeenDateTime", value);
    }
    /**
     * Sets the host property value. The host property
     * @param value Value to set for the host property.
     */
    public void setHost(@jakarta.annotation.Nullable final Host value) {
        this.getBackingStore().set("host", value);
    }
    /**
     * Sets the kind property value. The kind of hostTracker that was detected. For example, GoogleAnalyticsID or JarmHash.
     * @param value Value to set for the kind property.
     */
    public void setKind(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("kind", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The most recent date and time when this hostTracker was observed by Microsoft Defender Threat Intelligence. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("lastSeenDateTime", value);
    }
    /**
     * Sets the value property value. The identification value for the hostTracker.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("value", value);
    }
}
