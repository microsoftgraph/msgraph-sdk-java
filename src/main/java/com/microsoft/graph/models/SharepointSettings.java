package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class SharepointSettings extends Entity implements Parsable {
    /** The allowedDomainGuidsForSyncApp property */
    private java.util.List<UUID> allowedDomainGuidsForSyncApp;
    /** The availableManagedPathsForSiteCreation property */
    private java.util.List<String> availableManagedPathsForSiteCreation;
    /** The deletedUserPersonalSiteRetentionPeriodInDays property */
    private Integer deletedUserPersonalSiteRetentionPeriodInDays;
    /** The excludedFileExtensionsForSyncApp property */
    private java.util.List<String> excludedFileExtensionsForSyncApp;
    /** The idleSessionSignOut property */
    private IdleSessionSignOut idleSessionSignOut;
    /** The imageTaggingOption property */
    private ImageTaggingChoice imageTaggingOption;
    /** The isCommentingOnSitePagesEnabled property */
    private Boolean isCommentingOnSitePagesEnabled;
    /** The isFileActivityNotificationEnabled property */
    private Boolean isFileActivityNotificationEnabled;
    /** The isLegacyAuthProtocolsEnabled property */
    private Boolean isLegacyAuthProtocolsEnabled;
    /** The isLoopEnabled property */
    private Boolean isLoopEnabled;
    /** The isMacSyncAppEnabled property */
    private Boolean isMacSyncAppEnabled;
    /** The isRequireAcceptingUserToMatchInvitedUserEnabled property */
    private Boolean isRequireAcceptingUserToMatchInvitedUserEnabled;
    /** The isResharingByExternalUsersEnabled property */
    private Boolean isResharingByExternalUsersEnabled;
    /** The isSharePointMobileNotificationEnabled property */
    private Boolean isSharePointMobileNotificationEnabled;
    /** The isSharePointNewsfeedEnabled property */
    private Boolean isSharePointNewsfeedEnabled;
    /** The isSiteCreationEnabled property */
    private Boolean isSiteCreationEnabled;
    /** The isSiteCreationUIEnabled property */
    private Boolean isSiteCreationUIEnabled;
    /** The isSitePagesCreationEnabled property */
    private Boolean isSitePagesCreationEnabled;
    /** The isSitesStorageLimitAutomatic property */
    private Boolean isSitesStorageLimitAutomatic;
    /** The isSyncButtonHiddenOnPersonalSite property */
    private Boolean isSyncButtonHiddenOnPersonalSite;
    /** The isUnmanagedSyncAppForTenantRestricted property */
    private Boolean isUnmanagedSyncAppForTenantRestricted;
    /** The personalSiteDefaultStorageLimitInMB property */
    private Long personalSiteDefaultStorageLimitInMB;
    /** The sharingAllowedDomainList property */
    private java.util.List<String> sharingAllowedDomainList;
    /** The sharingBlockedDomainList property */
    private java.util.List<String> sharingBlockedDomainList;
    /** The sharingCapability property */
    private SharingCapabilities sharingCapability;
    /** The sharingDomainRestrictionMode property */
    private SharingDomainRestrictionMode sharingDomainRestrictionMode;
    /** The siteCreationDefaultManagedPath property */
    private String siteCreationDefaultManagedPath;
    /** The siteCreationDefaultStorageLimitInMB property */
    private Integer siteCreationDefaultStorageLimitInMB;
    /** The tenantDefaultTimezone property */
    private String tenantDefaultTimezone;
    /**
     * Instantiates a new sharepointSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SharepointSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharepointSettings
     */
    @javax.annotation.Nonnull
    public static SharepointSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharepointSettings();
    }
    /**
     * Gets the allowedDomainGuidsForSyncApp property value. The allowedDomainGuidsForSyncApp property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public java.util.List<UUID> getAllowedDomainGuidsForSyncApp() {
        return this.allowedDomainGuidsForSyncApp;
    }
    /**
     * Gets the availableManagedPathsForSiteCreation property value. The availableManagedPathsForSiteCreation property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAvailableManagedPathsForSiteCreation() {
        return this.availableManagedPathsForSiteCreation;
    }
    /**
     * Gets the deletedUserPersonalSiteRetentionPeriodInDays property value. The deletedUserPersonalSiteRetentionPeriodInDays property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeletedUserPersonalSiteRetentionPeriodInDays() {
        return this.deletedUserPersonalSiteRetentionPeriodInDays;
    }
    /**
     * Gets the excludedFileExtensionsForSyncApp property value. The excludedFileExtensionsForSyncApp property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludedFileExtensionsForSyncApp() {
        return this.excludedFileExtensionsForSyncApp;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the idleSessionSignOut property value. The idleSessionSignOut property
     * @return a idleSessionSignOut
     */
    @javax.annotation.Nullable
    public IdleSessionSignOut getIdleSessionSignOut() {
        return this.idleSessionSignOut;
    }
    /**
     * Gets the imageTaggingOption property value. The imageTaggingOption property
     * @return a imageTaggingChoice
     */
    @javax.annotation.Nullable
    public ImageTaggingChoice getImageTaggingOption() {
        return this.imageTaggingOption;
    }
    /**
     * Gets the isCommentingOnSitePagesEnabled property value. The isCommentingOnSitePagesEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCommentingOnSitePagesEnabled() {
        return this.isCommentingOnSitePagesEnabled;
    }
    /**
     * Gets the isFileActivityNotificationEnabled property value. The isFileActivityNotificationEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFileActivityNotificationEnabled() {
        return this.isFileActivityNotificationEnabled;
    }
    /**
     * Gets the isLegacyAuthProtocolsEnabled property value. The isLegacyAuthProtocolsEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsLegacyAuthProtocolsEnabled() {
        return this.isLegacyAuthProtocolsEnabled;
    }
    /**
     * Gets the isLoopEnabled property value. The isLoopEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsLoopEnabled() {
        return this.isLoopEnabled;
    }
    /**
     * Gets the isMacSyncAppEnabled property value. The isMacSyncAppEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMacSyncAppEnabled() {
        return this.isMacSyncAppEnabled;
    }
    /**
     * Gets the isRequireAcceptingUserToMatchInvitedUserEnabled property value. The isRequireAcceptingUserToMatchInvitedUserEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRequireAcceptingUserToMatchInvitedUserEnabled() {
        return this.isRequireAcceptingUserToMatchInvitedUserEnabled;
    }
    /**
     * Gets the isResharingByExternalUsersEnabled property value. The isResharingByExternalUsersEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsResharingByExternalUsersEnabled() {
        return this.isResharingByExternalUsersEnabled;
    }
    /**
     * Gets the isSharePointMobileNotificationEnabled property value. The isSharePointMobileNotificationEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSharePointMobileNotificationEnabled() {
        return this.isSharePointMobileNotificationEnabled;
    }
    /**
     * Gets the isSharePointNewsfeedEnabled property value. The isSharePointNewsfeedEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSharePointNewsfeedEnabled() {
        return this.isSharePointNewsfeedEnabled;
    }
    /**
     * Gets the isSiteCreationEnabled property value. The isSiteCreationEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSiteCreationEnabled() {
        return this.isSiteCreationEnabled;
    }
    /**
     * Gets the isSiteCreationUIEnabled property value. The isSiteCreationUIEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSiteCreationUIEnabled() {
        return this.isSiteCreationUIEnabled;
    }
    /**
     * Gets the isSitePagesCreationEnabled property value. The isSitePagesCreationEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSitePagesCreationEnabled() {
        return this.isSitePagesCreationEnabled;
    }
    /**
     * Gets the isSitesStorageLimitAutomatic property value. The isSitesStorageLimitAutomatic property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSitesStorageLimitAutomatic() {
        return this.isSitesStorageLimitAutomatic;
    }
    /**
     * Gets the isSyncButtonHiddenOnPersonalSite property value. The isSyncButtonHiddenOnPersonalSite property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSyncButtonHiddenOnPersonalSite() {
        return this.isSyncButtonHiddenOnPersonalSite;
    }
    /**
     * Gets the isUnmanagedSyncAppForTenantRestricted property value. The isUnmanagedSyncAppForTenantRestricted property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsUnmanagedSyncAppForTenantRestricted() {
        return this.isUnmanagedSyncAppForTenantRestricted;
    }
    /**
     * Gets the personalSiteDefaultStorageLimitInMB property value. The personalSiteDefaultStorageLimitInMB property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getPersonalSiteDefaultStorageLimitInMB() {
        return this.personalSiteDefaultStorageLimitInMB;
    }
    /**
     * Gets the sharingAllowedDomainList property value. The sharingAllowedDomainList property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSharingAllowedDomainList() {
        return this.sharingAllowedDomainList;
    }
    /**
     * Gets the sharingBlockedDomainList property value. The sharingBlockedDomainList property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSharingBlockedDomainList() {
        return this.sharingBlockedDomainList;
    }
    /**
     * Gets the sharingCapability property value. The sharingCapability property
     * @return a sharingCapabilities
     */
    @javax.annotation.Nullable
    public SharingCapabilities getSharingCapability() {
        return this.sharingCapability;
    }
    /**
     * Gets the sharingDomainRestrictionMode property value. The sharingDomainRestrictionMode property
     * @return a sharingDomainRestrictionMode
     */
    @javax.annotation.Nullable
    public SharingDomainRestrictionMode getSharingDomainRestrictionMode() {
        return this.sharingDomainRestrictionMode;
    }
    /**
     * Gets the siteCreationDefaultManagedPath property value. The siteCreationDefaultManagedPath property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSiteCreationDefaultManagedPath() {
        return this.siteCreationDefaultManagedPath;
    }
    /**
     * Gets the siteCreationDefaultStorageLimitInMB property value. The siteCreationDefaultStorageLimitInMB property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSiteCreationDefaultStorageLimitInMB() {
        return this.siteCreationDefaultStorageLimitInMB;
    }
    /**
     * Gets the tenantDefaultTimezone property value. The tenantDefaultTimezone property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantDefaultTimezone() {
        return this.tenantDefaultTimezone;
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
     * Sets the allowedDomainGuidsForSyncApp property value. The allowedDomainGuidsForSyncApp property
     * @param value Value to set for the allowedDomainGuidsForSyncApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedDomainGuidsForSyncApp(@javax.annotation.Nullable final java.util.List<UUID> value) {
        this.allowedDomainGuidsForSyncApp = value;
    }
    /**
     * Sets the availableManagedPathsForSiteCreation property value. The availableManagedPathsForSiteCreation property
     * @param value Value to set for the availableManagedPathsForSiteCreation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailableManagedPathsForSiteCreation(@javax.annotation.Nullable final java.util.List<String> value) {
        this.availableManagedPathsForSiteCreation = value;
    }
    /**
     * Sets the deletedUserPersonalSiteRetentionPeriodInDays property value. The deletedUserPersonalSiteRetentionPeriodInDays property
     * @param value Value to set for the deletedUserPersonalSiteRetentionPeriodInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeletedUserPersonalSiteRetentionPeriodInDays(@javax.annotation.Nullable final Integer value) {
        this.deletedUserPersonalSiteRetentionPeriodInDays = value;
    }
    /**
     * Sets the excludedFileExtensionsForSyncApp property value. The excludedFileExtensionsForSyncApp property
     * @param value Value to set for the excludedFileExtensionsForSyncApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludedFileExtensionsForSyncApp(@javax.annotation.Nullable final java.util.List<String> value) {
        this.excludedFileExtensionsForSyncApp = value;
    }
    /**
     * Sets the idleSessionSignOut property value. The idleSessionSignOut property
     * @param value Value to set for the idleSessionSignOut property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdleSessionSignOut(@javax.annotation.Nullable final IdleSessionSignOut value) {
        this.idleSessionSignOut = value;
    }
    /**
     * Sets the imageTaggingOption property value. The imageTaggingOption property
     * @param value Value to set for the imageTaggingOption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImageTaggingOption(@javax.annotation.Nullable final ImageTaggingChoice value) {
        this.imageTaggingOption = value;
    }
    /**
     * Sets the isCommentingOnSitePagesEnabled property value. The isCommentingOnSitePagesEnabled property
     * @param value Value to set for the isCommentingOnSitePagesEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCommentingOnSitePagesEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isCommentingOnSitePagesEnabled = value;
    }
    /**
     * Sets the isFileActivityNotificationEnabled property value. The isFileActivityNotificationEnabled property
     * @param value Value to set for the isFileActivityNotificationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsFileActivityNotificationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isFileActivityNotificationEnabled = value;
    }
    /**
     * Sets the isLegacyAuthProtocolsEnabled property value. The isLegacyAuthProtocolsEnabled property
     * @param value Value to set for the isLegacyAuthProtocolsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsLegacyAuthProtocolsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isLegacyAuthProtocolsEnabled = value;
    }
    /**
     * Sets the isLoopEnabled property value. The isLoopEnabled property
     * @param value Value to set for the isLoopEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsLoopEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isLoopEnabled = value;
    }
    /**
     * Sets the isMacSyncAppEnabled property value. The isMacSyncAppEnabled property
     * @param value Value to set for the isMacSyncAppEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMacSyncAppEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isMacSyncAppEnabled = value;
    }
    /**
     * Sets the isRequireAcceptingUserToMatchInvitedUserEnabled property value. The isRequireAcceptingUserToMatchInvitedUserEnabled property
     * @param value Value to set for the isRequireAcceptingUserToMatchInvitedUserEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRequireAcceptingUserToMatchInvitedUserEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isRequireAcceptingUserToMatchInvitedUserEnabled = value;
    }
    /**
     * Sets the isResharingByExternalUsersEnabled property value. The isResharingByExternalUsersEnabled property
     * @param value Value to set for the isResharingByExternalUsersEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsResharingByExternalUsersEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isResharingByExternalUsersEnabled = value;
    }
    /**
     * Sets the isSharePointMobileNotificationEnabled property value. The isSharePointMobileNotificationEnabled property
     * @param value Value to set for the isSharePointMobileNotificationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSharePointMobileNotificationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isSharePointMobileNotificationEnabled = value;
    }
    /**
     * Sets the isSharePointNewsfeedEnabled property value. The isSharePointNewsfeedEnabled property
     * @param value Value to set for the isSharePointNewsfeedEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSharePointNewsfeedEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isSharePointNewsfeedEnabled = value;
    }
    /**
     * Sets the isSiteCreationEnabled property value. The isSiteCreationEnabled property
     * @param value Value to set for the isSiteCreationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSiteCreationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isSiteCreationEnabled = value;
    }
    /**
     * Sets the isSiteCreationUIEnabled property value. The isSiteCreationUIEnabled property
     * @param value Value to set for the isSiteCreationUIEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSiteCreationUIEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isSiteCreationUIEnabled = value;
    }
    /**
     * Sets the isSitePagesCreationEnabled property value. The isSitePagesCreationEnabled property
     * @param value Value to set for the isSitePagesCreationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSitePagesCreationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isSitePagesCreationEnabled = value;
    }
    /**
     * Sets the isSitesStorageLimitAutomatic property value. The isSitesStorageLimitAutomatic property
     * @param value Value to set for the isSitesStorageLimitAutomatic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSitesStorageLimitAutomatic(@javax.annotation.Nullable final Boolean value) {
        this.isSitesStorageLimitAutomatic = value;
    }
    /**
     * Sets the isSyncButtonHiddenOnPersonalSite property value. The isSyncButtonHiddenOnPersonalSite property
     * @param value Value to set for the isSyncButtonHiddenOnPersonalSite property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSyncButtonHiddenOnPersonalSite(@javax.annotation.Nullable final Boolean value) {
        this.isSyncButtonHiddenOnPersonalSite = value;
    }
    /**
     * Sets the isUnmanagedSyncAppForTenantRestricted property value. The isUnmanagedSyncAppForTenantRestricted property
     * @param value Value to set for the isUnmanagedSyncAppForTenantRestricted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsUnmanagedSyncAppForTenantRestricted(@javax.annotation.Nullable final Boolean value) {
        this.isUnmanagedSyncAppForTenantRestricted = value;
    }
    /**
     * Sets the personalSiteDefaultStorageLimitInMB property value. The personalSiteDefaultStorageLimitInMB property
     * @param value Value to set for the personalSiteDefaultStorageLimitInMB property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalSiteDefaultStorageLimitInMB(@javax.annotation.Nullable final Long value) {
        this.personalSiteDefaultStorageLimitInMB = value;
    }
    /**
     * Sets the sharingAllowedDomainList property value. The sharingAllowedDomainList property
     * @param value Value to set for the sharingAllowedDomainList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharingAllowedDomainList(@javax.annotation.Nullable final java.util.List<String> value) {
        this.sharingAllowedDomainList = value;
    }
    /**
     * Sets the sharingBlockedDomainList property value. The sharingBlockedDomainList property
     * @param value Value to set for the sharingBlockedDomainList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharingBlockedDomainList(@javax.annotation.Nullable final java.util.List<String> value) {
        this.sharingBlockedDomainList = value;
    }
    /**
     * Sets the sharingCapability property value. The sharingCapability property
     * @param value Value to set for the sharingCapability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharingCapability(@javax.annotation.Nullable final SharingCapabilities value) {
        this.sharingCapability = value;
    }
    /**
     * Sets the sharingDomainRestrictionMode property value. The sharingDomainRestrictionMode property
     * @param value Value to set for the sharingDomainRestrictionMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharingDomainRestrictionMode(@javax.annotation.Nullable final SharingDomainRestrictionMode value) {
        this.sharingDomainRestrictionMode = value;
    }
    /**
     * Sets the siteCreationDefaultManagedPath property value. The siteCreationDefaultManagedPath property
     * @param value Value to set for the siteCreationDefaultManagedPath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteCreationDefaultManagedPath(@javax.annotation.Nullable final String value) {
        this.siteCreationDefaultManagedPath = value;
    }
    /**
     * Sets the siteCreationDefaultStorageLimitInMB property value. The siteCreationDefaultStorageLimitInMB property
     * @param value Value to set for the siteCreationDefaultStorageLimitInMB property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteCreationDefaultStorageLimitInMB(@javax.annotation.Nullable final Integer value) {
        this.siteCreationDefaultStorageLimitInMB = value;
    }
    /**
     * Sets the tenantDefaultTimezone property value. The tenantDefaultTimezone property
     * @param value Value to set for the tenantDefaultTimezone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantDefaultTimezone(@javax.annotation.Nullable final String value) {
        this.tenantDefaultTimezone = value;
    }
}
