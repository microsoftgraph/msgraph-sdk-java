package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProtectionUnitBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ProtectionUnitBase} and sets the default values.
     */
    public ProtectionUnitBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProtectionUnitBase}
     */
    @jakarta.annotation.Nonnull
    public static ProtectionUnitBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.driveProtectionUnit": return new DriveProtectionUnit();
                case "#microsoft.graph.mailboxProtectionUnit": return new MailboxProtectionUnit();
                case "#microsoft.graph.siteProtectionUnit": return new SiteProtectionUnit();
            }
        }
        return new ProtectionUnitBase();
    }
    /**
     * Gets the createdBy property value. The identity of the person who created the protection unit.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The time of creation of the protection unit. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the error property value. Contains error details if an error occurred while creating a protection unit.
     * @return a {@link PublicError}
     */
    @jakarta.annotation.Nullable
    public PublicError getError() {
        return this.backingStore.get("error");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("offboardRequestedDateTime", (n) -> { this.setOffboardRequestedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("protectionSources", (n) -> { this.setProtectionSources(n.getEnumSetValue(ProtectionSource::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ProtectionUnitStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The identity of person who last modified the protection unit.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Timestamp of the last modification of this protection unit. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the offboardRequestedDateTime property value. The date and time when protection unit offboard was requested. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOffboardRequestedDateTime() {
        return this.backingStore.get("offboardRequestedDateTime");
    }
    /**
     * Gets the policyId property value. The unique identifier of the protection policy based on which protection unit was created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the protectionSources property value. The protectionSources property
     * @return a {@link EnumSet<ProtectionSource>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ProtectionSource> getProtectionSources() {
        return this.backingStore.get("protectionSources");
    }
    /**
     * Gets the status property value. The status of the protection unit. The possible values are: protectRequested, protected, unprotectRequested, unprotected, removeRequested, unknownFutureValue, offboardRequested, offboarded, cancelOffboardRequested. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: offboardRequested, offboarded, cancelOffboardRequested.
     * @return a {@link ProtectionUnitStatus}
     */
    @jakarta.annotation.Nullable
    public ProtectionUnitStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("error", this.getError());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("offboardRequestedDateTime", this.getOffboardRequestedDateTime());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeEnumSetValue("protectionSources", this.getProtectionSources());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdBy property value. The identity of the person who created the protection unit.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The time of creation of the protection unit. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the error property value. Contains error details if an error occurred while creating a protection unit.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the lastModifiedBy property value. The identity of person who last modified the protection unit.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Timestamp of the last modification of this protection unit. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the offboardRequestedDateTime property value. The date and time when protection unit offboard was requested. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the offboardRequestedDateTime property.
     */
    public void setOffboardRequestedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("offboardRequestedDateTime", value);
    }
    /**
     * Sets the policyId property value. The unique identifier of the protection policy based on which protection unit was created.
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the protectionSources property value. The protectionSources property
     * @param value Value to set for the protectionSources property.
     */
    public void setProtectionSources(@jakarta.annotation.Nullable final EnumSet<ProtectionSource> value) {
        this.backingStore.set("protectionSources", value);
    }
    /**
     * Sets the status property value. The status of the protection unit. The possible values are: protectRequested, protected, unprotectRequested, unprotected, removeRequested, unknownFutureValue, offboardRequested, offboarded, cancelOffboardRequested. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: offboardRequested, offboarded, cancelOffboardRequested.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ProtectionUnitStatus value) {
        this.backingStore.set("status", value);
    }
}
