package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity which represents a connection to Mobile threat defense partner. */
public class MobileThreatDefenseConnector extends Entity implements Parsable {
    /** For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant */
    private Boolean _androidDeviceBlockedOnMissingPartnerData;
    /** For Android, set whether data from the data sync partner should be used during compliance evaluations */
    private Boolean _androidEnabled;
    /** For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant */
    private Boolean _iosDeviceBlockedOnMissingPartnerData;
    /** For IOS, get or set whether data from the data sync partner should be used during compliance evaluations */
    private Boolean _iosEnabled;
    /** DateTime of last Heartbeat recieved from the Data Sync Partner */
    private OffsetDateTime _lastHeartbeatDateTime;
    /** Partner state of this tenant. */
    private MobileThreatPartnerTenantState _partnerState;
    /** Get or Set days the per tenant tolerance to unresponsiveness for this partner integration */
    private Integer _partnerUnresponsivenessThresholdInDays;
    /** Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Data Sync Partner */
    private Boolean _partnerUnsupportedOsVersionBlocked;
    /**
     * Instantiates a new mobileThreatDefenseConnector and sets the default values.
     * @return a void
     */
    public MobileThreatDefenseConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileThreatDefenseConnector
     */
    @javax.annotation.Nonnull
    public static MobileThreatDefenseConnector createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileThreatDefenseConnector();
    }
    /**
     * Gets the androidDeviceBlockedOnMissingPartnerData property value. For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidDeviceBlockedOnMissingPartnerData() {
        return this._androidDeviceBlockedOnMissingPartnerData;
    }
    /**
     * Gets the androidEnabled property value. For Android, set whether data from the data sync partner should be used during compliance evaluations
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidEnabled() {
        return this._androidEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileThreatDefenseConnector currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("androidDeviceBlockedOnMissingPartnerData", (n) -> { currentObject.setAndroidDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
            this.put("androidEnabled", (n) -> { currentObject.setAndroidEnabled(n.getBooleanValue()); });
            this.put("iosDeviceBlockedOnMissingPartnerData", (n) -> { currentObject.setIosDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
            this.put("iosEnabled", (n) -> { currentObject.setIosEnabled(n.getBooleanValue()); });
            this.put("lastHeartbeatDateTime", (n) -> { currentObject.setLastHeartbeatDateTime(n.getOffsetDateTimeValue()); });
            this.put("partnerState", (n) -> { currentObject.setPartnerState(n.getEnumValue(MobileThreatPartnerTenantState.class)); });
            this.put("partnerUnresponsivenessThresholdInDays", (n) -> { currentObject.setPartnerUnresponsivenessThresholdInDays(n.getIntegerValue()); });
            this.put("partnerUnsupportedOsVersionBlocked", (n) -> { currentObject.setPartnerUnsupportedOsVersionBlocked(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the iosDeviceBlockedOnMissingPartnerData property value. For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIosDeviceBlockedOnMissingPartnerData() {
        return this._iosDeviceBlockedOnMissingPartnerData;
    }
    /**
     * Gets the iosEnabled property value. For IOS, get or set whether data from the data sync partner should be used during compliance evaluations
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIosEnabled() {
        return this._iosEnabled;
    }
    /**
     * Gets the lastHeartbeatDateTime property value. DateTime of last Heartbeat recieved from the Data Sync Partner
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastHeartbeatDateTime() {
        return this._lastHeartbeatDateTime;
    }
    /**
     * Gets the partnerState property value. Partner state of this tenant.
     * @return a mobileThreatPartnerTenantState
     */
    @javax.annotation.Nullable
    public MobileThreatPartnerTenantState getPartnerState() {
        return this._partnerState;
    }
    /**
     * Gets the partnerUnresponsivenessThresholdInDays property value. Get or Set days the per tenant tolerance to unresponsiveness for this partner integration
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPartnerUnresponsivenessThresholdInDays() {
        return this._partnerUnresponsivenessThresholdInDays;
    }
    /**
     * Gets the partnerUnsupportedOsVersionBlocked property value. Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Data Sync Partner
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPartnerUnsupportedOsVersionBlocked() {
        return this._partnerUnsupportedOsVersionBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("androidDeviceBlockedOnMissingPartnerData", this.getAndroidDeviceBlockedOnMissingPartnerData());
        writer.writeBooleanValue("androidEnabled", this.getAndroidEnabled());
        writer.writeBooleanValue("iosDeviceBlockedOnMissingPartnerData", this.getIosDeviceBlockedOnMissingPartnerData());
        writer.writeBooleanValue("iosEnabled", this.getIosEnabled());
        writer.writeOffsetDateTimeValue("lastHeartbeatDateTime", this.getLastHeartbeatDateTime());
        writer.writeEnumValue("partnerState", this.getPartnerState());
        writer.writeIntegerValue("partnerUnresponsivenessThresholdInDays", this.getPartnerUnresponsivenessThresholdInDays());
        writer.writeBooleanValue("partnerUnsupportedOsVersionBlocked", this.getPartnerUnsupportedOsVersionBlocked());
    }
    /**
     * Sets the androidDeviceBlockedOnMissingPartnerData property value. For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     * @param value Value to set for the androidDeviceBlockedOnMissingPartnerData property.
     * @return a void
     */
    public void setAndroidDeviceBlockedOnMissingPartnerData(@javax.annotation.Nullable final Boolean value) {
        this._androidDeviceBlockedOnMissingPartnerData = value;
    }
    /**
     * Sets the androidEnabled property value. For Android, set whether data from the data sync partner should be used during compliance evaluations
     * @param value Value to set for the androidEnabled property.
     * @return a void
     */
    public void setAndroidEnabled(@javax.annotation.Nullable final Boolean value) {
        this._androidEnabled = value;
    }
    /**
     * Sets the iosDeviceBlockedOnMissingPartnerData property value. For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     * @param value Value to set for the iosDeviceBlockedOnMissingPartnerData property.
     * @return a void
     */
    public void setIosDeviceBlockedOnMissingPartnerData(@javax.annotation.Nullable final Boolean value) {
        this._iosDeviceBlockedOnMissingPartnerData = value;
    }
    /**
     * Sets the iosEnabled property value. For IOS, get or set whether data from the data sync partner should be used during compliance evaluations
     * @param value Value to set for the iosEnabled property.
     * @return a void
     */
    public void setIosEnabled(@javax.annotation.Nullable final Boolean value) {
        this._iosEnabled = value;
    }
    /**
     * Sets the lastHeartbeatDateTime property value. DateTime of last Heartbeat recieved from the Data Sync Partner
     * @param value Value to set for the lastHeartbeatDateTime property.
     * @return a void
     */
    public void setLastHeartbeatDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastHeartbeatDateTime = value;
    }
    /**
     * Sets the partnerState property value. Partner state of this tenant.
     * @param value Value to set for the partnerState property.
     * @return a void
     */
    public void setPartnerState(@javax.annotation.Nullable final MobileThreatPartnerTenantState value) {
        this._partnerState = value;
    }
    /**
     * Sets the partnerUnresponsivenessThresholdInDays property value. Get or Set days the per tenant tolerance to unresponsiveness for this partner integration
     * @param value Value to set for the partnerUnresponsivenessThresholdInDays property.
     * @return a void
     */
    public void setPartnerUnresponsivenessThresholdInDays(@javax.annotation.Nullable final Integer value) {
        this._partnerUnresponsivenessThresholdInDays = value;
    }
    /**
     * Sets the partnerUnsupportedOsVersionBlocked property value. Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Data Sync Partner
     * @param value Value to set for the partnerUnsupportedOsVersionBlocked property.
     * @return a void
     */
    public void setPartnerUnsupportedOsVersionBlocked(@javax.annotation.Nullable final Boolean value) {
        this._partnerUnsupportedOsVersionBlocked = value;
    }
}
