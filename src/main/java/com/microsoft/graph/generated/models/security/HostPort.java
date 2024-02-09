package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostPort extends Entity implements Parsable {
    /**
     * Instantiates a new {@link HostPort} and sets the default values.
     */
    public HostPort() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HostPort}
     */
    @jakarta.annotation.Nonnull
    public static HostPort createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostPort();
    }
    /**
     * Gets the banners property value. The hostPortBanners retrieved from scanning the port.
     * @return a {@link java.util.List<HostPortBanner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostPortBanner> getBanners() {
        return this.backingStore.get("banners");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("banners", (n) -> { this.setBanners(n.getCollectionOfObjectValues(HostPortBanner::createFromDiscriminatorValue)); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("host", (n) -> { this.setHost(n.getObjectValue(Host::createFromDiscriminatorValue)); });
        deserializerMap.put("lastScanDateTime", (n) -> { this.setLastScanDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mostRecentSslCertificate", (n) -> { this.setMostRecentSslCertificate(n.getObjectValue(SslCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumValue(HostPortProtocol::forValue)); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(HostPortComponent::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(HostPortStatus::forValue)); });
        deserializerMap.put("timesObserved", (n) -> { this.setTimesObserved(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The first date and time when Microsoft Defender Threat Intelligence observed the hostPort. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.backingStore.get("firstSeenDateTime");
    }
    /**
     * Gets the host property value. The host property
     * @return a {@link Host}
     */
    @jakarta.annotation.Nullable
    public Host getHost() {
        return this.backingStore.get("host");
    }
    /**
     * Gets the lastScanDateTime property value. The last date and time when Microsoft Defender Threat Intelligence scanned the hostPort. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastScanDateTime() {
        return this.backingStore.get("lastScanDateTime");
    }
    /**
     * Gets the lastSeenDateTime property value. The last date and time when Microsoft Defender Threat Intelligence observed the hostPort. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.backingStore.get("lastSeenDateTime");
    }
    /**
     * Gets the mostRecentSslCertificate property value. The most recent sslCertificate used to communicate on the port.
     * @return a {@link SslCertificate}
     */
    @jakarta.annotation.Nullable
    public SslCertificate getMostRecentSslCertificate() {
        return this.backingStore.get("mostRecentSslCertificate");
    }
    /**
     * Gets the port property value. The numerical identifier of the port which is standardized across the internet.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.backingStore.get("port");
    }
    /**
     * Gets the protocol property value. The general protocol used to scan the port. The possible values are: tcp, udp, unknownFutureValue.
     * @return a {@link HostPortProtocol}
     */
    @jakarta.annotation.Nullable
    public HostPortProtocol getProtocol() {
        return this.backingStore.get("protocol");
    }
    /**
     * Gets the services property value. The hostPortComponents retrieved from scanning the port.
     * @return a {@link java.util.List<HostPortComponent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostPortComponent> getServices() {
        return this.backingStore.get("services");
    }
    /**
     * Gets the status property value. The status of the port. The possible values are: open, filtered, closed, unknownFutureValue.
     * @return a {@link HostPortStatus}
     */
    @jakarta.annotation.Nullable
    public HostPortStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the timesObserved property value. The total amount of times that Microsoft Defender Threat Intelligence has observed the hostPort in all its scans.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTimesObserved() {
        return this.backingStore.get("timesObserved");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("banners", this.getBanners());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeObjectValue("host", this.getHost());
        writer.writeOffsetDateTimeValue("lastScanDateTime", this.getLastScanDateTime());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeObjectValue("mostRecentSslCertificate", this.getMostRecentSslCertificate());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeEnumValue("protocol", this.getProtocol());
        writer.writeCollectionOfObjectValues("services", this.getServices());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeIntegerValue("timesObserved", this.getTimesObserved());
    }
    /**
     * Sets the banners property value. The hostPortBanners retrieved from scanning the port.
     * @param value Value to set for the banners property.
     */
    public void setBanners(@jakarta.annotation.Nullable final java.util.List<HostPortBanner> value) {
        this.backingStore.set("banners", value);
    }
    /**
     * Sets the firstSeenDateTime property value. The first date and time when Microsoft Defender Threat Intelligence observed the hostPort. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstSeenDateTime", value);
    }
    /**
     * Sets the host property value. The host property
     * @param value Value to set for the host property.
     */
    public void setHost(@jakarta.annotation.Nullable final Host value) {
        this.backingStore.set("host", value);
    }
    /**
     * Sets the lastScanDateTime property value. The last date and time when Microsoft Defender Threat Intelligence scanned the hostPort. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastScanDateTime property.
     */
    public void setLastScanDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastScanDateTime", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The last date and time when Microsoft Defender Threat Intelligence observed the hostPort. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSeenDateTime", value);
    }
    /**
     * Sets the mostRecentSslCertificate property value. The most recent sslCertificate used to communicate on the port.
     * @param value Value to set for the mostRecentSslCertificate property.
     */
    public void setMostRecentSslCertificate(@jakarta.annotation.Nullable final SslCertificate value) {
        this.backingStore.set("mostRecentSslCertificate", value);
    }
    /**
     * Sets the port property value. The numerical identifier of the port which is standardized across the internet.
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("port", value);
    }
    /**
     * Sets the protocol property value. The general protocol used to scan the port. The possible values are: tcp, udp, unknownFutureValue.
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final HostPortProtocol value) {
        this.backingStore.set("protocol", value);
    }
    /**
     * Sets the services property value. The hostPortComponents retrieved from scanning the port.
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<HostPortComponent> value) {
        this.backingStore.set("services", value);
    }
    /**
     * Sets the status property value. The status of the port. The possible values are: open, filtered, closed, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final HostPortStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the timesObserved property value. The total amount of times that Microsoft Defender Threat Intelligence has observed the hostPort in all its scans.
     * @param value Value to set for the timesObserved property.
     */
    public void setTimesObserved(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("timesObserved", value);
    }
}
