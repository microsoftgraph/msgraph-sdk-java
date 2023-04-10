package com.microsoft.graph.models.security;

import com.microsoft.graph.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryCase extends CaseEscaped implements Parsable {
    /** The user who closed the case. */
    private IdentitySet closedBy;
    /** The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime closedDateTime;
    /** Returns a list of case ediscoveryCustodian objects for this case. */
    private java.util.List<EdiscoveryCustodian> custodians;
    /** The external case number for customer reference. */
    private String externalId;
    /** Returns a list of case ediscoveryNoncustodialDataSource objects for this case. */
    private java.util.List<EdiscoveryNoncustodialDataSource> noncustodialDataSources;
    /** Returns a list of case caseOperation objects for this case. */
    private java.util.List<CaseOperation> operations;
    /** Returns a list of eDiscoveryReviewSet objects in the case. */
    private java.util.List<EdiscoveryReviewSet> reviewSets;
    /** Returns a list of eDiscoverySearch objects associated with this case. */
    private java.util.List<EdiscoverySearch> searches;
    /** Returns a list of eDIscoverySettings objects in the case. */
    private EdiscoveryCaseSettings settings;
    /** Returns a list of ediscoveryReviewTag objects associated to this case. */
    private java.util.List<EdiscoveryReviewTag> tags;
    /**
     * Instantiates a new EdiscoveryCase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryCase() {
        super();
        this.setOdataType("#microsoft.graph.security.ediscoveryCase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdiscoveryCase
     */
    @javax.annotation.Nonnull
    public static EdiscoveryCase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryCase();
    }
    /**
     * Gets the closedBy property value. The user who closed the case.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getClosedBy() {
        return this.closedBy;
    }
    /**
     * Gets the closedDateTime property value. The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getClosedDateTime() {
        return this.closedDateTime;
    }
    /**
     * Gets the custodians property value. Returns a list of case ediscoveryCustodian objects for this case.
     * @return a ediscoveryCustodian
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryCustodian> getCustodians() {
        return this.custodians;
    }
    /**
     * Gets the externalId property value. The external case number for customer reference.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("closedBy", (n) -> { this.setClosedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("closedDateTime", (n) -> { this.setClosedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("custodians", (n) -> { this.setCustodians(n.getCollectionOfObjectValues(EdiscoveryCustodian::createFromDiscriminatorValue)); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("noncustodialDataSources", (n) -> { this.setNoncustodialDataSources(n.getCollectionOfObjectValues(EdiscoveryNoncustodialDataSource::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(CaseOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewSets", (n) -> { this.setReviewSets(n.getCollectionOfObjectValues(EdiscoveryReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("searches", (n) -> { this.setSearches(n.getCollectionOfObjectValues(EdiscoverySearch::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(EdiscoveryCaseSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfObjectValues(EdiscoveryReviewTag::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the noncustodialDataSources property value. Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
     * @return a ediscoveryNoncustodialDataSource
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryNoncustodialDataSource> getNoncustodialDataSources() {
        return this.noncustodialDataSources;
    }
    /**
     * Gets the operations property value. Returns a list of case caseOperation objects for this case.
     * @return a caseOperation
     */
    @javax.annotation.Nullable
    public java.util.List<CaseOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the reviewSets property value. Returns a list of eDiscoveryReviewSet objects in the case.
     * @return a ediscoveryReviewSet
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryReviewSet> getReviewSets() {
        return this.reviewSets;
    }
    /**
     * Gets the searches property value. Returns a list of eDiscoverySearch objects associated with this case.
     * @return a ediscoverySearch
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoverySearch> getSearches() {
        return this.searches;
    }
    /**
     * Gets the settings property value. Returns a list of eDIscoverySettings objects in the case.
     * @return a ediscoveryCaseSettings
     */
    @javax.annotation.Nullable
    public EdiscoveryCaseSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the tags property value. Returns a list of ediscoveryReviewTag objects associated to this case.
     * @return a ediscoveryReviewTag
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryReviewTag> getTags() {
        return this.tags;
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
        writer.writeObjectValue("closedBy", this.getClosedBy());
        writer.writeOffsetDateTimeValue("closedDateTime", this.getClosedDateTime());
        writer.writeCollectionOfObjectValues("custodians", this.getCustodians());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeCollectionOfObjectValues("noncustodialDataSources", this.getNoncustodialDataSources());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("reviewSets", this.getReviewSets());
        writer.writeCollectionOfObjectValues("searches", this.getSearches());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeCollectionOfObjectValues("tags", this.getTags());
    }
    /**
     * Sets the closedBy property value. The user who closed the case.
     * @param value Value to set for the closedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClosedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.closedBy = value;
    }
    /**
     * Sets the closedDateTime property value. The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the closedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClosedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.closedDateTime = value;
    }
    /**
     * Sets the custodians property value. Returns a list of case ediscoveryCustodian objects for this case.
     * @param value Value to set for the custodians property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustodians(@javax.annotation.Nullable final java.util.List<EdiscoveryCustodian> value) {
        this.custodians = value;
    }
    /**
     * Sets the externalId property value. The external case number for customer reference.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the noncustodialDataSources property value. Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
     * @param value Value to set for the noncustodialDataSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNoncustodialDataSources(@javax.annotation.Nullable final java.util.List<EdiscoveryNoncustodialDataSource> value) {
        this.noncustodialDataSources = value;
    }
    /**
     * Sets the operations property value. Returns a list of case caseOperation objects for this case.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<CaseOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the reviewSets property value. Returns a list of eDiscoveryReviewSet objects in the case.
     * @param value Value to set for the reviewSets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewSets(@javax.annotation.Nullable final java.util.List<EdiscoveryReviewSet> value) {
        this.reviewSets = value;
    }
    /**
     * Sets the searches property value. Returns a list of eDiscoverySearch objects associated with this case.
     * @param value Value to set for the searches property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearches(@javax.annotation.Nullable final java.util.List<EdiscoverySearch> value) {
        this.searches = value;
    }
    /**
     * Sets the settings property value. Returns a list of eDIscoverySettings objects in the case.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final EdiscoveryCaseSettings value) {
        this.settings = value;
    }
    /**
     * Sets the tags property value. Returns a list of ediscoveryReviewTag objects associated to this case.
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final java.util.List<EdiscoveryReviewTag> value) {
        this.tags = value;
    }
}
