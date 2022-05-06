package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ThreatAssessmentRequest extends Entity implements Parsable {
    /** The threat category. Possible values are: spam, phishing, malware.  */
    private ThreatCategory _category;
    /** The content type of threat assessment. Possible values are: mail, url, file.  */
    private ThreatAssessmentContentType _contentType;
    /** The threat assessment request creator.  */
    private IdentitySet _createdBy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  */
    private OffsetDateTime _createdDateTime;
    /** The expected assessment from submitter. Possible values are: block, unblock.  */
    private ThreatExpectedAssessment _expectedAssessment;
    /** The source of the threat assessment request. Possible values are: user, administrator.  */
    private ThreatAssessmentRequestSource _requestSource;
    /** A collection of threat assessment results. Read-only. By default, a GET /threatAssessmentRequests/{id} does not return this property unless you apply $expand on it.  */
    private java.util.List<ThreatAssessmentResult> _results;
    /** The assessment process status. Possible values are: pending, completed.  */
    private ThreatAssessmentStatus _status;
    /**
     * Instantiates a new threatAssessmentRequest and sets the default values.
     * @return a void
     */
    public ThreatAssessmentRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a threatAssessmentRequest
     */
    @javax.annotation.Nonnull
    public static ThreatAssessmentRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ThreatAssessmentRequest();
    }
    /**
     * Gets the category property value. The threat category. Possible values are: spam, phishing, malware.
     * @return a threatCategory
     */
    @javax.annotation.Nullable
    public ThreatCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the contentType property value. The content type of threat assessment. Possible values are: mail, url, file.
     * @return a threatAssessmentContentType
     */
    @javax.annotation.Nullable
    public ThreatAssessmentContentType getContentType() {
        return this._contentType;
    }
    /**
     * Gets the createdBy property value. The threat assessment request creator.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the expectedAssessment property value. The expected assessment from submitter. Possible values are: block, unblock.
     * @return a threatExpectedAssessment
     */
    @javax.annotation.Nullable
    public ThreatExpectedAssessment getExpectedAssessment() {
        return this._expectedAssessment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ThreatAssessmentRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(ThreatCategory.class)); });
            this.put("contentType", (n) -> { currentObject.setContentType(n.getEnumValue(ThreatAssessmentContentType.class)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("expectedAssessment", (n) -> { currentObject.setExpectedAssessment(n.getEnumValue(ThreatExpectedAssessment.class)); });
            this.put("requestSource", (n) -> { currentObject.setRequestSource(n.getEnumValue(ThreatAssessmentRequestSource.class)); });
            this.put("results", (n) -> { currentObject.setResults(n.getCollectionOfObjectValues(ThreatAssessmentResult::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ThreatAssessmentStatus.class)); });
        }};
    }
    /**
     * Gets the requestSource property value. The source of the threat assessment request. Possible values are: user, administrator.
     * @return a threatAssessmentRequestSource
     */
    @javax.annotation.Nullable
    public ThreatAssessmentRequestSource getRequestSource() {
        return this._requestSource;
    }
    /**
     * Gets the results property value. A collection of threat assessment results. Read-only. By default, a GET /threatAssessmentRequests/{id} does not return this property unless you apply $expand on it.
     * @return a threatAssessmentResult
     */
    @javax.annotation.Nullable
    public java.util.List<ThreatAssessmentResult> getResults() {
        return this._results;
    }
    /**
     * Gets the status property value. The assessment process status. Possible values are: pending, completed.
     * @return a threatAssessmentStatus
     */
    @javax.annotation.Nullable
    public ThreatAssessmentStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the category property value. The threat category. Possible values are: spam, phishing, malware.
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final ThreatCategory value) {
        this._category = value;
    }
    /**
     * Sets the contentType property value. The content type of threat assessment. Possible values are: mail, url, file.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    public void setContentType(@javax.annotation.Nullable final ThreatAssessmentContentType value) {
        this._contentType = value;
    }
    /**
     * Sets the createdBy property value. The threat assessment request creator.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the expectedAssessment property value. The expected assessment from submitter. Possible values are: block, unblock.
     * @param value Value to set for the expectedAssessment property.
     * @return a void
     */
    public void setExpectedAssessment(@javax.annotation.Nullable final ThreatExpectedAssessment value) {
        this._expectedAssessment = value;
    }
    /**
     * Sets the requestSource property value. The source of the threat assessment request. Possible values are: user, administrator.
     * @param value Value to set for the requestSource property.
     * @return a void
     */
    public void setRequestSource(@javax.annotation.Nullable final ThreatAssessmentRequestSource value) {
        this._requestSource = value;
    }
    /**
     * Sets the results property value. A collection of threat assessment results. Read-only. By default, a GET /threatAssessmentRequests/{id} does not return this property unless you apply $expand on it.
     * @param value Value to set for the results property.
     * @return a void
     */
    public void setResults(@javax.annotation.Nullable final java.util.List<ThreatAssessmentResult> value) {
        this._results = value;
    }
    /**
     * Sets the status property value. The assessment process status. Possible values are: pending, completed.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final ThreatAssessmentStatus value) {
        this._status = value;
    }
}
