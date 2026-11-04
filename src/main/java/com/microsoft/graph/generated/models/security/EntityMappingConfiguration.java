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
public class EntityMappingConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EntityMappingConfiguration} and sets the default values.
     */
    public EntityMappingConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EntityMappingConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static EntityMappingConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntityMappingConfiguration();
    }
    /**
     * Gets the accounts property value. Mappings from detection query columns to account entities attached to the alert.
     * @return a {@link java.util.List<AccountEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccountEntityMapping> getAccounts() {
        return this.backingStore.get("accounts");
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
     * Gets the amazonResources property value. Mappings from detection query columns to Amazon Web Services resource entities attached to the alert.
     * @return a {@link java.util.List<AmazonResourceEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AmazonResourceEntityMapping> getAmazonResources() {
        return this.backingStore.get("amazonResources");
    }
    /**
     * Gets the azureResources property value. Mappings from detection query columns to Azure resource entities attached to the alert.
     * @return a {@link java.util.List<AzureResourceEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AzureResourceEntityMapping> getAzureResources() {
        return this.backingStore.get("azureResources");
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
     * Gets the cloudApplications property value. Mappings from detection query columns to cloud application entities attached to the alert.
     * @return a {@link java.util.List<CloudApplicationEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudApplicationEntityMapping> getCloudApplications() {
        return this.backingStore.get("cloudApplications");
    }
    /**
     * Gets the dns property value. Mappings from detection query columns to DNS entities attached to the alert.
     * @return a {@link java.util.List<DnsEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DnsEntityMapping> getDns() {
        return this.backingStore.get("dns");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("accounts", (n) -> { this.setAccounts(n.getCollectionOfObjectValues(AccountEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("amazonResources", (n) -> { this.setAmazonResources(n.getCollectionOfObjectValues(AmazonResourceEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("azureResources", (n) -> { this.setAzureResources(n.getCollectionOfObjectValues(AzureResourceEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudApplications", (n) -> { this.setCloudApplications(n.getCollectionOfObjectValues(CloudApplicationEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("dns", (n) -> { this.setDns(n.getCollectionOfObjectValues(DnsEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(FileEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("googleCloudResources", (n) -> { this.setGoogleCloudResources(n.getCollectionOfObjectValues(GoogleCloudResourceEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("hosts", (n) -> { this.setHosts(n.getCollectionOfObjectValues(HostEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("ips", (n) -> { this.setIps(n.getCollectionOfObjectValues(IpEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("mailboxes", (n) -> { this.setMailboxes(n.getCollectionOfObjectValues(MailboxEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("mailClusters", (n) -> { this.setMailClusters(n.getCollectionOfObjectValues(MailClusterEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("mailMessages", (n) -> { this.setMailMessages(n.getCollectionOfObjectValues(MailMessageEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("oAuthApplications", (n) -> { this.setOAuthApplications(n.getCollectionOfObjectValues(OAuthApplicationEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("processes", (n) -> { this.setProcesses(n.getCollectionOfObjectValues(ProcessEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("registryValues", (n) -> { this.setRegistryValues(n.getCollectionOfObjectValues(RegistryValueEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("securityGroups", (n) -> { this.setSecurityGroups(n.getCollectionOfObjectValues(SecurityGroupEntityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("urls", (n) -> { this.setUrls(n.getCollectionOfObjectValues(UrlEntityMapping::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the files property value. Mappings from detection query columns to file entities attached to the alert.
     * @return a {@link java.util.List<FileEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileEntityMapping> getFiles() {
        return this.backingStore.get("files");
    }
    /**
     * Gets the googleCloudResources property value. Mappings from detection query columns to Google Cloud resource entities attached to the alert.
     * @return a {@link java.util.List<GoogleCloudResourceEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GoogleCloudResourceEntityMapping> getGoogleCloudResources() {
        return this.backingStore.get("googleCloudResources");
    }
    /**
     * Gets the hosts property value. Mappings from detection query columns to host entities attached to the alert.
     * @return a {@link java.util.List<HostEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostEntityMapping> getHosts() {
        return this.backingStore.get("hosts");
    }
    /**
     * Gets the ips property value. Mappings from detection query columns to IP address entities attached to the alert.
     * @return a {@link java.util.List<IpEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpEntityMapping> getIps() {
        return this.backingStore.get("ips");
    }
    /**
     * Gets the mailboxes property value. Mappings from detection query columns to mailbox entities attached to the alert.
     * @return a {@link java.util.List<MailboxEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MailboxEntityMapping> getMailboxes() {
        return this.backingStore.get("mailboxes");
    }
    /**
     * Gets the mailClusters property value. Mappings from detection query columns to mail cluster entities attached to the alert.
     * @return a {@link java.util.List<MailClusterEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MailClusterEntityMapping> getMailClusters() {
        return this.backingStore.get("mailClusters");
    }
    /**
     * Gets the mailMessages property value. Mappings from detection query columns to mail message entities attached to the alert.
     * @return a {@link java.util.List<MailMessageEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MailMessageEntityMapping> getMailMessages() {
        return this.backingStore.get("mailMessages");
    }
    /**
     * Gets the oAuthApplications property value. Mappings from detection query columns to OAuth application entities attached to the alert.
     * @return a {@link java.util.List<OAuthApplicationEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OAuthApplicationEntityMapping> getOAuthApplications() {
        return this.backingStore.get("oAuthApplications");
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
     * Gets the processes property value. Mappings from detection query columns to process entities attached to the alert.
     * @return a {@link java.util.List<ProcessEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProcessEntityMapping> getProcesses() {
        return this.backingStore.get("processes");
    }
    /**
     * Gets the registryValues property value. Mappings from detection query columns to registry value entities attached to the alert.
     * @return a {@link java.util.List<RegistryValueEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RegistryValueEntityMapping> getRegistryValues() {
        return this.backingStore.get("registryValues");
    }
    /**
     * Gets the securityGroups property value. Mappings from detection query columns to security group entities attached to the alert.
     * @return a {@link java.util.List<SecurityGroupEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityGroupEntityMapping> getSecurityGroups() {
        return this.backingStore.get("securityGroups");
    }
    /**
     * Gets the urls property value. Mappings from detection query columns to URL entities attached to the alert.
     * @return a {@link java.util.List<UrlEntityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UrlEntityMapping> getUrls() {
        return this.backingStore.get("urls");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("accounts", this.getAccounts());
        writer.writeCollectionOfObjectValues("amazonResources", this.getAmazonResources());
        writer.writeCollectionOfObjectValues("azureResources", this.getAzureResources());
        writer.writeCollectionOfObjectValues("cloudApplications", this.getCloudApplications());
        writer.writeCollectionOfObjectValues("dns", this.getDns());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeCollectionOfObjectValues("googleCloudResources", this.getGoogleCloudResources());
        writer.writeCollectionOfObjectValues("hosts", this.getHosts());
        writer.writeCollectionOfObjectValues("ips", this.getIps());
        writer.writeCollectionOfObjectValues("mailboxes", this.getMailboxes());
        writer.writeCollectionOfObjectValues("mailClusters", this.getMailClusters());
        writer.writeCollectionOfObjectValues("mailMessages", this.getMailMessages());
        writer.writeCollectionOfObjectValues("oAuthApplications", this.getOAuthApplications());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("processes", this.getProcesses());
        writer.writeCollectionOfObjectValues("registryValues", this.getRegistryValues());
        writer.writeCollectionOfObjectValues("securityGroups", this.getSecurityGroups());
        writer.writeCollectionOfObjectValues("urls", this.getUrls());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accounts property value. Mappings from detection query columns to account entities attached to the alert.
     * @param value Value to set for the accounts property.
     */
    public void setAccounts(@jakarta.annotation.Nullable final java.util.List<AccountEntityMapping> value) {
        this.backingStore.set("accounts", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the amazonResources property value. Mappings from detection query columns to Amazon Web Services resource entities attached to the alert.
     * @param value Value to set for the amazonResources property.
     */
    public void setAmazonResources(@jakarta.annotation.Nullable final java.util.List<AmazonResourceEntityMapping> value) {
        this.backingStore.set("amazonResources", value);
    }
    /**
     * Sets the azureResources property value. Mappings from detection query columns to Azure resource entities attached to the alert.
     * @param value Value to set for the azureResources property.
     */
    public void setAzureResources(@jakarta.annotation.Nullable final java.util.List<AzureResourceEntityMapping> value) {
        this.backingStore.set("azureResources", value);
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
     * Sets the cloudApplications property value. Mappings from detection query columns to cloud application entities attached to the alert.
     * @param value Value to set for the cloudApplications property.
     */
    public void setCloudApplications(@jakarta.annotation.Nullable final java.util.List<CloudApplicationEntityMapping> value) {
        this.backingStore.set("cloudApplications", value);
    }
    /**
     * Sets the dns property value. Mappings from detection query columns to DNS entities attached to the alert.
     * @param value Value to set for the dns property.
     */
    public void setDns(@jakarta.annotation.Nullable final java.util.List<DnsEntityMapping> value) {
        this.backingStore.set("dns", value);
    }
    /**
     * Sets the files property value. Mappings from detection query columns to file entities attached to the alert.
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<FileEntityMapping> value) {
        this.backingStore.set("files", value);
    }
    /**
     * Sets the googleCloudResources property value. Mappings from detection query columns to Google Cloud resource entities attached to the alert.
     * @param value Value to set for the googleCloudResources property.
     */
    public void setGoogleCloudResources(@jakarta.annotation.Nullable final java.util.List<GoogleCloudResourceEntityMapping> value) {
        this.backingStore.set("googleCloudResources", value);
    }
    /**
     * Sets the hosts property value. Mappings from detection query columns to host entities attached to the alert.
     * @param value Value to set for the hosts property.
     */
    public void setHosts(@jakarta.annotation.Nullable final java.util.List<HostEntityMapping> value) {
        this.backingStore.set("hosts", value);
    }
    /**
     * Sets the ips property value. Mappings from detection query columns to IP address entities attached to the alert.
     * @param value Value to set for the ips property.
     */
    public void setIps(@jakarta.annotation.Nullable final java.util.List<IpEntityMapping> value) {
        this.backingStore.set("ips", value);
    }
    /**
     * Sets the mailboxes property value. Mappings from detection query columns to mailbox entities attached to the alert.
     * @param value Value to set for the mailboxes property.
     */
    public void setMailboxes(@jakarta.annotation.Nullable final java.util.List<MailboxEntityMapping> value) {
        this.backingStore.set("mailboxes", value);
    }
    /**
     * Sets the mailClusters property value. Mappings from detection query columns to mail cluster entities attached to the alert.
     * @param value Value to set for the mailClusters property.
     */
    public void setMailClusters(@jakarta.annotation.Nullable final java.util.List<MailClusterEntityMapping> value) {
        this.backingStore.set("mailClusters", value);
    }
    /**
     * Sets the mailMessages property value. Mappings from detection query columns to mail message entities attached to the alert.
     * @param value Value to set for the mailMessages property.
     */
    public void setMailMessages(@jakarta.annotation.Nullable final java.util.List<MailMessageEntityMapping> value) {
        this.backingStore.set("mailMessages", value);
    }
    /**
     * Sets the oAuthApplications property value. Mappings from detection query columns to OAuth application entities attached to the alert.
     * @param value Value to set for the oAuthApplications property.
     */
    public void setOAuthApplications(@jakarta.annotation.Nullable final java.util.List<OAuthApplicationEntityMapping> value) {
        this.backingStore.set("oAuthApplications", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the processes property value. Mappings from detection query columns to process entities attached to the alert.
     * @param value Value to set for the processes property.
     */
    public void setProcesses(@jakarta.annotation.Nullable final java.util.List<ProcessEntityMapping> value) {
        this.backingStore.set("processes", value);
    }
    /**
     * Sets the registryValues property value. Mappings from detection query columns to registry value entities attached to the alert.
     * @param value Value to set for the registryValues property.
     */
    public void setRegistryValues(@jakarta.annotation.Nullable final java.util.List<RegistryValueEntityMapping> value) {
        this.backingStore.set("registryValues", value);
    }
    /**
     * Sets the securityGroups property value. Mappings from detection query columns to security group entities attached to the alert.
     * @param value Value to set for the securityGroups property.
     */
    public void setSecurityGroups(@jakarta.annotation.Nullable final java.util.List<SecurityGroupEntityMapping> value) {
        this.backingStore.set("securityGroups", value);
    }
    /**
     * Sets the urls property value. Mappings from detection query columns to URL entities attached to the alert.
     * @param value Value to set for the urls property.
     */
    public void setUrls(@jakarta.annotation.Nullable final java.util.List<UrlEntityMapping> value) {
        this.backingStore.set("urls", value);
    }
}
