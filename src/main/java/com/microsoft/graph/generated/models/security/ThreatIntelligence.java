package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ThreatIntelligence extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ThreatIntelligence} and sets the default values.
     */
    public ThreatIntelligence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ThreatIntelligence}
     */
    @jakarta.annotation.Nonnull
    public static ThreatIntelligence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ThreatIntelligence();
    }
    /**
     * Gets the articleIndicators property value. Refers to indicators of threat or compromise highlighted in an article.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<ArticleIndicator>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ArticleIndicator> getArticleIndicators() {
        return this.backingStore.get("articleIndicators");
    }
    /**
     * Gets the articles property value. A list of article objects.
     * @return a {@link java.util.List<Article>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Article> getArticles() {
        return this.backingStore.get("articles");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("articleIndicators", (n) -> { this.setArticleIndicators(n.getCollectionOfObjectValues(ArticleIndicator::createFromDiscriminatorValue)); });
        deserializerMap.put("articles", (n) -> { this.setArticles(n.getCollectionOfObjectValues(Article::createFromDiscriminatorValue)); });
        deserializerMap.put("hostComponents", (n) -> { this.setHostComponents(n.getCollectionOfObjectValues(HostComponent::createFromDiscriminatorValue)); });
        deserializerMap.put("hostCookies", (n) -> { this.setHostCookies(n.getCollectionOfObjectValues(HostCookie::createFromDiscriminatorValue)); });
        deserializerMap.put("hostPairs", (n) -> { this.setHostPairs(n.getCollectionOfObjectValues(HostPair::createFromDiscriminatorValue)); });
        deserializerMap.put("hostPorts", (n) -> { this.setHostPorts(n.getCollectionOfObjectValues(HostPort::createFromDiscriminatorValue)); });
        deserializerMap.put("hosts", (n) -> { this.setHosts(n.getCollectionOfObjectValues(Host::createFromDiscriminatorValue)); });
        deserializerMap.put("hostSslCertificates", (n) -> { this.setHostSslCertificates(n.getCollectionOfObjectValues(HostSslCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("hostTrackers", (n) -> { this.setHostTrackers(n.getCollectionOfObjectValues(HostTracker::createFromDiscriminatorValue)); });
        deserializerMap.put("intelligenceProfileIndicators", (n) -> { this.setIntelligenceProfileIndicators(n.getCollectionOfObjectValues(IntelligenceProfileIndicator::createFromDiscriminatorValue)); });
        deserializerMap.put("intelProfiles", (n) -> { this.setIntelProfiles(n.getCollectionOfObjectValues(IntelligenceProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("passiveDnsRecords", (n) -> { this.setPassiveDnsRecords(n.getCollectionOfObjectValues(PassiveDnsRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("sslCertificates", (n) -> { this.setSslCertificates(n.getCollectionOfObjectValues(SslCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("subdomains", (n) -> { this.setSubdomains(n.getCollectionOfObjectValues(Subdomain::createFromDiscriminatorValue)); });
        deserializerMap.put("vulnerabilities", (n) -> { this.setVulnerabilities(n.getCollectionOfObjectValues(Vulnerability::createFromDiscriminatorValue)); });
        deserializerMap.put("whoisHistoryRecords", (n) -> { this.setWhoisHistoryRecords(n.getCollectionOfObjectValues(WhoisHistoryRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("whoisRecords", (n) -> { this.setWhoisRecords(n.getCollectionOfObjectValues(WhoisRecord::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hostComponents property value. Retrieve details about hostComponent objects.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<HostComponent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostComponent> getHostComponents() {
        return this.backingStore.get("hostComponents");
    }
    /**
     * Gets the hostCookies property value. Retrieve details about hostCookie objects.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<HostCookie>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostCookie> getHostCookies() {
        return this.backingStore.get("hostCookies");
    }
    /**
     * Gets the hostPairs property value. Retrieve details about hostTracker objects.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<HostPair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostPair> getHostPairs() {
        return this.backingStore.get("hostPairs");
    }
    /**
     * Gets the hostPorts property value. Retrieve details about hostPort objects.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<HostPort>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostPort> getHostPorts() {
        return this.backingStore.get("hostPorts");
    }
    /**
     * Gets the hosts property value. Refers to host objects that Microsoft Threat Intelligence has observed.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<Host>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Host> getHosts() {
        return this.backingStore.get("hosts");
    }
    /**
     * Gets the hostSslCertificates property value. Retrieve details about hostSslCertificate objects.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<HostSslCertificate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostSslCertificate> getHostSslCertificates() {
        return this.backingStore.get("hostSslCertificates");
    }
    /**
     * Gets the hostTrackers property value. Retrieve details about hostTracker objects.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<HostTracker>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HostTracker> getHostTrackers() {
        return this.backingStore.get("hostTrackers");
    }
    /**
     * Gets the intelligenceProfileIndicators property value. The intelligenceProfileIndicators property
     * @return a {@link java.util.List<IntelligenceProfileIndicator>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IntelligenceProfileIndicator> getIntelligenceProfileIndicators() {
        return this.backingStore.get("intelligenceProfileIndicators");
    }
    /**
     * Gets the intelProfiles property value. A list of intelligenceProfile objects.
     * @return a {@link java.util.List<IntelligenceProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IntelligenceProfile> getIntelProfiles() {
        return this.backingStore.get("intelProfiles");
    }
    /**
     * Gets the passiveDnsRecords property value. Retrieve details about passiveDnsRecord objects.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<PassiveDnsRecord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PassiveDnsRecord> getPassiveDnsRecords() {
        return this.backingStore.get("passiveDnsRecords");
    }
    /**
     * Gets the sslCertificates property value. Retrieve details about sslCertificate objects.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<SslCertificate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SslCertificate> getSslCertificates() {
        return this.backingStore.get("sslCertificates");
    }
    /**
     * Gets the subdomains property value. Retrieve details about the subdomain.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<Subdomain>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Subdomain> getSubdomains() {
        return this.backingStore.get("subdomains");
    }
    /**
     * Gets the vulnerabilities property value. Retrieve details about vulnerabilities.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<Vulnerability>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Vulnerability> getVulnerabilities() {
        return this.backingStore.get("vulnerabilities");
    }
    /**
     * Gets the whoisHistoryRecords property value. Retrieve details about whoisHistoryRecord objects.Note: List retrieval is not yet supported.
     * @return a {@link java.util.List<WhoisHistoryRecord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WhoisHistoryRecord> getWhoisHistoryRecords() {
        return this.backingStore.get("whoisHistoryRecords");
    }
    /**
     * Gets the whoisRecords property value. A list of whoisRecord objects.
     * @return a {@link java.util.List<WhoisRecord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WhoisRecord> getWhoisRecords() {
        return this.backingStore.get("whoisRecords");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("articleIndicators", this.getArticleIndicators());
        writer.writeCollectionOfObjectValues("articles", this.getArticles());
        writer.writeCollectionOfObjectValues("hostComponents", this.getHostComponents());
        writer.writeCollectionOfObjectValues("hostCookies", this.getHostCookies());
        writer.writeCollectionOfObjectValues("hostPairs", this.getHostPairs());
        writer.writeCollectionOfObjectValues("hostPorts", this.getHostPorts());
        writer.writeCollectionOfObjectValues("hosts", this.getHosts());
        writer.writeCollectionOfObjectValues("hostSslCertificates", this.getHostSslCertificates());
        writer.writeCollectionOfObjectValues("hostTrackers", this.getHostTrackers());
        writer.writeCollectionOfObjectValues("intelligenceProfileIndicators", this.getIntelligenceProfileIndicators());
        writer.writeCollectionOfObjectValues("intelProfiles", this.getIntelProfiles());
        writer.writeCollectionOfObjectValues("passiveDnsRecords", this.getPassiveDnsRecords());
        writer.writeCollectionOfObjectValues("sslCertificates", this.getSslCertificates());
        writer.writeCollectionOfObjectValues("subdomains", this.getSubdomains());
        writer.writeCollectionOfObjectValues("vulnerabilities", this.getVulnerabilities());
        writer.writeCollectionOfObjectValues("whoisHistoryRecords", this.getWhoisHistoryRecords());
        writer.writeCollectionOfObjectValues("whoisRecords", this.getWhoisRecords());
    }
    /**
     * Sets the articleIndicators property value. Refers to indicators of threat or compromise highlighted in an article.Note: List retrieval is not yet supported.
     * @param value Value to set for the articleIndicators property.
     */
    public void setArticleIndicators(@jakarta.annotation.Nullable final java.util.List<ArticleIndicator> value) {
        this.backingStore.set("articleIndicators", value);
    }
    /**
     * Sets the articles property value. A list of article objects.
     * @param value Value to set for the articles property.
     */
    public void setArticles(@jakarta.annotation.Nullable final java.util.List<Article> value) {
        this.backingStore.set("articles", value);
    }
    /**
     * Sets the hostComponents property value. Retrieve details about hostComponent objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the hostComponents property.
     */
    public void setHostComponents(@jakarta.annotation.Nullable final java.util.List<HostComponent> value) {
        this.backingStore.set("hostComponents", value);
    }
    /**
     * Sets the hostCookies property value. Retrieve details about hostCookie objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the hostCookies property.
     */
    public void setHostCookies(@jakarta.annotation.Nullable final java.util.List<HostCookie> value) {
        this.backingStore.set("hostCookies", value);
    }
    /**
     * Sets the hostPairs property value. Retrieve details about hostTracker objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the hostPairs property.
     */
    public void setHostPairs(@jakarta.annotation.Nullable final java.util.List<HostPair> value) {
        this.backingStore.set("hostPairs", value);
    }
    /**
     * Sets the hostPorts property value. Retrieve details about hostPort objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the hostPorts property.
     */
    public void setHostPorts(@jakarta.annotation.Nullable final java.util.List<HostPort> value) {
        this.backingStore.set("hostPorts", value);
    }
    /**
     * Sets the hosts property value. Refers to host objects that Microsoft Threat Intelligence has observed.Note: List retrieval is not yet supported.
     * @param value Value to set for the hosts property.
     */
    public void setHosts(@jakarta.annotation.Nullable final java.util.List<Host> value) {
        this.backingStore.set("hosts", value);
    }
    /**
     * Sets the hostSslCertificates property value. Retrieve details about hostSslCertificate objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the hostSslCertificates property.
     */
    public void setHostSslCertificates(@jakarta.annotation.Nullable final java.util.List<HostSslCertificate> value) {
        this.backingStore.set("hostSslCertificates", value);
    }
    /**
     * Sets the hostTrackers property value. Retrieve details about hostTracker objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the hostTrackers property.
     */
    public void setHostTrackers(@jakarta.annotation.Nullable final java.util.List<HostTracker> value) {
        this.backingStore.set("hostTrackers", value);
    }
    /**
     * Sets the intelligenceProfileIndicators property value. The intelligenceProfileIndicators property
     * @param value Value to set for the intelligenceProfileIndicators property.
     */
    public void setIntelligenceProfileIndicators(@jakarta.annotation.Nullable final java.util.List<IntelligenceProfileIndicator> value) {
        this.backingStore.set("intelligenceProfileIndicators", value);
    }
    /**
     * Sets the intelProfiles property value. A list of intelligenceProfile objects.
     * @param value Value to set for the intelProfiles property.
     */
    public void setIntelProfiles(@jakarta.annotation.Nullable final java.util.List<IntelligenceProfile> value) {
        this.backingStore.set("intelProfiles", value);
    }
    /**
     * Sets the passiveDnsRecords property value. Retrieve details about passiveDnsRecord objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the passiveDnsRecords property.
     */
    public void setPassiveDnsRecords(@jakarta.annotation.Nullable final java.util.List<PassiveDnsRecord> value) {
        this.backingStore.set("passiveDnsRecords", value);
    }
    /**
     * Sets the sslCertificates property value. Retrieve details about sslCertificate objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the sslCertificates property.
     */
    public void setSslCertificates(@jakarta.annotation.Nullable final java.util.List<SslCertificate> value) {
        this.backingStore.set("sslCertificates", value);
    }
    /**
     * Sets the subdomains property value. Retrieve details about the subdomain.Note: List retrieval is not yet supported.
     * @param value Value to set for the subdomains property.
     */
    public void setSubdomains(@jakarta.annotation.Nullable final java.util.List<Subdomain> value) {
        this.backingStore.set("subdomains", value);
    }
    /**
     * Sets the vulnerabilities property value. Retrieve details about vulnerabilities.Note: List retrieval is not yet supported.
     * @param value Value to set for the vulnerabilities property.
     */
    public void setVulnerabilities(@jakarta.annotation.Nullable final java.util.List<Vulnerability> value) {
        this.backingStore.set("vulnerabilities", value);
    }
    /**
     * Sets the whoisHistoryRecords property value. Retrieve details about whoisHistoryRecord objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the whoisHistoryRecords property.
     */
    public void setWhoisHistoryRecords(@jakarta.annotation.Nullable final java.util.List<WhoisHistoryRecord> value) {
        this.backingStore.set("whoisHistoryRecords", value);
    }
    /**
     * Sets the whoisRecords property value. A list of whoisRecord objects.
     * @param value Value to set for the whoisRecords property.
     */
    public void setWhoisRecords(@jakarta.annotation.Nullable final java.util.List<WhoisRecord> value) {
        this.backingStore.set("whoisRecords", value);
    }
}
