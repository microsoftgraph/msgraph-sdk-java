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
     * Instantiates a new {@link SharepointSettings} and sets the default values.
     */
    public SharepointSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharepointSettings}
     */
    @jakarta.annotation.Nonnull
    public static SharepointSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharepointSettings();
    }
    /**
     * Gets the allowedDomainGuidsForSyncApp property value. Collection of trusted domain GUIDs for the OneDrive sync app.
     * @return a {@link java.util.List<UUID>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getAllowedDomainGuidsForSyncApp() {
        return this.backingStore.get("allowedDomainGuidsForSyncApp");
    }
    /**
     * Gets the availableManagedPathsForSiteCreation property value. Collection of managed paths available for site creation. Read-only.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAvailableManagedPathsForSiteCreation() {
        return this.backingStore.get("availableManagedPathsForSiteCreation");
    }
    /**
     * Gets the deletedUserPersonalSiteRetentionPeriodInDays property value. The number of days for preserving a deleted user's OneDrive.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDeletedUserPersonalSiteRetentionPeriodInDays() {
        return this.backingStore.get("deletedUserPersonalSiteRetentionPeriodInDays");
    }
    /**
     * Gets the excludedFileExtensionsForSyncApp property value. Collection of file extensions not uploaded by the OneDrive sync app.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludedFileExtensionsForSyncApp() {
        return this.backingStore.get("excludedFileExtensionsForSyncApp");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedDomainGuidsForSyncApp", (n) -> { this.setAllowedDomainGuidsForSyncApp(n.getCollectionOfPrimitiveValues(UUID.class)); });
        deserializerMap.put("availableManagedPathsForSiteCreation", (n) -> { this.setAvailableManagedPathsForSiteCreation(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("deletedUserPersonalSiteRetentionPeriodInDays", (n) -> { this.setDeletedUserPersonalSiteRetentionPeriodInDays(n.getIntegerValue()); });
        deserializerMap.put("excludedFileExtensionsForSyncApp", (n) -> { this.setExcludedFileExtensionsForSyncApp(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("idleSessionSignOut", (n) -> { this.setIdleSessionSignOut(n.getObjectValue(IdleSessionSignOut::createFromDiscriminatorValue)); });
        deserializerMap.put("imageTaggingOption", (n) -> { this.setImageTaggingOption(n.getEnumValue(ImageTaggingChoice::forValue)); });
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
        deserializerMap.put("sharingCapability", (n) -> { this.setSharingCapability(n.getEnumValue(SharingCapabilities::forValue)); });
        deserializerMap.put("sharingDomainRestrictionMode", (n) -> { this.setSharingDomainRestrictionMode(n.getEnumValue(SharingDomainRestrictionMode::forValue)); });
        deserializerMap.put("siteCreationDefaultManagedPath", (n) -> { this.setSiteCreationDefaultManagedPath(n.getStringValue()); });
        deserializerMap.put("siteCreationDefaultStorageLimitInMB", (n) -> { this.setSiteCreationDefaultStorageLimitInMB(n.getIntegerValue()); });
        deserializerMap.put("tenantDefaultTimezone", (n) -> { this.setTenantDefaultTimezone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the idleSessionSignOut property value. Specifies the idle session sign-out policies for the tenant.
     * @return a {@link IdleSessionSignOut}
     */
    @jakarta.annotation.Nullable
    public IdleSessionSignOut getIdleSessionSignOut() {
        return this.backingStore.get("idleSessionSignOut");
    }
    /**
     * Gets the imageTaggingOption property value. Specifies the image tagging option for the tenant. Possible values are: disabled, basic, enhanced.
     * @return a {@link ImageTaggingChoice}
     */
    @jakarta.annotation.Nullable
    public ImageTaggingChoice getImageTaggingOption() {
        return this.backingStore.get("imageTaggingOption");
    }
    /**
     * Gets the isCommentingOnSitePagesEnabled property value. Indicates whether comments are allowed on modern site pages in SharePoint.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCommentingOnSitePagesEnabled() {
        return this.backingStore.get("isCommentingOnSitePagesEnabled");
    }
    /**
     * Gets the isFileActivityNotificationEnabled property value. Indicates whether push notifications are enabled for OneDrive events.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFileActivityNotificationEnabled() {
        return this.backingStore.get("isFileActivityNotificationEnabled");
    }
    /**
     * Gets the isLegacyAuthProtocolsEnabled property value. Indicates whether legacy authentication protocols are enabled for the tenant.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLegacyAuthProtocolsEnabled() {
        return this.backingStore.get("isLegacyAuthProtocolsEnabled");
    }
    /**
     * Gets the isLoopEnabled property value. Indicates whether if Fluid Framework is allowed on SharePoint sites.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLoopEnabled() {
        return this.backingStore.get("isLoopEnabled");
    }
    /**
     * Gets the isMacSyncAppEnabled property value. Indicates whether files can be synced using the OneDrive sync app for Mac.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMacSyncAppEnabled() {
        return this.backingStore.get("isMacSyncAppEnabled");
    }
    /**
     * Gets the isRequireAcceptingUserToMatchInvitedUserEnabled property value. Indicates whether guests must sign in using the same account to which sharing invitations are sent.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequireAcceptingUserToMatchInvitedUserEnabled() {
        return this.backingStore.get("isRequireAcceptingUserToMatchInvitedUserEnabled");
    }
    /**
     * Gets the isResharingByExternalUsersEnabled property value. Indicates whether guests are allowed to reshare files, folders, and sites they don't own.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsResharingByExternalUsersEnabled() {
        return this.backingStore.get("isResharingByExternalUsersEnabled");
    }
    /**
     * Gets the isSharePointMobileNotificationEnabled property value. Indicates whether mobile push notifications are enabled for SharePoint.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSharePointMobileNotificationEnabled() {
        return this.backingStore.get("isSharePointMobileNotificationEnabled");
    }
    /**
     * Gets the isSharePointNewsfeedEnabled property value. Indicates whether the newsfeed is allowed on the modern site pages in SharePoint.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSharePointNewsfeedEnabled() {
        return this.backingStore.get("isSharePointNewsfeedEnabled");
    }
    /**
     * Gets the isSiteCreationEnabled property value. Indicates whether users are allowed to create sites.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSiteCreationEnabled() {
        return this.backingStore.get("isSiteCreationEnabled");
    }
    /**
     * Gets the isSiteCreationUIEnabled property value. Indicates whether the UI commands for creating sites are shown.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSiteCreationUIEnabled() {
        return this.backingStore.get("isSiteCreationUIEnabled");
    }
    /**
     * Gets the isSitePagesCreationEnabled property value. Indicates whether creating new modern pages is allowed on SharePoint sites.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSitePagesCreationEnabled() {
        return this.backingStore.get("isSitePagesCreationEnabled");
    }
    /**
     * Gets the isSitesStorageLimitAutomatic property value. Indicates whether site storage space is automatically managed or if specific storage limits are set per site.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSitesStorageLimitAutomatic() {
        return this.backingStore.get("isSitesStorageLimitAutomatic");
    }
    /**
     * Gets the isSyncButtonHiddenOnPersonalSite property value. Indicates whether the sync button in OneDrive is hidden.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSyncButtonHiddenOnPersonalSite() {
        return this.backingStore.get("isSyncButtonHiddenOnPersonalSite");
    }
    /**
     * Gets the isUnmanagedSyncAppForTenantRestricted property value. Indicates whether users are allowed to sync files only on PCs joined to specific domains.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsUnmanagedSyncAppForTenantRestricted() {
        return this.backingStore.get("isUnmanagedSyncAppForTenantRestricted");
    }
    /**
     * Gets the personalSiteDefaultStorageLimitInMB property value. The default OneDrive storage limit for all new and existing users who are assigned a qualifying license. Measured in megabytes (MB).
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPersonalSiteDefaultStorageLimitInMB() {
        return this.backingStore.get("personalSiteDefaultStorageLimitInMB");
    }
    /**
     * Gets the sharingAllowedDomainList property value. Collection of email domains that are allowed for sharing outside the organization.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSharingAllowedDomainList() {
        return this.backingStore.get("sharingAllowedDomainList");
    }
    /**
     * Gets the sharingBlockedDomainList property value. Collection of email domains that are blocked for sharing outside the organization.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSharingBlockedDomainList() {
        return this.backingStore.get("sharingBlockedDomainList");
    }
    /**
     * Gets the sharingCapability property value. Sharing capability for the tenant. Possible values are: disabled, externalUserSharingOnly, externalUserAndGuestSharing, existingExternalUserSharingOnly.
     * @return a {@link SharingCapabilities}
     */
    @jakarta.annotation.Nullable
    public SharingCapabilities getSharingCapability() {
        return this.backingStore.get("sharingCapability");
    }
    /**
     * Gets the sharingDomainRestrictionMode property value. Specifies the external sharing mode for domains. Possible values are: none, allowList, blockList.
     * @return a {@link SharingDomainRestrictionMode}
     */
    @jakarta.annotation.Nullable
    public SharingDomainRestrictionMode getSharingDomainRestrictionMode() {
        return this.backingStore.get("sharingDomainRestrictionMode");
    }
    /**
     * Gets the siteCreationDefaultManagedPath property value. The value of the team site managed path. This is the path under which new team sites will be created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSiteCreationDefaultManagedPath() {
        return this.backingStore.get("siteCreationDefaultManagedPath");
    }
    /**
     * Gets the siteCreationDefaultStorageLimitInMB property value. The default storage quota for a new site upon creation. Measured in megabytes (MB).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSiteCreationDefaultStorageLimitInMB() {
        return this.backingStore.get("siteCreationDefaultStorageLimitInMB");
    }
    /**
     * Gets the tenantDefaultTimezone property value. The default timezone of a tenant for newly created sites. For a list of possible values, see SPRegionalSettings.TimeZones property.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantDefaultTimezone() {
        return this.backingStore.get("tenantDefaultTimezone");
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
        this.backingStore.set("allowedDomainGuidsForSyncApp", value);
    }
    /**
     * Sets the availableManagedPathsForSiteCreation property value. Collection of managed paths available for site creation. Read-only.
     * @param value Value to set for the availableManagedPathsForSiteCreation property.
     */
    public void setAvailableManagedPathsForSiteCreation(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("availableManagedPathsForSiteCreation", value);
    }
    /**
     * Sets the deletedUserPersonalSiteRetentionPeriodInDays property value. The number of days for preserving a deleted user's OneDrive.
     * @param value Value to set for the deletedUserPersonalSiteRetentionPeriodInDays property.
     */
    public void setDeletedUserPersonalSiteRetentionPeriodInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deletedUserPersonalSiteRetentionPeriodInDays", value);
    }
    /**
     * Sets the excludedFileExtensionsForSyncApp property value. Collection of file extensions not uploaded by the OneDrive sync app.
     * @param value Value to set for the excludedFileExtensionsForSyncApp property.
     */
    public void setExcludedFileExtensionsForSyncApp(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("excludedFileExtensionsForSyncApp", value);
    }
    /**
     * Sets the idleSessionSignOut property value. Specifies the idle session sign-out policies for the tenant.
     * @param value Value to set for the idleSessionSignOut property.
     */
    public void setIdleSessionSignOut(@jakarta.annotation.Nullable final IdleSessionSignOut value) {
        this.backingStore.set("idleSessionSignOut", value);
    }
    /**
     * Sets the imageTaggingOption property value. Specifies the image tagging option for the tenant. Possible values are: disabled, basic, enhanced.
     * @param value Value to set for the imageTaggingOption property.
     */
    public void setImageTaggingOption(@jakarta.annotation.Nullable final ImageTaggingChoice value) {
        this.backingStore.set("imageTaggingOption", value);
    }
    /**
     * Sets the isCommentingOnSitePagesEnabled property value. Indicates whether comments are allowed on modern site pages in SharePoint.
     * @param value Value to set for the isCommentingOnSitePagesEnabled property.
     */
    public void setIsCommentingOnSitePagesEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCommentingOnSitePagesEnabled", value);
    }
    /**
     * Sets the isFileActivityNotificationEnabled property value. Indicates whether push notifications are enabled for OneDrive events.
     * @param value Value to set for the isFileActivityNotificationEnabled property.
     */
    public void setIsFileActivityNotificationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFileActivityNotificationEnabled", value);
    }
    /**
     * Sets the isLegacyAuthProtocolsEnabled property value. Indicates whether legacy authentication protocols are enabled for the tenant.
     * @param value Value to set for the isLegacyAuthProtocolsEnabled property.
     */
    public void setIsLegacyAuthProtocolsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isLegacyAuthProtocolsEnabled", value);
    }
    /**
     * Sets the isLoopEnabled property value. Indicates whether if Fluid Framework is allowed on SharePoint sites.
     * @param value Value to set for the isLoopEnabled property.
     */
    public void setIsLoopEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isLoopEnabled", value);
    }
    /**
     * Sets the isMacSyncAppEnabled property value. Indicates whether files can be synced using the OneDrive sync app for Mac.
     * @param value Value to set for the isMacSyncAppEnabled property.
     */
    public void setIsMacSyncAppEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMacSyncAppEnabled", value);
    }
    /**
     * Sets the isRequireAcceptingUserToMatchInvitedUserEnabled property value. Indicates whether guests must sign in using the same account to which sharing invitations are sent.
     * @param value Value to set for the isRequireAcceptingUserToMatchInvitedUserEnabled property.
     */
    public void setIsRequireAcceptingUserToMatchInvitedUserEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRequireAcceptingUserToMatchInvitedUserEnabled", value);
    }
    /**
     * Sets the isResharingByExternalUsersEnabled property value. Indicates whether guests are allowed to reshare files, folders, and sites they don't own.
     * @param value Value to set for the isResharingByExternalUsersEnabled property.
     */
    public void setIsResharingByExternalUsersEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isResharingByExternalUsersEnabled", value);
    }
    /**
     * Sets the isSharePointMobileNotificationEnabled property value. Indicates whether mobile push notifications are enabled for SharePoint.
     * @param value Value to set for the isSharePointMobileNotificationEnabled property.
     */
    public void setIsSharePointMobileNotificationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSharePointMobileNotificationEnabled", value);
    }
    /**
     * Sets the isSharePointNewsfeedEnabled property value. Indicates whether the newsfeed is allowed on the modern site pages in SharePoint.
     * @param value Value to set for the isSharePointNewsfeedEnabled property.
     */
    public void setIsSharePointNewsfeedEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSharePointNewsfeedEnabled", value);
    }
    /**
     * Sets the isSiteCreationEnabled property value. Indicates whether users are allowed to create sites.
     * @param value Value to set for the isSiteCreationEnabled property.
     */
    public void setIsSiteCreationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSiteCreationEnabled", value);
    }
    /**
     * Sets the isSiteCreationUIEnabled property value. Indicates whether the UI commands for creating sites are shown.
     * @param value Value to set for the isSiteCreationUIEnabled property.
     */
    public void setIsSiteCreationUIEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSiteCreationUIEnabled", value);
    }
    /**
     * Sets the isSitePagesCreationEnabled property value. Indicates whether creating new modern pages is allowed on SharePoint sites.
     * @param value Value to set for the isSitePagesCreationEnabled property.
     */
    public void setIsSitePagesCreationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSitePagesCreationEnabled", value);
    }
    /**
     * Sets the isSitesStorageLimitAutomatic property value. Indicates whether site storage space is automatically managed or if specific storage limits are set per site.
     * @param value Value to set for the isSitesStorageLimitAutomatic property.
     */
    public void setIsSitesStorageLimitAutomatic(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSitesStorageLimitAutomatic", value);
    }
    /**
     * Sets the isSyncButtonHiddenOnPersonalSite property value. Indicates whether the sync button in OneDrive is hidden.
     * @param value Value to set for the isSyncButtonHiddenOnPersonalSite property.
     */
    public void setIsSyncButtonHiddenOnPersonalSite(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSyncButtonHiddenOnPersonalSite", value);
    }
    /**
     * Sets the isUnmanagedSyncAppForTenantRestricted property value. Indicates whether users are allowed to sync files only on PCs joined to specific domains.
     * @param value Value to set for the isUnmanagedSyncAppForTenantRestricted property.
     */
    public void setIsUnmanagedSyncAppForTenantRestricted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isUnmanagedSyncAppForTenantRestricted", value);
    }
    /**
     * Sets the personalSiteDefaultStorageLimitInMB property value. The default OneDrive storage limit for all new and existing users who are assigned a qualifying license. Measured in megabytes (MB).
     * @param value Value to set for the personalSiteDefaultStorageLimitInMB property.
     */
    public void setPersonalSiteDefaultStorageLimitInMB(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("personalSiteDefaultStorageLimitInMB", value);
    }
    /**
     * Sets the sharingAllowedDomainList property value. Collection of email domains that are allowed for sharing outside the organization.
     * @param value Value to set for the sharingAllowedDomainList property.
     */
    public void setSharingAllowedDomainList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sharingAllowedDomainList", value);
    }
    /**
     * Sets the sharingBlockedDomainList property value. Collection of email domains that are blocked for sharing outside the organization.
     * @param value Value to set for the sharingBlockedDomainList property.
     */
    public void setSharingBlockedDomainList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sharingBlockedDomainList", value);
    }
    /**
     * Sets the sharingCapability property value. Sharing capability for the tenant. Possible values are: disabled, externalUserSharingOnly, externalUserAndGuestSharing, existingExternalUserSharingOnly.
     * @param value Value to set for the sharingCapability property.
     */
    public void setSharingCapability(@jakarta.annotation.Nullable final SharingCapabilities value) {
        this.backingStore.set("sharingCapability", value);
    }
    /**
     * Sets the sharingDomainRestrictionMode property value. Specifies the external sharing mode for domains. Possible values are: none, allowList, blockList.
     * @param value Value to set for the sharingDomainRestrictionMode property.
     */
    public void setSharingDomainRestrictionMode(@jakarta.annotation.Nullable final SharingDomainRestrictionMode value) {
        this.backingStore.set("sharingDomainRestrictionMode", value);
    }
    /**
     * Sets the siteCreationDefaultManagedPath property value. The value of the team site managed path. This is the path under which new team sites will be created.
     * @param value Value to set for the siteCreationDefaultManagedPath property.
     */
    public void setSiteCreationDefaultManagedPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("siteCreationDefaultManagedPath", value);
    }
    /**
     * Sets the siteCreationDefaultStorageLimitInMB property value. The default storage quota for a new site upon creation. Measured in megabytes (MB).
     * @param value Value to set for the siteCreationDefaultStorageLimitInMB property.
     */
    public void setSiteCreationDefaultStorageLimitInMB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("siteCreationDefaultStorageLimitInMB", value);
    }
    /**
     * Sets the tenantDefaultTimezone property value. The default timezone of a tenant for newly created sites. For a list of possible values, see SPRegionalSettings.TimeZones property.
     * @param value Value to set for the tenantDefaultTimezone property.
     */
    public void setTenantDefaultTimezone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantDefaultTimezone", value);
    }
}
