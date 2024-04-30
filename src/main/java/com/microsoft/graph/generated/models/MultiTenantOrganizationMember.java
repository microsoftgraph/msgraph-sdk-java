package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MultiTenantOrganizationMember extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link MultiTenantOrganizationMember} and sets the default values.
     */
    public MultiTenantOrganizationMember() {
        super();
        this.setOdataType("#microsoft.graph.multiTenantOrganizationMember");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MultiTenantOrganizationMember}
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantOrganizationMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganizationMember();
    }
    /**
     * Gets the addedByTenantId property value. Tenant ID of the tenant that added the tenant to the multitenant organization. Read-only.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getAddedByTenantId() {
        return this.backingStore.get("addedByTenantId");
    }
    /**
     * Gets the addedDateTime property value. Date and time when the tenant was added to the multitenant organization. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAddedDateTime() {
        return this.backingStore.get("addedDateTime");
    }
    /**
     * Gets the displayName property value. Display name of the tenant added to the multitenant organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addedByTenantId", (n) -> { this.setAddedByTenantId(n.getUUIDValue()); });
        deserializerMap.put("addedDateTime", (n) -> { this.setAddedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("joinedDateTime", (n) -> { this.setJoinedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MultiTenantOrganizationMemberRole::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(MultiTenantOrganizationMemberState::forValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("transitionDetails", (n) -> { this.setTransitionDetails(n.getObjectValue(MultiTenantOrganizationMemberTransitionDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the joinedDateTime property value. Date and time when the tenant joined the multitenant organization. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getJoinedDateTime() {
        return this.backingStore.get("joinedDateTime");
    }
    /**
     * Gets the role property value. Role of the tenant in the multitenant organization. The possible values are: owner, member (default), unknownFutureValue. Tenants with the owner role can manage the multitenant organization but tenants with the member role can only participate in a multitenant organization. There can be multiple tenants with the owner role in a multitenant organization.
     * @return a {@link MultiTenantOrganizationMemberRole}
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberRole getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Gets the state property value. State of the tenant in the multitenant organization. The possible values are: pending, active, removed, unknownFutureValue. Tenants in the pending state must join the multitenant organization to participate in the multitenant organization. Tenants in the active state can participate in the multitenant organization. Tenants in the removed state are in the process of being removed from the multitenant organization. Read-only.
     * @return a {@link MultiTenantOrganizationMemberState}
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the tenantId property value. Tenant ID of the Microsoft Entra tenant added to the multitenant organization. Set at the time tenant is added.Supports $filter. Key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the transitionDetails property value. Details of the processing status for a tenant in a multitenant organization. Read-only. Nullable.
     * @return a {@link MultiTenantOrganizationMemberTransitionDetails}
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberTransitionDetails getTransitionDetails() {
        return this.backingStore.get("transitionDetails");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeUUIDValue("addedByTenantId", this.getAddedByTenantId());
        writer.writeOffsetDateTimeValue("addedDateTime", this.getAddedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("joinedDateTime", this.getJoinedDateTime());
        writer.writeEnumValue("role", this.getRole());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeObjectValue("transitionDetails", this.getTransitionDetails());
    }
    /**
     * Sets the addedByTenantId property value. Tenant ID of the tenant that added the tenant to the multitenant organization. Read-only.
     * @param value Value to set for the addedByTenantId property.
     */
    public void setAddedByTenantId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("addedByTenantId", value);
    }
    /**
     * Sets the addedDateTime property value. Date and time when the tenant was added to the multitenant organization. Read-only.
     * @param value Value to set for the addedDateTime property.
     */
    public void setAddedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("addedDateTime", value);
    }
    /**
     * Sets the displayName property value. Display name of the tenant added to the multitenant organization.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the joinedDateTime property value. Date and time when the tenant joined the multitenant organization. Read-only.
     * @param value Value to set for the joinedDateTime property.
     */
    public void setJoinedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("joinedDateTime", value);
    }
    /**
     * Sets the role property value. Role of the tenant in the multitenant organization. The possible values are: owner, member (default), unknownFutureValue. Tenants with the owner role can manage the multitenant organization but tenants with the member role can only participate in a multitenant organization. There can be multiple tenants with the owner role in a multitenant organization.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberRole value) {
        this.backingStore.set("role", value);
    }
    /**
     * Sets the state property value. State of the tenant in the multitenant organization. The possible values are: pending, active, removed, unknownFutureValue. Tenants in the pending state must join the multitenant organization to participate in the multitenant organization. Tenants in the active state can participate in the multitenant organization. Tenants in the removed state are in the process of being removed from the multitenant organization. Read-only.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the tenantId property value. Tenant ID of the Microsoft Entra tenant added to the multitenant organization. Set at the time tenant is added.Supports $filter. Key.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the transitionDetails property value. Details of the processing status for a tenant in a multitenant organization. Read-only. Nullable.
     * @param value Value to set for the transitionDetails property.
     */
    public void setTransitionDetails(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberTransitionDetails value) {
        this.backingStore.set("transitionDetails", value);
    }
}
