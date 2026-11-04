package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomatedActionSet implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AutomatedActionSet} and sets the default values.
     */
    public AutomatedActionSet() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomatedActionSet}
     */
    @jakarta.annotation.Nonnull
    public static AutomatedActionSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomatedActionSet();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the allowFiles property value. File actions that allow files identified by file hash columns in the hunting-query results.
     * @return a {@link java.util.List<FileAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileAction> getAllowFiles() {
        return this.backingStore.get("allowFiles");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the blockFiles property value. File actions that block files identified by file hash columns in the hunting-query results.
     * @return a {@link java.util.List<FileAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileAction> getBlockFiles() {
        return this.backingStore.get("blockFiles");
    }
    /**
     * Gets the collectInvestigationPackages property value. Device actions that collect investigation packages from devices identified in the hunting-query results.
     * @return a {@link java.util.List<DeviceAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAction> getCollectInvestigationPackages() {
        return this.backingStore.get("collectInvestigationPackages");
    }
    /**
     * Gets the disableUsers property value. Account actions that disable users identified by account SID columns in the hunting-query results.
     * @return a {@link java.util.List<AccountSidAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccountSidAction> getDisableUsers() {
        return this.backingStore.get("disableUsers");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("allowFiles", (n) -> { this.setAllowFiles(n.getCollectionOfObjectValues(FileAction::createFromDiscriminatorValue)); });
        deserializerMap.put("blockFiles", (n) -> { this.setBlockFiles(n.getCollectionOfObjectValues(FileAction::createFromDiscriminatorValue)); });
        deserializerMap.put("collectInvestigationPackages", (n) -> { this.setCollectInvestigationPackages(n.getCollectionOfObjectValues(DeviceAction::createFromDiscriminatorValue)); });
        deserializerMap.put("disableUsers", (n) -> { this.setDisableUsers(n.getCollectionOfObjectValues(AccountSidAction::createFromDiscriminatorValue)); });
        deserializerMap.put("forceUserPasswordResets", (n) -> { this.setForceUserPasswordResets(n.getCollectionOfObjectValues(AccountSidAction::createFromDiscriminatorValue)); });
        deserializerMap.put("hardDeleteEmails", (n) -> { this.setHardDeleteEmails(n.getCollectionOfObjectValues(EmailAction::createFromDiscriminatorValue)); });
        deserializerMap.put("initiateInvestigations", (n) -> { this.setInitiateInvestigations(n.getCollectionOfObjectValues(DeviceAction::createFromDiscriminatorValue)); });
        deserializerMap.put("isolateDevices", (n) -> { this.setIsolateDevices(n.getCollectionOfObjectValues(IsolateDeviceAction::createFromDiscriminatorValue)); });
        deserializerMap.put("markUsersAsCompromised", (n) -> { this.setMarkUsersAsCompromised(n.getCollectionOfObjectValues(AccountObjectIdAction::createFromDiscriminatorValue)); });
        deserializerMap.put("moveEmailsToDeletedItems", (n) -> { this.setMoveEmailsToDeletedItems(n.getCollectionOfObjectValues(EmailAction::createFromDiscriminatorValue)); });
        deserializerMap.put("moveEmailsToInbox", (n) -> { this.setMoveEmailsToInbox(n.getCollectionOfObjectValues(EmailAction::createFromDiscriminatorValue)); });
        deserializerMap.put("moveEmailsToJunk", (n) -> { this.setMoveEmailsToJunk(n.getCollectionOfObjectValues(EmailAction::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("restrictAppExecutions", (n) -> { this.setRestrictAppExecutions(n.getCollectionOfObjectValues(DeviceAction::createFromDiscriminatorValue)); });
        deserializerMap.put("runAntivirusScans", (n) -> { this.setRunAntivirusScans(n.getCollectionOfObjectValues(DeviceAction::createFromDiscriminatorValue)); });
        deserializerMap.put("softDeleteEmails", (n) -> { this.setSoftDeleteEmails(n.getCollectionOfObjectValues(EmailAction::createFromDiscriminatorValue)); });
        deserializerMap.put("stopAndQuarantineFiles", (n) -> { this.setStopAndQuarantineFiles(n.getCollectionOfObjectValues(StopAndQuarantineFileAction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the forceUserPasswordResets property value. Account actions that force password resets for users identified by account SID columns in the hunting-query results.
     * @return a {@link java.util.List<AccountSidAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccountSidAction> getForceUserPasswordResets() {
        return this.backingStore.get("forceUserPasswordResets");
    }
    /**
     * Gets the hardDeleteEmails property value. Email actions that permanently delete messages identified in the hunting-query results.
     * @return a {@link java.util.List<EmailAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmailAction> getHardDeleteEmails() {
        return this.backingStore.get("hardDeleteEmails");
    }
    /**
     * Gets the initiateInvestigations property value. Device actions that initiate investigations on devices identified in the hunting-query results.
     * @return a {@link java.util.List<DeviceAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAction> getInitiateInvestigations() {
        return this.backingStore.get("initiateInvestigations");
    }
    /**
     * Gets the isolateDevices property value. Device actions that isolate devices identified in the hunting-query results.
     * @return a {@link java.util.List<IsolateDeviceAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IsolateDeviceAction> getIsolateDevices() {
        return this.backingStore.get("isolateDevices");
    }
    /**
     * Gets the markUsersAsCompromised property value. Account actions that mark users as compromised when they&apos;re identified by Microsoft Entra object ID columns in the hunting-query results.
     * @return a {@link java.util.List<AccountObjectIdAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccountObjectIdAction> getMarkUsersAsCompromised() {
        return this.backingStore.get("markUsersAsCompromised");
    }
    /**
     * Gets the moveEmailsToDeletedItems property value. Email actions that move messages identified in the hunting-query results to Deleted Items.
     * @return a {@link java.util.List<EmailAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmailAction> getMoveEmailsToDeletedItems() {
        return this.backingStore.get("moveEmailsToDeletedItems");
    }
    /**
     * Gets the moveEmailsToInbox property value. Email actions that move messages identified in the hunting-query results to the Inbox.
     * @return a {@link java.util.List<EmailAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmailAction> getMoveEmailsToInbox() {
        return this.backingStore.get("moveEmailsToInbox");
    }
    /**
     * Gets the moveEmailsToJunk property value. Email actions that move messages identified in the hunting-query results to Junk Email.
     * @return a {@link java.util.List<EmailAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmailAction> getMoveEmailsToJunk() {
        return this.backingStore.get("moveEmailsToJunk");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the restrictAppExecutions property value. Device actions that restrict app execution on devices identified in the hunting-query results.
     * @return a {@link java.util.List<DeviceAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAction> getRestrictAppExecutions() {
        return this.backingStore.get("restrictAppExecutions");
    }
    /**
     * Gets the runAntivirusScans property value. Device actions that run antivirus scans on devices identified in the hunting-query results.
     * @return a {@link java.util.List<DeviceAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAction> getRunAntivirusScans() {
        return this.backingStore.get("runAntivirusScans");
    }
    /**
     * Gets the softDeleteEmails property value. Email actions that soft-delete messages identified in the hunting-query results.
     * @return a {@link java.util.List<EmailAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmailAction> getSoftDeleteEmails() {
        return this.backingStore.get("softDeleteEmails");
    }
    /**
     * Gets the stopAndQuarantineFiles property value. File actions that stop running files and quarantine them on devices identified in the hunting-query results.
     * @return a {@link java.util.List<StopAndQuarantineFileAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StopAndQuarantineFileAction> getStopAndQuarantineFiles() {
        return this.backingStore.get("stopAndQuarantineFiles");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("allowFiles", this.getAllowFiles());
        writer.writeCollectionOfObjectValues("blockFiles", this.getBlockFiles());
        writer.writeCollectionOfObjectValues("collectInvestigationPackages", this.getCollectInvestigationPackages());
        writer.writeCollectionOfObjectValues("disableUsers", this.getDisableUsers());
        writer.writeCollectionOfObjectValues("forceUserPasswordResets", this.getForceUserPasswordResets());
        writer.writeCollectionOfObjectValues("hardDeleteEmails", this.getHardDeleteEmails());
        writer.writeCollectionOfObjectValues("initiateInvestigations", this.getInitiateInvestigations());
        writer.writeCollectionOfObjectValues("isolateDevices", this.getIsolateDevices());
        writer.writeCollectionOfObjectValues("markUsersAsCompromised", this.getMarkUsersAsCompromised());
        writer.writeCollectionOfObjectValues("moveEmailsToDeletedItems", this.getMoveEmailsToDeletedItems());
        writer.writeCollectionOfObjectValues("moveEmailsToInbox", this.getMoveEmailsToInbox());
        writer.writeCollectionOfObjectValues("moveEmailsToJunk", this.getMoveEmailsToJunk());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("restrictAppExecutions", this.getRestrictAppExecutions());
        writer.writeCollectionOfObjectValues("runAntivirusScans", this.getRunAntivirusScans());
        writer.writeCollectionOfObjectValues("softDeleteEmails", this.getSoftDeleteEmails());
        writer.writeCollectionOfObjectValues("stopAndQuarantineFiles", this.getStopAndQuarantineFiles());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the allowFiles property value. File actions that allow files identified by file hash columns in the hunting-query results.
     * @param value Value to set for the allowFiles property.
     */
    public void setAllowFiles(@jakarta.annotation.Nullable final java.util.List<FileAction> value) {
        this.backingStore.set("allowFiles", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the blockFiles property value. File actions that block files identified by file hash columns in the hunting-query results.
     * @param value Value to set for the blockFiles property.
     */
    public void setBlockFiles(@jakarta.annotation.Nullable final java.util.List<FileAction> value) {
        this.backingStore.set("blockFiles", value);
    }
    /**
     * Sets the collectInvestigationPackages property value. Device actions that collect investigation packages from devices identified in the hunting-query results.
     * @param value Value to set for the collectInvestigationPackages property.
     */
    public void setCollectInvestigationPackages(@jakarta.annotation.Nullable final java.util.List<DeviceAction> value) {
        this.backingStore.set("collectInvestigationPackages", value);
    }
    /**
     * Sets the disableUsers property value. Account actions that disable users identified by account SID columns in the hunting-query results.
     * @param value Value to set for the disableUsers property.
     */
    public void setDisableUsers(@jakarta.annotation.Nullable final java.util.List<AccountSidAction> value) {
        this.backingStore.set("disableUsers", value);
    }
    /**
     * Sets the forceUserPasswordResets property value. Account actions that force password resets for users identified by account SID columns in the hunting-query results.
     * @param value Value to set for the forceUserPasswordResets property.
     */
    public void setForceUserPasswordResets(@jakarta.annotation.Nullable final java.util.List<AccountSidAction> value) {
        this.backingStore.set("forceUserPasswordResets", value);
    }
    /**
     * Sets the hardDeleteEmails property value. Email actions that permanently delete messages identified in the hunting-query results.
     * @param value Value to set for the hardDeleteEmails property.
     */
    public void setHardDeleteEmails(@jakarta.annotation.Nullable final java.util.List<EmailAction> value) {
        this.backingStore.set("hardDeleteEmails", value);
    }
    /**
     * Sets the initiateInvestigations property value. Device actions that initiate investigations on devices identified in the hunting-query results.
     * @param value Value to set for the initiateInvestigations property.
     */
    public void setInitiateInvestigations(@jakarta.annotation.Nullable final java.util.List<DeviceAction> value) {
        this.backingStore.set("initiateInvestigations", value);
    }
    /**
     * Sets the isolateDevices property value. Device actions that isolate devices identified in the hunting-query results.
     * @param value Value to set for the isolateDevices property.
     */
    public void setIsolateDevices(@jakarta.annotation.Nullable final java.util.List<IsolateDeviceAction> value) {
        this.backingStore.set("isolateDevices", value);
    }
    /**
     * Sets the markUsersAsCompromised property value. Account actions that mark users as compromised when they&apos;re identified by Microsoft Entra object ID columns in the hunting-query results.
     * @param value Value to set for the markUsersAsCompromised property.
     */
    public void setMarkUsersAsCompromised(@jakarta.annotation.Nullable final java.util.List<AccountObjectIdAction> value) {
        this.backingStore.set("markUsersAsCompromised", value);
    }
    /**
     * Sets the moveEmailsToDeletedItems property value. Email actions that move messages identified in the hunting-query results to Deleted Items.
     * @param value Value to set for the moveEmailsToDeletedItems property.
     */
    public void setMoveEmailsToDeletedItems(@jakarta.annotation.Nullable final java.util.List<EmailAction> value) {
        this.backingStore.set("moveEmailsToDeletedItems", value);
    }
    /**
     * Sets the moveEmailsToInbox property value. Email actions that move messages identified in the hunting-query results to the Inbox.
     * @param value Value to set for the moveEmailsToInbox property.
     */
    public void setMoveEmailsToInbox(@jakarta.annotation.Nullable final java.util.List<EmailAction> value) {
        this.backingStore.set("moveEmailsToInbox", value);
    }
    /**
     * Sets the moveEmailsToJunk property value. Email actions that move messages identified in the hunting-query results to Junk Email.
     * @param value Value to set for the moveEmailsToJunk property.
     */
    public void setMoveEmailsToJunk(@jakarta.annotation.Nullable final java.util.List<EmailAction> value) {
        this.backingStore.set("moveEmailsToJunk", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the restrictAppExecutions property value. Device actions that restrict app execution on devices identified in the hunting-query results.
     * @param value Value to set for the restrictAppExecutions property.
     */
    public void setRestrictAppExecutions(@jakarta.annotation.Nullable final java.util.List<DeviceAction> value) {
        this.backingStore.set("restrictAppExecutions", value);
    }
    /**
     * Sets the runAntivirusScans property value. Device actions that run antivirus scans on devices identified in the hunting-query results.
     * @param value Value to set for the runAntivirusScans property.
     */
    public void setRunAntivirusScans(@jakarta.annotation.Nullable final java.util.List<DeviceAction> value) {
        this.backingStore.set("runAntivirusScans", value);
    }
    /**
     * Sets the softDeleteEmails property value. Email actions that soft-delete messages identified in the hunting-query results.
     * @param value Value to set for the softDeleteEmails property.
     */
    public void setSoftDeleteEmails(@jakarta.annotation.Nullable final java.util.List<EmailAction> value) {
        this.backingStore.set("softDeleteEmails", value);
    }
    /**
     * Sets the stopAndQuarantineFiles property value. File actions that stop running files and quarantine them on devices identified in the hunting-query results.
     * @param value Value to set for the stopAndQuarantineFiles property.
     */
    public void setStopAndQuarantineFiles(@jakarta.annotation.Nullable final java.util.List<StopAndQuarantineFileAction> value) {
        this.backingStore.set("stopAndQuarantineFiles", value);
    }
}
