package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The ManagedAppEntity is the base entity type for all other entity types under app management workflow.
 */
public class ManagedAppRegistration extends Entity implements Parsable {
    /**
     * The app package Identifier
     */
    private MobileAppIdentifier appIdentifier;
    /**
     * App version
     */
    private String applicationVersion;
    /**
     * Zero or more policys already applied on the registered app when it last synchronized with managment service.
     */
    private java.util.List<ManagedAppPolicy> appliedPolicies;
    /**
     * Date and time of creation
     */
    private OffsetDateTime createdDateTime;
    /**
     * Host device name
     */
    private String deviceName;
    /**
     * App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions.
     */
    private String deviceTag;
    /**
     * Host device type
     */
    private String deviceType;
    /**
     * Zero or more reasons an app registration is flagged. E.g. app running on rooted device
     */
    private java.util.List<ManagedAppFlaggedReason> flaggedReasons;
    /**
     * Zero or more policies admin intended for the app as of now.
     */
    private java.util.List<ManagedAppPolicy> intendedPolicies;
    /**
     * Date and time of last the app synced with management service.
     */
    private OffsetDateTime lastSyncDateTime;
    /**
     * App management SDK version
     */
    private String managementSdkVersion;
    /**
     * Zero or more long running operations triggered on the app registration.
     */
    private java.util.List<ManagedAppOperation> operations;
    /**
     * Operating System version
     */
    private String platformVersion;
    /**
     * The user Id to who this app registration belongs.
     */
    private String userId;
    /**
     * Version of the entity.
     */
    private String version;
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
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidManagedAppRegistration": return new AndroidManagedAppRegistration();
                case "#microsoft.graph.iosManagedAppRegistration": return new IosManagedAppRegistration();
            }
        }
        return new ManagedAppRegistration();
    }
    /**
     * Gets the appIdentifier property value. The app package Identifier
     * @return a mobileAppIdentifier
     */
    @javax.annotation.Nullable
    public MobileAppIdentifier getAppIdentifier() {
        return this.appIdentifier;
    }
    /**
     * Gets the applicationVersion property value. App version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationVersion() {
        return this.applicationVersion;
    }
    /**
     * Gets the appliedPolicies property value. Zero or more policys already applied on the registered app when it last synchronized with managment service.
     * @return a managedAppPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppPolicy> getAppliedPolicies() {
        return this.appliedPolicies;
    }
    /**
     * Gets the createdDateTime property value. Date and time of creation
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the deviceName property value. Host device name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the deviceTag property value. App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceTag() {
        return this.deviceTag;
    }
    /**
     * Gets the deviceType property value. Host device type
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceType() {
        return this.deviceType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appIdentifier", (n) -> { this.setAppIdentifier(n.getObjectValue(MobileAppIdentifier::createFromDiscriminatorValue)); });
        deserializerMap.put("applicationVersion", (n) -> { this.setApplicationVersion(n.getStringValue()); });
        deserializerMap.put("appliedPolicies", (n) -> { this.setAppliedPolicies(n.getCollectionOfObjectValues(ManagedAppPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceTag", (n) -> { this.setDeviceTag(n.getStringValue()); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getStringValue()); });
        deserializerMap.put("flaggedReasons", (n) -> { this.setFlaggedReasons(n.getCollectionOfEnumValues(ManagedAppFlaggedReason.class)); });
        deserializerMap.put("intendedPolicies", (n) -> { this.setIntendedPolicies(n.getCollectionOfObjectValues(ManagedAppPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managementSdkVersion", (n) -> { this.setManagementSdkVersion(n.getStringValue()); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(ManagedAppOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("platformVersion", (n) -> { this.setPlatformVersion(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the flaggedReasons property value. Zero or more reasons an app registration is flagged. E.g. app running on rooted device
     * @return a managedAppFlaggedReason
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppFlaggedReason> getFlaggedReasons() {
        return this.flaggedReasons;
    }
    /**
     * Gets the intendedPolicies property value. Zero or more policies admin intended for the app as of now.
     * @return a managedAppPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppPolicy> getIntendedPolicies() {
        return this.intendedPolicies;
    }
    /**
     * Gets the lastSyncDateTime property value. Date and time of last the app synced with management service.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the managementSdkVersion property value. App management SDK version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementSdkVersion() {
        return this.managementSdkVersion;
    }
    /**
     * Gets the operations property value. Zero or more long running operations triggered on the app registration.
     * @return a managedAppOperation
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedAppOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the platformVersion property value. Operating System version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlatformVersion() {
        return this.platformVersion;
    }
    /**
     * Gets the userId property value. The user Id to who this app registration belongs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the version property value. Version of the entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
     * Sets the appIdentifier property value. The app package Identifier
     * @param value Value to set for the appIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppIdentifier(@javax.annotation.Nullable final MobileAppIdentifier value) {
        this.appIdentifier = value;
    }
    /**
     * Sets the applicationVersion property value. App version
     * @param value Value to set for the applicationVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationVersion(@javax.annotation.Nullable final String value) {
        this.applicationVersion = value;
    }
    /**
     * Sets the appliedPolicies property value. Zero or more policys already applied on the registered app when it last synchronized with managment service.
     * @param value Value to set for the appliedPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliedPolicies(@javax.annotation.Nullable final java.util.List<ManagedAppPolicy> value) {
        this.appliedPolicies = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time of creation
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the deviceName property value. Host device name
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the deviceTag property value. App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions.
     * @param value Value to set for the deviceTag property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceTag(@javax.annotation.Nullable final String value) {
        this.deviceTag = value;
    }
    /**
     * Sets the deviceType property value. Host device type
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceType(@javax.annotation.Nullable final String value) {
        this.deviceType = value;
    }
    /**
     * Sets the flaggedReasons property value. Zero or more reasons an app registration is flagged. E.g. app running on rooted device
     * @param value Value to set for the flaggedReasons property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFlaggedReasons(@javax.annotation.Nullable final java.util.List<ManagedAppFlaggedReason> value) {
        this.flaggedReasons = value;
    }
    /**
     * Sets the intendedPolicies property value. Zero or more policies admin intended for the app as of now.
     * @param value Value to set for the intendedPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntendedPolicies(@javax.annotation.Nullable final java.util.List<ManagedAppPolicy> value) {
        this.intendedPolicies = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Date and time of last the app synced with management service.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the managementSdkVersion property value. App management SDK version
     * @param value Value to set for the managementSdkVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementSdkVersion(@javax.annotation.Nullable final String value) {
        this.managementSdkVersion = value;
    }
    /**
     * Sets the operations property value. Zero or more long running operations triggered on the app registration.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<ManagedAppOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the platformVersion property value. Operating System version
     * @param value Value to set for the platformVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatformVersion(@javax.annotation.Nullable final String value) {
        this.platformVersion = value;
    }
    /**
     * Sets the userId property value. The user Id to who this app registration belongs.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the version property value. Version of the entity.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
