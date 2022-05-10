package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceHealth extends Entity implements Parsable {
    /** A collection of issues that happened on the service, with detailed information for each issue. */
    private java.util.List<ServiceHealthIssue> _issues;
    /** The service name. Use the list healthOverviews operation to get exact string names for services subscribed by the tenant. */
    private String _service;
    /** Show the overall service health status. Possible values are: serviceOperational, investigating, restoringService, verifyingService, serviceRestored, postIncidentReviewPublished, serviceDegradation, serviceInterruption, extendedRecovery, falsePositive, investigationSuspended, resolved, mitigatedExternal, mitigated, resolvedExternal, confirmed, reported, unknownFutureValue. For more details, see serviceHealthStatus values. */
    private ServiceHealthStatus _status;
    /**
     * Instantiates a new serviceHealth and sets the default values.
     * @return a void
     */
    public ServiceHealth() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serviceHealth
     */
    @javax.annotation.Nonnull
    public static ServiceHealth createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceHealth();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ServiceHealth currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("issues", (n) -> { currentObject.setIssues(n.getCollectionOfObjectValues(ServiceHealthIssue::createFromDiscriminatorValue)); });
            this.put("service", (n) -> { currentObject.setService(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(ServiceHealthStatus.class)); });
        }};
    }
    /**
     * Gets the issues property value. A collection of issues that happened on the service, with detailed information for each issue.
     * @return a serviceHealthIssue
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceHealthIssue> getIssues() {
        return this._issues;
    }
    /**
     * Gets the service property value. The service name. Use the list healthOverviews operation to get exact string names for services subscribed by the tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getService() {
        return this._service;
    }
    /**
     * Gets the status property value. Show the overall service health status. Possible values are: serviceOperational, investigating, restoringService, verifyingService, serviceRestored, postIncidentReviewPublished, serviceDegradation, serviceInterruption, extendedRecovery, falsePositive, investigationSuspended, resolved, mitigatedExternal, mitigated, resolvedExternal, confirmed, reported, unknownFutureValue. For more details, see serviceHealthStatus values.
     * @return a serviceHealthStatus
     */
    @javax.annotation.Nullable
    public ServiceHealthStatus getStatus() {
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
        writer.writeCollectionOfObjectValues("issues", this.getIssues());
        writer.writeStringValue("service", this.getService());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the issues property value. A collection of issues that happened on the service, with detailed information for each issue.
     * @param value Value to set for the issues property.
     * @return a void
     */
    public void setIssues(@javax.annotation.Nullable final java.util.List<ServiceHealthIssue> value) {
        this._issues = value;
    }
    /**
     * Sets the service property value. The service name. Use the list healthOverviews operation to get exact string names for services subscribed by the tenant.
     * @param value Value to set for the service property.
     * @return a void
     */
    public void setService(@javax.annotation.Nullable final String value) {
        this._service = value;
    }
    /**
     * Sets the status property value. Show the overall service health status. Possible values are: serviceOperational, investigating, restoringService, verifyingService, serviceRestored, postIncidentReviewPublished, serviceDegradation, serviceInterruption, extendedRecovery, falsePositive, investigationSuspended, resolved, mitigatedExternal, mitigated, resolvedExternal, confirmed, reported, unknownFutureValue. For more details, see serviceHealthStatus values.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final ServiceHealthStatus value) {
        this._status = value;
    }
}
