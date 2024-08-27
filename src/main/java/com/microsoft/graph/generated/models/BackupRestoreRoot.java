package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BackupRestoreRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link BackupRestoreRoot} and sets the default values.
     */
    public BackupRestoreRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BackupRestoreRoot}
     */
    @jakarta.annotation.Nonnull
    public static BackupRestoreRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BackupRestoreRoot();
    }
    /**
     * Gets the driveInclusionRules property value. The list of drive inclusion rules applied to the tenant.
     * @return a {@link java.util.List<DriveProtectionRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveProtectionRule> getDriveInclusionRules() {
        return this.backingStore.get("driveInclusionRules");
    }
    /**
     * Gets the driveProtectionUnits property value. The list of drive protection units in the tenant.
     * @return a {@link java.util.List<DriveProtectionUnit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriveProtectionUnit> getDriveProtectionUnits() {
        return this.backingStore.get("driveProtectionUnits");
    }
    /**
     * Gets the exchangeProtectionPolicies property value. The list of Exchange protection policies in the tenant.
     * @return a {@link java.util.List<ExchangeProtectionPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExchangeProtectionPolicy> getExchangeProtectionPolicies() {
        return this.backingStore.get("exchangeProtectionPolicies");
    }
    /**
     * Gets the exchangeRestoreSessions property value. The list of Exchange restore sessions available in the tenant.
     * @return a {@link java.util.List<ExchangeRestoreSession>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExchangeRestoreSession> getExchangeRestoreSessions() {
        return this.backingStore.get("exchangeRestoreSessions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("driveInclusionRules", (n) -> { this.setDriveInclusionRules(n.getCollectionOfObjectValues(DriveProtectionRule::createFromDiscriminatorValue)); });
        deserializerMap.put("driveProtectionUnits", (n) -> { this.setDriveProtectionUnits(n.getCollectionOfObjectValues(DriveProtectionUnit::createFromDiscriminatorValue)); });
        deserializerMap.put("exchangeProtectionPolicies", (n) -> { this.setExchangeProtectionPolicies(n.getCollectionOfObjectValues(ExchangeProtectionPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("exchangeRestoreSessions", (n) -> { this.setExchangeRestoreSessions(n.getCollectionOfObjectValues(ExchangeRestoreSession::createFromDiscriminatorValue)); });
        deserializerMap.put("mailboxInclusionRules", (n) -> { this.setMailboxInclusionRules(n.getCollectionOfObjectValues(MailboxProtectionRule::createFromDiscriminatorValue)); });
        deserializerMap.put("mailboxProtectionUnits", (n) -> { this.setMailboxProtectionUnits(n.getCollectionOfObjectValues(MailboxProtectionUnit::createFromDiscriminatorValue)); });
        deserializerMap.put("oneDriveForBusinessProtectionPolicies", (n) -> { this.setOneDriveForBusinessProtectionPolicies(n.getCollectionOfObjectValues(OneDriveForBusinessProtectionPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("oneDriveForBusinessRestoreSessions", (n) -> { this.setOneDriveForBusinessRestoreSessions(n.getCollectionOfObjectValues(OneDriveForBusinessRestoreSession::createFromDiscriminatorValue)); });
        deserializerMap.put("protectionPolicies", (n) -> { this.setProtectionPolicies(n.getCollectionOfObjectValues(ProtectionPolicyBase::createFromDiscriminatorValue)); });
        deserializerMap.put("protectionUnits", (n) -> { this.setProtectionUnits(n.getCollectionOfObjectValues(ProtectionUnitBase::createFromDiscriminatorValue)); });
        deserializerMap.put("restorePoints", (n) -> { this.setRestorePoints(n.getCollectionOfObjectValues(RestorePoint::createFromDiscriminatorValue)); });
        deserializerMap.put("restoreSessions", (n) -> { this.setRestoreSessions(n.getCollectionOfObjectValues(RestoreSessionBase::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceApps", (n) -> { this.setServiceApps(n.getCollectionOfObjectValues(ServiceApp::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceStatus", (n) -> { this.setServiceStatus(n.getObjectValue(ServiceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("sharePointProtectionPolicies", (n) -> { this.setSharePointProtectionPolicies(n.getCollectionOfObjectValues(SharePointProtectionPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("sharePointRestoreSessions", (n) -> { this.setSharePointRestoreSessions(n.getCollectionOfObjectValues(SharePointRestoreSession::createFromDiscriminatorValue)); });
        deserializerMap.put("siteInclusionRules", (n) -> { this.setSiteInclusionRules(n.getCollectionOfObjectValues(SiteProtectionRule::createFromDiscriminatorValue)); });
        deserializerMap.put("siteProtectionUnits", (n) -> { this.setSiteProtectionUnits(n.getCollectionOfObjectValues(SiteProtectionUnit::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mailboxInclusionRules property value. The list of mailbox inclusion rules applied to the tenant.
     * @return a {@link java.util.List<MailboxProtectionRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MailboxProtectionRule> getMailboxInclusionRules() {
        return this.backingStore.get("mailboxInclusionRules");
    }
    /**
     * Gets the mailboxProtectionUnits property value. The list of mailbox protection units in the tenant.
     * @return a {@link java.util.List<MailboxProtectionUnit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MailboxProtectionUnit> getMailboxProtectionUnits() {
        return this.backingStore.get("mailboxProtectionUnits");
    }
    /**
     * Gets the oneDriveForBusinessProtectionPolicies property value. The list of OneDrive for Business protection policies in the tenant.
     * @return a {@link java.util.List<OneDriveForBusinessProtectionPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OneDriveForBusinessProtectionPolicy> getOneDriveForBusinessProtectionPolicies() {
        return this.backingStore.get("oneDriveForBusinessProtectionPolicies");
    }
    /**
     * Gets the oneDriveForBusinessRestoreSessions property value. The list of OneDrive for Business restore sessions available in the tenant.
     * @return a {@link java.util.List<OneDriveForBusinessRestoreSession>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OneDriveForBusinessRestoreSession> getOneDriveForBusinessRestoreSessions() {
        return this.backingStore.get("oneDriveForBusinessRestoreSessions");
    }
    /**
     * Gets the protectionPolicies property value. List of protection policies in the tenant.
     * @return a {@link java.util.List<ProtectionPolicyBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProtectionPolicyBase> getProtectionPolicies() {
        return this.backingStore.get("protectionPolicies");
    }
    /**
     * Gets the protectionUnits property value. List of protection units in the tenant.
     * @return a {@link java.util.List<ProtectionUnitBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProtectionUnitBase> getProtectionUnits() {
        return this.backingStore.get("protectionUnits");
    }
    /**
     * Gets the restorePoints property value. List of restore points in the tenant.
     * @return a {@link java.util.List<RestorePoint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RestorePoint> getRestorePoints() {
        return this.backingStore.get("restorePoints");
    }
    /**
     * Gets the restoreSessions property value. List of restore sessions in the tenant.
     * @return a {@link java.util.List<RestoreSessionBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RestoreSessionBase> getRestoreSessions() {
        return this.backingStore.get("restoreSessions");
    }
    /**
     * Gets the serviceApps property value. List of Backup Storage apps in the tenant.
     * @return a {@link java.util.List<ServiceApp>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceApp> getServiceApps() {
        return this.backingStore.get("serviceApps");
    }
    /**
     * Gets the serviceStatus property value. Represents the tenant-level status of the Backup Storage service.
     * @return a {@link ServiceStatus}
     */
    @jakarta.annotation.Nullable
    public ServiceStatus getServiceStatus() {
        return this.backingStore.get("serviceStatus");
    }
    /**
     * Gets the sharePointProtectionPolicies property value. The list of SharePoint protection policies in the tenant.
     * @return a {@link java.util.List<SharePointProtectionPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharePointProtectionPolicy> getSharePointProtectionPolicies() {
        return this.backingStore.get("sharePointProtectionPolicies");
    }
    /**
     * Gets the sharePointRestoreSessions property value. The list of SharePoint restore sessions available in the tenant.
     * @return a {@link java.util.List<SharePointRestoreSession>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharePointRestoreSession> getSharePointRestoreSessions() {
        return this.backingStore.get("sharePointRestoreSessions");
    }
    /**
     * Gets the siteInclusionRules property value. The list of site inclusion rules applied to the tenant.
     * @return a {@link java.util.List<SiteProtectionRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteProtectionRule> getSiteInclusionRules() {
        return this.backingStore.get("siteInclusionRules");
    }
    /**
     * Gets the siteProtectionUnits property value. The list of site protection units in the tenant.
     * @return a {@link java.util.List<SiteProtectionUnit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SiteProtectionUnit> getSiteProtectionUnits() {
        return this.backingStore.get("siteProtectionUnits");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("driveInclusionRules", this.getDriveInclusionRules());
        writer.writeCollectionOfObjectValues("driveProtectionUnits", this.getDriveProtectionUnits());
        writer.writeCollectionOfObjectValues("exchangeProtectionPolicies", this.getExchangeProtectionPolicies());
        writer.writeCollectionOfObjectValues("exchangeRestoreSessions", this.getExchangeRestoreSessions());
        writer.writeCollectionOfObjectValues("mailboxInclusionRules", this.getMailboxInclusionRules());
        writer.writeCollectionOfObjectValues("mailboxProtectionUnits", this.getMailboxProtectionUnits());
        writer.writeCollectionOfObjectValues("oneDriveForBusinessProtectionPolicies", this.getOneDriveForBusinessProtectionPolicies());
        writer.writeCollectionOfObjectValues("oneDriveForBusinessRestoreSessions", this.getOneDriveForBusinessRestoreSessions());
        writer.writeCollectionOfObjectValues("protectionPolicies", this.getProtectionPolicies());
        writer.writeCollectionOfObjectValues("protectionUnits", this.getProtectionUnits());
        writer.writeCollectionOfObjectValues("restorePoints", this.getRestorePoints());
        writer.writeCollectionOfObjectValues("restoreSessions", this.getRestoreSessions());
        writer.writeCollectionOfObjectValues("serviceApps", this.getServiceApps());
        writer.writeObjectValue("serviceStatus", this.getServiceStatus());
        writer.writeCollectionOfObjectValues("sharePointProtectionPolicies", this.getSharePointProtectionPolicies());
        writer.writeCollectionOfObjectValues("sharePointRestoreSessions", this.getSharePointRestoreSessions());
        writer.writeCollectionOfObjectValues("siteInclusionRules", this.getSiteInclusionRules());
        writer.writeCollectionOfObjectValues("siteProtectionUnits", this.getSiteProtectionUnits());
    }
    /**
     * Sets the driveInclusionRules property value. The list of drive inclusion rules applied to the tenant.
     * @param value Value to set for the driveInclusionRules property.
     */
    public void setDriveInclusionRules(@jakarta.annotation.Nullable final java.util.List<DriveProtectionRule> value) {
        this.backingStore.set("driveInclusionRules", value);
    }
    /**
     * Sets the driveProtectionUnits property value. The list of drive protection units in the tenant.
     * @param value Value to set for the driveProtectionUnits property.
     */
    public void setDriveProtectionUnits(@jakarta.annotation.Nullable final java.util.List<DriveProtectionUnit> value) {
        this.backingStore.set("driveProtectionUnits", value);
    }
    /**
     * Sets the exchangeProtectionPolicies property value. The list of Exchange protection policies in the tenant.
     * @param value Value to set for the exchangeProtectionPolicies property.
     */
    public void setExchangeProtectionPolicies(@jakarta.annotation.Nullable final java.util.List<ExchangeProtectionPolicy> value) {
        this.backingStore.set("exchangeProtectionPolicies", value);
    }
    /**
     * Sets the exchangeRestoreSessions property value. The list of Exchange restore sessions available in the tenant.
     * @param value Value to set for the exchangeRestoreSessions property.
     */
    public void setExchangeRestoreSessions(@jakarta.annotation.Nullable final java.util.List<ExchangeRestoreSession> value) {
        this.backingStore.set("exchangeRestoreSessions", value);
    }
    /**
     * Sets the mailboxInclusionRules property value. The list of mailbox inclusion rules applied to the tenant.
     * @param value Value to set for the mailboxInclusionRules property.
     */
    public void setMailboxInclusionRules(@jakarta.annotation.Nullable final java.util.List<MailboxProtectionRule> value) {
        this.backingStore.set("mailboxInclusionRules", value);
    }
    /**
     * Sets the mailboxProtectionUnits property value. The list of mailbox protection units in the tenant.
     * @param value Value to set for the mailboxProtectionUnits property.
     */
    public void setMailboxProtectionUnits(@jakarta.annotation.Nullable final java.util.List<MailboxProtectionUnit> value) {
        this.backingStore.set("mailboxProtectionUnits", value);
    }
    /**
     * Sets the oneDriveForBusinessProtectionPolicies property value. The list of OneDrive for Business protection policies in the tenant.
     * @param value Value to set for the oneDriveForBusinessProtectionPolicies property.
     */
    public void setOneDriveForBusinessProtectionPolicies(@jakarta.annotation.Nullable final java.util.List<OneDriveForBusinessProtectionPolicy> value) {
        this.backingStore.set("oneDriveForBusinessProtectionPolicies", value);
    }
    /**
     * Sets the oneDriveForBusinessRestoreSessions property value. The list of OneDrive for Business restore sessions available in the tenant.
     * @param value Value to set for the oneDriveForBusinessRestoreSessions property.
     */
    public void setOneDriveForBusinessRestoreSessions(@jakarta.annotation.Nullable final java.util.List<OneDriveForBusinessRestoreSession> value) {
        this.backingStore.set("oneDriveForBusinessRestoreSessions", value);
    }
    /**
     * Sets the protectionPolicies property value. List of protection policies in the tenant.
     * @param value Value to set for the protectionPolicies property.
     */
    public void setProtectionPolicies(@jakarta.annotation.Nullable final java.util.List<ProtectionPolicyBase> value) {
        this.backingStore.set("protectionPolicies", value);
    }
    /**
     * Sets the protectionUnits property value. List of protection units in the tenant.
     * @param value Value to set for the protectionUnits property.
     */
    public void setProtectionUnits(@jakarta.annotation.Nullable final java.util.List<ProtectionUnitBase> value) {
        this.backingStore.set("protectionUnits", value);
    }
    /**
     * Sets the restorePoints property value. List of restore points in the tenant.
     * @param value Value to set for the restorePoints property.
     */
    public void setRestorePoints(@jakarta.annotation.Nullable final java.util.List<RestorePoint> value) {
        this.backingStore.set("restorePoints", value);
    }
    /**
     * Sets the restoreSessions property value. List of restore sessions in the tenant.
     * @param value Value to set for the restoreSessions property.
     */
    public void setRestoreSessions(@jakarta.annotation.Nullable final java.util.List<RestoreSessionBase> value) {
        this.backingStore.set("restoreSessions", value);
    }
    /**
     * Sets the serviceApps property value. List of Backup Storage apps in the tenant.
     * @param value Value to set for the serviceApps property.
     */
    public void setServiceApps(@jakarta.annotation.Nullable final java.util.List<ServiceApp> value) {
        this.backingStore.set("serviceApps", value);
    }
    /**
     * Sets the serviceStatus property value. Represents the tenant-level status of the Backup Storage service.
     * @param value Value to set for the serviceStatus property.
     */
    public void setServiceStatus(@jakarta.annotation.Nullable final ServiceStatus value) {
        this.backingStore.set("serviceStatus", value);
    }
    /**
     * Sets the sharePointProtectionPolicies property value. The list of SharePoint protection policies in the tenant.
     * @param value Value to set for the sharePointProtectionPolicies property.
     */
    public void setSharePointProtectionPolicies(@jakarta.annotation.Nullable final java.util.List<SharePointProtectionPolicy> value) {
        this.backingStore.set("sharePointProtectionPolicies", value);
    }
    /**
     * Sets the sharePointRestoreSessions property value. The list of SharePoint restore sessions available in the tenant.
     * @param value Value to set for the sharePointRestoreSessions property.
     */
    public void setSharePointRestoreSessions(@jakarta.annotation.Nullable final java.util.List<SharePointRestoreSession> value) {
        this.backingStore.set("sharePointRestoreSessions", value);
    }
    /**
     * Sets the siteInclusionRules property value. The list of site inclusion rules applied to the tenant.
     * @param value Value to set for the siteInclusionRules property.
     */
    public void setSiteInclusionRules(@jakarta.annotation.Nullable final java.util.List<SiteProtectionRule> value) {
        this.backingStore.set("siteInclusionRules", value);
    }
    /**
     * Sets the siteProtectionUnits property value. The list of site protection units in the tenant.
     * @param value Value to set for the siteProtectionUnits property.
     */
    public void setSiteProtectionUnits(@jakarta.annotation.Nullable final java.util.List<SiteProtectionUnit> value) {
        this.backingStore.set("siteProtectionUnits", value);
    }
}
