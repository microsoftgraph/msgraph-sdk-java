package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceHealth extends Entity implements Parsable {
    /**
     * A collection of issues that happened on the service, with detailed information for each issue.
     */
    private java.util.List<ServiceHealthIssue> issues;
    /**
     * The service name. Use the list healthOverviews operation to get exact string names for services subscribed by the tenant.
     */
    private String service;
    /**
     * The status property
     */
    private ServiceHealthStatus status;
    /**
     * Instantiates a new serviceHealth and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("issues", (n) -> { this.setIssues(n.getCollectionOfObjectValues(ServiceHealthIssue::createFromDiscriminatorValue)); });
        deserializerMap.put("service", (n) -> { this.setService(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ServiceHealthStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the issues property value. A collection of issues that happened on the service, with detailed information for each issue.
     * @return a serviceHealthIssue
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceHealthIssue> getIssues() {
        return this.issues;
    }
    /**
     * Gets the service property value. The service name. Use the list healthOverviews operation to get exact string names for services subscribed by the tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getService() {
        return this.service;
    }
    /**
     * Gets the status property value. The status property
     * @return a ServiceHealthStatus
     */
    @javax.annotation.Nullable
    public ServiceHealthStatus getStatus() {
        return this.status;
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
        writer.writeCollectionOfObjectValues("issues", this.getIssues());
        writer.writeStringValue("service", this.getService());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the issues property value. A collection of issues that happened on the service, with detailed information for each issue.
     * @param value Value to set for the issues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssues(@javax.annotation.Nullable final java.util.List<ServiceHealthIssue> value) {
        this.issues = value;
    }
    /**
     * Sets the service property value. The service name. Use the list healthOverviews operation to get exact string names for services subscribed by the tenant.
     * @param value Value to set for the service property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setService(@javax.annotation.Nullable final String value) {
        this.service = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final ServiceHealthStatus value) {
        this.status = value;
    }
}
