package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostSslCertificate extends Artifact implements Parsable {
    /**
     * Instantiates a new HostSslCertificate and sets the default values.
     */
    public HostSslCertificate() {
        super();
        this.setOdataType("#microsoft.graph.security.hostSslCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HostSslCertificate
     */
    @jakarta.annotation.Nonnull
    public static HostSslCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostSslCertificate();
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
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ports", (n) -> { this.setPorts(n.getCollectionOfObjectValues(HostSslCertificatePort::createFromDiscriminatorValue)); });
        deserializerMap.put("sslCertificate", (n) -> { this.setSslCertificate(n.getObjectValue(SslCertificate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The first date and time when this hostSslCertificate was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.BackingStore.get("firstSeenDateTime");
    }
    /**
     * Gets the host property value. The host for this hostSslCertificate.
     * @return a Host
     */
    @jakarta.annotation.Nullable
    public Host getHost() {
        return this.BackingStore.get("host");
    }
    /**
     * Gets the lastSeenDateTime property value. The most recent date and time when this hostSslCertificate was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.BackingStore.get("lastSeenDateTime");
    }
    /**
     * Gets the ports property value. The ports related with this hostSslCertificate.
     * @return a java.util.List<HostSslCertificatePort>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostSslCertificatePort> getPorts() {
        return this.BackingStore.get("ports");
    }
    /**
     * Gets the sslCertificate property value. The sslCertificate for this hostSslCertificate.
     * @return a SslCertificate
     */
    @jakarta.annotation.Nullable
    public SslCertificate getSslCertificate() {
        return this.BackingStore.get("sslCertificate");
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
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeCollectionOfObjectValues("ports", this.getPorts());
        writer.writeObjectValue("sslCertificate", this.getSslCertificate());
    }
    /**
     * Sets the firstSeenDateTime property value. The first date and time when this hostSslCertificate was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("firstSeenDateTime", value);
    }
    /**
     * Sets the host property value. The host for this hostSslCertificate.
     * @param value Value to set for the host property.
     */
    public void setHost(@jakarta.annotation.Nullable final Host value) {
        this.BackingStore.set("host", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The most recent date and time when this hostSslCertificate was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastSeenDateTime", value);
    }
    /**
     * Sets the ports property value. The ports related with this hostSslCertificate.
     * @param value Value to set for the ports property.
     */
    public void setPorts(@jakarta.annotation.Nullable final java.util.List<HostSslCertificatePort> value) {
        this.BackingStore.set("ports", value);
    }
    /**
     * Sets the sslCertificate property value. The sslCertificate for this hostSslCertificate.
     * @param value Value to set for the sslCertificate property.
     */
    public void setSslCertificate(@jakarta.annotation.Nullable final SslCertificate value) {
        this.BackingStore.set("sslCertificate", value);
    }
}
