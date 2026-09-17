package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GovernanceRelationship extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GovernanceRelationship} and sets the default values.
     */
    public GovernanceRelationship() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GovernanceRelationship}
     */
    @jakarta.annotation.Nonnull
    public static GovernanceRelationship createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRelationship();
    }
    /**
     * Gets the createdType property value. The createdType property
     * @return a {@link RelationshipCreationType}
     */
    @jakarta.annotation.Nullable
    public RelationshipCreationType getCreatedType() {
        return this.backingStore.get("createdType");
    }
    /**
     * Gets the creationDateTime property value. The creationDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.backingStore.get("creationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdType", (n) -> { this.setCreatedType(n.getEnumValue(RelationshipCreationType::forValue)); });
        deserializerMap.put("creationDateTime", (n) -> { this.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("governedTenantId", (n) -> { this.setGovernedTenantId(n.getStringValue()); });
        deserializerMap.put("governedTenantName", (n) -> { this.setGovernedTenantName(n.getStringValue()); });
        deserializerMap.put("governingTenantId", (n) -> { this.setGoverningTenantId(n.getStringValue()); });
        deserializerMap.put("governingTenantName", (n) -> { this.setGoverningTenantName(n.getStringValue()); });
        deserializerMap.put("policySnapshot", (n) -> { this.setPolicySnapshot(n.getObjectValue(RelationshipPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RelationshipStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the governedTenantId property value. The governedTenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGovernedTenantId() {
        return this.backingStore.get("governedTenantId");
    }
    /**
     * Gets the governedTenantName property value. The governedTenantName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGovernedTenantName() {
        return this.backingStore.get("governedTenantName");
    }
    /**
     * Gets the governingTenantId property value. The governingTenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGoverningTenantId() {
        return this.backingStore.get("governingTenantId");
    }
    /**
     * Gets the governingTenantName property value. The governingTenantName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGoverningTenantName() {
        return this.backingStore.get("governingTenantName");
    }
    /**
     * Gets the policySnapshot property value. The policySnapshot property
     * @return a {@link RelationshipPolicy}
     */
    @jakarta.annotation.Nullable
    public RelationshipPolicy getPolicySnapshot() {
        return this.backingStore.get("policySnapshot");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link RelationshipStatus}
     */
    @jakarta.annotation.Nullable
    public RelationshipStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("createdType", this.getCreatedType());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeStringValue("governedTenantId", this.getGovernedTenantId());
        writer.writeStringValue("governedTenantName", this.getGovernedTenantName());
        writer.writeStringValue("governingTenantId", this.getGoverningTenantId());
        writer.writeStringValue("governingTenantName", this.getGoverningTenantName());
        writer.writeObjectValue("policySnapshot", this.getPolicySnapshot());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdType property value. The createdType property
     * @param value Value to set for the createdType property.
     */
    public void setCreatedType(@jakarta.annotation.Nullable final RelationshipCreationType value) {
        this.backingStore.set("createdType", value);
    }
    /**
     * Sets the creationDateTime property value. The creationDateTime property
     * @param value Value to set for the creationDateTime property.
     */
    public void setCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("creationDateTime", value);
    }
    /**
     * Sets the governedTenantId property value. The governedTenantId property
     * @param value Value to set for the governedTenantId property.
     */
    public void setGovernedTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("governedTenantId", value);
    }
    /**
     * Sets the governedTenantName property value. The governedTenantName property
     * @param value Value to set for the governedTenantName property.
     */
    public void setGovernedTenantName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("governedTenantName", value);
    }
    /**
     * Sets the governingTenantId property value. The governingTenantId property
     * @param value Value to set for the governingTenantId property.
     */
    public void setGoverningTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("governingTenantId", value);
    }
    /**
     * Sets the governingTenantName property value. The governingTenantName property
     * @param value Value to set for the governingTenantName property.
     */
    public void setGoverningTenantName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("governingTenantName", value);
    }
    /**
     * Sets the policySnapshot property value. The policySnapshot property
     * @param value Value to set for the policySnapshot property.
     */
    public void setPolicySnapshot(@jakarta.annotation.Nullable final RelationshipPolicy value) {
        this.backingStore.set("policySnapshot", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final RelationshipStatus value) {
        this.backingStore.set("status", value);
    }
}
