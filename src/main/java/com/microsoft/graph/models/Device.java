package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class Device extends DirectoryObject implements Parsable {
    /** true if the account is enabled; otherwise, false. Required. Default is true.  Supports $filter (eq, ne, not, in). Only callers in Global Administrator and Cloud Device Administrator roles can set this property. */
    private Boolean _accountEnabled;
    /** For internal use only. Not nullable. Supports $filter (eq, not, ge, le). */
    private java.util.List<AlternativeSecurityId> _alternativeSecurityIds;
    /** The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter (eq, ne, not, ge, le, and eq on null values) and $orderBy. */
    private OffsetDateTime _approximateLastSignInDateTime;
    /** The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _complianceExpirationDateTime;
    /** Unique identifier set by Azure Device Registration Service at the time of registration. Supports $filter (eq, ne, not, startsWith). */
    private String _deviceId;
    /** For internal use only. Set to null. */
    private String _deviceMetadata;
    /** For internal use only. */
    private Integer _deviceVersion;
    /** The display name for the device. Required. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy. */
    private String _displayName;
    /** The collection of open extensions defined for the device. Read-only. Nullable. */
    private java.util.List<Extension> _extensions;
    /** true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not). */
    private Boolean _isCompliant;
    /** true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not). */
    private Boolean _isManaged;
    /** Application identifier used to register device into MDM. Read-only. Supports $filter (eq, ne, not, startsWith). */
    private String _mdmAppId;
    /** Groups and administrative units that this device is a member of. Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _memberOf;
    /** The last time at which the object was synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z Read-only. Supports $filter (eq, ne, not, ge, le, in). */
    private OffsetDateTime _onPremisesLastSyncDateTime;
    /** true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Read-only. Supports $filter (eq, ne, not, in, and eq on null values). */
    private Boolean _onPremisesSyncEnabled;
    /** The type of operating system on the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null values). */
    private String _operatingSystem;
    /** The version of the operating system on the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null values). */
    private String _operatingSystemVersion;
    /** For internal use only. Not nullable. Supports $filter (eq, not, ge, le, startsWith, and counting empty collections). */
    private java.util.List<String> _physicalIds;
    /** The profile type of the device. Possible values: RegisteredDevice (default), SecureVM, Printer, Shared, IoT. */
    private String _profileType;
    /** The user that cloud joined the device or registered their personal device. The registered owner is set at the time of registration. Currently, there can be only one owner. Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _registeredOwners;
    /** Collection of registered users of the device. For cloud joined devices and registered personal devices, registered users are set to the same value as registered owners at the time of registration. Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _registeredUsers;
    /** List of labels applied to the device by the system. Supports $filter (eq when counting empty collections). */
    private java.util.List<String> _systemLabels;
    /** Groups and administrative units that the device is a member of. This operation is transitive. Supports $expand. */
    private java.util.List<DirectoryObject> _transitiveMemberOf;
    /** Type of trust for the joined device. Read-only. Possible values:  Workplace (indicates bring your own personal devices), AzureAd (Cloud only joined devices), ServerAd (on-premises domain joined devices joined to Azure AD). For more details, see Introduction to device management in Azure Active Directory */
    private String _trustType;
    /**
     * Instantiates a new device and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Device() {
        super();
        this.setOdataType("#microsoft.graph.device");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a device
     */
    @javax.annotation.Nonnull
    public static Device createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Device();
    }
    /**
     * Gets the accountEnabled property value. true if the account is enabled; otherwise, false. Required. Default is true.  Supports $filter (eq, ne, not, in). Only callers in Global Administrator and Cloud Device Administrator roles can set this property.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccountEnabled() {
        return this._accountEnabled;
    }
    /**
     * Gets the alternativeSecurityIds property value. For internal use only. Not nullable. Supports $filter (eq, not, ge, le).
     * @return a alternativeSecurityId
     */
    @javax.annotation.Nullable
    public java.util.List<AlternativeSecurityId> getAlternativeSecurityIds() {
        return this._alternativeSecurityIds;
    }
    /**
     * Gets the approximateLastSignInDateTime property value. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter (eq, ne, not, ge, le, and eq on null values) and $orderBy.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getApproximateLastSignInDateTime() {
        return this._approximateLastSignInDateTime;
    }
    /**
     * Gets the complianceExpirationDateTime property value. The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getComplianceExpirationDateTime() {
        return this._complianceExpirationDateTime;
    }
    /**
     * Gets the deviceId property value. Unique identifier set by Azure Device Registration Service at the time of registration. Supports $filter (eq, ne, not, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceMetadata property value. For internal use only. Set to null.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceMetadata() {
        return this._deviceMetadata;
    }
    /**
     * Gets the deviceVersion property value. For internal use only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceVersion() {
        return this._deviceVersion;
    }
    /**
     * Gets the displayName property value. The display name for the device. Required. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the device. Read-only. Nullable.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this._extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Device currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountEnabled", (n) -> { currentObject.setAccountEnabled(n.getBooleanValue()); });
        deserializerMap.put("alternativeSecurityIds", (n) -> { currentObject.setAlternativeSecurityIds(n.getCollectionOfObjectValues(AlternativeSecurityId::createFromDiscriminatorValue)); });
        deserializerMap.put("approximateLastSignInDateTime", (n) -> { currentObject.setApproximateLastSignInDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("complianceExpirationDateTime", (n) -> { currentObject.setComplianceExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceMetadata", (n) -> { currentObject.setDeviceMetadata(n.getStringValue()); });
        deserializerMap.put("deviceVersion", (n) -> { currentObject.setDeviceVersion(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("extensions", (n) -> { currentObject.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("isCompliant", (n) -> { currentObject.setIsCompliant(n.getBooleanValue()); });
        deserializerMap.put("isManaged", (n) -> { currentObject.setIsManaged(n.getBooleanValue()); });
        deserializerMap.put("mdmAppId", (n) -> { currentObject.setMdmAppId(n.getStringValue()); });
        deserializerMap.put("memberOf", (n) -> { currentObject.setMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesLastSyncDateTime", (n) -> { currentObject.setOnPremisesLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onPremisesSyncEnabled", (n) -> { currentObject.setOnPremisesSyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("operatingSystem", (n) -> { currentObject.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("operatingSystemVersion", (n) -> { currentObject.setOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("physicalIds", (n) -> { currentObject.setPhysicalIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("profileType", (n) -> { currentObject.setProfileType(n.getStringValue()); });
        deserializerMap.put("registeredOwners", (n) -> { currentObject.setRegisteredOwners(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("registeredUsers", (n) -> { currentObject.setRegisteredUsers(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("systemLabels", (n) -> { currentObject.setSystemLabels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("transitiveMemberOf", (n) -> { currentObject.setTransitiveMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("trustType", (n) -> { currentObject.setTrustType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCompliant property value. true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCompliant() {
        return this._isCompliant;
    }
    /**
     * Gets the isManaged property value. true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsManaged() {
        return this._isManaged;
    }
    /**
     * Gets the mdmAppId property value. Application identifier used to register device into MDM. Read-only. Supports $filter (eq, ne, not, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdmAppId() {
        return this._mdmAppId;
    }
    /**
     * Gets the memberOf property value. Groups and administrative units that this device is a member of. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this._memberOf;
    }
    /**
     * Gets the onPremisesLastSyncDateTime property value. The last time at which the object was synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z Read-only. Supports $filter (eq, ne, not, ge, le, in).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOnPremisesLastSyncDateTime() {
        return this._onPremisesLastSyncDateTime;
    }
    /**
     * Gets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Read-only. Supports $filter (eq, ne, not, in, and eq on null values).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOnPremisesSyncEnabled() {
        return this._onPremisesSyncEnabled;
    }
    /**
     * Gets the operatingSystem property value. The type of operating system on the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this._operatingSystem;
    }
    /**
     * Gets the operatingSystemVersion property value. The version of the operating system on the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemVersion() {
        return this._operatingSystemVersion;
    }
    /**
     * Gets the physicalIds property value. For internal use only. Not nullable. Supports $filter (eq, not, ge, le, startsWith, and counting empty collections).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPhysicalIds() {
        return this._physicalIds;
    }
    /**
     * Gets the profileType property value. The profile type of the device. Possible values: RegisteredDevice (default), SecureVM, Printer, Shared, IoT.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfileType() {
        return this._profileType;
    }
    /**
     * Gets the registeredOwners property value. The user that cloud joined the device or registered their personal device. The registered owner is set at the time of registration. Currently, there can be only one owner. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getRegisteredOwners() {
        return this._registeredOwners;
    }
    /**
     * Gets the registeredUsers property value. Collection of registered users of the device. For cloud joined devices and registered personal devices, registered users are set to the same value as registered owners at the time of registration. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getRegisteredUsers() {
        return this._registeredUsers;
    }
    /**
     * Gets the systemLabels property value. List of labels applied to the device by the system. Supports $filter (eq when counting empty collections).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSystemLabels() {
        return this._systemLabels;
    }
    /**
     * Gets the transitiveMemberOf property value. Groups and administrative units that the device is a member of. This operation is transitive. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMemberOf() {
        return this._transitiveMemberOf;
    }
    /**
     * Gets the trustType property value. Type of trust for the joined device. Read-only. Possible values:  Workplace (indicates bring your own personal devices), AzureAd (Cloud only joined devices), ServerAd (on-premises domain joined devices joined to Azure AD). For more details, see Introduction to device management in Azure Active Directory
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTrustType() {
        return this._trustType;
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
        writer.writeBooleanValue("accountEnabled", this.getAccountEnabled());
        writer.writeCollectionOfObjectValues("alternativeSecurityIds", this.getAlternativeSecurityIds());
        writer.writeOffsetDateTimeValue("approximateLastSignInDateTime", this.getApproximateLastSignInDateTime());
        writer.writeOffsetDateTimeValue("complianceExpirationDateTime", this.getComplianceExpirationDateTime());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceMetadata", this.getDeviceMetadata());
        writer.writeIntegerValue("deviceVersion", this.getDeviceVersion());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeBooleanValue("isCompliant", this.getIsCompliant());
        writer.writeBooleanValue("isManaged", this.getIsManaged());
        writer.writeStringValue("mdmAppId", this.getMdmAppId());
        writer.writeCollectionOfObjectValues("memberOf", this.getMemberOf());
        writer.writeOffsetDateTimeValue("onPremisesLastSyncDateTime", this.getOnPremisesLastSyncDateTime());
        writer.writeBooleanValue("onPremisesSyncEnabled", this.getOnPremisesSyncEnabled());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeStringValue("operatingSystemVersion", this.getOperatingSystemVersion());
        writer.writeCollectionOfPrimitiveValues("physicalIds", this.getPhysicalIds());
        writer.writeStringValue("profileType", this.getProfileType());
        writer.writeCollectionOfObjectValues("registeredOwners", this.getRegisteredOwners());
        writer.writeCollectionOfObjectValues("registeredUsers", this.getRegisteredUsers());
        writer.writeCollectionOfPrimitiveValues("systemLabels", this.getSystemLabels());
        writer.writeCollectionOfObjectValues("transitiveMemberOf", this.getTransitiveMemberOf());
        writer.writeStringValue("trustType", this.getTrustType());
    }
    /**
     * Sets the accountEnabled property value. true if the account is enabled; otherwise, false. Required. Default is true.  Supports $filter (eq, ne, not, in). Only callers in Global Administrator and Cloud Device Administrator roles can set this property.
     * @param value Value to set for the accountEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountEnabled(@javax.annotation.Nullable final Boolean value) {
        this._accountEnabled = value;
    }
    /**
     * Sets the alternativeSecurityIds property value. For internal use only. Not nullable. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the alternativeSecurityIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternativeSecurityIds(@javax.annotation.Nullable final java.util.List<AlternativeSecurityId> value) {
        this._alternativeSecurityIds = value;
    }
    /**
     * Sets the approximateLastSignInDateTime property value. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter (eq, ne, not, ge, le, and eq on null values) and $orderBy.
     * @param value Value to set for the approximateLastSignInDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApproximateLastSignInDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._approximateLastSignInDateTime = value;
    }
    /**
     * Sets the complianceExpirationDateTime property value. The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the complianceExpirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._complianceExpirationDateTime = value;
    }
    /**
     * Sets the deviceId property value. Unique identifier set by Azure Device Registration Service at the time of registration. Supports $filter (eq, ne, not, startsWith).
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceMetadata property value. For internal use only. Set to null.
     * @param value Value to set for the deviceMetadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceMetadata(@javax.annotation.Nullable final String value) {
        this._deviceMetadata = value;
    }
    /**
     * Sets the deviceVersion property value. For internal use only.
     * @param value Value to set for the deviceVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceVersion(@javax.annotation.Nullable final Integer value) {
        this._deviceVersion = value;
    }
    /**
     * Sets the displayName property value. The display name for the device. Required. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the device. Read-only. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the isCompliant property value. true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not).
     * @param value Value to set for the isCompliant property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCompliant(@javax.annotation.Nullable final Boolean value) {
        this._isCompliant = value;
    }
    /**
     * Sets the isManaged property value. true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not).
     * @param value Value to set for the isManaged property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsManaged(@javax.annotation.Nullable final Boolean value) {
        this._isManaged = value;
    }
    /**
     * Sets the mdmAppId property value. Application identifier used to register device into MDM. Read-only. Supports $filter (eq, ne, not, startsWith).
     * @param value Value to set for the mdmAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdmAppId(@javax.annotation.Nullable final String value) {
        this._mdmAppId = value;
    }
    /**
     * Sets the memberOf property value. Groups and administrative units that this device is a member of. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the memberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._memberOf = value;
    }
    /**
     * Sets the onPremisesLastSyncDateTime property value. The last time at which the object was synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z Read-only. Supports $filter (eq, ne, not, ge, le, in).
     * @param value Value to set for the onPremisesLastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._onPremisesLastSyncDateTime = value;
    }
    /**
     * Sets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Read-only. Supports $filter (eq, ne, not, in, and eq on null values).
     * @param value Value to set for the onPremisesSyncEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesSyncEnabled(@javax.annotation.Nullable final Boolean value) {
        this._onPremisesSyncEnabled = value;
    }
    /**
     * Sets the operatingSystem property value. The type of operating system on the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null values).
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this._operatingSystem = value;
    }
    /**
     * Sets the operatingSystemVersion property value. The version of the operating system on the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null values).
     * @param value Value to set for the operatingSystemVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystemVersion(@javax.annotation.Nullable final String value) {
        this._operatingSystemVersion = value;
    }
    /**
     * Sets the physicalIds property value. For internal use only. Not nullable. Supports $filter (eq, not, ge, le, startsWith, and counting empty collections).
     * @param value Value to set for the physicalIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhysicalIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._physicalIds = value;
    }
    /**
     * Sets the profileType property value. The profile type of the device. Possible values: RegisteredDevice (default), SecureVM, Printer, Shared, IoT.
     * @param value Value to set for the profileType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileType(@javax.annotation.Nullable final String value) {
        this._profileType = value;
    }
    /**
     * Sets the registeredOwners property value. The user that cloud joined the device or registered their personal device. The registered owner is set at the time of registration. Currently, there can be only one owner. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the registeredOwners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegisteredOwners(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._registeredOwners = value;
    }
    /**
     * Sets the registeredUsers property value. Collection of registered users of the device. For cloud joined devices and registered personal devices, registered users are set to the same value as registered owners at the time of registration. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the registeredUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegisteredUsers(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._registeredUsers = value;
    }
    /**
     * Sets the systemLabels property value. List of labels applied to the device by the system. Supports $filter (eq when counting empty collections).
     * @param value Value to set for the systemLabels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemLabels(@javax.annotation.Nullable final java.util.List<String> value) {
        this._systemLabels = value;
    }
    /**
     * Sets the transitiveMemberOf property value. Groups and administrative units that the device is a member of. This operation is transitive. Supports $expand.
     * @param value Value to set for the transitiveMemberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransitiveMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._transitiveMemberOf = value;
    }
    /**
     * Sets the trustType property value. Type of trust for the joined device. Read-only. Possible values:  Workplace (indicates bring your own personal devices), AzureAd (Cloud only joined devices), ServerAd (on-premises domain joined devices joined to Azure AD). For more details, see Introduction to device management in Azure Active Directory
     * @param value Value to set for the trustType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrustType(@javax.annotation.Nullable final String value) {
        this._trustType = value;
    }
}
