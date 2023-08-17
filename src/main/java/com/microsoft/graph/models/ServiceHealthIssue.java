package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceHealthIssue extends ServiceAnnouncementBase implements Parsable {
    /**
     * The classification property
     */
    private ServiceHealthClassificationType classification;
    /**
     * The feature name of the service issue.
     */
    private String feature;
    /**
     * The feature group name of the service issue.
     */
    private String featureGroup;
    /**
     * The description of the service issue impact.
     */
    private String impactDescription;
    /**
     * Indicates whether the issue is resolved.
     */
    private Boolean isResolved;
    /**
     * The origin property
     */
    private ServiceHealthOrigin origin;
    /**
     * Collection of historical posts for the service issue.
     */
    private java.util.List<ServiceHealthIssuePost> posts;
    /**
     * Indicates the service affected by the issue.
     */
    private String service;
    /**
     * The status property
     */
    private ServiceHealthStatus status;
    /**
     * Instantiates a new serviceHealthIssue and sets the default values.
     */
    public ServiceHealthIssue() {
        super();
        this.setOdataType("#microsoft.graph.serviceHealthIssue");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serviceHealthIssue
     */
    @jakarta.annotation.Nonnull
    public static ServiceHealthIssue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceHealthIssue();
    }
    /**
     * Gets the classification property value. The classification property
     * @return a serviceHealthClassificationType
     */
    @jakarta.annotation.Nullable
    public ServiceHealthClassificationType getClassification() {
        return this.classification;
    }
    /**
     * Gets the feature property value. The feature name of the service issue.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFeature() {
        return this.feature;
    }
    /**
     * Gets the featureGroup property value. The feature group name of the service issue.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFeatureGroup() {
        return this.featureGroup;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getEnumValue(ServiceHealthClassificationType.class)); });
        deserializerMap.put("feature", (n) -> { this.setFeature(n.getStringValue()); });
        deserializerMap.put("featureGroup", (n) -> { this.setFeatureGroup(n.getStringValue()); });
        deserializerMap.put("impactDescription", (n) -> { this.setImpactDescription(n.getStringValue()); });
        deserializerMap.put("isResolved", (n) -> { this.setIsResolved(n.getBooleanValue()); });
        deserializerMap.put("origin", (n) -> { this.setOrigin(n.getEnumValue(ServiceHealthOrigin.class)); });
        deserializerMap.put("posts", (n) -> { this.setPosts(n.getCollectionOfObjectValues(ServiceHealthIssuePost::createFromDiscriminatorValue)); });
        deserializerMap.put("service", (n) -> { this.setService(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ServiceHealthStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the impactDescription property value. The description of the service issue impact.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getImpactDescription() {
        return this.impactDescription;
    }
    /**
     * Gets the isResolved property value. Indicates whether the issue is resolved.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsResolved() {
        return this.isResolved;
    }
    /**
     * Gets the origin property value. The origin property
     * @return a serviceHealthOrigin
     */
    @jakarta.annotation.Nullable
    public ServiceHealthOrigin getOrigin() {
        return this.origin;
    }
    /**
     * Gets the posts property value. Collection of historical posts for the service issue.
     * @return a serviceHealthIssuePost
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceHealthIssuePost> getPosts() {
        return this.posts;
    }
    /**
     * Gets the service property value. Indicates the service affected by the issue.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getService() {
        return this.service;
    }
    /**
     * Gets the status property value. The status property
     * @return a serviceHealthStatus
     */
    @jakarta.annotation.Nullable
    public ServiceHealthStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeStringValue("feature", this.getFeature());
        writer.writeStringValue("featureGroup", this.getFeatureGroup());
        writer.writeStringValue("impactDescription", this.getImpactDescription());
        writer.writeBooleanValue("isResolved", this.getIsResolved());
        writer.writeEnumValue("origin", this.getOrigin());
        writer.writeCollectionOfObjectValues("posts", this.getPosts());
        writer.writeStringValue("service", this.getService());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the classification property value. The classification property
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final ServiceHealthClassificationType value) {
        this.classification = value;
    }
    /**
     * Sets the feature property value. The feature name of the service issue.
     * @param value Value to set for the feature property.
     */
    public void setFeature(@jakarta.annotation.Nullable final String value) {
        this.feature = value;
    }
    /**
     * Sets the featureGroup property value. The feature group name of the service issue.
     * @param value Value to set for the featureGroup property.
     */
    public void setFeatureGroup(@jakarta.annotation.Nullable final String value) {
        this.featureGroup = value;
    }
    /**
     * Sets the impactDescription property value. The description of the service issue impact.
     * @param value Value to set for the impactDescription property.
     */
    public void setImpactDescription(@jakarta.annotation.Nullable final String value) {
        this.impactDescription = value;
    }
    /**
     * Sets the isResolved property value. Indicates whether the issue is resolved.
     * @param value Value to set for the isResolved property.
     */
    public void setIsResolved(@jakarta.annotation.Nullable final Boolean value) {
        this.isResolved = value;
    }
    /**
     * Sets the origin property value. The origin property
     * @param value Value to set for the origin property.
     */
    public void setOrigin(@jakarta.annotation.Nullable final ServiceHealthOrigin value) {
        this.origin = value;
    }
    /**
     * Sets the posts property value. Collection of historical posts for the service issue.
     * @param value Value to set for the posts property.
     */
    public void setPosts(@jakarta.annotation.Nullable final java.util.List<ServiceHealthIssuePost> value) {
        this.posts = value;
    }
    /**
     * Sets the service property value. Indicates the service affected by the issue.
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final String value) {
        this.service = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ServiceHealthStatus value) {
        this.status = value;
    }
}
