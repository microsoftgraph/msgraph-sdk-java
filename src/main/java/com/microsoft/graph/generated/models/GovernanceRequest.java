package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GovernanceRequest extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GovernanceRequest} and sets the default values.
     */
    public GovernanceRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GovernanceRequest}
     */
    @jakarta.annotation.Nonnull
    public static GovernanceRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRequest();
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("governancePolicyTemplate", (n) -> { this.setGovernancePolicyTemplate(n.getObjectValue(TenantGovernancePolicyTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("governedTenantId", (n) -> { this.setGovernedTenantId(n.getStringValue()); });
        deserializerMap.put("governedTenantName", (n) -> { this.setGovernedTenantName(n.getStringValue()); });
        deserializerMap.put("governingTenantId", (n) -> { this.setGoverningTenantId(n.getStringValue()); });
        deserializerMap.put("governingTenantName", (n) -> { this.setGoverningTenantName(n.getStringValue()); });
        deserializerMap.put("policySnapshot", (n) -> { this.setPolicySnapshot(n.getObjectValue(RelationshipPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("requestDateTime", (n) -> { this.setRequestDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RequestStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the governancePolicyTemplate property value. The governancePolicyTemplate property
     * @return a {@link TenantGovernancePolicyTemplate}
     */
    @jakarta.annotation.Nullable
    public TenantGovernancePolicyTemplate getGovernancePolicyTemplate() {
        return this.backingStore.get("governancePolicyTemplate");
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
     * Gets the requestDateTime property value. The requestDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this.backingStore.get("requestDateTime");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link RequestStatus}
     */
    @jakarta.annotation.Nullable
    public RequestStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeObjectValue("governancePolicyTemplate", this.getGovernancePolicyTemplate());
        writer.writeStringValue("governedTenantId", this.getGovernedTenantId());
        writer.writeStringValue("governedTenantName", this.getGovernedTenantName());
        writer.writeStringValue("governingTenantId", this.getGoverningTenantId());
        writer.writeStringValue("governingTenantName", this.getGoverningTenantName());
        writer.writeObjectValue("policySnapshot", this.getPolicySnapshot());
        writer.writeOffsetDateTimeValue("requestDateTime", this.getRequestDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the governancePolicyTemplate property value. The governancePolicyTemplate property
     * @param value Value to set for the governancePolicyTemplate property.
     */
    public void setGovernancePolicyTemplate(@jakarta.annotation.Nullable final TenantGovernancePolicyTemplate value) {
        this.backingStore.set("governancePolicyTemplate", value);
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
     * Sets the requestDateTime property value. The requestDateTime property
     * @param value Value to set for the requestDateTime property.
     */
    public void setRequestDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestDateTime", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final RequestStatus value) {
        this.backingStore.set("status", value);
    }
}
