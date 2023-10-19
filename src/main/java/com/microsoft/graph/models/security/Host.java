package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Host extends Artifact implements Parsable {
    /**
     * The hostPairs that are resources associated with a host, where that host is the parentHost and has an outgoing pairing to a cihldHost.
     */
    private java.util.List<HostPair> childHostPairs;
    /**
     * The hostComponents that are associated with this host.
     */
    private java.util.List<HostComponent> components;
    /**
     * The hostCookies that are associated with this host.
     */
    private java.util.List<HostCookie> cookies;
    /**
     * The first date and time when this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime firstSeenDateTime;
    /**
     * The hostPairs that are associated with this host, where this host is either the parentHost or childHost.
     */
    private java.util.List<HostPair> hostPairs;
    /**
     * The most recent date and time when this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime lastSeenDateTime;
    /**
     * The hostPairs that are associated with a host, where that host is the childHost and has an incoming pairing with a parentHost.
     */
    private java.util.List<HostPair> parentHostPairs;
    /**
     * Passive DNS retrieval about this host.
     */
    private java.util.List<PassiveDnsRecord> passiveDns;
    /**
     * Reverse passive DNS retrieval about this host.
     */
    private java.util.List<PassiveDnsRecord> passiveDnsReverse;
    /**
     * Represents a calculated reputation of this host.
     */
    private HostReputation reputation;
    /**
     * The hostSslCertificates that are associated with this host.
     */
    private java.util.List<HostSslCertificate> sslCertificates;
    /**
     * The subdomains that are associated with this host.
     */
    private java.util.List<Subdomain> subdomains;
    /**
     * The hostTrackers that are associated with this host.
     */
    private java.util.List<HostTracker> trackers;
    /**
     * The most recent whoisRecord for this host.
     */
    private WhoisRecord whois;
    /**
     * Instantiates a new Host and sets the default values.
     */
    public Host() {
        super();
        this.setOdataType("#microsoft.graph.security.host");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Host
     */
    @jakarta.annotation.Nonnull
    public static Host createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.hostname": return new Hostname();
                case "#microsoft.graph.security.ipAddress": return new IpAddress();
            }
        }
        return new Host();
    }
    /**
     * Gets the childHostPairs property value. The hostPairs that are resources associated with a host, where that host is the parentHost and has an outgoing pairing to a cihldHost.
     * @return a java.util.List<HostPair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostPair> getChildHostPairs() {
        return this.childHostPairs;
    }
    /**
     * Gets the components property value. The hostComponents that are associated with this host.
     * @return a java.util.List<HostComponent>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostComponent> getComponents() {
        return this.components;
    }
    /**
     * Gets the cookies property value. The hostCookies that are associated with this host.
     * @return a java.util.List<HostCookie>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostCookie> getCookies() {
        return this.cookies;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("childHostPairs", (n) -> { this.setChildHostPairs(n.getCollectionOfObjectValues(HostPair::createFromDiscriminatorValue)); });
        deserializerMap.put("components", (n) -> { this.setComponents(n.getCollectionOfObjectValues(HostComponent::createFromDiscriminatorValue)); });
        deserializerMap.put("cookies", (n) -> { this.setCookies(n.getCollectionOfObjectValues(HostCookie::createFromDiscriminatorValue)); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("hostPairs", (n) -> { this.setHostPairs(n.getCollectionOfObjectValues(HostPair::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("parentHostPairs", (n) -> { this.setParentHostPairs(n.getCollectionOfObjectValues(HostPair::createFromDiscriminatorValue)); });
        deserializerMap.put("passiveDns", (n) -> { this.setPassiveDns(n.getCollectionOfObjectValues(PassiveDnsRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("passiveDnsReverse", (n) -> { this.setPassiveDnsReverse(n.getCollectionOfObjectValues(PassiveDnsRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("reputation", (n) -> { this.setReputation(n.getObjectValue(HostReputation::createFromDiscriminatorValue)); });
        deserializerMap.put("sslCertificates", (n) -> { this.setSslCertificates(n.getCollectionOfObjectValues(HostSslCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("subdomains", (n) -> { this.setSubdomains(n.getCollectionOfObjectValues(Subdomain::createFromDiscriminatorValue)); });
        deserializerMap.put("trackers", (n) -> { this.setTrackers(n.getCollectionOfObjectValues(HostTracker::createFromDiscriminatorValue)); });
        deserializerMap.put("whois", (n) -> { this.setWhois(n.getObjectValue(WhoisRecord::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The first date and time when this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.firstSeenDateTime;
    }
    /**
     * Gets the hostPairs property value. The hostPairs that are associated with this host, where this host is either the parentHost or childHost.
     * @return a java.util.List<HostPair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostPair> getHostPairs() {
        return this.hostPairs;
    }
    /**
     * Gets the lastSeenDateTime property value. The most recent date and time when this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.lastSeenDateTime;
    }
    /**
     * Gets the parentHostPairs property value. The hostPairs that are associated with a host, where that host is the childHost and has an incoming pairing with a parentHost.
     * @return a java.util.List<HostPair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostPair> getParentHostPairs() {
        return this.parentHostPairs;
    }
    /**
     * Gets the passiveDns property value. Passive DNS retrieval about this host.
     * @return a java.util.List<PassiveDnsRecord>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PassiveDnsRecord> getPassiveDns() {
        return this.passiveDns;
    }
    /**
     * Gets the passiveDnsReverse property value. Reverse passive DNS retrieval about this host.
     * @return a java.util.List<PassiveDnsRecord>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PassiveDnsRecord> getPassiveDnsReverse() {
        return this.passiveDnsReverse;
    }
    /**
     * Gets the reputation property value. Represents a calculated reputation of this host.
     * @return a HostReputation
     */
    @jakarta.annotation.Nullable
    public HostReputation getReputation() {
        return this.reputation;
    }
    /**
     * Gets the sslCertificates property value. The hostSslCertificates that are associated with this host.
     * @return a java.util.List<HostSslCertificate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostSslCertificate> getSslCertificates() {
        return this.sslCertificates;
    }
    /**
     * Gets the subdomains property value. The subdomains that are associated with this host.
     * @return a java.util.List<Subdomain>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Subdomain> getSubdomains() {
        return this.subdomains;
    }
    /**
     * Gets the trackers property value. The hostTrackers that are associated with this host.
     * @return a java.util.List<HostTracker>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostTracker> getTrackers() {
        return this.trackers;
    }
    /**
     * Gets the whois property value. The most recent whoisRecord for this host.
     * @return a WhoisRecord
     */
    @jakarta.annotation.Nullable
    public WhoisRecord getWhois() {
        return this.whois;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("childHostPairs", this.getChildHostPairs());
        writer.writeCollectionOfObjectValues("components", this.getComponents());
        writer.writeCollectionOfObjectValues("cookies", this.getCookies());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeCollectionOfObjectValues("hostPairs", this.getHostPairs());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeCollectionOfObjectValues("parentHostPairs", this.getParentHostPairs());
        writer.writeCollectionOfObjectValues("passiveDns", this.getPassiveDns());
        writer.writeCollectionOfObjectValues("passiveDnsReverse", this.getPassiveDnsReverse());
        writer.writeObjectValue("reputation", this.getReputation());
        writer.writeCollectionOfObjectValues("sslCertificates", this.getSslCertificates());
        writer.writeCollectionOfObjectValues("subdomains", this.getSubdomains());
        writer.writeCollectionOfObjectValues("trackers", this.getTrackers());
        writer.writeObjectValue("whois", this.getWhois());
    }
    /**
     * Sets the childHostPairs property value. The hostPairs that are resources associated with a host, where that host is the parentHost and has an outgoing pairing to a cihldHost.
     * @param value Value to set for the childHostPairs property.
     */
    public void setChildHostPairs(@jakarta.annotation.Nullable final java.util.List<HostPair> value) {
        this.childHostPairs = value;
    }
    /**
     * Sets the components property value. The hostComponents that are associated with this host.
     * @param value Value to set for the components property.
     */
    public void setComponents(@jakarta.annotation.Nullable final java.util.List<HostComponent> value) {
        this.components = value;
    }
    /**
     * Sets the cookies property value. The hostCookies that are associated with this host.
     * @param value Value to set for the cookies property.
     */
    public void setCookies(@jakarta.annotation.Nullable final java.util.List<HostCookie> value) {
        this.cookies = value;
    }
    /**
     * Sets the firstSeenDateTime property value. The first date and time when this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.firstSeenDateTime = value;
    }
    /**
     * Sets the hostPairs property value. The hostPairs that are associated with this host, where this host is either the parentHost or childHost.
     * @param value Value to set for the hostPairs property.
     */
    public void setHostPairs(@jakarta.annotation.Nullable final java.util.List<HostPair> value) {
        this.hostPairs = value;
    }
    /**
     * Sets the lastSeenDateTime property value. The most recent date and time when this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSeenDateTime = value;
    }
    /**
     * Sets the parentHostPairs property value. The hostPairs that are associated with a host, where that host is the childHost and has an incoming pairing with a parentHost.
     * @param value Value to set for the parentHostPairs property.
     */
    public void setParentHostPairs(@jakarta.annotation.Nullable final java.util.List<HostPair> value) {
        this.parentHostPairs = value;
    }
    /**
     * Sets the passiveDns property value. Passive DNS retrieval about this host.
     * @param value Value to set for the passiveDns property.
     */
    public void setPassiveDns(@jakarta.annotation.Nullable final java.util.List<PassiveDnsRecord> value) {
        this.passiveDns = value;
    }
    /**
     * Sets the passiveDnsReverse property value. Reverse passive DNS retrieval about this host.
     * @param value Value to set for the passiveDnsReverse property.
     */
    public void setPassiveDnsReverse(@jakarta.annotation.Nullable final java.util.List<PassiveDnsRecord> value) {
        this.passiveDnsReverse = value;
    }
    /**
     * Sets the reputation property value. Represents a calculated reputation of this host.
     * @param value Value to set for the reputation property.
     */
    public void setReputation(@jakarta.annotation.Nullable final HostReputation value) {
        this.reputation = value;
    }
    /**
     * Sets the sslCertificates property value. The hostSslCertificates that are associated with this host.
     * @param value Value to set for the sslCertificates property.
     */
    public void setSslCertificates(@jakarta.annotation.Nullable final java.util.List<HostSslCertificate> value) {
        this.sslCertificates = value;
    }
    /**
     * Sets the subdomains property value. The subdomains that are associated with this host.
     * @param value Value to set for the subdomains property.
     */
    public void setSubdomains(@jakarta.annotation.Nullable final java.util.List<Subdomain> value) {
        this.subdomains = value;
    }
    /**
     * Sets the trackers property value. The hostTrackers that are associated with this host.
     * @param value Value to set for the trackers property.
     */
    public void setTrackers(@jakarta.annotation.Nullable final java.util.List<HostTracker> value) {
        this.trackers = value;
    }
    /**
     * Sets the whois property value. The most recent whoisRecord for this host.
     * @param value Value to set for the whois property.
     */
    public void setWhois(@jakarta.annotation.Nullable final WhoisRecord value) {
        this.whois = value;
    }
}
