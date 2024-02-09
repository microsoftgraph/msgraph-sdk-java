package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PassiveDnsRecord extends Artifact implements Parsable {
    /**
     * Instantiates a new {@link PassiveDnsRecord} and sets the default values.
     */
    public PassiveDnsRecord() {
        super();
        this.setOdataType("#microsoft.graph.security.passiveDnsRecord");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PassiveDnsRecord}
     */
    @jakarta.annotation.Nonnull
    public static PassiveDnsRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PassiveDnsRecord();
    }
    /**
     * Gets the artifact property value. The artifact property
     * @return a {@link Artifact}
     */
    @jakarta.annotation.Nullable
    public Artifact getArtifact() {
        return this.backingStore.get("artifact");
    }
    /**
     * Gets the collectedDateTime property value. The date and time that this passiveDnsRecord entry was collected by Microsoft. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCollectedDateTime() {
        return this.backingStore.get("collectedDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("artifact", (n) -> { this.setArtifact(n.getObjectValue(Artifact::createFromDiscriminatorValue)); });
        deserializerMap.put("collectedDateTime", (n) -> { this.setCollectedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("parentHost", (n) -> { this.setParentHost(n.getObjectValue(Host::createFromDiscriminatorValue)); });
        deserializerMap.put("recordType", (n) -> { this.setRecordType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The date and time when this passiveDnsRecord entry was first seen. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.backingStore.get("firstSeenDateTime");
    }
    /**
     * Gets the lastSeenDateTime property value. The date and time when this passiveDnsRecord entry was most recently seen. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.backingStore.get("lastSeenDateTime");
    }
    /**
     * Gets the parentHost property value. The parentHost property
     * @return a {@link Host}
     */
    @jakarta.annotation.Nullable
    public Host getParentHost() {
        return this.backingStore.get("parentHost");
    }
    /**
     * Gets the recordType property value. The DNS record type for this passiveDnsRecord entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecordType() {
        return this.backingStore.get("recordType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("artifact", this.getArtifact());
        writer.writeOffsetDateTimeValue("collectedDateTime", this.getCollectedDateTime());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeObjectValue("parentHost", this.getParentHost());
        writer.writeStringValue("recordType", this.getRecordType());
    }
    /**
     * Sets the artifact property value. The artifact property
     * @param value Value to set for the artifact property.
     */
    public void setArtifact(@jakarta.annotation.Nullable final Artifact value) {
        this.backingStore.set("artifact", value);
    }
    /**
     * Sets the collectedDateTime property value. The date and time that this passiveDnsRecord entry was collected by Microsoft. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the collectedDateTime property.
     */
    public void setCollectedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("collectedDateTime", value);
    }
    /**
     * Sets the firstSeenDateTime property value. The date and time when this passiveDnsRecord entry was first seen. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstSeenDateTime", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The date and time when this passiveDnsRecord entry was most recently seen. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSeenDateTime", value);
    }
    /**
     * Sets the parentHost property value. The parentHost property
     * @param value Value to set for the parentHost property.
     */
    public void setParentHost(@jakarta.annotation.Nullable final Host value) {
        this.backingStore.set("parentHost", value);
    }
    /**
     * Sets the recordType property value. The DNS record type for this passiveDnsRecord entry.
     * @param value Value to set for the recordType property.
     */
    public void setRecordType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recordType", value);
    }
}
