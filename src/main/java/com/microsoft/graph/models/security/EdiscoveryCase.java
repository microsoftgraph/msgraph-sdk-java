package com.microsoft.graph.models.security;

import com.microsoft.graph.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryCase extends CaseEscaped implements Parsable {
    /**
     * Instantiates a new EdiscoveryCase and sets the default values.
     */
    public EdiscoveryCase() {
        super();
        this.setOdataType("#microsoft.graph.security.ediscoveryCase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdiscoveryCase
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryCase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryCase();
    }
    /**
     * Gets the closedBy property value. The user who closed the case.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getClosedBy() {
        return this.backingStore.get("closedBy");
    }
    /**
     * Gets the closedDateTime property value. The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getClosedDateTime() {
        return this.backingStore.get("closedDateTime");
    }
    /**
     * Gets the custodians property value. Returns a list of case ediscoveryCustodian objects for this case.
     * @return a java.util.List<EdiscoveryCustodian>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoveryCustodian> getCustodians() {
        return this.backingStore.get("custodians");
    }
    /**
     * Gets the externalId property value. The external case number for customer reference.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a java.util.List<EdiscoveryNoncustodialDataSource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoveryNoncustodialDataSource> getNoncustodialDataSources() {
        return this.backingStore.get("noncustodialDataSources");
    }
    /**
     * Gets the operations property value. Returns a list of case caseOperation objects for this case.
     * @return a java.util.List<CaseOperation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CaseOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Gets the reviewSets property value. Returns a list of eDiscoveryReviewSet objects in the case.
     * @return a java.util.List<EdiscoveryReviewSet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoveryReviewSet> getReviewSets() {
        return this.backingStore.get("reviewSets");
    }
    /**
     * Gets the searches property value. Returns a list of eDiscoverySearch objects associated with this case.
     * @return a java.util.List<EdiscoverySearch>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoverySearch> getSearches() {
        return this.backingStore.get("searches");
    }
    /**
     * Gets the settings property value. Returns a list of eDIscoverySettings objects in the case.
     * @return a EdiscoveryCaseSettings
     */
    @jakarta.annotation.Nullable
    public EdiscoveryCaseSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the tags property value. Returns a list of ediscoveryReviewTag objects associated to this case.
     * @return a java.util.List<EdiscoveryReviewTag>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoveryReviewTag> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setClosedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("closedBy", value);
    }
    /**
     * Sets the closedDateTime property value. The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the closedDateTime property.
     */
    public void setClosedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("closedDateTime", value);
    }
    /**
     * Sets the custodians property value. Returns a list of case ediscoveryCustodian objects for this case.
     * @param value Value to set for the custodians property.
     */
    public void setCustodians(@jakarta.annotation.Nullable final java.util.List<EdiscoveryCustodian> value) {
        this.backingStore.set("custodians", value);
    }
    /**
     * Sets the externalId property value. The external case number for customer reference.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the noncustodialDataSources property value. Returns a list of case ediscoveryNoncustodialDataSource objects for this case.
     * @param value Value to set for the noncustodialDataSources property.
     */
    public void setNoncustodialDataSources(@jakarta.annotation.Nullable final java.util.List<EdiscoveryNoncustodialDataSource> value) {
        this.backingStore.set("noncustodialDataSources", value);
    }
    /**
     * Sets the operations property value. Returns a list of case caseOperation objects for this case.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<CaseOperation> value) {
        this.backingStore.set("operations", value);
    }
    /**
     * Sets the reviewSets property value. Returns a list of eDiscoveryReviewSet objects in the case.
     * @param value Value to set for the reviewSets property.
     */
    public void setReviewSets(@jakarta.annotation.Nullable final java.util.List<EdiscoveryReviewSet> value) {
        this.backingStore.set("reviewSets", value);
    }
    /**
     * Sets the searches property value. Returns a list of eDiscoverySearch objects associated with this case.
     * @param value Value to set for the searches property.
     */
    public void setSearches(@jakarta.annotation.Nullable final java.util.List<EdiscoverySearch> value) {
        this.backingStore.set("searches", value);
    }
    /**
     * Sets the settings property value. Returns a list of eDIscoverySettings objects in the case.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final EdiscoveryCaseSettings value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the tags property value. Returns a list of ediscoveryReviewTag objects associated to this case.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<EdiscoveryReviewTag> value) {
        this.backingStore.set("tags", value);
    }
}
