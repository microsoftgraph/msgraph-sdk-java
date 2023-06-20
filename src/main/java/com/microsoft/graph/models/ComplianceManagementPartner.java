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
public class ComplianceManagementPartner extends Entity implements Parsable {
    /** User groups which enroll Android devices through partner. */
    private java.util.List<ComplianceManagementPartnerAssignment> androidEnrollmentAssignments;
    /** Partner onboarded for Android devices. */
    private Boolean androidOnboarded;
    /** Partner display name */
    private String displayName;
    /** User groups which enroll ios devices through partner. */
    private java.util.List<ComplianceManagementPartnerAssignment> iosEnrollmentAssignments;
    /** Partner onboarded for ios devices. */
    private Boolean iosOnboarded;
    /** Timestamp of last heartbeat after admin onboarded to the compliance management partner */
    private OffsetDateTime lastHeartbeatDateTime;
    /** User groups which enroll Mac devices through partner. */
    private java.util.List<ComplianceManagementPartnerAssignment> macOsEnrollmentAssignments;
    /** Partner onboarded for Mac devices. */
    private Boolean macOsOnboarded;
    /** Partner state of this tenant. */
    private DeviceManagementPartnerTenantState partnerState;
    /**
     * Instantiates a new complianceManagementPartner and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ComplianceManagementPartner() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a complianceManagementPartner
     */
    @javax.annotation.Nonnull
    public static ComplianceManagementPartner createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComplianceManagementPartner();
    }
    /**
     * Gets the androidEnrollmentAssignments property value. User groups which enroll Android devices through partner.
     * @return a complianceManagementPartnerAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<ComplianceManagementPartnerAssignment> getAndroidEnrollmentAssignments() {
        return this.androidEnrollmentAssignments;
    }
    /**
     * Gets the androidOnboarded property value. Partner onboarded for Android devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidOnboarded() {
        return this.androidOnboarded;
    }
    /**
     * Gets the displayName property value. Partner display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
        deserializerMap.put("partnerState", (n) -> { this.setPartnerState(n.getEnumValue(DeviceManagementPartnerTenantState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the iosEnrollmentAssignments property value. User groups which enroll ios devices through partner.
     * @return a complianceManagementPartnerAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<ComplianceManagementPartnerAssignment> getIosEnrollmentAssignments() {
        return this.iosEnrollmentAssignments;
    }
    /**
     * Gets the iosOnboarded property value. Partner onboarded for ios devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIosOnboarded() {
        return this.iosOnboarded;
    }
    /**
     * Gets the lastHeartbeatDateTime property value. Timestamp of last heartbeat after admin onboarded to the compliance management partner
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastHeartbeatDateTime() {
        return this.lastHeartbeatDateTime;
    }
    /**
     * Gets the macOsEnrollmentAssignments property value. User groups which enroll Mac devices through partner.
     * @return a complianceManagementPartnerAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<ComplianceManagementPartnerAssignment> getMacOsEnrollmentAssignments() {
        return this.macOsEnrollmentAssignments;
    }
    /**
     * Gets the macOsOnboarded property value. Partner onboarded for Mac devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMacOsOnboarded() {
        return this.macOsOnboarded;
    }
    /**
     * Gets the partnerState property value. Partner state of this tenant.
     * @return a DeviceManagementPartnerTenantState
     */
    @javax.annotation.Nullable
    public DeviceManagementPartnerTenantState getPartnerState() {
        return this.partnerState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidEnrollmentAssignments(@javax.annotation.Nullable final java.util.List<ComplianceManagementPartnerAssignment> value) {
        this.androidEnrollmentAssignments = value;
    }
    /**
     * Sets the androidOnboarded property value. Partner onboarded for Android devices.
     * @param value Value to set for the androidOnboarded property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidOnboarded(@javax.annotation.Nullable final Boolean value) {
        this.androidOnboarded = value;
    }
    /**
     * Sets the displayName property value. Partner display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the iosEnrollmentAssignments property value. User groups which enroll ios devices through partner.
     * @param value Value to set for the iosEnrollmentAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosEnrollmentAssignments(@javax.annotation.Nullable final java.util.List<ComplianceManagementPartnerAssignment> value) {
        this.iosEnrollmentAssignments = value;
    }
    /**
     * Sets the iosOnboarded property value. Partner onboarded for ios devices.
     * @param value Value to set for the iosOnboarded property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIosOnboarded(@javax.annotation.Nullable final Boolean value) {
        this.iosOnboarded = value;
    }
    /**
     * Sets the lastHeartbeatDateTime property value. Timestamp of last heartbeat after admin onboarded to the compliance management partner
     * @param value Value to set for the lastHeartbeatDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastHeartbeatDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastHeartbeatDateTime = value;
    }
    /**
     * Sets the macOsEnrollmentAssignments property value. User groups which enroll Mac devices through partner.
     * @param value Value to set for the macOsEnrollmentAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMacOsEnrollmentAssignments(@javax.annotation.Nullable final java.util.List<ComplianceManagementPartnerAssignment> value) {
        this.macOsEnrollmentAssignments = value;
    }
    /**
     * Sets the macOsOnboarded property value. Partner onboarded for Mac devices.
     * @param value Value to set for the macOsOnboarded property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMacOsOnboarded(@javax.annotation.Nullable final Boolean value) {
        this.macOsOnboarded = value;
    }
    /**
     * Sets the partnerState property value. Partner state of this tenant.
     * @param value Value to set for the partnerState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartnerState(@javax.annotation.Nullable final DeviceManagementPartnerTenantState value) {
        this.partnerState = value;
    }
}
