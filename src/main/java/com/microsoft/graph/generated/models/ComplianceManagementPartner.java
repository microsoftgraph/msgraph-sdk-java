package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Compliance management partner for all platforms
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComplianceManagementPartner extends Entity implements Parsable {
    /**
     * Instantiates a new ComplianceManagementPartner and sets the default values.
     */
    public ComplianceManagementPartner() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ComplianceManagementPartner
     */
    @jakarta.annotation.Nonnull
    public static ComplianceManagementPartner createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComplianceManagementPartner();
    }
    /**
     * Gets the androidEnrollmentAssignments property value. User groups which enroll Android devices through partner.
     * @return a java.util.List<ComplianceManagementPartnerAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ComplianceManagementPartnerAssignment> getAndroidEnrollmentAssignments() {
        return this.backingStore.get("androidEnrollmentAssignments");
    }
    /**
     * Gets the androidOnboarded property value. Partner onboarded for Android devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAndroidOnboarded() {
        return this.backingStore.get("androidOnboarded");
    }
    /**
     * Gets the displayName property value. Partner display name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("androidEnrollmentAssignments", (n) -> { this.setAndroidEnrollmentAssignments(n.getCollectionOfObjectValues(ComplianceManagementPartnerAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("androidOnboarded", (n) -> { this.setAndroidOnboarded(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("iosEnrollmentAssignments", (n) -> { this.setIosEnrollmentAssignments(n.getCollectionOfObjectValues(ComplianceManagementPartnerAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("iosOnboarded", (n) -> { this.setIosOnboarded(n.getBooleanValue()); });
        deserializerMap.put("lastHeartbeatDateTime", (n) -> { this.setLastHeartbeatDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("macOsEnrollmentAssignments", (n) -> { this.setMacOsEnrollmentAssignments(n.getCollectionOfObjectValues(ComplianceManagementPartnerAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("macOsOnboarded", (n) -> { this.setMacOsOnboarded(n.getBooleanValue()); });
        deserializerMap.put("partnerState", (n) -> { this.setPartnerState(n.getEnumValue(DeviceManagementPartnerTenantState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the iosEnrollmentAssignments property value. User groups which enroll ios devices through partner.
     * @return a java.util.List<ComplianceManagementPartnerAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ComplianceManagementPartnerAssignment> getIosEnrollmentAssignments() {
        return this.backingStore.get("iosEnrollmentAssignments");
    }
    /**
     * Gets the iosOnboarded property value. Partner onboarded for ios devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIosOnboarded() {
        return this.backingStore.get("iosOnboarded");
    }
    /**
     * Gets the lastHeartbeatDateTime property value. Timestamp of last heartbeat after admin onboarded to the compliance management partner
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastHeartbeatDateTime() {
        return this.backingStore.get("lastHeartbeatDateTime");
    }
    /**
     * Gets the macOsEnrollmentAssignments property value. User groups which enroll Mac devices through partner.
     * @return a java.util.List<ComplianceManagementPartnerAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ComplianceManagementPartnerAssignment> getMacOsEnrollmentAssignments() {
        return this.backingStore.get("macOsEnrollmentAssignments");
    }
    /**
     * Gets the macOsOnboarded property value. Partner onboarded for Mac devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMacOsOnboarded() {
        return this.backingStore.get("macOsOnboarded");
    }
    /**
     * Gets the partnerState property value. Partner state of this tenant.
     * @return a DeviceManagementPartnerTenantState
     */
    @jakarta.annotation.Nullable
    public DeviceManagementPartnerTenantState getPartnerState() {
        return this.backingStore.get("partnerState");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("androidEnrollmentAssignments", this.getAndroidEnrollmentAssignments());
        writer.writeBooleanValue("androidOnboarded", this.getAndroidOnboarded());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("iosEnrollmentAssignments", this.getIosEnrollmentAssignments());
        writer.writeBooleanValue("iosOnboarded", this.getIosOnboarded());
        writer.writeOffsetDateTimeValue("lastHeartbeatDateTime", this.getLastHeartbeatDateTime());
        writer.writeCollectionOfObjectValues("macOsEnrollmentAssignments", this.getMacOsEnrollmentAssignments());
        writer.writeBooleanValue("macOsOnboarded", this.getMacOsOnboarded());
        writer.writeEnumValue("partnerState", this.getPartnerState());
    }
    /**
     * Sets the androidEnrollmentAssignments property value. User groups which enroll Android devices through partner.
     * @param value Value to set for the androidEnrollmentAssignments property.
     */
    public void setAndroidEnrollmentAssignments(@jakarta.annotation.Nullable final java.util.List<ComplianceManagementPartnerAssignment> value) {
        this.backingStore.set("androidEnrollmentAssignments", value);
    }
    /**
     * Sets the androidOnboarded property value. Partner onboarded for Android devices.
     * @param value Value to set for the androidOnboarded property.
     */
    public void setAndroidOnboarded(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("androidOnboarded", value);
    }
    /**
     * Sets the displayName property value. Partner display name
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the iosEnrollmentAssignments property value. User groups which enroll ios devices through partner.
     * @param value Value to set for the iosEnrollmentAssignments property.
     */
    public void setIosEnrollmentAssignments(@jakarta.annotation.Nullable final java.util.List<ComplianceManagementPartnerAssignment> value) {
        this.backingStore.set("iosEnrollmentAssignments", value);
    }
    /**
     * Sets the iosOnboarded property value. Partner onboarded for ios devices.
     * @param value Value to set for the iosOnboarded property.
     */
    public void setIosOnboarded(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iosOnboarded", value);
    }
    /**
     * Sets the lastHeartbeatDateTime property value. Timestamp of last heartbeat after admin onboarded to the compliance management partner
     * @param value Value to set for the lastHeartbeatDateTime property.
     */
    public void setLastHeartbeatDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastHeartbeatDateTime", value);
    }
    /**
     * Sets the macOsEnrollmentAssignments property value. User groups which enroll Mac devices through partner.
     * @param value Value to set for the macOsEnrollmentAssignments property.
     */
    public void setMacOsEnrollmentAssignments(@jakarta.annotation.Nullable final java.util.List<ComplianceManagementPartnerAssignment> value) {
        this.backingStore.set("macOsEnrollmentAssignments", value);
    }
    /**
     * Sets the macOsOnboarded property value. Partner onboarded for Mac devices.
     * @param value Value to set for the macOsOnboarded property.
     */
    public void setMacOsOnboarded(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("macOsOnboarded", value);
    }
    /**
     * Sets the partnerState property value. Partner state of this tenant.
     * @param value Value to set for the partnerState property.
     */
    public void setPartnerState(@jakarta.annotation.Nullable final DeviceManagementPartnerTenantState value) {
        this.backingStore.set("partnerState", value);
    }
}
