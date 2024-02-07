package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ThreatAssessmentRequest extends Entity implements Parsable {
    /**
     * Instantiates a new ThreatAssessmentRequest and sets the default values.
     */
    public ThreatAssessmentRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ThreatAssessmentRequest
     */
    @jakarta.annotation.Nonnull
    public static ThreatAssessmentRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.emailFileAssessmentRequest": return new EmailFileAssessmentRequest();
                case "#microsoft.graph.fileAssessmentRequest": return new FileAssessmentRequest();
                case "#microsoft.graph.mailAssessmentRequest": return new MailAssessmentRequest();
                case "#microsoft.graph.urlAssessmentRequest": return new UrlAssessmentRequest();
            }
        }
        return new ThreatAssessmentRequest();
    }
    /**
     * Gets the category property value. The category property
     * @return a ThreatCategory
     */
    @jakarta.annotation.Nullable
    public ThreatCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the contentType property value. The content type of threat assessment. Possible values are: mail, url, file.
     * @return a ThreatAssessmentContentType
     */
    @jakarta.annotation.Nullable
    public ThreatAssessmentContentType getContentType() {
        return this.backingStore.get("contentType");
    }
    /**
     * Gets the createdBy property value. The threat assessment request creator.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the expectedAssessment property value. The expectedAssessment property
     * @return a ThreatExpectedAssessment
     */
    @jakarta.annotation.Nullable
    public ThreatExpectedAssessment getExpectedAssessment() {
        return this.backingStore.get("expectedAssessment");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(ThreatCategory::forValue)); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getEnumValue(ThreatAssessmentContentType::forValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expectedAssessment", (n) -> { this.setExpectedAssessment(n.getEnumValue(ThreatExpectedAssessment::forValue)); });
        deserializerMap.put("requestSource", (n) -> { this.setRequestSource(n.getEnumValue(ThreatAssessmentRequestSource::forValue)); });
        deserializerMap.put("results", (n) -> { this.setResults(n.getCollectionOfObjectValues(ThreatAssessmentResult::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ThreatAssessmentStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the requestSource property value. The source of the threat assessment request. Possible values are: administrator.
     * @return a ThreatAssessmentRequestSource
     */
    @jakarta.annotation.Nullable
    public ThreatAssessmentRequestSource getRequestSource() {
        return this.backingStore.get("requestSource");
    }
    /**
     * Gets the results property value. A collection of threat assessment results. Read-only. By default, a GET /threatAssessmentRequests/{id} does not return this property unless you apply $expand on it.
     * @return a java.util.List<ThreatAssessmentResult>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ThreatAssessmentResult> getResults() {
        return this.backingStore.get("results");
    }
    /**
     * Gets the status property value. The assessment process status. Possible values are: pending, completed.
     * @return a ThreatAssessmentStatus
     */
    @jakarta.annotation.Nullable
    public ThreatAssessmentStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeEnumValue("contentType", this.getContentType());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumValue("expectedAssessment", this.getExpectedAssessment());
        writer.writeEnumValue("requestSource", this.getRequestSource());
        writer.writeCollectionOfObjectValues("results", this.getResults());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final ThreatCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the contentType property value. The content type of threat assessment. Possible values are: mail, url, file.
     * @param value Value to set for the contentType property.
     */
    public void setContentType(@jakarta.annotation.Nullable final ThreatAssessmentContentType value) {
        this.backingStore.set("contentType", value);
    }
    /**
     * Sets the createdBy property value. The threat assessment request creator.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the expectedAssessment property value. The expectedAssessment property
     * @param value Value to set for the expectedAssessment property.
     */
    public void setExpectedAssessment(@jakarta.annotation.Nullable final ThreatExpectedAssessment value) {
        this.backingStore.set("expectedAssessment", value);
    }
    /**
     * Sets the requestSource property value. The source of the threat assessment request. Possible values are: administrator.
     * @param value Value to set for the requestSource property.
     */
    public void setRequestSource(@jakarta.annotation.Nullable final ThreatAssessmentRequestSource value) {
        this.backingStore.set("requestSource", value);
    }
    /**
     * Sets the results property value. A collection of threat assessment results. Read-only. By default, a GET /threatAssessmentRequests/{id} does not return this property unless you apply $expand on it.
     * @param value Value to set for the results property.
     */
    public void setResults(@jakarta.annotation.Nullable final java.util.List<ThreatAssessmentResult> value) {
        this.backingStore.set("results", value);
    }
    /**
     * Sets the status property value. The assessment process status. Possible values are: pending, completed.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ThreatAssessmentStatus value) {
        this.backingStore.set("status", value);
    }
}
