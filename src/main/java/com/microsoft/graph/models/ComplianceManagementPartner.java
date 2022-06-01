package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Compliance management partner for all platforms */
public class ComplianceManagementPartner extends Entity implements Parsable {
    /** User groups which enroll Android devices through partner. */
    private java.util.List<ComplianceManagementPartnerAssignment> _androidEnrollmentAssignments;
    /** Partner onboarded for Android devices. */
    private Boolean _androidOnboarded;
    /** Partner display name */
    private String _displayName;
    /** User groups which enroll ios devices through partner. */
    private java.util.List<ComplianceManagementPartnerAssignment> _iosEnrollmentAssignments;
    /** Partner onboarded for ios devices. */
    private Boolean _iosOnboarded;
    /** Timestamp of last heartbeat after admin onboarded to the compliance management partner */
    private OffsetDateTime _lastHeartbeatDateTime;
    /** User groups which enroll Mac devices through partner. */
    private java.util.List<ComplianceManagementPartnerAssignment> _macOsEnrollmentAssignments;
    /** Partner onboarded for Mac devices. */
    private Boolean _macOsOnboarded;
    /** Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive. */
    private DeviceManagementPartnerTenantState _partnerState;
    /**
     * Instantiates a new complianceManagementPartner and sets the default values.
     * @return a void
     */
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
        return this._androidEnrollmentAssignments;
    }
    /**
     * Gets the androidOnboarded property value. Partner onboarded for Android devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidOnboarded() {
        return this._androidOnboarded;
    }
    /**
     * Gets the displayName property value. Partner display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ComplianceManagementPartner currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("androidEnrollmentAssignments", (n) -> { currentObject.setAndroidEnrollmentAssignments(n.getCollectionOfObjectValues(ComplianceManagementPartnerAssignment::createFromDiscriminatorValue)); });
            this.put("androidOnboarded", (n) -> { currentObject.setAndroidOnboarded(n.getBooleanValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("iosEnrollmentAssignments", (n) -> { currentObject.setIosEnrollmentAssignments(n.getCollectionOfObjectValues(ComplianceManagementPartnerAssignment::createFromDiscriminatorValue)); });
            this.put("iosOnboarded", (n) -> { currentObject.setIosOnboarded(n.getBooleanValue()); });
            this.put("lastHeartbeatDateTime", (n) -> { currentObject.setLastHeartbeatDateTime(n.getOffsetDateTimeValue()); });
            this.put("macOsEnrollmentAssignments", (n) -> { currentObject.setMacOsEnrollmentAssignments(n.getCollectionOfObjectValues(ComplianceManagementPartnerAssignment::createFromDiscriminatorValue)); });
            this.put("macOsOnboarded", (n) -> { currentObject.setMacOsOnboarded(n.getBooleanValue()); });
            this.put("partnerState", (n) -> { currentObject.setPartnerState(n.getEnumValue(DeviceManagementPartnerTenantState.class)); });
        }};
    }
    /**
     * Gets the iosEnrollmentAssignments property value. User groups which enroll ios devices through partner.
     * @return a complianceManagementPartnerAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<ComplianceManagementPartnerAssignment> getIosEnrollmentAssignments() {
        return this._iosEnrollmentAssignments;
    }
    /**
     * Gets the iosOnboarded property value. Partner onboarded for ios devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIosOnboarded() {
        return this._iosOnboarded;
    }
    /**
     * Gets the lastHeartbeatDateTime property value. Timestamp of last heartbeat after admin onboarded to the compliance management partner
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastHeartbeatDateTime() {
        return this._lastHeartbeatDateTime;
    }
    /**
     * Gets the macOsEnrollmentAssignments property value. User groups which enroll Mac devices through partner.
     * @return a complianceManagementPartnerAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<ComplianceManagementPartnerAssignment> getMacOsEnrollmentAssignments() {
        return this._macOsEnrollmentAssignments;
    }
    /**
     * Gets the macOsOnboarded property value. Partner onboarded for Mac devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMacOsOnboarded() {
        return this._macOsOnboarded;
    }
    /**
     * Gets the partnerState property value. Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
     * @return a deviceManagementPartnerTenantState
     */
    @javax.annotation.Nullable
    public DeviceManagementPartnerTenantState getPartnerState() {
        return this._partnerState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAndroidEnrollmentAssignments(@javax.annotation.Nullable final java.util.List<ComplianceManagementPartnerAssignment> value) {
        this._androidEnrollmentAssignments = value;
    }
    /**
     * Sets the androidOnboarded property value. Partner onboarded for Android devices.
     * @param value Value to set for the androidOnboarded property.
     * @return a void
     */
    public void setAndroidOnboarded(@javax.annotation.Nullable final Boolean value) {
        this._androidOnboarded = value;
    }
    /**
     * Sets the displayName property value. Partner display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the iosEnrollmentAssignments property value. User groups which enroll ios devices through partner.
     * @param value Value to set for the iosEnrollmentAssignments property.
     * @return a void
     */
    public void setIosEnrollmentAssignments(@javax.annotation.Nullable final java.util.List<ComplianceManagementPartnerAssignment> value) {
        this._iosEnrollmentAssignments = value;
    }
    /**
     * Sets the iosOnboarded property value. Partner onboarded for ios devices.
     * @param value Value to set for the iosOnboarded property.
     * @return a void
     */
    public void setIosOnboarded(@javax.annotation.Nullable final Boolean value) {
        this._iosOnboarded = value;
    }
    /**
     * Sets the lastHeartbeatDateTime property value. Timestamp of last heartbeat after admin onboarded to the compliance management partner
     * @param value Value to set for the lastHeartbeatDateTime property.
     * @return a void
     */
    public void setLastHeartbeatDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastHeartbeatDateTime = value;
    }
    /**
     * Sets the macOsEnrollmentAssignments property value. User groups which enroll Mac devices through partner.
     * @param value Value to set for the macOsEnrollmentAssignments property.
     * @return a void
     */
    public void setMacOsEnrollmentAssignments(@javax.annotation.Nullable final java.util.List<ComplianceManagementPartnerAssignment> value) {
        this._macOsEnrollmentAssignments = value;
    }
    /**
     * Sets the macOsOnboarded property value. Partner onboarded for Mac devices.
     * @param value Value to set for the macOsOnboarded property.
     * @return a void
     */
    public void setMacOsOnboarded(@javax.annotation.Nullable final Boolean value) {
        this._macOsOnboarded = value;
    }
    /**
     * Sets the partnerState property value. Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
     * @param value Value to set for the partnerState property.
     * @return a void
     */
    public void setPartnerState(@javax.annotation.Nullable final DeviceManagementPartnerTenantState value) {
        this._partnerState = value;
    }
}
