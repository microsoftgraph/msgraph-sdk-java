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
public class WhoisBaseRecord extends Entity implements Parsable {
    /**
     * Instantiates a new WhoisBaseRecord and sets the default values.
     */
    public WhoisBaseRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WhoisBaseRecord
     */
    @jakarta.annotation.Nonnull
    public static WhoisBaseRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.whoisHistoryRecord": return new WhoisHistoryRecord();
                case "#microsoft.graph.security.whoisRecord": return new WhoisRecord();
            }
        }
        return new WhoisBaseRecord();
    }
    /**
     * Gets the abuse property value. The contact information for the abuse contact.
     * @return a WhoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getAbuse() {
        return this.getBackingStore().get("abuse");
    }
    /**
     * Gets the admin property value. The contact information for the admin contact.
     * @return a WhoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getAdmin() {
        return this.getBackingStore().get("admin");
    }
    /**
     * Gets the billing property value. The contact information for the billing contact.
     * @return a WhoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getBilling() {
        return this.getBackingStore().get("billing");
    }
    /**
     * Gets the domainStatus property value. The domain status for this WHOIS object.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDomainStatus() {
        return this.getBackingStore().get("domainStatus");
    }
    /**
     * Gets the expirationDateTime property value. The date and time when this WHOIS record expires with the registrar. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.getBackingStore().get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("abuse", (n) -> { this.setAbuse(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("admin", (n) -> { this.setAdmin(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("billing", (n) -> { this.setBilling(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("domainStatus", (n) -> { this.setDomainStatus(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("host", (n) -> { this.setHost(n.getObjectValue(Host::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastUpdateDateTime", (n) -> { this.setLastUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("nameservers", (n) -> { this.setNameservers(n.getCollectionOfObjectValues(WhoisNameserver::createFromDiscriminatorValue)); });
        deserializerMap.put("noc", (n) -> { this.setNoc(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("rawWhoisText", (n) -> { this.setRawWhoisText(n.getStringValue()); });
        deserializerMap.put("registrant", (n) -> { this.setRegistrant(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("registrar", (n) -> { this.setRegistrar(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("registrationDateTime", (n) -> { this.setRegistrationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("technical", (n) -> { this.setTechnical(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        deserializerMap.put("whoisServer", (n) -> { this.setWhoisServer(n.getStringValue()); });
        deserializerMap.put("zone", (n) -> { this.setZone(n.getObjectValue(WhoisContact::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The first seen date and time of this WHOIS record. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
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
     * Gets the lastSeenDateTime property value. The last seen date and time of this WHOIS record. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.getBackingStore().get("lastSeenDateTime");
    }
    /**
     * Gets the lastUpdateDateTime property value. The date and time when this WHOIS record was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this.getBackingStore().get("lastUpdateDateTime");
    }
    /**
     * Gets the nameservers property value. The nameservers for this WHOIS object.
     * @return a java.util.List<WhoisNameserver>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WhoisNameserver> getNameservers() {
        return this.getBackingStore().get("nameservers");
    }
    /**
     * Gets the noc property value. The contact information for the noc contact.
     * @return a WhoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getNoc() {
        return this.getBackingStore().get("noc");
    }
    /**
     * Gets the rawWhoisText property value. The raw WHOIS details for this WHOIS object.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRawWhoisText() {
        return this.getBackingStore().get("rawWhoisText");
    }
    /**
     * Gets the registrant property value. The contact information for the registrant contact.
     * @return a WhoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getRegistrant() {
        return this.getBackingStore().get("registrant");
    }
    /**
     * Gets the registrar property value. The contact information for the registrar contact.
     * @return a WhoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getRegistrar() {
        return this.getBackingStore().get("registrar");
    }
    /**
     * Gets the registrationDateTime property value. The date and time when this WHOIS record was registered with a registrar. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRegistrationDateTime() {
        return this.getBackingStore().get("registrationDateTime");
    }
    /**
     * Gets the technical property value. The contact information for the technical contact.
     * @return a WhoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getTechnical() {
        return this.getBackingStore().get("technical");
    }
    /**
     * Gets the whoisServer property value. The WHOIS server that provides the details.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWhoisServer() {
        return this.getBackingStore().get("whoisServer");
    }
    /**
     * Gets the zone property value. The contact information for the zone contact.
     * @return a WhoisContact
     */
    @jakarta.annotation.Nullable
    public WhoisContact getZone() {
        return this.getBackingStore().get("zone");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("abuse", this.getAbuse());
        writer.writeObjectValue("admin", this.getAdmin());
        writer.writeObjectValue("billing", this.getBilling());
        writer.writeStringValue("domainStatus", this.getDomainStatus());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeObjectValue("host", this.getHost());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeOffsetDateTimeValue("lastUpdateDateTime", this.getLastUpdateDateTime());
        writer.writeCollectionOfObjectValues("nameservers", this.getNameservers());
        writer.writeObjectValue("noc", this.getNoc());
        writer.writeStringValue("rawWhoisText", this.getRawWhoisText());
        writer.writeObjectValue("registrant", this.getRegistrant());
        writer.writeObjectValue("registrar", this.getRegistrar());
        writer.writeOffsetDateTimeValue("registrationDateTime", this.getRegistrationDateTime());
        writer.writeObjectValue("technical", this.getTechnical());
        writer.writeStringValue("whoisServer", this.getWhoisServer());
        writer.writeObjectValue("zone", this.getZone());
    }
    /**
     * Sets the abuse property value. The contact information for the abuse contact.
     * @param value Value to set for the abuse property.
     */
    public void setAbuse(@jakarta.annotation.Nullable final WhoisContact value) {
        this.getBackingStore().set("abuse", value);
    }
    /**
     * Sets the admin property value. The contact information for the admin contact.
     * @param value Value to set for the admin property.
     */
    public void setAdmin(@jakarta.annotation.Nullable final WhoisContact value) {
        this.getBackingStore().set("admin", value);
    }
    /**
     * Sets the billing property value. The contact information for the billing contact.
     * @param value Value to set for the billing property.
     */
    public void setBilling(@jakarta.annotation.Nullable final WhoisContact value) {
        this.getBackingStore().set("billing", value);
    }
    /**
     * Sets the domainStatus property value. The domain status for this WHOIS object.
     * @param value Value to set for the domainStatus property.
     */
    public void setDomainStatus(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("domainStatus", value);
    }
    /**
     * Sets the expirationDateTime property value. The date and time when this WHOIS record expires with the registrar. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("expirationDateTime", value);
    }
    /**
     * Sets the firstSeenDateTime property value. The first seen date and time of this WHOIS record. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
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
     * Sets the lastSeenDateTime property value. The last seen date and time of this WHOIS record. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("lastSeenDateTime", value);
    }
    /**
     * Sets the lastUpdateDateTime property value. The date and time when this WHOIS record was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastUpdateDateTime property.
     */
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("lastUpdateDateTime", value);
    }
    /**
     * Sets the nameservers property value. The nameservers for this WHOIS object.
     * @param value Value to set for the nameservers property.
     */
    public void setNameservers(@jakarta.annotation.Nullable final java.util.List<WhoisNameserver> value) {
        this.getBackingStore().set("nameservers", value);
    }
    /**
     * Sets the noc property value. The contact information for the noc contact.
     * @param value Value to set for the noc property.
     */
    public void setNoc(@jakarta.annotation.Nullable final WhoisContact value) {
        this.getBackingStore().set("noc", value);
    }
    /**
     * Sets the rawWhoisText property value. The raw WHOIS details for this WHOIS object.
     * @param value Value to set for the rawWhoisText property.
     */
    public void setRawWhoisText(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("rawWhoisText", value);
    }
    /**
     * Sets the registrant property value. The contact information for the registrant contact.
     * @param value Value to set for the registrant property.
     */
    public void setRegistrant(@jakarta.annotation.Nullable final WhoisContact value) {
        this.getBackingStore().set("registrant", value);
    }
    /**
     * Sets the registrar property value. The contact information for the registrar contact.
     * @param value Value to set for the registrar property.
     */
    public void setRegistrar(@jakarta.annotation.Nullable final WhoisContact value) {
        this.getBackingStore().set("registrar", value);
    }
    /**
     * Sets the registrationDateTime property value. The date and time when this WHOIS record was registered with a registrar. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the registrationDateTime property.
     */
    public void setRegistrationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.getBackingStore().set("registrationDateTime", value);
    }
    /**
     * Sets the technical property value. The contact information for the technical contact.
     * @param value Value to set for the technical property.
     */
    public void setTechnical(@jakarta.annotation.Nullable final WhoisContact value) {
        this.getBackingStore().set("technical", value);
    }
    /**
     * Sets the whoisServer property value. The WHOIS server that provides the details.
     * @param value Value to set for the whoisServer property.
     */
    public void setWhoisServer(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("whoisServer", value);
    }
    /**
     * Sets the zone property value. The contact information for the zone contact.
     * @param value Value to set for the zone property.
     */
    public void setZone(@jakarta.annotation.Nullable final WhoisContact value) {
        this.getBackingStore().set("zone", value);
    }
}
