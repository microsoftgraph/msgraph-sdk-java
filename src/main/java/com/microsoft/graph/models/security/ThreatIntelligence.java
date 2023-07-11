package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ThreatIntelligence extends Entity implements Parsable {
    /**
     * Refers to indicators of threat or compromise highlighted in an microsoft.graph.security.article.Note: List retrieval is not yet supported.
     */
    private java.util.List<ArticleIndicator> articleIndicators;
    /**
     * A list of article objects.
     */
    private java.util.List<Article> articles;
    /**
     * Retrieve details about microsoft.graph.security.hostComponent objects.Note: List retrieval is not yet supported.
     */
    private java.util.List<HostComponent> hostComponents;
    /**
     * Retrieve details about microsoft.graph.security.hostCookie objects.Note: List retrieval is not yet supported.
     */
    private java.util.List<HostCookie> hostCookies;
    /**
     * Refers to microsoft.graph.security.host objects that Microsoft Threat Intelligence has observed.Note: List retrieval is not yet supported.
     */
    private java.util.List<Host> hosts;
    /**
     * Retrieve details about microsoft.graph.security.hostTracker objects.Note: List retrieval is not yet supported.
     */
    private java.util.List<HostTracker> hostTrackers;
    /**
     * The intelligenceProfileIndicators property
     */
    private java.util.List<IntelligenceProfileIndicator> intelligenceProfileIndicators;
    /**
     * A list of intelligenceProfile objects.
     */
    private java.util.List<IntelligenceProfile> intelProfiles;
    /**
     * Retrieve details about microsoft.graph.security.passiveDnsRecord objects.Note: List retrieval is not yet supported.
     */
    private java.util.List<PassiveDnsRecord> passiveDnsRecords;
    /**
     * Retrieve details about microsoft.graph.security.vulnerabilities.Note: List retrieval is not yet supported.
     */
    private java.util.List<Vulnerability> vulnerabilities;
    /**
     * Instantiates a new threatIntelligence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ThreatIntelligence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a threatIntelligence
     */
    @javax.annotation.Nonnull
    public static ThreatIntelligence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ThreatIntelligence();
    }
    /**
     * Gets the articleIndicators property value. Refers to indicators of threat or compromise highlighted in an microsoft.graph.security.article.Note: List retrieval is not yet supported.
     * @return a articleIndicator
     */
    @javax.annotation.Nullable
    public java.util.List<ArticleIndicator> getArticleIndicators() {
        return this.articleIndicators;
    }
    /**
     * Gets the articles property value. A list of article objects.
     * @return a article
     */
    @javax.annotation.Nullable
    public java.util.List<Article> getArticles() {
        return this.articles;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("articleIndicators", (n) -> { this.setArticleIndicators(n.getCollectionOfObjectValues(ArticleIndicator::createFromDiscriminatorValue)); });
        deserializerMap.put("articles", (n) -> { this.setArticles(n.getCollectionOfObjectValues(Article::createFromDiscriminatorValue)); });
        deserializerMap.put("hostComponents", (n) -> { this.setHostComponents(n.getCollectionOfObjectValues(HostComponent::createFromDiscriminatorValue)); });
        deserializerMap.put("hostCookies", (n) -> { this.setHostCookies(n.getCollectionOfObjectValues(HostCookie::createFromDiscriminatorValue)); });
        deserializerMap.put("hosts", (n) -> { this.setHosts(n.getCollectionOfObjectValues(Host::createFromDiscriminatorValue)); });
        deserializerMap.put("hostTrackers", (n) -> { this.setHostTrackers(n.getCollectionOfObjectValues(HostTracker::createFromDiscriminatorValue)); });
        deserializerMap.put("intelligenceProfileIndicators", (n) -> { this.setIntelligenceProfileIndicators(n.getCollectionOfObjectValues(IntelligenceProfileIndicator::createFromDiscriminatorValue)); });
        deserializerMap.put("intelProfiles", (n) -> { this.setIntelProfiles(n.getCollectionOfObjectValues(IntelligenceProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("passiveDnsRecords", (n) -> { this.setPassiveDnsRecords(n.getCollectionOfObjectValues(PassiveDnsRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("vulnerabilities", (n) -> { this.setVulnerabilities(n.getCollectionOfObjectValues(Vulnerability::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hostComponents property value. Retrieve details about microsoft.graph.security.hostComponent objects.Note: List retrieval is not yet supported.
     * @return a hostComponent
     */
    @javax.annotation.Nullable
    public java.util.List<HostComponent> getHostComponents() {
        return this.hostComponents;
    }
    /**
     * Gets the hostCookies property value. Retrieve details about microsoft.graph.security.hostCookie objects.Note: List retrieval is not yet supported.
     * @return a hostCookie
     */
    @javax.annotation.Nullable
    public java.util.List<HostCookie> getHostCookies() {
        return this.hostCookies;
    }
    /**
     * Gets the hosts property value. Refers to microsoft.graph.security.host objects that Microsoft Threat Intelligence has observed.Note: List retrieval is not yet supported.
     * @return a host
     */
    @javax.annotation.Nullable
    public java.util.List<Host> getHosts() {
        return this.hosts;
    }
    /**
     * Gets the hostTrackers property value. Retrieve details about microsoft.graph.security.hostTracker objects.Note: List retrieval is not yet supported.
     * @return a hostTracker
     */
    @javax.annotation.Nullable
    public java.util.List<HostTracker> getHostTrackers() {
        return this.hostTrackers;
    }
    /**
     * Gets the intelligenceProfileIndicators property value. The intelligenceProfileIndicators property
     * @return a intelligenceProfileIndicator
     */
    @javax.annotation.Nullable
    public java.util.List<IntelligenceProfileIndicator> getIntelligenceProfileIndicators() {
        return this.intelligenceProfileIndicators;
    }
    /**
     * Gets the intelProfiles property value. A list of intelligenceProfile objects.
     * @return a intelligenceProfile
     */
    @javax.annotation.Nullable
    public java.util.List<IntelligenceProfile> getIntelProfiles() {
        return this.intelProfiles;
    }
    /**
     * Gets the passiveDnsRecords property value. Retrieve details about microsoft.graph.security.passiveDnsRecord objects.Note: List retrieval is not yet supported.
     * @return a passiveDnsRecord
     */
    @javax.annotation.Nullable
    public java.util.List<PassiveDnsRecord> getPassiveDnsRecords() {
        return this.passiveDnsRecords;
    }
    /**
     * Gets the vulnerabilities property value. Retrieve details about microsoft.graph.security.vulnerabilities.Note: List retrieval is not yet supported.
     * @return a vulnerability
     */
    @javax.annotation.Nullable
    public java.util.List<Vulnerability> getVulnerabilities() {
        return this.vulnerabilities;
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
        writer.writeCollectionOfObjectValues("articleIndicators", this.getArticleIndicators());
        writer.writeCollectionOfObjectValues("articles", this.getArticles());
        writer.writeCollectionOfObjectValues("hostComponents", this.getHostComponents());
        writer.writeCollectionOfObjectValues("hostCookies", this.getHostCookies());
        writer.writeCollectionOfObjectValues("hosts", this.getHosts());
        writer.writeCollectionOfObjectValues("hostTrackers", this.getHostTrackers());
        writer.writeCollectionOfObjectValues("intelligenceProfileIndicators", this.getIntelligenceProfileIndicators());
        writer.writeCollectionOfObjectValues("intelProfiles", this.getIntelProfiles());
        writer.writeCollectionOfObjectValues("passiveDnsRecords", this.getPassiveDnsRecords());
        writer.writeCollectionOfObjectValues("vulnerabilities", this.getVulnerabilities());
    }
    /**
     * Sets the articleIndicators property value. Refers to indicators of threat or compromise highlighted in an microsoft.graph.security.article.Note: List retrieval is not yet supported.
     * @param value Value to set for the articleIndicators property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setArticleIndicators(@javax.annotation.Nullable final java.util.List<ArticleIndicator> value) {
        this.articleIndicators = value;
    }
    /**
     * Sets the articles property value. A list of article objects.
     * @param value Value to set for the articles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setArticles(@javax.annotation.Nullable final java.util.List<Article> value) {
        this.articles = value;
    }
    /**
     * Sets the hostComponents property value. Retrieve details about microsoft.graph.security.hostComponent objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the hostComponents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostComponents(@javax.annotation.Nullable final java.util.List<HostComponent> value) {
        this.hostComponents = value;
    }
    /**
     * Sets the hostCookies property value. Retrieve details about microsoft.graph.security.hostCookie objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the hostCookies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostCookies(@javax.annotation.Nullable final java.util.List<HostCookie> value) {
        this.hostCookies = value;
    }
    /**
     * Sets the hosts property value. Refers to microsoft.graph.security.host objects that Microsoft Threat Intelligence has observed.Note: List retrieval is not yet supported.
     * @param value Value to set for the hosts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHosts(@javax.annotation.Nullable final java.util.List<Host> value) {
        this.hosts = value;
    }
    /**
     * Sets the hostTrackers property value. Retrieve details about microsoft.graph.security.hostTracker objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the hostTrackers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostTrackers(@javax.annotation.Nullable final java.util.List<HostTracker> value) {
        this.hostTrackers = value;
    }
    /**
     * Sets the intelligenceProfileIndicators property value. The intelligenceProfileIndicators property
     * @param value Value to set for the intelligenceProfileIndicators property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntelligenceProfileIndicators(@javax.annotation.Nullable final java.util.List<IntelligenceProfileIndicator> value) {
        this.intelligenceProfileIndicators = value;
    }
    /**
     * Sets the intelProfiles property value. A list of intelligenceProfile objects.
     * @param value Value to set for the intelProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntelProfiles(@javax.annotation.Nullable final java.util.List<IntelligenceProfile> value) {
        this.intelProfiles = value;
    }
    /**
     * Sets the passiveDnsRecords property value. Retrieve details about microsoft.graph.security.passiveDnsRecord objects.Note: List retrieval is not yet supported.
     * @param value Value to set for the passiveDnsRecords property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPassiveDnsRecords(@javax.annotation.Nullable final java.util.List<PassiveDnsRecord> value) {
        this.passiveDnsRecords = value;
    }
    /**
     * Sets the vulnerabilities property value. Retrieve details about microsoft.graph.security.vulnerabilities.Note: List retrieval is not yet supported.
     * @param value Value to set for the vulnerabilities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVulnerabilities(@javax.annotation.Nullable final java.util.List<Vulnerability> value) {
        this.vulnerabilities = value;
    }
}
