package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Host extends Artifact implements Parsable {
    /**
     * The hostComponents that are associated with this host.
     */
    private java.util.List<HostComponent> components;
    /**
     * The hostCookies that are associated with this host.
     */
    private java.util.List<HostCookie> cookies;
    /**
     * The first date and time this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime firstSeenDateTime;
    /**
     * The most recent date and time when this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime lastSeenDateTime;
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
     * The hostTrackers that are associated with this host.
     */
    private java.util.List<HostTracker> trackers;
    /**
     * Instantiates a new host and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Host() {
        super();
        this.setOdataType("#microsoft.graph.security.host");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a host
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
     * Gets the components property value. The hostComponents that are associated with this host.
     * @return a hostComponent
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostComponent> getComponents() {
        return this.components;
    }
    /**
     * Gets the cookies property value. The hostCookies that are associated with this host.
     * @return a hostCookie
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
        deserializerMap.put("components", (n) -> { this.setComponents(n.getCollectionOfObjectValues(HostComponent::createFromDiscriminatorValue)); });
        deserializerMap.put("cookies", (n) -> { this.setCookies(n.getCollectionOfObjectValues(HostCookie::createFromDiscriminatorValue)); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("passiveDns", (n) -> { this.setPassiveDns(n.getCollectionOfObjectValues(PassiveDnsRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("passiveDnsReverse", (n) -> { this.setPassiveDnsReverse(n.getCollectionOfObjectValues(PassiveDnsRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("reputation", (n) -> { this.setReputation(n.getObjectValue(HostReputation::createFromDiscriminatorValue)); });
        deserializerMap.put("trackers", (n) -> { this.setTrackers(n.getCollectionOfObjectValues(HostTracker::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The first date and time this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.firstSeenDateTime;
    }
    /**
     * Gets the lastSeenDateTime property value. The most recent date and time when this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.lastSeenDateTime;
    }
    /**
     * Gets the passiveDns property value. Passive DNS retrieval about this host.
     * @return a passiveDnsRecord
     */
    @jakarta.annotation.Nullable
    public java.util.List<PassiveDnsRecord> getPassiveDns() {
        return this.passiveDns;
    }
    /**
     * Gets the passiveDnsReverse property value. Reverse passive DNS retrieval about this host.
     * @return a passiveDnsRecord
     */
    @jakarta.annotation.Nullable
    public java.util.List<PassiveDnsRecord> getPassiveDnsReverse() {
        return this.passiveDnsReverse;
    }
    /**
     * Gets the reputation property value. Represents a calculated reputation of this host.
     * @return a hostReputation
     */
    @jakarta.annotation.Nullable
    public HostReputation getReputation() {
        return this.reputation;
    }
    /**
     * Gets the trackers property value. The hostTrackers that are associated with this host.
     * @return a hostTracker
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostTracker> getTrackers() {
        return this.trackers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("components", this.getComponents());
        writer.writeCollectionOfObjectValues("cookies", this.getCookies());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeCollectionOfObjectValues("passiveDns", this.getPassiveDns());
        writer.writeCollectionOfObjectValues("passiveDnsReverse", this.getPassiveDnsReverse());
        writer.writeObjectValue("reputation", this.getReputation());
        writer.writeCollectionOfObjectValues("trackers", this.getTrackers());
    }
    /**
     * Sets the components property value. The hostComponents that are associated with this host.
     * @param value Value to set for the components property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setComponents(@jakarta.annotation.Nullable final java.util.List<HostComponent> value) {
        this.components = value;
    }
    /**
     * Sets the cookies property value. The hostCookies that are associated with this host.
     * @param value Value to set for the cookies property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCookies(@jakarta.annotation.Nullable final java.util.List<HostCookie> value) {
        this.cookies = value;
    }
    /**
     * Sets the firstSeenDateTime property value. The first date and time this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSeenDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.firstSeenDateTime = value;
    }
    /**
     * Sets the lastSeenDateTime property value. The most recent date and time when this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSeenDateTime = value;
    }
    /**
     * Sets the passiveDns property value. Passive DNS retrieval about this host.
     * @param value Value to set for the passiveDns property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPassiveDns(@jakarta.annotation.Nullable final java.util.List<PassiveDnsRecord> value) {
        this.passiveDns = value;
    }
    /**
     * Sets the passiveDnsReverse property value. Reverse passive DNS retrieval about this host.
     * @param value Value to set for the passiveDnsReverse property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPassiveDnsReverse(@jakarta.annotation.Nullable final java.util.List<PassiveDnsRecord> value) {
        this.passiveDnsReverse = value;
    }
    /**
     * Sets the reputation property value. Represents a calculated reputation of this host.
     * @param value Value to set for the reputation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setReputation(@jakarta.annotation.Nullable final HostReputation value) {
        this.reputation = value;
    }
    /**
     * Sets the trackers property value. The hostTrackers that are associated with this host.
     * @param value Value to set for the trackers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTrackers(@jakarta.annotation.Nullable final java.util.List<HostTracker> value) {
        this.trackers = value;
    }
}
