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
public class RestoreArtifactsBulkRequestBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RestoreArtifactsBulkRequestBase} and sets the default values.
     */
    public RestoreArtifactsBulkRequestBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RestoreArtifactsBulkRequestBase}
     */
    @jakarta.annotation.Nonnull
    public static RestoreArtifactsBulkRequestBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.driveRestoreArtifactsBulkAdditionRequest": return new DriveRestoreArtifactsBulkAdditionRequest();
                case "#microsoft.graph.mailboxRestoreArtifactsBulkAdditionRequest": return new MailboxRestoreArtifactsBulkAdditionRequest();
                case "#microsoft.graph.siteRestoreArtifactsBulkAdditionRequest": return new SiteRestoreArtifactsBulkAdditionRequest();
            }
        }
        return new RestoreArtifactsBulkRequestBase();
    }
    /**
     * Gets the createdBy property value. The identity of the person who created the bulk request.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The time when the bulk request was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the destinationType property value. Indicates the restoration destination. The possible values are: new, inPlace, unknownFutureValue.
     * @return a {@link DestinationType}
     */
    @jakarta.annotation.Nullable
    public DestinationType getDestinationType() {
        return this.backingStore.get("destinationType");
    }
    /**
     * Gets the displayName property value. Name of the addition request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the error property value. Error details are populated for resource resolution failures.
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
        deserializerMap.put("destinationType", (n) -> { this.setDestinationType(n.getEnumValue(DestinationType::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("protectionTimePeriod", (n) -> { this.setProtectionTimePeriod(n.getObjectValue(TimePeriod::createFromDiscriminatorValue)); });
        deserializerMap.put("protectionUnitIds", (n) -> { this.setProtectionUnitIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("restorePointPreference", (n) -> { this.setRestorePointPreference(n.getEnumValue(RestorePointPreference::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RestoreArtifactsBulkRequestStatus::forValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getEnumSetValue(RestorePointTags::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the person who last modified this entity.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Timestamp when this entity was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the protectionTimePeriod property value. The start and end date and time of the protection period.
     * @return a {@link TimePeriod}
     */
    @jakarta.annotation.Nullable
    public TimePeriod getProtectionTimePeriod() {
        return this.backingStore.get("protectionTimePeriod");
    }
    /**
     * Gets the protectionUnitIds property value. Indicates which protection units to restore. This property isn&apos;t implemented yet. Future value; don&apos;t use.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProtectionUnitIds() {
        return this.backingStore.get("protectionUnitIds");
    }
    /**
     * Gets the restorePointPreference property value. Indicates which restore point to return. The possible values are: oldest, latest, unknownFutureValue.
     * @return a {@link RestorePointPreference}
     */
    @jakarta.annotation.Nullable
    public RestorePointPreference getRestorePointPreference() {
        return this.backingStore.get("restorePointPreference");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link RestoreArtifactsBulkRequestStatus}
     */
    @jakarta.annotation.Nullable
    public RestoreArtifactsBulkRequestStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the tags property value. The type of the restore point. The possible values are: none, fastRestore, unknownFutureValue.
     * @return a {@link EnumSet<RestorePointTags>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<RestorePointTags> getTags() {
        return this.backingStore.get("tags");
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
        writer.writeEnumValue("destinationType", this.getDestinationType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("error", this.getError());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("protectionTimePeriod", this.getProtectionTimePeriod());
        writer.writeCollectionOfPrimitiveValues("protectionUnitIds", this.getProtectionUnitIds());
        writer.writeEnumValue("restorePointPreference", this.getRestorePointPreference());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumSetValue("tags", this.getTags());
    }
    /**
     * Sets the createdBy property value. The identity of the person who created the bulk request.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The time when the bulk request was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the destinationType property value. Indicates the restoration destination. The possible values are: new, inPlace, unknownFutureValue.
     * @param value Value to set for the destinationType property.
     */
    public void setDestinationType(@jakarta.annotation.Nullable final DestinationType value) {
        this.backingStore.set("destinationType", value);
    }
    /**
     * Sets the displayName property value. Name of the addition request.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the error property value. Error details are populated for resource resolution failures.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the person who last modified this entity.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Timestamp when this entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the protectionTimePeriod property value. The start and end date and time of the protection period.
     * @param value Value to set for the protectionTimePeriod property.
     */
    public void setProtectionTimePeriod(@jakarta.annotation.Nullable final TimePeriod value) {
        this.backingStore.set("protectionTimePeriod", value);
    }
    /**
     * Sets the protectionUnitIds property value. Indicates which protection units to restore. This property isn&apos;t implemented yet. Future value; don&apos;t use.
     * @param value Value to set for the protectionUnitIds property.
     */
    public void setProtectionUnitIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("protectionUnitIds", value);
    }
    /**
     * Sets the restorePointPreference property value. Indicates which restore point to return. The possible values are: oldest, latest, unknownFutureValue.
     * @param value Value to set for the restorePointPreference property.
     */
    public void setRestorePointPreference(@jakarta.annotation.Nullable final RestorePointPreference value) {
        this.backingStore.set("restorePointPreference", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final RestoreArtifactsBulkRequestStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the tags property value. The type of the restore point. The possible values are: none, fastRestore, unknownFutureValue.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final EnumSet<RestorePointTags> value) {
        this.backingStore.set("tags", value);
    }
}
