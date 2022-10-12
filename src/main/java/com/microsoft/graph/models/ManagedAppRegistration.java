package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The ManagedAppEntity is the base entity type for all other entity types under app management workflow. */
public class ManagedAppRegistration extends Entity implements Parsable {
    /** The identifier for a mobile app. */
    private MobileAppIdentifier _appIdentifier;
    /** App version */
    private String _applicationVersion;
    /** Zero or more policys already applied on the registered app when it last synchronized with managment service. */
    private java.util.List<ManagedAppPolicy> _appliedPolicies;
    /** Date and time of creation */
    private OffsetDateTime _createdDateTime;
    /** Host device name */
    private String _deviceName;
    /** App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions. */
    private String _deviceTag;
    /** Host device type */
    private String _deviceType;
    /** Zero or more reasons an app registration is flagged. E.g. app running on rooted device */
    private java.util.List<ManagedAppFlaggedReason> _flaggedReasons;
    /** Zero or more policies admin intended for the app as of now. */
    private java.util.List<ManagedAppPolicy> _intendedPolicies;
    /** Date and time of last the app synced with management service. */
    private OffsetDateTime _lastSyncDateTime;
    /** App management SDK version */
    private String _managementSdkVersion;
    /** Zero or more long running operations triggered on the app registration. */
    private java.util.List<ManagedAppOperation> _operations;
    /** Operating System version */
    private String _platformVersion;
    /** The user Id to who this app registration belongs. */
    private String _userId;
    /** Version of the entity. */
    private String _version;
    /**
     * Instantiates a new managedAppRegistration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedAppRegistration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedAppRegistration
     */
    @javax.annotation.Nonnull
    public static ManagedAppRegistration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAppRegistration();
    }
    /**
     * Gets the appIdentifier property value. The identifier for a mobile app.
     * @return a mobileAppIdentifier
     */
    @javax.annotation.Nullable
    public MobileAppIdentifier getAppIdentifier() {
        return this._appIdentifier;
    }
    /**
     * Gets the applicationVersion property value. App version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationVersion() {
        return this._applicationVersion;
    }
    /**
     * Gets the appliedPolicies property value. Zero or more policys already applied on the registered app when it last synchronized with managment service.
     * @return a managedAppPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppPolicy> getAppliedPolicies() {
        return this._appliedPolicies;
    }
    /**
     * Gets the createdDateTime property value. Date and time of creation
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the deviceName property value. Host device name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the deviceTag property value. App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceTag() {
        return this._deviceTag;
    }
    /**
     * Gets the deviceType property value. Host device type
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceType() {
        return this._deviceType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedAppRegistration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("appIdentifier", (n) -> { currentObject.setAppIdentifier(n.getObjectValue(MobileAppIdentifier::createFromDiscriminatorValue)); });
            this.put("applicationVersion", (n) -> { currentObject.setApplicationVersion(n.getStringValue()); });
            this.put("appliedPolicies", (n) -> { currentObject.setAppliedPolicies(n.getCollectionOfObjectValues(ManagedAppPolicy::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("deviceTag", (n) -> { currentObject.setDeviceTag(n.getStringValue()); });
            this.put("deviceType", (n) -> { currentObject.setDeviceType(n.getStringValue()); });
            this.put("flaggedReasons", (n) -> { currentObject.setFlaggedReasons(n.getCollectionOfEnumValues(ManagedAppFlaggedReason.class)); });
            this.put("intendedPolicies", (n) -> { currentObject.setIntendedPolicies(n.getCollectionOfObjectValues(ManagedAppPolicy::createFromDiscriminatorValue)); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("managementSdkVersion", (n) -> { currentObject.setManagementSdkVersion(n.getStringValue()); });
            this.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfObjectValues(ManagedAppOperation::createFromDiscriminatorValue)); });
            this.put("platformVersion", (n) -> { currentObject.setPlatformVersion(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the flaggedReasons property value. Zero or more reasons an app registration is flagged. E.g. app running on rooted device
     * @return a managedAppFlaggedReason
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppFlaggedReason> getFlaggedReasons() {
        return this._flaggedReasons;
    }
    /**
     * Gets the intendedPolicies property value. Zero or more policies admin intended for the app as of now.
     * @return a managedAppPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppPolicy> getIntendedPolicies() {
        return this._intendedPolicies;
    }
    /**
     * Gets the lastSyncDateTime property value. Date and time of last the app synced with management service.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the managementSdkVersion property value. App management SDK version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementSdkVersion() {
        return this._managementSdkVersion;
    }
    /**
     * Gets the operations property value. Zero or more long running operations triggered on the app registration.
     * @return a managedAppOperation
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppOperation> getOperations() {
        return this._operations;
    }
    /**
     * Gets the platformVersion property value. Operating System version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlatformVersion() {
        return this._platformVersion;
    }
    /**
     * Gets the userId property value. The user Id to who this app registration belongs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the version property value. Version of the entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
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
        writer.writeObjectValue("appIdentifier", this.getAppIdentifier());
        writer.writeStringValue("applicationVersion", this.getApplicationVersion());
        writer.writeCollectionOfObjectValues("appliedPolicies", this.getAppliedPolicies());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("deviceTag", this.getDeviceTag());
        writer.writeStringValue("deviceType", this.getDeviceType());
        writer.writeCollectionOfEnumValues("flaggedReasons", this.getFlaggedReasons());
        writer.writeCollectionOfObjectValues("intendedPolicies", this.getIntendedPolicies());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeStringValue("managementSdkVersion", this.getManagementSdkVersion());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeStringValue("platformVersion", this.getPlatformVersion());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the appIdentifier property value. The identifier for a mobile app.
     * @param value Value to set for the appIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppIdentifier(@javax.annotation.Nullable final MobileAppIdentifier value) {
        this._appIdentifier = value;
    }
    /**
     * Sets the applicationVersion property value. App version
     * @param value Value to set for the applicationVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationVersion(@javax.annotation.Nullable final String value) {
        this._applicationVersion = value;
    }
    /**
     * Sets the appliedPolicies property value. Zero or more policys already applied on the registered app when it last synchronized with managment service.
     * @param value Value to set for the appliedPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliedPolicies(@javax.annotation.Nullable final java.util.List<ManagedAppPolicy> value) {
        this._appliedPolicies = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time of creation
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the deviceName property value. Host device name
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the deviceTag property value. App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions.
     * @param value Value to set for the deviceTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceTag(@javax.annotation.Nullable final String value) {
        this._deviceTag = value;
    }
    /**
     * Sets the deviceType property value. Host device type
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceType(@javax.annotation.Nullable final String value) {
        this._deviceType = value;
    }
    /**
     * Sets the flaggedReasons property value. Zero or more reasons an app registration is flagged. E.g. app running on rooted device
     * @param value Value to set for the flaggedReasons property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFlaggedReasons(@javax.annotation.Nullable final java.util.List<ManagedAppFlaggedReason> value) {
        this._flaggedReasons = value;
    }
    /**
     * Sets the intendedPolicies property value. Zero or more policies admin intended for the app as of now.
     * @param value Value to set for the intendedPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntendedPolicies(@javax.annotation.Nullable final java.util.List<ManagedAppPolicy> value) {
        this._intendedPolicies = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Date and time of last the app synced with management service.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the managementSdkVersion property value. App management SDK version
     * @param value Value to set for the managementSdkVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementSdkVersion(@javax.annotation.Nullable final String value) {
        this._managementSdkVersion = value;
    }
    /**
     * Sets the operations property value. Zero or more long running operations triggered on the app registration.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<ManagedAppOperation> value) {
        this._operations = value;
    }
    /**
     * Sets the platformVersion property value. Operating System version
     * @param value Value to set for the platformVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatformVersion(@javax.annotation.Nullable final String value) {
        this._platformVersion = value;
    }
    /**
     * Sets the userId property value. The user Id to who this app registration belongs.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the version property value. Version of the entity.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}
