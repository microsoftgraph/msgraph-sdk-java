package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharepointSettings extends Entity implements Parsable {
    /**
     * Collection of trusted domain GUIDs for the OneDrive sync app.
     */
    private java.util.List<UUID> allowedDomainGuidsForSyncApp;
    /**
     * Collection of managed paths available for site creation. Read-only.
     */
    private java.util.List<String> availableManagedPathsForSiteCreation;
    /**
     * The number of days for preserving a deleted user's OneDrive.
     */
    private Integer deletedUserPersonalSiteRetentionPeriodInDays;
    /**
     * Collection of file extensions not uploaded by the OneDrive sync app.
     */
    private java.util.List<String> excludedFileExtensionsForSyncApp;
    /**
     * Specifies the idle session sign-out policies for the tenant.
     */
    private IdleSessionSignOut idleSessionSignOut;
    /**
     * Specifies the image tagging option for the tenant. Possible values are: disabled, basic, enhanced.
     */
    private ImageTaggingChoice imageTaggingOption;
    /**
     * Indicates whether comments are allowed on modern site pages in SharePoint.
     */
    private Boolean isCommentingOnSitePagesEnabled;
    /**
     * Indicates whether push notifications are enabled for OneDrive events.
     */
    private Boolean isFileActivityNotificationEnabled;
    /**
     * Indicates whether legacy authentication protocols are enabled for the tenant.
     */
    private Boolean isLegacyAuthProtocolsEnabled;
    /**
     * Indicates whether if Fluid Framework is allowed on SharePoint sites.
     */
    private Boolean isLoopEnabled;
    /**
     * Indicates whether files can be synced using the OneDrive sync app for Mac.
     */
    private Boolean isMacSyncAppEnabled;
    /**
     * Indicates whether guests must sign in using the same account to which sharing invitations are sent.
     */
    private Boolean isRequireAcceptingUserToMatchInvitedUserEnabled;
    /**
     * Indicates whether guests are allowed to reshare files, folders, and sites they don't own.
     */
    private Boolean isResharingByExternalUsersEnabled;
    /**
     * Indicates whether mobile push notifications are enabled for SharePoint.
     */
    private Boolean isSharePointMobileNotificationEnabled;
    /**
     * Indicates whether the newsfeed is allowed on the modern site pages in SharePoint.
     */
    private Boolean isSharePointNewsfeedEnabled;
    /**
     * Indicates whether users are allowed to create sites.
     */
    private Boolean isSiteCreationEnabled;
    /**
     * Indicates whether the UI commands for creating sites are shown.
     */
    private Boolean isSiteCreationUIEnabled;
    /**
     * Indicates whether creating new modern pages is allowed on SharePoint sites.
     */
    private Boolean isSitePagesCreationEnabled;
    /**
     * Indicates whether site storage space is automatically managed or if specific storage limits are set per site.
     */
    private Boolean isSitesStorageLimitAutomatic;
    /**
     * Indicates whether the sync button in OneDrive is hidden.
     */
    private Boolean isSyncButtonHiddenOnPersonalSite;
    /**
     * Indicates whether users are allowed to sync files only on PCs joined to specific domains.
     */
    private Boolean isUnmanagedSyncAppForTenantRestricted;
    /**
     * The default OneDrive storage limit for all new and existing users who are assigned a qualifying license. Measured in megabytes (MB).
     */
    private Long personalSiteDefaultStorageLimitInMB;
    /**
     * Collection of email domains that are allowed for sharing outside the organization.
     */
    private java.util.List<String> sharingAllowedDomainList;
    /**
     * Collection of email domains that are blocked for sharing outside the organization.
     */
    private java.util.List<String> sharingBlockedDomainList;
    /**
     * Sharing capability for the tenant. Possible values are: disabled, externalUserSharingOnly, externalUserAndGuestSharing, existingExternalUserSharingOnly.
     */
    private SharingCapabilities sharingCapability;
    /**
     * Specifies the external sharing mode for domains. Possible values are: none, allowList, blockList.
     */
    private SharingDomainRestrictionMode sharingDomainRestrictionMode;
    /**
     * The value of the team site managed path. This is the path under which new team sites will be created.
     */
    private String siteCreationDefaultManagedPath;
    /**
     * The default storage quota for a new site upon creation. Measured in megabytes (MB).
     */
    private Integer siteCreationDefaultStorageLimitInMB;
    /**
     * The default timezone of a tenant for newly created sites. For a list of possible values, see SPRegionalSettings.TimeZones property.
     */
    private String tenantDefaultTimezone;
    /**
     * Instantiates a new SharepointSettings and sets the default values.
     */
    public SharepointSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharepointSettings
     */
    @jakarta.annotation.Nonnull
    public static SharepointSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharepointSettings();
    }
    /**
     * Gets the allowedDomainGuidsForSyncApp property value. Collection of trusted domain GUIDs for the OneDrive sync app.
     * @return a java.util.List<UUID>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getAllowedDomainGuidsForSyncApp() {
        return this.allowedDomainGuidsForSyncApp;
    }
    /**
     * Gets the availableManagedPathsForSiteCreation property value. Collection of managed paths available for site creation. Read-only.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAvailableManagedPathsForSiteCreation() {
        return this.availableManagedPathsForSiteCreation;
    }
    /**
     * Gets the deletedUserPersonalSiteRetentionPeriodInDays property value. The number of days for preserving a deleted user's OneDrive.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeletedUserPersonalSiteRetentionPeriodInDays() {
        return this.deletedUserPersonalSiteRetentionPeriodInDays;
    }
    /**
     * Gets the excludedFileExtensionsForSyncApp property value. Collection of file extensions not uploaded by the OneDrive sync app.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludedFileExtensionsForSyncApp() {
        return this.excludedFileExtensionsForSyncApp;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedDomainGuidsForSyncApp", (n) -> { this.setAllowedDomainGuidsForSyncApp(n.getCollectionOfPrimitiveValues(UUID.class)); });
        deserializerMap.put("availableManagedPathsForSiteCreation", (n) -> { this.setAvailableManagedPathsForSiteCreation(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("deletedUserPersonalSiteRetentionPeriodInDays", (n) -> { this.setDeletedUserPersonalSiteRetentionPeriodInDays(n.getIntegerValue()); });
        deserializerMap.put("excludedFileExtensionsForSyncApp", (n) -> { this.setExcludedFileExtensionsForSyncApp(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("idleSessionSignOut", (n) -> { this.setIdleSessionSignOut(n.getObjectValue(IdleSessionSignOut::createFromDiscriminatorValue)); });
        deserializerMap.put("imageTaggingOption", (n) -> { this.setImageTaggingOption(n.getEnumValue(ImageTaggingChoice.class)); });
        deserializerMap.put("isCommentingOnSitePagesEnabled", (n) -> { this.setIsCommentingOnSitePagesEnabled(n.getBooleanValue()); });
        deserializerMap.put("isFileActivityNotificationEnabled", (n) -> { this.setIsFileActivityNotificationEnabled(n.getBooleanValue()); });
        deserializerMap.put("isLegacyAuthProtocolsEnabled", (n) -> { this.setIsLegacyAuthProtocolsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isLoopEnabled", (n) -> { this.setIsLoopEnabled(n.getBooleanValue()); });
        deserializerMap.put("isMacSyncAppEnabled", (n) -> { this.setIsMacSyncAppEnabled(n.getBooleanValue()); });
        deserializerMap.put("isRequireAcceptingUserToMatchInvitedUserEnabled", (n) -> { this.setIsRequireAcceptingUserToMatchInvitedUserEnabled(n.getBooleanValue()); });
        deserializerMap.put("isResharingByExternalUsersEnabled", (n) -> { this.setIsResharingByExternalUsersEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSharePointMobileNotificationEnabled", (n) -> { this.setIsSharePointMobileNotificationEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSharePointNewsfeedEnabled", (n) -> { this.setIsSharePointNewsfeedEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSiteCreationEnabled", (n) -> { this.setIsSiteCreationEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSiteCreationUIEnabled", (n) -> { this.setIsSiteCreationUIEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSitePagesCreationEnabled", (n) -> { this.setIsSitePagesCreationEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSitesStorageLimitAutomatic", (n) -> { this.setIsSitesStorageLimitAutomatic(n.getBooleanValue()); });
        deserializerMap.put("isSyncButtonHiddenOnPersonalSite", (n) -> { this.setIsSyncButtonHiddenOnPersonalSite(n.getBooleanValue()); });
        deserializerMap.put("isUnmanagedSyncAppForTenantRestricted", (n) -> { this.setIsUnmanagedSyncAppForTenantRestricted(n.getBooleanValue()); });
        deserializerMap.put("personalSiteDefaultStorageLimitInMB", (n) -> { this.setPersonalSiteDefaultStorageLimitInMB(n.getLongValue()); });
        deserializerMap.put("sharingAllowedDomainList", (n) -> { this.setSharingAllowedDomainList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sharingBlockedDomainList", (n) -> { this.setSharingBlockedDomainList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sharingCapability", (n) -> { this.setSharingCapability(n.getEnumValue(SharingCapabilities.class)); });
        deserializerMap.put("sharingDomainRestrictionMode", (n) -> { this.setSharingDomainRestrictionMode(n.getEnumValue(SharingDomainRestrictionMode.class)); });
        deserializerMap.put("siteCreationDefaultManagedPath", (n) -> { this.setSiteCreationDefaultManagedPath(n.getStringValue()); });
        deserializerMap.put("siteCreationDefaultStorageLimitInMB", (n) -> { this.setSiteCreationDefaultStorageLimitInMB(n.getIntegerValue()); });
        deserializerMap.put("tenantDefaultTimezone", (n) -> { this.setTenantDefaultTimezone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the idleSessionSignOut property value. Specifies the idle session sign-out policies for the tenant.
     * @return a IdleSessionSignOut
     */
    @jakarta.annotation.Nullable
    public IdleSessionSignOut getIdleSessionSignOut() {
        return this.idleSessionSignOut;
    }
    /**
     * Gets the imageTaggingOption property value. Specifies the image tagging option for the tenant. Possible values are: disabled, basic, enhanced.
     * @return a ImageTaggingChoice
     */
    @jakarta.annotation.Nullable
    public ImageTaggingChoice getImageTaggingOption() {
        return this.imageTaggingOption;
    }
    /**
     * Gets the isCommentingOnSitePagesEnabled property value. Indicates whether comments are allowed on modern site pages in SharePoint.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCommentingOnSitePagesEnabled() {
        return this.isCommentingOnSitePagesEnabled;
    }
    /**
     * Gets the isFileActivityNotificationEnabled property value. Indicates whether push notifications are enabled for OneDrive events.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFileActivityNotificationEnabled() {
        return this.isFileActivityNotificationEnabled;
    }
    /**
     * Gets the isLegacyAuthProtocolsEnabled property value. Indicates whether legacy authentication protocols are enabled for the tenant.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLegacyAuthProtocolsEnabled() {
        return this.isLegacyAuthProtocolsEnabled;
    }
    /**
     * Gets the isLoopEnabled property value. Indicates whether if Fluid Framework is allowed on SharePoint sites.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLoopEnabled() {
        return this.isLoopEnabled;
    }
    /**
     * Gets the isMacSyncAppEnabled property value. Indicates whether files can be synced using the OneDrive sync app for Mac.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMacSyncAppEnabled() {
        return this.isMacSyncAppEnabled;
    }
    /**
     * Gets the isRequireAcceptingUserToMatchInvitedUserEnabled property value. Indicates whether guests must sign in using the same account to which sharing invitations are sent.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequireAcceptingUserToMatchInvitedUserEnabled() {
        return this.isRequireAcceptingUserToMatchInvitedUserEnabled;
    }
    /**
     * Gets the isResharingByExternalUsersEnabled property value. Indicates whether guests are allowed to reshare files, folders, and sites they don't own.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsResharingByExternalUsersEnabled() {
        return this.isResharingByExternalUsersEnabled;
    }
    /**
     * Gets the isSharePointMobileNotificationEnabled property value. Indicates whether mobile push notifications are enabled for SharePoint.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSharePointMobileNotificationEnabled() {
        return this.isSharePointMobileNotificationEnabled;
    }
    /**
     * Gets the isSharePointNewsfeedEnabled property value. Indicates whether the newsfeed is allowed on the modern site pages in SharePoint.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSharePointNewsfeedEnabled() {
        return this.isSharePointNewsfeedEnabled;
    }
    /**
     * Gets the isSiteCreationEnabled property value. Indicates whether users are allowed to create sites.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSiteCreationEnabled() {
        return this.isSiteCreationEnabled;
    }
    /**
     * Gets the isSiteCreationUIEnabled property value. Indicates whether the UI commands for creating sites are shown.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSiteCreationUIEnabled() {
        return this.isSiteCreationUIEnabled;
    }
    /**
     * Gets the isSitePagesCreationEnabled property value. Indicates whether creating new modern pages is allowed on SharePoint sites.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSitePagesCreationEnabled() {
        return this.isSitePagesCreationEnabled;
    }
    /**
     * Gets the isSitesStorageLimitAutomatic property value. Indicates whether site storage space is automatically managed or if specific storage limits are set per site.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSitesStorageLimitAutomatic() {
        return this.isSitesStorageLimitAutomatic;
    }
    /**
     * Gets the isSyncButtonHiddenOnPersonalSite property value. Indicates whether the sync button in OneDrive is hidden.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSyncButtonHiddenOnPersonalSite() {
        return this.isSyncButtonHiddenOnPersonalSite;
    }
    /**
     * Gets the isUnmanagedSyncAppForTenantRestricted property value. Indicates whether users are allowed to sync files only on PCs joined to specific domains.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsUnmanagedSyncAppForTenantRestricted() {
        return this.isUnmanagedSyncAppForTenantRestricted;
    }
    /**
     * Gets the personalSiteDefaultStorageLimitInMB property value. The default OneDrive storage limit for all new and existing users who are assigned a qualifying license. Measured in megabytes (MB).
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getPersonalSiteDefaultStorageLimitInMB() {
        return this.personalSiteDefaultStorageLimitInMB;
    }
    /**
     * Gets the sharingAllowedDomainList property value. Collection of email domains that are allowed for sharing outside the organization.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSharingAllowedDomainList() {
        return this.sharingAllowedDomainList;
    }
    /**
     * Gets the sharingBlockedDomainList property value. Collection of email domains that are blocked for sharing outside the organization.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSharingBlockedDomainList() {
        return this.sharingBlockedDomainList;
    }
    /**
     * Gets the sharingCapability property value. Sharing capability for the tenant. Possible values are: disabled, externalUserSharingOnly, externalUserAndGuestSharing, existingExternalUserSharingOnly.
     * @return a SharingCapabilities
     */
    @jakarta.annotation.Nullable
    public SharingCapabilities getSharingCapability() {
        return this.sharingCapability;
    }
    /**
     * Gets the sharingDomainRestrictionMode property value. Specifies the external sharing mode for domains. Possible values are: none, allowList, blockList.
     * @return a SharingDomainRestrictionMode
     */
    @jakarta.annotation.Nullable
    public SharingDomainRestrictionMode getSharingDomainRestrictionMode() {
        return this.sharingDomainRestrictionMode;
    }
    /**
     * Gets the siteCreationDefaultManagedPath property value. The value of the team site managed path. This is the path under which new team sites will be created.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSiteCreationDefaultManagedPath() {
        return this.siteCreationDefaultManagedPath;
    }
    /**
     * Gets the siteCreationDefaultStorageLimitInMB property value. The default storage quota for a new site upon creation. Measured in megabytes (MB).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSiteCreationDefaultStorageLimitInMB() {
        return this.siteCreationDefaultStorageLimitInMB;
    }
    /**
     * Gets the tenantDefaultTimezone property value. The default timezone of a tenant for newly created sites. For a list of possible values, see SPRegionalSettings.TimeZones property.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantDefaultTimezone() {
        return this.tenantDefaultTimezone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("allowedDomainGuidsForSyncApp", this.getAllowedDomainGuidsForSyncApp());
        writer.writeCollectionOfPrimitiveValues("availableManagedPathsForSiteCreation", this.getAvailableManagedPathsForSiteCreation());
        writer.writeIntegerValue("deletedUserPersonalSiteRetentionPeriodInDays", this.getDeletedUserPersonalSiteRetentionPeriodInDays());
        writer.writeCollectionOfPrimitiveValues("excludedFileExtensionsForSyncApp", this.getExcludedFileExtensionsForSyncApp());
        writer.writeObjectValue("idleSessionSignOut", this.getIdleSessionSignOut());
        writer.writeEnumValue("imageTaggingOption", this.getImageTaggingOption());
        writer.writeBooleanValue("isCommentingOnSitePagesEnabled", this.getIsCommentingOnSitePagesEnabled());
        writer.writeBooleanValue("isFileActivityNotificationEnabled", this.getIsFileActivityNotificationEnabled());
        writer.writeBooleanValue("isLegacyAuthProtocolsEnabled", this.getIsLegacyAuthProtocolsEnabled());
        writer.writeBooleanValue("isLoopEnabled", this.getIsLoopEnabled());
        writer.writeBooleanValue("isMacSyncAppEnabled", this.getIsMacSyncAppEnabled());
        writer.writeBooleanValue("isRequireAcceptingUserToMatchInvitedUserEnabled", this.getIsRequireAcceptingUserToMatchInvitedUserEnabled());
        writer.writeBooleanValue("isResharingByExternalUsersEnabled", this.getIsResharingByExternalUsersEnabled());
        writer.writeBooleanValue("isSharePointMobileNotificationEnabled", this.getIsSharePointMobileNotificationEnabled());
        writer.writeBooleanValue("isSharePointNewsfeedEnabled", this.getIsSharePointNewsfeedEnabled());
        writer.writeBooleanValue("isSiteCreationEnabled", this.getIsSiteCreationEnabled());
        writer.writeBooleanValue("isSiteCreationUIEnabled", this.getIsSiteCreationUIEnabled());
        writer.writeBooleanValue("isSitePagesCreationEnabled", this.getIsSitePagesCreationEnabled());
        writer.writeBooleanValue("isSitesStorageLimitAutomatic", this.getIsSitesStorageLimitAutomatic());
        writer.writeBooleanValue("isSyncButtonHiddenOnPersonalSite", this.getIsSyncButtonHiddenOnPersonalSite());
        writer.writeBooleanValue("isUnmanagedSyncAppForTenantRestricted", this.getIsUnmanagedSyncAppForTenantRestricted());
        writer.writeLongValue("personalSiteDefaultStorageLimitInMB", this.getPersonalSiteDefaultStorageLimitInMB());
        writer.writeCollectionOfPrimitiveValues("sharingAllowedDomainList", this.getSharingAllowedDomainList());
        writer.writeCollectionOfPrimitiveValues("sharingBlockedDomainList", this.getSharingBlockedDomainList());
        writer.writeEnumValue("sharingCapability", this.getSharingCapability());
        writer.writeEnumValue("sharingDomainRestrictionMode", this.getSharingDomainRestrictionMode());
        writer.writeStringValue("siteCreationDefaultManagedPath", this.getSiteCreationDefaultManagedPath());
        writer.writeIntegerValue("siteCreationDefaultStorageLimitInMB", this.getSiteCreationDefaultStorageLimitInMB());
        writer.writeStringValue("tenantDefaultTimezone", this.getTenantDefaultTimezone());
    }
    /**
     * Sets the allowedDomainGuidsForSyncApp property value. Collection of trusted domain GUIDs for the OneDrive sync app.
     * @param value Value to set for the allowedDomainGuidsForSyncApp property.
     */
    public void setAllowedDomainGuidsForSyncApp(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.allowedDomainGuidsForSyncApp = value;
    }
    /**
     * Sets the availableManagedPathsForSiteCreation property value. Collection of managed paths available for site creation. Read-only.
     * @param value Value to set for the availableManagedPathsForSiteCreation property.
     */
    public void setAvailableManagedPathsForSiteCreation(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.availableManagedPathsForSiteCreation = value;
    }
    /**
     * Sets the deletedUserPersonalSiteRetentionPeriodInDays property value. The number of days for preserving a deleted user's OneDrive.
     * @param value Value to set for the deletedUserPersonalSiteRetentionPeriodInDays property.
     */
    public void setDeletedUserPersonalSiteRetentionPeriodInDays(@jakarta.annotation.Nullable final Integer value) {
        this.deletedUserPersonalSiteRetentionPeriodInDays = value;
    }
    /**
     * Sets the excludedFileExtensionsForSyncApp property value. Collection of file extensions not uploaded by the OneDrive sync app.
     * @param value Value to set for the excludedFileExtensionsForSyncApp property.
     */
    public void setExcludedFileExtensionsForSyncApp(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.excludedFileExtensionsForSyncApp = value;
    }
    /**
     * Sets the idleSessionSignOut property value. Specifies the idle session sign-out policies for the tenant.
     * @param value Value to set for the idleSessionSignOut property.
     */
    public void setIdleSessionSignOut(@jakarta.annotation.Nullable final IdleSessionSignOut value) {
        this.idleSessionSignOut = value;
    }
    /**
     * Sets the imageTaggingOption property value. Specifies the image tagging option for the tenant. Possible values are: disabled, basic, enhanced.
     * @param value Value to set for the imageTaggingOption property.
     */
    public void setImageTaggingOption(@jakarta.annotation.Nullable final ImageTaggingChoice value) {
        this.imageTaggingOption = value;
    }
    /**
     * Sets the isCommentingOnSitePagesEnabled property value. Indicates whether comments are allowed on modern site pages in SharePoint.
     * @param value Value to set for the isCommentingOnSitePagesEnabled property.
     */
    public void setIsCommentingOnSitePagesEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isCommentingOnSitePagesEnabled = value;
    }
    /**
     * Sets the isFileActivityNotificationEnabled property value. Indicates whether push notifications are enabled for OneDrive events.
     * @param value Value to set for the isFileActivityNotificationEnabled property.
     */
    public void setIsFileActivityNotificationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isFileActivityNotificationEnabled = value;
    }
    /**
     * Sets the isLegacyAuthProtocolsEnabled property value. Indicates whether legacy authentication protocols are enabled for the tenant.
     * @param value Value to set for the isLegacyAuthProtocolsEnabled property.
     */
    public void setIsLegacyAuthProtocolsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isLegacyAuthProtocolsEnabled = value;
    }
    /**
     * Sets the isLoopEnabled property value. Indicates whether if Fluid Framework is allowed on SharePoint sites.
     * @param value Value to set for the isLoopEnabled property.
     */
    public void setIsLoopEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isLoopEnabled = value;
    }
    /**
     * Sets the isMacSyncAppEnabled property value. Indicates whether files can be synced using the OneDrive sync app for Mac.
     * @param value Value to set for the isMacSyncAppEnabled property.
     */
    public void setIsMacSyncAppEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isMacSyncAppEnabled = value;
    }
    /**
     * Sets the isRequireAcceptingUserToMatchInvitedUserEnabled property value. Indicates whether guests must sign in using the same account to which sharing invitations are sent.
     * @param value Value to set for the isRequireAcceptingUserToMatchInvitedUserEnabled property.
     */
    public void setIsRequireAcceptingUserToMatchInvitedUserEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isRequireAcceptingUserToMatchInvitedUserEnabled = value;
    }
    /**
     * Sets the isResharingByExternalUsersEnabled property value. Indicates whether guests are allowed to reshare files, folders, and sites they don't own.
     * @param value Value to set for the isResharingByExternalUsersEnabled property.
     */
    public void setIsResharingByExternalUsersEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isResharingByExternalUsersEnabled = value;
    }
    /**
     * Sets the isSharePointMobileNotificationEnabled property value. Indicates whether mobile push notifications are enabled for SharePoint.
     * @param value Value to set for the isSharePointMobileNotificationEnabled property.
     */
    public void setIsSharePointMobileNotificationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isSharePointMobileNotificationEnabled = value;
    }
    /**
     * Sets the isSharePointNewsfeedEnabled property value. Indicates whether the newsfeed is allowed on the modern site pages in SharePoint.
     * @param value Value to set for the isSharePointNewsfeedEnabled property.
     */
    public void setIsSharePointNewsfeedEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isSharePointNewsfeedEnabled = value;
    }
    /**
     * Sets the isSiteCreationEnabled property value. Indicates whether users are allowed to create sites.
     * @param value Value to set for the isSiteCreationEnabled property.
     */
    public void setIsSiteCreationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isSiteCreationEnabled = value;
    }
    /**
     * Sets the isSiteCreationUIEnabled property value. Indicates whether the UI commands for creating sites are shown.
     * @param value Value to set for the isSiteCreationUIEnabled property.
     */
    public void setIsSiteCreationUIEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isSiteCreationUIEnabled = value;
    }
    /**
     * Sets the isSitePagesCreationEnabled property value. Indicates whether creating new modern pages is allowed on SharePoint sites.
     * @param value Value to set for the isSitePagesCreationEnabled property.
     */
    public void setIsSitePagesCreationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isSitePagesCreationEnabled = value;
    }
    /**
     * Sets the isSitesStorageLimitAutomatic property value. Indicates whether site storage space is automatically managed or if specific storage limits are set per site.
     * @param value Value to set for the isSitesStorageLimitAutomatic property.
     */
    public void setIsSitesStorageLimitAutomatic(@jakarta.annotation.Nullable final Boolean value) {
        this.isSitesStorageLimitAutomatic = value;
    }
    /**
     * Sets the isSyncButtonHiddenOnPersonalSite property value. Indicates whether the sync button in OneDrive is hidden.
     * @param value Value to set for the isSyncButtonHiddenOnPersonalSite property.
     */
    public void setIsSyncButtonHiddenOnPersonalSite(@jakarta.annotation.Nullable final Boolean value) {
        this.isSyncButtonHiddenOnPersonalSite = value;
    }
    /**
     * Sets the isUnmanagedSyncAppForTenantRestricted property value. Indicates whether users are allowed to sync files only on PCs joined to specific domains.
     * @param value Value to set for the isUnmanagedSyncAppForTenantRestricted property.
     */
    public void setIsUnmanagedSyncAppForTenantRestricted(@jakarta.annotation.Nullable final Boolean value) {
        this.isUnmanagedSyncAppForTenantRestricted = value;
    }
    /**
     * Sets the personalSiteDefaultStorageLimitInMB property value. The default OneDrive storage limit for all new and existing users who are assigned a qualifying license. Measured in megabytes (MB).
     * @param value Value to set for the personalSiteDefaultStorageLimitInMB property.
     */
    public void setPersonalSiteDefaultStorageLimitInMB(@jakarta.annotation.Nullable final Long value) {
        this.personalSiteDefaultStorageLimitInMB = value;
    }
    /**
     * Sets the sharingAllowedDomainList property value. Collection of email domains that are allowed for sharing outside the organization.
     * @param value Value to set for the sharingAllowedDomainList property.
     */
    public void setSharingAllowedDomainList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.sharingAllowedDomainList = value;
    }
    /**
     * Sets the sharingBlockedDomainList property value. Collection of email domains that are blocked for sharing outside the organization.
     * @param value Value to set for the sharingBlockedDomainList property.
     */
    public void setSharingBlockedDomainList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.sharingBlockedDomainList = value;
    }
    /**
     * Sets the sharingCapability property value. Sharing capability for the tenant. Possible values are: disabled, externalUserSharingOnly, externalUserAndGuestSharing, existingExternalUserSharingOnly.
     * @param value Value to set for the sharingCapability property.
     */
    public void setSharingCapability(@jakarta.annotation.Nullable final SharingCapabilities value) {
        this.sharingCapability = value;
    }
    /**
     * Sets the sharingDomainRestrictionMode property value. Specifies the external sharing mode for domains. Possible values are: none, allowList, blockList.
     * @param value Value to set for the sharingDomainRestrictionMode property.
     */
    public void setSharingDomainRestrictionMode(@jakarta.annotation.Nullable final SharingDomainRestrictionMode value) {
        this.sharingDomainRestrictionMode = value;
    }
    /**
     * Sets the siteCreationDefaultManagedPath property value. The value of the team site managed path. This is the path under which new team sites will be created.
     * @param value Value to set for the siteCreationDefaultManagedPath property.
     */
    public void setSiteCreationDefaultManagedPath(@jakarta.annotation.Nullable final String value) {
        this.siteCreationDefaultManagedPath = value;
    }
    /**
     * Sets the siteCreationDefaultStorageLimitInMB property value. The default storage quota for a new site upon creation. Measured in megabytes (MB).
     * @param value Value to set for the siteCreationDefaultStorageLimitInMB property.
     */
    public void setSiteCreationDefaultStorageLimitInMB(@jakarta.annotation.Nullable final Integer value) {
        this.siteCreationDefaultStorageLimitInMB = value;
    }
    /**
     * Sets the tenantDefaultTimezone property value. The default timezone of a tenant for newly created sites. For a list of possible values, see SPRegionalSettings.TimeZones property.
     * @param value Value to set for the tenantDefaultTimezone property.
     */
    public void setTenantDefaultTimezone(@jakarta.annotation.Nullable final String value) {
        this.tenantDefaultTimezone = value;
    }
}
